package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.meituan.robust.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final q f25184c = new q(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<Integer> f25185d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<Integer> f25186e = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<int[]> f25187f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<List<Integer>> f25188g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<Long> f25189h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<long[]> f25190i = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<List<Long>> f25191j = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<Float> f25192k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<float[]> f25193l = new d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<List<Float>> f25194m = new e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<Boolean> f25195n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<boolean[]> f25196o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<List<Boolean>> f25197p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<String> f25198q = new p();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<String[]> f25199r = new n();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final m0<List<String>> f25200s = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f25202b = "nav_type";

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n1549#2:1213\n1620#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolArrayType$1\n*L\n758#1:1213\n758#1:1214,3\n*E\n"})
    public static final class a extends androidx.navigation.g<boolean[]> {
        a() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "boolean[]";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean[] n() {
            return new boolean[0];
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public boolean[] o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return new boolean[]{m0.f25195n.o(value).booleanValue()};
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean[] j(String value, boolean[] zArr) {
            boolean[] zArrF4;
            kotlin.jvm.internal.f0.p(value, "value");
            return (zArr == null || (zArrF4 = kotlin.collections.m.f4(zArr, i(value))) == null) ? i(value) : zArrF4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, boolean[] zArr) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putBooleanArray(key, zArr);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(boolean[] zArr) {
            List<Boolean> listMz;
            if (zArr == null || (listMz = ArraysKt___ArraysKt.mz(zArr)) == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listMz, 10));
            Iterator<T> it = listMz.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(boolean[] zArr, boolean[] zArr2) {
            return kotlin.collections.l.g(zArr != null ? kotlin.collections.m.n5(zArr) : null, zArr2 != null ? kotlin.collections.m.n5(zArr2) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n1549#3:1217\n1620#3,3:1218\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolListType$1\n*L\n795#1:1213,2\n796#1:1215,2\n801#1:1217\n801#1:1218,3\n*E\n"})
    public static final class b extends androidx.navigation.g<List<? extends Boolean>> {
        b() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "List<Boolean>";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Boolean> n() {
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Boolean> b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            boolean[] zArr = (boolean[]) bundle.get(key);
            if (zArr != null) {
                return ArraysKt___ArraysKt.mz(zArr);
            }
            return null;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Boolean> o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return kotlin.collections.s.k(m0.f25195n.o(value));
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Boolean> j(String value, List<Boolean> list) {
            List<Boolean> listY4;
            kotlin.jvm.internal.f0.p(value, "value");
            return (list == null || (listY4 = CollectionsKt___CollectionsKt.y4(list, i(value))) == null) ? i(value) : listY4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Boolean> list) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putBooleanArray(key, list != null ? CollectionsKt___CollectionsKt.I5(list) : null);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Boolean> list) {
            if (list == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Boolean> list, List<Boolean> list2) {
            return kotlin.collections.l.g(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class c extends m0<Boolean> {
        c() {
            super(false);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "boolean";
        }

        @Override // androidx.navigation.m0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Boolean bool) {
            p(bundle, str, bool.booleanValue());
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Boolean b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Boolean o(String value) {
            boolean z10;
            kotlin.jvm.internal.f0.p(value, "value");
            if (kotlin.jvm.internal.f0.g(value, "true")) {
                z10 = true;
            } else {
                if (!kotlin.jvm.internal.f0.g(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        public void p(Bundle bundle, String key, boolean z10) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putBoolean(key, z10);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n1549#2:1213\n1620#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatArrayType$1\n*L\n640#1:1213\n640#1:1214,3\n*E\n"})
    public static final class d extends androidx.navigation.g<float[]> {
        d() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "float[]";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public float[] n() {
            return new float[0];
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float[] b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public float[] o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return new float[]{m0.f25192k.o(value).floatValue()};
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public float[] j(String value, float[] fArr) {
            float[] fArrQ3;
            kotlin.jvm.internal.f0.p(value, "value");
            return (fArr == null || (fArrQ3 = kotlin.collections.m.Q3(fArr, i(value))) == null) ? i(value) : fArrQ3;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, float[] fArr) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putFloatArray(key, fArr);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(float[] fArr) {
            List<Float> listHz;
            if (fArr == null || (listHz = ArraysKt___ArraysKt.hz(fArr)) == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listHz, 10));
            Iterator<T> it = listHz.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(float[] fArr, float[] fArr2) {
            return kotlin.collections.l.g(fArr != null ? kotlin.collections.m.r5(fArr) : null, fArr2 != null ? kotlin.collections.m.r5(fArr2) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n1549#3:1217\n1620#3,3:1218\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatListType$1\n*L\n674#1:1213,2\n675#1:1215,2\n680#1:1217\n680#1:1218,3\n*E\n"})
    public static final class e extends androidx.navigation.g<List<? extends Float>> {
        e() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "List<Float>";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Float> n() {
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Float> b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            float[] fArr = (float[]) bundle.get(key);
            if (fArr != null) {
                return ArraysKt___ArraysKt.hz(fArr);
            }
            return null;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Float> o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return kotlin.collections.s.k(m0.f25192k.o(value));
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Float> j(String value, List<Float> list) {
            List<Float> listY4;
            kotlin.jvm.internal.f0.p(value, "value");
            return (list == null || (listY4 = CollectionsKt___CollectionsKt.y4(list, i(value))) == null) ? i(value) : listY4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Float> list) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putFloatArray(key, list != null ? CollectionsKt___CollectionsKt.N5(list) : null);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Float> list) {
            if (list == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Float> list, List<Float> list2) {
            return kotlin.collections.l.g(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class f extends m0<Float> {
        f() {
            super(false);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "float";
        }

        @Override // androidx.navigation.m0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Float f10) {
            p(bundle, str, f10.floatValue());
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            Object obj = bundle.get(key);
            kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Float o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void p(Bundle bundle, String key, float f10) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putFloat(key, f10);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$IntArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n1549#2:1213\n1620#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$IntArrayType$1\n*L\n414#1:1213\n414#1:1214,3\n*E\n"})
    public static final class g extends androidx.navigation.g<int[]> {
        g() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "integer[]";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int[] n() {
            return new int[0];
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public int[] b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public int[] o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return new int[]{m0.f25185d.o(value).intValue()};
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public int[] j(String value, int[] iArr) {
            int[] iArrT3;
            kotlin.jvm.internal.f0.p(value, "value");
            return (iArr == null || (iArrT3 = kotlin.collections.m.T3(iArr, i(value))) == null) ? i(value) : iArrT3;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, int[] iArr) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putIntArray(key, iArr);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(int[] iArr) {
            List<Integer> listIz;
            if (iArr == null || (listIz = ArraysKt___ArraysKt.iz(iArr)) == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listIz, 10));
            Iterator<T> it = listIz.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(int[] iArr, int[] iArr2) {
            return kotlin.collections.l.g(iArr != null ? kotlin.collections.m.s5(iArr) : null, iArr2 != null ? kotlin.collections.m.s5(iArr2) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$IntListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n1549#3:1217\n1620#3,3:1218\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$IntListType$1\n*L\n448#1:1213,2\n449#1:1215,2\n454#1:1217\n454#1:1218,3\n*E\n"})
    public static final class h extends androidx.navigation.g<List<? extends Integer>> {
        h() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "List<Int>";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Integer> n() {
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Integer> b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            int[] iArr = (int[]) bundle.get(key);
            if (iArr != null) {
                return ArraysKt___ArraysKt.iz(iArr);
            }
            return null;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Integer> o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return kotlin.collections.s.k(m0.f25185d.o(value));
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Integer> j(String value, List<Integer> list) {
            List<Integer> listY4;
            kotlin.jvm.internal.f0.p(value, "value");
            return (list == null || (listY4 = CollectionsKt___CollectionsKt.y4(list, i(value))) == null) ? i(value) : listY4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Integer> list) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putIntArray(key, list != null ? CollectionsKt___CollectionsKt.P5(list) : null);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Integer> list) {
            if (list == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Integer> list, List<Integer> list2) {
            return kotlin.collections.l.g(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class i extends m0<Integer> {
        i() {
            super(false);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return androidx.constraintlayout.core.motion.utils.w.b.f17892b;
        }

        @Override // androidx.navigation.m0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Integer num) {
            p(bundle, str, num.intValue());
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            Object obj = bundle.get(key);
            kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer o(String value) {
            int i10;
            kotlin.jvm.internal.f0.p(value, "value");
            if (kotlin.text.u.v2(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                kotlin.jvm.internal.f0.o(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, kotlin.text.b.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void p(Bundle bundle, String key, int i10) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putInt(key, i10);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$LongArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n1549#2:1213\n1620#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$LongArrayType$1\n*L\n533#1:1213\n533#1:1214,3\n*E\n"})
    public static final class j extends androidx.navigation.g<long[]> {
        j() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "long[]";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public long[] n() {
            return new long[0];
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public long[] b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public long[] o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return new long[]{m0.f25189h.o(value).longValue()};
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public long[] j(String value, long[] jArr) {
            long[] jArrW3;
            kotlin.jvm.internal.f0.p(value, "value");
            return (jArr == null || (jArrW3 = kotlin.collections.m.W3(jArr, i(value))) == null) ? i(value) : jArrW3;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, long[] jArr) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putLongArray(key, jArr);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(long[] jArr) {
            List<Long> listJz;
            if (jArr == null || (listJz = ArraysKt___ArraysKt.jz(jArr)) == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listJz, 10));
            Iterator<T> it = listJz.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(long[] jArr, long[] jArr2) {
            return kotlin.collections.l.g(jArr != null ? kotlin.collections.m.t5(jArr) : null, jArr2 != null ? kotlin.collections.m.t5(jArr2) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$LongListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n1549#3:1217\n1620#3,3:1218\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$LongListType$1\n*L\n567#1:1213,2\n568#1:1215,2\n573#1:1217\n573#1:1218,3\n*E\n"})
    public static final class k extends androidx.navigation.g<List<? extends Long>> {
        k() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "List<Long>";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Long> n() {
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Long> b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            long[] jArr = (long[]) bundle.get(key);
            if (jArr != null) {
                return ArraysKt___ArraysKt.jz(jArr);
            }
            return null;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Long> o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return kotlin.collections.s.k(m0.f25189h.o(value));
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Long> j(String value, List<Long> list) {
            List<Long> listY4;
            kotlin.jvm.internal.f0.p(value, "value");
            return (list == null || (listY4 = CollectionsKt___CollectionsKt.y4(list, i(value))) == null) ? i(value) : listY4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Long> list) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putLongArray(key, list != null ? CollectionsKt___CollectionsKt.R5(list) : null);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Long> list) {
            if (list == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Long> list, List<Long> list2) {
            return kotlin.collections.l.g(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class l extends m0<Long> {
        l() {
            super(false);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return Constants.LONG;
        }

        @Override // androidx.navigation.m0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Long l10) {
            p(bundle, str, l10.longValue());
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            Object obj = bundle.get(key);
            kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Long o(String value) {
            String strSubstring;
            long j10;
            kotlin.jvm.internal.f0.p(value, "value");
            if (kotlin.text.u.K1(value, "L", false, 2, null)) {
                strSubstring = value.substring(0, value.length() - 1);
                kotlin.jvm.internal.f0.o(strSubstring, "substring(...)");
            } else {
                strSubstring = value;
            }
            if (kotlin.text.u.v2(value, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                kotlin.jvm.internal.f0.o(strSubstring2, "substring(...)");
                j10 = Long.parseLong(strSubstring2, kotlin.text.b.a(16));
            } else {
                j10 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j10);
        }

        public void p(Bundle bundle, String key, long j10) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putLong(key, j10);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class m extends m0<Integer> {
        m() {
            super(false);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "reference";
        }

        @Override // androidx.navigation.m0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Integer num) {
            p(bundle, str, num.intValue());
        }

        @Override // androidx.navigation.m0
        @androidx.annotation.c
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            Object obj = bundle.get(key);
            kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer o(String value) {
            int i10;
            kotlin.jvm.internal.f0.p(value, "value");
            if (kotlin.text.u.v2(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                kotlin.jvm.internal.f0.o(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, kotlin.text.b.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void p(Bundle bundle, String key, @androidx.annotation.c int i10) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putInt(key, i10);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringArrayType$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1212:1\n11065#2:1213\n11400#2,3:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringArrayType$1\n*L\n885#1:1213\n885#1:1214,3\n*E\n"})
    public static final class n extends androidx.navigation.g<String[]> {
        n() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "string[]";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String[] n() {
            return new String[0];
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String[] b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public String[] o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return new String[]{value};
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public String[] j(String value, String[] strArr) {
            String[] strArr2;
            kotlin.jvm.internal.f0.p(value, "value");
            return (strArr == null || (strArr2 = (String[]) kotlin.collections.m.Z3(strArr, i(value))) == null) ? i(value) : strArr2;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, String[] strArr) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putStringArray(key, strArr);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(String[] strArr) {
            if (strArr == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(String[] strArr, String[] strArr2) {
            return kotlin.collections.l.g(strArr, strArr2);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1212:1\n37#2,2:1213\n37#2,2:1215\n37#2,2:1217\n1549#3:1219\n1620#3,3:1220\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringListType$1\n*L\n902#1:1213,2\n922#1:1215,2\n923#1:1217,2\n928#1:1219\n928#1:1220,3\n*E\n"})
    public static final class o extends androidx.navigation.g<List<? extends String>> {
        o() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "List<String>";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<String> n() {
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<String> b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return ArraysKt___ArraysKt.kz(strArr);
            }
            return null;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            return kotlin.collections.s.k(value);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<String> j(String value, List<String> list) {
            List<String> listY4;
            kotlin.jvm.internal.f0.p(value, "value");
            return (list == null || (listY4 = CollectionsKt___CollectionsKt.y4(list, i(value))) == null) ? i(value) : listY4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<String> list) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putStringArray(key, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<String> list) {
            if (list == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<String> list, List<String> list2) {
            return kotlin.collections.l.g(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringType$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1212:1\n1#2:1213\n*E\n"})
    public static final class p extends m0<String> {
        p() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return androidx.constraintlayout.core.motion.utils.w.b.f17895e;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String b(Bundle bundle, String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String o(String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            if (kotlin.jvm.internal.f0.g(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, String str) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            bundle.putString(key, str);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String l(String str) {
            String strEncode = str != null ? Uri.encode(str) : null;
            return strEncode == null ? "null" : strEncode;
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class q {
        private q() {
        }

        public /* synthetic */ q(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public m0<?> a(@dl.e String str, @dl.e String str2) {
            String strSubstring;
            m0<Integer> m0Var = m0.f25185d;
            if (kotlin.jvm.internal.f0.g(m0Var.c(), str)) {
                return m0Var;
            }
            m0 m0Var2 = m0.f25187f;
            if (kotlin.jvm.internal.f0.g(m0Var2.c(), str)) {
                return m0Var2;
            }
            m0<List<Integer>> m0Var3 = m0.f25188g;
            if (kotlin.jvm.internal.f0.g(m0Var3.c(), str)) {
                return m0Var3;
            }
            m0<Long> m0Var4 = m0.f25189h;
            if (kotlin.jvm.internal.f0.g(m0Var4.c(), str)) {
                return m0Var4;
            }
            m0 m0Var5 = m0.f25190i;
            if (kotlin.jvm.internal.f0.g(m0Var5.c(), str)) {
                return m0Var5;
            }
            m0<List<Long>> m0Var6 = m0.f25191j;
            if (kotlin.jvm.internal.f0.g(m0Var6.c(), str)) {
                return m0Var6;
            }
            m0<Boolean> m0Var7 = m0.f25195n;
            if (kotlin.jvm.internal.f0.g(m0Var7.c(), str)) {
                return m0Var7;
            }
            m0 m0Var8 = m0.f25196o;
            if (kotlin.jvm.internal.f0.g(m0Var8.c(), str)) {
                return m0Var8;
            }
            m0<List<Boolean>> m0Var9 = m0.f25197p;
            if (kotlin.jvm.internal.f0.g(m0Var9.c(), str)) {
                return m0Var9;
            }
            m0<String> m0Var10 = m0.f25198q;
            if (kotlin.jvm.internal.f0.g(m0Var10.c(), str)) {
                return m0Var10;
            }
            m0 m0Var11 = m0.f25199r;
            if (kotlin.jvm.internal.f0.g(m0Var11.c(), str)) {
                return m0Var11;
            }
            m0<List<String>> m0Var12 = m0.f25200s;
            if (kotlin.jvm.internal.f0.g(m0Var12.c(), str)) {
                return m0Var12;
            }
            m0<Float> m0Var13 = m0.f25192k;
            if (kotlin.jvm.internal.f0.g(m0Var13.c(), str)) {
                return m0Var13;
            }
            m0 m0Var14 = m0.f25193l;
            if (kotlin.jvm.internal.f0.g(m0Var14.c(), str)) {
                return m0Var14;
            }
            m0<List<Float>> m0Var15 = m0.f25194m;
            if (kotlin.jvm.internal.f0.g(m0Var15.c(), str)) {
                return m0Var15;
            }
            m0<Integer> m0Var16 = m0.f25186e;
            if (kotlin.jvm.internal.f0.g(m0Var16.c(), str)) {
                return m0Var16;
            }
            if (str == null || str.length() == 0) {
                return m0Var10;
            }
            try {
                if (!kotlin.text.u.v2(str, ".", false, 2, null) || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                boolean zK1 = kotlin.text.u.K1(str, okhttp3.t.f132643o, false, 2, null);
                if (zK1) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    kotlin.jvm.internal.f0.o(strSubstring, "substring(...)");
                }
                Class<?> clazz = Class.forName(strSubstring);
                kotlin.jvm.internal.f0.o(clazz, "clazz");
                m0<?> m0VarD = d(clazz, zK1);
                if (m0VarD != null) {
                    return m0VarD;
                }
                throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @dl.d
        @xh.m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final m0<Object> b(@dl.d String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            try {
                try {
                    try {
                        try {
                            m0<Integer> m0Var = m0.f25185d;
                            m0Var.o(value);
                            kotlin.jvm.internal.f0.n(m0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return m0Var;
                        } catch (IllegalArgumentException unused) {
                            m0<Boolean> m0Var2 = m0.f25195n;
                            m0Var2.o(value);
                            kotlin.jvm.internal.f0.n(m0Var2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return m0Var2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        m0<Long> m0Var3 = m0.f25189h;
                        m0Var3.o(value);
                        kotlin.jvm.internal.f0.n(m0Var3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return m0Var3;
                    }
                } catch (IllegalArgumentException unused3) {
                    m0<String> m0Var4 = m0.f25198q;
                    kotlin.jvm.internal.f0.n(m0Var4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return m0Var4;
                }
            } catch (IllegalArgumentException unused4) {
                m0<Float> m0Var5 = m0.f25192k;
                m0Var5.o(value);
                kotlin.jvm.internal.f0.n(m0Var5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var5;
            }
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:48:0x00da  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:55:0x0100  */
        /* JADX WARN: Instruction removed from duplicated block: B:55:0x0100, please report this as an issue */
        @dl.d
        @xh.m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final m0<Object> c(@dl.e Object obj) {
            m0<Object> vVar;
            Class<?> componentType;
            if (obj instanceof Integer) {
                m0<Integer> m0Var = m0.f25185d;
                kotlin.jvm.internal.f0.n(m0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var;
            }
            if (obj instanceof int[]) {
                m0<int[]> m0Var2 = m0.f25187f;
                kotlin.jvm.internal.f0.n(m0Var2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var2;
            }
            if (obj instanceof Long) {
                m0<Long> m0Var3 = m0.f25189h;
                kotlin.jvm.internal.f0.n(m0Var3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var3;
            }
            if (obj instanceof long[]) {
                m0<long[]> m0Var4 = m0.f25190i;
                kotlin.jvm.internal.f0.n(m0Var4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var4;
            }
            if (obj instanceof Float) {
                m0<Float> m0Var5 = m0.f25192k;
                kotlin.jvm.internal.f0.n(m0Var5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var5;
            }
            if (obj instanceof float[]) {
                m0<float[]> m0Var6 = m0.f25193l;
                kotlin.jvm.internal.f0.n(m0Var6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var6;
            }
            if (obj instanceof Boolean) {
                m0<Boolean> m0Var7 = m0.f25195n;
                kotlin.jvm.internal.f0.n(m0Var7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var7;
            }
            if (obj instanceof boolean[]) {
                m0<boolean[]> m0Var8 = m0.f25196o;
                kotlin.jvm.internal.f0.n(m0Var8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var8;
            }
            if ((obj instanceof String) || obj == null) {
                m0<String> m0Var9 = m0.f25198q;
                kotlin.jvm.internal.f0.n(m0Var9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var9;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                m0<String[]> m0Var10 = m0.f25199r;
                kotlin.jvm.internal.f0.n(m0Var10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return m0Var10;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType2 = obj.getClass().getComponentType();
                kotlin.jvm.internal.f0.m(componentType2);
                if (Parcelable.class.isAssignableFrom(componentType2)) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    kotlin.jvm.internal.f0.n(componentType3, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    vVar = new s<>(componentType3);
                } else if (obj.getClass().isArray()) {
                    componentType = obj.getClass().getComponentType();
                    kotlin.jvm.internal.f0.m(componentType);
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        kotlin.jvm.internal.f0.n(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        vVar = new u<>(componentType4);
                    } else if (obj instanceof Parcelable) {
                        vVar = new t<>(obj.getClass());
                    } else if (obj instanceof Enum) {
                        vVar = new r<>(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        vVar = new v<>(obj.getClass());
                    }
                } else if (obj instanceof Parcelable) {
                    vVar = new t<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    vVar = new r<>(obj.getClass());
                } else {
                    if (obj instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    vVar = new v<>(obj.getClass());
                }
            } else if (obj.getClass().isArray()) {
                componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.f0.m(componentType);
                if (Serializable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType5 = obj.getClass().getComponentType();
                    kotlin.jvm.internal.f0.n(componentType5, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    vVar = new u<>(componentType5);
                } else if (obj instanceof Parcelable) {
                    vVar = new t<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    vVar = new r<>(obj.getClass());
                } else {
                    if (obj instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    vVar = new v<>(obj.getClass());
                }
            } else if (obj instanceof Parcelable) {
                vVar = new t<>(obj.getClass());
            } else if (obj instanceof Enum) {
                vVar = new r<>(obj.getClass());
            } else {
                if (obj instanceof Serializable) {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                vVar = new v<>(obj.getClass());
            }
            return vVar;
        }

        @dl.e
        public final m0<?> d(@dl.d Class<?> clazz, boolean z10) {
            kotlin.jvm.internal.f0.p(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return z10 ? new s(clazz) : new t(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !z10) {
                return new r(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return z10 ? new u(clazz) : new v(clazz);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1212:1\n1#2:1213\n1282#3,2:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n*L\n1135#1:1214,2\n*E\n"})
    public static final class r<D extends Enum<?>> extends v<D> {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @dl.d
        private final Class<D> f25203u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(@dl.d Class<D> type) {
            super(false, type);
            kotlin.jvm.internal.f0.p(type, "type");
            if (type.isEnum()) {
                this.f25203u = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.m0.v, androidx.navigation.m0
        @dl.d
        public String c() {
            String name = this.f25203u.getName();
            kotlin.jvm.internal.f0.o(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.m0.v
        @dl.d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D o(@dl.d String value) {
            D d10;
            kotlin.jvm.internal.f0.p(value, "value");
            D[] enumConstants = this.f25203u.getEnumConstants();
            kotlin.jvm.internal.f0.o(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (kotlin.text.u.L1(d10.name(), value, true)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f25203u.getName() + lg.a.f131414g);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class s<D extends Parcelable> extends m0<D[]> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.d
        private final Class<D[]> f25204t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(@dl.d Class<D> type) {
            super(true);
            kotlin.jvm.internal.f0.p(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                kotlin.jvm.internal.f0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f25204t = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.m0
        @dl.d
        public String c() {
            String name = this.f25204t.getName();
            kotlin.jvm.internal.f0.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.f0.g(s.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.f0.g(this.f25204t, ((s) obj).f25204t);
        }

        public int hashCode() {
            return this.f25204t.hashCode();
        }

        @Override // androidx.navigation.m0
        @dl.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D[] b(@dl.d Bundle bundle, @dl.d String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.m0
        @dl.d
        public D[] o(@dl.d String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@dl.d Bundle bundle, @dl.d String key, @dl.e D[] dArr) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            this.f25204t.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean m(@dl.e D[] dArr, @dl.e D[] dArr2) {
            return kotlin.collections.l.g(dArr, dArr2);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class t<D> extends m0<D> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.d
        private final Class<D> f25205t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(@dl.d Class<D> type) {
            super(true);
            kotlin.jvm.internal.f0.p(type, "type");
            boolean z10 = true;
            if (!Parcelable.class.isAssignableFrom(type) && !Serializable.class.isAssignableFrom(type)) {
                z10 = false;
            }
            if (z10) {
                this.f25205t = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.m0
        @dl.e
        public D b(@dl.d Bundle bundle, @dl.d String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        @dl.d
        public String c() {
            String name = this.f25205t.getName();
            kotlin.jvm.internal.f0.o(name, "type.name");
            return name;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.f0.g(t.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.f0.g(this.f25205t, ((t) obj).f25205t);
        }

        public int hashCode() {
            return this.f25205t.hashCode();
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: i */
        public D o(@dl.d String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.m0
        public void k(@dl.d Bundle bundle, @dl.d String key, D d10) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            this.f25205t.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d10);
            }
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    public static final class u<D extends Serializable> extends m0<D[]> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.d
        private final Class<D[]> f25206t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(@dl.d Class<D> type) {
            super(true);
            kotlin.jvm.internal.f0.p(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                kotlin.jvm.internal.f0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f25206t = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.m0
        @dl.d
        public String c() {
            String name = this.f25206t.getName();
            kotlin.jvm.internal.f0.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.f0.g(u.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.f0.g(this.f25206t, ((u) obj).f25206t);
        }

        public int hashCode() {
            return this.f25206t.hashCode();
        }

        @Override // androidx.navigation.m0
        @dl.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D[] b(@dl.d Bundle bundle, @dl.d String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.m0
        @dl.d
        public D[] o(@dl.d String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@dl.d Bundle bundle, @dl.d String key, @dl.e D[] dArr) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            this.f25206t.cast(dArr);
            bundle.putSerializable(key, dArr);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean m(@dl.e D[] dArr, @dl.e D[] dArr2) {
            return kotlin.collections.l.g(dArr, dArr2);
        }
    }

    /* JADX INFO: compiled from: NavType.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1212:1\n1#2:1213\n*E\n"})
    public static class v<D extends Serializable> extends m0<D> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.d
        private final Class<D> f25207t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(@dl.d Class<D> type) {
            super(true);
            kotlin.jvm.internal.f0.p(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (true ^ type.isEnum()) {
                this.f25207t = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10, @dl.d Class<D> type) {
            super(z10);
            kotlin.jvm.internal.f0.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f25207t = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.m0
        @dl.d
        public String c() {
            String name = this.f25207t.getName();
            kotlin.jvm.internal.f0.o(name, "type.name");
            return name;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                return kotlin.jvm.internal.f0.g(this.f25207t, ((v) obj).f25207t);
            }
            return false;
        }

        public int hashCode() {
            return this.f25207t.hashCode();
        }

        @Override // androidx.navigation.m0
        @dl.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(@dl.d Bundle bundle, @dl.d String key) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        @dl.d
        public D o(@dl.d String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@dl.d Bundle bundle, @dl.d String key, @dl.d D value) {
            kotlin.jvm.internal.f0.p(bundle, "bundle");
            kotlin.jvm.internal.f0.p(key, "key");
            kotlin.jvm.internal.f0.p(value, "value");
            this.f25207t.cast(value);
            bundle.putSerializable(key, value);
        }
    }

    public m0(boolean z10) {
        this.f25201a = z10;
    }

    @dl.d
    @xh.m
    public static m0<?> a(@dl.e String str, @dl.e String str2) {
        return f25184c.a(str, str2);
    }

    @dl.d
    @xh.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final m0<Object> d(@dl.d String str) {
        return f25184c.b(str);
    }

    @dl.d
    @xh.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final m0<Object> e(@dl.e Object obj) {
        return f25184c.c(obj);
    }

    @dl.e
    public abstract T b(@dl.d Bundle bundle, @dl.d String str);

    @dl.d
    public String c() {
        return this.f25202b;
    }

    public boolean f() {
        return this.f25201a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T g(@dl.d Bundle bundle, @dl.d String key, @dl.d String value) {
        kotlin.jvm.internal.f0.p(bundle, "bundle");
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(value, "value");
        T tO = o(value);
        k(bundle, key, tO);
        return tO;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T h(@dl.d Bundle bundle, @dl.d String key, @dl.e String str, T t10) {
        kotlin.jvm.internal.f0.p(bundle, "bundle");
        kotlin.jvm.internal.f0.p(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return t10;
        }
        T tJ = j(str, t10);
        k(bundle, key, tJ);
        return tJ;
    }

    /* JADX INFO: renamed from: i */
    public abstract T o(@dl.d String str);

    public T j(@dl.d String value, T t10) {
        kotlin.jvm.internal.f0.p(value, "value");
        return o(value);
    }

    public abstract void k(@dl.d Bundle bundle, @dl.d String str, T t10);

    @dl.d
    public String l(T t10) {
        return String.valueOf(t10);
    }

    public boolean m(T t10, T t11) {
        return kotlin.jvm.internal.f0.g(t10, t11);
    }

    @dl.d
    public String toString() {
        return c();
    }
}
