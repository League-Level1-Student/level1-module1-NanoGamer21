
public class Runner {
public static void main(String[] args) {
	Smurf handysmurf=new Smurf("Handy");
	Smurf Papasmurf=new Smurf("Papa");
	Smurf smurfette=new Smurf("Smurfette");
	handysmurf.eat();
	System.out.println(handysmurf.getName());
	
	System.out.println(Papasmurf.getName());
	System.out.println(Papasmurf.isGirlOrBoy());
	System.out.println(Papasmurf.getHatColor());

	System.out.println(smurfette.getName());
	System.out.println(smurfette.isGirlOrBoy());
	System.out.println(smurfette.getHatColor());
}
}
