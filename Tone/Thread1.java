
package Tone;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author apple
 */

class Thread1 extends Thread
{
    public void play(String filePath) {
		try {
                    System.out.print(new File(filePath).getAbsoluteFile());
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
                        Thread.sleep(clip.getMicrosecondLength()/1000);

		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}

	}
    public void run()
    {
        var paths = new String[] {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
        for (String path : paths) 
        { 
            System.out.println("Playing " +path );
            play(path);
        }
    }
}