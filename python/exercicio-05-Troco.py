"""Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto  de uma mercearia. O programa deve ler o preço unitário do produto, a quantidade 
de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve mostrar o valor do 
troco a ser devolvido ao cliente."""

preco = float(input('Digite o valor unitário do produto : '))
quantidade = float(input('Digite a quantidade comprada: '))
dinheiro = float(input('Digite o dinheiro recebido: '))

troco = dinheiro - (preco * quantidade)
print(f'Troco = {troco:2f}')
