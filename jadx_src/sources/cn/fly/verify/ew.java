package cn.fly.verify;

import android.content.Context;
import android.os.Build;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class ew implements eu {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f36377a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static long f36378b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static long f36379c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long f36380d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static long f36381e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static long f36382f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static long f36383g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static long f36384h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static long f36385i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static long f36386j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static long f36387k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static long f36388l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static boolean f36389m = false;

        public static synchronized <T> T a(Class<?> cls, Object obj, String str, Object... objArr) throws Throwable {
            T t10;
            boolean zB = b();
            if (!f36389m || !zB) {
                throw new Throwable("x2 " + f36389m + "|" + zB);
            }
            Method method = null;
            for (Method method2 : b.e.class.getDeclaredMethods()) {
                if (method2.getReturnType() == Object.class) {
                    method = method2;
                    break;
                }
            }
            if (method == null) {
                throw new Throwable("x22");
            }
            method.setAccessible(true);
            long jA = c.a(cls, f36381e);
            if (jA != 0) {
                int iA = c.a(jA);
                for (int i10 = 0; i10 < iA; i10++) {
                    long j10 = i10;
                    long j11 = f36385i;
                    Long.signum(j10);
                    c.a(method, f36377a, (j10 * j11) + jA + f36386j);
                    if (str.equals(method.getName()) && a(method.getParameterTypes(), objArr)) {
                        try {
                            t10 = (T) method.invoke(obj, objArr);
                            c();
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
            }
            c();
            throw new NoSuchMethodException("n2");
            return t10;
        }

        public static synchronized <T> T a(Class<?> cls, String str, Object obj) throws Throwable {
            MethodHandle methodHandleUnreflectGetter;
            T t10;
            boolean zB = b();
            if (!f36389m || !zB) {
                throw new Throwable("x3 " + f36389m + "|" + zB);
            }
            if (Build.VERSION.SDK_INT < 26) {
                throw new Throwable("x33");
            }
            Field[] declaredFields = b.h.class.getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    methodHandleUnreflectGetter = null;
                    break;
                }
                Field field = declaredFields[i10];
                if (field.getType() == Integer.TYPE && (obj != null || (field.getModifiers() & 8) != 0)) {
                    field.setAccessible(true);
                    methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(field);
                    break;
                }
                i10++;
            }
            if (methodHandleUnreflectGetter == null) {
                throw new Throwable("x34");
            }
            long jA = c.a(cls, obj == null ? f36383g : f36382f);
            if (jA != 0) {
                int iA = c.a(jA);
                for (int i11 = 0; i11 < iA; i11++) {
                    long j10 = i11;
                    long j11 = f36387k;
                    Long.signum(j10);
                    c.a(methodHandleUnreflectGetter, f36379c, (j10 * j11) + jA + f36388l);
                    c.a(methodHandleUnreflectGetter, f36380d, (Object) null);
                    try {
                        MethodHandles.Lookup lookup = MethodHandles.lookup();
                        Method method = lookup.getClass().getMethod(ba.a("0123fl>h$ffXhfi'hnfkfl(hek"), MethodHandle.class);
                        method.setAccessible(true);
                        method.invoke(lookup, methodHandleUnreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Field field2 = (Field) c.b(c.b(methodHandleUnreflectGetter, f36380d), f36384h);
                    if (field2.getName().equals(str)) {
                        field2.setAccessible(true);
                        try {
                            t10 = (T) field2.get(obj);
                            c();
                        } catch (Throwable unused2) {
                            continue;
                        }
                    }
                }
            }
            c();
            throw new NoSuchMethodException("n3");
            return t10;
        }

        public static synchronized <T> T a(Class<?> cls, Object... objArr) throws Throwable {
            T t10;
            boolean zB = b();
            if (!f36389m || !zB) {
                throw new Throwable("x1 " + f36389m + "|" + zB);
            }
            Method method = null;
            for (Method method2 : b.e.class.getDeclaredMethods()) {
                if (method2.getReturnType() == Object.class) {
                    method = method2;
                    break;
                }
            }
            if (method == null) {
                throw new Throwable("x22");
            }
            Constructor declaredConstructor = b.e.class.getDeclaredConstructor(Object[].class);
            declaredConstructor.setAccessible(true);
            long jA = c.a(cls, f36381e);
            if (jA != 0) {
                int iA = c.a(jA);
                for (int i10 = 0; i10 < iA; i10++) {
                    long j10 = i10;
                    long j11 = f36385i;
                    Long.signum(j10);
                    long j12 = (j10 * j11) + jA + f36386j;
                    c.a(method, f36377a, j12);
                    if (ba.a("0067kgfkTgVfk[k*ki").equals(method.getName())) {
                        c.a(declaredConstructor, f36377a, j12);
                        c.a(declaredConstructor, f36378b, cls);
                        if (a(declaredConstructor.getParameterTypes(), objArr)) {
                            try {
                                t10 = (T) declaredConstructor.newInstance(objArr);
                                c();
                            } catch (Throwable unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            c();
            throw new NoSuchMethodException("n1");
            return t10;
        }

        public static synchronized <T> T a(String str, Object obj, String str2, Object... objArr) throws Throwable {
            return (T) a(Class.forName(str), obj, str2, objArr);
        }

        public static synchronized <T> T a(String str, String str2, Object obj) throws Throwable {
            return (T) a(Class.forName(str), str2, obj);
        }

        public static synchronized <T> T a(String str, Object... objArr) throws Throwable {
            return (T) a(Class.forName(str), objArr);
        }

        private static synchronized void a(int i10) {
            bv.a().a("usf", i10);
        }

        public static synchronized boolean a() throws Throwable {
            long jA;
            ex.b("3xu ck");
            if (Build.VERSION.SDK_INT < 29) {
                return false;
            }
            if (c.a()) {
                if (!b() || !d()) {
                    return false;
                }
                try {
                    Field[] declaredFields = b.c.class.getDeclaredFields();
                    for (Field field : declaredFields) {
                        if (field.getType() == Long.TYPE) {
                            f36377a = c.a(field);
                            break;
                        }
                    }
                    if (a("", f36377a)) {
                        return false;
                    }
                    for (Field field2 : declaredFields) {
                        if (field2.getType() == b.C0273b.class) {
                            f36378b = c.a(field2);
                            break;
                        }
                    }
                    if (a("", f36378b)) {
                        return false;
                    }
                    for (Field field3 : b.f.class.getDeclaredFields()) {
                        if (field3.getType() == Long.TYPE) {
                            f36379c = c.a(field3);
                            break;
                        }
                    }
                    if (a("", f36379c)) {
                        return false;
                    }
                    for (Field field4 : b.g.class.getDeclaredFields()) {
                        if (field4.getType() == b.C0273b.class) {
                            f36380d = c.a(field4);
                            break;
                        }
                    }
                    if (a("", f36380d)) {
                        return false;
                    }
                    int i10 = 1;
                    for (Field field5 : b.C0273b.class.getDeclaredFields()) {
                        if (field5.getType() == Long.TYPE) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        f36383g = c.a(field5);
                                        break;
                                    }
                                } else {
                                    f36381e = c.a(field5);
                                }
                            } else {
                                f36382f = c.a(field5);
                            }
                            i10++;
                        }
                    }
                    if (a("", f36382f)) {
                        return false;
                    }
                    if (a("", f36381e)) {
                        return false;
                    }
                    if (a("", f36383g)) {
                        return false;
                    }
                    for (Field field6 : b.d.class.getDeclaredFields()) {
                        if (field6.getType() == Member.class) {
                            f36384h = c.a(field6);
                            break;
                        }
                    }
                    if (a("", f36384h)) {
                        return false;
                    }
                    Method[] declaredMethods = b.i.class.getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i11 = 1;
                    int i12 = 0;
                    long jA2 = 0;
                    while (true) {
                        if (i12 >= length) {
                            jA = 0;
                            break;
                        }
                        Method method = declaredMethods[i12];
                        if (method.getReturnType() == Void.TYPE) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    method.setAccessible(true);
                                    jA = c.a(MethodHandles.lookup().unreflect(method), f36379c);
                                    break;
                                }
                            } else {
                                method.setAccessible(true);
                                jA2 = c.a(MethodHandles.lookup().unreflect(method), f36379c);
                                i11++;
                            }
                        }
                        i12++;
                    }
                    long j10 = jA - jA2;
                    f36385i = j10;
                    if (a("", j10)) {
                        return false;
                    }
                    long jA3 = (jA2 - c.a(b.i.class, f36381e)) - f36385i;
                    f36386j = jA3;
                    if (a("", jA3)) {
                        return false;
                    }
                    MethodHandle methodHandleUnreflectGetter = null;
                    int i13 = 1;
                    MethodHandle methodHandleUnreflectGetter2 = null;
                    for (Field field7 : b.h.class.getDeclaredFields()) {
                        if (field7.getType() == Integer.TYPE) {
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    field7.setAccessible(true);
                                    methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(field7);
                                    break;
                                }
                            } else {
                                field7.setAccessible(true);
                                methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(field7);
                                i13++;
                            }
                        }
                    }
                    long jA4 = c.a(methodHandleUnreflectGetter2, f36379c);
                    long jA5 = c.a(methodHandleUnreflectGetter, f36379c) - jA4;
                    f36387k = jA5;
                    if (a("", jA5)) {
                        return false;
                    }
                    long jA6 = jA4 - c.a(b.h.class, f36382f);
                    f36388l = jA6;
                    if (a("", jA6)) {
                        return false;
                    }
                    ew.b();
                } catch (Throwable unused) {
                }
                c();
            }
            f36389m = true;
            return true;
        }

        private static boolean a(String str, long j10) {
            if (j10 != 0) {
                return false;
            }
            try {
                String str2 = str + j10 + "|";
                ex.b("3xu ckZr " + str2.substring(0, str2.length() - 1));
            } catch (Throwable unused) {
            }
            return true;
        }

        private static boolean a(Class<?>[] clsArr, Object[] objArr) {
            if ((clsArr != null && clsArr.length != 0) || (objArr != null && objArr.length != 0)) {
                if (clsArr.length != objArr.length) {
                    return false;
                }
                for (int i10 = 0; i10 < clsArr.length; i10++) {
                    if (clsArr[i10].isPrimitive()) {
                        Class<?> cls = clsArr[i10];
                        if (cls == Integer.TYPE && !(objArr[i10] instanceof Integer)) {
                            return false;
                        }
                        if (cls == Byte.TYPE && !(objArr[i10] instanceof Byte)) {
                            return false;
                        }
                        if (cls == Character.TYPE && !(objArr[i10] instanceof Character)) {
                            return false;
                        }
                        if (cls == Boolean.TYPE && !(objArr[i10] instanceof Boolean)) {
                            return false;
                        }
                        if (cls == Double.TYPE && !(objArr[i10] instanceof Double)) {
                            return false;
                        }
                        if (cls == Float.TYPE && !(objArr[i10] instanceof Float)) {
                            return false;
                        }
                        if (cls == Long.TYPE && !(objArr[i10] instanceof Long)) {
                            return false;
                        }
                        if (cls == Short.TYPE && !(objArr[i10] instanceof Short)) {
                            return false;
                        }
                    } else {
                        Object obj = objArr[i10];
                        if (obj != null && !clsArr[i10].isInstance(obj)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private static synchronized boolean b() {
            int iB = bv.a().b("usf", -1);
            if (iB == 1) {
                ex.b("3xu ckFe f");
                return false;
            }
            if (iB != -1) {
                return true;
            }
            a(1);
            return true;
        }

        private static synchronized void c() {
            a(0);
        }

        private static boolean d() {
            try {
                int length = b.f.class.getDeclaredFields().length;
                String str = "f" + length;
                if (length != 5) {
                    ex.b("3xu ckHpCz " + str);
                    return false;
                }
                int length2 = b.g.class.getDeclaredFields().length;
                String str2 = str + "|f" + length2;
                if (length2 != 1) {
                    ex.b("3xu ckHpCz " + str2);
                    return false;
                }
                int length3 = b.d.class.getDeclaredFields().length;
                String str3 = str2 + "|f" + length3;
                if (length3 != 2) {
                    ex.b("3xu ckHpCz " + str3);
                    return false;
                }
                int length4 = b.C0273b.class.getDeclaredFields().length;
                String str4 = str3 + "|f" + length4;
                if (length4 != 26) {
                    ex.b("3xu ckHpCz " + str4);
                    return false;
                }
                int length5 = b.a.class.getDeclaredFields().length;
                String str5 = str4 + "|f" + length5;
                if (length5 != 1) {
                    ex.b("3xu ckHpCz " + str5);
                    return false;
                }
                int length6 = b.c.class.getDeclaredFields().length;
                String str6 = str5 + "|f" + length6;
                if (length6 != 5) {
                    ex.b("3xu ckHpCz " + str6);
                    return false;
                }
                int length7 = b.h.class.getDeclaredFields().length;
                String str7 = str6 + "|f" + length7;
                if (length7 != 4) {
                    ex.b("3xu ckHpCz " + str7);
                    return false;
                }
                int length8 = b.i.class.getDeclaredMethods().length;
                String str8 = str7 + "|m" + length8;
                if (length8 < 2) {
                    ex.b("3xu ckHpCz " + str8);
                    return false;
                }
                int length9 = b.e.class.getDeclaredMethods().length;
                String str9 = str8 + "|m" + length9;
                if (length9 >= 1) {
                    return true;
                }
                ex.b("3xu ckHpCz " + str9);
                return false;
            } catch (Throwable th2) {
                ex.a(th2);
                return false;
            }
        }
    }

    public static class b {

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f36390a;
        }

        /* JADX INFO: renamed from: cn.fly.verify.ew$b$b, reason: collision with other inner class name */
        public static final class C0273b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private transient ClassLoader f36391a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private transient Class<?> f36392b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private transient Object f36393c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private transient Object f36394d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private transient Object[] f36395e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private transient String f36396f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private transient Class<?> f36397g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private transient Object f36398h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private transient long f36399i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private transient long f36400j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private transient long f36401k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private transient int f36402l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private transient int f36403m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private transient int f36404n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private transient int f36405o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private transient int f36406p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private volatile transient int f36407q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private transient int f36408r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private transient int f36409s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private transient int f36410t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private transient int f36411u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private transient int f36412v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private transient int f36413w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private transient int f36414x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private transient short f36415y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            private transient short f36416z;
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private C0273b f36417a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C0273b f36418b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object[] f36419c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f36420d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f36421e;
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f36422a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Member f36423b = null;
        }

        public static class e {
            private e(Object... objArr) {
                throw new IllegalStateException("i2");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Object b(Object... objArr) {
                throw new IllegalStateException("i1");
            }
        }

        public static class f {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private MethodType f36427d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private f f36428e;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final MethodType f36426c = null;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            protected final int f36424a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            protected final long f36425b = 0;
        }

        public static final class g extends f {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final C0273b f36429c = null;
        }

        public static class h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f36430a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f36431b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f36432c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f36433d;
        }

        public static class i {
            /* JADX INFO: Access modifiers changed from: private */
            public static void c() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static void d() {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Object f36434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f36435b;

        public static int a(long j10) throws Throwable {
            return ((Integer) a(f36434a.getClass(), ba.a("006,glZhk!ggGgk"), Long.TYPE).invoke(f36434a, Long.valueOf(j10))).intValue();
        }

        public static long a(Object obj, long j10) throws Throwable {
            return ((Long) a(f36434a.getClass(), ba.a("007ZglBhk)hgfmLgNgl"), Object.class, Long.TYPE).invoke(f36434a, obj, Long.valueOf(j10))).longValue();
        }

        public static long a(Field field) throws Throwable {
            return ((Long) a(f36434a.getClass(), ba.a("0176fmhhjiIhekRiefkFhiRfeijghghhk7hk"), Field.class).invoke(f36434a, field)).longValue();
        }

        private static Method a(Class cls, String str, Class... clsArr) throws Throwable {
            try {
                if (f36435b == null) {
                    f36435b = Class.class.getDeclaredMethod(ba.a("017Ugl>hkKhn@heif!fl?h>feje8hkj)fmfe"), String.class, Class[].class);
                }
                Method method = (Method) f36435b.invoke(cls, str, clsArr);
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            }
        }

        public static void a(Object obj, long j10, long j11) throws Throwable {
            Class<?> cls = f36434a.getClass();
            String strA = ba.a("007l:fi(kAhgfmRg%gl");
            Class cls2 = Long.TYPE;
            a(cls, strA, Object.class, cls2, cls2).invoke(f36434a, obj, Long.valueOf(j10), Long.valueOf(j11));
        }

        public static void a(Object obj, long j10, Object obj2) throws Throwable {
            a(f36434a.getClass(), ba.a("009l4fi)k,ijhhji(hek"), Object.class, Long.TYPE, Object.class).invoke(f36434a, obj, Long.valueOf(j10), obj2);
        }

        public static boolean a() throws Throwable {
            Object objInvoke = a(Class.forName(ba.a("015ThkfiTg6fnfhfkhkXeEfngm1g?hk^f.gh h")), ba.a("009;gl6hk3gmXgBhk4f[gh$h"), new Class[0]).invoke(null, new Object[0]);
            f36434a = objInvoke;
            return objInvoke != null;
        }

        public static Object b(Object obj, long j10) throws Throwable {
            return a(f36434a.getClass(), ba.a("009Lgl[hk4ijhhji^hek"), Object.class, Long.TYPE).invoke(f36434a, obj, Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        try {
            b.f fVar = new b.f();
            String str = ("" + fVar.f36426c + fVar.f36427d + fVar.f36428e + "00") + "" + new b.g().f36429c;
            b.d dVar = new b.d();
            String str2 = str + "" + dVar.f36423b + dVar.f36422a;
            b.C0273b c0273b = new b.C0273b();
            String str3 = (str2 + "" + c0273b.f36391a + c0273b.f36392b + c0273b.f36393c + c0273b.f36394d + Arrays.toString(c0273b.f36395e) + c0273b.f36396f + c0273b.f36397g + c0273b.f36398h + c0273b.f36399i + c0273b.f36400j + c0273b.f36401k + c0273b.f36402l + c0273b.f36403m + c0273b.f36404n + c0273b.f36405o + c0273b.f36406p + c0273b.f36407q + c0273b.f36408r + c0273b.f36409s + c0273b.f36410t + c0273b.f36411u + c0273b.f36412v + c0273b.f36413w + c0273b.f36414x + ((int) c0273b.f36415y) + ((int) c0273b.f36416z)) + "" + new b.a().f36390a;
            b.c cVar = new b.c();
            String str4 = str3 + "" + cVar.f36417a + cVar.f36418b + Arrays.toString(cVar.f36419c) + cVar.f36420d + cVar.f36421e;
            b.h hVar = new b.h();
            String str5 = str4 + "" + hVar.f36432c + hVar.f36433d + b.h.f36430a + b.h.f36431b;
            new b.i();
            b.i.c();
            b.i.d();
            b.e.b(new Object[0]);
            new b.e(new Object[]{str5});
        } catch (Throwable unused) {
        }
    }

    @Override // cn.fly.verify.eu
    public <T> T a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) throws Throwable {
        return (T) a.a((Class<?>) cls, obj, str, objArr);
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str) throws Throwable {
        return (T) a.a(str, new Object[0]);
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, Object obj, String str2, Class[] clsArr, Object[] objArr) throws Throwable {
        return (T) a.a(str, obj, str2, objArr);
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, String str2, Object obj) throws Throwable {
        return (T) a.a(str, str2, obj);
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, Class[] clsArr, Object[] objArr) throws Throwable {
        return (T) a.a(str, objArr);
    }

    public boolean a(Context context) {
        try {
            return a.a();
        } catch (Throwable unused) {
            return false;
        }
    }
}
