const fs = require('fs');
const path = require('path');

const dirPath = process.argv[2];
const tipo = '.' + process.argv[3];

fs.readdir(dirPath, (err, list) => {
    if (err) {
        return console.log(err);
      }
    list.forEach(function(elemento){
        if(path.extname(elemento) === tipo){
            console.log(elemento);
        }
    });
});

