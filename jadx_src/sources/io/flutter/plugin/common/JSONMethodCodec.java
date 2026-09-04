package io.flutter.plugin.common;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class JSONMethodCodec implements MethodCodec {
    public static final JSONMethodCodec INSTANCE = new JSONMethodCodec();

    private JSONMethodCodec() {
    }

    @Override // io.flutter.plugin.common.MethodCodec
    @n0
    public Object decodeEnvelope(@n0 ByteBuffer byteBuffer) {
        try {
            Object objDecodeMessage = JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
            if (objDecodeMessage instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objDecodeMessage;
                if (jSONArray.length() == 1) {
                    return unwrapNull(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object objUnwrapNull = unwrapNull(jSONArray.opt(1));
                    Object objUnwrapNull2 = unwrapNull(jSONArray.opt(2));
                    if ((obj instanceof String) && (objUnwrapNull == null || (objUnwrapNull instanceof String))) {
                        throw new FlutterException((String) obj, (String) objUnwrapNull, objUnwrapNull2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + objDecodeMessage);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    @n0
    public MethodCall decodeMethodCall(@n0 ByteBuffer byteBuffer) {
        try {
            Object objDecodeMessage = JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
            if (objDecodeMessage instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objDecodeMessage;
                Object obj = jSONObject.get("method");
                Object objUnwrapNull = unwrapNull(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new MethodCall((String) obj, objUnwrapNull);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objDecodeMessage);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    @n0
    public ByteBuffer encodeErrorEnvelope(@n0 String str, @p0 String str2, @p0 Object obj) {
        return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(str).put(JSONUtil.wrap(str2)).put(JSONUtil.wrap(obj)));
    }

    @Override // io.flutter.plugin.common.MethodCodec
    @n0
    public ByteBuffer encodeErrorEnvelopeWithStacktrace(@n0 String str, @p0 String str2, @p0 Object obj, @p0 String str3) {
        return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(str).put(JSONUtil.wrap(str2)).put(JSONUtil.wrap(obj)).put(JSONUtil.wrap(str3)));
    }

    @Override // io.flutter.plugin.common.MethodCodec
    @n0
    public ByteBuffer encodeMethodCall(@n0 MethodCall methodCall) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", methodCall.method);
            jSONObject.put("args", JSONUtil.wrap(methodCall.arguments));
            return JSONMessageCodec.INSTANCE.encodeMessage(jSONObject);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    @n0
    public ByteBuffer encodeSuccessEnvelope(@p0 Object obj) {
        return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(JSONUtil.wrap(obj)));
    }

    Object unwrapNull(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
