package design_patterns.callback;

import java.util.concurrent.Callable;

public class Task {

	Thread thread;
	public void executeAndReport(Callable<Void> callWhenDone) throws Exception{

		try {
			Thread.sleep(2000);
			callWhenDone.call();
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}
