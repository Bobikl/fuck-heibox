package com.tencent.thumbplayer.tcmedia.api.resourceloader;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPAssetResourceLoaderListener {
    void didCancelLoadingRequest(ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest);

    void fillInContentInformation(TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest);

    boolean shouldWaitForLoadingOfRequestedResource(ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest);
}
