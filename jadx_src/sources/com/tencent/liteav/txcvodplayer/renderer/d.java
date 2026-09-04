package com.tencent.liteav.txcvodplayer.renderer;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videoconsumer.renderer.ac;
import com.tencent.liteav.videoconsumer.renderer.u;
import com.tencent.liteav.videoconsumer.renderer.v;
import com.tencent.liteav.videoconsumer.renderer.w;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CustomHandler f100183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected EGLCore f100184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u f100185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DisplayTarget f100186d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceTexture f100189g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PixelFrame f100191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.k f100192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.i f100193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.e f100194l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final a f100198p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private GLConstants.GLScaleType f100187e = GLConstants.GLScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.liteav.base.util.l f100188f = com.tencent.liteav.base.util.l.NORMAL;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f100190h = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float[] f100195m = new float[16];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f100196n = 720;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f100197o = 1280;

    public interface a {
        void a(SurfaceTexture surfaceTexture);

        void a(PixelFrame pixelFrame);

        void f();
    }

    public d(a aVar) {
        this.f100198p = aVar;
    }

    static /* synthetic */ void a(d dVar) {
        if (dVar.f100184b == null) {
            dVar.f100184b = new EGLCore();
            if (dVar.f100192j == null) {
                dVar.f100192j = new com.tencent.liteav.videobase.frame.k();
            }
            try {
                dVar.f100184b.initialize(null, null, 128, 128);
                dVar.f100184b.makeCurrent();
                dVar.f100190h = OpenGlUtils.generateTextureOES();
                SurfaceTexture surfaceTexture = new SurfaceTexture(dVar.f100190h);
                dVar.f100189g = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(dVar.f100196n, dVar.f100197o);
                dVar.f100189g.setOnFrameAvailableListener(dVar);
                PixelFrame pixelFrame = new PixelFrame();
                dVar.f100191i = pixelFrame;
                pixelFrame.setWidth(dVar.f100196n);
                dVar.f100191i.setHeight(dVar.f100197o);
                dVar.f100191i.setPixelBufferType(GLConstants.a.TEXTURE_OES);
                dVar.f100191i.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
                dVar.f100191i.setRotation(com.tencent.liteav.base.util.l.NORMAL);
                dVar.f100191i.setGLContext(dVar.f100184b.getEglContext());
                dVar.f100191i.setTextureId(dVar.f100190h);
                dVar.f100194l = new com.tencent.liteav.videobase.frame.e();
                a aVar = dVar.f100198p;
                if (aVar != null) {
                    aVar.a(dVar.f100189g);
                }
            } catch (com.tencent.liteav.videobase.egl.d e10) {
                LiteavLog.e("VodRenderer", "initializeEGL failed.", e10);
                dVar.f100184b = null;
            }
        }
        dVar.f100185c = new u(dVar.f100183a.getLooper(), new com.tencent.liteav.videobase.videobase.d());
    }

    static /* synthetic */ void a(d dVar, int i10, int i11) {
        if (dVar.f100196n == i10 && dVar.f100197o == i11) {
            return;
        }
        LiteavLog.i("VodRenderer", "setVideoSize: %d*%d", Integer.valueOf(i10), Integer.valueOf(i11));
        dVar.f100196n = i10;
        dVar.f100197o = i11;
        dVar.f100191i.setWidth(i10);
        dVar.f100191i.setHeight(dVar.f100197o);
        com.tencent.liteav.videobase.frame.i iVar = dVar.f100193k;
        if (iVar != null) {
            iVar.a();
            dVar.f100193k = null;
        }
        com.tencent.liteav.videobase.frame.e eVar = dVar.f100194l;
        if (eVar != null) {
            eVar.a();
        }
    }

    static /* synthetic */ void a(d dVar, SurfaceTexture surfaceTexture) {
        com.tencent.liteav.videobase.frame.k kVar;
        com.tencent.liteav.videobase.frame.k.b bVarA;
        PixelFrame pixelFrameRemoveFirst;
        SurfaceTexture surfaceTexture2 = dVar.f100189g;
        if (surfaceTexture2 == null || surfaceTexture != surfaceTexture2) {
            LiteavLog.i("VodRenderer", "mSurfaceTexture= " + dVar.f100189g + " ,surfaceTexture= " + surfaceTexture);
            return;
        }
        if (dVar.b()) {
            if (dVar.f100194l == null || (kVar = dVar.f100192j) == null) {
                LiteavLog.w("VodRenderer", "onCaptureFrameAvailable mGLTexturePool:" + dVar.f100194l + " mTextureHolderPool:" + dVar.f100192j);
                return;
            }
            try {
                bVarA = kVar.a();
            } catch (InterruptedException unused) {
                bVarA = null;
            }
            try {
                dVar.f100189g.updateTexImage();
                dVar.f100189g.getTransformMatrix(dVar.f100195m);
                dVar.f100191i.setMatrix(dVar.f100195m);
            } catch (Exception e10) {
                LiteavLog.w("VodRenderer", "updateTexImage exception: ".concat(String.valueOf(e10)));
            }
            int i10 = dVar.f100190h;
            int width = dVar.f100191i.getWidth();
            int height = dVar.f100191i.getHeight();
            bVarA.f100395b = 36197;
            bVarA.f100394a = i10;
            bVarA.f100396c = width;
            bVarA.f100397d = height;
            PixelFrame pixelFrameA = bVarA.a(dVar.f100191i.getGLContext());
            pixelFrameA.setMatrix(dVar.f100195m);
            if (dVar.f100193k == null) {
                dVar.f100193k = new com.tencent.liteav.videobase.frame.i(dVar.f100196n, dVar.f100197o);
            }
            OpenGlUtils.glViewport(0, 0, dVar.f100196n, dVar.f100197o);
            com.tencent.liteav.videobase.frame.d dVarA = dVar.f100194l.a(dVar.f100196n, dVar.f100197o);
            dVar.f100193k.a(pixelFrameA, GLConstants.GLScaleType.CENTER_CROP, dVarA);
            PixelFrame pixelFrameA2 = dVarA.a(dVar.f100184b.getEglContext());
            dVarA.release();
            a aVar = dVar.f100198p;
            if (aVar != null) {
                aVar.a(pixelFrameA2);
            }
            u uVar = dVar.f100185c;
            if (uVar != null && uVar.f100636c) {
                if (!uVar.f100637d) {
                    uVar.f100637d = true;
                    LiteavLog.d(uVar.f100634a, "VideoRender receive first frame!");
                }
                com.tencent.liteav.videobase.utils.f fVar = uVar.f100635b;
                pixelFrameA2.retain();
                synchronized (fVar) {
                    pixelFrameRemoveFirst = fVar.f100435a.size() >= fVar.f100436b ? fVar.f100435a.removeFirst() : null;
                    fVar.f100435a.addLast(pixelFrameA2);
                }
                if (pixelFrameRemoveFirst != null) {
                    pixelFrameRemoveFirst.release();
                }
                uVar.a(w.a(uVar));
            }
            bVarA.release();
            pixelFrameA.release();
            pixelFrameA2.release();
        }
    }

    static /* synthetic */ void a(d dVar, com.tencent.liteav.base.util.l lVar) {
        LiteavLog.i("VodRenderer", "setRenderRotation ".concat(String.valueOf(lVar)));
        dVar.f100188f = lVar;
        u uVar = dVar.f100185c;
        if (uVar != null) {
            uVar.a(lVar);
        }
    }

    static /* synthetic */ void a(d dVar, GLConstants.GLScaleType gLScaleType) {
        LiteavLog.i("VodRenderer", "setScaleType ".concat(String.valueOf(gLScaleType)));
        dVar.f100187e = gLScaleType;
        u uVar = dVar.f100185c;
        if (uVar != null) {
            uVar.a(gLScaleType);
        }
    }

    static /* synthetic */ void a(d dVar, DisplayTarget displayTarget) {
        LiteavLog.i("VodRenderer", "setDisplayTarget: ".concat(String.valueOf(displayTarget)));
        dVar.f100186d = displayTarget;
        u uVar = dVar.f100185c;
        if (uVar != null) {
            uVar.a(displayTarget, true);
        }
    }

    static /* synthetic */ void a(d dVar, boolean z10) {
        LiteavLog.i("VodRenderer", "Stop");
        u uVar = dVar.f100185c;
        if (uVar != null) {
            uVar.a(ac.a(uVar, z10));
        }
    }

    static /* synthetic */ void b(d dVar) {
        LiteavLog.i("VodRenderer", "Start");
        u uVar = dVar.f100185c;
        if (uVar != null) {
            uVar.a(dVar.f100186d, true);
            dVar.f100185c.a(dVar.f100188f);
            dVar.f100185c.a(dVar.f100187e);
            u uVar2 = dVar.f100185c;
            uVar2.a(v.a(uVar2));
        }
    }

    private boolean b() {
        EGLCore eGLCore = this.f100184b;
        if (eGLCore == null) {
            LiteavLog.e("VodRenderer", "makeCurrent on mEGLCore is null");
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (com.tencent.liteav.videobase.egl.d e10) {
            LiteavLog.e("VodRenderer", "make current failed.", e10);
            return false;
        }
    }

    static /* synthetic */ u d(d dVar) {
        dVar.f100185c = null;
        return null;
    }

    static /* synthetic */ DisplayTarget e(d dVar) {
        dVar.f100186d = null;
        return null;
    }

    static /* synthetic */ CustomHandler g(d dVar) {
        dVar.f100183a = null;
        return null;
    }

    protected final void a() {
        ArrayList arrayList;
        if (this.f100184b == null) {
            return;
        }
        com.tencent.liteav.videobase.frame.k kVar = this.f100192j;
        if (kVar != null) {
            kVar.f100374c = true;
            synchronized (kVar) {
                arrayList = new ArrayList(kVar.f100372a);
                kVar.f100372a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f100192j = null;
        }
        try {
            this.f100184b.makeCurrent();
            a aVar = this.f100198p;
            if (aVar != null) {
                aVar.f();
            }
            SurfaceTexture surfaceTexture = this.f100189g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f100189g = null;
            }
            OpenGlUtils.deleteTexture(this.f100190h);
            this.f100190h = -1;
            com.tencent.liteav.videobase.frame.i iVar = this.f100193k;
            if (iVar != null) {
                iVar.a();
                this.f100193k = null;
            }
            com.tencent.liteav.videobase.frame.e eVar = this.f100194l;
            if (eVar != null) {
                eVar.a();
                this.f100194l.b();
                this.f100194l = null;
            }
        } catch (com.tencent.liteav.videobase.egl.d e10) {
            LiteavLog.e("VodRenderer", "EGLCore destroy failed.", e10);
        }
        EGLCore.destroy(this.f100184b);
        this.f100184b = null;
    }

    public final void a(com.tencent.liteav.base.util.l lVar) {
        a(j.a(this, lVar), "setRenderRotation");
    }

    public final void a(GLConstants.GLScaleType gLScaleType) {
        a(i.a(this, gLScaleType), "setScaleType");
    }

    public final void a(Runnable runnable, String str) {
        CustomHandler customHandler = this.f100183a;
        if (customHandler == null) {
            LiteavLog.w("VodRenderer", "ignore runnable: ".concat(String.valueOf(str)));
        } else if (customHandler.getLooper() != Looper.myLooper()) {
            customHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void a(boolean z10) {
        a(f.a(this, z10), "Stop");
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        a(l.a(this, surfaceTexture), "onFrameAvailable");
    }
}
