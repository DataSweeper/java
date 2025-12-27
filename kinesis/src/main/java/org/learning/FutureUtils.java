
package org.learning;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureUtils {

	public static <T> T resolveOrCancelFuture(Future<T> future, Duration timeout)
			throws ExecutionException, InterruptedException, TimeoutException {
		try {
			return future.get(timeout.toMillis(), TimeUnit.MILLISECONDS);
		} catch (TimeoutException te) {
			future.cancel(true);
			throw te;
		}
	}

}
