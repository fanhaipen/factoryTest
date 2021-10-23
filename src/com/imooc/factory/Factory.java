package com.imooc.factory;

import com.imooc.entity.GreenApple;
import com.imooc.entity.RedApple;
import com.imooc.interfac.Apple;

public class Factory {

   public  static Apple GetApple (String corlor){
       if(corlor.equals("Green")){
           return new GreenApple();
       }else if(corlor.equals("Red")){
           return new RedApple();
       }else{
           return null;
       }
   }


}
