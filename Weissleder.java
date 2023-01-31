package JonahOesch;
import robocode.*;

public class Weissleder extends JuniorRobot
{
	
	public void run() {
		setColors(black, black, black, black, black);
		
		while(true) {
			movement();
		}
	}
	
	public void movement() {
            ahead(5);
			turnGunLeft(15);
	}
	
	public void onScannedRobot() {
		turnGunTo(scannedAngle);	
		if(scannedDistance<200){
        fire(1);
       }
	}
	
	public void onHitByBullet() {
	    turnRight(10);
		back(100);
	}
	
	public void onHitWall() {
		turnLeft(90);
		ahead(100);
	}	
}