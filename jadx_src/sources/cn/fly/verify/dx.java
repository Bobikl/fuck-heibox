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
public class dx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36182a = bq.a("004$emedfd6h");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dx f36183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ft f36184c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36187f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SimpleDateFormat f36185d = new SimpleDateFormat(bq.a("025(fdfdfdfdilididilededjgglglCl$egeg[lYgjgjemfmfmfmjghe"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, Object> f36186e = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36188g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f36189h = new gu() { // from class: cn.fly.verify.dx.1
        @Override // cn.fly.verify.gu
        protected void a() {
            if (by.c()) {
                dx.this.c();
            }
        }
    };

    private dx() {
        this.f36187f = null;
        this.f36187f = UUID.randomUUID().toString();
    }

    public static synchronized dx a() {
        if (f36183b == null) {
            f36183b = new dx();
        }
        return f36183b;
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
                        String strA = bq.a("0237fkVgj*fmDjed)figdekCedg;fmVjGekejPfTfkjgeleleg");
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
                String strA2 = bq.a("0237fkVgj*fmDjed)figdekCedg;fmVjGekejPfTfkjgeleleg");
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
            ep.f36341d.execute(new gu() { // from class: cn.fly.verify.dx.2
                @Override // cn.fly.verify.gu
                protected void a() {
                    dx.this.a(message);
                }
            });
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (this.f36186e.size() > 10) {
            c(this.f36186e);
            this.f36186e.clear();
        }
        Object[] objArr = (Object[]) message.obj;
        this.f36186e.put(bq.a("002Fgjed"), this.f36187f);
        ArrayList arrayList = (ArrayList) this.f36186e.get(bq.a("004h3ejgjGj"));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        HashMap map = new HashMap();
        map.put(bq.a("002dj"), objArr[0]);
        Object obj = objArr[1];
        String strA = obj instanceof Throwable ? a((Throwable) obj) : String.valueOf(obj);
        if (!TextUtils.isEmpty(strA)) {
            strA = strA.replaceAll("\r\n\t", " ").replaceAll("\n\t", " ").replaceAll("\n", " ");
        }
        map.put(bq.a("002$egfk"), Constants.ARRAY_TYPE + this.f36185d.format(objArr[0]) + "][" + objArr[2] + "][" + objArr[3] + "][" + objArr[4] + "] " + strA);
        map.put(bq.a("002gj"), objArr[2]);
        map.put(bq.a("002kCel"), objArr[3]);
        arrayList.add(map);
        this.f36186e.put(bq.a("004hXejgj!j"), arrayList);
        if (du.a()) {
            return;
        }
        fz.a(ax.g()).a(new fz.a() { // from class: cn.fly.verify.dx.3
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                bq.a().b(10L, dx.this.f36189h);
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

    private synchronized int b() {
        return this.f36188g;
    }

    private boolean b(HashMap<String, Object> map) throws Throwable {
        if (map == null || map.isEmpty()) {
            return true;
        }
        HashMap<String, Object> mapD = ek.d();
        mapD.put(bq.a("006g4ekekelekgj"), map);
        d();
        HashMap map2 = (HashMap) this.f36184c.b(false, ft.a(), mapD, dy.a().a("dtc") + "/v2/drl", true);
        return map2 == null || map2.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        boolean zA;
        File[] fileArrListFiles;
        if (this.f36186e.size() > 0) {
            zA = a(this.f36186e);
            if (!zA) {
                c(this.f36186e);
            }
            this.f36186e.clear();
        } else {
            zA = true;
        }
        if (zA) {
            File fileE = e();
            if (!fileE.exists() || !fileE.isDirectory() || (fileArrListFiles = fileE.listFiles()) == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                if (a((HashMap<String, Object>) gj.a(file.getAbsolutePath())) && !file.delete()) {
                    file.delete();
                }
            }
        }
    }

    private void c(HashMap<String, Object> map) {
        File[] fileArrListFiles;
        try {
            File fileE = e();
            if (!fileE.exists() || !fileE.isDirectory()) {
                fileE.delete();
                fileE.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            String str = f36182a;
            sb2.append(str);
            sb2.append(lg.a.f131412e);
            int i10 = 0;
            sb2.append(0);
            File file = new File(fileE, sb2.toString());
            if (file.exists() && (fileArrListFiles = fileE.listFiles()) != null && fileArrListFiles.length > 0) {
                file = new File(fileE, str + lg.a.f131412e + 0);
                while (file.exists()) {
                    i10++;
                    file = new File(fileE, f36182a + lg.a.f131412e + i10);
                }
            }
            gj.a(file.getPath(), (Object) map);
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    private void d() {
        if (this.f36184c == null) {
            this.f36184c = new ft(1024, "ab0a0a6473d1891d388773574764b239d4ad80cb2fd3a83d81d03901c1548c13fee7c9692c326e6682b239d4c5d0021d1b607642c47ec29f10b0602908c3e6c9", "23c3c8cb41c47dd288cc7f4c218fbc7c839a34e0a0d1b2130e87b7914936b120a2d6570ee7ac66282328d50f2acfd82f2259957c89baea32547758db05de9cd7c6822304c8e45742f24bbbe41c1e12f09e18c6fab4d078065f2e5aaed94c900c66e8bbf8a120eefa7bd1fb52114d529250084f5f6f369ed4ce9645978dd30c51");
        }
    }

    private File e() {
        return new File(gj.h(ax.g()), f36182a);
    }

    public synchronized void a(int i10) {
        this.f36188g = i10;
        if (i10 != 1 && i10 != 4 && i10 != 17 && i10 != 18 && i10 != 19 && i10 != 20) {
        }
    }

    public synchronized void a(int i10, Throwable th2) {
        a(i10, b(), th2, null, "-99");
    }
}
