package com.masai.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.masai.repository.MovieDAO;
import com.masai.repository.SeriesDAO;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init")
    public MovieDAO movieDAO() {
        return new MovieDAO();
    }

    @Bean(initMethod = "init")
    public SeriesDAO seriesDAO() {
        return new SeriesDAO();
    }
}

