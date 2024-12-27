// primitive 
// 7 Types: string,number,boolean,null,undefined,symbol,bigint

const id= Symbol('123')
const idval=Symbol('123')
console.log(id===idval)
console.log(4)

//reference(non primitive)
//array,objects,functions

const heros=["batman","superman","spiderman"]
let myobj={
    name:"avinash",
    age:23,
}
const myfunction=function(){
    console.log("hello world")
}
console.log()
//1) Primitive Datatypes
    //   Number => number
     //  String  => string
    //   Boolean  => boolean
    //   null  => object
    //   undefined  =>  undefined
    //   Symbol  =>  symbol
    //   BigInt  =>  bigint

//2) Non-primitive Datatypes
    //   Arrays  =>  object
    //   Function  =>  function
    //   Object  =>  object