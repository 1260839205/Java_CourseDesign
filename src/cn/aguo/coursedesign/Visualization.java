package cn.aguo.coursedesign;

public class Visualization {
    /*
     * 18���ƿ�����ʯ�ɹ�
     * ��Ŀ����ѧ��������ѵ��ϵͳ-ѡ��˵�
     * */
    public Visualization() {
        System.out.println();
        System.out.println("***************************");
        System.out.println("* ��1���ӷ�ѵ��           *");
        System.out.println("* ��2������ѵ��           *");
        System.out.println("* ��3���˷�ѵ��           *");
        System.out.println("* ��4������ѵ��           *");
        System.out.println("* ��5���˳���ϵͳ         *");
        System.out.println("***************************");
        System.out.print("����ѡ�����ţ�");
    }

    //ͨ���û���������ѡ�������Ӧ��ģ��
    public void arithmetic(int a) {
        if (a == 1){
            Arithmetic addition = new AdditionTraining();//�˴��Ƕ�̬��������
            addition.arithmetic();//�ӷ�����
        }
        else if (a == 2){
            Arithmetic subtraction = new SubtractionTraining();//�˴��Ƕ�̬��������
            subtraction.arithmetic();//��������
        }
        else if (a == 3 ){
            Arithmetic multiplication = new MultiplicationTraining();//�˴��Ƕ�̬��������
            multiplication.arithmetic();//�˷�����
        }
        else if (a == 4) {
            Arithmetic division = new DivisionTraining();//�˴��Ƕ�̬��������
            division.arithmetic();
        }

    }

}
