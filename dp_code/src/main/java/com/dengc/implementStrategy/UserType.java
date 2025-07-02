package com.dengc.implementStrategy;

import java.util.function.IntPredicate;

/**
 * UserType
 */
public enum UserType {
    Normal(x -> x > 0 && x<10),
    SmallR(x -> x >= 10);

    private final IntPredicate support;

     UserType(IntPredicate support) {
        this.support = support;
     }

    public static UserType typeOf(int recharge){
         for(UserType value : values()){
             if(value.support.test(recharge)){
                 return value;
             }
         }
         return null;
    }

}
