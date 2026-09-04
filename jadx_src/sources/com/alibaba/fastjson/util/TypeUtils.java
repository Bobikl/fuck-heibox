package com.alibaba.fastjson.util;

import androidx.exifinterface.media.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.EnumDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.serializer.SerializeBeanInfo;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lzy.okgo.model.Progress;
import com.max.hbutils.utils.w;
import com.meituan.robust.Constants;
import com.umeng.analytics.pro.ak;
import com.vivo.push.PushClientConstants;
import fi.d;
import fi.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.reflect.KParameter;
import kotlin.reflect.i;

/* JADX INFO: loaded from: classes6.dex */
public class TypeUtils {
    private static Class<? extends Annotation> class_ManyToMany = null;
    private static boolean class_ManyToMany_error = false;
    private static Class<? extends Annotation> class_OneToMany = null;
    private static boolean class_OneToMany_error = false;
    public static boolean compatibleWithFieldName = false;
    public static boolean compatibleWithJavaBean = false;
    private static volatile Map<Class, String[]> kotlinIgnores = null;
    private static volatile boolean kotlinIgnores_error = false;
    private static volatile boolean kotlin_class_klass_error = false;
    private static volatile boolean kotlin_error = false;
    private static volatile Constructor kotlin_kclass_constructor = null;
    private static volatile Method kotlin_kclass_getConstructors = null;
    private static volatile Method kotlin_kfunction_getParameters = null;
    private static volatile Method kotlin_kparameter_getName = null;
    private static volatile Class kotlin_metadata = null;
    private static volatile boolean kotlin_metadata_error = false;
    private static Method method_HibernateIsInitialized = null;
    private static boolean method_HibernateIsInitialized_error = false;
    private static Class<?> optionalClass = null;
    private static boolean optionalClassInited = false;
    private static Method oracleDateMethod = null;
    private static boolean oracleDateMethodInited = false;
    private static Method oracleTimestampMethod = null;
    private static boolean oracleTimestampMethodInited = false;
    private static Class<?> pathClass = null;
    private static boolean setAccessibleEnable = true;
    private static Class<? extends Annotation> transientClass = null;
    private static boolean transientClassInited = false;
    private static ConcurrentMap<String, Class<?>> mappings = new ConcurrentHashMap(16, 0.75f, 1);
    private static boolean pathClass_error = false;

    static {
        try {
            compatibleWithJavaBean = "true".equals(IOUtils.getStringProperty(IOUtils.FASTJSON_COMPATIBLEWITHJAVABEAN));
            compatibleWithFieldName = "true".equals(IOUtils.getStringProperty(IOUtils.FASTJSON_COMPATIBLEWITHFIELDNAME));
        } catch (Throwable unused) {
        }
        addBaseClassMappings();
    }

    private static void addBaseClassMappings() {
        mappings.put(Constants.BYTE, Byte.TYPE);
        mappings.put(Constants.SHORT, Short.TYPE);
        mappings.put(Constants.INT, Integer.TYPE);
        mappings.put(Constants.LONG, Long.TYPE);
        mappings.put("float", Float.TYPE);
        mappings.put(Constants.DOUBLE, Double.TYPE);
        mappings.put("boolean", Boolean.TYPE);
        mappings.put(Constants.CHAR, Character.TYPE);
        mappings.put("[byte", byte[].class);
        mappings.put("[short", short[].class);
        mappings.put("[int", int[].class);
        mappings.put("[long", long[].class);
        mappings.put("[float", float[].class);
        mappings.put("[double", double[].class);
        mappings.put("[boolean", boolean[].class);
        mappings.put("[char", char[].class);
        mappings.put("[B", byte[].class);
        mappings.put("[S", short[].class);
        mappings.put("[I", int[].class);
        mappings.put("[J", long[].class);
        mappings.put("[F", float[].class);
        mappings.put("[D", double[].class);
        mappings.put("[C", char[].class);
        mappings.put("[Z", boolean[].class);
        Class<?>[] clsArr = {Object.class, Cloneable.class, loadClass("java.lang.AutoCloseable"), Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, HashMap.class, Hashtable.class, TreeMap.class, java.util.IdentityHashMap.class, WeakHashMap.class, LinkedHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, TimeUnit.class, ConcurrentHashMap.class, loadClass("java.util.concurrent.ConcurrentSkipListMap"), loadClass("java.util.concurrent.ConcurrentSkipListSet"), AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Time.class, java.sql.Date.class, Timestamp.class, SimpleDateFormat.class, JSONObject.class};
        for (int i10 = 0; i10 < 58; i10++) {
            Class<?> cls = clsArr[i10];
            if (cls != null) {
                mappings.put(cls.getName(), cls);
            }
        }
        String[] strArr = {"java.awt.Rectangle", "java.awt.Point", "java.awt.Font", "java.awt.Color"};
        for (int i11 = 0; i11 < 4; i11++) {
            Class<?> clsLoadClass = loadClass(strArr[i11]);
            if (clsLoadClass == null) {
                break;
            }
            mappings.put(clsLoadClass.getName(), clsLoadClass);
        }
        String[] strArr2 = {"org.springframework.util.LinkedMultiValueMap", "org.springframework.util.LinkedCaseInsensitiveMap", "org.springframework.remoting.support.RemoteInvocation", "org.springframework.remoting.support.RemoteInvocationResult", "org.springframework.security.web.savedrequest.DefaultSavedRequest", "org.springframework.security.web.savedrequest.SavedCookie", "org.springframework.security.web.csrf.DefaultCsrfToken", "org.springframework.security.web.authentication.WebAuthenticationDetails", "org.springframework.security.core.context.SecurityContextImpl", "org.springframework.security.authentication.UsernamePasswordAuthenticationToken", "org.springframework.security.core.authority.SimpleGrantedAuthority", "org.springframework.security.core.userdetails.User"};
        for (int i12 = 0; i12 < 12; i12++) {
            Class<?> clsLoadClass2 = loadClass(strArr2[i12]);
            if (clsLoadClass2 == null) {
                return;
            }
            mappings.put(clsLoadClass2.getName(), clsLoadClass2);
        }
    }

    public static void addMapping(String str, Class<?> cls) {
        mappings.put(str, cls);
    }

    public static SerializeBeanInfo buildBeanInfo(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy) {
        return buildBeanInfo(cls, map, propertyNamingStrategy, false);
    }

