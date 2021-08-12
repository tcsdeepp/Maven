package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Log levels : T- trace, D-debug, I-Info, W- warning F-Fatal
public class LoggingDemo {
	private static Logger Logger = LogManager.getLogger(LoggingDemo.class);

	public static void main(String[] args) {
		// System.out.println("")//never ever use this.
		Logger.fatal("Fatal message"); // stackoverflow error.
		Logger.error("error message"); // exceptions which are recoverable.
		Logger.warn("Warning messge");
		Logger.info("Information message");
		Logger.debug("This is a debug message");
		Logger.trace("Trace message");

	}
}
