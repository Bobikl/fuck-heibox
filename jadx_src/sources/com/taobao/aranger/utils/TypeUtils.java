package com.taobao.aranger.utils;

import android.content.ComponentName;
import android.text.TextUtils;
import com.meituan.robust.Constants;
import com.taobao.aranger.ARanger;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeUtils {
    private TypeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean arrayContainsAnnotation(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        if (annotationArr != null && cls != null) {
            for (Annotation annotation : annotationArr) {
                if (cls.isInstance(annotation)) {
                    return true;
                }
            }
        }
        return false;
    }

    static String basicNameConvert(String str) {
        str.hashCode();
        switch (str) {
            case "java.lang.Integer":
                return Constants.INT;
            case "java.lang.Float":
                return "float";
            case "java.lang.Short":
                return Constants.SHORT;
            case "java.lang.Character":
                return Constants.CHAR;
            case "java.lang.Boolean":
                return "boolean";
            case "java.lang.Byte":
                return Constants.BYTE;
            case "java.lang.Long":
                return Constants.LONG;
            case "java.lang.Double":
                return Constants.DOUBLE;
            default:
                return str;
        }
    }

    private static boolean classAssignable(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        int length = clsArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Class<?> cls = clsArr2[i10];
            if (cls != null && !primitiveMatch(clsArr[i10], cls) && !clsArr[i10].isAssignableFrom(clsArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    public static void convertObjectToArray(String str, Object obj, Object obj2) {
        str.hashCode();
        switch (str) {
            case "[B":
                byte[] bArr = (byte[]) obj2;
                if (bArr != null) {
                    byte[] bArr2 = (byte[]) obj;
                    System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
                    break;
                }
                break;
            case "[C":
                char[] cArr = (char[]) obj2;
                if (cArr != null) {
                    char[] cArr2 = (char[]) obj;
                    System.arraycopy(cArr, 0, cArr2, 0, cArr2.length);
                    break;
                }
                break;
            case "[D":
                double[] dArr = (double[]) obj2;
                if (dArr != null) {
                    double[] dArr2 = (double[]) obj;
                    System.arraycopy(dArr, 0, dArr2, 0, dArr2.length);
                    break;
                }
                break;
            case "[F":
                float[] fArr = (float[]) obj2;
                if (fArr != null) {
                    float[] fArr2 = (float[]) obj;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                    break;
                }
                break;
            case "[I":
                int[] iArr = (int[]) obj2;
                if (iArr != null) {
                    int[] iArr2 = (int[]) obj;
                    System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
                    break;
                }
                break;
            case "[J":
                long[] jArr = (long[]) obj2;
                if (jArr != null) {
                    long[] jArr2 = (long[]) obj;
                    System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
                    break;
                }
                break;
            case "[S":
                short[] sArr = (short[]) obj2;
                if (sArr != null) {
                    short[] sArr2 = (short[]) obj;
                    System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
                    break;
                }
                break;
            case "[Z":
                boolean[] zArr = (boolean[]) obj2;
                if (zArr != null) {
                    boolean[] zArr2 = (boolean[]) obj;
                    System.arraycopy(zArr, 0, zArr2, 0, zArr2.length);
                    break;
                }
                break;
            default:
                Object[] objArr = (Object[]) obj2;
                if (objArr != null) {
                    Object[] objArr2 = (Object[]) obj;
                    System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
                    break;
                }
                break;
        }
    }

    public static String[] convertParameterTypes(ParameterWrapper[] parameterWrapperArr) throws IPCException {
        if (parameterWrapperArr == null) {
            return new String[0];
        }
        int length = parameterWrapperArr.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            ParameterWrapper parameterWrapper = parameterWrapperArr[i10];
            strArr[i10] = parameterWrapper == null ? null : getClassId(parameterWrapper.getClassType());
        }
        return strArr;
    }

    public static String[] convertParameterTypes(Class[] clsArr) {
        if (clsArr == null) {
            return new String[0];
        }
        int length = clsArr.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            Class cls = clsArr[i10];
            strArr[i10] = cls == null ? null : getClassId(cls);
        }
        return strArr;
    }

    public static String getClassId(Class<?> cls) {
        return cls.getName();
    }

    public static Constructor<?> getConstructor(Class<?> cls, Class<?>[] clsArr) throws IPCException {
        String constructorId = getConstructorId(cls, clsArr);
        Constructor constructor = TypeCenter.getInstance().getConstructor(constructorId);
        if (constructor != null) {
            return constructor;
        }
        for (Constructor constructor2 : cls.getConstructors()) {
            if (classAssignable(constructor2.getParameterTypes(), clsArr)) {
                if (constructor != null) {
                    throw new IPCException(15, "The class " + cls.getName() + " has too many constructors whose  parameter types match the required types.");
                }
                TypeCenter.getInstance().registerConstructor(constructorId, constructor2);
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            return constructor;
        }
        throw new IPCException(16, "The class " + cls.getName() + " do not have a constructor whose  parameter types match the required types.");
    }

    private static String getConstructorId(Class cls, Class[] clsArr) {
        return cls.getSimpleName() + '(' + getMethodParameters((Class<?>[]) clsArr) + ')';
    }

    static Method getMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) throws IPCException {
        Method method = null;
        for (Method method2 : cls.getMethods()) {
            if (method2.getName().equals(str) && classAssignable(method2.getParameterTypes(), clsArr)) {
                if (method != null) {
                    throw new IPCException(14, "There are more than one method named " + str + " of the class " + cls.getName() + " matching the parameters!");
                }
                method = method2;
            }
        }
        if (method == null) {
            return null;
        }
        if (method.getReturnType() == cls2) {
            return method;
        }
        throw new IPCException(17, "The method named " + str + " of the class " + cls.getName() + " matches the parameter types but not the return type. The return type is " + method.getReturnType().getName() + " but the required type is " + cls2.getName() + ". The method in the local interface must exactly match the method in the remote class.");
    }

    public static String getMethodId(String str, ParameterWrapper[] parameterWrapperArr) {
        return str + '(' + getMethodParameters(parameterWrapperArr) + ')';
    }

    public static String getMethodId(String str, String[] strArr) {
        return str + '(' + getMethodParameters(strArr) + ')';
    }

    private static String getMethodParameters(ParameterWrapper[] parameterWrapperArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = parameterWrapperArr.length;
        if (length == 0) {
            return sb2.toString();
        }
        sb2.append(basicNameConvert(parameterWrapperArr[0].getName()));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb2.append(basicNameConvert(parameterWrapperArr[i10].getName()));
        }
        return sb2.toString();
    }

    private static String getMethodParameters(Class<?>[] clsArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = clsArr.length;
        if (length == 0) {
            return sb2.toString();
        }
        sb2.append(basicNameConvert(getClassId(clsArr[0])));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb2.append(basicNameConvert(getClassId(clsArr[i10])));
        }
        return sb2.toString();
    }

    private static String getMethodParameters(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = strArr.length;
        if (length == 0) {
            return sb2.toString();
        }
        sb2.append(basicNameConvert(strArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb2.append(basicNameConvert(strArr[i10]));
        }
        return sb2.toString();
    }

    public static int getObjectArraySize(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "[B":
                return ((byte[]) obj).length;
            case "[C":
                return ((char[]) obj).length;
            case "[D":
                return ((double[]) obj).length;
            case "[F":
                return ((float[]) obj).length;
            case "[I":
                return ((int[]) obj).length;
            case "[J":
                return ((long[]) obj).length;
            case "[S":
                return ((short[]) obj).length;
            case "[Z":
                return ((boolean[]) obj).length;
            default:
                return ((Object[]) obj).length;
        }
    }

    private static boolean primitiveMatch(Class<?> cls, Class<?> cls2) {
        if (!cls.isPrimitive() && !cls2.isPrimitive()) {
            return false;
        }
        if (cls == cls2) {
            return true;
        }
        if (cls.isPrimitive()) {
            return primitiveMatch(cls2, cls);
        }
        return (cls == Boolean.class && cls2 == Boolean.TYPE) || (cls == Byte.class && cls2 == Byte.TYPE) || ((cls == Character.class && cls2 == Character.TYPE) || ((cls == Short.class && cls2 == Short.TYPE) || ((cls == Integer.class && cls2 == Integer.TYPE) || ((cls == Long.class && cls2 == Long.TYPE) || ((cls == Float.class && cls2 == Float.TYPE) || ((cls == Double.class && cls2 == Double.TYPE) || (cls == Void.class && cls2 == Void.TYPE)))))));
    }

    public static void validateComponentName(ComponentName componentName) throws IPCException {
        if (componentName == null) {
            throw new IPCException(28, "the component name is null!");
        }
        if (TextUtils.isEmpty(componentName.getClassName()) || TextUtils.isEmpty(componentName.getPackageName())) {
            throw new IPCException(28, "the package name or provider class name in component is null!");
        }
        if (ARanger.getContext().getPackageName().equals(componentName.getPackageName())) {
            try {
                if (!ARangerProvider.class.isAssignableFrom(Class.forName(componentName.getClassName()))) {
                    throw new IPCException(20, "Only class extends ARangerProvider can be passed as the parameters.");
                }
            } catch (ClassNotFoundException unused) {
                throw new IPCException(20, "The " + componentName.getClassName() + " class not found, please check the provider class name.");
            }
        }
    }

    public static void validateServiceInterface(Class<?> cls) throws IPCException {
        if (cls == null) {
            throw new IPCException(20, "Class object is null.");
        }
        if (!cls.isInterface()) {
            throw new IPCException(20, "Only interfaces can be passed as the parameters.");
        }
        if (cls.getAnnotation(ServiceName.class) == null) {
            throw new IPCException(20, "the interfaces must have ServiceName annotation.");
        }
    }
}
