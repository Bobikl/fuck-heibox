package kotlin;

/* JADX INFO: compiled from: Preconditions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class p0 extends o0 {
    @sh.f
    private static final void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @sh.f
    private static final void d(boolean z10, yh.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.f0.p(lazyMessage, "lazyMessage");
        if (!z10) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    @sh.f
    private static final <T> T e(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @sh.f
    private static final <T> T f(T t10, yh.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.f0.p(lazyMessage, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    @sh.f
    private static final Void g(Object message) {
        kotlin.jvm.internal.f0.p(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @sh.f
    private static final void h(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @sh.f
    private static final void i(boolean z10, yh.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.f0.p(lazyMessage, "lazyMessage");
        if (!z10) {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    @sh.f
    private static final <T> T j(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @sh.f
    private static final <T> T k(T t10, yh.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.f0.p(lazyMessage, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }
}
