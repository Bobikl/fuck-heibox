package com.tencent.thumbplayer.tcmedia.core.imagegenerator;

import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TPImageGenerator {
    private ITPImageGeneratorCallback mCallback;
    private int mFd;
    private long mFdLength;
    private long mFdOffset;
    private Map<String, String> mHttpHeader;
    private boolean mInited;
    private boolean mIsLibLoaded;
    private long mNativeContext;
    private String mUrl;

    public TPImageGenerator(int i10, long j10, long j11, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mCallback = null;
        this.mFd = -1;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mFd = i10;
        this.mFdOffset = j10;
        this.mFdLength = j11;
        this.mCallback = iTPImageGeneratorCallback;
    }

    public TPImageGenerator(String str, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mCallback = null;
        this.mFd = -1;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPImageGeneratorCallback;
    }

    public TPImageGenerator(String str, Map<String, String> map, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mCallback = null;
        this.mFd = -1;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPImageGeneratorCallback;
    }

    private native void _cancelAllImageGenerations();

    private native int _createWithFd(int i10, long j10, long j11, Object obj);

    private native int _createWithUrl(String str, Object obj);

    private native void _generateImageAsyncAtTime(long j10, long j11, Object obj);

    private native void _generateImagesAsyncForTimes(long[] jArr, long j10, Object obj);

    private native void _release();

    private void loadLibrary() {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(null);
            this.mIsLibLoaded = true;
        } catch (UnsupportedOperationException e10) {
            e10.printStackTrace();
            this.mIsLibLoaded = false;
        }
    }

    public void cancelAllImageGenerations() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            _cancelAllImageGenerations();
        }
    }

    public void generateImageAsyncAtTime(long j10, long j11, TPImageGeneratorParams tPImageGeneratorParams) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            _generateImageAsyncAtTime(j10, j11, tPImageGeneratorParams);
            return;
        }
        throw new IllegalStateException("Failed to generate image at time " + j10 + " due to invalid state.");
    }

    public void generateImagesAsyncForTimes(long[] jArr, long j10, TPImageGeneratorParams tPImageGeneratorParams) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to generate images due to invalid state.");
        }
        _generateImagesAsyncForTimes(jArr, j10, tPImageGeneratorParams);
    }

    public void init() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            throw new IllegalStateException("Failed to init due to invalid state.");
        }
        this.mInited = true;
        String str = this.mUrl;
        if (str == null || this.mHttpHeader == null) {
            if (str != null) {
                _createWithUrl(str, this.mCallback);
            } else {
                _createWithFd(this.mFd, this.mFdOffset, this.mFdLength, this.mCallback);
            }
        }
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            this.mInited = false;
            _release();
        }
    }
}
