package com.example;

//new - create new thread
//runnable - ready to run
//dead - thread finished
//runnig - running
//waiting - on hold

//there are two ways to create a new thread: 1) extend thread class 2) implement interface runnable

public class MyThread extends Thread{

    private final Integer time;
    private String name;

    public MyThread(String name, Integer time) {
        this.name = name;
        this.time = time;
        start(); //call the method run (localized in MyThread class)
    }

    public void run(){

        try {

            for (int i = 1; i < 6; i++) {
                System.out.println(name + "Contador: " + i);
                Thread.sleep(time);
            }
        }

        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Execution finished!");
    }
}