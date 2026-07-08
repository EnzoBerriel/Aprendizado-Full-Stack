#Funções
def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def contador(start, stop, step):
    print(f"Contagem de {start} até {stop} em {step}")
    if start < stop:
        while start <= stop:
            print(start, end=" ")
            start += step
    else:
        while start > stop:
            print(start, end="")
            start -= step


#introdução
título("Função de Contador")
#requerimento
start = int(input("Digite um Começo: "))
stop = int(input("Digite um Fim: "))
step = int(input("Digite o Passo: "))
#Resposta
contador(start,stop,step)
