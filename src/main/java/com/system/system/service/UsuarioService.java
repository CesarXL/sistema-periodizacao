package com.system.system.service;

import com.system.system.entity.Usuario;

import java.util.Optional;
import java.util.UUID;

public interface UsuarioService {
    Optional<Usuario> buscarUsuarioPorEmail(String email);
    Optional<Usuario> buscarUsuarioPorId(UUID idUsuario);
    Usuario cadastrarUsuario(Usuario usuario);
    Usuario atualizarUsuario(Usuario usuario);
    void deletarUsuario(UUID idUsuario);
}
