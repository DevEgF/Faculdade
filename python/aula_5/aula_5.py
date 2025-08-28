frutas = ["maça", "morango", "uva"]
frutas_tropicais = ["manga", "abacate", "maracujá"]

frutas.extend(frutas_tropicais)

frutas.remove("morango")

frutas.append("kiwi")

frutas.append(input("Digite o nome da fruta: "))

frutas.pop()

len(frutas)

print(len(frutas))

print(frutas)

print(frutas[4])

print(frutas[2:5])

print(frutas[:5])

#Iteração de listas
carrinho = ["maça, uva, kiwi", "jaca"]

for item in range(len(carrinho)):
    print(item + 1, "-", carrinho[item])

for index, item in enumerate(frutas):
    print(index, item)

for index, item in enumerate(frutas):
    if item == "kiwi":
        print("Encontrei o kiwi")
        print("indice:", index)
        break

#-------------------------------
frutas = ["maçã", "banana", "laranja", "uva"]

for index, item in enumerate(frutas):
    print(index,"-",item)