package androidx.tracing;

import android.os.Trace;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: TraceApi18Impl.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(18)
public final class c {
    private c() {
    }

    public static void a(@n0 String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
