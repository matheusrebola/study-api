package br.com.github.matheusrebola.study_api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.github.matheusrebola.study_api.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, Long> {
    
}
