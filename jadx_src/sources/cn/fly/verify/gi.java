package cn.fly.verify;

import android.content.BroadcastReceiver;
import com.meituan.robust.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashSet<String> f36766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, Class<?>> f36767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<Class<?>, String> f36768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static LinkedHashMap<String, Method> f36769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, Constructor<?>> f36770e;

    public interface a<ArgType, RetType> {
        RetType a(ArgType argtype);
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f36766a = hashSet;
        hashSet.add(ei.a("009Lhg,dOddPd8dlXgde2ej"));
        f36766a.add(ei.a("007%hg-d5dd+d8dldidk"));
        f36766a.add(ei.a("008?hg2dKdd$dWdlXe9didk"));
        f36766a.add("java.net");
        f36766a.add(ei.a("009Vhg+d]dd(d?dldgCi!diHg"));
        HashMap<String, Class<?>> map = new HashMap<>();
        f36767b = map;
        map.put(ei.a("006[dcdkdgff!gf"), Double.TYPE);
        f36767b.put(ei.a("005BefHg7dk:di"), Float.TYPE);
        f36767b.put(Constants.LONG, Long.TYPE);
        f36767b.put(ei.a("0037di?ei"), Integer.TYPE);
        f36767b.put(Constants.SHORT, Short.TYPE);
        f36767b.put(Constants.BYTE, Byte.TYPE);
        f36767b.put(ei.a("004chdVdj"), Character.TYPE);
        f36767b.put("boolean", Boolean.TYPE);
        f36767b.put("Object", Object.class);
        f36767b.put("String", String.class);
        f36767b.put("Thread", Thread.class);
        f36767b.put(ei.a("008%gjdg1eed^ff2gf"), Runnable.class);
        f36767b.put(ei.a("006WelecfiVifAdf"), System.class);
        f36767b.put(ei.a("006]dcdkdgff<gf"), Double.class);
        f36767b.put("Float", Float.class);
        f36767b.put("Long", Long.class);
        f36767b.put("Integer", Integer.class);
        f36767b.put(ei.a("005_el@h)dkdj(i"), Short.class);
        f36767b.put("Byte", Byte.class);
        f36767b.put(ei.a("009>ed+hdOdjXdcifBdj"), Character.class);
        f36767b.put("Boolean", Boolean.class);
        f36768c = new HashMap<>();
        for (Map.Entry<String, Class<?>> entry : f36767b.entrySet()) {
            f36768c.put(entry.getValue(), entry.getKey());
        }
        f36769d = new LinkedHashMap<String, Method>() { // from class: cn.fly.verify.gi.1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<String, Method> entry2) {
                return size() > 10;
            }
        };
        f36770e = new LinkedHashMap<String, Constructor<?>>() { // from class: cn.fly.verify.gi.2
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<String, Constructor<?>> entry2) {
                return size() > 10;
            }
        };
    }

    public static <T> T a(Object obj, String str) throws Throwable {
        try {
            return (T) b(obj, str);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + obj.getClass() + ", fieldName: " + str, th2);
        }
    }

    public static <T> T a(Object obj, String str, T t10) {
        try {
            return (T) a(obj, str);
        } catch (Throwable th2) {
            es.a().a(th2);
            return t10;
        }
    }

    public static <T> T a(Object obj, String str, T t10, Object... objArr) {
        try {
            return (T) a(obj, str, objArr);
        } catch (Throwable th2) {
            es.a().a(th2);
            return t10;
        }
    }

    public static <T> T a(Object obj, String str, Object... objArr) throws Throwable {
        try {
            return (T) a((String) null, obj, str, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            throw new Throwable("className: " + obj.getClass() + ", methodName: " + str, th2);
        }
    }

    public static <T> T a(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        return (T) a((String) null, obj, str, objArr, clsArr);
    }

    public static <T> T a(Object obj, String str, Object[] objArr, Class<?>[] clsArr, T t10) {
        try {
            return (T) a(obj, str, objArr, clsArr);
        } catch (Throwable th2) {
            es.a().a(th2);
            return t10;
        }
    }

    private static <T> T a(String str, Object obj, String str2, Object... objArr) throws Throwable {
        Class<?>[] clsArrA;
        Class<?> clsB = obj == null ? b(str) : obj.getClass();
        boolean z10 = false;
        if (str2.equals(ei.a("009$ej[fiHhcXfih+dkdc")) && objArr != null && objArr.length == 2) {
            clsArrA = new Class[]{String.class, Class[].class};
            if (objArr[1] == String.class) {
                objArr[1] = new Class[]{String.class};
            }
        } else if (str2.equals("getDeviceId") && objArr != null && objArr.length == 1) {
            clsArrA = new Class[]{Integer.TYPE};
        } else if (str2.equals(ei.a("006]diKeCdddkehPf")) && objArr != null && objArr.length == 2) {
            clsArrA = new Class[]{Object.class, Object[].class};
        } else {
            clsArrA = (str2.equals(ei.a("013_fiNfiLfd*ccfRfifidiffXgf")) && objArr != null && objArr.length == 1) ? new Class[]{Boolean.TYPE} : a(objArr);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = clsArrA.length;
        for (int i10 = 0; i10 < length; i10++) {
            Class<?> cls = clsArrA[i10];
            stringBuffer.append(cls == null ? "" : cls.getName());
        }
        String str3 = clsB.getName() + "#" + str2 + "#" + objArr.length + stringBuffer.toString();
        Method method = f36769d.get(str3);
        if (method != null) {
            boolean zIsStatic = Modifier.isStatic(method.getModifiers());
            if (obj == null) {
                z10 = zIsStatic;
            } else if (!zIsStatic) {
                z10 = true;
            }
            if (z10 && a(method.getParameterTypes(), clsArrA)) {
                method.setAccessible(true);
                try {
                    if (method.getReturnType() != Void.TYPE) {
                        return (T) method.invoke(obj, objArr);
                    }
                    method.invoke(obj, objArr);
                    return null;
                } catch (InvocationTargetException e10) {
                    throw e10;
                }
            }
        }
        while (clsB != null) {
            try {
                Method declaredMethod = clsB.getDeclaredMethod(str2, clsArrA);
                f36769d.put(str3, declaredMethod);
                declaredMethod.setAccessible(true);
                if (declaredMethod.getReturnType() != Void.TYPE) {
                    return (T) declaredMethod.invoke(obj, objArr);
                }
                declaredMethod.invoke(obj, objArr);
                return null;
            } catch (InvocationTargetException e11) {
                throw e11;
            } catch (Throwable unused) {
                clsB = clsB.getSuperclass();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("className: ");
        Object obj2 = str;
        if (obj != null) {
            obj2 = obj.getClass();
        }
        sb2.append(obj2);
        sb2.append(", methodName: ");
        sb2.append(str2);
        throw new NoSuchMethodException(sb2.toString());
    }

    private static <T> T a(String str, Object obj, String str2, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (clsArr == null) {
            clsArr = new Class[0];
        }
        Class<?> clsB = obj == null ? b(str) : obj.getClass();
        String str3 = clsB.getName() + "#" + str2 + "#" + objArr.length;
        Method method = f36769d.get(str3);
        if (method != null) {
            method.setAccessible(true);
            try {
                if (method.getReturnType() != Void.TYPE) {
                    return (T) method.invoke(obj, objArr);
                }
                method.invoke(obj, objArr);
                return null;
            } catch (InvocationTargetException e10) {
                throw e10;
            }
        }
        while (clsB != null) {
            try {
                Method declaredMethod = clsB.getDeclaredMethod(str2, clsArr);
                f36769d.put(str3, declaredMethod);
                declaredMethod.setAccessible(true);
                if (declaredMethod.getReturnType() != Void.TYPE) {
                    return (T) declaredMethod.invoke(obj, objArr);
                }
                declaredMethod.invoke(obj, objArr);
                return null;
            } catch (InvocationTargetException e11) {
                throw e11;
            } catch (Throwable unused) {
                clsB = clsB.getSuperclass();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("className: ");
        Object obj2 = str;
        if (obj != null) {
            obj2 = obj.getClass();
        }
        sb2.append(obj2);
        sb2.append(", methodName: ");
        sb2.append(str2);
        throw new NoSuchMethodException(sb2.toString());
    }

    public static <T> T a(String str, String str2, T t10, Object... objArr) {
        try {
            return (T) a(str, str2, objArr);
        } catch (Throwable th2) {
            es.a().a(th2);
            return t10;
        }
    }

    public static <T> T a(String str, String str2, Object... objArr) throws Throwable {
        try {
            return (T) a(str, (Object) null, str2, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", methodName: " + str2, th2);
        }
    }

    public static <T> T a(String str, String str2, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        return (T) a(str, (Object) null, str2, objArr, clsArr);
    }

    public static Object a(String str, Object... objArr) throws Throwable {
        try {
            return b(str, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", methodName: <init>", th2);
        }
    }

    public static Object a(final Map<String, a<Object[], Object>> map, Class<?>... clsArr) throws Throwable {
        if (clsArr.length == 0) {
            return null;
        }
        return Proxy.newProxyInstance(clsArr[0].getClassLoader(), clsArr, new InvocationHandler() { // from class: cn.fly.verify.gi.3
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                a aVar = (a) map.get(method.getName());
                if (aVar != null) {
                    return aVar.a(objArr);
                }
                return null;
            }
        });
    }

    public static String a(Class<?> cls) throws Throwable {
        String simpleName = f36768c.get(cls);
        if (simpleName == null) {
            simpleName = cls.getSimpleName();
            if (f36767b.containsKey(simpleName)) {
                f36768c.remove(f36767b.get(simpleName));
            }
            f36767b.put(simpleName, cls);
            f36768c.put(cls, simpleName);
        }
        return simpleName;
    }

    public static String a(String str) throws Throwable {
        return b((String) null, str);
    }

    public static String a(String str, String str2) {
        try {
            return a(str);
        } catch (Throwable th2) {
            es.a().a(th2);
            return str2;
        }
    }

    public static void a(String str, String str2, Object obj) throws Throwable {
        try {
            b(str, str2, obj);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", fieldName: " + str2 + ", value: " + String.valueOf(obj), th2);
        }
    }

    private static boolean a(Class<?> cls, Class<?> cls2) {
        return (cls == Byte.TYPE && cls2 == Byte.class) || (cls == Short.TYPE && (cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Character.TYPE && (cls2 == Character.class || cls2 == Short.class || cls2 == Byte.class)) || ((cls == Integer.TYPE && (cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Long.TYPE && (cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Float.TYPE && (cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Double.TYPE && (cls2 == Double.class || cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || (cls == Boolean.TYPE && cls2 == Boolean.class))))));
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr2.length; i10++) {
            Class<?> cls = clsArr2[i10];
            if (cls != null && !a(clsArr[i10], cls) && !clsArr[i10].isAssignableFrom(clsArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static Class<?>[] a(Object[] objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj instanceof BroadcastReceiver) {
                clsArr[i10] = BroadcastReceiver.class;
            } else {
                clsArr[i10] = obj == null ? null : obj.getClass();
            }
        }
        return clsArr;
    }

    private static synchronized Class<?> b(String str) {
        Class<?> cls;
        cls = f36767b.get(str);
        if (cls == null) {
            Iterator<String> it = f36766a.iterator();
            while (it.hasNext()) {
                try {
                    a(it.next() + "." + str);
                } catch (Throwable unused) {
                }
                cls = f36767b.get(str);
                if (cls != null) {
                    break;
                }
            }
        }
        return cls;
    }

    private static <T> T b(Object obj, String str) throws Throwable {
        if ((obj instanceof List) || obj.getClass().isArray()) {
            return (T) c(obj, str);
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field declaredField = null;
            try {
                declaredField = ((Class) it.next()).getDeclaredField(str);
            } catch (Throwable unused) {
            }
            if (declaredField != null && !Modifier.isStatic(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
                return (T) declaredField.get(obj);
            }
        }
        throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str);
    }

    private static Object b(String str, Object... objArr) throws Throwable {
        boolean z10;
        if (str.startsWith(Constants.ARRAY_TYPE)) {
            return c(str, objArr);
        }
        Class<?> clsB = b(str);
        String str2 = clsB.getName() + "#" + objArr.length;
        Constructor<?> constructor = f36770e.get(str2);
        Class<?>[] clsArrA = a(objArr);
        if (constructor != null && a(constructor.getParameterTypes(), clsArrA)) {
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        }
        Constructor<?>[] declaredConstructors = clsB.getDeclaredConstructors();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Constructor<?> constructor2 : declaredConstructors) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if (a(parameterTypes, clsArrA)) {
                f36770e.put(str2, constructor2);
                constructor2.setAccessible(true);
                return constructor2.newInstance(objArr);
            }
            if (parameterTypes.length > 0 && parameterTypes[parameterTypes.length - 1].isArray() && clsArrA.length >= parameterTypes.length - 1) {
                arrayList.add(constructor2);
                arrayList2.add(parameterTypes);
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Class[] clsArr = (Class[]) arrayList2.get(i10);
            Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
            if (b((Class<?>[]) clsArr, clsArrA)) {
                Object[] objArr2 = new Object[objArr.length + 1];
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                objArr2[objArr.length] = Array.newInstance(componentType, 0);
                Constructor constructor3 = (Constructor) arrayList.get(i10);
                constructor3.setAccessible(true);
                return constructor3.newInstance(objArr);
            }
            int length = clsArr.length - 1;
            while (true) {
                if (length >= clsArrA.length) {
                    z10 = true;
                    break;
                }
                if (!clsArrA[length].equals(componentType)) {
                    z10 = false;
                    break;
                }
                length++;
            }
            if (z10) {
                int length2 = (clsArrA.length - clsArr.length) + 1;
                Object objNewInstance = Array.newInstance(componentType, length2);
                for (int i11 = 0; i11 < length2; i11++) {
                    Array.set(objNewInstance, i11, objArr[(clsArr.length - 1) + i11]);
                }
                Object[] objArr3 = new Object[objArr.length + 1];
                System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
                objArr3[objArr.length] = objNewInstance;
                Constructor constructor4 = (Constructor) arrayList.get(i10);
                constructor4.setAccessible(true);
                return constructor4.newInstance(objArr);
            }
        }
        throw new NoSuchMethodException("className: " + str + ", methodName: <init>");
    }

    public static synchronized String b(String str, String str2) throws Throwable {
        if (str2.endsWith(".*")) {
            f36766a.add(str2.substring(0, str2.length() - 2));
            return androidx.webkit.b.f28327e;
        }
        Class<?> cls = Class.forName(str2);
        if (str == null) {
            str = cls.getSimpleName();
        }
        if (f36767b.containsKey(str)) {
            f36768c.remove(f36767b.get(str));
        }
        f36767b.put(str, cls);
        f36768c.put(cls, str);
        return str;
    }

    public static void b(Object obj, String str, Object obj2) throws Throwable {
        try {
            c(obj, str, obj2);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2), th2);
        }
    }

    private static void b(String str, String str2, Object obj) throws Throwable {
        Field declaredField;
        ArrayList arrayList = new ArrayList();
        for (Class<?> clsB = b(str); clsB != null; clsB = clsB.getSuperclass()) {
            arrayList.add(clsB);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                declaredField = ((Class) it.next()).getDeclaredField(str2);
            } catch (Throwable unused) {
                declaredField = null;
            }
            if (declaredField != null && Modifier.isStatic(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
                declaredField.set(null, obj);
                return;
            }
        }
        throw new NoSuchFieldException("className: " + str + ", fieldName: " + str2 + ", value: " + String.valueOf(obj));
    }

    private static boolean b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        boolean z10;
        if (clsArr.length - clsArr2.length != 1) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= clsArr2.length) {
                z10 = true;
                break;
            }
            Class<?> cls = clsArr2[i10];
            if (cls != null && !a(clsArr[i10], cls) && !clsArr[i10].isAssignableFrom(clsArr2[i10])) {
                z10 = false;
                break;
            }
            i10++;
        }
        return z10 && clsArr[clsArr.length - 1].isArray();
    }

    private static Object c(Object obj, String str) throws Throwable {
        int i10;
        int i11;
        if (obj instanceof List) {
            if (str.startsWith(Constants.ARRAY_TYPE) && str.endsWith("]")) {
                try {
                    i11 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused) {
                    i11 = -1;
                }
                if (i11 != -1) {
                    return ((List) obj).get(i11);
                }
            }
        } else {
            if (ei.a("006gfeFej7ih").equals(str)) {
                return Integer.valueOf(Array.getLength(obj));
            }
            if (str.startsWith(Constants.ARRAY_TYPE) && str.endsWith("]")) {
                try {
                    i10 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused2) {
                    i10 = -1;
                }
                if (i10 != -1) {
                    return Array.get(obj, i10);
                }
            }
        }
        throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str);
    }

    public static <T> T c(String str, String str2) throws Throwable {
        try {
            return (T) d(str, str2);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", fieldName: " + str2, th2);
        }
    }

    private static Object c(String str, Object... objArr) throws Throwable {
        Class<?> clsB;
        String strSubstring = str;
        int i10 = 0;
        while (strSubstring.startsWith(Constants.ARRAY_TYPE)) {
            i10++;
            strSubstring = strSubstring.substring(1);
        }
        int[] iArr = null;
        if (i10 == objArr.length) {
            int[] iArr2 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    iArr2[i11] = Integer.parseInt(String.valueOf(objArr[i11]));
                } catch (Throwable unused) {
                }
            }
            iArr = iArr2;
        }
        if (iArr != null) {
            if ("B".equals(strSubstring)) {
                clsB = Byte.TYPE;
            } else if (androidx.exifinterface.media.a.R4.equals(strSubstring)) {
                clsB = Short.TYPE;
            } else if ("I".equals(strSubstring)) {
                clsB = Integer.TYPE;
            } else if ("J".equals(strSubstring)) {
                clsB = Long.TYPE;
            } else if ("F".equals(strSubstring)) {
                clsB = Float.TYPE;
            } else if ("D".equals(strSubstring)) {
                clsB = Double.TYPE;
            } else if ("Z".equals(strSubstring)) {
                clsB = Boolean.TYPE;
            } else {
                clsB = "C".equals(strSubstring) ? Character.TYPE : b(strSubstring);
            }
            if (clsB != null) {
                return Array.newInstance(clsB, iArr);
            }
        }
        throw new NoSuchMethodException("className: [" + str + ", methodName: <init>");
    }

    private static void c(Object obj, String str, Object obj2) throws Throwable {
        if ((obj instanceof List) || obj.getClass().isArray()) {
            d(obj, str, obj2);
            return;
        }
        if (obj instanceof Map) {
            ((Map) obj).put(str, obj2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field declaredField = null;
            try {
                declaredField = ((Class) it.next()).getDeclaredField(str);
            } catch (Throwable unused) {
            }
            if (declaredField != null && !Modifier.isStatic(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
                return;
            }
        }
        throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2));
    }

    private static <T> T d(String str, String str2) throws Throwable {
        Field declaredField;
        ArrayList arrayList = new ArrayList();
        for (Class<?> clsB = b(str); clsB != null; clsB = clsB.getSuperclass()) {
            arrayList.add(clsB);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                declaredField = ((Class) it.next()).getDeclaredField(str2);
            } catch (Throwable unused) {
                declaredField = null;
            }
            if (declaredField != null && Modifier.isStatic(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
                return (T) declaredField.get(null);
            }
        }
        throw new NoSuchFieldException("className: " + str + ", fieldName: " + str2);
    }

    private static void d(Object obj, String str, Object obj2) throws Throwable {
        int i10;
        int iByteValue;
        double dLongValue;
        int iByteValue2;
        float fLongValue;
        int iByteValue3;
        short sByteValue;
        int i11;
        if (obj instanceof List) {
            if (str.startsWith(Constants.ARRAY_TYPE) && str.endsWith("]")) {
                try {
                    i11 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused) {
                    i11 = -1;
                }
                if (i11 != -1) {
                    ((List) obj).set(i11, obj2);
                    return;
                }
            }
        } else if (str.startsWith(Constants.ARRAY_TYPE) && str.endsWith("]")) {
            try {
                i10 = Integer.parseInt(str.substring(1, str.length() - 1));
            } catch (Throwable unused2) {
                i10 = -1;
            }
            if (i10 != -1) {
                String name = obj.getClass().getName();
                while (name.startsWith(Constants.ARRAY_TYPE)) {
                    name = name.substring(1);
                }
                Class<?> cls = obj2.getClass();
                if (!"B".equals(name)) {
                    Object objValueOf = null;
                    if (androidx.exifinterface.media.a.R4.equals(name)) {
                        if (cls == Short.class) {
                            objValueOf = obj2;
                        } else if (cls == Byte.class) {
                            objValueOf = Short.valueOf(((Byte) obj2).byteValue());
                        }
                        if (objValueOf != null) {
                            Array.set(obj, i10, objValueOf);
                            return;
                        }
                    } else if ("I".equals(name)) {
                        if (cls == Integer.class) {
                            objValueOf = obj2;
                        } else {
                            if (cls == Short.class) {
                                sByteValue = ((Short) obj2).shortValue();
                            } else if (cls == Byte.class) {
                                sByteValue = ((Byte) obj2).byteValue();
                            }
                            objValueOf = Integer.valueOf(sByteValue);
                        }
                        if (objValueOf != null) {
                            Array.set(obj, i10, objValueOf);
                            return;
                        }
                    } else if ("J".equals(name)) {
                        if (cls == Long.class) {
                            objValueOf = obj2;
                        } else {
                            if (cls == Integer.class) {
                                iByteValue3 = ((Integer) obj2).intValue();
                            } else if (cls == Short.class) {
                                iByteValue3 = ((Short) obj2).shortValue();
                            } else if (cls == Byte.class) {
                                iByteValue3 = ((Byte) obj2).byteValue();
                            }
                            objValueOf = Long.valueOf(iByteValue3);
                        }
                        if (objValueOf != null) {
                            Array.set(obj, i10, objValueOf);
                            return;
                        }
                    } else if ("F".equals(name)) {
                        if (cls == Float.class) {
                            objValueOf = obj2;
                        } else {
                            if (cls == Long.class) {
                                fLongValue = ((Long) obj2).longValue();
                            } else {
                                if (cls == Integer.class) {
                                    iByteValue2 = ((Integer) obj2).intValue();
                                } else if (cls == Short.class) {
                                    iByteValue2 = ((Short) obj2).shortValue();
                                } else if (cls == Byte.class) {
                                    iByteValue2 = ((Byte) obj2).byteValue();
                                }
                                fLongValue = iByteValue2;
                            }
                            objValueOf = Float.valueOf(fLongValue);
                        }
                        if (objValueOf != null) {
                            Array.set(obj, i10, objValueOf);
                            return;
                        }
                    } else if ("D".equals(name)) {
                        if (cls == Double.class) {
                            objValueOf = obj2;
                        } else {
                            if (cls == Float.class) {
                                dLongValue = ((Float) obj2).floatValue();
                            } else if (cls == Long.class) {
                                dLongValue = ((Long) obj2).longValue();
                            } else {
                                if (cls == Integer.class) {
                                    iByteValue = ((Integer) obj2).intValue();
                                } else if (cls == Short.class) {
                                    iByteValue = ((Short) obj2).shortValue();
                                } else if (cls == Byte.class) {
                                    iByteValue = ((Byte) obj2).byteValue();
                                }
                                dLongValue = iByteValue;
                            }
                            objValueOf = Double.valueOf(dLongValue);
                        }
                        if (objValueOf != null) {
                            Array.set(obj, i10, objValueOf);
                            return;
                        }
                    } else if ("Z".equals(name)) {
                        if (cls == Boolean.class) {
                            Array.set(obj, i10, obj2);
                            return;
                        }
                    } else if ("C".equals(name)) {
                        if (cls == Character.class) {
                            Array.set(obj, i10, obj2);
                            return;
                        }
                    } else if (name.equals(cls.getName())) {
                        Array.set(obj, i10, obj2);
                        return;
                    }
                } else if (cls == Byte.class) {
                    Array.set(obj, i10, obj2);
                    return;
                }
            }
        }
        throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2));
    }
}
