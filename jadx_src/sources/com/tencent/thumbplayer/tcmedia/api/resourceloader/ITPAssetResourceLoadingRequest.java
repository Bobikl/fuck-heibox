package com.tencent.thumbplayer.tcmedia.api.resourceloader;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPAssetResourceLoadingRequest {
    void finishLoading();

    TPAssetResourceLoadingContentInformationRequest getContentInformation();

    ITPAssetResourceLoadingDataRequest getLoadingDataRequest();

    boolean isCancelled();

    boolean isFinished();
}
