import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from "./component/header/header.component";
import { NavigationComponent } from "./component/navigation/navigation.component";
import { MatSidenavModule } from "@angular/material/sidenav";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [
      RouterOutlet, 
      HeaderComponent, 
      NavigationComponent, 
      MatSidenavModule,
    ]
})
export class AppComponent {
  title = 'erp_frontend';
}
