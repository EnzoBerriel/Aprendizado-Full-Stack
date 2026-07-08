#Funções
def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")


#introdução
título("Print Especial")
#Requerimento
string = str(input("Digite sua frase: "))
título(string)
