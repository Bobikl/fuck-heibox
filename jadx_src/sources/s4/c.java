package s4;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f139274b;

    public c(b bVar) {
        this.f139274b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f139274b.d();
        } catch (Exception e10) {
            d.c(e10);
        }
    }
}
