package com.tencent.thumbplayer.tcmedia.core.richmedia;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPNativeRichMediaProcessorCallback {
    void onDeselectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10);

    void onRichMediaError(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10);

    void onRichMediaFeatureData(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData);

    void onRichMediaFeatureFailure(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10, int i11);

    void onRichMediaInfo(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10, long j10, long j11, long j12, Object obj);

    void onRichMediaPrepared(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor);

    void onSelectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i10);
}
