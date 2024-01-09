package com.shashank.learnspringframework.test;

import java.io.Serializable;

class Pojo {
	private String text;
	private int number;

	@Override
	public String toString() {
		return text + " : " + number;
	}
}

//to perform JavaBean we need to follow 3rules
class JavaBean implements Serializable {// step3: implement Serilizable
	// step1: public no-arg constructor
	public JavaBean() {

	}

	private String text;
	private int number;

	// step2: getters and setters
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

public class JavaBeansVsPOJOVsSpringBean {

	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		System.out.println(pojo);

		JavaBean javaBean = new JavaBean();
		javaBean.setNumber(8);
		javaBean.setText("Shashank");
		System.out.println(javaBean.getNumber() + " : " + javaBean.getText());

	}

}
