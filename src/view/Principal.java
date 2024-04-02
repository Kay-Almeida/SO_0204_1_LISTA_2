package view;

import java.util.concurrent.Semaphore;
import controller.ThreadCarro;

public class Principal {
	
	    public static void main(String[] args) {
	        Semaphore semaforo = new Semaphore(1);

	        ThreadCarro norte = new ThreadCarro("norte para sul", semaforo);
	        ThreadCarro sul = new ThreadCarro("sul para norte", semaforo);
	        ThreadCarro leste = new ThreadCarro("leste para oeste", semaforo);
	        ThreadCarro oeste = new ThreadCarro("oeste para leste", semaforo);

	        norte.start();
	        sul.start();
	        leste.start();
	        oeste.start();
	    }
	}


