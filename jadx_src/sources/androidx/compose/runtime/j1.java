package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/j1;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/v;", "value", "Landroidx/compose/runtime/k1;", "f", "(Ljava/lang/Object;)Landroidx/compose/runtime/k1;", "g", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lyh/a;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class j1<T> extends v<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(@dl.d yh.a<? extends T> defaultFactory) {
        super(defaultFactory, null);
        kotlin.jvm.internal.f0.p(defaultFactory, "defaultFactory");
    }

    @dl.d
    public final k1<T> f(T value) {
        return new k1<>(this, value, true);
    }

    @dl.d
    public final k1<T> g(T value) {
        return new k1<>(this, value, false);
    }
}
