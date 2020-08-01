package cn.aguo.coursedesign;

import java.text.NumberFormat;
import java.util.*;
/*
 * 18级计科三班石成果
 * 项目：数学计算能力训练系统-减法训练模块
 * */
public class SubtractionTraining implements Arithmetic {
    @Override
    public void arithmetic() {//重写Arithmetic内的arithmetic抽象方法
        Random ra = new Random();//创建Random对象，用来获取随机数
        Beautify beautify = new Beautify();//界面美化
        Scanner sc = new Scanner(System.in);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();//百分率
        int a, b, c; //a和b都是参与运算的数字，c是用户输入的结果
        float len = 0, len2 = 0;//len是对做过的题目进行统计,len2是对正确的题目进行统计
        beautify.beautify4();
        ArrayList<Integer> arrayList = new ArrayList<>();//此集合用来记录每次计算的数据
        ArrayList<Integer> arrayList1 = new ArrayList<>();//此集合用来记录每次计算的数据
        long startTime = System.currentTimeMillis(); //获取开始时间
        do {
            a = ra.nextInt(49) + 1;//获取1-50之间随机数
            b = ra.nextInt(49) + 1;//获取1-50之间随机数
            if (a >= b) {//控制减法结果不为负数
                System.out.println(a + " - " + b + " = ");
                System.out.print("请输入此题结果(输入“-1”退出当前训练)：");
                c = sc.nextInt();
                if (c == -1) {
                    beautify.beautify3();
                    percentInstance.setMaximumFractionDigits(2);//百分比保留两位小数
                    String format = percentInstance.format(len2/len);//求出百分率
                    System.out.println("本次答题正确率为：" +format);
                    System.out.println("所做题目以及正确答案为：");
                    int d = 0;
                    for (Integer integer : arrayList) {
                        System.out.println(integer +" - "+ arrayList1.get(d) +" = "+(integer - arrayList1.get(d)));
                        d++;
                    }
                    break;
                } else if (c == a - b) {//此处判断用户答案是否正确
                    len2++;
                    len++;
                    arrayList.add(a);
                    arrayList1.add(b);//存入集合
                    beautify.beautify1();
                    System.out.println();
                } else {//表示用户输入答案错误
                    len++;
                    arrayList.add(a);
                    arrayList1.add(b);//存入集合
                    beautify.beautify2();
                    System.out.println("正确结果为:" +(a-b));
                    System.out.println();
                }
            }
        }while (true);
        long endTime = System.currentTimeMillis();//获取结束时间
        System.out.println("本次训练所用时间：" + (endTime - startTime)/1000+ "s");//输出此次训练执行时间
    }

}
