package imageSupport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SetUpArrays {

	/**
	 * This will set up the three arrays for use by Karen Palmer's Fortune Teller App
	 * This class reads seven text files and creates three arrays of 25 entries each
	 * Stones array - String - name of stone  String - what does it mean? 
	 * Runes  array - String - name of rune   String - what does it mean?
	 * Quotes array - String - who said it?   String - what did s/he say??
	 */
	Stones[] stonesInfo;
	Runes[]  runesInfo;
	Quotes[] quotesInfo;
	
	public SetUpArrays()
	{
		this.setUpArrays();
		System.out.println("In the setUpArrays class.  1");
	}

	public void setUpArrays()
	
	{
		System.out.println("In the setUpArrays class.  2");
		// We will populate all three arrays by using ten input files - 	
		//   this logic will populate the stones array
		int stoneEntries = 0;
		
		// Set up the stones array
		stonesInfo = new Stones[25];
		System.out.println("size of the stones info array is " + stonesInfo.length);
		for (int i = 0; i<25; i++)   stonesInfo[i] = new Stones();
		
		//   Set up to read the stone names and meanings file 
		String file1Name = "stonenames.txt";
		Scanner input1Stream = null;
		String file2Name = "stonemeans.txt";
		Scanner input2Stream = null;
		
		try
		{
			input1Stream = new Scanner(new File(file1Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file1Name);
			System.exit(0);
		}
		try
		{
			input2Stream = new Scanner(new File(file2Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file2Name);
			System.exit(0);
		}
		
		// Now that the files are valid and open, let's populate the array
		while (input1Stream.hasNextLine())
		{
			String line1 = input1Stream.nextLine();
			String line2 = input2Stream.nextLine();
			stonesInfo[stoneEntries].setStoneName(line1); 
			stonesInfo[stoneEntries].setStoneMean(line2);
			stoneEntries++;
		}
		// Let's now close the files
		input1Stream.close();
		input2Stream.close();
		
		//   this logic will populate the runes array
		int runeEntries = 0;
		
		// Set up the stones array
		runesInfo = new Runes[25];
		for (int i = 0; i<25; i++)   runesInfo[i] = new Runes();
		
		//   Set up to read the stone names and meanings file 
		String file3Name = "runenames.txt";
		Scanner input3Stream = null;
		String file4Name = "runemeans.txt";
		Scanner input4Stream = null;
		
		try
		{
			input3Stream = new Scanner(new File(file3Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file3Name);
			System.exit(0);
		}
		try
		{
			input4Stream = new Scanner(new File(file4Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file4Name);
			System.exit(0);
		}
		
		// Now that the files are valid and open, let's populate the array
		while (input3Stream.hasNextLine())
		{
			String line3  = input3Stream.nextLine();
			String line4  = input4Stream.nextLine();
			runesInfo[runeEntries].setRuneName(line3); 
			runesInfo[runeEntries].setRuneMean(line4);
			runeEntries++;
		}
		// Let's now close the files
		input3Stream.close();
		input4Stream.close();
		
		//   this logic will populate the quotes array
		int quoteEntries = 0;
		
		// Set up the quotes array
		quotesInfo = new Quotes[25];
		for (int i = 0; i<25; i++)   quotesInfo[i] = new Quotes();
		
		//   Set up to read the stone names and meanings file 
		String file5Name = "quoteauthors.txt";
		Scanner input5Stream = null;
		String file6Name = "quotes.txt";
		Scanner input6Stream = null;
		
		try
		{
			input5Stream = new Scanner(new File(file5Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file5Name);
			System.exit(0);
		}
		try
		{
			input6Stream = new Scanner(new File(file6Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file6Name);
			System.exit(0);
		}
		
		// Now that the files are valid and open, let's populate the array
		while (input5Stream.hasNextLine())
		{
			String line5 = input5Stream.nextLine();
			String line6 = input6Stream.nextLine();
			quotesInfo[quoteEntries].setQuoteAuthor(line5); 
			quotesInfo[quoteEntries].setQuote(line6);
			quoteEntries++;
		}
		// Let's now close the files
		input5Stream.close();
		input6Stream.close();
		
	}
	
	public Stones getStonesInfo(int i)
	{
		return stonesInfo[i];
	}
	
	public Runes getRunesInfo(int i)
	{
		return runesInfo[i];
	}
	
	public Quotes getQuotesInfo(int i)
	{
		return quotesInfo[i];
	}

}
