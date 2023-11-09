const bl = require('bl');
const http = require('http');

const url1 = process.argv[2];
const url2 = process.argv[3];
const url3 = process.argv[4];


http.get(url1,(response)=>{
    response.pipe(bl(function (err, data) { 
        if (err) {
            return console.error(err);
        }
        console.log(data.toString());
        http.get(url2,(response)=>{
            response.pipe(bl(function (err, data) { 
                if (err) {
                    return console.error(err);
                }
                console.log(data.toString());
                http.get(url3,(response)=>{
                    response.pipe(bl(function (err, data) { 
                        if (err) {
                            return console.error(err);
                        }
                        console.log(data.toString());
                     }))
                })
             }))
        })
     }))
})

