package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int quantia=0,quoc,r,s5=0,s3=0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Introduza quantia igual ou superior a 8:");
        quantia =leitor.nextInt();
        if(quantia >=8){
            quoc= quantia/5;
            r=quantia % 5;
            switch (r){
                case 0:
                    s5=quoc;s3=0;
                    break;
                case 1:
                    s5=quoc-1;s3=2;
                    break;
                case 2:
                    s5=quoc-2;s3=4;
                    break;
                case 3:
                    s5=quoc;s3=1;
                    break;
                case 4:
                    s5=quoc-1;s3=3;
                    break;
              /*  default:
                    break;*/
            }
            System.out.println(String.format("Selos Cinco:%d Selos de Três:%d",s5,s3));
        }else{
            System.out.println("quantia inválida");

        }
    }
}
