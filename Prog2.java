public class Prog2{
    public static void main(String[] args){
        Box b1 = new Box();
        Box rectangle = new Box(5,6,4);
        Box cube = new Box(7,7,7);
        System.out.println("Volume of Rectangle is : "+rectangle.volume());
        System.out.println("Volume of Cube is : "+cube.volume());
        if(cube.volume()>rectangle.volume()){
            System.out.println("The Cube is bigger");
        }else if(cube.volume() < rectangle.volume()){
            System.out.println("The Rectangle is bigger");
        }else{
            System.out.println("Both Cube and Rectangle have equal volume");
        }

    }
}

class Box{
    int length;
    int breadth;
    int height;

    Box(){

    }

    Box(int length,int breadth,int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    int volume(){
        return length*breadth*height;
    }

}

/* OUTPUT 
 * 
 * Volume of Rectangle is : 120
   Volume of Cube is : 343
   The Cube is bigger

 */