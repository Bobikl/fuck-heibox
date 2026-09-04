package com.tencent.trtc;

import com.tencent.liteav.trtc.TXChorusMusicPlayerImpl;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TXChorusMusicPlayer {

    public interface ITXChorusPlayerListener {
        void onChorusError(TXChorusError tXChorusError, String str);

        void onChorusMusicLoadSucceed(String str, List<TXLyricLine> list, List<TXReferencePitch> list2);

        void onChorusPaused();

        void onChorusRequireLoadMusic(String str);

        void onChorusResumed();

        void onChorusStarted();

        void onChorusStopped();

        void onMusicProgressUpdated(long j10, long j11);

        void onNetworkQualityUpdated(int i10, int i11, int i12);

        void onVoicePitchUpdated(int i10, boolean z10, long j10);

        void onVoiceScoreUpdated(int i10, int i11);

        void shouldDecryptAudioData(ByteBuffer byteBuffer);
    }

    public static class TXChorusCopyrightedMusicParams {
        public String musicId = null;
        public String playToken = null;
        public String copyrightedLicenseKey = null;
        public String copyrightedLicenseUrl = null;
    }

    public enum TXChorusError {
        TXChorusErrorInvalidParameters,
        TXChorusErrorTrtcCloudNotFound,
        TXChorusErrorRestrictedToLeadSinger,
        TXChorusErrorMusicPreloadRequired,
        TXChorusErrorMusicLoadFailed,
        TXChorusErrorMusicDecodeFailed,
        TXChorusErrorEnterRoomFailed,
        TXChorusErrorRoomDisconnected,
        TXChorusErrorTrtcError
    }

    public static class TXChorusExternalMusicParams {
        public String musicUrl = null;
        public boolean isEncrypted = false;
        public int encryptBlockLength = 0;
    }

    public static class TXChorusLyricCharacter {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public String utf8Character = null;
    }

    public enum TXChorusMusicTrack {
        TXChorusAccompaniment,
        TXChorusOriginalSong
    }

    public enum TXChorusRole {
        TXChorusRoleLeadSinger,
        TXChorusRoleBackSinger,
        TXChorusRoleAnchor,
        TXChorusRoleAudience
    }

    public static class TXLyricLine {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public List<TXChorusLyricCharacter> characterArray = null;
    }

    public static class TXReferencePitch {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public int referencePitch = 0;
    }

    public static TXChorusMusicPlayer create(TRTCCloud tRTCCloud, String str, ITXChorusPlayerListener iTXChorusPlayerListener) {
        return TXChorusMusicPlayerImpl.create(tRTCCloud, str, iTXChorusPlayerListener);
    }

    public abstract void destroy();

    public abstract void loadExternalMusic(TXChorusExternalMusicParams tXChorusExternalMusicParams);

    public abstract void loadMusic(TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams);

    public abstract void pause();

    public abstract void resume();

    public abstract void seek(long j10);

    public abstract void setChorusRole(TXChorusRole tXChorusRole, TRTCCloudDef.TRTCParams tRTCParams);

    public abstract void setListener(ITXChorusPlayerListener iTXChorusPlayerListener);

    public abstract void setPlayoutVolume(int i10);

    public abstract void setPublishVolume(int i10);

    public abstract void start();

    public abstract void stop();

    public abstract void switchMusicTrack(TXChorusMusicTrack tXChorusMusicTrack);
}
