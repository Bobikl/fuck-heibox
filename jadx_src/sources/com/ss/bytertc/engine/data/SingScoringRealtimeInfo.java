package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class SingScoringRealtimeInfo {
    public int averageScore;
    public int currentPosition;
    public int sentenceIndex;
    public int sentenceScore;
    public int standardPitch;
    public int totalScore;
    public int userPitch;

    public SingScoringRealtimeInfo(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.currentPosition = i10;
        this.userPitch = i11;
        this.standardPitch = i12;
        this.sentenceIndex = i13;
        this.sentenceScore = i14;
        this.totalScore = i15;
        this.averageScore = i16;
    }

    @CalledByNative
    private static SingScoringRealtimeInfo create(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new SingScoringRealtimeInfo(i10, i11, i12, i13, i14, i15, i16);
    }

    public String toString() {
        return "SingScoringRealtimeInfo{currentPosition='" + this.currentPosition + "'userPitch='" + this.userPitch + "'standardPitch='" + this.standardPitch + "'sentenceIndex='" + this.sentenceIndex + "'sentenceScore='" + this.sentenceScore + "'totalScore='" + this.totalScore + "'averageScore='" + this.averageScore + '\'' + g.f141884d;
    }
}
