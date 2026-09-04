package com.tencent.liteav.txcvodplayer.renderer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TextureRenderView extends TextureView implements com.tencent.liteav.txcvodplayer.renderer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.tencent.liteav.txcvodplayer.renderer.b f100158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f100159b;

    public static final class a implements com.tencent.liteav.txcvodplayer.renderer.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TextureRenderView f100160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SurfaceTexture f100161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.tencent.liteav.txcplayer.c f100162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Surface f100163d;

        public a(TextureRenderView textureRenderView, SurfaceTexture surfaceTexture, com.tencent.liteav.txcplayer.c cVar) {
            this.f100160a = textureRenderView;
            this.f100161b = surfaceTexture;
            this.f100162c = cVar;
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final com.tencent.liteav.txcvodplayer.renderer.a a() {
            return this.f100160a;
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final void a(ITXVCubePlayer iTXVCubePlayer) {
            if (iTXVCubePlayer == null) {
                return;
            }
            if (LiteavSystemInfo.getSystemOSVersionInt() < 16 || !(iTXVCubePlayer instanceof com.tencent.liteav.txcplayer.b)) {
                Surface surfaceB = b();
                this.f100163d = surfaceB;
                iTXVCubePlayer.setSurface(surfaceB);
                return;
            }
            com.tencent.liteav.txcplayer.b bVar = (com.tencent.liteav.txcplayer.b) iTXVCubePlayer;
            this.f100160a.f100159b.f100168e = false;
            if (this.f100160a.getSurfaceTexture() != null) {
                this.f100161b = this.f100160a.getSurfaceTexture();
            }
            try {
                SurfaceTexture surfaceTexture = bVar.getSurfaceTexture();
                if (surfaceTexture != null) {
                    bVar.setSurfaceTextureHost(this.f100160a.f100159b);
                    if (this.f100160a.getSurfaceTexture() != surfaceTexture) {
                        this.f100160a.setSurfaceTexture(surfaceTexture);
                    }
                    this.f100160a.f100159b.f100164a = surfaceTexture;
                } else {
                    Surface surface = this.f100163d;
                    if (surface != null) {
                        iTXVCubePlayer.setSurface(surface);
                    }
                    bVar.setSurfaceTexture(this.f100161b);
                    bVar.setSurfaceTextureHost(this.f100160a.f100159b);
                }
                this.f100163d = iTXVCubePlayer.getSurface();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final Surface b() {
            if (this.f100161b == null) {
                return null;
            }
            if (this.f100163d == null) {
                this.f100163d = new Surface(this.f100161b);
            }
            return this.f100163d;
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final Surface c() {
            return this.f100163d;
        }
    }

    public static final class b implements TextureView.SurfaceTextureListener, com.tencent.liteav.txcplayer.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SurfaceTexture f100164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f100165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f100166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f100167d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        WeakReference<TextureRenderView> f100171h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f100168e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f100169f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f100170g = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Map<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a, Object> f100172i = new ConcurrentHashMap();

        public b(TextureRenderView textureRenderView) {
            this.f100171h = new WeakReference<>(textureRenderView);
        }

        @Override // com.tencent.liteav.txcplayer.c
        public final void a(SurfaceTexture surfaceTexture) {
            if (surfaceTexture == null) {
                LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: null");
                return;
            }
            if (this.f100170g) {
                if (surfaceTexture != this.f100164a) {
                    LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (this.f100168e) {
                    LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView");
                    return;
                } else {
                    LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture");
                    surfaceTexture.release();
                    return;
                }
            }
            if (this.f100169f) {
                if (surfaceTexture != this.f100164a) {
                    LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (this.f100168e) {
                    LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView");
                    return;
                } else {
                    LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView");
                    this.f100168e = true;
                    return;
                }
            }
            if (surfaceTexture != this.f100164a) {
                LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: alive: release different SurfaceTexture");
                surfaceTexture.release();
            } else if (this.f100168e) {
                LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: alive: will released by TextureView");
            } else {
                LiteavLog.i("TextureRenderView", "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView");
                this.f100168e = true;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f100164a = surfaceTexture;
            this.f100165b = false;
            this.f100166c = 0;
            this.f100167d = 0;
            a aVar = new a(this.f100171h.get(), surfaceTexture, this);
            Iterator<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a> it = this.f100172i.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f100164a = surfaceTexture;
            this.f100165b = false;
            this.f100166c = 0;
            this.f100167d = 0;
            a aVar = new a(this.f100171h.get(), surfaceTexture, this);
            Iterator<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a> it = this.f100172i.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(aVar);
            }
            LiteavLog.i("TextureRenderView", "onSurfaceTextureDestroyed: destroy: " + this.f100168e);
            return this.f100168e;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f100164a = surfaceTexture;
            this.f100165b = true;
            this.f100166c = i10;
            this.f100167d = i11;
            a aVar = new a(this.f100171h.get(), surfaceTexture, this);
            Iterator<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a> it = this.f100172i.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar, i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public TextureRenderView(Context context) {
        super(context);
        b();
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }

    private void b() {
        this.f100158a = new com.tencent.liteav.txcvodplayer.renderer.b(this);
        b bVar = new b(this);
        this.f100159b = bVar;
        setSurfaceTextureListener(bVar);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f100158a.a(i10, i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void a(com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a interfaceC0964a) {
        a aVar;
        b bVar = this.f100159b;
        bVar.f100172i.put(interfaceC0964a, interfaceC0964a);
        if (bVar.f100164a != null) {
            aVar = new a(bVar.f100171h.get(), bVar.f100164a, bVar);
            interfaceC0964a.a(aVar);
        } else {
            aVar = null;
        }
        if (bVar.f100165b) {
            if (aVar == null) {
                aVar = new a(bVar.f100171h.get(), bVar.f100164a, bVar);
            }
            interfaceC0964a.a(aVar, bVar.f100166c, bVar.f100167d);
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final boolean a() {
        return false;
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f100158a.b(i10, i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void b(com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a interfaceC0964a) {
        this.f100159b.f100172i.remove(interfaceC0964a);
    }

    public com.tencent.liteav.txcvodplayer.renderer.a.b getSurfaceHolder() {
        return new a(this, this.f100159b.f100164a, this.f100159b);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f100159b;
        LiteavLog.i("TextureRenderView", "onAttachFromWindow()");
        bVar.f100169f = false;
        bVar.f100170g = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            b bVar = this.f100159b;
            LiteavLog.i("TextureRenderView", "willDetachFromWindow()");
            bVar.f100169f = true;
            super.onDetachedFromWindow();
            b bVar2 = this.f100159b;
            LiteavLog.i("TextureRenderView", "didDetachFromWindow()");
            bVar2.f100170g = true;
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f100158a.c(i10, i11);
        com.tencent.liteav.txcvodplayer.renderer.b bVar = this.f100158a;
        setMeasuredDimension(bVar.f100174b, bVar.f100175c);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a> it = this.f100159b.f100172i.keySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (it.next().a(motionEvent)) {
                z10 = true;
            }
        }
        if (z10) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public void setAspectRatio(int i10) {
        this.f100158a.f100176d = i10;
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public void setVideoRotation(int i10) {
        this.f100158a.f100173a = i10;
        setRotation(i10);
    }
}
