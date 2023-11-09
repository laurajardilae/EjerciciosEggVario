const bl = require('bl');
const http = require('http');

const url = process.argv[2];

http.get(url,(response)=>{
    totalChars = 0;
    response.pipe(bl(function (err, data) { 
        if (err) {
            return console.error(err);
        }
        const totalChars = data.length;
        console.log(totalChars);
        console.log(data.toString());
     }))
})
