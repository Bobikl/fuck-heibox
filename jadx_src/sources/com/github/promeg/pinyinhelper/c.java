package com.github.promeg.pinyinhelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Pinyin.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static org.ahocorasick.trie.f f43471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static j f43472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static List<h> f43473c;

    /* JADX INFO: compiled from: Pinyin.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        j f43474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<h> f43475b;

        private b(List<h> list) {
            if (list != null) {
                this.f43475b = new ArrayList(list);
            }
            this.f43474a = new com.github.promeg.pinyinhelper.b();
        }

        List<h> a() {
            return this.f43475b;
        }

        j b() {
            return this.f43474a;
        }

        boolean c() {
            return (a() == null || b() == null) ? false : true;
        }

        public b d(h hVar) {
            if (hVar != null) {
                List<h> list = this.f43475b;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f43475b = arrayList;
                    arrayList.add(hVar);
                } else if (!list.contains(hVar)) {
                    this.f43475b.add(hVar);
                }
            }
            return this;
        }
    }

    private c() {
    }

    public static void a(h hVar) {
        if (hVar == null || hVar.a() == null || hVar.a().size() == 0) {
            return;
        }
        d(new b(f43473c).d(hVar));
    }

    private static short b(byte[] bArr, byte[] bArr2, int i10) {
        int i11 = i10 % 8;
        short s10 = (short) (bArr2[i10] & 255);
        return (bArr[i10 / 8] & g.f43488g[i11]) != 0 ? (short) (s10 | 256) : s10;
    }

    private static int c(char c10) {
        int i10 = c10 - 19968;
        if (i10 < 0 || i10 >= 7000) {
            return (7000 > i10 || i10 >= 14000) ? b(f.f43480a, f.f43481b, i10 - 14000) : b(e.f43478a, e.f43479b, i10 - 7000);
        }
        return b(d.f43476a, d.f43477b, i10);
    }

    public static void d(b bVar) {
        if (bVar == null) {
            f43473c = null;
            f43471a = null;
            f43472b = null;
        } else if (bVar.c()) {
            f43473c = Collections.unmodifiableList(bVar.a());
            f43471a = k.a(bVar.a());
            f43472b = bVar.b();
        }
    }

    public static boolean e(char c10) {
        return (19968 <= c10 && c10 <= 40869 && c(c10) > 0) || 12295 == c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b f() {
        return new b(null);
    }

    public static String g(char c10) {
        if (e(c10)) {
            return c10 == 12295 ? "LING" : g.f43490i[c(c10)];
        }
        return String.valueOf(c10);
    }

    public static String h(String str, String str2) {
        return com.github.promeg.pinyinhelper.a.b(str, f43471a, f43473c, str2, f43472b);
    }
}
