package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryBottomEditorBarWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryBottomEditorBarWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/LikeTouchListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,900:1\n1#2:901\n*E\n"})
@o(parameters = 0)
public final class a implements View.OnTouchListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f92365l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final StoryBottomEditorBarWidget f92366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final yh.a<b2> f92367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final yh.a<b2> f92368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final yh.a<b2> f92369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final yh.a<b2> f92370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f92371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f92372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private Runnable f92373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f92374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private String f92375k;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.story.widget.ui.video.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    @o(parameters = 0)
    public static final class RunnableC0867a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f92376c = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        private final WeakReference<BottomEditorBarPostPageImpl> f92377b;

        public RunnableC0867a(@d BottomEditorBarPostPageImpl impl) {
            f0.p(impl, "impl");
            this.f92377b = new WeakReference<>(impl);
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43947, new Class[0], Void.TYPE).isSupported || (bottomEditorBarPostPageImpl = this.f92377b.get()) == null) {
                return;
            }
            bottomEditorBarPostPageImpl.P0();
            if (bottomEditorBarPostPageImpl.I0()) {
                bottomEditorBarPostPageImpl.setComboTipVisible(false);
            }
        }
    }

    public a(@d StoryBottomEditorBarWidget widget, @d yh.a<b2> onLikeFoo, @d yh.a<b2> onDislikeFoo, @d yh.a<b2> onComboFoo, @d yh.a<b2> onCancelComboFoo) {
        f0.p(widget, "widget");
        f0.p(onLikeFoo, "onLikeFoo");
        f0.p(onDislikeFoo, "onDislikeFoo");
        f0.p(onComboFoo, "onComboFoo");
        f0.p(onCancelComboFoo, "onCancelComboFoo");
        this.f92366b = widget;
        this.f92367c = onLikeFoo;
        this.f92368d = onDislikeFoo;
        this.f92369e = onComboFoo;
        this.f92370f = onCancelComboFoo;
        this.f92375k = "";
    }

    private final void b() {
        Runnable runnable;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43945, new Class[0], Void.TYPE).isSupported || (runnable = this.f92373i) == null) {
            return;
        }
        this.f92366b.removeCallbacks(runnable);
    }

    private final boolean c(long j10) {
        return j10 < 2000;
    }

    private final boolean d(long j10) {
        return j10 < 500;
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43946, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RunnableC0867a runnableC0867a = new RunnableC0867a(this.f92366b);
        this.f92373i = runnableC0867a;
        StoryBottomEditorBarWidget storyBottomEditorBarWidget = this.f92366b;
        f0.m(runnableC0867a);
        storyBottomEditorBarWidget.postDelayed(runnableC0867a, 500L);
    }

    private final void f(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 43943, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!d(j10 - this.f92374j)) {
            this.f92374j = j10;
            this.f92367c.invoke();
        }
        g(false);
    }

    private final void g(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43944, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f92366b.x0(f0.g(this.f92375k, i0.j()), z10);
    }

    private final boolean h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43941, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(this.f92375k, i0.j());
    }

    public final void a(@e String str) {
        if (str != null) {
            this.f92375k = str;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@d View v10, @d MotionEvent event) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, event}, this, changeQuickRedirect, false, 43942, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(v10, "v");
        f0.p(event, "event");
        int action = event.getAction();
        if (action == 0) {
            boolean z10 = this.f92366b.J0();
            this.f92371g = z10;
            if (!z10) {
                this.f92366b.y0(h());
                e();
                this.f92369e.invoke();
            }
            this.f92372h = System.currentTimeMillis();
        } else if (action == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.f92371g) {
                b();
                if (c(jCurrentTimeMillis - this.f92372h)) {
                    this.f92370f.invoke();
                    if (d(jCurrentTimeMillis - this.f92372h)) {
                        f(jCurrentTimeMillis);
                    } else {
                        g(true);
                    }
                    this.f92366b.R0();
                }
            } else if (!d(jCurrentTimeMillis - this.f92374j)) {
                this.f92374j = System.currentTimeMillis();
                this.f92368d.invoke();
            }
        }
        return true;
    }
}
