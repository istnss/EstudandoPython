/*Problema "medidas"
Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
com quatro casas decimais):
a) a área do quadrado que tem lado A
b) a área do triângulo retângulo que base A e altura B
c) a área do trapézio que tem bases A e B, e altura C*/

let rlSync = require('readline-sync')

let A = Number(rlSync.question('Digite a medida A: '));
let B = Number(rlSync.question('Digite a medida B: '));
let C = Number(rlSync.question('Digite o medida C: '));

let areaQuadrado = A ** 2;
let areaTriangulo = A * B / 2;
let areaTrapezio = (A + B) * C / 2;

console.log(`Area do quadrado ${areaQuadrado}. Area do triangulo ${areaTriangulo}. Area do trapezio ${areaTrapezio}`);
