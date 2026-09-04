package kotlin.reflect.jvm.internal.impl.descriptors;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Map;

/* JADX INFO: compiled from: Visibilities.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f1 f125614a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Map<g1, Integer> f125615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final h f125616c;

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class a extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final a f125617c = new a();

        private a() {
            super("inherited", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class b extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final b f125618c = new b();

        private b() {
            super(UMModuleRegister.INNER, false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class c extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final c f125619c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class d extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final d f125620c = new d();

        private d() {
            super("local", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class e extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final e f125621c = new e();

        private e() {
            super("private", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class f extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final f f125622c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @dl.d
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class g extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final g f125623c = new g();

        private g() {
            super("protected", true);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class h extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final h f125624c = new h();

        private h() {
            super("public", true);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class i extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final i f125625c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapG = kotlin.collections.r0.g();
        mapG.put(f.f125622c, 0);
        mapG.put(e.f125621c, 0);
        mapG.put(b.f125618c, 1);
        mapG.put(g.f125623c, 1);
        h hVar = h.f125624c;
        mapG.put(hVar, 2);
        f125615b = kotlin.collections.r0.d(mapG);
        f125616c = hVar;
    }

    private f1() {
    }

    @dl.e
    public final Integer a(@dl.d g1 first, @dl.d g1 second) {
        kotlin.jvm.internal.f0.p(first, "first");
        kotlin.jvm.internal.f0.p(second, "second");
        if (first == second) {
            return 0;
        }
        Map<g1, Integer> map = f125615b;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || kotlin.jvm.internal.f0.g(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(@dl.d g1 visibility) {
        kotlin.jvm.internal.f0.p(visibility, "visibility");
        return visibility == e.f125621c || visibility == f.f125622c;
    }
}
