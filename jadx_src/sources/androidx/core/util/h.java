package androidx.core.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.Writer;

/* JADX INFO: compiled from: LogWriter.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class h extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f21258c = new StringBuilder(128);

    public h(String str) {
        this.f21257b = str;
    }

    private void a() {
        if (this.f21258c.length() > 0) {
            Log.d(this.f21257b, this.f21258c.toString());
            StringBuilder sb2 = this.f21258c;
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
                this.f21258c.append(c10);
            }
        }
    }
}
