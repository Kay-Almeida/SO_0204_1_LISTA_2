package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread {
	
	    private String direcao;
	    private Semaphore semaforo;

	    public ThreadCarro(String direcao, Semaphore semaforo) {
	        this.direcao = direcao;
	        this.semaforo = semaforo;
	    }

	    
	    public void run() {
	        try {
	            semaforo.acquire();
	            System.out.println("Carro indo de " + direcao);
	            sleep(1000); 
	            System.out.println("Carro passou de " + direcao);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            semaforo.release();
	        }
	    }
	}


