package k6;

/* JADX INFO: compiled from: IspResult.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f124452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f124453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124454c;

    public a(boolean z10, long j10, int i10) {
        this.f124452a = z10;
        this.f124453b = j10;
        this.f124454c = i10;
    }

    public long a() {
        return this.f124453b;
    }

    public int b() {
        return this.f124454c;
    }

    public boolean c() {
        return this.f124452a;
    }

    public String toString() {
        return "IspResult{needSet=" + this.f124452a + ", exposureTime=" + this.f124453b + ", iso=" + this.f124454c + '}';
    }
}
