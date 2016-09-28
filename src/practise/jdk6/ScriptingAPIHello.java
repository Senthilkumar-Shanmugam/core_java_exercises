package practise.jdk6;
import javax.script.*;
public class ScriptingAPIHello {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine= factory.getEngineByName("JavaScript");
		engine.eval("print('Hello,World')");

	}

}
