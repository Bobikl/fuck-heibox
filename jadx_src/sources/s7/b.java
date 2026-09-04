package s7;

import com.elvishew.xlog.internal.c;

/* JADX INFO: compiled from: DefaultBorderFormatter.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char f139329a = 9553;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f139330b = "╔═══════════════════════════════════════════════════════════════════════════════════════════════════";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f139331c = "╟───────────────────────────────────────────────────────────────────────────────────────────────────";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f139332d = "╚═══════════════════════════════════════════════════════════════════════════════════════════════════";

    private static String b(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 10);
        String[] strArrSplit = str.split(c.f42912a);
        int length = strArrSplit.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(c.f42912a);
            }
            String str2 = strArrSplit[i10];
            sb2.append(f139329a);
            sb2.append(str2);
        }
        return sb2.toString();
    }

    @Override // r7.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i10 = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i10] = str;
                i10++;
            }
        }
        if (i10 == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f139330b);
        sb2.append(c.f42912a);
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(b(strArr2[i11]));
            if (i11 != i10 - 1) {
                sb2.append(c.f42912a);
                sb2.append(f139331c);
                sb2.append(c.f42912a);
            } else {
                sb2.append(c.f42912a);
                sb2.append(f139332d);
            }
        }
        return sb2.toString();
    }
}
