package org.json.alipay.zoloz;

import com.tencent.qcloud.core.util.IOUtils;
import com.uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.y;

/* JADX INFO: loaded from: classes5.dex */
public class JSONObject {
    public static final Object NULL = new Null();
    private Map map;

    public static final class Null {
        private Null() {
        }

        protected final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public String toString() {
            return "null";
        }
    }

    public JSONObject() {
        this.map = new HashMap();
    }

    public JSONObject(Object obj) {
        this();
        populateInternalMap(obj, false);
    }

    public JSONObject(Object obj, boolean z10) {
        this();
        populateInternalMap(obj, z10);
    }

    public JSONObject(Object obj, String[] strArr) {
        this();
        Class<?> cls = obj.getClass();
        for (String str : strArr) {
            try {
                put(str, cls.getField(str).get(obj));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONObject(Map map) {
        this.map = map == null ? new HashMap() : map;
    }

    public JSONObject(Map map, boolean z10) {
        this.map = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                this.map.put(entry.getKey(), new JSONObject(entry.getValue(), z10));
            }
        }
    }

    public JSONObject(JSONObject jSONObject, String[] strArr) throws JSONException {
        this();
        for (String str : strArr) {
            putOpt(str, jSONObject.opt(str));
        }
    }

    public JSONObject(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() != '{') {
            throw jSONTokener.syntaxError("A JSONObject text must begin with '{'");
        }
        while (true) {
            char cNextClean = jSONTokener.nextClean();
            if (cNextClean == 0) {
                throw jSONTokener.syntaxError("A JSONObject text must end with '}'");
            }
            if (cNextClean == '}') {
                return;
            }
            jSONTokener.back();
            String string = jSONTokener.nextValue().toString();
            char cNextClean2 = jSONTokener.nextClean();
            if (cNextClean2 == '=') {
                if (jSONTokener.next() != '>') {
                    jSONTokener.back();
                }
            } else if (cNextClean2 != ':') {
                throw jSONTokener.syntaxError("Expected a ':' after a key");
            }
            put(string, jSONTokener.nextValue());
            char cNextClean3 = jSONTokener.nextClean();
            if (cNextClean3 != ',' && cNextClean3 != ';') {
                if (cNextClean3 != '}') {
                    throw jSONTokener.syntaxError("Expected a ',' or '}'");
                }
                return;
            } else if (jSONTokener.nextClean() == '}') {
                return;
            } else {
                jSONTokener.back();
            }
        }
    }

