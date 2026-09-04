package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000  2\u00020\u0001:\u0001 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\t\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\u0004H'J\b\u0010\u000b\u001a\u00020\u0004H'J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH'J\u001e\u0010\u0012\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H'J$\u0010\u0017\u001a\u00020\u00042\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H'J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H'J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH'J\b\u0010!\u001a\u00020\u0004H'J\b\u0010\"\u001a\u00020\u0004H'J\b\u0010#\u001a\u00020\u0004H'J\u001c\u0010&\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H'J\b\u0010'\u001a\u00020\u0004H'J\b\u0010(\u001a\u00020\u0004H'J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010*\u001a\u00020\u0004H'J\b\u0010+\u001a\u00020\u0004H'J\b\u0010,\u001a\u00020\u0004H'JB\u00101\u001a\u00020\u0004\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u001d\u00100\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040.¢\u0006\u0002\b/H'¢\u0006\u0004\b1\u00102J\u001c\u00105\u001a\u00020\u00012\b\u00103\u001a\u0004\u0018\u00010\u00012\b\u00104\u001a\u0004\u0018\u00010\u0001H'J\n\u00106\u001a\u0004\u0018\u00010\u0001H'J\u0012\u00107\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H'J\u0012\u00108\u001a\u00020\u001e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H'J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u001eH\u0017J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020:H\u0017J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020<H\u0017J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020>H\u0017J\u0010\u0010@\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0017J\u0010\u0010B\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020AH\u0017J\u0010\u0010D\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020CH\u0017J\u0010\u0010F\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020EH\u0017J\u0010\u0010I\u001a\u00020\u00042\u0006\u0010H\u001a\u00020GH'J\u0016\u0010K\u001a\u00020\u00042\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040$H'J#\u0010M\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000LH'¢\u0006\u0004\bM\u0010NJ#\u0010R\u001a\u00020\u00042\u0012\u0010Q\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030P0OH'¢\u0006\u0004\bR\u0010SJ\b\u0010T\u001a\u00020\u0004H'J\b\u0010U\u001a\u00020\u0004H&J\b\u0010W\u001a\u00020VH'R\u001e\u0010]\u001a\u0006\u0012\u0002\b\u00030X8&X§\u0004¢\u0006\f\u0012\u0004\b[\u0010\\\u001a\u0004\bY\u0010ZR\u001a\u0010a\u001a\u00020\u001e8&X§\u0004¢\u0006\f\u0012\u0004\b`\u0010\\\u001a\u0004\b^\u0010_R\u001a\u0010d\u001a\u00020\u001e8&X§\u0004¢\u0006\f\u0012\u0004\bc\u0010\\\u001a\u0004\bb\u0010_R\u001a\u0010g\u001a\u00020\u001e8&X§\u0004¢\u0006\f\u0012\u0004\bf\u0010\\\u001a\u0004\be\u0010_R\u001c\u0010k\u001a\u0004\u0018\u00010G8&X§\u0004¢\u0006\f\u0012\u0004\bj\u0010\\\u001a\u0004\bh\u0010iR\u001c\u0010o\u001a\u0004\u0018\u00010\u00018&X§\u0004¢\u0006\f\u0012\u0004\bn\u0010\\\u001a\u0004\bl\u0010mR\u001a\u0010s\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\br\u0010\\\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010uR\u001a\u0010{\u001a\u00020w8fX§\u0004¢\u0006\f\u0012\u0004\bz\u0010\\\u001a\u0004\bx\u0010yR\u0014\u0010\u007f\u001a\u00020|8fX¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~\u0082\u0001\u0002\u0080\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0081\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/p;", "", "", "key", "Lkotlin/b2;", androidx.exifinterface.media.a.f23244d5, "c0", "dataKey", "X", "b0", androidx.exifinterface.media.a.T4, "O", "F", "Landroidx/compose/runtime/u1;", "H", "Landroidx/compose/runtime/x0;", "value", "parameter", "P", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/z0;", "references", ak.aF, "", "sourceInformation", "k", "m", "r", "l", "", "changed", ak.av, androidx.exifinterface.media.a.S4, "J", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/Function0;", "factory", "L", "d", "f", "i", androidx.exifinterface.media.a.R4, "Y", "x", androidx.exifinterface.media.a.X4, "Lkotlin/Function2;", "Lkotlin/t;", "block", "e", "(Ljava/lang/Object;Lyh/p;)V", com.google.android.exoplayer2.text.ttml.d.f49793l0, com.google.android.exoplayer2.text.ttml.d.f49796n0, "I", "U", "N", ak.aB, ak.aG, "", "B", "", androidx.exifinterface.media.a.W4, "", "v", "y", "", RXScreenCaptureService.KEY_WIDTH, "", ak.aD, "", "C", "Landroidx/compose/runtime/n1;", "scope", "p", "effect", "g", "Landroidx/compose/runtime/v;", "K", "(Landroidx/compose/runtime/v;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/k1;", "values", "t", "([Landroidx/compose/runtime/k1;)V", "Z", "Q", "Landroidx/compose/runtime/r;", "q", "Landroidx/compose/runtime/e;", "G", "()Landroidx/compose/runtime/e;", "getApplier$annotations", "()V", "applier", "D", "()Z", "getInserting$annotations", "inserting", "b", "getSkipping$annotations", "skipping", "o", "getDefaultsInvalid$annotations", "defaultsInvalid", "R", "()Landroidx/compose/runtime/n1;", "getRecomposeScope$annotations", "recomposeScope", "j", "()Ljava/lang/Object;", "getRecomposeScopeIdentity$annotations", "recomposeScopeIdentity", "a0", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/tooling/b;", "()Landroidx/compose/runtime/tooling/b;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "M", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/z;", "n", "()Landroidx/compose/runtime/z;", "composition", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f13047a;

    /* JADX INFO: renamed from: androidx.compose.runtime.p$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\t\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/p$a;", "", "Landroidx/compose/runtime/y;", "tracer", "Lkotlin/b2;", "b", "Ljava/lang/Object;", ak.av, "()Ljava/lang/Object;", "Empty", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f13047a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final Object Empty = new C0077a();

        /* JADX INFO: renamed from: androidx.compose.runtime.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Composer.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/runtime/p$a$a", "", "", "toString", "runtime_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0077a {
            C0077a() {
            }

            @dl.d
            public String toString() {
                return "Empty";
            }
        }

        private Companion() {
        }

        @dl.d
        public final Object a() {
            return Empty;
        }

        @p0
        public final void b(@dl.d y tracer) {
            kotlin.jvm.internal.f0.p(tracer, "tracer");
            ComposerKt.f12320a = tracer;
        }
    }

    @m
    boolean A(byte value);

    @m
    boolean B(char value);

    @m
    boolean C(double value);

    boolean D();

    @m
    void E();

    @dl.d
    @m
    p F(int key);

    @dl.d
    e<?> G();

    @m
    @dl.e
    u1 H();

    @dl.d
    @m
    Object I(@dl.e Object left, @dl.e Object right);

    @m
    void J();

    @o0
    <T> T K(@dl.d v<T> key);

    @m
    <T> void L(@dl.d yh.a<? extends T> aVar);

    @dl.d
    CoroutineContext M();

    @m
    void N(@dl.e Object obj);

    @m
    void O();

    @o0
    void P(@dl.d x0<?> x0Var, @dl.e Object obj);

    void Q();

    @dl.e
    n1 R();

    @m
    void S();

    @m
    void T(int i10);

    @m
    @dl.e
    Object U();

    @dl.d
    androidx.compose.runtime.tooling.b V();

    @m
    void W();

    @m
    void X(int i10, @dl.e Object obj);

    @m
    void Y();

    @o0
    void Z();

    @m
    void a(boolean z10);

    int a0();

    boolean b();

    @m
    void b0();

    @o0
    void c(@dl.d List<Pair<z0, z0>> list);

    @m
    void c0();

    @m
    void d();

    @m
    <V, T> void e(V value, @dl.d yh.p<? super T, ? super V, kotlin.b2> block);

    @m
    void f();

    @o0
    void g(@dl.d yh.a<kotlin.b2> aVar);

    @m
    void h();

    @m
    void i(int i10, @dl.e Object obj);

    @dl.e
    Object j();

    void k(@dl.d String str);

    @m
    void l();

    void m(int i10, @dl.d String str);

    @dl.d
    z n();

    boolean o();

    @o0
    void p(@dl.d n1 n1Var);

    @o0
    @dl.d
    r q();

    void r();

    @m
    boolean s(@dl.e Object value);

    @o0
    void t(@dl.d k1<?>[] values);

    @m
    boolean u(boolean value);

    @m
    boolean v(short value);

    @m
    boolean w(float value);

    @m
    void x();

    @m
    boolean y(int value);

    @m
    boolean z(long value);
}
