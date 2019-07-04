package com.image;

import javax.swing.JFrame;

public class UnderstandImage {

	public static void main(String[] args) {
		JFrame frm = new JFrame("理解图像"); //创建窗体；JFrame顶层容器
		frm.setLayout(null); //布局自定义
		ImagePanel ip = new ImagePanel();
		ip.setBounds(0, 0, 400, 200);
		frm.getContentPane().add(ip);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}

}
