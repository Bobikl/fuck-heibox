package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotMutationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0003\u0010\u0006J)\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/d2;", androidx.exifinterface.media.a.f23244d5, "", ak.av, "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "previous", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "applied", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface d2<T> {

    /* JADX INFO: compiled from: SnapshotMutationPolicy.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @dl.e
        @Deprecated
        public static <T> T a(@dl.d d2<T> d2Var, T t10, T t11, T t12) {
            return (T) c2.a(d2Var, t10, t11, t12);
        }
    }

    boolean a(T a10, T b10);

    @dl.e
    T b(T previous, T current, T applied);
}
