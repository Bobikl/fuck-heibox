package vh;

import dl.e;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.o;
import kotlin.r0;
import kotlin.u0;
import sh.f;
import xh.h;
import yh.l;

/* JADX INFO: compiled from: AutoCloseable.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "AutoCloseableKt")
public final class a {
    @u0(version = "1.2")
    @r0
    public static final void a(@e AutoCloseable autoCloseable, @e Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th3) {
                o.a(th2, th3);
            }
        }
    }

    @u0(version = "1.2")
    @f
    private static final <T extends AutoCloseable, R> R b(T t10, l<? super T, ? extends R> block) throws Exception {
        f0.p(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            c0.d(1);
            a(t10, null);
            c0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                a(t10, th2);
                c0.c(1);
                throw th3;
            }
        }
    }
}
