import { Injectable } from '@angular/core';
import {Resolve} from "@angular/router";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {BehaviorSubject} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class StudentAddEditService implements Resolve<any>{

  student = new BehaviorSubject({});


  constructor(private httpClient:HttpClient) { }

  resolve(): Observable<any> | Promise<any> | any{
    this.getStudentByID();
  }

  getStudentByID(){
  let studentID= sessionStorage.getItem("studentID");

  if (studentID !=null){
    this.httpClient.get(`http://localhost:8080/student/getStudentByID/${studentID}`)
      .subscribe((student)=>{
        this.student.next(student);
      })
  }else {
    this.student.next({});
  }

  }

  saveStudent(data:any){
    this.httpClient.post('http://localhost:8080/student/saveAndUpdateStudent',data)
      .subscribe((student)=>{
        this.student.next(student);
        alert("Student saved")
      })
  }

  // saveAndUpdateStudent(data:any){
  //   this.httpClient.post('http://localhost:8080/student/saveAndUpdateStudent',data)
  //     .subscribe((student)=>{
  //       this.student.next(student);
  //       alert("Student saved")
  //     })
  // }
}
