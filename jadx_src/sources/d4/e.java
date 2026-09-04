package d4;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f108139a = 20;

    public static <T> String a(T[] tArr) {
        if (tArr == null || tArr.length <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("[size=" + tArr.length + ": ");
        for (T t10 : tArr) {
            if (t10 != null) {
                sb2.append(t10.toString());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        int iLastIndexOf = sb2.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (-1 != iLastIndexOf) {
            sb2.deleteCharAt(iLastIndexOf);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static <T> String b(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("[size=" + collection.size() + ": ");
        for (T t10 : collection) {
            if (t10 != null) {
                sb2.append(t10.toString());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        int iLastIndexOf = sb2.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (-1 != iLastIndexOf) {
            sb2.deleteCharAt(iLastIndexOf);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static String c(byte[] bArr) {
        if (bArr == null || bArr.length <= 20) {
            return Arrays.toString(bArr);
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append('[');
        sb2.append((int) bArr[0]);
        for (int i10 = 1; i10 < 20; i10++) {
            sb2.append(", ");
            sb2.append((int) bArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static String d(int[] iArr) {
        if (iArr == null || iArr.length <= 20) {
            return Arrays.toString(iArr);
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append('[');
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < 20; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static String e(short[] sArr) {
        if (sArr == null || sArr.length <= 20) {
            return Arrays.toString(sArr);
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append('[');
        sb2.append((int) sArr[0]);
        for (int i10 = 1; i10 < 20; i10++) {
            sb2.append(", ");
            sb2.append((int) sArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static int f(String str, int i10) {
        if (g(str)) {
            return 0;
        }
        String str2 = "";
        for (int i11 = 0; i11 < str.length() && str2.length() < i10; i11++) {
            char cCharAt = str.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                str2 = str2 + cCharAt;
            }
        }
        if (g(str2)) {
            return 0;
        }
        return Integer.parseInt(str2);
    }

    public static boolean g(String str) {
        return str == null || "".equals(str.trim());
    }

    public static <T> String h(Collection<T> collection, String str) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (T t10 : collection) {
            if (t10 != null) {
                sb2.append(t10.toString());
                sb2.append(str);
            }
        }
        int iLastIndexOf = sb2.lastIndexOf(str);
        if (-1 != iLastIndexOf) {
            sb2.delete(iLastIndexOf, sb2.length());
        }
        return sb2.toString();
    }

    public static <T> String i(T[] tArr, String str) {
        if (tArr == null || tArr.length <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (T t10 : tArr) {
            if (t10 != null) {
                sb2.append(t10.toString());
                sb2.append(str);
            }
        }
        int iLastIndexOf = sb2.lastIndexOf(str);
        if (-1 != iLastIndexOf) {
            sb2.delete(iLastIndexOf, sb2.length());
        }
        return sb2.toString();
    }

    public static <K, V> String j(Map<K, V> map) {
        return (map == null || map.isEmpty()) ? "" : b(map.entrySet());
    }
}
