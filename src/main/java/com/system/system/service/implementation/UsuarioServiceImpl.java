package com.system.system.service.implementation;

import com.system.system.entity.Usuario;
import com.system.system.repository.UsuarioRepository;
import com.system.system.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> buscarUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorId(UUID idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {

        if(usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new RuntimeException("Email já  cadastrado!");
        }

        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario atualizarUsuario(Usuario usuario) {

        if (!usuarioRepository.existsById(usuario.getIdUsuario())){
            throw new RuntimeException("Usuario não encontrado!");
        }

        return usuarioRepository.save(usuario);
    }

    @Override
    public void deletarUsuario(UUID idUsuario) {

        if (!usuarioRepository.existsById(idUsuario)){
            throw new RuntimeException("Usuario não encontrado!");
        }

        usuarioRepository.deleteById(idUsuario);
    }
}
