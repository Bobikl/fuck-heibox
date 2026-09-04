package com.tencent.thumbplayer.tcmedia.core.richmedia.async;

import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeTimeRange;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPNativeRichMediaAsyncRequester {
    void cancelRequest(int i10);

    TPNativeRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    int requestFeatureDataAsyncAtTimeMs(int i10, long j10);

    int requestFeatureDataAsyncAtTimeMsArray(int i10, long[] jArr);

    int requestFeatureDataAsyncAtTimeRange(int i10, TPNativeTimeRange tPNativeTimeRange);

    int requestFeatureDataAsyncAtTimeRanges(int i10, TPNativeTimeRange[] tPNativeTimeRangeArr);

    void setRequesterListener(ITPNativeRichMediaAsyncRequesterListener iTPNativeRichMediaAsyncRequesterListener);

    void setRichMediaSource(String str);
}
