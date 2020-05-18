package com.design.principle.inversion;

/**
 * @author qianzhubing
 * @date   2020年4月22日 下午10:21:54
*/
public class DependenceInversion {

	public static void main(String[] args) {
		new Person().receive(new Email());
	}
}

class Email {
	public String getInfo() {
		return "hello world!";
	}
}

// 完成Person类接收消息的功能
// 1.简单，比较容易想到
// 2.如果我们获取的对象是微信、短信等，则新增类，同时Person也要新增相应的接收方法
// 3.解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
class Person {
	public void receive(Email email) {
		System.out.println(email.getInfo());
	}
}