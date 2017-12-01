package com.aac.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class ArroundAspect {
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		System.out.print(" entered in to " + methodName + " ( ");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		/*
		 * args[0] = (Integer) args[0] + 1; args[1] = (Integer) args[1] + 1;
		 * System.out.println(")");
		 */
		Object res = pjp.proceed();
		System.out
				.println(" existing from " + methodName + "(" + args[0] + "," + args[1] + "," + args[3] + ") : " + res);
		int sum = (Integer) res + 1;
		System.out.println(" " + sum);
		return sum;
	}








}
