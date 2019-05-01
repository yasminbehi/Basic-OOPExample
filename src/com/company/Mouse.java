package com.company;

public class Mouse extends Animal {
    public Mouse (){
        super();
        System.out.println("Now I am a Mouse");

    }

    @Override
      public String sleep() {

    return " A Mouse sleeps?";

}

    @Override
      public String eat(){

    return "A mouse eats";
  }

      public String rodent(){

    return " A mouse is a rodent";
  }
}
