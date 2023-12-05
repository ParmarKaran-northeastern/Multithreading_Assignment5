
package Tone;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author apple
 */

public class Tone {
        public void play(String filePath) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
                        Thread1.sleep(clip.getMicrosecondLength()/1500);
                        

		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}

	}
    public static void main(String[] args) {
     Thread1 t1 = new Thread1();
        t1.start(); 
        Thread2 t2 = new Thread2();
        t2.start();
        
    }
  }
    
    