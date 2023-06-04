"""Problema "duracao"
Fazer um programa para ler uma duração de tempo em segundos, imprimir na tela 
esta duração no formato horas:minutos:segundos."""

import datetime
def convert(n):
    return str(datetime.timedelta(seconds= n))

n = int(input("Digite um valor de segundos para ser transformado: "))
print(convert(n))