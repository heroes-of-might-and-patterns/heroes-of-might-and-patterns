import { Component, OnInit } from '@angular/core';
import { ComunicacionService } from 'src/app/services/comunicacion.service';


@Component({
  selector: 'app-dado',
  templateUrl: './dado.component.html',
  styleUrls: ['./dado.component.css']
})
export class DadoComponent implements OnInit {

  valor: number;

  constructor(private comunicacionService: ComunicacionService) {}


  ngOnInit(): void {
    
    this.comunicacionService.notificarDadoObservable.subscribe(res => {
      this.valor = res; 
    })
  }


  click(): void{
    let dado = document.getElementById('IconDice');
    let random = Math.round(Math.random() * (6 - 1) + 1);
    this.valor =  random > 6 ? 6 : random;

    switch (this.valor){
      case 1: {
        dado.className = 'fas fa-dice-one fa-2x';
        break;
      }
      case 2: {
        dado.className = 'fas fa-dice-two fa-2x';
        break;
      }
      case 3: {
        dado.className = 'fas fa-dice-three fa-2x';
        break;
      }
      case 4: {
        dado.className = 'fas fa-dice-four fa-2x';
        break;
      }
      case 5: {
        dado.className = 'fas fa-dice-five fa-2x';
        break;
      }
      case 6: {
        dado.className = 'fas fa-dice-six fa-2x';
        break;
      }

    }

    this.comunicacionService.notificarDado(this.valor);
  }
}
