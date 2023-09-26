package com.initiation;

//public class Inheritance {
//    public static void main(String[] args) {
//        Base b=new Base();
//        b.setY(4);
//        System.out.println(b.getY());
//        Root r=new Root();
//        r.setX(5);
//        System.out.println(b.getX());
//    }
//}
//
//class Root{
//    int x;
//    public int getX() {
//        return x;
//    }
//    public void setX(int x){
//        this.x=x;
//    }
//    public void printThis(){
//        System.out.println("I am Groot");
//    }
//}
//class Base extends Root {
//    int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public void printThis() {
//        System.out.println("I am Iron-Man");
//    }
//}
//  public static void main(String[] args) {
//      MountainBike mb= new MountainBike(3,100,25);
//      System.out.println(mb.toString());
//  }
//}
//

// Java program to illustrate the
// concept of inheritance

    // base class
    class Bicycle {
        // the Bicycle class has two fields
        public int gear;
        public int speed;

        // the Bicycle class has one constructor
        public Bicycle(int gear, int speed)
        {
            this.gear = gear;
            this.speed = speed;
        }

        // the Bicycle class has three methods
        public int applyBrake(int decrement)
        {
            speed -= decrement;
            return decrement;
        }

        public void speedUp(int increment)
        {
            speed += increment;
        }

        // toString() method to print info of Bicycle
        public String toString()
        {
            return ("No of gears are " + gear + "\n"
                    + "speed of bicycle is " + speed);
        }
    }

    // derived class
    class MountainBike extends Bicycle {

        // the MountainBike subclass adds one more field
        public int seatHeight;

        // the MountainBike subclass has one constructor
        public MountainBike(int gear, int speed,
                            int startHeight)
        {
            // invoking base-class(Bicycle) constructor
            super(gear, speed);
            seatHeight = startHeight;
        }

        // the MountainBike subclass adds one more method
        public void setHeight(int newValue)
        {
            seatHeight = newValue;
        }

        // overriding toString() method
        // of Bicycle to print more info
        @Override public String toString()
        {
            return (super.toString() + "\nseat height is "
                    + seatHeight);
        }
    }

    // driver class
    public class Inheritance {
        public static void main(String args[])
        {

            MountainBike mb = new MountainBike(3, 100, 25);
            System.out.println(mb.toString());
        }
    }

//}