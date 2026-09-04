package z8;

import androidx.annotation.n0;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f141949a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f141950b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f141951c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private p() {
    }

    @n0
    @v8.a
    public static Map<String, String> a(@n0 URI uri, @n0 String str) {
        Map<String, String> mapEmptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            mapEmptyMap = new HashMap<>();
            com.google.android.gms.internal.common.e0 e0VarC = com.google.android.gms.internal.common.e0.c(com.google.android.gms.internal.common.v.b(n5.a.f132013h));
            Iterator it = com.google.android.gms.internal.common.e0.c(com.google.android.gms.internal.common.v.b(kotlin.text.y.f128595d)).b().d(rawQuery).iterator();
            while (it.hasNext()) {
                List listF = e0VarC.f((String) it.next());
                if (listF.isEmpty() || listF.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                mapEmptyMap.put(b((String) listF.get(0), str), listF.size() == 2 ? b((String) listF.get(1), str) : null);
            }
        }
        return mapEmptyMap;
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
