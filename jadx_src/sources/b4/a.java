package b4;

/* JADX INFO: loaded from: classes6.dex */
public class a extends f6.a {
    public a(String str, String str2, long j10) {
        super(str, str2, j10);
    }

    public static a e(f6.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new a(aVar.a(), aVar.b(), aVar.c());
    }
}
