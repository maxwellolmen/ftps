package com.maxwellolmen.ftps;

public class FTPS {

    public static FTPWorker[] workers = new FTPWorker[10];

    

    public static void main(String[] args) {
        ServerSocket socket = new ServerSocket(20);

        for (int i = 0; i < 10; i++) {
            workers[i] = new FTPWorker();
            workers[i].start();
        }
    }
}