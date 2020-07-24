package cn.aguo.coursedesign;

import java.util.Scanner;
public class MainSystem {

    private static final String name = "石成果";
    private static final String id = "18064103**";
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        Beautify beautify = new Beautify();
        System.out.println("*******************????????????????*******************");//??????
        System.out.println("????" + id + "   ??????"+name);//??????????????
        do {
            Visualization visualization = new Visualization();//???????????
            number = sc.nextInt();
            try {//?????????????????
                if (number > 0 && number < 6) {

                if (number > 0 && number < 5)
                    visualization.arithmetic(number);
                else {
                    beautify.beautify8();
                    break;
                }
            }
            else {
                    throw new NumberException("???????????????????????");
                }
            } catch (NumberException e) {
                e.printStackTrace();
            }
        }while (true);
    }
}
