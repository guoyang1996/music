package guoyang;

import java.awt.Graphics;  
import java.awt.Insets;  
import javax.swing.ImageIcon;  
import javax.swing.JTextField;  
  
/** 
 * 
 * @author WZH 
 */  
public class JTextFieldUser extends JTextField {  
    private ImageIcon icon;  
  
    public JTextFieldUser(String str) {  
        //获取当前路径下的图片  
        icon = new ImageIcon(str);  
        Insets insets = new Insets(0, 20, 0, 0);  
        //设置文本输入距左边20  
        this.setMargin(insets);  
    }  
      
    @Override  
    public void paintComponent(Graphics g) {  
        Insets insets = getInsets();  
        super.paintComponent(g);  
        int iconWidth = icon.getIconWidth();  
        int iconHeight = icon.getIconHeight();  
        int Height = this.getHeight();  
        //在文本框中画上之前图片  
        icon.paintIcon(this, g,  this.getWidth()- iconWidth, (Height - iconHeight) / 2);  
    }  
}  