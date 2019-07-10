package collections;

public class Words{
	private String phrase;

	public Words(String newphrase){
		this.phrase = newphrase;
	}
	public String getPhrase (){
		return phrase;
	}
	public void SetPhrase(String newphrase){
		this.phrase = newphrase;
	}
	@Override
	public String toString(){
		return "Words{" +
		phrase + "phrase" +
		 "}";
	}

}


