class Test {
    int x, y, z;

    public data(){
    System.out.println("inside the zero parameter");
    }

    public data(int x){
    this.data();
    System.out.println("inside 1 parameter");
    }

    public data(int x, int y){
    this.data(x);
    System.out.println("inside 2 parameter");
    }

    public data(int x , int y, int z){
    this.data(x,y);
    System.out.println("inside 3 parameter");
    }
}