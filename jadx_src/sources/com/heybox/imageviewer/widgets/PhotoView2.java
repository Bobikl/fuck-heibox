package com.heybox.imageviewer.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import bb.c;
import com.github.chrisbanes.photoview.PhotoView;
import com.heybox.imageviewer.k;
import com.heybox.imageviewer.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.i;

/* JADX INFO: compiled from: PhotoView2.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class PhotoView2 extends PhotoView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final z f59814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final z f59815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final z f59816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f59817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f59818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f59819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f59820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private a f59821k;

    /* JADX INFO: compiled from: PhotoView2.kt */
    public interface a {
        void a(@d PhotoView2 photoView2, float f10);

        void b(@d PhotoView2 photoView2);

        void c(@d PhotoView2 photoView2, float f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public PhotoView2(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public PhotoView2(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public PhotoView2(@d final Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f59814d = b0.c(new yh.a<k>() { // from class: com.heybox.imageviewer.widgets.PhotoView2$viewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @e
            public final k a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30646g2, new Class[0], k.class);
                return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : (k) h.f59803a.a(this.f59824b, k.class);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.k, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ k invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30669h2, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59815e = b0.c(new yh.a<Float>() { // from class: com.heybox.imageviewer.widgets.PhotoView2$scaledTouchSlop$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @d
            public final Float a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30600e2, new Class[0], Float.class);
                return patchProxyResultProxy.isSupported ? (Float) patchProxyResultProxy.result : Float.valueOf(ViewConfiguration.get(context).getScaledTouchSlop() * com.heybox.imageviewer.utils.a.f59777a.g());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Float invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30623f2, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59816f = b0.c(new yh.a<Float>() { // from class: com.heybox.imageviewer.widgets.PhotoView2$dismissEdge$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final Float a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30553c2, new Class[0], Float.class);
                return patchProxyResultProxy.isSupported ? (Float) patchProxyResultProxy.result : Float.valueOf(this.f59822b.getHeight() * com.heybox.imageviewer.utils.a.f59777a.b());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Float invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 263, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59817g = true;
    }

    public /* synthetic */ PhotoView2(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final float getDismissEdge() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 255, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ((Number) this.f59816f.getValue()).floatValue();
    }

    private final float getScaledTouchSlop() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 254, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ((Number) this.f59815e.getValue()).floatValue();
    }

    private final k getViewModel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 253, new Class[0], k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : (k) this.f59814d.getValue();
    }

    private final void k(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 258, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f59818h == 0.0f) {
            if (f11 > getScaledTouchSlop()) {
                this.f59818h = getScaledTouchSlop();
            } else if (f11 < (-getScaledTouchSlop())) {
                this.f59818h = -getScaledTouchSlop();
            }
        }
        float f12 = this.f59818h;
        if (f12 == 0.0f) {
            return;
        }
        float f13 = f11 - f12;
        setAllowParentInterceptOnEdge(false);
        float fAbs = Math.abs(Math.max(-1.0f, Math.min(1.0f, f13 / getHeight())));
        float fMin = 1 - Math.min(0.4f, fAbs);
        setScaleX(fMin);
        setScaleY(fMin);
        setTranslationY(f13);
        setTranslationX(f10 / 2);
        a aVar = this.f59821k;
        if (aVar != null) {
            aVar.c(this, fAbs);
        }
    }

    private final void l(MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 257, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 5) {
            setSingleTouch(false);
            animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
            return;
        }
        if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
            m();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2 && this.f59817g) {
            if (getScale() == 1.0f) {
                if (this.f59819i == 0.0f) {
                    this.f59819i = motionEvent.getRawX();
                }
                if (this.f59820j == 0.0f) {
                    this.f59820j = motionEvent.getRawY();
                }
                k(motionEvent.getRawX() - this.f59819i, motionEvent.getRawY() - this.f59820j);
            }
        }
    }

    private final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Z1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setAllowParentInterceptOnEdge(true);
        setSingleTouch(true);
        this.f59818h = 0.0f;
        this.f59819i = 0.0f;
        this.f59820j = 0.0f;
        if (Math.abs(getTranslationY()) > getDismissEdge()) {
            a aVar = this.f59821k;
            if (aVar != null) {
                aVar.b(this);
                return;
            }
            return;
        }
        float fMin = Math.min(1.0f, getTranslationY() / getHeight());
        a aVar2 = this.f59821k;
        if (aVar2 != null) {
            aVar2.a(this, fMin);
        }
        animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
    }

    private final void setSingleTouch(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.b.f30507a2, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f59817g = z10;
        k viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.h(z10);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 256, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.heybox.imageviewer.utils.a aVar = com.heybox.imageviewer.utils.a.f59777a;
        if (aVar.f() && aVar.l() == 0) {
            l(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30530b2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        animate().cancel();
    }

    public final void setListener(@e a aVar) {
        this.f59821k = aVar;
    }
}
