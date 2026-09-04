package com.google.android.exoplayer2.video.spherical;

import android.opengl.GLES20;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: ProjectionRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f51909j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", z5.g.f141884d};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f51910k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", z5.g.f141884d};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f51911l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f51912m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f51913n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f51914o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float[] f51915p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private a f51917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private a f51918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GlUtil.c f51919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f51923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51924i;

    /* JADX INFO: compiled from: ProjectionRenderer.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f51925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f51926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f51927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f51928d;

        public a(e.c cVar) {
            this.f51925a = cVar.a();
            this.f51926b = GlUtil.g(cVar.f51898c);
            this.f51927c = GlUtil.g(cVar.f51899d);
            int i10 = cVar.f51897b;
            if (i10 == 1) {
                this.f51928d = 5;
            } else if (i10 != 2) {
                this.f51928d = 4;
            } else {
                this.f51928d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.b bVar = eVar.f51890a;
        e.b bVar2 = eVar.f51891b;
        return bVar.b() == 1 && bVar.a(0).f51896a == 0 && bVar2.b() == 1 && bVar2.a(0).f51896a == 0;
    }

    void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f51918c : this.f51917b;
        if (aVar == null) {
            return;
        }
        ((GlUtil.c) com.google.android.exoplayer2.util.a.g(this.f51919d)).i();
        GlUtil.e();
        GLES20.glEnableVertexAttribArray(this.f51922g);
        GLES20.glEnableVertexAttribArray(this.f51923h);
        GlUtil.e();
        int i11 = this.f51916a;
        if (i11 == 1) {
            fArr2 = z10 ? f51913n : f51912m;
        } else if (i11 == 2) {
            fArr2 = z10 ? f51915p : f51914o;
        } else {
            fArr2 = f51911l;
        }
        GLES20.glUniformMatrix3fv(this.f51921f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f51920e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f51924i, 0);
        GlUtil.e();
        GLES20.glVertexAttribPointer(this.f51922g, 3, bb.c.f.f32240ed, false, 12, (Buffer) aVar.f51926b);
        GlUtil.e();
        GLES20.glVertexAttribPointer(this.f51923h, 2, bb.c.f.f32240ed, false, 8, (Buffer) aVar.f51927c);
        GlUtil.e();
        GLES20.glDrawArrays(aVar.f51928d, 0, aVar.f51925a);
        GlUtil.e();
        GLES20.glDisableVertexAttribArray(this.f51922g);
        GLES20.glDisableVertexAttribArray(this.f51923h);
    }

    void b() {
        GlUtil.c cVar = new GlUtil.c(f51909j, f51910k);
        this.f51919d = cVar;
        this.f51920e = cVar.g("uMvpMatrix");
        this.f51921f = this.f51919d.g("uTexMatrix");
        this.f51922g = this.f51919d.e("aPosition");
        this.f51923h = this.f51919d.e("aTexCoords");
        this.f51924i = this.f51919d.g("uTexture");
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f51916a = eVar.f51892c;
            a aVar = new a(eVar.f51890a.a(0));
            this.f51917b = aVar;
            if (!eVar.f51893d) {
                aVar = new a(eVar.f51891b.a(0));
            }
            this.f51918c = aVar;
        }
    }

    void e() {
        GlUtil.c cVar = this.f51919d;
        if (cVar != null) {
            cVar.d();
        }
    }
}
