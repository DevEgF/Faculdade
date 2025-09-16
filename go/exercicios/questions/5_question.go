package questions

import (
	"fmt"
	"time"

	"example.com/exercise/questions/question_6/model"
)

// Criar um model que irá conter os itens para a compra do mês, nesse modelo teremos a data que a compra irá acontecer, mercado e os items para comprar

func Question_5() {

	var itens []string
	itens = append(itens, "Arroz")
	itens = append(itens, "Feijão")
	itens = append(itens, "Macarrão")
	itens = append(itens, "Carne")
	itens = append(itens, "Frango")
	itens = append(itens, "Leite")
	itens = append(itens, "Pão")

	NewCompra := model.NewCompra(
		time.Now(),
		"Carrefour",
		itens,
	)

	fmt.Println("Compra realizada no mercado:", NewCompra)
}
