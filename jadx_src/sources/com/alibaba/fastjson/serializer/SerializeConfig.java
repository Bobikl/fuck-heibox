package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONStreamAware;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec;
import com.alibaba.fastjson.parser.deserializer.OptionalCodec;
import com.alibaba.fastjson.support.springfox.SwaggerJsonSerializer;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.util.ServiceLoader;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Clob;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.xml.datatype.XMLGregorianCalendar;

/* JADX INFO: loaded from: classes6.dex */
public class SerializeConfig {
    private boolean asm;
    private ASMSerializerFactory asmFactory;
    private final boolean fieldBased;
    public PropertyNamingStrategy propertyNamingStrategy;
    private final IdentityHashMap<Type, ObjectSerializer> serializers;
    protected String typeKey;
    public static final SerializeConfig globalInstance = new SerializeConfig();
    private static boolean awtError = false;
    private static boolean jdk8Error = false;
    private static boolean oracleJdbcError = false;
    private static boolean springfoxError = false;
    private static boolean guavaError = false;
    private static boolean jsonnullError = false;

    public SerializeConfig() {
        this(8192);
    }

    public SerializeConfig(int i10) {
        this(i10, false);
    }

    public SerializeConfig(int i10, boolean z10) {
        this.asm = !ASMUtils.IS_ANDROID;
        this.typeKey = JSON.DEFAULT_TYPE_KEY;
        this.fieldBased = z10;
        this.serializers = new IdentityHashMap<>(i10);
        try {
            if (this.asm) {
                this.asmFactory = new ASMSerializerFactory();
            }
        } catch (Throwable unused) {
            this.asm = false;
        }
        initSerializers();
    }

    public SerializeConfig(boolean z10) {
        this(8192, z10);
    }

    private final JavaBeanSerializer createASMSerializer(SerializeBeanInfo serializeBeanInfo) throws Exception {
        JavaBeanSerializer javaBeanSerializerCreateJavaBeanSerializer = this.asmFactory.createJavaBeanSerializer(serializeBeanInfo);
        int i10 = 0;
        while (true) {
            FieldSerializer[] fieldSerializerArr = javaBeanSerializerCreateJavaBeanSerializer.sortedGetters;
            if (i10 >= fieldSerializerArr.length) {
                return javaBeanSerializerCreateJavaBeanSerializer;
            }
            Class<?> cls = fieldSerializerArr[i10].fieldInfo.fieldClass;
            if (cls.isEnum() && !(getObjectWriter(cls) instanceof EnumSerializer)) {
                javaBeanSerializerCreateJavaBeanSerializer.writeDirect = false;
            }
            i10++;
        }
    }

    public static SerializeConfig getGlobalInstance() {
        return globalInstance;
    }

