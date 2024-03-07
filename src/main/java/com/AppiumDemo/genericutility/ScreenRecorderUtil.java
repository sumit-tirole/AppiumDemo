package com.AppiumDemo.genericutility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.codec.binary.Base64;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.screenrecording.CanRecordScreen;


public class ScreenRecorderUtil {
	
	private static String timestamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");
    
	 public void startRecording(AndroidDriver driver) throws MalformedURLException {
	        ((CanRecordScreen)driver).startRecordingScreen();
	    }
	
	public void stopRecording(AndroidDriver driver) throws IOException {

        String media = ((CanRecordScreen) driver).stopRecordingScreen();
        String dirPath =   "C:\\Users\\wbox42\\eclipse-workspace\\AppiumDemo\\ExtentReport\\ExecutionRecording";
        File videoDir = new File(dirPath);
        FileOutputStream stream = null;
        
     try {
       stream = new FileOutputStream(videoDir + File.separator +timestamp+ ".mp4");
             stream.write(Base64.decodeBase64(media));
             stream.close();

         } catch (Exception e) {

         } finally {
             if(stream != null) {
                 stream.close();
             }
         }
     }
}
