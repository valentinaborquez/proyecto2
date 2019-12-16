import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { ListalumnosComponent } from './components/listalumnos/listalumnos.component';
import { InicioComponent } from './components/inicio/inicio.component';
import { RegistroComponent } from './components/registro/registro.component';
import { ProfesorComponent } from './components/profesor/profesor.component';
import { CursoComponent } from './curso/curso.component';
import { CursoalumnoComponent } from './cursoalumno/cursoalumno.component';


const appRoutes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'inicio', component: InicioComponent },
  { path: 'listalumnos', component: ListalumnosComponent },
  { path: 'profesor', component: ProfesorComponent },
  { path: 'registro', component: RegistroComponent },
  { path: 'curso', component: CursoComponent },
  { path: 'cursoalumno', component: CursoalumnoComponent }
 
];
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ListalumnosComponent,
    InicioComponent,
    RegistroComponent,
    ProfesorComponent,
    CursoComponent,
    CursoalumnoComponent
  ],
  imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    ),
    BrowserModule
  ],
  providers: [],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
