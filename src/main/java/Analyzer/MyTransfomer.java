package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransfomer implements IAnnotationTransformer{
	public void transformer(ITestAnnotation annotation, Class testClass, Constructor testConstructer, Method testMethod)
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
