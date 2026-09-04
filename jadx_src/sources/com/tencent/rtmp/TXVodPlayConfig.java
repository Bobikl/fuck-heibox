package com.tencent.rtmp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TXVodPlayConfig {
    String mCacheFolderPath;
    private int mEncryptedMp4Level;
    Map<String, String> mHeaders;
    int mMaxCacheItems;
    String mOverlayIv;
    String mOverlayKey;
    int mProgressInterval;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    int mTimeout = 10;
    int mPlayerType = 1;
    boolean mEnableAccurateSeek = true;
    boolean mAutoRotate = true;
    boolean mSmoothSwitchBitrate = false;
    String mCacheMp4ExtName = "mp4";
    float mMaxBufferSize = 0.0f;
    float mMaxPreloadSize = 0.0f;
    int mFirstStartPlayBufferTime = 0;
    int mNextStartPlayBufferTime = 0;
    boolean mEnableRenderProcess = true;
    long mPreferredResolution = -1;
    int mMediaType = 0;
    Map<String, Object> mExtInfoMap = new ConcurrentHashMap();

    public String getCacheFolderPath() {
        return this.mCacheFolderPath;
    }

    public String getCacheMp4ExtName() {
        return this.mCacheMp4ExtName;
    }

    public int getConnectRetryCount() {
        return this.mConnectRetryCount;
    }

    public int getConnectRetryInterval() {
        return this.mConnectRetryInterval;
    }

    public int getEncryptedMp4Level() {
        return this.mEncryptedMp4Level;
    }

    public Map<String, Object> getExtInfoMap() {
        return this.mExtInfoMap;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public float getMaxBufferSize() {
        return this.mMaxBufferSize;
    }

    public int getMaxCacheItems() {
        return this.mMaxCacheItems;
    }

    public float getMaxPreloadSize() {
        return this.mMaxPreloadSize;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public String getOverlayIv() {
        return this.mOverlayIv;
    }

    public String getOverlayKey() {
        return this.mOverlayKey;
    }

    public int getPlayerType() {
        return this.mPlayerType;
    }

    public long getPreferredResolution() {
        return this.mPreferredResolution;
    }

    public int getProgressInterval() {
        return this.mProgressInterval;
    }

    public int getTimeout() {
        return this.mTimeout;
    }

    public boolean isAutoRotate() {
        return this.mAutoRotate;
    }

    public boolean isEnableAccurateSeek() {
        return this.mEnableAccurateSeek;
    }

    public boolean isEnableRenderProcess() {
        return this.mEnableRenderProcess;
    }

    public boolean isSmoothSwitchBitrate() {
        return this.mSmoothSwitchBitrate;
    }

    public void setAutoRotate(boolean z10) {
        this.mAutoRotate = z10;
    }

    @Deprecated
    public void setCacheFolderPath(String str) {
        this.mCacheFolderPath = str;
    }

    public void setCacheMp4ExtName(String str) {
        this.mCacheMp4ExtName = str;
    }

    public void setConnectRetryCount(int i10) {
        this.mConnectRetryCount = i10;
    }

    public void setConnectRetryInterval(int i10) {
        this.mConnectRetryInterval = i10;
    }

    public void setEnableAccurateSeek(boolean z10) {
        this.mEnableAccurateSeek = z10;
    }

    public void setEnableRenderProcess(boolean z10) {
        this.mEnableRenderProcess = z10;
    }

    public void setEncryptedMp4Level(int i10) {
        this.mEncryptedMp4Level = i10;
    }

    public void setExtInfo(Map<String, Object> map) {
        this.mExtInfoMap.clear();
        this.mExtInfoMap.putAll(map);
    }

    @Deprecated
    public void setFirstStartPlayBufferTime(int i10) {
        this.mFirstStartPlayBufferTime = i10;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMaxBufferSize(float f10) {
        this.mMaxBufferSize = f10;
    }

    @Deprecated
    public void setMaxCacheItems(int i10) {
        this.mMaxCacheItems = i10;
    }

    public void setMaxPreloadSize(float f10) {
        this.mMaxPreloadSize = f10;
    }

    public void setMediaType(int i10) {
        this.mMediaType = i10;
    }

    @Deprecated
    public void setNextStartPlayBufferTime(int i10) {
        this.mNextStartPlayBufferTime = i10;
    }

    public void setOverlayIv(String str) {
        this.mOverlayIv = str;
    }

    public void setOverlayKey(String str) {
        this.mOverlayKey = str;
    }

    public void setPlayerType(int i10) {
        this.mPlayerType = i10;
    }

    public void setPreferredResolution(long j10) {
        this.mPreferredResolution = j10;
    }

    public void setProgressInterval(int i10) {
        this.mProgressInterval = i10;
    }

    public void setSmoothSwitchBitrate(boolean z10) {
        this.mSmoothSwitchBitrate = z10;
    }

    public void setTimeout(int i10) {
        this.mTimeout = i10;
    }
}
