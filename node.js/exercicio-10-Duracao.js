/*Problema "duração"
Fazer um programa para ler uma duração de tempo em segundos, imprimir na tela esta duração no formato horas:minutos:segundos.*/

let rlSync = require('readline-sync')

let duracao = Number(rlSync.question('Digite a duração em segundos:  '));

let horas = Math.round(duracao / 3600);
let resto = duracao % 3600;
let minutos = Math.floor(resto / 60);
let segundos = Math.floor(resto % 60);

console.log(`duração formatada = ${horas} : ${minutos}: ${segundos}`);
