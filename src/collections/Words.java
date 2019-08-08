package collections;

public class Words{
	private String phrase;
	private String[] array;
	private String clean;

	public Words(String phrase){

		this.phrase = phrase;
		this.phrase = this.phrase.toUpperCase();
		this.phrase = this.phrase.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
		this.array = this.phrase.split(" +");

		
	}

	public String getPhrase(){
		return phrase;
	}

	public String[] getArray (){
		// String[] arrays = this.array 
		return array;
	}



}


