package imageSupport;

public class Runes 
{
	private String runeName;
	private String runeMean;

	// a default constructor
	Runes() 
	{
		runeName  = "No Rune";
		runeMean  = "No Meaning";
	}

	// specified constructor
	Runes(String a, String q)
	{
		runeName  = a;
		runeMean  = q;
	}

	// construct an object from an object (copy constructor)
	Runes(Runes newRune)
	{
		runeName  = newRune.runeName;
		runeMean  = newRune.runeMean;
	}

	// Setters and Getters
	public void setRuneName(String a)   { runeName  = a; }
	public String getRuneName()         { return runeName; }
	public void setRuneMean(String q)   { runeMean  = q; }
	public String getRuneMean()         { return runeMean; }

	// Equals method
	public boolean equals(Object obj) 
	{
		Runes other = (Runes) obj;
		if (!runeName.equals(other.runeName))
			return false;
		if (!runeMean.equals(other.runeMean))
			return false;
		return true;
	}

	// Copy method
	public Object copy(Object obj) 
	{
		Runes other = (Runes) obj;
		other.runeName  = runeName;
		other.runeMean  = runeMean;
		return other;
	}


}
