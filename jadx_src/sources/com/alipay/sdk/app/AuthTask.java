package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.j.c;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import x5.b;
import z5.e;
import z5.f;
import z5.j;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class AuthTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f39429c = f.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f39430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c6.a f39431b;

    public class a implements f.g {
        public a() {
        }

        @Override // z5.f.g
        public void a() {
            AuthTask.this.c();
        }

        @Override // z5.f.g
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.f39430a = activity;
        b.e().b(this.f39430a);
        this.f39431b = new c6.a(activity, c6.a.f35597k);
    }

    private String a(Activity activity, String str, x5.a aVar) {
        String strB = aVar.b(str);
        List<l5.a.b> listZ = l5.a.d().z();
        if (!l5.a.d().f130865h || listZ == null) {
            listZ = f5.a.f118751d;
        }
        if (!l.y(aVar, this.f39430a, listZ, true)) {
            h5.a.c(aVar, h5.b.f119113l, h5.b.f119110j0);
            return d(activity, strB, aVar);
        }
        f fVar = new f(activity, aVar, e());
        String strF = fVar.f(strB, false);
        fVar.i();
        if (!TextUtils.equals(strF, f.f141859j) && !TextUtils.equals(strF, f.f141860k)) {
            return TextUtils.isEmpty(strF) ? f5.b.a() : strF;
        }
        h5.a.c(aVar, h5.b.f119113l, h5.b.f119109i0);
        return d(activity, strB, aVar);
    }

    private String b(x5.a aVar, v5.a aVar2) {
        String[] strArrG = aVar2.g();
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrG[0]);
        Intent intent = new Intent(this.f39430a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        x5.a.C1277a.c(aVar, intent);
        this.f39430a.startActivity(intent);
        Object obj = f39429c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return f5.b.a();
            }
        }
        String strG = f5.b.g();
        return TextUtils.isEmpty(strG) ? f5.b.a() : strG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        c6.a aVar = this.f39431b;
        if (aVar != null) {
            aVar.c();
        }
    }

    private String d(Activity activity, String str, x5.a aVar) {
        f();
        c cVarB = null;
        try {
            try {
                List<v5.a> listB = v5.a.b(new t5.a().i(aVar, activity, str).c().optJSONObject(j5.c.f124295c).optJSONObject(j5.c.f124296d));
                c();
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    if (listB.get(i10).a() == com.alipay.sdk.m.r.a.WapPay) {
                        String strB = b(aVar, listB.get(i10));
                        c();
                        return strB;
                    }
                }
                c();
            } catch (Throwable th2) {
                c();
                throw th2;
            }
        } catch (IOException e10) {
            c cVarB2 = c.b(c.NETWORK_ERROR.b());
            h5.a.g(aVar, h5.b.f119111k, e10);
            cVarB = cVarB2;
            c();
        } catch (Throwable th3) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.C, th3);
            c();
        }
        if (cVarB == null) {
            cVarB = c.b(c.FAILED.b());
        }
        return f5.b.b(cVarB.b(), cVarB.a(), "");
    }

    private f.g e() {
        return new a();
    }

    private void f() {
        c6.a aVar = this.f39431b;
        if (aVar != null) {
            aVar.j();
        }
    }

    public synchronized String auth(String str, boolean z10) {
        return innerAuth(new x5.a(this.f39430a, str, "auth"), str, z10);
    }

    public synchronized Map<String, String> authV2(String str, boolean z10) {
        x5.a aVar;
        aVar = new x5.a(this.f39430a, str, "authV2");
        return j.d(aVar, innerAuth(aVar, str, z10));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00c1 A[Catch: all -> 0x0137, PHI: r9
  0x00c1: PHI (r9v11 java.lang.String) = (r9v2 java.lang.String), (r9v13 java.lang.String) binds: [B:16:0x00bf, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0006, B:8:0x0020, B:18:0x00ca, B:17:0x00c1, B:21:0x00d6, B:23:0x0123, B:24:0x012c, B:25:0x0136, B:15:0x0074, B:7:0x001a, B:14:0x0071), top: B:31:0x0003, inners: #0, #2 }] */
    public synchronized String innerAuth(x5.a aVar, String str, boolean z10) {
        String strA;
        if (z10) {
            f();
            b.e().b(this.f39430a);
            strA = f5.b.a();
            f5.a.b("");
            try {
                try {
                    strA = a(this.f39430a, str, aVar);
                    h5.a.d(aVar, h5.b.f119113l, h5.b.V, "" + SystemClock.elapsedRealtime());
                    h5.a.d(aVar, h5.b.f119113l, h5.b.W, j.a(strA, j.f141892a) + "|" + j.a(strA, j.f141893b));
                    if (!l5.a.d().G()) {
                        l5.a.d().l(aVar, this.f39430a, false, 1);
                    }
                } catch (Exception e10) {
                    e.d(e10);
                    h5.a.d(aVar, h5.b.f119113l, h5.b.V, "" + SystemClock.elapsedRealtime());
                    h5.a.d(aVar, h5.b.f119113l, h5.b.W, j.a(strA, j.f141892a) + "|" + j.a(strA, j.f141893b));
                    if (!l5.a.d().G()) {
                        l5.a.d().l(aVar, this.f39430a, false, 1);
                    }
                }
                c();
                h5.a.h(this.f39430a, aVar, str, aVar.f141085d);
            } catch (Throwable th2) {
                h5.a.d(aVar, h5.b.f119113l, h5.b.V, "" + SystemClock.elapsedRealtime());
                h5.a.d(aVar, h5.b.f119113l, h5.b.W, j.a(strA, j.f141892a) + "|" + j.a(strA, j.f141893b));
                if (!l5.a.d().G()) {
                    l5.a.d().l(aVar, this.f39430a, false, 1);
                }
                c();
                h5.a.h(this.f39430a, aVar, str, aVar.f141085d);
                throw th2;
            }
        } else {
            b.e().b(this.f39430a);
            strA = f5.b.a();
            f5.a.b("");
            strA = a(this.f39430a, str, aVar);
            h5.a.d(aVar, h5.b.f119113l, h5.b.V, "" + SystemClock.elapsedRealtime());
            h5.a.d(aVar, h5.b.f119113l, h5.b.W, j.a(strA, j.f141892a) + "|" + j.a(strA, j.f141893b));
            if (!l5.a.d().G()) {
                l5.a.d().l(aVar, this.f39430a, false, 1);
            }
            c();
            h5.a.h(this.f39430a, aVar, str, aVar.f141085d);
        }
        throw th;
        return strA;
    }
}
