class  Frequen
{
	public static void main(String[] args)
	{
		String input="welcome to java programming";
		char mostFreqChar=findMostFreqChar(input);
		System.out.println("freqently occuring"+mostFreqChar);
	}
	public static  findMostFreqChar(String str)
	{
		int [] frequency=new int[287];
		for(int i=0;i<str.length();i++)
		{
			 frequency[str.charAt(i)]++ ;
		}
		char mostFreqChar='';
		int maxFreq=0;
		for(int i=0;i<str.length();i++)
		{
			if( frequency[str.charAt(i)]>maxFreq)
			{
				maxFreq= frequency[str.charAt(i)];
				mostFreqChar=str.charAt(i);
			}
		}
		
	}
}