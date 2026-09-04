package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hs {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final DateFormat f552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f107295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f107296c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f554a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private hw f555a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<hp> f556a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Map<String, Object> f557a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f107297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f107298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f107299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f107300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f107301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f107302i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f107294a = Locale.getDefault().getLanguage().toLowerCase();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String f553b = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f552a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f107296c = id.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        f107295b = 0L;
    }

    public hs() {
        this.f107297d = f553b;
        this.f107298e = null;
        this.f107299f = null;
        this.f107300g = null;
        this.f107301h = null;
        this.f107302i = null;
        this.f556a = new CopyOnWriteArrayList();
        this.f557a = new HashMap();
        this.f555a = null;
    }

    public hs(Bundle bundle) {
        this.f107297d = f553b;
        this.f107298e = null;
        this.f107299f = null;
        this.f107300g = null;
        this.f107301h = null;
        this.f107302i = null;
        this.f556a = new CopyOnWriteArrayList();
        this.f557a = new HashMap();
        this.f555a = null;
        this.f107299f = bundle.getString("ext_to");
        this.f107300g = bundle.getString("ext_from");
        this.f107301h = bundle.getString("ext_chid");
        this.f107298e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f556a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                hp hpVarA = hp.a((Bundle) parcelable);
                if (hpVarA != null) {
                    this.f556a.add(hpVarA);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f555a = new hw(bundle2);
        }
    }

    public static synchronized String i() {
        StringBuilder sb2;
        sb2 = new StringBuilder();
        sb2.append(f107296c);
        long j10 = f107295b;
        f107295b = 1 + j10;
        sb2.append(Long.toString(j10));
        return sb2.toString();
    }

    public static String q() {
        return f107294a;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f107297d)) {
            bundle.putString("ext_ns", this.f107297d);
        }
        if (!TextUtils.isEmpty(this.f107300g)) {
            bundle.putString("ext_from", this.f107300g);
        }
        if (!TextUtils.isEmpty(this.f107299f)) {
            bundle.putString("ext_to", this.f107299f);
        }
        if (!TextUtils.isEmpty(this.f107298e)) {
            bundle.putString("ext_pkt_id", this.f107298e);
        }
        if (!TextUtils.isEmpty(this.f107301h)) {
            bundle.putString("ext_chid", this.f107301h);
        }
        hw hwVar = this.f555a;
        if (hwVar != null) {
            bundle.putBundle("ext_ERROR", hwVar.a());
        }
        List<hp> list = this.f556a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i10 = 0;
            Iterator<hp> it = this.f556a.iterator();
            while (it.hasNext()) {
                Bundle bundleA = it.next().a();
                if (bundleA != null) {
                    bundleArr[i10] = bundleA;
                    i10++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public hp a(String str) {
        return a(str, null);
    }

    public hp a(String str, String str2) {
        for (hp hpVar : this.f556a) {
            if (str2 == null || str2.equals(hpVar.b())) {
                if (str.equals(hpVar.m453a())) {
                    return hpVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public hw m457a() {
        return this.f555a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized Object m458a(String str) {
        Map<String, Object> map = this.f557a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo456a();

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized Collection<hp> m459a() {
        if (this.f556a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f556a));
    }

    public void a(hp hpVar) {
        this.f556a.add(hpVar);
    }

    public void a(hw hwVar) {
        this.f555a = hwVar;
    }

    public synchronized Collection<String> b() {
        if (this.f557a == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f557a.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hs hsVar = (hs) obj;
        hw hwVar = this.f555a;
        if (hwVar == null ? hsVar.f555a != null : !hwVar.equals(hsVar.f555a)) {
            return false;
        }
        String str = this.f107300g;
        if (str == null ? hsVar.f107300g != null : !str.equals(hsVar.f107300g)) {
            return false;
        }
        if (!this.f556a.equals(hsVar.f556a)) {
            return false;
        }
        String str2 = this.f107298e;
        if (str2 == null ? hsVar.f107298e != null : !str2.equals(hsVar.f107298e)) {
            return false;
        }
        String str3 = this.f107301h;
        if (str3 == null ? hsVar.f107301h != null : !str3.equals(hsVar.f107301h)) {
            return false;
        }
        Map<String, Object> map = this.f557a;
        if (map == null ? hsVar.f557a != null : !map.equals(hsVar.f557a)) {
            return false;
        }
        String str4 = this.f107299f;
        if (str4 == null ? hsVar.f107299f != null : !str4.equals(hsVar.f107299f)) {
            return false;
        }
        String str5 = this.f107297d;
        String str6 = hsVar.f107297d;
        if (str5 != null) {
            if (str5.equals(str6)) {
                return true;
            }
        } else if (str6 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f107297d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f107298e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f107299f;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f107300g;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f107301h;
        int iHashCode5 = (((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f556a.hashCode()) * 31) + this.f557a.hashCode()) * 31;
        hw hwVar = this.f555a;
        return iHashCode5 + (hwVar != null ? hwVar.hashCode() : 0);
    }

    public String j() {
        if ("ID_NOT_AVAILABLE".equals(this.f107298e)) {
            return null;
        }
        if (this.f107298e == null) {
            this.f107298e = i();
        }
        return this.f107298e;
    }

    public String k() {
        return this.f107301h;
    }

    public void k(String str) {
        this.f107298e = str;
    }

    public String l() {
        return this.f107299f;
    }

    public void l(String str) {
        this.f107301h = str;
    }

    public String m() {
        return this.f107300g;
    }

    public void m(String str) {
        this.f107299f = str;
    }

    public String n() {
        return this.f107302i;
    }

    public void n(String str) {
        this.f107300g = str;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    protected synchronized String o() {
        StringBuilder sb2;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        Exception e10;
        sb2 = new StringBuilder();
        Iterator<hp> it = m459a().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().d());
        }
        Map<String, Object> map = this.f557a;
        if (map != null && !map.isEmpty()) {
            sb2.append(bm.b("PHByb3BlcnRpZXMgeG1sbnM9Imh0dHA6Ly93d3cuaml2ZXNvZnR3YXJlLmNvbS94bWxucy94bXBwL3Byb3BlcnRpZXMiPg=="));
            for (String str : b()) {
                Object objM458a = m458a(str);
                sb2.append("<property>");
                sb2.append("<name>");
                sb2.append(id.a(str));
                sb2.append("</name>");
                sb2.append("<value type=\"");
                if (objM458a instanceof Integer) {
                    sb2.append("integer\">");
                    sb2.append(objM458a);
                    sb2.append("</value>");
                } else if (objM458a instanceof Long) {
                    sb2.append("long\">");
                    sb2.append(objM458a);
                    sb2.append("</value>");
                } else if (objM458a instanceof Float) {
                    sb2.append("float\">");
                    sb2.append(objM458a);
                    sb2.append("</value>");
                } else if (objM458a instanceof Double) {
                    sb2.append("double\">");
                    sb2.append(objM458a);
                    sb2.append("</value>");
                } else if (objM458a instanceof Boolean) {
                    sb2.append("boolean\">");
                    sb2.append(objM458a);
                    sb2.append("</value>");
                } else if (objM458a instanceof String) {
                    sb2.append("string\">");
                    sb2.append(id.a((String) objM458a));
                    sb2.append("</value>");
                } else {
                    ObjectOutputStream objectOutputStream2 = null;
                    try {
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    try {
                                        objectOutputStream.writeObject(objM458a);
                                        sb2.append("java-object\">");
                                        sb2.append(id.a(byteArrayOutputStream.toByteArray()));
                                        sb2.append("</value>");
                                        try {
                                            objectOutputStream.close();
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception e11) {
                                        e10 = e11;
                                        e10.printStackTrace();
                                        if (objectOutputStream != null) {
                                            try {
                                                objectOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        if (byteArrayOutputStream != null) {
                                        }
                                        sb2.append("</property>");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectOutputStream2 = objectOutputStream;
                                    if (objectOutputStream2 != null) {
                                        try {
                                            objectOutputStream2.close();
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                objectOutputStream = null;
                                e10 = e;
                                e10.printStackTrace();
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                sb2.append("</property>");
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            byteArrayOutputStream = null;
                            objectOutputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                        }
                        byteArrayOutputStream.close();
                    } catch (Exception unused5) {
                    }
                }
                sb2.append("</property>");
            }
            sb2.append("</properties>");
        }
        return sb2.toString();
    }

    public void o(String str) {
        this.f107302i = str;
    }

    public String p() {
        return this.f107297d;
    }
}
