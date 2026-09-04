package com.tencent.liteav.videobase.utils;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100434b;

    public e(String str, String str2) {
        this.f100433a = str;
        this.f100434b = str2;
    }

    public static int a(String str, int i10) {
        int[] iArr = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        OpenGlUtils.checkGlError("glCompileShader");
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
