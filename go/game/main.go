package main

import (
	"bufio"
	"encoding/csv"
	"errors"
	"fmt"
	"os"
	"strconv"
	"strings"
)

type GameState struct {
	Name      string
	Points    int
	Questions []Questions
}

type Questions struct {
	Text    string
	Options []string
	Answer  int
}

func (gameState *GameState) Init() {
	fmt.Println("Seja bem vindo(a) ao quiz")
	fmt.Print("Escreva o seu nome: ")
	reader := bufio.NewReader(os.Stdin)

	name, err := reader.ReadString('\n')

	if err != nil {
		panic("Erro ao ler o string")
	}

	gameState.Name = name

	fmt.Printf("Vamos ao jogo %s", gameState.Name)
}

func (g *GameState) ProccessCSV() {
	f, err := os.Open("questions.csv")
	if err != nil {
		panic("Erro ao abrir o arquivo CSV")
	}

	defer f.Close()

	reader := csv.NewReader(f)
	records, err := reader.ReadAll()

	if err != nil {
		panic("Erro ao ler o arquivo CSV")
	}

	for index, record := range records {

		if index > 0 {
			correctAnswer, _ := toInt(record[5])
			question := Questions{
				Text:    record[0],
				Options: record[1:5],
				Answer:  correctAnswer,
			}

			g.Questions = append(g.Questions, question)
		}
	}
}

func (g *GameState) Run() {
	for i, question := range g.Questions {
		fmt.Printf("\033[33m %d. %s \033[0m\n", i+1, question.Text)

		for j, option := range question.Options {
			fmt.Printf("[%d] %s\n", j+1, option)
		}

		fmt.Println("Digite uma alternativa")

		var answer int
		var err error

		for {
			reader := bufio.NewReader(os.Stdin)
			read, _ := reader.ReadString('\n')

			answer, err = toInt(read[:len(read)-1])

			if err != nil {
				fmt.Println(err.Error())
				continue
			}
			break
		}

		if answer == question.Answer {
			fmt.Println("Parabéns você acertou!")
			fmt.Println("------------------------------------")
			g.Points += 10
		} else {
			fmt.Println("Ops! Errou!")
			fmt.Println("------------------------------------")
		}
	}
}

func main() {
	game1 := &GameState{}
	go game1.ProccessCSV()
	game1.Init()
	game1.Run()

	fmt.Printf("Você fez %d pontos %s", game1.Points, game1.Name)
}

func toInt(s string) (int, error) {
	i, err := strconv.Atoi(strings.TrimSpace(s))
	if err != nil {
		return 0, errors.New("Não é permitido caractere diferente de número, por favor insira um número válido")
	}
	return i, nil
}
