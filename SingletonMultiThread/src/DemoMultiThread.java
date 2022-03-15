
public class DemoMultiThread {
	public static void main(String[] args) {
		System.out.println("Se os valores são iguais, o singleton foi recusado!!" + "\n" +
						  "se os valores são diferentes, 2 singletons foram criados!!" + "\n\n" +
				          "RESULT: "+"\n");
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		
		threadFoo.start();
		threadBar.start();
	}
	
	static class ThreadFoo implements Runnable{
		
		public void run(){
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.value);
		}
	}
	static class ThreadBar implements Runnable{
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.value);
		}
	}
}





