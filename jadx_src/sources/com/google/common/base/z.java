package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Splitter.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@com.google.common.base.g
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.b f56768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f56769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f56770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f56771d;

    /* JADX INFO: compiled from: Splitter.java */
    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.b f56772a;

        /* JADX INFO: renamed from: com.google.common.base.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Splitter.java */
        public class C0443a extends g {
            C0443a(z zVar, CharSequence charSequence) {
                super(zVar, charSequence);
            }

            @Override // com.google.common.base.z.g
            int e(int i10) {
                return i10 + 1;
            }

            @Override // com.google.common.base.z.g
            int f(int i10) {
                return a.this.f56772a.o(this.f56785d, i10);
            }
        }

        a(com.google.common.base.b bVar) {
            this.f56772a = bVar;
        }

        @Override // com.google.common.base.z.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(z zVar, CharSequence charSequence) {
            return new C0443a(zVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f56774a;

        /* JADX INFO: compiled from: Splitter.java */
        public class a extends g {
            a(z zVar, CharSequence charSequence) {
                super(zVar, charSequence);
            }

            @Override // com.google.common.base.z.g
            public int e(int i10) {
                return i10 + b.this.f56774a.length();
            }

            @Override // com.google.common.base.z.g
            public int f(int i10) {
                int length = b.this.f56774a.length();
                int length2 = this.f56785d.length() - length;
                while (i10 <= length2) {
                    for (int i11 = 0; i11 < length; i11++) {
                        if (this.f56785d.charAt(i11 + i10) != b.this.f56774a.charAt(i11)) {
                            i10++;
                        }
                    }
                    return i10;
                }
                return -1;
            }
        }

        b(String str) {
            this.f56774a = str;
        }

        @Override // com.google.common.base.z.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(z zVar, CharSequence charSequence) {
            return new a(zVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.e f56776a;

        /* JADX INFO: compiled from: Splitter.java */
        public class a extends g {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ com.google.common.base.d f56777i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, z zVar, CharSequence charSequence, com.google.common.base.d dVar) {
                super(zVar, charSequence);
                this.f56777i = dVar;
            }

            @Override // com.google.common.base.z.g
            public int e(int i10) {
                return this.f56777i.a();
            }

            @Override // com.google.common.base.z.g
            public int f(int i10) {
                if (this.f56777i.c(i10)) {
                    return this.f56777i.f();
                }
                return -1;
            }
        }

        c(com.google.common.base.e eVar) {
            this.f56776a = eVar;
        }

        @Override // com.google.common.base.z.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(z zVar, CharSequence charSequence) {
            return new a(this, zVar, charSequence, this.f56776a.d(charSequence));
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f56778a;

        /* JADX INFO: compiled from: Splitter.java */
        public class a extends g {
            a(z zVar, CharSequence charSequence) {
                super(zVar, charSequence);
            }

            @Override // com.google.common.base.z.g
            public int e(int i10) {
                return i10;
            }

            @Override // com.google.common.base.z.g
            public int f(int i10) {
                int i11 = i10 + d.this.f56778a;
                if (i11 < this.f56785d.length()) {
                    return i11;
                }
                return -1;
            }
        }

        d(int i10) {
            this.f56778a = i10;
        }

        @Override // com.google.common.base.z.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(z zVar, CharSequence charSequence) {
            return new a(zVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public class e implements Iterable<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f56780b;

        e(CharSequence charSequence) {
            this.f56780b = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return z.this.p(this.f56780b);
        }

        public String toString() {
            p pVarP = p.p(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder sbF = pVarP.f(sb2, this);
            sbF.append(']');
            return sbF.toString();
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    @o9.a
    public static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f56782c = "Chunk [%s] is not a valid entry";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z f56783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z f56784b;

        private f(z zVar, z zVar2) {
            this.f56783a = zVar;
            this.f56784b = (z) w.E(zVar2);
        }

        /* synthetic */ f(z zVar, z zVar2, a aVar) {
            this(zVar, zVar2);
        }

        public Map<String, String> a(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f56783a.n(charSequence)) {
                Iterator itP = this.f56784b.p(str);
                w.u(itP.hasNext(), f56782c, str);
                String str2 = (String) itP.next();
                w.u(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                w.u(itP.hasNext(), f56782c, str);
                linkedHashMap.put(str2, (String) itP.next());
                w.u(!itP.hasNext(), f56782c, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public static abstract class g extends AbstractIterator<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final CharSequence f56785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.b f56786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f56787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f56788g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f56789h;

        protected g(z zVar, CharSequence charSequence) {
            this.f56786e = zVar.f56768a;
            this.f56787f = zVar.f56769b;
            this.f56789h = zVar.f56771d;
            this.f56785d = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i10 = this.f56788g;
            while (true) {
                int i11 = this.f56788g;
                if (i11 == -1) {
                    return b();
                }
                int iF = f(i11);
                if (iF == -1) {
                    iF = this.f56785d.length();
                    this.f56788g = -1;
                } else {
                    this.f56788g = e(iF);
                }
                int i12 = this.f56788g;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f56788g = i13;
                    if (i13 > this.f56785d.length()) {
                        this.f56788g = -1;
                    }
                } else {
                    while (i10 < iF && this.f56786e.B(this.f56785d.charAt(i10))) {
                        i10++;
                    }
                    while (iF > i10 && this.f56786e.B(this.f56785d.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.f56787f || i10 != iF) {
                        int i14 = this.f56789h;
                        if (i14 == 1) {
                            iF = this.f56785d.length();
                            this.f56788g = -1;
                            while (iF > i10 && this.f56786e.B(this.f56785d.charAt(iF - 1))) {
                                iF--;
                            }
                        } else {
                            this.f56789h = i14 - 1;
                        }
                        return this.f56785d.subSequence(i10, iF).toString();
                    }
                    i10 = this.f56788g;
                }
            }
        }

        abstract int e(int i10);

        abstract int f(int i10);
    }

    /* JADX INFO: compiled from: Splitter.java */
    public interface h {
        Iterator<String> a(z zVar, CharSequence charSequence);
    }

    private z(h hVar) {
        this(hVar, false, com.google.common.base.b.G(), Integer.MAX_VALUE);
    }

    private z(h hVar, boolean z10, com.google.common.base.b bVar, int i10) {
        this.f56770c = hVar;
        this.f56769b = z10;
        this.f56768a = bVar;
        this.f56771d = i10;
    }

    public static z e(int i10) {
        w.e(i10 > 0, "The length may not be less than 1");
        return new z(new d(i10));
    }

    public static z h(char c10) {
        return i(com.google.common.base.b.q(c10));
    }

    public static z i(com.google.common.base.b bVar) {
        w.E(bVar);
        return new z(new a(bVar));
    }

    private static z j(com.google.common.base.e eVar) {
        w.u(!eVar.d("").d(), "The pattern may not match the empty string: %s", eVar);
        return new z(new c(eVar));
    }

    public static z k(String str) {
        w.e(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? h(str.charAt(0)) : new z(new b(str));
    }

    @o9.c
    public static z l(Pattern pattern) {
        return j(new JdkPattern(pattern));
    }

    @o9.c
    public static z m(String str) {
        return j(v.b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> p(CharSequence charSequence) {
        return this.f56770c.a(this, charSequence);
    }

    public z f(int i10) {
        w.k(i10 > 0, "must be greater than zero: %s", i10);
        return new z(this.f56770c, this.f56769b, this.f56768a, i10);
    }

    public z g() {
        return new z(this.f56770c, true, this.f56768a, this.f56771d);
    }

    public Iterable<String> n(CharSequence charSequence) {
        w.E(charSequence);
        return new e(charSequence);
    }

    public List<String> o(CharSequence charSequence) {
        w.E(charSequence);
        Iterator<String> itP = p(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itP.hasNext()) {
            arrayList.add(itP.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public z q() {
        return r(com.google.common.base.b.X());
    }

    public z r(com.google.common.base.b bVar) {
        w.E(bVar);
        return new z(this.f56770c, this.f56769b, bVar, this.f56771d);
    }

    @o9.a
    public f s(char c10) {
        return t(h(c10));
    }

    @o9.a
    public f t(z zVar) {
        return new f(this, zVar, null);
    }

    @o9.a
    public f u(String str) {
        return t(k(str));
    }
}
