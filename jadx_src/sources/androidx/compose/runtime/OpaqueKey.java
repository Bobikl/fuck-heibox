package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.runtime.f1, reason: from toString */
/* JADX INFO: compiled from: OpaqueKey.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/f1;", "", "", ak.av, "key", "b", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class OpaqueKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final String key;

    public OpaqueKey(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        this.key = key;
    }

    public static /* synthetic */ OpaqueKey c(OpaqueKey opaqueKey, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = opaqueKey.key;
        }
        return opaqueKey.b(str);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @dl.d
    public final OpaqueKey b(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return new OpaqueKey(key);
    }

    @dl.d
    public final String d() {
        return this.key;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpaqueKey) && kotlin.jvm.internal.f0.g(this.key, ((OpaqueKey) other).key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    @dl.d
    public String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }
}