    /* JADX WARN: Code duplicated, block: B:224:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:274:? A[RETURN, SYNTHETIC] */
    private ObjectSerializer getObjectWriter(Class<?> cls, boolean z10) {
        ObjectSerializer objectSerializerCreateJavaBeanSerializer;
        ClassLoader classLoader;
        ObjectSerializer objectSerializer = this.serializers.get(cls);
        if (objectSerializer == null) {
            try {
                for (Object obj : ServiceLoader.load(AutowiredObjectSerializer.class, Thread.currentThread().getContextClassLoader())) {
                    if (obj instanceof AutowiredObjectSerializer) {
                        AutowiredObjectSerializer autowiredObjectSerializer = (AutowiredObjectSerializer) obj;
                        Iterator<Type> it = autowiredObjectSerializer.getAutowiredFor().iterator();
                        while (it.hasNext()) {
                            put(it.next(), (ObjectSerializer) autowiredObjectSerializer);
                        }
                    }
                }
            } catch (ClassCastException unused) {
            }
            objectSerializer = this.serializers.get(cls);
        }
        if (objectSerializer == null && (classLoader = JSON.class.getClassLoader()) != Thread.currentThread().getContextClassLoader()) {
            try {
                for (Object obj2 : ServiceLoader.load(AutowiredObjectSerializer.class, classLoader)) {
                    if (obj2 instanceof AutowiredObjectSerializer) {
                        AutowiredObjectSerializer autowiredObjectSerializer2 = (AutowiredObjectSerializer) obj2;
                        Iterator<Type> it2 = autowiredObjectSerializer2.getAutowiredFor().iterator();
                        while (it2.hasNext()) {
                            put(it2.next(), (ObjectSerializer) autowiredObjectSerializer2);
                        }
                    }
                }
            } catch (ClassCastException unused2) {
            }
            objectSerializer = this.serializers.get(cls);
        }
        if (objectSerializer != null) {
            return objectSerializer;
        }
        String name = cls.getName();
        if (Map.class.isAssignableFrom(cls)) {
            objectSerializerCreateJavaBeanSerializer = MapSerializer.instance;
            put((Type) cls, objectSerializerCreateJavaBeanSerializer);
        } else if (List.class.isAssignableFrom(cls)) {
            objectSerializerCreateJavaBeanSerializer = ListSerializer.instance;
            put((Type) cls, objectSerializerCreateJavaBeanSerializer);
        } else if (Collection.class.isAssignableFrom(cls)) {
            objectSerializerCreateJavaBeanSerializer = CollectionCodec.instance;
            put((Type) cls, objectSerializerCreateJavaBeanSerializer);
        } else if (Date.class.isAssignableFrom(cls)) {
            objectSerializerCreateJavaBeanSerializer = DateCodec.instance;
            put((Type) cls, objectSerializerCreateJavaBeanSerializer);
        } else if (JSONAware.class.isAssignableFrom(cls)) {
            objectSerializerCreateJavaBeanSerializer = JSONAwareSerializer.instance;
            put((Type) cls, objectSerializerCreateJavaBeanSerializer);
        } else if (JSONSerializable.class.isAssignableFrom(cls)) {
            objectSerializerCreateJavaBeanSerializer = JSONSerializableSerializer.instance;
            put((Type) cls, objectSerializerCreateJavaBeanSerializer);
        } else if (JSONStreamAware.class.isAssignableFrom(cls)) {
            objectSerializerCreateJavaBeanSerializer = MiscCodec.instance;
            put((Type) cls, objectSerializerCreateJavaBeanSerializer);
        } else if (cls.isEnum()) {
            JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls, JSONType.class);
            if (jSONType == null || !jSONType.serializeEnumAsJavaBean()) {
                objectSerializerCreateJavaBeanSerializer = EnumSerializer.instance;
                put((Type) cls, objectSerializerCreateJavaBeanSerializer);
            } else {
                objectSerializerCreateJavaBeanSerializer = createJavaBeanSerializer(cls);
                put((Type) cls, objectSerializerCreateJavaBeanSerializer);
            }
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null || !superclass.isEnum()) {
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    ObjectSerializer arraySerializer = new ArraySerializer(componentType, getObjectWriter(componentType));
                    put((Type) cls, arraySerializer);
                    objectSerializer = arraySerializer;
                } else {
                    Class<?> cls2 = null;
                    if (Throwable.class.isAssignableFrom(cls)) {
                        SerializeBeanInfo serializeBeanInfoBuildBeanInfo = TypeUtils.buildBeanInfo(cls, null, this.propertyNamingStrategy);
                        serializeBeanInfoBuildBeanInfo.features |= SerializerFeature.WriteClassName.mask;
                        ObjectSerializer javaBeanSerializer = new JavaBeanSerializer(serializeBeanInfoBuildBeanInfo);
                        put((Type) cls, javaBeanSerializer);
                        objectSerializer = javaBeanSerializer;
                    } else if (TimeZone.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls)) {
                        objectSerializerCreateJavaBeanSerializer = MiscCodec.instance;
                        put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                    } else if (Appendable.class.isAssignableFrom(cls)) {
                        objectSerializerCreateJavaBeanSerializer = AppendableSerializer.instance;
                        put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                    } else if (Charset.class.isAssignableFrom(cls)) {
                        objectSerializerCreateJavaBeanSerializer = ToStringSerializer.instance;
                        put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                    } else if (Enumeration.class.isAssignableFrom(cls)) {
                        objectSerializerCreateJavaBeanSerializer = EnumerationSerializer.instance;
                        put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                    } else if (Calendar.class.isAssignableFrom(cls) || XMLGregorianCalendar.class.isAssignableFrom(cls)) {
                        objectSerializerCreateJavaBeanSerializer = CalendarCodec.instance;
                        put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                    } else if (Clob.class.isAssignableFrom(cls)) {
                        objectSerializerCreateJavaBeanSerializer = ClobSeriliazer.instance;
                        put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                    } else if (TypeUtils.isPath(cls)) {
                        objectSerializerCreateJavaBeanSerializer = ToStringSerializer.instance;
                        put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                    } else if (Iterator.class.isAssignableFrom(cls)) {
                        objectSerializerCreateJavaBeanSerializer = MiscCodec.instance;
                        put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                    } else {
                        int i10 = 0;
                        if (name.startsWith("java.awt.") && AwtCodec.support(cls) && !awtError) {
                            try {
                                String[] strArr = {"java.awt.Color", "java.awt.Font", "java.awt.Point", "java.awt.Rectangle"};
                                for (int i11 = 0; i11 < 4; i11++) {
                                    String str = strArr[i11];
                                    if (str.equals(name)) {
                                        Type cls3 = Class.forName(str);
                                        objectSerializer = AwtCodec.instance;
                                        put(cls3, objectSerializer);
                                        return objectSerializer;
                                    }
                                }
                            } catch (Throwable unused3) {
                                awtError = true;
                            }
                        }
                        if (!jdk8Error && (name.startsWith("java.time.") || name.startsWith("java.util.Optional") || name.equals("java.util.concurrent.atomic.LongAdder") || name.equals("java.util.concurrent.atomic.DoubleAdder"))) {
                            try {
                                String[] strArr2 = {"java.time.LocalDateTime", "java.time.LocalDate", "java.time.LocalTime", "java.time.ZonedDateTime", "java.time.OffsetDateTime", "java.time.OffsetTime", "java.time.ZoneOffset", "java.time.ZoneRegion", "java.time.Period", "java.time.Duration", "java.time.Instant"};
                                for (int i12 = 0; i12 < 11; i12++) {
                                    String str2 = strArr2[i12];
                                    if (str2.equals(name)) {
                                        Type cls4 = Class.forName(str2);
                                        ObjectSerializer objectSerializer2 = Jdk8DateCodec.instance;
                                        put(cls4, objectSerializer2);
                                        return objectSerializer2;
                                    }
                                }
                                String[] strArr3 = {"java.util.Optional", "java.util.OptionalDouble", "java.util.OptionalInt", "java.util.OptionalLong"};
                                for (int i13 = 0; i13 < 4; i13++) {
                                    String str3 = strArr3[i13];
                                    if (str3.equals(name)) {
                                        Type cls5 = Class.forName(str3);
                                        ObjectSerializer objectSerializer3 = OptionalCodec.instance;
                                        put(cls5, objectSerializer3);
                                        return objectSerializer3;
                                    }
                                }
                                String[] strArr4 = {"java.util.concurrent.atomic.LongAdder", "java.util.concurrent.atomic.DoubleAdder"};
                                for (int i14 = 0; i14 < 2; i14++) {
                                    String str4 = strArr4[i14];
                                    if (str4.equals(name)) {
                                        Type cls6 = Class.forName(str4);
                                        ObjectSerializer objectSerializer4 = AdderSerializer.instance;
                                        put(cls6, objectSerializer4);
                                        return objectSerializer4;
                                    }
                                }
                            } catch (Throwable unused4) {
                                jdk8Error = true;
                            }
                        }
                        if (!oracleJdbcError && name.startsWith("oracle.sql.")) {
                            try {
                                String[] strArr5 = {"oracle.sql.DATE", "oracle.sql.TIMESTAMP"};
                                for (int i15 = 0; i15 < 2; i15++) {
                                    String str5 = strArr5[i15];
                                    if (str5.equals(name)) {
                                        Type cls7 = Class.forName(str5);
                                        objectSerializer = DateCodec.instance;
                                        put(cls7, objectSerializer);
                                        return objectSerializer;
                                    }
                                }
                            } catch (Throwable unused5) {
                                oracleJdbcError = true;
                            }
                        }
                        if (!springfoxError && name.equals("springfox.documentation.spring.web.json.Json")) {
                            try {
                                Type cls8 = Class.forName("springfox.documentation.spring.web.json.Json");
                                objectSerializer = SwaggerJsonSerializer.instance;
                                put(cls8, objectSerializer);
                                return objectSerializer;
                            } catch (ClassNotFoundException unused6) {
                                springfoxError = true;
                            }
                        }
                        if (!guavaError && name.startsWith("com.google.common.collect.")) {
                            try {
                                String[] strArr6 = {"com.google.common.collect.HashMultimap", "com.google.common.collect.LinkedListMultimap", "com.google.common.collect.ArrayListMultimap", "com.google.common.collect.TreeMultimap"};
                                for (int i16 = 0; i16 < 4; i16++) {
                                    String str6 = strArr6[i16];
                                    if (str6.equals(name)) {
                                        Type cls9 = Class.forName(str6);
                                        objectSerializer = GuavaCodec.instance;
                                        put(cls9, objectSerializer);
                                        return objectSerializer;
                                    }
                                }
                            } catch (ClassNotFoundException unused7) {
                                guavaError = true;
                            }
                        }
                        if (!jsonnullError && name.equals("net.sf.json.JSONNull")) {
                            try {
                                Type cls10 = Class.forName("net.sf.json.JSONNull");
                                objectSerializer = MiscCodec.instance;
                                put(cls10, objectSerializer);
                                return objectSerializer;
                            } catch (ClassNotFoundException unused8) {
                                jsonnullError = true;
                            }
                        }
                        Class<?>[] interfaces = cls.getInterfaces();
                        if (interfaces.length == 1 && interfaces[0].isAnnotation()) {
                            return AnnotationSerializer.instance;
                        }
                        if (TypeUtils.isProxy(cls)) {
                            ObjectSerializer objectWriter = getObjectWriter(cls.getSuperclass());
                            put((Type) cls, objectWriter);
                            return objectWriter;
                        }
                        if (Proxy.isProxyClass(cls)) {
                            if (interfaces.length != 2) {
                                int length = interfaces.length;
                                Class<?> cls11 = null;
                                while (true) {
                                    if (i10 >= length) {
                                        cls2 = cls11;
                                        break;
                                    }
                                    Class<?> cls12 = interfaces[i10];
                                    if (!cls12.getName().startsWith("org.springframework.aop.")) {
                                        if (cls11 != null) {
                                            break;
                                        }
                                        cls11 = cls12;
                                    }
                                    i10++;
                                }
                            } else {
                                cls2 = interfaces[1];
                            }
                            if (cls2 != null) {
                                ObjectSerializer objectWriter2 = getObjectWriter(cls2);
                                put((Type) cls, objectWriter2);
                                return objectWriter2;
                            }
                        }
                        if (z10) {
                            objectSerializerCreateJavaBeanSerializer = createJavaBeanSerializer(cls);
                            put((Type) cls, objectSerializerCreateJavaBeanSerializer);
                        }
                    }
                }
                if (objectSerializer == null) {
                    return this.serializers.get(cls);
                }
                return objectSerializer;
            }
            JSONType jSONType2 = (JSONType) TypeUtils.getAnnotation(superclass, JSONType.class);
            if (jSONType2 == null || !jSONType2.serializeEnumAsJavaBean()) {
                objectSerializerCreateJavaBeanSerializer = EnumSerializer.instance;
                put((Type) cls, objectSerializerCreateJavaBeanSerializer);
            } else {
                objectSerializerCreateJavaBeanSerializer = createJavaBeanSerializer(cls);
                put((Type) cls, objectSerializerCreateJavaBeanSerializer);
            }
        }
        objectSerializer = objectSerializerCreateJavaBeanSerializer;
        if (objectSerializer == null) {
            return this.serializers.get(cls);
        }
        return objectSerializer;
    }

    private void initSerializers() {
        put(Boolean.class, (ObjectSerializer) BooleanCodec.instance);
        put(Character.class, (ObjectSerializer) CharacterCodec.instance);
        put(Byte.class, (ObjectSerializer) IntegerCodec.instance);
        put(Short.class, (ObjectSerializer) IntegerCodec.instance);
        put(Integer.class, (ObjectSerializer) IntegerCodec.instance);
        put(Long.class, (ObjectSerializer) LongCodec.instance);
        put(Float.class, (ObjectSerializer) FloatCodec.instance);
        put(Double.class, (ObjectSerializer) DoubleSerializer.instance);
        put(BigDecimal.class, (ObjectSerializer) BigDecimalCodec.instance);
        put(BigInteger.class, (ObjectSerializer) BigIntegerCodec.instance);
        put(String.class, (ObjectSerializer) StringCodec.instance);
        put(byte[].class, (ObjectSerializer) PrimitiveArraySerializer.instance);
        put(short[].class, (ObjectSerializer) PrimitiveArraySerializer.instance);
        put(int[].class, (ObjectSerializer) PrimitiveArraySerializer.instance);
        put(long[].class, (ObjectSerializer) PrimitiveArraySerializer.instance);
        put(float[].class, (ObjectSerializer) PrimitiveArraySerializer.instance);
        put(double[].class, (ObjectSerializer) PrimitiveArraySerializer.instance);
        put(boolean[].class, (ObjectSerializer) PrimitiveArraySerializer.instance);
        put(char[].class, (ObjectSerializer) PrimitiveArraySerializer.instance);
        put(Object[].class, (ObjectSerializer) ObjectArrayCodec.instance);
        MiscCodec miscCodec = MiscCodec.instance;
        put(Class.class, (ObjectSerializer) miscCodec);
        put(SimpleDateFormat.class, (ObjectSerializer) miscCodec);
        put(Currency.class, (ObjectSerializer) new MiscCodec());
        put(TimeZone.class, (ObjectSerializer) miscCodec);
        put(InetAddress.class, (ObjectSerializer) miscCodec);
        put(Inet4Address.class, (ObjectSerializer) miscCodec);
        put(Inet6Address.class, (ObjectSerializer) miscCodec);
        put(InetSocketAddress.class, (ObjectSerializer) miscCodec);
        put(File.class, (ObjectSerializer) miscCodec);
        AppendableSerializer appendableSerializer = AppendableSerializer.instance;
        put(Appendable.class, (ObjectSerializer) appendableSerializer);
        put(StringBuffer.class, (ObjectSerializer) appendableSerializer);
        put(StringBuilder.class, (ObjectSerializer) appendableSerializer);
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        put(Charset.class, (ObjectSerializer) toStringSerializer);
        put(Pattern.class, (ObjectSerializer) toStringSerializer);
        put(Locale.class, (ObjectSerializer) toStringSerializer);
        put(URI.class, (ObjectSerializer) toStringSerializer);
        put(URL.class, (ObjectSerializer) toStringSerializer);
        put(UUID.class, (ObjectSerializer) toStringSerializer);
        AtomicCodec atomicCodec = AtomicCodec.instance;
        put(AtomicBoolean.class, (ObjectSerializer) atomicCodec);
        put(AtomicInteger.class, (ObjectSerializer) atomicCodec);
        put(AtomicLong.class, (ObjectSerializer) atomicCodec);
        ReferenceCodec referenceCodec = ReferenceCodec.instance;
        put(AtomicReference.class, (ObjectSerializer) referenceCodec);
        put(AtomicIntegerArray.class, (ObjectSerializer) atomicCodec);
        put(AtomicLongArray.class, (ObjectSerializer) atomicCodec);
        put(WeakReference.class, (ObjectSerializer) referenceCodec);
        put(SoftReference.class, (ObjectSerializer) referenceCodec);
        put(LinkedList.class, (ObjectSerializer) CollectionCodec.instance);
    }

    public void addFilter(Class<?> cls, SerializeFilter serializeFilter) {
        Object objectWriter = getObjectWriter(cls);
        if (objectWriter instanceof SerializeFilterable) {
            SerializeFilterable serializeFilterable = (SerializeFilterable) objectWriter;
            if (this == globalInstance || serializeFilterable != MapSerializer.instance) {
                serializeFilterable.addFilter(serializeFilter);
                return;
            }
            MapSerializer mapSerializer = new MapSerializer();
            put((Type) cls, (ObjectSerializer) mapSerializer);
            mapSerializer.addFilter(serializeFilter);
        }
    }

    public void clearSerializers() {
        this.serializers.clear();
        initSerializers();
    }

    public void config(Class<?> cls, SerializerFeature serializerFeature, boolean z10) {
        ObjectSerializer objectWriter = getObjectWriter(cls, false);
        if (objectWriter == null) {
            SerializeBeanInfo serializeBeanInfoBuildBeanInfo = TypeUtils.buildBeanInfo(cls, null, this.propertyNamingStrategy);
            if (z10) {
                serializeBeanInfoBuildBeanInfo.features = serializerFeature.mask | serializeBeanInfoBuildBeanInfo.features;
            } else {
                serializeBeanInfoBuildBeanInfo.features = (~serializerFeature.mask) & serializeBeanInfoBuildBeanInfo.features;
            }
            put((Type) cls, createJavaBeanSerializer(serializeBeanInfoBuildBeanInfo));
            return;
        }
        if (objectWriter instanceof JavaBeanSerializer) {
            SerializeBeanInfo serializeBeanInfo = ((JavaBeanSerializer) objectWriter).beanInfo;
            int i10 = serializeBeanInfo.features;
            if (z10) {
                serializeBeanInfo.features = serializerFeature.mask | i10;
            } else {
                serializeBeanInfo.features = (~serializerFeature.mask) & i10;
            }
            if (i10 == serializeBeanInfo.features || objectWriter.getClass() == JavaBeanSerializer.class) {
                return;
            }
            put((Type) cls, createJavaBeanSerializer(serializeBeanInfo));
        }
    }

    public void configEnumAsJavaBean(Class<? extends Enum>... clsArr) {
        for (Class<? extends Enum> cls : clsArr) {
            put((Type) cls, createJavaBeanSerializer(cls));
        }
    }

    public ObjectSerializer createJavaBeanSerializer(SerializeBeanInfo serializeBeanInfo) {
        Method method;
        JSONType jSONType = serializeBeanInfo.jsonType;
        boolean z10 = true;
        boolean z11 = this.asm && !this.fieldBased;
        if (jSONType != null) {
            Class<?> clsSerializer = jSONType.serializer();
            if (clsSerializer != Void.class) {
                try {
                    Object objNewInstance = clsSerializer.newInstance();
                    if (objNewInstance instanceof ObjectSerializer) {
                        return (ObjectSerializer) objNewInstance;
                    }
                } catch (Throwable unused) {
                }
            }
            if (!jSONType.asm()) {
                z11 = false;
            }
            for (SerializerFeature serializerFeature : jSONType.serialzeFeatures()) {
                if (SerializerFeature.WriteNonStringValueAsString == serializerFeature || SerializerFeature.WriteEnumUsingToString == serializerFeature || SerializerFeature.NotWriteDefaultValue == serializerFeature || SerializerFeature.BrowserCompatible == serializerFeature) {
                    z11 = false;
                    break;
                }
            }
        }
        Class<?> cls = serializeBeanInfo.beanType;
        if (!Modifier.isPublic(cls.getModifiers())) {
            return new JavaBeanSerializer(serializeBeanInfo);
        }
        if ((z11 && this.asmFactory.classLoader.isExternalClass(cls)) || cls == Serializable.class || cls == Object.class) {
            z11 = false;
        }
        if (z11 && !ASMUtils.checkName(cls.getSimpleName())) {
            z11 = false;
        }
        if (z11 && serializeBeanInfo.beanType.isInterface()) {
            z11 = false;
        }
        if (!z11) {
            z10 = z11;
            break;
        }
        FieldInfo[] fieldInfoArr = serializeBeanInfo.fields;
        int length = fieldInfoArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                FieldInfo fieldInfo = fieldInfoArr[i10];
                Field field = fieldInfo.field;
                if ((field == null || field.getType().equals(fieldInfo.fieldClass)) && ((method = fieldInfo.method) == null || method.getReturnType().equals(fieldInfo.fieldClass))) {
                    JSONField annotation = fieldInfo.getAnnotation();
                    if (annotation != null) {
                        String str = annotation.format();
                        if ((str.length() == 0 || (fieldInfo.fieldClass == String.class && "trim".equals(str))) && ASMUtils.checkName(annotation.name()) && !annotation.jsonDirect() && annotation.serializeUsing() == Void.class && !annotation.unwrapped()) {
                            for (SerializerFeature serializerFeature2 : annotation.serialzeFeatures()) {
                                if (SerializerFeature.WriteNonStringValueAsString == serializerFeature2 || SerializerFeature.WriteEnumUsingToString == serializerFeature2 || SerializerFeature.NotWriteDefaultValue == serializerFeature2 || SerializerFeature.BrowserCompatible == serializerFeature2 || SerializerFeature.WriteClassName == serializerFeature2) {
                                    z11 = false;
                                    break;
                                }
                            }
                            if (TypeUtils.isAnnotationPresentOneToMany(method) || TypeUtils.isAnnotationPresentManyToMany(method)) {
                                break;
                            }
                        }
                    }
                    i10++;
                }
                z10 = false;
                break;
            }
            z10 = z11;
            break;
        }
        if (z10) {
            try {
                JavaBeanSerializer javaBeanSerializerCreateASMSerializer = createASMSerializer(serializeBeanInfo);
                if (javaBeanSerializerCreateASMSerializer != null) {
                    return javaBeanSerializerCreateASMSerializer;
                }
            } catch (ClassCastException | ClassFormatError | ClassNotFoundException unused2) {
            } catch (Throwable th2) {
                throw new JSONException("create asm serializer error, class " + cls, th2);
            }
        }
        return new JavaBeanSerializer(serializeBeanInfo);
    }

    public final ObjectSerializer createJavaBeanSerializer(Class<?> cls) {
        SerializeBeanInfo serializeBeanInfoBuildBeanInfo = TypeUtils.buildBeanInfo(cls, null, this.propertyNamingStrategy, this.fieldBased);
        return (serializeBeanInfoBuildBeanInfo.fields.length == 0 && Iterable.class.isAssignableFrom(cls)) ? MiscCodec.instance : createJavaBeanSerializer(serializeBeanInfoBuildBeanInfo);
    }

    public final ObjectSerializer get(Type type) {
        return this.serializers.get(type);
    }

    public ObjectSerializer getObjectWriter(Class<?> cls) {
        return getObjectWriter(cls, true);
    }

    public String getTypeKey() {
        return this.typeKey;
    }

    public boolean isAsmEnable() {
        return this.asm;
    }

    public boolean put(Object obj, Object obj2) {
        return put((Type) obj, (ObjectSerializer) obj2);
    }

    public boolean put(Type type, ObjectSerializer objectSerializer) {
        return this.serializers.put(type, objectSerializer);
    }

    public void setAsmEnable(boolean z10) {
        if (ASMUtils.IS_ANDROID) {
            return;
        }
        this.asm = z10;
    }

    public void setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this.propertyNamingStrategy = propertyNamingStrategy;
    }

    public void setTypeKey(String str) {
        this.typeKey = str;
    }
}
