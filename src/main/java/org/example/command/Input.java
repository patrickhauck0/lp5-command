package org.example.command;

public class Input {

    private int input;
    private String situacao;

    public Input(int input) {
        this.input = input;
    }

    public String getSituacao() {
        return situacao;
    }

    public void ligarTV() {
        this.situacao = "TV ligada";
    }

    public void desligarTV() {
        this.situacao = "TV desligada";
    }
}
