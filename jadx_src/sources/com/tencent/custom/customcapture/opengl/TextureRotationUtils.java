package com.tencent.custom.customcapture.opengl;

/* JADX INFO: loaded from: classes4.dex */
public class TextureRotationUtils {
    public static final float[] TEXTURE_NO_ROTATION = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] TEXTURE_ROTATED_90 = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final float[] TEXTURE_ROTATED_180 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] TEXTURE_ROTATED_270 = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: com.tencent.custom.customcapture.opengl.TextureRotationUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation;

        static {
            int[] iArr = new int[Rotation.values().length];
            $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation = iArr;
            try {
                iArr[Rotation.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation[Rotation.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation[Rotation.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$custom$customcapture$opengl$Rotation[Rotation.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private TextureRotationUtils() {
    }

    private static float flip(float f10) {
        return f10 == 0.0f ? 1.0f : 0.0f;
    }

    public static float[] getRotation(Rotation rotation, boolean z10, boolean z11) {
        float[] fArr;
        int i10 = AnonymousClass1.$SwitchMap$com$tencent$custom$customcapture$opengl$Rotation[rotation.ordinal()];
        if (i10 == 1) {
            fArr = TEXTURE_ROTATED_90;
        } else if (i10 != 2) {
            fArr = i10 != 3 ? TEXTURE_NO_ROTATION : TEXTURE_ROTATED_270;
        } else {
            fArr = TEXTURE_ROTATED_180;
        }
        if (z10) {
            fArr = new float[]{flip(fArr[0]), fArr[1], flip(fArr[2]), fArr[3], flip(fArr[4]), fArr[5], flip(fArr[6]), fArr[7]};
        }
        return z11 ? new float[]{fArr[0], flip(fArr[1]), fArr[2], flip(fArr[3]), fArr[4], flip(fArr[5]), fArr[6], flip(fArr[7])} : fArr;
    }
}
