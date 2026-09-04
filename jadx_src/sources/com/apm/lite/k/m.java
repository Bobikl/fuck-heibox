package com.apm.lite.k;

import com.meituan.robust.Constants;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Writer f40061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f40062b = new ArrayList();

    public enum a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public m(Writer writer) {
        this.f40061a = writer;
    }

    private void f(a aVar) {
        List<a> list = this.f40062b;
        list.set(list.size() - 1, aVar);
    }

    private void g(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            d(jSONArray.get(i10));
        }
        k();
    }

    public static void h(JSONArray jSONArray, Writer writer) throws JSONException, IOException {
        new m(writer).g(jSONArray);
        writer.flush();
    }

    private void i(JSONObject jSONObject) throws JSONException {
        m();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            e(next).d(jSONObject.get(next));
        }
        n();
    }

    public static void j(JSONObject jSONObject, Writer writer) throws JSONException, IOException {
        new m(writer).i(jSONObject);
        writer.flush();
    }

    private void l(String str) throws IOException {
        Writer writer;
        String str2;
        this.f40061a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                writer = this.f40061a;
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"' || cCharAt == '/' || cCharAt == '\\') {
                    this.f40061a.write(92);
                } else {
                    switch (cCharAt) {
                        case '\b':
                            writer = this.f40061a;
                            str2 = "\\b";
                            break;
                        case '\t':
                            writer = this.f40061a;
                            str2 = "\\t";
                            break;
                        case '\n':
                            writer = this.f40061a;
                            str2 = "\\n";
                            break;
                        default:
                            if (cCharAt <= 31) {
                                this.f40061a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                }
                this.f40061a.write(cCharAt);
            } else {
                writer = this.f40061a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.f40061a.write("\"");
    }

    private a o() {
        List<a> list = this.f40062b;
        return list.get(list.size() - 1);
    }

    private void p() throws JSONException, IOException {
        a aVarO = o();
        if (aVarO == a.NONEMPTY_OBJECT) {
            this.f40061a.write(44);
        } else if (aVarO != a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        f(a.DANGLING_KEY);
    }

    private void q() throws JSONException, IOException {
        a aVar;
        if (this.f40062b.isEmpty()) {
            return;
        }
        a aVarO = o();
        if (aVarO == a.EMPTY_ARRAY) {
            aVar = a.NONEMPTY_ARRAY;
        } else if (aVarO == a.NONEMPTY_ARRAY) {
            this.f40061a.write(44);
            return;
        } else if (aVarO != a.DANGLING_KEY) {
            if (aVarO != a.NULL) {
                throw new JSONException("Nesting problem");
            }
            return;
        } else {
            this.f40061a.write(":");
            aVar = a.NONEMPTY_OBJECT;
        }
        f(aVar);
    }

    public m a() {
        return c(a.EMPTY_ARRAY, Constants.ARRAY_TYPE);
    }

    m b(a aVar, a aVar2, String str) throws IOException {
        o();
        List<a> list = this.f40062b;
        list.remove(list.size() - 1);
        this.f40061a.write(str);
        return this;
    }

    m c(a aVar, String str) throws JSONException, IOException {
        q();
        this.f40062b.add(aVar);
        this.f40061a.write(str);
        return this;
    }

    public m d(Object obj) throws JSONException, IOException {
        Writer writer;
        String strNumberToString;
        if (obj instanceof JSONArray) {
            g((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            i((JSONObject) obj);
            return this;
        }
        q();
        if (obj == null || obj == JSONObject.NULL) {
            this.f40061a.write("null");
        } else {
            if (obj instanceof Boolean) {
                writer = this.f40061a;
                strNumberToString = String.valueOf(obj);
            } else if (obj instanceof Number) {
                writer = this.f40061a;
                strNumberToString = JSONObject.numberToString((Number) obj);
            } else {
                l(obj.toString());
            }
            writer.write(strNumberToString);
        }
        return this;
    }

    public m e(String str) throws JSONException, IOException {
        p();
        l(str);
        return this;
    }

    public m k() {
        return b(a.EMPTY_ARRAY, a.NONEMPTY_ARRAY, "]");
    }

    public m m() {
        return c(a.EMPTY_OBJECT, "{");
    }

    public m n() {
        return b(a.EMPTY_OBJECT, a.NONEMPTY_OBJECT, z5.g.f141884d);
    }

    public String toString() {
        return "";
    }
}
