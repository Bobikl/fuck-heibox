package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.r0;
import kotlin.u0;

/* JADX INFO: compiled from: SafeContinuationJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@r0
public final class h<T> implements c<T>, kotlin.coroutines.jvm.internal.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final a f124702c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final AtomicReferenceFieldUpdater<h<?>, Object> f124703d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final c<T> f124704b;

    @dl.e
    private volatile Object result;

    /* JADX INFO: compiled from: SafeContinuationJvm.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        private static /* synthetic */ void a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @r0
    public h(@dl.d c<? super T> delegate) {
        this(delegate, CoroutineSingletons.UNDECIDED);
        f0.p(delegate, "delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@dl.d c<? super T> delegate, @dl.e Object obj) {
        f0.p(delegate, "delegate");
        this.f124704b = delegate;
        this.result = obj;
    }

    @r0
    @dl.e
    public final Object a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (androidx.concurrent.futures.a.a(f124703d, this, coroutineSingletons, kotlin.coroutines.intrinsics.b.h())) {
                return kotlin.coroutines.intrinsics.b.h();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return kotlin.coroutines.intrinsics.b.h();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f124478b;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        c<T> cVar = this.f124704b;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        return this.f124704b.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (androidx.concurrent.futures.a.a(f124703d, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != kotlin.coroutines.intrinsics.b.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.a.a(f124703d, this, kotlin.coroutines.intrinsics.b.h(), CoroutineSingletons.RESUMED)) {
                    this.f124704b.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @dl.d
    public String toString() {
        return "SafeContinuation for " + this.f124704b;
    }
}
