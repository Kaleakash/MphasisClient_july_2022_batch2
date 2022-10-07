// this class responsible to map the json data retrieve from backend technologies 
export class Product {
    constructor(public pid:number,
        public pname:string,
        public price:number,
        public url:string){}
}
