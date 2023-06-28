package com.example.fizz.model;

import lombok.Getter;

import java.util.stream.IntStream;
@Getter
public class TesteFizz {

    private Integer inicio;
    private Integer fim;

    public String getResultado(Integer i){
        return i % 3 == 0 ?  (i % 5 == 0 ? "FizzBuzz" : "Fizz") :  (i % 5 == 0 ? "Buzz" : i.toString());
    }

    public Integer loopImpressao(){
        for (int i = inicio; i <= fim; i++) {
            System.out.println(this.getResultado(i));
        }
        return 100;
    }

    public TesteFizz() {
    }

    public TesteFizz(Integer inicio, Integer fim) {
        this.inicio = inicio;
        this.fim = fim;
    }



//    public static void main(String[] args) {
//
//        TesteFizz teste = new TesteFizz(1,100);
//
//        teste.loopImpressao();
//
//
////        int ini = 1;
////        int end = 100;
////
////        IntStream.rangeClosed(ini, end)
////                .mapToObj(
////                        i -> teste.getResultado(i)
////                    )
////                .forEach(System.out::println);
////
////        for (int i = ini; i <= end; i++) {
////            System.out.println(teste.getResultado(i));
////        }
//    }


}


