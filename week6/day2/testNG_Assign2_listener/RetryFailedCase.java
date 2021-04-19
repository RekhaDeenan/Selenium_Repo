package week5.day2.assignment;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedCase implements IRetryAnalyzer {
int maxRetry=3;
int retryCount=0;

	public boolean retry(ITestResult result) {
if(!result.isSuccess() && retryCount<maxRetry) {
	retryCount++;
		return true;
	}
return false;
	}
}
