package org.example;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        RoversHandler handler;
        while (true){
            System.out.println("please enter the top-right co-ordinates of the plateau");
            try{
                String[] plateau = input.nextLine().split(" ");
                int x = Integer.parseInt(plateau[0]);
                int y = Integer.parseInt(plateau[1]);
                handler = new RoversHandler(x,y);
                break;
            }
            catch (Exception e){
                handlerError();
            }
        }

        while (true){
            System.out.println("Enter the details of the next rover or enter -1 to quit");
            String[] details = input.nextLine().split(" ");
            try {
                int x = Integer.parseInt(details[0]);
                if(x==-1){
                    break;
                }
                int y = Integer.parseInt(details[1]);
                char cardinal = details[2].charAt(0);
                if (!handler.compass.getPoints().contains(cardinal)){
                    System.out.println("not a valid cardinal point");
                    roverError();
                    continue;
                }
                Rover rv = new Rover(x,y,cardinal);
                handler.addRover(rv);
                while(true) {
                    System.out.println("Enter the Command sequence or enter any number to leave this rover");
                    if(input.hasNextInt()){
                        System.out.println("Switching off rover...");
                        break;
                    }
                    String command = input.nextLine();
                    handler.parseCommand(command,rv);

                }
            }
            catch (Exception e){
                roverError();
            }
        }
        System.out.println("Quitting Application...");
        input.close();
    }

    private static void roverError() {
        System.out.println("Please enter the details in the format x y cardinal; i.e 1 2 N");
    }

    private  static void handlerError(){
        System.out.println("Not a valid input, please enter in the format: x y, i.e: 5 5");
    }


}