package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import okhttp3.t;

/* JADX INFO: loaded from: classes6.dex */
public class ObjectArrayCodec implements ObjectSerializer, ObjectDeserializer {
    public static final ObjectArrayCodec instance = new ObjectArrayCodec();

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    private <T> T toObjectArray(DefaultJSONParser defaultJSONParser, Class<?> cls, JSONArray jSONArray) {
        Object objCast;
        if (jSONArray == null) {
            return null;
        }
        int size = jSONArray.size();
        T t10 = (T) Array.newInstance(cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Object objectArray = jSONArray.get(i10);
            if (objectArray == jSONArray) {
                Array.set(t10, i10, t10);
            } else if (cls.isArray()) {
                if (!cls.isInstance(objectArray)) {
                    objectArray = toObjectArray(defaultJSONParser, cls, (JSONArray) objectArray);
                }
                Array.set(t10, i10, objectArray);
            } else {
                if (objectArray instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) objectArray;
                    int size2 = jSONArray2.size();
                    boolean z10 = false;
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (jSONArray2.get(i11) == jSONArray) {
                            jSONArray2.set(i10, t10);
                            z10 = true;
                        }
                    }
                    if (z10) {
                        objCast = jSONArray2.toArray();
                    } else {
                        objCast = null;
                    }
                } else {
                    objCast = null;
                }
                if (objCast == null) {
                    objCast = TypeUtils.cast(objectArray, (Class<Object>) cls, defaultJSONParser.getConfig());
                }
                Array.set(t10, i10, objCast);
            }
        }
        jSONArray.setRelatedArray(t10);
        jSONArray.setComponentType(cls);
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, byte[]] */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        Type componentType;
        Class cls;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i10 = jSONLexer.token();
        Type type2 = null;
        if (i10 == 8) {
            jSONLexer.nextToken(16);
            return null;
        }
        if (i10 == 4 || i10 == 26) {
            ?? r10 = (T) jSONLexer.bytesValue();
            jSONLexer.nextToken(16);
            if (r10.length != 0 || type == byte[].class) {
                return r10;
            }
            return null;
        }
        if (type instanceof GenericArrayType) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
            if (componentType instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) componentType;
                Type type3 = defaultJSONParser.getContext().type;
                if (type3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    Type rawType = parameterizedType.getRawType();
                    if (rawType instanceof Class) {
                        TypeVariable<Class<T>>[] typeParameters = ((Class) rawType).getTypeParameters();
                        for (int i11 = 0; i11 < typeParameters.length; i11++) {
                            if (typeParameters[i11].getName().equals(typeVariable.getName())) {
                                type2 = parameterizedType.getActualTypeArguments()[i11];
                            }
                        }
                    }
                    cls = type2 instanceof Class ? (Class) type2 : Object.class;
                } else {
                    cls = TypeUtils.getClass(typeVariable.getBounds()[0]);
                }
            } else {
                cls = TypeUtils.getClass(componentType);
            }
        } else {
            componentType = ((Class) type).getComponentType();
            cls = componentType;
        }
        JSONArray jSONArray = new JSONArray();
        defaultJSONParser.parseArray(componentType, jSONArray, obj);
        return (T) toObjectArray(defaultJSONParser, cls, jSONArray);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 14;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            serializeWriter.writeNull(SerializerFeature.WriteNullListAsEmpty);
            return;
        }
        int length = objArr.length;
        int i11 = length - 1;
        if (i11 == -1) {
            serializeWriter.append((CharSequence) t.f132643o);
            return;
        }
        SerialContext serialContext = jSONSerializer.context;
        jSONSerializer.setContext(serialContext, obj, obj2, 0);
        try {
            serializeWriter.append('[');
            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                jSONSerializer.incrementIndent();
                jSONSerializer.println();
                for (int i12 = 0; i12 < length; i12++) {
                    if (i12 != 0) {
                        serializeWriter.write(44);
                        jSONSerializer.println();
                    }
                    jSONSerializer.write(objArr[i12]);
                }
                jSONSerializer.decrementIdent();
                jSONSerializer.println();
                serializeWriter.write(93);
                return;
            }
            Class<?> cls = null;
            ObjectSerializer objectWriter = null;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj3 = objArr[i13];
                if (obj3 == null) {
                    serializeWriter.append((CharSequence) "null,");
                } else {
                    if (jSONSerializer.containsReference(obj3)) {
                        jSONSerializer.writeReference(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            objectWriter.write(jSONSerializer, obj3, null, null, 0);
                        } else {
                            objectWriter = jSONSerializer.getObjectWriter(cls2);
                            objectWriter.write(jSONSerializer, obj3, null, null, 0);
                            cls = cls2;
                        }
                    }
                    serializeWriter.append(',');
                }
            }
            Object obj4 = objArr[i11];
            if (obj4 == null) {
                serializeWriter.append((CharSequence) "null]");
            } else {
                if (jSONSerializer.containsReference(obj4)) {
                    jSONSerializer.writeReference(obj4);
                } else {
                    jSONSerializer.writeWithFieldName(obj4, Integer.valueOf(i11));
                }
                serializeWriter.append(']');
            }
        } finally {
            jSONSerializer.context = serialContext;
        }
    }
}
