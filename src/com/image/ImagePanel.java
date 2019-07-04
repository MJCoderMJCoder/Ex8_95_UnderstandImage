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
	MediaTracker mt = new MediaTracker(this); //MediaTracker类能自动追踪图片装载进度
	
	public void paint (Graphics g) { //重载paint()方法，在该方法中使用系统传入的Graphics对象g绘制图形
		try {
			//装载图像
			img = ImageIO.read(new File("./test.gif")); //ImageIO类的read()方法直接装入一个图片文件
			mt.addImage(img, 1); //添加需要跟踪的图片对象
		} catch (IOException e) {
			e.printStackTrace();
		}
		//绘制图像，显示图像
		try {
			mt.waitForAll(); //跟踪图片对象的装载状态；当所有图像都装载完毕后再进行显示。
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, 400, 200, null); //绘制图像，用于显示图片
	}
}
