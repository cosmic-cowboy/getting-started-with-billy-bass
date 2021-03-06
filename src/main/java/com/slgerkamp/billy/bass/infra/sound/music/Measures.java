package com.slgerkamp.billy.bass.infra.sound.music;

public class Measures {
  TimeSign timeSign;
  TempoMap tempoMap;

  public Measures(TimeSign TimeSign, TempoMap tempoMap) {
    this.timeSign = TimeSign;
    this.tempoMap = tempoMap;
    tempoMap.updateTime(TimeSign);
  }

  public double getTime(int measure, double beat) {
    double totalBeat = timeSign.getTotalBeat(measure, beat);
    return tempoMap.getTime(totalBeat);
  }
}