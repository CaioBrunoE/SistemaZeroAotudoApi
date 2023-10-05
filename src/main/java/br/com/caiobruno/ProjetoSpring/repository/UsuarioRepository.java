package br.com.caiobruno.ProjetoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caiobruno.ProjetoSpring.entity.UsuarioEntity;



public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}