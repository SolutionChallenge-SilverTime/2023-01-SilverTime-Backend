package com.solutionchallenge.entertainment.domain.review;

import com.solutionchallenge.entertainment.domain.lecture.Lecture;
import com.solutionchallenge.entertainment.domain.tutor.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReivewRepository extends JpaRepository<Review,Long> {

    Optional<List<Review>> findAllByLecture(Lecture lecture);
}
