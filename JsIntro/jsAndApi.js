// URL de la API para obtener información sobre personas
const apiUrl = 'https://swapi.dev/api/people/'+'1';

////Con axios.get() que devuelve una promesa
// y se consuma la promesa con un then catch
const axios = require('axios');

// Utilizamos Axios para hacer la solicitud a la API
axios.get(apiUrl)
  .then(response => {
    // Verificamos si la solicitud fue exitosa (código de estado 200)
    if (response.status !== 200) {
      throw new Error(`Error: ${response.status}`);
    }
    // Convertimos la respuesta a formato JSON
    return response.data;
  })
  .then(data => {
    // Hacer algo con los datos (en este caso, imprimir en la consola)
    console.log('Datos obtenidos:', data);
  })
  .catch(error => {
    console.error('Error al obtener datos:', error);
  });




////Con fetch que devuelve una promesa
async function fetchText(url) {
  try{
    let response = await fetch(url);
    let data = await response.text();
    console.log(data);
  }catch{
    console.log("No se pudo obtener los datos");
  }
}

fetchText(apiUrl);
