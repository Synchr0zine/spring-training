package com.cydeo.service;

import com.cydeo.config.AppConfigData;
import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    private final AppConfigData appConfigData;

    public CommentService(CommentRepository commentRepository, @Qualifier("email") CommentNotificationProxy commentNotificationProxy, AppConfigData appConfigData) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        this.appConfigData = appConfigData;
    }

    public void publishComment(Comment comment){
        // save in the DB
        // send e-mail

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

    public void printConfigData(){
        System.out.println(appConfigData.getUserName());
        System.out.println(appConfigData.getPassword());
        System.out.println(appConfigData.getUrl());
    }
}
