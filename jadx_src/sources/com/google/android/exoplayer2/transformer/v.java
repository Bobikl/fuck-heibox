package com.google.android.exoplayer2.transformer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TransformerTranscodingVideoRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class v extends q {
    private static final String J = "TransformerTranscodingVideoRenderer";

    @p0
    private SurfaceTexture A;

    @p0
    private Surface B;

    @p0
    private c C;
    private volatile boolean D;
    private boolean E;

    @p0
    private GlUtil.d F;

    @p0
    private c G;
    private boolean H;
    private boolean I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Context f50343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DecoderInputBuffer f50344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float[] f50345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a2 f50346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private EGLDisplay f50347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private EGLContext f50348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private EGLSurface f50349y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f50350z;

    static {
        GlUtil.f51340b = true;
    }

    public v(Context context, e eVar, s sVar, m mVar) {
        super(2, eVar, sVar, mVar);
        this.f50343s = context;
        this.f50344t = new DecoderInputBuffer(2);
        this.f50345u = new float[16];
        this.f50350z = -1;
    }

    @mk.e(expression = {"decoder", "decoderSurfaceTexture"}, result = true)
    @mk.m({"decoderInputFormat"})
    private boolean O() throws ExoPlaybackException {
        if (this.C != null && this.A != null) {
            return true;
        }
        com.google.android.exoplayer2.util.a.i(this.f50350z != -1);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f50350z);
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.transformer.u
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f50342b.V(surfaceTexture2);
            }
        });
        Surface surface = new Surface(surfaceTexture);
        this.B = surface;
        try {
            this.C = c.c(this.f50346v, surface);
            this.A = surfaceTexture;
            return true;
        } catch (IOException e10) {
            throw w(e10, this.f50346v, 4001);
        }
    }

    @mk.d({"encoder"})
    @mk.m({"decoderInputFormat"})
    private void P() throws ExoPlaybackException {
        if (this.G != null) {
            return;
        }
        try {
            a2.b bVarQ = new a2.b().j0(this.f50346v.f43598r).Q(this.f50346v.f43599s);
            String str = this.f50331p.f50290f;
            if (str == null) {
                str = this.f50346v.f43593m;
            }
            this.G = c.d(bVarQ.e0(str).E(), ImmutableMap.v());
        } catch (IOException e10) {
            throw w(e10, this.f50346v, 4001);
        }
    }

    @mk.e(expression = {"decoderInputFormat"}, result = true)
    private boolean Q() {
        if (this.f50346v != null) {
            return true;
        }
        b2 b2VarZ = z();
        if (L(b2VarZ, this.f50344t, 2) != -5) {
            return false;
        }
        this.f50346v = (a2) com.google.android.exoplayer2.util.a.g(b2VarZ.f44366b);
        return true;
    }

    @mk.d({"eglDisplay", "eglSurface", "decoderTextureTransformUniform"})
    @mk.m({"encoder", "decoderInputFormat"})
    private void R() {
        if (this.f50347w == null || this.f50349y == null || this.F == null) {
            c cVar = this.G;
            EGLDisplay eGLDisplayI = GlUtil.i();
            try {
                EGLContext eGLContextH = GlUtil.h(eGLDisplayI);
                this.f50348x = eGLContextH;
                EGLSurface eGLSurfaceN = GlUtil.n(eGLDisplayI, com.google.android.exoplayer2.util.a.g(cVar.g()));
                a2 a2Var = this.f50346v;
                GlUtil.m(eGLDisplayI, eGLContextH, eGLSurfaceN, a2Var.f43598r, a2Var.f43599s);
                this.f50350z = GlUtil.j();
                try {
                    GlUtil.c cVar2 = new GlUtil.c(this.f50343s, "shaders/blit_vertex_shader.glsl", "shaders/copy_external_fragment_shader.glsl");
                    cVar2.i();
                    GlUtil.b[] bVarArrF = cVar2.f();
                    com.google.android.exoplayer2.util.a.j(bVarArrF.length == 2, "Expected program to have two vertex attributes.");
                    for (GlUtil.b bVar : bVarArrF) {
                        if (bVar.f51344a.equals("a_position")) {
                            bVar.b(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f}, 4);
                        } else {
                            if (!bVar.f51344a.equals("a_texcoord")) {
                                throw new IllegalStateException("Unexpected attribute name.");
                            }
                            bVar.b(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f}, 4);
                        }
                        bVar.a();
                    }
                    GlUtil.d[] dVarArrH = cVar2.h();
                    com.google.android.exoplayer2.util.a.j(dVarArrH.length == 2, "Expected program to have two uniforms.");
                    for (GlUtil.d dVar : dVarArrH) {
                        if (dVar.f51350a.equals("tex_sampler")) {
                            dVar.d(this.f50350z, 0);
                            dVar.a();
                        } else {
                            if (!dVar.f51350a.equals("tex_transform")) {
                                throw new IllegalStateException("Unexpected uniform name.");
                            }
                            this.F = dVar;
                        }
                    }
                    com.google.android.exoplayer2.util.a.g(this.F);
                    this.f50347w = eGLDisplayI;
                    this.f50349y = eGLSurfaceN;
                } catch (IOException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (GlUtil.UnsupportedEglVersionException e11) {
                throw new IllegalStateException("EGL version is unsupported", e11);
            }
        }
    }

    private boolean S(c cVar) {
        if (!cVar.m(this.f50344t)) {
            return false;
        }
        this.f50344t.f();
        int iL = L(z(), this.f50344t, 0);
        if (iL == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (iL != -4) {
            return false;
        }
        this.f50330o.a(d(), this.f50344t.f44490g);
        DecoderInputBuffer decoderInputBuffer = this.f50344t;
        decoderInputBuffer.f44490g -= this.f50333r;
        ((ByteBuffer) com.google.android.exoplayer2.util.a.g(decoderInputBuffer.f44488e)).flip();
        cVar.o(this.f50344t);
        return !this.f50344t.k();
    }

    private boolean T(c cVar, c cVar2, SurfaceTexture surfaceTexture, EGLDisplay eGLDisplay, EGLSurface eGLSurface, GlUtil.d dVar) {
        if (cVar.k()) {
            return false;
        }
        if (!this.D) {
            if (!this.E) {
                if (cVar.i() != null) {
                    cVar.r(true);
                    this.E = true;
                }
                if (cVar.k()) {
                    cVar2.s();
                }
            }
            return false;
        }
        this.E = false;
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f50345u);
        dVar.c(this.f50345u);
        dVar.a();
        GLES20.glDrawArrays(5, 0, 4);
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, surfaceTexture.getTimestamp());
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        this.D = false;
        return true;
    }

    private boolean U(c cVar) {
        if (!this.H) {
            a2 a2VarJ = cVar.j();
            if (a2VarJ == null) {
                return false;
            }
            this.H = true;
            this.f50329n.a(a2VarJ);
        }
        if (cVar.k()) {
            this.f50329n.c(d());
            this.I = true;
            return false;
        }
        ByteBuffer byteBufferH = cVar.h();
        if (byteBufferH == null) {
            return false;
        }
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) com.google.android.exoplayer2.util.a.g(cVar.i());
        if (!this.f50329n.h(d(), byteBufferH, (bufferInfo.flags & 1) > 0, bufferInfo.presentationTimeUs)) {
            return false;
        }
        cVar.q();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(SurfaceTexture surfaceTexture) {
        this.D = true;
    }

    @Override // com.google.android.exoplayer2.e
    protected void H() {
        this.f50344t.f();
        this.f50344t.f44488e = null;
        GlUtil.l(this.f50347w, this.f50348x);
        this.f50347w = null;
        this.f50348x = null;
        this.f50349y = null;
        int i10 = this.f50350z;
        if (i10 != -1) {
            GlUtil.k(i10);
        }
        SurfaceTexture surfaceTexture = this.A;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A = null;
        }
        Surface surface = this.B;
        if (surface != null) {
            surface.release();
            this.B = null;
        }
        c cVar = this.C;
        if (cVar != null) {
            cVar.p();
            this.C = null;
        }
        this.D = false;
        this.E = false;
        this.F = null;
        c cVar2 = this.G;
        if (cVar2 != null) {
            cVar2.p();
            this.G = null;
        }
        this.H = false;
        this.I = false;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return this.I;
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public String getName() {
        return J;
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) throws ExoPlaybackException {
        if (this.f50332q && !b() && Q()) {
            P();
            c cVar = this.G;
            R();
            EGLDisplay eGLDisplay = this.f50347w;
            EGLSurface eGLSurface = this.f50349y;
            GlUtil.d dVar = this.F;
            if (O()) {
                c cVar2 = this.C;
                SurfaceTexture surfaceTexture = this.A;
                while (U(cVar)) {
                }
                while (T(cVar2, cVar, surfaceTexture, eGLDisplay, eGLSurface, dVar)) {
                }
                while (S(cVar2)) {
                }
            }
        }
    }
}
