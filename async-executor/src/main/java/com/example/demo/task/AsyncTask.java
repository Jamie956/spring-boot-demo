package com.example.demo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

@Component
public class AsyncTask {
	public static Random random = new Random();

	@Async("mySimpleAsync")
	public Future<String> doTaskOne() throws Exception {
		System.out.println("begin task 1");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("finished task 1, spend time -> " + (end - start) + "ms");
		return new AsyncResult<>("finished task 1");
	}

	@Async("myAsync")
	public Future<String> doTaskTwo() throws Exception {
		System.out.println("begin task 2");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("finished task 2, spend time -> " + (end - start) + "ms");
		return new AsyncResult<>("finished task 2");
	}

	@Async("myAsync")
	public Future<String> doTaskThree() throws Exception {
		System.out.println("begin task 3");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("finished task 3, spend time -> " + (end - start) + "ms");
		return new AsyncResult<>("finished task 3");
	}
}
