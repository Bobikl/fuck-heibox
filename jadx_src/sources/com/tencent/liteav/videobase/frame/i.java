package com.tencent.liteav.videobase.frame;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.uc.crashsdk.export.LogType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f100377a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f100378b = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f100379c = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float[] f100380d = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f100381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f100382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FloatBuffer f100383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final FloatBuffer f100384h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GLConstants.GLScaleType f100386j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f100390n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.tencent.liteav.videobase.a.a[] f100385i = new com.tencent.liteav.videobase.a.a[GLConstants.PixelFormatType.values().length];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PixelFrame f100387k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.tencent.liteav.videobase.b.a f100388l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.tencent.liteav.videobase.a.a f100389m = null;

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.i$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100391a;

        static {
            int[] iArr = new int[com.tencent.liteav.base.util.l.values().length];
            f100391a = iArr;
            try {
                iArr[com.tencent.liteav.base.util.l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100391a[com.tencent.liteav.base.util.l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100391a[com.tencent.liteav.base.util.l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100391a[com.tencent.liteav.base.util.l.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i(int i10, int i11) {
        this.f100381e = i10;
        this.f100382f = i11;
        float[] fArr = GLConstants.f100240d;
        this.f100383g = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.f100384h = OpenGlUtils.createTextureCoordsBuffer(com.tencent.liteav.base.util.l.NORMAL, false, false);
    }

    private static float a(float f10) {
        return f10 == 0.0f ? 1.0f : 0.0f;
    }

    private static float a(float f10, float f11) {
        return f10 == 0.0f ? f11 : 1.0f - f11;
    }

    private void a(GLConstants.PixelFormatType pixelFormatType, d dVar, ByteBuffer byteBuffer, GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        int iOrdinal = pixelFormatType.ordinal();
        com.tencent.liteav.videobase.a.a[] aVarArr = this.f100385i;
        if (aVarArr[iOrdinal] == null) {
            if (pixelFormatType == GLConstants.PixelFormatType.I420) {
                aVarArr[iOrdinal] = new com.tencent.liteav.videobase.c.a(colorRange, colorSpace);
            } else if (pixelFormatType == GLConstants.PixelFormatType.NV21) {
                aVarArr[iOrdinal] = new com.tencent.liteav.videobase.c.d();
            } else {
                aVarArr[iOrdinal] = new com.tencent.liteav.videobase.c.c();
            }
            this.f100385i[iOrdinal].a((e) null);
        }
        com.tencent.liteav.videobase.c.e eVar = (com.tencent.liteav.videobase.c.e) this.f100385i[iOrdinal];
        eVar.a(this.f100381e, this.f100382f);
        OpenGlUtils.glViewport(0, 0, this.f100381e, this.f100382f);
        if (this.f100387k.getRotation() == com.tencent.liteav.base.util.l.ROTATION_90 || this.f100387k.getRotation() == com.tencent.liteav.base.util.l.ROTATION_270) {
            eVar.a(byteBuffer, this.f100387k.getHeight(), this.f100387k.getWidth());
        } else {
            eVar.a(byteBuffer, this.f100387k.getWidth(), this.f100387k.getHeight());
        }
        eVar.a(-1, dVar, this.f100383g, this.f100384h);
    }

    private void a(d dVar) {
        if (this.f100390n == null) {
            c cVar = new c();
            this.f100390n = cVar;
            cVar.a();
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (dVar == null) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(LogType.UNEXP_RESTART);
            return;
        }
        this.f100390n.a(dVar.a());
        this.f100390n.b();
        GLES20.glClear(LogType.UNEXP_RESTART);
        OpenGlUtils.bindFramebuffer(36160, 0);
        this.f100390n.c();
    }

    private void a(d dVar, int i10) {
        c();
        OpenGlUtils.glViewport(0, 0, this.f100381e, this.f100382f);
        this.f100389m.a(this.f100381e, this.f100382f);
        this.f100389m.a(i10, dVar, this.f100383g, this.f100384h);
    }

    private void a(d dVar, int i10, float[] fArr) {
        if (this.f100388l == null) {
            com.tencent.liteav.videobase.b.a aVar = new com.tencent.liteav.videobase.b.a();
            this.f100388l = aVar;
            aVar.a((e) null);
        }
        OpenGlUtils.glViewport(0, 0, this.f100381e, this.f100382f);
        com.tencent.liteav.videobase.b.a aVar2 = this.f100388l;
        aVar2.f100223g = fArr;
        aVar2.a(this.f100381e, this.f100382f);
        this.f100388l.a(i10, dVar, this.f100383g, this.f100384h);
    }

    private void a(d dVar, Buffer buffer) {
        int iOrdinal = GLConstants.PixelFormatType.RGBA.ordinal();
        com.tencent.liteav.videobase.a.a[] aVarArr = this.f100385i;
        if (aVarArr[iOrdinal] == null) {
            aVarArr[iOrdinal] = new com.tencent.liteav.videobase.b.d();
            this.f100385i[iOrdinal].a((e) null);
        }
        com.tencent.liteav.videobase.b.d dVar2 = (com.tencent.liteav.videobase.b.d) this.f100385i[iOrdinal];
        dVar2.a(this.f100381e, this.f100382f);
        OpenGlUtils.glViewport(0, 0, this.f100381e, this.f100382f);
        if (this.f100387k.getRotation() == com.tencent.liteav.base.util.l.ROTATION_90 || this.f100387k.getRotation() == com.tencent.liteav.base.util.l.ROTATION_270) {
            dVar2.a(buffer, this.f100387k.getHeight(), this.f100387k.getWidth());
        } else {
            dVar2.a(buffer, this.f100387k.getWidth(), this.f100387k.getHeight());
        }
        dVar2.a(-1, dVar, this.f100383g, this.f100384h);
    }

    private static void a(float[] fArr, com.tencent.liteav.base.util.l lVar, boolean z10, boolean z11) {
        float[] fArr2 = f100377a;
        if (lVar != null) {
            int i10 = AnonymousClass1.f100391a[lVar.ordinal()];
            if (i10 == 1) {
                fArr2 = f100378b;
            } else if (i10 == 2) {
                fArr2 = f100380d;
            } else if (i10 == 3) {
                fArr2 = f100379c;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z10) {
            fArr[0] = a(fArr[0]);
            fArr[2] = a(fArr[2]);
            fArr[4] = a(fArr[4]);
            fArr[6] = a(fArr[6]);
        }
        if (z11) {
            fArr[1] = a(fArr[1]);
            fArr[3] = a(fArr[3]);
            fArr[5] = a(fArr[5]);
            fArr[7] = a(fArr[7]);
        }
    }

    private boolean a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        return (gLScaleType == this.f100386j && pixelFrame.getWidth() == this.f100387k.getWidth() && pixelFrame.getHeight() == this.f100387k.getHeight() && pixelFrame.getPixelBufferType() == this.f100387k.getPixelBufferType() && pixelFrame.getPixelFormatType() == this.f100387k.getPixelFormatType() && pixelFrame.isMirrorHorizontal() == this.f100387k.isMirrorHorizontal() && pixelFrame.isMirrorVertical() == this.f100387k.isMirrorVertical() && pixelFrame.getRotation() == this.f100387k.getRotation()) ? false : true;
    }

    private void b() {
        PixelFrame pixelFrame = this.f100387k;
        if (pixelFrame == null) {
            return;
        }
        boolean z10 = pixelFrame.getRotation() == com.tencent.liteav.base.util.l.ROTATION_90 || this.f100387k.getRotation() == com.tencent.liteav.base.util.l.ROTATION_270;
        float width = this.f100387k.getWidth();
        float height = this.f100387k.getHeight();
        float fMax = Math.max((this.f100381e * 1.0f) / width, (this.f100382f * 1.0f) / height);
        float fRound = (Math.round(width * fMax) * 1.0f) / this.f100381e;
        float fRound2 = (Math.round(height * fMax) * 1.0f) / this.f100382f;
        float[] fArr = GLConstants.f100240d;
        float[] fArr2 = new float[8];
        if (this.f100387k.getPixelBufferType() == GLConstants.a.TEXTURE_OES) {
            a(fArr2, this.f100387k.getRotation(), this.f100387k.isMirrorHorizontal(), this.f100387k.isMirrorVertical());
        } else {
            OpenGlUtils.initTextureCoordsBuffer(fArr2, this.f100387k.getRotation(), this.f100387k.isMirrorHorizontal(), this.f100387k.isMirrorVertical());
        }
        GLConstants.GLScaleType gLScaleType = this.f100386j;
        if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
            float f10 = (1.0f - (z10 ? 1.0f / fRound2 : 1.0f / fRound)) / 2.0f;
            float f11 = (1.0f - (z10 ? 1.0f / fRound : 1.0f / fRound2)) / 2.0f;
            fArr2[0] = a(fArr2[0], f10);
            fArr2[1] = a(fArr2[1], f11);
            fArr2[2] = a(fArr2[2], f10);
            fArr2[3] = a(fArr2[3], f11);
            fArr2[4] = a(fArr2[4], f10);
            fArr2[5] = a(fArr2[5], f11);
            fArr2[6] = a(fArr2[6], f10);
            fArr2[7] = a(fArr2[7], f11);
        } else if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            fArr = new float[]{fArr[0] / fRound2, fArr[1] / fRound, fArr[2] / fRound2, fArr[3] / fRound, fArr[4] / fRound2, fArr[5] / fRound, fArr[6] / fRound2, fArr[7] / fRound};
        }
        this.f100383g.clear();
        this.f100383g.put(fArr).position(0);
        this.f100384h.clear();
        this.f100384h.put(fArr2).position(0);
    }

    private void c() {
        if (this.f100389m != null) {
            return;
        }
        com.tencent.liteav.videobase.a.a aVar = new com.tencent.liteav.videobase.a.a();
        this.f100389m = aVar;
        aVar.a((e) null);
    }

    private void d() {
        com.tencent.liteav.videobase.b.a aVar = this.f100388l;
        if (aVar != null) {
            aVar.b();
            this.f100388l = null;
        }
        com.tencent.liteav.videobase.a.a aVar2 = this.f100389m;
        if (aVar2 != null) {
            aVar2.b();
            this.f100389m = null;
        }
        c cVar = this.f100390n;
        if (cVar != null) {
            cVar.d();
            this.f100390n = null;
        }
        int i10 = 0;
        while (true) {
            com.tencent.liteav.videobase.a.a[] aVarArr = this.f100385i;
            if (i10 >= aVarArr.length) {
                LiteavLog.i("PixelFrameRenderer", "uninitialize GL components");
                return;
            }
            com.tencent.liteav.videobase.a.a aVar3 = aVarArr[i10];
            if (aVar3 != null) {
                aVar3.b();
                this.f100385i[i10] = null;
            }
            i10++;
        }
    }

    public final void a() {
        this.f100387k = null;
        d();
    }

    public final void a(int i10, int i11) {
        if (this.f100381e == i10 && this.f100382f == i11) {
            return;
        }
        this.f100381e = i10;
        this.f100382f = i11;
        b();
    }

    public final void a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType, d dVar) {
        if (pixelFrame == null || !pixelFrame.isFrameDataValid()) {
            LiteavLog.w("PixelFrameRenderer", "renderFrame: pixelFrame is not valid");
            return;
        }
        if (this.f100387k == null || a(pixelFrame, gLScaleType)) {
            this.f100386j = gLScaleType;
            this.f100387k = new PixelFrame(pixelFrame);
            d();
            b();
        }
        if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            a(dVar);
        }
        if (this.f100387k.getPixelBufferType() == GLConstants.a.BYTE_BUFFER) {
            if (this.f100387k.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                a(this.f100387k.getPixelFormatType(), dVar, pixelFrame.getBuffer(), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                return;
            } else {
                a(dVar, pixelFrame.getBuffer());
                return;
            }
        }
        if (this.f100387k.getPixelBufferType() == GLConstants.a.BYTE_ARRAY) {
            if (this.f100387k.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                a(this.f100387k.getPixelFormatType(), dVar, ByteBuffer.wrap(pixelFrame.getData()), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                return;
            } else {
                a(dVar, ByteBuffer.wrap(pixelFrame.getData()));
                return;
            }
        }
        if (this.f100387k.getPixelBufferType() == GLConstants.a.TEXTURE_OES) {
            a(dVar, pixelFrame.getTextureId(), pixelFrame.getMatrix());
        } else if (this.f100387k.getPixelBufferType() == GLConstants.a.TEXTURE_2D) {
            a(dVar, pixelFrame.getTextureId());
        }
    }
}
