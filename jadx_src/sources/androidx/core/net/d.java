package androidx.core.net;

import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.util.o;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.y;

/* JADX INFO: compiled from: MailTo.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20938b = "mailto:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20939c = "mailto";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20940d = "to";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20941e = "body";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f20942f = "cc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f20943g = "bcc";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f20944h = "subject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, String> f20945a = new HashMap<>();

    private d() {
    }

    public static boolean g(@p0 Uri uri) {
        return uri != null && f20939c.equals(uri.getScheme());
    }

    public static boolean h(@p0 String str) {
        return str != null && str.startsWith(f20938b);
    }

    @n0
    public static d i(@n0 Uri uri) throws ParseException {
        return j(uri.toString());
    }

    @n0
    public static d j(@n0 String str) throws ParseException {
        String strDecode;
        String strSubstring;
        o.l(str);
        if (!h(str)) {
            throw new ParseException("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        d dVar = new d();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                if (strArrSplit.length != 0) {
                    dVar.f20945a.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String strF = dVar.f();
        if (strF != null) {
            strDecode = strDecode + ", " + strF;
        }
        dVar.f20945a.put("to", strDecode);
        return dVar;
    }

    @p0
    public String a() {
        return this.f20945a.get(f20943g);
    }

    @p0
    public String b() {
        return this.f20945a.get("body");
    }

    @p0
    public String c() {
        return this.f20945a.get(f20942f);
    }

    @p0
    public Map<String, String> d() {
        return this.f20945a;
    }

    @p0
    public String e() {
        return this.f20945a.get(f20944h);
    }

    @p0
    public String f() {
        return this.f20945a.get("to");
    }

    @n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder(f20938b);
        sb2.append('?');
        for (Map.Entry<String, String> entry : this.f20945a.entrySet()) {
            sb2.append(Uri.encode(entry.getKey()));
            sb2.append(n5.a.f132013h);
            sb2.append(Uri.encode(entry.getValue()));
            sb2.append(y.f128595d);
        }
        return sb2.toString();
    }
}
