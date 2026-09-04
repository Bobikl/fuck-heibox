package n;

/* JADX INFO: compiled from: IpRankHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f131915a;

    public b(c cVar, a aVar) {
        this.f131915a = aVar;
    }

    @Override // n.a
    public void a(String str, String[] strArr) {
        if (this.f131915a != null) {
            c.f131916b.remove(str);
            this.f131915a.a(str, strArr);
        }
    }
}
