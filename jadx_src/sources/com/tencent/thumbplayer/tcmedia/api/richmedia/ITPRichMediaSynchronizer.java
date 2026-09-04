package com.tencent.thumbplayer.tcmedia.api.richmedia;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPRichMediaSynchronizer {
    void deselectFeatureAsync(int i10);

    TPRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    void reset();

    void selectFeatureAsync(int i10, TPRichMediaRequestExtraInfo tPRichMediaRequestExtraInfo);

    void setListener(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener);

    void setRichMediaSource(String str);
}
