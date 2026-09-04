package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public abstract class Converter<A, B> implements n<A, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f56587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient Converter<B, A> f56588c;

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Converter<A, B> f56589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Converter<B, C> f56590e;

        ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.f56589d = converter;
            this.f56590e = converter2;
        }

        @Override // com.google.common.base.Converter
        @CheckForNull
        A d(@CheckForNull C c10) {
            return (A) this.f56589d.d(this.f56590e.d(c10));
        }

        @Override // com.google.common.base.Converter, com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ConverterComposition)) {
                return false;
            }
            ConverterComposition converterComposition = (ConverterComposition) obj;
            return this.f56589d.equals(converterComposition.f56589d) && this.f56590e.equals(converterComposition.f56590e);
        }

        @Override // com.google.common.base.Converter
        @CheckForNull
        C f(@CheckForNull A a10) {
            return (C) this.f56590e.f(this.f56589d.f(a10));
        }

        @Override // com.google.common.base.Converter
        protected A h(C c10) {
            throw new AssertionError();
        }

        public int hashCode() {
            return (this.f56589d.hashCode() * 31) + this.f56590e.hashCode();
        }

        @Override // com.google.common.base.Converter
        protected C i(A a10) {
            throw new AssertionError();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56589d);
            String strValueOf2 = String.valueOf(this.f56590e);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(".andThen(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final n<? super A, ? extends B> f56591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final n<? super B, ? extends A> f56592e;

        private FunctionBasedConverter(n<? super A, ? extends B> nVar, n<? super B, ? extends A> nVar2) {
            this.f56591d = (n) w.E(nVar);
            this.f56592e = (n) w.E(nVar2);
        }

        /* synthetic */ FunctionBasedConverter(n nVar, n nVar2, a aVar) {
            this(nVar, nVar2);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof FunctionBasedConverter)) {
                return false;
            }
            FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
            return this.f56591d.equals(functionBasedConverter.f56591d) && this.f56592e.equals(functionBasedConverter.f56592e);
        }

        @Override // com.google.common.base.Converter
        protected A h(B b10) {
            return this.f56592e.apply(b10);
        }

        public int hashCode() {
            return (this.f56591d.hashCode() * 31) + this.f56592e.hashCode();
        }

        @Override // com.google.common.base.Converter
        protected B i(A a10) {
            return this.f56591d.apply(a10);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56591d);
            String strValueOf2 = String.valueOf(this.f56592e);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18 + strValueOf2.length());
            sb2.append("Converter.from(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final IdentityConverter<?> f56593d = new IdentityConverter<>();
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object o() {
            return f56593d;
        }

        @Override // com.google.common.base.Converter
        <S> Converter<T, S> g(Converter<T, S> converter) {
            return (Converter) w.F(converter, "otherConverter");
        }

        @Override // com.google.common.base.Converter
        protected T h(T t10) {
            return t10;
        }

        @Override // com.google.common.base.Converter
        protected T i(T t10) {
            return t10;
        }

        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public IdentityConverter<T> l() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Converter<A, B> f56594d;

        ReverseConverter(Converter<A, B> converter) {
            this.f56594d = converter;
        }

        @Override // com.google.common.base.Converter
        @CheckForNull
        B d(@CheckForNull A a10) {
            return this.f56594d.f(a10);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.f56594d.equals(((ReverseConverter) obj).f56594d);
            }
            return false;
        }

        @Override // com.google.common.base.Converter
        @CheckForNull
        A f(@CheckForNull B b10) {
            return this.f56594d.d(b10);
        }

        @Override // com.google.common.base.Converter
        protected B h(A a10) {
            throw new AssertionError();
        }

        public int hashCode() {
            return ~this.f56594d.hashCode();
        }

        @Override // com.google.common.base.Converter
        protected A i(B b10) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> l() {
            return this.f56594d;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56594d);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10);
            sb2.append(strValueOf);
            sb2.append(".reverse()");
            return sb2.toString();
        }
    }

    public class a implements Iterable<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f56595b;

        /* JADX INFO: renamed from: com.google.common.base.Converter$a$a, reason: collision with other inner class name */
        public class C0439a implements Iterator<B> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Iterator<? extends A> f56597b;

            C0439a() {
                this.f56597b = a.this.f56595b.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f56597b.hasNext();
            }

            @Override // java.util.Iterator
            @CheckForNull
            public B next() {
                return (B) Converter.this.b(this.f56597b.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f56597b.remove();
            }
        }

        a(Iterable iterable) {
            this.f56595b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C0439a();
        }
    }

    protected Converter() {
        this(true);
    }

    Converter(boolean z10) {
        this.f56587b = z10;
    }

    public static <A, B> Converter<A, B> j(n<? super A, ? extends B> nVar, n<? super B, ? extends A> nVar2) {
        return new FunctionBasedConverter(nVar, nVar2, null);
    }

    public static <T> Converter<T, T> k() {
        return IdentityConverter.f56593d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    private A m(@CheckForNull B b10) {
        return (A) h(r.a(b10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    private B n(@CheckForNull A a10) {
        return (B) i(r.a(a10));
    }

    public final <C> Converter<A, C> a(Converter<B, C> converter) {
        return g(converter);
    }

    @Override // com.google.common.base.n
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.l(replacement = "this.convert(a)")
    public final B apply(@CheckForNull A a10) {
        return b(a10);
    }

    @s9.a
    @CheckForNull
    public final B b(@CheckForNull A a10) {
        return f(a10);
    }

    @s9.a
    public Iterable<B> c(Iterable<? extends A> iterable) {
        w.F(iterable, "fromIterable");
        return new a(iterable);
    }

    @CheckForNull
    A d(@CheckForNull B b10) {
        if (!this.f56587b) {
            return m(b10);
        }
        if (b10 == null) {
            return null;
        }
        return (A) w.E(h(b10));
    }

    @Override // com.google.common.base.n
    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @CheckForNull
    B f(@CheckForNull A a10) {
        if (!this.f56587b) {
            return n(a10);
        }
        if (a10 == null) {
            return null;
        }
        return (B) w.E(i(a10));
    }

    <C> Converter<A, C> g(Converter<B, C> converter) {
        return new ConverterComposition(this, (Converter) w.E(converter));
    }

    @s9.g
    protected abstract A h(B b10);

    @s9.g
    protected abstract B i(A a10);

    @s9.b
    public Converter<B, A> l() {
        Converter<B, A> converter = this.f56588c;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.f56588c = reverseConverter;
        return reverseConverter;
    }
}
