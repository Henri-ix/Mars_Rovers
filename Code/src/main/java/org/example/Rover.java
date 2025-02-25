package org.example;

public class Rover {
    protected int x;
    protected int y;
    protected char cardinal;
    protected Compass compass;

    public Rover(int x, int y,char cardinal){
        this.x=x;
        this.y=y;
        this.cardinal=cardinal;
        compass = new Compass();
        while(compass.getPoint().data!=cardinal){
            compass.setPoint(compass.getPoint().next);
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public char getCardinal(){
        return cardinal;
    }

    @Override
    public String toString() {
        return getX() + "," + getY() + "," + getCardinal();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setCardinal(char cardinal) {
        this.cardinal = cardinal;
    }

    public void turnLeft(){
        compass.setPoint(compass.getPoint().prev);
        cardinal = compass.getPoint().data;
    }

    public void turnRight(){
        compass.setPoint(compass.getPoint().next);
        cardinal = compass.getPoint().data;
    }

    public void moveForward(int maxX,int maxY ){
        switch(cardinal){
            case 'N':
                if(y+1<=maxY){
                    y = y+1;
                }
                else {
                    System.out.println("Warning: Out of Plateau Bounds");
                }
                break;
            case 'E':
                if(x+1<=maxX){
                    x = x+1;
                }
                else {
                    System.out.println("Warning: Out of Plateau Bounds");
                }
                break;
            case 'S':
                if(y-1>=0){
                    y = y-1;
                }
                else {
                    System.out.println("Warning: Out of Plateau Bounds");
                }
                break;
            case 'W':
                if(x-1>=0){
                    x = x-1;
                }
                else {
                    System.out.println("Warning: Out of Plateau Bounds");
                }
                break;
        }
    }
}
