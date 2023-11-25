import {Component, OnInit} from '@angular/core';
import {StudentService} from "../../../services/student/student.service";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.scss']
})
export class StudentsComponent implements OnInit{

  students:any=[];
  studentID:any=[];

  studentServiceSearchForm: FormGroup;

  constructor(private studentService: StudentService,
              private router: Router,
              private fb: FormBuilder){}

  ngOnInit(): void {
    this.studentService.onStudentsChange.subscribe((students)=>{
      this.students= students;
    });

    this.studentServiceSearchForm= this.fb.group({
      studentName: ['']
    })
  }

  addEditStudent(student:any){

    if(student != null){
      sessionStorage.setItem("studentID", student.studentID);
    }else {
      sessionStorage.removeItem("studentID");
    }



    this.router.navigate(['/admin/students/add-edit'])
  }


  deleteStudent(studentID:any){
    if (confirm("Are you sure?"))
      this.studentService.deleteStudent(studentID);

    }

  printStudent(){
    window.print();
  }


  onSearch(){
    let data = this.studentServiceSearchForm.getRawValue();
    console.log("data",data)
  }

}
