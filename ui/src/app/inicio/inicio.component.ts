import { Component, OnInit } from '@angular/core';
import {Jugador} from "../models/jugador";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {max} from "rxjs/operators";
import {JugadorService} from "../services/jugador.service";

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  model = new Jugador();
  public jugadorForm: FormGroup;
  public id: number;
  public submitted: boolean = false;
  public error: object = null;

  constructor(private router: Router, private service: JugadorService) { }

  ngOnInit(): void {

    this.jugadorForm = new FormGroup({
      Nombre: new FormControl('', Validators.required)
    });
  }

  get f() {
    return this.jugadorForm.controls;
  }

  crearJugador(){

    this.submitted = true;

    if (this.jugadorForm.invalid)
      return;

    this.service.crear(this.jugadorForm.value)
      .subscribe((reponse) => this.router.navigate(['tablero']),
        (error) => {
          this.error = error.error;
          window.scroll(0, 0);
        }
      );
  }

  get getRandomNumberBetween(){
    return Math.floor(Math.random()*(100-1+1)+1);
  }



}
