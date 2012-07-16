package dee.com.example.osgi.consumer;



import dee.com.example.osgi.Calculator;

public class CalculatorConsumer {

	private Calculator calcService;
	
	public void activate(){
		System.out.println("I'm here");
	}
	
	public synchronized void onBind(Calculator calcService) {
		System.out.println("Now we are in consumer service");
		
        this.calcService = calcService;
		calcService.add();
		calcService.sub();
		calcService.mul();
		calcService.div();		
				
	}
	
	public synchronized void onUnbind(Calculator calcService) {
		
		if (this.calcService == calcService) {
			this.calcService = null;
		}
	}
	
	
	
	
	
}
