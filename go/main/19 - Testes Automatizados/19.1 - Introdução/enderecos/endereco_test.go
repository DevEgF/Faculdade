// TESTE DE UNIDADE
package enderecos

import "testing"

type cenarioDeTeste struct {
	enderecoInserido        string
	retornoEnderecoEsperado  string
}

func TestTipoDeEndereco(t *testing.T) {

	// Cenários de teste
	cenariosDeTeste := []cenarioDeTeste{
		{enderecoInserido: "Rua ABC", retornoEnderecoEsperado: "rua"},
		{enderecoInserido: "Avenida ABC", retornoEnderecoEsperado: "avenida"},
		{enderecoInserido: "Estrada ABC", retornoEnderecoEsperado: "estrada"},
		{enderecoInserido: "Rodovia ABC", retornoEnderecoEsperado: "rodovia"},
		{enderecoInserido: "Travessa ABC", retornoEnderecoEsperado: "Tipo Inválido"},
		{enderecoInserido: "Alameda ABC", retornoEnderecoEsperado: "Tipo Inválido"},
		{enderecoInserido: "Praça ABC", retornoEnderecoEsperado: "Tipo Inválido"},
		{enderecoInserido: "Largo ABC", retornoEnderecoEsperado: "Tipo Inválido"},
	}

	for _, cenario := range cenariosDeTeste {
		tipoDeEnderecoRecebido := TipoEndereco(cenario.enderecoInserido)
		if tipoDeEnderecoRecebido != cenario.retornoEnderecoEsperado {
			t.Errorf("O tipo de endereço recebido é diferente do esperado. Esperado: %s, Recebido: %s", cenario.retornoEnderecoEsperado, tipoDeEnderecoRecebido)
		}
	}

	// Testes com tipos válidos
	enderecoParaTeste := "Rua Paulista"
	tipoDeEnderecoEsperado := "rua"
	tipoDeEnderecoRecebido := TipoEndereco(enderecoParaTeste)

	if tipoDeEnderecoRecebido != tipoDeEnderecoEsperado {
		t.Errorf("O tipo de endereço recebido é diferente do esperado. Esperado: %s, Recebido: %s", tipoDeEnderecoEsperado, tipoDeEnderecoRecebido)
	}
}