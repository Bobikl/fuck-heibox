package androidx.core.content;

import java.util.ArrayList;

/* JADX INFO: compiled from: MimeTypeFilter.java */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    private n0() {
    }

    @androidx.annotation.p0
    public static String a(@androidx.annotation.p0 String str, @androidx.annotation.n0 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(strArrSplit, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public static String b(@androidx.annotation.p0 String[] strArr, @androidx.annotation.n0 String str) {
        if (strArr == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(@androidx.annotation.p0 String str, @androidx.annotation.n0 String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split("/"), str2.split("/"));
    }

    @androidx.annotation.n0
    public static String[] d(@androidx.annotation.p0 String[] strArr, @androidx.annotation.n0 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean e(@androidx.annotation.n0 String[] strArr, @androidx.annotation.n0 String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if (androidx.webkit.b.f28327e.equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return androidx.webkit.b.f28327e.equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }
}
