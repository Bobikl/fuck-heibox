package s;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import j.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashMap<String, Integer> f139139d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f139140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f139141f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f139143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Integer> f139144c;

    static {
        String[] strArr = k.a.f124360a;
        HashMap<String, Integer> map = f139139d;
        f139140e = new a("0", strArr, map);
        f139141f = new a("0", strArr, map);
    }

    public a(int i10, String str, String[] strArr, Map<String, Integer> map) {
        i10 = 2 != i10 ? 1 : i10;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("clientIp".concat(" can not be empty"));
        }
        if (b.a.q(strArr)) {
            throw new IllegalArgumentException("ips".concat(" can not be empty"));
        }
        String[] strArrA = a(i10, strArr);
        if (map.isEmpty()) {
            throw new IllegalArgumentException(RemoteMessageConst.TTL.concat(" is invalid"));
        }
        this.f139142a = str;
        this.f139143b = strArrA;
        this.f139144c = map;
    }

    public a(String str, String[] strArr, Map<String, Integer> map) {
        this.f139142a = str;
        this.f139143b = strArr;
        this.f139144c = map;
    }

    public a(String str, String[] strArr, String[] strArr2, Map<String, Integer> map) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("clientIp".concat(" can not be empty"));
        }
        if (b.a.q(strArr) && b.a.q(strArr2)) {
            throw new IllegalArgumentException("ips".concat(" can not be empty"));
        }
        String[] strArrA = a(1, strArr);
        String[] strArrA2 = a(2, strArr2);
        if (map.isEmpty()) {
            throw new IllegalArgumentException(RemoteMessageConst.TTL.concat(" is invalid"));
        }
        int length = strArrA.length;
        int length2 = strArrA2.length;
        String[] strArr3 = (String[]) Arrays.copyOf(strArrA, length + length2);
        System.arraycopy(strArrA2, 0, strArr3, length, length2);
        this.f139142a = str;
        this.f139143b = strArr3;
        this.f139144c = map;
    }

    public static String[] a(int i10, String[] strArr) {
        int length = strArr.length;
        int i11 = length;
        for (int i12 = 0; i12 < length; i12++) {
            String str = strArr[i12];
            if (2 == i10) {
                if (!c.b(str)) {
                    strArr[i12] = "0";
                    i11--;
                }
            } else if (!c.a(str)) {
                strArr[i12] = "0";
                i11--;
            }
        }
        if (i11 == length) {
            return strArr;
        }
        if (i11 <= 0) {
            return k.a.f124360a;
        }
        String[] strArr2 = new String[i11];
        int i13 = i11 - 1;
        for (int i14 = length - 1; i14 >= 0 && i13 >= 0; i14--) {
            String str2 = strArr[i14];
            if (!"0".equals(str2)) {
                strArr2[i13] = str2;
                i13--;
            }
        }
        return strArr2;
    }
}
