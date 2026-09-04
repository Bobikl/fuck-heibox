package com.heybox.imageviewer.widgets.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.heybox.imageviewer.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.i;

/* JADX INFO: compiled from: ExoVideoView2.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nExoVideoView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExoVideoView2.kt\ncom/heybox/imageviewer/widgets/video/ExoVideoView2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1855#2,2:147\n1855#2,2:149\n1855#2,2:151\n*S KotlinDebug\n*F\n+ 1 ExoVideoView2.kt\ncom/heybox/imageviewer/widgets/video/ExoVideoView2\n*L\n101#1:147,2\n113#1:149,2\n117#1:151,2\n*E\n"})
public final class ExoVideoView2 extends ExoVideoView implements View.OnTouchListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d
    private final z f59860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    private final z f59861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f59862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f59863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f59864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f59865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @d
    private final List<a> f59866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @e
    private View.OnClickListener f59867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e
    private View.OnLongClickListener f59868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d
    private final GestureDetector f59869x;

    /* JADX INFO: compiled from: ExoVideoView2.kt */
    public interface a {
        void a(@d ExoVideoView2 exoVideoView2, float f10);

        void b(@d ExoVideoView2 exoVideoView2);

        void c(@d ExoVideoView2 exoVideoView2, float f10);
    }

    /* JADX INFO: compiled from: ExoVideoView2.kt */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@d MotionEvent e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 315, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            View.OnLongClickListener onLongClickListener = ExoVideoView2.this.f59868w;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(ExoVideoView2.this);
            }
        }
    }

    /* JADX INFO: compiled from: ExoVideoView2.kt */
    public static final class c implements GestureDetector.OnDoubleTapListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(@e MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(@e MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@e MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 316, new Class[]{MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            View.OnClickListener onClickListener = ExoVideoView2.this.f59867v;
            if (onClickListener != null) {
                onClickListener.onClick(ExoVideoView2.this);
            }
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public ExoVideoView2(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public ExoVideoView2(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public ExoVideoView2(@d final Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f59860o = b0.c(new yh.a<Float>() { // from class: com.heybox.imageviewer.widgets.video.ExoVideoView2$scaledTouchSlop$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @d
            public final Float a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 317, new Class[0], Float.class);
                return patchProxyResultProxy.isSupported ? (Float) patchProxyResultProxy.result : Float.valueOf(ViewConfiguration.get(context).getScaledTouchSlop() * a.f59777a.g());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Float invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 318, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59861p = b0.c(new yh.a<Float>() { // from class: com.heybox.imageviewer.widgets.video.ExoVideoView2$dismissEdge$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final Float a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 313, new Class[0], Float.class);
                return patchProxyResultProxy.isSupported ? (Float) patchProxyResultProxy.result : Float.valueOf(this.f59872b.getHeight() * a.f59777a.b());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Float invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 314, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59862q = true;
        this.f59866u = new ArrayList();
        setOnTouchListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new b());
        gestureDetector.setOnDoubleTapListener(new c());
        this.f59869x = gestureDetector;
    }

    public /* synthetic */ ExoVideoView2(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final float getDismissEdge() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 305, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ((Number) this.f59861p.getValue()).floatValue();
    }

    private final float getScaledTouchSlop() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 304, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ((Number) this.f59860o.getValue()).floatValue();
    }

    private final void s(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 310, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f59863r == 0.0f) {
            if (f11 > getScaledTouchSlop()) {
                this.f59863r = getScaledTouchSlop();
            } else if (f11 < (-getScaledTouchSlop())) {
                this.f59863r = -getScaledTouchSlop();
            }
        }
        float f12 = this.f59863r;
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
        Iterator it = CollectionsKt___CollectionsKt.Q5(this.f59866u).iterator();
        while (it.hasNext()) {
            ((a) it.next()).c(this, fAbs);
        }
    }

    private final void t(MotionEvent motionEvent) {
        if (!PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 309, new Class[]{MotionEvent.class}, Void.TYPE).isSupported && getPrepared()) {
            Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
            if (numValueOf != null && numValueOf.intValue() == 5) {
                this.f59862q = false;
                animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
                return;
            }
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                u();
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2 && this.f59862q) {
                if (this.f59864s == 0.0f) {
                    this.f59864s = motionEvent.getRawX();
                }
                if (this.f59865t == 0.0f) {
                    this.f59865t = motionEvent.getRawY();
                }
                s(motionEvent.getRawX() - this.f59864s, motionEvent.getRawY() - this.f59865t);
            }
        }
    }

    private final void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 311, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f59862q = true;
        this.f59863r = 0.0f;
        this.f59864s = 0.0f;
        this.f59865t = 0.0f;
        if (Math.abs(getTranslationY()) > getDismissEdge()) {
            Iterator it = CollectionsKt___CollectionsKt.Q5(this.f59866u).iterator();
            while (it.hasNext()) {
                ((a) it.next()).b(this);
            }
        } else {
            float fMin = Math.min(1.0f, getTranslationY() / getHeight());
            Iterator it2 = CollectionsKt___CollectionsKt.Q5(this.f59866u).iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a(this, fMin);
            }
            animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 307, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.heybox.imageviewer.utils.a aVar = com.heybox.imageviewer.utils.a.f59777a;
        if (aVar.f() && aVar.l() == 0) {
            t(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.heybox.imageviewer.widgets.video.ExoVideoView, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 312, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        animate().cancel();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@e View view, @e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 308, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        this.f59869x.onTouchEvent(motionEvent);
        return true;
    }

    public final void r(@d a listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, 306, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        if (this.f59866u.contains(listener)) {
            return;
        }
        this.f59866u.add(listener);
    }

    @Override // android.view.View
    public void setOnClickListener(@e View.OnClickListener onClickListener) {
        this.f59867v = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(@e View.OnLongClickListener onLongClickListener) {
        this.f59868w = onLongClickListener;
    }
}
