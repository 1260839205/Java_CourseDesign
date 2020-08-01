package cn.aguo.coursedesign;

public class NumberException extends Exception {
    /*
     * 18级计科三班石成果
     * 项目：数学计算能力训练系统-自定义异常处理
     * */
    //一个自定义异常，用于抛序号不在范围内异常
    public NumberException() {
        super();
    }

    public NumberException(String message) {
        super(message);
    }
}
