class MainClass{
	public static void main(String[] args){
		class Cube extends Shape{
			public String status = 'Cube'
			public int sides = 6;
			public int vertices = 8;
			private int cubeLength;
			private int cubeHeight;
			private int cubeWidth;
			Cube(int x){
				cubeLength = x;
				cubeHeight = x;
				cubeWidth = x;
			}
			public static boolean lengthen(int moreLength){
				this.cubeLength =+ moreLength;
				if (moreLength > 0){
				    return True;
				}else{
					return False;
			}
			public static boolean heighten(int moreHeight){
				this.cubeHeight =+ moreHeight;
				if (moreHeight > 0){
				    return True;
				}else{
					return False;
			}
			public static boolean widen(int moreWidth){
				this.cubeWidth =+ moreWidth;
				if (moreWidth > 0){
				    return True;
				}else{
					return False;
			}
			if (widen == True || lengthen == True || heighten == True){
		}		
		class Rectangle extends Cube{
			private int height;
			private int width;
			private int depth;
			Rectangle(int x, y, z){
				height = x;
			    width = y;
				depth = z;
			}
		
		}	
