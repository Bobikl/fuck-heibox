package com.ss.bytertc.engine.utils;

import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;

/* JADX INFO: loaded from: classes4.dex */
public class AudioFrame {
    public byte[] buffer;
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samples;

    public AudioFrame() {
    }

    public AudioFrame(byte[] bArr, int i10, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.buffer = bArr;
        this.samples = i10;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }
}
