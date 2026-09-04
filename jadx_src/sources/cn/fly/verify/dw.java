package cn.fly.verify;

import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.Constants;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class dw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36170a = ec.a("004^bjbadg2e");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dw f36171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ft f36172c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36175f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SimpleDateFormat f36173d = new SimpleDateFormat(ec.a("025ZcacacacafifafafibabagddidiDi[bdbd-i?dgdgbjcjcjcjgdeb"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, Object> f36174e = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36176g = ec.a("0082dgddbhbfZcbSbdPd");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f36177h = new gu() { // from class: cn.fly.verify.dw.1
        @Override // cn.fly.verify.gu
        protected void a() {
            if (by.c()) {
                dw.this.b();
            }
        }
    };

    private dw() {
        this.f36175f = null;
        this.f36175f = UUID.randomUUID().toString();
    }

    public static synchronized dw a() {
        if (f36171b == null) {
            f36171b = new dw();
        }
        return f36171b;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:20:0x003c, B:22:0x0040, B:25:0x004e), top: B:33:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:20:0x003c, B:22:0x0040, B:25:0x004e), top: B:33:0x003c }] */
    private String a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = null;
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            try {
                if (cause instanceof UnknownHostException) {
                    el.a(null);
                    return "";
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (th instanceof OutOfMemoryError) {
                        String strA = ec.a("023+chRdg]cj^gbaQcfdabh9bad1cj(gMbhbg7c9chgdbibibd");
                        el.a(stringWriter);
                        return strA;
                    }
                    String message = th.getMessage();
                    el.a(stringWriter);
                    return message;
                } catch (Throwable th4) {
                    el.a(stringWriter);
                    throw th4;
                }
            }
        }
        StringWriter stringWriter2 = new StringWriter();
        try {
            PrintWriter printWriter = new PrintWriter(stringWriter2);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter2.toString();
            el.a(stringWriter2);
            return string;
        } catch (Throwable th5) {
            th = th5;
            stringWriter = stringWriter2;
            if (th instanceof OutOfMemoryError) {
                String strA2 = ec.a("023+chRdg]cj^gbaQcfdabh9bad1cj(gMbhbg7c9chgdbibibd");
                el.a(stringWriter);
                return strA2;
            }
            String message2 = th.getMessage();
            el.a(stringWriter);
            return message2;
        }
    }

    private synchronized void a(int i10, int i11, Throwable th2, String str, String str2) {
        Object obj;
        try {
            if (th2 == null) {
                es.a().a(str, new Object[0]);
            } else {
                es.a().a(th2);
            }
            if (du.a()) {
                return;
            }
            final Message message = new Message();
            message.what = 1;
            message.arg1 = 1;
            Object[] objArr = new Object[5];
            objArr[0] = Long.valueOf(System.currentTimeMillis());
            if (th2 == null) {
                obj = th2;
                obj = str;
            }
            obj = th2;
            objArr[1] = obj;
            objArr[2] = Integer.valueOf(i10);
            objArr[3] = Integer.valueOf(i11);
            objArr[4] = str2;
            message.obj = objArr;
            ep.f36341d.execute(new gu() { // from class: cn.fly.verify.dw.2
                @Override // cn.fly.verify.gu
                protected void a() {
                    dw.this.a(message);
                }
            });
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (this.f36174e.size() > 10) {
            c(this.f36174e);
            this.f36174e.clear();
        }
        Object[] objArr = (Object[]) message.obj;
        this.f36174e.put(ec.a("0028dgba"), this.f36175f);
        ArrayList arrayList = (ArrayList) this.f36174e.get(ec.a("004eNbgdg*g"));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        HashMap map = new HashMap();
        map.put(ec.a("002ag"), objArr[0]);
        Object obj = objArr[1];
        String strA = obj instanceof Throwable ? a((Throwable) obj) : String.valueOf(obj);
        if (!TextUtils.isEmpty(strA)) {
            strA = strA.replaceAll("\r\n\t", " ").replaceAll("\n\t", " ").replaceAll("\n", " ");
        }
        map.put(ec.a("002[bdch"), Constants.ARRAY_TYPE + this.f36173d.format(objArr[0]) + "][" + objArr[2] + "][" + objArr[3] + "][" + objArr[4] + "] " + strA);
        map.put(ec.a("002dg"), objArr[2]);
        map.put(ec.a("002hUbi"), objArr[3]);
        map.put(this.f36176g, objArr[4]);
        arrayList.add(map);
        this.f36174e.put(ec.a("004eFbgdg]g"), arrayList);
        if (du.a()) {
            return;
        }
        fz.a(ax.g()).a(new fz.a() { // from class: cn.fly.verify.dw.3
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                bq.a().c(10L, dw.this.f36177h);
            }
        });
    }

    private boolean a(HashMap<String, Object> map) {
        try {
            return b(map);
        } catch (Throwable th2) {
            es.a().a(th2);
            try {
                return b(map);
            } catch (Throwable th3) {
                es.a().a(th3);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        boolean zA;
        File[] fileArrListFiles;
        if (this.f36174e.size() > 0) {
            zA = a(this.f36174e);
            if (!zA) {
                c(this.f36174e);
            }
            this.f36174e.clear();
        } else {
            zA = true;
        }
        if (zA) {
            File fileD = d();
            if (!fileD.exists() || !fileD.isDirectory() || (fileArrListFiles = fileD.listFiles()) == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                if (a((HashMap<String, Object>) gj.a(file.getAbsolutePath())) && !file.delete()) {
                    file.delete();
                }
            }
        }
    }

    private boolean b(HashMap<String, Object> map) throws Throwable {
        if (map == null || map.isEmpty()) {
            return true;
        }
        HashMap<String, Object> mapD = ek.d();
        mapD.put(ec.a("006d1bhbhbibhdg"), map);
        c();
        HashMap map2 = (HashMap) this.f36172c.b(false, av.a(), mapD, dy.a().a("dtc") + "/v2/sdrl", true);
        return map2 == null || map2.isEmpty();
    }

    private void c() {
        if (this.f36172c == null) {
            this.f36172c = new ft(1024, "ab0a0a6473d1891d388773574764b239d4ad80cb2fd3a83d81d03901c1548c13fee7c9692c326e6682b239d4c5d0021d1b607642c47ec29f10b0602908c3e6c9", "23c3c8cb41c47dd288cc7f4c218fbc7c839a34e0a0d1b2130e87b7914936b120a2d6570ee7ac66282328d50f2acfd82f2259957c89baea32547758db05de9cd7c6822304c8e45742f24bbbe41c1e12f09e18c6fab4d078065f2e5aaed94c900c66e8bbf8a120eefa7bd1fb52114d529250084f5f6f369ed4ce9645978dd30c51");
        }
    }

    private void c(HashMap<String, Object> map) {
        File[] fileArrListFiles;
        try {
            File fileD = d();
            if (!fileD.exists() || !fileD.isDirectory()) {
                fileD.delete();
                fileD.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            String str = f36170a;
            sb2.append(str);
            sb2.append(lg.a.f131412e);
            int i10 = 0;
            sb2.append(0);
            File file = new File(fileD, sb2.toString());
            if (file.exists() && (fileArrListFiles = fileD.listFiles()) != null && fileArrListFiles.length > 0) {
                file = new File(fileD, str + lg.a.f131412e + 0);
                while (file.exists()) {
                    i10++;
                    file = new File(fileD, f36170a + lg.a.f131412e + i10);
                }
            }
            gj.a(file.getPath(), (Object) map);
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    private File d() {
        return new File(gj.h(ax.g()), f36170a);
    }

    public synchronized void a(int i10, int i11, String str, String str2) {
        a(i10, i11, null, str, str2);
    }

    public synchronized void a(int i10, int i11, Throwable th2, String str) {
        a(i10, i11, th2, null, str);
    }
}
