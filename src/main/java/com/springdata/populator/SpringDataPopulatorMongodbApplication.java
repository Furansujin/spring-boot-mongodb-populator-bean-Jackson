package com.springdata.populator;

import com.springdata.populator.model.Film;
import com.springdata.populator.repository.FilmRepository ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

import java.util.List;

@SpringBootApplication
public class SpringDataPopulatorMongodbApplication {

    @Bean
    Jackson2RepositoryPopulatorFactoryBean  repositoryPopulator() {
        Jackson2RepositoryPopulatorFactoryBean factoryBean = new Jackson2RepositoryPopulatorFactoryBean();
        factoryBean.setResources(new Resource[] { new ClassPathResource("film.json") });
        return factoryBean;
    }

    @Autowired
    private FilmRepository filmRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataPopulatorMongodbApplication.class, args);
    }




}
