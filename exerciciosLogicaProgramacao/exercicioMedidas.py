"""Problema "medidas"
Fazer um programa para ler três medidas A, B e C. 
Em seguida, calcular e mostrar (imprimir os dados
com quatro casas decimais):
a) a área do quadrado que tem lado A
b) a área do triângulo retângulo que base A e altura B
c) a área do trapézio que tem bases A e B, e altura C"""

a = float(input("Digite a medida A :"))
b = float(input("Digite a medida B :"))
c = float(input("Digite a medida C :"))

areaQuadrado = (a ** 2)
areaTriangulo = a * b/2
areaTrapezio = (a + b) * c /2

print("Area do quadrado: ", areaQuadrado, "\n Area do triangulo ", 
      areaTriangulo, "\n Area do trapezio: ", areaTrapezio)
