public class Prog1{
    public static void main(String[] args){
        Box b1 = new Box();
        b1.setdata(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        System.out.println("Length of Box : "+b1.length);
        System.out.println("Breadth of Box : "+b1.breadth);
        System.out.println("Height of Box : "+b1.height);
        System.out.println("Volume of Box : "+b1.volume());

        Box rectangle = new Box();
        rectangle.setdata(Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]));
        Box cube = new Box();
        cube.setdata(Integer.parseInt(args[6]),Integer.parseInt(args[7]),Integer.parseInt(args[8]));
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

    void setdata(int l,int b,int h){
        length = l;
        breadth = b;
        height = h;
    }

    int volume(){
        return length*breadth*height;
    }

}


/* OUTPUT 
 * 
 * PS D:\Study Materials\Semester 5\OOPs\Lab_2> javac Prog1.java
PS D:\Study Materials\Semester 5\OOPs\Lab_2> java Prog1 3 4 5 5 6 4 7 7 7
Length of Box : 3
Breadth of Box : 4
Height of Box : 5
Volume of Box : 60
Volume of Rectangle is : 120
Volume of Cube is : 343
The Cube is bigger

 */