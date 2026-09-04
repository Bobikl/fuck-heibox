package com.ss.bytertc.engine.loader;

/* JADX INFO: loaded from: classes4.dex */
public class RTCNativeLibraryLoaderInfo {
    private static final String TAG = "RTCNativeLibraryLoaderInfo";
    private String mSdkVersion = "";
    private Long mLoadTimeStampMs = 0L;
    private String mLoaderClassName = "";
    private int mLoadTimes = 0;
    private boolean mIsLoadSuccess = false;

    public long getLoadTimeStamp() {
        return this.mLoadTimeStampMs.longValue();
    }

    public String getLoaderClassName() {
        return this.mLoaderClassName;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public boolean isLoadSuccess() {
        return this.mIsLoadSuccess;
    }

    public void loadLibrary() {
        this.mLoadTimes++;
    }

    public void setLoadResult(boolean z10) {
        this.mIsLoadSuccess = z10;
    }

    public void setLoadTimeStampMs(long j10) {
        this.mLoadTimeStampMs = Long.valueOf(j10);
    }

    public void setLoaderClassName(String str) {
        this.mLoaderClassName = str;
    }

    public void setSdkVersion(String str) {
        this.mSdkVersion = str;
    }

    public String toString() {
        return "RTCNativeLibraryLoaderInfo{SdkVersion='" + this.mSdkVersion + "', LoadTimeStamp=" + this.mLoadTimeStampMs + ", LoaderClassName='" + this.mLoaderClassName + "', LoadTimes=" + this.mLoadTimes + ", IsLoadSuccess=" + this.mIsLoadSuccess + '}';
    }
}
