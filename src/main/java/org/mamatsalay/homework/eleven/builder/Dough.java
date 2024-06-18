package org.mamatsalay.homework.eleven.builder;

public class Dough
{
    private String doughType;

    public Dough(String doughType){
        this.doughType = doughType;
    }

    public String getDoughType(){
        return doughType;
    }

    @Override
    public String toString() {
        return doughType;
    }

}
