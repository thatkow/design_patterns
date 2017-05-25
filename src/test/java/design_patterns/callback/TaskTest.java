package design_patterns.callback;

import static org.junit.Assert.*;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

import org.junit.Test;

public class TaskTest {

	@Test
	public void test() throws Exception {
		Callable<Void> report2Manager = new  Callable<Void>() {

			@Override
			public Void call() throws Exception {
				System.err.println("I am done manager!");
				return null;
			}
		};

		Task task = new Task();
		task.executeAndReport(report2Manager);
	}

}
