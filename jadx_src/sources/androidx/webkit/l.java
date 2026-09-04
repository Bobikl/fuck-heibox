package androidx.webkit;

import android.os.Handler;
import android.webkit.WebMessagePort;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: WebMessagePortCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l {

    /* JADX INFO: compiled from: WebMessagePortCompat.java */
    public static abstract class a {
        public void a(@n0 l lVar, @p0 k kVar) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public l() {
    }

    public abstract void a();

    @n0
    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract WebMessagePort b();

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract InvocationHandler c();

    public abstract void d(@n0 k kVar);

    public abstract void e(@p0 Handler handler, @n0 a aVar);

    public abstract void f(@n0 a aVar);
}
