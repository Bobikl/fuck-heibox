package com.ss.bytertc.engine.loader;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class RTCNativeLibraryLoaderImpl implements RTCNativeLibraryLoader {
    private static final String TAG = "RtcNativeLibraryLoaderImpl";

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoader
    public boolean load(String str) {
        Log.i(TAG, "Loading library: " + str);
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e10) {
            Log.e(TAG, "Failed to load native library: " + str, e10);
            return false;
        }
    }
}
