package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.frame.FrameMetaData;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.BitmapUtils;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends s implements RenderViewHelperInterface.RenderViewListener {
    private com.tencent.liteav.videobase.base.a B;
    private t C;
    private Bitmap E;
    private a G;
    private List<PointF> H;
    private List<PointF> I;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CustomHandler f100639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.tencent.liteav.videobase.videobase.c f100640g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f100647n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.i f100650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.e f100651r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private DisplayTarget f100656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private RenderViewHelperInterface f100657x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100634a = "VideoRenderer_" + hashCode();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f100638e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.tencent.liteav.base.util.m f100642i = new com.tencent.liteav.base.util.m(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.tencent.liteav.base.b.b f100643j = new com.tencent.liteav.base.b.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Size f100644k = new Size();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Surface f100645l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f100646m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private EGLCore f100648o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.tencent.liteav.videobase.frame.c f100649p = new com.tencent.liteav.videobase.frame.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.tencent.liteav.videobase.utils.f f100635b = new com.tencent.liteav.videobase.utils.f();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private GLConstants.GLScaleType f100652s = GLConstants.GLScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.tencent.liteav.base.util.l f100653t = com.tencent.liteav.base.util.l.NORMAL;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f100654u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f100655v = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Size f100658y = new Size();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f100636c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f100637d = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f100659z = false;
    private final Size A = new Size();
    private boolean D = false;
    private final com.tencent.liteav.base.b.a F = new com.tencent.liteav.base.b.a(5000);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.tencent.liteav.base.util.m f100641h = null;

    public u(Looper looper, com.tencent.liteav.videobase.videobase.c cVar) {
        this.f100639f = new CustomHandler(looper);
        this.f100640g = cVar;
    }

    private Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2;
        synchronized (this) {
            bitmap2 = this.E;
            this.E = bitmap;
        }
        return bitmap2;
    }

    private void a() {
        if (this.f100648o == null) {
            return;
        }
        com.tencent.liteav.base.b.a aVarA = this.f100643j.a("uninitGL");
        String str = this.f100634a;
        Object[] objArr = new Object[2];
        Surface surface = this.f100645l;
        objArr[0] = Integer.valueOf(surface != null ? surface.hashCode() : 0);
        objArr[1] = this.f100644k;
        LiteavLog.i(aVarA, str, "uninitializeEGL %d %s", objArr);
        try {
            this.f100648o.makeCurrent();
        } catch (com.tencent.liteav.videobase.egl.d e10) {
            LiteavLog.e(this.f100643j.a("makeCurrentError"), this.f100634a, "uninitializeEGL EGLCore makeCurrent failed.".concat(String.valueOf(e10)), new Object[0]);
        }
        a aVar = this.G;
        if (aVar != null) {
            com.tencent.liteav.videobase.frame.i iVar = aVar.f100556g;
            if (iVar != null) {
                iVar.a();
                aVar.f100556g = null;
            }
            com.tencent.liteav.videobase.b.b bVar = aVar.f100553d;
            if (bVar != null) {
                bVar.b();
                aVar.f100553d = null;
            }
            this.G = null;
        }
        com.tencent.liteav.videobase.frame.i iVar2 = this.f100650q;
        if (iVar2 != null) {
            iVar2.a();
            this.f100650q = null;
        }
        this.f100649p.d();
        com.tencent.liteav.videobase.frame.e eVar = this.f100651r;
        if (eVar != null) {
            eVar.a();
            this.f100651r.b();
            this.f100651r = null;
        }
        EGLCore.destroy(this.f100648o);
        this.f100648o = null;
    }

    private void a(Surface surface, boolean z10) {
        Surface surface2;
        if (com.tencent.liteav.base.util.i.a(this.f100645l, surface)) {
            LiteavLog.d(this.f100634a, "updateSurface same surface!");
            return;
        }
        a();
        if (this.f100646m && (surface2 = this.f100645l) != null) {
            surface2.release();
        }
        this.f100645l = surface;
        if (surface == null) {
            this.f100644k.set(0, 0);
        }
        this.f100646m = z10;
    }

    private void a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        RenderViewHelperInterface renderViewHelperInterface = this.f100657x;
        if (renderViewHelperInterface != null) {
            renderViewHelperInterface.updateVideoFrameInfo(this.f100652s, this.A.getWidth(), this.A.getHeight(), this.f100659z);
        }
        if (this.f100644k.isValid()) {
            if (this.f100657x instanceof k) {
                gLScaleType = GLConstants.GLScaleType.FILL;
            }
            List<PointF> list = this.H;
            List<PointF> list2 = this.I;
            if (!(list != null && list.size() == 4 && list2 != null && list2.size() == 4)) {
                Size size = this.f100644k;
                OpenGlUtils.glViewport(0, 0, size.width, size.height);
                if (this.f100650q == null) {
                    LiteavLog.i(this.f100634a, "create PixelFrameRenderer, surfaceSize=" + this.f100644k);
                    Size size2 = this.f100644k;
                    this.f100650q = new com.tencent.liteav.videobase.frame.i(size2.width, size2.height);
                }
                com.tencent.liteav.videobase.frame.i iVar = this.f100650q;
                Size size3 = this.f100644k;
                iVar.a(size3.width, size3.height);
                this.f100650q.a(pixelFrame, gLScaleType, (com.tencent.liteav.videobase.frame.d) null);
                return;
            }
            if (this.G == null) {
                com.tencent.liteav.videobase.frame.e eVar = this.f100651r;
                Size size4 = this.f100644k;
                a aVar = new a(eVar, size4.width, size4.height);
                this.G = aVar;
                List<PointF> list3 = this.H;
                List<PointF> list4 = this.I;
                aVar.f100558i = list3;
                aVar.f100559j = list4;
                aVar.f100560k = true;
            }
            RenderViewHelperInterface renderViewHelperInterface2 = this.f100657x;
            if (renderViewHelperInterface2 != null) {
                a aVar2 = this.G;
                Size size5 = this.f100644k;
                Matrix transformMatrix = renderViewHelperInterface2.getTransformMatrix(size5.width, size5.height);
                if (!com.tencent.liteav.base.util.i.a(aVar2.f100557h, transformMatrix)) {
                    aVar2.f100557h = transformMatrix;
                    aVar2.f100560k = true;
                }
            }
            a aVar3 = this.G;
            Size size6 = this.f100644k;
            int i10 = size6.width;
            int i11 = size6.height;
            Size size7 = aVar3.f100551b;
            if (size7.width != i10 || size7.height != i11) {
                size7.set(i10, i11);
                aVar3.f100560k = true;
            }
            a aVar4 = this.G;
            if (aVar4.f100551b.isValid()) {
                if (aVar4.f100556g == null) {
                    LiteavLog.i(aVar4.f100550a, "create PixelFrameRenderer, size =" + aVar4.f100551b);
                    Size size8 = aVar4.f100551b;
                    aVar4.f100556g = new com.tencent.liteav.videobase.frame.i(size8.width, size8.height);
                }
                Size size9 = aVar4.f100551b;
                OpenGlUtils.glViewport(0, 0, size9.width, size9.height);
                com.tencent.liteav.videobase.frame.e eVar2 = aVar4.f100552c;
                Size size10 = aVar4.f100551b;
                com.tencent.liteav.videobase.frame.d dVarA = eVar2.a(size10.width, size10.height);
                com.tencent.liteav.videobase.frame.i iVar2 = aVar4.f100556g;
                Size size11 = aVar4.f100551b;
                iVar2.a(size11.width, size11.height);
                aVar4.f100556g.a(pixelFrame, gLScaleType, dVarA);
                com.tencent.liteav.videobase.b.b bVar = aVar4.f100553d;
                if (bVar == null && bVar == null) {
                    com.tencent.liteav.videobase.b.b bVar2 = new com.tencent.liteav.videobase.b.b();
                    aVar4.f100553d = bVar2;
                    bVar2.a(aVar4.f100552c);
                    if (aVar4.f100554e == null || aVar4.f100555f == null) {
                        aVar4.f100554e = OpenGlUtils.createNormalCubeVerticesBuffer();
                        aVar4.f100555f = OpenGlUtils.createTextureCoordsBuffer(com.tencent.liteav.base.util.l.NORMAL, false, false);
                    }
                }
                if (aVar4.f100560k) {
                    aVar4.a(aVar4.f100558i, aVar4.f100559j);
                    aVar4.f100560k = false;
                }
                aVar4.f100553d.a(dVarA.a(), null, aVar4.f100554e, aVar4.f100555f);
                dVarA.release();
            }
        }
    }

    static /* synthetic */ void a(u uVar) {
        LiteavLog.i(uVar.f100634a, "onSurfaceDestroy " + uVar.f100645l);
        uVar.a((Surface) null, uVar.f100646m);
    }

    static /* synthetic */ void a(u uVar, Surface surface, boolean z10) {
        LiteavLog.i(uVar.f100634a, "onSurfaceChanged surface: %s, oldSurface: %s, isNeedRelease: %b", surface, uVar.f100645l, Boolean.valueOf(z10));
        uVar.a(surface, z10);
    }

    static /* synthetic */ void a(u uVar, com.tencent.liteav.base.util.l lVar) {
        if (uVar.f100653t != lVar) {
            LiteavLog.i(uVar.f100634a, "setRenderRotation ".concat(String.valueOf(lVar)));
            uVar.f100653t = lVar;
        }
    }

    static /* synthetic */ void a(u uVar, GLConstants.GLScaleType gLScaleType) {
        if (uVar.f100652s != gLScaleType) {
            LiteavLog.i(uVar.f100634a, "setScaleType ".concat(String.valueOf(gLScaleType)));
            uVar.f100652s = gLScaleType;
        }
    }

    static /* synthetic */ void a(u uVar, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i10, int i11, com.tencent.liteav.videobase.base.a aVar) {
        TextureView textureView = renderViewHelperInterface instanceof k ? ((k) renderViewHelperInterface).f100602a : null;
        uVar.f100642i.a(ab.a(uVar, byteBuffer, i10, i11, textureView != null ? textureView.getTransform(new Matrix()) : null, aVar));
    }

    static /* synthetic */ void a(u uVar, t tVar) {
        LiteavLog.i(uVar.f100634a, "Start");
        if (uVar.f100636c) {
            LiteavLog.w(uVar.f100634a, "renderer is started!");
            return;
        }
        uVar.f100636c = true;
        uVar.C = tVar;
        DisplayTarget displayTarget = uVar.f100656w;
        if (displayTarget != null) {
            uVar.b(displayTarget, true);
        }
        uVar.F.f99568a = SystemClock.elapsedRealtime();
    }

    static /* synthetic */ void a(u uVar, ByteBuffer byteBuffer, int i10, int i11, Matrix matrix, com.tencent.liteav.videobase.base.a aVar) {
        try {
            byteBuffer.position(0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
            if (matrix == null) {
                matrix = new Matrix();
            }
            matrix.postScale(1.0f, -1.0f, i10 / 2.0f, i11 / 2.0f);
            aVar.onComplete(BitmapUtils.createBitmap(bitmapCreateBitmap, matrix, true));
        } catch (Throwable th2) {
            LiteavLog.e(uVar.f100634a, "build snapshot bitmap failed.", th2);
            aVar.onComplete(null);
        }
    }

    static /* synthetic */ void a(u uVar, boolean z10) {
        ArrayList arrayList;
        Surface surface;
        LiteavLog.i(uVar.f100634a, "Stop,clearLastImage=".concat(String.valueOf(z10)));
        if (!uVar.f100636c) {
            LiteavLog.w(uVar.f100634a, "renderer is not started!");
            return;
        }
        uVar.f100636c = false;
        uVar.B = null;
        uVar.a(z10);
        DisplayTarget displayTarget = uVar.f100656w;
        if (displayTarget != null && z10) {
            displayTarget.hideAll();
        }
        com.tencent.liteav.videobase.utils.f fVar = uVar.f100635b;
        synchronized (fVar) {
            arrayList = new ArrayList(fVar.f100435a);
            fVar.f100435a.clear();
        }
        LiteavLog.i("RingFrameQueue", "evictAll pixelFrame.");
        PixelFrame.releasePixelFrames(arrayList);
        uVar.a();
        if (uVar.f100646m && (surface = uVar.f100645l) != null) {
            surface.release();
            uVar.f100646m = false;
        }
        uVar.f100645l = null;
        uVar.f100644k.set(0, 0);
        uVar.f100658y.set(0, 0);
        uVar.f100637d = false;
    }

    private void a(boolean z10) {
        RenderViewHelperInterface renderViewHelperInterface = this.f100657x;
        if (renderViewHelperInterface != null) {
            renderViewHelperInterface.release(z10);
            this.f100657x = null;
        }
    }

    private boolean a(PixelFrame pixelFrame) {
        Object gLContext = pixelFrame.getGLContext();
        if (this.f100648o == null || !(gLContext == null || CommonUtil.equals(this.f100647n, gLContext))) {
            a();
            Object gLContext2 = pixelFrame.getGLContext();
            if (this.f100645l == null) {
                LiteavLog.e(this.f100643j.a("initGLNoSurface"), this.f100634a, "Initialize EGL failed because surface is null", new Object[0]);
            } else {
                try {
                    LiteavLog.i(this.f100643j.a("initGL"), this.f100634a, "initializeEGL surface=" + this.f100645l + ",size=" + this.f100644k, new Object[0]);
                    EGLCore eGLCore = new EGLCore();
                    this.f100648o = eGLCore;
                    Surface surface = this.f100645l;
                    Size size = this.f100644k;
                    eGLCore.initialize(gLContext2, surface, size.width, size.height);
                    this.f100647n = gLContext2;
                    this.f100648o.makeCurrent();
                    if (this.f100651r == null) {
                        this.f100651r = new com.tencent.liteav.videobase.frame.e();
                    }
                    this.f100649p.a();
                } catch (com.tencent.liteav.videobase.egl.d e10) {
                    LiteavLog.e(this.f100643j.a("initGLError"), this.f100634a, "initializeEGL failed.", e10);
                    this.f100648o = null;
                    this.f100640g.notifyWarning(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_RENDER_EGL_CORE_CREATE_FAILED, "VideoRender: create EGLCore fail:".concat(String.valueOf(e10)));
                }
            }
        }
        EGLCore eGLCore2 = this.f100648o;
        if (eGLCore2 == null) {
            return false;
        }
        try {
            eGLCore2.makeCurrent();
            return true;
        } catch (com.tencent.liteav.videobase.egl.d e11) {
            LiteavLog.e(this.f100643j.a("makeCurrentForFrameError"), this.f100634a, "EGLCore makeCurrent failed.".concat(String.valueOf(e11)), new Object[0]);
            return false;
        }
    }

    private void b() {
        EGLCore eGLCore = this.f100648o;
        if (eGLCore == null) {
            return;
        }
        Size surfaceSize = eGLCore.getSurfaceSize();
        if (this.f100644k.equals(surfaceSize)) {
            return;
        }
        LiteavLog.i(this.f100643j.a("updateSurfaceSize"), this.f100634a, "surface size changed,old size=" + this.f100644k + ",new size=" + surfaceSize, new Object[0]);
        this.f100644k.set(surfaceSize);
        if (this.f100645l != null) {
            com.tencent.liteav.videobase.videobase.c cVar = this.f100640g;
            com.tencent.liteav.videobase.videobase.f fVar = com.tencent.liteav.videobase.videobase.f.STATUS_VIDEO_RENDER_RESOLUTION;
            Size size = this.f100644k;
            cVar.updateStatus(fVar, Integer.valueOf(size.height | (size.width << 16)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DisplayTarget displayTarget, boolean z10) {
        LiteavLog.i(this.f100634a, "setDisplayViewInternal=" + displayTarget + ",clearLastImage=" + z10);
        boolean zEquals = CommonUtil.equals(this.f100656w, displayTarget);
        if (zEquals && displayTarget != null && this.f100657x != null) {
            LiteavLog.w(this.f100634a, "view is equal and RenderViewHelper is created.");
            return;
        }
        if (!zEquals) {
            this.D = true;
            DisplayTarget displayTarget2 = this.f100656w;
            if (displayTarget2 != null && z10) {
                displayTarget2.hideAll();
            }
        }
        a(z10);
        this.f100656w = displayTarget;
        if (displayTarget == null) {
            return;
        }
        displayTarget.showAll();
        this.f100657x = RenderViewHelperInterface.create(displayTarget, this);
    }

    static /* synthetic */ void b(u uVar) {
        PixelFrame pixelFrameCreateFromBitmap;
        Bitmap bitmapA = uVar.a((Bitmap) null);
        if (bitmapA == null || (pixelFrameCreateFromBitmap = PixelFrame.createFromBitmap(bitmapA)) == null || !uVar.a(pixelFrameCreateFromBitmap)) {
            return;
        }
        uVar.b();
        pixelFrameCreateFromBitmap.setMirrorVertical(true);
        uVar.a(pixelFrameCreateFromBitmap, uVar.f100652s);
        uVar.c();
    }

    static /* synthetic */ void c(u uVar) {
        RenderViewHelperInterface renderViewHelperInterface;
        PixelFrame pixelFrameA = uVar.f100635b.a();
        if (pixelFrameA == null) {
            LiteavLog.d(uVar.f100634a, "renderFrameInternal pixelFrame is null!");
            return;
        }
        uVar.f100658y.set(pixelFrameA.getWidth(), pixelFrameA.getHeight());
        FrameMetaData metaData = pixelFrameA.getMetaData();
        if (metaData != null) {
            uVar.f100653t = metaData.getRenderRotation();
            uVar.f100654u = metaData.isRenderMirrorHorizontal();
            uVar.f100655v = metaData.isRenderMirrorVertical();
            uVar.f100658y.set(metaData.getCaptureRealSize());
        }
        if (uVar.F.a() && (renderViewHelperInterface = uVar.f100657x) != null) {
            renderViewHelperInterface.checkViewAvailability();
        }
        if (uVar.f100659z) {
            RenderViewHelperInterface renderViewHelperInterface2 = uVar.f100657x;
            if (renderViewHelperInterface2 != null) {
                renderViewHelperInterface2.updateVideoFrameInfo(uVar.f100652s, pixelFrameA.getWidth(), pixelFrameA.getHeight(), uVar.f100659z);
            }
            int i10 = t.a.f100632d;
        } else if (uVar.f100657x == null) {
            int i11 = t.a.f100631c;
        } else if (uVar.a(pixelFrameA)) {
            uVar.b();
            PixelFrame pixelFrame = new PixelFrame(pixelFrameA);
            boolean z10 = uVar.f100654u;
            boolean z11 = uVar.f100655v;
            com.tencent.liteav.base.util.l lVar = uVar.f100653t;
            pixelFrame.setRotation(com.tencent.liteav.base.util.l.a((pixelFrame.getRotation().mValue + lVar.mValue) % 360));
            if (z10) {
                pixelFrame.setMirrorHorizontal(!pixelFrame.isMirrorHorizontal());
            }
            if (z11) {
                pixelFrame.setMirrorVertical(!pixelFrame.isMirrorVertical());
            }
            if (lVar == com.tencent.liteav.base.util.l.ROTATION_90 || lVar == com.tencent.liteav.base.util.l.ROTATION_270) {
                int width = pixelFrame.getWidth();
                pixelFrame.setWidth(pixelFrame.getHeight());
                pixelFrame.setHeight(width);
            }
            pixelFrame.setMirrorVertical(!pixelFrame.isMirrorVertical());
            if (pixelFrame.getRotation() != com.tencent.liteav.base.util.l.NORMAL) {
                com.tencent.liteav.base.util.l rotation = pixelFrame.getRotation();
                com.tencent.liteav.base.util.l lVar2 = com.tencent.liteav.base.util.l.ROTATION_180;
                if (rotation != lVar2) {
                    pixelFrame.setRotation(com.tencent.liteav.base.util.l.a((pixelFrame.getRotation().mValue + lVar2.mValue) % 360));
                }
            }
            uVar.A.width = pixelFrame.getWidth();
            uVar.A.height = pixelFrame.getHeight();
            uVar.a(pixelFrame, uVar.f100652s);
            if (uVar.B != null) {
                OpenGlUtils.bindFramebuffer(36160, 0);
                Size size = uVar.f100644k;
                int i12 = size.width;
                int i13 = size.height;
                com.tencent.liteav.videobase.base.a aVar = uVar.B;
                if (aVar != null) {
                    uVar.B = null;
                    ByteBuffer byteBufferB = com.tencent.liteav.videobase.utils.d.b(i12 * i13 * 4);
                    if (byteBufferB == null) {
                        LiteavLog.e(uVar.f100634a, "snapshotVideoFrameFromFrameBuffer, allocate direct buffer failed.");
                        aVar.onComplete(null);
                    } else {
                        byteBufferB.order(ByteOrder.nativeOrder());
                        byteBufferB.position(0);
                        GLES20.glReadPixels(0, 0, i12, i13, bb.c.f.OB, bb.c.f.Zc, byteBufferB);
                        uVar.f100638e.post(x.a(uVar, uVar.f100657x, byteBufferB, i12, i13, aVar));
                    }
                }
            }
            if (!uVar.c() || OpenGlUtils.getGLErrorCount() > 0) {
                int i14 = t.a.f100629a;
                LiteavLog.e(uVar.f100643j.a("renderFailed"), uVar.f100634a, "render frame failed.", new Object[0]);
            } else {
                int i15 = t.a.f100630b;
                if (uVar.D) {
                    uVar.f100640g.notifyEvent(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_RENDER_FIRST_FRAME_ON_VIEW, pixelFrameA, null);
                    uVar.D = false;
                }
            }
        } else {
            int i16 = t.a.f100629a;
            LiteavLog.e(uVar.f100643j.a("makeCurrent"), uVar.f100634a, "make current failed.", new Object[0]);
        }
        pixelFrameA.release();
    }

    private boolean c() {
        try {
            this.f100648o.swapBuffers();
            return true;
        } catch (com.tencent.liteav.videobase.egl.d e10) {
            LiteavLog.e(this.f100643j.a("swapBuffers"), this.f100634a, "EGLCore swapBuffers failed.".concat(String.valueOf(e10)), new Object[0]);
            this.f100640g.notifyWarning(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_RENDER_SWAP_BUFFER, "VideoRender: swapBuffer error:".concat(String.valueOf(e10)));
            return false;
        }
    }

    public final void a(com.tencent.liteav.base.util.l lVar) {
        a(af.a(this, lVar));
    }

    public final void a(GLConstants.GLScaleType gLScaleType) {
        a(ae.a(this, gLScaleType));
    }

    public final void a(DisplayTarget displayTarget, boolean z10) {
        a(ad.a(this, displayTarget, z10));
    }

    public final void a(Runnable runnable) {
        com.tencent.liteav.base.util.m mVar = this.f100641h;
        if (mVar != null) {
            mVar.a(runnable);
        } else if (Looper.myLooper() == this.f100639f.getLooper()) {
            runnable.run();
        } else {
            this.f100639f.post(runnable);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public final void onRequestRedraw(Bitmap bitmap) {
        a(bitmap);
        a(z.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public final void onSurfaceChanged(Surface surface, boolean z10) {
        a(y.a(this, surface, z10));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public final void onSurfaceDestroy() {
        Runnable runnableA = aa.a(this);
        com.tencent.liteav.base.util.m mVar = this.f100641h;
        if (mVar != null) {
            mVar.a(runnableA, 2000L);
        } else if (Looper.myLooper() == this.f100639f.getLooper()) {
            runnableA.run();
        } else {
            this.f100639f.runAndWaitDone(runnableA, 2000L);
        }
    }
}
