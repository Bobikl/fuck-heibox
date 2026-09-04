package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.p0;
import androidx.annotation.r0;
import androidx.annotation.w0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ParcelCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: compiled from: ParcelCompat.java */
    @w0(29)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static <T extends Parcelable> List<T> a(@androidx.annotation.n0 Parcel parcel, @androidx.annotation.n0 List<T> list, @p0 ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }
    }

    /* JADX INFO: compiled from: ParcelCompat.java */
    @w0(30)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static Parcelable.Creator<?> a(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    /* JADX INFO: compiled from: ParcelCompat.java */
    @w0(33)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static <T> T[] a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        @androidx.annotation.u
        static <T> ArrayList<T> b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        @androidx.annotation.u
        static <V, K> HashMap<K, V> c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        @androidx.annotation.u
        static <T> void d(@androidx.annotation.n0 Parcel parcel, @androidx.annotation.n0 List<? super T> list, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        @androidx.annotation.u
        static <K, V> void e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        @androidx.annotation.u
        static <T extends Parcelable> T f(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        @androidx.annotation.u
        static <T> T[] g(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        @androidx.annotation.u
        static <T> Parcelable.Creator<T> h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        @androidx.annotation.u
        static <T> List<T> i(@androidx.annotation.n0 Parcel parcel, @androidx.annotation.n0 List<T> list, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        @androidx.annotation.u
        static <T extends Serializable> T j(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        @androidx.annotation.u
        static <T> SparseArray<T> k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    private v() {
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @p0
    public static <T> Object[] a(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
        return androidx.core.os.a.l() ? c.a(parcel, classLoader, cls) : parcel.readArray(classLoader);
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @p0
    public static <T> ArrayList<T> b(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<? extends T> cls) {
        return androidx.core.os.a.l() ? c.b(parcel, classLoader, cls) : parcel.readArrayList(classLoader);
    }

    public static boolean c(@androidx.annotation.n0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @p0
    public static <K, V> HashMap<K, V> d(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<? extends K> cls, @androidx.annotation.n0 Class<? extends V> cls2) {
        return androidx.core.os.a.l() ? c.c(parcel, classLoader, cls, cls2) : parcel.readHashMap(classLoader);
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    public static <T> void e(@androidx.annotation.n0 Parcel parcel, @androidx.annotation.n0 List<? super T> list, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
        if (androidx.core.os.a.l()) {
            c.d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    public static <K, V> void f(@androidx.annotation.n0 Parcel parcel, @androidx.annotation.n0 Map<? super K, ? super V> map, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<K> cls, @androidx.annotation.n0 Class<V> cls2) {
        if (androidx.core.os.a.l()) {
            c.e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @p0
    public static <T extends Parcelable> T g(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
        if (androidx.core.os.a.l()) {
            return (T) c.f(parcel, classLoader, cls);
        }
        T t10 = (T) parcel.readParcelable(classLoader);
        if (t10 == null || cls.isInstance(t10)) {
            return t10;
        }
        throw new BadParcelableException("Parcelable " + t10.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Deprecated
    @r0(markerClass = {androidx.core.os.a.b.class})
    @p0
    public static <T> T[] h(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
        if (androidx.core.os.a.l()) {
            return (T[]) c.g(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i10 = 0; i10 < tArr.length; i10++) {
            try {
                tArr2[i10] = cls.cast(tArr[i10]);
            } catch (ClassCastException unused) {
                throw new BadParcelableException("Parcelable at index " + i10 + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
            }
        }
        return tArr2;
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @p0
    public static <T> Parcelable[] i(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
        return androidx.core.os.a.l() ? (Parcelable[]) c.g(parcel, classLoader, cls) : parcel.readParcelableArray(classLoader);
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @w0(30)
    @p0
    public static <T> Parcelable.Creator<T> j(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
        return androidx.core.os.a.l() ? c.h(parcel, classLoader, cls) : (Parcelable.Creator<T>) b.a(parcel, classLoader);
    }

    @androidx.annotation.n0
    @r0(markerClass = {androidx.core.os.a.b.class})
    @w0(api = 29)
    public static <T> List<T> k(@androidx.annotation.n0 Parcel parcel, @androidx.annotation.n0 List<T> list, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
        return androidx.core.os.a.l() ? c.i(parcel, list, classLoader, cls) : a.a(parcel, list, classLoader);
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @p0
    public static <T extends Serializable> T l(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<T> cls) {
        return androidx.core.os.a.k() ? (T) c.j(parcel, classLoader, cls) : (T) parcel.readSerializable();
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @p0
    public static <T> SparseArray<T> m(@androidx.annotation.n0 Parcel parcel, @p0 ClassLoader classLoader, @androidx.annotation.n0 Class<? extends T> cls) {
        return androidx.core.os.a.l() ? c.k(parcel, classLoader, cls) : parcel.readSparseArray(classLoader);
    }

    public static void n(@androidx.annotation.n0 Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }
}
