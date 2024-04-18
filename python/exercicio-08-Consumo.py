""" Problema "consumo"
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais."""

distancia = float(input('Digite a distância percorrida:  '));
combustivel = float(input('Digite o combustivel gasto: '));

media = distancia / combustivel;

print(f"Consumo médio = R${media:.3f}");
