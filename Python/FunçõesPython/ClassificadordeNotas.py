# Versão 1 - Procedural

nota = int(input("Digite a nota tirada(entre 0 e 100): "))
if nota >= 90 and nota <= 100:
    print("O aluno tirou nota A.    (❁´◡`❁)")
elif nota >= 80 and nota <=89:
    print("O aluno tioru nota B.    ╰(*°▽°*)╯")
elif nota >= 70 and nota <= 79:
    print("O alino tirou nota C.    ^_^")
elif nota >= 60 and nota <= 69:
    print("O aluno tirou nota D.    ಠ_ಠ")
else:
    print("O aluno tirou nota E.    (┬┬﹏┬┬) )")

# Versão 2 - Modular com Funções

def classificar_nota(nota):
    if nota >= 90 and nota <= 100:
        print("O aluno tirou nota A.    (❁´◡`❁)")
    elif nota >= 80 and nota <=89:
        print("O aluno tioru nota B.    ╰(*°▽°*)╯")
    elif nota >= 70 and nota <= 79:
        print("O alino tirou nota C.    ^_^")
    elif nota >= 60 and nota <= 69:
        print("O aluno tirou nota D.    ಠ_ಠ")
    else:
        print("O aluno tirou nota E.    (┬┬﹏┬┬) )")

# Programa principal

nota = int(input("Digite a nota tirada(entre 0 e 100): "))
notas = classificar_nota(nota)
