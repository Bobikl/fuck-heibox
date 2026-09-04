package s;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ResponseParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f139145a = Pattern.compile("(.*),(.*)\\|(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f139146b = Pattern.compile("(.*)\\.:(.*),(.*)\\|(.*)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f139147c = Pattern.compile("(.*),(.*)-(.*),(.*)\\|(.*)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f139148d = Pattern.compile("(.*)\\.:(.*),(.*)-(.*),(.*)\\|(.*)");

    public static a a(int i10, String str) {
        String[] strArr;
        String str2;
        a aVar;
        if (TextUtils.isEmpty(str)) {
            return a.f139140e;
        }
        String[] strArrSplit = str.split("\n");
        String str3 = Constants.ACCEPT_TIME_SEPARATOR_SP;
        String str4 = "";
        int i11 = 2;
        int i12 = 1;
        if (i10 != 3) {
            HashMap map = new HashMap();
            if (strArrSplit.length <= 1) {
                Matcher matcher = f139145a.matcher(str);
                if (!matcher.matches() || 3 != matcher.groupCount()) {
                    return a.f139140e;
                }
                try {
                    String strGroup = matcher.group(3);
                    String[] strArrSplit2 = matcher.group(1).split(";");
                    map.put("onehost", Integer.valueOf(Integer.parseInt(matcher.group(2))));
                    return new a(i10, strGroup, strArrSplit2, map);
                } catch (Exception e10) {
                    f.b.a(5, e10, "Parse external response failed", new Object[0]);
                    return a.f139140e;
                }
            }
            ArrayList arrayList = new ArrayList();
            int length = strArrSplit.length;
            String str5 = "";
            int i13 = 0;
            while (i13 < length) {
                Matcher matcher2 = f139146b.matcher(strArrSplit[i13]);
                if (matcher2.matches() && 4 == matcher2.groupCount()) {
                    try {
                        String strGroup2 = matcher2.group(1);
                        String str6 = matcher2.group(4) + str3;
                        String[] strArrSplit3 = matcher2.group(2).split(";");
                        int length2 = strArrSplit3.length;
                        int i14 = 0;
                        while (i14 < length2) {
                            arrayList.add(strGroup2 + ":" + strArrSplit3[i14]);
                            i14++;
                            strArrSplit = strArrSplit;
                            str3 = str3;
                        }
                        strArr = strArrSplit;
                        str2 = str3;
                        map.put(strGroup2, Integer.valueOf(Integer.parseInt(matcher2.group(3))));
                        str5 = str6;
                    } catch (Exception e11) {
                        f.b.a(5, e11, "Parse external response failed", new Object[0]);
                        return a.f139140e;
                    }
                } else {
                    strArr = strArrSplit;
                    str2 = str3;
                }
                i13++;
                strArrSplit = strArr;
                str3 = str2;
            }
            return arrayList.size() == 0 ? a.f139140e : new a(i10, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), map);
        }
        HashMap map2 = new HashMap();
        if (strArrSplit.length <= 1) {
            try {
                Matcher matcher3 = f139147c.matcher(strArrSplit[0]);
                if (matcher3.matches() && 5 == matcher3.groupCount()) {
                    String strGroup3 = matcher3.group(5);
                    String[] strArrSplit4 = matcher3.group(1).split(";");
                    String[] strArrSplit5 = matcher3.group(3).split(";");
                    map2.put("onehost", Integer.valueOf(Math.min(Integer.parseInt(matcher3.group(2)), Integer.parseInt(matcher3.group(4)))));
                    aVar = new a(strGroup3, strArrSplit4, strArrSplit5, map2);
                } else {
                    aVar = a.f139140e;
                }
                return aVar;
            } catch (Exception unused) {
                return a.f139140e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length3 = strArrSplit.length;
        int i15 = 0;
        while (i15 < length3) {
            Matcher matcher4 = f139148d.matcher(strArrSplit[i15]);
            if (matcher4.matches() && 6 == matcher4.groupCount()) {
                try {
                    String strGroup4 = matcher4.group(i12);
                    String str7 = matcher4.group(6) + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    String[] strArrSplit6 = matcher4.group(i11).split(";");
                    String[] strArrSplit7 = matcher4.group(4).split(";");
                    map2.put(strGroup4, Integer.valueOf(Math.min(Integer.parseInt(matcher4.group(3)), Integer.parseInt(matcher4.group(5)))));
                    int i16 = 0;
                    for (int length4 = strArrSplit6.length; i16 < length4; length4 = length4) {
                        arrayList2.add(strGroup4 + ":" + strArrSplit6[i16]);
                        i16++;
                    }
                    for (String str8 : strArrSplit7) {
                        arrayList3.add(strGroup4 + ":" + str8);
                    }
                    str4 = str7;
                } catch (Exception e12) {
                    f.b.a(5, e12, "Parse external response failed", new Object[0]);
                    return a.f139140e;
                }
            }
            i15++;
            i11 = 2;
            i12 = 1;
        }
        return (arrayList2.size() == 0 && arrayList3.size() == 0) ? a.f139140e : new a(str4, (String[]) arrayList2.toArray(new String[arrayList2.size()]), (String[]) arrayList3.toArray(new String[arrayList3.size()]), map2);
    }
}