    public static SerializeBeanInfo buildBeanInfo(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy, boolean z10) {
        PropertyNamingStrategy propertyNamingStrategy2;
        int i10;
        String[] strArr;
        String str;
        String str2;
        List<FieldInfo> listComputeGettersWithFieldBase;
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType != null) {
            String[] strArrOrders = jSONType.orders();
            String strTypeName = jSONType.typeName();
            if (strTypeName.length() == 0) {
                strTypeName = null;
            }
            PropertyNamingStrategy propertyNamingStrategyNaming = jSONType.naming();
            if (propertyNamingStrategyNaming == PropertyNamingStrategy.CamelCase) {
                propertyNamingStrategyNaming = propertyNamingStrategy;
            }
            int iOf = SerializerFeature.of(jSONType.serialzeFeatures());
            String strTypeKey = null;
            for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                JSONType jSONType2 = (JSONType) getAnnotation(superclass, JSONType.class);
                if (jSONType2 == null) {
                    break;
                }
                strTypeKey = jSONType2.typeKey();
                if (strTypeKey.length() != 0) {
                    break;
                }
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                JSONType jSONType3 = (JSONType) getAnnotation(cls2, JSONType.class);
                if (jSONType3 != null) {
                    strTypeKey = jSONType3.typeKey();
                    if (strTypeKey.length() != 0) {
                        break;
                    }
                }
            }
            str2 = (strTypeKey == null || strTypeKey.length() != 0) ? strTypeKey : null;
            strArr = strArrOrders;
            str = strTypeName;
            propertyNamingStrategy2 = propertyNamingStrategyNaming;
            i10 = iOf;
        } else {
            propertyNamingStrategy2 = propertyNamingStrategy;
            i10 = 0;
            strArr = null;
            str = null;
            str2 = null;
        }
        HashMap map2 = new HashMap();
        ParserConfig.parserAllFieldToCache(cls, map2);
        List<FieldInfo> listComputeGettersWithFieldBase2 = z10 ? computeGettersWithFieldBase(cls, map, false, propertyNamingStrategy2) : computeGetters(cls, jSONType, map, map2, false, propertyNamingStrategy2);
        FieldInfo[] fieldInfoArr = new FieldInfo[listComputeGettersWithFieldBase2.size()];
        listComputeGettersWithFieldBase2.toArray(fieldInfoArr);
        if (strArr == null || strArr.length == 0) {
            ArrayList arrayList = new ArrayList(listComputeGettersWithFieldBase2);
            Collections.sort(arrayList);
            listComputeGettersWithFieldBase = arrayList;
        } else {
            listComputeGettersWithFieldBase = z10 ? computeGettersWithFieldBase(cls, map, true, propertyNamingStrategy2) : computeGetters(cls, jSONType, map, map2, true, propertyNamingStrategy2);
        }
        FieldInfo[] fieldInfoArr2 = new FieldInfo[listComputeGettersWithFieldBase.size()];
        listComputeGettersWithFieldBase.toArray(fieldInfoArr2);
        return new SerializeBeanInfo(cls, jSONType, str, str2, i10, fieldInfoArr, Arrays.equals(fieldInfoArr2, fieldInfoArr) ? fieldInfoArr : fieldInfoArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Class<T> cls, ParserConfig parserConfig) {
        Object obj2;
        int i10 = 0;
        if (obj == 0) {
            if (cls == Integer.TYPE) {
                return (T) 0;
            }
            if (cls == Long.TYPE) {
                return (T) 0L;
            }
            if (cls == Short.TYPE) {
                return (T) (short) 0;
            }
            if (cls == Byte.TYPE) {
                return (T) (byte) 0;
            }
            if (cls == Float.TYPE) {
                return (T) Float.valueOf(0.0f);
            }
            if (cls == Double.TYPE) {
                return (T) Double.valueOf(0.0d);
            }
            if (cls == Boolean.TYPE) {
                return (T) Boolean.FALSE;
            }
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        }
        if (cls == obj.getClass()) {
            return obj;
        }
        if (obj instanceof Map) {
            if (cls == Map.class) {
                return obj;
            }
            Map map = (Map) obj;
            return (cls != Object.class || map.containsKey(JSON.DEFAULT_TYPE_KEY)) ? (T) castToJavaBean(map, cls, parserConfig) : obj;
        }
        if (cls.isArray()) {
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                T t10 = (T) Array.newInstance(cls.getComponentType(), collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Array.set(t10, i10, cast(it.next(), (Class) cls.getComponentType(), parserConfig));
                    i10++;
                }
                return t10;
            }
            if (cls == byte[].class) {
                return (T) castToBytes(obj);
            }
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return (T) castToBoolean(obj);
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return (T) castToByte(obj);
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return (T) castToChar(obj);
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return (T) castToShort(obj);
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return (T) castToInt(obj);
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return (T) castToLong(obj);
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return (T) castToFloat(obj);
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return (T) castToDouble(obj);
        }
        if (cls == String.class) {
            return (T) castToString(obj);
        }
        if (cls == BigDecimal.class) {
            return (T) castToBigDecimal(obj);
        }
        if (cls == BigInteger.class) {
            return (T) castToBigInteger(obj);
        }
        if (cls == Date.class) {
            return (T) castToDate(obj);
        }
        if (cls == java.sql.Date.class) {
            return (T) castToSqlDate(obj);
        }
        if (cls == Time.class) {
            return (T) castToSqlTime(obj);
        }
        if (cls == Timestamp.class) {
            return (T) castToTimestamp(obj);
        }
        if (cls.isEnum()) {
            return (T) castToEnum(obj, cls, parserConfig);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            Date dateCastToDate = castToDate(obj);
            if (cls == Calendar.class) {
                obj2 = (T) Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
            } else {
                try {
                    obj2 = (T) ((Calendar) cls.newInstance());
                } catch (Exception e10) {
                    throw new JSONException("can not cast to : " + cls.getName(), e10);
                }
            }
            ((Calendar) obj2).setTime(dateCastToDate);
            return (T) obj2;
        }
        String name = cls.getName();
        if (name.equals("javax.xml.datatype.XMLGregorianCalendar")) {
            Date dateCastToDate2 = castToDate(obj);
            Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
            calendar.setTime(dateCastToDate2);
            return (T) CalendarCodec.instance.createXMLGregorianCalendar(calendar);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if (cls == Currency.class) {
                return (T) Currency.getInstance(str);
            }
            if (cls == Locale.class) {
                return (T) toLocale(str);
            }
            if (name.startsWith("java.time.")) {
                return (T) JSON.parseObject(JSON.toJSONString(str), cls);
            }
        }
        throw new JSONException("can not cast to : " + cls.getName());
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.util.HashMap, java.util.Map] */
    public static <T> T cast(Object obj, ParameterizedType parameterizedType, ParserConfig parserConfig) {
        Type rawType = parameterizedType.getRawType();
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == Collection.class || rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                T t10 = (rawType == Set.class || rawType == HashSet.class) ? (T) new HashSet() : rawType == TreeSet.class ? (T) new TreeSet() : (T) new ArrayList();
                Iterator<T> it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    ((Collection) t10).add(cast(it.next(), type, parserConfig));
                }
                return t10;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                ?? r10 = (T) new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r10.put(cast(entry.getKey(), type2, parserConfig), cast(entry.getValue(), type3, parserConfig));
                }
                return r10;
            }
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            return null;
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return (T) cast(obj, rawType, parserConfig);
        }
        if (rawType == Map.Entry.class && (obj instanceof Map)) {
            Map map = (Map) obj;
            if (map.size() == 1) {
                return (T) ((Map.Entry) map.entrySet().iterator().next());
            }
        }
        if (rawType instanceof Class) {
            if (parserConfig == null) {
                parserConfig = ParserConfig.global;
            }
            ObjectDeserializer deserializer = parserConfig.getDeserializer(rawType);
            if (deserializer != null) {
                return (T) deserializer.deserialze(new DefaultJSONParser(JSON.toJSONString(obj), parserConfig), parameterizedType, null);
            }
        }
        throw new JSONException("can not cast to : " + parameterizedType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Type type, ParserConfig parserConfig) {
        if (obj == 0) {
            return null;
        }
        if (type instanceof Class) {
            return (T) cast(obj, (Class) type, parserConfig);
        }
        if (type instanceof ParameterizedType) {
            return (T) cast(obj, (ParameterizedType) type, parserConfig);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new JSONException("can not cast to : " + type);
    }

    public static BigDecimal castToBigDecimal(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String string = obj.toString();
        if (string.length() == 0) {
            return null;
        }
        if ((obj instanceof Map) && ((Map) obj).size() == 0) {
            return null;
        }
        return new BigDecimal(string);
    }

    public static BigInteger castToBigInteger(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        return new BigInteger(string);
    }

    public static Boolean castToBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
            if ("Y".equalsIgnoreCase(str) || a.f23244d5.equals(str)) {
                return Boolean.TRUE;
            }
            if ("F".equalsIgnoreCase(str) || "N".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new JSONException("can not cast to boolean, value : " + obj);
    }

    public static Byte castToByte(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    public static byte[] castToBytes(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return IOUtils.decodeBase64((String) obj);
        }
        throw new JSONException("can not cast to int, value : " + obj);
    }

    public static Character castToChar(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to char, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0) {
            return null;
        }
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new JSONException("can not cast to char, value : " + obj);
    }

    public static Date castToDate(Object obj) {
        return castToDate(obj, null);
    }

    public static Date castToDate(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        long j10 = -1;
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String strSubstring = (String) obj;
            JSONScanner jSONScanner = new JSONScanner(strSubstring);
            try {
                if (jSONScanner.scanISO8601DateIfMatch(false)) {
                    Date time = jSONScanner.getCalendar().getTime();
                    jSONScanner.close();
                    return time;
                }
                jSONScanner.close();
                if (strSubstring.startsWith("/Date(") && strSubstring.endsWith(")/")) {
                    strSubstring = strSubstring.substring(6, strSubstring.length() - 2);
                }
                if (strSubstring.indexOf(45) != -1) {
                    if (str == null) {
                        if (strSubstring.length() == JSON.DEFFAULT_DATE_FORMAT.length() || (strSubstring.length() == 22 && JSON.DEFFAULT_DATE_FORMAT.equals("yyyyMMddHHmmssSSSZ"))) {
                            str = JSON.DEFFAULT_DATE_FORMAT;
                        } else if (strSubstring.length() == 10) {
                            str = "yyyy-MM-dd";
                        } else if (strSubstring.length() == 19) {
                            str = w.f73604k;
                        } else {
                            str = (strSubstring.length() == 29 && strSubstring.charAt(26) == ':' && strSubstring.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS";
                        }
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, JSON.defaultLocale);
                    simpleDateFormat.setTimeZone(JSON.defaultTimeZone);
                    try {
                        return simpleDateFormat.parse(strSubstring);
                    } catch (ParseException unused) {
                        throw new JSONException("can not cast to Date, value : " + strSubstring);
                    }
                }
                if (strSubstring.length() == 0) {
                    return null;
                }
                j10 = Long.parseLong(strSubstring);
            } catch (Throwable th2) {
                jSONScanner.close();
                throw th2;
            }
        }
        if (j10 >= 0) {
            return new Date(j10);
        }
        Class<?> cls = obj.getClass();
        if ("oracle.sql.TIMESTAMP".equals(cls.getName())) {
            if (oracleTimestampMethod == null && !oracleTimestampMethodInited) {
                try {
                    oracleTimestampMethod = cls.getMethod("toJdbc", new Class[0]);
                } catch (NoSuchMethodException unused2) {
                } finally {
                    oracleTimestampMethodInited = true;
                }
            }
            try {
                return (Date) oracleTimestampMethod.invoke(obj, new Object[0]);
            } catch (Exception e10) {
                throw new JSONException("can not cast oracle.sql.TIMESTAMP to Date", e10);
            }
        }
        if (!"oracle.sql.DATE".equals(cls.getName())) {
            throw new JSONException("can not cast to Date, value : " + obj);
        }
        if (oracleDateMethod == null && !oracleDateMethodInited) {
            try {
                oracleDateMethod = cls.getMethod("toJdbc", new Class[0]);
            } catch (NoSuchMethodException unused3) {
            } finally {
                oracleDateMethodInited = true;
            }
        }
        try {
            return (Date) oracleDateMethod.invoke(obj, new Object[0]);
        } catch (Exception e11) {
            throw new JSONException("can not cast oracle.sql.DATE to Date", e11);
        }
    }

    public static Double castToDouble(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to double, value : " + obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        if (string.indexOf(44) != 0) {
            string = string.replaceAll(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP, "");
        }
        return Double.valueOf(Double.parseDouble(string));
    }

    public static <T> T castToEnum(Object obj, Class<T> cls, ParserConfig parserConfig) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0) {
                    return null;
                }
                if (parserConfig == null) {
                    parserConfig = ParserConfig.getGlobalInstance();
                }
                ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
                return deserializer instanceof EnumDeserializer ? (T) ((EnumDeserializer) deserializer).getEnumByHashCode(fnv1a_64(str)) : (T) Enum.valueOf(cls, str);
            }
            if (obj instanceof Number) {
                int iIntValue = ((Number) obj).intValue();
                T[] enumConstants = cls.getEnumConstants();
                if (iIntValue < enumConstants.length) {
                    return enumConstants[iIntValue];
                }
            }
            throw new JSONException("can not cast to : " + cls.getName());
        } catch (Exception e10) {
            throw new JSONException("can not cast to : " + cls.getName(), e10);
        }
    }

    public static Float castToFloat(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to float, value : " + obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        if (string.indexOf(44) != 0) {
            string = string.replaceAll(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP, "");
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    public static Integer castToInt(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String strReplaceAll = (String) obj;
            if (strReplaceAll.length() == 0 || "null".equals(strReplaceAll) || "NULL".equals(strReplaceAll)) {
                return null;
            }
            if (strReplaceAll.indexOf(44) != 0) {
                strReplaceAll = strReplaceAll.replaceAll(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP, "");
            }
            return Integer.valueOf(Integer.parseInt(strReplaceAll));
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return castToInt(it.next());
            }
        }
        throw new JSONException("can not cast to int, value : " + obj);
    }

    public static <T> T castToJavaBean(Object obj, Class<T> cls) {
        return (T) cast(obj, (Class) cls, ParserConfig.getGlobalInstance());
    }

    public static <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, ParserConfig parserConfig) {
        int iIntValue = 0;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get(PushClientConstants.TAG_CLASS_NAME);
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get(Progress.F);
                Number number = (Number) map.get("lineNumber");
                if (number != null) {
                    iIntValue = number.intValue();
                }
                return (T) new StackTraceElement(str, str2, str3, iIntValue);
            }
            Object obj = map.get(JSON.DEFAULT_TYPE_KEY);
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (parserConfig == null) {
                    parserConfig = ParserConfig.global;
                }
                Class<?> clsCheckAutoType = parserConfig.checkAutoType(str4, null);
                if (clsCheckAutoType == null) {
                    throw new ClassNotFoundException(str4 + " not found");
                }
                if (!clsCheckAutoType.equals(cls)) {
                    return (T) castToJavaBean(map, clsCheckAutoType, parserConfig);
                }
            }
            if (cls.isInterface()) {
                JSONObject jSONObject = map instanceof JSONObject ? (JSONObject) map : new JSONObject(map);
                if (parserConfig == null) {
                    parserConfig = ParserConfig.getGlobalInstance();
                }
                return parserConfig.getDeserializers().get(cls) != null ? (T) JSON.parseObject(JSON.toJSONString(jSONObject), cls) : (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, jSONObject);
            }
            if (cls == Locale.class) {
                Object obj2 = map.get(ak.N);
                Object obj3 = map.get(ak.O);
                if (obj2 instanceof String) {
                    String str5 = (String) obj2;
                    if (obj3 instanceof String) {
                        return (T) new Locale(str5, (String) obj3);
                    }
                    if (obj3 == null) {
                        return (T) new Locale(str5);
                    }
                }
            }
            if (cls == String.class && (map instanceof JSONObject)) {
                return (T) map.toString();
            }
            if (cls == LinkedHashMap.class && (map instanceof JSONObject)) {
                T t10 = (T) ((JSONObject) map).getInnerMap();
                if (t10 instanceof LinkedHashMap) {
                    return t10;
                }
                new LinkedHashMap().putAll(t10);
            }
            if (parserConfig == null) {
                parserConfig = ParserConfig.getGlobalInstance();
            }
            ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
            JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
            if (javaBeanDeserializer != null) {
                return (T) javaBeanDeserializer.createInstance(map, parserConfig);
            }
            throw new JSONException("can not get javaBeanDeserializer. " + cls.getName());
        } catch (Exception e10) {
            throw new JSONException(e10.getMessage(), e10);
        }
    }

    public static Long castToLong(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String strReplaceAll = (String) obj;
            if (strReplaceAll.length() == 0 || "null".equals(strReplaceAll) || "NULL".equals(strReplaceAll)) {
                return null;
            }
            if (strReplaceAll.indexOf(44) != 0) {
                strReplaceAll = strReplaceAll.replaceAll(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP, "");
            }
            try {
                return Long.valueOf(Long.parseLong(strReplaceAll));
            } catch (NumberFormatException unused) {
                JSONScanner jSONScanner = new JSONScanner(strReplaceAll);
                Calendar calendar = jSONScanner.scanISO8601DateIfMatch(false) ? jSONScanner.getCalendar() : null;
                jSONScanner.close();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return castToLong(it.next());
            }
        }
        throw new JSONException("can not cast to long, value : " + obj);
    }

    public static Short castToShort(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to short, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    public static java.sql.Date castToSqlDate(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.sql.Date) {
            return (java.sql.Date) obj;
        }
        if (obj instanceof Date) {
            return new java.sql.Date(((Date) obj).getTime());
        }
        if (obj instanceof Calendar) {
            return new java.sql.Date(((Calendar) obj).getTimeInMillis());
        }
        long jLongValue = obj instanceof Number ? ((Number) obj).longValue() : 0L;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if (isNumber(str)) {
                jLongValue = Long.parseLong(str);
            } else {
                JSONScanner jSONScanner = new JSONScanner(str);
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    throw new JSONException("can not cast to Timestamp, value : " + str);
                }
                jLongValue = jSONScanner.getCalendar().getTime().getTime();
            }
        }
        if (jLongValue > 0) {
            return new java.sql.Date(jLongValue);
        }
        throw new JSONException("can not cast to Date, value : " + obj);
    }

    public static Time castToSqlTime(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Time) {
            return (Time) obj;
        }
        if (obj instanceof Date) {
            return new Time(((Date) obj).getTime());
        }
        if (obj instanceof Calendar) {
            return new Time(((Calendar) obj).getTimeInMillis());
        }
        long jLongValue = obj instanceof Number ? ((Number) obj).longValue() : 0L;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equalsIgnoreCase(str)) {
                return null;
            }
            if (isNumber(str)) {
                jLongValue = Long.parseLong(str);
            } else {
                JSONScanner jSONScanner = new JSONScanner(str);
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    throw new JSONException("can not cast to Timestamp, value : " + str);
                }
                jLongValue = jSONScanner.getCalendar().getTime().getTime();
            }
        }
        if (jLongValue > 0) {
            return new Time(jLongValue);
        }
        throw new JSONException("can not cast to Date, value : " + obj);
    }

    public static String castToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Timestamp castToTimestamp(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Calendar) {
            return new Timestamp(((Calendar) obj).getTimeInMillis());
        }
        if (obj instanceof Timestamp) {
            return (Timestamp) obj;
        }
        if (obj instanceof Date) {
            return new Timestamp(((Date) obj).getTime());
        }
        long jLongValue = obj instanceof Number ? ((Number) obj).longValue() : 0L;
        if (obj instanceof String) {
            String strSubstring = (String) obj;
            if (strSubstring.length() == 0 || "null".equals(strSubstring) || "NULL".equals(strSubstring)) {
                return null;
            }
            if (strSubstring.endsWith(".000000000")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 10);
            } else if (strSubstring.endsWith(".000000")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 7);
            }
            if (isNumber(strSubstring)) {
                jLongValue = Long.parseLong(strSubstring);
            } else {
                JSONScanner jSONScanner = new JSONScanner(strSubstring);
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    throw new JSONException("can not cast to Timestamp, value : " + strSubstring);
                }
                jLongValue = jSONScanner.getCalendar().getTime().getTime();
            }
        }
        if (jLongValue > 0) {
            return new Timestamp(jLongValue);
        }
        throw new JSONException("can not cast to Timestamp, value : " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    public static Type checkPrimitiveArray(GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        String str = Constants.ARRAY_TYPE;
        while (genericComponentType instanceof GenericArrayType) {
            genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
            str = str + str;
        }
        if (genericComponentType instanceof Class) {
            Class cls = (Class) genericComponentType;
            if (cls.isPrimitive()) {
                try {
                    if (cls == Boolean.TYPE) {
                        genericArrayType = Class.forName(str + "Z");
                    } else if (cls == Character.TYPE) {
                        genericArrayType = Class.forName(str + "C");
                    } else if (cls == Byte.TYPE) {
                        genericArrayType = Class.forName(str + "B");
                    } else if (cls == Short.TYPE) {
                        genericArrayType = Class.forName(str + a.R4);
                    } else if (cls == Integer.TYPE) {
                        genericArrayType = Class.forName(str + "I");
                    } else if (cls == Long.TYPE) {
                        genericArrayType = Class.forName(str + "J");
                    } else if (cls == Float.TYPE) {
                        genericArrayType = Class.forName(str + "F");
                    } else if (cls == Double.TYPE) {
                        genericArrayType = genericArrayType;
                        genericArrayType = Class.forName(str + "D");
                    }
                    genericArrayType = genericArrayType;
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return genericArrayType;
    }

    public static void clearClassMapping() {
        mappings.clear();
        addBaseClassMappings();
    }

    private static void computeFields(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy, Map<String, FieldInfo> map2, Field[] fieldArr) {
        String strLabel;
        int i10;
        int i11;
        int i12;
        for (Field field : fieldArr) {
            if (!Modifier.isStatic(field.getModifiers())) {
                JSONField jSONField = (JSONField) field.getAnnotation(JSONField.class);
                String name = field.getName();
                if (jSONField == null) {
                    strLabel = null;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                } else if (jSONField.serialize()) {
                    int iOrdinal = jSONField.ordinal();
                    int iOf = SerializerFeature.of(jSONField.serialzeFeatures());
                    int iOf2 = Feature.of(jSONField.parseFeatures());
                    if (jSONField.name().length() != 0) {
                        name = jSONField.name();
                    }
                    strLabel = jSONField.label().length() != 0 ? jSONField.label() : null;
                    i10 = iOrdinal;
                    i11 = iOf;
                    i12 = iOf2;
                }
                if (map == null || (name = map.get(name)) != null) {
                    if (propertyNamingStrategy != null) {
                        name = propertyNamingStrategy.translate(name);
                    }
                    String str = name;
                    if (!map2.containsKey(str)) {
                        map2.put(str, new FieldInfo(str, null, field, cls, null, i10, i11, i12, null, jSONField, strLabel));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:239:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:240:0x04e3 A[PHI: r12
  0x04e3: PHI (r12v6 java.lang.Class<?>) = (r12v5 java.lang.Class<?>), (r12v9 java.lang.Class<?>), (r12v9 java.lang.Class<?>) binds: [B:239:0x04e1, B:202:0x0429, B:212:0x0448] A[DONT_GENERATE, DONT_INLINE]] */
    public static List<FieldInfo> computeGetters(Class<?> cls, JSONType jSONType, Map<String, String> map, Map<String, Field> map2, boolean z10, PropertyNamingStrategy propertyNamingStrategy) {
        Constructor<?>[] constructorArr;
        int i10;
        LinkedHashMap linkedHashMap;
        short[] sArr;
        Annotation[][] annotationArr;
        JSONField jSONField;
        int i11;
        int i12;
        int iOf;
        LinkedHashMap linkedHashMap2;
        int i13;
        String strSubstring;
        int i14;
        int i15;
        int i16;
        JSONField jSONField2;
        String propertyNameByCompatibleFieldName;
        int i17;
        JSONField jSONField3;
        String strLabel;
        int i18;
        char cCharAt;
        String[] koltinConstructorParameters;
        short[] sArr2;
        Annotation[][] annotationArr2;
        Field fieldFromCache;
        Constructor koltinConstructor;
        Class<?> cls2 = cls;
        Map<String, String> map3 = map;
        PropertyNamingStrategy propertyNamingStrategy2 = propertyNamingStrategy;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        boolean zIsKotlin = isKotlin(cls);
        Method[] methods = cls.getMethods();
        int length = methods.length;
        Constructor<?>[] declaredConstructors = null;
        String[] strArr = null;
        short[] sArr3 = null;
        Annotation[][] parameterAnnotations = null;
        int i19 = 0;
        while (i19 < length) {
            Method method = methods[i19];
            String name = method.getName();
            String strLabel2 = null;
            if (Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.getReturnType() == ClassLoader.class || ((name.equals("getMetaClass") && method.getReturnType().getName().equals("groovy.lang.MetaClass")) || ((name.equals("getSuppressed") && method.getDeclaringClass() == Throwable.class) || (zIsKotlin && isKotlinIgnore(cls2, name))))) {
                constructorArr = declaredConstructors;
                i10 = i19;
                length = length;
                methods = methods;
                linkedHashMap = linkedHashMap3;
            } else {
                Boolean bool = Boolean.FALSE;
                JSONField superMethodAnnotation = (JSONField) method.getAnnotation(JSONField.class);
                if (superMethodAnnotation == null) {
                    superMethodAnnotation = getSuperMethodAnnotation(cls2, method);
                }
                String[] strArr2 = strArr;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                if (superMethodAnnotation == null && zIsKotlin) {
                    if (declaredConstructors != null || (koltinConstructor = getKoltinConstructor((declaredConstructors = cls.getDeclaredConstructors()))) == null) {
                        koltinConstructorParameters = strArr2;
                    } else {
                        parameterAnnotations = koltinConstructor.getParameterAnnotations();
                        koltinConstructorParameters = getKoltinConstructorParameters(cls);
                        if (koltinConstructorParameters != null) {
                            String[] strArr3 = new String[koltinConstructorParameters.length];
                            System.arraycopy(koltinConstructorParameters, 0, strArr3, 0, koltinConstructorParameters.length);
                            Arrays.sort(strArr3);
                            short[] sArr4 = new short[koltinConstructorParameters.length];
                            for (short s10 = 0; s10 < koltinConstructorParameters.length; s10 = (short) (s10 + 1)) {
                                sArr4[Arrays.binarySearch(strArr3, koltinConstructorParameters[s10])] = s10;
                            }
                            koltinConstructorParameters = strArr3;
                            parameterAnnotations = parameterAnnotations;
                            sArr3 = sArr4;
                            declaredConstructors = declaredConstructors;
                        }
                    }
                    if (koltinConstructorParameters == null || sArr3 == null || !name.startsWith("get")) {
                        constructorArr = declaredConstructors;
                        sArr2 = sArr3;
                        annotationArr2 = parameterAnnotations;
                        i10 = i19;
                    } else {
                        String strDecapitalize = decapitalize(name.substring(3));
                        int iBinarySearch = Arrays.binarySearch(koltinConstructorParameters, strDecapitalize);
                        constructorArr = declaredConstructors;
                        i10 = i19;
                        if (iBinarySearch < 0) {
                            for (int i20 = 0; i20 < koltinConstructorParameters.length; i20++) {
                                if (strDecapitalize.equalsIgnoreCase(koltinConstructorParameters[i20])) {
                                    iBinarySearch = i20;
                                    break;
                                }
                            }
                        }
                        if (iBinarySearch >= 0) {
                            Annotation[] annotationArr3 = parameterAnnotations[sArr3[iBinarySearch]];
                            if (annotationArr3 != null) {
                                int length2 = annotationArr3.length;
                                sArr2 = sArr3;
                                int i21 = 0;
                                while (true) {
                                    annotationArr2 = parameterAnnotations;
                                    if (i21 >= length2) {
                                        break;
                                    }
                                    Annotation annotation = annotationArr3[i21];
                                    Annotation[] annotationArr4 = annotationArr3;
                                    if (annotation instanceof JSONField) {
                                        superMethodAnnotation = (JSONField) annotation;
                                        break;
                                    }
                                    i21++;
                                    parameterAnnotations = annotationArr2;
                                    annotationArr3 = annotationArr4;
                                }
                            } else {
                                sArr2 = sArr3;
                                annotationArr2 = parameterAnnotations;
                            }
                            if (superMethodAnnotation == null && (fieldFromCache = ParserConfig.getFieldFromCache(strDecapitalize, map2)) != null) {
                                jSONField = (JSONField) fieldFromCache.getAnnotation(JSONField.class);
                            }
                            annotationArr = annotationArr2;
                            sArr = sArr2;
                            strArr2 = koltinConstructorParameters;
                        } else {
                            sArr2 = sArr3;
                            annotationArr2 = parameterAnnotations;
                        }
                    }
                    jSONField = superMethodAnnotation;
                    annotationArr = annotationArr2;
                    sArr = sArr2;
                    strArr2 = koltinConstructorParameters;
                } else {
                    bool = bool;
                    i10 = i19;
                    constructorArr = declaredConstructors;
                    sArr = sArr3;
                    annotationArr = parameterAnnotations;
                    jSONField = superMethodAnnotation;
                }
                if (jSONField != null) {
                    if (jSONField.serialize()) {
                        int iOrdinal = jSONField.ordinal();
                        int iOf2 = SerializerFeature.of(jSONField.serialzeFeatures());
                        iOf = Feature.of(jSONField.parseFeatures());
                        if (jSONField.name().length() != 0) {
                            String strName = jSONField.name();
                            if (map3 == null || (strName = map3.get(strName)) != null) {
                                String str = strName;
                                length = length;
                                methods = methods;
                                linkedHashMap4 = linkedHashMap4;
                                linkedHashMap4.put(str, new FieldInfo(str, method, null, cls, null, iOrdinal, iOf2, iOf, jSONField, null, null));
                            }
                            strArr = strArr2;
                            sArr3 = sArr;
                            parameterAnnotations = annotationArr;
                        } else {
                            strLabel2 = jSONField.label().length() != 0 ? jSONField.label() : null;
                            i11 = iOf2;
                            i12 = iOrdinal;
                        }
                        linkedHashMap = linkedHashMap4;
                        propertyNamingStrategy2 = propertyNamingStrategy;
                        strArr = strArr2;
                        sArr3 = sArr;
                        parameterAnnotations = annotationArr;
                    }
                    length = length;
                    methods = methods;
                    linkedHashMap = linkedHashMap4;
                    strArr = strArr2;
                    sArr3 = sArr;
                    parameterAnnotations = annotationArr;
                } else {
                    i11 = 0;
                    i12 = 0;
                    iOf = 0;
                }
                if (name.startsWith("get")) {
                    if (name.length() >= 4 && !name.equals("getClass") && (!name.equals("getDeclaringClass") || !cls.isEnum())) {
                        char cCharAt2 = name.charAt(3);
                        if (Character.isUpperCase(cCharAt2) || cCharAt2 > 512) {
                            propertyNameByCompatibleFieldName = getPropertyNameByCompatibleFieldName(map2, name, compatibleWithJavaBean ? decapitalize(name.substring(3)) : Character.toLowerCase(name.charAt(3)) + name.substring(4), 3);
                        } else if (cCharAt2 == '_') {
                            propertyNameByCompatibleFieldName = name.substring(4);
                        } else if (cCharAt2 == 'f') {
                            propertyNameByCompatibleFieldName = name.substring(3);
                        } else {
                            if (name.length() >= 5 && Character.isUpperCase(name.charAt(4))) {
                                propertyNameByCompatibleFieldName = decapitalize(name.substring(3));
                            }
                            strArr = strArr2;
                            sArr3 = sArr;
                            parameterAnnotations = annotationArr;
                        }
                        if (!isJSONTypeIgnore(cls2, propertyNameByCompatibleFieldName)) {
                            Field fieldFromCache2 = ParserConfig.getFieldFromCache(propertyNameByCompatibleFieldName, map2);
                            if (fieldFromCache2 != null || propertyNameByCompatibleFieldName.length() <= 1 || (cCharAt = propertyNameByCompatibleFieldName.charAt(1)) < 'A' || cCharAt > 'Z') {
                                i17 = 3;
                            } else {
                                i17 = 3;
                                fieldFromCache2 = ParserConfig.getFieldFromCache(decapitalize(name.substring(3)), map2);
                            }
                            Field field = fieldFromCache2;
                            if (field != null) {
                                JSONField jSONField4 = (JSONField) field.getAnnotation(JSONField.class);
                                if (jSONField4 == null) {
                                    jSONField3 = jSONField4;
                                } else if (jSONField4.serialize()) {
                                    int iOrdinal2 = jSONField4.ordinal();
                                    int iOf3 = SerializerFeature.of(jSONField4.serialzeFeatures());
                                    int iOf4 = Feature.of(jSONField4.parseFeatures());
                                    if (jSONField4.name().length() != 0) {
                                        Boolean bool2 = Boolean.TRUE;
                                        String strName2 = jSONField4.name();
                                        if (map3 == null || (strName2 = map3.get(strName2)) != null) {
                                            bool = bool2;
                                            propertyNameByCompatibleFieldName = strName2;
                                        }
                                        strArr = strArr2;
                                        sArr3 = sArr;
                                        parameterAnnotations = annotationArr;
                                    }
                                    if (jSONField4.label().length() != 0) {
                                        i12 = iOrdinal2;
                                        i18 = iOf3;
                                        iOf = iOf4;
                                        bool = bool;
                                        strLabel = jSONField4.label();
                                        jSONField3 = jSONField4;
                                    } else {
                                        i12 = iOrdinal2;
                                        jSONField3 = jSONField4;
                                        iOf = iOf4;
                                        String str2 = strLabel2;
                                        i18 = iOf3;
                                        bool = bool;
                                        strLabel = str2;
                                    }
                                    if (map3 != null || (propertyNameByCompatibleFieldName = map3.get(propertyNameByCompatibleFieldName)) != null) {
                                        if (propertyNamingStrategy != null && !bool.booleanValue()) {
                                            propertyNameByCompatibleFieldName = propertyNamingStrategy.translate(propertyNameByCompatibleFieldName);
                                        }
                                        String str3 = propertyNameByCompatibleFieldName;
                                        i13 = i17;
                                        linkedHashMap2 = linkedHashMap4;
                                        linkedHashMap2.put(str3, new FieldInfo(str3, method, field, cls, null, i12, i18, iOf, jSONField, jSONField3, strLabel));
                                        i11 = i18;
                                        i12 = i12;
                                        iOf = iOf;
                                        strLabel2 = strLabel;
                                    }
                                    strArr = strArr2;
                                    sArr3 = sArr;
                                    parameterAnnotations = annotationArr;
                                }
                            } else {
                                jSONField3 = null;
                            }
                            strLabel = strLabel2;
                            i18 = i11;
                            if (map3 != null) {
                            }
                            if (propertyNamingStrategy != null) {
                                propertyNameByCompatibleFieldName = propertyNamingStrategy.translate(propertyNameByCompatibleFieldName);
                            }
                            String str4 = propertyNameByCompatibleFieldName;
                            i13 = i17;
                            linkedHashMap2 = linkedHashMap4;
                            linkedHashMap2.put(str4, new FieldInfo(str4, method, field, cls, null, i12, i18, iOf, jSONField, jSONField3, strLabel));
                            i11 = i18;
                            i12 = i12;
                            iOf = iOf;
                            strLabel2 = strLabel;
                        }
                    }
                    linkedHashMap = linkedHashMap4;
                    propertyNamingStrategy2 = propertyNamingStrategy;
                    strArr = strArr2;
                    sArr3 = sArr;
                    parameterAnnotations = annotationArr;
                } else {
                    linkedHashMap2 = linkedHashMap4;
                    i13 = 3;
                }
                if (name.startsWith(ak.f104422ae) && name.length() >= i13 && (method.getReturnType() == Boolean.TYPE || method.getReturnType() == Boolean.class)) {
                    char cCharAt3 = name.charAt(2);
                    if (Character.isUpperCase(cCharAt3)) {
                        strSubstring = getPropertyNameByCompatibleFieldName(map2, name, compatibleWithJavaBean ? decapitalize(name.substring(2)) : Character.toLowerCase(name.charAt(2)) + name.substring(i13), 2);
                    } else if (cCharAt3 == '_') {
                        strSubstring = name.substring(i13);
                    } else {
                        if (cCharAt3 == 'f') {
                            strSubstring = name.substring(2);
                        } else {
                            cls2 = cls;
                        }
                        map3 = map;
                        propertyNamingStrategy2 = propertyNamingStrategy;
                        linkedHashMap = linkedHashMap2;
                    }
                    cls2 = cls;
                    if (isJSONTypeIgnore(cls2, strSubstring)) {
                        map3 = map;
                        propertyNamingStrategy2 = propertyNamingStrategy;
                        linkedHashMap = linkedHashMap2;
                    } else {
                        Field fieldFromCache3 = ParserConfig.getFieldFromCache(strSubstring, map2);
                        if (fieldFromCache3 == null) {
                            fieldFromCache3 = ParserConfig.getFieldFromCache(name, map2);
                        }
                        Field field2 = fieldFromCache3;
                        if (field2 != null) {
                            JSONField jSONField5 = (JSONField) field2.getAnnotation(JSONField.class);
                            if (jSONField5 != null) {
                                if (jSONField5.serialize()) {
                                    int iOrdinal3 = jSONField5.ordinal();
                                    int iOf5 = SerializerFeature.of(jSONField5.serialzeFeatures());
                                    int iOf6 = Feature.of(jSONField5.parseFeatures());
                                    if (jSONField5.name().length() != 0) {
                                        strSubstring = jSONField5.name();
                                        map3 = map;
                                        if (map3 == null || (strSubstring = map3.get(strSubstring)) != null) {
                                        }
                                        linkedHashMap = linkedHashMap2;
                                    } else {
                                        map3 = map;
                                    }
                                    if (jSONField5.label().length() != 0) {
                                        jSONField2 = jSONField5;
                                        i14 = iOf5;
                                        i16 = iOf6;
                                        strLabel2 = jSONField5.label();
                                        i15 = iOrdinal3;
                                    } else {
                                        i15 = iOrdinal3;
                                        jSONField2 = jSONField5;
                                        i14 = iOf5;
                                        i16 = iOf6;
                                    }
                                } else {
                                    map3 = map;
                                }
                                propertyNamingStrategy2 = propertyNamingStrategy;
                                linkedHashMap = linkedHashMap2;
                            } else {
                                map3 = map;
                                i14 = i11;
                                i15 = i12;
                                i16 = iOf;
                                jSONField2 = jSONField5;
                            }
                        } else {
                            map3 = map;
                            i14 = i11;
                            i15 = i12;
                            i16 = iOf;
                            jSONField2 = null;
                        }
                        if (map3 == null || (strSubstring = map3.get(strSubstring)) != null) {
                            propertyNamingStrategy2 = propertyNamingStrategy;
                            if (propertyNamingStrategy2 != null) {
                                strSubstring = propertyNamingStrategy2.translate(strSubstring);
                            }
                            String str5 = strSubstring;
                            if (!linkedHashMap2.containsKey(str5)) {
                                linkedHashMap = linkedHashMap2;
                                linkedHashMap.put(str5, new FieldInfo(str5, method, field2, cls, null, i15, i14, i16, jSONField, jSONField2, strLabel2));
                            }
                        } else {
                            propertyNamingStrategy2 = propertyNamingStrategy;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                } else {
                    cls2 = cls;
                    map3 = map;
                    propertyNamingStrategy2 = propertyNamingStrategy;
                    linkedHashMap = linkedHashMap2;
                }
                strArr = strArr2;
                sArr3 = sArr;
                parameterAnnotations = annotationArr;
            }
            i19 = i10 + 1;
            linkedHashMap3 = linkedHashMap;
            declaredConstructors = constructorArr;
            length = length;
            methods = methods;
        }
        LinkedHashMap linkedHashMap5 = linkedHashMap3;
        computeFields(cls2, map3, propertyNamingStrategy2, linkedHashMap5, cls.getFields());
        return getFieldInfos(cls2, z10, linkedHashMap5);
    }

    public static List<FieldInfo> computeGetters(Class<?> cls, Map<String, String> map) {
        return computeGetters(cls, map, true);
    }

    public static List<FieldInfo> computeGetters(Class<?> cls, Map<String, String> map, boolean z10) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        HashMap map2 = new HashMap();
        ParserConfig.parserAllFieldToCache(cls, map2);
        return computeGetters(cls, jSONType, map, map2, z10, PropertyNamingStrategy.CamelCase);
    }

    public static List<FieldInfo> computeGettersWithFieldBase(Class<?> cls, Map<String, String> map, boolean z10, PropertyNamingStrategy propertyNamingStrategy) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            computeFields(superclass, map, propertyNamingStrategy, linkedHashMap, superclass.getDeclaredFields());
        }
        return getFieldInfos(cls, z10, linkedHashMap);
    }

    public static Collection createCollection(Type type) {
        Class<?> rawClass = getRawClass(type);
        if (rawClass == AbstractCollection.class || rawClass == Collection.class) {
            return new ArrayList();
        }
        if (rawClass.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (rawClass.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (rawClass.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (rawClass.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (rawClass.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        }
        try {
            return (Collection) rawClass.newInstance();
        } catch (Exception unused) {
            throw new JSONException("create instance error, class " + rawClass.getName());
        }
    }

    public static String decapitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static long fnv1a_64(String str) {
        long jCharAt = -3750763034362895579L;
        for (int i10 = 0; i10 < str.length(); i10++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i10))) * 1099511628211L;
        }
        return jCharAt;
    }

    public static long fnv1a_64_lower(String str) {
        long j10 = -3750763034362895579L;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '_' && cCharAt != '-') {
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                j10 = (j10 ^ ((long) cCharAt)) * 1099511628211L;
            }
        }
        return j10;
    }

    public static <A extends Annotation> A getAnnotation(Class<?> cls, Class<A> cls2) {
        A a10 = (A) cls.getAnnotation(cls2);
        if (a10 != null) {
            return a10;
        }
        if (cls.getAnnotations().length <= 0) {
            return null;
        }
        for (Annotation annotation : cls.getAnnotations()) {
            A a11 = (A) annotation.annotationType().getAnnotation(cls2);
            if (a11 != null) {
                return a11;
            }
        }
        return null;
    }

    public static Class<?> getClass(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getClass(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (!(type instanceof WildcardType)) {
            return Object.class;
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        return upperBounds.length == 1 ? getClass(upperBounds[0]) : Object.class;
    }

    public static Class<?> getClassFromMapping(String str) {
        return mappings.get(str);
    }

    public static Class<?> getCollectionItemClass(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
            if (upperBounds.length == 1) {
                type2 = upperBounds[0];
            }
        }
        if (!(type2 instanceof Class)) {
            throw new JSONException("can not create ASMParser");
        }
        Class<?> cls = (Class) type2;
        if (Modifier.isPublic(cls.getModifiers())) {
            return cls;
        }
        throw new JSONException("can not create ASMParser");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    public static Type getCollectionItemType(Type type) {
        Type collectionItemType;
        if (type instanceof ParameterizedType) {
            collectionItemType = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (collectionItemType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) collectionItemType).getUpperBounds();
                if (upperBounds.length == 1) {
                    collectionItemType = upperBounds[0];
                }
            }
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.getName().startsWith("java.")) {
                collectionItemType = null;
            } else {
                collectionItemType = getCollectionItemType(cls.getGenericSuperclass());
            }
        } else {
            collectionItemType = null;
        }
        return collectionItemType == null ? Object.class : collectionItemType;
    }

    public static Field getField(Class<?> cls, String str, Field[] fieldArr) {
        char cCharAt;
        char cCharAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name)) {
                return field;
            }
            if (str.length() > 2 && (cCharAt = str.charAt(0)) >= 'a' && cCharAt <= 'z' && (cCharAt2 = str.charAt(1)) >= 'A' && cCharAt2 <= 'Z' && str.equalsIgnoreCase(name)) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        return getField(superclass, str, superclass.getDeclaredFields());
    }

    private static List<FieldInfo> getFieldInfos(Class<?> cls, boolean z10, Map<String, FieldInfo> map) {
        ArrayList arrayList = new ArrayList();
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        String[] strArrOrders = jSONType != null ? jSONType.orders() : null;
        if (strArrOrders == null || strArrOrders.length <= 0) {
            Iterator<FieldInfo> it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            if (z10) {
                Collections.sort(arrayList);
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
            for (FieldInfo fieldInfo : map.values()) {
                linkedHashMap.put(fieldInfo.name, fieldInfo);
            }
            for (String str : strArrOrders) {
                FieldInfo fieldInfo2 = (FieldInfo) linkedHashMap.get(str);
                if (fieldInfo2 != null) {
                    arrayList.add(fieldInfo2);
                    linkedHashMap.remove(str);
                }
            }
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                arrayList.add((FieldInfo) it2.next());
            }
        }
        return arrayList;
    }

    public static Type getGenericParamType(Type type) {
        return (!(type instanceof ParameterizedType) && (type instanceof Class)) ? getGenericParamType(((Class) type).getGenericSuperclass()) : type;
    }

    public static Constructor getKoltinConstructor(Constructor[] constructorArr) {
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if ((parameterTypes.length <= 0 || !parameterTypes[parameterTypes.length - 1].getName().equals("kotlin.jvm.internal.u")) && (constructor == null || constructor.getParameterTypes().length < parameterTypes.length)) {
                constructor = constructor2;
            }
        }
        return constructor;
    }

    public static String[] getKoltinConstructorParameters(Class cls) {
        if (kotlin_kclass_constructor == null && !kotlin_class_klass_error) {
            try {
                kotlin_kclass_constructor = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            } catch (Throwable unused) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kclass_constructor == null) {
            return null;
        }
        if (kotlin_kclass_getConstructors == null && !kotlin_class_klass_error) {
            try {
                kotlin_kclass_getConstructors = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", new Class[0]);
            } catch (Throwable unused2) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kfunction_getParameters == null && !kotlin_class_klass_error) {
            try {
                kotlin_kfunction_getParameters = i.class.getMethod("getParameters", new Class[0]);
            } catch (Throwable unused3) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kparameter_getName == null && !kotlin_class_klass_error) {
            try {
                kotlin_kparameter_getName = KParameter.class.getMethod("getName", new Class[0]);
            } catch (Throwable unused4) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_error) {
            return null;
        }
        try {
            Iterator it = ((Iterable) kotlin_kclass_getConstructors.invoke(kotlin_kclass_constructor.newInstance(cls), new Object[0])).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) kotlin_kfunction_getParameters.invoke(next, new Object[0]);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) kotlin_kfunction_getParameters.invoke(obj, new Object[0]);
            String[] strArr = new String[list2.size()];
            for (int i10 = 0; i10 < list2.size(); i10++) {
                strArr[i10] = (String) kotlin_kparameter_getName.invoke(list2.get(i10), new Object[0]);
            }
            return strArr;
        } catch (Throwable th2) {
            th2.printStackTrace();
            kotlin_error = true;
            return null;
        }
    }

    public static int getParserFeatures(Class<?> cls) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType == null) {
            return 0;
        }
        return Feature.of(jSONType.parseFeatures());
    }

    private static String getPropertyNameByCompatibleFieldName(Map<String, Field> map, String str, String str2, int i10) {
        if (!compatibleWithFieldName || map.containsKey(str2)) {
            return str2;
        }
        String strSubstring = str.substring(i10);
        return map.containsKey(strSubstring) ? strSubstring : str2;
    }

    public static Class<?> getRawClass(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getRawClass(((ParameterizedType) type).getRawType());
        }
        throw new JSONException("TODO");
    }

    public static int getSerializeFeatures(Class<?> cls) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType == null) {
            return 0;
        }
        return SerializerFeature.of(jSONType.serialzeFeatures());
    }

    public static JSONField getSuperMethodAnnotation(Class<?> cls, Method method) {
        boolean z10;
        JSONField jSONField;
        boolean z11;
        JSONField jSONField2;
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length > 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> cls2 : interfaces) {
                for (Method method2 : cls2.getMethods()) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes2.length == parameterTypes.length && method2.getName().equals(method.getName())) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= parameterTypes.length) {
                                z11 = true;
                                break;
                            }
                            if (!parameterTypes2[i10].equals(parameterTypes[i10])) {
                                z11 = false;
                                break;
                            }
                            i10++;
                        }
                        if (z11 && (jSONField2 = (JSONField) method2.getAnnotation(JSONField.class)) != null) {
                            return jSONField2;
                        }
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class<?>[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class<?>[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= parameterTypes3.length) {
                            z10 = true;
                            break;
                        }
                        if (!parameterTypes4[i11].equals(parameterTypes3[i11])) {
                            z10 = false;
                            break;
                        }
                        i11++;
                    }
                    if (z10 && (jSONField = (JSONField) method3.getAnnotation(JSONField.class)) != null) {
                        return jSONField;
                    }
                }
            }
        }
        return null;
    }

    public static boolean isAnnotationPresentManyToMany(Method method) {
        if (method == null) {
            return false;
        }
        if (class_ManyToMany == null && !class_ManyToMany_error) {
            try {
                class_ManyToMany = Class.forName("javax.persistence.ManyToMany");
            } catch (Throwable unused) {
                class_ManyToMany_error = true;
            }
        }
        if (class_ManyToMany != null) {
            return method.isAnnotationPresent(class_OneToMany) || method.isAnnotationPresent(class_ManyToMany);
        }
        return false;
    }

    public static boolean isAnnotationPresentOneToMany(Method method) {
        if (method == null) {
            return false;
        }
        if (class_OneToMany == null && !class_OneToMany_error) {
            try {
                class_OneToMany = Class.forName("javax.persistence.OneToMany");
            } catch (Throwable unused) {
                class_OneToMany_error = true;
            }
        }
        Class<? extends Annotation> cls = class_OneToMany;
        return cls != null && method.isAnnotationPresent(cls);
    }

    public static boolean isGenericParamType(Type type) {
        if (type instanceof ParameterizedType) {
            return true;
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Type genericSuperclass = ((Class) type).getGenericSuperclass();
        return genericSuperclass != Object.class && isGenericParamType(genericSuperclass);
    }

    public static boolean isHibernateInitialized(Object obj) {
        if (obj == null) {
            return false;
        }
        if (method_HibernateIsInitialized == null && !method_HibernateIsInitialized_error) {
            try {
                method_HibernateIsInitialized = Class.forName("org.hibernate.Hibernate").getMethod("isInitialized", Object.class);
            } catch (Throwable unused) {
                method_HibernateIsInitialized_error = true;
            }
        }
        Method method = method_HibernateIsInitialized;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(null, obj)).booleanValue();
            } catch (Throwable unused2) {
            }
        }
        return true;
    }

    private static boolean isJSONTypeIgnore(Class<?> cls, String str) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType != null) {
            String[] strArrIncludes = jSONType.includes();
            if (strArrIncludes.length > 0) {
                for (String str2 : strArrIncludes) {
                    if (str.equals(str2)) {
                        return false;
                    }
                }
                return true;
            }
            for (String str3 : jSONType.ignores()) {
                if (str.equals(str3)) {
                    return true;
                }
            }
        }
        return (cls.getSuperclass() == Object.class || cls.getSuperclass() == null || !isJSONTypeIgnore(cls.getSuperclass(), str)) ? false : true;
    }

    public static boolean isKotlin(Class cls) {
        if (kotlin_metadata == null && !kotlin_metadata_error) {
            try {
                kotlin_metadata = Class.forName("kotlin.Metadata");
            } catch (Throwable unused) {
                kotlin_metadata_error = true;
            }
        }
        return kotlin_metadata != null && cls.isAnnotationPresent(kotlin_metadata);
    }

    private static boolean isKotlinIgnore(Class cls, String str) {
        if (kotlinIgnores == null && !kotlinIgnores_error) {
            try {
                HashMap map = new HashMap();
                map.put(Class.forName("fi.c"), new String[]{"getEndInclusive", "isEmpty"});
                map.put(Class.forName("fi.l"), new String[]{"getEndInclusive", "isEmpty"});
                map.put(Class.forName("fi.o"), new String[]{"getEndInclusive", "isEmpty"});
                map.put(e.class, new String[]{"getEndInclusive", "isEmpty"});
                map.put(d.class, new String[]{"getEndInclusive", "isEmpty"});
                kotlinIgnores = map;
            } catch (Throwable unused) {
                kotlinIgnores_error = true;
            }
        }
        if (kotlinIgnores == null) {
            return false;
        }
        String[] strArr = kotlinIgnores.get(cls);
        return strArr != null && Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean isNumber(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '+' || cCharAt == '-') {
                if (i10 != 0) {
                    return false;
                }
            } else if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isPath(Class<?> cls) {
        if (pathClass == null && !pathClass_error) {
            try {
                pathClass = Class.forName("java.nio.file.Path");
            } catch (Throwable unused) {
                pathClass_error = true;
            }
        }
        Class<?> cls2 = pathClass;
        if (cls2 != null) {
            return cls2.isAssignableFrom(cls);
        }
        return false;
    }

    public static boolean isProxy(Class<?> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            String name = cls2.getName();
            if (name.equals("net.sf.cglib.proxy.Factory") || name.equals("org.springframework.cglib.proxy.Factory") || name.equals("javassist.util.proxy.ProxyObject") || name.equals("org.apache.ibatis.javassist.util.proxy.ProxyObject")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTransient(Method method) {
        if (method == null) {
            return false;
        }
        if (!transientClassInited) {
            try {
                transientClass = Class.forName("java.beans.Transient");
            } catch (Exception unused) {
            } finally {
                transientClassInited = true;
            }
        }
        Class<? extends Annotation> cls = transientClass;
        return (cls == null || method.getAnnotation(cls) == null) ? false : true;
    }

    public static Class<?> loadClass(String str) {
        return loadClass(str, null);
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader) {
        return loadClass(str, classLoader, false);
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader, boolean z10) {
        if (str == null || str.length() == 0 || str.length() > 128) {
            return null;
        }
        Class<?> clsLoadClass = mappings.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        if (str.charAt(0) == '[') {
            return Array.newInstance(loadClass(str.substring(1), classLoader), 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(";")) {
            return loadClass(str.substring(1, str.length() - 1), classLoader);
        }
        if (classLoader != null) {
            try {
                clsLoadClass = classLoader.loadClass(str);
                if (z10) {
                    mappings.put(str, clsLoadClass);
                }
                return clsLoadClass;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != classLoader) {
            Class<?> clsLoadClass2 = contextClassLoader.loadClass(str);
            if (z10) {
                try {
                    mappings.put(str, clsLoadClass2);
                } catch (Throwable unused) {
                    clsLoadClass = clsLoadClass2;
                }
            }
            return clsLoadClass2;
        }
        try {
            clsLoadClass = Class.forName(str);
            if (z10) {
                mappings.put(str, clsLoadClass);
            }
        } catch (Throwable unused2) {
        }
        return clsLoadClass;
    }

    static void setAccessible(AccessibleObject accessibleObject) {
        if (setAccessibleEnable && !accessibleObject.isAccessible()) {
            try {
                accessibleObject.setAccessible(true);
            } catch (AccessControlException unused) {
                setAccessibleEnable = false;
            }
        }
    }

    public static Locale toLocale(String str) {
        String[] strArrSplit = str.split(lg.a.f131412e);
        if (strArrSplit.length == 1) {
            return new Locale(strArrSplit[0]);
        }
        return strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
    }

    public static Type unwrapOptional(Type type) {
        if (!optionalClassInited) {
            try {
                optionalClass = Class.forName("java.util.Optional");
            } catch (Exception unused) {
            } finally {
                optionalClassInited = true;
            }
        }
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return parameterizedType.getRawType() == optionalClass ? parameterizedType.getActualTypeArguments()[0] : type;
    }
}
