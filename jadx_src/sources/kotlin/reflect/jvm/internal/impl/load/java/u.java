package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.e1;
import kotlin.collections.s0;

/* JADX INFO: compiled from: JvmAnnotationNames.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final List<kotlin.reflect.jvm.internal.impl.name.c> f126421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final List<kotlin.reflect.jvm.internal.impl.name.c> f126424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f126429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f126430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f126431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> f126432o;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.nullness.Nullable");
        f126418a = cVar;
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.nullness.NullnessUnspecified");
        f126419b = cVar2;
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.nullness.NullMarked");
        f126420c = cVar3;
        List<kotlin.reflect.jvm.internal.impl.name.c> listL = CollectionsKt__CollectionsKt.L(t.f126320l, new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("android.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("com.android.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("org.eclipse.jdt.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.qual.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.CheckForNull"), new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.rxjava3.annotations.Nullable"));
        f126421d = listL;
        kotlin.reflect.jvm.internal.impl.name.c cVar4 = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.Nonnull");
        f126422e = cVar4;
        f126423f = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.CheckForNull");
        List<kotlin.reflect.jvm.internal.impl.name.c> listL2 = CollectionsKt__CollectionsKt.L(t.f126319k, new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("android.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("com.android.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("org.eclipse.jdt.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.qual.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("lombok.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.rxjava3.annotations.NonNull"));
        f126424g = listL2;
        kotlin.reflect.jvm.internal.impl.name.c cVar5 = new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        f126425h = cVar5;
        kotlin.reflect.jvm.internal.impl.name.c cVar6 = new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        f126426i = cVar6;
        kotlin.reflect.jvm.internal.impl.name.c cVar7 = new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.RecentlyNullable");
        f126427j = cVar7;
        kotlin.reflect.jvm.internal.impl.name.c cVar8 = new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.RecentlyNonNull");
        f126428k = cVar8;
        f126429l = e1.D(e1.D(e1.D(e1.D(e1.D(e1.D(e1.D(e1.C(e1.D(e1.C(new LinkedHashSet(), listL), cVar4), listL2), cVar5), cVar6), cVar7), cVar8), cVar), cVar2), cVar3);
        f126430m = d1.u(t.f126322n, t.f126323o);
        f126431n = d1.u(t.f126321m, t.f126324p);
        f126432o = s0.W(c1.a(t.f126312d, kotlin.reflect.jvm.internal.impl.builtins.h.a.H), c1.a(t.f126314f, kotlin.reflect.jvm.internal.impl.builtins.h.a.L), c1.a(t.f126316h, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125466y), c1.a(t.f126317i, kotlin.reflect.jvm.internal.impl.builtins.h.a.P));
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c a() {
        return f126428k;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c b() {
        return f126427j;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c c() {
        return f126426i;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c d() {
        return f126425h;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c e() {
        return f126423f;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c f() {
        return f126422e;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c g() {
        return f126418a;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c h() {
        return f126419b;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c i() {
        return f126420c;
    }

    @dl.d
    public static final Set<kotlin.reflect.jvm.internal.impl.name.c> j() {
        return f126431n;
    }

    @dl.d
    public static final List<kotlin.reflect.jvm.internal.impl.name.c> k() {
        return f126424g;
    }

    @dl.d
    public static final List<kotlin.reflect.jvm.internal.impl.name.c> l() {
        return f126421d;
    }

    @dl.d
    public static final Set<kotlin.reflect.jvm.internal.impl.name.c> m() {
        return f126430m;
    }
}
