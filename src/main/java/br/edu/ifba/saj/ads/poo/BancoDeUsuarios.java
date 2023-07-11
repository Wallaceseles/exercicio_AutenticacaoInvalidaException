package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class BancoDeUsuarios {
    private static List<Usuario> usuarios;

    static {
        usuarios = new ArrayList<>();
    }

    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Usuário autenticado: " + usuario.getLogin());
                return;
            }
        }

        throw new AutenticacaoInvalidaException("Usuário " + login + " não foi encontrado ou a senha está errada");
    }
}
