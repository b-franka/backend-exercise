import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RestService {
  private readonly BASE_URL = 'http://localhost:8080/api/';

  constructor(@Inject(HttpClient) private _http: HttpClient) { }

  public getProjects() {
    const PROJECT_URL = this.BASE_URL + 'project/all';
    return this._http.get(PROJECT_URL);
  }


}
