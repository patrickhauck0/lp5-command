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
        Comando aberturaSemestre = new ComandoLigarTV(input);
        usuario.executarComando(aberturaSemestre);

        assertEquals("TV ligada", input.getSituacao());
    }
}