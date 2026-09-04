package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioRoute {
    AUDIO_ROUTE_DEFAULT(-1),
    AUDIO_ROUTE_HEADSET(1),
    AUDIO_ROUTE_EARPIECE(2),
    AUDIO_ROUTE_SPEAKERPHONE(3),
    AUDIO_ROUTE_HEADSET_BLUETOOTH(4),
    AUDIO_ROUTE_HEADSET_USB(5);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioRoute$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioRoute;

        static {
            int[] iArr = new int[AudioRoute.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioRoute = iArr;
            try {
                iArr[AudioRoute.AUDIO_ROUTE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioRoute[AudioRoute.AUDIO_ROUTE_EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioRoute[AudioRoute.AUDIO_ROUTE_SPEAKERPHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioRoute[AudioRoute.AUDIO_ROUTE_HEADSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioRoute[AudioRoute.AUDIO_ROUTE_HEADSET_USB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioRoute[AudioRoute.AUDIO_ROUTE_HEADSET_BLUETOOTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    AudioRoute(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioRoute fromId(int i10) {
        for (AudioRoute audioRoute : values()) {
            if (audioRoute.value() == i10) {
                return audioRoute;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioRoute[ordinal()]) {
            case 1:
            default:
                return "AUDIO_ROUTE_DEFAULT";
            case 2:
                return "AUDIO_ROUTE_EARPIECE";
            case 3:
                return "AUDIO_ROUTE_SPEAKERPHONE";
            case 4:
                return "AUDIO_ROUTE_HEADSET";
            case 5:
                return "AUDIO_ROUTE_HEADSET_USB";
            case 6:
                return "AUDIO_ROUTE_HEADSET_BLUETOOTH";
        }
    }

    public int value() {
        return this.value;
    }
}
