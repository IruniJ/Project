import {Component, OnInit} from '@angular/core';
import {AuthService} from "../../services/auth.service";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{

  loginForm:FormGroup;

  constructor(private authService : AuthService,
              private router:Router,
              private fb:FormBuilder){}

  ngOnInit(): void {
    this.authService.loginStatus.subscribe((userDetails) =>{
      if (userDetails) {
        this.router.navigate(['/admin/dashboard']);
        sessionStorage.setItem('userData',JSON.stringify(userDetails) )
      }else if(userDetails==null){
        alert("Authentication Fail")
        //console.log("Authentication Fail")
      }
    });

    this.loginForm=this.fb.group({
        userName:['', Validators.required],
        password:['', Validators.required]
    })
  }

  onLogin(){
    let data= this.loginForm.getRawValue();

    // if(data.username=='Sakura' && data.password=='password'){
    //   this.authService.login(true);
    //
    // }else{
    //   this.authService.login(false);
    // }

    console.log("data", data)

    this.authService.login(data);

  }

  isValid(){
    return this.loginForm.valid;
  }

  logout(){
    let data= this.loginForm.getRawValue();
    this.authService.login(data);
  }



}
