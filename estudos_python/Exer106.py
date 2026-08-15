def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def description_Help(text):
    from time import sleep
    título(f"acessando manual do comando {text}")
    sleep(2)
    help(text)


# Faça um mini-sistema que utilize o Interactive Help do Python. O usuário vai digitar o comando e o manual vai aparecer. Quando o usuário digitar a palavra 'FIM', o programa se encerrará. 

#Main
título("Sistema interativo de ajuda em Python")
while True:
    text = str(input("Biblioteca ou Função: ")).lower()
    if text == "fim":
        título("Obrigado por poder te ajudar...")
        break
    description_Help(text)

