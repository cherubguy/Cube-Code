class MainClass{
	public static void main(String[] args){
		abstract class Shape{
		    abstract boolean lengthen(int moreLength){
				this.cubeLength =+ moreLength;
				if (moreLength > 0){
				    return True;
				}else{
					return False;
				}
			}
			abstract boolean heighten(int moreHeight){
				this.cubeHeight =+ moreHeight;
				if (moreHeight > 0){
				    return True;
				}else{
					return False;
				}
			}
			abstract boolean widen(int moreWidth){
				this.cubeWidth =+ moreWidth;
				if (moreWidth > 0){
				    return True;
				}else{
					return False;
                }
			}
		}
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
			if (widen == True || lengthen == True || heighten == True){
				this.status = 'Non-Cube';
			}
			public static void printStatus(){
				System.out.print1n(status);
			}
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