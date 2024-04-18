"""Problema "pagamento"
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final, 
mostrar o valor do pagamento do funcionário com uma mensagem explicativa."""


inf = "dados do funcionário: "
print(inf.upper())
#the upper() method converts all lowercase characters in a string into uppercase.

nome = input("Digite o nome do funcionário: ")
valorHora = float(input("Digite o valor por hora trabalhada: "))
horaTrabalhada = int(input("Digite a quantidade de horas trabalhadas: "))

pagamento = valorHora * horaTrabalhada

print(f'O pagamento para {nome} deve ser de {pagamento:.2f}')
