package com.alipay.deviceid.module.x;

import com.alipay.deviceid.module.rpc.json.JSONException;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: JSONObject.java */
/* JADX INFO: loaded from: classes6.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f38381b = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f38382a;

    /* JADX INFO: compiled from: JSONObject.java */
    public static final class a {
        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }

        protected final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return "null";
        }
    }

    public z() {
        this.f38382a = new HashMap();
    }

    public z(aa aaVar) throws JSONException {
        this();
        if (aaVar.c() != '{') {
            throw aaVar.a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c10 = aaVar.c();
            if (c10 == 0) {
                throw aaVar.a("A JSONObject text must end with '}'");
            }
            if (c10 == '}') {
                return;
            }
            aaVar.a();
            String string = aaVar.d().toString();
            char c11 = aaVar.c();
            if (c11 == '=') {
                if (aaVar.b() != '>') {
                    aaVar.a();
                }
            } else if (c11 != ':') {
                throw aaVar.a("Expected a ':' after a key");
            }
            Object objD = aaVar.d();
            if (string == null) {
                throw new JSONException("Null key.");
            }
            if (objD != null) {
                b(objD);
                this.f38382a.put(string, objD);
            } else {
                this.f38382a.remove(string);
            }
            char c12 = aaVar.c();
            if (c12 != ',' && c12 != ';') {
                if (c12 != '}') {
                    throw aaVar.a("Expected a ',' or '}'");
                }
                return;
            } else if (aaVar.c() == '}') {
                return;
            } else {
                aaVar.a();
            }
        }
    }

    public z(String str) {
        this(new aa(str));
    }

    public z(Map map) {
        this.f38382a = map == null ? new HashMap() : map;
    }

    static String a(Object obj) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (!(obj instanceof Number)) {
            if ((obj instanceof Boolean) || (obj instanceof z) || (obj instanceof y)) {
                return obj.toString();
            }
            if (obj instanceof Map) {
                return new z((Map) obj).toString();
            }
            if (obj instanceof Collection) {
                return new y((Collection) obj).toString();
            }
            return obj.getClass().isArray() ? new y(obj).toString() : b(obj.toString());
        }
        Number number = (Number) obj;
        b(number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    public static String b(String str) {
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append(kotlin.text.y.f128593b);
        int i10 = 0;
        char c10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                stringBuffer.append("\\f");
            } else if (cCharAt == '\r') {
                stringBuffer.append("\\r");
            } else if (cCharAt == '\"') {
                stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                stringBuffer.append(cCharAt);
            } else if (cCharAt == '/') {
                if (c10 == '<') {
                    stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                }
                stringBuffer.append(cCharAt);
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        stringBuffer.append("\\b");
                        break;
                    case '\t':
                        stringBuffer.append("\\t");
                        break;
                    case '\n':
                        stringBuffer.append("\\n");
                        break;
                    default:
                        if (cCharAt >= ' ' && ((cCharAt < 128 || cCharAt >= 160) && (cCharAt < 8192 || cCharAt >= 8448))) {
                            stringBuffer.append(cCharAt);
                        } else {
                            String str2 = "000" + Integer.toHexString(cCharAt);
                            stringBuffer.append("\\u" + str2.substring(str2.length() - 4));
                        }
                        break;
                }
            } else {
                stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                stringBuffer.append(cCharAt);
            }
            i10++;
            c10 = cCharAt;
        }
        stringBuffer.append(kotlin.text.y.f128593b);
        return stringBuffer.toString();
    }

    private static void b(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                if (d10.isInfinite() || d10.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f10 = (Float) obj;
                if (f10.isInfinite() || f10.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    public final Object a(String str) throws JSONException {
        Object obj = str == null ? null : this.f38382a.get(str);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONObject[" + b(str) + "] not found.");
    }

    public final Iterator a() {
        return this.f38382a.keySet().iterator();
    }

    public String toString() {
        try {
            Iterator itA = a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (itA.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = itA.next();
                stringBuffer.append(b(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(a(this.f38382a.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
