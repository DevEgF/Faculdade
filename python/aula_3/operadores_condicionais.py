nota1Aluno1 = float(input("Digite a primeira nota: "))
nota2Aluno1 = float(input("Digite a segunda nota: "))

media = (nota1Aluno1 + nota2Aluno1) / 2
media = round(media, 2)

if media > 10 or media < 0:
    print("Nota inválida")
elif media == 10:
    print("Aprovado com Distinção")
elif media >= 7:
    print("Sua nota é:",media)
    print("Aprovado")
else:
    print("Reprovado")