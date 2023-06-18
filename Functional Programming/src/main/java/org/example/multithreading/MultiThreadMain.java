package org.example.multithreading;

public class MultiThreadMain {

    public static void main(String[] args) {
        boolean multiTrheadLoop = true;

        MultithreadThingExtends myThing = new MultithreadThingExtends(1);
        MultithreadThingImplements myThing2 = new MultithreadThingImplements(2);
        //We need to call the Start method as it kicks off the MultiThreads
        myThing.start();
        //In case we are using the implementation method, we need to do this extra step in order to run the Threads.
        //as it no longer has the method ".start"
        Thread myThread = new Thread(myThing2);
        myThread.start();
        //Condition written for illustratory purposes and to execute the different examples
        if (multiTrheadLoop) {
            for (int i = 3; i <= 8; i++) {
                MultithreadThingExtends myThingLoop = new MultithreadThingExtends(i);
                myThingLoop.start();
            }

        }

    }
}
