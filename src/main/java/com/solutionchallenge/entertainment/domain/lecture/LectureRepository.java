package com.solutionchallenge.entertainment.domain.lecture;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LectureRepository extends JpaRepository<Lecture,Long> {
    Optional<List<Lecture>> findAllByCategory(String category);

    Optional<List<Lecture>> findByTitleLike(String category);

    Optional<List<Lecture>> findByTitleContains(String category);
}
