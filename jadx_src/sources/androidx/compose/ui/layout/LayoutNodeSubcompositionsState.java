package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h2;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.v2;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import s1.DpRect;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u000247B\u0017\u0012\u0006\u00106\u001a\u00020\u0002\u0012\u0006\u0010F\u001a\u00020>¢\u0006\u0004\b`\u0010aJ4\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J<\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\"\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u0016H\u0002J\u0017\u0010 \u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\bJ0\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b#\u0010$J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u0006J(\u0010.\u001a\u00020-2\u001d\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0(¢\u0006\u0002\b,ø\u0001\u0000J*\u00100\u001a\u00020/2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b0\u00101J\u0006\u00102\u001a\u00020\u0006J\u0006\u00103\u001a\u00020\u0006R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R$\u0010=\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010F\u001a\u00020>2\u0006\u0010?\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010O\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010S\u001a\u00060PR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010U\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010LR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010HR\u0016\u0010\\\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010HR\u0014\u0010_\u001a\u00020]8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010^\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "slotId", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "B", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lyh/p;)V", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "nodeState", androidx.exifinterface.media.a.W4, "Landroidx/compose/runtime/q;", "existing", com.google.android.exoplayer2.text.ttml.d.W, "Landroidx/compose/runtime/r;", "parent", "composable", "C", "(Landroidx/compose/runtime/q;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/r;Lyh/p;)Landroidx/compose/runtime/q;", "", UCropPlusActivity.ARG_INDEX, "q", "D", "l", "from", "to", "count", ak.aG, "block", ak.aB, "", "Landroidx/compose/ui/layout/g0;", ak.aD, "(Ljava/lang/Object;Lyh/p;)Ljava/util/List;", SpellCheckPlugin.START_INDEX_KEY, "n", "t", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/q1;", "Ls1/b;", "Landroidx/compose/ui/layout/j0;", "Lkotlin/t;", "Landroidx/compose/ui/layout/i0;", "k", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", RXScreenCaptureService.KEY_WIDTH, "(Ljava/lang/Object;Lyh/p;)Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "o", "m", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "root", "b", "Landroidx/compose/runtime/r;", "p", "()Landroidx/compose/runtime/r;", "x", "(Landroidx/compose/runtime/r;)V", "compositionContext", "Landroidx/compose/ui/layout/r1;", "value", ak.aF, "Landroidx/compose/ui/layout/r1;", "r", "()Landroidx/compose/ui/layout/r1;", "y", "(Landroidx/compose/ui/layout/r1;)V", "slotReusePolicy", "d", "I", "currentIndex", "", "e", "Ljava/util/Map;", "nodeToNodeState", "f", "slotIdToNode", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;", "g", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;", "scope", RXScreenCaptureService.KEY_HEIGHT, "precomposeMap", "Landroidx/compose/ui/layout/r1$a;", "i", "Landroidx/compose/ui/layout/r1$a;", "reusableSlotIdsSet", "j", "reusableCount", "precomposedCount", "", "Ljava/lang/String;", "NoIntrinsicsMessage", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/r1;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class LayoutNodeSubcompositionsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.r compositionContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private r1 slotReusePolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<LayoutNode, a> nodeToNodeState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, LayoutNode> slotIdToNode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b scope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, LayoutNode> precomposeMap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r1.a reusableSlotIdsSet;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int reusableCount;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int precomposedCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String NoIntrinsicsMessage;

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B0\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b$\u0010%R$\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u0002\u0010\u0014\"\u0004\b\u001a\u0010\u0016R-\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\n\u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "", ak.av, "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "slotId", "Landroidx/compose/runtime/q;", ak.aF, "Landroidx/compose/runtime/q;", "b", "()Landroidx/compose/runtime/q;", "g", "(Landroidx/compose/runtime/q;)V", "composition", "", "d", "Z", "()Z", "i", "(Z)V", "forceRecompose", "<set-?>", "Landroidx/compose/runtime/a1;", "f", "active", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "Lyh/p;", "()Lyh/p;", RXScreenCaptureService.KEY_HEIGHT, "(Lyh/p;)V", "<init>", "(Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/q;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Object slotId;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> f14906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private androidx.compose.runtime.q composition;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean forceRecompose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 active;

        public a(@dl.e Object obj, @dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.q qVar) {
            kotlin.jvm.internal.f0.p(content, "content");
            this.slotId = obj;
            this.f14906b = content;
            this.composition = qVar;
            this.active = h2.g(Boolean.TRUE, null, 2, null);
        }

        public /* synthetic */ a(Object obj, yh.p pVar, androidx.compose.runtime.q qVar, int i10, kotlin.jvm.internal.u uVar) {
            this(obj, pVar, (i10 & 4) != 0 ? null : qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.active.getValue()).booleanValue();
        }

        @dl.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final androidx.compose.runtime.q getComposition() {
            return this.composition;
        }

        @dl.d
        public final yh.p<androidx.compose.runtime.p, Integer, b2> c() {
            return this.f14906b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        @dl.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void f(boolean z10) {
            this.active.setValue(Boolean.valueOf(z10));
        }

        public final void g(@dl.e androidx.compose.runtime.q qVar) {
            this.composition = qVar;
        }

        public final void h(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar) {
            kotlin.jvm.internal.f0.p(pVar, "<set-?>");
            this.f14906b = pVar;
        }

        public final void i(boolean z10) {
            this.forceRecompose = z10;
        }

        public final void j(@dl.e Object obj) {
            this.slotId = obj;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\r\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;", "Landroidx/compose/ui/layout/q1;", "", "slotId", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "", "Landroidx/compose/ui/layout/g0;", "y1", "(Ljava/lang/Object;Lyh/p;)Ljava/util/List;", "Landroidx/compose/ui/unit/LayoutDirection;", "b", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "", ak.aF, "F", "getDensity", "()F", "(F)V", "density", "d", "C1", "g", "fontScale", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class b implements q1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float density;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private float fontScale;

        public b() {
        }

        @Override // s1.e
        /* JADX INFO: renamed from: C1, reason: from getter */
        public float getF139218c() {
            return this.fontScale;
        }

        @Override // s1.e
        public /* synthetic */ float E(int i10) {
            return s1.d.e(this, i10);
        }

        @Override // s1.e
        public /* synthetic */ float E1(float f10) {
            return s1.d.h(this, f10);
        }

        @Override // s1.e
        public /* synthetic */ float F(float f10) {
            return s1.d.d(this, f10);
        }

        @Override // s1.e
        public /* synthetic */ long J(long j10) {
            return s1.d.j(this, j10);
        }

        @Override // s1.e
        public /* synthetic */ int J1(long j10) {
            return s1.d.a(this, j10);
        }

        @Override // s1.e
        public /* synthetic */ long M(float f10) {
            return s1.d.k(this, f10);
        }

        public void b(float f10) {
            this.density = f10;
        }

        @Override // s1.e
        public /* synthetic */ int e1(float f10) {
            return s1.d.b(this, f10);
        }

        public void g(float f10) {
            this.fontScale = f10;
        }

        @Override // s1.e
        /* JADX INFO: renamed from: getDensity, reason: from getter */
        public float getF139217b() {
            return this.density;
        }

        @Override // androidx.compose.ui.layout.n
        @dl.d
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void h(@dl.d LayoutDirection layoutDirection) {
            kotlin.jvm.internal.f0.p(layoutDirection, "<set-?>");
            this.layoutDirection = layoutDirection;
        }

        @Override // s1.e
        public /* synthetic */ b1.i h0(DpRect dpRect) {
            return s1.d.i(this, dpRect);
        }

        @Override // s1.e
        public /* synthetic */ float k1(long j10) {
            return s1.d.g(this, j10);
        }

        @Override // s1.e
        public /* synthetic */ long n(long j10) {
            return s1.d.f(this, j10);
        }

        @Override // androidx.compose.ui.layout.l0
        public /* synthetic */ j0 p1(int i10, int i11, Map map, yh.l lVar) {
            return k0.a(this, i10, i11, map, lVar);
        }

        @Override // s1.e
        public /* synthetic */ float q(long j10) {
            return s1.d.c(this, j10);
        }

        @Override // s1.e
        public /* synthetic */ long r(int i10) {
            return s1.d.m(this, i10);
        }

        @Override // s1.e
        public /* synthetic */ long s(float f10) {
            return s1.d.l(this, f10);
        }

        @Override // androidx.compose.ui.layout.q1
        @dl.d
        public List<g0> y1(@dl.e Object slotId, @dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
            kotlin.jvm.internal.f0.p(content, "content");
            return LayoutNodeSubcompositionsState.this.z(slotId, content);
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$c", "Landroidx/compose/ui/node/LayoutNode$d;", "Landroidx/compose/ui/layout/l0;", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends LayoutNode.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.p<q1, s1.b, j0> f14915c;

        /* JADX INFO: compiled from: SubcomposeLayout.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$c$a", "Landroidx/compose/ui/layout/j0;", "Lkotlin/b2;", "k", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "i", "()Ljava/util/Map;", "alignmentLines", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements j0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f14916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ LayoutNodeSubcompositionsState f14917b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f14918c;

            a(j0 j0Var, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i10) {
                this.f14916a = j0Var;
                this.f14917b = layoutNodeSubcompositionsState;
                this.f14918c = i10;
            }

            @Override // androidx.compose.ui.layout.j0
            public int getHeight() {
                return this.f14916a.getHeight();
            }

            @Override // androidx.compose.ui.layout.j0
            public int getWidth() {
                return this.f14916a.getWidth();
            }

            @Override // androidx.compose.ui.layout.j0
            @dl.d
            public Map<androidx.compose.ui.layout.a, Integer> i() {
                return this.f14916a.i();
            }

            @Override // androidx.compose.ui.layout.j0
            public void k() {
                this.f14917b.currentIndex = this.f14918c;
                this.f14916a.k();
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f14917b;
                layoutNodeSubcompositionsState.n(layoutNodeSubcompositionsState.currentIndex);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(yh.p<? super q1, ? super s1.b, ? extends j0> pVar, String str) {
            super(str);
            this.f14915c = pVar;
        }

        @Override // androidx.compose.ui.layout.i0
        @dl.d
        public j0 a(@dl.d l0 measure, @dl.d List<? extends g0> measurables, long j10) {
            kotlin.jvm.internal.f0.p(measure, "$this$measure");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            LayoutNodeSubcompositionsState.this.scope.h(measure.getLayoutDirection());
            LayoutNodeSubcompositionsState.this.scope.b(measure.getF139217b());
            LayoutNodeSubcompositionsState.this.scope.g(measure.getF139218c());
            LayoutNodeSubcompositionsState.this.currentIndex = 0;
            return new a(this.f14915c.invoke(LayoutNodeSubcompositionsState.this.scope, s1.b.b(j10)), LayoutNodeSubcompositionsState.this, LayoutNodeSubcompositionsState.this.currentIndex);
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$d", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "Lkotlin/b2;", "dispose", "", UCropPlusActivity.ARG_INDEX, "Ls1/b;", "constraints", "b", "(IJ)V", ak.av, "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements SubcomposeLayoutState.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f14920b;

        d(Object obj) {
            this.f14920b = obj;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public int a() {
            List<LayoutNode> listV;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(this.f14920b);
            if (layoutNode == null || (listV = layoutNode.V()) == null) {
                return 0;
            }
            return listV.size();
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public void b(int index, long constraints) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(this.f14920b);
            if (layoutNode == null || !layoutNode.p()) {
                return;
            }
            int size = layoutNode.V().size();
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index (" + index + ") is out of bound of [0, " + size + ')');
            }
            if (!(!layoutNode.getIsPlaced())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            androidx.compose.ui.node.d0.b(layoutNode).i(layoutNode.V().get(index), constraints);
            layoutNode2.ignoreRemeasureRequests = false;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public void dispose() {
            LayoutNodeSubcompositionsState.this.t();
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.remove(this.f14920b);
            if (layoutNode != null) {
                if (!(LayoutNodeSubcompositionsState.this.precomposedCount > 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                int iIndexOf = LayoutNodeSubcompositionsState.this.root.X().indexOf(layoutNode);
                if (!(iIndexOf >= LayoutNodeSubcompositionsState.this.root.X().size() - LayoutNodeSubcompositionsState.this.precomposedCount)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                LayoutNodeSubcompositionsState.this.reusableCount++;
                LayoutNodeSubcompositionsState.this.precomposedCount--;
                int size = (LayoutNodeSubcompositionsState.this.root.X().size() - LayoutNodeSubcompositionsState.this.precomposedCount) - LayoutNodeSubcompositionsState.this.reusableCount;
                LayoutNodeSubcompositionsState.this.u(iIndexOf, size, 1);
                LayoutNodeSubcompositionsState.this.n(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeSubcompositionsState(@dl.d LayoutNode root, @dl.d r1 slotReusePolicy) {
        kotlin.jvm.internal.f0.p(root, "root");
        kotlin.jvm.internal.f0.p(slotReusePolicy, "slotReusePolicy");
        this.root = root;
        this.slotReusePolicy = slotReusePolicy;
        this.nodeToNodeState = new LinkedHashMap();
        this.slotIdToNode = new LinkedHashMap();
        this.scope = new b();
        this.precomposeMap = new LinkedHashMap();
        this.reusableSlotIdsSet = new r1.a(null, 1, 0 == true ? 1 : 0);
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final void A(LayoutNode layoutNode, final a aVar) {
        androidx.compose.runtime.snapshots.f fVarA = androidx.compose.runtime.snapshots.f.INSTANCE.a();
        try {
            androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
            try {
                LayoutNode layoutNode2 = this.root;
                layoutNode2.ignoreRemeasureRequests = true;
                final yh.p<androidx.compose.runtime.p, Integer, b2> pVarC = aVar.c();
                androidx.compose.runtime.q composition = aVar.getComposition();
                androidx.compose.runtime.r rVar = this.compositionContext;
                if (rVar == null) {
                    throw new IllegalStateException("parent composition reference not set".toString());
                }
                aVar.g(C(composition, layoutNode, rVar, androidx.compose.runtime.internal.b.c(-34810602, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
                        if ((i10 & 11) == 2 && pVar.b()) {
                            pVar.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-34810602, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:447)");
                        }
                        boolean zA = aVar.a();
                        yh.p<androidx.compose.runtime.p, Integer, b2> pVar2 = pVarC;
                        pVar.i(207, Boolean.valueOf(zA));
                        boolean zU = pVar.u(zA);
                        if (zA) {
                            pVar2.invoke(pVar, 0);
                        } else {
                            pVar.a(zU);
                        }
                        pVar.S();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
                        a(pVar, num.intValue());
                        return b2.f124493a;
                    }
                })));
                layoutNode2.ignoreRemeasureRequests = false;
                b2 b2Var = b2.f124493a;
                fVarA.w(fVarP);
                fVarA.d();
            } catch (Throwable th2) {
                fVarA.w(fVarP);
                throw th2;
            }
        } catch (Throwable th3) {
            fVarA.d();
            throw th3;
        }
    }

    private final void B(LayoutNode node, Object slotId, yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        Map<LayoutNode, a> map = this.nodeToNodeState;
        a aVar = map.get(node);
        if (aVar == null) {
            aVar = new a(slotId, ComposableSingletons$SubcomposeLayoutKt.f14879a.a(), null, 4, null);
            map.put(node, aVar);
        }
        a aVar2 = aVar;
        androidx.compose.runtime.q composition = aVar2.getComposition();
        boolean zB = composition != null ? composition.b() : true;
        if (aVar2.c() != content || zB || aVar2.getForceRecompose()) {
            aVar2.h(content);
            A(node, aVar2);
            aVar2.i(false);
        }
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    private final androidx.compose.runtime.q C(androidx.compose.runtime.q existing, LayoutNode container, androidx.compose.runtime.r parent, yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> composable) {
        if (existing == null || existing.getDisposed()) {
            existing = v2.a(container, parent);
        }
        existing.c(composable);
        return existing;
    }

    private final LayoutNode D(Object slotId) {
        int i10;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.X().size() - this.precomposedCount;
        int i11 = size - this.reusableCount;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (kotlin.jvm.internal.f0.g(q(i13), slotId)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                a aVar = this.nodeToNodeState.get(this.root.X().get(i12));
                kotlin.jvm.internal.f0.m(aVar);
                a aVar2 = aVar;
                if (this.slotReusePolicy.b(slotId, aVar2.getSlotId())) {
                    aVar2.j(slotId);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            u(i13, i11, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = this.root.X().get(i11);
        a aVar3 = this.nodeToNodeState.get(layoutNode);
        kotlin.jvm.internal.f0.m(aVar3);
        a aVar4 = aVar3;
        aVar4.f(true);
        aVar4.i(true);
        androidx.compose.runtime.snapshots.f.INSTANCE.l();
        return layoutNode;
    }

    private final LayoutNode l(int index) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.H0(index, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    private final Object q(int index) {
        a aVar = this.nodeToNodeState.get(this.root.X().get(index));
        kotlin.jvm.internal.f0.m(aVar);
        return aVar.getSlotId();
    }

    private final void s(yh.a<b2> aVar) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        aVar.invoke();
        layoutNode.ignoreRemeasureRequests = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i10, int i11, int i12) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.X0(i10, i11, i12);
        layoutNode.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void v(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        layoutNodeSubcompositionsState.u(i10, i11, i12);
    }

    @dl.d
    public final i0 k(@dl.d yh.p<? super q1, ? super s1.b, ? extends j0> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return new c(block, this.NoIntrinsicsMessage);
    }

    public final void m() {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        Iterator<T> it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            androidx.compose.runtime.q composition = ((a) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.g1();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        t();
    }

    public final void n(int i10) {
        this.reusableCount = 0;
        int size = (this.root.X().size() - this.precomposedCount) - 1;
        if (i10 <= size) {
            this.reusableSlotIdsSet.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.reusableSlotIdsSet.add(q(i11));
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.slotReusePolicy.a(this.reusableSlotIdsSet);
            while (size >= i10) {
                LayoutNode layoutNode = this.root.X().get(size);
                a aVar = this.nodeToNodeState.get(layoutNode);
                kotlin.jvm.internal.f0.m(aVar);
                a aVar2 = aVar;
                Object slotId = aVar2.getSlotId();
                if (this.reusableSlotIdsSet.contains(slotId)) {
                    layoutNode.z1(LayoutNode.UsageByParent.NotUsed);
                    this.reusableCount++;
                    aVar2.f(false);
                } else {
                    LayoutNode layoutNode2 = this.root;
                    layoutNode2.ignoreRemeasureRequests = true;
                    this.nodeToNodeState.remove(layoutNode);
                    androidx.compose.runtime.q composition = aVar2.getComposition();
                    if (composition != null) {
                        composition.dispose();
                    }
                    this.root.h1(size, 1);
                    layoutNode2.ignoreRemeasureRequests = false;
                }
                this.slotIdToNode.remove(slotId);
                size--;
            }
        }
        t();
    }

    public final void o() {
        Iterator<Map.Entry<LayoutNode, a>> it = this.nodeToNodeState.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().i(true);
        }
        if (this.root.m0()) {
            return;
        }
        LayoutNode.q1(this.root, false, 1, null);
    }

    @dl.e
    /* JADX INFO: renamed from: p, reason: from getter */
    public final androidx.compose.runtime.r getCompositionContext() {
        return this.compositionContext;
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final r1 getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void t() {
        if (!(this.nodeToNodeState.size() == this.root.X().size())) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + this.root.X().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((this.root.X().size() - this.reusableCount) - this.precomposedCount >= 0) {
            if (this.precomposeMap.size() == this.precomposedCount) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + this.root.X().size() + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
    }

    @dl.d
    public final SubcomposeLayoutState.a w(@dl.e Object slotId, @dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        t();
        if (!this.slotIdToNode.containsKey(slotId)) {
            Map<Object, LayoutNode> map = this.precomposeMap;
            LayoutNode layoutNodeD = map.get(slotId);
            if (layoutNodeD == null) {
                layoutNodeD = D(slotId);
                if (layoutNodeD != null) {
                    u(this.root.X().indexOf(layoutNodeD), this.root.X().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeD = l(this.root.X().size());
                    this.precomposedCount++;
                }
                map.put(slotId, layoutNodeD);
            }
            B(layoutNodeD, slotId, content);
        }
        return new d(slotId);
    }

    public final void x(@dl.e androidx.compose.runtime.r rVar) {
        this.compositionContext = rVar;
    }

    public final void y(@dl.d r1 value) {
        kotlin.jvm.internal.f0.p(value, "value");
        if (this.slotReusePolicy != value) {
            this.slotReusePolicy = value;
            n(0);
        }
    }

    @dl.d
    public final List<g0> z(@dl.e Object slotId, @dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        t();
        LayoutNode.LayoutState layoutStateF0 = this.root.f0();
        if (!(layoutStateF0 == LayoutNode.LayoutState.Measuring || layoutStateF0 == LayoutNode.LayoutState.LayingOut)) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        Map<Object, LayoutNode> map = this.slotIdToNode;
        LayoutNode layoutNodeRemove = map.get(slotId);
        if (layoutNodeRemove == null) {
            layoutNodeRemove = this.precomposeMap.remove(slotId);
            if (layoutNodeRemove != null) {
                int i10 = this.precomposedCount;
                if (!(i10 > 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                this.precomposedCount = i10 - 1;
            } else {
                layoutNodeRemove = D(slotId);
                if (layoutNodeRemove == null) {
                    layoutNodeRemove = l(this.currentIndex);
                }
            }
            map.put(slotId, layoutNodeRemove);
        }
        LayoutNode layoutNode = layoutNodeRemove;
        int iIndexOf = this.root.X().indexOf(layoutNode);
        int i11 = this.currentIndex;
        if (iIndexOf >= i11) {
            if (i11 != iIndexOf) {
                v(this, iIndexOf, i11, 0, 4, null);
            }
            this.currentIndex++;
            B(layoutNode, slotId, content);
            return layoutNode.U();
        }
        throw new IllegalArgumentException("Key " + slotId + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
    }
}
