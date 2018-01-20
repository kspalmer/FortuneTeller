package imageSupport;

public class Quotes 
{
	private String quoteAuthor;
	private String quote;

	// a default constructor
	Quotes() 
	{
		quoteAuthor = "No Author Yet";
		quote       = "To Be or not To Be";
	}

	// specified constructor
	Quotes(String a, String q)
	{
		quoteAuthor = a;
		quote       = q;
	}

	// construct an object from an object (copy constructor)
	Quotes(Quotes newQuote)
	{
		quoteAuthor = newQuote.quoteAuthor;
		quote       = newQuote.quote;
	}

	// Setters and Getters
	public void setQuoteAuthor(String a)  { quoteAuthor = a; }
	public String getQuoteAuthor()        { return quoteAuthor; }
	public void setQuote(String q)        { quote = q; }
	public String getQuote()                 { return quote; }

	// Equals method
	public boolean equals(Object obj) 
	{
		Quotes other = (Quotes) obj;
		if (!quoteAuthor.equals(other.quoteAuthor))
			return false;
		if (!quote.equals(other.quote))
			return false;
		return true;
	}

	// Copy method
	public Object copy(Object obj) 
	{
		Quotes other = (Quotes) obj;
		other.quoteAuthor  = quoteAuthor;
		other.quote        = quote;
		return other;
	}


}
