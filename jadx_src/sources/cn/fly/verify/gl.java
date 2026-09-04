package cn.fly.verify;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36779a = eh.b("005:fbccccdkLi");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile gf f36781c;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static File f36797c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f36798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HashMap<String, Object> f36799b = new HashMap<>();

        public a(Context context, String str) {
            if (context != null) {
                try {
                    File file = new File(a(context), str);
                    this.f36798a = file;
                    if (!file.getParentFile().exists()) {
                        this.f36798a.getParentFile().mkdirs();
                    }
                    if (!this.f36798a.exists()) {
                        this.f36798a.createNewFile();
                    }
                } catch (Throwable th2) {
                    es.a().a(th2);
                    return;
                }
            }
            b();
        }

        private static synchronized File a(Context context) {
            if (f36797c == null) {
                f36797c = new File(context.getFilesDir(), gl.f36779a);
            }
            return f36797c;
        }

        public static synchronized boolean a(Context context, String str) {
            return new File(a(context), str).exists();
        }

        private void b() {
            InputStreamReader inputStreamReader;
            BufferedReader bufferedReader;
            Throwable th2;
            FileInputStream fileInputStream;
            synchronized (this.f36799b) {
                File file = this.f36798a;
                if (file != null && file.exists()) {
                    try {
                        fileInputStream = new FileInputStream(this.f36798a);
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        if (sb2.length() > 0) {
                                            sb2.append("\n");
                                        }
                                        sb2.append(line);
                                    }
                                    this.f36799b = ge.a(sb2.toString());
                                    el.a(bufferedReader, inputStreamReader, fileInputStream);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    try {
                                        es.a().b(th2);
                                        el.a(bufferedReader, inputStreamReader, fileInputStream);
                                    } catch (Throwable th4) {
                                        el.a(bufferedReader, inputStreamReader, fileInputStream);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                bufferedReader = null;
                                th2 = th5;
                            }
                        } catch (Throwable th6) {
                            bufferedReader = null;
                            th2 = th6;
                            inputStreamReader = null;
                        }
                    } catch (Throwable th7) {
                        inputStreamReader = null;
                        bufferedReader = null;
                        th2 = th7;
                        fileInputStream = null;
                    }
                }
            }
        }

        public HashMap<String, Object> a() {
            HashMap<String, Object> map;
            synchronized (this.f36799b) {
                map = new HashMap<>();
                map.putAll(this.f36799b);
            }
            return map;
        }
    }

    public gl(Context context) {
        if (context != null) {
            this.f36780b = context.getApplicationContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th2;
        ObjectInputStream objectInputStream;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    el.a(objectInputStream, byteArrayInputStream);
                    return object;
                } catch (Throwable th3) {
                    th2 = th3;
                    el.a(objectInputStream, byteArrayInputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                objectInputStream = null;
            }
        } catch (Throwable th5) {
            byteArrayInputStream = null;
            th2 = th5;
            objectInputStream = null;
        }
    }

    public static boolean a(Context context, String str, int i10) {
        return a.a(context, str + lg.a.f131412e + i10);
    }

    public static boolean b(Context context, String str, int i10) {
        return gf.a(context, str + lg.a.f131412e + i10);
    }

    private void l(String str) {
        HashMap<String, Object> mapA;
        if (c("k_m_sp_cpt_dn") || !a.a(this.f36780b, str)) {
            return;
        }
        es.a().a("[MPF][" + str + "]Compat acquire", new Object[0]);
        a aVar = new a(this.f36780b, str);
        if (this.f36781c != null) {
            mapA = aVar.a();
            if (mapA != null && !mapA.isEmpty()) {
                a(mapA);
            }
            a("k_m_sp_cpt_dn", Boolean.TRUE);
        } else {
            mapA = null;
        }
        fn fnVarA = es.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[MPF][");
        sb2.append(str);
        sb2.append("]Compat done, mv: ");
        sb2.append(mapA != null ? Integer.valueOf(mapA.size()) : null);
        fnVarA.a(sb2.toString(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        try {
            return Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str);
        } catch (Throwable th2) {
            es.a().a(th2);
            return false;
        }
    }

    public double a(String str, double d10) throws gf.b {
        if (this.f36781c != null) {
            try {
                Double d11 = (Double) this.f36781c.a(new gf.g(str));
                return d11 == null ? d10 : d11.doubleValue();
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return d10;
    }

    public long a(String str, long j10) {
        try {
            return b(str, j10);
        } catch (gf.b unused) {
            return j10;
        }
    }

    public <T extends Parcelable> T a(String str, Class<T> cls) throws gf.b {
        return (T) a(str, cls, (Object) null);
    }

    public <T> T a(String str, Class<T> cls, final T t10) throws gf.b {
        if (this.f36781c != null) {
            try {
                T t11 = (T) this.f36781c.a(new gf.g<T>(str) { // from class: cn.fly.verify.gl.2
                    @Override // cn.fly.verify.gf.g
                    public T a(Object obj) {
                        return obj != null ? (T) gf.d.a((HashMap<Byte, Object>) obj).a((Parcelable) t10) : (T) t10;
                    }
                });
                return t11 != null ? t11 : t10;
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return t10;
    }

    public String a(String str) {
        return b(str, "");
    }

    public <T extends Parcelable> List<T> a(String str, Class<T> cls, final List<T> list) throws gf.b {
        if (this.f36781c != null) {
            try {
                List<T> list2 = (List) this.f36781c.a((gf.g) new gf.g<List<T>>(str) { // from class: cn.fly.verify.gl.6
                    @Override // cn.fly.verify.gf.g
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public List<T> a(Object obj) {
                        if (obj == null) {
                            return list;
                        }
                        List list3 = (List) obj;
                        ArrayList linkedList = (!(list3 instanceof ArrayList) && (list3 instanceof LinkedList)) ? new LinkedList() : new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            linkedList.add(gf.d.a((HashMap<Byte, Object>) it.next()).a((Parcelable) null));
                        }
                        return linkedList;
                    }
                });
                return list2 != null ? list2 : list;
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return list;
    }

    public <T extends Parcelable> Map<String, T> a(String str, Class<T> cls, final Map<String, T> map) throws gf.b {
        if (this.f36781c != null) {
            try {
                Map<String, T> map2 = (Map) this.f36781c.a((gf.g) new gf.g<Map<String, T>>(str) { // from class: cn.fly.verify.gl.4
                    @Override // cn.fly.verify.gf.g
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Map<String, T> a(Object obj) {
                        HashMap treeMap;
                        if (obj == null) {
                            return map;
                        }
                        Map map3 = (Map) obj;
                        if (map3 instanceof HashMap) {
                            treeMap = new HashMap();
                        } else if (map3 instanceof Hashtable) {
                            treeMap = new Hashtable();
                        } else {
                            treeMap = map3 instanceof TreeMap ? new TreeMap() : new HashMap();
                        }
                        for (Map.Entry entry : map3.entrySet()) {
                            treeMap.put(entry.getKey(), gf.d.a((HashMap<Byte, Object>) entry.getValue()).a((Parcelable) null));
                        }
                        return (Map<String, T>) treeMap;
                    }
                });
                return map2 != null ? map2 : map;
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return map;
    }

    public void a(String str, int i10) {
        a(str, i10, (String) null);
    }

    public void a(String str, int i10, String str2) {
        String str3 = str + lg.a.f131412e + i10;
        this.f36781c = new gf(this.f36780b, str3, str2);
        l(str3);
    }

    public void a(String str, Parcelable parcelable) {
        a(str, parcelable, 0L);
    }

    public void a(String str, Parcelable parcelable, long j10) {
        if (this.f36781c != null) {
            try {
                this.f36781c.a(new gf.l(str, parcelable, j10) { // from class: cn.fly.verify.gl.1
                    @Override // cn.fly.verify.gf.l
                    public Object c() {
                        Object objB = b();
                        if (objB != null) {
                            return new gf.d((Parcelable) objB).a();
                        }
                        return null;
                    }
                });
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
    }

    public void a(String str, Boolean bool) {
        a(str, bool, 0L);
    }

    public void a(String str, Boolean bool, long j10) {
        if (this.f36781c == null || bool == null) {
            return;
        }
        try {
            this.f36781c.a(new gf.l(str, Byte.valueOf((byte) (bool.booleanValue() ? 1 : 0)), j10));
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    public void a(String str, Double d10) {
        a(str, d10, 0L);
    }

    public void a(String str, Double d10, long j10) {
        if (this.f36781c == null || d10 == null) {
            return;
        }
        try {
            this.f36781c.a(new gf.l(str, d10, j10));
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    public void a(String str, Integer num) {
        a(str, num, 0L);
    }

    public void a(String str, Integer num, long j10) {
        if (this.f36781c == null || num == null) {
            return;
        }
        try {
            this.f36781c.a(new gf.l(str, num, j10));
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    public void a(String str, Long l10) {
        a(str, l10, 0L);
    }

    public void a(String str, Long l10, long j10) {
        if (this.f36781c == null || l10 == null) {
            return;
        }
        try {
            this.f36781c.a(new gf.l(str, l10, j10));
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    public void a(String str, Object obj) {
        a(str, obj, 0L);
    }

    public void a(String str, Object obj, long j10) {
        if (this.f36781c != null) {
            try {
                this.f36781c.a(new gf.l(str, obj, j10));
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
    }

    public void a(String str, String str2) {
        a(str, str2, 0L);
    }

    public void a(String str, String str2, long j10) {
        if (this.f36781c != null) {
            try {
                this.f36781c.a(new gf.l(str, str2, j10));
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
    }

    public <T extends Parcelable> void a(String str, List<T> list) {
        a(str, (List) list, 0L);
    }

    public <T extends Parcelable> void a(String str, List<T> list, long j10) {
        if (this.f36781c == null || list == null || list.isEmpty()) {
            return;
        }
        this.f36781c.a(new gf.l(str, list, j10) { // from class: cn.fly.verify.gl.5
            @Override // cn.fly.verify.gf.l
            public Object c() {
                Object objB = b();
                if (objB == null) {
                    return null;
                }
                List linkedList = (!(objB instanceof ArrayList) && (objB instanceof LinkedList)) ? new LinkedList() : new ArrayList();
                Iterator it = ((List) objB).iterator();
                while (it.hasNext()) {
                    linkedList.add(new gf.d((Parcelable) it.next()).a());
                }
                return linkedList;
            }
        });
    }

    public <T extends Parcelable> void a(String str, Map<String, T> map) {
        a(str, (Map) map, 0L);
    }

    public <T extends Parcelable> void a(String str, Map<String, T> map, long j10) {
        if (this.f36781c == null || map == null || map.isEmpty()) {
            return;
        }
        try {
            this.f36781c.a(new gf.l(str, map, j10) { // from class: cn.fly.verify.gl.3
                @Override // cn.fly.verify.gf.l
                public Object c() {
                    Map treeMap;
                    Object objB = b();
                    if (objB == null) {
                        return null;
                    }
                    if (objB instanceof HashMap) {
                        treeMap = new HashMap();
                    } else if (objB instanceof Hashtable) {
                        treeMap = new Hashtable();
                    } else {
                        treeMap = objB instanceof TreeMap ? new TreeMap() : new HashMap();
                    }
                    for (Map.Entry entry : ((Map) objB).entrySet()) {
                        treeMap.put(entry.getKey(), new gf.d((Parcelable) entry.getValue()).a());
                    }
                    return treeMap;
                }
            });
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    public <T extends Parcelable> void a(String str, T[] tArr) {
        a(str, (Parcelable[]) tArr, 0L);
    }

    public <T extends Parcelable> void a(String str, T[] tArr, long j10) {
        if (this.f36781c == null || tArr == null || tArr.length <= 0) {
            return;
        }
        try {
            this.f36781c.a(new gf.l(str, tArr, j10) { // from class: cn.fly.verify.gl.7
                @Override // cn.fly.verify.gf.l
                public Object c() {
                    Object objB = b();
                    if (objB == null) {
                        return null;
                    }
                    Parcelable[] parcelableArr = (Parcelable[]) objB;
                    int length = parcelableArr.length;
                    HashMap[] mapArr = new HashMap[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        mapArr[i10] = new gf.d(parcelableArr[i10]).a();
                    }
                    return mapArr;
                }
            });
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    @Deprecated
    public void a(HashMap<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public boolean a(String str, boolean z10) {
        try {
            return b(str, z10);
        } catch (gf.b unused) {
            return z10;
        }
    }

    public <T extends Parcelable> T[] a(String str, final Class<T> cls, final T[] tArr) throws gf.b {
        if (this.f36781c != null) {
            try {
                T[] tArr2 = (T[]) ((Parcelable[]) this.f36781c.a((gf.g) new gf.g<T[]>(str) { // from class: cn.fly.verify.gl.8
                    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Object;)[TT; */
                    @Override // cn.fly.verify.gf.g
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Parcelable[] a(Object obj) {
                        if (obj == null) {
                            return tArr;
                        }
                        HashMap[] mapArr = (HashMap[]) obj;
                        Parcelable[] parcelableArr = (Parcelable[]) Array.newInstance((Class<?>) cls, mapArr.length);
                        for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                            parcelableArr[i10] = gf.d.a((HashMap<Byte, Object>) mapArr[i10]).a((Parcelable) null);
                        }
                        return parcelableArr;
                    }
                }));
                return tArr2 != null ? tArr2 : tArr;
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return tArr;
    }

    public int b(String str, int i10) {
        try {
            return c(str, i10);
        } catch (gf.b unused) {
            return i10;
        }
    }

    public long b(String str, long j10) throws gf.b {
        if (this.f36781c != null) {
            try {
                Long l10 = (Long) this.f36781c.a(new gf.g(str));
                return l10 == null ? j10 : l10.longValue();
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return j10;
    }

    public Object b(String str, Object obj) {
        try {
            return c(str, obj);
        } catch (gf.b unused) {
            return obj;
        }
    }

    public String b(String str) throws gf.b {
        return c(str, "");
    }

    public String b(String str, String str2) {
        try {
            return c(str, str2);
        } catch (gf.b unused) {
            return str2;
        }
    }

    public <T extends Parcelable> Map<String, T> b(String str, Class<T> cls) throws gf.b {
        return a(str, (Class) cls, (Map) null);
    }

    public boolean b(String str, boolean z10) throws gf.b {
        if (this.f36781c != null) {
            try {
                Object objA = this.f36781c.a((gf.g<Object>) new gf.g(str));
                if (objA == null) {
                    return z10;
                }
                if (objA instanceof Boolean) {
                    return ((Boolean) objA).booleanValue();
                }
                return ((Number) objA).byteValue() == 1;
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return z10;
    }

    public int c(String str, int i10) throws gf.b {
        if (this.f36781c != null) {
            try {
                Integer num = (Integer) this.f36781c.a(new gf.g(str));
                return num == null ? i10 : num.intValue();
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return i10;
    }

    public Object c(String str, final Object obj) throws gf.b {
        if (this.f36781c != null) {
            try {
                Object objA = this.f36781c.a(new gf.g<Object>(str) { // from class: cn.fly.verify.gl.9
                    @Override // cn.fly.verify.gf.g
                    public Object a(Object obj2) {
                        if (obj2 == null) {
                            return obj;
                        }
                        if (!(obj2 instanceof String) || !gl.this.m((String) obj2)) {
                            return obj2;
                        }
                        try {
                            return gl.this.a(Base64.decode((String) obj2, 2));
                        } catch (Throwable th2) {
                            es.a().a("Expected exc: " + th2.getMessage(), new Object[0]);
                            return obj2;
                        }
                    }
                });
                if (objA == null) {
                    return obj;
                }
                if (!(objA instanceof String) || !m((String) objA)) {
                    return objA;
                }
                try {
                    return a(Base64.decode((String) objA, 2));
                } catch (Throwable th2) {
                    es.a().a("Expected exc: " + th2.getMessage(), new Object[0]);
                    return objA;
                }
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th3) {
                es.a().a(th3);
            }
        }
        return obj;
    }

    public String c(String str, String str2) throws gf.b {
        if (this.f36781c != null) {
            try {
                String str3 = (String) this.f36781c.a(new gf.g(str));
                return TextUtils.isEmpty(str3) ? str2 : str3;
            } catch (gf.b e10) {
                throw e10;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return str2;
    }

    public <T extends Parcelable> List<T> c(String str, Class<T> cls) throws gf.b {
        return a(str, (Class) cls, (List) null);
    }

    public boolean c(String str) {
        return a(str, false);
    }

    public boolean d(String str) throws gf.b {
        return b(str, false);
    }

    public <T extends Parcelable> T[] d(String str, Class<T> cls) throws gf.b {
        return (T[]) a(str, (Class) cls, (Parcelable[]) null);
    }

    public long e(String str) {
        return a(str, 0L);
    }

    public long f(String str) throws gf.b {
        return b(str, 0L);
    }

    public int g(String str) {
        return b(str, 0);
    }

    public double h(String str) throws gf.b {
        return a(str, 0.0d);
    }

    public Object i(String str) {
        return b(str, (Object) null);
    }

    public Object j(String str) throws gf.b {
        return c(str, (Object) null);
    }

    public void k(String str) {
        if (this.f36781c != null) {
            try {
                this.f36781c.a(str);
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
    }
}
