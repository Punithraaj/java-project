package com.punith;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import java.io.File;

public class ImageToByteArray {

    public static void main (String args[]) throws Exception
    {
        //Read the Image using the ImageIO class read method and store the image in buffer
        BufferedImage image = ImageIO.read(new File("C:\\Users\\SUNRISE\\Pictures\\2.1.PNG"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //Writ the buffer image data into BytearrayOutputStream
        ImageIO.write(image, "png", bos );
        //Convert the bytearray.
        byte [] data = bos.toByteArray();
        //read the byte array and create a buffered image.
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        BufferedImage bImage2 = ImageIO.read(bis);
        //write the bufferd image in the folder
        //remember both read extention and writting extension has to be same
        ImageIO.write(bImage2, "png", new File("D:\\output.png") );
        System.out.println("image created");
    }
}
