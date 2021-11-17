package com.triplan.service.inf;

import com.triplan.domain.QuestionVO;
import com.triplan.dto.customer.reponse.QuestionDTO;
import com.triplan.dto.response.Pagination;

import java.util.List;

public interface QuestionService {

    void create(QuestionVO questionVO);

    QuestionVO getQuestion(Integer questionId);

    void update(Integer questionID, QuestionVO questionVO);
    
    void delete(Integer questionId);

    Pagination<QuestionVO> listByItemGroupId(Integer pageSize, Integer currentPage, Integer itemGroupId);

    Pagination<QuestionVO> listByMemberId(Integer pageSize, Integer currentPage, Integer memberId);

}
