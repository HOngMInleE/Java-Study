package com.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorTest {

	public static void main(String[] args) throws Exception {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2); 
									// �ִ� ������ ������ 2�� ������Ǯ ����
		
		for (int i=0;i<10; i++) {
			Runnable runnable = new Runnable() {		// �۾� ����

				@Override
				public void run() {
					// ������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor = 
							(ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: " + poolSize + "] �۾� ������ �̸�: " + threadName);
					
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
			};

//			executorService.execute(runnable);		// �۾� ó�� ��û
			executorService.submit(runnable);		// submit �޼ҵ�
			
			Thread.sleep(100);		// �ֿܼ� ��� �ð��� �ֱ� ���� 0.1�� �Ͻ� ���� ��Ŵ
		}
		
		executorService.shutdown(); 		// ������Ǯ ����
		
	}
}
