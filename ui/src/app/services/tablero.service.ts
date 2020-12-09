import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Casilla } from '../models/casilla';

@Injectable({
  providedIn: 'root'
})
export class TableroService {

  _baseUrl = 'http://localhost:8081/api/tablero';
  
  constructor(private http: HttpClient) { }

  getTablero(): Observable<Casilla[]>{
    return this.http.get<Casilla[]>(this._baseUrl);
  }
}
