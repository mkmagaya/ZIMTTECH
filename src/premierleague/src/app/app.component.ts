import { Component } from '@angular/core';
import UsersJson from './users.json';

interface USERS {
    id: Number;
    posNumber: Number;
    teamName: string;
    playedTeam: Number;
    winsTeam: Number;
    drawsTeam: Number;
    lossesTeam: Number;
    goalsForTeam: Number;
    goalsAgainstTeam: Number;
    goalDifferenceTeam: Number;
    pointsTeam: Number;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'ng-gigamakng';
  Users: USERS[] = UsersJson;
  constructor(){
    console.log(this.Users);
  }
}
