package h5;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import z5.h;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: h5.a$a, reason: collision with other inner class name */
    public static final class C1081a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f119094a = "RecordPref";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f119095b = "alipay_cashier_statistic_record";

        /* JADX INFO: renamed from: h5.a$a$a, reason: collision with other inner class name */
        public static final class C1082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap<String, String> f119096a = new LinkedHashMap<>();

            public C1082a() {
            }

            public C1082a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                        this.f119096a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th2) {
                    z5.e.d(th2);
                }
            }

            public String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f119096a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th2) {
                    z5.e.d(th2);
                    return new JSONArray().toString();
                }
            }
        }

        public static synchronized int a(Context context, String str) {
            z5.e.g(f119094a, "stat remove " + str);
            if (context != null && !TextUtils.isEmpty(str)) {
                C1082a c1082aB = b(context);
                if (c1082aB.f119096a.isEmpty()) {
                    return 0;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, String> entry : c1082aB.f119096a.entrySet()) {
                        if (str.equals(entry.getValue())) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c1082aB.f119096a.remove((String) it.next());
                    }
                    d(context, c1082aB);
                    return arrayList.size();
                } catch (Throwable th2) {
                    z5.e.d(th2);
                    int size = c1082aB.f119096a.size();
                    d(context, new C1082a());
                    return size;
                }
            }
            return 0;
        }

        public static synchronized C1082a b(Context context) {
            try {
                String strB = h.b(null, context, f119095b, null);
                if (TextUtils.isEmpty(strB)) {
                    return new C1082a();
                }
                return new C1082a(strB);
            } catch (Throwable th2) {
                z5.e.d(th2);
                return new C1082a();
            }
        }

        public static synchronized String c(Context context, String str, String str2) {
            z5.e.g(f119094a, "stat append " + str2 + " , " + str);
            if (context != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = UUID.randomUUID().toString();
                }
                C1082a c1082aB = b(context);
                if (c1082aB.f119096a.size() > 20) {
                    c1082aB.f119096a.clear();
                }
                c1082aB.f119096a.put(str2, str);
                d(context, c1082aB);
                return str2;
            }
            return null;
        }

        public static synchronized void d(Context context, C1082a c1082a) {
            if (c1082a == null) {
                try {
                    c1082a = new C1082a();
                } catch (Throwable th2) {
                    z5.e.d(th2);
                }
            }
            h.e(null, context, f119095b, c1082a.a());
        }

        public static synchronized String e(Context context) {
            z5.e.g(f119094a, "stat peek");
            if (context == null) {
                return null;
            }
            C1082a c1082aB = b(context);
            if (c1082aB.f119096a.isEmpty()) {
                return null;
            }
            try {
                return c1082aB.f119096a.entrySet().iterator().next().getValue();
            } catch (Throwable th2) {
                z5.e.d(th2);
                return null;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: h5.a$b$a, reason: collision with other inner class name */
        public static final class RunnableC1083a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f119097b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f119098c;

            public RunnableC1083a(String str, Context context) {
                this.f119097b = str;
                this.f119098c = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(this.f119097b) || b.e(this.f119098c, this.f119097b)) {
                    for (int i10 = 0; i10 < 4; i10++) {
                        String strE = C1081a.e(this.f119098c);
                        if (TextUtils.isEmpty(strE) || !b.e(this.f119098c, strE)) {
                            return;
                        }
                    }
                }
            }
        }

        public static synchronized void a(Context context) {
            c(context, null, null);
        }

        public static synchronized void b(Context context, h5.b bVar, String str, String str2) {
            if (context == null || bVar == null || str == null) {
                return;
            }
            c(context, bVar.e(str), str2);
        }

        public static synchronized void c(Context context, String str, String str2) {
            if (context == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                C1081a.c(context, str, str2);
            }
            new Thread(new RunnableC1083a(str, context)).start();
        }

        public static synchronized boolean e(Context context, String str) {
            z5.e.g(j5.a.f124275z, "stat sub " + str);
            try {
                if ((l5.a.d().s() ? new t5.d() : new t5.e()).i(null, context, str) == null) {
                    return false;
                }
                C1081a.a(context, str);
                return true;
            } catch (Throwable th2) {
                z5.e.d(th2);
                return false;
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f119099a = "alipay_cashier_ap_seq_v";

        public static synchronized long a(Context context) {
            return d.a(context, f119099a);
        }
    }

    public static final class d {
        public static synchronized long a(Context context, String str) {
            long j10;
            String strB;
            try {
                strB = h.b(null, context, str, null);
            } catch (Throwable unused) {
            }
            j10 = (!TextUtils.isEmpty(strB) ? Long.parseLong(strB) : 0L) + 1;
            try {
                h.e(null, context, str, Long.toString(j10));
            } catch (Throwable unused2) {
            }
            return j10;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f119100a = "alipay_cashier_statistic_v";

        public static synchronized long a(Context context) {
            return d.a(context, f119100a);
        }
    }

    public static synchronized void a(Context context) {
        b.a(context);
    }

    public static synchronized void b(Context context, x5.a aVar, String str, String str2) {
        if (context == null || aVar == null) {
            return;
        }
        try {
            C1081a.c(context, aVar.f141093l.e(str), str2);
        } catch (Throwable th2) {
            z5.e.d(th2);
        }
    }

    public static void c(x5.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        aVar.f141093l.g(str, str2);
    }

    public static void d(x5.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f141093l.h(str, str2, str3);
    }

    public static void e(x5.a aVar, String str, String str2, Throwable th2) {
        if (aVar == null) {
            return;
        }
        aVar.f141093l.i(str, str2, th2);
    }

    public static void f(x5.a aVar, String str, String str2, Throwable th2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f141093l.j(str, str2, th2, str3);
    }

    public static void g(x5.a aVar, String str, Throwable th2) {
        if (aVar == null || th2 == null) {
            return;
        }
        aVar.f141093l.i(str, th2.getClass().getSimpleName(), th2);
    }

    public static synchronized void h(Context context, x5.a aVar, String str, String str2) {
        if (context == null || aVar == null) {
            return;
        }
        b.b(context, aVar.f141093l, str, str2);
    }

    public static void i(x5.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f141093l.n(str, str2, str3);
    }
}
