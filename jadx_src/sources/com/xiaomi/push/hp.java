package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class hp implements ht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f107273a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<hp> f546a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[] f547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f107274b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[] f548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f107275c;

    public hp(String str, String str2, String[] strArr, String[] strArr2) {
        this.f546a = null;
        this.f107273a = str;
        this.f107274b = str2;
        this.f547a = strArr;
        this.f548b = strArr2;
    }

    public hp(String str, String str2, String[] strArr, String[] strArr2, String str3, List<hp> list) {
        this.f107273a = str;
        this.f107274b = str2;
        this.f547a = strArr;
        this.f548b = strArr2;
        this.f107275c = str3;
        this.f546a = list;
    }

    public static hp a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> setKeySet = bundle2.keySet();
        String[] strArr = new String[setKeySet.size()];
        String[] strArr2 = new String[setKeySet.size()];
        int i10 = 0;
        for (String str : setKeySet) {
            strArr[i10] = str;
            strArr2[i10] = bundle2.getString(str);
            i10++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new hp(string, string2, strArr, strArr2, string3, arrayList);
    }

    public static Parcelable[] a(List<hp> list) {
        return a((hp[]) list.toArray(new hp[list.size()]));
    }

    public static Parcelable[] a(hp[] hpVarArr) {
        if (hpVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[hpVarArr.length];
        for (int i10 = 0; i10 < hpVarArr.length; i10++) {
            parcelableArr[i10] = hpVarArr[i10].m452a();
        }
        return parcelableArr;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f107273a);
        bundle.putString("ext_ns", this.f107274b);
        bundle.putString("ext_text", this.f107275c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f547a;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f547a;
                if (i10 >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i10], this.f548b[i10]);
                i10++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<hp> list = this.f546a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", a(this.f546a));
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Parcelable m452a() {
        return a();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m453a() {
        return this.f107273a;
    }

    public String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.f547a == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            String[] strArr = this.f547a;
            if (i10 >= strArr.length) {
                return null;
            }
            if (str.equals(strArr[i10])) {
                return this.f548b[i10];
            }
            i10++;
        }
    }

    public void a(hp hpVar) {
        if (this.f546a == null) {
            this.f546a = new ArrayList();
        }
        if (this.f546a.contains(hpVar)) {
            return;
        }
        this.f546a.add(hpVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m454a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f107275c = str;
        } else {
            this.f107275c = id.a(str);
        }
    }

    public String b() {
        return this.f107274b;
    }

    public String c() {
        return !TextUtils.isEmpty(this.f107275c) ? id.b(this.f107275c) : this.f107275c;
    }

    @Override // com.xiaomi.push.ht
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(this.f107273a);
        if (!TextUtils.isEmpty(this.f107274b)) {
            sb2.append(" ");
            sb2.append("xmlns=");
            sb2.append("\"");
            sb2.append(this.f107274b);
            sb2.append("\"");
        }
        String[] strArr = this.f547a;
        if (strArr != null && strArr.length > 0) {
            for (int i10 = 0; i10 < this.f547a.length; i10++) {
                if (!TextUtils.isEmpty(this.f548b[i10])) {
                    sb2.append(" ");
                    sb2.append(this.f547a[i10]);
                    sb2.append("=\"");
                    sb2.append(id.a(this.f548b[i10]));
                    sb2.append("\"");
                }
            }
        }
        if (TextUtils.isEmpty(this.f107275c)) {
            List<hp> list = this.f546a;
            if (list == null || list.size() <= 0) {
                sb2.append("/>");
            } else {
                sb2.append(">");
                Iterator<hp> it = this.f546a.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next().d());
                }
                sb2.append("</");
                sb2.append(this.f107273a);
                sb2.append(">");
            }
        } else {
            sb2.append(">");
            sb2.append(this.f107275c);
            sb2.append("</");
            sb2.append(this.f107273a);
            sb2.append(">");
        }
        return sb2.toString();
    }

    public String toString() {
        return d();
    }
}
