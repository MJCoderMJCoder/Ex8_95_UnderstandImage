package com.image;

import javax.swing.JFrame;

public class UnderstandImage {

	public static void main(String[] args) {
		JFrame frm = new JFrame("���ͼ��"); //�������壻JFrame��������
		frm.setLayout(null); //�����Զ���
		ImagePanel ip = new ImagePanel();
		ip.setBounds(0, 0, 400, 200);
		frm.getContentPane().add(ip);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}

}
