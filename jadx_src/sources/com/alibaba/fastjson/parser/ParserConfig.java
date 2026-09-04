package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.ClassReader;
import com.alibaba.fastjson.asm.TypeCollector;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.parser.deserializer.ArrayListTypeFieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.EnumDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JSONPDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec;
import com.alibaba.fastjson.parser.deserializer.MapDeserializer;
import com.alibaba.fastjson.parser.deserializer.NumberDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.OptionalCodec;
import com.alibaba.fastjson.parser.deserializer.PropertyProcessable;
import com.alibaba.fastjson.parser.deserializer.PropertyProcessableDeserializer;
import com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer;
import com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer;
import com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer;
import com.alibaba.fastjson.parser.deserializer.TimeDeserializer;
import com.alibaba.fastjson.serializer.AtomicCodec;
import com.alibaba.fastjson.serializer.AwtCodec;
import com.alibaba.fastjson.serializer.BigDecimalCodec;
import com.alibaba.fastjson.serializer.BigIntegerCodec;
import com.alibaba.fastjson.serializer.BooleanCodec;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.serializer.CharArrayCodec;
import com.alibaba.fastjson.serializer.CharacterCodec;
import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.FloatCodec;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.LongCodec;
import com.alibaba.fastjson.serializer.MiscCodec;
import com.alibaba.fastjson.serializer.ObjectArrayCodec;
import com.alibaba.fastjson.serializer.ReferenceCodec;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ServiceLoader;
import com.alibaba.fastjson.util.TypeUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.sql.DataSource;
import javax.xml.datatype.XMLGregorianCalendar;
import kotlin.text.y;
import lg.a;

/* JADX INFO: loaded from: classes6.dex */
public class ParserConfig {
    public static final String AUTOTYPE_ACCEPT = "fastjson.parser.autoTypeAccept";
    private static final String[] AUTO_TYPE_ACCEPT_LIST;
    private static boolean awtError;
    public static ParserConfig global;
    private static boolean jdk8Error;
    private long[] acceptHashCodes;
    private boolean asmEnable;
    protected ASMDeserializerFactory asmFactory;
    private boolean autoTypeSupport;
    public boolean compatibleWithJavaBean;
    protected ClassLoader defaultClassLoader;
    private long[] denyHashCodes;
    private final IdentityHashMap<Type, ObjectDeserializer> deserializers;
    public final boolean fieldBased;
    public PropertyNamingStrategy propertyNamingStrategy;
    public final SymbolTable symbolTable;
    public static final String DENY_PROPERTY = "fastjson.parser.deny";
    public static final String[] DENYS = splitItemsFormProperty(IOUtils.getStringProperty(DENY_PROPERTY));
    public static final String AUTOTYPE_SUPPORT_PROPERTY = "fastjson.parser.autoTypeSupport";
    public static final boolean AUTO_SUPPORT = "true".equals(IOUtils.getStringProperty(AUTOTYPE_SUPPORT_PROPERTY));

    static {
        String[] strArrSplitItemsFormProperty = splitItemsFormProperty(IOUtils.getStringProperty(AUTOTYPE_ACCEPT));
        if (strArrSplitItemsFormProperty == null) {
            strArrSplitItemsFormProperty = new String[0];
        }
        AUTO_TYPE_ACCEPT_LIST = strArrSplitItemsFormProperty;
        global = new ParserConfig();
        awtError = false;
        jdk8Error = false;
    }

    public ParserConfig() {
        this(false);
    }

    public ParserConfig(ASMDeserializerFactory aSMDeserializerFactory) {
        this(aSMDeserializerFactory, null, false);
    }

