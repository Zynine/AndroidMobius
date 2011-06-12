package android.mobius;

import android.app.Activity;
import android.os.Bundle;
import android.opengl.GLES11;
import android.widget.Gallery;
import android.widget.EditText;
import android.graphics.*;
public class AndroidMobiusActivity extends Activity {
	private static final long serialVersionUID = 1L;
	//static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	//static Actions actions = new Actions();
	static int width;
	static int height;
	//static Mouse mouse = new Mouse();
//	static Menu menu = new Menu();
//	static SPMenu SPmenu = new SPMenu();
//	static MPMenu MPmenu = new MPMenu();
//	static OMenu Omenu = new OMenu();
	static Gallery MapSelect;
	static EditText NameBox;
	static boolean InMenu,InSPMenu,InMPMenu,InOMenu;
	static File MapDir;
    static File[] MapFiles;
    static int NumOfMaps;
    static String Name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        InMenu = true;
    }
}
class Menu extends JPanel
{
	public void main(String args[])
	{
		repaint();
	}
	public void paintComponent(Graphics g) //Draw Main Menu
	{
		Graphics2D g2d = (Graphics2D)g;
		super.paintComponent(g2d);
		g2d.setColor(Color.black);
		g2d.fillRect(0, 0, GameMain.width, GameMain.height);
		g2d.setColor(Color.white);
		g2d.drawString("Möbius", GameMain.width/2, GameMain.height/2-200);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(GameMain.width/2-400, GameMain.height/2+100, 200, 50);
		g2d.setColor(Color.black);
		g2d.drawString("SinglePlayer", GameMain.width/2-340, GameMain.height/2+125);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(GameMain.width/2-100, GameMain.height/2+100, 200, 50);
		g2d.setColor(Color.black);
		g2d.drawString("MultiPlayer", GameMain.width/2-40, GameMain.height/2+125);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(GameMain.width/2+200, GameMain.height/2+100, 200, 50);
		g2d.setColor(Color.black);
		g2d.drawString("Options", GameMain.width/2+280, GameMain.height/2+125);
	}