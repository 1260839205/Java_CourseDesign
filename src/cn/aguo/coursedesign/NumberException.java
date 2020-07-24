package cn.aguo.coursedesign;

public class NumberException extends Exception {
    /*
     * 18���ƿ�����ʯ�ɹ�
     * ��Ŀ����ѧ��������ѵ��ϵͳ-�Զ����쳣����
     * */
    //һ���Զ����쳣����������Ų��ڷ�Χ���쳣
    public NumberException() {
        super();
    }

    public NumberException(String message) {
        super(message);
    }
}
