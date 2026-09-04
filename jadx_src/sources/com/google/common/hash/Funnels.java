package com.google.common.hash;

import com.google.common.base.w;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@h
@o9.a
public final class Funnels {

    public enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(byte[] bArr, u uVar) {
            uVar.e(bArr);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    public enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(Integer num, u uVar) {
            uVar.c(num.intValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    public enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(Long l10, u uVar) {
            uVar.d(l10.longValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    public static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Funnel<E> f58467b;

        SequentialFunnel(Funnel<E> funnel) {
            this.f58467b = (Funnel) w.E(funnel);
        }

        @Override // com.google.common.hash.Funnel
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void funnel(Iterable<? extends E> iterable, u uVar) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                this.f58467b.funnel(it.next(), uVar);
            }
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SequentialFunnel) {
                return this.f58467b.equals(((SequentialFunnel) obj).f58467b);
            }
            return false;
        }

        public int hashCode() {
            return SequentialFunnel.class.hashCode() ^ this.f58467b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f58467b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 26);
            sb2.append("Funnels.sequentialFunnel(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Charset f58468b;

        public static class SerializedForm implements Serializable {
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f58469b;

            SerializedForm(Charset charset) {
                this.f58469b = charset.name();
            }

            private Object a() {
                return Funnels.f(Charset.forName(this.f58469b));
            }
        }

        StringCharsetFunnel(Charset charset) {
            this.f58468b = (Charset) w.E(charset);
        }

        @Override // com.google.common.hash.Funnel
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void funnel(CharSequence charSequence, u uVar) {
            uVar.m(charSequence, this.f58468b);
        }

        Object b() {
            return new SerializedForm(this.f58468b);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.f58468b.equals(((StringCharsetFunnel) obj).f58468b);
            }
            return false;
        }

        public int hashCode() {
            return StringCharsetFunnel.class.hashCode() ^ this.f58468b.hashCode();
        }

        public String toString() {
            String strName = this.f58468b.name();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strName).length() + 22);
            sb2.append("Funnels.stringFunnel(");
            sb2.append(strName);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, u uVar) {
            uVar.j(charSequence);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    public static class a extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final u f58470b;

        a(u uVar) {
            this.f58470b = (u) w.E(uVar);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f58470b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("Funnels.asOutputStream(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f58470b.b((byte) i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f58470b.e(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f58470b.k(bArr, i10, i11);
        }
    }

    private Funnels() {
    }

    public static OutputStream a(u uVar) {
        return new a(uVar);
    }

    public static Funnel<byte[]> b() {
        return ByteArrayFunnel.INSTANCE;
    }

    public static Funnel<Integer> c() {
        return IntegerFunnel.INSTANCE;
    }

    public static Funnel<Long> d() {
        return LongFunnel.INSTANCE;
    }

    public static <E> Funnel<Iterable<? extends E>> e(Funnel<E> funnel) {
        return new SequentialFunnel(funnel);
    }

    public static Funnel<CharSequence> f(Charset charset) {
        return new StringCharsetFunnel(charset);
    }

    public static Funnel<CharSequence> g() {
        return UnencodedCharsFunnel.INSTANCE;
    }
}
