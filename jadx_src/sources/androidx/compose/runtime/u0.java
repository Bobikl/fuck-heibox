package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/u0;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/m2;", "b", "Lkotlin/z;", ak.aF, "()Ljava/lang/Object;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "getValue", "value", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lyh/a;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class u0<T> implements m2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z current;

    public u0(@dl.d yh.a<? extends T> valueProducer) {
        kotlin.jvm.internal.f0.p(valueProducer, "valueProducer");
        this.current = kotlin.b0.c(valueProducer);
    }

    private final T c() {
        return (T) this.current.getValue();
    }

    @Override // androidx.compose.runtime.m2
    public T getValue() {
        return c();
    }
}
