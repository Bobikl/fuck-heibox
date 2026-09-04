package e5;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f118552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f118553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f118554c = System.currentTimeMillis() + 86400000;

    public d(String str, int i10) {
        this.f118552a = str;
        this.f118553b = i10;
    }

    public String toString() {
        return "ValueData{value='" + this.f118552a + "', code=" + this.f118553b + ", expired=" + this.f118554c + '}';
    }
}
