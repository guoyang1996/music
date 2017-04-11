package guoyang;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//定义一个内部类，用来设置面板背景
class BackImage extends JPanel{
  Image img;
  public BackImage()
  {
      try {
          img=ImageIO.read(new File("img//1.jpg"));
      } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
  }
  public void paintComponent(Graphics g)
  {
      g.drawImage(img, 0, 0, 640, 400,this);
  }
}
