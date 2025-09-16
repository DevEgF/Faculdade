package model

import "time"

type Compra struct {
	Data    time.Time
	Mercado string
	Itens   []ItemDaCompra
}

type ItemDaCompra struct {
	Nome string
}

func NewCompra(data time.Time, mercado string, nomeDosItens []string) *Compra {
	var itens []ItemDaCompra

	for _, item := range nomeDosItens {
		itens = append(itens, ItemDaCompra{Nome: item})
	}

	return &Compra{
		Mercado: mercado,
		Data:    data,
		Itens:   itens,
	}
}
