// this class must be map to json data 
// retrieve from json-server or backend technology spring boot 
export class Product {
    constructor(public id:number,public pname:string,
        public price:number){}
}
