package com.max.xiaoheihe.utils.imageviewer;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.j0;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.t;
import yh.l;

/* JADX INFO: compiled from: Extentions.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class ExtentionsKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: Extentions.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f95422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f95423c;

        a(a0 a0Var, View view) {
            this.f95422b = a0Var;
            this.f95423c = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@d View v10) {
            if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, 49138, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
            this.f95422b.s(Lifecycle.State.CREATED);
            this.f95422b.l(Lifecycle.Event.ON_START);
            this.f95422b.l(Lifecycle.Event.ON_RESUME);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@d View v10) {
            if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, 49139, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
            this.f95422b.l(Lifecycle.Event.ON_PAUSE);
            this.f95422b.l(Lifecycle.Event.ON_STOP);
            this.f95422b.s(Lifecycle.State.DESTROYED);
            this.f95423c.setTag(R.id.view_lifecycle_owner, null);
            this.f95423c.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: compiled from: Extentions.kt */
    public static final class b implements y {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        private final a0 f95424b = new a0(this);

        b() {
        }

        @Override // androidx.lifecycle.y
        @d
        public Lifecycle getLifecycle() {
            return this.f95424b;
        }
    }

    /* JADX INFO: compiled from: Extentions.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f95426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<View, b2> f95427c;

        /* JADX WARN: Multi-variable type inference failed */
        c(long j10, l<? super View, b2> lVar) {
            this.f95426b = j10;
            this.f95427c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@e View view) {
            String string;
            Long lA1;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49142, new Class[]{View.class}, Void.TYPE).isSupported || view == null) {
                return;
            }
            Object tag = view.getTag(R.id.view_last_click_timestamp);
            long jLongValue = (tag == null || (string = tag.toString()) == null || (lA1 = t.a1(string)) == null) ? 0L : lA1.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue < this.f95426b) {
                return;
            }
            view.setTag(R.id.view_last_click_timestamp, Long.valueOf(jCurrentTimeMillis));
            this.f95427c.invoke(view);
        }
    }

    public static final void a(@d final io.reactivex.disposables.b bVar, @e Lifecycle lifecycle) {
        if (PatchProxy.proxy(new Object[]{bVar, lifecycle}, null, changeQuickRedirect, true, 49127, new Class[]{io.reactivex.disposables.b.class, Lifecycle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bVar, "<this>");
        if (lifecycle != null) {
            g(lifecycle, new yh.a<b2>() { // from class: com.max.xiaoheihe.utils.imageviewer.ExtentionsKt$bindLifecycle$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49137, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49136, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    bVar.dispose();
                }
            });
        }
    }

    private static final Activity b(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 49129, new Class[]{Context.class}, Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @e
    public static final FragmentActivity c(@d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49128, new Class[]{View.class}, FragmentActivity.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentActivity) patchProxyResultProxy.result;
        }
        f0.p(view, "<this>");
        return (FragmentActivity) b(view.getContext());
    }

    @d
    public static final y d(@d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49130, new Class[]{View.class}, y.class);
        if (patchProxyResultProxy.isSupported) {
            return (y) patchProxyResultProxy.result;
        }
        f0.p(view, "<this>");
        Object tag = view.getTag(R.id.view_lifecycle_owner);
        y yVar = tag instanceof y ? (y) tag : null;
        if (yVar != null) {
            return yVar;
        }
        b bVar = new b();
        view.setTag(R.id.view_lifecycle_owner, bVar);
        Lifecycle lifecycle = bVar.getLifecycle();
        f0.n(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
        view.addOnAttachStateChangeListener(new a((a0) lifecycle, view));
        return bVar;
    }

    @d
    public static final View e(@d ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, null, changeQuickRedirect, true, 49135, new Class[]{ViewGroup.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        f0.o(viewInflate, "from(context).inflate(resId, this, false)");
        return viewInflate;
    }

    public static final <T> void f(@d LiveData<T> liveData, @d View view, @d j0<T> observer) {
        if (PatchProxy.proxy(new Object[]{liveData, view, observer}, null, changeQuickRedirect, true, 49131, new Class[]{LiveData.class, View.class, j0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(liveData, "<this>");
        f0.p(view, "view");
        f0.p(observer, "observer");
        liveData.k(d(view), observer);
    }

    public static final void g(@d final Lifecycle lifecycle, @d final yh.a<b2> block) {
        if (PatchProxy.proxy(new Object[]{lifecycle, block}, null, changeQuickRedirect, true, 49132, new Class[]{Lifecycle.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lifecycle, "<this>");
        f0.p(block, "block");
        lifecycle.a(new v() { // from class: com.max.xiaoheihe.utils.imageviewer.ExtentionsKt$observeOnDestroy$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.v
            public void d(@d y source, @d Lifecycle.Event event) {
                if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, 49140, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(source, "source");
                f0.p(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    block.invoke();
                    lifecycle.d(this);
                }
            }
        });
    }

    public static final void h(@d final Lifecycle lifecycle, final boolean z10, @d final yh.a<b2> block) {
        if (PatchProxy.proxy(new Object[]{lifecycle, new Byte(z10 ? (byte) 1 : (byte) 0), block}, null, changeQuickRedirect, true, 49133, new Class[]{Lifecycle.class, Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lifecycle, "<this>");
        f0.p(block, "block");
        lifecycle.a(new v() { // from class: com.max.xiaoheihe.utils.imageviewer.ExtentionsKt$observeOnResume$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.v
            public void d(@d y source, @d Lifecycle.Event event) {
                if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, 49141, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(source, "source");
                f0.p(event, "event");
                if (event != Lifecycle.Event.ON_RESUME) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.d(this);
                    }
                } else {
                    block.invoke();
                    if (z10) {
                        lifecycle.d(this);
                    }
                }
            }
        });
    }

    public static /* synthetic */ void i(Lifecycle lifecycle, boolean z10, yh.a aVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{lifecycle, new Byte(z10 ? (byte) 1 : (byte) 0), aVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 49134, new Class[]{Lifecycle.class, Boolean.TYPE, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        h(lifecycle, z10, aVar);
    }

    public static final void j(@d View view, long j10, @d l<? super View, b2> callback) {
        if (PatchProxy.proxy(new Object[]{view, new Long(j10), callback}, null, changeQuickRedirect, true, 49125, new Class[]{View.class, Long.TYPE, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        f0.p(callback, "callback");
        if (!view.isClickable()) {
            view.setClickable(true);
        }
        if (!view.isFocusable()) {
            view.setFocusable(true);
        }
        view.setOnClickListener(new c(j10, callback));
    }

    public static /* synthetic */ void k(View view, long j10, l lVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{view, new Long(j10), lVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 49126, new Class[]{View.class, Long.TYPE, l.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            j10 = 500;
        }
        j(view, j10, lVar);
    }
}
