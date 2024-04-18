/*Problema "pagamento"
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final, 
mostrar o valor do pagamento do funcionário com uma mensagem explicativa.*/

let rlSync = require('readline-sync')

let nome = rlSync.question('Digite o nome: ');
let valor = Number(rlSync.question('Digite o valor por hora: '));
let horas = Number(rlSync.question('Digite as horas trabalhadas: '));

let pagamento = valor * horas;

console.log(`O pagamento para = ${nome} deve ser de ${pagamento}`);

