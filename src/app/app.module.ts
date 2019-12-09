import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { ListalumnosComponent } from './components/listalumnos/listalumnos.component';

const appRoutes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'listalumnos', component: ListalumnosComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ListalumnosComponent
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
