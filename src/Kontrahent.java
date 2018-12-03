
// klasa opisuj�ca kontrahenta
// dane wystawczaj� do wystawienia faktury
// dla innych cel�w nale�a�oby t� klas� rozbudowa�
public class Kontrahent {
	String dane;
	String NIP;
	
	public Kontrahent(String dane, String NIP){
		this.dane = dane;
		this.NIP = NIP;
	}
	
	@Override
	public String toString(){
		return dane +"\n" + "NIP: "+ NIP;
	}

}
