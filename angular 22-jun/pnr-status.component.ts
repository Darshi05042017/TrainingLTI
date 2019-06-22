import { Component } from "@angular/core";
import { PNRStatusService } from 'src/app/pnr-status.service';
import { PNR } from 'src/app/pnr';

@Component({

    selector :'pnr-status',
    templateUrl :'./pnr-status.component.html'

})

export class PNRStatusComponent{

    pnrNo: number;
    pnr:PNR;
    //requesting Angular to inject object of our service class
    constructor(private ps: PNRStatusService){

    }
    checkStatus(){
        this.ps.fetchPNRStatus(this.pnrNo).subscribe(data =>{
        this.pnr=data ;
     });
            

    }

}