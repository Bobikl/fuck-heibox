package androidx.core.os;

import kotlin.s0;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    @kotlin.k(message = "Use androidx.tracing.Trace instead", replaceWith = @s0(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@dl.d String sectionName, @dl.d yh.a<? extends T> block) {
        kotlin.jvm.internal.f0.p(sectionName, "sectionName");
        kotlin.jvm.internal.f0.p(block, "block");
        e0.b(sectionName);
        try {
            return block.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            e0.d();
            kotlin.jvm.internal.c0.c(1);
        }
    }
}
