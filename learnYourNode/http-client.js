const url = process.argv[2];
const http = require('http');

http.get(url, (response)=>{
    response.setEncoding("utf8")
    console.log(response)
    response.on('data', console.log)
    response.on('error', console.error)
}).on('error', console.error)

