package io.javathinking.springbootstarter.topics;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.*;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1,"SpringBoot","Framework"),
            new Topic(2,"HTML5","Layout"),
            new Topic(3,"Angular","JavaScriptFramework"),
            new Topic(4,"CSS3","BootstrapFramework")));


    public  List<Topic> getAllTopics(){
         return topics;
    }

public Topic getTopic(String id){

    return topics.stream().filter(topic -> topic.getId()== parseInt(id)).findFirst().get();

    }

    public void addTopic(Topic topic) {


    topics.add(topic);
    }
}

