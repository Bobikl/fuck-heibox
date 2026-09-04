package androidx.tracing;

import android.os.Trace;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: TraceApi29Impl.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(29)
public final class d {
    private d() {
    }

    public static void a(@n0 String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(@n0 String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static void c(@n0 String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
