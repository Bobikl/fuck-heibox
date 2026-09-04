package com.uber.autodispose.android.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k0;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import com.uber.autodispose.android.internal.d;
import io.reactivex.g0;
import io.reactivex.z;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class LifecycleEventsObservable extends z<Lifecycle.Event> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lifecycle f104068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.subjects.a<Lifecycle.Event> f104069c = io.reactivex.subjects.a.n8();

    public static final class ArchLifecycleObserver extends d implements x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Lifecycle f104070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g0<? super Lifecycle.Event> f104071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.reactivex.subjects.a<Lifecycle.Event> f104072e;

        ArchLifecycleObserver(Lifecycle lifecycle, g0<? super Lifecycle.Event> g0Var, io.reactivex.subjects.a<Lifecycle.Event> aVar) {
            this.f104070c = lifecycle;
            this.f104071d = g0Var;
            this.f104072e = aVar;
        }

        @Override // com.uber.autodispose.android.internal.d
        protected void b() {
            this.f104070c.d(this);
        }

        @k0(Lifecycle.Event.ON_ANY)
        void onStateChange(y yVar, Lifecycle.Event event) {
            if (isDisposed()) {
                return;
            }
            if (event != Lifecycle.Event.ON_CREATE || this.f104072e.p8() != event) {
                this.f104072e.onNext(event);
            }
            this.f104071d.onNext(event);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104073a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f104073a = iArr;
            try {
                iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104073a[Lifecycle.State.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104073a[Lifecycle.State.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104073a[Lifecycle.State.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f104073a[Lifecycle.State.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    LifecycleEventsObservable(Lifecycle lifecycle) {
        this.f104068b = lifecycle;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super Lifecycle.Event> g0Var) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f104068b, g0Var, this.f104069c);
        g0Var.onSubscribe(archLifecycleObserver);
        if (!com.uber.autodispose.android.internal.b.b()) {
            g0Var.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f104068b.a(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.f104068b.d(archLifecycleObserver);
        }
    }

    void h8() {
        Lifecycle.Event event;
        int i10 = a.f104073a[this.f104068b.b().ordinal()];
        if (i10 == 1) {
            event = Lifecycle.Event.ON_CREATE;
        } else if (i10 != 2) {
            event = (i10 == 3 || i10 == 4) ? Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_DESTROY;
        } else {
            event = Lifecycle.Event.ON_START;
        }
        this.f104069c.onNext(event);
    }

    Lifecycle.Event i8() {
        return this.f104069c.p8();
    }
}
