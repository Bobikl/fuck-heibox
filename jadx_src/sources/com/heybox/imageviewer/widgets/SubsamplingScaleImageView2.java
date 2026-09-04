package com.heybox.imageviewer.widgets;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import bb.c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.heybox.imageviewer.core.Components;
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

/* JADX INFO: compiled from: SubsamplingScaleImageView2.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class SubsamplingScaleImageView2 extends SubsamplingScaleImageView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final z f59825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private PointF f59826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private PointF f59827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private Float f59828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final z f59829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final z f59830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f59831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f59832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f59833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f59834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f59835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private c f59836m;

    /* JADX INFO: compiled from: SubsamplingScaleImageView2.kt */
    public static final class a implements SubsamplingScaleImageView.OnStateChangedListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(@e PointF pointF, int i10) {
            if (PatchProxy.proxy(new Object[]{pointF, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.f30898r2, new Class[]{PointF.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SubsamplingScaleImageView2.this.f59827d = pointF;
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f10, int i10) {
        }
    }

    /* JADX INFO: compiled from: SubsamplingScaleImageView2.kt */
    public static final class b extends SubsamplingScaleImageView.DefaultOnImageEventListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnImageEventListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoaded() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30920s2, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SubsamplingScaleImageView2.this.f59831h = true;
        }
    }

    /* JADX INFO: compiled from: SubsamplingScaleImageView2.kt */
    public interface c {
        void a(@d SubsamplingScaleImageView2 subsamplingScaleImageView2, float f10);

        void b(@d SubsamplingScaleImageView2 subsamplingScaleImageView2, float f10);

        void c(@d SubsamplingScaleImageView2 subsamplingScaleImageView2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @i
    public SubsamplingScaleImageView2(@d Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public SubsamplingScaleImageView2(@d final Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f59825b = b0.c(new yh.a<k>() { // from class: com.heybox.imageviewer.widgets.SubsamplingScaleImageView2$viewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @e
            public final k a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f31030x2, new Class[0], k.class);
                return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : (k) h.f59803a.a(this.f59841b, k.class);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.k, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ k invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f31052y2, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59829f = b0.c(new yh.a<Float>() { // from class: com.heybox.imageviewer.widgets.SubsamplingScaleImageView2$scaledTouchSlop$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @d
            public final Float a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30986v2, new Class[0], Float.class);
                return patchProxyResultProxy.isSupported ? (Float) patchProxyResultProxy.result : Float.valueOf(ViewConfiguration.get(context).getScaledTouchSlop() * com.heybox.imageviewer.utils.a.f59777a.g());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Float invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f31008w2, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59830g = b0.c(new yh.a<Float>() { // from class: com.heybox.imageviewer.widgets.SubsamplingScaleImageView2$dismissEdge$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final Float a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30942t2, new Class[0], Float.class);
                return patchProxyResultProxy.isSupported ? (Float) patchProxyResultProxy.result : Float.valueOf(this.f59839b.getHeight() * com.heybox.imageviewer.utils.a.f59777a.b());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Float invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30964u2, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59832i = true;
        setOnStateChangedListener(new a());
        setOnImageEventListener(new b());
        setExecutor(Components.f59730a.a());
    }

    public /* synthetic */ SubsamplingScaleImageView2(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void c(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 273, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f59833j == 0.0f) {
            if (f11 > getScaledTouchSlop()) {
                this.f59833j = getScaledTouchSlop();
            } else if (f11 < (-getScaledTouchSlop())) {
                this.f59833j = -getScaledTouchSlop();
            }
        }
        float f12 = this.f59833j;
        if (f12 == 0.0f) {
            return;
        }
        float f13 = f11 - f12;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        float fAbs = Math.abs(Math.max(-1.0f, Math.min(1.0f, f13 / getHeight())));
        float fMin = 1 - Math.min(0.4f, fAbs);
        setScaleX(fMin);
        setScaleY(fMin);
        setTranslationY(f13);
        setTranslationX(f10 / 2);
        c cVar = this.f59836m;
        if (cVar != null) {
            cVar.a(this, fAbs);
        }
    }

    private final void d(MotionEvent motionEvent) {
        if (!PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.b.f30784m2, new Class[]{MotionEvent.class}, Void.TYPE).isSupported && this.f59831h) {
            if (this.f59828e == null) {
                this.f59828e = Float.valueOf(getScale());
                this.f59826c = getCenter();
                this.f59827d = getCenter();
            }
            Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
            if (numValueOf != null && numValueOf.intValue() == 5) {
                setSingleTouch(false);
                animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
                return;
            }
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                e();
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2 && this.f59832i && f0.b(getScale(), this.f59828e)) {
                PointF pointF = this.f59827d;
                Float fValueOf = (pointF == null && (pointF = this.f59826c) == null) ? null : Float.valueOf(pointF.y);
                PointF pointF2 = this.f59826c;
                if (f0.e(fValueOf, pointF2 != null ? pointF2.y : 0.0f)) {
                    if (this.f59834k == 0.0f) {
                        this.f59834k = motionEvent.getRawX();
                    }
                    if (this.f59835l == 0.0f) {
                        this.f59835l = motionEvent.getRawY();
                    }
                    c(motionEvent.getRawX() - this.f59834k, motionEvent.getRawY() - this.f59835l);
                }
            }
        }
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30830o2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        setSingleTouch(true);
        this.f59833j = 0.0f;
        this.f59834k = 0.0f;
        this.f59835l = 0.0f;
        if (Math.abs(getTranslationY()) > getDismissEdge()) {
            c cVar = this.f59836m;
            if (cVar != null) {
                cVar.c(this);
                return;
            }
            return;
        }
        float fMin = Math.min(1.0f, getTranslationY() / getHeight());
        c cVar2 = this.f59836m;
        if (cVar2 != null) {
            cVar2.b(this, fMin);
        }
        animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
    }

    private final float getDismissEdge() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 270, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ((Number) this.f59830g.getValue()).floatValue();
    }

    private final float getScaledTouchSlop() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30715j2, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ((Number) this.f59829f.getValue()).floatValue();
    }

    private final k getViewModel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30692i2, new Class[0], k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : (k) this.f59825b.getValue();
    }

    private final void setSingleTouch(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.f30853p2, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f59832i = z10;
        k viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.h(z10);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.b.f30761l2, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.heybox.imageviewer.utils.a aVar = com.heybox.imageviewer.utils.a.f59777a;
        if (aVar.f() && aVar.l() == 0) {
            d(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30876q2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        animate().cancel();
    }

    public final void setListener(@e c cVar) {
        this.f59836m = cVar;
    }
}
