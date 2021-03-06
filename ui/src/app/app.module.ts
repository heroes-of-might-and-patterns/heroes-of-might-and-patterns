import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';

import { MatGridListModule } from '@angular/material/grid-list';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';



import { AppComponent } from './app.component';
import { DadoComponent } from './utils/dado/dado.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TableroComponent } from './tablero/tablero.component';
import { FooterComponent } from './footer/footer.component';
import { TropasJugadorComponent } from './tropas-jugador/tropas-jugador.component';
import { TableroService } from './services/tablero.service';
import { HttpClientModule } from '@angular/common/http';

import {RouterModule} from "@angular/router";
import {pathToFileURL} from "url";

@NgModule({
  declarations: [
    AppComponent,
    DadoComponent,
    TableroComponent,
    FooterComponent,
    TropasJugadorComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatIconModule,
    MatGridListModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: TableroComponent}
    ]),
    ReactiveFormsModule

  ],
  providers: [
    TableroService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
