package com.tencent.thumbplayer.tcmedia.tplayer.a.b;

import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1025a(a = "flowid")
    private String f102805a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1025a(a = TPDownloadProxyEnum.USER_GUID)
    private String f102806b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC1025a(a = "seq")
    private int f102807c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC1025a(a = "platformtype")
    private int f102808d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC1025a(a = "devtype")
    private int f102809e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC1025a(a = "networktype")
    private int f102810f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC1025a(a = "devicename")
    private String f102811g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @InterfaceC1025a(a = "osver")
    private String f102812h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InterfaceC1025a(a = "appname")
    private String f102813i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InterfaceC1025a(a = "appver")
    private String f102814j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InterfaceC1025a(a = "playerver")
    private String f102815k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InterfaceC1025a(a = "reportprotocolver")
    private String f102816l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InterfaceC1025a(a = "durationms")
    private long f102817m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InterfaceC1025a(a = "hlssourcetype")
    private int f102818n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @InterfaceC1025a(a = "playertype")
    private int f102819o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @InterfaceC1025a(a = "urlprotocol")
    private int f102820p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @InterfaceC1025a(a = "containerformat")
    private String f102821q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @InterfaceC1025a(a = "videoencodefmt")
    private int f102822r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @InterfaceC1025a(a = "audioencodefmt")
    private int f102823s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @InterfaceC1025a(a = "subtitleencodefmt")
    private int f102824t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @InterfaceC1025a(a = "streambitratekbps")
    private long f102825u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @InterfaceC1025a(a = "videoframerate")
    private float f102826v = -1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @InterfaceC1025a(a = "url")
    private String f102827w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @InterfaceC1025a(a = "resolution")
    private String f102828x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @InterfaceC1025a(a = "datatransportver")
    private String f102829y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @InterfaceC1025a(a = "speedkbps")
    private int f102830z = -1;

    @InterfaceC1025a(a = "usedatatransport")
    private int A = -1;

    @InterfaceC1025a(a = "datatransportprotocolver")
    private String B = "";

    @InterfaceC1025a(a = "cdnuip")
    private String C = "";

    @InterfaceC1025a(a = "cdnip")
    private String D = "";

    @InterfaceC1025a(a = "platform")
    private int E = -1;

    @InterfaceC1025a(a = "playerconfig")
    private String F = "";

    @InterfaceC1025a(a = "drmability")
    private int G = -1;
    private Map<String, String> H = null;
    private Map<String, String> I = null;
    private Map<String, String> J = null;
    private Map<String, String> K = null;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.b.a$a, reason: collision with other inner class name */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1025a {
        String a() default "";
    }

    private String a(Field field) {
        try {
            field.setAccessible(true);
            if (field.getType() == Integer.TYPE) {
                return String.valueOf(field.getInt(this));
            }
            if (field.getType() == Long.TYPE) {
                return String.valueOf(field.getLong(this));
            }
            if (field.getType() == Float.TYPE) {
                return String.valueOf(field.getFloat(this));
            }
            if (field.getType() == Boolean.TYPE) {
                return String.valueOf(field.getBoolean(this));
            }
            if (field.getType() == String.class) {
                return (String) field.get(this);
            }
            TPLogUtil.e(getClass().getName(), "getFieldValue field:" + field.getName() + " is not match.");
            return "-1";
        } catch (Exception e10) {
            TPLogUtil.e(getClass().getName(), e10);
        }
    }

    private Map<String, String> a(Field[] fieldArr) {
        HashMap map = new HashMap();
        for (Field field : fieldArr) {
            InterfaceC1025a interfaceC1025a = (InterfaceC1025a) field.getAnnotation(InterfaceC1025a.class);
            if (interfaceC1025a != null) {
                map.put(interfaceC1025a.a(), a(field));
            }
        }
        return map;
    }

    private static void a(Map<String, String> map, Map<String, String> map2) {
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    private void c() {
        Map<String, String> map;
        Map<String, String> map2 = this.H;
        if (map2 == null || (map = this.J) == null) {
            return;
        }
        a(map2, map);
    }

    private void d() {
        Map<String, String> map;
        Map<String, String> map2 = this.I;
        if (map2 == null || (map = this.K) == null) {
            return;
        }
        a(map2, map);
    }

    public String a() {
        return this.f102805a;
    }

    public void a(float f10) {
        this.f102826v = f10;
    }

    public void a(int i10) {
        this.f102807c = i10;
    }

    public void a(long j10) {
        this.f102817m = j10;
    }

    public void a(a aVar) {
        this.f102805a = aVar.f102805a;
        this.f102806b = aVar.f102806b;
        this.f102807c = aVar.f102807c;
        this.f102808d = aVar.f102808d;
        this.f102809e = aVar.f102809e;
        this.f102810f = aVar.f102810f;
        this.f102811g = aVar.f102811g;
        this.f102812h = aVar.f102812h;
        this.f102813i = aVar.f102813i;
        this.f102815k = aVar.f102815k;
        this.f102814j = aVar.f102814j;
        this.f102816l = aVar.f102816l;
        this.f102817m = aVar.f102817m;
        this.f102818n = aVar.f102818n;
        this.f102819o = aVar.f102819o;
        this.f102820p = aVar.f102820p;
        this.f102821q = aVar.f102821q;
        this.f102822r = aVar.f102822r;
        this.f102823s = aVar.f102823s;
        this.f102824t = aVar.f102824t;
        this.f102825u = aVar.f102825u;
        this.f102826v = aVar.f102826v;
        this.f102827w = aVar.f102827w;
        this.f102828x = aVar.f102828x;
        this.f102829y = aVar.f102829y;
        this.f102830z = aVar.f102830z;
        this.A = aVar.A;
        this.C = aVar.C;
        this.D = aVar.D;
        this.B = aVar.B;
        this.E = aVar.E;
        this.F = aVar.F;
        this.H = aVar.H;
        this.I = aVar.I;
        this.J = aVar.J;
        this.K = aVar.K;
        this.G = aVar.G;
    }

    public void a(String str) {
        this.f102805a = str;
    }

    public void a(Map<String, String> map) {
        this.H = map;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        Class<? super Object> superclass = getClass().getSuperclass();
        if (superclass != null) {
            map.putAll(a(superclass.getDeclaredFields()));
        }
        map.putAll(a(getClass().getDeclaredFields()));
        c();
        d();
        Map<String, String> map2 = this.H;
        if (map2 != null) {
            map.putAll(map2);
        }
        Map<String, String> map3 = this.J;
        if (map3 != null) {
            map.putAll(map3);
        }
        Map<String, String> map4 = this.I;
        if (map4 != null) {
            map.putAll(map4);
        }
        Map<String, String> map5 = this.K;
        if (map5 != null) {
            map.putAll(map5);
        }
        return map;
    }

    public void b(int i10) {
        this.f102808d = i10;
    }

    public void b(long j10) {
        this.f102825u = j10;
    }

    public void b(String str) {
        this.f102806b = str;
    }

    public void b(Map<String, String> map) {
        this.I = map;
    }

    public void c(int i10) {
        this.f102809e = i10;
    }

    public void c(String str) {
        this.f102811g = str;
    }

    public void c(Map<String, String> map) {
        this.J = map;
    }

    public void d(int i10) {
        this.f102810f = i10;
    }

    public void d(String str) {
        this.f102812h = str;
    }

    public void d(Map<String, String> map) {
        this.K = map;
    }

    public void e(int i10) {
        this.f102818n = i10;
    }

    public void e(String str) {
        this.f102813i = str;
    }

    public void f(int i10) {
        this.f102819o = i10;
    }

    public void f(String str) {
        this.f102815k = str;
    }

    public void g(int i10) {
        this.f102820p = i10;
    }

    public void g(String str) {
        this.f102814j = str;
    }

    public void h(int i10) {
        this.f102822r = i10;
    }

    public void h(String str) {
        this.f102816l = str;
    }

    public void i(int i10) {
        this.f102823s = i10;
    }

    public void i(String str) {
        this.f102821q = str;
    }

    public void j(int i10) {
        this.f102824t = i10;
    }

    public void j(String str) {
        this.f102827w = str;
    }

    public void k(int i10) {
        this.f102830z = i10;
    }

    public void k(String str) {
        this.f102828x = str;
    }

    public void l(int i10) {
        this.A = i10;
    }

    public void l(String str) {
        this.f102829y = str;
    }

    public void m(int i10) {
        this.E = i10;
    }

    public void m(String str) {
        this.C = str;
    }

    public void n(int i10) {
        this.G = i10;
    }

    public void n(String str) {
        this.D = str;
    }

    public void o(String str) {
        this.B = str;
    }

    public void p(String str) {
        this.F = str;
    }
}
