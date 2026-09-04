package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum RemoteAudioStateChangeReason {
    REMOTE_AUDIO_STATE_CHANGE_REASON_INTERNAL(0),
    REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_CONGESTION(1),
    REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_RECOVERY(2),
    REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_MUTED(3),
    REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_UNMUTED(4),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_MUTED(5),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_UNMUTED(6),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_OFFLINE(7);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.RemoteAudioStateChangeReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason;

        static {
            int[] iArr = new int[RemoteAudioStateChangeReason.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason = iArr;
            try {
                iArr[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_CONGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_MUTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_UNMUTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_MUTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_UNMUTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[RemoteAudioStateChangeReason.REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_OFFLINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    RemoteAudioStateChangeReason(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static RemoteAudioStateChangeReason fromId(int i10) {
        for (RemoteAudioStateChangeReason remoteAudioStateChangeReason : values()) {
            if (remoteAudioStateChangeReason.value() == i10) {
                return remoteAudioStateChangeReason;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[ordinal()]) {
            case 1:
                return "kRemoteAudioReasonInternal";
            case 2:
                return "kRemoteAudioReasonNetworkCongestion";
            case 3:
                return "kRemoteAudioReasonNetworkRecovery";
            case 4:
                return "kRemoteAudioReasonLocalMuted";
            case 5:
                return "kRemoteAudioReasonLocalUnmuted";
            case 6:
                return "kRemoteAudioReasonRemoteMuted";
            case 7:
                return "kRemoteAudioReasonRemoteUnmuted";
            case 8:
                return "kRemoteAudioReasonRemoteOffline";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
