package com.tencent.liteav.trtc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TXChorusMusicPlayer;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::chorus")
public class TXChorusMusicPlayerImpl extends TXChorusMusicPlayer {
    private static final String TAG = "TXChorusMusicPlayerImpl";
    private final ChorusPlayerListener mListener = new ChorusPlayerListener(0);
    private long mNativePtr;
    private TRTCCloud mSubTRTCCloud;
    private TRTCCloud mTRTCCloud;

    /* JADX INFO: renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f99854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f99855b;

        static {
            int[] iArr = new int[TXChorusMusicPlayer.TXChorusMusicTrack.values().length];
            f99855b = iArr;
            try {
                iArr[TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusAccompaniment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99855b[TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusOriginalSong.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[TXChorusMusicPlayer.TXChorusRole.values().length];
            f99854a = iArr2;
            try {
                iArr2[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99854a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99854a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAnchor.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99854a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAudience.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class ChorusPlayerListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        TXChorusMusicPlayer.ITXChorusPlayerListener f99856a;

        private ChorusPlayerListener() {
            this.f99856a = null;
        }

        /* synthetic */ ChorusPlayerListener(byte b10) {
            this();
        }

        public void onChorusError(int i10, String str) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusError(TXChorusMusicPlayerImpl.convertIntValueToTXChorusError(i10), str);
            }
        }

        public void onChorusMusicLoadSucceed(String str, List<TXChorusMusicPlayer.TXLyricLine> list, List<TXChorusMusicPlayer.TXReferencePitch> list2) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusMusicLoadSucceed(str, list, list2);
            }
        }

        public void onChorusPaused() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusPaused();
            }
        }

        public void onChorusRequireLoadMusic(String str) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusRequireLoadMusic(str);
            }
        }

        public void onChorusResumed() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusResumed();
            }
        }

        public void onChorusStarted() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusStarted();
            }
        }

        public void onChorusStopped() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusStopped();
            }
        }

        public void onMusicProgressUpdated(long j10, long j11) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onMusicProgressUpdated(j10, j11);
            }
        }

        public void onNetworkQualityUpdated(int i10, int i11, int i12) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onNetworkQualityUpdated(i10, i11, i12);
            }
        }

        public void onVoicePitchUpdated(int i10, boolean z10, long j10) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onVoicePitchUpdated(i10, z10, j10);
            }
        }

        public void onVoiceScoreUpdated(int i10, int i11) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onVoiceScoreUpdated(i10, i11);
            }
        }

        public void shouldDecryptAudioData(ByteBuffer byteBuffer) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f99856a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.shouldDecryptAudioData(byteBuffer);
            }
        }
    }

    public static class EnterRoomParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCParams f99857a;

        public EnterRoomParams(TRTCCloudDef.TRTCParams tRTCParams) {
            this.f99857a = tRTCParams;
        }

        public String getBusinessInfo() {
            return this.f99857a.businessInfo;
        }

        public String getPrivateMapKey() {
            return this.f99857a.privateMapKey;
        }

        public int getRole() {
            return this.f99857a.role;
        }

        public int getRoomId() {
            return this.f99857a.roomId;
        }

        public int getSdkAppId() {
            return this.f99857a.sdkAppId;
        }

        public String getStrRoomId() {
            return this.f99857a.strRoomId;
        }

        public String getStreamId() {
            return this.f99857a.streamId;
        }

        public String getUserDefineRecordId() {
            return this.f99857a.userDefineRecordId;
        }

        public String getUserId() {
            return this.f99857a.userId;
        }

        public String getUserSig() {
            return this.f99857a.userSig;
        }
    }

    public static class TXChorusLyricCharacterList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<TXChorusMusicPlayer.TXChorusLyricCharacter> f99858a;

        public TXChorusLyricCharacterList(int i10) {
            this.f99858a = new ArrayList(i10);
        }

        public void add(int i10, long j10, long j11, String str) {
            TXChorusMusicPlayer.TXChorusLyricCharacter tXChorusLyricCharacter = new TXChorusMusicPlayer.TXChorusLyricCharacter();
            tXChorusLyricCharacter.startTimeMs = j10;
            tXChorusLyricCharacter.durationMs = j11;
            tXChorusLyricCharacter.utf8Character = str;
            this.f99858a.add(i10, tXChorusLyricCharacter);
        }

        public List<TXChorusMusicPlayer.TXChorusLyricCharacter> getChorusLyricCharacterList() {
            return this.f99858a;
        }
    }

    public static class TXLyricLineList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<TXChorusMusicPlayer.TXLyricLine> f99859a;

        public TXLyricLineList(int i10) {
            this.f99859a = new ArrayList(i10);
        }

        public void add(int i10, long j10, long j11, List<TXChorusMusicPlayer.TXChorusLyricCharacter> list) {
            TXChorusMusicPlayer.TXLyricLine tXLyricLine = new TXChorusMusicPlayer.TXLyricLine();
            tXLyricLine.startTimeMs = j10;
            tXLyricLine.durationMs = j11;
            tXLyricLine.characterArray = list;
            this.f99859a.add(i10, tXLyricLine);
        }

        public List<TXChorusMusicPlayer.TXLyricLine> getLyricLineList() {
            return this.f99859a;
        }
    }

    public static class TXReferencePitchList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<TXChorusMusicPlayer.TXReferencePitch> f99860a;

        public TXReferencePitchList(int i10) {
            this.f99860a = new ArrayList(i10);
        }

        public void add(int i10, long j10, long j11, int i11) {
            TXChorusMusicPlayer.TXReferencePitch tXReferencePitch = new TXChorusMusicPlayer.TXReferencePitch();
            tXReferencePitch.startTimeMs = j10;
            tXReferencePitch.durationMs = j11;
            tXReferencePitch.referencePitch = i11;
            this.f99860a.add(i10, tXReferencePitch);
        }

        public List<TXChorusMusicPlayer.TXReferencePitch> getTXReferencePitchList() {
            return this.f99860a;
        }
    }

    private TXChorusMusicPlayerImpl(TRTCCloud tRTCCloud, String str, TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        long nativePointer;
        long nativePointer2 = 0;
        this.mNativePtr = 0L;
        this.mTRTCCloud = null;
        this.mSubTRTCCloud = null;
        if (tRTCCloud == null) {
            return;
        }
        this.mTRTCCloud = tRTCCloud;
        try {
            nativePointer = parseNativePointer(tRTCCloud.callExperimentalAPI("{\"api\":\"getNativeHandle\"}"));
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "get main trtcCloud native handle fail.", th2);
            nativePointer = 0;
        }
        try {
            TRTCCloud tRTCCloudCreateSubCloud = tRTCCloud.createSubCloud();
            this.mSubTRTCCloud = tRTCCloudCreateSubCloud;
            nativePointer2 = parseNativePointer(tRTCCloudCreateSubCloud.callExperimentalAPI("{\"api\":\"getNativeHandle\"}"));
        } catch (Throwable th3) {
            LiteavLog.e(TAG, "get sub trtcCloud native handle fail.", th3);
        }
        ChorusPlayerListener chorusPlayerListener = this.mListener;
        chorusPlayerListener.f99856a = iTXChorusPlayerListener;
        this.mNativePtr = nativeCreate(nativePointer, nativePointer2, str, chorusPlayerListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TXChorusMusicPlayer.TXChorusError convertIntValueToTXChorusError(int i10) {
        switch (i10) {
            case 1:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorInvalidParameters;
            case 2:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorTrtcCloudNotFound;
            case 3:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorRestrictedToLeadSinger;
            case 4:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicPreloadRequired;
            case 5:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicLoadFailed;
            case 6:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicDecodeFailed;
            case 7:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorEnterRoomFailed;
            case 8:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorRoomDisconnected;
            case 9:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorTrtcError;
            default:
                LiteavLog.w(TAG, "chorus error value is undefined. chorusErrorValue=".concat(String.valueOf(i10)));
                return null;
        }
    }

    public static TXChorusMusicPlayer create(TRTCCloud tRTCCloud, String str, TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        return new TXChorusMusicPlayerImpl(tRTCCloud, str, iTXChorusPlayerListener);
    }

    private static int getTXChorusMusicTrackIntValue(TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack) {
        if (tXChorusMusicTrack == null) {
            LiteavLog.w(TAG, "music track enum is null. musicTrack=".concat(String.valueOf(tXChorusMusicTrack)));
            return -1;
        }
        int i10 = AnonymousClass1.f99855b[tXChorusMusicTrack.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                LiteavLog.w(TAG, "music track enum is unknown. musicTrack=".concat(String.valueOf(tXChorusMusicTrack)));
                return -1;
            }
        }
        return i11;
    }

    private static int getTXChorusRoleIntValue(TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        if (tXChorusRole == null) {
            LiteavLog.w(TAG, "chorus role enum is null. chorusRole=".concat(String.valueOf(tXChorusRole)));
            return -1;
        }
        int i10 = AnonymousClass1.f99854a[tXChorusRole.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        LiteavLog.w(TAG, "chorus role enum is unknown. chorusRole=".concat(String.valueOf(tXChorusRole)));
                        return -1;
                    }
                }
            }
        }
        return i11;
    }

    private static native long nativeCreate(long j10, long j11, String str, ChorusPlayerListener chorusPlayerListener);

    private static native void nativeDestroy(long j10);

    private static native void nativeLoadExternalMusic(long j10, String str, boolean z10, int i10);

    private static native void nativeLoadMusic(long j10, String str, String str2, String str3, String str4);

    private static native void nativePause(long j10);

    private static native void nativeResume(long j10);

    private static native void nativeSeek(long j10, long j11);

    private static native void nativeSetChorusRole(long j10, int i10, EnterRoomParams enterRoomParams);

    private static native void nativeSetPlayoutVolume(long j10, int i10);

    private static native void nativeSetPublishVolume(long j10, int i10);

    private static native void nativeStart(long j10);

    private static native void nativeStop(long j10);

    private static native void nativeSwitchMusicTrack(long j10, int i10);

    private static long parseNativePointer(String str) {
        try {
            BigInteger bigInteger = new BigInteger(str);
            if (bigInteger.bitLength() <= 64) {
                return bigInteger.longValue();
            }
            LiteavLog.e(TAG, "Parsing pointer exceeding 64 bits. native pointer is ".concat(String.valueOf(str)));
            return 0L;
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "Parsing pointer fail. native pointer is ".concat(String.valueOf(str)), th2);
            return 0L;
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void destroy() {
        TRTCCloud tRTCCloud;
        long j10 = this.mNativePtr;
        if (j10 != 0) {
            nativeDestroy(j10);
            this.mNativePtr = 0L;
        }
        TRTCCloud tRTCCloud2 = this.mTRTCCloud;
        if (tRTCCloud2 != null && (tRTCCloud = this.mSubTRTCCloud) != null) {
            tRTCCloud2.destroySubCloud(tRTCCloud);
            this.mSubTRTCCloud = null;
            this.mTRTCCloud = null;
        }
        this.mListener.f99856a = null;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j10 = this.mNativePtr;
        if (j10 != 0) {
            LiteavLog.w(TAG, "object is not destroyed. will be memory leak. native pointer is %#x.", Long.valueOf(j10));
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadExternalMusic(TXChorusMusicPlayer.TXChorusExternalMusicParams tXChorusExternalMusicParams) {
        long j10 = this.mNativePtr;
        if (j10 != 0 && tXChorusExternalMusicParams != null) {
            nativeLoadExternalMusic(j10, tXChorusExternalMusicParams.musicUrl, tXChorusExternalMusicParams.isEncrypted, tXChorusExternalMusicParams.encryptBlockLength);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadMusic(TXChorusMusicPlayer.TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams) {
        long j10 = this.mNativePtr;
        if (j10 != 0 && tXChorusCopyrightedMusicParams != null) {
            nativeLoadMusic(j10, tXChorusCopyrightedMusicParams.musicId, tXChorusCopyrightedMusicParams.playToken, tXChorusCopyrightedMusicParams.copyrightedLicenseKey, tXChorusCopyrightedMusicParams.copyrightedLicenseUrl);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void pause() {
        long j10 = this.mNativePtr;
        if (j10 != 0) {
            nativePause(j10);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void resume() {
        long j10 = this.mNativePtr;
        if (j10 != 0) {
            nativeResume(j10);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void seek(long j10) {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativeSeek(j11, j10);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setChorusRole(TXChorusMusicPlayer.TXChorusRole tXChorusRole, TRTCCloudDef.TRTCParams tRTCParams) {
        if (this.mNativePtr != 0 && tXChorusRole != null) {
            nativeSetChorusRole(this.mNativePtr, getTXChorusRoleIntValue(tXChorusRole), tRTCParams != null ? new EnterRoomParams(tRTCParams) : null);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public void setListener(TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        this.mListener.f99856a = iTXChorusPlayerListener;
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setPlayoutVolume(int i10) {
        long j10 = this.mNativePtr;
        if (j10 != 0) {
            nativeSetPlayoutVolume(j10, i10);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setPublishVolume(int i10) {
        long j10 = this.mNativePtr;
        if (j10 != 0) {
            nativeSetPublishVolume(j10, i10);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void start() {
        long j10 = this.mNativePtr;
        if (j10 != 0) {
            nativeStart(j10);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void stop() {
        long j10 = this.mNativePtr;
        if (j10 != 0) {
            nativeStop(j10);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void switchMusicTrack(TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack) {
        long j10 = this.mNativePtr;
        if (j10 != 0 && tXChorusMusicTrack != null) {
            nativeSwitchMusicTrack(j10, getTXChorusMusicTrackIntValue(tXChorusMusicTrack));
        }
    }
}
