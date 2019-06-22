import { Observable } from 'rxjs/internal/Observable';
import{HttpClient} from '@angular/common/http';
import { PNR } from 'src/app/pnr';
import { Injectable } from '@angular/core';

@Injectable()
export class PNRStatusService{

   
    //injecting the HttpClient object required for making AJAX/REST calls
    constructor(private http : HttpClient){     //constructor injection

    }
     fetchPNRStatus(pnrNo : number): Observable<PNR> {
         let url="http://localhost:1029/rest-intro/rest/pnr/status?pnrNo="+pnrNo;
         return this.http.get<PNR>(url);
    }
}