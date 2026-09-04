package hj;

/* JADX INFO: compiled from: LogData.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f119196e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static d f119197f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f119198g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f119199h = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f119201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f119202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f119203d;

    public static d a() {
        synchronized (f119196e) {
            d dVar = f119197f;
            if (dVar == null) {
                return new d();
            }
            f119197f = dVar.f119203d;
            dVar.f119203d = null;
            f119198g--;
            return dVar;
        }
    }

    public static d b(int i10, String str, String str2) {
        d dVarA = a();
        dVarA.f119200a = i10;
        dVarA.f119201b = str;
        dVarA.f119202c = str2;
        return dVarA;
    }

    public void c() {
        this.f119200a = 0;
        this.f119201b = null;
        this.f119202c = null;
        synchronized (f119196e) {
            int i10 = f119198g;
            if (i10 < 50) {
                this.f119203d = f119197f;
                f119197f = this;
                f119198g = i10 + 1;
            }
        }
    }
}
