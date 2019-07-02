package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) { 
		String output= "";
		
		for(int i=0;i<s.length();i++) {
			if(i%2==1) {
				output+=s.toUpperCase().charAt(i);
			}
			else {
				output+=s.toLowerCase().charAt(i);
			}
		}
		return output;
	}

}
