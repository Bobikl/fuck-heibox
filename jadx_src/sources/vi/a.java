package vi;

import sh.f;
import xh.h;

/* JADX INFO: compiled from: Process.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "ProcessKt")
public final class a {
    @f
    private static final Void a(int i10) {
        System.exit(i10);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
