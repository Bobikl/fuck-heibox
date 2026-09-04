package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f35664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35666f;

    @Override // cn.fly.verify.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a b(String str) {
        try {
            super.b(str);
            this.f35661a = String.valueOf(this.f35812h.get("opToken"));
            this.f35662b = String.valueOf(this.f35812h.get(g0.a.f118921e));
            this.f35663c = ((Boolean) this.f35812h.get("use")).booleanValue();
            this.f35664d = System.currentTimeMillis() + 3600000;
        } catch (Throwable th2) {
            f.a().a(th2, "[FlyVerify] ==>%s", "Entity analyse exception.");
        }
        return this;
    }

    public String toString() {
        return "Cache{opToken='" + this.f35661a + "', phone='" + this.f35662b + "', use=" + this.f35663c + ", expireTime=" + this.f35664d + '}';
    }
}
