package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.k0;
import androidx.annotation.w0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1747#2,3:318\n533#2,6:321\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n194#1:318,3\n209#1:321,6\n*E\n"})
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Runnable f1378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.collections.i<o> f1379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f1380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private OnBackInvokedCallback f1381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private OnBackInvokedDispatcher f1382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1383f;

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public final class LifecycleOnBackPressedCancellable implements v, d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Lifecycle f1386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final o f1387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private d f1388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f1389e;

        public LifecycleOnBackPressedCancellable(@dl.d OnBackPressedDispatcher onBackPressedDispatcher, @dl.d Lifecycle lifecycle, o onBackPressedCallback) {
            f0.p(lifecycle, "lifecycle");
            f0.p(onBackPressedCallback, "onBackPressedCallback");
            this.f1389e = onBackPressedDispatcher;
            this.f1386b = lifecycle;
            this.f1387c = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.d
        public void cancel() {
            this.f1386b.d(this);
            this.f1387c.removeCancellable(this);
            d dVar = this.f1388d;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f1388d = null;
        }

        @Override // androidx.lifecycle.v
        public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
            f0.p(source, "source");
            f0.p(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.f1388d = this.f1389e.d(this.f1387c);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                d dVar = this.f1388d;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @w0(33)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f1390a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(yh.a onBackInvoked) {
            f0.p(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @androidx.annotation.u
        @dl.d
        public final OnBackInvokedCallback b(@dl.d final yh.a<b2> onBackInvoked) {
            f0.p(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.p
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.a.c(onBackInvoked);
                }
            };
        }

        @androidx.annotation.u
        public final void d(@dl.d Object dispatcher, int i10, @dl.d Object callback) {
            f0.p(dispatcher, "dispatcher");
            f0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        @androidx.annotation.u
        public final void e(@dl.d Object dispatcher, @dl.d Object callback) {
            f0.p(dispatcher, "dispatcher");
            f0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public final class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final o f1391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f1392c;

        public b(@dl.d OnBackPressedDispatcher onBackPressedDispatcher, o onBackPressedCallback) {
            f0.p(onBackPressedCallback, "onBackPressedCallback");
            this.f1392c = onBackPressedDispatcher;
            this.f1391b = onBackPressedCallback;
        }

        @Override // androidx.activity.d
        public void cancel() {
            this.f1392c.f1379b.remove(this.f1391b);
            this.f1391b.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f1391b.setEnabledChangedCallback$activity_release(null);
                this.f1392c.h();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @xh.i
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @xh.i
    public OnBackPressedDispatcher(@dl.e Runnable runnable) {
        this.f1378a = runnable;
        this.f1379b = new kotlin.collections.i<>();
        if (Build.VERSION.SDK_INT >= 33) {
            this.f1380c = new yh.a<b2>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.h();
                }
            };
            this.f1381d = a.f1390a.b(new yh.a<b2>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.f();
                }
            });
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : runnable);
    }

    @k0
    public final void b(@dl.d o onBackPressedCallback) {
        f0.p(onBackPressedCallback, "onBackPressedCallback");
        d(onBackPressedCallback);
    }

    @k0
    public final void c(@dl.d y owner, @dl.d o onBackPressedCallback) {
        f0.p(owner, "owner");
        f0.p(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            h();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f1380c);
        }
    }

    @dl.d
    @k0
    public final d d(@dl.d o onBackPressedCallback) {
        f0.p(onBackPressedCallback, "onBackPressedCallback");
        this.f1379b.add(onBackPressedCallback);
        b bVar = new b(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(bVar);
        if (Build.VERSION.SDK_INT >= 33) {
            h();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f1380c);
        }
        return bVar;
    }

    @k0
    public final boolean e() {
        kotlin.collections.i<o> iVar = this.f1379b;
        if ((iVar instanceof Collection) && iVar.isEmpty()) {
            return false;
        }
        Iterator<o> it = iVar.iterator();
        while (it.hasNext()) {
            if (it.next().isEnabled()) {
                return true;
            }
        }
        return false;
    }

    @k0
    public final void f() {
        o oVarPrevious;
        kotlin.collections.i<o> iVar = this.f1379b;
        ListIterator<o> listIterator = iVar.listIterator(iVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                oVarPrevious = null;
                break;
            }
            oVarPrevious = listIterator.previous();
        } while (!oVarPrevious.isEnabled());
        o oVar = oVarPrevious;
        if (oVar != null) {
            oVar.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f1378a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @w0(33)
    public final void g(@dl.d OnBackInvokedDispatcher invoker) {
        f0.p(invoker, "invoker");
        this.f1382e = invoker;
        h();
    }

    @w0(33)
    public final void h() {
        boolean zE = e();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1382e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1381d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (zE && !this.f1383f) {
            a.f1390a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1383f = true;
        } else {
            if (zE || !this.f1383f) {
                return;
            }
            a.f1390a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1383f = false;
        }
    }
}
