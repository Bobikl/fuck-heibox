package com.ss.bytertc.engine.flutter.base;

import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RTCTypeBox {
    private static final String TAG = "RTCTypeBox";
    public final Object arguments;
    public final String logEx;

    public RTCTypeBox(Object obj) {
        this(obj, null);
    }

    public RTCTypeBox(Object obj, String str) {
        this.arguments = obj;
        this.logEx = str;
    }

    public <T> List<T> getList(String str) {
        return (List) opt(str, Collections.emptyList(), List.class);
    }

    public <T> T opt(String str, T t10, Class<T> cls) {
        Object obj;
        Object obj2 = this.arguments;
        if (obj2 == null || (obj = ((Map) obj2).get(str)) == null) {
            return t10;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (cls == Float.class) {
            if (obj instanceof Double) {
                return cls.cast(Float.valueOf(((Double) obj).floatValue()));
            }
        } else if (cls == Long.class) {
            if (obj instanceof Integer) {
                return cls.cast(Long.valueOf(((Integer) obj).longValue()));
            }
        } else if (cls == Integer.class && (obj instanceof Long)) {
            return cls.cast(Integer.valueOf(((Long) obj).intValue()));
        }
        throw new ClassCastException("Argument (" + str + "): Cannot cast " + obj.getClass() + " to " + cls);
    }

    public boolean optBoolean(String str) {
        return ((Boolean) opt(str, Boolean.FALSE, Boolean.class)).booleanValue();
    }

    public boolean optBoolean(String str, boolean z10) {
        return ((Boolean) opt(str, Boolean.valueOf(z10), Boolean.class)).booleanValue();
    }

    public RTCTypeBox optBox(String str) {
        return this.arguments == null ? new RTCTypeBox(null, this.logEx) : new RTCTypeBox(opt(str, null, Map.class), this.logEx);
    }

    public byte[] optBytes(String str) {
        return (byte[]) opt(str, new byte[0], byte[].class);
    }

    public byte[] optBytes(String str, byte[] bArr) {
        return (byte[]) opt(str, bArr, byte[].class);
    }

    public double optDouble(String str) {
        return ((Double) opt(str, Double.valueOf(0.0d), Double.class)).doubleValue();
    }

    public float optFloat(String str) {
        return ((Float) opt(str, Float.valueOf(0.0f), Float.class)).floatValue();
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public int optInt(String str, int i10) {
        return ((Integer) opt(str, Integer.valueOf(i10), Integer.class)).intValue();
    }

    public JSONObject optJSONObject(String str) {
        return new JSONObject((Map) opt(str, Collections.emptyMap(), Map.class));
    }

    public long optLong(String str) {
        return ((Long) opt(str, 0L, Long.class)).longValue();
    }

    @p0
    public JSONObject optNullJSONObject(String str) {
        Map map = (Map) opt(str, null, Map.class);
        if (map == null) {
            return null;
        }
        return new JSONObject(map);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public String optString(String str, String str2) {
        return (String) opt(str, str2, String.class);
    }
}
