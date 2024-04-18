/*Problema "idades"
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os nomes e a idade média entre
essas pessoas, com uma casa decimal.*/

let rlSync = require('readline-sync')

let pessoa1 = rlSync.question('Digite o nome da primeira pessoa: ');
let idade1 = Number(rlSync.question('Digite a idade da primeira pessoa: '));
let pessoa2 = rlSync.question('Digite o nome da segunda pessoa: ');
let idade2 = Number(rlSync.question('Digite a idade da segunda pessoa: '));

let media = (idade1 + idade2) / 2;


console.log(`A media de idade entre ${pessoa1} e ${pessoa2} é ${media} anos`);