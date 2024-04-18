"""Problema "duração"
Fazer um programa para ler uma duração de tempo em segundos, imprimir na tela esta duração no formato horas:minutos:segundos."""

import datetime
def convert(n):
    return str(datetime.timedelta(seconds= n))

n = int(input("Digite um valor de segundos para ser transformado: "))
print(convert(n))


"""Outra forma de resolver o exercício"""

duracao = int(input('Digite a duração em segundos: '))

horas = duracao // 3600
resto = duracao % 3600
minutos = resto // 60
segundos = resto % 60

print(f"{horas:02}:{minutos:02}:{segundos:02}")
