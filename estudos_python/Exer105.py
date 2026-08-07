#Faça um programa que tenha uma função notas() que pode receber várias notas de alunos e vai retornar um dicionário com as seguintes informações:#Ex: n = leiaInt('Digite um n: ')

def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def notas(*num, sit=True):
    """
    """
    dic = {}
    maior = num[0]
    menor = num[0]
    tot = 0
    for c in num:
        tot += c
        if c > maior:
            maior = c
        if c < menor:
            menor = c
    media = tot / len(num)
    if sit == True:
        if media < 5:
            sit = "Ruim"
        if media <= 7:
            sit = "Mediana"
        if media <= 9:
            sit = "Boa"
        if media == 10:
            sit = "Perfeita"
        dic["Situação"] = sit
    dic["Maior Nota"] = maior
    dic["Menor Nota"] = menor
    dic["Media da Turma"] = media
    return dic


#main
título("Analisando e gerando Dicionários")
resp = notas(2,3,9,7,6,10)
print(resp)
