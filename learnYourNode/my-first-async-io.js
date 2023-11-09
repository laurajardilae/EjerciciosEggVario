const fs = require('fs')
const filePath = process.argv[2]



    fs.readFile(filePath, 'utf8', (error, contenido) => {
        if (error) {
            return console.log(error)
          }
        const numberOfLines = contenido.split('\n').length - 1;
        console.log(numberOfLines);
    });






