package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\"\u0010\f\u001a\u00020\u00062\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000J\u0006\u0010\r\u001a\u00020\u0004J\t\u0010\u000e\u001a\u00020\u0004H\u0086\bJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R'\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "b", "Lkotlin/b2;", ak.av, RXScreenCaptureService.KEY_HEIGHT, "f", "Lkotlin/Function1;", "block", "g", "d", "e", "", "toString", "Z", "extraAssertions", "", "", "Lkotlin/z;", ak.aF, "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "Landroidx/compose/ui/node/TreeSet;", "Landroidx/compose/ui/node/TreeSet;", "set", "<init>", "(Z)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class DepthSortedSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean extraAssertions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z mapOfOriginalDepth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Comparator<LayoutNode> DepthComparator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TreeSet<LayoutNode> set;

    /* JADX INFO: compiled from: DepthSortedSet.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/node/DepthSortedSet$a", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "l1", "l2", "", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements Comparator<LayoutNode> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@dl.d LayoutNode l10, @dl.d LayoutNode l11) {
            kotlin.jvm.internal.f0.p(l10, "l1");
            kotlin.jvm.internal.f0.p(l11, "l2");
            int iT = kotlin.jvm.internal.f0.t(l10.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String(), l11.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String());
            return iT != 0 ? iT : kotlin.jvm.internal.f0.t(l10.hashCode(), l11.hashCode());
        }
    }

    public DepthSortedSet() {
        this(false, 1, null);
    }

    public DepthSortedSet(boolean z10) {
        this.extraAssertions = z10;
        this.mapOfOriginalDepth = kotlin.b0.b(LazyThreadSafetyMode.NONE, new yh.a<Map<LayoutNode, Integer>>() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<LayoutNode, Integer> invoke() {
                return new LinkedHashMap();
            }
        });
        a aVar = new a();
        this.DepthComparator = aVar;
        this.set = new TreeSet<>(aVar);
    }

    public /* synthetic */ DepthSortedSet(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    private final Map<LayoutNode, Integer> c() {
        return (Map) this.mapOfOriginalDepth.getValue();
    }

    public final void a(@dl.d LayoutNode node) {
        kotlin.jvm.internal.f0.p(node, "node");
        if (!node.p()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.extraAssertions) {
            Integer num = c().get(node);
            if (num == null) {
                c().put(node, Integer.valueOf(node.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String()));
            } else {
                if (!(num.intValue() == node.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        this.set.add(node);
    }

    public final boolean b(@dl.d LayoutNode node) {
        kotlin.jvm.internal.f0.p(node, "node");
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == c().containsKey(node))) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return zContains;
    }

    public final boolean d() {
        return this.set.isEmpty();
    }

    public final boolean e() {
        return !d();
    }

    @dl.d
    public final LayoutNode f() {
        LayoutNode node = this.set.first();
        kotlin.jvm.internal.f0.o(node, "node");
        h(node);
        return node;
    }

    public final void g(@dl.d yh.l<? super LayoutNode, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        while (!d()) {
            block.invoke(f());
        }
    }

    public final boolean h(@dl.d LayoutNode node) {
        kotlin.jvm.internal.f0.p(node, "node");
        if (!node.p()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            Integer numRemove = c().remove(node);
            if (zRemove) {
                if (!(numRemove != null && numRemove.intValue() == node.getCom.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig.DEPTH java.lang.String())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                if (!(numRemove == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        return zRemove;
    }

    @dl.d
    public String toString() {
        String string = this.set.toString();
        kotlin.jvm.internal.f0.o(string, "set.toString()");
        return string;
    }
}
