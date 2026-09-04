package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.StandardPitchInfo;
import com.ss.bytertc.engine.handler.NativeSingScoringEventHandler;

/* JADX INFO: loaded from: classes4.dex */
public class NativeSingScoringManagerFunctions {
    public static native int nativeGetAverageScore(long j10);

    public static native int nativeGetLastSentenceScore(long j10);

    public static native StandardPitchInfo[] nativeGetStandardPitchInfo(long j10, String str);

    public static native int nativeGetTotalScore(long j10);

    public static native int nativeInitSingScoring(long j10, long j11, String str, String str2, NativeSingScoringEventHandler nativeSingScoringEventHandler);

    public static native int nativeSetSingScoringConfig(long j10, int i10, int i11, String str, String str2);

    public static native int nativeStartSingScoring(long j10, int i10, int i11);

    public static native int nativeStopSingScoring(long j10);
}
