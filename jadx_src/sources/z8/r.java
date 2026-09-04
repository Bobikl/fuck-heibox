package z8;

import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@d0
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f141952a = Pattern.compile("\\\\.");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f141953b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private r() {
    }

    @v8.a
    public static boolean a(@p0 Object obj, @p0 Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    com.google.android.gms.common.internal.p.l(next);
                    if (!a(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException unused) {
                }
            }
            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                if (!a(jSONArray.get(i10), jSONArray2.get(i10))) {
                    return false;
                }
            } catch (JSONException unused2) {
            }
        }
        return true;
    }

    @v8.a
    @p0
    public static String b(@p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f141953b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char cCharAt = matcher.group().charAt(0);
            if (cCharAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (cCharAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (cCharAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (cCharAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @n0
    @v8.a
    public static String c(@n0 String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strA = h0.a(str);
        Matcher matcher = f141952a.matcher(strA);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char cCharAt = matcher.group().charAt(1);
            if (cCharAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\"");
            } else if (cCharAt == '/') {
                matcher.appendReplacement(stringBuffer, "/");
            } else if (cCharAt == '\\') {
                matcher.appendReplacement(stringBuffer, "\\\\");
            } else if (cCharAt == 'b') {
                matcher.appendReplacement(stringBuffer, "\b");
            } else if (cCharAt == 'f') {
                matcher.appendReplacement(stringBuffer, "\f");
            } else if (cCharAt == 'n') {
                matcher.appendReplacement(stringBuffer, "\n");
            } else if (cCharAt == 'r') {
                matcher.appendReplacement(stringBuffer, "\r");
            } else {
                if (cCharAt != 't') {
                    throw new IllegalStateException("Found an escaped character that should never be.");
                }
                matcher.appendReplacement(stringBuffer, "\t");
            }
        }
        if (stringBuffer == null) {
            return strA;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
