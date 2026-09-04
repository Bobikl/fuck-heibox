package com.tencent.thumbplayer.tcmedia.api.richmedia;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPRichMediaAsyncRequesterListener {
    void onFeatureDataRequestFailure(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i10, int i11, int i12);

    void onFeatureDataRequestSuccess(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i10, int i11, TPRichMediaFeatureData tPRichMediaFeatureData);

    void onRequesterError(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i10);

    void onRequesterPrepared(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester);
}
