package com.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorTest {

	public static void main(String[] args) throws Exception {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2); 
									// 최대 스레드 개수가 2인 스레드풀 생성
		
		for (int i=0;i<10; i++) {
			Runnable runnable = new Runnable() {		// 작업 정의

				@Override
				public void run() {
					// 스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor = 
							(ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
					
					// 예외 발생 시킴
					int value = Integer.parseInt("삼");
				}
			};

//			executorService.execute(runnable);		// 작업 처리 요청
			executorService.submit(runnable);		// submit 메소드
			
			Thread.sleep(100);		// 콘솔에 출력 시간을 주기 위해 0.1초 일시 정지 시킴
		}
		
		executorService.shutdown(); 		// 스레드풀 종료
		
	}
}
