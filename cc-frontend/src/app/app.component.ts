import { Component, Inject, OnDestroy } from '@angular/core';
import { RestService } from './shared/rest-service.service';
import { Subscription } from 'rxjs';
import * as lod from 'lodash';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnDestroy {
  public dataLoaded: Promise<boolean>;
  public userGroupList;
  public dataSubscription: Subscription;

  constructor(@Inject(RestService) private _restService: RestService) {
    this.dataSubscription = this._restService.getProjects().subscribe((data: any) => {
      this.userGroupList = data;
      console.log(this.userGroupList);
      this.dataLoaded = Promise.resolve(true);
    });
  }

  ngOnDestroy() {
    this.dataSubscription.unsubscribe();
    this.dataSubscription = null;
  }

  notifyNewSorting(method) {
    if (this.userGroupList) {
      switch (method.key) {
        case 'name':
          this.userGroupList = lod.orderBy(this.userGroupList, ['title', 'asc']);
          break;
        case 'nameReverse':
          this.userGroupList = lod.orderBy(this.userGroupList, ['title', 'desc']);
          break;
        case 'time':
          this.userGroupList = lod.orderBy(this.userGroupList, ['created', 'asc']);
          break;
        case 'timeReverse':
          this.userGroupList = lod.orderBy(this.userGroupList, ['created', 'desc']);
          break;
        default:
          this.userGroupList = lod.orderBy(this.userGroupList, ['title', 'asc']);
          break;
      }
    }
  }
}
