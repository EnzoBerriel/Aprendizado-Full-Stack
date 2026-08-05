#Crie um programa que tenha uma função chamada voto() que vai receber como parâmetro o ano de nascimento de uma pessoa,
#retornando um valor literal indicando se uma pessoa tem voto NEGADO, OPCIONAL e OBRIGATÓRIO nas eleições.

def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def votação(anoNascimento):
    from datetime import date
    anoAtual = date.today().year
    idade = anoAtual - anoNascimento
    if idade < 16:
        resposta = "Não Vota"
    elif idade < 18:
        resposta = "Votação Opcional"
    else:
        resposta = "Votação Obrigatória"
    print(f"Com {idade} anos: "+ resposta)


título("Funções para votação")
anoNascimento = int(input("Digite em qual ano você nasceu: "))
votação(anoNascimento)