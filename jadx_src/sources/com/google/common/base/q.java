package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MoreObjects.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class q {

    /* JADX INFO: compiled from: MoreObjects.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f56751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0442b f56752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0442b f56753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f56754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f56755e;

        /* JADX INFO: compiled from: MoreObjects.java */
        public static final class a extends C0442b {
            private a() {
                super();
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.q$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MoreObjects.java */
        public static class C0442b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @CheckForNull
            String f56756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @CheckForNull
            Object f56757b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @CheckForNull
            C0442b f56758c;

            private C0442b() {
            }
        }

        private b(String str) {
            C0442b c0442b = new C0442b();
            this.f56752b = c0442b;
            this.f56753c = c0442b;
            this.f56754d = false;
            this.f56755e = false;
            this.f56751a = (String) w.E(str);
        }

        private C0442b h() {
            C0442b c0442b = new C0442b();
            this.f56753c.f56758c = c0442b;
            this.f56753c = c0442b;
            return c0442b;
        }

        private b i(@CheckForNull Object obj) {
            h().f56757b = obj;
            return this;
        }

        private b j(String str, @CheckForNull Object obj) {
            C0442b c0442bH = h();
            c0442bH.f56757b = obj;
            c0442bH.f56756a = (String) w.E(str);
            return this;
        }

        private a k() {
            a aVar = new a();
            this.f56753c.f56758c = aVar;
            this.f56753c = aVar;
            return aVar;
        }

        private b l(Object obj) {
            k().f56757b = obj;
            return this;
        }

        private b m(String str, Object obj) {
            a aVarK = k();
            aVarK.f56757b = obj;
            aVarK.f56756a = (String) w.E(str);
            return this;
        }

        private static boolean u(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Optional) {
                return !((Optional) obj).e();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        @s9.a
        public b a(String str, char c10) {
            return m(str, String.valueOf(c10));
        }

        @s9.a
        public b b(String str, double d10) {
            return m(str, String.valueOf(d10));
        }

        @s9.a
        public b c(String str, float f10) {
            return m(str, String.valueOf(f10));
        }

        @s9.a
        public b d(String str, int i10) {
            return m(str, String.valueOf(i10));
        }

        @s9.a
        public b e(String str, long j10) {
            return m(str, String.valueOf(j10));
        }

        @s9.a
        public b f(String str, @CheckForNull Object obj) {
            return j(str, obj);
        }

        @s9.a
        public b g(String str, boolean z10) {
            return m(str, String.valueOf(z10));
        }

        @s9.a
        public b n(char c10) {
            return l(String.valueOf(c10));
        }

        @s9.a
        public b o(double d10) {
            return l(String.valueOf(d10));
        }

        @s9.a
        public b p(float f10) {
            return l(String.valueOf(f10));
        }

        @s9.a
        public b q(int i10) {
            return l(String.valueOf(i10));
        }

        @s9.a
        public b r(long j10) {
            return l(String.valueOf(j10));
        }

        @s9.a
        public b s(@CheckForNull Object obj) {
            return i(obj);
        }

        @s9.a
        public b t(boolean z10) {
            return l(String.valueOf(z10));
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005e  */
        public String toString() {
            String str;
            boolean z10 = this.f56754d;
            boolean z11 = this.f56755e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f56751a);
            sb2.append('{');
            String str2 = "";
            for (C0442b c0442b = this.f56752b.f56758c; c0442b != null; c0442b = c0442b.f56758c) {
                Object obj = c0442b.f56757b;
                if (c0442b instanceof a) {
                    sb2.append(str2);
                    str = c0442b.f56756a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append(n5.a.f132013h);
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = c0442b.f56756a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append(n5.a.f132013h);
                        }
                        if (obj == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z11 || !u(obj)) {
                    sb2.append(str2);
                    str = c0442b.f56756a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append(n5.a.f132013h);
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        @s9.a
        public b v() {
            this.f56754d = true;
            return this;
        }
    }

    private q() {
    }

    public static <T> T a(@CheckForNull T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }

    public static b d(String str) {
        return new b(str);
    }
}
