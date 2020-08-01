package cn.aguo.coursedesign;

public class Visualization {
    /*
     * 18级计科三班石成果
     * 项目：数学计算能力训练系统-选项菜单
     * */
    public Visualization() {
        System.out.println();
        System.out.println("***************************");
        System.out.println("* 【1】加法训练           *");
        System.out.println("* 【2】减法训练           *");
        System.out.println("* 【3】乘法训练           *");
        System.out.println("* 【4】除法训练           *");
        System.out.println("* 【5】退出本系统         *");
        System.out.println("***************************");
        System.out.print("输入选项的序号：");
    }

    //通过用户输入的序号选项调用相应的模块
    public void arithmetic(int a) {
        if (a == 1){
            Arithmetic addition = new AdditionTraining();//此处是多态创建对象
            addition.arithmetic();//加法运算
        }
        else if (a == 2){
            Arithmetic subtraction = new SubtractionTraining();//此处是多态创建对象
            subtraction.arithmetic();//减法运算
        }
        else if (a == 3 ){
            Arithmetic multiplication = new MultiplicationTraining();//此处是多态创建对象
            multiplication.arithmetic();//乘法运算
        }
        else if (a == 4) {
            Arithmetic division = new DivisionTraining();//此处是多态创建对象
            division.arithmetic();
        }

    }

}
