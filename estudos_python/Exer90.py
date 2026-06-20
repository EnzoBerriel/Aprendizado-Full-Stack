#Exercício Python 090: Faça um programa que leia nome e média de um aluno, guardando 
#também a situação em um dicionário. No final, mostre o conteúdo da estrutura na tela.

#Variavel
dic = {}
#Requerimento
dic["Nome"] = str(input("Digite seu Nome: "))
dic["Media"] = float(input("Digite a  sua Média: "))
#Condicional
if dic["Media"] > 7: 
    dic["Situação"] = "Aprovado"
else:
    dic["Situação"] = "Reprovado"
#Resposta
for k,v in dic.items():
    print(f"{k} é igual a {v}.")