import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ComunicacionService {

  // activarMenuAccion: boolean; 
  // private notificarMenuAccionSubject = new Subject<boolean>();
  // notificarMenuAccionObservable = this.notificarMenuAccionSubject.asObservable();

  numDado: number; 
  private notificarDadoSubject = new Subject<number>();
  notificarDadoObservable = this.notificarDadoSubject.asObservable();

  constructor() { }

  // notificarMenuAccion(estado: boolean): void {
  //   this.activarMenuAccion = estado; 
  //   this.notificarMenuAccionSubject.next(estado);
  // }

  notificarDado(dado: number){
    this.numDado = dado;
    this.notificarDadoSubject.next(this.numDado);
  }
}
