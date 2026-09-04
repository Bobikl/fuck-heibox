package oi;

/* JADX INFO: compiled from: TargetPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f132319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d f132320b;

    @dl.d
    public String a() {
        return b().getDescription();
    }

    @dl.d
    public d b() {
        return this.f132320b;
    }

    @dl.d
    public String toString() {
        String strA = a();
        if (!(strA.length() > 0)) {
            return this.f132319a;
        }
        return this.f132319a + " (" + strA + ')';
    }
}
