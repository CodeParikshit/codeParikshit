public class finalizedDemo01 {
		static finalizedDemo s;
		public static void main(String args[]){
		finalizedDemo f = new finalizedDemo();
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		System.out.println(s.hashCode());
		s=null;
		System.out.println("end of main");
		}
		public void Finalized(){
		System.out.println("finalized method call");
		s= this;
		}
