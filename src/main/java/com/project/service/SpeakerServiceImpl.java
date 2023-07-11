package com.project.service;

import com.project.model.Speaker;
import com.project.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    //without using spring power
    //private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();


    private SpeakerRepository speakerRepository;

    @PostConstruct
    private void initialize(){
        System.out.println("we're called after the constructors");
    }

    //setter injection
    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
}
