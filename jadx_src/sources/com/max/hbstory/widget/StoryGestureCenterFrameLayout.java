package com.max.hbstory.widget;

import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.m;
import com.max.hbstory.bean.StoryStatInfoObj;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;

/* JADX INFO: compiled from: StoryGestureCenterFrameLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryGestureCenterFrameLayout extends View implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final b f73040j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f73041k = 200;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f73042l = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private m f73043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f73044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private final c f73046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private com.max.hbstory.d f73047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f73049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f73050i;

    /* JADX INFO: compiled from: StoryGestureCenterFrameLayout.kt */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@d MotionEvent e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.Ij, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            StoryGestureCenterFrameLayout.this.f73049h = true;
            StoryGestureCenterFrameLayout.a(StoryGestureCenterFrameLayout.this);
            super.onLongPress(e10);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@e MotionEvent motionEvent, @d MotionEvent e10, float f10, float f11) {
            Object[] objArr = {motionEvent, e10, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Jj, new Class[]{MotionEvent.class, MotionEvent.class, cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(e10, "e2");
            StoryGestureCenterFrameLayout.b(StoryGestureCenterFrameLayout.this, motionEvent, e10, f10, f11, false);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@d MotionEvent e10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.Hj, new Class[]{MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(e10, "e");
            StoryGestureCenterFrameLayout.this.performClick();
            return super.onSingleTapConfirmed(e10);
        }
    }

    /* JADX INFO: compiled from: StoryGestureCenterFrameLayout.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryGestureCenterFrameLayout(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryGestureCenterFrameLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryGestureCenterFrameLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f73050i = true;
        this.f73043b = new m(context, new a());
    }

    public /* synthetic */ StoryGestureCenterFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final /* synthetic */ void a(StoryGestureCenterFrameLayout storyGestureCenterFrameLayout) {
        if (PatchProxy.proxy(new Object[]{storyGestureCenterFrameLayout}, null, changeQuickRedirect, true, bb.c.k.Fj, new Class[]{StoryGestureCenterFrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        storyGestureCenterFrameLayout.i();
    }

    public static final /* synthetic */ void b(StoryGestureCenterFrameLayout storyGestureCenterFrameLayout, MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11, boolean z10) {
        Object[] objArr = {storyGestureCenterFrameLayout, motionEvent, motionEvent2, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Gj, new Class[]{StoryGestureCenterFrameLayout.class, MotionEvent.class, MotionEvent.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyGestureCenterFrameLayout.j(motionEvent, motionEvent2, f10, f11, z10);
    }

    private final void g(g.a aVar) {
        g gVarQ;
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.k.Bj, new Class[]{g.a.class}, Void.TYPE).isSupported || (gVarQ = StoryUtilsKt.q(this)) == null) {
            return;
        }
        gVarQ.Q(aVar);
    }

    private final void h() {
        g gVarQ;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Ej, new Class[0], Void.TYPE).isSupported || (gVarQ = StoryUtilsKt.q(this)) == null) {
            return;
        }
        gVarQ.R(false);
    }

    private final void i() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Dj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
        if (vibrator != null && vibrator.hasVibrator()) {
            z10 = true;
        }
        if (z10) {
            vibrator.vibrate(50L);
        }
        g gVarQ = StoryUtilsKt.q(this);
        if (gVarQ != null) {
            gVarQ.R(true);
        }
    }

    private final void j(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11, boolean z10) {
        g gVarQ;
        Object[] objArr = {motionEvent, motionEvent2, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f34007zj, new Class[]{MotionEvent.class, MotionEvent.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported || (gVarQ = StoryUtilsKt.q(this)) == null) {
            return;
        }
        gVarQ.S(motionEvent, motionEvent2, f10, f11, z10);
    }

    private final void k(g.a aVar) {
        g gVarQ;
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.k.Aj, new Class[]{g.a.class}, Void.TYPE).isSupported || (gVarQ = StoryUtilsKt.q(this)) == null) {
            return;
        }
        gVarQ.P(aVar);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33941wj, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33963xj, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f73046e;
    }

    public final boolean getMIsTouchReleased() {
        return this.f73050i;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f73048g;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public com.max.hbstory.d getMStoryContext() {
        return this.f73047f;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    @Override // android.view.View
    public boolean onTouchEvent(@d MotionEvent event) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{event}, this, changeQuickRedirect, false, bb.c.k.f33985yj, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f73050i = false;
        } else if (action == 1 || action == 3) {
            this.f73050i = true;
            j(null, null, 0.0f, 0.0f, true);
        }
        this.f73043b.b(event);
        if ((event.getAction() == 1 || event.getAction() == 3) && this.f73049h) {
            this.f73049h = false;
            h();
            return true;
        }
        if (event.getAction() == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("before tapCount: ");
            sb2.append(this.f73045d);
            sb2.append("   mPosition: ");
            sb2.append(getMPosition());
            sb2.append("  isLiked: ");
            StoryStatInfoObj storyStatInfoObjK = StoryUtilsKt.k(this, getMPosition());
            sb2.append(storyStatInfoObjK != null ? Boolean.valueOf(storyStatInfoObjK.is_award_link()) : null);
            Log.d("onTouchEvent", sb2.toString());
            if (jCurrentTimeMillis - this.f73044c < 200) {
                int i10 = this.f73045d + 1;
                this.f73045d = i10;
                if (i10 == 2) {
                    StoryStatInfoObj storyStatInfoObjK2 = StoryUtilsKt.k(this, getMPosition());
                    if (storyStatInfoObjK2 != null && !storyStatInfoObjK2.is_award_link()) {
                        z10 = true;
                    }
                    if (z10) {
                        g(new g.a(event.getX(), event.getY(), this.f73045d));
                    } else if (this.f73045d >= 2) {
                        k(new g.a(event.getX(), event.getY(), this.f73045d));
                    }
                } else if (this.f73045d >= 2) {
                    k(new g.a(event.getX(), event.getY(), this.f73045d));
                }
            } else {
                this.f73045d = 1;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("after tapCount: ");
            sb3.append(this.f73045d);
            sb3.append("   mPosition: ");
            sb3.append(getMPosition());
            sb3.append("  isLiked: ");
            StoryStatInfoObj storyStatInfoObjK3 = StoryUtilsKt.k(this, getMPosition());
            sb3.append(storyStatInfoObjK3 != null ? Boolean.valueOf(storyStatInfoObjK3.is_award_link()) : null);
            Log.d("onTouchEvent", sb3.toString());
            this.f73044c = jCurrentTimeMillis;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Cj, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        g gVarQ = StoryUtilsKt.q(this);
        if (gVarQ != null) {
            gVarQ.T();
        }
        return super.performClick();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f73048g = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e com.max.hbstory.d dVar) {
        this.f73047f = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
    }
}