    private ParserConfig(ASMDeserializerFactory aSMDeserializerFactory, ClassLoader classLoader, boolean z10) {
        this.deserializers = new IdentityHashMap<>();
        this.asmEnable = !ASMUtils.IS_ANDROID;
        this.symbolTable = new SymbolTable(4096);
        this.autoTypeSupport = AUTO_SUPPORT;
        this.compatibleWithJavaBean = TypeUtils.compatibleWithJavaBean;
        this.denyHashCodes = new long[]{-8720046426850100497L, -8165637398350707645L, -8109300701639721088L, -8083514888460375884L, -7966123100503199569L, -7921218830998286408L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6179589609550493385L, -5194641081268104286L, -4837536971810737970L, -4082057040235125754L, -3935185854875733362L, -2753427844400776271L, -2364987994247679115L, -2262244760619952081L, -1872417015366588117L, -1589194880214235129L, -254670111376247151L, -190281065685395680L, 33238344207745342L, 313864100207897507L, 1073634739308289776L, 1203232727967308606L, 1459860845934817624L, 1502845958873959152L, 3547627781654598988L, 3730752432285826863L, 3794316665763266033L, 4147696707147271408L, 5347909877633654828L, 5450448828334921485L, 5688200883751798389L, 5751393439502795295L, 5944107969236155580L, 6742705432718011780L, 7017492163108594270L, 7179336928365889465L, 7442624256860549330L, 8389032537095247355L, 8409640769019589119L, 8838294710098435315L};
        long[] jArr = new long[AUTO_TYPE_ACCEPT_LIST.length];
        int i10 = 0;
        while (true) {
            String[] strArr = AUTO_TYPE_ACCEPT_LIST;
            if (i10 >= strArr.length) {
                break;
            }
            jArr[i10] = TypeUtils.fnv1a_64(strArr[i10]);
            i10++;
        }
        Arrays.sort(jArr);
        this.acceptHashCodes = jArr;
        this.fieldBased = z10;
        if (aSMDeserializerFactory == null && !ASMUtils.IS_ANDROID) {
            try {
                aSMDeserializerFactory = classLoader == null ? new ASMDeserializerFactory(new ASMClassLoader()) : new ASMDeserializerFactory(classLoader);
            } catch (ExceptionInInitializerError | NoClassDefFoundError | AccessControlException unused) {
            }
        }
        this.asmFactory = aSMDeserializerFactory;
        if (aSMDeserializerFactory == null) {
            this.asmEnable = false;
        }
        initDeserializers();
        addItemsToDeny(DENYS);
        addItemsToAccept(AUTO_TYPE_ACCEPT_LIST);
    }

    public ParserConfig(ClassLoader classLoader) {
        this(null, classLoader, false);
    }

    public ParserConfig(boolean z10) {
        this(null, null, z10);
    }

