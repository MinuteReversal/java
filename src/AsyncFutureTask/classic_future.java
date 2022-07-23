package AsyncFutureTask;

import java.util.concurrent.CompletableFuture;

class ClassicFuture {
	public static CompletableFuture<Void> fn1() throws InterruptedException {
		final CompletableFuture<Void> completebleFuture = new CompletableFuture<Void>();
		System.out.println("fn1");
		Thread.sleep(1000);

		completebleFuture.complete(null);

		return completebleFuture;
	}

	public static CompletableFuture<Void> fn2(Integer x) throws InterruptedException {
		final CompletableFuture<Void> completebleFuture = new CompletableFuture<Void>();
		System.out.println(String.format("fn%d", x));
		Thread.sleep(1000);

		completebleFuture.complete(null);

		return completebleFuture;
	}

	public static CompletableFuture<Integer> fn3() throws InterruptedException {
		final CompletableFuture<Integer> completebleFuture = new CompletableFuture<Integer>();
		System.out.println(String.format("fn3"));
		Thread.sleep(1000);

		completebleFuture.complete(3);

		return completebleFuture;
	}

	public static CompletableFuture<Integer> fn4(Integer x) throws InterruptedException {
		final CompletableFuture<Integer> completebleFuture = new CompletableFuture<Integer>();
		System.out.println(String.format("fn%d", x));
		Thread.sleep(1000);

		completebleFuture.complete(x);

		return completebleFuture;
	}

	public static CompletableFuture<Void> fn5() throws InterruptedException, Exception {
		final CompletableFuture<Void> completebleFuture = new CompletableFuture<Void>();
		System.out.println(String.format("fn5"));
		Thread.sleep(1000);

		completebleFuture.completeExceptionally(new Error("test"));

		return completebleFuture;
	}

	public static void main(String[] args) {
		Integer r1 = 0;
		Integer r2 = 0;
		try {
			fn1().join();
			fn2(2).join();
			r1 = fn3().get();
			r2 = fn4(4).get();
			fn5().join();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("complete");
		}

		System.out.println(r1);
		System.out.println(r2);
	}
}
