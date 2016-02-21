package cz.cvut.cmp.skew;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

public class TestContourSkew {

	static {
        nu.pattern.OpenCV.loadShared();
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mat img = Highgui.imread("src/main/resources/Arial-Bold-VARIOUS.bin.png", Highgui.IMREAD_GRAYSCALE);
		Mat skew = new Mat();

		
		ContourSkewEstimator cs = new ContourSkewEstimator();
		SkewEstimator.skewImageWBG(img, skew, Math.toRadians(-10));
		cs.estimateSkew(skew);

	}

}
