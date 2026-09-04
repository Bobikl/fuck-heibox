package j;

import java.util.Timer;

/* JADX INFO: compiled from: DebounceTask.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Timer f124187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f124188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f124189c;

    public b(Runnable runnable, Long l10) {
        this.f124189c = runnable;
        this.f124188b = l10;
    }

    public static b a(Runnable runnable, Long l10) {
        return new b(runnable, l10);
    }
}
