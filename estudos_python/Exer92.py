"""Crie um programa que leia nome, ano de nascimento e carteira de trabalho e cadastre-o (com idade) em um dicionário. Se por acaso
a CTPS for diferente de ZERO, o dicionário receberá também o ano de contratação e o salário. Calcule e acrescente, além da idade, com quantos anos a pessoa
vai se aposentar."""
#importação
from datetime import date
#Introdução
print("=-"*8, "Cadastro de Pessoa", "-="*8)
#Dicionário
pessoa = dict()
#Requerimentos
pessoa["Nome"] = input("Digite o Nome: ")
pessoa["Ano Nascimento"] = int(input("Digite o Ano de Nascimento: "))
pessoa["Idade"] = date.today().year - pessoa["Ano Nascimento"]
pessoa["CTPS"] = int(input("Carteira de Trabalho (0 se não tiver): "))

if pessoa["CTPS"] != 0:
    pessoa["Ano de Contratação"] = int(input("Ano de Contratação: "))
    pessoa["Salário"] = float(input("Salário: R$ "))
    anos_trabalhados = date.today().year - pessoa["Ano de Contratação"]
    tempo_restante = 35 - anos_trabalhados
    pessoa["Aposentadoria"] = pessoa["Idade"] + tempo_restante
#Reposta
print("\n--- Resultado Final ---")
for k, v in pessoa.items():
    print(f"- {k}: {v}")