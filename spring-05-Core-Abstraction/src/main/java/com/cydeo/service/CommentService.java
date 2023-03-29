package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.EmailCommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;

public class CommentService {

    private DBCommentRepository dbCommentRepository;


    public void publishComment(Comment comment){
        // save in the DB
        // send e-mail

        dbCommentRepository.storeComment(comment);


    }
}
