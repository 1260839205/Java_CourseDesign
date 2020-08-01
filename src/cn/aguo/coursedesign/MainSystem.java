package cn.aguo.coursedesign;

import java.util.Scanner;
public class MainSystem {
    /*
    * 18级计科三班石成果
    * 项目：数学计算能力训练系统
    * */
    private static final String name = "石成果";
    private static final String id = "1806410***";
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        Beautify beautify = new Beautify();
        System.out.println("*******************数学计算能力训练系统*******************");//系统名称
        System.out.println("学号：" + id + "   姓名："+name);//作者学号以及姓名
        do {
            Visualization visualization = new Visualization();//创建选项窗口类
            number = sc.nextInt();
            try {//处理序号不在范围内异常
                if (number > 0 && number < 6) {

                if (number < 5)
                    visualization.arithmetic(number);
                else {
                    beautify.beautify8();
                    break;
                }
            }
            else {
                    throw new NumberException("选项序号错误请重新输入！！！");
                }
            } catch (NumberException e) {
                e.printStackTrace();
            }
        }while (true);
    }
}
