package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.p0;
import androidx.annotation.r0;
import androidx.annotation.w0;
import java.util.ArrayList;

/* JADX INFO: compiled from: BundleCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: compiled from: BundleCompat.java */
    @w0(33)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static <T> T a(@androidx.annotation.n0 Bundle bundle, @p0 String str, @androidx.annotation.n0 Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        @androidx.annotation.u
        static <T> T[] b(@androidx.annotation.n0 Bundle bundle, @p0 String str, @androidx.annotation.n0 Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        @androidx.annotation.u
        static <T> ArrayList<T> c(@androidx.annotation.n0 Bundle bundle, @p0 String str, @androidx.annotation.n0 Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        @androidx.annotation.u
        static <T> SparseArray<T> d(@androidx.annotation.n0 Bundle bundle, @p0 String str, @androidx.annotation.n0 Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    private d() {
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @p0
    public static <T> T a(@androidx.annotation.n0 Bundle bundle, @p0 String str, @androidx.annotation.n0 Class<T> cls) {
        if (androidx.core.os.a.l()) {
            return (T) a.a(bundle, str, cls);
        }
        T t10 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @p0
    public static Parcelable[] b(@androidx.annotation.n0 Bundle bundle, @p0 String str, @androidx.annotation.n0 Class<? extends Parcelable> cls) {
        return androidx.core.os.a.l() ? (Parcelable[]) a.b(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @p0
    public static <T> ArrayList<T> c(@androidx.annotation.n0 Bundle bundle, @p0 String str, @androidx.annotation.n0 Class<? extends T> cls) {
        return androidx.core.os.a.l() ? a.c(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @p0
    public static <T> SparseArray<T> d(@androidx.annotation.n0 Bundle bundle, @p0 String str, @androidx.annotation.n0 Class<? extends T> cls) {
        return androidx.core.os.a.l() ? a.d(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }
}
