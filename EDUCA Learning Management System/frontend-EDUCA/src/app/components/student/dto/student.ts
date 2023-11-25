export class StudentDTO{
  studentID;
  studentName;
  address;
  city;
  gender;
  age;
  email;
  mobileNumber;

  constructor(student?: any){
    student= student || {};
    this.studentID= student.studentID || null;
    this.studentName= student.studentName || '';
    this.address= student.address || '';
    this.city= student.city || '';
    this.gender= student.gender || '';
    this.age= student.age || '';
    this.email= student.email || '';
    this.mobileNumber= student.mobileNumber || '';
  }
}
