package com.tencent.thumbplayer.tcmedia.core.richmedia.async;

import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeatureData;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPNativeRichMediaAsyncRequesterListener {
    void onFeatureDataRequestFailure(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i10, int i11, int i12);

    void onFeatureDataRequestSuccess(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i10, int i11, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData);

    void onRequesterError(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i10);

    void onRequesterPrepared(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester);
}
