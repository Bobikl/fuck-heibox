package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BeforeFilter implements SerializeFilter {
    private static final ThreadLocal<JSONSerializer> serializerLocal = new ThreadLocal<>();
    private static final ThreadLocal<Character> seperatorLocal = new ThreadLocal<>();
    private static final Character COMMA = ',';

    final char writeBefore(JSONSerializer jSONSerializer, Object obj, char c10) {
        ThreadLocal<JSONSerializer> threadLocal = serializerLocal;
        threadLocal.set(jSONSerializer);
        ThreadLocal<Character> threadLocal2 = seperatorLocal;
        threadLocal2.set(Character.valueOf(c10));
        writeBefore(obj);
        threadLocal.set(null);
        return threadLocal2.get().charValue();
    }

    public abstract void writeBefore(Object obj);

    protected final void writeKeyValue(String str, Object obj) {
        JSONSerializer jSONSerializer = serializerLocal.get();
        ThreadLocal<Character> threadLocal = seperatorLocal;
        char cCharValue = threadLocal.get().charValue();
        jSONSerializer.writeKeyValue(cCharValue, str, obj);
        if (cCharValue != ',') {
            threadLocal.set(COMMA);
        }
    }
}
