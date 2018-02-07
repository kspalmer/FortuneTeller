package imageSupport;

/**
 * The Runes class
 * Instance made up of two String fields: runeName and runeMean
 * @author Karen Palmer
 *
 */
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

	/**
	 * Updater method
	 * @param a - String input with the Rune Name
	 */
	public void setRuneName(String a)   { runeName  = a; }

	/**
	 * Accessor method
	 * @return - String of the Rune Name
	 */
	public String getRuneName()         { return runeName; }

	/**
	 * Updater method
	 * @param q - String input with the Rune Meaning
	 */
	public void setRuneMean(String q)   { runeMean  = q; }

	/**
	 * Accessor method
	 * @return - String of the Rune Meaning
	 */
	public String getRuneMean()         { return runeMean; }

	/**
	 * Compares two Runes objects
	 * @param obj - Runes object input
	 * @return - boolean - true if objects match, false if objects do not match
	 */
	public boolean equals(Object obj) 
	{
		Runes other = (Runes) obj;
		if (!runeName.equals(other.runeName))
			return false;
		if (!runeMean.equals(other.runeMean))
			return false;
		return true;
	}

	/**
	 * Create a deep copy of a Runes object
	 * @param obj - a Runes object
	 * @return - a copy of the Runes object
	 */
	public Object copy(Object obj) 
	{
		Runes other = (Runes) obj;
		other.runeName  = runeName;
		other.runeMean  = runeMean;
		return other;
	}

}
