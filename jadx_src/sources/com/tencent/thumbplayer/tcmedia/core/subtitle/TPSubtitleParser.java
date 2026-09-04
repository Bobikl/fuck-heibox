package com.tencent.thumbplayer.tcmedia.core.subtitle;

import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrameWrapper;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayerUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TPSubtitleParser {
    public static final int TP_SUBTITLE_OUTPUT_RGBA = 1;
    public static final int TP_SUBTITLE_OUTPUT_TEXT = 0;
    private ITPSubtitleParserCallback mCallback;
    private Map<String, String> mHttpHeader;
    private boolean mInited;
    private boolean mIsLibLoaded;
    private long mNativeContext;
    private int mOutputType;
    private String mUrl;

    public TPSubtitleParser(String str, ITPSubtitleParserCallback iTPSubtitleParserCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mOutputType = 0;
        this.mCallback = null;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPSubtitleParserCallback;
    }

    public TPSubtitleParser(String str, ITPSubtitleParserCallback iTPSubtitleParserCallback, int i10) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mOutputType = 0;
        this.mCallback = null;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPSubtitleParserCallback;
        this.mOutputType = i10;
    }

    public TPSubtitleParser(String str, Map<String, String> map, ITPSubtitleParserCallback iTPSubtitleParserCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mOutputType = 0;
        this.mCallback = null;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPSubtitleParserCallback;
    }

    public TPSubtitleParser(String str, Map<String, String> map, ITPSubtitleParserCallback iTPSubtitleParserCallback, int i10) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mOutputType = 0;
        this.mCallback = null;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPSubtitleParserCallback;
        this.mOutputType = i10;
    }

    private native int _subtitleCreate(String str, Object obj, int i10);

    private native int _subtitleCreateWithUrlHttpHeader(String str, Object[] objArr, Object obj, int i10);

    private native void _subtitleDelete();

    private native TPSubtitleFrameWrapper _subtitleGetFrame(long j10);

    private native String _subtitleGetText(long j10, int i10);

    private native int _subtitleGetTrackCount();

    private native String _subtitleGetTrackName(int i10);

    private native void _subtitleLoadAsync();

    private native void _subtitlePauseAsync();

    private native int _subtitleSelectTrackAsync(int i10, long j10);

    private native void _subtitleSetRenderParams(TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams);

    private native void _subtitleStartAsync();

    private native void _subtitleStop();

    private void loadLibrary() {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(null);
            this.mIsLibLoaded = true;
        } catch (UnsupportedOperationException e10) {
            e10.printStackTrace();
            this.mIsLibLoaded = false;
        }
    }

    public TPSubtitleFrameWrapper getSubtitleFrame(long j10) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _subtitleGetFrame(j10);
        }
        throw new IllegalStateException("Failed to getSubtitleFrame due to invalid state.");
    }

    public String getSubtitleText(long j10, int i10) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _subtitleGetText(j10, i10);
        }
        throw new IllegalStateException("Failed to getSubtitleText due to invalid state.");
    }

    public TPMediaTrackInfo[] getTrackInfo() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to getTrackInfo due to invalid state.");
        }
        TPMediaTrackInfo[] tPMediaTrackInfoArr = null;
        int i_subtitleGetTrackCount = _subtitleGetTrackCount();
        if (i_subtitleGetTrackCount > 0) {
            tPMediaTrackInfoArr = new TPMediaTrackInfo[i_subtitleGetTrackCount];
            for (int i10 = 0; i10 < i_subtitleGetTrackCount; i10++) {
                TPMediaTrackInfo tPMediaTrackInfo = new TPMediaTrackInfo();
                tPMediaTrackInfo.trackType = 3;
                tPMediaTrackInfo.trackName = _subtitleGetTrackName(i10);
                tPMediaTrackInfoArr[i10] = tPMediaTrackInfo;
            }
        }
        return tPMediaTrackInfoArr;
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
        if (str == null || this.mCallback == null) {
            return;
        }
        _subtitleCreateWithUrlHttpHeader(str, TPNativePlayerUtils.tpMapStringToStringArray(this.mHttpHeader), this.mCallback, this.mOutputType);
    }

    public void loadAsync() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to loadAsync due to invalid state.");
        }
        _subtitleLoadAsync();
    }

    public void pauseAsync() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to pauseAsync due to invalid state.");
        }
        _subtitlePauseAsync();
    }

    public int selectTrackAsync(int i10, long j10) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _subtitleSelectTrackAsync(i10, j10);
        }
        throw new IllegalStateException("Failed to selectTrackAsync due to invalid state.");
    }

    public int selectTracksAsync(int[] iArr, long j10) {
        return 0;
    }

    public void setRenderParams(TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to setRenderParams due to invalid state.");
        }
        _subtitleSetRenderParams(tPNativeSubtitleRenderParams);
    }

    public void startAsync() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to startAsync due to invalid state.");
        }
        _subtitleStartAsync();
    }

    public void stop() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to stop due to invalid state.");
        }
        _subtitleStop();
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            this.mInited = false;
            _subtitleDelete();
        }
    }
}
