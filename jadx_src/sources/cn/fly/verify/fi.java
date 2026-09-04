package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.audio.q0;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class fi implements fa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f36488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private fb f36489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Set<String> f36490f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f36485a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f36486b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f36487c = new ConcurrentHashMap<>();

    public static abstract class a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public T f36573g;

        public a(T t10) {
            this.f36573g = t10;
        }

        protected long a(T t10) {
            return 0L;
        }

        protected abstract T b() throws Throwable;
    }

    public fi(Context context) {
        this.f36488d = context;
        this.f36489e = fb.a(context);
        gt.a();
    }

    private int a(Type type) {
        if (type instanceof GenericArrayType) {
            return Parcelable.class.isAssignableFrom((Class) ((GenericArrayType) type).getGenericComponentType()) ? 1 : 2;
        }
        if (!(type instanceof ParameterizedType)) {
            return 9;
        }
        try {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type type2 = actualTypeArguments[0];
            if (actualTypeArguments.length == 2) {
                type2 = actualTypeArguments[1];
            }
            if (!(type2 instanceof ParameterizedType)) {
                if (type2 instanceof Class) {
                    return Parcelable.class.isAssignableFrom((Class) type2) ? 3 : 4;
                }
                return -1;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            Type type3 = actualTypeArguments2[0];
            if (actualTypeArguments2.length == 2) {
                type3 = actualTypeArguments2[1];
            }
            if (type3 instanceof Class) {
            }
            return 4;
        } catch (Throwable th2) {
            es.a().a(th2);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(Calendar calendar) {
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0077  */
    private PackageInfo a(boolean z10, final int i10, final String str, final int i11, final boolean z11) {
        boolean z12;
        final boolean zA = fk.a("1009", str);
        String str2 = "gpi-" + i10 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i11 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + z11;
        a<PackageInfo> aVar = new a<PackageInfo>(null) { // from class: cn.fly.verify.fi.35
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(PackageInfo packageInfo) {
                if (zA) {
                    return i10;
                }
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public PackageInfo b() throws Throwable {
                return (PackageInfo) fe.a(fi.this.f36488d).a(str, i11, z11);
            }
        };
        if (z10) {
            z12 = true;
        } else {
            if (a(zA, "gpi-" + i10 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i11 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + z11, str)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        return (PackageInfo) b(str2, aVar, z12);
    }

    private <T> T a(String str, a<T> aVar) {
        return (T) a(str, (a) aVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00f5: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:52:0x00f5 */
    private <T> T a(String str, a<T> aVar, boolean z10) {
        T tB;
        T t10;
        Object obj;
        ConcurrentHashMap<String, Integer> concurrentHashMap;
        int iValueOf;
        T tB2 = null;
        String strA = null;
        try {
            if (str == null) {
                h("M|A, key: " + str);
                tB = aVar.b();
            } else {
                Integer num = this.f36486b.get(str);
                try {
                    if (num != null) {
                        obj = this.f36485a.get(str);
                        if (obj == null && !z10) {
                            return aVar.f36573g;
                        }
                    } else {
                        obj = null;
                    }
                    Long l10 = this.f36487c.get(str);
                    boolean z11 = false;
                    Object[] objArr = l10 != null && System.currentTimeMillis() >= l10.longValue();
                    if (objArr == false && a(obj) && !this.f36490f.contains(str)) {
                        z11 = true;
                    }
                    if (z10 || obj == null || objArr == true || z11) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("M|A, key: ");
                        sb2.append(str);
                        sb2.append("|");
                        if (z10) {
                            strA = "FC";
                        } else if (obj == null || objArr == true) {
                            strA = "NVC";
                        } else if (z11) {
                            strA = ei.a("002Leggj");
                        }
                        sb2.append(strA);
                        h(sb2.toString());
                        tB2 = aVar.b();
                        this.f36490f.add(str);
                        if (tB2 != null) {
                            this.f36485a.put(str, tB2);
                            if (aVar.a(tB2) > 0) {
                                this.f36487c.put(str, Long.valueOf(System.currentTimeMillis() + aVar.a(tB2)));
                            }
                        }
                        if (num == null) {
                            concurrentHashMap = this.f36486b;
                            iValueOf = 1;
                        } else {
                            concurrentHashMap = this.f36486b;
                            iValueOf = Integer.valueOf(num.intValue() + 1);
                        }
                        concurrentHashMap.put(str, iValueOf);
                        tB = tB2;
                    } else {
                        h("M|C, key: " + str);
                        tB = (T) obj;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    tB2 = t10;
                    if (th instanceof PackageManager.NameNotFoundException) {
                        es.a().b("Exception: " + th.getClass().getName() + ": " + th.getMessage());
                    } else {
                        es.a().b(th);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return tB == null ? aVar.f36573g : tB;
    }

    private <T> Type a(a<T> aVar) {
        try {
            return ((ParameterizedType) aVar.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void a(String str, T t10, long j10, a<T> aVar) {
        gt gtVarA;
        try {
            Type typeA = a((a) aVar);
            int iA = a(typeA);
            if (iA == 1) {
                gt.a().a(str, (Parcelable[]) t10, j10);
                return;
            }
            if (iA == 2 || iA == 4) {
                gtVarA = gt.a();
            } else {
                if (iA == 3) {
                    Class cls = (Class) ((ParameterizedType) typeA).getRawType();
                    if (cls != List.class && cls != LinkedList.class && cls != ArrayList.class) {
                        if (cls == Map.class || cls == HashMap.class || cls == TreeMap.class || cls == Hashtable.class) {
                            gt.a().a(str, (Map) t10, j10);
                            return;
                        }
                        return;
                    }
                    gt.a().a(str, (List) t10, j10);
                    return;
                }
                if (iA == 9) {
                    Class cls2 = (Class) typeA;
                    if (cls2 == null) {
                        return;
                    }
                    if (cls2 == Integer.class) {
                        gt.a().a(str, (Integer) t10, j10);
                        return;
                    }
                    if (cls2 == Long.class) {
                        gt.a().a(str, (Long) t10, j10);
                        return;
                    }
                    if (cls2 == Double.class) {
                        gt.a().a(str, (Double) t10, j10);
                        return;
                    }
                    if (cls2 == Boolean.class) {
                        gt.a().a(str, (Boolean) t10, j10);
                        return;
                    } else if (cls2 == String.class) {
                        gt.a().a(str, (String) t10, j10);
                        return;
                    } else {
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            gt.a().a(str, (Parcelable) t10, j10);
                            return;
                        }
                        gtVarA = gt.a();
                    }
                } else {
                    gtVarA = gt.a();
                }
            }
            gtVarA.a(str, t10, j10);
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    private boolean a(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == -1) {
                return true;
            }
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == -1) {
                return true;
            }
        } else {
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
        }
        return false;
    }

    private boolean a(boolean z10, String str, String str2) {
        String str3 = "sdir_able_" + (TextUtils.equals(str2, fz.d.c()) ? 1 : 0);
        if (gt.a().a(str3, -1) != z10) {
            gt.a().a(str3, Integer.valueOf(z10 ? 1 : 0));
            if (!z10) {
                return true;
            }
        }
        if (!z10 || TextUtils.isEmpty(str2)) {
            return false;
        }
        String str4 = "key_almdf-" + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2;
        long jC = gt.a().c(str4);
        long jG = g(str2);
        if (jG == jC) {
            return false;
        }
        gt.a().a(str4, Long.valueOf(jG));
        return true;
    }

    private PackageInfo b(boolean z10, int i10, String str, int i11, boolean z11) {
        if (!str.equals(fz.d.c())) {
            return a(z10, i10, str, i11, z11);
        }
        int i12 = (i11 == 0 || i11 == 1 || i11 == 128 || i11 == 64) ? 193 : i11;
        PackageInfo packageInfoA = a(z10, i10, str, i12, z11);
        return (packageInfoA == null && i12 == 193) ? a(z10, i10, str, i11, z11) : packageInfoA;
    }

    private <T> T b(String str, a<T> aVar) {
        return (T) b(str, aVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0087 A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:22:0x0041, B:30:0x0054, B:31:0x006b, B:38:0x008d, B:37:0x0087), top: B:63:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[Catch: all -> 0x00be, TryCatch #4 {all -> 0x00be, blocks: (B:3:0x0001, B:6:0x0009, B:39:0x009b, B:42:0x00ac, B:43:0x00b1), top: B:64:0x0001 }] */
    /* JADX WARN: Multi-variable type inference failed */
    private <T> T b(String str, a<T> aVar, boolean z10) {
        T t10;
        Object objC;
        long jA;
        Object objB = null;
        String strA = null;
        try {
            if (TextUtils.isEmpty(str)) {
                h("F|A, key: " + str);
                t10 = (T) aVar.b();
            } else {
                boolean z11 = true;
                boolean z12 = false;
                if (z10) {
                    objC = null;
                } else {
                    try {
                        objC = c(str, aVar);
                        try {
                            z12 = a(objC) && !this.f36490f.contains(str);
                            z11 = false;
                        } catch (gf.b unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                es.a().a(th);
                                z11 = false;
                            } catch (Throwable th3) {
                                th = th3;
                                objB = objC;
                                if (th instanceof InvocationTargetException) {
                                    String name = th.getClass().getName();
                                    String message = th.getMessage();
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        name = cause.getClass().getName();
                                        message = cause.getMessage();
                                    }
                                    es.a().b("Exception: " + name + ": " + message);
                                } else if (th instanceof PackageManager.NameNotFoundException) {
                                    es.a().b("Exception: " + th.getClass().getName() + ": " + th.getMessage());
                                } else {
                                    es.a().b(th);
                                }
                            }
                        }
                    } catch (gf.b unused2) {
                        objC = null;
                    } catch (Throwable th4) {
                        th = th4;
                        objC = null;
                    }
                    if (!z10 || z11 || z12) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("F|A, key: ");
                        sb2.append(str);
                        sb2.append("|");
                        if (z10) {
                            strA = "FC";
                        } else if (z11) {
                            strA = "NVC";
                        } else if (z12) {
                            strA = ei.a("002Heggj");
                        }
                        sb2.append(strA);
                        h(sb2.toString());
                        objB = aVar.b();
                        this.f36490f.add(str);
                        jA = aVar.a(objB);
                        if (jA >= 0) {
                            a(str, objB, jA > 0 ? System.currentTimeMillis() + jA : 0L, aVar);
                        }
                        t10 = (T) objB;
                    } else {
                        h("F|C, key: " + str);
                        t10 = (T) objC;
                    }
                }
                z11 = false;
                if (z10) {
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("F|A, key: ");
                sb3.append(str);
                sb3.append("|");
                if (z10) {
                    strA = "FC";
                } else if (z11) {
                    strA = "NVC";
                } else if (z12) {
                    strA = ei.a("002Heggj");
                }
                sb3.append(strA);
                h(sb3.toString());
                objB = aVar.b();
                this.f36490f.add(str);
                jA = aVar.a(objB);
                if (jA >= 0) {
                    a(str, objB, jA > 0 ? System.currentTimeMillis() + jA : 0L, aVar);
                }
                t10 = (T) objB;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return t10 == null ? aVar.f36573g : t10;
    }

    private <T> T c(String str, a<T> aVar) throws gf.b {
        gt gtVarA;
        T t10;
        Object objB;
        Type typeA = a((a) aVar);
        int iA = a(typeA);
        try {
            if (iA == 1) {
                objB = gt.a().a(str, (Class) ((GenericArrayType) typeA).getGenericComponentType(), (Parcelable[]) aVar.f36573g);
            } else {
                if (iA == 2 || iA == 4) {
                    gtVarA = gt.a();
                    t10 = aVar.f36573g;
                } else {
                    if (iA == 3) {
                        ParameterizedType parameterizedType = (ParameterizedType) typeA;
                        Class cls = (Class) parameterizedType.getRawType();
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type type = actualTypeArguments[0];
                        if (actualTypeArguments.length == 2) {
                            type = actualTypeArguments[1];
                        }
                        if (!(type instanceof Class)) {
                            return null;
                        }
                        Class cls2 = (Class) type;
                        if (!Parcelable.class.isAssignableFrom(cls2)) {
                            return null;
                        }
                        if (cls != List.class && cls != LinkedList.class && cls != ArrayList.class) {
                            if (cls == Map.class || cls == HashMap.class || cls == TreeMap.class || cls == Hashtable.class) {
                                return (T) gt.a().b(str, cls2);
                            }
                            return null;
                        }
                        return (T) gt.a().c(str, cls2);
                    }
                    if (iA == 9) {
                        Class<T> cls3 = (Class) typeA;
                        if (cls3 == null) {
                            return null;
                        }
                        if (cls3 == Integer.class) {
                            return (T) Integer.valueOf(gt.a().b(str, ((Integer) aVar.f36573g).intValue()));
                        }
                        if (cls3 == Long.class) {
                            return (T) Long.valueOf(gt.a().a(str, ((Long) aVar.f36573g).longValue()));
                        }
                        if (cls3 == Double.class) {
                            return (T) Double.valueOf(gt.a().a(str, ((Double) aVar.f36573g).doubleValue()));
                        }
                        if (cls3 == Boolean.class) {
                            return (T) Boolean.valueOf(gt.a().a(str, ((Boolean) aVar.f36573g).booleanValue()));
                        }
                        if (cls3 == String.class) {
                            return (T) gt.a().b(str, (String) aVar.f36573g);
                        }
                        return Parcelable.class.isAssignableFrom(cls3) ? (T) gt.a().a(str, cls3, aVar.f36573g) : (T) gt.a().b(str, aVar.f36573g);
                    }
                    gtVarA = gt.a();
                    t10 = aVar.f36573g;
                }
                objB = gtVarA.b(str, t10);
            }
            return (T) objB;
        } catch (gf.b e10) {
            throw e10;
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    private long g(String str) {
        if (!TextUtils.isEmpty(str)) {
            ApplicationInfo applicationInfoA = a(true, str, 0);
            String str2 = applicationInfoA != null ? applicationInfoA.sourceDir : null;
            if (!TextUtils.isEmpty(str2)) {
                return new File(str2).lastModified();
            }
        }
        return 0L;
    }

    private void h(String str) {
    }

    private ArrayList<HashMap<String, String>> i(boolean z10) {
        ArrayList<HashMap<String, String>> arrayList;
        synchronized ("gal") {
            arrayList = (ArrayList) b("gal", new a<ArrayList<HashMap<String, String>>>(null) { // from class: cn.fly.verify.fi.26
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // cn.fly.verify.fi.a
                public long a(ArrayList<HashMap<String, String>> arrayList2) {
                    Calendar calendar = Calendar.getInstance();
                    long jA = fi.this.a(calendar) - calendar.getTimeInMillis();
                    if (jA > 0) {
                        return jA;
                    }
                    return 86400000L;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // cn.fly.verify.fi.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ArrayList<HashMap<String, String>> b() throws Throwable {
                    return fi.this.f36489e.s();
                }
            }, z10);
        }
        return arrayList;
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Long> A() {
        return (HashMap) b("meio", new a<HashMap<String, Long>>(null) { // from class: cn.fly.verify.fi.14
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(HashMap<String, Long> map) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Long> b() throws Throwable {
                return fi.this.f36489e.F();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String B() {
        return (String) b("ale", new a<String>(null) { // from class: cn.fly.verify.fi.15
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.i();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String C() {
        return (String) b("sse", new a<String>(null) { // from class: cn.fly.verify.fi.17
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.k();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String D() {
        return dt.i() ? f(false) : "forbid";
    }

    @Override // cn.fly.verify.fa
    public String E() {
        String str;
        String lowerCase = D().toLowerCase();
        if (TextUtils.isEmpty(lowerCase) || ei.a("004e_dk*ef").equals(lowerCase)) {
            str = "004eLdkFef";
        } else if (lowerCase.startsWith(ei.a("0022hiej")) || lowerCase.startsWith(ei.a("002.hlej")) || lowerCase.startsWith(ei.a("002*jfej")) || lowerCase.startsWith(ei.a("002'heej"))) {
            str = "004cfgg";
        } else {
            str = (lowerCase.startsWith(ei.a("004Xfgdiefdi")) || "forbid".equals(lowerCase)) ? "0041fgdiefdi" : "005Ddk_ihf5dj";
        }
        return ei.a(str);
    }

    @Override // cn.fly.verify.fa
    public String F() {
        String str;
        String lowerCase = D().toLowerCase();
        if (TextUtils.isEmpty(lowerCase) || ei.a("004e:dk.ef").equals(lowerCase)) {
            str = "004e;dkWef";
        } else if (lowerCase.startsWith(ei.a("004Dfgdiefdi"))) {
            str = "004Yfgdiefdi";
        } else if (lowerCase.startsWith(ei.a("002*hiej"))) {
            str = "002Jhiej";
        } else if (lowerCase.startsWith(ei.a("002*hlej"))) {
            str = "002!hlej";
        } else if (lowerCase.startsWith(ei.a("002Wjfej"))) {
            str = "002Hjfej";
        } else if (lowerCase.startsWith(ei.a("002 heej"))) {
            str = "002%heej";
        } else {
            if (!lowerCase.startsWith(ei.a("0099ff2g[dgKfi3dkdk_ih"))) {
                return lowerCase;
            }
            str = "009QffSg:dg4fi+dkdk-ih";
        }
        return ei.a(str);
    }

    @Override // cn.fly.verify.fa
    public boolean G() {
        String strE = E();
        return ei.a("004Kfgdiefdi").equals(strE) || ei.a("004cfgg").equals(strE);
    }

    @Override // cn.fly.verify.fa
    public int H() {
        return ((Integer) b("dtnttp", new a<Integer>(-1) { // from class: cn.fly.verify.fi.19
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Integer num) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(fi.this.f36489e.V());
            }
        })).intValue();
    }

    @Override // cn.fly.verify.fa
    public String I() {
        return (String) b("tize", new a<String>(null) { // from class: cn.fly.verify.fi.20
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.Q();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String J() {
        return (String) b("flvr", new a<String>(null) { // from class: cn.fly.verify.fi.21
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.R();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String K() {
        return (String) b("babd", new a<String>(null) { // from class: cn.fly.verify.fi.22
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.S();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String L() {
        return (String) b("bfsp", new a<String>(null) { // from class: cn.fly.verify.fi.24
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.T();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String M() {
        return (String) b("bopm", new a<String>(null) { // from class: cn.fly.verify.fi.25
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.U();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String N() {
        if (!az.a().h()) {
            return az.a().t();
        }
        if (!dt.i()) {
            return "0.0.0.0";
        }
        try {
            Enumeration<NetworkInterface> enumerationA = fe.a(this.f36488d).a();
            while (enumerationA.hasMoreElements()) {
                Enumeration<InetAddress> enumerationA2 = fe.a(this.f36488d).a(enumerationA.nextElement());
                while (enumerationA2.hasMoreElements()) {
                    InetAddress inetAddressNextElement = enumerationA2.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> O() {
        return i(false);
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> P() {
        ArrayList<HashMap<String, String>> arrayListA;
        synchronized ("gsl") {
            arrayListA = this.f36489e.a(i(false), 2);
        }
        return arrayListA;
    }

    @Override // cn.fly.verify.fa
    public String Q() {
        return (String) b("deky", new a<String>(null) { // from class: cn.fly.verify.fi.27
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.a(false);
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String R() {
        return (String) b("scph", new a<String>(null) { // from class: cn.fly.verify.fi.29
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.t();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String S() {
        return this.f36489e.b(T());
    }

    @Override // cn.fly.verify.fa
    public String T() {
        return (String) b("pne", new a<String>(null) { // from class: cn.fly.verify.fi.30
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.o();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String U() {
        return this.f36489e.p();
    }

    @Override // cn.fly.verify.fa
    public int V() {
        return this.f36489e.q();
    }

    @Override // cn.fly.verify.fa
    public String W() {
        return this.f36489e.r();
    }

    @Override // cn.fly.verify.fa
    public boolean X() {
        return ((Boolean) a("imp", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.31
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(fi.this.f36489e.X());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String Y() {
        return (String) a("cpne", new a<String>(null) { // from class: cn.fly.verify.fi.32
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.Y();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public boolean Z() {
        return en.a();
    }

    @Override // cn.fly.verify.fa
    public ApplicationInfo a(String str, int i10) {
        return a(false, str, i10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x004a  */
    @Override // cn.fly.verify.fa
    public ApplicationInfo a(boolean z10, final String str, final int i10) {
        boolean z11;
        final boolean zA = fk.a("1009", str);
        String str2 = "gtaiffce-" + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i10;
        a<ApplicationInfo> aVar = new a<ApplicationInfo>(null) { // from class: cn.fly.verify.fi.44
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(ApplicationInfo applicationInfo) {
                return zA ? 0L : 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ApplicationInfo b() throws Throwable {
                return fe.a(fi.this.f36488d).a(str, i10);
            }
        };
        if (z10) {
            z11 = true;
        } else {
            if (a(zA, "gtaiffce-" + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i10, str)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return (ApplicationInfo) b(str2, aVar, z11);
    }

    @Override // cn.fly.verify.fa
    public PackageInfo a(boolean z10, int i10, String str, int i11) {
        return b(z10, i10, str, i11, true);
    }

    @Override // cn.fly.verify.fa
    public Location a(int i10, int i11, boolean z10) {
        List listA = a(i10, i11, z10, false);
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return (Location) listA.get(listA.size() - 1);
    }

    @Override // cn.fly.verify.fa
    public String a(String str) {
        return this.f36489e.a(str);
    }

    @Override // cn.fly.verify.fa
    public String a(boolean z10) {
        HashMap<String, Object> mapE = e(z10);
        if (mapE != null) {
            return (String) mapE.get("ssmt");
        }
        return null;
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> a(boolean z10, boolean z11) {
        synchronized ("giafce") {
            ArrayList<HashMap<String, String>> arrayListI = i(z11);
            if (z10) {
                return this.f36489e.a(arrayListI, 0);
            }
            return this.f36489e.a(arrayListI, 1);
        }
    }

    @Override // cn.fly.verify.fa
    public List a(final int i10, final int i11, final boolean z10, final boolean z11) {
        return (List) b("gtelcmefce-" + i10 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i11 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + z10, new a<List<Location>>(null) { // from class: cn.fly.verify.fi.59
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(List<Location> list) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public List<Location> b() throws Throwable {
                return fi.this.f36489e.a(i10, i11, z10, z11);
            }
        }, z11);
    }

    @Override // cn.fly.verify.fa
    public List<ResolveInfo> a(Intent intent, int i10) {
        return fe.a(this.f36488d).a(intent, i10);
    }

    @Override // cn.fly.verify.fa
    public boolean a() {
        return ((Boolean) b("ird", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return (bool == null || !bool.booleanValue()) ? 180000L : 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(fi.this.f36489e.a());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public Context aa() {
        return (Context) a("galct", new a<Context>(null) { // from class: cn.fly.verify.fi.33
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Context b() throws Throwable {
                if (fi.this.f36488d != null) {
                    return fi.this.f36488d;
                }
                Context contextX = fb.x();
                if (contextX != null) {
                    fi.this.f36488d = contextX;
                }
                return contextX;
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String ab() {
        return this.f36489e.d();
    }

    @Override // cn.fly.verify.fa
    public String ac() {
        return this.f36489e.e();
    }

    @Override // cn.fly.verify.fa
    public long ad() {
        return this.f36489e.Z();
    }

    @Override // cn.fly.verify.fa
    public String ae() {
        return (String) b("dvcnm", new a<String>(null) { // from class: cn.fly.verify.fi.36
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.aa();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String af() {
        return (String) b("cgrp", new a<String>(null) { // from class: cn.fly.verify.fi.37
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.ab();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String ag() {
        return (String) b("cinfo", new a<String>(null) { // from class: cn.fly.verify.fi.38
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.ac();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String ah() {
        if (!az.a().d()) {
            return az.a().m();
        }
        String str = null;
        if (dt.a()) {
            return (String) b("odmt", new a<String>(str) { // from class: cn.fly.verify.fi.39
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // cn.fly.verify.fi.a
                public long a(String str2) {
                    return TextUtils.isEmpty(str2) ? -1L : 604800000L;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // cn.fly.verify.fi.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public String b() throws Throwable {
                    return fi.this.f36489e.ad();
                }
            });
        }
        return null;
    }

    @Override // cn.fly.verify.fa
    public String ai() {
        String strAh = fc.a(this.f36488d).d().ah();
        if (!TextUtils.isEmpty(strAh)) {
            try {
                return Base64.encodeToString(ga.a(ga.b(fz.d.k()), strAh), 2);
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return strAh;
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> aj() {
        return (HashMap) b("alldmt", new a<HashMap<String, Object>>(null) { // from class: cn.fly.verify.fi.41
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(HashMap<String, Object> map) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return fi.this.f36489e.ae();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public ApplicationInfo ak() {
        final boolean zA = fk.a("1009", this.f36488d.getPackageName());
        return (ApplicationInfo) b("gtaif", new a<ApplicationInfo>(null) { // from class: cn.fly.verify.fi.42
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(ApplicationInfo applicationInfo) {
                return zA ? 0L : 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ApplicationInfo b() throws Throwable {
                return fe.a(fi.this.f36488d).d();
            }
        }, a(zA, "gtaif", T()));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> al() {
        return (ArrayList) b("gtwflok", new a<ArrayList<HashMap<String, Object>>>(null) { // from class: cn.fly.verify.fi.43
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(ArrayList<HashMap<String, Object>> arrayList) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                Boolean bool;
                if (!dt.d() || !fi.this.e(ei.a("036de6dcdjdkdidcdl.jf!djdfdififididk1e dledfkfdegidgidhgfeegceedhelfcfdfcgi")) || !fi.this.e(ei.a("036de1dcdjdkdidcdl^jfRdjdfdififididk?e?dlfdededgieleldhgfeegceedhelfcfdfcgi"))) {
                    return null;
                }
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                fi.this.f36489e.a((BlockingQueue<Boolean>) linkedBlockingQueue);
                fi.this.f36489e.A();
                try {
                    bool = (Boolean) linkedBlockingQueue.poll(q0.f44202v, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    es.a().a(th2);
                    bool = null;
                }
                if (bool == null || !bool.booleanValue()) {
                    return null;
                }
                return fi.this.f36489e.z();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public long am() {
        return ((Long) b("gtbdt", new a<Long>(0L) { // from class: cn.fly.verify.fi.46
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Long l10) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Long b() throws Throwable {
                return Long.valueOf(fi.this.f36489e.af());
            }
        })).longValue();
    }

    @Override // cn.fly.verify.fa
    public double an() {
        return ((Double) b("gtscnin", new a<Double>(Double.valueOf(0.0d)) { // from class: cn.fly.verify.fi.47
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Double d10) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Double b() throws Throwable {
                return Double.valueOf(fi.this.f36489e.ag());
            }
        })).doubleValue();
    }

    @Override // cn.fly.verify.fa
    public int ao() {
        return ((Integer) b("gtscnppi", new a<Integer>(0) { // from class: cn.fly.verify.fi.48
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Integer num) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(fi.this.f36489e.ah());
            }
        })).intValue();
    }

    @Override // cn.fly.verify.fa
    public boolean ap() {
        return ((Boolean) b("ishmos", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.49
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(fi.this.f36489e.ai());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String aq() {
        return (String) b("gthmosv", new a<String>(null) { // from class: cn.fly.verify.fi.50
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.aj();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String ar() {
        return (String) b("gthmosdtlv", new a<String>(null) { // from class: cn.fly.verify.fi.51
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.ak();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public int as() {
        return ((Integer) b("hmpmst", new a<Integer>(-1) { // from class: cn.fly.verify.fi.53
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Integer num) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(fi.this.f36489e.al());
            }
        })).intValue();
    }

    @Override // cn.fly.verify.fa
    public int at() {
        return ((Integer) b("hmepmst", new a<Integer>(-1) { // from class: cn.fly.verify.fi.54
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Integer num) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(fi.this.f36489e.am());
            }
        })).intValue();
    }

    @Override // cn.fly.verify.fa
    public String au() {
        return (String) b("gtinnerlangmt", new a<String>(null) { // from class: cn.fly.verify.fi.55
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.ao();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public int av() {
        return ((Integer) b("gtgramgendt", new a<Integer>(0) { // from class: cn.fly.verify.fi.57
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Integer num) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(fi.this.f36489e.ap());
            }
        })).intValue();
    }

    @Override // cn.fly.verify.fa
    public boolean aw() {
        return ((Boolean) a("debbing", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.58
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return 60000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(fi.this.f36489e.as());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> ax() {
        return (ArrayList) b("gteacifo", new a<ArrayList<HashMap<String, Object>>>(null) { // from class: cn.fly.verify.fi.60
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(ArrayList<HashMap<String, Object>> arrayList) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                return fi.this.f36489e.ar();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public ResolveInfo b(Intent intent, int i10) {
        return fe.a(this.f36488d).b(intent, i10);
    }

    @Override // cn.fly.verify.fa
    public Object b(boolean z10, int i10, String str, int i11) {
        return b(z10, i10, str, i11, false);
    }

    @Override // cn.fly.verify.fa
    public String b(boolean z10) {
        HashMap<String, Object> mapE = e(z10);
        if (mapE != null) {
            return (String) mapE.get("bsmt");
        }
        return null;
    }

    @Override // cn.fly.verify.fa
    public boolean b() {
        return ((Boolean) b("cx0", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return (bool == null || !bool.booleanValue()) ? 180000L : 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(fi.this.f36489e.H());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public boolean b(String str) {
        return this.f36489e.e(str);
    }

    @Override // cn.fly.verify.fa
    public String c(String str) {
        return this.f36489e.b(str);
    }

    @Override // cn.fly.verify.fa
    public String c(boolean z10) {
        return (String) b("car", new a<String>(null) { // from class: cn.fly.verify.fi.12
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.l();
            }
        }, z10);
    }

    @Override // cn.fly.verify.fa
    public boolean c() {
        return ((Boolean) b("pd0", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.16
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(fi.this.f36489e.I());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String d(String str) {
        return this.f36489e.c(str);
    }

    @Override // cn.fly.verify.fa
    public String d(boolean z10) {
        return (String) b("cne", new a<String>(null) { // from class: cn.fly.verify.fi.23
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.m();
            }
        }, z10);
    }

    @Override // cn.fly.verify.fa
    public boolean d() {
        return ((Boolean) a("dee", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.28
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(fi.this.f36489e.N());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> e(boolean z10) {
        return (HashMap) b("crtwfo", new a<HashMap<String, Object>>(null) { // from class: cn.fly.verify.fi.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(HashMap<String, Object> map) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return fi.this.f36489e.y();
            }
        }, z10);
    }

    @Override // cn.fly.verify.fa
    public boolean e() {
        return this.f36489e.M();
    }

    @Override // cn.fly.verify.fa
    public boolean e(String str) {
        try {
            return this.f36489e.d(str);
        } catch (Throwable th2) {
            es.a().a(th2);
            return false;
        }
    }

    @Override // cn.fly.verify.fa
    public long f(final String str) {
        return ((Long) b("gtlstact-" + str, new a<Long>(-1L) { // from class: cn.fly.verify.fi.62
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Long l10) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Long b() throws Throwable {
                return Long.valueOf(gc.a(str));
            }
        })).longValue();
    }

    @Override // cn.fly.verify.fa
    public String f(boolean z10) {
        return (String) b("nte", new a<String>(null) { // from class: cn.fly.verify.fi.18
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.n();
            }
        }, z10);
    }

    @Override // cn.fly.verify.fa
    public boolean f() {
        return ((Boolean) a("ua0", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.40
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(fi.this.f36489e.L());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String g(boolean z10) {
        return this.f36489e.a(z10);
    }

    @Override // cn.fly.verify.fa
    public boolean g() {
        return ((Boolean) a("dee1", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.52
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(fi.this.f36489e.K());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String h(boolean z10) {
        return (String) b("gtdm", new a<String>(null) { // from class: cn.fly.verify.fi.61
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return eo.a().h();
            }
        }, z10);
    }

    @Override // cn.fly.verify.fa
    public boolean h() {
        return ((Boolean) a("uee", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.63
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(fi.this.f36489e.J());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public boolean i() {
        return ((Boolean) a("wpy", new a<Boolean>(Boolean.FALSE) { // from class: cn.fly.verify.fi.64
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Boolean bool) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(fi.this.f36489e.O());
            }
        })).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String j() {
        return (String) b("agi", new a<String>(null) { // from class: cn.fly.verify.fi.65
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.u();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String k() {
        return (String) b("mvn", new a<String>(null) { // from class: cn.fly.verify.fi.34
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.G();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String l() {
        return (String) b("mol", new a<String>(null) { // from class: cn.fly.verify.fi.45
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.b();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String m() {
        return (String) b("mar", new a<String>(null) { // from class: cn.fly.verify.fi.56
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.c();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String n() {
        return (String) b("brd", new a<String>(null) { // from class: cn.fly.verify.fi.66
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.W();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String o() {
        return (String) b("dte", new a<String>(null) { // from class: cn.fly.verify.fi.67
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.w();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public Object p() {
        return b("gtecloc", new a<Object>(null) { // from class: cn.fly.verify.fi.68
            @Override // cn.fly.verify.fi.a
            protected long a(Object obj) {
                return 180000L;
            }

            @Override // cn.fly.verify.fi.a
            protected Object b() throws Throwable {
                return fi.this.f36489e.an();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> q() {
        return (ArrayList) b("bsnbcl", new a<ArrayList<HashMap<String, Object>>>(null) { // from class: cn.fly.verify.fi.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(ArrayList<HashMap<String, Object>> arrayList) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                return fi.this.f36489e.v();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> r() {
        return e(false);
    }

    @Override // cn.fly.verify.fa
    public int s() {
        return ((Integer) b("ovit", new a<Integer>(-1) { // from class: cn.fly.verify.fi.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(Integer num) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b() throws Throwable {
                return Integer.valueOf(fi.this.f36489e.f());
            }
        })).intValue();
    }

    @Override // cn.fly.verify.fa
    public String t() {
        return (String) b("ovne", new a<String>(null) { // from class: cn.fly.verify.fi.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.g();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String u() {
        return (String) b("ole", new a<String>(null) { // from class: cn.fly.verify.fi.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.h();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String v() {
        return (String) b("ocy", new a<String>(null) { // from class: cn.fly.verify.fi.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return 3600000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.j();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> w() {
        return (HashMap) b("cio0", new a<HashMap<String, Object>>(null) { // from class: cn.fly.verify.fi.9
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(HashMap<String, Object> map) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, Object> b() throws Throwable {
                return fi.this.f36489e.B();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public ArrayList<ArrayList<String>> x() {
        return (ArrayList) b("tdio", new a<ArrayList<ArrayList<String>>>(null) { // from class: cn.fly.verify.fi.10
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(ArrayList<ArrayList<String>> arrayList) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ArrayList<ArrayList<String>> b() throws Throwable {
                return fi.this.f36489e.C();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public String y() {
        return (String) b("qkl", new a<String>(null) { // from class: cn.fly.verify.fi.11
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(String str) {
                return "0".equals(str) ? 86400000L : 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String b() throws Throwable {
                return fi.this.f36489e.D();
            }
        });
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, HashMap<String, Long>> z() {
        return (HashMap) b("siio", new a<HashMap<String, HashMap<String, Long>>>(null) { // from class: cn.fly.verify.fi.13
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            public long a(HashMap<String, HashMap<String, Long>> map) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.fly.verify.fi.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, HashMap<String, Long>> b() throws Throwable {
                return fi.this.f36489e.E();
            }
        });
    }
}
