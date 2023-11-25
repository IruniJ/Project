import { Component } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-admin-layout',
  templateUrl: './admin-layout.component.html',
  styleUrls: ['./admin-layout.component.scss'],
})
export class AdminLayoutComponent {

  userDetails:any={};

  constructor(private router : Router){

  }

  ngOnInit() {
    let user = sessionStorage.getItem('userData');
    if (user != null) {
      this.userDetails = JSON.parse(user);
    } else {
      alert("Login Expired! Please Login Again.")
      this.router.navigate(['/login'])

    }
  }

  logout(){
    this.router.navigate(['/login']);
    sessionStorage.removeItem('userData')
  }
}
