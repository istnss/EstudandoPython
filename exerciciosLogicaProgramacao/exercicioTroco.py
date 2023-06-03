"""Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto 
de uma mercearia. O programa deve ler o preço unitário do produto, a quantidade 
de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente 
(suponha que haja dinheiro suficiente). Seu programa deve mostrar o valor do 
troco a ser devolvido ao cliente."""

while True:
    try:
        produto1 = 8.00
        quantidadeComprada = float(input("Digite a quantidade comprada: "))
        totalCompra = produto1 * quantidadeComprada

        dinheiroRecebido = float(input("Digite o dinheiro recebido: "))


        if dinheiroRecebido < totalCompra:
            print("Valor do dinheiro é insuficiente")

        elif dinheiroRecebido >= totalCompra:
            troco = dinheiroRecebido - totalCompra
            print("O troco é de: ", troco)
        else:
            print ("Valor inválido")
        break
    except:
        print("Valor inválido. Digite um valor númerico!")  
        
#Aqui utilizei if/else para testar a condição de valor pago; Utilizei try/except para quando o usuário digitar algo diferente do valor numérico. 
