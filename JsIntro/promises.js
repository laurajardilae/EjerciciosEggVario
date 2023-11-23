//La funcion retorna una promesa
function fetchData(){
    return prometoObtenerFecha = new Promise(function(myResolve, myReject){
        console.log("Obteniendo fecha...")
        setTimeout(()=>{
            myResolve(new Date())
        },2000)
    });
    
}


//Llamo la funcion que retorna la promesa y consumo la promesa con then
fetchData().then((fecha)=>console.log(`La fecha es ${fecha}`))
