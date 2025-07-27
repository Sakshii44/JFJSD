package com.example.CRUD_API.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CRUD_API.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
