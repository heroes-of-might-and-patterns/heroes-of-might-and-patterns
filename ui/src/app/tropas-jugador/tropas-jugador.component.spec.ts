import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TropasJugadorComponent } from './tropas-jugador.component';

describe('TropasJugadorComponent', () => {
  let component: TropasJugadorComponent;
  let fixture: ComponentFixture<TropasJugadorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TropasJugadorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TropasJugadorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
