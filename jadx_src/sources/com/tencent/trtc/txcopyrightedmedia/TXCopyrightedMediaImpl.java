package com.tencent.trtc.txcopyrightedmedia;

import android.content.Context;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::extensions")
public class TXCopyrightedMediaImpl extends TXCopyrightedMedia {
    private long mNativeTXCopyrightedMediaImpl = 0;

    public class TXSongScoreImpl implements TXCopyrightedMedia.ITXSongScore {
        private long mNativeTXCopyrightedSongScore;

        public TXSongScoreImpl(String str, int i10, int i11, String str2, String str3, String str4) {
            this.mNativeTXCopyrightedSongScore = 0L;
            this.mNativeTXCopyrightedSongScore = TXCopyrightedMediaImpl.nativeCreateSongScore(TXCopyrightedMediaImpl.this.mNativeTXCopyrightedMediaImpl, this, str, i10, i11, str2, str3, str4);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public int calculateTotalScore() {
            return TXCopyrightedMediaImpl.nativeCalculateTotalScore(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void destroy() {
            TXCopyrightedMediaImpl.nativeDestroySongScore(this.mNativeTXCopyrightedSongScore);
            this.mNativeTXCopyrightedSongScore = 0L;
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void finish() {
            TXCopyrightedMediaImpl.nativeFinish(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public TXCopyrightedMedia.TXSongScoreNoteItem[] getAllGrove() {
            return TXCopyrightedMediaImpl.nativeGetAllGrove(this.mNativeTXCopyrightedSongScore);
        }

        public void onMIDIGroveAndHint(String str, boolean z10, float f10, float f11, int i10, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIGroveAndHint(str, z10, f10, f11, i10);
        }

        public void onMIDISCoreUpdate(String str, int i10, int i11, int i12, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDISCoreUpdate(str, i10, i11, i12);
        }

        public void onMIDIScoreError(String str, int i10, String str2, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScoreError(str, i10, str2);
        }

        public void onMIDIScoreFinish(String str, int[] iArr, int i10, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScoreFinish(str, iArr, i10);
        }

        public void onMIDIScorePrepared(String str, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScorePrepared(str);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void prepare() {
            TXCopyrightedMediaImpl.nativePrepare(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void process(byte[] bArr, int i10, float f10) {
            TXCopyrightedMediaImpl.nativeProcess(this.mNativeTXCopyrightedSongScore, bArr, i10, f10);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void setKeyShift(int i10) {
            TXCopyrightedMediaImpl.nativeSetKeyShift(this.mNativeTXCopyrightedSongScore, i10);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void setSongScoreCallback(TXCopyrightedMedia.ITXSongScoreCallback iTXSongScoreCallback) {
            TXCopyrightedMediaImpl.nativeSetSongScoreCallback(this.mNativeTXCopyrightedSongScore, iTXSongScoreCallback);
        }
    }

    public static Object createSongScoreNoteItem(int i10, int i11, int i12, int i13) {
        TXCopyrightedMedia.TXSongScoreNoteItem tXSongScoreNoteItem = new TXCopyrightedMedia.TXSongScoreNoteItem();
        tXSongScoreNoteItem.startTime = i10;
        tXSongScoreNoteItem.duration = i11;
        tXSongScoreNoteItem.noteHeight = i12;
        tXSongScoreNoteItem.endTime = i13;
        return tXSongScoreNoteItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nativeCalculateTotalScore(long j10);

    private static native void nativeCancelPreloadMusic(long j10, String str, String str2);

    private static native void nativeClearMusicCache(long j10);

    private static native long nativeCreateCopyRightedMedia(TXCopyrightedMediaImpl tXCopyrightedMediaImpl);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateSongScore(long j10, TXSongScoreImpl tXSongScoreImpl, String str, int i10, int i11, String str2, String str3, String str4);

    private static native void nativeDestroyCopyRightedMedia(TXCopyrightedMediaImpl tXCopyrightedMediaImpl, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeDestroySongScore(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFinish(long j10);

    private static native String nativeGenMusicURI(long j10, String str, int i10, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native TXCopyrightedMedia.TXSongScoreNoteItem[] nativeGetAllGrove(long j10);

    private static native boolean nativeIsMusicPreloaded(long j10, String str, String str2);

    private static native void nativePreloadMusic(long j10, String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativePrepare(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProcess(long j10, byte[] bArr, int i10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetKeyShift(long j10, int i10);

    private static native void nativeSetLicense(long j10, Context context, String str, String str2);

    private static native void nativeSetMusicCacheMaxCount(long j10, int i10);

    private static native void nativeSetMusicPreloadCallback(long j10, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetSongScoreCallback(long j10, Object obj);

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void cancelPreloadMusic(String str, String str2) {
        nativeCancelPreloadMusic(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void clearMusicCache() {
        nativeClearMusicCache(this.mNativeTXCopyrightedMediaImpl);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public TXCopyrightedMedia.ITXSongScore createSongScore(String str, int i10, int i11, String str2, String str3, String str4) {
        return new TXSongScoreImpl(str, i10, i11, str2, str3, str4);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void destroy() {
        long j10 = this.mNativeTXCopyrightedMediaImpl;
        if (j10 != 0) {
            nativeDestroyCopyRightedMedia(this, j10);
            this.mNativeTXCopyrightedMediaImpl = 0L;
        }
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public String genMusicURI(String str, int i10, String str2) {
        return nativeGenMusicURI(this.mNativeTXCopyrightedMediaImpl, str, i10, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void init() {
        if (this.mNativeTXCopyrightedMediaImpl == 0) {
            this.mNativeTXCopyrightedMediaImpl = nativeCreateCopyRightedMedia(this);
        }
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public boolean isMusicPreloaded(String str, String str2) {
        return nativeIsMusicPreloaded(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    public void onPreloadComplete(String str, String str2, int i10, String str3, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadComplete(str, str2, i10, str3);
    }

    public void onPreloadProgress(String str, String str2, float f10, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadProgress(str, str2, f10);
    }

    public void onPreloadStart(String str, String str2, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadStart(str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadMusic(String str, String str2, String str3) {
        nativePreloadMusic(this.mNativeTXCopyrightedMediaImpl, str, str2, str3);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setLicense(Context context, String str, String str2) {
        nativeSetLicense(this.mNativeTXCopyrightedMediaImpl, context, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setMusicCacheMaxCount(int i10) {
        nativeSetMusicCacheMaxCount(this.mNativeTXCopyrightedMediaImpl, i10);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setMusicPreloadCallback(TXCopyrightedMedia.ITXMusicPreloadCallback iTXMusicPreloadCallback) {
        nativeSetMusicPreloadCallback(this.mNativeTXCopyrightedMediaImpl, iTXMusicPreloadCallback);
    }
}
