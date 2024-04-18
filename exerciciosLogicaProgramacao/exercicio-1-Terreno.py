"""Problema "terreno"
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular, bem como o valor do metro quadrado do terreno. Em seguida, o programa deve mostrar o valor da área do terreno, bem como o 
valor do preço do terreno, ambos com duas casas decimais."""

largura = float(input("Digite a largura do terreno: "))
comprimento = float(input("Digite o comprimento do terreno: "))
metroQuadrado = float(input("Digite o valor do metro quadrado do terreno: "))

area = largura * comprimento
preco = area * metroQuadrado
print(f"Area do terreno: {area:.2f} \n Preço do metro quadrado: {preco:.2f}")
