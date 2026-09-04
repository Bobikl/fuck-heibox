package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import dl.e;
import java.util.Set;
import kotlin.collections.c1;
import kotlin.collections.e1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w;

/* JADX INFO: compiled from: JavaTypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final TypeUsage f126278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final JavaTypeFlexibility f126279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f126280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f126281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private final Set<y0> f126282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private final j0 f126283i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@dl.d TypeUsage howThisTypeIsUsed, @dl.d JavaTypeFlexibility flexibility, boolean z10, boolean z11, @e Set<? extends y0> set, @e j0 j0Var) {
        super(howThisTypeIsUsed, set, j0Var);
        f0.p(howThisTypeIsUsed, "howThisTypeIsUsed");
        f0.p(flexibility, "flexibility");
        this.f126278d = howThisTypeIsUsed;
        this.f126279e = flexibility;
        this.f126280f = z10;
        this.f126281g = z11;
        this.f126282h = set;
        this.f126283i = j0Var;
    }

    public /* synthetic */ a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z10, boolean z11, Set set, j0 j0Var, int i10, u uVar) {
        this(typeUsage, (i10 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : j0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a f(a aVar, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z10, boolean z11, Set set, j0 j0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeUsage = aVar.b();
        }
        if ((i10 & 2) != 0) {
            javaTypeFlexibility = aVar.f126279e;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i10 & 4) != 0) {
            z10 = aVar.f126280f;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = aVar.f126281g;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            set = aVar.c();
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            j0Var = aVar.a();
        }
        return aVar.e(typeUsage, javaTypeFlexibility2, z12, z13, set2, j0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w
    @e
    public j0 a() {
        return this.f126283i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w
    @dl.d
    public TypeUsage b() {
        return this.f126278d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w
    @e
    public Set<y0> c() {
        return this.f126282h;
    }

    @dl.d
    public final a e(@dl.d TypeUsage howThisTypeIsUsed, @dl.d JavaTypeFlexibility flexibility, boolean z10, boolean z11, @e Set<? extends y0> set, @e j0 j0Var) {
        f0.p(howThisTypeIsUsed, "howThisTypeIsUsed");
        f0.p(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z10, z11, set, j0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w
    public boolean equals(@e Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f0.g(aVar.a(), a()) && aVar.b() == b() && aVar.f126279e == this.f126279e && aVar.f126280f == this.f126280f && aVar.f126281g == this.f126281g;
    }

    @dl.d
    public final JavaTypeFlexibility g() {
        return this.f126279e;
    }

    public final boolean h() {
        return this.f126281g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w
    public int hashCode() {
        j0 j0VarA = a();
        int iHashCode = j0VarA != null ? j0VarA.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f126279e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f126280f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f126281g ? 1 : 0);
    }

    public final boolean i() {
        return this.f126280f;
    }

    @dl.d
    public final a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    @dl.d
    public a k(@e j0 j0Var) {
        return f(this, null, null, false, false, null, j0Var, 31, null);
    }

    @dl.d
    public final a l(@dl.d JavaTypeFlexibility flexibility) {
        f0.p(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(@dl.d y0 typeParameter) {
        f0.p(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? e1.D(c(), typeParameter) : c1.f(typeParameter), null, 47, null);
    }

    @dl.d
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + b() + ", flexibility=" + this.f126279e + ", isRaw=" + this.f126280f + ", isForAnnotationParameter=" + this.f126281g + ", visitedTypeParameters=" + c() + ", defaultType=" + a() + ')';
    }
}
