package com.ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum ByteRTCStreamMixingEvent {
    STREAM_MIXING_BASE(0),
    STREAM_MIXING_START(1),
    STREAM_MIXING_START_SUCCESS(2),
    STREAM_MIXING_START_FAILED(3),
    STREAM_MIXING_UPDATE(4),
    STREAM_MIXING_UPDATE_SUCCESS(5),
    STREAM_MIXING_UPDATE_FAILED(6),
    STREAM_MIXING_STOP(7),
    STREAM_MIXING_STOP_SUCCESS(8),
    STREAM_MIXING_STOP_FAILED(9),
    STREAM_MIXING_CHANGE_MIX_TYPE(10),
    STREAM_MIXING_FIRST_AUDIO_FRAME_BY_CLIENT_MIX(11),
    STREAM_MIXING_FIRST_VIDEO_FRAME_BY_CLIENT_MIX(12),
    STREAM_MIXING_UPDATE_TIMEOUT(13),
    STREAM_MIXING_START_TIMEOUT(14),
    STREAM_MIXING_REQUEST_PARAM_ERROR(15),
    STREAM_MIXING_MIX_IMAGE_EVENT(16),
    STREAM_MIXING_SINGLE_CHORUS_EVENT(17),
    STREAM_MIXING_MAX(18);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent;

        static {
            int[] iArr = new int[ByteRTCStreamMixingEvent.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent = iArr;
            try {
                iArr[ByteRTCStreamMixingEvent.STREAM_MIXING_BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_START_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_START_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_UPDATE_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_UPDATE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_STOP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_STOP_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_STOP_FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_CHANGE_MIX_TYPE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_FIRST_AUDIO_FRAME_BY_CLIENT_MIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_FIRST_VIDEO_FRAME_BY_CLIENT_MIX.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_UPDATE_TIMEOUT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_START_TIMEOUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_REQUEST_PARAM_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_MIX_IMAGE_EVENT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_SINGLE_CHORUS_EVENT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ByteRTCStreamMixingEvent.STREAM_MIXING_MAX.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    ByteRTCStreamMixingEvent(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ByteRTCStreamMixingEvent fromId(int i10) {
        for (ByteRTCStreamMixingEvent byteRTCStreamMixingEvent : values()) {
            if (byteRTCStreamMixingEvent.value() == i10) {
                return byteRTCStreamMixingEvent;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingEvent[ordinal()]) {
            case 1:
                return "STREAM_MIXING_BASE";
            case 2:
                return "STREAM_MIXING_START";
            case 3:
                return "STREAM_MIXING_START_SUCCESS";
            case 4:
                return "STREAM_MIXING_START_FAILED";
            case 5:
                return "STREAM_MIXING_UPDATE";
            case 6:
                return "STREAM_MIXING_UPDATE_SUCCESS";
            case 7:
                return "STREAM_MIXING_UPDATE_FAILED";
            case 8:
                return "STREAM_MIXING_STOP";
            case 9:
                return "STREAM_MIXING_STOP_SUCCESS";
            case 10:
                return "STREAM_MIXING_STOP_FAILED";
            case 11:
                return "STREAM_MIXING_CHANGE_MIX_TYPE";
            case 12:
                return "STREAM_MIXING_FIRST_AUDIO_FRAME_BY_CLIENT_MIX";
            case 13:
                return "STREAM_MIXING_FIRST_VIDEO_FRAME_BY_CLIENT_MIX";
            case 14:
                return "STREAM_MIXING_UPDATE_TIMEOUT";
            case 15:
                return "STREAM_MIXING_START_TIMEOUT";
            case 16:
                return "STREAM_MIXING_REQUEST_PARAM_ERROR";
            case 17:
                return "STREAM_MIXING_MIX_IMAGE_EVENT";
            case 18:
                return "STREAM_MIXING_SINGLE_CHORUS_EVENT";
            case 19:
                return "STREAM_MIXING_MAX";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
