/*Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto  de uma mercearia. O programa deve ler o preço unitário do produto, a quantidade 
de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve mostrar o valor do 
troco a ser devolvido ao cliente.*/

let rlSync = require('readline-sync')

let preco = Number(rlSync.question('Digite o preço unitário do produto: '));
let quantidade = Number(rlSync.question('Digite a quantidade comprada: '));
let dinheiro = Number(rlSync.question('Digite o dinheiro recebido: '));

let troco = dinheiro - (preco * quantidade);

console.log(`Troco = ${troco.toFixed(2)}`);
