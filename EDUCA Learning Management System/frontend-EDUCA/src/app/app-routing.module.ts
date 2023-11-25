import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AdminLayoutComponent} from "./components/admin-layout/admin-layout.component";
import {LoginComponent} from "./components/login/login.component";
import {StudentsComponent} from "./components/student/students/students.component";
import {GradesComponent} from "./components/grades/grades.component";
import {DashboardComponent} from "./components/dashboard/dashboard.component";
import {StudentService} from "./services/student/student.service";
import {StudentAddEditComponent} from "./components/student/student-add-edit/student-add-edit.component";
import {StudentAddEditService} from "./services/student/student-add-edit.service";
import {SubjectsComponent} from "./components/subjects/subjects.component";
import {TimeTableComponent} from "./components/time-table/time-table.component";
import {ContactComponent} from "./components/contact/contact.component";

const routes: Routes = [
  {
    path:'',
    redirectTo:'login',
    pathMatch:'full'
  },
  {
    path:'login',
    component:LoginComponent,
  },

  {
    path:'admin',
    component:AdminLayoutComponent,
    children:[
      {
        path:'dashboard',
        component:DashboardComponent
      },
      {
        path: 'students',
        component: StudentsComponent,
        resolve:{
          data: StudentService
        }
      },
      {
        path:'students/add-edit',
        component: StudentAddEditComponent,
        resolve:{
          data:StudentAddEditService
        }
      },
      {
        path: 'grades',
        component:GradesComponent
      },

      {
        path:'subjects',
        component:SubjectsComponent
      },

      {
        path:'time-table',
        component:TimeTableComponent
      },
      {
        path:'contact',
        component:ContactComponent
      }


    ]
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
