package io.javathinking.springbootstarter.topics;

public class Topic {

    private int id;
    private String name;
    private String description;


    public Topic(){

    }

    public Topic(int i ,String n, String d){
        super();
        this.id=i;
        this.name=n;
        this.description=d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
