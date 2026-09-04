package com.tencent.custom.customcapture.opengl;

/* JADX INFO: loaded from: classes4.dex */
public enum Rotation {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;

    /* JADX INFO: renamed from: com.tencent.custom.customcapture.opengl.Rotation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation;

        static {
            int[] iArr = new int[Rotation.values().length];
            $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation = iArr;
            try {
                iArr[Rotation.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation[Rotation.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation[Rotation.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation[Rotation.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Rotation fromInt(int i10) {
        if (i10 == 0) {
            return NORMAL;
        }
        if (i10 == 90) {
            return ROTATION_90;
        }
        if (i10 == 180) {
            return ROTATION_180;
        }
        if (i10 != 270) {
            return i10 != 360 ? NORMAL : NORMAL;
        }
        return ROTATION_270;
    }

    public int asInt() {
        int i10 = AnonymousClass1.$SwitchMap$com$tencent$custom$customcapture$opengl$Rotation[ordinal()];
        if (i10 == 2) {
            return 90;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 270;
        }
        return 180;
    }
}
