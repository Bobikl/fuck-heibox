package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotMutationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0003\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/b1;", "Landroidx/compose/runtime/d2;", "", ak.av, "b", "", "", "toString", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b1 implements d2<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b1 f12626a = new b1();

    private b1() {
    }

    @Override // androidx.compose.runtime.d2
    public boolean a(@dl.e Object a10, @dl.e Object b10) {
        return false;
    }

    @Override // androidx.compose.runtime.d2
    public /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return c2.a(this, obj, obj2, obj3);
    }

    @dl.d
    public String toString() {
        return "NeverEqualPolicy";
    }
}
