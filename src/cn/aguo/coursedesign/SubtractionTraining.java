package cn.aguo.coursedesign;

import java.text.NumberFormat;
import java.util.*;
/*
 * 18���ƿ�����ʯ�ɹ�
 * ��Ŀ����ѧ��������ѵ��ϵͳ-����ѵ��ģ��
 * */
public class SubtractionTraining implements Arithmetic {
    @Override
    public void arithmetic() {//��дArithmetic�ڵ�arithmetic���󷽷�
        Random ra = new Random();//����Random����������ȡ�����
        Beautify beautify = new Beautify();//��������
        Scanner sc = new Scanner(System.in);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();//�ٷ���
        int a, b, c; //a��b���ǲ�����������֣�c���û�����Ľ��
        float len = 0, len2 = 0;//len�Ƕ���������Ŀ����ͳ��,len2�Ƕ���ȷ����Ŀ����ͳ��
        beautify.beautify4();
        ArrayList<Integer> arrayList = new ArrayList<>();//�˼���������¼ÿ�μ��������
        ArrayList<Integer> arrayList1 = new ArrayList<>();//�˼���������¼ÿ�μ��������
        long startTime = System.currentTimeMillis(); //��ȡ��ʼʱ��
        do {
            a = ra.nextInt(49) + 1;//��ȡ1-50֮�������
            b = ra.nextInt(49) + 1;//��ȡ1-50֮�������
            if (a >= b) {//���Ƽ��������Ϊ����
                System.out.println(a + " - " + b + " = ");
                System.out.print("�����������(���롰-1���˳���ǰѵ��)��");
                c = sc.nextInt();
                if (c == -1) {
                    beautify.beautify3();
                    percentInstance.setMaximumFractionDigits(2);//�ٷֱȱ�����λС��
                    String format = percentInstance.format(len2/len);//����ٷ���
                    System.out.println("���δ�����ȷ��Ϊ��" +format);
                    System.out.println("������Ŀ�Լ���ȷ��Ϊ��");
                    int d = 0;
                    for (Integer integer : arrayList) {
                        System.out.println(integer +" - "+ arrayList1.get(d) +" = "+(integer - arrayList1.get(d)));
                        d++;
                    }
                    break;
                } else if (c == a - b) {//�˴��ж��û����Ƿ���ȷ
                    len2++;
                    len++;
                    arrayList.add(a);
                    arrayList1.add(b);//���뼯��
                    beautify.beautify1();
                    System.out.println();
                } else {//��ʾ�û�����𰸴���
                    len++;
                    arrayList.add(a);
                    arrayList1.add(b);//���뼯��
                    beautify.beautify2();
                    System.out.println("��ȷ���Ϊ:" +(a-b));
                    System.out.println();
                }
            }
            else continue;//�ص��������
        }while (true);
        long endTime = System.currentTimeMillis();//��ȡ����ʱ��
        System.out.println("����ѵ������ʱ�䣺" + (endTime - startTime)/1000+ "s");//����˴�ѵ��ִ��ʱ��
    }

}
