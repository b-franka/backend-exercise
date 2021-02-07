import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RestService } from './shared/rest-service.service';
import { HttpClientModule } from '@angular/common/http';
import { CardComponent } from './card/card.component';
import { TruncatePipe } from './shared/truncate.pipe';
import { SortModalComponent } from './sort-modal/sort-modal.component';
import { HallOfFameComponent } from './hall-of-fame/hall-of-fame.component';

@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    TruncatePipe,    
    SortModalComponent, HallOfFameComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    RestService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
