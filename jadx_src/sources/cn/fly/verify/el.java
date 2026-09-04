package cn.fly.verify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f36299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f36300b = new byte[0];

    /* JADX INFO: renamed from: cn.fly.verify.el$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36305a;

        static {
            int[] iArr = new int[bb.values().length];
            f36305a = iArr;
            try {
                iArr[bb.JP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36305a[bb.US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Context a() {
        try {
            Object objB = b();
            if (objB != null) {
                return (Context) gi.a(objB, bq.a("014?fk.gj%ge:kkhNejLdej]ejelAf"), new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public static Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return (Intent) (Build.VERSION.SDK_INT < 33 ? gi.a(ax.g(), bq.a("016;ekCg.fkejgjJjgGekhkVgdg;ejeeDg-ek"), new Object[]{broadcastReceiver, intentFilter}, (Class<?>[]) new Class[]{BroadcastReceiver.class, IntentFilter.class}, (Object) null) : gi.a(ax.g(), bq.a("016Jek g=fkejgj)jg=ekhkVgdgRejee2g=ek"), new Object[]{broadcastReceiver, intentFilter, 4}, (Class<?>[]) new Class[]{BroadcastReceiver.class, IntentFilter.class, Integer.TYPE}, (Object) null));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x006c, please report this as an issue */
    public static String a(String str) {
        StringBuilder sb2;
        String strA;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strA2 = "";
        if (str.startsWith(bq.a("007ijjklmm"))) {
            str = str.replace(bq.a("007ijjklmm"), "");
        }
        if (str.startsWith("https://")) {
            str = str.replace("https://", "");
        }
        if (!ax.c()) {
            int i10 = AnonymousClass4.f36305a[ax.a().ordinal()];
            if (i10 != 1) {
                str2 = i10 == 2 ? "002)ehgj" : "002_eeii";
            } else {
                strA2 = "jp";
            }
            if (TextUtils.isEmpty(strA2)) {
                if (str.startsWith(strA2 + ".")) {
                    sb2 = new StringBuilder();
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(bq.a("007ijjklmm"));
                    sb2.append(strA2);
                    strA = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                }
                sb2.append(strA);
                sb2.append(str);
                return b(sb2.toString());
            }
            sb2 = new StringBuilder();
            strA = bq.a("007ijjklmm");
            sb2.append(strA);
            sb2.append(str);
            return b(sb2.toString());
        }
        strA2 = bq.a(str2);
        if (TextUtils.isEmpty(strA2)) {
            if (str.startsWith(strA2 + ".")) {
                sb2 = new StringBuilder();
            } else {
                sb2 = new StringBuilder();
                sb2.append(bq.a("007ijjklmm"));
                sb2.append(strA2);
                strA = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
            sb2.append(strA);
            sb2.append(str);
            return b(sb2.toString());
        }
        sb2 = new StringBuilder();
        strA = bq.a("007ijjklmm");
        sb2.append(strA);
        sb2.append(str);
        return b(sb2.toString());
    }

    public static String a(String str, int i10) {
        String strSubstring;
        int i11 = 0;
        int i12 = 3;
        if (str.startsWith(org.apache.tools.tar.c.V)) {
            strSubstring = str.substring(2, 3);
        } else {
            strSubstring = str.startsWith("0") ? str.substring(1, 3) : str.substring(0, 3);
        }
        int i13 = Integer.parseInt(strSubstring);
        char[] charArray = str.toCharArray();
        int[] iArr = new int[i13];
        boolean z10 = true;
        while (i12 < charArray.length) {
            char c10 = charArray[i12];
            if (c10 < 'a') {
                z10 = !z10;
            } else {
                int i14 = c10 - i10;
                if (z10) {
                    iArr[i11] = i14;
                } else {
                    int i15 = i14 * 10;
                    iArr[i11] = i15;
                    i12++;
                    iArr[i11] = i15 + (charArray[i12] - i10);
                }
                int i16 = iArr[i11];
                i11++;
            }
            i12++;
        }
        return cr.a(iArr);
    }

    public static void a(BroadcastReceiver broadcastReceiver) {
        gi.a(ax.g(), bq.a("018;ehWf<ekGg fkejgjTjg$ekhkHgdg3ejeeAg7ek"), new Object[]{broadcastReceiver}, (Class<?>[]) new Class[]{BroadcastReceiver.class}, (Object) null);
    }

    public static void a(final gq<ArrayList<HashMap<String, Object>>> gqVar) {
        fz.a(ax.g()).H().J().a(new fz.a() { // from class: cn.fly.verify.el.3
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                ArrayList arrayList = new ArrayList();
                try {
                    ArrayList<HashMap<String, Object>> arrayListG = bVar.G();
                    if (arrayListG != null && !arrayListG.isEmpty()) {
                        ArrayList<String> arrayListG2 = by.g();
                        if (arrayListG2 != null && !arrayListG2.isEmpty()) {
                            String strI = bVar.I();
                            for (HashMap<String, Object> map : arrayListG) {
                                Object obj = map.get(bq.a("005*gkfmfmffgm"));
                                if (obj != null && String.valueOf(obj).equals(strI)) {
                                    map.put(bq.a("010*eieieiGd'ehekfeelAff"), Boolean.TRUE);
                                    strI = null;
                                }
                                HashMap map2 = new HashMap();
                                for (String str : arrayListG2) {
                                    Object obj2 = map.get(str);
                                    if (obj2 != null) {
                                        map2.put(str, obj2);
                                    }
                                }
                                arrayList.add(map2);
                            }
                        }
                        gqVar.a(null);
                        return;
                    }
                } catch (Throwable th2) {
                    es.a().b(th2);
                }
                gq gqVar2 = gqVar;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                gqVar2.a(arrayList);
            }
        });
    }

    public static void a(File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            b(file);
            return;
        }
        String[] list = file.list();
        if (list == null || list.length == 0) {
            b(file);
            return;
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                a(file2);
            } else {
                b(file2);
            }
        }
        b(file);
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
            }
        }
    }

    public static boolean a(long j10, long j11) {
        if (j10 <= 0 || j11 <= 0) {
            return false;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.format(new Date(j10)).equals(simpleDateFormat.format(new Date(j11)));
        } catch (Throwable th2) {
            es.a().a(th2);
            return false;
        }
    }

    public static Object b() {
        final gi.a<Void, Object> aVar = new gi.a<Void, Object>() { // from class: cn.fly.verify.el.1
            @Override // cn.fly.verify.gi.a
            public Object a(Void r10) {
                return gi.a(gi.a(bq.a("026efPedekelejedemLekk^emge.dj=ejeeej1jUfdgdNi0ek geQed"), (String) null), bq.a("021d$ehekek6gfj:ge,dj)ejeeej jMfdgd4iBekFge=ed"), (Object) null, new Object[0]);
            }
        };
        int i10 = (Thread.currentThread().getId() > Looper.getMainLooper().getThread().getId() ? 1 : (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() ? 0 : -1));
        Object objA = aVar.a(null);
        if (objA != null) {
            return objA;
        }
        final Object obj = new Object();
        final Object[] objArr = new Object[1];
        synchronized (obj) {
            gm.a(0, new Handler.Callback() { // from class: cn.fly.verify.el.2
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    Object obj2;
                    synchronized (obj) {
                        try {
                            objArr[0] = aVar.a(null);
                            obj2 = obj;
                        } catch (Throwable th2) {
                            try {
                                es.a().b(th2);
                                obj2 = obj;
                            } catch (Throwable th3) {
                                obj.notify();
                                throw th3;
                            }
                        }
                        obj2.notify();
                    }
                    return false;
                }
            });
            try {
                obj.wait();
            } catch (Throwable th2) {
                es.a().b(th2);
            }
        }
        return objArr[0];
    }

    public static String b(String str) {
        Uri uri;
        String scheme;
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            boolean zB = ax.b();
            if (zB || !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                str = str.trim();
                if (str.startsWith(bq.a("007ijjklmm")) && (uri = Uri.parse(str.trim())) != null && (scheme = uri.getScheme()) != null && scheme.equals(bq.a("004ijjk"))) {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    String query = uri.getQuery();
                    String str3 = "";
                    if (host != null) {
                        int port = uri.getPort();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(host);
                        if (port <= 0 || port == 80) {
                            str2 = "";
                        } else {
                            str2 = ":" + port;
                        }
                        sb2.append(str2);
                        host = sb2.toString();
                        if (!zB && Build.VERSION.SDK_INT >= 24 && ((Boolean) gi.a((Object) NetworkSecurityPolicy.getInstance(), bq.a("027Lejgjfe4hge^ek%jg8fjTjMgdekGe^fgfgejLd]hm*gWekegej,jjg(ed"), host)).booleanValue()) {
                            return str;
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("https://");
                    sb3.append(host);
                    if (path == null) {
                        path = "";
                    }
                    sb3.append(path);
                    if (query != null) {
                        str3 = "?" + query;
                    }
                    sb3.append(str3);
                    return sb3.toString();
                }
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        return str;
    }

    private static void b(File file) {
        gi.a(file, bq.a("006JedEghgjg"), (Object[]) null, (Class<?>[]) null, (Object) null);
    }

    public static Object c(String str) throws Throwable {
        return gi.a(gi.a(gi.a(bq.a("017:ih8eFeeEeVem=hef:fkemhkeh'fjHejeg+g")), bq.a("0106fkJgjUhkeh>fjZejegWg"), new Object[0]), bq.a("004g3fjDgd"), new Object[]{str}, (Class<?>[]) new Class[]{String.class});
    }

    public static byte[] c() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        Throwable th2;
        try {
            SecureRandom secureRandom = new SecureRandom();
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeLong(secureRandom.nextLong());
                    dataOutputStream.writeLong(secureRandom.nextLong());
                    dataOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    a(dataOutputStream, byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th3) {
                    th2 = th3;
                    a(dataOutputStream, byteArrayOutputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                dataOutputStream = null;
                th2 = th;
                a(dataOutputStream, byteArrayOutputStream);
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
            dataOutputStream = null;
        }
    }

    public static Object d(String str) {
        try {
            return ax.g().getSystemService(str);
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public static String d() {
        if (TextUtils.isEmpty(f36299a)) {
            synchronized (f36300b) {
                try {
                    if (TextUtils.isEmpty(f36299a)) {
                        f36299a = new gp(ax.g()).a();
                    }
                } catch (Throwable th2) {
                    es.a().a("[ICE] ee " + th2, new Object[0]);
                }
            }
        }
        return f36299a;
    }
}
