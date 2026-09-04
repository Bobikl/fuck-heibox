package androidx.compose.ui.node;

import com.meituan.robust.Constants;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001:\u0002EKB\u000f\u0012\u0006\u0010I\u001a\u00020D¢\u0006\u0004\bi\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J0\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J<\u0010\u0011\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J \u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0019\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0002J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&J\u000f\u0010)\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*JE\u00101\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010+\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/0.H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b1\u00102JC\u00103\u001a\u00020\u0002\"\u0006\b\u0000\u0010+\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020.H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b3\u00104J/\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000e2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020.H\u0080\bø\u0001\u0000¢\u0006\u0004\b6\u00104J'\u00107\u001a\u00020\u00022\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020.H\u0080\bø\u0001\u0000¢\u0006\u0004\b7\u00108J'\u00109\u001a\u00020\u00022\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020.H\u0080\bø\u0001\u0000¢\u0006\u0004\b9\u00108JC\u0010:\u001a\u00020\u0002\"\u0006\b\u0000\u0010+\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020.H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b:\u00104J/\u0010;\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000e2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020.H\u0080\bø\u0001\u0000¢\u0006\u0004\b;\u00104J'\u0010<\u001a\u00020\u00022\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020.H\u0080\bø\u0001\u0000¢\u0006\u0004\b<\u00108J.\u0010=\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010+\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b=\u0010>J.\u0010?\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010+\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b?\u0010>J!\u0010@\u001a\u00020/2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b@\u0010AJ\b\u0010C\u001a\u00020BH\u0016R\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010O\u001a\u00020J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010V\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR$\u0010\\\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\"\u0010ZR\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010]R\u001e\u0010_\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010]R\u001c\u0010a\u001a\b\u0018\u00010\fR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010`R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010bR\u0014\u0010e\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006k"}, d2 = {"Landroidx/compose/ui/node/t0;", "", "Lkotlin/b2;", androidx.exifinterface.media.a.W4, "J", androidx.exifinterface.media.a.S4, "Landroidx/compose/ui/n$d;", "tail", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/ui/n$c;", com.google.android.exoplayer2.text.ttml.d.f49784c0, com.google.android.exoplayer2.text.ttml.d.f49785d0, "Landroidx/compose/ui/node/t0$a;", "l", "", "beforeSize", "afterSize", "D", "prev", "next", "C", "node", "i", "B", "element", "child", "g", "y", "L", "Landroidx/compose/ui/node/t0$b;", "logger", "M", "(Landroidx/compose/ui/node/t0$b;)V", "Landroidx/compose/ui/n;", "m", "K", "(Landroidx/compose/ui/n;)V", "f", "", "Landroidx/compose/ui/layout/o0;", "p", RXScreenCaptureService.KEY_HEIGHT, "()V", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/node/v0;", "type", "Lkotlin/Function1;", "", "block", "j", "(ILyh/l;)Ljava/lang/Object;", RXScreenCaptureService.KEY_WIDTH, "(ILyh/l;)V", "mask", ak.aG, "v", "(Lyh/l;)V", "x", "I", "G", "H", "F", "(I)Ljava/lang/Object;", "t", ak.aB, "(I)Z", "", "toString", "Landroidx/compose/ui/node/LayoutNode;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "o", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/m;", "b", "Landroidx/compose/ui/node/m;", "n", "()Landroidx/compose/ui/node/m;", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", ak.aF, "Landroidx/compose/ui/node/NodeCoordinator;", "q", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "d", "Landroidx/compose/ui/n$d;", "r", "()Landroidx/compose/ui/n$d;", "e", "head", "Landroidx/compose/runtime/collection/e;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "buffer", "Landroidx/compose/ui/node/t0$a;", "cachedDiffer", "Landroidx/compose/ui/node/t0$b;", ak.aD, "()Z", "isUpdating", "k", "()I", "aggregateChildKindSet", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m innerCoordinator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private NodeCoordinator outerCoordinator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.n.d tail;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.n.d head;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> current;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> buffer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private a cachedDiffer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private b logger;

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/t0$a;", "Landroidx/compose/ui/node/e;", "", "oldIndex", "newIndex", "", ak.av, "atIndex", "Lkotlin/b2;", "b", "remove", ak.aF, "Landroidx/compose/ui/n$d;", "Landroidx/compose/ui/n$d;", "g", "()Landroidx/compose/ui/n$d;", "k", "(Landroidx/compose/ui/n$d;)V", "node", "I", "e", "()I", "i", "(I)V", "aggregateChildKindSet", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/runtime/collection/e;", "f", "()Landroidx/compose/runtime/collection/e;", "j", "(Landroidx/compose/runtime/collection/e;)V", com.google.android.exoplayer2.text.ttml.d.f49784c0, "d", RXScreenCaptureService.KEY_HEIGHT, com.google.android.exoplayer2.text.ttml.d.f49785d0, "<init>", "(Landroidx/compose/ui/node/t0;Landroidx/compose/ui/n$d;ILandroidx/compose/runtime/collection/e;Landroidx/compose/runtime/collection/e;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private androidx.compose.ui.n.d node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int aggregateChildKindSet;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> before;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> after;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t0 f15390e;

        public a(@dl.d t0 t0Var, androidx.compose.ui.n.d node, @dl.d int i10, @dl.d androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> before, androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> after) {
            kotlin.jvm.internal.f0.p(node, "node");
            kotlin.jvm.internal.f0.p(before, "before");
            kotlin.jvm.internal.f0.p(after, "after");
            this.f15390e = t0Var;
            this.node = node;
            this.aggregateChildKindSet = i10;
            this.before = before;
            this.after = after;
        }

        @Override // androidx.compose.ui.node.e
        public boolean a(int oldIndex, int newIndex) {
            return NodeChainKt.e(this.before.G()[oldIndex], this.after.G()[newIndex]) != 0;
        }

        @Override // androidx.compose.ui.node.e
        public void b(int i10, int i11) {
            androidx.compose.ui.n.d dVar = this.node;
            this.node = this.f15390e.g(this.after.G()[i11], dVar);
            b bVar = this.f15390e.logger;
            if (bVar != null) {
                bVar.b(i10, i11, this.after.G()[i11], dVar, this.node);
            }
            int kindSet = this.aggregateChildKindSet | this.node.getKindSet();
            this.aggregateChildKindSet = kindSet;
            this.node.H(kindSet);
        }

        @Override // androidx.compose.ui.node.e
        public void c(int i10, int i11) {
            androidx.compose.ui.n.d parent = this.node.getParent();
            kotlin.jvm.internal.f0.m(parent);
            this.node = parent;
            androidx.compose.ui.n.c cVar = this.before.G()[i10];
            androidx.compose.ui.n.c cVar2 = this.after.G()[i11];
            if (kotlin.jvm.internal.f0.g(cVar, cVar2)) {
                b bVar = this.f15390e.logger;
                if (bVar != null) {
                    bVar.e(i10, i11, cVar, cVar2, this.node);
                }
            } else {
                androidx.compose.ui.n.d dVar = this.node;
                this.node = this.f15390e.L(cVar, cVar2, dVar);
                b bVar2 = this.f15390e.logger;
                if (bVar2 != null) {
                    bVar2.a(i10, i11, cVar, cVar2, dVar, this.node);
                }
            }
            int kindSet = this.aggregateChildKindSet | this.node.getKindSet();
            this.aggregateChildKindSet = kindSet;
            this.node.H(kindSet);
        }

        @dl.d
        public final androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> d() {
            return this.after;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        @dl.d
        public final androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> f() {
            return this.before;
        }

        @dl.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public final androidx.compose.ui.n.d getNode() {
            return this.node;
        }

        public final void h(@dl.d androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar) {
            kotlin.jvm.internal.f0.p(eVar, "<set-?>");
            this.after = eVar;
        }

        public final void i(int i10) {
            this.aggregateChildKindSet = i10;
        }

        public final void j(@dl.d androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar) {
            kotlin.jvm.internal.f0.p(eVar, "<set-?>");
            this.before = eVar;
        }

        public final void k(@dl.d androidx.compose.ui.n.d dVar) {
            kotlin.jvm.internal.f0.p(dVar, "<set-?>");
            this.node = dVar;
        }

        @Override // androidx.compose.ui.node.e
        public void remove(int i10) {
            androidx.compose.ui.n.d parent = this.node.getParent();
            kotlin.jvm.internal.f0.m(parent);
            this.node = parent;
            b bVar = this.f15390e.logger;
            if (bVar != null) {
                bVar.d(i10, this.before.G()[i10], this.node);
            }
            this.node = this.f15390e.i(this.node);
        }
    }

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J8\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H&J0\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/t0$b;", "", "", UCropPlusActivity.ARG_INDEX, "Landroidx/compose/ui/n$c;", "prev", "next", "Landroidx/compose/ui/n$d;", "node", "Lkotlin/b2;", ak.aF, "oldIndex", "newIndex", com.google.android.exoplayer2.text.ttml.d.f49784c0, com.google.android.exoplayer2.text.ttml.d.f49785d0, ak.av, "e", "atIndex", "element", "child", "inserted", "b", "d", "ui_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        void a(int i10, int i11, @dl.d androidx.compose.ui.n.c cVar, @dl.d androidx.compose.ui.n.c cVar2, @dl.d androidx.compose.ui.n.d dVar, @dl.d androidx.compose.ui.n.d dVar2);

        void b(int i10, int i11, @dl.d androidx.compose.ui.n.c cVar, @dl.d androidx.compose.ui.n.d dVar, @dl.d androidx.compose.ui.n.d dVar2);

        void c(int i10, @dl.d androidx.compose.ui.n.c cVar, @dl.d androidx.compose.ui.n.c cVar2, @dl.d androidx.compose.ui.n.d dVar);

        void d(int i10, @dl.d androidx.compose.ui.n.c cVar, @dl.d androidx.compose.ui.n.d dVar);

        void e(int i10, int i11, @dl.d androidx.compose.ui.n.c cVar, @dl.d androidx.compose.ui.n.c cVar2, @dl.d androidx.compose.ui.n.d dVar);
    }

    public t0(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        m mVar = new m(layoutNode);
        this.innerCoordinator = mVar;
        this.outerCoordinator = mVar;
        androidx.compose.ui.n.d dVarT2 = mVar.getTail();
        this.tail = dVarT2;
        this.head = dVarT2;
    }

    private final void A() {
        if (!(this.head != NodeChainKt.f15228a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d dVar = this.head;
        dVar.M(NodeChainKt.f15228a);
        NodeChainKt.f15228a.J(dVar);
        this.head = NodeChainKt.f15228a;
    }

    private final androidx.compose.ui.n.d B(androidx.compose.ui.n.d node) {
        androidx.compose.ui.n.d child = node.getChild();
        androidx.compose.ui.n.d parent = node.getParent();
        if (child != null) {
            child.M(parent);
            node.J(null);
        }
        if (parent != null) {
            parent.J(child);
            node.M(null);
        }
        kotlin.jvm.internal.f0.m(child);
        return child;
    }

    private final androidx.compose.ui.n.d C(androidx.compose.ui.n.d prev, androidx.compose.ui.n.d next) {
        androidx.compose.ui.n.d parent = prev.getParent();
        if (parent != null) {
            next.M(parent);
            parent.J(next);
            prev.M(null);
        }
        androidx.compose.ui.n.d child = prev.getChild();
        if (child != null) {
            next.J(child);
            child.M(next);
            prev.J(null);
        }
        next.O(prev.getCoordinator());
        return next;
    }

    private final void D(androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar, int i10, androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar2, int i11, androidx.compose.ui.n.d dVar) {
        r0.e(i10, i11, l(dVar, eVar, eVar2));
    }

    private final void E() {
        NodeCoordinator wVar;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (androidx.compose.ui.n.d parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            if (((x0.f15398a.e() & parent.getKindSet()) != 0) && (parent instanceof v)) {
                if (parent.getIsAttached()) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    kotlin.jvm.internal.f0.n(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    wVar = (w) coordinator;
                    v vVarQ3 = wVar.getLayoutModifierNode();
                    wVar.S3((v) parent);
                    if (vVarQ3 != parent) {
                        wVar.m3();
                    }
                } else {
                    wVar = new w(this.layoutNode, (v) parent);
                    parent.O(wVar);
                }
                nodeCoordinator.z3(wVar);
                wVar.y3(nodeCoordinator);
                nodeCoordinator = wVar;
            } else {
                parent.O(nodeCoordinator);
            }
        }
        LayoutNode layoutNodeV0 = this.layoutNode.v0();
        nodeCoordinator.z3(layoutNodeV0 != null ? layoutNodeV0.Y() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    private final void J() {
        if (!(this.head == NodeChainKt.f15228a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d child = NodeChainKt.f15228a.getChild();
        if (child == null) {
            child = this.tail;
        }
        this.head = child;
        child.M(null);
        NodeChainKt.f15228a.J(null);
        if (!(this.head != NodeChainKt.f15228a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.n.d L(androidx.compose.ui.n.c prev, androidx.compose.ui.n.c next, androidx.compose.ui.n.d node) {
        if (!(prev instanceof o0) || !(next instanceof o0)) {
            if (!(node instanceof BackwardsCompatNode)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            ((BackwardsCompatNode) node).X(next);
            return node;
        }
        androidx.compose.ui.n.d dVarF = NodeChainKt.f((o0) next, node);
        if (dVarF == node) {
            return dVarF;
        }
        node.u();
        return C(node, dVarF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.n.d g(androidx.compose.ui.n.c element, androidx.compose.ui.n.d child) {
        androidx.compose.ui.n.d backwardsCompatNode;
        if (element instanceof o0) {
            backwardsCompatNode = ((o0) element).f();
            backwardsCompatNode.K(w0.b(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        return y(backwardsCompatNode, child);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.n.d i(androidx.compose.ui.n.d node) {
        if (node.getIsAttached()) {
            node.u();
        }
        return B(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k() {
        return this.head.getAggregateChildKindSet();
    }

    private final a l(androidx.compose.ui.n.d tail, androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> before, androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> after) {
        a aVar = this.cachedDiffer;
        if (aVar == null) {
            a aVar2 = new a(this, tail, tail.getAggregateChildKindSet(), before, after);
            this.cachedDiffer = aVar2;
            return aVar2;
        }
        aVar.k(tail);
        aVar.i(tail.getAggregateChildKindSet());
        aVar.j(before);
        aVar.h(after);
        return aVar;
    }

    private final androidx.compose.ui.n.d y(androidx.compose.ui.n.d node, androidx.compose.ui.n.d child) {
        androidx.compose.ui.n.d parent = child.getParent();
        if (parent != null) {
            parent.J(node);
            node.M(parent);
        }
        child.M(node);
        node.J(child);
        return node;
    }

    private final boolean z() {
        return this.head == NodeChainKt.f15228a;
    }

    public final /* synthetic */ <T> T F(int type) {
        if ((k() & type) == 0) {
            return null;
        }
        for (Object obj = (T) getTail(); obj != null; obj = (T) ((androidx.compose.ui.n.d) obj).getParent()) {
            if ((((androidx.compose.ui.n.d) obj).getKindSet() & type) != 0) {
                kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                return (T) obj;
            }
        }
        return null;
    }

    public final void G(int mask, @dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if ((k() & mask) == 0) {
            return;
        }
        for (androidx.compose.ui.n.d tail = getTail(); tail != null; tail = tail.getParent()) {
            if ((tail.getKindSet() & mask) != 0) {
                block.invoke(tail);
            }
        }
    }

    public final void H(@dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        for (androidx.compose.ui.n.d tail = getTail(); tail != null; tail = tail.getParent()) {
            block.invoke(tail);
        }
    }

    public final /* synthetic */ <T> void I(int type, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if ((k() & type) != 0) {
            for (androidx.compose.ui.n.d tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                    block.invoke(tail);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    public final void K(@dl.d androidx.compose.ui.n m10) {
        b bVar;
        kotlin.jvm.internal.f0.p(m10, "m");
        A();
        androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar = this.current;
        int kindSet = 0;
        if (eVar == null) {
            eVar = new androidx.compose.runtime.collection.e<>(new androidx.compose.ui.n.c[16], 0);
        }
        androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar2 = eVar;
        androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar3 = this.buffer;
        if (eVar3 == null) {
            eVar3 = new androidx.compose.runtime.collection.e<>(new androidx.compose.ui.n.c[16], 0);
        }
        androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVarD = NodeChainKt.d(m10, eVar3);
        boolean z10 = true;
        if (eVarD.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() == eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) {
            int iK = eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            androidx.compose.ui.n.d parent = this.tail.getParent();
            int i10 = iK - 1;
            boolean z11 = false;
            int kindSet2 = 0;
            while (parent != null && i10 >= 0) {
                androidx.compose.ui.n.c cVar = eVar2.G()[i10];
                androidx.compose.ui.n.c cVar2 = eVarD.G()[i10];
                int iE = NodeChainKt.e(cVar, cVar2);
                if (iE == 0) {
                    b bVar2 = this.logger;
                    if (bVar2 != null) {
                        bVar2.c(i10, cVar, cVar2, parent);
                    }
                    i10++;
                    parent = parent.getChild();
                    break;
                }
                if (iE == 1) {
                    androidx.compose.ui.n.d dVarL = L(cVar, cVar2, parent);
                    z11 = z11 || parent != dVarL;
                    b bVar3 = this.logger;
                    if (bVar3 != null) {
                        bVar3.a(i10, i10, cVar, cVar2, parent, dVarL);
                    }
                    parent = dVarL;
                } else if (iE == 2 && (bVar = this.logger) != null) {
                    bVar.e(i10, i10, cVar, cVar2, parent);
                }
                i10--;
                kindSet2 |= parent.getKindSet();
                parent.H(kindSet2);
                parent = parent.getParent();
            }
            int i11 = i10;
            androidx.compose.ui.n.d dVar = parent;
            if (i11 > 0) {
                if ((dVar != null ? 1 : 0) == 0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                D(eVar2, i11, eVarD, i11, dVar);
            } else {
                z10 = z11;
            }
            this.current = eVarD;
            eVar2.m();
            this.buffer = eVar2;
            J();
            if (kindSet != 0) {
                E();
            }
            if (z10 || !this.layoutNode.p()) {
            }
            f();
            return;
        }
        if (eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() == 0) {
            int iK2 = eVarD.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1;
            androidx.compose.ui.n.d dVarG = this.tail;
            while (true) {
                androidx.compose.ui.n.d dVar2 = dVarG;
                if (iK2 < 0) {
                    break;
                }
                androidx.compose.ui.n.c cVar3 = eVarD.G()[iK2];
                dVarG = g(cVar3, dVar2);
                b bVar4 = this.logger;
                if (bVar4 != null) {
                    bVar4.b(0, iK2, cVar3, dVar2, dVarG);
                }
                kindSet |= dVarG.getKindSet();
                dVarG.H(kindSet);
                iK2--;
            }
        } else {
            D(eVar2, eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), eVarD, eVarD.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), this.tail);
        }
        kindSet = 1;
        this.current = eVarD;
        eVar2.m();
        this.buffer = eVar2;
        J();
        if (kindSet != 0) {
            E();
        }
        if (z10) {
        }
    }

    public final void M(@dl.e b logger) {
        this.logger = logger;
    }

    public final void f() {
        for (androidx.compose.ui.n.d head = getHead(); head != null; head = head.getChild()) {
            if (!head.getIsAttached()) {
                head.t();
            }
        }
    }

    public final void h() {
        for (androidx.compose.ui.n.d tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.u();
            }
        }
    }

    public final /* synthetic */ <T> T j(int type, yh.l<? super T, Boolean> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if ((k() & type) == 0) {
            return null;
        }
        for (androidx.compose.ui.n.d head = getHead(); head != null; head = ((androidx.compose.ui.n.d) head).getChild()) {
            if ((((androidx.compose.ui.n.d) head).getKindSet() & type) != 0) {
                kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                if (block.invoke(head).booleanValue()) {
                    return (T) head;
                }
            }
            if ((((androidx.compose.ui.n.d) head).getAggregateChildKindSet() & type) == 0) {
                return null;
            }
        }
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final androidx.compose.ui.n.d getHead() {
        return this.head;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final m getInnerCoordinator() {
        return this.innerCoordinator;
    }

    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @dl.d
    public final List<androidx.compose.ui.layout.o0> p() {
        androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar = this.current;
        if (eVar == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        int i10 = 0;
        androidx.compose.runtime.collection.e eVar2 = new androidx.compose.runtime.collection.e(new androidx.compose.ui.layout.o0[eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()], 0);
        androidx.compose.ui.n.d head = getHead();
        while (head != null && head != getTail()) {
            NodeCoordinator coordinator = head.getCoordinator();
            if (coordinator == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            eVar2.b(new androidx.compose.ui.layout.o0(eVar.G()[i10], coordinator, coordinator.getLayer()));
            head = head.getChild();
            i10++;
        }
        return eVar2.l();
    }

    @dl.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final androidx.compose.ui.n.d getTail() {
        return this.tail;
    }

    public final boolean s(int type) {
        return (type & k()) != 0;
    }

    public final /* synthetic */ <T> T t(int type) {
        if ((k() & type) == 0) {
            return null;
        }
        for (Object obj = (T) getHead(); obj != null; obj = (T) ((androidx.compose.ui.n.d) obj).getChild()) {
            if ((((androidx.compose.ui.n.d) obj).getKindSet() & type) != 0) {
                kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                return (T) obj;
            }
            if ((((androidx.compose.ui.n.d) obj).getAggregateChildKindSet() & type) == 0) {
                return null;
            }
        }
        return null;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Constants.ARRAY_TYPE);
        if (this.head == this.tail) {
            sb2.append("]");
        } else {
            for (androidx.compose.ui.n.d head = getHead(); head != null && head != getTail(); head = head.getChild()) {
                sb2.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb2.append("]");
                    break;
                }
                sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void u(int mask, @dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if ((k() & mask) == 0) {
            return;
        }
        for (androidx.compose.ui.n.d head = getHead(); head != null; head = head.getChild()) {
            if ((head.getKindSet() & mask) != 0) {
                block.invoke(head);
            }
            if ((head.getAggregateChildKindSet() & mask) == 0) {
                return;
            }
        }
    }

    public final void v(@dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        for (androidx.compose.ui.n.d head = getHead(); head != null; head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final /* synthetic */ <T> void w(int type, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if ((k() & type) != 0) {
            for (androidx.compose.ui.n.d head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                    block.invoke(head);
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    public final void x(@dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        for (androidx.compose.ui.n.d head = getHead(); head != null && head != getTail(); head = head.getChild()) {
            block.invoke(head);
        }
    }
}
