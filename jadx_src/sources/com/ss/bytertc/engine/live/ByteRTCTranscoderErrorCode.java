package com.ss.bytertc.engine.live;

import bb.c;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum ByteRTCTranscoderErrorCode {
    TRANSCODER_ERROR_OK(0),
    TRANSCODER_ERROR_BASE(c.b.Yh),
    TRANSCODER_ERROR_INVALID_PARAM(c.b.Zh),
    TRANSCODER_ERROR_INVALID_STATE(c.b.f30523ai),
    TRANSCODER_ERROR_INVALID_OPERATOR(c.b.f30546bi),
    TRANSCODER_ERROR_TIMEOUT(c.b.f30569ci),
    TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER(c.b.f30593di),
    TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER(c.b.f30616ei),
    TRANSCODER_ERROR_INVALID_STATE_BY_SERVER(c.b.f30639fi),
    TRANSCODER_ERROR_AUTHENTICATION_BY_CDN(c.b.f30662gi),
    TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING(1099),
    TRANSCODER_ERROR_MIX_IMAGE_FAIL(1100),
    TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER(1101),
    TRANSCODER_ERROR_STREAM_SYNC_WORSE(1102),
    TRANSCODER_ERROR_MAX(c.b.f30595dk);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode;

        static {
            int[] iArr = new int[ByteRTCTranscoderErrorCode.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode = iArr;
            try {
                iArr[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_BASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_PARAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_OPERATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_STATE_BY_SERVER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_AUTHENTICATION_BY_CDN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_MIX_IMAGE_FAIL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_STREAM_SYNC_WORSE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_MAX.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    ByteRTCTranscoderErrorCode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ByteRTCTranscoderErrorCode fromId(int i10) {
        for (ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode : values()) {
            if (byteRTCTranscoderErrorCode.value() == i10) {
                return byteRTCTranscoderErrorCode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ordinal()]) {
            case 1:
                return "TRANSCODER_ERROR_OK";
            case 2:
                return "TRANSCODER_ERROR_BASE";
            case 3:
                return "TRANSCODER_ERROR_INVALID_PARAM";
            case 4:
                return "TRANSCODER_ERROR_INVALID_STATE";
            case 5:
                return "TRANSCODER_ERROR_INVALID_OPERATOR";
            case 6:
                return "TRANSCODER_ERROR_TIMEOUT";
            case 7:
                return "TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER";
            case 8:
                return "TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER";
            case 9:
                return "TRANSCODER_ERROR_INVALID_STATE_BY_SERVER";
            case 10:
                return "TRANSCODER_ERROR_AUTHENTICATION_BY_CDN";
            case 11:
                return "TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING";
            case 12:
                return "TRANSCODER_ERROR_MIX_IMAGE_FAIL";
            case 13:
                return "TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER";
            case 14:
                return "TRANSCODER_ERROR_STREAM_SYNC_WORSE";
            case 15:
                return "TRANSCODER_ERROR_MAX";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
