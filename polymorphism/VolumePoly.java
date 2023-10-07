class VolumePoly{
void Volume(){
System.out.println("invalid parameter");
}
void Volume(int x){
System.out.println("volume of cube "+x*x);
}
void Volume(double l, int w,long h){
System.out.println("volume of rectungalar cuboid "+l*w*h);
}
void Volume(short a, byte b){
System.out.println("volume of prism"+a*b);
}
void Volume(int g,double j){
System.out.println("volume of cylinder"+3.1415*g*g*j);
}

public static void main(String args[]){
VolumePoly v=new VolumePoly();
v.Volume();
v.Volume(10);
v.Volume(12,23,25);
v.Volume(5,7);
v.Volume(2,5.5 );
}
}