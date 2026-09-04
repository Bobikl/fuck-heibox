package com.tencent.custom.customcapture.opengl;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.ImageView;
import bb.c;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class OpenGlUtils {
    public static final int NO_TEXTURE = -1;
    static final String TAG = "OpenGlUtils";
    public static final float[] CUBE = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] TEXTURE = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    private static float addDistance(float f10, float f11) {
        return f10 == 0.0f ? f11 : 1.0f - f11;
    }

    public static void bindTexture(int i10, int i11) {
        GLES20.glBindTexture(i10, i11);
        checkGlError("bindTexture");
    }

    public static Pair<float[], float[]> calcCubeAndTextureBuffer(ImageView.ScaleType scaleType, Rotation rotation, boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = rotation == Rotation.ROTATION_90 || rotation == Rotation.ROTATION_270;
        float f10 = i12;
        float f11 = z11 ? i11 : i10;
        float f12 = i13;
        float f13 = z11 ? i10 : i11;
        float fMax = Math.max((f10 * 1.0f) / f11, (f12 * 1.0f) / f13);
        float fRound = (Math.round(f11 * fMax) * 1.0f) / f10;
        float fRound2 = (Math.round(f13 * fMax) * 1.0f) / f12;
        float[] fArr = CUBE;
        float[] rotation2 = TextureRotationUtils.getRotation(rotation, z10, true);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float f14 = (1.0f - (z11 ? 1.0f / fRound2 : 1.0f / fRound)) / 2.0f;
            float f15 = (1.0f - (z11 ? 1.0f / fRound : 1.0f / fRound2)) / 2.0f;
            rotation2 = new float[]{addDistance(rotation2[0], f14), addDistance(rotation2[1], f15), addDistance(rotation2[2], f14), addDistance(rotation2[3], f15), addDistance(rotation2[4], f14), addDistance(rotation2[5], f15), addDistance(rotation2[6], f14), addDistance(rotation2[7], f15)};
        } else {
            fArr = new float[]{fArr[0] / fRound2, fArr[1] / fRound, fArr[2] / fRound2, fArr[3] / fRound, fArr[4] / fRound2, fArr[5] / fRound, fArr[6] / fRound2, fArr[7] / fRound};
        }
        return new Pair<>(fArr, rotation2);
    }

    public static void checkGlError(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            } else {
                Log.e(TAG, String.format("%s: glError %s", str, GLUtils.getEGLErrorString(iGlGetError)));
            }
        }
    }

    public static void deleteFrameBuffer(int i10) {
        if (-1 == i10) {
            return;
        }
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        Log.d(TAG, "delete frame buffer id: " + i10);
    }

    public static void deleteTexture(int i10) {
        if (-1 == i10) {
            return;
        }
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        Log.d(TAG, "delete textureId " + i10);
    }

    public static int generateFrameBufferId() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static int generateTextureOES() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, c.l.D5, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, c.l.E5, 33071);
        GLES20.glTexParameteri(36197, c.l.F5, 33071);
        return iArr[0];
    }

    public static int loadTexture(int i10, Buffer buffer, int i11, int i12, int i13) {
        int[] iArr = new int[1];
        if (i13 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            Log.d(TAG, "glGenTextures textureId: " + iArr[0]);
            bindTexture(c.e.F, iArr[0]);
            GLES20.glTexParameterf(c.e.F, 10240, 9729.0f);
            GLES20.glTexParameterf(c.e.F, c.l.D5, 9729.0f);
            GLES20.glTexParameterf(c.e.F, c.l.E5, 33071.0f);
            GLES20.glTexParameterf(c.e.F, c.l.F5, 33071.0f);
            GLES20.glTexImage2D(c.e.F, 0, i10, i11, i12, 0, i10, c.f.Zc, buffer);
        } else {
            bindTexture(c.e.F, i13);
            GLES20.glTexSubImage2D(c.e.F, 0, 0, 0, i11, i12, i10, c.f.Zc, buffer);
            iArr[0] = i13;
        }
        return iArr[0];
    }
}
