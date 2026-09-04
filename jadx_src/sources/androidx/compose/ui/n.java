package androidx.compose.ui;

import androidx.compose.runtime.j2;
import androidx.compose.ui.node.NodeCoordinator;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0014J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/n;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/n$c;", "operation", "x", "(Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", "v", "Lkotlin/Function1;", "", "predicate", "t", "a0", "other", "s0", "k0", ak.av, ak.aF, "d", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface n {

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f15071b;

    /* JADX INFO: renamed from: androidx.compose.ui.n$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/n$a;", "Landroidx/compose/ui/n;", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/n$c;", "operation", "x", "(Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", "v", "Lkotlin/Function1;", "", "predicate", "t", "a0", "other", "s0", "", "toString", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion implements n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f15071b = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.n
        public boolean a0(@dl.d yh.l<? super c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return true;
        }

        @Override // androidx.compose.ui.n
        @dl.d
        public n s0(@dl.d n other) {
            f0.p(other, "other");
            return other;
        }

        @Override // androidx.compose.ui.n
        public boolean t(@dl.d yh.l<? super c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return false;
        }

        @dl.d
        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.n
        public <R> R v(R initial, @dl.d yh.p<? super c, ? super R, ? extends R> operation) {
            f0.p(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.ui.n
        public <R> R x(R initial, @dl.d yh.p<? super R, ? super c, ? extends R> operation) {
            f0.p(operation, "operation");
            return initial;
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        @dl.d
        @Deprecated
        public static n a(@dl.d n nVar, @dl.d n other) {
            f0.p(other, "other");
            return m.a(nVar, other);
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001c\u0010\r\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/n;", "R", "initial", "Lkotlin/Function2;", "operation", "x", "(Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", "v", "Lkotlin/Function1;", "", "predicate", "t", "a0", "ui_release"}, k = 1, mv = {1, 7, 1})
    public interface c extends n {

        /* JADX INFO: compiled from: Modifier.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a {
            @Deprecated
            public static boolean a(@dl.d c cVar, @dl.d yh.l<? super c, Boolean> predicate) {
                f0.p(predicate, "predicate");
                return o.a(cVar, predicate);
            }

            @Deprecated
            public static boolean b(@dl.d c cVar, @dl.d yh.l<? super c, Boolean> predicate) {
                f0.p(predicate, "predicate");
                return o.b(cVar, predicate);
            }

            @Deprecated
            public static <R> R c(@dl.d c cVar, R r10, @dl.d yh.p<? super R, ? super c, ? extends R> operation) {
                f0.p(operation, "operation");
                return (R) o.c(cVar, r10, operation);
            }

            @Deprecated
            public static <R> R d(@dl.d c cVar, R r10, @dl.d yh.p<? super c, ? super R, ? extends R> operation) {
                f0.p(operation, "operation");
                return (R) o.d(cVar, r10, operation);
            }

            @dl.d
            @Deprecated
            public static n e(@dl.d c cVar, @dl.d n other) {
                f0.p(other, "other");
                return m.a(cVar, other);
            }
        }

        @Override // androidx.compose.ui.n
        boolean a0(@dl.d yh.l<? super c, Boolean> lVar);

        @Override // androidx.compose.ui.n
        boolean t(@dl.d yh.l<? super c, Boolean> lVar);

        @Override // androidx.compose.ui.n
        <R> R v(R initial, @dl.d yh.p<? super c, ? super R, ? extends R> operation);

        @Override // androidx.compose.ui.n
        <R> R x(R initial, @dl.d yh.p<? super R, ? super c, ? extends R> operation);
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @g
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u001c\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010\rJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\rJ\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R$\u0010+\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u0016R$\u0010/\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010\u0016R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00108\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"Landroidx/compose/ui/n$d;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lkotlin/b2;", "O", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/node/v0;", "kind", "", androidx.exifinterface.media.a.S4, "(I)Z", "t", "()V", ak.aG, "F", "G", "Lkotlin/Function0;", "effect", "N", "owner", "I", "(Landroidx/compose/ui/n$d;)V", "<set-?>", "b", "Landroidx/compose/ui/n$d;", "e", "()Landroidx/compose/ui/n$d;", "getNode$annotations", "node", "", ak.aF, ak.aD, "()I", "K", "(I)V", "kindSet", "d", "v", "H", "aggregateChildKindSet", "B", "M", "parent", "f", "x", "J", "child", "g", "Landroidx/compose/ui/node/NodeCoordinator;", "y", "()Landroidx/compose/ui/node/NodeCoordinator;", RXScreenCaptureService.KEY_HEIGHT, "Z", "C", "()Z", "isAttached", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static abstract class d implements androidx.compose.ui.node.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f15072i = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private d node = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int kindSet;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int aggregateChildKindSet;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private d parent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private d child;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private NodeCoordinator coordinator;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isAttached;

        public static /* synthetic */ void A() {
        }

        @dl.e
        /* JADX INFO: renamed from: B, reason: from getter */
        public final d getParent() {
            return this.parent;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public final boolean E(int kind) {
            return (kind & getKindSet()) != 0;
        }

        public void F() {
        }

        public void G() {
        }

        public final void H(int i10) {
            this.aggregateChildKindSet = i10;
        }

        public final void I(@dl.d d owner) {
            f0.p(owner, "owner");
            this.node = owner;
        }

        public final void J(@dl.e d dVar) {
            this.child = dVar;
        }

        public final void K(int i10) {
            this.kindSet = i10;
        }

        public final void M(@dl.e d dVar) {
            this.parent = dVar;
        }

        public final void N(@dl.d yh.a<b2> effect) {
            f0.p(effect, "effect");
            androidx.compose.ui.node.d.l(this).n(effect);
        }

        public void O(@dl.e NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        @Override // androidx.compose.ui.node.c
        @dl.d
        /* JADX INFO: renamed from: e, reason: from getter */
        public final d getNode() {
            return this.node;
        }

        public final void t() {
            if (!(!this.isAttached)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(this.coordinator != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.isAttached = true;
            F();
        }

        public final void u() {
            if (!this.isAttached) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(this.coordinator != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            G();
            this.isAttached = false;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        @dl.e
        /* JADX INFO: renamed from: x, reason: from getter */
        public final d getChild() {
            return this.child;
        }

        @dl.e
        /* JADX INFO: renamed from: y, reason: from getter */
        public final NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }
    }

    boolean a0(@dl.d yh.l<? super c, Boolean> lVar);

    @dl.d
    n s0(@dl.d n other);

    boolean t(@dl.d yh.l<? super c, Boolean> lVar);

    <R> R v(R initial, @dl.d yh.p<? super c, ? super R, ? extends R> operation);

    <R> R x(R initial, @dl.d yh.p<? super R, ? super c, ? extends R> operation);
}
