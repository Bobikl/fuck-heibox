package com.meituan.robust.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class EnhancedRobustUtils {
    public static boolean isThrowable = true;

    public static Method getDeclaredMethod(Object obj, String str, Class[] clsArr, Class cls) {
        if (cls == null || !cls.isInterface()) {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                    if (declaredMethod != null) {
                        if (!declaredMethod.isAccessible()) {
                            declaredMethod.setAccessible(true);
                        }
                        return declaredMethod;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
        } else {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused2) {
            }
        }
        if (!isThrowable) {
            return null;
        }
        throw new RuntimeException("getDeclaredMethod error " + str + "   parameterTypes   " + clsArr + " targetObject " + obj.toString());
    }

    public static Object getFieldValue(String str, Object obj, Class cls) {
        try {
            return getReflectField(str, obj, cls).get(obj);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("getFieldValue  error " + str + "   instance   " + obj);
        }
    }

    private static Field getReflectField(String str, Object obj, Class cls) throws NoSuchFieldException {
        if (cls == null) {
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("Field " + str + " declaring class is null ");
        }
        if (cls.isInterface()) {
            return cls.getDeclaredField(str);
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (NoSuchFieldException unused) {
            throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
        }
    }

    private static Field getReflectStaticField(String str, Class cls) throws NoSuchFieldException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
            throw new NoSuchFieldException("Field " + str + " not found in " + cls);
        }
    }

    public static Object getStaticFieldValue(String str, Class cls) {
        try {
            return getReflectStaticField(str, cls).get(null);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("getStaticFieldValue  error " + str + "   clazz   " + cls);
        }
    }

    public static Object invokeReflectConstruct(String str, Object[] objArr, Class[] clsArr) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("invokeReflectConstruct error " + str + "   parameter   " + objArr);
        }
    }

    public static Object invokeReflectMethod(String str, Object obj, Object[] objArr, Class[] clsArr, Class cls) {
        try {
            return getDeclaredMethod(obj, str, clsArr, cls).invoke(obj, objArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("invokeReflectMethod error " + str + "   parameter   " + objArr + " targetObject " + obj.toString() + "  args  " + clsArr);
        }
    }

    public static Object invokeReflectStaticMethod(String str, Class cls, Object[] objArr, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("invokeReflectStaticMethod error " + str + "   class   " + cls + "  args  " + clsArr);
        }
    }

    public static void setFieldValue(String str, Object obj, byte b10, Class cls) {
        try {
            getReflectField(str, obj, cls).setByte(obj, b10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue byte error " + str + "   target   " + obj + "  value  " + ((int) b10));
            }
        }
    }

    public static void setFieldValue(String str, Object obj, char c10, Class cls) {
        try {
            getReflectField(str, obj, cls).setChar(obj, c10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue char error " + str + "   target   " + obj + "  value  " + c10);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, double d10, Class cls) {
        try {
            getReflectField(str, obj, cls).setDouble(obj, d10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue double error " + str + "   target   " + obj + "  value  " + d10);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, float f10, Class cls) {
        try {
            getReflectField(str, obj, cls).setFloat(obj, f10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue float error " + str + "   target   " + obj + "  value  " + f10);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, int i10, Class cls) {
        try {
            getReflectField(str, obj, cls).setInt(obj, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue int error " + str + "   target   " + obj + "  value  " + i10);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, long j10, Class cls) {
        try {
            getReflectField(str, obj, cls).setLong(obj, j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue long error " + str + "   target   " + obj + "  value  " + j10);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, Object obj2, Class cls) {
        try {
            getReflectField(str, obj, cls).set(obj, obj2);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue Object error " + str + "   target   " + obj + "  value  " + obj2);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, short s10, Class cls) {
        try {
            getReflectField(str, obj, cls).setShort(obj, s10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue short error " + str + "   target   " + obj + "  value  " + ((int) s10));
            }
        }
    }

    public static void setFieldValue(String str, Object obj, boolean z10, Class cls) {
        try {
            getReflectField(str, obj, cls).setBoolean(obj, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setFieldValue boolean error " + str + "   target   " + obj + "  value  " + z10);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, double d10) {
        try {
            getReflectStaticField(str, cls).setDouble(null, d10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue Object error " + str + "   Class   " + cls + "  value  " + d10);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, float f10) {
        try {
            getReflectStaticField(str, cls).setFloat(null, f10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue float error " + str + "   Class   " + cls + "  value  " + f10);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, int i10) {
        try {
            getReflectStaticField(str, cls).setInt(null, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue int error " + str + "   Class   " + cls + "  value  " + i10);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, long j10) {
        try {
            getReflectStaticField(str, cls).setLong(null, j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue long error " + str + "   Class   " + cls + "  value  " + j10);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, Object obj) {
        try {
            getReflectStaticField(str, cls).set(null, obj);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue Object error " + str + "   Class   " + cls + "  value  " + obj);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, boolean z10) {
        try {
            getReflectStaticField(str, cls).setBoolean(null, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue boolean error " + str + "   Class   " + cls + "  value  " + z10);
            }
        }
    }
}
