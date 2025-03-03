package main;

class Main {
    
	static int i = 1;
	public static void main(String[] args) {
		new Thread(t1).start();
		new Thread(t2).start();

	}
    
	 private static void contador(String name) {
		 i++;
		 System.out.println("O valor do contador é:" + i + ", thread: " + name);
	 }
	 
	 private static Runnable t1 = new Runnable() {
		 public void run(){
			 try{
				for(int i = 0; i < 5; i++){
					contador("t1");
				} 
			 }catch (Exception e){}
		 }
	 };
	 private static Runnable t2 = new Runnable() {
		 public void run(){
			 try{
				for(int i = 0; i < 5; i++){
					contador("t2");
				} 
			 }catch (Exception e){}
		 }
	 };
}
