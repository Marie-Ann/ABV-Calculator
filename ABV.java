/**
 * The ABV class provides the methods for calculating alcohol by volume.
 */
package Homebrew;

/**
 * Instance variables represent original and final gravity.
 * @author mpeg4
 *
 */
public class ABV {
		private double og;
		private double fg;
		
		public ABV() {
			
		}
		
		public ABV(double o_gravity, double f_gravity) {
			o_gravity = og;
			f_gravity = fg;
		}
		
		/**
		 * Method gets original gravity.
		 * @param o
		 * @return
		 */
		public double getOriginal(double o) {
			return o;
		}
		/**
		 * Method gets final gravity.
		 * @param f
		 * @return
		 */
		public double getFinal(double f) {
			return f;
		}
		/**
		 * Calculates alcohol by volume;
		 * @param o_gravity
		 * @param f_gravity
		 * @return
		 */
		public void calculateABV(double o_gravity, double f_gravity) {
			double volume;
			volume = (o_gravity - f_gravity) * 131.25;
			System.out.printf("%.2f\n", volume);
		}
		

}
