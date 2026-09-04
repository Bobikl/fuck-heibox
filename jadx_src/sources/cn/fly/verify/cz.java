package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public class cz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gl f36089a;

    public cz(String str, int i10) {
        gl glVar = new gl(ax.g());
        this.f36089a = glVar;
        glVar.a(str, i10);
    }

    public Object a(String str) {
        return this.f36089a.i(str);
    }

    public void a(String str, int i10) {
        this.f36089a.a(str, Integer.valueOf(i10));
    }

    public void a(String str, long j10) {
        this.f36089a.a(str, Long.valueOf(j10));
    }

    public void a(String str, Object obj) {
        this.f36089a.a(str, obj);
    }

    public void a(String str, String str2) {
        if (str2 == null) {
            this.f36089a.k(str);
        } else {
            this.f36089a.a(str, str2);
        }
    }

    public void a(String str, boolean z10) {
        this.f36089a.a(str, Boolean.valueOf(z10));
    }

    public int b(String str, int i10) {
        return this.f36089a.b(str, i10);
    }

    public long b(String str, long j10) {
        return this.f36089a.a(str, j10);
    }

    public String b(String str, String str2) {
        return this.f36089a.b(str, str2);
    }

    public boolean b(String str, boolean z10) {
        return this.f36089a.a(str, z10);
    }
}
