
#introdução
print('=-'*18,f'\n{'Boletim':^36}'.upper())
print('=-'*18)
#base
aluno = []
boletim = []
#requerimento
while True:
    aluno.append(str(input('Nome: ')))#Nome=0
    aluno.append(float(input('Nota 1: ')))#Nota1=1
    aluno.append(float(input('Nota 2: ')))#Nota2=2
    aluno.append((aluno[1]+aluno[2])/2)#Média=3
    boletim.append(aluno[:])
    aluno.clear()
    while True: #Lógica_Continuidade
        resp = str(input('Quer continuar? [S/N]: ')).upper().strip()
        if resp in 'SN':
            break
        else:
            print('Tente novamente!!!')
    print('--'*18)
    if resp == 'N':
        break
#lista_de_alunos
for i in range (1, len(boletim)+1):
    print(f'{i}.Aluno'
          f'\n-Nome: {boletim[i-1][0]}'
          f'\n-Média: {boletim[i-1][3]}')
    print('-'*18)
#Aluno_Escolhido
while True:
    print('=-'*8,' NOTAS DOS ALUNOS ','-='*8)
    while True: #Lógica_Continuidade
        resp = str(input('\nQuer saber as notas de algum aluno[S/N]: ')).upper().strip()
        if resp in 'SN':
            break
        else:
            print('Tente novamente!!!')
    if resp == 'N':
        break
    while True:
        escolhido = int(input('Qual aluno: '))
        if 0 < escolhido <= len(boletim):
            break
        else:
            print('Tente novamente!!!')
    print(f'\nAluno: {boletim[escolhido-1][0]}\n'
          f'Primeira nota: {boletim[escolhido-1][1]}\n'
          f'Segunda  nota: {boletim[escolhido-1][2]}\n')