    private void addItemsToAccept(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            addAccept(str);
        }
    }

    private void addItemsToDeny(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            addDeny(str);
        }
    }

    public static Field getFieldFromCache(String str, Map<String, Field> map) {
        Field field = map.get(str);
        if (field == null) {
            field = map.get(a.f131412e + str);
        }
        if (field == null) {
            field = map.get("m_" + str);
        }
        if (field != null) {
            return field;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] - ' ');
            field = map.get(new String(charArray));
        }
        if (str.length() <= 2) {
            return field;
        }
        char cCharAt2 = str.charAt(1);
        if (str.length() <= 2 || cCharAt < 'a' || cCharAt > 'z' || cCharAt2 < 'A' || cCharAt2 > 'Z') {
            return field;
        }
        for (Map.Entry<String, Field> entry : map.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return field;
    }

    public static ParserConfig getGlobalInstance() {
        return global;
    }

    private void initDeserializers() {
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap = this.deserializers;
        MiscCodec miscCodec = MiscCodec.instance;
        identityHashMap.put(SimpleDateFormat.class, miscCodec);
        this.deserializers.put(Timestamp.class, SqlDateDeserializer.instance_timestamp);
        this.deserializers.put(Date.class, SqlDateDeserializer.instance);
        this.deserializers.put(Time.class, TimeDeserializer.instance);
        this.deserializers.put(java.util.Date.class, DateCodec.instance);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap2 = this.deserializers;
        CalendarCodec calendarCodec = CalendarCodec.instance;
        identityHashMap2.put(Calendar.class, calendarCodec);
        this.deserializers.put(XMLGregorianCalendar.class, calendarCodec);
        this.deserializers.put(JSONObject.class, MapDeserializer.instance);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap3 = this.deserializers;
        CollectionCodec collectionCodec = CollectionCodec.instance;
        identityHashMap3.put(JSONArray.class, collectionCodec);
        this.deserializers.put(Map.class, MapDeserializer.instance);
        this.deserializers.put(HashMap.class, MapDeserializer.instance);
        this.deserializers.put(LinkedHashMap.class, MapDeserializer.instance);
        this.deserializers.put(TreeMap.class, MapDeserializer.instance);
        this.deserializers.put(ConcurrentMap.class, MapDeserializer.instance);
        this.deserializers.put(ConcurrentHashMap.class, MapDeserializer.instance);
        this.deserializers.put(Collection.class, collectionCodec);
        this.deserializers.put(List.class, collectionCodec);
        this.deserializers.put(ArrayList.class, collectionCodec);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap4 = this.deserializers;
        JavaObjectDeserializer javaObjectDeserializer = JavaObjectDeserializer.instance;
        identityHashMap4.put(Object.class, javaObjectDeserializer);
        this.deserializers.put(String.class, StringCodec.instance);
        this.deserializers.put(StringBuffer.class, StringCodec.instance);
        this.deserializers.put(StringBuilder.class, StringCodec.instance);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap5 = this.deserializers;
        Class cls = Character.TYPE;
        CharacterCodec characterCodec = CharacterCodec.instance;
        identityHashMap5.put(cls, characterCodec);
        this.deserializers.put(Character.class, characterCodec);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap6 = this.deserializers;
        Class cls2 = Byte.TYPE;
        NumberDeserializer numberDeserializer = NumberDeserializer.instance;
        identityHashMap6.put(cls2, numberDeserializer);
        this.deserializers.put(Byte.class, numberDeserializer);
        this.deserializers.put(Short.TYPE, numberDeserializer);
        this.deserializers.put(Short.class, numberDeserializer);
        this.deserializers.put(Integer.TYPE, IntegerCodec.instance);
        this.deserializers.put(Integer.class, IntegerCodec.instance);
        this.deserializers.put(Long.TYPE, LongCodec.instance);
        this.deserializers.put(Long.class, LongCodec.instance);
        this.deserializers.put(BigInteger.class, BigIntegerCodec.instance);
        this.deserializers.put(BigDecimal.class, BigDecimalCodec.instance);
        this.deserializers.put(Float.TYPE, FloatCodec.instance);
        this.deserializers.put(Float.class, FloatCodec.instance);
        this.deserializers.put(Double.TYPE, numberDeserializer);
        this.deserializers.put(Double.class, numberDeserializer);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap7 = this.deserializers;
        Class cls3 = Boolean.TYPE;
        BooleanCodec booleanCodec = BooleanCodec.instance;
        identityHashMap7.put(cls3, booleanCodec);
        this.deserializers.put(Boolean.class, booleanCodec);
        this.deserializers.put(Class.class, miscCodec);
        this.deserializers.put(char[].class, new CharArrayCodec());
        this.deserializers.put(AtomicBoolean.class, booleanCodec);
        this.deserializers.put(AtomicInteger.class, IntegerCodec.instance);
        this.deserializers.put(AtomicLong.class, LongCodec.instance);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap8 = this.deserializers;
        ReferenceCodec referenceCodec = ReferenceCodec.instance;
        identityHashMap8.put(AtomicReference.class, referenceCodec);
        this.deserializers.put(WeakReference.class, referenceCodec);
        this.deserializers.put(SoftReference.class, referenceCodec);
        this.deserializers.put(UUID.class, miscCodec);
        this.deserializers.put(TimeZone.class, miscCodec);
        this.deserializers.put(Locale.class, miscCodec);
        this.deserializers.put(Currency.class, miscCodec);
        this.deserializers.put(Inet4Address.class, miscCodec);
        this.deserializers.put(Inet6Address.class, miscCodec);
        this.deserializers.put(InetSocketAddress.class, miscCodec);
        this.deserializers.put(File.class, miscCodec);
        this.deserializers.put(URI.class, miscCodec);
        this.deserializers.put(URL.class, miscCodec);
        this.deserializers.put(Pattern.class, miscCodec);
        this.deserializers.put(Charset.class, miscCodec);
        this.deserializers.put(JSONPath.class, miscCodec);
        this.deserializers.put(Number.class, numberDeserializer);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap9 = this.deserializers;
        AtomicCodec atomicCodec = AtomicCodec.instance;
        identityHashMap9.put(AtomicIntegerArray.class, atomicCodec);
        this.deserializers.put(AtomicLongArray.class, atomicCodec);
        this.deserializers.put(StackTraceElement.class, StackTraceElementDeserializer.instance);
        this.deserializers.put(Serializable.class, javaObjectDeserializer);
        this.deserializers.put(Cloneable.class, javaObjectDeserializer);
        this.deserializers.put(Comparable.class, javaObjectDeserializer);
        this.deserializers.put(Closeable.class, javaObjectDeserializer);
        this.deserializers.put(JSONPObject.class, new JSONPDeserializer());
    }

    public static boolean isPrimitive2(Class<?> cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == java.util.Date.class || cls == Date.class || cls == Time.class || cls == Timestamp.class || cls.isEnum();
    }

    public static void parserAllFieldToCache(Class<?> cls, Map<String, Field> map) {
        for (Field field : cls.getDeclaredFields()) {
            String name = field.getName();
            if (!map.containsKey(name)) {
                map.put(name, field);
            }
        }
        if (cls.getSuperclass() == null || cls.getSuperclass() == Object.class) {
            return;
        }
        parserAllFieldToCache(cls.getSuperclass(), map);
    }

    private static String[] splitItemsFormProperty(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    public void addAccept(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        long jFnv1a_64 = TypeUtils.fnv1a_64(str);
        if (Arrays.binarySearch(this.acceptHashCodes, jFnv1a_64) >= 0) {
            return;
        }
        long[] jArr = this.acceptHashCodes;
        int length = jArr.length + 1;
        long[] jArr2 = new long[length];
        jArr2[length - 1] = jFnv1a_64;
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        Arrays.sort(jArr2);
        this.acceptHashCodes = jArr2;
    }

    public void addDeny(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        long jFnv1a_64 = TypeUtils.fnv1a_64(str);
        if (Arrays.binarySearch(this.denyHashCodes, jFnv1a_64) >= 0) {
            return;
        }
        long[] jArr = this.denyHashCodes;
        int length = jArr.length + 1;
        long[] jArr2 = new long[length];
        jArr2[length - 1] = jFnv1a_64;
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        Arrays.sort(jArr2);
        this.denyHashCodes = jArr2;
    }

    public Class<?> checkAutoType(String str, Class<?> cls) {
        return checkAutoType(str, cls, JSON.DEFAULT_PARSER_FEATURE);
    }

    public Class<?> checkAutoType(String str, Class<?> cls, int i10) throws Throwable {
        Class<?> clsLoadClass;
        long j10;
        String str2;
        InputStream inputStream;
        boolean z10;
        InputStream inputStream2;
        boolean zHasJsonType;
        if (str == null) {
            return null;
        }
        if (str.length() >= 128 || str.length() < 3) {
            throw new JSONException("autoType is not support. " + str);
        }
        boolean z11 = (cls == null || cls == Object.class || cls == Serializable.class || cls == Cloneable.class || cls == Closeable.class || cls == EventListener.class || cls == Iterable.class || cls == Collection.class) ? false : true;
        String strReplace = str.replace(y.f128594c, a.f131414g);
        long jCharAt = (((long) strReplace.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L;
        if (jCharAt == -5808493101479473382L) {
            throw new JSONException("autoType is not support. " + str);
        }
        String str3 = "autoType is not support. ";
        if ((((long) strReplace.charAt(strReplace.length() - 1)) ^ jCharAt) * 1099511628211L == 655701488918567152L) {
            throw new JSONException(str3 + str);
        }
        long jCharAt2 = (((((((long) strReplace.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L) ^ ((long) strReplace.charAt(1))) * 1099511628211L) ^ ((long) strReplace.charAt(2))) * 1099511628211L;
        if (this.autoTypeSupport || z11) {
            long jCharAt3 = jCharAt2;
            int i11 = 3;
            clsLoadClass = null;
            while (i11 < strReplace.length()) {
                long j11 = jCharAt2;
                jCharAt3 = (((long) strReplace.charAt(i11)) ^ jCharAt3) * 1099511628211L;
                if (Arrays.binarySearch(this.acceptHashCodes, jCharAt3) >= 0 && (clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, true)) != null) {
                    return clsLoadClass;
                }
                if (Arrays.binarySearch(this.denyHashCodes, jCharAt3) >= 0 && TypeUtils.getClassFromMapping(str) == null) {
                    throw new JSONException(str3 + str);
                }
                i11++;
                str3 = str3;
                jCharAt2 = j11;
            }
            j10 = jCharAt2;
            str2 = str3;
        } else {
            j10 = jCharAt2;
            str2 = str3;
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            clsLoadClass = TypeUtils.getClassFromMapping(str);
        }
        if (clsLoadClass == null) {
            clsLoadClass = this.deserializers.findClass(str);
        }
        if (clsLoadClass != null) {
            if (cls == null || clsLoadClass == HashMap.class || cls.isAssignableFrom(clsLoadClass)) {
                return clsLoadClass;
            }
            throw new JSONException("type not match. " + str + " -> " + cls.getName());
        }
        if (!this.autoTypeSupport) {
            int i12 = 3;
            while (i12 < strReplace.length()) {
                long jCharAt4 = (j10 ^ ((long) strReplace.charAt(i12))) * 1099511628211L;
                if (Arrays.binarySearch(this.denyHashCodes, jCharAt4) >= 0) {
                    throw new JSONException(str2 + str);
                }
                if (Arrays.binarySearch(this.acceptHashCodes, jCharAt4) >= 0) {
                    if (clsLoadClass == null) {
                        clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, true);
                    }
                    if (cls == null || !cls.isAssignableFrom(clsLoadClass)) {
                        return clsLoadClass;
                    }
                    throw new JSONException("type not match. " + str + " -> " + cls.getName());
                }
                i12++;
                j10 = jCharAt4;
            }
        }
        try {
            String str4 = str.replace(a.f131414g, com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_UNIX) + ".class";
            ClassLoader classLoader = this.defaultClassLoader;
            InputStream resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(str4) : ParserConfig.class.getClassLoader().getResourceAsStream(str4);
            if (resourceAsStream != null) {
                try {
                    try {
                        ClassReader classReader = new ClassReader(resourceAsStream, true);
                        z10 = false;
                        try {
                            TypeCollector typeCollector = new TypeCollector("<clinit>", new Class[0]);
                            classReader.accept(typeCollector);
                            zHasJsonType = typeCollector.hasJsonType();
                        } catch (Exception unused) {
                            inputStream2 = resourceAsStream;
                            IOUtils.close(inputStream2);
                            zHasJsonType = z10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = resourceAsStream;
                        IOUtils.close(inputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                    z10 = false;
                }
            } else {
                z10 = false;
                zHasJsonType = false;
            }
            IOUtils.close(resourceAsStream);
        } catch (Exception unused3) {
            z10 = false;
            inputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        int i13 = Feature.SupportAutoType.mask;
        boolean z12 = (!this.autoTypeSupport && (i10 & i13) == 0 && (i13 & JSON.DEFAULT_PARSER_FEATURE) == 0) ? z10 : true;
        if (clsLoadClass == null && (z12 || zHasJsonType || z11)) {
            if (z12 || zHasJsonType) {
                z10 = true;
            }
            clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, z10);
        }
        if (clsLoadClass != null) {
            if (zHasJsonType) {
                TypeUtils.addMapping(str, clsLoadClass);
                return clsLoadClass;
            }
            if (ClassLoader.class.isAssignableFrom(clsLoadClass) || DataSource.class.isAssignableFrom(clsLoadClass)) {
                throw new JSONException(str2 + str);
            }
            if (cls != null) {
                if (cls.isAssignableFrom(clsLoadClass)) {
                    TypeUtils.addMapping(str, clsLoadClass);
                    return clsLoadClass;
                }
                throw new JSONException("type not match. " + str + " -> " + cls.getName());
            }
            if (JavaBeanInfo.build(clsLoadClass, clsLoadClass, this.propertyNamingStrategy).creatorConstructor != null && z12) {
                throw new JSONException(str2 + str);
            }
        }
        if (z12) {
            if (clsLoadClass != null) {
                TypeUtils.addMapping(str, clsLoadClass);
            }
            return clsLoadClass;
        }
        throw new JSONException(str2 + str);
    }

    public void clearDeserializers() {
        this.deserializers.clear();
        initDeserializers();
    }

    public void configFromPropety(Properties properties) {
        addItemsToDeny(splitItemsFormProperty(properties.getProperty(DENY_PROPERTY)));
        addItemsToAccept(splitItemsFormProperty(properties.getProperty(AUTOTYPE_ACCEPT)));
        String property = properties.getProperty(AUTOTYPE_SUPPORT_PROPERTY);
        if ("true".equals(property)) {
            this.autoTypeSupport = true;
        } else if ("false".equals(property)) {
            this.autoTypeSupport = false;
        }
    }

    public FieldDeserializer createFieldDeserializer(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, FieldInfo fieldInfo) {
        Class<?> clsDeserializeUsing;
        Class<?> cls = javaBeanInfo.clazz;
        Class<?> cls2 = fieldInfo.fieldClass;
        JSONField annotation = fieldInfo.getAnnotation();
        Class<?> cls3 = null;
        if (annotation != null && (clsDeserializeUsing = annotation.deserializeUsing()) != Void.class) {
            cls3 = clsDeserializeUsing;
        }
        return (cls3 == null && (cls2 == List.class || cls2 == ArrayList.class)) ? new ArrayListTypeFieldDeserializer(parserConfig, cls, fieldInfo) : new DefaultFieldDeserializer(parserConfig, cls, fieldInfo);
    }

    public ObjectDeserializer createJavaBeanDeserializer(Class<?> cls, Type type) {
        JSONField annotation;
        Method method;
        ASMDeserializerFactory aSMDeserializerFactory;
        boolean zCheckName = this.asmEnable & (!this.fieldBased);
        if (zCheckName) {
            JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls, JSONType.class);
            if (jSONType != null) {
                Class<?> clsDeserializer = jSONType.deserializer();
                if (clsDeserializer != Void.class) {
                    try {
                        Object objNewInstance = clsDeserializer.newInstance();
                        if (objNewInstance instanceof ObjectDeserializer) {
                            return (ObjectDeserializer) objNewInstance;
                        }
                    } catch (Throwable unused) {
                    }
                }
                zCheckName = jSONType.asm();
            }
            if (zCheckName) {
                Class<?> builderClass = JavaBeanInfo.getBuilderClass(cls, jSONType);
                if (builderClass == null) {
                    builderClass = cls;
                }
                do {
                    if (!Modifier.isPublic(builderClass.getModifiers())) {
                        zCheckName = false;
                        break;
                    }
                    builderClass = builderClass.getSuperclass();
                    if (builderClass == Object.class) {
                        break;
                    }
                } while (builderClass != null);
            }
        }
        if (cls.getTypeParameters().length != 0) {
            zCheckName = false;
        }
        if (zCheckName && (aSMDeserializerFactory = this.asmFactory) != null && aSMDeserializerFactory.classLoader.isExternalClass(cls)) {
            zCheckName = false;
        }
        if (zCheckName) {
            zCheckName = ASMUtils.checkName(cls.getSimpleName());
        }
        if (zCheckName) {
            if (cls.isInterface()) {
                zCheckName = false;
            }
            JavaBeanInfo javaBeanInfoBuild = JavaBeanInfo.build(cls, type, this.propertyNamingStrategy);
            if (zCheckName && javaBeanInfoBuild.fields.length > 200) {
                zCheckName = false;
            }
            Constructor<?> constructor = javaBeanInfoBuild.defaultConstructor;
            if (zCheckName && constructor == null && !cls.isInterface()) {
                zCheckName = false;
            }
            for (FieldInfo fieldInfo : javaBeanInfoBuild.fields) {
                if (!fieldInfo.getOnly) {
                    Class<?> cls2 = fieldInfo.fieldClass;
                    if (Modifier.isPublic(cls2.getModifiers()) && ((!cls2.isMemberClass() || Modifier.isStatic(cls2.getModifiers())) && ((fieldInfo.getMember() == null || ASMUtils.checkName(fieldInfo.getMember().getName())) && (((annotation = fieldInfo.getAnnotation()) == null || (ASMUtils.checkName(annotation.name()) && annotation.format().length() == 0 && annotation.deserializeUsing() == Void.class && !annotation.unwrapped())) && (((method = fieldInfo.method) == null || method.getParameterTypes().length <= 1) && (!cls2.isEnum() || (getDeserializer(cls2) instanceof EnumDeserializer))))))) {
                    }
                }
                zCheckName = false;
                break;
            }
        }
        if (!((zCheckName && cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) ? false : zCheckName)) {
            return new JavaBeanDeserializer(this, cls, type);
        }
        JavaBeanInfo javaBeanInfoBuild2 = JavaBeanInfo.build(cls, type, this.propertyNamingStrategy);
        try {
            return this.asmFactory.createJavaBeanDeserializer(this, javaBeanInfoBuild2);
        } catch (JSONException unused2) {
            return new JavaBeanDeserializer(this, javaBeanInfoBuild2);
        } catch (NoSuchMethodException unused3) {
            return new JavaBeanDeserializer(this, cls, type);
        } catch (Exception e10) {
            throw new JSONException("create asm deserializer error, " + cls.getName(), e10);
        }
    }

    public ClassLoader getDefaultClassLoader() {
        return this.defaultClassLoader;
    }

    public ObjectDeserializer getDeserializer(FieldInfo fieldInfo) {
        return getDeserializer(fieldInfo.fieldClass, fieldInfo.fieldType);
    }

    public ObjectDeserializer getDeserializer(Class<?> cls, Type type) {
        ObjectDeserializer objectDeserializerCreateJavaBeanDeserializer;
        Class<?> clsMappingTo;
        Type type2 = type;
        ObjectDeserializer objectDeserializer = this.deserializers.get(type2);
        if (objectDeserializer != null) {
            return objectDeserializer;
        }
        if (type2 == null) {
            type2 = cls;
        }
        ObjectDeserializer objectDeserializer2 = this.deserializers.get(type2);
        if (objectDeserializer2 != null) {
            return objectDeserializer2;
        }
        JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls, JSONType.class);
        if (jSONType != null && (clsMappingTo = jSONType.mappingTo()) != Void.class) {
            return getDeserializer(clsMappingTo, clsMappingTo);
        }
        if ((type2 instanceof WildcardType) || (type2 instanceof TypeVariable) || (type2 instanceof ParameterizedType)) {
            objectDeserializer2 = this.deserializers.get(cls);
        }
        if (objectDeserializer2 != null) {
            return objectDeserializer2;
        }
        String strReplace = cls.getName().replace(y.f128594c, a.f131414g);
        int i10 = 0;
        if (strReplace.startsWith("java.awt.") && AwtCodec.support(cls) && !awtError) {
            String[] strArr = {"java.awt.Point", "java.awt.Font", "java.awt.Rectangle", "java.awt.Color"};
            for (int i11 = 0; i11 < 4; i11++) {
                try {
                    String str = strArr[i11];
                    if (str.equals(strReplace)) {
                        IdentityHashMap<Type, ObjectDeserializer> identityHashMap = this.deserializers;
                        Class<?> cls2 = Class.forName(str);
                        AwtCodec awtCodec = AwtCodec.instance;
                        identityHashMap.put(cls2, awtCodec);
                        return awtCodec;
                    }
                } catch (Throwable unused) {
                    awtError = true;
                }
            }
            objectDeserializer2 = AwtCodec.instance;
        }
        if (!jdk8Error) {
            try {
                if (strReplace.startsWith("java.time.")) {
                    String[] strArr2 = {"java.time.LocalDateTime", "java.time.LocalDate", "java.time.LocalTime", "java.time.ZonedDateTime", "java.time.OffsetDateTime", "java.time.OffsetTime", "java.time.ZoneOffset", "java.time.ZoneRegion", "java.time.ZoneId", "java.time.Period", "java.time.Duration", "java.time.Instant"};
                    while (i10 < 12) {
                        String str2 = strArr2[i10];
                        if (str2.equals(strReplace)) {
                            IdentityHashMap<Type, ObjectDeserializer> identityHashMap2 = this.deserializers;
                            Class<?> cls3 = Class.forName(str2);
                            Jdk8DateCodec jdk8DateCodec = Jdk8DateCodec.instance;
                            identityHashMap2.put(cls3, jdk8DateCodec);
                            return jdk8DateCodec;
                        }
                        i10++;
                    }
                } else if (strReplace.startsWith("java.util.Optional")) {
                    String[] strArr3 = {"java.util.Optional", "java.util.OptionalDouble", "java.util.OptionalInt", "java.util.OptionalLong"};
                    while (i10 < 4) {
                        String str3 = strArr3[i10];
                        if (str3.equals(strReplace)) {
                            IdentityHashMap<Type, ObjectDeserializer> identityHashMap3 = this.deserializers;
                            Class<?> cls4 = Class.forName(str3);
                            OptionalCodec optionalCodec = OptionalCodec.instance;
                            identityHashMap3.put(cls4, optionalCodec);
                            return optionalCodec;
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused2) {
                jdk8Error = true;
            }
        }
        if (strReplace.equals("java.nio.file.Path")) {
            IdentityHashMap<Type, ObjectDeserializer> identityHashMap4 = this.deserializers;
            objectDeserializer2 = MiscCodec.instance;
            identityHashMap4.put(cls, objectDeserializer2);
        }
        if (cls == Map.Entry.class) {
            IdentityHashMap<Type, ObjectDeserializer> identityHashMap5 = this.deserializers;
            objectDeserializer2 = MiscCodec.instance;
            identityHashMap5.put(cls, objectDeserializer2);
        }
        try {
            for (AutowiredObjectDeserializer autowiredObjectDeserializer : ServiceLoader.load(AutowiredObjectDeserializer.class, Thread.currentThread().getContextClassLoader())) {
                Iterator<Type> it = autowiredObjectDeserializer.getAutowiredFor().iterator();
                while (it.hasNext()) {
                    this.deserializers.put(it.next(), autowiredObjectDeserializer);
                }
            }
        } catch (Exception unused3) {
        }
        if (objectDeserializer2 == null) {
            objectDeserializer2 = this.deserializers.get(type2);
        }
        if (objectDeserializer2 != null) {
            return objectDeserializer2;
        }
        if (cls.isEnum()) {
            JSONType jSONType2 = (JSONType) cls.getAnnotation(JSONType.class);
            if (jSONType2 != null) {
                try {
                    ObjectDeserializer objectDeserializer3 = (ObjectDeserializer) jSONType2.deserializer().newInstance();
                    this.deserializers.put(cls, objectDeserializer3);
                    return objectDeserializer3;
                } catch (Throwable unused4) {
                }
            }
            objectDeserializerCreateJavaBeanDeserializer = new EnumDeserializer(cls);
        } else if (cls.isArray()) {
            objectDeserializerCreateJavaBeanDeserializer = ObjectArrayCodec.instance;
        } else if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
            objectDeserializerCreateJavaBeanDeserializer = CollectionCodec.instance;
        } else if (Map.class.isAssignableFrom(cls)) {
            objectDeserializerCreateJavaBeanDeserializer = MapDeserializer.instance;
        } else if (Throwable.class.isAssignableFrom(cls)) {
            objectDeserializerCreateJavaBeanDeserializer = new ThrowableDeserializer(this, cls);
        } else if (PropertyProcessable.class.isAssignableFrom(cls)) {
            objectDeserializerCreateJavaBeanDeserializer = new PropertyProcessableDeserializer(cls);
        } else {
            objectDeserializerCreateJavaBeanDeserializer = cls == InetAddress.class ? MiscCodec.instance : createJavaBeanDeserializer(cls, type2);
        }
        putDeserializer(type2, objectDeserializerCreateJavaBeanDeserializer);
        return objectDeserializerCreateJavaBeanDeserializer;
    }

    public ObjectDeserializer getDeserializer(Type type) {
        ObjectDeserializer objectDeserializer = this.deserializers.get(type);
        if (objectDeserializer != null) {
            return objectDeserializer;
        }
        if (type instanceof Class) {
            return getDeserializer((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            return rawType instanceof Class ? getDeserializer((Class) rawType, type) : getDeserializer(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return getDeserializer(upperBounds[0]);
            }
        }
        return JavaObjectDeserializer.instance;
    }

    public IdentityHashMap<Type, ObjectDeserializer> getDeserializers() {
        return this.deserializers;
    }

    public void initJavaBeanDeserializers(Class<?>... clsArr) {
        if (clsArr == null) {
            return;
        }
        for (Class<?> cls : clsArr) {
            if (cls != null) {
                putDeserializer(cls, createJavaBeanDeserializer(cls, cls));
            }
        }
    }

    public boolean isAsmEnable() {
        return this.asmEnable;
    }

    public boolean isAutoTypeSupport() {
        return this.autoTypeSupport;
    }

    public boolean isPrimitive(Class<?> cls) {
        return isPrimitive2(cls);
    }

    public void putDeserializer(Type type, ObjectDeserializer objectDeserializer) {
        this.deserializers.put(type, objectDeserializer);
    }

    public void setAsmEnable(boolean z10) {
        this.asmEnable = z10;
    }

    public void setAutoTypeSupport(boolean z10) {
        this.autoTypeSupport = z10;
    }

    public void setDefaultClassLoader(ClassLoader classLoader) {
        this.defaultClassLoader = classLoader;
    }
}
