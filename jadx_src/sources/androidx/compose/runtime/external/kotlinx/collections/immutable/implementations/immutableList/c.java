package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\u0006R$\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;", "", ak.av, "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", "value", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object value;

    public c(@dl.e Object obj) {
        this.value = obj;
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final void b(@dl.e Object obj) {
        this.value = obj;
    }
}
