package ru.netology;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add (int a, int b){
        return a + b;
    }

    public int calculationCost(int dohod, int rashod){
        int nalog = (dohod - rashod) * 15 / 100;
        if (nalog >= 0){
            return nalog;
        }else{
            return 0;
        }
    }
    public int calculationCost2(int dohod, int rashod){
        int nalog2 = dohod * 6 / 100;
        if (nalog2 >= 0){
            return nalog2;
        }else{
            return 0;
        }
    }

    public boolean createFile(String nameFirst, String nameSecond ){
        List<String> listDir = Arrays.asList(nameFirst, nameSecond);
        StringBuilder sb = new StringBuilder();
        boolean createOrNot = false;
        for (String d : listDir) {
            File newDir = new File(d);
            createOrNot = newDir.mkdir();
            sb.append("Create:" + newDir.mkdir() + "Name:" + newDir.getName());
        }
        return createOrNot;
    }





}
