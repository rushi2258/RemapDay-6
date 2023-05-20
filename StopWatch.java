package com.bridgelabz.assignment;

public class StopWatch {

    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started.");
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped.");
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        
        stopwatch.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();

        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }
}
