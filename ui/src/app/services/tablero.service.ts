import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Casilla } from '../models/casilla';

@Injectable({
  providedIn: 'root'
})
export class TableroService {

  _baseUrl = 'http://localhost:8081/api/tablero';
  private headers = new HttpHeaders({
    'Content-Type': 'application/json',
  });
  
  constructor(private http: HttpClient) { }

  getTablero(): Observable<Casilla[]>{
    return this.http.get<Casilla[]>(this._baseUrl);
  }

  updateTablero(tablero: Casilla[]): Observable<Casilla[]>{
    return this.http.put<Casilla[]>(this._baseUrl, tablero,  {headers: this.headers});
  }

  atacarTropa(indiceAtacante: number, indiceObjetivo: number): Observable<Casilla[]>{
    return this.http.put<Casilla[]>(this._baseUrl+`/atacar?indiceAtacante=${indiceAtacante}&indiceObjetivo=${indiceObjetivo}`, {headers: this.headers});
  }
}
