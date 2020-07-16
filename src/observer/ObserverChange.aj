package observer;

import java.util.Arrays;

public aspect ObserverChange {
    
    pointcut methodCall(): call (* changeB*(..));
    
    before(): methodCall(){
    	System.out.println("Desde que jointPoint: "+thisJoinPoint);
    	System.out.println("Cambio el color a: "+Arrays.toString(thisJoinPoint.getArgs()));
    	System.out.println();
    }
    

    
    
    
	
}
