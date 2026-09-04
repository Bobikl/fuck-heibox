package io.flutter.plugin.common;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class MethodCall {
    public final Object arguments;
    public final String method;

    public MethodCall(@n0 String str, @p0 Object obj) {
        this.method = str;
        this.arguments = obj;
    }

    @p0
    public <T> T argument(@n0 String str) {
        Object obj = this.arguments;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    @p0
    public <T> T arguments() {
        return (T) this.arguments;
    }

    public boolean hasArgument(@n0 String str) {
        Object obj = this.arguments;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
