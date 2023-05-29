package org.example.command;

public class ComandoLigarTV implements Comando {
    private Input input;

    public ComandoLigarTV(Input input) {
        this.input = input;
    }

    public void executar() {
        this.input.ligarTV();
    }

    public void cancelar() {
        this.input.desligarTV();
    }
}
