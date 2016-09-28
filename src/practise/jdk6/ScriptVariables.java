package practise.jdk6;

import java.util.Calendar;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptVariables {

	public static void main(String[] args) throws ScriptException {
	ScriptEngineManager manager = new ScriptEngineManager();
	ScriptEngine engine = manager.getEngineByName("JavaScript");
	 Calendar rightNow = Calendar.getInstance();
	 engine.put("rightNow", rightNow);
	engine.eval("print(rightNow.getCalendarType())");
	}

}
