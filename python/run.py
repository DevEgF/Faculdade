
def readPopulation(country):
    while True:
        try:
            value = float(input(f"Digite a população do país {country} (maior que 0): "))
            if value > 0:
                return value
            print("População inválida. Tente novamente.")
        except ValueError:
            print("Valor inválido. Tente novamente.")

def readGrowthRate(country):
    while True:
        try:
            tax = float(input(f"Digite a taxa de crescimento do país {country} (em %): ")) / 100
            if tax >= 0:
                return tax
            print("Taxa de crescimento inválida. Tente novamente.")
        except ValueError:
            print("Valor inválido. Tente novamente.")

def calculateYears(populationA, growthRateA, populationB, growthRateB):
    years = 0
    while populationA < populationB:
        populationA += populationA * growthRateA
        populationB += populationB * growthRateB
        years += 1
    return years

def main():
    while True:
        populationA = readPopulation("A")
        growthRateA = readGrowthRate("A")
        populationB = readPopulation("B")
        growthRateB = readGrowthRate("B")

        years = calculateYears(populationA, growthRateA, populationB, growthRateB)
        print(f"Serão necessários {years} anos para que a população do país A ultrapasse ou iguale a população do país B.")

        repeat = input("Deseja repetir a operação? (s/n): ").lower()
        if repeat != 's':
            break

    print("Programa encerrado.")

main()