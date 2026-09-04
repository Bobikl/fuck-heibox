package o6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.lite.e;
import com.apm.lite.k.q;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f132211c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apm.lite.c.b.b f132212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SQLiteDatabase f132213b;

    private a() {
    }

    public static a a() {
        if (f132211c == null) {
            synchronized (a.class) {
                if (f132211c == null) {
                    f132211c = new a();
                }
            }
        }
        return f132211c;
    }

    private void e() {
        if (this.f132212a == null) {
            b(e.m());
        }
    }

    public synchronized void b(Context context) {
        try {
            this.f132213b = new b(context).getWritableDatabase();
        } catch (Throwable th2) {
            q.g(th2);
        }
        this.f132212a = new com.apm.lite.c.b.b();
    }

    public synchronized void c(p6.a aVar) {
        e();
        com.apm.lite.c.b.b bVar = this.f132212a;
        if (bVar != null) {
            bVar.d(this.f132213b, aVar);
        }
    }

    public synchronized boolean d(String str) {
        e();
        com.apm.lite.c.b.b bVar = this.f132212a;
        if (bVar == null) {
            return false;
        }
        return bVar.g(this.f132213b, str);
    }
}
