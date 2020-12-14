import { Component, OnInit } from '@angular/core';
import { Casilla } from '../models/casilla';
import { TableroService } from '../services/tablero.service';
import { ComunicacionService } from '../services/comunicacion.service';
import { Tropa } from '../models/Tropa';
import {Jugador} from "../models/jugador";

@Component({
  selector: 'app-tablero',
  templateUrl: './tablero.component.html',
  styleUrls: ['./tablero.component.css']
})
export class TableroComponent implements OnInit {

  bgColor: string = 'grey';
  alcanceColor: string = 'red';
  atacarColor: string = 'blue';
  jugador: Jugador = {id:null, nombre:null, estado:null};
  idPrimero: string = '0';

  //casillas: number[] = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99];


  casillasTrop: Casilla[];
 // activarMenuAccion: boolean;

 valorDado: number;

 tropaSeleccionada: Tropa;
 indiceCasillaSeleccionada: number;

  constructor(private TableroService: TableroService, private comunicacionService: ComunicacionService) { }

  ngOnInit(): void {


    this.TableroService.getTablero().subscribe({
      next: res => {
        this.casillasTrop = res;
        this.pintarCasillasVacias(); // Llamar este metodo puede nos ser necesario si la clase Casillas en el backend trae el tipo

      },
      error: err => {
        console.log(err);
      }
    })

    this.comunicacionService.notificarDadoObservable.subscribe(res => {
      this.valorDado = res;
    });

    this.TableroService.getJugador(this.idPrimero);

  }

  cambiarColor(){
   // this.casillas[99] = 6;
  }


  selectTropa(tropa: Tropa, indice: number): void {
    this.tropaSeleccionada = tropa;
    this.indiceCasillaSeleccionada = indice;
  }

  mostrarAlcance(tipo: string): void {

    let alcance: number;
    alcance = tipo === 'M'? this.tropaSeleccionada.cantMoviminetos : this.tropaSeleccionada.ptsAlcance;

    if(tipo === 'M'){
      alcance = this.valorDado > this.tropaSeleccionada.cantMoviminetos? this.tropaSeleccionada.cantMoviminetos: this.valorDado;
    }else {
      alcance = this.tropaSeleccionada.ptsAlcance;
    }

    this.pintarAlcance(alcance, tipo);
  }

  pintarAlcance(alcance: number, tipo: string){
    let coordX = this.indiceCasillaSeleccionada;
    let coordY = 0;

    while(coordX > 9){
      coordY ++;
      coordX = coordX - 10;
    }

    for(let i = 0; i <= alcance; i++){
        for(let j = 0 ; j<= alcance -i; j++){

        if( coordX - i >= 0 && coordY -j >= 0){
          if(tipo === 'M'){
            this.casillasTrop[this.indiceCasillaSeleccionada - i - j*10 ].tipo = 1;
          }else {
            if(this.casillasTrop[this.indiceCasillaSeleccionada - i - j*10 ].tropa
              && this.casillasTrop[this.indiceCasillaSeleccionada - i - j*10 ].tropa.idJugador !== this.tropaSeleccionada.idJugador)
              {
                this.casillasTrop[this.indiceCasillaSeleccionada - i - j*10 ].tipo = 2;
            }
          }
        }

        if( coordX - i >= 0 && coordY +j <= 9){

          if(tipo === 'M'){
            this.casillasTrop[this.indiceCasillaSeleccionada - i + j*10 ].tipo = 1;
          }else {
            if(this.casillasTrop[this.indiceCasillaSeleccionada - i + j*10 ].tropa
              && this.casillasTrop[this.indiceCasillaSeleccionada - i + j*10 ].tropa.idJugador !== this.tropaSeleccionada.idJugador)
              {
                this.casillasTrop[this.indiceCasillaSeleccionada - i + j*10 ].tipo = 2;
            }
          }

        }

        if( coordX + i <= 9 && coordY - j >= 0){

         if(tipo === 'M'){
          this.casillasTrop[this.indiceCasillaSeleccionada + i - j*10 ].tipo = 1;
        }else {
          if(this.casillasTrop[this.indiceCasillaSeleccionada + i - j*10 ].tropa
            && this.casillasTrop[this.indiceCasillaSeleccionada + i - j*10 ].tropa.idJugador !== this.tropaSeleccionada.idJugador)
            {
              this.casillasTrop[this.indiceCasillaSeleccionada + i - j*10 ].tipo = 2;
          }
        }

        }

        if( coordX + i <= 9 && coordY + j <= 9){

         if(tipo === 'M'){
         this.casillasTrop[this.indiceCasillaSeleccionada + i + j*10 ].tipo = 1;
        }else {
          if(this.casillasTrop[this.indiceCasillaSeleccionada + i + j*10 ].tropa
            &&this.casillasTrop[this.indiceCasillaSeleccionada + i + j*10 ].tropa.idJugador !== this.tropaSeleccionada.idJugador)
            {
             this.casillasTrop[this.indiceCasillaSeleccionada + i + j*10 ].tipo = 2;
          }
        }

        }
      }
    }

    this.casillasTrop[this.indiceCasillaSeleccionada].tipo = 0;
  }

  pintarCasillasVacias(): void {
    for(let i = 0; i< this.casillasTrop.length; i++){
      this.casillasTrop[i].tipo = 0;
    }
  }

  mover(casillaObjetivo: number, tipo: number): void {
     // 1 es moverse
    // 2 es atacar

    this.actualizarDado(casillaObjetivo);
    this.casillasTrop[casillaObjetivo].tropa = this.tropaSeleccionada;
    this.casillasTrop[this.indiceCasillaSeleccionada].tropa = null;

    this.TableroService.updateTablero(this.casillasTrop).subscribe({
      next: res => {
        this.casillasTrop = res;
        this.pintarCasillasVacias();
        this.tropaSeleccionada = null;
        this.indiceCasillaSeleccionada = null;
      },
      error: err => {
        console.log(err);
      }
    });

  }

  atacar(indiceObjetivo: number): void {
    console.log('Objetivo:', indiceObjetivo);
    console.log('Atacante:', this.indiceCasillaSeleccionada);
    this.TableroService.atacarTropa(this.indiceCasillaSeleccionada, indiceObjetivo).subscribe({
      next: res => {
        this.casillasTrop = res;
        this.pintarCasillasVacias();
        this.tropaSeleccionada = null;
        this.indiceCasillaSeleccionada = null;
      },
      error: err => {
        console.log(err);
      }
    });
    this.casillasTrop[this.indiceCasillaSeleccionada].tropa = null;
    this.pintarCasillasVacias();
    this.tropaSeleccionada = null;
    this.indiceCasillaSeleccionada = null;

  }

  actualizarDado(casillaObjetivo: number): void {
    let coordXActual = this.indiceCasillaSeleccionada;
    let coordYActual = 0;

    let coordXProx = casillaObjetivo;
    let coordYProx = 0;

    while(coordXActual > 9){
      coordYActual ++;
      coordXActual = coordXActual - 10;
    }

    while(coordXProx > 9){
      coordYProx ++;
      coordXProx = coordXProx - 10;
    }

    let movY = coordYActual - coordYProx < 0 ? -1*(coordYActual - coordYProx): (coordYActual - coordYProx);
    let movX = coordXActual - coordXProx < 0? -1*(coordXActual - coordXProx): (coordXActual - coordXProx);

    this.valorDado = this.valorDado - movX - movY;
    this.comunicacionService.notificarDado(this.valorDado);
  }

  cambiarTurno(id: string){
    return this.TableroService.getJugador(id);

  }


}
