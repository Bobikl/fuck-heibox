package com.google.common.escape;

import com.google.common.base.w;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.p;

/* JADX INFO: compiled from: Escapers.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f58262a = new a();

    /* JADX INFO: compiled from: Escapers.java */
    public class a extends d {
        a() {
        }

        @Override // com.google.common.escape.d, com.google.common.escape.h
        public String b(String str) {
            return (String) w.E(str);
        }

        @Override // com.google.common.escape.d
        @CheckForNull
        protected char[] c(char c10) {
            return null;
        }
    }

    /* JADX INFO: compiled from: Escapers.java */
    public class b extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f58263c;

        b(d dVar) {
            this.f58263c = dVar;
        }

        @Override // com.google.common.escape.l
        @CheckForNull
        protected char[] d(int i10) {
            if (i10 < 65536) {
                return this.f58263c.c((char) i10);
            }
            char[] cArr = new char[2];
            Character.toChars(i10, cArr, 0);
            char[] cArrC = this.f58263c.c(cArr[0]);
            char[] cArrC2 = this.f58263c.c(cArr[1]);
            if (cArrC == null && cArrC2 == null) {
                return null;
            }
            int length = cArrC != null ? cArrC.length : 1;
            char[] cArr2 = new char[(cArrC2 != null ? cArrC2.length : 1) + length];
            if (cArrC != null) {
                for (int i11 = 0; i11 < cArrC.length; i11++) {
                    cArr2[i11] = cArrC[i11];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (cArrC2 != null) {
                for (int i12 = 0; i12 < cArrC2.length; i12++) {
                    cArr2[length + i12] = cArrC2[i12];
                }
            } else {
                cArr2[length] = cArr[1];
            }
            return cArr2;
        }
    }

    /* JADX INFO: compiled from: Escapers.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Character, String> f58264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private char f58265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private char f58266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private String f58267d;

        /* JADX INFO: compiled from: Escapers.java */
        public class a extends com.google.common.escape.a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @CheckForNull
            private final char[] f58268g;

            a(Map map, char c10, char c11) {
                super((Map<Character, String>) map, c10, c11);
                this.f58268g = c.this.f58267d != null ? c.this.f58267d.toCharArray() : null;
            }

            @Override // com.google.common.escape.a
            @CheckForNull
            protected char[] f(char c10) {
                return this.f58268g;
            }
        }

        private c() {
            this.f58264a = new HashMap();
            this.f58265b = (char) 0;
            this.f58266c = p.f124952c;
            this.f58267d = null;
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @s9.a
        public c b(char c10, String str) {
            w.E(str);
            this.f58264a.put(Character.valueOf(c10), str);
            return this;
        }

        public h c() {
            return new a(this.f58264a, this.f58265b, this.f58266c);
        }

        @s9.a
        public c d(char c10, char c11) {
            this.f58265b = c10;
            this.f58266c = c11;
            return this;
        }

        @s9.a
        public c e(String str) {
            this.f58267d = str;
            return this;
        }
    }

    private i() {
    }

    static l a(h hVar) {
        w.E(hVar);
        if (hVar instanceof l) {
            return (l) hVar;
        }
        if (hVar instanceof d) {
            return g((d) hVar);
        }
        String name = hVar.getClass().getName();
        throw new IllegalArgumentException(name.length() != 0 ? "Cannot create a UnicodeEscaper from: ".concat(name) : new String("Cannot create a UnicodeEscaper from: "));
    }

    public static c b() {
        return new c(null);
    }

    @CheckForNull
    public static String c(d dVar, char c10) {
        return f(dVar.c(c10));
    }

    @CheckForNull
    public static String d(l lVar, int i10) {
        return f(lVar.d(i10));
    }

    public static h e() {
        return f58262a;
    }

    @CheckForNull
    private static String f(@CheckForNull char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    private static l g(d dVar) {
        return new b(dVar);
    }
}
