public class finalizedDemo002 {
		static finalizedDemo s;
		public static void main(String args[]){
		finalizedDemo f = new finalizedDemo();
		System.out.println(f.hashCode());
		f=null; // object available for GC
		System.gc();
		Thread.sleep(5000); //main method waiting until garbage collector calls finalized method.
		System.out.println(s.hashCode());
		s=null; // object available for GC
		System.gc();
		Thread.sleep(10000);
		System.out.println("end of main");
		}
		public void Finalized(){      //garbage collector calls finalized method once.
		System.out.println("finalized method call");
		s= this;
		}
}