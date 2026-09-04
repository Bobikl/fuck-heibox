package kotlinx.serialization.descriptors;

import fi.u;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.b0;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h0;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import kotlinx.serialization.internal.n;
import kotlinx.serialization.internal.q1;
import kotlinx.serialization.internal.s1;
import yh.l;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,348:1\n37#2,2:349\n37#2,2:351\n1549#3:353\n1620#3,3:354\n13#4:357\n13#4:358\n13#4:359\n18#4:360\n111#5,10:361\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n318#1:349,2\n320#1:351,2\n322#1:353\n322#1:354,3\n326#1:357\n328#1:358\n329#1:359\n330#1:360\n333#1:361,10\n*E\n"})
public final class SerialDescriptorImpl implements f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f130545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final h f130546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<Annotation> f130548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Set<String> f130549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final String[] f130550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final f[] f130551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<Annotation>[] f130552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final boolean[] f130553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final Map<String, Integer> f130554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final f[] f130555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final z f130556l;

    public SerialDescriptorImpl(@dl.d String serialName, @dl.d h kind, int i10, @dl.d List<? extends f> typeParameters, @dl.d a builder) {
        f0.p(serialName, "serialName");
        f0.p(kind, "kind");
        f0.p(typeParameters, "typeParameters");
        f0.p(builder, "builder");
        this.f130545a = serialName;
        this.f130546b = kind;
        this.f130547c = i10;
        this.f130548d = builder.c();
        this.f130549e = CollectionsKt___CollectionsKt.O5(builder.g());
        String[] strArr = (String[]) builder.g().toArray(new String[0]);
        this.f130550f = strArr;
        this.f130551g = q1.e(builder.f());
        this.f130552h = (List[]) builder.e().toArray(new List[0]);
        this.f130553i = CollectionsKt___CollectionsKt.I5(builder.h());
        Iterable<h0> iterableFA = ArraysKt___ArraysKt.fA(strArr);
        ArrayList arrayList = new ArrayList(t.Y(iterableFA, 10));
        for (h0 h0Var : iterableFA) {
            arrayList.add(c1.a(h0Var.f(), Integer.valueOf(h0Var.e())));
        }
        this.f130554j = s0.B0(arrayList);
        this.f130555k = q1.e(typeParameters);
        this.f130556l = b0.c(new yh.a<Integer>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$_hashCode$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                SerialDescriptorImpl serialDescriptorImpl = this.f130557b;
                return Integer.valueOf(s1.b(serialDescriptorImpl, serialDescriptorImpl.f130555k));
            }
        });
    }

    private final int m() {
        return ((Number) this.f130556l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.internal.n
    @dl.d
    public Set<String> a() {
        return this.f130549e;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public h b() {
        return this.f130546b;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean c() {
        return f.a.g(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d(@dl.d String name) {
        f0.p(name, "name");
        Integer num = this.f130554j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public f e(int i10) {
        return this.f130551g[i10];
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            f fVar = (f) obj;
            if (f0.g(j(), fVar.j()) && Arrays.equals(this.f130555k, ((SerialDescriptorImpl) obj).f130555k) && f() == fVar.f()) {
                int iF = f();
                for (int i10 = 0; i10 < iF; i10++) {
                    if (f0.g(e(i10).j(), fVar.e(i10).j()) && f0.g(e(i10).b(), fVar.e(i10).b())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public int f() {
        return this.f130547c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean g() {
        return f.a.f(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> getAnnotations() {
        return this.f130548d;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String h(int i10) {
        return this.f130550f[i10];
    }

    public int hashCode() {
        return m();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> i(int i10) {
        return this.f130552h[i10];
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String j() {
        return this.f130545a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean k(int i10) {
        return this.f130553i[i10];
    }

    @dl.d
    public String toString() {
        return CollectionsKt___CollectionsKt.h3(u.W1(0, f()), ", ", j() + '(', ")", 0, null, new l<Integer, CharSequence>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl.toString.1
            {
                super(1);
            }

            @dl.d
            public final CharSequence a(int i10) {
                return SerialDescriptorImpl.this.h(i10) + ": " + SerialDescriptorImpl.this.e(i10).j();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
                return a(num.intValue());
            }
        }, 24, null);
    }
}
