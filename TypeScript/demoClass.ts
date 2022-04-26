// 70 % code is same for ES6 Impl in Typescript 

class Person{

    // class defination level declaration here 

    public personId:number;
    private orderId:number;

    constructor(a:number){
        this.personId=a;
        this.orderId=201;
        console.log('person object is init-->');
        console.log('person id is--->' +this.personId);
    }


    // create the public method here 

    public createperson():string{

          console.log('person ID with Order ID is -->' +this.orderId);

        return "person is created by person id -->" + "" +this.personId + "order created with id--->" +this.orderId;
    }



 // craete private here 

  private testPrivateMethod():string{

    return 'this is my private one-->';
  }

  // access private using previledged here 

  public testPreviledged():string{

    console.log('access private using previledged here -->');
    return this.testPrivateMethod();
  }


}

let p=new Person(101);

console.log('call the public method here -->' +p.createperson());

console.log('Access private outside the scope of class-->' +p.testPreviledged());