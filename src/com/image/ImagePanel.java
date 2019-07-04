package com.image;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	Image img;
	MediaTracker mt = new MediaTracker(this); //MediaTracker�����Զ�׷��ͼƬװ�ؽ���
	
	public void paint (Graphics g) { //����paint()�������ڸ÷�����ʹ��ϵͳ�����Graphics����g����ͼ��
		try {
			//װ��ͼ��
			img = ImageIO.read(new File("./test.gif")); //ImageIO���read()����ֱ��װ��һ��ͼƬ�ļ�
			mt.addImage(img, 1); //�����Ҫ���ٵ�ͼƬ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		//����ͼ����ʾͼ��
		try {
			mt.waitForAll(); //����ͼƬ�����װ��״̬��������ͼ��װ����Ϻ��ٽ�����ʾ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, 400, 200, null); //����ͼ��������ʾͼƬ
	}
}
