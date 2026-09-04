package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends ByteArrayOutputStream {
    public f(int i10) {
        super(i10);
    }

    @dl.d
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        f0.o(buf, "buf");
        return buf;
    }
}
