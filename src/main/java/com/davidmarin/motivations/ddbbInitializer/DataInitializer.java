package com.davidmarin.motivations.ddbbInitializer;

import com.davidmarin.motivations.model.Motivation;
import com.davidmarin.motivations.repository.MotivationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MotivationRepository motivationRepository;

    public DataInitializer(MotivationRepository motivationRepository) {
        this.motivationRepository = motivationRepository;
    }

    // Divad -> se añade el autor en el constructor
    @Override
    public void run(String... args) throws Exception {
        motivationRepository.save(new Motivation("Quiero comenzar a trabajar en proyectos reales para ganar experiencia práctica y aplicar lo que he aprendido en un entorno profesional", "David Marín"));
        motivationRepository.save(new Motivation("Me entusiasma la idea de colaborar con un equipo de personas, ya que esto me permitirá aprender de otros y mejorar mis habilidades de trabajo en equipo", "David Marín"));
        motivationRepository.save(new Motivation("Estoy interesado en observar el crecimiento y evolución del proyecto, desde sus inicios hasta su desarrollo y éxito final", "David Marín"));
        motivationRepository.save(new Motivation("Mi objetivo es seguir desarrollándome profesionalmente, adquiriendo nuevas habilidades y conocimientos que me ayuden a avanzar en mi carrera", "David Marín"));
    }
}
