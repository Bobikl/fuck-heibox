package cn.fly.verify;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f36090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f36091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<HashMap<String, Object>> f36092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ExecutorService f36093d = Executors.newSingleThreadExecutor();

    public static ExecutorService a() {
        return f36093d;
    }

    public static void a(final c cVar) {
        f36093d.execute(new Runnable() { // from class: cn.fly.verify.d.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap<String, Object> map = new HashMap<>();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(d.b(cVar, d.g()));
                    map.put("list", arrayList);
                    try {
                        j.a(false).a(map, i.a(4) + "api/log");
                        f.a().a("forceUploadLog: " + cVar.c() + Constants.ACCEPT_TIME_SEPARATOR_SP + cVar.d());
                    } catch (Throwable th2) {
                        f.a().a(th2);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, Object> b(c cVar, boolean z10) {
        cVar.a(z10);
        return h.a().a(cVar);
    }

    public static void b() {
        f36093d.execute(new Runnable() { // from class: cn.fly.verify.d.1
            @Override // java.lang.Runnable
            public void run() {
                List listSubList;
                try {
                    int iM = ai.a().m();
                    if (iM != 1) {
                        f.a().a("cancel upload, logSwitch: " + iM);
                        return;
                    }
                    d.h();
                    if (d.f36092c.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = d.f36092c.size();
                    f.a().a("upload check total size: " + size);
                    if (size > 100) {
                        int i10 = size - 1;
                        listSubList = d.f36092c.subList(i10 - 100, i10);
                    } else {
                        listSubList = d.f36092c;
                    }
                    arrayList.addAll(listSubList);
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("list", arrayList);
                    try {
                        j.a(false).a(map, i.a(4) + "api/log");
                        if (size > 100) {
                            d.f36092c.removeAll(arrayList);
                            d.c(d.f36092c);
                            f.a().a("upload size: " + arrayList.size() + ", remain size: " + d.f36092c.size());
                        } else {
                            ArrayList unused = d.f36092c = null;
                            aq.b((String) null);
                        }
                    } catch (Throwable th2) {
                        f.a().a(th2);
                    }
                } catch (Throwable th3) {
                    f.a().a(th3);
                }
            }
        });
    }

    public static void b(final c cVar) {
        f36093d.execute(new Runnable() { // from class: cn.fly.verify.d.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (aq.f()) {
                        f.a().a("del log");
                        d.a(new e(g.LOG).b("delLog"));
                    }
                    if (ai.a().m() != -1) {
                        d.h();
                        d.f36092c.add(d.b(cVar, d.g()));
                        d.c(d.f36092c);
                    }
                } catch (Throwable th2) {
                    f.a().a(th2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(ArrayList<HashMap<String, Object>> arrayList) {
        try {
            String strA = new gd().a(arrayList);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            String[] strArrA = an.a(i(), strA);
            aq.b(strArrA[0] + "&&" + strArrA[1]);
        } catch (Throwable th2) {
            f.a().a(th2);
            aq.b((String) null);
        }
    }

    private static ArrayList<HashMap<String, Object>> f() {
        try {
            String strE = aq.e();
            if (TextUtils.isEmpty(strE)) {
                return null;
            }
            String[] strArrSplit = strE.split("&&");
            if (strArrSplit.length != 2) {
                aq.b((String) null);
                return null;
            }
            String str = strArrSplit[0];
            return (ArrayList) new gd().a(an.b(as.c(str), strArrSplit[1]).trim(), ArrayList.class);
        } catch (Throwable th2) {
            f.a().a(th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g() {
        Boolean bool;
        if (f36090a == null) {
            File file = new File(ax.g().getFilesDir(), ".preverfy_xhs");
            if (file.exists()) {
                bool = Boolean.FALSE;
            } else {
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
                bool = Boolean.TRUE;
            }
            f36090a = bool;
        }
        return f36090a.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f36092c == null) {
            ArrayList<HashMap<String, Object>> arrayListF = f();
            f36092c = arrayListF;
            if (arrayListF == null) {
                f36092c = new ArrayList<>();
            }
        }
    }

    private static byte[] i() {
        if (f36091b == null) {
            try {
                f36091b = an.a();
            } catch (Throwable th2) {
                f.a().a(th2);
            }
        }
        return f36091b;
    }
}
