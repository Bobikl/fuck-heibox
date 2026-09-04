package com.tencent.ugc.videobase.utils;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
public class Program {
    private static final String TAG = "Program";
    private final String mFragmentShader;
    private final String mVertexShader;

    public Program(String str, String str2) {
        this.mVertexShader = str;
        this.mFragmentShader = str2;
    }

    private int loadShader(String str, int i10) {
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

    public int build() {
        int iLoadShader = loadShader(this.mVertexShader, 35633);
        if (iLoadShader == 0) {
            LiteavLog.e(TAG, "load vertex shader failed.");
            return -1;
        }
        int iLoadShader2 = loadShader(this.mFragmentShader, 35632);
        if (iLoadShader2 == 0) {
            LiteavLog.e(TAG, "load fragment shader failed.");
            GLES20.glDeleteShader(iLoadShader);
            return -1;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            GLES20.glDeleteShader(iLoadShader);
            GLES20.glDeleteShader(iLoadShader2);
            return iGlCreateProgram;
        }
        LiteavLog.e(TAG, "link program failed. status: " + iArr[0]);
        GLES20.glDeleteShader(iLoadShader);
        GLES20.glDeleteShader(iLoadShader2);
        GLES20.glDeleteProgram(iGlCreateProgram);
        return -1;
    }
}
