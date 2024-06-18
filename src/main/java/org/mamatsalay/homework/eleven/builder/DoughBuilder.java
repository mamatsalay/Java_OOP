package org.mamatsalay.homework.eleven.builder;

public class DoughBuilder
{
    private String doughType = "Тонкая";

    public DoughBuilder setThin(){
        this.doughType = "Тонкая";
        return this;
    }

    public DoughBuilder setThick(){
        this.doughType = "Толстая";
        return this;
    }

    public Dough build(){
        return new Dough(doughType);
    }

}
