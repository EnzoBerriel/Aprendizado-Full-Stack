#Introdução
print("=-"*8,"Aprimorando Dicionários","=-"*8)
#Variaveis
jogador = {}
time = []
quant = 0
Gols = []
condicional = None
tot = 0
#Requerimento
while True:
    jogador["Nome"] = str(input("Digite o nome do Jogador: "))
    quant = int(input(f"Quantas partidas {jogador['Nome']} jogou: "))
    for c in range(quant):
        Gols.append(int(input(f" Quantos gols na {c+1}° partida: ")))
    jogador["gols"] = Gols[:]
    Gols.clear()
    time.append(jogador.copy())
    while True:
        condicional = str(input("Deseja Continuar[S/N]: ")).lower()
        if condicional in ["s","n","sim","não","nao"]:
            break
        print("ERRO!!! Tente Novamente.")
    print("\n")
    if condicional in ["não","nao","n"]:
        break
#Espaçamento
print("Informações dos jogadores\n")
print("-"*16,"\n")
#Info Jogadores
for j in time:
    #total de gols
    for gols in j["gols"]:
        tot += gols
    #info
    print(f"Jogador: {j["Nome"]}")
    print(f"Gols: {j["gols"]}")
    print(f"Total: {tot}\n")
    #Espaçamento
    print("-"*16,"\n")
    #Reiniciar
    tot = 0