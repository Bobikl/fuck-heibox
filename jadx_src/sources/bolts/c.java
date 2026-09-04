package bolts;

import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: CancellationToken.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f35466a;

    c(e eVar) {
        this.f35466a = eVar;
    }

    public boolean a() {
        return this.f35466a.g();
    }

    public d b(Runnable runnable) {
        return this.f35466a.k(runnable);
    }

    public void c() throws CancellationException {
        this.f35466a.m();
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f35466a.g()));
    }
}
