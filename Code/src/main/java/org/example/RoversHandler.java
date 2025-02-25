package org.example;

import java.util.HashSet;
import java.util.Set;

public class RoversHandler {
    protected Set<Rover> rovers;
    protected int x;
    protected int y;
    protected Compass compass;

    public RoversHandler(int x,int y){
        rovers = new HashSet<>();
        this.x=x;
        this.y=y;
        compass = new Compass();
    }

    public void addRover(Rover rover){
        rovers.add(rover);
    }

    public void parseCommand(String command,Rover rover){
        for (int i=0;i<command.length();i++){
            if (command.charAt(i)=='L'){
                rover.turnLeft();
            } else if (command.charAt(i)=='R') {
                rover.turnRight();
            } else if (command.charAt(i)=='M') {
                rover.moveForward(x,y);
            }
            else{
                System.out.println("Unknown Command" + command.charAt(i));
            }
        }
        System.out.println(rover.toString());
    }




}
