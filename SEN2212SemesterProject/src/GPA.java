
public class GPA {

	private double value;
	private String letter;
	public GPA(double value){
		this.value=value;
	}
	public GPA() {

	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}

	@Override
	public String toString() {

		return value+"";
	}
	public String valueLet(double value){
		if(value==4.0){
			letter="A";
			return letter;	
		}
		else if(value<4.0 && value>=3.0){
			letter="B";
			return letter;
		}
		else if(value<3.0 &&value>=2.0){
			letter="C";
			return letter;
		}
		else if(value<2.0&&value>=1.0){
			letter="D";
			return letter;
		}
		else if(value<1.0&&value>0){
			letter="F";
			return letter;
		}
		else{
			letter="GPA CANT BE THAT NUMBER";
			return letter;
		}

	}

}
