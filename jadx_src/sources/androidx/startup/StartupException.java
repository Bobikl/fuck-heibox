package androidx.startup;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class StartupException extends RuntimeException {
    public StartupException(@n0 String str) {
        super(str);
    }

    public StartupException(@n0 String str, @n0 Throwable th2) {
        super(str, th2);
    }

    public StartupException(@n0 Throwable th2) {
        super(th2);
    }
}
