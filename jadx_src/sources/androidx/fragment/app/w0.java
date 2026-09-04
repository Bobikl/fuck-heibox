package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: LogWriter.java */
/* JADX INFO: loaded from: classes6.dex */
public final class w0 extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f23889c = new StringBuilder(128);

    w0(String str) {
        this.f23888b = str;
    }

    private void a() {
        if (this.f23889c.length() > 0) {
            Log.d(this.f23888b, this.f23889c.toString());
            StringBuilder sb2 = this.f23889c;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f23889c.append(c10);
            }
        }
    }
}
