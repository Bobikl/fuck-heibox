package e5;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f118544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f118545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f118546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f118547d;

    public a(String str) {
        this.f118546c = str;
    }

    public void a(int i10) {
        this.f118547d = i10;
    }

    public void b(long j10) {
        this.f118544a = j10;
    }

    public void c(String str) {
        this.f118545b = str;
    }

    public boolean d() {
        return this.f118544a > System.currentTimeMillis();
    }

    public void e() {
        this.f118544a = 0L;
    }
}
