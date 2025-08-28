option = 1

frutas = []

while option != 4:
    print("\nBem vindo ao Fruit Menu \n\nEscolha uma das opções abaixo: \n\n1 - Listar \n2 - Add \n3 - Remove \n4 - Sair")

    option = int(input("\nEscolha uma opção: "))

    if option == 1:
        print("Você escolheu a opção 1, listar frutas")
        if len(frutas) == 0:
            print("Nenhuma fruta cadastrada")
        else:
            for index, item in enumerate(frutas):
                print(index, "-", item)

    elif option == 2:
        print("Você escolheu a opção 2, adicione uma fruta")
        fruta = input("Digite o nome da fruta: ")
        frutas.append(fruta)
        print("Fruta adicionada com sucesso!")

    elif option == 3:
        print("Você escolheu a opção 3, remova uma fruta")
        if len(frutas) == 0:
            print("Nenhuma fruta cadastrada")
        else:
            for index, item in enumerate(frutas):
                print(index, "-", item)

            indice = int(input("Digite o índice da fruta que deseja remover: "))

            if 0 <= indice < len(frutas):
                frutas.pop(indice)
                print("Fruta removida com sucesso!")

                print("Frutas restantes:")
                for index, item in enumerate(frutas):
                    print(index, "-", item)
            else:
                print("Índice inválido")

    elif option == 4:
        print("\nObrigado por usar o App")

    else:
        print("Opção inválida")
