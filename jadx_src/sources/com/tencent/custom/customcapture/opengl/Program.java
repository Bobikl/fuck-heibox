package com.tencent.custom.customcapture.opengl;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class Program {
    private static final int INVALID_PROGRAM_ID = -1;
    private static final String TAG = "Program";
    private final String mFragmentShader;
    private int mProgramId = -1;
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
        return 0;
    }

    public void build() {
        int[] iArr = new int[1];
        int iLoadShader = loadShader(this.mVertexShader, 35633);
        if (iLoadShader == 0) {
            Log.e(TAG, "load vertex shader failed.");
            return;
        }
        int iLoadShader2 = loadShader(this.mFragmentShader, 35632);
        if (iLoadShader2 == 0) {
            Log.e(TAG, "load fragment shader failed.");
            return;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] > 0) {
            GLES20.glDeleteShader(iLoadShader);
            GLES20.glDeleteShader(iLoadShader2);
            this.mProgramId = iGlCreateProgram;
        } else {
            Log.e(TAG, "link program failed. status: " + iArr[0]);
        }
    }

    public void destroy() {
        GLES20.glDeleteProgram(this.mProgramId);
        this.mProgramId = -1;
    }

    public int getProgramId() {
        return this.mProgramId;
    }
}
