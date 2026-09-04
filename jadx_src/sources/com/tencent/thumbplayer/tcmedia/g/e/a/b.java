package com.tencent.thumbplayer.tcmedia.g.e.a;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import bb.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f102753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FloatBuffer f102754b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f102757e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f102760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f102762j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f102755c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f102756d = new float[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f102758f = -12345;

    public b() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f102753a = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f102754b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f102756d, 0);
    }

    private int a(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        a("glCreateShader type=".concat(String.valueOf(i10)));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("TextureRender", "Could not compile shader " + i10 + ":");
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e("TextureRender", sb2.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    private int a(String str, String str2) {
        int iA;
        int iA2 = a(35633, str);
        if (iA2 == 0 || (iA = a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            Log.e("TextureRender", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iA);
        a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        Log.e("TextureRender", "Could not link program: ");
        Log.e("TextureRender", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public int a() {
        return this.f102758f;
    }

    public void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        Log.e("TextureRender", str + ": glError " + iGlGetError);
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    public void b() {
        int iA = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.f102757e = iA;
        if (iA == 0) {
            throw new RuntimeException("failed creating program");
        }
        this.f102761i = GLES20.glGetAttribLocation(iA, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.f102761i == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.f102762j = GLES20.glGetAttribLocation(this.f102757e, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (this.f102762j == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.f102759g = GLES20.glGetUniformLocation(this.f102757e, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (this.f102759g == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.f102760h = GLES20.glGetUniformLocation(this.f102757e, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (this.f102760h == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i10 = iArr[0];
        this.f102758f = i10;
        GLES20.glBindTexture(36197, i10);
        a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, c.l.D5, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, c.l.E5, 33071);
        GLES20.glTexParameteri(36197, c.l.F5, 33071);
        a("glTexParameter");
    }
}
