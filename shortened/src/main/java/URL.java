

public class URL {
	
	private String shortString ;
	private String origiString ;
	private int visits = 0 ;
	private int shortenedCounter = 0 ;
	
	public int getShortenedCounter() {
		return shortenedCounter;
	}
	public void setShortenedCounter(int newshortened) {
		this.shortenedCounter = shortenedCounter+newshortened;
	}
	public int getVisits() {
		return visits;
	}
	public void setVisits(int newVisit) {
		this.visits = visits+newVisit;
	}
	public String getShortString() {
		return shortString;
	}
	public void setShortString(String shortString) {
		this.shortString = shortString;
	}
	public String getOrigiString() {
		return origiString;
	}
	public void setOrigiString(String origiString) {
		this.origiString = origiString;
	}
	
	

}
