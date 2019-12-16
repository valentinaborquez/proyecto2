import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CursoalumnoComponent } from './cursoalumno.component';

describe('CursoalumnoComponent', () => {
  let component: CursoalumnoComponent;
  let fixture: ComponentFixture<CursoalumnoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CursoalumnoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CursoalumnoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
