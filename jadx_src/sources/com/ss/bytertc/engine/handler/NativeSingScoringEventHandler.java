package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.ISingScoringEventHandler;
import com.ss.bytertc.engine.SingScoringManager;
import com.ss.bytertc.engine.data.SingScoringRealtimeInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class NativeSingScoringEventHandler {
    private static final String TAG = "NativeSingScoringEventHandler";
    private WeakReference<SingScoringManager> mSingScoringManager;

    public NativeSingScoringEventHandler(SingScoringManager singScoringManager) {
        this.mSingScoringManager = new WeakReference<>(singScoringManager);
    }

    @CalledByNative
    void onCurrentScoringInfo(SingScoringRealtimeInfo singScoringRealtimeInfo) {
        SingScoringManager singScoringManager;
        ISingScoringEventHandler singScoringEventHandler;
        WeakReference<SingScoringManager> weakReference = this.mSingScoringManager;
        if (weakReference == null || (singScoringManager = weakReference.get()) == null || (singScoringEventHandler = singScoringManager.getSingScoringEventHandler()) == null) {
            return;
        }
        singScoringEventHandler.onCurrentScoringInfo(singScoringRealtimeInfo);
    }
}
