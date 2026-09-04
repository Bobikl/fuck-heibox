package com.ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum PlayState {
    PLAYING(1),
    PAUSED(2),
    STOPPED(3),
    FAILED(4),
    FINISHED(5);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.PlayState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$PlayState;

        static {
            int[] iArr = new int[PlayState.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$PlayState = iArr;
            try {
                iArr[PlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    PlayState(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static PlayState fromId(int i10) {
        for (PlayState playState : values()) {
            if (playState.value() == i10) {
                return playState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$PlayState[ordinal()];
        if (i10 == 1) {
            return "PLAY_STATE_PLAYING";
        }
        if (i10 == 2) {
            return "PLAY_STATE_PAUSED";
        }
        if (i10 == 3) {
            return "PLAY_STATE_STOPPED";
        }
        if (i10 != 4) {
            return i10 != 5 ? "" : "PLAY_STATE_FINISHED";
        }
        return "PLAY_STATE_FAILED";
    }

    public int value() {
        return this.value;
    }
}
