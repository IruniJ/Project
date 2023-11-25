import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Subject} from "rxjs";
import {Resolve} from "@angular/router";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class StudentService implements Resolve<any>{

  onStudentsChange = new Subject();

  constructor(private httpClient:HttpClient) { }



  resolve(): Observable<any> | Promise<any> | any{
    this.getStudents();
  }

  getStudents(){
    this.httpClient.get('http://localhost:8080/student/getAllStudents')
      .subscribe((students)=>{
        if(students){
          this.onStudentsChange.next(students);
        }

      })

    // this.httpClient.get('http://localhost:8080/student/getAllStudentWithSearch')
    //   .subscribe((students)=>{
    //     this.onStudentsChange.next(students);
    //   })

  }


  deleteStudent(studentID:any){
   this.httpClient.delete("http://localhost:8080/student/deleteStudentByID"+ "/" +studentID)
     .subscribe((result) => {
       alert("Student Deleted")
       location.reload();
     });
  }
}
