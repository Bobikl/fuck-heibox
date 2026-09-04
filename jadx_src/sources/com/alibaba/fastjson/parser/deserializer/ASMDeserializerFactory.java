package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.asm.ClassWriter;
import com.alibaba.fastjson.asm.FieldWriter;
import com.alibaba.fastjson.asm.Label;
import com.alibaba.fastjson.asm.MethodVisitor;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.asm.Type;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.SymbolTable;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.TypeUtils;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class ASMDeserializerFactory implements Opcodes {
    static final String DefaultJSONParser = ASMUtils.type(DefaultJSONParser.class);
    static final String JSONLexerBase = ASMUtils.type(JSONLexerBase.class);
    public final ASMClassLoader classLoader;
    protected final AtomicLong seed = new AtomicLong();

    public static class Context {
        static final int fieldName = 3;
        static final int parser = 1;
        static final int type = 2;
        private final JavaBeanInfo beanInfo;
        private final String className;
        private final Class<?> clazz;
        private FieldInfo[] fieldInfoList;
        private int variantIndex;
        private final Map<String, Integer> variants = new HashMap();

        public Context(String str, ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, int i10) {
            this.variantIndex = -1;
            this.className = str;
            this.clazz = javaBeanInfo.clazz;
            this.variantIndex = i10;
            this.beanInfo = javaBeanInfo;
            this.fieldInfoList = javaBeanInfo.fields;
        }

        public Class<?> getInstClass() {
            Class<?> cls = this.beanInfo.builderClass;
            return cls == null ? this.clazz : cls;
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

    public ASMDeserializerFactory(ClassLoader classLoader) {
        this.classLoader = classLoader instanceof ASMClassLoader ? (ASMClassLoader) classLoader : new ASMClassLoader(classLoader);
    }

    private void _batchSet(Context context, MethodVisitor methodVisitor) {
        _batchSet(context, methodVisitor, true);
    }

    private void _batchSet(Context context, MethodVisitor methodVisitor, boolean z10) {
        int length = context.fieldInfoList.length;
        for (int i10 = 0; i10 < length; i10++) {
            Label label = new Label();
            if (z10) {
                _isFlag(methodVisitor, context, i10, label);
            }
            _loadAndSet(context, methodVisitor, context.fieldInfoList[i10]);
            if (z10) {
                methodVisitor.visitLabel(label);
            }
        }
    }

    private void _createInstance(ClassWriter classWriter, Context context) {
        if (Modifier.isPublic(context.beanInfo.defaultConstructor.getModifiers())) {
            MethodWriter methodWriter = new MethodWriter(classWriter, 1, "createInstance", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;)Ljava/lang/Object;", null, null);
            methodWriter.visitTypeInsn(187, ASMUtils.type(context.getInstClass()));
            methodWriter.visitInsn(89);
            methodWriter.visitMethodInsn(183, ASMUtils.type(context.getInstClass()), "<init>", "()V");
            methodWriter.visitInsn(176);
            methodWriter.visitMaxs(3, 3);
            methodWriter.visitEnd();
        }
    }

    private void _createInstance(Context context, MethodVisitor methodVisitor) {
        Constructor<?> constructor = context.beanInfo.defaultConstructor;
        if (Modifier.isPublic(constructor.getModifiers())) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(context.getInstClass()));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(constructor.getDeclaringClass()), "<init>", "()V");
            methodVisitor.visitVarInsn(58, context.var("instance"));
            return;
        }
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, ASMUtils.type(JavaBeanDeserializer.class), "clazz", "Ljava/lang/Class;");
        methodVisitor.visitMethodInsn(183, ASMUtils.type(JavaBeanDeserializer.class), "createInstance", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;)Ljava/lang/Object;");
        methodVisitor.visitTypeInsn(192, ASMUtils.type(context.getInstClass()));
        methodVisitor.visitVarInsn(58, context.var("instance"));
    }

    private void _deserObject(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo, Class<?> cls, int i10) {
        int i11;
        _getFieldDeser(context, methodVisitor, fieldInfo);
        Label label = new Label();
        Label label2 = new Label();
        if ((fieldInfo.parserFeatures & Feature.SupportArrayToBean.mask) != 0) {
            methodVisitor.visitInsn(89);
            methodVisitor.visitTypeInsn(193, ASMUtils.type(JavaBeanDeserializer.class));
            methodVisitor.visitJumpInsn(153, label);
            methodVisitor.visitTypeInsn(192, ASMUtils.type(JavaBeanDeserializer.class));
            methodVisitor.visitVarInsn(25, 1);
            if (fieldInfo.fieldType instanceof Class) {
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
            } else {
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitLdcInsn(Integer.valueOf(i10));
                methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
            }
            methodVisitor.visitLdcInsn(fieldInfo.name);
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.parserFeatures));
            methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "deserialze", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;");
            methodVisitor.visitTypeInsn(192, ASMUtils.type(cls));
            methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label);
            i11 = 1;
        } else {
            i11 = 1;
        }
        methodVisitor.visitVarInsn(25, i11);
        if (fieldInfo.fieldType instanceof Class) {
            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
        } else {
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitLdcInsn(Integer.valueOf(i10));
            methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
        }
        methodVisitor.visitLdcInsn(fieldInfo.name);
        methodVisitor.visitMethodInsn(185, ASMUtils.type(ObjectDeserializer.class), "deserialze", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        methodVisitor.visitTypeInsn(192, ASMUtils.type(cls));
        methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitLabel(label2);
    }

    private void _deserialize_endCheck(Context context, MethodVisitor methodVisitor, Label label) {
        methodVisitor.visitIntInsn(21, context.var("matchedCount"));
        methodVisitor.visitJumpInsn(158, label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, JSONLexerBase, "token", "()I");
        methodVisitor.visitLdcInsn(13);
        methodVisitor.visitJumpInsn(160, label);
        _quickNextTokenComma(context, methodVisitor);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0e1e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0e3f  */
    private void _deserialze(ClassWriter classWriter, Context context) {
        int i10;
        Label label;
        int i11;
        MethodWriter methodWriter;
        Label label2;
        Label label3;
        int i12;
        char c10;
        String str;
        Label label4;
        ASMDeserializerFactory aSMDeserializerFactory = this;
        if (context.fieldInfoList.length == 0) {
            return;
        }
        for (FieldInfo fieldInfo : context.fieldInfoList) {
            Class<?> cls = fieldInfo.fieldClass;
            java.lang.reflect.Type type = fieldInfo.fieldType;
            if (cls == Character.TYPE) {
                return;
            }
            if (Collection.class.isAssignableFrom(cls) && (!(type instanceof ParameterizedType) || !(((ParameterizedType) type).getActualTypeArguments()[0] instanceof Class))) {
                return;
            }
        }
        JavaBeanInfo javaBeanInfo = context.beanInfo;
        context.fieldInfoList = javaBeanInfo.sortedFields;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(L");
        String str2 = DefaultJSONParser;
        sb2.append(str2);
        sb2.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;");
        MethodWriter methodWriter2 = new MethodWriter(classWriter, 1, "deserialze", sb2.toString(), null, null);
        Label label5 = new Label();
        Label label6 = new Label();
        Label label7 = new Label();
        Label label8 = new Label();
        aSMDeserializerFactory.defineVarLexer(context, methodWriter2);
        Label label9 = new Label();
        methodWriter2.visitVarInsn(25, context.var("lexer"));
        String str3 = JSONLexerBase;
        methodWriter2.visitMethodInsn(182, str3, "token", "()I");
        methodWriter2.visitLdcInsn(14);
        methodWriter2.visitJumpInsn(160, label9);
        int i13 = javaBeanInfo.parserFeatures;
        Feature feature = Feature.SupportArrayToBean;
        if ((i13 & feature.mask) == 0) {
            methodWriter2.visitVarInsn(25, context.var("lexer"));
            methodWriter2.visitVarInsn(21, 4);
            methodWriter2.visitLdcInsn(Integer.valueOf(feature.mask));
            methodWriter2.visitMethodInsn(182, str3, "isEnabled", "(II)Z");
            methodWriter2.visitJumpInsn(153, label9);
        }
        methodWriter2.visitVarInsn(25, 0);
        methodWriter2.visitVarInsn(25, 1);
        methodWriter2.visitVarInsn(25, 2);
        methodWriter2.visitVarInsn(25, 3);
        methodWriter2.visitInsn(1);
        methodWriter2.visitMethodInsn(183, context.className, "deserialzeArrayMapping", "(L" + str2 + ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");
        methodWriter2.visitInsn(176);
        methodWriter2.visitLabel(label9);
        methodWriter2.visitVarInsn(25, context.var("lexer"));
        methodWriter2.visitLdcInsn(Integer.valueOf(Feature.SortFeidFastMatch.mask));
        methodWriter2.visitMethodInsn(182, str3, "isEnabled", "(I)Z");
        methodWriter2.visitJumpInsn(153, label6);
        methodWriter2.visitVarInsn(25, context.var("lexer"));
        methodWriter2.visitLdcInsn(context.clazz.getName());
        methodWriter2.visitMethodInsn(182, str3, "scanType", "(Ljava/lang/String;)I");
        methodWriter2.visitLdcInsn(-1);
        methodWriter2.visitJumpInsn(159, label6);
        methodWriter2.visitVarInsn(25, 1);
        methodWriter2.visitMethodInsn(182, str2, "getContext", "()" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodWriter2.visitVarInsn(58, context.var("mark_context"));
        methodWriter2.visitInsn(3);
        methodWriter2.visitVarInsn(54, context.var("matchedCount"));
        aSMDeserializerFactory._createInstance(context, methodWriter2);
        methodWriter2.visitVarInsn(25, 1);
        methodWriter2.visitMethodInsn(182, str2, "getContext", "()" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodWriter2.visitVarInsn(58, context.var(d.R));
        methodWriter2.visitVarInsn(25, 1);
        methodWriter2.visitVarInsn(25, context.var(d.R));
        methodWriter2.visitVarInsn(25, context.var("instance"));
        methodWriter2.visitVarInsn(25, 3);
        methodWriter2.visitMethodInsn(182, str2, "setContext", "(" + ASMUtils.desc((Class<?>) ParseContext.class) + "Ljava/lang/Object;Ljava/lang/Object;)" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodWriter2.visitVarInsn(58, context.var("childContext"));
        methodWriter2.visitVarInsn(25, context.var("lexer"));
        String str4 = "matchStat";
        String str5 = "I";
        methodWriter2.visitFieldInsn(180, str3, "matchStat", "I");
        methodWriter2.visitLdcInsn(4);
        methodWriter2.visitJumpInsn(159, label7);
        int i14 = 3;
        methodWriter2.visitInsn(3);
        methodWriter2.visitIntInsn(54, context.var("matchStat"));
        int length = context.fieldInfoList.length;
        int i15 = 0;
        while (i15 < length) {
            methodWriter2.visitInsn(i14);
            methodWriter2.visitVarInsn(54, context.var("_asm_flag_" + (i15 / 32)));
            i15 += 32;
            i14 = 3;
        }
        methodWriter2.visitVarInsn(25, context.var("lexer"));
        methodWriter2.visitLdcInsn(Integer.valueOf(Feature.InitStringFieldAsEmpty.mask));
        methodWriter2.visitMethodInsn(182, JSONLexerBase, "isEnabled", "(I)Z");
        methodWriter2.visitIntInsn(54, context.var("initStringFieldAsEmpty"));
        int i16 = 0;
        while (i16 < length) {
            FieldInfo fieldInfo2 = context.fieldInfoList[i16];
            Class<?> cls2 = fieldInfo2.fieldClass;
            if (cls2 == Boolean.TYPE || cls2 == Byte.TYPE || cls2 == Short.TYPE || cls2 == Integer.TYPE) {
                label5 = label5;
                label6 = label6;
                label7 = label7;
                label8 = label8;
                methodWriter2.visitInsn(3);
                methodWriter2.visitVarInsn(54, context.var(fieldInfo2.name + "_asm"));
            } else {
                if (cls2 == Long.TYPE) {
                    methodWriter2.visitInsn(9);
                    methodWriter2.visitVarInsn(55, context.var(fieldInfo2.name + "_asm", 2));
                } else if (cls2 == Float.TYPE) {
                    methodWriter2.visitInsn(11);
                    methodWriter2.visitVarInsn(56, context.var(fieldInfo2.name + "_asm"));
                } else if (cls2 == Double.TYPE) {
                    methodWriter2.visitInsn(14);
                    methodWriter2.visitVarInsn(57, context.var(fieldInfo2.name + "_asm", 2));
                } else {
                    if (cls2 == String.class) {
                        Label label10 = new Label();
                        Label label11 = new Label();
                        methodWriter2.visitVarInsn(21, context.var("initStringFieldAsEmpty"));
                        methodWriter2.visitJumpInsn(153, label11);
                        aSMDeserializerFactory._setFlag(methodWriter2, context, i16);
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "stringDefaultValue", "()Ljava/lang/String;");
                        methodWriter2.visitJumpInsn(167, label10);
                        methodWriter2.visitLabel(label11);
                        methodWriter2.visitInsn(1);
                        methodWriter2.visitLabel(label10);
                    } else {
                        methodWriter2.visitInsn(1);
                    }
                    methodWriter2.visitTypeInsn(192, ASMUtils.type(cls2));
                    methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + "_asm"));
                }
                label5 = label5;
                label6 = label6;
                label7 = label7;
                label8 = label8;
            }
            i16++;
            aSMDeserializerFactory = this;
            label6 = label6;
            label7 = label7;
            label8 = label8;
            label5 = label5;
        }
        Label label12 = label5;
        Label label13 = label6;
        Label label14 = label7;
        Label label15 = label8;
        int i17 = 0;
        while (i17 < length) {
            FieldInfo fieldInfo3 = context.fieldInfoList[i17];
            Class<?> cls3 = fieldInfo3.fieldClass;
            java.lang.reflect.Type type2 = fieldInfo3.fieldType;
            Label label16 = new Label();
            if (cls3 == Boolean.TYPE) {
                methodWriter2.visitVarInsn(25, context.var("lexer"));
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldBoolean", "([C)Z");
                methodWriter2.visitVarInsn(54, context.var(fieldInfo3.name + "_asm"));
                i10 = length;
            } else {
                i10 = length;
                if (cls3 == Byte.TYPE) {
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    methodWriter2.visitVarInsn(25, 0);
                    methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                    methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldInt", "([C)I");
                    methodWriter2.visitVarInsn(54, context.var(fieldInfo3.name + "_asm"));
                } else {
                    label = label16;
                    i11 = i17;
                    if (cls3 == Byte.class) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        String str6 = JSONLexerBase;
                        methodWriter2.visitMethodInsn(182, str6, "scanFieldInt", "([C)I");
                        methodWriter2.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        Label label17 = new Label();
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str6, str4, str5);
                        methodWriter2.visitLdcInsn(5);
                        methodWriter2.visitJumpInsn(160, label17);
                        methodWriter2.visitInsn(1);
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        methodWriter2.visitLabel(label17);
                    } else if (cls3 == Short.TYPE) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldInt", "([C)I");
                        methodWriter2.visitVarInsn(54, context.var(fieldInfo3.name + "_asm"));
                    } else if (cls3 == Short.class) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        String str7 = JSONLexerBase;
                        methodWriter2.visitMethodInsn(182, str7, "scanFieldInt", "([C)I");
                        methodWriter2.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        Label label18 = new Label();
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str7, str4, str5);
                        methodWriter2.visitLdcInsn(5);
                        methodWriter2.visitJumpInsn(160, label18);
                        methodWriter2.visitInsn(1);
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        methodWriter2.visitLabel(label18);
                    } else if (cls3 == Integer.TYPE) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldInt", "([C)I");
                        methodWriter2.visitVarInsn(54, context.var(fieldInfo3.name + "_asm"));
                    } else if (cls3 == Integer.class) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        String str8 = JSONLexerBase;
                        methodWriter2.visitMethodInsn(182, str8, "scanFieldInt", "([C)I");
                        methodWriter2.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        Label label19 = new Label();
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str8, str4, str5);
                        methodWriter2.visitLdcInsn(5);
                        methodWriter2.visitJumpInsn(160, label19);
                        methodWriter2.visitInsn(1);
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        methodWriter2.visitLabel(label19);
                    } else if (cls3 == Long.TYPE) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldLong", "([C)J");
                        methodWriter2.visitVarInsn(55, context.var(fieldInfo3.name + "_asm", 2));
                    } else if (cls3 == Long.class) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        String str9 = JSONLexerBase;
                        methodWriter2.visitMethodInsn(182, str9, "scanFieldLong", "([C)J");
                        methodWriter2.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        Label label20 = new Label();
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str9, str4, str5);
                        methodWriter2.visitLdcInsn(5);
                        methodWriter2.visitJumpInsn(160, label20);
                        methodWriter2.visitInsn(1);
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        methodWriter2.visitLabel(label20);
                    } else if (cls3 == Float.TYPE) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldFloat", "([C)F");
                        methodWriter2.visitVarInsn(56, context.var(fieldInfo3.name + "_asm"));
                    } else if (cls3 == Float.class) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                        String str10 = JSONLexerBase;
                        methodWriter2.visitMethodInsn(182, str10, "scanFieldFloat", "([C)F");
                        methodWriter2.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        Label label21 = new Label();
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str10, str4, str5);
                        methodWriter2.visitLdcInsn(5);
                        methodWriter2.visitJumpInsn(160, label21);
                        methodWriter2.visitInsn(1);
                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                        methodWriter2.visitLabel(label21);
                    } else {
                        if (cls3 == Double.TYPE) {
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            methodWriter2.visitVarInsn(25, 0);
                            methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                            methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldDouble", "([C)D");
                            methodWriter2.visitVarInsn(57, context.var(fieldInfo3.name + "_asm", 2));
                        } else if (cls3 == Double.class) {
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            methodWriter2.visitVarInsn(25, 0);
                            methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                            String str11 = JSONLexerBase;
                            methodWriter2.visitMethodInsn(182, str11, "scanFieldDouble", "([C)D");
                            methodWriter2.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                            methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            Label label22 = new Label();
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            methodWriter2.visitFieldInsn(180, str11, str4, str5);
                            methodWriter2.visitLdcInsn(5);
                            methodWriter2.visitJumpInsn(160, label22);
                            methodWriter2.visitInsn(1);
                            methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            methodWriter2.visitLabel(label22);
                        } else {
                            if (cls3 == String.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldString", "([C)Ljava/lang/String;");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            } else if (cls3 == Date.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldDate", "([C)Ljava/util/Date;");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            } else if (cls3 == UUID.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldUUID", "([C)Ljava/util/UUID;");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            } else if (cls3 == BigDecimal.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldDecimal", "([C)Ljava/math/BigDecimal;");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            } else if (cls3 == BigInteger.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldBigInteger", "([C)Ljava/math/BigInteger;");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            } else if (cls3 == int[].class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldIntArray", "([C)[I");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            } else if (cls3 == float[].class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldFloatArray", "([C)[F");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            } else if (cls3 == float[][].class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldFloatArray2", "([C)[[F");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                            } else if (cls3.isEnum()) {
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                this = this;
                                this._getFieldDeser(context, methodWriter2, fieldInfo3);
                                methodWriter2.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "scanEnum", "(L" + JSONLexerBase + ";[C" + ASMUtils.desc((Class<?>) ObjectDeserializer.class) + ")Ljava/lang/Enum;");
                                methodWriter2.visitTypeInsn(192, ASMUtils.type(cls3));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(fieldInfo3.name);
                                sb3.append("_asm");
                                c10 = ':';
                                methodWriter2.visitVarInsn(58, context.var(sb3.toString()));
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                str = JSONLexerBase;
                                methodWriter2.visitFieldInsn(180, str, str4, str5);
                                Label label23 = new Label();
                                methodWriter2.visitJumpInsn(158, label23);
                                i12 = i11;
                                this._setFlag(methodWriter2, context, i12);
                                methodWriter2.visitLabel(label23);
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str, str4, str5);
                                methodWriter2.visitInsn(89);
                                methodWriter2.visitVarInsn(54, context.var(str4));
                                methodWriter2.visitLdcInsn(-1);
                                label4 = label12;
                                methodWriter2.visitJumpInsn(159, label4);
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str, str4, str5);
                                Label label24 = label;
                                methodWriter2.visitJumpInsn(158, label24);
                                methodWriter2.visitVarInsn(21, context.var("matchedCount"));
                                methodWriter2.visitInsn(4);
                                methodWriter2.visitInsn(96);
                                methodWriter2.visitVarInsn(54, context.var("matchedCount"));
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str, str4, str5);
                                methodWriter2.visitLdcInsn(4);
                                label2 = label15;
                                methodWriter2.visitJumpInsn(159, label2);
                                methodWriter2.visitLabel(label24);
                                if (i12 == i10 - 1) {
                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                    methodWriter2.visitFieldInsn(180, str, str4, str5);
                                    methodWriter2.visitLdcInsn(4);
                                    methodWriter2.visitJumpInsn(160, label4);
                                }
                                methodWriter = methodWriter2;
                                label3 = label4;
                            } else {
                                this = this;
                                if (Collection.class.isAssignableFrom(cls3)) {
                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                    methodWriter2.visitVarInsn(25, 0);
                                    methodWriter2.visitFieldInsn(180, context.className, fieldInfo3.name + "_asm_prefix__", "[C");
                                    Class<?> collectionItemClass = TypeUtils.getCollectionItemClass(type2);
                                    if (collectionItemClass == String.class) {
                                        methodWriter2.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldStringArray", "([CLjava/lang/Class;)" + ASMUtils.desc((Class<?>) Collection.class));
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo3.name + "_asm"));
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        str = JSONLexerBase;
                                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                                        Label label25 = new Label();
                                        methodWriter2.visitJumpInsn(158, label25);
                                        i12 = i11;
                                        this._setFlag(methodWriter2, context, i12);
                                        methodWriter2.visitLabel(label25);
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                                        methodWriter2.visitInsn(89);
                                        methodWriter2.visitVarInsn(54, context.var(str4));
                                        methodWriter2.visitLdcInsn(-1);
                                        label4 = label12;
                                        methodWriter2.visitJumpInsn(159, label4);
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                                        Label label26 = label;
                                        methodWriter2.visitJumpInsn(158, label26);
                                        methodWriter2.visitVarInsn(21, context.var("matchedCount"));
                                        methodWriter2.visitInsn(4);
                                        methodWriter2.visitInsn(96);
                                        methodWriter2.visitVarInsn(54, context.var("matchedCount"));
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                                        methodWriter2.visitLdcInsn(4);
                                        label2 = label15;
                                        methodWriter2.visitJumpInsn(159, label2);
                                        methodWriter2.visitLabel(label26);
                                        if (i12 == i10 - 1) {
                                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                                            methodWriter2.visitFieldInsn(180, str, str4, str5);
                                            methodWriter2.visitLdcInsn(4);
                                            methodWriter2.visitJumpInsn(160, label4);
                                        }
                                        methodWriter = methodWriter2;
                                        label3 = label4;
                                    } else {
                                        label2 = label15;
                                        i12 = i11;
                                        str5 = str5;
                                        str4 = str4;
                                        i10 = i10;
                                        methodWriter = methodWriter2;
                                        _deserialze_list_obj(context, methodWriter2, label12, fieldInfo3, cls3, collectionItemClass, i12);
                                        label3 = label12;
                                        if (i12 == i10 - 1) {
                                            this._deserialize_endCheck(context, methodWriter, label3);
                                        }
                                    }
                                } else {
                                    str5 = str5;
                                    str4 = str4;
                                    methodWriter = methodWriter2;
                                    label2 = label15;
                                    label3 = label12;
                                    i10 = i10;
                                    i12 = i11;
                                    _deserialze_obj(context, methodWriter, label3, fieldInfo3, cls3, i12);
                                    if (i12 == i10 - 1) {
                                        this._deserialize_endCheck(context, methodWriter, label3);
                                    }
                                }
                            }
                            this = this;
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            str = JSONLexerBase;
                            methodWriter2.visitFieldInsn(180, str, str4, str5);
                            Label label27 = new Label();
                            methodWriter2.visitJumpInsn(158, label27);
                            i12 = i11;
                            this._setFlag(methodWriter2, context, i12);
                            methodWriter2.visitLabel(label27);
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            methodWriter2.visitFieldInsn(180, str, str4, str5);
                            methodWriter2.visitInsn(89);
                            methodWriter2.visitVarInsn(54, context.var(str4));
                            methodWriter2.visitLdcInsn(-1);
                            label4 = label12;
                            methodWriter2.visitJumpInsn(159, label4);
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            methodWriter2.visitFieldInsn(180, str, str4, str5);
                            Label label28 = label;
                            methodWriter2.visitJumpInsn(158, label28);
                            methodWriter2.visitVarInsn(21, context.var("matchedCount"));
                            methodWriter2.visitInsn(4);
                            methodWriter2.visitInsn(96);
                            methodWriter2.visitVarInsn(54, context.var("matchedCount"));
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            methodWriter2.visitFieldInsn(180, str, str4, str5);
                            methodWriter2.visitLdcInsn(4);
                            label2 = label15;
                            methodWriter2.visitJumpInsn(159, label2);
                            methodWriter2.visitLabel(label28);
                            if (i12 == i10 - 1) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str, str4, str5);
                                methodWriter2.visitLdcInsn(4);
                                methodWriter2.visitJumpInsn(160, label4);
                            }
                            methodWriter = methodWriter2;
                            label3 = label4;
                        }
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        str = JSONLexerBase;
                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                        Label label29 = new Label();
                        methodWriter2.visitJumpInsn(158, label29);
                        i12 = i11;
                        this._setFlag(methodWriter2, context, i12);
                        methodWriter2.visitLabel(label29);
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                        methodWriter2.visitInsn(89);
                        methodWriter2.visitVarInsn(54, context.var(str4));
                        methodWriter2.visitLdcInsn(-1);
                        label4 = label12;
                        methodWriter2.visitJumpInsn(159, label4);
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                        Label label210 = label;
                        methodWriter2.visitJumpInsn(158, label210);
                        methodWriter2.visitVarInsn(21, context.var("matchedCount"));
                        methodWriter2.visitInsn(4);
                        methodWriter2.visitInsn(96);
                        methodWriter2.visitVarInsn(54, context.var("matchedCount"));
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                        methodWriter2.visitLdcInsn(4);
                        label2 = label15;
                        methodWriter2.visitJumpInsn(159, label2);
                        methodWriter2.visitLabel(label210);
                        if (i12 == i10 - 1) {
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            methodWriter2.visitFieldInsn(180, str, str4, str5);
                            methodWriter2.visitLdcInsn(4);
                            methodWriter2.visitJumpInsn(160, label4);
                        }
                        methodWriter = methodWriter2;
                        label3 = label4;
                    }
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    str = JSONLexerBase;
                    methodWriter2.visitFieldInsn(180, str, str4, str5);
                    Label label211 = new Label();
                    methodWriter2.visitJumpInsn(158, label211);
                    i12 = i11;
                    this._setFlag(methodWriter2, context, i12);
                    methodWriter2.visitLabel(label211);
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    methodWriter2.visitFieldInsn(180, str, str4, str5);
                    methodWriter2.visitInsn(89);
                    methodWriter2.visitVarInsn(54, context.var(str4));
                    methodWriter2.visitLdcInsn(-1);
                    label4 = label12;
                    methodWriter2.visitJumpInsn(159, label4);
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    methodWriter2.visitFieldInsn(180, str, str4, str5);
                    Label label212 = label;
                    methodWriter2.visitJumpInsn(158, label212);
                    methodWriter2.visitVarInsn(21, context.var("matchedCount"));
                    methodWriter2.visitInsn(4);
                    methodWriter2.visitInsn(96);
                    methodWriter2.visitVarInsn(54, context.var("matchedCount"));
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    methodWriter2.visitFieldInsn(180, str, str4, str5);
                    methodWriter2.visitLdcInsn(4);
                    label2 = label15;
                    methodWriter2.visitJumpInsn(159, label2);
                    methodWriter2.visitLabel(label212);
                    if (i12 == i10 - 1) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str, str4, str5);
                        methodWriter2.visitLdcInsn(4);
                        methodWriter2.visitJumpInsn(160, label4);
                    }
                    methodWriter = methodWriter2;
                    label3 = label4;
                }
                i17 = i12 + 1;
                label12 = label3;
                methodWriter2 = methodWriter;
                str5 = str5;
                str4 = str4;
                length = i10;
                label15 = label2;
            }
            i11 = i17;
            label = label16;
            this = this;
            methodWriter2.visitVarInsn(25, context.var("lexer"));
            str = JSONLexerBase;
            methodWriter2.visitFieldInsn(180, str, str4, str5);
            Label label213 = new Label();
            methodWriter2.visitJumpInsn(158, label213);
            i12 = i11;
            this._setFlag(methodWriter2, context, i12);
            methodWriter2.visitLabel(label213);
            methodWriter2.visitVarInsn(25, context.var("lexer"));
            methodWriter2.visitFieldInsn(180, str, str4, str5);
            methodWriter2.visitInsn(89);
            methodWriter2.visitVarInsn(54, context.var(str4));
            methodWriter2.visitLdcInsn(-1);
            label4 = label12;
            methodWriter2.visitJumpInsn(159, label4);
            methodWriter2.visitVarInsn(25, context.var("lexer"));
            methodWriter2.visitFieldInsn(180, str, str4, str5);
            Label label214 = label;
            methodWriter2.visitJumpInsn(158, label214);
            methodWriter2.visitVarInsn(21, context.var("matchedCount"));
            methodWriter2.visitInsn(4);
            methodWriter2.visitInsn(96);
            methodWriter2.visitVarInsn(54, context.var("matchedCount"));
            methodWriter2.visitVarInsn(25, context.var("lexer"));
            methodWriter2.visitFieldInsn(180, str, str4, str5);
            methodWriter2.visitLdcInsn(4);
            label2 = label15;
            methodWriter2.visitJumpInsn(159, label2);
            methodWriter2.visitLabel(label214);
            if (i12 == i10 - 1) {
                methodWriter2.visitVarInsn(25, context.var("lexer"));
                methodWriter2.visitFieldInsn(180, str, str4, str5);
                methodWriter2.visitLdcInsn(4);
                methodWriter2.visitJumpInsn(160, label4);
            }
            methodWriter = methodWriter2;
            label3 = label4;
            i17 = i12 + 1;
            label12 = label3;
            methodWriter2 = methodWriter;
            str5 = str5;
            str4 = str4;
            length = i10;
            label15 = label2;
        }
        MethodWriter methodWriter3 = methodWriter2;
        Label label30 = label15;
        Label label31 = label12;
        int i18 = length;
        methodWriter3.visitLabel(label30);
        if (!context.clazz.isInterface() && !Modifier.isAbstract(context.clazz.getModifiers())) {
            _batchSet(context, methodWriter3);
        }
        methodWriter3.visitLabel(label14);
        _setContext(context, methodWriter3);
        methodWriter3.visitVarInsn(25, context.var("instance"));
        Method method = context.beanInfo.buildMethod;
        if (method != null) {
            methodWriter3.visitMethodInsn(182, ASMUtils.type(context.getInstClass()), method.getName(), "()" + ASMUtils.desc(method.getReturnType()));
        }
        methodWriter3.visitInsn(176);
        methodWriter3.visitLabel(label31);
        _batchSet(context, methodWriter3);
        methodWriter3.visitVarInsn(25, 0);
        methodWriter3.visitVarInsn(25, 1);
        methodWriter3.visitVarInsn(25, 2);
        methodWriter3.visitVarInsn(25, 3);
        methodWriter3.visitVarInsn(25, context.var("instance"));
        methodWriter3.visitVarInsn(21, 4);
        int i19 = i18 / 32;
        if (i18 != 0 && i18 % 32 != 0) {
            i19++;
        }
        if (i19 == 1) {
            methodWriter3.visitInsn(4);
        } else {
            methodWriter3.visitIntInsn(16, i19);
        }
        methodWriter3.visitIntInsn(188, 10);
        for (int i20 = 0; i20 < i19; i20++) {
            methodWriter3.visitInsn(89);
            if (i20 == 0) {
                methodWriter3.visitInsn(3);
            } else if (i20 == 1) {
                methodWriter3.visitInsn(4);
            } else {
                methodWriter3.visitIntInsn(16, i20);
            }
            methodWriter3.visitVarInsn(21, context.var("_asm_flag_" + i20));
            methodWriter3.visitInsn(79);
        }
        String strType = ASMUtils.type(JavaBeanDeserializer.class);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("(L");
        String str12 = DefaultJSONParser;
        sb4.append(str12);
        sb4.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;");
        methodWriter3.visitMethodInsn(182, strType, "parseRest", sb4.toString());
        methodWriter3.visitTypeInsn(192, ASMUtils.type(context.clazz));
        methodWriter3.visitInsn(176);
        methodWriter3.visitLabel(label13);
        methodWriter3.visitVarInsn(25, 0);
        methodWriter3.visitVarInsn(25, 1);
        methodWriter3.visitVarInsn(25, 2);
        methodWriter3.visitVarInsn(25, 3);
        methodWriter3.visitVarInsn(21, 4);
        methodWriter3.visitMethodInsn(183, ASMUtils.type(JavaBeanDeserializer.class), "deserialze", "(L" + str12 + ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;");
        methodWriter3.visitInsn(176);
        methodWriter3.visitMaxs(10, context.variantIndex);
        methodWriter3.visitEnd();
    }

    private void _deserialzeArrayMapping(ClassWriter classWriter, Context context) {
        FieldInfo[] fieldInfoArr;
        int i10;
        int i11;
        int i12;
        int i13;
        MethodWriter methodWriter = new MethodWriter(classWriter, 1, "deserialzeArrayMapping", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
        defineVarLexer(context, methodWriter);
        _createInstance(context, methodWriter);
        FieldInfo[] fieldInfoArr2 = context.beanInfo.sortedFields;
        int length = fieldInfoArr2.length;
        int i14 = 0;
        while (i14 < length) {
            boolean z10 = i14 == length + (-1);
            int i15 = z10 ? 93 : 44;
            FieldInfo fieldInfo = fieldInfoArr2[i14];
            Class<?> cls = fieldInfo.fieldClass;
            java.lang.reflect.Type type = fieldInfo.fieldType;
            if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE) {
                fieldInfoArr = fieldInfoArr2;
                i10 = length;
                i11 = i14;
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitVarInsn(16, i15);
                methodWriter.visitMethodInsn(182, JSONLexerBase, "scanInt", "(C)I");
                methodWriter.visitVarInsn(54, context.var(fieldInfo.name + "_asm"));
            } else {
                fieldInfoArr = fieldInfoArr2;
                i10 = length;
                int i16 = i14;
                if (cls == Byte.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    String str = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str, "scanInt", "(C)I");
                    methodWriter.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str, "matchStat", "I");
                    methodWriter.visitLdcInsn(5);
                    methodWriter.visitJumpInsn(160, label);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label);
                } else if (cls == Short.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    String str2 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str2, "scanInt", "(C)I");
                    methodWriter.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label2 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str2, "matchStat", "I");
                    methodWriter.visitLdcInsn(5);
                    methodWriter.visitJumpInsn(160, label2);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label2);
                } else if (cls == Integer.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    String str3 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str3, "scanInt", "(C)I");
                    methodWriter.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label3 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str3, "matchStat", "I");
                    methodWriter.visitLdcInsn(5);
                    methodWriter.visitJumpInsn(160, label3);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label3);
                } else if (cls == Long.TYPE) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanLong", "(C)J");
                    methodWriter.visitVarInsn(55, context.var(fieldInfo.name + "_asm", 2));
                } else if (cls == Long.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    String str4 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str4, "scanLong", "(C)J");
                    methodWriter.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label4 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str4, "matchStat", "I");
                    methodWriter.visitLdcInsn(5);
                    methodWriter.visitJumpInsn(160, label4);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label4);
                } else if (cls == Boolean.TYPE) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanBoolean", "(C)Z");
                    methodWriter.visitVarInsn(54, context.var(fieldInfo.name + "_asm"));
                } else if (cls == Float.TYPE) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanFloat", "(C)F");
                    methodWriter.visitVarInsn(56, context.var(fieldInfo.name + "_asm"));
                } else if (cls == Float.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    String str5 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str5, "scanFloat", "(C)F");
                    methodWriter.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label5 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str5, "matchStat", "I");
                    methodWriter.visitLdcInsn(5);
                    methodWriter.visitJumpInsn(160, label5);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label5);
                } else if (cls == Double.TYPE) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanDouble", "(C)D");
                    methodWriter.visitVarInsn(57, context.var(fieldInfo.name + "_asm", 2));
                } else if (cls == Double.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    String str6 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str6, "scanDouble", "(C)D");
                    methodWriter.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label6 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str6, "matchStat", "I");
                    methodWriter.visitLdcInsn(5);
                    methodWriter.visitJumpInsn(160, label6);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label6);
                } else if (cls == Character.TYPE) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanString", "(C)Ljava/lang/String;");
                    methodWriter.visitInsn(3);
                    methodWriter.visitMethodInsn(182, "java/lang/String", "charAt", "(I)C");
                    methodWriter.visitVarInsn(54, context.var(fieldInfo.name + "_asm"));
                } else if (cls == String.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanString", "(C)Ljava/lang/String;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                } else if (cls == BigDecimal.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanDecimal", "(C)Ljava/math/BigDecimal;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                } else if (cls == Date.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanDate", "(C)Ljava/util/Date;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                } else if (cls == UUID.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanUUID", "(C)Ljava/util/UUID;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                } else if (cls.isEnum()) {
                    Label label7 = new Label();
                    Label label8 = new Label();
                    Label label9 = new Label();
                    Label label10 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    String str7 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str7, "getCurrent", "()C");
                    methodWriter.visitInsn(89);
                    methodWriter.visitVarInsn(54, context.var("ch"));
                    methodWriter.visitLdcInsn(110);
                    methodWriter.visitJumpInsn(159, label10);
                    methodWriter.visitVarInsn(21, context.var("ch"));
                    methodWriter.visitLdcInsn(34);
                    methodWriter.visitJumpInsn(160, label7);
                    methodWriter.visitLabel(label10);
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
                    methodWriter.visitVarInsn(25, 1);
                    methodWriter.visitMethodInsn(182, DefaultJSONParser, "getSymbolTable", "()" + ASMUtils.desc((Class<?>) SymbolTable.class));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, str7, "scanEnum", "(Ljava/lang/Class;" + ASMUtils.desc((Class<?>) SymbolTable.class) + "C)Ljava/lang/Enum;");
                    methodWriter.visitJumpInsn(167, label9);
                    methodWriter.visitLabel(label7);
                    methodWriter.visitVarInsn(21, context.var("ch"));
                    methodWriter.visitLdcInsn(48);
                    methodWriter.visitJumpInsn(161, label8);
                    methodWriter.visitVarInsn(21, context.var("ch"));
                    methodWriter.visitLdcInsn(57);
                    methodWriter.visitJumpInsn(163, label8);
                    _getFieldDeser(context, methodWriter, fieldInfo);
                    methodWriter.visitTypeInsn(192, ASMUtils.type(EnumDeserializer.class));
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, str7, "scanInt", "(C)I");
                    methodWriter.visitMethodInsn(182, ASMUtils.type(EnumDeserializer.class), "valueOf", "(I)Ljava/lang/Enum;");
                    methodWriter.visitJumpInsn(167, label9);
                    methodWriter.visitLabel(label8);
                    methodWriter.visitVarInsn(25, 0);
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i15);
                    methodWriter.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "scanEnum", "(L" + str7 + ";C)Ljava/lang/Enum;");
                    methodWriter.visitLabel(label9);
                    methodWriter.visitTypeInsn(192, ASMUtils.type(cls));
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                } else if (Collection.class.isAssignableFrom(cls)) {
                    Class<?> collectionItemClass = TypeUtils.getCollectionItemClass(type);
                    if (collectionItemClass == String.class) {
                        if (cls == List.class || cls == Collections.class || cls == ArrayList.class) {
                            methodWriter.visitTypeInsn(187, ASMUtils.type(ArrayList.class));
                            methodWriter.visitInsn(89);
                            methodWriter.visitMethodInsn(183, ASMUtils.type(ArrayList.class), "<init>", "()V");
                        } else {
                            methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
                            methodWriter.visitMethodInsn(184, ASMUtils.type(TypeUtils.class), "createCollection", "(Ljava/lang/Class;)Ljava/util/Collection;");
                        }
                        methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
                        methodWriter.visitVarInsn(16, i15);
                        String str8 = JSONLexerBase;
                        methodWriter.visitMethodInsn(182, str8, "scanStringArray", "(Ljava/util/Collection;C)V");
                        Label label11 = new Label();
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitFieldInsn(180, str8, "matchStat", "I");
                        methodWriter.visitLdcInsn(5);
                        methodWriter.visitJumpInsn(160, label11);
                        methodWriter.visitInsn(1);
                        methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        methodWriter.visitLabel(label11);
                    } else {
                        Label label12 = new Label();
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        String str9 = JSONLexerBase;
                        methodWriter.visitMethodInsn(182, str9, "token", "()I");
                        methodWriter.visitVarInsn(54, context.var("token"));
                        methodWriter.visitVarInsn(21, context.var("token"));
                        methodWriter.visitLdcInsn(Integer.valueOf(i16 == 0 ? 14 : 16));
                        methodWriter.visitJumpInsn(159, label12);
                        methodWriter.visitVarInsn(25, 1);
                        methodWriter.visitVarInsn(21, context.var("token"));
                        String str10 = DefaultJSONParser;
                        methodWriter.visitMethodInsn(182, str10, "throwException", "(I)V");
                        methodWriter.visitLabel(label12);
                        Label label13 = new Label();
                        Label label14 = new Label();
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitMethodInsn(182, str9, "getCurrent", "()C");
                        methodWriter.visitVarInsn(16, 91);
                        methodWriter.visitJumpInsn(160, label13);
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitMethodInsn(182, str9, "next", "()C");
                        methodWriter.visitInsn(87);
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitLdcInsn(14);
                        methodWriter.visitMethodInsn(182, str9, "setToken", "(I)V");
                        methodWriter.visitJumpInsn(167, label14);
                        methodWriter.visitLabel(label13);
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitLdcInsn(14);
                        methodWriter.visitMethodInsn(182, str9, "nextToken", "(I)V");
                        methodWriter.visitLabel(label14);
                        i11 = i16;
                        _newCollection(methodWriter, cls, i11, false);
                        methodWriter.visitInsn(89);
                        methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        _getCollectionFieldItemDeser(context, methodWriter, fieldInfo, collectionItemClass);
                        methodWriter.visitVarInsn(25, 1);
                        methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(collectionItemClass)));
                        methodWriter.visitVarInsn(25, 3);
                        methodWriter.visitMethodInsn(184, ASMUtils.type(JavaBeanDeserializer.class), "parseArray", "(Ljava/util/Collection;" + ASMUtils.desc((Class<?>) ObjectDeserializer.class) + "L" + str10 + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)V");
                    }
                } else {
                    i11 = i16;
                    if (cls.isArray()) {
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitLdcInsn(14);
                        methodWriter.visitMethodInsn(182, JSONLexerBase, "nextToken", "(I)V");
                        methodWriter.visitVarInsn(25, 1);
                        methodWriter.visitVarInsn(25, 0);
                        methodWriter.visitLdcInsn(Integer.valueOf(i11));
                        methodWriter.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
                        methodWriter.visitMethodInsn(182, DefaultJSONParser, "parseObject", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;");
                        methodWriter.visitTypeInsn(192, ASMUtils.type(cls));
                        methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    } else {
                        Label label15 = new Label();
                        Label label16 = new Label();
                        if (cls == Date.class) {
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            String str11 = JSONLexerBase;
                            methodWriter.visitMethodInsn(182, str11, "getCurrent", "()C");
                            methodWriter.visitLdcInsn(49);
                            methodWriter.visitJumpInsn(160, label15);
                            methodWriter.visitTypeInsn(187, ASMUtils.type(Date.class));
                            methodWriter.visitInsn(89);
                            i12 = 25;
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            methodWriter.visitVarInsn(16, i15);
                            i13 = 182;
                            methodWriter.visitMethodInsn(182, str11, "scanLong", "(C)J");
                            methodWriter.visitMethodInsn(183, ASMUtils.type(Date.class), "<init>", "(J)V");
                            methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                            methodWriter.visitJumpInsn(167, label16);
                        } else {
                            i12 = 25;
                            i13 = 182;
                        }
                        methodWriter.visitLabel(label15);
                        _quickNextToken(context, methodWriter, 14);
                        _deserObject(context, methodWriter, fieldInfo, cls, i11);
                        methodWriter.visitVarInsn(i12, context.var("lexer"));
                        methodWriter.visitMethodInsn(i13, JSONLexerBase, "token", "()I");
                        methodWriter.visitLdcInsn(15);
                        methodWriter.visitJumpInsn(159, label16);
                        methodWriter.visitVarInsn(i12, 0);
                        methodWriter.visitVarInsn(i12, context.var("lexer"));
                        if (z10) {
                            methodWriter.visitLdcInsn(15);
                        } else {
                            methodWriter.visitLdcInsn(16);
                        }
                        methodWriter.visitMethodInsn(183, ASMUtils.type(JavaBeanDeserializer.class), "check", "(" + ASMUtils.desc((Class<?>) JSONLexer.class) + "I)V");
                        methodWriter.visitLabel(label16);
                    }
                }
                i11 = i16;
            }
            i14 = i11 + 1;
            fieldInfoArr2 = fieldInfoArr;
            length = i10;
        }
        _batchSet(context, methodWriter, false);
        Label label17 = new Label();
        Label label18 = new Label();
        Label label19 = new Label();
        Label label20 = new Label();
        methodWriter.visitVarInsn(25, context.var("lexer"));
        String str12 = JSONLexerBase;
        methodWriter.visitMethodInsn(182, str12, "getCurrent", "()C");
        methodWriter.visitInsn(89);
        methodWriter.visitVarInsn(54, context.var("ch"));
        methodWriter.visitVarInsn(16, 44);
        methodWriter.visitJumpInsn(160, label18);
        methodWriter.visitVarInsn(25, context.var("lexer"));
        methodWriter.visitMethodInsn(182, str12, "next", "()C");
        methodWriter.visitInsn(87);
        methodWriter.visitVarInsn(25, context.var("lexer"));
        methodWriter.visitLdcInsn(16);
        methodWriter.visitMethodInsn(182, str12, "setToken", "(I)V");
        methodWriter.visitJumpInsn(167, label20);
        methodWriter.visitLabel(label18);
        methodWriter.visitVarInsn(21, context.var("ch"));
        methodWriter.visitVarInsn(16, 93);
        methodWriter.visitJumpInsn(160, label19);
        methodWriter.visitVarInsn(25, context.var("lexer"));
        methodWriter.visitMethodInsn(182, str12, "next", "()C");
        methodWriter.visitInsn(87);
        methodWriter.visitVarInsn(25, context.var("lexer"));
        methodWriter.visitLdcInsn(15);
        methodWriter.visitMethodInsn(182, str12, "setToken", "(I)V");
        methodWriter.visitJumpInsn(167, label20);
        methodWriter.visitLabel(label19);
        methodWriter.visitVarInsn(21, context.var("ch"));
        methodWriter.visitVarInsn(16, 26);
        methodWriter.visitJumpInsn(160, label17);
        methodWriter.visitVarInsn(25, context.var("lexer"));
        methodWriter.visitMethodInsn(182, str12, "next", "()C");
        methodWriter.visitInsn(87);
        methodWriter.visitVarInsn(25, context.var("lexer"));
        methodWriter.visitLdcInsn(20);
        methodWriter.visitMethodInsn(182, str12, "setToken", "(I)V");
        methodWriter.visitJumpInsn(167, label20);
        methodWriter.visitLabel(label17);
        methodWriter.visitVarInsn(25, context.var("lexer"));
        methodWriter.visitLdcInsn(16);
        methodWriter.visitMethodInsn(182, str12, "nextToken", "(I)V");
        methodWriter.visitLabel(label20);
        methodWriter.visitVarInsn(25, context.var("instance"));
        methodWriter.visitInsn(176);
        methodWriter.visitMaxs(5, context.variantIndex);
        methodWriter.visitEnd();
    }

    private void _deserialze_list_obj(Context context, MethodVisitor methodVisitor, Label label, FieldInfo fieldInfo, Class<?> cls, Class<?> cls2, int i10) {
        String str;
        String str2;
        String str3;
        int i11;
        Label label2 = new Label();
        String str4 = JSONLexerBase;
        methodVisitor.visitMethodInsn(182, str4, "matchField", "([C)Z");
        methodVisitor.visitJumpInsn(153, label2);
        _setFlag(methodVisitor, context, i10);
        Label label3 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str4, "token", "()I");
        methodVisitor.visitLdcInsn(8);
        methodVisitor.visitJumpInsn(160, label3);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(16);
        methodVisitor.visitMethodInsn(182, str4, "nextToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label2);
        methodVisitor.visitLabel(label3);
        Label label4 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str4, "token", "()I");
        methodVisitor.visitLdcInsn(21);
        methodVisitor.visitJumpInsn(160, label5);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(14);
        methodVisitor.visitMethodInsn(182, str4, "nextToken", "(I)V");
        _newCollection(methodVisitor, cls, i10, true);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label5);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str4, "token", "()I");
        methodVisitor.visitLdcInsn(14);
        methodVisitor.visitJumpInsn(159, label6);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str4, "token", "()I");
        methodVisitor.visitLdcInsn(12);
        methodVisitor.visitJumpInsn(160, label);
        _newCollection(methodVisitor, cls, i10, false);
        methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
        _getCollectionFieldItemDeser(context, methodVisitor, fieldInfo, cls2);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
        methodVisitor.visitInsn(3);
        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        String strType = ASMUtils.type(ObjectDeserializer.class);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(L");
        String str5 = DefaultJSONParser;
        sb2.append(str5);
        sb2.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        methodVisitor.visitMethodInsn(185, strType, "deserialze", sb2.toString());
        methodVisitor.visitVarInsn(58, context.var("list_item_value"));
        methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitVarInsn(25, context.var("list_item_value"));
        if (cls.isInterface()) {
            methodVisitor.visitMethodInsn(185, ASMUtils.type(cls), "add", "(Ljava/lang/Object;)Z");
        } else {
            methodVisitor.visitMethodInsn(182, ASMUtils.type(cls), "add", "(Ljava/lang/Object;)Z");
        }
        methodVisitor.visitInsn(87);
        methodVisitor.visitJumpInsn(167, label2);
        methodVisitor.visitLabel(label6);
        _newCollection(methodVisitor, cls, i10, false);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
        boolean zIsPrimitive2 = ParserConfig.isPrimitive2(fieldInfo.fieldClass);
        _getCollectionFieldItemDeser(context, methodVisitor, fieldInfo, cls2);
        if (zIsPrimitive2) {
            methodVisitor.visitMethodInsn(185, ASMUtils.type(ObjectDeserializer.class), "getFastMatchToken", "()I");
            methodVisitor.visitVarInsn(54, context.var("fastMatchToken"));
            methodVisitor.visitVarInsn(25, context.var("lexer"));
            methodVisitor.visitVarInsn(21, context.var("fastMatchToken"));
            str = "nextToken";
            str2 = str4;
            str3 = "(I)V";
            methodVisitor.visitMethodInsn(182, str2, str, str3);
        } else {
            str = "nextToken";
            str2 = str4;
            str3 = "(I)V";
            methodVisitor.visitInsn(87);
            methodVisitor.visitLdcInsn(12);
            methodVisitor.visitVarInsn(54, context.var("fastMatchToken"));
            _quickNextToken(context, methodVisitor, 12);
        }
        methodVisitor.visitVarInsn(25, 1);
        String str6 = str3;
        methodVisitor.visitMethodInsn(182, str5, "getContext", "()" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodVisitor.visitVarInsn(58, context.var("listContext"));
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitLdcInsn(fieldInfo.name);
        methodVisitor.visitMethodInsn(182, str5, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodVisitor.visitInsn(87);
        Label label7 = new Label();
        Label label8 = new Label();
        methodVisitor.visitInsn(3);
        String str7 = str;
        methodVisitor.visitVarInsn(54, context.var("i"));
        methodVisitor.visitLabel(label7);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str2, "token", "()I");
        methodVisitor.visitLdcInsn(15);
        methodVisitor.visitJumpInsn(159, label8);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
        methodVisitor.visitVarInsn(21, context.var("i"));
        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        methodVisitor.visitMethodInsn(185, ASMUtils.type(ObjectDeserializer.class), "deserialze", "(L" + str5 + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        methodVisitor.visitVarInsn(58, context.var("list_item_value"));
        methodVisitor.visitIincInsn(context.var("i"), 1);
        methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitVarInsn(25, context.var("list_item_value"));
        if (cls.isInterface()) {
            methodVisitor.visitMethodInsn(185, ASMUtils.type(cls), "add", "(Ljava/lang/Object;)Z");
        } else {
            methodVisitor.visitMethodInsn(182, ASMUtils.type(cls), "add", "(Ljava/lang/Object;)Z");
        }
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitMethodInsn(182, str5, "checkListResolve", "(Ljava/util/Collection;)V");
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str2, "token", "()I");
        methodVisitor.visitLdcInsn(16);
        methodVisitor.visitJumpInsn(160, label7);
        if (zIsPrimitive2) {
            methodVisitor.visitVarInsn(25, context.var("lexer"));
            methodVisitor.visitVarInsn(21, context.var("fastMatchToken"));
            methodVisitor.visitMethodInsn(182, str2, str7, str6);
            i11 = 167;
        } else {
            _quickNextToken(context, methodVisitor, 12);
            i11 = 167;
        }
        methodVisitor.visitJumpInsn(i11, label7);
        methodVisitor.visitLabel(label8);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var("listContext"));
        methodVisitor.visitMethodInsn(182, str5, "setContext", "(" + ASMUtils.desc((Class<?>) ParseContext.class) + ")V");
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str2, "token", "()I");
        methodVisitor.visitLdcInsn(15);
        methodVisitor.visitJumpInsn(160, label);
        _quickNextTokenComma(context, methodVisitor);
        methodVisitor.visitLabel(label2);
    }

    private void _deserialze_obj(Context context, MethodVisitor methodVisitor, Label label, FieldInfo fieldInfo, Class<?> cls, int i10) {
        Label label2 = new Label();
        Label label3 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_prefix__", "[C");
        methodVisitor.visitMethodInsn(182, JSONLexerBase, "matchField", "([C)Z");
        methodVisitor.visitJumpInsn(154, label2);
        methodVisitor.visitInsn(1);
        methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitJumpInsn(167, label3);
        methodVisitor.visitLabel(label2);
        _setFlag(methodVisitor, context, i10);
        methodVisitor.visitVarInsn(21, context.var("matchedCount"));
        methodVisitor.visitInsn(4);
        methodVisitor.visitInsn(96);
        methodVisitor.visitVarInsn(54, context.var("matchedCount"));
        _deserObject(context, methodVisitor, fieldInfo, cls, i10);
        methodVisitor.visitVarInsn(25, 1);
        String str = DefaultJSONParser;
        methodVisitor.visitMethodInsn(182, str, "getResolveStatus", "()I");
        methodVisitor.visitLdcInsn(1);
        methodVisitor.visitJumpInsn(160, label3);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, str, "getLastResolveTask", "()" + ASMUtils.desc((Class<?>) DefaultJSONParser.ResolveTask.class));
        methodVisitor.visitVarInsn(58, context.var("resolveTask"));
        methodVisitor.visitVarInsn(25, context.var("resolveTask"));
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, str, "getContext", "()" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodVisitor.visitFieldInsn(181, ASMUtils.type(DefaultJSONParser.ResolveTask.class), "ownerContext", ASMUtils.desc((Class<?>) ParseContext.class));
        methodVisitor.visitVarInsn(25, context.var("resolveTask"));
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitLdcInsn(fieldInfo.name);
        methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldDeserializer", "(Ljava/lang/String;)" + ASMUtils.desc((Class<?>) FieldDeserializer.class));
        methodVisitor.visitFieldInsn(181, ASMUtils.type(DefaultJSONParser.ResolveTask.class), "fieldDeserializer", ASMUtils.desc((Class<?>) FieldDeserializer.class));
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(0);
        methodVisitor.visitMethodInsn(182, str, "setResolveStatus", "(I)V");
        methodVisitor.visitLabel(label3);
    }

    private void _getCollectionFieldItemDeser(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo, Class<?> cls) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitJumpInsn(199, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, DefaultJSONParser, "getConfig", "()" + ASMUtils.desc((Class<?>) ParserConfig.class));
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
        methodVisitor.visitMethodInsn(182, ASMUtils.type(ParserConfig.class), "getDeserializer", "(Ljava/lang/reflect/Type;)" + ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitFieldInsn(181, context.className, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
    }

    private void _getFieldDeser(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitJumpInsn(199, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, DefaultJSONParser, "getConfig", "()" + ASMUtils.desc((Class<?>) ParserConfig.class));
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
        methodVisitor.visitMethodInsn(182, ASMUtils.type(ParserConfig.class), "getDeserializer", "(Ljava/lang/reflect/Type;)" + ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitFieldInsn(181, context.className, fieldInfo.name + "_asm_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
    }

    private void _init(ClassWriter classWriter, Context context) {
        int length = context.fieldInfoList.length;
        for (int i10 = 0; i10 < length; i10++) {
            new FieldWriter(classWriter, 1, context.fieldInfoList[i10].name + "_asm_prefix__", "[C").visitEnd();
        }
        int length2 = context.fieldInfoList.length;
        for (int i11 = 0; i11 < length2; i11++) {
            FieldInfo fieldInfo = context.fieldInfoList[i11];
            Class<?> cls = fieldInfo.fieldClass;
            if (!cls.isPrimitive()) {
                if (Collection.class.isAssignableFrom(cls)) {
                    new FieldWriter(classWriter, 1, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class)).visitEnd();
                } else {
                    new FieldWriter(classWriter, 1, fieldInfo.name + "_asm_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class)).visitEnd();
                }
            }
        }
        MethodWriter methodWriter = new MethodWriter(classWriter, 1, "<init>", "(" + ASMUtils.desc((Class<?>) ParserConfig.class) + ASMUtils.desc((Class<?>) JavaBeanInfo.class) + ")V", null, null);
        methodWriter.visitVarInsn(25, 0);
        methodWriter.visitVarInsn(25, 1);
        methodWriter.visitVarInsn(25, 2);
        methodWriter.visitMethodInsn(183, ASMUtils.type(JavaBeanDeserializer.class), "<init>", "(" + ASMUtils.desc((Class<?>) ParserConfig.class) + ASMUtils.desc((Class<?>) JavaBeanInfo.class) + ")V");
        int length3 = context.fieldInfoList.length;
        for (int i12 = 0; i12 < length3; i12++) {
            FieldInfo fieldInfo2 = context.fieldInfoList[i12];
            methodWriter.visitVarInsn(25, 0);
            methodWriter.visitLdcInsn("\"" + fieldInfo2.name + "\":");
            methodWriter.visitMethodInsn(182, "java/lang/String", "toCharArray", "()[C");
            methodWriter.visitFieldInsn(181, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
        }
        methodWriter.visitInsn(177);
        methodWriter.visitMaxs(4, 4);
        methodWriter.visitEnd();
    }

    private void _isFlag(MethodVisitor methodVisitor, Context context, int i10, Label label) {
        methodVisitor.visitVarInsn(21, context.var("_asm_flag_" + (i10 / 32)));
        methodVisitor.visitLdcInsn(Integer.valueOf(1 << i10));
        methodVisitor.visitInsn(126);
        methodVisitor.visitJumpInsn(153, label);
    }

    private void _loadAndSet(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Class<?> cls = fieldInfo.fieldClass;
        java.lang.reflect.Type type = fieldInfo.fieldType;
        if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(21, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(21, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(22, context.var(fieldInfo.name + "_asm", 2));
            if (fieldInfo.method == null) {
                methodVisitor.visitFieldInsn(181, ASMUtils.type(fieldInfo.declaringClass), fieldInfo.field.getName(), ASMUtils.desc(fieldInfo.fieldClass));
                return;
            }
            methodVisitor.visitMethodInsn(182, ASMUtils.type(context.getInstClass()), fieldInfo.method.getName(), ASMUtils.desc(fieldInfo.method));
            if (fieldInfo.method.getReturnType().equals(Void.TYPE)) {
                return;
            }
            methodVisitor.visitInsn(87);
            return;
        }
        if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(23, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(24, context.var(fieldInfo.name + "_asm", 2));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (!Collection.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        methodVisitor.visitVarInsn(25, context.var("instance"));
        if (TypeUtils.getCollectionItemClass(type) == String.class) {
            methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
            methodVisitor.visitTypeInsn(192, ASMUtils.type(cls));
        } else {
            methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        }
        _set(context, methodVisitor, fieldInfo);
    }

    private void _newCollection(MethodVisitor methodVisitor, Class<?> cls, int i10, boolean z10) {
        if (cls.isAssignableFrom(ArrayList.class) && !z10) {
            methodVisitor.visitTypeInsn(187, "java/util/ArrayList");
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, "java/util/ArrayList", "<init>", "()V");
        } else if (cls.isAssignableFrom(LinkedList.class) && !z10) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(LinkedList.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(LinkedList.class), "<init>", "()V");
        } else if (cls.isAssignableFrom(HashSet.class)) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(HashSet.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(HashSet.class), "<init>", "()V");
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(TreeSet.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(TreeSet.class), "<init>", "()V");
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(LinkedHashSet.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(LinkedHashSet.class), "<init>", "()V");
        } else if (z10) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(HashSet.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(HashSet.class), "<init>", "()V");
        } else {
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitLdcInsn(Integer.valueOf(i10));
            methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
            methodVisitor.visitMethodInsn(184, ASMUtils.type(TypeUtils.class), "createCollection", "(Ljava/lang/reflect/Type;)Ljava/util/Collection;");
        }
        methodVisitor.visitTypeInsn(192, ASMUtils.type(cls));
    }

    private void _quickNextToken(Context context, MethodVisitor methodVisitor, int i10) {
        Label label = new Label();
        Label label2 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        String str = JSONLexerBase;
        methodVisitor.visitMethodInsn(182, str, "getCurrent", "()C");
        if (i10 == 12) {
            methodVisitor.visitVarInsn(16, 123);
        } else {
            if (i10 != 14) {
                throw new IllegalStateException();
            }
            methodVisitor.visitVarInsn(16, 91);
        }
        methodVisitor.visitJumpInsn(160, label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "next", "()C");
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(Integer.valueOf(i10));
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label2);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(Integer.valueOf(i10));
        methodVisitor.visitMethodInsn(182, str, "nextToken", "(I)V");
        methodVisitor.visitLabel(label2);
    }

    private void _quickNextTokenComma(Context context, MethodVisitor methodVisitor) {
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        String str = JSONLexerBase;
        methodVisitor.visitMethodInsn(182, str, "getCurrent", "()C");
        methodVisitor.visitInsn(89);
        methodVisitor.visitVarInsn(54, context.var("ch"));
        methodVisitor.visitVarInsn(16, 44);
        methodVisitor.visitJumpInsn(160, label2);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "next", "()C");
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(16);
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitVarInsn(21, context.var("ch"));
        methodVisitor.visitVarInsn(16, 125);
        methodVisitor.visitJumpInsn(160, label3);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "next", "()C");
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(13);
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(21, context.var("ch"));
        methodVisitor.visitVarInsn(16, 93);
        methodVisitor.visitJumpInsn(160, label4);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "next", "()C");
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(15);
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitVarInsn(21, context.var("ch"));
        methodVisitor.visitVarInsn(16, 26);
        methodVisitor.visitJumpInsn(160, label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(20);
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "nextToken", "()V");
        methodVisitor.visitLabel(label5);
    }

    private void _set(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Method method = fieldInfo.method;
        if (method == null) {
            methodVisitor.visitFieldInsn(181, ASMUtils.type(fieldInfo.declaringClass), fieldInfo.field.getName(), ASMUtils.desc(fieldInfo.fieldClass));
            return;
        }
        methodVisitor.visitMethodInsn(method.getDeclaringClass().isInterface() ? 185 : 182, ASMUtils.type(fieldInfo.declaringClass), method.getName(), ASMUtils.desc(method));
        if (fieldInfo.method.getReturnType().equals(Void.TYPE)) {
            return;
        }
        methodVisitor.visitInsn(87);
    }

    private void _setContext(Context context, MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var(d.R));
        methodVisitor.visitMethodInsn(182, DefaultJSONParser, "setContext", "(" + ASMUtils.desc((Class<?>) ParseContext.class) + ")V");
        Label label = new Label();
        methodVisitor.visitVarInsn(25, context.var("childContext"));
        methodVisitor.visitJumpInsn(198, label);
        methodVisitor.visitVarInsn(25, context.var("childContext"));
        methodVisitor.visitVarInsn(25, context.var("instance"));
        methodVisitor.visitFieldInsn(181, ASMUtils.type(ParseContext.class), "object", "Ljava/lang/Object;");
        methodVisitor.visitLabel(label);
    }

    private void _setFlag(MethodVisitor methodVisitor, Context context, int i10) {
        String str = "_asm_flag_" + (i10 / 32);
        methodVisitor.visitVarInsn(21, context.var(str));
        methodVisitor.visitLdcInsn(Integer.valueOf(1 << i10));
        methodVisitor.visitInsn(128);
        methodVisitor.visitVarInsn(54, context.var(str));
    }

    private void defineVarLexer(Context context, MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitFieldInsn(180, DefaultJSONParser, "lexer", ASMUtils.desc((Class<?>) JSONLexer.class));
        methodVisitor.visitTypeInsn(192, JSONLexerBase);
        methodVisitor.visitVarInsn(58, context.var("lexer"));
    }

    public ObjectDeserializer createJavaBeanDeserializer(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo) throws Exception {
        String str;
        Class<?> cls = javaBeanInfo.clazz;
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("not support type :" + cls.getName());
        }
        String str2 = "FastjsonASMDeserializer_" + this.seed.incrementAndGet() + lg.a.f131412e + cls.getSimpleName();
        Package r10 = ASMDeserializerFactory.class.getPackage();
        if (r10 != null) {
            String name = r10.getName();
            String str3 = name.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + "/" + str2;
            str = name + "." + str2;
            str2 = str3;
        } else {
            str = str2;
        }
        ClassWriter classWriter = new ClassWriter();
        classWriter.visit(49, 33, str2, ASMUtils.type(JavaBeanDeserializer.class), null);
        _init(classWriter, new Context(str2, parserConfig, javaBeanInfo, 3));
        _createInstance(classWriter, new Context(str2, parserConfig, javaBeanInfo, 3));
        _deserialze(classWriter, new Context(str2, parserConfig, javaBeanInfo, 5));
        _deserialzeArrayMapping(classWriter, new Context(str2, parserConfig, javaBeanInfo, 4));
        byte[] byteArray = classWriter.toByteArray();
        return (ObjectDeserializer) this.classLoader.defineClassPublic(str, byteArray, 0, byteArray.length).getConstructor(ParserConfig.class, JavaBeanInfo.class).newInstance(parserConfig, javaBeanInfo);
    }
}
