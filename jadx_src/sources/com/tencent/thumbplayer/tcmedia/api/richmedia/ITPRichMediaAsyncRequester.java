package com.tencent.thumbplayer.tcmedia.api.richmedia;

import com.tencent.thumbplayer.tcmedia.api.TPTimeRange;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPRichMediaAsyncRequester {
    void cancelRequest(int i10);

    TPRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    int requestFeatureDataAsyncAtTimeMs(int i10, long j10);

    int requestFeatureDataAsyncAtTimeMsArray(int i10, long[] jArr);

    int requestFeatureDataAsyncAtTimeRange(int i10, TPTimeRange tPTimeRange);

    int requestFeatureDataAsyncAtTimeRanges(int i10, TPTimeRange[] tPTimeRangeArr);

    void setRequesterListener(ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener);

    void setRichMediaSource(String str);
}
