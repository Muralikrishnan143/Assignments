package Interface;

public class Automation extends MultipleLanguage1 implements TestTool,Language {
	
	
public void java() {
	
	System.out.println("java");
}

public void Selenium() {
	System.out.println("Selenium");
	
}

@Override
public void ruby() {
	
	System.out.println("ruby");
}
public static void main(String[] args) {
	
	Automation lan=new Automation();
	lan.ruby();
	lan.Selenium();
	lan.java();
	lan.python();
}
}