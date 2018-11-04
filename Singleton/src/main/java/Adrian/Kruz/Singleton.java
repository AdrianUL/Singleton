package Adrian.Kruz;

public class Singleton {

	private static Singleton Instancja;
	public static Singleton getInstance(){
        if(Instancja==null)
            Instancja = new Singleton();
        return Instancja;
	}
}
