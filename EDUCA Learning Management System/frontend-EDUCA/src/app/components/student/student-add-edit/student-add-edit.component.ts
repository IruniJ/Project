import {Component, OnDestroy, OnInit} from '@angular/core';
import {StudentAddEditService} from "../../../services/student/student-add-edit.service";
import {Subscription} from "rxjs";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {StudentDTO} from "../dto/student";
import * as _ from 'underscore';

@Component({
  selector: 'app-student-add-edit',
  templateUrl: './student-add-edit.component.html',
  styleUrls: ['./student-add-edit.component.scss']
})
export class StudentAddEditComponent implements OnInit, OnDestroy{

  studentForm:FormGroup;
  student = new StudentDTO();
  pageType: string;

  onStudentChangeSub = new Subscription();


  constructor(private studentAddEditService: StudentAddEditService,
              private fb: FormBuilder){}

    ngOnInit(): void {
     this.onStudentChangeSub= this.studentAddEditService.student.subscribe((student)=>{
       if(!_.isEmpty(student)){
        this.pageType= 'edit';
          this.student = new StudentDTO(student);
       }else {
         this.student = new StudentDTO();
         this.pageType= 'new';
       }

       this.studentForm= this.createForm();
    })
    }
  ngOnDestroy():void{
      this.onStudentChangeSub.unsubscribe();
}

  createForm(){
    return this.fb.group({
      studentID: [this.student.studentID],
      studentName: [this.student.studentName,[ Validators.required]],
      address: [this.student.address],
      city: [this.student.city],
      gender:[this.student.gender],
      age: [this.student.age],
      email: [this.student.email],
      mobileNumber: [this.student.mobileNumber]
    })
  }

  saveData(){
    let data= this.studentForm.getRawValue();

        this.studentAddEditService.saveStudent(data);

  }
}
