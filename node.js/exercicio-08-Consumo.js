/*Problema "consumo"
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais.*/

let rlSync = require('readline-sync')

let distancia = Number(rlSync.question('Digite a distância percorrida:  '));
let combustivel = Number(rlSync.question('Digite o combustivel gasto: '));

let media = distancia / combustivel;

console.log(`Consumo médio = ${media.toFixed(3)}`);
