package reusableModels;


public class FusResultWrapper {

	char c;
	
	public FusResultWrapper (char ch){
		this.c = ch;
	}
	
	@Override
	public String toString(){
		if (c == 'U')
			return "<html><font color=\"#347C17\">UP<html>";
		if (c == 'D')
			return "<html><font color=\"#FF0000\">DOWN<html>";
		if (c == 'N')
			return "-";
		if (c == '-')
			return "No data";
		return super.toString();
	}
	
	public char getResult(){
		return this.c;
	}
		
}
