package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class AudioFormat {
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samplesPerCall;

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.samplesPerCall = 0;
    }

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel, int i10) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.samplesPerCall = i10;
    }

    public String toString() {
        return "AudioFormat{sampleRate='" + this.sampleRate + "', channel='" + this.channel + "', samplesPerCall=" + this.samplesPerCall + '}';
    }
}
