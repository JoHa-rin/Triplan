package com.triplan.domain;

import com.triplan.enumclass.QuestionType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class QuestionVO {

    private Integer questionId;
    @NotBlank
    @Size(max=100)
    private String title;
    @NotBlank
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer qnaCategoryId;
    private Integer memberId;
    private Integer itemGroupId;
    private Boolean hide;
    private QuestionType type;


}
