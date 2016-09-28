package design_pattern.behavioral;

class Context{
	
}
interface RegularExpression{
	public boolean validate(Context context);
}

class LiteralExpression implements RegularExpression{

	@Override
	public boolean validate(Context context) {
        		return	false;	
	}
	
}

/*class AndExpression implements RegularExpression{
	private RegularExpression expression1;
	private RegularExpression expression2;
	
	@Override
	public boolean validate(Context context) {
		return false;
	}
}*/

//Terminal
class ParanthesisExpression implements RegularExpression{
	private RegularExpression expression;
	
	@Override
	public boolean validate(Context context) {
		return false;
	}
}
	

class RepetitionExpression implements RegularExpression{
    private RegularExpression expression;
	
    @Override
	public boolean validate(Context context) {
	
		return false;
	}
	
}
 
public class InterpretterPatternDemo {

	public static void main(String[] args) {

	}

}
