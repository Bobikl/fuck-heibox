package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.runtime.o2, reason: from toString */
/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/o2;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/m2;", "n", "()Ljava/lang/Object;", "value", ak.aF, "(Ljava/lang/Object;)Landroidx/compose/runtime/o2;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StaticValueHolder<T> implements m2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    public StaticValueHolder(T t10) {
        this.value = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticValueHolder e(StaticValueHolder staticValueHolder, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = staticValueHolder.getValue();
        }
        return staticValueHolder.c(obj);
    }

    @dl.d
    public final StaticValueHolder<T> c(T value) {
        return new StaticValueHolder<>(value);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StaticValueHolder) && kotlin.jvm.internal.f0.g(getValue(), ((StaticValueHolder) other).getValue());
    }

    @Override // androidx.compose.runtime.m2
    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    public final T n() {
        return getValue();
    }

    @dl.d
    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
