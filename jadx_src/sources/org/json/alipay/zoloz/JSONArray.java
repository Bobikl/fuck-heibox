package org.json.alipay.zoloz;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import okhttp3.t;

/* JADX INFO: loaded from: classes5.dex */
public class JSONArray {
    private ArrayList myArrayList;

    public JSONArray() {
        this.myArrayList = new ArrayList();
    }

    public JSONArray(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            put(Array.get(obj, i10));
        }
    }

    public JSONArray(Object obj, boolean z10) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            put(new JSONObject(Array.get(obj, i10), z10));
        }
    }

    public JSONArray(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONArray(Collection collection) {
        this.myArrayList = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public JSONArray(Collection collection, boolean z10) {
        this.myArrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.myArrayList.add(new JSONObject(it.next(), z10));
            }
        }
    }

    public JSONArray(JSONTokener jSONTokener) throws JSONException {
        char c10;
        char cNextClean;
        this();
        char cNextClean2 = jSONTokener.nextClean();
        if (cNextClean2 == '[') {
            c10 = ']';
        } else {
            if (cNextClean2 != '(') {
                throw jSONTokener.syntaxError("A JSONArray text must start with '['");
            }
            c10 = ')';
        }
        if (jSONTokener.nextClean() == ']') {
            return;
        }
        jSONTokener.back();
        while (true) {
            if (jSONTokener.nextClean() == ',') {
                jSONTokener.back();
                this.myArrayList.add(null);
            } else {
                jSONTokener.back();
                this.myArrayList.add(jSONTokener.nextValue());
            }
            cNextClean = jSONTokener.nextClean();
            if (cNextClean != ')') {
                if (cNextClean != ',' && cNextClean != ';') {
                    if (cNextClean == ']') {
                        break;
                    } else {
                        throw jSONTokener.syntaxError("Expected a ',' or ']'");
                    }
                } else if (jSONTokener.nextClean() == ']') {
                    return;
                } else {
                    jSONTokener.back();
                }
            } else {
                break;
            }
        }
        if (c10 == cNextClean) {
            return;
        }
        throw jSONTokener.syntaxError("Expected a '" + new Character(c10) + "'");
    }

    public Object get(int i10) throws JSONException {
        Object objOpt = opt(i10);
        if (objOpt != null) {
            return objOpt;
        }
        throw new JSONException("JSONArray[" + i10 + "] not found.");
    }

    public boolean getBoolean(int i10) throws JSONException {
        Object obj = get(i10);
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
        throw new JSONException("JSONArray[" + i10 + "] is not a Boolean.");
    }

    public double getDouble(int i10) throws JSONException {
        Object obj = get(i10);
        try {
            return obj instanceof Number ? ((Number) obj).doubleValue() : Double.valueOf((String) obj).doubleValue();
        } catch (Exception unused) {
            throw new JSONException("JSONArray[" + i10 + "] is not a number.");
        }
    }

    public int getInt(int i10) throws JSONException {
        Object obj = get(i10);
        return obj instanceof Number ? ((Number) obj).intValue() : (int) getDouble(i10);
    }

    public JSONArray getJSONArray(int i10) throws JSONException {
        Object obj = get(i10);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JSONException("JSONArray[" + i10 + "] is not a JSONArray.");
    }

    public JSONObject getJSONObject(int i10) throws JSONException {
        Object obj = get(i10);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw new JSONException("JSONArray[" + i10 + "] is not a JSONObject.");
    }

    public long getLong(int i10) throws JSONException {
        Object obj = get(i10);
        return obj instanceof Number ? ((Number) obj).longValue() : (long) getDouble(i10);
    }

    public String getString(int i10) throws JSONException {
        return get(i10).toString();
    }

    public boolean isNull(int i10) {
        return JSONObject.NULL.equals(opt(i10));
    }

    public String join(String str) throws JSONException {
        int length = length();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(i10)));
        }
        return stringBuffer.toString();
    }

    public int length() {
        return this.myArrayList.size();
    }

    public Object opt(int i10) {
        if (i10 < 0 || i10 >= length()) {
            return null;
        }
        return this.myArrayList.get(i10);
    }

    public boolean optBoolean(int i10) {
        return optBoolean(i10, false);
    }

    public boolean optBoolean(int i10, boolean z10) {
        try {
            return getBoolean(i10);
        } catch (Exception unused) {
            return z10;
        }
    }

    public double optDouble(int i10) {
        return optDouble(i10, Double.NaN);
    }

    public double optDouble(int i10, double d10) {
        try {
            return getDouble(i10);
        } catch (Exception unused) {
            return d10;
        }
    }

    public int optInt(int i10) {
        return optInt(i10, 0);
    }

    public int optInt(int i10, int i11) {
        try {
            return getInt(i10);
        } catch (Exception unused) {
            return i11;
        }
    }

    public JSONArray optJSONArray(int i10) {
        Object objOpt = opt(i10);
        if (objOpt instanceof JSONArray) {
            return (JSONArray) objOpt;
        }
        return null;
    }

    public JSONObject optJSONObject(int i10) {
        Object objOpt = opt(i10);
        if (objOpt instanceof JSONObject) {
            return (JSONObject) objOpt;
        }
        return null;
    }

    public long optLong(int i10) {
        return optLong(i10, 0L);
    }

    public long optLong(int i10, long j10) {
        try {
            return getLong(i10);
        } catch (Exception unused) {
            return j10;
        }
    }

    public String optString(int i10) {
        return optString(i10, "");
    }

    public String optString(int i10, String str) {
        Object objOpt = opt(i10);
        return objOpt != null ? objOpt.toString() : str;
    }

    public JSONArray put(double d10) throws JSONException {
        Double d11 = new Double(d10);
        JSONObject.testValidity(d11);
        put(d11);
        return this;
    }

    public JSONArray put(int i10) {
        put(new Integer(i10));
        return this;
    }

    public JSONArray put(int i10, double d10) throws JSONException {
        put(i10, new Double(d10));
        return this;
    }

    public JSONArray put(int i10, int i11) throws JSONException {
        put(i10, new Integer(i11));
        return this;
    }

    public JSONArray put(int i10, long j10) throws JSONException {
        put(i10, new Long(j10));
        return this;
    }

    public JSONArray put(int i10, Object obj) throws JSONException {
        JSONObject.testValidity(obj);
        if (i10 < 0) {
            throw new JSONException("JSONArray[" + i10 + "] not found.");
        }
        if (i10 < length()) {
            this.myArrayList.set(i10, obj);
        } else {
            while (i10 != length()) {
                put(JSONObject.NULL);
            }
            put(obj);
        }
        return this;
    }

    public JSONArray put(int i10, Collection collection) throws JSONException {
        put(i10, new JSONArray(collection));
        return this;
    }

    public JSONArray put(int i10, Map map) throws JSONException {
        put(i10, new JSONObject(map));
        return this;
    }

    public JSONArray put(int i10, boolean z10) throws JSONException {
        put(i10, z10 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JSONArray put(long j10) {
        put(new Long(j10));
        return this;
    }

    public JSONArray put(Object obj) {
        this.myArrayList.add(obj);
        return this;
    }

    public JSONArray put(Collection collection) {
        put(new JSONArray(collection));
        return this;
    }

    public JSONArray put(Map map) {
        put(new JSONObject(map));
        return this;
    }

    public JSONArray put(boolean z10) {
        put(z10 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JSONObject toJSONObject(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0 || length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONObject.put(jSONArray.getString(i10), opt(i10));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return '[' + join(Constants.ACCEPT_TIME_SEPARATOR_SP) + ']';
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString(int i10) throws JSONException {
        return toString(i10, 0);
    }

    String toString(int i10, int i11) throws JSONException {
        int length = length();
        if (length == 0) {
            return t.f132643o;
        }
        StringBuffer stringBuffer = new StringBuffer(com.meituan.robust.Constants.ARRAY_TYPE);
        if (length == 1) {
            stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(0), i10, i11));
        } else {
            int i12 = i11 + i10;
            stringBuffer.append('\n');
            for (int i13 = 0; i13 < length; i13++) {
                if (i13 > 0) {
                    stringBuffer.append(",\n");
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    stringBuffer.append(' ');
                }
                stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(i13), i10, i12));
            }
            stringBuffer.append('\n');
            for (int i15 = 0; i15 < i11; i15++) {
                stringBuffer.append(' ');
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public Writer write(Writer writer) throws JSONException {
        try {
            int length = length();
            writer.write(91);
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                if (z10) {
                    writer.write(44);
                }
                Object obj = this.myArrayList.get(i10);
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).write(writer);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).write(writer);
                } else {
                    writer.write(JSONObject.valueToString(obj));
                }
                i10++;
                z10 = true;
            }
            writer.write(93);
            return writer;
        } catch (IOException e10) {
            throw new JSONException(e10);
        }
    }
}
