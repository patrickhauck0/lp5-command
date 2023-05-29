package org.example.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class UsuarioTest {
    Usuario usuario;
    Input input;

    @BeforeEach
    void setUp() {
        usuario = new Usuario();
        input = new Input(1);
    }

    @Test
    void deveLigarTV() {
        Comando ligarTV = new ComandoLigarTV(input);
        usuario.executarComando(ligarTV);

        assertEquals("TV ligada", input.getSituacao());
    }

    @Test
    void deveDesligarTV() {
        Comando desligarTV = new ComandoDesligarTV(input);
        usuario.executarComando(desligarTV);

        assertEquals("TV desligada", input.getSituacao());
    }

    @Test
    void deveCancelarDesligarTV() {
        Comando ligarTV = new ComandoLigarTV(input);
        Comando desligarTV = new ComandoDesligarTV(input);

        usuario.executarComando(ligarTV);
        usuario.executarComando(desligarTV);

        usuario.cancelarUltimoComando();

        assertEquals("TV ligada", input.getSituacao());
    }
}