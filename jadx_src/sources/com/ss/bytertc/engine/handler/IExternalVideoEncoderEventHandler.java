package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.StreamIndex;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IExternalVideoEncoderEventHandler {
    public abstract void onActiveVideoLayer(StreamIndex streamIndex, int i10, boolean z10);

    public abstract void onRateUpdate(StreamIndex streamIndex, int i10, int i11, int i12);

    public abstract void onRequestKeyFrame(StreamIndex streamIndex, int i10);

    public abstract void onStart(StreamIndex streamIndex);

    public abstract void onStop(StreamIndex streamIndex);
}
