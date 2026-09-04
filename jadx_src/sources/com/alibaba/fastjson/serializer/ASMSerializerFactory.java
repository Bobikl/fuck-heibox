package com.alibaba.fastjson.serializer;

import androidx.constraintlayout.core.motion.utils.w;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.ClassWriter;
import com.alibaba.fastjson.asm.FieldWriter;
import com.alibaba.fastjson.asm.Label;
import com.alibaba.fastjson.asm.MethodVisitor;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.asm.Type;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.y;
import lg.a;
import okhttp3.t;

/* JADX INFO: loaded from: classes6.dex */
public class ASMSerializerFactory implements Opcodes {
    static final String JSONSerializer = ASMUtils.type(JSONSerializer.class);
    static final String JavaBeanSerializer;
    static final String JavaBeanSerializer_desc;
    static final String ObjectSerializer;
    static final String ObjectSerializer_desc;
    static final String SerialContext_desc;
    static final String SerializeFilterable_desc;
    static final String SerializeWriter;
    static final String SerializeWriter_desc;
    protected final ASMClassLoader classLoader = new ASMClassLoader();
    private final AtomicLong seed = new AtomicLong();

    public static class Context {
        static final int features = 5;
        static int fieldName = 6;
        static final int obj = 2;
        static int original = 7;
        static final int paramFieldName = 3;
        static final int paramFieldType = 4;
        static int processValue = 8;
        static final int serializer = 1;
        private final SerializeBeanInfo beanInfo;
        private final String className;
        private final FieldInfo[] getters;
        private final boolean nonContext;
        private final boolean writeDirect;
        private Map<String, Integer> variants = new HashMap();
        private int variantIndex = 9;

        public Context(FieldInfo[] fieldInfoArr, SerializeBeanInfo serializeBeanInfo, String str, boolean z10, boolean z11) {
            this.getters = fieldInfoArr;
            this.className = str;
            this.beanInfo = serializeBeanInfo;
            this.writeDirect = z10;
            this.nonContext = z11 || serializeBeanInfo.beanType.isEnum();
        }

        public int getFieldOrinal(String str) {
            int length = this.getters.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.getters[i10].name.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        public int var(String str) {
            if (this.variants.get(str) == null) {
                Map<String, Integer> map = this.variants;
                int i10 = this.variantIndex;
                this.variantIndex = i10 + 1;
                map.put(str, Integer.valueOf(i10));
            }
            return this.variants.get(str).intValue();
        }

        public int var(String str, int i10) {
            if (this.variants.get(str) == null) {
                this.variants.put(str, Integer.valueOf(this.variantIndex));
                this.variantIndex += i10;
            }
            return this.variants.get(str).intValue();
        }
    }

    static {
        String strType = ASMUtils.type(ObjectSerializer.class);
        ObjectSerializer = strType;
        ObjectSerializer_desc = "L" + strType + ";";
        String strType2 = ASMUtils.type(SerializeWriter.class);
        SerializeWriter = strType2;
        SerializeWriter_desc = "L" + strType2 + ";";
        JavaBeanSerializer = ASMUtils.type(JavaBeanSerializer.class);
        JavaBeanSerializer_desc = "L" + ASMUtils.type(JavaBeanSerializer.class) + ";";
        SerialContext_desc = ASMUtils.desc((Class<?>) SerialContext.class);
        SerializeFilterable_desc = ASMUtils.desc((Class<?>) SerializeFilterable.class);
    }

