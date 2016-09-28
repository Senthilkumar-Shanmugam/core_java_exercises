package practise.jdk6;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class InvokeSCriptFunction {

	public static void main(String[] args) throws ScriptException, NoSuchMethodException {
		 ScriptEngineManager manager = new ScriptEngineManager();
	        ScriptEngine engine = manager.getEngineByName("JavaScript");

	        // JavaScript code in a String
	        String script = "function hello(name) { print('Hello, ' + name); }";
	        // evaluate script
	        engine.eval(script);
	        Invocable inv = (Invocable) engine;
	        inv.invokeFunction("hello", "senthil");

	}

}
