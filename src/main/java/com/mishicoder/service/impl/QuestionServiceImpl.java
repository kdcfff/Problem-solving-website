package com.mishicoder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mishicoder.model.entity.Question;
import com.mishicoder.service.QuestionService;
import com.mishicoder.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author kdc
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2025-06-29 01:21:35
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




