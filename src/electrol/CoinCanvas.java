package electrol;


import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;

public class CoinCanvas extends Canvas
{
	ScrollableTable table = null;
	
	public CoinCanvas()
	{
		this.table = new ScrollableTable(getData(), getWidth() - 20, getHeight() - 20);
	}
	String[][] getData()
	{
		return new String[][]{
			new String[]{"Address", "Label","Amount","Height","Output Points"}
		};
	}
	protected void keyPressed(int key)
	{
		int keyCode = getGameAction(key);
		System.out.println(key);

		if(keyCode == FIRE)
		{
			/*Display.getDisplay().setCurrent(
				new Alert("Selected", table.getSelectedData(), null, AlertType.INFO)
			);*/
		}
		else
		{
			table.keyPressed(keyCode);
			
			repaint();
		}
	}
	
	protected void paint(Graphics g)
	{
		g.setColor(0xffffff);
		
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.translate(10, 10);
		
		table.paint(g);
		
		g.translate(-10, -10);
	}

}