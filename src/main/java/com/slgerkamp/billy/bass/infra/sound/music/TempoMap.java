package com.slgerkamp.billy.bass.infra.sound.music;

import java.util.ArrayList;
import java.util.TreeMap;

@SuppressWarnings("serial")
public class TempoMap extends TreeMap<Double, TempoMap.Tempo> {

  ArrayList<Tempo> settings;

  public TempoMap(double initial) {
    settings = new ArrayList<TempoMap.Tempo>();
    settings.add(new TempoMap.Tempo(0, 0.0, initial));
  }

  public void put(int measure, double beat, double tempo) {
    settings.add(new TempoMap.Tempo(measure, beat, tempo));
  }

  void updateTime(TimeSign timeSign) {
    clear();
    for (Tempo tempo : settings) {
      put(timeSign.getTotalBeat(tempo.measure, tempo.beat), tempo);
    }

    Tempo currentTempo = get(0.0);
    double currentBeat = 0;
    double currentTime = 0;
    for (Double nextBeat : keySet()) {
      Tempo nextTempo = get(nextBeat);
      currentTime += (nextBeat - currentBeat) * 60.0 / ((nextTempo.tempo + currentTempo.tempo) / 2d);
      nextTempo.time = currentTime;
      currentTempo = nextTempo;
      currentBeat = nextBeat;
    }
  }

  public double getTime(double totalBeat) {
    if (totalBeat < 0) {
      throw new IllegalArgumentException("total beat is too small:totalBeat=" + totalBeat);
    }
    double floorKey = floorKey(totalBeat);
    Tempo floorTempo = get(floorKey);
    Double ceilingKey = ceilingKey(totalBeat);
    Tempo ceilingTempo;
    if (ceilingKey == null) {
      ceilingKey = totalBeat;
      ceilingTempo = floorTempo;
    } else {
      ceilingTempo = get(ceilingKey);
    }
    double tempo;
    if (ceilingKey == floorKey) {
      tempo = floorTempo.tempo;
    } else {
      tempo = floorTempo.tempo + (ceilingTempo.tempo - floorTempo.tempo) * (totalBeat - floorKey) / (ceilingKey - floorKey);
    }
    return floorTempo.time + (totalBeat - floorKey) * 60d / ((floorTempo.tempo + tempo) / 2d);

  }

  public static class Tempo {

    int measure;
    double beat;
    double tempo;
    Double time;

    public Tempo(int measure, double beat, double tempo) {
      this.measure = measure;
      this.beat = beat;
      this.tempo = tempo;
      time = null;
    }
  }
}