package imageSupport;

public class Stones 
{
	private String stoneName;
	private String stoneMean;

	// a default constructor
	Stones() 
	{
		stoneName = "No stone";
		stoneMean = "No Meaning";
	}

	// specified constructor
	Stones(String a, String q)
	{
		stoneName = a;
		stoneMean = q;
	}

	// construct an object from an object (copy constructor)
	Stones(Stones newQuote)
	{
		stoneName = newQuote.stoneName;
		stoneMean = newQuote.stoneMean;
	}

	// Setters and Getters
	public void setStoneName(String a)  { stoneName = a; }
	public String getStoneName()        { return stoneName; }
	public void setStoneMean(String q)  { stoneMean = q; }
	public String getStoneMean()        { return stoneMean; }

	// Equals method
	public boolean equals(Object obj) 
	{
		Stones other = (Stones) obj;
		if (!stoneName.equals(other.stoneName))
			return false;
		if (!stoneMean.equals(other.stoneMean))
			return false;
		return true;
	}

	// Copy method
	public Object copy(Object obj) 
	{
		Stones other = (Stones) obj;
		other.stoneName  = stoneName;
		other.stoneMean  = stoneMean;
		return other;
	}


}
