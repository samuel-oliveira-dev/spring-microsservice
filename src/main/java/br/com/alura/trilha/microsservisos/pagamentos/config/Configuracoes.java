package br.com.alura.trilha.microsservisos.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracoes {
    @Bean
    public ModelMapper obterModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }
}
