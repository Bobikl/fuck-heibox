package com.tencent.qmsp.sdk.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class n implements e, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile n f101848a;

    public class a implements f.InterfaceC0992f {
        a() {
        }

        @Override // com.tencent.qmsp.sdk.c.f.InterfaceC0992f
        public int a(long j10, long j11, long j12, Object obj, Object obj2, Object[] objArr, Object[] objArr2) {
            if (obj != null && (obj instanceof String)) {
                String str = (String) obj;
                com.tencent.qmsp.sdk.f.g.a("QSec.Rpt", 1, String.format("Op: %d, Rid: %d, val: %s", Long.valueOf(j10), Long.valueOf(j11), str));
                n.this.a(j10, j11, str);
            }
            return 0;
        }
    }

    private n() {
        f.a(3L, new a());
    }

    public static n b() {
        if (f101848a == null) {
            synchronized (n.class) {
                if (f101848a == null) {
                    f101848a = new n();
                }
            }
        }
        return f101848a;
    }

    @Override // com.tencent.qmsp.sdk.c.e
    public String a() {
        return "Rpt";
    }

    public void a(long j10, long j11, String str) {
        new JSONObject();
        if (j10 == 1 || j10 == 2) {
            com.tencent.qmsp.sdk.a.f.a(str, (int) j11);
        }
    }
}
