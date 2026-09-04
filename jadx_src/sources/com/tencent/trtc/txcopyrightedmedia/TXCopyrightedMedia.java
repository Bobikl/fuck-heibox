package com.tencent.trtc.txcopyrightedmedia;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TXCopyrightedMedia {
    public static TXCopyrightedMediaImpl impl = new TXCopyrightedMediaImpl();

    public interface ITXMusicPreloadCallback {
        void onPreloadComplete(String str, String str2, int i10, String str3);

        void onPreloadProgress(String str, String str2, float f10);

        void onPreloadStart(String str, String str2);
    }

    public interface ITXSongScore {
        int calculateTotalScore();

        void destroy();

        void finish();

        TXSongScoreNoteItem[] getAllGrove();

        void prepare();

        void process(byte[] bArr, int i10, float f10);

        void setKeyShift(int i10);

        void setSongScoreCallback(ITXSongScoreCallback iTXSongScoreCallback);
    }

    public interface ITXSongScoreCallback {
        void onMIDIGroveAndHint(String str, boolean z10, float f10, float f11, int i10);

        void onMIDISCoreUpdate(String str, int i10, int i11, int i12);

        void onMIDIScoreError(String str, int i10, String str2);

        void onMIDIScoreFinish(String str, int[] iArr, int i10);

        void onMIDIScorePrepared(String str);
    }

    public static class TXCopyrightedError {
        public static int ERR_ACCOMPANIMENT_NOT_EXIST = -7;
        public static int ERR_CANCEL = -1;
        public static int ERR_INNER_ERROR = -4;
        public static int ERR_LICENSE_FAILED = -5;
        public static int ERR_LYRIC_NOT_EXIST = -9;
        public static int ERR_MIDI_NOT_EXIST = -10;
        public static int ERR_MUSIC_IS_DOWNLOADING = -6;
        public static int ERR_NET_FAILED = -3;
        public static int ERR_NONE = 0;
        public static int ERR_NOT_PREPARE = -12;
        public static int ERR_ORIGIN_NOT_EXIST = -8;
        public static int ERR_PREPARE_FAILED = -11;
        public static int ERR_TOKEN_OVERDUE = -2;
    }

    public static class TXSongScoreNoteItem {
        public static final int INVALID_GROVE_VALUE = -1;
        public static final int MAX_GROVE_VALUE = 100;
        public static final int MAX_VOICE_PITCH_VALUE = 90;
        public int duration;
        public int endTime;
        public int noteHeight;
        public int startTime;

        public int getEndTime() {
            return this.startTime + this.duration;
        }

        public boolean isSame(int i10) {
            return Math.abs(this.noteHeight - i10) < 11 && this.noteHeight > 0 && i10 > 0;
        }

        public String toString() {
            return String.format("startTime = %d ; endTime = %d ; duration = %d ; height = %d;", Integer.valueOf(this.startTime), Integer.valueOf(this.endTime), Integer.valueOf(this.duration), Integer.valueOf(this.noteHeight));
        }
    }

    public static TXCopyrightedMedia instance() {
        return impl;
    }

    public abstract void cancelPreloadMusic(String str, String str2);

    public abstract void clearMusicCache();

    public abstract ITXSongScore createSongScore(String str, int i10, int i11, String str2, String str3, String str4);

    public abstract void destroy();

    public abstract String genMusicURI(String str, int i10, String str2);

    public abstract void init();

    public abstract boolean isMusicPreloaded(String str, String str2);

    public abstract void preloadMusic(String str, String str2, String str3);

    public abstract void setLicense(Context context, String str, String str2);

    public abstract void setMusicCacheMaxCount(int i10);

    public abstract void setMusicPreloadCallback(ITXMusicPreloadCallback iTXMusicPreloadCallback);
}
