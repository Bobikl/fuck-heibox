package io.flutter.plugin.common;

import androidx.annotation.p0;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class JSONMessageCodec implements MessageCodec<Object> {
    public static final JSONMessageCodec INSTANCE = new JSONMessageCodec();

    private JSONMessageCodec() {
    }

    @Override // io.flutter.plugin.common.MessageCodec
    @p0
    public Object decodeMessage(@p0 ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(StringCodec.INSTANCE.decodeMessage(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // io.flutter.plugin.common.MessageCodec
    @p0
    public ByteBuffer encodeMessage(@p0 Object obj) {
        if (obj == null) {
            return null;
        }
        Object objWrap = JSONUtil.wrap(obj);
        return objWrap instanceof String ? StringCodec.INSTANCE.encodeMessage(JSONObject.quote((String) objWrap)) : StringCodec.INSTANCE.encodeMessage(objWrap.toString());
    }
}
