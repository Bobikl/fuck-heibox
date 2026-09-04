package bolts;

/* JADX INFO: compiled from: TaskCompletionSource.java */
/* JADX INFO: loaded from: classes6.dex */
public class i<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<TResult> f35544a = new h<>();

    public h<TResult> a() {
        return this.f35544a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f35544a.V();
    }

    public boolean f(Exception exc) {
        return this.f35544a.W(exc);
    }

    public boolean g(TResult tresult) {
        return this.f35544a.X(tresult);
    }
}
