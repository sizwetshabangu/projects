import { Component } from '@angular/core';
import { MatExpansionModule } from '@angular/material/expansion'
import {  } from "@angular/material";

@Component({
  selector: 'app-navigation',
  standalone: true,
  imports: [
    MatExpansionModule,
   ],
  templateUrl: './navigation.component.html',
  styleUrl: './navigation.component.css'
})
export class NavigationComponent {

}
