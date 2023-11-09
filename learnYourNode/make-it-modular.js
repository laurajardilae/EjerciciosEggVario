const mymodule = require('./mymodule');

const dirPath = process.argv[2];
const extension = process.argv[3];

mymodule(dirPath, extension, (err, list) => {
    if (err) {
        return console.error('Error:', err);
    }

    list.forEach(file => {
        console.log(file);
    });
});

