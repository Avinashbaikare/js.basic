let mydate=new Date()
console.log(mydate)
console.log(mydate.toString())
console.log(mydate.toDateString())
let mydate1=new Date(2024,0,23)
let mydate2=new Date("2004-01-23")
console.log(mydate1)
console.log(mydate1.toDateString())
console.log(mydate1.toLocaleString())
console.log(mydate2)
let mytimestamp=Date.now()
console.log(mytimestamp)
console.log(mydate2.getTime())
console.log(Math.floor(Date.now()/1000))