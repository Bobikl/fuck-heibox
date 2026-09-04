package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Joiner.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56742a;

    /* JADX INFO: compiled from: Joiner.java */
    public class a extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f56743b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, String str) {
            super(pVar, null);
            this.f56743b = str;
        }

        @Override // com.google.common.base.p
        public p q() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // com.google.common.base.p
        CharSequence r(@CheckForNull Object obj) {
            return obj == null ? this.f56743b : p.this.r(obj);
        }

        @Override // com.google.common.base.p
        public p s(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* JADX INFO: compiled from: Joiner.java */
    public class b extends p {
        b(p pVar) {
            super(pVar, null);
        }

        @Override // com.google.common.base.p
        public <A extends Appendable> A d(A a10, Iterator<? extends Object> it) throws IOException {
            w.F(a10, "appendable");
            w.F(it, "parts");
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    a10.append(p.this.r(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a10.append(p.this.f56742a);
                    a10.append(p.this.r(next2));
                }
            }
            return a10;
        }

        @Override // com.google.common.base.p
        public p s(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // com.google.common.base.p
        public d u(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* JADX INFO: compiled from: Joiner.java */
    public class c extends AbstractList<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f56746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f56747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f56748d;

        c(Object[] objArr, Object obj, Object obj2) {
            this.f56746b = objArr;
            this.f56747c = obj;
            this.f56748d = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        @CheckForNull
        public Object get(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? this.f56746b[i10 - 2] : this.f56748d;
            }
            return this.f56747c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f56746b.length + 2;
        }
    }

    /* JADX INFO: compiled from: Joiner.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f56749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f56750b;

        private d(p pVar, String str) {
            this.f56749a = pVar;
            this.f56750b = (String) w.E(str);
        }

        /* synthetic */ d(p pVar, String str, a aVar) {
            this(pVar, str);
        }

        @o9.a
        @s9.a
        public <A extends Appendable> A a(A a10, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) b(a10, iterable.iterator());
        }

        @o9.a
        @s9.a
        public <A extends Appendable> A b(A a10, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            w.E(a10);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a10.append(this.f56749a.r(next.getKey()));
                a10.append(this.f56750b);
                a10.append(this.f56749a.r(next.getValue()));
                while (it.hasNext()) {
                    a10.append(this.f56749a.f56742a);
                    Map.Entry<?, ?> next2 = it.next();
                    a10.append(this.f56749a.r(next2.getKey()));
                    a10.append(this.f56750b);
                    a10.append(this.f56749a.r(next2.getValue()));
                }
            }
            return a10;
        }

        @s9.a
        public <A extends Appendable> A c(A a10, Map<?, ?> map) throws IOException {
            return (A) a(a10, map.entrySet());
        }

        @o9.a
        @s9.a
        public StringBuilder d(StringBuilder sb2, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return e(sb2, iterable.iterator());
        }

        @o9.a
        @s9.a
        public StringBuilder e(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                b(sb2, it);
                return sb2;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @s9.a
        public StringBuilder f(StringBuilder sb2, Map<?, ?> map) {
            return d(sb2, map.entrySet());
        }

        @o9.a
        public String g(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return h(iterable.iterator());
        }

        @o9.a
        public String h(Iterator<? extends Map.Entry<?, ?>> it) {
            return e(new StringBuilder(), it).toString();
        }

        public String i(Map<?, ?> map) {
            return g(map.entrySet());
        }

        public d j(String str) {
            return new d(this.f56749a.s(str), this.f56750b);
        }
    }

    private p(p pVar) {
        this.f56742a = pVar.f56742a;
    }

    /* synthetic */ p(p pVar, a aVar) {
        this(pVar);
    }

    private p(String str) {
        this.f56742a = (String) w.E(str);
    }

    private static Iterable<Object> j(@CheckForNull Object obj, @CheckForNull Object obj2, Object[] objArr) {
        w.E(objArr);
        return new c(objArr, obj, obj2);
    }

    public static p o(char c10) {
        return new p(String.valueOf(c10));
    }

    public static p p(String str) {
        return new p(str);
    }

    @s9.a
    public <A extends Appendable> A b(A a10, Iterable<? extends Object> iterable) throws IOException {
        return (A) d(a10, iterable.iterator());
    }

    @s9.a
    public final <A extends Appendable> A c(A a10, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) throws IOException {
        return (A) b(a10, j(obj, obj2, objArr));
    }

    @s9.a
    public <A extends Appendable> A d(A a10, Iterator<? extends Object> it) throws IOException {
        w.E(a10);
        if (it.hasNext()) {
            a10.append(r(it.next()));
            while (it.hasNext()) {
                a10.append(this.f56742a);
                a10.append(r(it.next()));
            }
        }
        return a10;
    }

    @s9.a
    public final <A extends Appendable> A e(A a10, Object[] objArr) throws IOException {
        return (A) b(a10, Arrays.asList(objArr));
    }

    @s9.a
    public final StringBuilder f(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return h(sb2, iterable.iterator());
    }

    @s9.a
    public final StringBuilder g(StringBuilder sb2, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return f(sb2, j(obj, obj2, objArr));
    }

    @s9.a
    public final StringBuilder h(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            d(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @s9.a
    public final StringBuilder i(StringBuilder sb2, Object[] objArr) {
        return f(sb2, Arrays.asList(objArr));
    }

    public final String k(Iterable<? extends Object> iterable) {
        return m(iterable.iterator());
    }

    public final String l(@CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return k(j(obj, obj2, objArr));
    }

    public final String m(Iterator<? extends Object> it) {
        return h(new StringBuilder(), it).toString();
    }

    public final String n(Object[] objArr) {
        return k(Arrays.asList(objArr));
    }

    public p q() {
        return new b(this);
    }

    CharSequence r(@CheckForNull Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public p s(String str) {
        w.E(str);
        return new a(this, str);
    }

    public d t(char c10) {
        return u(String.valueOf(c10));
    }

    public d u(String str) {
        return new d(this, str, null);
    }
}
