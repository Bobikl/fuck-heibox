package k;

/* JADX INFO: compiled from: CountDownManager.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f124362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f124363c;

    public c(Runnable runnable, boolean z10) {
        this.f124362b = runnable;
        this.f124363c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f124362b.run();
    }
}
