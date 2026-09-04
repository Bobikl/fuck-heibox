package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import okhttp3.t;

/* JADX INFO: loaded from: classes6.dex */
public final class ListSerializer implements ObjectSerializer {
    public static final ListSerializer instance = new ListSerializer();

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws IOException {
        char c10;
        SerializeWriter serializeWriter = jSONSerializer.out;
        SerializerFeature serializerFeature = SerializerFeature.WriteClassName;
        boolean z10 = serializeWriter.isEnabled(serializerFeature) || SerializerFeature.isEnabled(i10, serializerFeature);
        SerializeWriter serializeWriter2 = jSONSerializer.out;
        Type collectionItemType = z10 ? TypeUtils.getCollectionItemType(type) : null;
        if (obj == null) {
            serializeWriter2.writeNull(SerializerFeature.WriteNullListAsEmpty);
            return;
        }
        List list = (List) obj;
        if (list.size() == 0) {
            serializeWriter2.append((CharSequence) t.f132643o);
            return;
        }
        SerialContext serialContext = jSONSerializer.context;
        jSONSerializer.setContext(serialContext, obj, obj2, 0);
        try {
            char c11 = ',';
            char c12 = ']';
            if (serializeWriter2.isEnabled(SerializerFeature.PrettyFormat)) {
                serializeWriter2.append('[');
                jSONSerializer.incrementIndent();
                int i11 = 0;
                for (Object obj3 : list) {
                    if (i11 != 0) {
                        serializeWriter2.append(c11);
                    }
                    jSONSerializer.println();
                    if (obj3 == null) {
                        jSONSerializer.out.writeNull();
                    } else if (jSONSerializer.containsReference(obj3)) {
                        jSONSerializer.writeReference(obj3);
                    } else {
                        ObjectSerializer objectWriter = jSONSerializer.getObjectWriter(obj3.getClass());
                        jSONSerializer.context = new SerialContext(serialContext, obj, obj2, 0, 0);
                        objectWriter.write(jSONSerializer, obj3, Integer.valueOf(i11), collectionItemType, i10);
                    }
                    i11++;
                    c12 = c12;
                    c11 = ',';
                }
                jSONSerializer.decrementIdent();
                jSONSerializer.println();
                serializeWriter2.append(c12);
                return;
            }
            char c13 = ']';
            serializeWriter2.append('[');
            int size = list.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj4 = list.get(i12);
                if (i12 != 0) {
                    c10 = ',';
                    serializeWriter2.append(',');
                } else {
                    c10 = ',';
                }
                if (obj4 == null) {
                    serializeWriter2.append((CharSequence) "null");
                } else {
                    Class<?> cls = obj4.getClass();
                    if (cls == Integer.class) {
                        serializeWriter2.writeInt(((Integer) obj4).intValue());
                    } else {
                        if (cls == Long.class) {
                            long jLongValue = ((Long) obj4).longValue();
                            if (z10) {
                                serializeWriter2.writeLong(jLongValue);
                                serializeWriter2.write(76);
                            } else {
                                serializeWriter2.writeLong(jLongValue);
                            }
                        } else if ((SerializerFeature.DisableCircularReferenceDetect.mask & i10) != 0) {
                            jSONSerializer.getObjectWriter(obj4.getClass()).write(jSONSerializer, obj4, Integer.valueOf(i12), collectionItemType, i10);
                            z10 = z10;
                        } else {
                            i12 = i12;
                            if (!serializeWriter2.disableCircularReferenceDetect) {
                                jSONSerializer.context = new SerialContext(serialContext, obj, obj2, 0, 0);
                            }
                            if (jSONSerializer.containsReference(obj4)) {
                                jSONSerializer.writeReference(obj4);
                            } else {
                                ObjectSerializer objectWriter2 = jSONSerializer.getObjectWriter(obj4.getClass());
                                if ((SerializerFeature.WriteClassName.mask & i10) == 0 || !(objectWriter2 instanceof JavaBeanSerializer)) {
                                    objectWriter2.write(jSONSerializer, obj4, Integer.valueOf(i12), collectionItemType, i10);
                                } else {
                                    ((JavaBeanSerializer) objectWriter2).writeNoneASM(jSONSerializer, obj4, Integer.valueOf(i12), collectionItemType, i10);
                                }
                            }
                        }
                        i12++;
                        z10 = z10;
                        c13 = ']';
                    }
                }
                z10 = z10;
                i12++;
                z10 = z10;
                c13 = ']';
            }
            serializeWriter2.append(c13);
        } finally {
            jSONSerializer.context = serialContext;
        }
    }
}
