const fs = require('fs')

let buf1 = fs.readFileSync(process.argv[2])
let texto1 =  buf1.toString().split('\n')
let contador = texto1.length-1

console.log(contador)

