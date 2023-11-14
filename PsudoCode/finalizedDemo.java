Class finalizedDemo{
Static finalizedDemo s;
public static void main(String args[]){
finalizedDemo f = new finalizedDemo();
System.out.println(f.hashcode());
f=null;
System.gc();
System.out.println(s.hashcode());
s=null;
System.out.println("end of main");
}
public void Finalized(){
System.out.println("finalized method call");
s= this;
}
}


