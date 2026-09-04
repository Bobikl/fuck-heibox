package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class JavaObjectDeserializer implements ObjectDeserializer {
    public static final JavaObjectDeserializer instance = new JavaObjectDeserializer();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        if (!(type instanceof GenericArrayType)) {
            return (!(type instanceof Class) || type == Object.class || type == Serializable.class) ? (T) defaultJSONParser.parse(obj) : (T) defaultJSONParser.parseObject(type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        if (genericComponentType instanceof TypeVariable) {
            genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
        }
        ArrayList arrayList = new ArrayList();
        defaultJSONParser.parseArray(genericComponentType, arrayList);
        if (!(genericComponentType instanceof Class)) {
            return (T) arrayList.toArray();
        }
        T t10 = (T) ((Object[]) Array.newInstance((Class<?>) genericComponentType, arrayList.size()));
        arrayList.toArray((Object[]) t10);
        return t10;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }
}
