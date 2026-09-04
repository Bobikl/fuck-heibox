package androidx.navigation.serialization;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.m0;
import com.meituan.robust.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;

/* JADX INFO: compiled from: NavTypeConverter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f25256a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final m0<Integer> f25257b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final m0<Boolean> f25258c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final m0<Double> f25259d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final m0<Double> f25260e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final m0<Float> f25261f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final m0<Long> f25262g = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final m0<String> f25263h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final m0<String[]> f25264i = new m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final m0<List<String>> f25265j = new n();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final m0<double[]> f25266k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final m0<List<Double>> f25267l = new C0192c();

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public static final class a extends m0<Boolean> {
        a() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "boolean_nullable";
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Boolean b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            return null;
        }

        @Override // androidx.navigation.m0
        public Boolean o(String value) {
            f0.p(value, "value");
            if (f0.g(value, "null")) {
                return null;
            }
            return m0.f25195n.o(value);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, Boolean bool) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            if (bool == null) {
                bundle.putSerializable(key, null);
            } else {
                m0.f25195n.k(bundle, key, bool);
            }
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    @t0({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,577:1\n1549#2:578\n1620#2,3:579\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleArrayType$1\n*L\n435#1:578\n435#1:579,3\n*E\n"})
    public static final class b extends androidx.navigation.g<double[]> {
        b() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "double[]";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public double[] n() {
            return new double[0];
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public double[] b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            return (double[]) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public double[] o(String value) {
            f0.p(value, "value");
            return new double[]{c.f25256a.e().o(value).doubleValue()};
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public double[] j(String value, double[] dArr) {
            double[] dArrN3;
            f0.p(value, "value");
            return (dArr == null || (dArrN3 = kotlin.collections.m.N3(dArr, o(value))) == null) ? o(value) : dArrN3;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, double[] dArr) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            bundle.putDoubleArray(key, dArr);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(double[] dArr) {
            List<Double> listGz;
            if (dArr == null || (listGz = ArraysKt___ArraysKt.gz(dArr)) == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(t.Y(listGz, 10));
            Iterator<T> it = listGz.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(double[] dArr, double[] dArr2) {
            return kotlin.collections.l.g(dArr != null ? kotlin.collections.m.q5(dArr) : null, dArr2 != null ? kotlin.collections.m.q5(dArr2) : null);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.serialization.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NavTypeConverter.kt */
    @t0({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,577:1\n37#2,2:578\n37#2,2:580\n1549#3:582\n1620#3,3:583\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleListType$1\n*L\n460#1:578,2\n461#1:580,2\n466#1:582\n466#1:583,3\n*E\n"})
    public static final class C0192c extends androidx.navigation.g<List<? extends Double>> {
        C0192c() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "List<Double>";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Double> n() {
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<Double> b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            double[] dArr = obj instanceof double[] ? (double[]) obj : null;
            if (dArr != null) {
                return ArraysKt___ArraysKt.gz(dArr);
            }
            return null;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<Double> o(String value) {
            f0.p(value, "value");
            return s.k(c.f25256a.e().o(value));
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<Double> j(String value, List<Double> list) {
            List<Double> listY4;
            f0.p(value, "value");
            return (list == null || (listY4 = CollectionsKt___CollectionsKt.y4(list, o(value))) == null) ? o(value) : listY4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<Double> list) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            bundle.putDoubleArray(key, list != null ? CollectionsKt___CollectionsKt.M5(list) : null);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<Double> list) {
            if (list == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(List<Double> list, List<Double> list2) {
            return kotlin.collections.l.g(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public static final class d extends m0<Double> {
        d() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "double_nullable";
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Double b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Double) {
                return (Double) obj;
            }
            return null;
        }

        @Override // androidx.navigation.m0
        public Double o(String value) {
            f0.p(value, "value");
            if (f0.g(value, "null")) {
                return null;
            }
            return c.f25256a.e().o(value);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, Double d10) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            if (d10 == null) {
                bundle.putSerializable(key, null);
            } else {
                c.f25256a.e().k(bundle, key, d10);
            }
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public static final class e extends m0<Double> {
        e() {
            super(false);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return Constants.DOUBLE;
        }

        @Override // androidx.navigation.m0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Double d10) {
            p(bundle, str, d10.doubleValue());
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Double b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            f0.n(obj, "null cannot be cast to non-null type kotlin.Double");
            return (Double) obj;
        }

        @Override // androidx.navigation.m0
        public Double o(String value) {
            f0.p(value, "value");
            return Double.valueOf(Double.parseDouble(value));
        }

        public void p(Bundle bundle, String key, double d10) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            bundle.putDouble(key, d10);
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    @t0({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumListType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,577:1\n1#2:578\n1549#3:579\n1620#3,3:580\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumListType\n*L\n496#1:579\n496#1:580,3\n*E\n"})
    public static final class f<D extends Enum<?>> extends androidx.navigation.g<List<? extends D>> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.d
        private final m0.r<D> f25268t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@dl.d Class<D> type) {
            super(true);
            f0.p(type, "type");
            this.f25268t = new m0.r<>(type);
        }

        @Override // androidx.navigation.m0
        @dl.d
        public String c() {
            return "List<" + this.f25268t.c() + "}>";
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return f0.g(this.f25268t, ((f) obj).f25268t);
            }
            return false;
        }

        public int hashCode() {
            return this.f25268t.hashCode();
        }

        @Override // androidx.navigation.g
        @dl.d
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<D> n() {
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // androidx.navigation.m0
        @dl.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<D> b(@dl.d Bundle bundle, @dl.d String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.navigation.m0
        @dl.d
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<D> o(@dl.d String value) {
            f0.p(value, "value");
            return s.k(this.f25268t.i(value));
        }

        @Override // androidx.navigation.m0
        @dl.e
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<D> j(@dl.d String value, @dl.e List<? extends D> list) {
            List<D> listY4;
            f0.p(value, "value");
            return (list == null || (listY4 = CollectionsKt___CollectionsKt.y4(list, o(value))) == null) ? o(value) : listY4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(@dl.d Bundle bundle, @dl.d String key, @dl.e List<? extends D> list) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            bundle.putSerializable(key, list != null ? new ArrayList(list) : null);
        }

        @Override // androidx.navigation.g
        @dl.d
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(@dl.e List<? extends D> list) {
            if (list == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean m(@dl.e List<? extends D> list, @dl.e List<? extends D> list2) {
            return f0.g(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    @t0({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumNullableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,577:1\n1#2:578\n1282#3,2:579\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumNullableType\n*L\n527#1:579,2\n*E\n"})
    public static final class g<D extends Enum<?>> extends k<D> {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @dl.d
        private final Class<D> f25269u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@dl.d Class<D> type) {
            super(type);
            f0.p(type, "type");
            if (type.isEnum()) {
                this.f25269u = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.c.k, androidx.navigation.m0
        @dl.d
        public String c() {
            String name = this.f25269u.getName();
            f0.o(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.serialization.c.k
        @dl.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public D o(@dl.d String value) {
            f0.p(value, "value");
            D d10 = null;
            if (!f0.g(value, "null")) {
                D[] enumConstants = this.f25269u.getEnumConstants();
                f0.m(enumConstants);
                for (D d11 : enumConstants) {
                    D d12 = d11;
                    f0.m(d12);
                    if (u.L1(d12.name(), value, true)) {
                        d10 = d11;
                        break;
                    }
                }
                d10 = d10;
                if (d10 == null) {
                    throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f25269u.getName() + lg.a.f131414g);
                }
            }
            return d10;
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public static final class h extends m0<Float> {
        h() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "float_nullable";
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Float) {
                return (Float) obj;
            }
            return null;
        }

        @Override // androidx.navigation.m0
        public Float o(String value) {
            f0.p(value, "value");
            if (f0.g(value, "null")) {
                return null;
            }
            return m0.f25192k.o(value);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, Float f10) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            if (f10 == null) {
                bundle.putSerializable(key, null);
            } else {
                m0.f25192k.k(bundle, key, f10);
            }
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public static final class i extends m0<Integer> {
        i() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "integer_nullable";
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }

        @Override // androidx.navigation.m0
        public Integer o(String value) {
            f0.p(value, "value");
            if (f0.g(value, "null")) {
                return null;
            }
            return m0.f25185d.o(value);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, Integer num) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            if (num == null) {
                bundle.putSerializable(key, null);
            } else {
                m0.f25185d.k(bundle, key, num);
            }
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public static final class j extends m0<Long> {
        j() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "long_nullable";
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Long) {
                return (Long) obj;
            }
            return null;
        }

        @Override // androidx.navigation.m0
        public Long o(String value) {
            f0.p(value, "value");
            if (f0.g(value, "null")) {
                return null;
            }
            return m0.f25189h.o(value);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, Long l10) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            if (l10 == null) {
                bundle.putSerializable(key, null);
            } else {
                m0.f25189h.k(bundle, key, l10);
            }
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public static class k<D extends Serializable> extends m0<D> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.d
        private final Class<D> f25270t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@dl.d Class<D> type) {
            super(true);
            f0.p(type, "type");
            this.f25270t = type;
            if (Serializable.class.isAssignableFrom(type)) {
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.m0
        @dl.d
        public String c() {
            String name = this.f25270t.getName();
            f0.o(name, "type.name");
            return name;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                return f0.g(this.f25270t, ((k) obj).f25270t);
            }
            return false;
        }

        public int hashCode() {
            return this.f25270t.hashCode();
        }

        @Override // androidx.navigation.m0
        @dl.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(@dl.d Bundle bundle, @dl.d String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Serializable) {
                return (D) obj;
            }
            return null;
        }

        @Override // androidx.navigation.m0
        @dl.e
        public D o(@dl.d String value) {
            f0.p(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(@dl.d Bundle bundle, @dl.d String key, @dl.e D d10) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            bundle.putSerializable(key, this.f25270t.cast(d10));
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public static final class l extends m0<String> {
        l() {
            super(false);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "string_non_nullable";
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            String string = bundle.getString(key);
            return string == null ? "null" : string;
        }

        @Override // androidx.navigation.m0
        public String o(String value) {
            f0.p(value, "value");
            return value;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, String value) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            f0.p(value, "value");
            bundle.putString(key, value);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String l(String value) {
            f0.p(value, "value");
            String strEncode = Uri.encode(value);
            f0.o(strEncode, "encode(value)");
            return strEncode;
        }
    }

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    @t0({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNullableArrayType$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,577:1\n11065#2:578\n11400#2,3:579\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNullableArrayType$1\n*L\n370#1:578\n370#1:579,3\n*E\n"})
    public static final class m extends androidx.navigation.g<String[]> {
        m() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "string_nullable[]";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String[] n() {
            return new String[0];
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String[] b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public String[] o(String value) {
            f0.p(value, "value");
            return new String[]{m0.f25198q.o(value)};
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public String[] j(String value, String[] strArr) {
            String[] strArr2;
            f0.p(value, "value");
            return (strArr == null || (strArr2 = (String[]) kotlin.collections.m.Z3(strArr, o(value))) == null) ? o(value) : strArr2;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, String[] strArr) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
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

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    @t0({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNullableListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,577:1\n37#2,2:578\n37#2,2:580\n37#2,2:582\n1549#3:584\n1620#3,3:585\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNullableListType$1\n*L\n381#1:578,2\n398#1:580,2\n399#1:582,2\n404#1:584\n404#1:585,3\n*E\n"})
    public static final class n extends androidx.navigation.g<List<? extends String>> {
        n() {
            super(true);
        }

        @Override // androidx.navigation.m0
        public String c() {
            return "List<String?>";
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<String> n() {
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<String> b(Bundle bundle, String key) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return ArraysKt___ArraysKt.kz(strArr);
            }
            return null;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> o(String value) {
            f0.p(value, "value");
            return s.k(m0.f25198q.o(value));
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public List<String> j(String value, List<String> list) {
            List<String> listY4;
            f0.p(value, "value");
            return (list == null || (listY4 = CollectionsKt___CollectionsKt.y4(list, o(value))) == null) ? o(value) : listY4;
        }

        @Override // androidx.navigation.m0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Bundle bundle, String key, List<String> list) {
            f0.p(bundle, "bundle");
            f0.p(key, "key");
            bundle.putStringArray(key, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // androidx.navigation.g
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public List<String> o(List<String> list) {
            if (list == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(t.Y(list, 10));
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

    private c() {
    }

    @dl.d
    public final m0<Boolean> a() {
        return f25258c;
    }

    @dl.d
    public final m0<double[]> b() {
        return f25266k;
    }

    @dl.d
    public final m0<List<Double>> c() {
        return f25267l;
    }

    @dl.d
    public final m0<Double> d() {
        return f25260e;
    }

    @dl.d
    public final m0<Double> e() {
        return f25259d;
    }

    @dl.d
    public final m0<Float> f() {
        return f25261f;
    }

    @dl.d
    public final m0<Integer> g() {
        return f25257b;
    }

    @dl.d
    public final m0<Long> h() {
        return f25262g;
    }

    @dl.d
    public final m0<String> i() {
        return f25263h;
    }

    @dl.d
    public final m0<String[]> j() {
        return f25264i;
    }

    @dl.d
    public final m0<List<String>> k() {
        return f25265j;
    }
}
