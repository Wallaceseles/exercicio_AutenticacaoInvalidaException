
package br.edu.ifba.saj.ads.poo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestaLogin {

    @Test
    public void testUsuario() { 
        String login = "login";
        String senha = "senha";
        Usuario u = new Usuario(login,senha);
        assertEquals(login, u.getLogin());
        assertEquals(senha, u.getSenha());        
    }
        
    @Test
    public void testLoginOk() throws AutenticacaoInvalidaException { 
        String login = "login";
        String senha = "senha";
        Usuario u = new Usuario(login,senha);
        BancoDeUsuarios.addUsuario(u);
        BancoDeUsuarios.autenticar(login, senha);        
    }
        
    @Test(expected = AutenticacaoInvalidaException.class)
    public void testLoginException() throws AutenticacaoInvalidaException { 
        String login = "login9";
        String senha = "senha9";
        Usuario u = new Usuario(login,senha);
        BancoDeUsuarios.autenticar(login, senha);        
    }
}
