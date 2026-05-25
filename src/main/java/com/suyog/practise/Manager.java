package com.suyog.practise;

public class Manager {
    int teamSize;

    public Manager(int teamSize){
        this.teamSize=teamSize;
    }

    public Manager(){
        teamSize = 5;
    }

    void displayTeamSize(){
        System.out.println("Team size of mentioned manager is: "+teamSize);
    }
}
