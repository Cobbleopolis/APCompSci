import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments
     */
    public Picture() {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     *
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     *
     * @param height the height of the desired picture
     * @param width  the width of the desired picture
     */
    public Picture(int height, int width) {
        // let the parent class handle this width and height
        super(width, height);
    }

    /**
     * Constructor that takes a picture and creates a
     * copy of that picture
     *
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture) {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     *
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image) {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     *
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString() {
        String output = "Picture, filename " + getFileName() +
                " height " + getHeight()
                + " width " + getWidth();
        return output;

    }

    /**
     * Method to set the blue to 0
     */
    public void zeroBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setBlue(0);
            }
        }
    }

    /**
     * Method to set the red to 0
     */
    public void zeroRed(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setRed(0);
            }
        }
    }

    /**
     * Method to set the green to 0
     */
    public void zeroGreen(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setGreen(0);
            }
        }
    }

    /**
     * Method to set the red and green to 0
     */
    public void keepOnlyBlue (){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setGreen(0);
                pixelObj.setRed(0);
            }
        }
    }

	/**
	 * Method to set the green and blue to 0
	 */
	public void keepOnlyRed (){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setGreen(0);
				pixelObj.setBlue(0);
			}
		}
	}

	/**
	 * Method to set the red and blue to 0
	 */
	public void keepOnlyGreen (){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setBlue(0);
			}
		}
	}

	/**
	 * Method that inverts the pixels of image
	 */
	public void makeNegative (){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}

	/**
	 * Method to make the image grayscale
	 */
	public void makeGrayscale (){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
				pixelObj.setRed(avg);
				pixelObj.setGreen(avg);
				pixelObj.setBlue(avg);
			}
		}
	}

    /**
     * Method that mirrors the picture around a
     * vertical mirror in the center of the picture
     * from left to right
     */
    public void mirrorVertical() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < width / 2; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

	/**
	 * Method that mirrors the picture around a
	 * vertical mirror in the center of the picture
	 * from right to left
	 */
	public void mirrorVerticalRightToLeft () {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a
	 * horizontal mirror in the center of the picture
	 * from top to bottom
	 */
	public void mirrorHorizontal(){
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		int width = pixels[0].length;
		for (int y = 0; y < height / 2; y++) {
			for (int x = 0; x < width; x++) {
				topPixel = pixels[y][x];
				bottomPixel = pixels[height - 1 - y][x];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a
	 * horizontal mirror in the center of the picture
	 * from bottom to top
	 */
	public void mirrorHorizontalBottomToTop (){
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		int width = pixels[0].length;
		for (int y = 0; y < height / 2; y++) {
			for (int x = 0; x < width; x++) {
				topPixel = pixels[y][x];
				bottomPixel = pixels[height - 1 - y][x];
				topPixel.setColor(bottomPixel.getColor());
			}
		}
	}

	/**
     * Mirror just part of a picture of a temple
     */
    public void mirrorTemple() {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++) {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++) {

                leftPixel = pixels[row][col];
                rightPixel = pixels[row]
                        [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

	/**
	 * Mirrors the arms on a snowman
	 */
	public void mirrorArms(){
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		int width = pixels[0].length;
		int startOffset = (height / 2) + 40;
		for (int y = startOffset; y > startOffset - 30; y--) {
			for (int x = 0; x < width; x++) {
				topPixel = pixels[y][x];
				bottomPixel = pixels[startOffset + (startOffset - y)][x];
				if(topPixel.getRed() > topPixel.getGreen() && topPixel.getRed() > topPixel.getBlue())
					bottomPixel.setColor(topPixel.getColor());
//				topPixel.setColor(new Color(0, 0, 0));
			}
		}
	}

	/**
	 * Mirrors the gull so that there are two of them
	 */
	public void mirrorGull() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		for (int y = 220; y < 360; y++) {
			for (int x = 220; x < 360; x++) {
				topPixel = pixels[y][x];
				bottomPixel = pixels[y][220 - (x - 220)];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}

	/**
     * copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     *
     * @param fromPic  the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, int startRow, int startCol) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow;
             fromRow < fromPixels.length &&
                     toRow < toPixels.length;
             fromRow++, toRow++) {
            for (int fromCol = 0, toCol = startCol;
                 fromCol < fromPixels[0].length &&
                         toCol < toPixels[0].length;
                 fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }

    /**
     * copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     *
     * @param fromPic  the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     * @param endRow the end row to copy to
     * @param endCol the end col to copy to
     */
    public void copy(Picture fromPic, int startRow, int startCol, int endRow, int endCol) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = startRow, toRow = startRow;
             fromRow < endRow &&
                     toRow < endRow;
             fromRow++, toRow++) {
            for (int fromCol = startCol, toCol = startCol;
                 fromCol < endCol &&
                         toCol < endCol;
                 fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }

    /**
     * copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     *
     * @param fromPic  the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     * @param endRow the end row to copy to
     * @param endCol the end col to copy to
     * @param xLoc the x position of the copied section
     * @param yLoc the y position of the copied section
     */
    public void copy(Picture fromPic, int startRow, int startCol, int endRow, int endCol, int xLoc, int yLoc) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = startRow, toRow = yLoc;
             fromRow < endRow &&
                     toRow < (yLoc + endRow);
             fromRow++, toRow++) {
            for (int fromCol = startCol, toCol = xLoc;
                 fromCol < endCol &&
                         toCol < (xLoc + endCol);
                 fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }


    /**
     * Method to create a collage of several pictures
     */
    public void createCollage() {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1, 0, 0);
        this.copy(flower2, 100, 0);
        this.copy(flower1, 200, 0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue, 300, 0);
        this.copy(flower1, 400, 0);
        this.copy(flower2, 500, 0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /**
     * Method to create a collage of several pictures
     */
    public void myCollage() {
        Picture seagull = new Picture("seagull.jpg");
        Picture snowman = new Picture("snowman.jpg");
        this.copy(seagull, 220, 220, 360, 360, 0, 0);
        this.copy(snowman, 70, 155, 170, 250, 22, 140);

        Picture robot = new Picture("robot.jpg");

        Picture robotGreyscale = new Picture("robot.jpg");
        robotGreyscale.makeGrayscale();

        Picture robotBlue = new Picture("robot.jpg");
        robotBlue.keepOnlyBlue();

        Picture robotRed = new Picture("robot.jpg");
        robotRed.keepOnlyRed();

        this.copy(robot, 0, 0, robot.getHeight(), robot.getWidth(), 140, 0);
        this.copy(robotGreyscale, 0, 0, robotGreyscale.getHeight(), robotGreyscale.getWidth(), 140 + robotGreyscale.getWidth(), 0);
        this.copy(robotBlue, 0, 0, robotBlue.getHeight(), robotBlue.getWidth(), 140, robotBlue.getHeight());
        this.copy(robotRed, 0, 0, robotRed.getHeight(), robotRed.getWidth(), 140 + robotRed.getWidth(), robotRed.getHeight());
        this.mirrorVertical();
        this.mirrorHorizontal();
        this.write("myCollage.jpg");
    }


    /**
     * Method to show large changes in color
     *
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist) {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0;
                 col < pixels[0].length - 1; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col + 1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) >
                        edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
    }


    /* Main method for testing - each class in Java can have a main
     * method
     */
    public static void main(String[] args) {
        Picture canvas = new Picture("640x480.jpg");
        canvas.myCollage();
        canvas.explore();
    }

} // this } is the end of class Picture, put all new methods before this
