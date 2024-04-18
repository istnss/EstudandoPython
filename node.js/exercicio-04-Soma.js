/*Problema "soma"
Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela  o valor da soma destes números.*/

let rlSync = require('readline-sync')

let x = Number(rlSync.question('Digite o valor de X: '));
let y = Number(rlSync.question('Digite o valor de y: '));

let soma = (x + y);

console.log(`Soma = ${soma}`);
