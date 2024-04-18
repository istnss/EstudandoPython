/*Problema "terreno"
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular, bem como o valor do metro quadrado do terreno. Em seguida, o programa deve mostrar o valor da área do terreno, bem como o 
valor do preço do terreno, ambos com duas casas decimais.*/

let rlSync = require('readline-sync')

let largura = Number(rlSync.question('Digite a largura do terreno: '));
let comprimento = Number(rlSync.question('Digite o comprimento do terreno: '));
let area = Number(rlSync.question('Digite o valor do metro quadrado: '));

let areaTerreno = largura * comprimento
let precoTerreno = areaTerreno * area


console.log(`Área do terreno: ${areaTerreno.toFixed(2)}\n.Preço do metro quadrado: ${precoTerreno.toFixed(2)}`);