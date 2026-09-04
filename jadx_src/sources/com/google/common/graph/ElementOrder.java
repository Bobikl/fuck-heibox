package com.google.common.graph;

import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@s9.j
@o9.a
@t
public final class ElementOrder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f58305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private final Comparator<T> f58306b;

    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58307a;

        static {
            int[] iArr = new int[Type.values().length];
            f58307a = iArr;
            try {
                iArr[Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58307a[Type.INSERTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58307a[Type.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58307a[Type.SORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private ElementOrder(Type type, @CheckForNull Comparator<T> comparator) {
        this.f58305a = (Type) com.google.common.base.w.E(type);
        this.f58306b = comparator;
        com.google.common.base.w.g0((type == Type.SORTED) == (comparator != null));
    }

    public static <S> ElementOrder<S> d() {
        return new ElementOrder<>(Type.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> ElementOrder<S> e() {
        return new ElementOrder<>(Type.SORTED, Ordering.z());
    }

    public static <S> ElementOrder<S> f(Comparator<S> comparator) {
        return new ElementOrder<>(Type.SORTED, (Comparator) com.google.common.base.w.E(comparator));
    }

    public static <S> ElementOrder<S> g() {
        return new ElementOrder<>(Type.STABLE, null);
    }

    public static <S> ElementOrder<S> i() {
        return new ElementOrder<>(Type.UNORDERED, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T1 extends T> ElementOrder<T1> a() {
        return this;
    }

    public Comparator<T> b() {
        Comparator<T> comparator = this.f58306b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    <K extends T, V> Map<K, V> c(int i10) {
        int i11 = a.f58307a[this.f58305a.ordinal()];
        if (i11 == 1) {
            return Maps.a0(i10);
        }
        if (i11 == 2 || i11 == 3) {
            return Maps.e0(i10);
        }
        if (i11 == 4) {
            return Maps.g0(b());
        }
        throw new AssertionError();
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        ElementOrder elementOrder = (ElementOrder) obj;
        return this.f58305a == elementOrder.f58305a && com.google.common.base.s.a(this.f58306b, elementOrder.f58306b);
    }

    public Type h() {
        return this.f58305a;
    }

    public int hashCode() {
        return com.google.common.base.s.b(this.f58305a, this.f58306b);
    }

    public String toString() {
        com.google.common.base.q.b bVarF = com.google.common.base.q.c(this).f("type", this.f58305a);
        Comparator<T> comparator = this.f58306b;
        if (comparator != null) {
            bVarF.f("comparator", comparator);
        }
        return bVarF.toString();
    }
}
