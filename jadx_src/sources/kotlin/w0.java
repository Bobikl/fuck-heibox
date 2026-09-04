package kotlin;

/* JADX INFO: compiled from: Standard.kt */
/* JADX INFO: loaded from: classes5.dex */
public class w0 {
    @sh.f
    private static final Void a() {
        throw new NotImplementedError(null, 1, null);
    }

    @sh.f
    private static final Void b(String reason) {
        kotlin.jvm.internal.f0.p(reason, "reason");
        throw new NotImplementedError("An operation is not implemented: " + reason);
    }

    @u0(version = "1.1")
    @sh.f
    private static final <T> T c(T t10, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        block.invoke(t10);
        return t10;
    }

    @sh.f
    private static final <T> T d(T t10, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        block.invoke(t10);
        return t10;
    }

    @sh.f
    private static final <T, R> R e(T t10, yh.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return block.invoke(t10);
    }

    @sh.f
    private static final void f(int i10, yh.l<? super Integer, b2> action) {
        kotlin.jvm.internal.f0.p(action, "action");
        for (int i11 = 0; i11 < i10; i11++) {
            action.invoke(Integer.valueOf(i11));
        }
    }

    @sh.f
    private static final <T, R> R g(T t10, yh.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return block.invoke(t10);
    }

    @sh.f
    private static final <R> R h(yh.a<? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return block.invoke();
    }

    @u0(version = "1.1")
    @sh.f
    private static final <T> T i(T t10, yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if (predicate.invoke(t10).booleanValue()) {
            return t10;
        }
        return null;
    }

    @u0(version = "1.1")
    @sh.f
    private static final <T> T j(T t10, yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        if (predicate.invoke(t10).booleanValue()) {
            return null;
        }
        return t10;
    }

    @sh.f
    private static final <T, R> R k(T t10, yh.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return block.invoke(t10);
    }
}