    private void _after(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "writeAfter", "(L" + JSONSerializer + ";Ljava/lang/Object;C)C");
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _apply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Class<?> cls = fieldInfo.fieldClass;
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BYTE));
            methodVisitor.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.SHORT));
            methodVisitor.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.INT));
            methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.CHAR));
            methodVisitor.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var(Constants.LONG, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var("float"));
            methodVisitor.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("boolean"));
            methodVisitor.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var(w.b.f17895e));
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
        }
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "apply", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
    }

    private void _before(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "writeBefore", "(L" + JSONSerializer + ";Ljava/lang/Object;C)C");
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _decimal(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var("decimal"));
        _filters(methodVisitor, fieldInfo, context, label);
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitVarInsn(25, context.var("decimal"));
        methodVisitor.visitJumpInsn(199, label3);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(25, context.var("decimal"));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;Ljava/math/BigDecimal;)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLabel(label);
    }

    private void _double(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(57, context.var(Constants.DOUBLE, 2));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE, 2));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;D)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _enum(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label3);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitTypeInsn(192, "java/lang/Enum");
        methodVisitor.visitVarInsn(58, context.var("enum"));
        _filters(methodVisitor, fieldInfo, context, label3);
        methodVisitor.visitVarInsn(25, context.var("enum"));
        methodVisitor.visitJumpInsn(199, label);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label2);
        methodVisitor.visitLabel(label);
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitMethodInsn(182, "java/lang/Enum", "name", "()Ljava/lang/String;");
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValueStringWithDoubleQuote", "(CLjava/lang/String;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            String str = SerializeWriter;
            methodVisitor.visitMethodInsn(182, str, "write", "(I)V");
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitInsn(3);
            methodVisitor.visitMethodInsn(182, str, "writeFieldName", "(Ljava/lang/String;Z)V");
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
        }
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLabel(label3);
    }

    private void _filters(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (fieldInfo.fieldTransient) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.SkipTransientField.mask));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(154, label);
        }
        _notWriteDefault(methodVisitor, fieldInfo, context, label);
        if (context.writeDirect) {
            return;
        }
        _apply(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(153, label);
        _processKey(methodVisitor, fieldInfo, context);
        _processValue(methodVisitor, fieldInfo, context, label);
    }

    private void _float(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(56, context.var("float"));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(23, context.var("float"));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;F)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _get(MethodVisitor methodVisitor, Context context, FieldInfo fieldInfo) {
        Method method = fieldInfo.method;
        if (method != null) {
            methodVisitor.visitVarInsn(25, context.var("entity"));
            Class<?> declaringClass = method.getDeclaringClass();
            methodVisitor.visitMethodInsn(declaringClass.isInterface() ? 185 : 182, ASMUtils.type(declaringClass), method.getName(), ASMUtils.desc(method));
            if (method.getReturnType().equals(fieldInfo.fieldClass)) {
                return;
            }
            methodVisitor.visitTypeInsn(192, ASMUtils.type(fieldInfo.fieldClass));
            return;
        }
        methodVisitor.visitVarInsn(25, context.var("entity"));
        Field field = fieldInfo.field;
        methodVisitor.visitFieldInsn(180, ASMUtils.type(fieldInfo.declaringClass), field.getName(), ASMUtils.desc(field.getType()));
        if (field.getType().equals(fieldInfo.fieldClass)) {
            return;
        }
        methodVisitor.visitTypeInsn(192, ASMUtils.type(fieldInfo.fieldClass));
    }

    private void _getFieldSer(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        String str = context.className;
        String str2 = fieldInfo.name + "_asm_ser_";
        String str3 = ObjectSerializer_desc;
        methodVisitor.visitFieldInsn(180, str, str2, str3);
        methodVisitor.visitJumpInsn(199, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
        methodVisitor.visitMethodInsn(182, JSONSerializer, "getObjectWriter", "(Ljava/lang/Class;)" + str3);
        methodVisitor.visitFieldInsn(181, context.className, fieldInfo.name + "_asm_ser_", str3);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_ser_", str3);
    }

    private void _getListFieldItemSer(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo, Class<?> cls) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        String str = context.className;
        String str2 = fieldInfo.name + "_asm_list_item_ser_";
        String str3 = ObjectSerializer_desc;
        methodVisitor.visitFieldInsn(180, str, str2, str3);
        methodVisitor.visitJumpInsn(199, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
        methodVisitor.visitMethodInsn(182, JSONSerializer, "getObjectWriter", "(Ljava/lang/Class;)" + str3);
        methodVisitor.visitFieldInsn(181, context.className, fieldInfo.name + "_asm_list_item_ser_", str3);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_list_item_ser_", str3);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0133  */
    private void _if_write_null(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        int i10;
        int mask;
        int mask2;
        Class<?> cls = fieldInfo.fieldClass;
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        methodVisitor.visitLabel(label);
        JSONField annotation = fieldInfo.getAnnotation();
        int iOf = annotation != null ? SerializerFeature.of(annotation.serialzeFeatures()) : 0;
        JSONType jSONType = context.beanInfo.jsonType;
        if (jSONType != null) {
            iOf |= SerializerFeature.of(jSONType.serialzeFeatures());
        }
        if (cls == String.class) {
            mask = SerializerFeature.WriteMapNullValue.getMask();
            mask2 = SerializerFeature.WriteNullStringAsEmpty.getMask();
        } else if (Number.class.isAssignableFrom(cls)) {
            mask = SerializerFeature.WriteMapNullValue.getMask();
            mask2 = SerializerFeature.WriteNullNumberAsZero.getMask();
        } else {
            if (!Collection.class.isAssignableFrom(cls)) {
                if (Boolean.class == cls) {
                    mask = SerializerFeature.WriteMapNullValue.getMask();
                    mask2 = SerializerFeature.WriteNullBooleanAsFalse.getMask();
                } else {
                    i10 = SerializerFeature.WRITE_MAP_NULL_FEATURES;
                }
                if ((iOf & i10) == 0) {
                    methodVisitor.visitVarInsn(25, context.var("out"));
                    methodVisitor.visitLdcInsn(Integer.valueOf(i10));
                    methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
                    methodVisitor.visitJumpInsn(153, label2);
                }
                methodVisitor.visitLabel(label3);
                methodVisitor.visitVarInsn(25, context.var("out"));
                methodVisitor.visitVarInsn(21, context.var("seperator"));
                String str = SerializeWriter;
                methodVisitor.visitMethodInsn(182, str, "write", "(I)V");
                _writeFieldName(methodVisitor, context);
                methodVisitor.visitVarInsn(25, context.var("out"));
                methodVisitor.visitLdcInsn(Integer.valueOf(iOf));
                if (cls != String.class || cls == Character.class) {
                    methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullStringAsEmpty.mask));
                } else if (Number.class.isAssignableFrom(cls)) {
                    methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullNumberAsZero.mask));
                } else if (cls == Boolean.class) {
                    methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullBooleanAsFalse.mask));
                } else if (Collection.class.isAssignableFrom(cls) || cls.isArray()) {
                    methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullListAsEmpty.mask));
                } else {
                    methodVisitor.visitLdcInsn(0);
                }
                methodVisitor.visitMethodInsn(182, str, "writeNull", "(II)V");
                _seperator(methodVisitor, context);
                methodVisitor.visitJumpInsn(167, label4);
                methodVisitor.visitLabel(label2);
                methodVisitor.visitLabel(label4);
            }
            mask = SerializerFeature.WriteMapNullValue.getMask();
            mask2 = SerializerFeature.WriteNullListAsEmpty.getMask();
        }
        i10 = mask | mask2;
        if ((iOf & i10) == 0) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(i10));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(153, label2);
        }
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        String str2 = SerializeWriter;
        methodVisitor.visitMethodInsn(182, str2, "write", "(I)V");
        _writeFieldName(methodVisitor, context);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitLdcInsn(Integer.valueOf(iOf));
        if (cls != String.class) {
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullStringAsEmpty.mask));
        } else {
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullStringAsEmpty.mask));
        }
        methodVisitor.visitMethodInsn(182, str2, "writeNull", "(II)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLabel(label4);
    }

    private void _int(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, int i10, char c10) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(54, i10);
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(21, i10);
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;" + c10 + ")V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _labelApply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(fieldInfo.label);
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "applyLabel", "(L" + JSONSerializer + ";Ljava/lang/String;)Z");
        methodVisitor.visitJumpInsn(153, label);
    }

    private void _list(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label;
        String str;
        FieldInfo fieldInfo2;
        int i10;
        int i11;
        int i12;
        java.lang.reflect.Type collectionItemType = TypeUtils.getCollectionItemType(fieldInfo.fieldType);
        Class<?> cls2 = null;
        Class<?> cls3 = collectionItemType instanceof Class ? (Class) collectionItemType : null;
        if (cls3 != Object.class && cls3 != Serializable.class) {
            cls2 = cls3;
        }
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label2);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitTypeInsn(192, "java/util/List");
        methodVisitor.visitVarInsn(58, context.var("list"));
        _filters(methodVisitor, fieldInfo, context, label2);
        methodVisitor.visitVarInsn(25, context.var("list"));
        methodVisitor.visitJumpInsn(199, label3);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        String str2 = SerializeWriter;
        methodVisitor.visitMethodInsn(182, str2, "write", "(I)V");
        _writeFieldName(methodVisitor, context);
        methodVisitor.visitVarInsn(25, context.var("list"));
        methodVisitor.visitMethodInsn(185, "java/util/List", UiKitSpanObj.TYPE_SIZE, "()I");
        methodVisitor.visitVarInsn(54, context.var(UiKitSpanObj.TYPE_SIZE));
        Label label5 = new Label();
        Label label6 = new Label();
        methodVisitor.visitVarInsn(21, context.var(UiKitSpanObj.TYPE_SIZE));
        methodVisitor.visitInsn(3);
        methodVisitor.visitJumpInsn(160, label5);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitLdcInsn(t.f132643o);
        methodVisitor.visitMethodInsn(182, str2, "write", "(Ljava/lang/String;)V");
        methodVisitor.visitJumpInsn(167, label6);
        methodVisitor.visitLabel(label5);
        if (!context.nonContext) {
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitMethodInsn(182, JSONSerializer, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
        }
        if (collectionItemType == String.class && context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitMethodInsn(182, str2, "write", "(Ljava/util/List;)V");
            i11 = 25;
            i12 = 182;
            i10 = 1;
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 91);
            methodVisitor.visitMethodInsn(182, str2, "write", "(I)V");
            Label label7 = new Label();
            Label label8 = new Label();
            Label label9 = new Label();
            methodVisitor.visitInsn(3);
            methodVisitor.visitVarInsn(54, context.var("i"));
            methodVisitor.visitLabel(label7);
            methodVisitor.visitVarInsn(21, context.var("i"));
            methodVisitor.visitVarInsn(21, context.var(UiKitSpanObj.TYPE_SIZE));
            methodVisitor.visitJumpInsn(162, label9);
            methodVisitor.visitVarInsn(21, context.var("i"));
            methodVisitor.visitJumpInsn(153, label8);
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 44);
            methodVisitor.visitMethodInsn(182, str2, "write", "(I)V");
            methodVisitor.visitLabel(label8);
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(21, context.var("i"));
            methodVisitor.visitMethodInsn(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
            methodVisitor.visitVarInsn(58, context.var("list_item"));
            Label label10 = new Label();
            Label label11 = new Label();
            methodVisitor.visitVarInsn(25, context.var("list_item"));
            methodVisitor.visitJumpInsn(199, label11);
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitMethodInsn(182, str2, "writeNull", "()V");
            methodVisitor.visitJumpInsn(167, label10);
            methodVisitor.visitLabel(label11);
            Label label12 = new Label();
            Label label13 = new Label();
            if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                label10 = label10;
                label = label12;
                label13 = label13;
                str = "write";
                fieldInfo2 = fieldInfo;
            } else {
                methodVisitor.visitVarInsn(25, context.var("list_item"));
                methodVisitor.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                methodVisitor.visitJumpInsn(166, label13);
                fieldInfo2 = fieldInfo;
                _getListFieldItemSer(context, methodVisitor, fieldInfo2, cls2);
                methodVisitor.visitVarInsn(58, context.var("list_item_desc"));
                Label label14 = new Label();
                Label label15 = new Label();
                if (context.writeDirect) {
                    String str3 = (context.nonContext && context.writeDirect) ? "writeDirectNonContext" : "write";
                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                    String str4 = JavaBeanSerializer;
                    methodVisitor.visitTypeInsn(193, str4);
                    methodVisitor.visitJumpInsn(153, label14);
                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                    methodVisitor.visitTypeInsn(192, str4);
                    methodVisitor.visitVarInsn(25, 1);
                    methodVisitor.visitVarInsn(25, context.var("list_item"));
                    if (context.nonContext) {
                        methodVisitor.visitInsn(1);
                    } else {
                        methodVisitor.visitVarInsn(21, context.var("i"));
                        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    }
                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                    methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                    methodVisitor.visitMethodInsn(182, str4, str3, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                    methodVisitor.visitJumpInsn(167, label15);
                    methodVisitor.visitLabel(label14);
                } else {
                    label10 = label10;
                    label13 = label13;
                }
                methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                methodVisitor.visitVarInsn(25, 1);
                methodVisitor.visitVarInsn(25, context.var("list_item"));
                if (context.nonContext) {
                    methodVisitor.visitInsn(1);
                } else {
                    methodVisitor.visitVarInsn(21, context.var("i"));
                    methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                }
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                str = "write";
                methodVisitor.visitMethodInsn(185, ObjectSerializer, str, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodVisitor.visitLabel(label15);
                label = label12;
                methodVisitor.visitJumpInsn(167, label);
            }
            methodVisitor.visitLabel(label13);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("list_item"));
            if (context.nonContext) {
                methodVisitor.visitInsn(1);
            } else {
                methodVisitor.visitVarInsn(21, context.var("i"));
                methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            }
            if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            } else {
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) collectionItemType)));
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            }
            methodVisitor.visitLabel(label);
            methodVisitor.visitLabel(label10);
            i10 = 1;
            methodVisitor.visitIincInsn(context.var("i"), 1);
            methodVisitor.visitJumpInsn(167, label7);
            methodVisitor.visitLabel(label9);
            i11 = 25;
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 93);
            i12 = 182;
            methodVisitor.visitMethodInsn(182, str2, str, "(I)V");
        }
        methodVisitor.visitVarInsn(i11, i10);
        methodVisitor.visitMethodInsn(i12, JSONSerializer, "popContext", "()V");
        methodVisitor.visitLabel(label6);
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLabel(label2);
    }

    private void _long(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(55, context.var(Constants.LONG, 2));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(22, context.var(Constants.LONG, 2));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;J)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _nameApply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (!context.writeDirect) {
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "applyName", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;)Z");
            methodVisitor.visitJumpInsn(153, label);
            _labelApply(methodVisitor, fieldInfo, context, label);
        }
        if (fieldInfo.field == null) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.IgnoreNonFieldGetter.mask));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(154, label);
        }
    }

    private void _notWriteDefault(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (context.writeDirect) {
            return;
        }
        Label label2 = new Label();
        methodVisitor.visitVarInsn(21, context.var("notWriteDefaultValue"));
        methodVisitor.visitJumpInsn(153, label2);
        Class<?> cls = fieldInfo.fieldClass;
        if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("boolean"));
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BYTE));
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.SHORT));
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.INT));
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var(Constants.LONG));
            methodVisitor.visitInsn(9);
            methodVisitor.visitInsn(148);
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var("float"));
            methodVisitor.visitInsn(11);
            methodVisitor.visitInsn(149);
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE));
            methodVisitor.visitInsn(14);
            methodVisitor.visitInsn(151);
            methodVisitor.visitJumpInsn(153, label);
        }
        methodVisitor.visitLabel(label2);
    }

    private void _object(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var("object"));
        _filters(methodVisitor, fieldInfo, context, label);
        _writeObject(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitLabel(label);
    }

    private void _processKey(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        methodVisitor.visitVarInsn(21, context.var("hasNameFilters"));
        methodVisitor.visitJumpInsn(153, label);
        Class<?> cls = fieldInfo.fieldClass;
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BYTE));
            methodVisitor.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.SHORT));
            methodVisitor.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.INT));
            methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.CHAR));
            methodVisitor.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var(Constants.LONG, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var("float"));
            methodVisitor.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("boolean"));
            methodVisitor.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var(w.b.f17895e));
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
        }
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "processKey", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");
        methodVisitor.visitVarInsn(58, Context.fieldName);
        methodVisitor.visitLabel(label);
    }

    private void _processValue(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        Label label2 = new Label();
        Class<?> cls = fieldInfo.fieldClass;
        if (cls.isPrimitive()) {
            Label label3 = new Label();
            methodVisitor.visitVarInsn(21, context.var("checkValue"));
            methodVisitor.visitJumpInsn(154, label3);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(58, Context.processValue);
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label3);
        }
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitLdcInsn(Integer.valueOf(context.getFieldOrinal(fieldInfo.name)));
        String str = JavaBeanSerializer;
        methodVisitor.visitMethodInsn(182, str, "getBeanContext", "(I)" + ASMUtils.desc((Class<?>) BeanContext.class));
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BYTE));
            methodVisitor.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.SHORT));
            methodVisitor.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.INT));
            methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.CHAR));
            methodVisitor.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var(Constants.LONG, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var("float"));
            methodVisitor.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("boolean"));
            methodVisitor.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var(w.b.f17895e));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        }
        methodVisitor.visitMethodInsn(182, str, "processValue", "(L" + JSONSerializer + ";" + ASMUtils.desc((Class<?>) BeanContext.class) + "Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;");
        methodVisitor.visitVarInsn(58, Context.processValue);
        methodVisitor.visitVarInsn(25, Context.original);
        methodVisitor.visitVarInsn(25, Context.processValue);
        methodVisitor.visitJumpInsn(165, label2);
        _writeObject(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitJumpInsn(167, label);
        methodVisitor.visitLabel(label2);
    }

    private void _seperator(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(16, 44);
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _string(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        if (fieldInfo.name.equals(context.beanInfo.typeKey)) {
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 4);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitMethodInsn(182, JSONSerializer, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
            methodVisitor.visitJumpInsn(154, label);
        }
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var(w.b.f17895e));
        _filters(methodVisitor, fieldInfo, context, label);
        Label label2 = new Label();
        Label label3 = new Label();
        methodVisitor.visitVarInsn(25, context.var(w.b.f17895e));
        methodVisitor.visitJumpInsn(199, label2);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label3);
        methodVisitor.visitLabel(label2);
        if ("trim".equals(fieldInfo.format)) {
            methodVisitor.visitVarInsn(25, context.var(w.b.f17895e));
            methodVisitor.visitMethodInsn(182, "java/lang/String", "trim", "()Ljava/lang/String;");
            methodVisitor.visitVarInsn(58, context.var(w.b.f17895e));
        }
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var(w.b.f17895e));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValueStringWithDoubleQuoteCheck", "(CLjava/lang/String;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var(w.b.f17895e));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;Ljava/lang/String;)V");
        }
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLabel(label);
    }

    private void _writeFieldName(MethodVisitor methodVisitor, Context context) {
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldNameDirect", "(Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitInsn(3);
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldName", "(Ljava/lang/String;Z)V");
        }
    }

    private void _writeObject(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        Label label2;
        Label label3;
        String str;
        String format = fieldInfo.getFormat();
        Class<?> cls = fieldInfo.fieldClass;
        Label label4 = new Label();
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("object"));
        } else {
            methodVisitor.visitVarInsn(25, Context.processValue);
        }
        methodVisitor.visitInsn(89);
        methodVisitor.visitVarInsn(58, context.var("object"));
        methodVisitor.visitJumpInsn(199, label4);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "write", "(I)V");
        _writeFieldName(methodVisitor, context);
        Label label5 = new Label();
        Label label6 = new Label();
        if (!Modifier.isPublic(cls.getModifiers()) || ParserConfig.isPrimitive2(cls)) {
            label2 = label5;
            label3 = label6;
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
            methodVisitor.visitJumpInsn(166, label6);
            _getFieldSer(context, methodVisitor, fieldInfo);
            methodVisitor.visitVarInsn(58, context.var("fied_ser"));
            Label label7 = new Label();
            Label label8 = new Label();
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            String str2 = JavaBeanSerializer;
            methodVisitor.visitTypeInsn(193, str2);
            methodVisitor.visitJumpInsn(153, label7);
            int i10 = fieldInfo.serialzeFeatures;
            boolean z10 = (SerializerFeature.DisableCircularReferenceDetect.mask & i10) != 0;
            boolean z11 = (SerializerFeature.BeanToArray.mask & i10) != 0;
            if (z10 || (context.nonContext && context.writeDirect)) {
                str = z11 ? "writeAsArrayNonContext" : "writeDirectNonContext";
            } else {
                str = z11 ? "writeAsArray" : "write";
            }
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            methodVisitor.visitTypeInsn(192, str2);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(L");
            String str3 = JSONSerializer;
            sb2.append(str3);
            sb2.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitMethodInsn(182, str2, str, sb2.toString());
            methodVisitor.visitJumpInsn(167, label8);
            methodVisitor.visitLabel(label7);
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            methodVisitor.visitMethodInsn(185, ObjectSerializer, "write", "(L" + str3 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitLabel(label8);
            label2 = label5;
            methodVisitor.visitJumpInsn(167, label2);
            label3 = label6;
        }
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, 1);
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("object"));
        } else {
            methodVisitor.visitVarInsn(25, Context.processValue);
        }
        if (format != 0) {
            methodVisitor.visitLdcInsn(format);
            methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, Context.fieldName);
            java.lang.reflect.Type type = fieldInfo.fieldType;
            if ((type instanceof Class) && ((Class) type).isPrimitive()) {
                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            } else {
                if (fieldInfo.fieldClass == String.class) {
                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) String.class)));
                } else {
                    methodVisitor.visitVarInsn(25, 0);
                    methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
                }
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            }
        }
        methodVisitor.visitLabel(label2);
        _seperator(methodVisitor, context);
    }

    private void generateWriteAsArray(Class<?> cls, MethodVisitor methodVisitor, FieldInfo[] fieldInfoArr, Context context) throws Exception {
        String str;
        boolean z10;
        char c10;
        ASMSerializerFactory aSMSerializerFactory;
        char c11;
        int i10;
        int i11;
        Class<?> cls2;
        int i12;
        int i13;
        String str2;
        int i14;
        char c12;
        ASMSerializerFactory aSMSerializerFactory2 = this;
        FieldInfo[] fieldInfoArr2 = fieldInfoArr;
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 0);
        String str3 = JSONSerializer;
        methodVisitor.visitMethodInsn(182, str3, "hasPropertyFilters", "(" + SerializeFilterable_desc + ")Z");
        methodVisitor.visitJumpInsn(154, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, 3);
        methodVisitor.visitVarInsn(25, 4);
        methodVisitor.visitVarInsn(21, 5);
        String str4 = JavaBeanSerializer;
        StringBuilder sb2 = new StringBuilder();
        String str5 = "(L";
        sb2.append("(L");
        sb2.append(str3);
        String str6 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        sb2.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
        methodVisitor.visitMethodInsn(183, str4, "writeNoneASM", sb2.toString());
        methodVisitor.visitInsn(177);
        methodVisitor.visitLabel(label);
        String str7 = "out";
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(16, 91);
        String str8 = SerializeWriter;
        String str9 = "(I)V";
        methodVisitor.visitMethodInsn(182, str8, "write", "(I)V");
        int length = fieldInfoArr2.length;
        if (length == 0) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 93);
            methodVisitor.visitMethodInsn(182, str8, "write", "(I)V");
            return;
        }
        int i15 = 0;
        while (i15 < length) {
            int i16 = i15 == length + (-1) ? 93 : 44;
            FieldInfo fieldInfo = fieldInfoArr2[i15];
            Class<?> cls3 = fieldInfo.fieldClass;
            methodVisitor.visitLdcInsn(fieldInfo.name);
            methodVisitor.visitVarInsn(58, Context.fieldName);
            if (cls3 == Byte.TYPE || cls3 == Short.TYPE || cls3 == Integer.TYPE) {
                str = str7;
                length = length;
                int i17 = i16;
                i15 = i15;
                str5 = str5;
                str9 = str9;
                z10 = false;
                c10 = 25;
                methodVisitor.visitVarInsn(25, context.var(str));
                methodVisitor.visitInsn(89);
                aSMSerializerFactory = this;
                aSMSerializerFactory._get(methodVisitor, context, fieldInfo);
                String str10 = SerializeWriter;
                methodVisitor.visitMethodInsn(182, str10, "writeInt", str9);
                c11 = 16;
                methodVisitor.visitVarInsn(16, i17);
                methodVisitor.visitMethodInsn(182, str10, "write", str9);
            } else {
                if (cls3 == Long.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str7));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                    String str11 = SerializeWriter;
                    c12 = y.f128609r;
                    methodVisitor.visitMethodInsn(182, str11, "writeLong", "(J)V");
                    methodVisitor.visitVarInsn(16, i16);
                    methodVisitor.visitMethodInsn(182, str11, "write", str9);
                } else if (cls3 == Float.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str7));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                    methodVisitor.visitInsn(4);
                    String str12 = SerializeWriter;
                    c12 = y.f128609r;
                    methodVisitor.visitMethodInsn(182, str12, "writeFloat", "(FZ)V");
                    methodVisitor.visitVarInsn(16, i16);
                    methodVisitor.visitMethodInsn(182, str12, "write", str9);
                } else if (cls3 == Double.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str7));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                    methodVisitor.visitInsn(4);
                    String str13 = SerializeWriter;
                    c12 = y.f128609r;
                    methodVisitor.visitMethodInsn(182, str13, "writeDouble", "(DZ)V");
                    methodVisitor.visitVarInsn(16, i16);
                    methodVisitor.visitMethodInsn(182, str13, "write", str9);
                } else {
                    if (cls3 == Boolean.TYPE) {
                        methodVisitor.visitVarInsn(25, context.var(str7));
                        methodVisitor.visitInsn(89);
                        aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                        String str14 = SerializeWriter;
                        methodVisitor.visitMethodInsn(182, str14, "write", "(Z)V");
                        methodVisitor.visitVarInsn(16, i16);
                        methodVisitor.visitMethodInsn(182, str14, "write", str9);
                    } else if (cls3 == Character.TYPE) {
                        methodVisitor.visitVarInsn(25, context.var(str7));
                        aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                        methodVisitor.visitMethodInsn(184, "java/lang/Character", "toString", "(C)Ljava/lang/String;");
                        methodVisitor.visitVarInsn(16, i16);
                        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeString", "(Ljava/lang/String;C)V");
                        length = length;
                        i15 = i15;
                        str5 = str5;
                        z10 = false;
                        c10 = 25;
                        aSMSerializerFactory = aSMSerializerFactory2;
                        str = str7;
                        c11 = 16;
                        str9 = str9;
                    } else if (cls3 == String.class) {
                        methodVisitor.visitVarInsn(25, context.var(str7));
                        aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                        methodVisitor.visitVarInsn(16, i16);
                        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeString", "(Ljava/lang/String;C)V");
                        length = length;
                        c10 = 25;
                        z10 = false;
                        c11 = 16;
                        aSMSerializerFactory = aSMSerializerFactory2;
                        str = str7;
                    } else if (cls3.isEnum()) {
                        methodVisitor.visitVarInsn(25, context.var(str7));
                        methodVisitor.visitInsn(89);
                        aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                        String str15 = SerializeWriter;
                        methodVisitor.visitMethodInsn(182, str15, "writeEnum", "(Ljava/lang/Enum;)V");
                        methodVisitor.visitVarInsn(16, i16);
                        methodVisitor.visitMethodInsn(182, str15, "write", str9);
                    } else if (List.class.isAssignableFrom(cls3)) {
                        java.lang.reflect.Type type = fieldInfo.fieldType;
                        java.lang.reflect.Type type2 = type instanceof Class ? Object.class : ((ParameterizedType) type).getActualTypeArguments()[0];
                        if (!(type2 instanceof Class) || (cls2 = (Class) type2) == Object.class) {
                            cls2 = null;
                        }
                        aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                        length = length;
                        methodVisitor.visitTypeInsn(192, "java/util/List");
                        i15 = i15;
                        methodVisitor.visitVarInsn(58, context.var("list"));
                        if (cls2 == String.class && context.writeDirect) {
                            methodVisitor.visitVarInsn(25, context.var(str7));
                            methodVisitor.visitVarInsn(25, context.var("list"));
                            methodVisitor.visitMethodInsn(182, SerializeWriter, "write", "(Ljava/util/List;)V");
                            str = str7;
                            str5 = str5;
                            str2 = str9;
                            i13 = 16;
                            i14 = 182;
                            i12 = 25;
                        } else {
                            Label label2 = new Label();
                            Label label3 = new Label();
                            methodVisitor.visitVarInsn(25, context.var("list"));
                            methodVisitor.visitJumpInsn(199, label3);
                            methodVisitor.visitVarInsn(25, context.var(str7));
                            String str16 = SerializeWriter;
                            java.lang.reflect.Type type3 = type2;
                            String str17 = str6;
                            methodVisitor.visitMethodInsn(182, str16, "writeNull", "()V");
                            methodVisitor.visitJumpInsn(167, label2);
                            methodVisitor.visitLabel(label3);
                            methodVisitor.visitVarInsn(25, context.var("list"));
                            methodVisitor.visitMethodInsn(185, "java/util/List", UiKitSpanObj.TYPE_SIZE, "()I");
                            methodVisitor.visitVarInsn(54, context.var(UiKitSpanObj.TYPE_SIZE));
                            methodVisitor.visitVarInsn(25, context.var(str7));
                            methodVisitor.visitVarInsn(16, 91);
                            methodVisitor.visitMethodInsn(182, str16, "write", str9);
                            Label label4 = new Label();
                            Label label5 = new Label();
                            Label label6 = new Label();
                            methodVisitor.visitInsn(3);
                            String str18 = str5;
                            methodVisitor.visitVarInsn(54, context.var("i"));
                            methodVisitor.visitLabel(label4);
                            methodVisitor.visitVarInsn(21, context.var("i"));
                            methodVisitor.visitVarInsn(21, context.var(UiKitSpanObj.TYPE_SIZE));
                            methodVisitor.visitJumpInsn(162, label6);
                            methodVisitor.visitVarInsn(21, context.var("i"));
                            methodVisitor.visitJumpInsn(153, label5);
                            methodVisitor.visitVarInsn(25, context.var(str7));
                            methodVisitor.visitVarInsn(16, 44);
                            methodVisitor.visitMethodInsn(182, str16, "write", str9);
                            methodVisitor.visitLabel(label5);
                            methodVisitor.visitVarInsn(25, context.var("list"));
                            methodVisitor.visitVarInsn(21, context.var("i"));
                            methodVisitor.visitMethodInsn(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
                            methodVisitor.visitVarInsn(58, context.var("list_item"));
                            Label label7 = new Label();
                            Label label8 = new Label();
                            String str19 = str9;
                            methodVisitor.visitVarInsn(25, context.var("list_item"));
                            methodVisitor.visitJumpInsn(199, label8);
                            methodVisitor.visitVarInsn(25, context.var(str7));
                            String str20 = str7;
                            methodVisitor.visitMethodInsn(182, str16, "writeNull", "()V");
                            methodVisitor.visitJumpInsn(167, label7);
                            methodVisitor.visitLabel(label8);
                            Label label9 = new Label();
                            Label label10 = new Label();
                            if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                                label4 = label4;
                                label7 = label7;
                                str6 = str17;
                                str5 = str18;
                            } else {
                                methodVisitor.visitVarInsn(25, context.var("list_item"));
                                methodVisitor.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                                methodVisitor.visitJumpInsn(166, label10);
                                aSMSerializerFactory2._getListFieldItemSer(context, methodVisitor, fieldInfo, cls2);
                                methodVisitor.visitVarInsn(58, context.var("list_item_desc"));
                                Label label11 = new Label();
                                Label label12 = new Label();
                                if (context.writeDirect) {
                                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                    String str21 = JavaBeanSerializer;
                                    methodVisitor.visitTypeInsn(193, str21);
                                    methodVisitor.visitJumpInsn(153, label11);
                                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                    methodVisitor.visitTypeInsn(192, str21);
                                    methodVisitor.visitVarInsn(25, 1);
                                    methodVisitor.visitVarInsn(25, context.var("list_item"));
                                    if (context.nonContext) {
                                        methodVisitor.visitInsn(1);
                                    } else {
                                        methodVisitor.visitVarInsn(21, context.var("i"));
                                        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                    }
                                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                                    methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                    StringBuilder sb3 = new StringBuilder();
                                    str5 = str18;
                                    sb3.append(str5);
                                    sb3.append(JSONSerializer);
                                    str6 = str17;
                                    sb3.append(str6);
                                    methodVisitor.visitMethodInsn(182, str21, "writeAsArrayNonContext", sb3.toString());
                                    methodVisitor.visitJumpInsn(167, label12);
                                    methodVisitor.visitLabel(label11);
                                } else {
                                    label4 = label4;
                                    label7 = label7;
                                    str6 = str17;
                                    str5 = str18;
                                }
                                methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                methodVisitor.visitVarInsn(25, 1);
                                methodVisitor.visitVarInsn(25, context.var("list_item"));
                                if (context.nonContext) {
                                    methodVisitor.visitInsn(1);
                                } else {
                                    methodVisitor.visitVarInsn(21, context.var("i"));
                                    methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                }
                                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                methodVisitor.visitMethodInsn(185, ObjectSerializer, "write", str5 + JSONSerializer + str6);
                                methodVisitor.visitLabel(label12);
                                methodVisitor.visitJumpInsn(167, label9);
                            }
                            methodVisitor.visitLabel(label10);
                            methodVisitor.visitVarInsn(25, 1);
                            methodVisitor.visitVarInsn(25, context.var("list_item"));
                            if (context.nonContext) {
                                methodVisitor.visitInsn(1);
                            } else {
                                methodVisitor.visitVarInsn(21, context.var("i"));
                                methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                            }
                            if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                            } else {
                                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) type3)));
                                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                            }
                            methodVisitor.visitLabel(label9);
                            methodVisitor.visitLabel(label7);
                            methodVisitor.visitIincInsn(context.var("i"), 1);
                            methodVisitor.visitJumpInsn(167, label4);
                            methodVisitor.visitLabel(label6);
                            str = str20;
                            i12 = 25;
                            methodVisitor.visitVarInsn(25, context.var(str));
                            i13 = 16;
                            methodVisitor.visitVarInsn(16, 93);
                            str2 = str19;
                            i14 = 182;
                            methodVisitor.visitMethodInsn(182, str16, "write", str2);
                            methodVisitor.visitLabel(label2);
                        }
                        methodVisitor.visitVarInsn(i12, context.var(str));
                        methodVisitor.visitVarInsn(i13, i16);
                        methodVisitor.visitMethodInsn(i14, SerializeWriter, "write", str2);
                        aSMSerializerFactory = this;
                        str9 = str2;
                        z10 = false;
                        c11 = 16;
                        c10 = 25;
                    } else {
                        String str22 = str7;
                        length = length;
                        int i18 = i16;
                        i15 = i15;
                        str5 = str5;
                        String str23 = str9;
                        Label label13 = new Label();
                        Label label14 = new Label();
                        _get(methodVisitor, context, fieldInfo);
                        methodVisitor.visitInsn(89);
                        methodVisitor.visitVarInsn(58, context.var("field_" + fieldInfo.fieldClass.getName()));
                        methodVisitor.visitJumpInsn(199, label14);
                        methodVisitor.visitVarInsn(25, context.var(str22));
                        String str24 = SerializeWriter;
                        methodVisitor.visitMethodInsn(182, str24, "writeNull", "()V");
                        methodVisitor.visitJumpInsn(167, label13);
                        methodVisitor.visitLabel(label14);
                        Label label15 = new Label();
                        Label label16 = new Label();
                        methodVisitor.visitVarInsn(25, context.var("field_" + fieldInfo.fieldClass.getName()));
                        methodVisitor.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                        methodVisitor.visitJumpInsn(166, label16);
                        _getFieldSer(context, methodVisitor, fieldInfo);
                        methodVisitor.visitVarInsn(58, context.var("fied_ser"));
                        Label label17 = new Label();
                        Label label18 = new Label();
                        if (context.writeDirect && Modifier.isPublic(cls3.getModifiers())) {
                            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                            String str25 = JavaBeanSerializer;
                            methodVisitor.visitTypeInsn(193, str25);
                            methodVisitor.visitJumpInsn(153, label17);
                            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                            methodVisitor.visitTypeInsn(192, str25);
                            methodVisitor.visitVarInsn(25, 1);
                            methodVisitor.visitVarInsn(25, context.var("field_" + fieldInfo.fieldClass.getName()));
                            methodVisitor.visitVarInsn(25, Context.fieldName);
                            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                            methodVisitor.visitMethodInsn(182, str25, "writeAsArrayNonContext", str5 + JSONSerializer + str6);
                            methodVisitor.visitJumpInsn(167, label18);
                            methodVisitor.visitLabel(label17);
                        }
                        methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                        methodVisitor.visitVarInsn(25, 1);
                        methodVisitor.visitVarInsn(25, context.var("field_" + fieldInfo.fieldClass.getName()));
                        methodVisitor.visitVarInsn(25, Context.fieldName);
                        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                        methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                        String str26 = ObjectSerializer;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str5);
                        String str27 = JSONSerializer;
                        sb4.append(str27);
                        sb4.append(str6);
                        methodVisitor.visitMethodInsn(185, str26, "write", sb4.toString());
                        methodVisitor.visitLabel(label18);
                        methodVisitor.visitJumpInsn(167, label15);
                        methodVisitor.visitLabel(label16);
                        String format = fieldInfo.getFormat();
                        methodVisitor.visitVarInsn(25, 1);
                        methodVisitor.visitVarInsn(25, context.var("field_" + fieldInfo.fieldClass.getName()));
                        if (format != null) {
                            methodVisitor.visitLdcInsn(format);
                            i10 = 182;
                            methodVisitor.visitMethodInsn(182, str27, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
                        } else {
                            i10 = 182;
                            methodVisitor.visitVarInsn(25, Context.fieldName);
                            java.lang.reflect.Type type4 = fieldInfo.fieldType;
                            if ((type4 instanceof Class) && ((Class) type4).isPrimitive()) {
                                methodVisitor.visitMethodInsn(182, str27, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                            } else {
                                z10 = false;
                                methodVisitor.visitVarInsn(25, 0);
                                methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
                                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                i11 = 182;
                                methodVisitor.visitMethodInsn(182, str27, r9, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                            }
                            methodVisitor.visitLabel(label15);
                            methodVisitor.visitLabel(label13);
                            str = str22;
                            c10 = 25;
                            methodVisitor.visitVarInsn(25, context.var(str));
                            methodVisitor.visitVarInsn(16, i18);
                            str9 = str23;
                            methodVisitor.visitMethodInsn(i11, str24, "write", str9);
                            aSMSerializerFactory = this;
                            c11 = 16;
                        }
                        i11 = i10;
                        z10 = false;
                        methodVisitor.visitLabel(label15);
                        methodVisitor.visitLabel(label13);
                        str = str22;
                        c10 = 25;
                        methodVisitor.visitVarInsn(25, context.var(str));
                        methodVisitor.visitVarInsn(16, i18);
                        str9 = str23;
                        methodVisitor.visitMethodInsn(i11, str24, "write", str9);
                        aSMSerializerFactory = this;
                        c11 = 16;
                    }
                    z10 = false;
                    c10 = 25;
                    c11 = 16;
                    aSMSerializerFactory = aSMSerializerFactory2;
                    str = str7;
                }
                z10 = false;
                c10 = 25;
                c11 = 16;
                aSMSerializerFactory = aSMSerializerFactory2;
                str = str7;
            }
            str9 = str9;
            length = length;
            fieldInfoArr2 = fieldInfoArr;
            str5 = str5;
            str7 = str;
            aSMSerializerFactory2 = aSMSerializerFactory;
            i15++;
        }
    }

    private void generateWriteMethod(Class<?> cls, MethodVisitor methodVisitor, FieldInfo[] fieldInfoArr, Context context) throws Exception {
        String str;
        int i10;
        String str2;
        int i11;
        Class<?> cls2;
        Label label = new Label();
        int length = fieldInfoArr.length;
        String str3 = "out";
        if (!context.writeDirect) {
            Label label2 = new Label();
            Label label3 = new Label();
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.PrettyFormat.mask));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(154, label3);
            int length2 = fieldInfoArr.length;
            int i12 = 0;
            boolean z10 = false;
            while (i12 < length2) {
                int i13 = length2;
                if (fieldInfoArr[i12].method != null) {
                    z10 = true;
                }
                i12++;
                length2 = i13;
            }
            if (z10) {
                methodVisitor.visitVarInsn(25, context.var("out"));
                methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.IgnoreErrorGetter.mask));
                methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
                methodVisitor.visitJumpInsn(153, label2);
            } else {
                methodVisitor.visitJumpInsn(167, label2);
            }
            methodVisitor.visitLabel(label3);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(25, 3);
            methodVisitor.visitVarInsn(25, 4);
            methodVisitor.visitVarInsn(21, 5);
            methodVisitor.visitMethodInsn(183, JavaBeanSerializer, "write", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitInsn(177);
            methodVisitor.visitLabel(label2);
        }
        if (!context.nonContext) {
            Label label4 = new Label();
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(21, 5);
            methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "writeReference", "(L" + JSONSerializer + ";Ljava/lang/Object;I)Z");
            methodVisitor.visitJumpInsn(153, label4);
            methodVisitor.visitInsn(177);
            methodVisitor.visitLabel(label4);
        }
        if (context.writeDirect) {
            str = context.nonContext ? "writeAsArrayNonContext" : "writeAsArray";
        } else {
            str = "writeAsArrayNormal";
        }
        int i14 = context.beanInfo.features;
        SerializerFeature serializerFeature = SerializerFeature.BeanToArray;
        if ((i14 & serializerFeature.mask) == 0) {
            Label label5 = new Label();
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(serializerFeature.mask));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(153, label5);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(25, 3);
            methodVisitor.visitVarInsn(25, 4);
            methodVisitor.visitVarInsn(21, 5);
            methodVisitor.visitMethodInsn(182, context.className, str, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitInsn(177);
            methodVisitor.visitLabel(label5);
        } else {
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(25, 3);
            methodVisitor.visitVarInsn(25, 4);
            methodVisitor.visitVarInsn(21, 5);
            methodVisitor.visitMethodInsn(182, context.className, str, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitInsn(177);
        }
        String str4 = "parent";
        if (!context.nonContext) {
            methodVisitor.visitVarInsn(25, 1);
            String str5 = JSONSerializer;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("()");
            String str6 = SerialContext_desc;
            sb2.append(str6);
            methodVisitor.visitMethodInsn(182, str5, "getContext", sb2.toString());
            methodVisitor.visitVarInsn(58, context.var("parent"));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("parent"));
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(25, 3);
            methodVisitor.visitLdcInsn(Integer.valueOf(context.beanInfo.features));
            methodVisitor.visitMethodInsn(182, str5, "setContext", "(" + str6 + "Ljava/lang/Object;Ljava/lang/Object;I)V");
        }
        boolean z11 = (context.beanInfo.features & SerializerFeature.WriteClassName.mask) != 0;
        if (z11 || !context.writeDirect) {
            Label label6 = new Label();
            Label label7 = new Label();
            Label label8 = new Label();
            if (z11) {
                i10 = 182;
            } else {
                methodVisitor.visitVarInsn(25, 1);
                methodVisitor.visitVarInsn(25, 4);
                methodVisitor.visitVarInsn(25, 2);
                i10 = 182;
                methodVisitor.visitMethodInsn(182, JSONSerializer, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                methodVisitor.visitJumpInsn(153, label7);
            }
            methodVisitor.visitVarInsn(25, 4);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitMethodInsn(i10, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            methodVisitor.visitJumpInsn(165, label7);
            methodVisitor.visitLabel(label8);
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 123);
            methodVisitor.visitMethodInsn(i10, SerializeWriter, "write", "(I)V");
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            if (context.beanInfo.typeKey != null) {
                methodVisitor.visitLdcInsn(context.beanInfo.typeKey);
            } else {
                methodVisitor.visitInsn(1);
            }
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "writeClassName", "(L" + JSONSerializer + ";Ljava/lang/String;Ljava/lang/Object;)V");
            methodVisitor.visitVarInsn(16, 44);
            methodVisitor.visitJumpInsn(167, label6);
            methodVisitor.visitLabel(label7);
            methodVisitor.visitVarInsn(16, 123);
            methodVisitor.visitLabel(label6);
        } else {
            methodVisitor.visitVarInsn(16, 123);
            str4 = "parent";
        }
        methodVisitor.visitVarInsn(54, context.var("seperator"));
        if (!context.writeDirect) {
            _before(methodVisitor, context);
        }
        if (!context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isNotWriteDefaultValue", "()Z");
            methodVisitor.visitVarInsn(54, context.var("notWriteDefaultValue"));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 0);
            String str7 = JSONSerializer;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("(");
            String str8 = SerializeFilterable_desc;
            sb3.append(str8);
            sb3.append(")Z");
            methodVisitor.visitMethodInsn(182, str7, "checkValue", sb3.toString());
            methodVisitor.visitVarInsn(54, context.var("checkValue"));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(182, str7, "hasNameFilters", "(" + str8 + ")Z");
            methodVisitor.visitVarInsn(54, context.var("hasNameFilters"));
        }
        int i15 = 0;
        while (i15 < length) {
            FieldInfo fieldInfo = fieldInfoArr[i15];
            Class<?> cls3 = fieldInfo.fieldClass;
            methodVisitor.visitLdcInsn(fieldInfo.name);
            methodVisitor.visitVarInsn(58, Context.fieldName);
            if (cls3 == Byte.TYPE || cls3 == Short.TYPE || cls3 == Integer.TYPE) {
                str2 = str3;
                i11 = i15;
                _int(cls, methodVisitor, fieldInfo, context, context.var(cls3.getName()), 'I');
            } else {
                if (cls3 == Long.TYPE) {
                    cls2 = cls;
                    _long(cls2, methodVisitor, fieldInfo, context);
                } else {
                    cls2 = cls;
                    if (cls3 == Float.TYPE) {
                        _float(cls2, methodVisitor, fieldInfo, context);
                    } else if (cls3 == Double.TYPE) {
                        _double(cls2, methodVisitor, fieldInfo, context);
                    } else if (cls3 == Boolean.TYPE) {
                        str2 = str3;
                        i11 = i15;
                        _int(cls, methodVisitor, fieldInfo, context, context.var("boolean"), 'Z');
                    } else {
                        str2 = str3;
                        i11 = i15;
                        if (cls3 == Character.TYPE) {
                            _int(cls, methodVisitor, fieldInfo, context, context.var(Constants.CHAR), 'C');
                        } else if (cls3 == String.class) {
                            _string(cls2, methodVisitor, fieldInfo, context);
                        } else if (cls3 == BigDecimal.class) {
                            _decimal(cls2, methodVisitor, fieldInfo, context);
                        } else if (List.class.isAssignableFrom(cls3)) {
                            _list(cls2, methodVisitor, fieldInfo, context);
                        } else if (cls3.isEnum()) {
                            _enum(cls2, methodVisitor, fieldInfo, context);
                        } else {
                            _object(cls2, methodVisitor, fieldInfo, context);
                        }
                    }
                }
                str2 = str3;
                i11 = i15;
            }
            i15 = i11 + 1;
            str3 = str2;
        }
        String str9 = str3;
        if (!context.writeDirect) {
            _after(methodVisitor, context);
        }
        Label label9 = new Label();
        Label label10 = new Label();
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitIntInsn(16, 123);
        methodVisitor.visitJumpInsn(160, label9);
        methodVisitor.visitVarInsn(25, context.var(str9));
        methodVisitor.visitVarInsn(16, 123);
        String str10 = SerializeWriter;
        methodVisitor.visitMethodInsn(182, str10, "write", "(I)V");
        methodVisitor.visitLabel(label9);
        methodVisitor.visitVarInsn(25, context.var(str9));
        methodVisitor.visitVarInsn(16, 125);
        methodVisitor.visitMethodInsn(182, str10, "write", "(I)V");
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLabel(label);
        if (context.nonContext) {
            return;
        }
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var(str4));
        methodVisitor.visitMethodInsn(182, JSONSerializer, "setContext", "(" + SerialContext_desc + ")V");
    }

    public JavaBeanSerializer createJavaBeanSerializer(SerializeBeanInfo serializeBeanInfo) throws Exception {
        String str;
        String str2;
        boolean z10;
        Class<SerializeBeanInfo> cls;
        String str3;
        boolean z11;
        boolean z12;
        String str4;
        boolean z13;
        boolean z14;
        String str5;
        int i10;
        char c10;
        Method method;
        Class<SerializeBeanInfo> cls2 = SerializeBeanInfo.class;
        Class<?> cls3 = serializeBeanInfo.beanType;
        if (cls3.isPrimitive()) {
            throw new JSONException("unsupportd class " + cls3.getName());
        }
        JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls3, JSONType.class);
        FieldInfo[] fieldInfoArr = serializeBeanInfo.fields;
        for (FieldInfo fieldInfo : fieldInfoArr) {
            if (fieldInfo.field == null && (method = fieldInfo.method) != null && method.getDeclaringClass().isInterface()) {
                return new JavaBeanSerializer(serializeBeanInfo);
            }
        }
        FieldInfo[] fieldInfoArr2 = serializeBeanInfo.sortedFields;
        boolean z15 = fieldInfoArr2 == serializeBeanInfo.fields;
        if (fieldInfoArr2.length > 256) {
            return new JavaBeanSerializer(serializeBeanInfo);
        }
        for (FieldInfo fieldInfo2 : fieldInfoArr2) {
            if (!ASMUtils.checkName(fieldInfo2.getMember().getName())) {
                return new JavaBeanSerializer(serializeBeanInfo);
            }
        }
        String str6 = "ASMSerializer_" + this.seed.incrementAndGet() + a.f131412e + cls3.getSimpleName();
        Package r10 = ASMSerializerFactory.class.getPackage();
        if (r10 != null) {
            String name = r10.getName();
            str = name + "." + str6;
            str2 = name.replace(a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + "/" + str6;
        } else {
            str = str6;
            str2 = str;
        }
        ASMSerializerFactory.class.getPackage().getName();
        ClassWriter classWriter = new ClassWriter();
        classWriter.visit(49, 33, str2, JavaBeanSerializer, new String[]{ObjectSerializer});
        int length = fieldInfoArr2.length;
        int i11 = 0;
        while (i11 < length) {
            FieldInfo fieldInfo3 = fieldInfoArr2[i11];
            if (!fieldInfo3.fieldClass.isPrimitive() && fieldInfo3.fieldClass != String.class) {
                new FieldWriter(classWriter, 1, fieldInfo3.name + "_asm_fieldType", "Ljava/lang/reflect/Type;").visitEnd();
                if (List.class.isAssignableFrom(fieldInfo3.fieldClass)) {
                    new FieldWriter(classWriter, 1, fieldInfo3.name + "_asm_list_item_ser_", ObjectSerializer_desc).visitEnd();
                }
                new FieldWriter(classWriter, 1, fieldInfo3.name + "_asm_ser_", ObjectSerializer_desc).visitEnd();
            }
            i11++;
            length = length;
            str = str;
        }
        String str7 = str;
        MethodWriter methodWriter = new MethodWriter(classWriter, 1, "<init>", "(" + ASMUtils.desc(cls2) + ")V", null, null);
        int i12 = 25;
        methodWriter.visitVarInsn(25, 0);
        methodWriter.visitVarInsn(25, 1);
        methodWriter.visitMethodInsn(183, JavaBeanSerializer, "<init>", "(" + ASMUtils.desc(cls2) + ")V");
        int i13 = 0;
        while (i13 < fieldInfoArr2.length) {
            FieldInfo fieldInfo4 = fieldInfoArr2[i13];
            if (fieldInfo4.fieldClass.isPrimitive() || fieldInfo4.fieldClass == String.class) {
                classWriter = classWriter;
            } else {
                methodWriter.visitVarInsn(i12, 0);
                if (fieldInfo4.method != null) {
                    methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo4.declaringClass)));
                    methodWriter.visitLdcInsn(fieldInfo4.method.getName());
                    methodWriter.visitMethodInsn(184, ASMUtils.type(ASMUtils.class), "getMethodType", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");
                } else {
                    methodWriter.visitVarInsn(i12, 0);
                    methodWriter.visitLdcInsn(Integer.valueOf(i13));
                    methodWriter.visitMethodInsn(183, JavaBeanSerializer, "getFieldType", "(I)Ljava/lang/reflect/Type;");
                }
                methodWriter.visitFieldInsn(181, str2, fieldInfo4.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            }
            i13++;
            classWriter = classWriter;
            i12 = 25;
        }
        ClassWriter classWriter2 = classWriter;
        methodWriter.visitInsn(177);
        methodWriter.visitMaxs(4, 4);
        methodWriter.visitEnd();
        if (jSONType == null) {
            z10 = false;
            break;
        }
        SerializerFeature[] serializerFeatureArrSerialzeFeatures = jSONType.serialzeFeatures();
        int length2 = serializerFeatureArrSerialzeFeatures.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                z10 = false;
                break;
            }
            if (serializerFeatureArrSerialzeFeatures[i14] == SerializerFeature.DisableCircularReferenceDetect) {
                z10 = true;
                break;
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            cls = cls2;
            if (i15 >= 3) {
                break;
            }
            if (i15 == 0) {
                str4 = "write";
                z14 = z10;
                z13 = true;
            } else if (i15 == 1) {
                str4 = "writeNormal";
                z14 = z10;
                z13 = false;
            } else {
                str4 = "writeDirectNonContext";
                z13 = true;
                z14 = true;
            }
            ClassWriter classWriter3 = classWriter2;
            String str8 = str7;
            int i16 = i15;
            String str9 = str2;
            Context context = new Context(fieldInfoArr2, serializeBeanInfo, str2, z13, z14);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(L");
            String str10 = JSONSerializer;
            sb2.append(str10);
            sb2.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            MethodWriter methodWriter2 = new MethodWriter(classWriter3, 1, str4, sb2.toString(), null, new String[]{"java/io/IOException"});
            Label label = new Label();
            methodWriter2.visitVarInsn(25, 2);
            methodWriter2.visitJumpInsn(199, label);
            methodWriter2.visitVarInsn(25, 1);
            methodWriter2.visitMethodInsn(182, str10, "writeNull", "()V");
            methodWriter2.visitInsn(177);
            methodWriter2.visitLabel(label);
            methodWriter2.visitVarInsn(25, 1);
            methodWriter2.visitFieldInsn(180, str10, "out", SerializeWriter_desc);
            methodWriter2.visitVarInsn(58, context.var("out"));
            if (z15 || context.writeDirect || !(jSONType == null || jSONType.alphabetic())) {
                str5 = str9;
            } else {
                Label label2 = new Label();
                methodWriter2.visitVarInsn(25, context.var("out"));
                methodWriter2.visitMethodInsn(182, SerializeWriter, "isSortField", "()Z");
                methodWriter2.visitJumpInsn(154, label2);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                str5 = str9;
                methodWriter2.visitMethodInsn(182, str5, "writeUnsorted", "(L" + str10 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodWriter2.visitInsn(177);
                methodWriter2.visitLabel(label2);
            }
            if (!context.writeDirect || z14) {
                i10 = 177;
                c10 = 4;
            } else {
                Label label3 = new Label();
                Label label4 = new Label();
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitMethodInsn(182, JavaBeanSerializer, "writeDirect", "(L" + str10 + ";)Z");
                methodWriter2.visitJumpInsn(154, label4);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                methodWriter2.visitMethodInsn(182, str5, "writeNormal", "(L" + str10 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodWriter2.visitInsn(177);
                methodWriter2.visitLabel(label4);
                methodWriter2.visitVarInsn(25, context.var("out"));
                methodWriter2.visitLdcInsn(Integer.valueOf(SerializerFeature.DisableCircularReferenceDetect.mask));
                methodWriter2.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
                methodWriter2.visitJumpInsn(153, label3);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                c10 = 4;
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                methodWriter2.visitMethodInsn(182, str5, "writeDirectNonContext", "(L" + str10 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                i10 = 177;
                methodWriter2.visitInsn(177);
                methodWriter2.visitLabel(label3);
            }
            methodWriter2.visitVarInsn(25, 2);
            methodWriter2.visitTypeInsn(192, ASMUtils.type(cls3));
            methodWriter2.visitVarInsn(58, context.var("entity"));
            generateWriteMethod(cls3, methodWriter2, fieldInfoArr2, context);
            methodWriter2.visitInsn(i10);
            methodWriter2.visitMaxs(7, context.variantIndex + 2);
            methodWriter2.visitEnd();
            int i17 = i16 + 1;
            str2 = str5;
            jSONType = jSONType;
            z15 = z15;
            cls2 = cls;
            fieldInfoArr = fieldInfoArr;
            classWriter2 = classWriter3;
            str7 = str8;
            i15 = i17;
        }
        String str11 = str2;
        FieldInfo[] fieldInfoArr3 = fieldInfoArr;
        ClassWriter classWriter4 = classWriter2;
        String str12 = str7;
        if (!z15) {
            Context context2 = new Context(fieldInfoArr2, serializeBeanInfo, str11, false, z10);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("(L");
            String str13 = JSONSerializer;
            sb3.append(str13);
            sb3.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            MethodWriter methodWriter3 = new MethodWriter(classWriter4, 1, "writeUnsorted", sb3.toString(), null, new String[]{"java/io/IOException"});
            methodWriter3.visitVarInsn(25, 1);
            methodWriter3.visitFieldInsn(180, str13, "out", SerializeWriter_desc);
            methodWriter3.visitVarInsn(58, context2.var("out"));
            methodWriter3.visitVarInsn(25, 2);
            methodWriter3.visitTypeInsn(192, ASMUtils.type(cls3));
            methodWriter3.visitVarInsn(58, context2.var("entity"));
            generateWriteMethod(cls3, methodWriter3, fieldInfoArr3, context2);
            methodWriter3.visitInsn(177);
            methodWriter3.visitMaxs(7, context2.variantIndex + 2);
            methodWriter3.visitEnd();
        }
        int i18 = 0;
        for (int i19 = 3; i18 < i19; i19 = i19) {
            if (i18 == 0) {
                str3 = "writeAsArray";
                z12 = z10;
                z11 = true;
            } else if (i18 == 1) {
                str3 = "writeAsArrayNormal";
                z12 = z10;
                z11 = false;
            } else {
                str3 = "writeAsArrayNonContext";
                z11 = true;
                z12 = true;
            }
            Context context3 = new Context(fieldInfoArr2, serializeBeanInfo, str11, z11, z12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("(L");
            String str14 = JSONSerializer;
            sb4.append(str14);
            sb4.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            MethodWriter methodWriter4 = new MethodWriter(classWriter4, 1, str3, sb4.toString(), null, new String[]{"java/io/IOException"});
            methodWriter4.visitVarInsn(25, 1);
            methodWriter4.visitFieldInsn(180, str14, "out", SerializeWriter_desc);
            methodWriter4.visitVarInsn(58, context3.var("out"));
            methodWriter4.visitVarInsn(25, 2);
            methodWriter4.visitTypeInsn(192, ASMUtils.type(cls3));
            methodWriter4.visitVarInsn(58, context3.var("entity"));
            generateWriteAsArray(cls3, methodWriter4, fieldInfoArr2, context3);
            methodWriter4.visitInsn(177);
            methodWriter4.visitMaxs(7, context3.variantIndex + 2);
            methodWriter4.visitEnd();
            i18++;
        }
        byte[] byteArray = classWriter4.toByteArray();
        return (JavaBeanSerializer) this.classLoader.defineClassPublic(str12, byteArray, 0, byteArray.length).getConstructor(cls).newInstance(serializeBeanInfo);
    }
}
