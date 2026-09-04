package com.ss.bytertc.ktv;

import androidx.annotation.n0;
import com.ss.bytertc.engine.BuildConfig;
import com.ss.bytertc.engine.NativeKTVManagerFunctions;
import com.ss.bytertc.engine.handler.KTVManagerEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.ktv.data.DownloadLyricType;
import com.ss.bytertc.ktv.data.MusicFilterType;
import com.ss.bytertc.ktv.data.MusicHotType;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class KTVManagerImpl extends IKTVManager {
    private static final String TAG = "KTVManagerImpl";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private KTVManagerEventHandler mKTVManagerEventHandler;
    private KTVPlayerImpl mKTVPlayer;
    private long mNativeKTVManager;
    private long mNativeKTVManagerEventHandlerPtr;
    private final ReentrantReadWriteLock mReadWriteLock;

    public KTVManagerImpl(long j10) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeKTVManager = j10;
    }

    private int calculateMusicFilterValue(MusicFilterType[] musicFilterTypeArr) {
        int length = musicFilterTypeArr == null ? 0 : musicFilterTypeArr.length;
        if (length == 0) {
            return MusicFilterType.NONE.value();
        }
        if (length == 1) {
            return musicFilterTypeArr[0].value();
        }
        int iValue = musicFilterTypeArr[0].value();
        for (MusicFilterType musicFilterType : musicFilterTypeArr) {
            if (iValue == MusicFilterType.NONE.value()) {
                if (BuildConfig.DEBUG) {
                    throw new IllegalArgumentException("types contains 'MUSIC_FILTER_TYPE_NONE' and other");
                }
                LogUtil.e(TAG, "types contains 'MUSIC_FILTER_TYPE_NONE' and other");
                return -1;
            }
            iValue |= musicFilterType.value();
        }
        return iValue;
    }

    private int calculateMusicHotTypeValue(MusicHotType[] musicHotTypeArr) {
        int length = musicHotTypeArr == null ? 0 : musicHotTypeArr.length;
        if (length == 0) {
            return MusicHotType.CONTENT_CENTER.value();
        }
        if (length == 1) {
            return musicHotTypeArr[0].value();
        }
        int iValue = musicHotTypeArr[0].value();
        for (MusicHotType musicHotType : musicHotTypeArr) {
            iValue |= musicHotType.value();
        }
        return iValue;
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void cancelDownload(int i10) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, downloadLyric failed.");
            }
            NativeKTVManagerFunctions.nativeCancelDownload(this.mNativeKTVManager, i10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void clearCache() {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, clearCache failed.");
            }
            NativeKTVManagerFunctions.nativeClearCache(this.mNativeKTVManager);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void destroy() {
        KTVPlayerImpl kTVPlayerImpl = this.mKTVPlayer;
        if (kTVPlayerImpl != null) {
            kTVPlayerImpl.destroy();
            this.mKTVPlayer = null;
        }
        long j10 = this.mNativeKTVManagerEventHandlerPtr;
        if (j10 != 0) {
            NativeKTVManagerFunctions.nativeReleaseKTVManagerEventHandler(j10);
            this.mNativeKTVManagerEventHandlerPtr = 0L;
        }
        this.mKTVManagerEventHandler = null;
        this.mJniWriteLock.lock();
        try {
            this.mNativeKTVManager = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public int downloadLyric(@n0 String str, @n0 DownloadLyricType downloadLyricType) {
        int iNativeDownloadLyric;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, downloadLyric failed.");
                iNativeDownloadLyric = -1;
            } else {
                iNativeDownloadLyric = NativeKTVManagerFunctions.nativeDownloadLyric(j10, str, downloadLyricType.value());
            }
            return iNativeDownloadLyric;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public int downloadMidi(@n0 String str) {
        int iNativeDownloadMidi;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, downloadMidi failed.");
                iNativeDownloadMidi = -1;
            } else {
                iNativeDownloadMidi = NativeKTVManagerFunctions.nativeDownloadMidi(j10, str);
            }
            return iNativeDownloadMidi;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public int downloadMusic(@n0 String str) {
        int iNativeDownloadMusic;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, downloadMusic failed.");
                iNativeDownloadMusic = -1;
            } else {
                iNativeDownloadMusic = NativeKTVManagerFunctions.nativeDownloadMusic(j10, str);
            }
            return iNativeDownloadMusic;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IKTVManagerEventHandler getHandler() {
        return this.mKTVManagerEventHandler.getKTVHandler();
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void getHotMusic(@n0 MusicHotType[] musicHotTypeArr, @n0 MusicFilterType[] musicFilterTypeArr) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, getHotMusic failed.");
            } else {
                int iCalculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
                int iCalculateMusicHotTypeValue = calculateMusicHotTypeValue(musicHotTypeArr);
                if (iCalculateMusicFilterValue != -1 && iCalculateMusicHotTypeValue != -1) {
                    NativeKTVManagerFunctions.nativeGetHotMusic(this.mNativeKTVManager, iCalculateMusicHotTypeValue, iCalculateMusicFilterValue);
                }
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public IKTVPlayer getKTVPlayer() {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, getKTVPlayer failed.");
            }
            KTVPlayerImpl kTVPlayerImpl = this.mKTVPlayer;
            if (kTVPlayerImpl == null) {
                long jNativeGetKTVPlayer = NativeKTVManagerFunctions.nativeGetKTVPlayer(this.mNativeKTVManager);
                if (jNativeGetKTVPlayer == 0) {
                    LogUtil.e(TAG, "native nativeKTVPlayer is invalid, getKTVPlayer failed.");
                    kTVPlayerImpl = null;
                } else {
                    kTVPlayerImpl = new KTVPlayerImpl(jNativeGetKTVPlayer);
                    this.mKTVPlayer = kTVPlayerImpl;
                }
            }
            return kTVPlayerImpl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void getMusicDetail(@n0 String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, getMusicDetail failed.");
            } else {
                NativeKTVManagerFunctions.nativeGetMusicDetail(j10, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void getMusicList(int i10, int i11, @n0 MusicFilterType[] musicFilterTypeArr) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, getMusicList failed.");
            } else {
                int iCalculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
                if (iCalculateMusicFilterValue != -1) {
                    NativeKTVManagerFunctions.nativeGetMusicList(this.mNativeKTVManager, i10, i11, iCalculateMusicFilterValue);
                }
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void searchMusic(@n0 String str, int i10, int i11, @n0 MusicFilterType[] musicFilterTypeArr) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, searchMusic failed.");
            } else {
                int iCalculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
                if (iCalculateMusicFilterValue != -1) {
                    NativeKTVManagerFunctions.nativeSearchMusic(this.mNativeKTVManager, str, i10, i11, iCalculateMusicFilterValue);
                }
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void setKTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, setKTVManagerEventHandler failed.");
                return;
            }
            KTVManagerEventHandler kTVManagerEventHandler = new KTVManagerEventHandler(iKTVManagerEventHandler);
            this.mKTVManagerEventHandler = kTVManagerEventHandler;
            long j10 = this.mNativeKTVManagerEventHandlerPtr;
            this.mNativeKTVManagerEventHandlerPtr = NativeKTVManagerFunctions.nativeSetKTVManagerEventHandler(this.mNativeKTVManager, kTVManagerEventHandler);
            if (j10 != 0) {
                NativeKTVManagerFunctions.nativeReleaseKTVManagerEventHandler(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void setMaxCacheSize(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native KTVManagerImpl is invalid, setMaxCacheSize failed.");
            } else {
                NativeKTVManagerFunctions.nativeSetMaxCacheSize(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
