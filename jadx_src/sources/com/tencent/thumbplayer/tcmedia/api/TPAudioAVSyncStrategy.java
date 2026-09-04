package com.tencent.thumbplayer.tcmedia.api;

import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class TPAudioAVSyncStrategy {

    @TPNativeKeyMap.MapAudioAVSyncStrategy(2)
    public static final int TP_AUDIO_AVSYNC_LOW_WATER_MARK_FREERUN = 2;

    @TPNativeKeyMap.MapAudioAVSyncStrategy(0)
    public static final int TP_AUDIO_AVSYNC_NORNAL = 0;

    @TPNativeKeyMap.MapAudioAVSyncStrategy(1)
    public static final int TP_AUDIO_AVSYNC_PERSIST_FREERUN = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TP_AUDIO_AVSYNC_STRATEGY {
    }
}
