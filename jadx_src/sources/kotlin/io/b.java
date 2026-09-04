package kotlin.io;

import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.o;
import kotlin.r0;
import kotlin.u0;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "CloseableKt")
public final class b {
    @u0(version = "1.1")
    @r0
    public static final void a(@dl.e Closeable closeable, @dl.e Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                o.a(th2, th3);
            }
        }
    }

    @sh.f
    private static final <T extends Closeable, R> R b(T t10, yh.l<? super T, ? extends R> block) throws IOException {
        f0.p(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            c0.d(1);
            if (sh.m.a(1, 1, 0)) {
                a(t10, null);
            } else if (t10 != null) {
                t10.close();
            }
            c0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                if (sh.m.a(1, 1, 0)) {
                    a(t10, th2);
                } else if (t10 != null) {
                    try {
                        t10.close();
                    } catch (Throwable unused) {
                    }
                }
                c0.c(1);
                throw th3;
            }
        }
    }
}
