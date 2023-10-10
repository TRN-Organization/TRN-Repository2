package com.siemens.example.display;

import junit.framework.TestCase;

/**
 * Created by denis.rubik on 8/25/2016.
 */
public class InDashDisplayTest  extends TestCase {

  public void testAudioDisplayData() {
      AudioDisplay audio = new AudioDisplay ();
      assertEquals("Audio Display", audio.displayData());
  }

  public void testAudioDisplayId() {
      AudioDisplay audio = new AudioDisplay ();
      assertEquals("audioDisplay", audio.displayId());
  }
  
}
