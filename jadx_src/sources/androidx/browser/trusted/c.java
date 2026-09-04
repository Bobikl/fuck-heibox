package androidx.browser.trusted;

import androidx.annotation.n0;
import com.google.common.util.concurrent.p0;

/* JADX INFO: compiled from: FutureUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class c {
    private c() {
    }

    @n0
    static <T> p0<T> a(@n0 Throwable th2) {
        androidx.concurrent.futures.b bVarU = androidx.concurrent.futures.b.u();
        bVarU.q(th2);
        return bVarU;
    }
}
