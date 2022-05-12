package ru.netology;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;


public class AppTest {


    @Test
    public void calculationCost(){
        App app = new App();
        int a = 5000, b = 2000, extend = 450;
        int realExtend = app.calculationCost(a,b);
        Assertions.assertEquals(realExtend, extend);
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 10000, 50000})
    public void calculationCost2(int a){
        App app = new App();
        int b = 500;
        int extend;
        if (a == 2000){
            extend = 120;
        } else if (a == 10000){
            extend = 600;
        }else {
            extend = 3000;
        }

        int realExtend = app.calculationCost2(a,b);
        Assertions.assertEquals(realExtend,extend);

    }


    @Test
    public void testCreateFile(){
        App app = new App();
        Assertions.assertTrue(app.createFile("testFile", "testFileTwo"));
    }


//    @ParameterizedTest
//    @MethodSource("methodSource")
//    public void testApp(int a, int b) {
//        App app = new App();
//        int extend = 300;
//        int realExtend = app.add(a,b);
//        Assertions.assertEquals(realExtend,extend);
//    }
//
//
//    static Stream<Arguments> methodSource(){
//        return Stream.of(
//                Arguments.of(100),
//                Arguments.of(200)
//
//        );
//    }



}
