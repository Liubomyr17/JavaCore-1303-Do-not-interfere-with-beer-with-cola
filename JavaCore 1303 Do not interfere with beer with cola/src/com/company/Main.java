package com.company;

/*

1303 Do not interfere with beer with cola
Implement the Drink interface in Beer and Cola classes.
Requirements:
1. The Beer class must implement (implements) the Drink interface.
2. The Cola class must implement (implements) the Drink interface.
3. In the Beer class, all methods of the Drink interface must be implemented.
4. In the Cola class, all Drink interface methods must be implemented.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {

        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink {
        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }


    public static class Cola implements Drink {
        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }
}



