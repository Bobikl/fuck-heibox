package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.k;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f130561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f130562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private List<? extends Annotation> f130563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<String> f130564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Set<String> f130565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<f> f130566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<List<Annotation>> f130567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<Boolean> f130568h;

    public a(@dl.d String serialName) {
        f0.p(serialName, "serialName");
        this.f130561a = serialName;
        this.f130563c = CollectionsKt__CollectionsKt.E();
        this.f130564d = new ArrayList();
        this.f130565e = new HashSet();
        this.f130566f = new ArrayList();
        this.f130567g = new ArrayList();
        this.f130568h = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, fVar, list, z10);
    }

    @kotlinx.serialization.d
    public static /* synthetic */ void d() {
    }

    @k(level = DeprecationLevel.ERROR, message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.")
    @kotlinx.serialization.d
    public static /* synthetic */ void k() {
    }

    public final void a(@dl.d String elementName, @dl.d f descriptor, @dl.d List<? extends Annotation> annotations, boolean z10) {
        f0.p(elementName, "elementName");
        f0.p(descriptor, "descriptor");
        f0.p(annotations, "annotations");
        if (this.f130565e.add(elementName)) {
            this.f130564d.add(elementName);
            this.f130566f.add(descriptor);
            this.f130567g.add(annotations);
            this.f130568h.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f130561a).toString());
    }

    @dl.d
    public final List<Annotation> c() {
        return this.f130563c;
    }

    @dl.d
    public final List<List<Annotation>> e() {
        return this.f130567g;
    }

    @dl.d
    public final List<f> f() {
        return this.f130566f;
    }

    @dl.d
    public final List<String> g() {
        return this.f130564d;
    }

    @dl.d
    public final List<Boolean> h() {
        return this.f130568h;
    }

    @dl.d
    public final String i() {
        return this.f130561a;
    }

    public final boolean j() {
        return this.f130562b;
    }

    public final void l(@dl.d List<? extends Annotation> list) {
        f0.p(list, "<set-?>");
        this.f130563c = list;
    }

    public final void m(boolean z10) {
        this.f130562b = z10;
    }
}
