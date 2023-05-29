package org.example.command;

public class ComandoDesligarTV implements Comando {
    private Input input;

    public ComandoDesligarTV(Input input) {
        this.input = input;
    }

    public void executar() {
        this.input.desligarTV();
    }

    public void cancelar() {
        this.input.ligarTV();
    }
}
