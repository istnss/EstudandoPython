/* Problema "retângulo"
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas decimais.*/


let rlSync = require('readline-sync')

let base = Number(rlSync.question('Digite a base do retangulo: '));
let altura = Number(rlSync.question('Digite o altura do retangulo: '));

let area = base * altura;
let perimetro = 2 * (base + altura);
let diagonal = Math.sqrt(base ** 2 + altura ** 2);


console.log(`Área: ${area.toFixed(4)}\n.Perimetro: ${perimetro.toFixed(4)}\n Diagonal: ${diagonal.toFixed(4)} `);