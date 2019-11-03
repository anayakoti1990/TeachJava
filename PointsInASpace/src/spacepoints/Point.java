package spacepoints;
//Created Multiple Constructors
public class Point {
	double X;
	double Y;
	double Z;
	
	 Point(double Xval, double Yval, double Zval) { this.X=Xval; this.Y=Yval;
	  this.Z=Zval;
	  
	  }
	 Point(){	 
	 }
 Point(double X, double Y){ this.X=X; this.Y=Y; } 
	void displayPoint(){
		if(Z==0) {
			System.out.println(X+" ,"+Y);
		}else {
		System.out.println(X+", "+Y+ ","+Z);
		}
	}

}
