package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }


     public void display()

    {
        System.out.println("Actor name is:"+actor.getName()+" Actor Gender is:"+actor.getGender()+" Actor Age is:"+actor.getAge());
    }

}
