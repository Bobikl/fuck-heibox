package cn.fly.verify;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes6.dex */
public class eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f36277a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile String f36278b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile String f36279c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile String f36280d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile bb f36281e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f36282f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f36283g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile boolean f36284h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile boolean f36285i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile String f36286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static AtomicBoolean f36287k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f36288l = b("009Bgbcjeedkekhbckce1h");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f36289m = b("011Rdk9gc8ci^e;dkekhbckceVh");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f36290n = b("010 gbcjeefkcfeh8g1ckce3h");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f36291o = b("012Ldk*eb[fj,e:cichdedbckce*h");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f36292p = b("009CdkgbdkdkekhbckceNh");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f36293q = b("010)gbcjeeedchSdRdgckce+h");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static HashMap<String, HashMap<String, Object>> f36294r = new HashMap<>();

    public static <T> T a(String str) {
        try {
            Bundle bundle = fc.a(ax.g()).d().a(ax.g().getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            T t10 = (T) bundle.get(str);
            if (b("009UgbcjeegjejZhhi]eh").equals(str) && t10 != null && (t10 instanceof String)) {
                return (T) Boolean.valueOf(b("0030db@eTeh").equalsIgnoreCase(String.valueOf(t10)));
            }
            if (t10 != null) {
                return t10;
            }
            return null;
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(String str, Class<T> cls, bd bdVar) {
        Object obj;
        GZIPInputStream gZIPInputStream;
        HashMap<String, Object> map;
        ObjectInputStream objectInputStream;
        Class cls2;
        T tCast;
        T t10 = null;
        try {
            String strA = a(bdVar);
            if (f36294r.containsKey(strA)) {
                map = f36294r.get(strA);
                gZIPInputStream = null;
                objectInputStream = null;
            } else {
                try {
                    gZIPInputStream = new GZIPInputStream(ax.g().getResources().getAssets().open(strA));
                    try {
                        objectInputStream = new ObjectInputStream(gZIPInputStream);
                        try {
                            HashMap<String, Object> map2 = (HashMap) objectInputStream.readObject();
                            if (map2 != null) {
                                try {
                                    if (!map2.isEmpty()) {
                                        f36294r.put(strA, map2);
                                    }
                                } catch (Throwable unused) {
                                    map = map2;
                                    try {
                                        es.a().a("No ast file", new Object[0]);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = null;
                                        t10 = (T) objectInputStream;
                                        try {
                                            es.a().a(th);
                                            el.a(t10, gZIPInputStream);
                                            return (T) obj;
                                        } catch (Throwable th3) {
                                            el.a(t10, gZIPInputStream);
                                            throw th3;
                                        }
                                    }
                                }
                            }
                            map = map2;
                        } catch (Throwable unused2) {
                            map = null;
                        }
                    } catch (Throwable unused3) {
                        map = null;
                        objectInputStream = null;
                    }
                } catch (Throwable unused4) {
                    map = null;
                    gZIPInputStream = null;
                    objectInputStream = null;
                }
            }
            if (map != null && !map.isEmpty()) {
                obj = map.get(str);
                if (b("009,gbcjeegjejUhhiBeh").equals(str) && obj != null && (obj instanceof String)) {
                    t10 = (T) Boolean.valueOf(b("003:db.eGeh").equalsIgnoreCase(String.valueOf(obj)) || b("004h5cicfMe").equalsIgnoreCase(String.valueOf(obj)));
                } else if (obj != null) {
                    if (cls == null) {
                        t10 = (T) obj;
                    } else if (cls != Void.class) {
                        try {
                            if (cls == Boolean.TYPE) {
                                if (obj instanceof String) {
                                    tCast = (T) Boolean.valueOf((String) obj);
                                } else {
                                    cls2 = Boolean.class;
                                    tCast = (T) cls2.cast(obj);
                                }
                            } else if (cls == Integer.TYPE) {
                                if (obj instanceof String) {
                                    tCast = (T) Integer.valueOf((String) obj);
                                } else {
                                    cls2 = Integer.class;
                                    tCast = (T) cls2.cast(obj);
                                }
                            } else if (cls != Byte.TYPE) {
                                cls2 = Character.TYPE;
                                if (cls == cls2) {
                                    if (!(obj instanceof String)) {
                                        cls2 = Character.class;
                                    }
                                } else if (cls == Short.TYPE) {
                                    if (obj instanceof String) {
                                        tCast = (T) Short.valueOf((String) obj);
                                    } else {
                                        cls2 = Short.class;
                                    }
                                } else if (cls == Long.TYPE) {
                                    if (obj instanceof String) {
                                        tCast = (T) Long.valueOf((String) obj);
                                    } else {
                                        cls2 = Long.class;
                                    }
                                } else if (cls == Float.TYPE) {
                                    if (obj instanceof String) {
                                        tCast = (T) Float.valueOf((String) obj);
                                    } else {
                                        cls2 = Float.class;
                                    }
                                } else if (cls != Double.TYPE) {
                                    tCast = cls.cast(obj);
                                } else if (obj instanceof String) {
                                    tCast = (T) Double.valueOf((String) obj);
                                } else {
                                    cls2 = Double.class;
                                }
                                tCast = (T) cls2.cast(obj);
                            } else if (obj instanceof String) {
                                tCast = (T) Byte.valueOf((String) obj);
                            } else {
                                cls2 = Byte.class;
                                tCast = (T) cls2.cast(obj);
                            }
                            t10 = tCast;
                        } catch (Throwable th4) {
                            try {
                                es.a().a(th4);
                                t10 = (T) obj;
                            } catch (Throwable th5) {
                                th = th5;
                                t10 = (T) objectInputStream;
                                es.a().a(th);
                                el.a(t10, gZIPInputStream);
                                return (T) obj;
                            }
                        }
                    }
                }
            }
            el.a(objectInputStream, gZIPInputStream);
            return t10;
        } catch (Throwable th6) {
            th = th6;
            obj = null;
            gZIPInputStream = null;
        }
    }

    private static String a(bd bdVar) {
        String str;
        String str2 = f36288l;
        if (bdVar == null) {
            return str2;
        }
        try {
            String strA = bdVar.a();
            if (b("008Mdkejecfifhdkekhb").equals(strA)) {
                str = f36289m;
            } else if (b("006%dkgbdkdkekhb").equals(strA)) {
                str = f36292p;
            } else if (b("007*gbfgeieddddfhb").equals(strA)) {
                str = f36293q;
            } else if (b("007 gbfgeifkdjdkej").equals(strA)) {
                str = f36290n;
            } else {
                if (!b("0097dkfhdcfjfhfiddfbhk").equals(strA)) {
                    return str2;
                }
                str = f36291o;
            }
            return str;
        } catch (Throwable th2) {
            es.a().a(th2);
            return str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:29:0x008e, B:31:0x009c), top: B:40:0x008e, outer: #1 }] */
    public static void a(Context context) {
        String str;
        try {
            if (f36287k.compareAndSet(false, true)) {
                try {
                    try {
                        if (f36277a == null) {
                            String strK = (String) bc.a(null, b("013b@cfeh%h$cjcegjec?ii$hbXe+db"), String.class, null);
                            if (TextUtils.isEmpty(strK)) {
                                strK = bv.a().k();
                                if (TextUtils.isEmpty(strK)) {
                                    strK = en.i();
                                }
                                if (!TextUtils.isEmpty(strK)) {
                                    f36279c = strK;
                                }
                                str = (String) bc.a(null, b("006^ekcjce9c$ch,d"), String.class, null);
                                if (str != null) {
                                    f36281e = bb.a(str);
                                }
                                f36286j = (String) bc.a(null, b("015JgbcjeegjfgcbfjchcccjecViiHddcb"), String.class, null);
                                f36282f = true;
                                String strB = b("006Lgbcjeegjfjgg");
                                Class cls = Boolean.TYPE;
                                Boolean bool = Boolean.FALSE;
                                f36283g = ((Boolean) bc.a(null, strB, cls, bool)).booleanValue();
                                f36284h = ((Boolean) bc.a(null, b("0081gbcjeegj=efUcjdi"), cls, Boolean.TRUE)).booleanValue();
                                f36285i = ((Boolean) bc.a(null, b("007Tgbcjeegjhcfkfk"), cls, bool)).booleanValue();
                            }
                            f36277a = strK;
                            f36279c = strK;
                            bv.a().e(strK);
                        }
                        if (f36278b == null) {
                            String str2 = (String) bc.a(null, b("016bAcfehChJcjcegjec0ii?dk5eb7ci*eh"), String.class, null);
                            if (TextUtils.isEmpty(str2)) {
                                str2 = (String) bc.a(null, b("012Ggbcjeegjec.iiUdkZe:ci0eh"), String.class, null);
                            }
                            if (TextUtils.isEmpty(str2)) {
                                String strL = bv.a().l();
                                if (!TextUtils.isEmpty(strL)) {
                                    f36280d = strL;
                                }
                            } else {
                                f36278b = str2;
                                f36280d = str2;
                                bv.a().f(str2);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    str = (String) bc.a(null, b("006^ekcjce9c$ch,d"), String.class, null);
                    if (str != null) {
                        f36281e = bb.a(str);
                    }
                } catch (Throwable unused2) {
                    f36281e = bb.DEFAULT;
                }
                f36286j = (String) bc.a(null, b("015JgbcjeegjfgcbfjchcccjecViiHddcb"), String.class, null);
                f36282f = true;
                String strB2 = b("006Lgbcjeegjfjgg");
                Class cls2 = Boolean.TYPE;
                Boolean bool2 = Boolean.FALSE;
                f36283g = ((Boolean) bc.a(null, strB2, cls2, bool2)).booleanValue();
                f36284h = ((Boolean) bc.a(null, b("0081gbcjeegj=efUcjdi"), cls2, Boolean.TRUE)).booleanValue();
                f36285i = ((Boolean) bc.a(null, b("007Tgbcjeegjhcfkfk"), cls2, bool2)).booleanValue();
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    public static String b(String str) {
        return el.a(str, 98);
    }
}
