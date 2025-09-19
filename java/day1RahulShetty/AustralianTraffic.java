package day1RahulShetty;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		
		
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
		
		AustralianTraffic at = new AustralianTraffic();
		at.walkonsymbol();
		
		ContinentalTraffic ct = new AustralianTraffic();
		ct.TrainSymbol();
		
	}

	@Override
	public void greenGo() {
		
		
		System.out.println("grrenGo implementation");
	}

	@Override
	public void redStop() {
		
		System.out.println("redstop implementation");
		
	}
    
	public void walkonsymbol() {
		
	    System.out.println("walking");
	}
	
	@Override
	public void flashYellow() {
	
		System.out.println("flash yellow implementation");
		
	}

	@Override
	public void TrainSymbol() {
	
		System.out.println("Train");
		
	}

}
