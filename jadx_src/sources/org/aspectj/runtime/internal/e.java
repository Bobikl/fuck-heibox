package org.aspectj.runtime.internal;

/* JADX INFO: compiled from: Conversions.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private e() {
    }

    public static Object a(boolean z10) {
        return Boolean.valueOf(z10);
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to boolean");
    }

    public static Object c(byte b10) {
        return Byte.valueOf(b10);
    }

    public static byte d(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to byte");
    }

    public static Object e(char c10) {
        return Character.valueOf(c10);
    }

    public static char f(Object obj) {
        if (obj == null) {
            return (char) 0;
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to char");
    }

    public static Object g(double d10) {
        return Double.valueOf(d10);
    }

    public static double h(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to double");
    }

    public static Object i(float f10) {
        return Float.valueOf(f10);
    }

    public static float j(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to float");
    }

    public static Object k(int i10) {
        return Integer.valueOf(i10);
    }

    public static int l(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to int");
    }

    public static Object m(long j10) {
        return Long.valueOf(j10);
    }

    public static long n(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to long");
    }

    public static Object o(short s10) {
        return Short.valueOf(s10);
    }

    public static short p(Object obj) {
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to short");
    }

    public static Object q() {
        return null;
    }

    public static Object r(Object obj) {
        return obj;
    }
}
