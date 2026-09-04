package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class GlUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51339a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f51340b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f51341c = "GlUtil";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f51342d = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f51343e = "EGL_KHR_surfaceless_context";

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    public static final class UnsupportedEglVersionException extends Exception {
    }

    @androidx.annotation.w0(17)
    public static final class a {
        private a() {
        }

        @androidx.annotation.u
        public static EGLContext a(EGLDisplay eGLDisplay) throws UnsupportedEglVersionException {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, e(eGLDisplay), EGL14.EGL_NO_CONTEXT, new int[]{bb.c.m.co, 2, bb.c.m.km}, 0);
            if (eGLContextEglCreateContext != null) {
                GlUtil.e();
                return eGLContextEglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new UnsupportedEglVersionException();
        }

        @androidx.annotation.u
        public static EGLDisplay b() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.d(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
                GlUtil.s("Error in eglInitialize.");
            }
            GlUtil.e();
            return eGLDisplayEglGetDisplay;
        }

        @androidx.annotation.u
        public static void c(@androidx.annotation.p0 EGLDisplay eGLDisplay, @androidx.annotation.p0 EGLContext eGLContext) {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            int iEglGetError = EGL14.eglGetError();
            boolean z10 = iEglGetError == 12288;
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Error releasing context: ");
            sb2.append(iEglGetError);
            GlUtil.d(z10, sb2.toString());
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                int iEglGetError2 = EGL14.eglGetError();
                boolean z11 = iEglGetError2 == 12288;
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Error destroying context: ");
                sb3.append(iEglGetError2);
                GlUtil.d(z11, sb3.toString());
            }
            EGL14.eglReleaseThread();
            int iEglGetError3 = EGL14.eglGetError();
            boolean z12 = iEglGetError3 == 12288;
            StringBuilder sb4 = new StringBuilder(35);
            sb4.append("Error releasing thread: ");
            sb4.append(iEglGetError3);
            GlUtil.d(z12, sb4.toString());
            EGL14.eglTerminate(eGLDisplay);
            int iEglGetError4 = EGL14.eglGetError();
            boolean z13 = iEglGetError4 == 12288;
            StringBuilder sb5 = new StringBuilder(38);
            sb5.append("Error terminating display: ");
            sb5.append(iEglGetError4);
            GlUtil.d(z13, sb5.toString());
        }

        @androidx.annotation.u
        public static void d(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != 0) {
                GLES20.glBindFramebuffer(36160, 0);
            }
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GLES20.glViewport(0, 0, i10, i11);
        }

        @androidx.annotation.u
        private static EGLConfig e(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{bb.c.m.sm, 4, bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.Rl, 0, bb.c.m.Sl, 0, bb.c.m.km}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                GlUtil.s("eglChooseConfig failed.");
            }
            return eGLConfigArr[0];
        }

        @androidx.annotation.u
        public static EGLSurface f(EGLDisplay eGLDisplay, Object obj) {
            return EGL14.eglCreateWindowSurface(eGLDisplay, e(eGLDisplay), obj, new int[]{bb.c.m.km}, 0);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f51345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f51346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private Buffer f51347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51348e;

        public b(String str, int i10, int i11) {
            this.f51344a = str;
            this.f51345b = i10;
            this.f51346c = i11;
        }

        public void a() {
            Buffer buffer = (Buffer) com.google.android.exoplayer2.util.a.h(this.f51347d, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f51346c, this.f51348e, bb.c.f.f32240ed, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f51345b);
            GlUtil.e();
        }

        public void b(float[] fArr, int i10) {
            this.f51347d = GlUtil.g(fArr);
            this.f51348e = i10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f51349a;

        public c(Context context, String str, String str2) throws IOException {
            this(GlUtil.q(context, str), GlUtil.q(context, str2));
        }

        public c(String str, String str2) {
            this.f51349a = GLES20.glCreateProgram();
            GlUtil.e();
            a(35633, str);
            a(35632, str2);
        }

        public c(String[] strArr, String[] strArr2) {
            this(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
        }

        private void a(int i10, String str) {
            int iGlCreateShader = GLES20.glCreateShader(i10);
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strGlGetShaderInfoLog).length() + 10 + String.valueOf(str).length());
                sb2.append(strGlGetShaderInfoLog);
                sb2.append(", source: ");
                sb2.append(str);
                GlUtil.s(sb2.toString());
            }
            GLES20.glAttachShader(this.f51349a, iGlCreateShader);
            GLES20.glDeleteShader(iGlCreateShader);
            GlUtil.e();
        }

        private b b(int i10) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f51349a, 35722, iArr, 0);
            int i11 = iArr[0];
            byte[] bArr = new byte[i11];
            int[] iArr2 = new int[1];
            int i12 = this.f51349a;
            GLES20.glGetActiveAttrib(i12, i10, i11, iArr2, 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlUtil.r(bArr));
            return new b(str, i10, e(str));
        }

        private d c(int i10) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f51349a, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i11 = iArr[0];
            byte[] bArr = new byte[i11];
            int i12 = this.f51349a;
            GLES20.glGetActiveUniform(i12, i10, i11, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlUtil.r(bArr));
            return new d(str, g(str), iArr2[0]);
        }

        public void d() {
            GLES20.glDeleteProgram(this.f51349a);
        }

        public int e(String str) {
            return GLES20.glGetAttribLocation(this.f51349a, str);
        }

        public b[] f() {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f51349a, 35721, iArr, 0);
            int i10 = iArr[0];
            if (i10 != 2) {
                throw new IllegalStateException("Expected two attributes.");
            }
            b[] bVarArr = new b[i10];
            for (int i11 = 0; i11 < iArr[0]; i11++) {
                bVarArr[i11] = b(i11);
            }
            return bVarArr;
        }

        public int g(String str) {
            return GLES20.glGetUniformLocation(this.f51349a, str);
        }

        public d[] h() {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f51349a, 35718, iArr, 0);
            d[] dVarArr = new d[iArr[0]];
            for (int i10 = 0; i10 < iArr[0]; i10++) {
                dVarArr[i10] = c(i10);
            }
            return dVarArr;
        }

        public void i() {
            GLES20.glLinkProgram(this.f51349a);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.f51349a, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(this.f51349a));
                GlUtil.s(strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
            }
            GlUtil.e();
            GLES20.glUseProgram(this.f51349a);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f51351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f51352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f51353d = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f51355f;

        public d(String str, int i10, int i11) {
            this.f51350a = str;
            this.f51351b = i10;
            this.f51352c = i11;
        }

        public void a() {
            int i10 = this.f51352c;
            if (i10 == 5126) {
                GLES20.glUniform1fv(this.f51351b, 1, this.f51353d, 0);
                GlUtil.e();
                return;
            }
            if (i10 == 35676) {
                GLES20.glUniformMatrix4fv(this.f51351b, 1, false, this.f51353d, 0);
                GlUtil.e();
                return;
            }
            if (this.f51354e == 0) {
                throw new IllegalStateException("Call setSamplerTexId before bind.");
            }
            GLES20.glActiveTexture(this.f51355f + 33984);
            int i11 = this.f51352c;
            if (i11 == 36198) {
                GLES20.glBindTexture(36197, this.f51354e);
            } else {
                if (i11 != 35678) {
                    int i12 = this.f51352c;
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("Unexpected uniform type: ");
                    sb2.append(i12);
                    throw new IllegalStateException(sb2.toString());
                }
                GLES20.glBindTexture(bb.c.e.F, this.f51354e);
            }
            GLES20.glUniform1i(this.f51351b, this.f51355f);
            GLES20.glTexParameteri(bb.c.e.F, 10240, bb.c.k.mz);
            GLES20.glTexParameteri(bb.c.e.F, bb.c.l.D5, bb.c.k.mz);
            GLES20.glTexParameteri(bb.c.e.F, bb.c.l.E5, 33071);
            GLES20.glTexParameteri(bb.c.e.F, bb.c.l.F5, 33071);
            GlUtil.e();
        }

        public void b(float f10) {
            this.f51353d[0] = f10;
        }

        public void c(float[] fArr) {
            System.arraycopy(fArr, 0, this.f51353d, 0, fArr.length);
        }

        public void d(int i10, int i11) {
            this.f51354e = i10;
            this.f51355f = i11;
        }
    }

    private GlUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(boolean z10, String str) {
        if (z10) {
            return;
        }
        s(str);
    }

    public static void e() {
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            u.d(f51341c, strValueOf.length() != 0 ? "glError ".concat(strValueOf) : new String("glError "));
            i10 = iGlGetError;
        }
        if (i10 != 0) {
            String strValueOf2 = String.valueOf(GLU.gluErrorString(i10));
            s(strValueOf2.length() != 0 ? "glError ".concat(strValueOf2) : new String("glError "));
        }
    }

    public static FloatBuffer f(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer g(float[] fArr) {
        return (FloatBuffer) f(fArr.length).put(fArr).flip();
    }

    @androidx.annotation.w0(17)
    public static EGLContext h(EGLDisplay eGLDisplay) throws UnsupportedEglVersionException {
        return a.a(eGLDisplay);
    }

    @androidx.annotation.w0(17)
    public static EGLDisplay i() {
        return a.b();
    }

    public static int j() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, bb.c.l.D5, bb.c.k.mz);
        GLES20.glTexParameteri(36197, 10240, bb.c.k.mz);
        GLES20.glTexParameteri(36197, bb.c.l.E5, 33071);
        GLES20.glTexParameteri(36197, bb.c.l.F5, 33071);
        e();
        return iArr[0];
    }

    public static void k(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        e();
    }

    @androidx.annotation.w0(17)
    public static void l(@androidx.annotation.p0 EGLDisplay eGLDisplay, @androidx.annotation.p0 EGLContext eGLContext) {
        a.c(eGLDisplay, eGLContext);
    }

    @androidx.annotation.w0(17)
    public static void m(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) {
        a.d(eGLDisplay, eGLContext, eGLSurface, i10, i11);
    }

    @androidx.annotation.w0(17)
    public static EGLSurface n(EGLDisplay eGLDisplay, Object obj) {
        return a.f(eGLDisplay, obj);
    }

    public static boolean o(Context context) {
        String strEglQueryString;
        int i10 = u0.f51536a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(u0.f51538c) || "XT1650".equals(u0.f51539d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), bb.c.m.Nm)) != null && strEglQueryString.contains(f51342d);
        }
        return false;
    }

    public static boolean p() {
        String strEglQueryString;
        return u0.f51536a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), bb.c.m.Nm)) != null && strEglQueryString.contains(f51343e);
    }

    public static String q(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return u0.I(u0.v1(inputStreamOpen));
        } finally {
            u0.p(inputStreamOpen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(String str) {
        u.d(f51341c, str);
        if (f51340b) {
            throw new GlException(str);
        }
    }
}
