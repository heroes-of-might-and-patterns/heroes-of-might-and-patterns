import { Component } from '@angular/core';
import { ComunicacionService } from './services/comunicacion.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ui';

  activarMenuAccion: boolean; 


  constructor(private comunicacionService: ComunicacionService) { }

  ngOnInit(): void {

    // this.comunicacionService.notificarMenuAccionObservable.subscribe( res => {
    //   this.activarMenuAccion = res; 
    // });
  }
}
