package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f51678b;

    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f51682o = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f51684q = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final GLSurfaceView f51686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f51687c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f51688d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f51689e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f51690f = new int[3];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AtomicReference<com.google.android.exoplayer2.decoder.m> f51691g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final FloatBuffer[] f51692h = new FloatBuffer[3];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private GlUtil.c f51693i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f51694j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.google.android.exoplayer2.decoder.m f51695k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f51679l = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final float[] f51680m = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final float[] f51681n = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String[] f51683p = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final FloatBuffer f51685r = GlUtil.g(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        public a(GLSurfaceView gLSurfaceView) {
            this.f51686b = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f51689e;
                this.f51690f[i10] = -1;
                iArr[i10] = -1;
            }
        }

        @mk.m({"program"})
        private void b() {
            GLES20.glGenTextures(3, this.f51687c, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                GLES20.glUniform1i(this.f51693i.g(f51683p[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(bb.c.e.F, this.f51687c[i10]);
                GLES20.glTexParameterf(bb.c.e.F, bb.c.l.D5, 9729.0f);
                GLES20.glTexParameterf(bb.c.e.F, 10240, 9729.0f);
                GLES20.glTexParameterf(bb.c.e.F, bb.c.l.E5, 33071.0f);
                GLES20.glTexParameterf(bb.c.e.F, bb.c.l.F5, 33071.0f);
            }
            GlUtil.e();
        }

        public void a(com.google.android.exoplayer2.decoder.m mVar) {
            com.google.android.exoplayer2.decoder.m andSet = this.f51691g.getAndSet(mVar);
            if (andSet != null) {
                andSet.n();
            }
            this.f51686b.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            com.google.android.exoplayer2.decoder.m andSet = this.f51691g.getAndSet(null);
            if (andSet == null && this.f51695k == null) {
                return;
            }
            if (andSet != null) {
                com.google.android.exoplayer2.decoder.m mVar = this.f51695k;
                if (mVar != null) {
                    mVar.n();
                }
                this.f51695k = andSet;
            }
            com.google.android.exoplayer2.decoder.m mVar2 = (com.google.android.exoplayer2.decoder.m) com.google.android.exoplayer2.util.a.g(this.f51695k);
            float[] fArr = f51680m;
            int i10 = mVar2.f44577m;
            if (i10 == 1) {
                fArr = f51679l;
            } else if (i10 == 3) {
                fArr = f51681n;
            }
            GLES20.glUniformMatrix3fv(this.f51694j, 1, false, fArr, 0);
            int[] iArr = (int[]) com.google.android.exoplayer2.util.a.g(mVar2.f44576l);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) com.google.android.exoplayer2.util.a.g(mVar2.f44575k);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? mVar2.f44573i : (mVar2.f44573i + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(bb.c.e.F, this.f51687c[i11]);
                GLES20.glPixelStorei(bb.c.d.On, 1);
                GLES20.glTexImage2D(bb.c.e.F, 0, bb.c.f.PB, iArr[i11], i12, 0, bb.c.f.PB, bb.c.f.Zc, byteBufferArr[i11]);
                i11++;
            }
            int i13 = mVar2.f44572h;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f51689e[i15] != iArr2[i15] || this.f51690f[i15] != iArr[i15]) {
                    com.google.android.exoplayer2.util.a.i(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    this.f51692h[i15] = GlUtil.g(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f51688d[i15], 2, bb.c.f.f32240ed, false, 0, (Buffer) this.f51692h[i15]);
                    this.f51689e[i15] = iArr2[i15];
                    this.f51690f[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            GlUtil.e();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            GlUtil.c cVar = new GlUtil.c(f51682o, f51684q);
            this.f51693i = cVar;
            cVar.i();
            int iE = this.f51693i.e("in_pos");
            GLES20.glEnableVertexAttribArray(iE);
            GLES20.glVertexAttribPointer(iE, 2, bb.c.f.f32240ed, false, 0, (Buffer) f51685r);
            this.f51688d[0] = this.f51693i.e("in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f51688d[0]);
            this.f51688d[1] = this.f51693i.e("in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f51688d[1]);
            this.f51688d[2] = this.f51693i.e("in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f51688d[2]);
            GlUtil.e();
            this.f51694j = this.f51693i.g("mColorConversion");
            GlUtil.e();
            b();
            GlUtil.e();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderGLSurfaceView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f51678b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public i getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // com.google.android.exoplayer2.video.i
    public void setOutputBuffer(com.google.android.exoplayer2.decoder.m mVar) {
        this.f51678b.a(mVar);
    }
}
