package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: BitwiseOperators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\f\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\f¨\u0006\u0004"}, d2 = {"", "other", "b", ak.av, "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    public static final int a(int i10, int i11) {
        return Integer.rotateLeft(i10, i11);
    }

    public static final int b(int i10, int i11) {
        return Integer.rotateRight(i10, i11);
    }
}
