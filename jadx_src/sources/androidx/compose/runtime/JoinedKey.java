package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.runtime.r0, reason: from toString */
/* JADX INFO: compiled from: JoinedKey.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/r0;", "", "value", "", "g", "hashCode", ak.av, "b", com.google.android.exoplayer2.text.ttml.d.f49793l0, com.google.android.exoplayer2.text.ttml.d.f49796n0, ak.aF, "", "toString", "other", "", "equals", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "f", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class JoinedKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final Object left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final Object right;

    public JoinedKey(@dl.e Object obj, @dl.e Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static /* synthetic */ JoinedKey d(JoinedKey joinedKey, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = joinedKey.left;
        }
        if ((i10 & 2) != 0) {
            obj2 = joinedKey.right;
        }
        return joinedKey.c(obj, obj2);
    }

    private final int g(Object value) {
        if (value instanceof Enum) {
            return ((Enum) value).ordinal();
        }
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getLeft() {
        return this.left;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getRight() {
        return this.right;
    }

    @dl.d
    public final JoinedKey c(@dl.e Object left, @dl.e Object right) {
        return new JoinedKey(left, right);
    }

    @dl.e
    public final Object e() {
        return this.left;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) other;
        return kotlin.jvm.internal.f0.g(this.left, joinedKey.left) && kotlin.jvm.internal.f0.g(this.right, joinedKey.right);
    }

    @dl.e
    public final Object f() {
        return this.right;
    }

    public int hashCode() {
        return (g(this.left) * 31) + g(this.right);
    }

    @dl.d
    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }
}
