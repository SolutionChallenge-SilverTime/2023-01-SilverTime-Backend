package com.solutionchallenge.entertainment.domain.review;

import com.solutionchallenge.entertainment.domain.BaseTimeEntity;
import com.solutionchallenge.entertainment.domain.senior.Senior;
import com.solutionchallenge.entertainment.domain.tutor.Tutor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Review extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reviewId;

    @Column
    private String content;

    @ManyToOne
    @JoinColumn(name="senior_Id")
    private Senior senior;

    @ManyToOne
    @JoinColumn(name="tutor_Id")
    private Tutor tutor;

    public static Review getNewInstance(Senior senior, Tutor tutor, String content){
        return Review.builder()
                .senior(senior)
                .tutor(tutor)
                .content(content)
                .build();
    }
}
