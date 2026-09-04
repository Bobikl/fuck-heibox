package androidx.compose.runtime.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Decoy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0004"}, d2 = {"", "fName", "", ak.av, "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class h {
    @dl.d
    @androidx.compose.runtime.m
    public static final Void a(@dl.d String fName) {
        f0.p(fName, "fName");
        throw new IllegalStateException("Function " + fName + " should have been replaced by compiler.");
    }
}
