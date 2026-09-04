package com.ss.bytertc.engine.loader;

import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class RTCNativeLibraryListenerImpl implements RTCNativeLibraryLoaderListener {
    private static final String TAG = "RtcNativeLibraryLoaderListener";

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadAlready(String str) {
        LogUtil.i(TAG, "onLoadAlready : " + str);
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadError(String str) {
        LogUtil.i(TAG, "onLoadError : " + str);
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadSuccess(String str) {
        LogUtil.i(TAG, "onLoadSuccess : " + str);
    }
}
