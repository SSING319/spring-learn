package com.project.repository;

import com.project.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
