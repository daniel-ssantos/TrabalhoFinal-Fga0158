package br.edu.cafeteria.excecao;

class EstoqueInsuficienteException extends Exception {
	EstoqueInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
