package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,134:1\n13#2:135\n18#2:136\n13#2:137\n13#2:138\n111#3,10:139\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n*E\n"})
@kotlin.r0
public class PluginGeneratedSerialDescriptor implements kotlinx.serialization.descriptors.f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f130634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final h0<?> f130635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f130637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final String[] f130638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<Annotation>[] f130639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private List<Annotation> f130640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final boolean[] f130641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private Map<String, Integer> f130642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final kotlin.z f130643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlin.z f130644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final kotlin.z f130645l;

    public PluginGeneratedSerialDescriptor(@dl.d String serialName, @dl.e h0<?> h0Var, int i10) {
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        this.f130634a = serialName;
        this.f130635b = h0Var;
        this.f130636c = i10;
        this.f130637d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f130638e = strArr;
        int i12 = this.f130636c;
        this.f130639f = new List[i12];
        this.f130641h = new boolean[i12];
        this.f130642i = kotlin.collections.s0.z();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f130643j = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<kotlinx.serialization.g<?>[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$childSerializers$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.g<?>[] invoke() {
                kotlinx.serialization.g<?>[] gVarArrE;
                h0 h0Var2 = this.f130647b.f130635b;
                return (h0Var2 == null || (gVarArrE = h0Var2.e()) == null) ? t1.f130765a : gVarArrE;
            }
        });
        this.f130644k = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<kotlinx.serialization.descriptors.f[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$typeParameterDescriptors$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f[] invoke() {
                ArrayList arrayList;
                kotlinx.serialization.g<?>[] gVarArrC;
                h0 h0Var2 = this.f130649b.f130635b;
                if (h0Var2 == null || (gVarArrC = h0Var2.c()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(gVarArrC.length);
                    for (kotlinx.serialization.g<?> gVar : gVarArrC) {
                        arrayList.add(gVar.a());
                    }
                }
                return q1.e(arrayList);
            }
        });
        this.f130645l = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<Integer>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$_hashCode$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f130646b;
                return Integer.valueOf(s1.b(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.q()));
            }
        });
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, h0 h0Var, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(str, (i11 & 2) != 0 ? null : h0Var, i10);
    }

    public static /* synthetic */ void n(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        pluginGeneratedSerialDescriptor.m(str, z10);
    }

    private final Map<String, Integer> o() {
        HashMap map = new HashMap();
        int length = this.f130638e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f130638e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    private final kotlinx.serialization.g<?>[] p() {
        return (kotlinx.serialization.g[]) this.f130643j.getValue();
    }

    private final int r() {
        return ((Number) this.f130645l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.internal.n
    @dl.d
    public Set<String> a() {
        return this.f130642i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.h b() {
        return kotlinx.serialization.descriptors.i.a.f130591a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean c() {
        return kotlinx.serialization.descriptors.f.a.g(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        Integer num = this.f130642i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.f e(int i10) {
        return p()[i10].a();
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
            if (kotlin.jvm.internal.f0.g(j(), fVar.j()) && Arrays.equals(q(), ((PluginGeneratedSerialDescriptor) obj).q()) && f() == fVar.f()) {
                int iF = f();
                for (int i10 = 0; i10 < iF; i10++) {
                    if (kotlin.jvm.internal.f0.g(e(i10).j(), fVar.e(i10).j()) && kotlin.jvm.internal.f0.g(e(i10).b(), fVar.e(i10).b())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int f() {
        return this.f130636c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean g() {
        return kotlinx.serialization.descriptors.f.a.f(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f130640g;
        return list == null ? CollectionsKt__CollectionsKt.E() : list;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String h(int i10) {
        return this.f130638e[i10];
    }

    public int hashCode() {
        return r();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> i(int i10) {
        List<Annotation> list = this.f130639f[i10];
        return list == null ? CollectionsKt__CollectionsKt.E() : list;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String j() {
        return this.f130634a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean k(int i10) {
        return this.f130641h[i10];
    }

    public final void m(@dl.d String name, boolean z10) {
        kotlin.jvm.internal.f0.p(name, "name");
        String[] strArr = this.f130638e;
        int i10 = this.f130637d + 1;
        this.f130637d = i10;
        strArr[i10] = name;
        this.f130641h[i10] = z10;
        this.f130639f[i10] = null;
        if (i10 == this.f130636c - 1) {
            this.f130642i = o();
        }
    }

    @dl.d
    public final kotlinx.serialization.descriptors.f[] q() {
        return (kotlinx.serialization.descriptors.f[]) this.f130644k.getValue();
    }

    public final void s(@dl.d Annotation annotation) {
        kotlin.jvm.internal.f0.p(annotation, "annotation");
        List<Annotation> arrayList = this.f130639f[this.f130637d];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.f130639f[this.f130637d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void t(@dl.d Annotation a10) {
        kotlin.jvm.internal.f0.p(a10, "a");
        if (this.f130640g == null) {
            this.f130640g = new ArrayList(1);
        }
        List<Annotation> list = this.f130640g;
        kotlin.jvm.internal.f0.m(list);
        list.add(a10);
    }

    @dl.d
    public String toString() {
        return CollectionsKt___CollectionsKt.h3(fi.u.W1(0, this.f130636c), ", ", j() + '(', ")", 0, null, new yh.l<Integer, CharSequence>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.toString.1
            {
                super(1);
            }

            @dl.d
            public final CharSequence a(int i10) {
                return PluginGeneratedSerialDescriptor.this.h(i10) + ": " + PluginGeneratedSerialDescriptor.this.e(i10).j();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
                return a(num.intValue());
            }
        }, 24, null);
    }
}
