package bolts;

/* JADX INFO: compiled from: UnobservedErrorNotifier.java */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h<?> f35545a;

    public j(h<?> hVar) {
        this.f35545a = hVar;
    }

    public void a() {
        this.f35545a = null;
    }

    protected void finalize() throws Throwable {
        h.q qVarG;
        try {
            h<?> hVar = this.f35545a;
            if (hVar != null && (qVarG = h.G()) != null) {
                qVarG.a(hVar, new UnobservedTaskException(hVar.E()));
            }
        } finally {
            super.finalize();
        }
    }
}
