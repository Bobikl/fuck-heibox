package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.y;
import com.uber.autodispose.OutsideScopeException;
import com.uber.autodispose.lifecycle.LifecycleEndedException;
import io.reactivex.g;
import io.reactivex.z;

/* JADX INFO: compiled from: AndroidLifecycleScopeProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements com.uber.autodispose.lifecycle.c<Lifecycle.Event> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.uber.autodispose.lifecycle.a<Lifecycle.Event> f104075d = new com.uber.autodispose.lifecycle.a() { // from class: com.uber.autodispose.android.lifecycle.a
        @Override // com.uber.autodispose.lifecycle.a, kh.o
        public final Object apply(Object obj) {
            return b.l((Lifecycle.Event) obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.uber.autodispose.lifecycle.a<Lifecycle.Event> f104076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LifecycleEventsObservable f104077c;

    /* JADX INFO: compiled from: AndroidLifecycleScopeProvider.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104078a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f104078a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104078a[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104078a[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104078a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f104078a[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f104078a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.uber.autodispose.android.lifecycle.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidLifecycleScopeProvider.java */
    public static class C1031b implements com.uber.autodispose.lifecycle.a<Lifecycle.Event> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lifecycle.Event f104079b;

        C1031b(Lifecycle.Event event) {
            this.f104079b = event;
        }

        @Override // com.uber.autodispose.lifecycle.a, kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Lifecycle.Event apply(Lifecycle.Event event) throws OutsideScopeException {
            return this.f104079b;
        }
    }

    private b(Lifecycle lifecycle, com.uber.autodispose.lifecycle.a<Lifecycle.Event> aVar) {
        this.f104077c = new LifecycleEventsObservable(lifecycle);
        this.f104076b = aVar;
    }

    public static b f(Lifecycle lifecycle) {
        return h(lifecycle, f104075d);
    }

    public static b g(Lifecycle lifecycle, Lifecycle.Event event) {
        return h(lifecycle, new C1031b(event));
    }

    public static b h(Lifecycle lifecycle, com.uber.autodispose.lifecycle.a<Lifecycle.Event> aVar) {
        return new b(lifecycle, aVar);
    }

    public static b i(y yVar) {
        return f(yVar.getLifecycle());
    }

    public static b j(y yVar, Lifecycle.Event event) {
        return g(yVar.getLifecycle(), event);
    }

    public static b k(y yVar, com.uber.autodispose.lifecycle.a<Lifecycle.Event> aVar) {
        return h(yVar.getLifecycle(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lifecycle.Event l(Lifecycle.Event event) throws OutsideScopeException {
        int i10 = a.f104078a[event.ordinal()];
        if (i10 == 1) {
            return Lifecycle.Event.ON_DESTROY;
        }
        if (i10 == 2) {
            return Lifecycle.Event.ON_STOP;
        }
        if (i10 == 3) {
            return Lifecycle.Event.ON_PAUSE;
        }
        if (i10 == 4) {
            return Lifecycle.Event.ON_STOP;
        }
        throw new LifecycleEndedException("Lifecycle has ended! Last event was " + event);
    }

    @Override // com.uber.autodispose.lifecycle.c, com.uber.autodispose.y
    public g a() {
        return com.uber.autodispose.lifecycle.g.e(this);
    }

    @Override // com.uber.autodispose.lifecycle.c
    public z<Lifecycle.Event> b() {
        return this.f104077c;
    }

    @Override // com.uber.autodispose.lifecycle.c
    public com.uber.autodispose.lifecycle.a<Lifecycle.Event> d() {
        return this.f104076b;
    }

    @Override // com.uber.autodispose.lifecycle.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Lifecycle.Event c() {
        this.f104077c.h8();
        return this.f104077c.i8();
    }
}
