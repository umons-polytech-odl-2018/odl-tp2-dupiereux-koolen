package exercise3;

public class Exercise3 {
	public static void main(String[] args) {

		//new Panel(new Drawable[0]);
		new Panel(new Drawable[]{				//Drawable = intefrace qui comunique entre le code et l'interface graphique
			new ConvexPolygon(new Point[]{
				new Point(1,1),
				new Point (100, 100),
				new Point (200,1)
			})
		});
	}
}
