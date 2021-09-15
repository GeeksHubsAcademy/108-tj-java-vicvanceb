package es.geekshubs.academy;

import java.util.concurrent.TimeUnit;

public class Milliseconds {

  /**
   * Apply Method
   * @param h
   * @param m
   * @param s
   * @return
   */
  public int apply(int h, int m, int s) {

    if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
      return -1;
    }

    long hours = TimeUnit.HOURS.toMillis(h);
    long minutes = TimeUnit.MINUTES.toMillis(m);
    long seconds = TimeUnit.SECONDS.toMillis(s);

    return (int) (hours + minutes + seconds);
  }


}
