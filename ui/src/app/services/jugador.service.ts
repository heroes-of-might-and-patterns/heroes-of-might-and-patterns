import {Inject, Injectable} from '@angular/core';
import {Jugador} from "../models/jugador";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class JugadorService {

  form: Jugador;

  public BaseURL: string;

  constructor(private http: HttpClient,@Inject('BASE_URL') baseUrl: string) {
    this.BaseURL = baseUrl;
  }


  crear(jugador: Jugador) {

    return this.http.post(this.BaseURL + "/jugador", jugador)

  }
}
