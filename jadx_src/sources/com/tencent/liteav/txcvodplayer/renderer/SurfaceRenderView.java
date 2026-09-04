package com.tencent.liteav.txcvodplayer.renderer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
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
public class SurfaceRenderView extends SurfaceView implements com.tencent.liteav.txcvodplayer.renderer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.tencent.liteav.txcvodplayer.renderer.b f100147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f100148b;

    public static final class a implements com.tencent.liteav.txcvodplayer.renderer.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SurfaceRenderView f100149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SurfaceHolder f100150b;

        public a(SurfaceRenderView surfaceRenderView, SurfaceHolder surfaceHolder) {
            this.f100149a = surfaceRenderView;
            this.f100150b = surfaceHolder;
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final com.tencent.liteav.txcvodplayer.renderer.a a() {
            return this.f100149a;
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final void a(ITXVCubePlayer iTXVCubePlayer) {
            if (iTXVCubePlayer != null) {
                if (LiteavSystemInfo.getSystemOSVersionInt() >= 16 && (iTXVCubePlayer instanceof com.tencent.liteav.txcplayer.b)) {
                    ((com.tencent.liteav.txcplayer.b) iTXVCubePlayer).setSurfaceTexture(null);
                }
                iTXVCubePlayer.setDisplay(this.f100150b);
            }
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final Surface b() {
            SurfaceHolder surfaceHolder = this.f100150b;
            if (surfaceHolder == null) {
                return null;
            }
            return surfaceHolder.getSurface();
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final Surface c() {
            return b();
        }
    }

    public static final class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SurfaceHolder f100151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f100152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f100153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f100154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        WeakReference<SurfaceRenderView> f100155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Map<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a, Object> f100156f = new ConcurrentHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f100157g;

        public b(SurfaceRenderView surfaceRenderView) {
            this.f100155e = new WeakReference<>(surfaceRenderView);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            this.f100151a = surfaceHolder;
            this.f100152b = true;
            this.f100157g = i10;
            this.f100153c = i11;
            this.f100154d = i12;
            a aVar = new a(this.f100155e.get(), this.f100151a);
            Iterator<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a> it = this.f100156f.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar, i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f100151a = surfaceHolder;
            this.f100152b = false;
            this.f100157g = 0;
            this.f100153c = 0;
            this.f100154d = 0;
            a aVar = new a(this.f100155e.get(), this.f100151a);
            Iterator<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a> it = this.f100156f.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f100151a = null;
            this.f100152b = false;
            this.f100157g = 0;
            this.f100153c = 0;
            this.f100154d = 0;
            a aVar = new a(this.f100155e.get(), this.f100151a);
            Iterator<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a> it = this.f100156f.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(aVar);
            }
        }
    }

    public SurfaceRenderView(Context context) {
        super(context);
        b();
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }

    private void b() {
        this.f100147a = new com.tencent.liteav.txcvodplayer.renderer.b(this);
        this.f100148b = new b(this);
        getHolder().addCallback(this.f100148b);
        getHolder().setType(0);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f100147a.a(i10, i11);
        getHolder().setFixedSize(i10, i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void a(com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a interfaceC0964a) {
        a aVar;
        b bVar = this.f100148b;
        bVar.f100156f.put(interfaceC0964a, interfaceC0964a);
        if (bVar.f100151a != null) {
            aVar = new a(bVar.f100155e.get(), bVar.f100151a);
            interfaceC0964a.a(aVar);
        } else {
            aVar = null;
        }
        if (bVar.f100152b) {
            if (aVar == null) {
                aVar = new a(bVar.f100155e.get(), bVar.f100151a);
            }
            interfaceC0964a.a(aVar, bVar.f100153c, bVar.f100154d);
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final boolean a() {
        return true;
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f100147a.b(i10, i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void b(com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a interfaceC0964a) {
        this.f100148b.f100156f.remove(interfaceC0964a);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 14) {
            accessibilityNodeInfo.setClassName(SurfaceRenderView.class.getName());
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f100147a.c(i10, i11);
        com.tencent.liteav.txcvodplayer.renderer.b bVar = this.f100147a;
        setMeasuredDimension(bVar.f100174b, bVar.f100175c);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator<com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a> it = this.f100148b.f100156f.keySet().iterator();
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
        this.f100147a.f100176d = i10;
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public void setVideoRotation(int i10) {
        LiteavLog.e("", "SurfaceView doesn't support rotation (" + i10 + ")!\n");
    }
}
