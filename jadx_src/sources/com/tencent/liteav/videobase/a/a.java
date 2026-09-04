package com.tencent.liteav.videobase.a;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.frame.c;
import com.tencent.liteav.videobase.frame.d;
import com.tencent.liteav.videobase.frame.e;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f100215h = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f100216i = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Size f100217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f100218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f100219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f100220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f100221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f100222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f100223g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.tencent.liteav.videobase.utils.a f100224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.tencent.liteav.videobase.utils.e f100225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f100226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c f100227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f100228n;

    public a() {
        this(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public a(String str, String str2) {
        this.f100217a = new Size(-1, -1);
        this.f100222f = -1;
        this.f100227m = new c();
        this.f100224j = new com.tencent.liteav.videobase.utils.a();
        this.f100225k = new com.tencent.liteav.videobase.utils.e(str, str2);
    }

    public int a() {
        return bb.c.e.F;
    }

    protected void a(int i10) {
    }

    public final void a(int i10, int i11) {
        Size size = this.f100217a;
        size.width = i10;
        size.height = i11;
    }

    public void a(int i10, d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.f100228n) {
            GLES20.glUseProgram(this.f100222f);
            this.f100224j.a();
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f100218b, 2, bb.c.f.f32240ed, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f100218b);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f100220d, 2, bb.c.f.f32240ed, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f100220d);
            if (i10 != -1) {
                GLES20.glActiveTexture(33984);
                OpenGlUtils.bindTexture(a(), i10);
                GLES20.glUniform1i(this.f100219c, 0);
            }
            if (dVar != null) {
                this.f100227m.a(dVar.a());
                this.f100227m.b();
            } else {
                OpenGlUtils.bindFramebuffer(36160, 0);
            }
            float[] fArr = this.f100223g;
            if (fArr == null) {
                fArr = f100215h;
            }
            GLES20.glUniformMatrix4fv(this.f100226l, 1, false, fArr, 0);
            a(i10);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f100218b);
            GLES20.glDisableVertexAttribArray(this.f100220d);
            GLES20.glActiveTexture(33984);
            OpenGlUtils.bindTexture(a(), 0);
            if (dVar != null) {
                OpenGlUtils.bindFramebuffer(36160, 0);
                this.f100227m.c();
            }
        }
    }

    public final void a(e eVar) {
        if (this.f100228n) {
            return;
        }
        this.f100227m.a();
        com.tencent.liteav.videobase.utils.e eVar2 = this.f100225k;
        int iA = com.tencent.liteav.videobase.utils.e.a(eVar2.f100433a, 35633);
        int i10 = -1;
        if (iA == 0) {
            LiteavLog.e("Program", "load vertex shader failed.");
        } else {
            int iA2 = com.tencent.liteav.videobase.utils.e.a(eVar2.f100434b, 35632);
            if (iA2 == 0) {
                LiteavLog.e("Program", "load fragment shader failed.");
                GLES20.glDeleteShader(iA);
            } else {
                int iGlCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(iGlCreateProgram, iA);
                GLES20.glAttachShader(iGlCreateProgram, iA2);
                GLES20.glLinkProgram(iGlCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    LiteavLog.e("Program", "link program failed. status: " + iArr[0]);
                    GLES20.glDeleteShader(iA);
                    GLES20.glDeleteShader(iA2);
                    GLES20.glDeleteProgram(iGlCreateProgram);
                } else {
                    GLES20.glDeleteShader(iA);
                    GLES20.glDeleteShader(iA2);
                    i10 = iGlCreateProgram;
                }
            }
        }
        this.f100222f = i10;
        this.f100218b = GLES20.glGetAttribLocation(i10, CommonNetImpl.POSITION);
        this.f100219c = GLES20.glGetUniformLocation(this.f100222f, "inputImageTexture");
        this.f100220d = GLES20.glGetAttribLocation(this.f100222f, "inputTextureCoordinate");
        this.f100226l = GLES20.glGetUniformLocation(this.f100222f, "textureTransform");
        b(eVar);
        this.f100228n = true;
        LiteavLog.d("TXCGPUImageFilter", "%s initialized, count: %d", this, Integer.valueOf(f100216i.incrementAndGet()));
    }

    public final void a(Runnable runnable) {
        com.tencent.liteav.videobase.utils.a aVar = this.f100224j;
        synchronized (aVar.f100403a) {
            aVar.f100403a.add(runnable);
        }
    }

    public final void b() {
        if (this.f100228n) {
            this.f100224j.a();
            c();
            this.f100228n = false;
            this.f100227m.d();
            int i10 = this.f100222f;
            if (i10 != -1) {
                GLES20.glDeleteProgram(i10);
                this.f100222f = -1;
            }
            LiteavLog.d("TXCGPUImageFilter", "%s uninitialized, count: %d", this, Integer.valueOf(f100216i.decrementAndGet()));
        }
    }

    protected void b(e eVar) {
        this.f100221e = eVar;
    }

    protected void c() {
    }
}
