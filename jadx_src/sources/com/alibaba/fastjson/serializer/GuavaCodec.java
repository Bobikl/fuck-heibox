package com.alibaba.fastjson.serializer;

import com.google.common.collect.r1;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public class GuavaCodec implements ObjectSerializer {
    public static GuavaCodec instance = new GuavaCodec();

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj instanceof r1) {
            jSONSerializer.write(((r1) obj).e());
        }
    }
}