    public static String doubleToString(double d10) {
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            return "null";
        }
        String string = Double.toString(d10);
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    public static String[] getNames(Object obj) {
        Field[] fields;
        int length;
        if (obj == null || (length = (fields = obj.getClass().getFields()).length) == 0) {
            return null;
        }
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = fields[i10].getName();
        }
        return strArr;
    }

    public static String[] getNames(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length == 0) {
            return null;
        }
        Iterator itKeys = jSONObject.keys();
        String[] strArr = new String[length];
        int i10 = 0;
        while (itKeys.hasNext()) {
            strArr[i10] = (String) itKeys.next();
            i10++;
        }
        return strArr;
    }

    private boolean isStandardProperty(Class cls) {
        return cls.isPrimitive() || cls.isAssignableFrom(Byte.class) || cls.isAssignableFrom(Short.class) || cls.isAssignableFrom(Integer.class) || cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Float.class) || cls.isAssignableFrom(Double.class) || cls.isAssignableFrom(Character.class) || cls.isAssignableFrom(String.class) || cls.isAssignableFrom(Boolean.class);
    }

    public static String numberToString(Number number) throws JSONException {
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        testValidity(number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    private void populateInternalMap(Object obj, boolean z10) {
        Class<?> cls = obj.getClass();
        if (cls.getClassLoader() == null) {
            z10 = false;
        }
        for (Method method : z10 ? cls.getMethods() : cls.getDeclaredMethods()) {
            try {
                String name = method.getName();
                String strSubstring = "";
                if (name.startsWith("get")) {
                    strSubstring = name.substring(3);
                } else if (name.startsWith(ak.f104422ae)) {
                    strSubstring = name.substring(2);
                }
                if (strSubstring.length() > 0 && Character.isUpperCase(strSubstring.charAt(0)) && method.getParameterTypes().length == 0) {
                    if (strSubstring.length() == 1) {
                        strSubstring = strSubstring.toLowerCase();
                    } else if (!Character.isUpperCase(strSubstring.charAt(1))) {
                        strSubstring = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                    }
                    Object objInvoke = method.invoke(obj, null);
                    if (objInvoke == null) {
                        this.map.put(strSubstring, NULL);
                    } else if (objInvoke.getClass().isArray()) {
                        this.map.put(strSubstring, new JSONArray(objInvoke, z10));
                    } else if (objInvoke instanceof Collection) {
                        this.map.put(strSubstring, new JSONArray((Collection) objInvoke, z10));
                    } else if (objInvoke instanceof Map) {
                        this.map.put(strSubstring, new JSONObject((Map) objInvoke, z10));
                    } else if (isStandardProperty(objInvoke.getClass())) {
                        this.map.put(strSubstring, objInvoke);
                    } else if (objInvoke.getClass().getPackage().getName().startsWith(LogType.JAVA_TYPE) || objInvoke.getClass().getClassLoader() == null) {
                        this.map.put(strSubstring, objInvoke.toString());
                    } else {
                        this.map.put(strSubstring, new JSONObject(objInvoke, z10));
                    }
                }
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    public static String quote(String str) {
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append(y.f128593b);
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
        stringBuffer.append(y.f128593b);
        return stringBuffer.toString();
    }

    static void testValidity(Object obj) throws JSONException {
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

    static String valueToString(Object obj) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (obj instanceof Number) {
            return numberToString((Number) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString();
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj).toString();
        }
        return obj.getClass().isArray() ? new JSONArray(obj).toString() : quote(obj.toString());
    }

    static String valueToString(Object obj, int i10, int i11) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (obj instanceof Number) {
            return numberToString((Number) obj);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).toString(i10, i11);
        }
        if (obj instanceof JSONArray) {
            return ((JSONArray) obj).toString(i10, i11);
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString(i10, i11);
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj).toString(i10, i11);
        }
        return obj.getClass().isArray() ? new JSONArray(obj).toString(i10, i11) : quote(obj.toString());
    }

    public JSONObject accumulate(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object objOpt = opt(str);
        if (objOpt == null) {
            if (obj instanceof JSONArray) {
                obj = new JSONArray().put(obj);
            }
            put(str, obj);
        } else if (objOpt instanceof JSONArray) {
            ((JSONArray) objOpt).put(obj);
        } else {
            put(str, new JSONArray().put(objOpt).put(obj));
        }
        return this;
    }

    public JSONObject append(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object objOpt = opt(str);
        if (objOpt == null) {
            put(str, new JSONArray().put(obj));
        } else {
            if (!(objOpt instanceof JSONArray)) {
                throw new JSONException("JSONObject[" + str + "] is not a JSONArray.");
            }
            put(str, ((JSONArray) objOpt).put(obj));
        }
        return this;
    }

    public Object get(String str) throws JSONException {
        Object objOpt = opt(str);
        if (objOpt != null) {
            return objOpt;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] not found.");
    }

    public boolean getBoolean(String str) throws JSONException {
        Object obj = get(str);
        if (obj.equals(Boolean.FALSE)) {
            return false;
        }
        boolean z10 = obj instanceof String;
        if (z10 && ((String) obj).equalsIgnoreCase("false")) {
            return false;
        }
        if (obj.equals(Boolean.TRUE)) {
            return true;
        }
        if (z10 && ((String) obj).equalsIgnoreCase("true")) {
            return true;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a Boolean.");
    }

    public double getDouble(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? ((Number) obj).doubleValue() : Double.valueOf((String) obj).doubleValue();
        } catch (Exception unused) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not a number.");
        }
    }

    public int getInt(String str) throws JSONException {
        Object obj = get(str);
        return obj instanceof Number ? ((Number) obj).intValue() : (int) getDouble(str);
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a JSONArray.");
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a JSONObject.");
    }

    public long getLong(String str) throws JSONException {
        Object obj = get(str);
        return obj instanceof Number ? ((Number) obj).longValue() : (long) getDouble(str);
    }

    public String getString(String str) throws JSONException {
        return get(str).toString();
    }

    public boolean has(String str) {
        return this.map.containsKey(str);
    }

    public boolean isNull(String str) {
        return NULL.equals(opt(str));
    }

    public Iterator keys() {
        return this.map.keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public JSONArray names() {
        JSONArray jSONArray = new JSONArray();
        Iterator itKeys = keys();
        while (itKeys.hasNext()) {
            jSONArray.put(itKeys.next());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }

    public Object opt(String str) {
        if (str == null) {
            return null;
        }
        return this.map.get(str);
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public boolean optBoolean(String str, boolean z10) {
        try {
            return getBoolean(str);
        } catch (Exception unused) {
            return z10;
        }
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public double optDouble(String str, double d10) {
        try {
            Object objOpt = opt(str);
            return objOpt instanceof Number ? ((Number) objOpt).doubleValue() : new Double((String) objOpt).doubleValue();
        } catch (Exception unused) {
            return d10;
        }
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public int optInt(String str, int i10) {
        try {
            return getInt(str);
        } catch (Exception unused) {
            return i10;
        }
    }

    public JSONArray optJSONArray(String str) {
        Object objOpt = opt(str);
        if (objOpt instanceof JSONArray) {
            return (JSONArray) objOpt;
        }
        return null;
    }

    public JSONObject optJSONObject(String str) {
        Object objOpt = opt(str);
        if (objOpt instanceof JSONObject) {
            return (JSONObject) objOpt;
        }
        return null;
    }

    public long optLong(String str) {
        return optLong(str, 0L);
    }

    public long optLong(String str, long j10) {
        try {
            return getLong(str);
        } catch (Exception unused) {
            return j10;
        }
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public String optString(String str, String str2) {
        Object objOpt = opt(str);
        return objOpt != null ? objOpt.toString() : str2;
    }

    public JSONObject put(String str, double d10) throws JSONException {
        put(str, new Double(d10));
        return this;
    }

    public JSONObject put(String str, int i10) throws JSONException {
        put(str, new Integer(i10));
        return this;
    }

    public JSONObject put(String str, long j10) throws JSONException {
        put(str, new Long(j10));
        return this;
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (obj != null) {
            testValidity(obj);
            this.map.put(str, obj);
        } else {
            remove(str);
        }
        return this;
    }

    public JSONObject put(String str, Collection collection) throws JSONException {
        put(str, new JSONArray(collection));
        return this;
    }

    public JSONObject put(String str, Map map) throws JSONException {
        put(str, new JSONObject(map));
        return this;
    }

    public JSONObject put(String str, boolean z10) throws JSONException {
        put(str, z10 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JSONObject putOpt(String str, Object obj) throws JSONException {
        if (str != null && obj != null) {
            put(str, obj);
        }
        return this;
    }

    public Object remove(String str) {
        return this.map.remove(str);
    }

    public Iterator sortedKeys() {
        return new TreeSet(this.map.keySet()).iterator();
    }

    public JSONArray toJSONArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONArray2.put(opt(jSONArray.getString(i10)));
        }
        return jSONArray2;
    }

    public String toString() {
        try {
            Iterator itKeys = keys();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (itKeys.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = itKeys.next();
                stringBuffer.append(quote(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(valueToString(this.map.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString(int i10) throws JSONException {
        return toString(i10, 0);
    }

    String toString(int i10, int i11) throws JSONException {
        int i12;
        int length = length();
        if (length == 0) {
            return "{}";
        }
        Iterator itSortedKeys = sortedKeys();
        StringBuffer stringBuffer = new StringBuffer("{");
        int i13 = i11 + i10;
        if (length == 1) {
            Object next = itSortedKeys.next();
            stringBuffer.append(quote(next.toString()));
            stringBuffer.append(": ");
            stringBuffer.append(valueToString(this.map.get(next), i10, i11));
        } else {
            while (true) {
                i12 = 0;
                if (!itSortedKeys.hasNext()) {
                    break;
                }
                Object next2 = itSortedKeys.next();
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(",\n");
                } else {
                    stringBuffer.append('\n');
                }
                while (i12 < i13) {
                    stringBuffer.append(' ');
                    i12++;
                }
                stringBuffer.append(quote(next2.toString()));
                stringBuffer.append(": ");
                stringBuffer.append(valueToString(this.map.get(next2), i10, i13));
            }
            if (stringBuffer.length() > 1) {
                stringBuffer.append('\n');
                while (i12 < i11) {
                    stringBuffer.append(' ');
                    i12++;
                }
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public Writer write(Writer writer) throws JSONException {
        boolean z10 = false;
        try {
            Iterator itKeys = keys();
            writer.write(123);
            while (itKeys.hasNext()) {
                if (z10) {
                    writer.write(44);
                }
                Object next = itKeys.next();
                writer.write(quote(next.toString()));
                writer.write(58);
                Object obj = this.map.get(next);
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).write(writer);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).write(writer);
                } else {
                    writer.write(valueToString(obj));
                }
                z10 = true;
            }
            writer.write(125);
            return writer;
        } catch (IOException e10) {
            throw new JSONException(e10);
        }
    }
}
