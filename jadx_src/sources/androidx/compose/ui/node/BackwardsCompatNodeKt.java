package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0007\n\u0002\b\u0005*\u0001\u0000\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNodeKt$a", ak.av, "Landroidx/compose/ui/node/BackwardsCompatNodeKt$a;", "DetachedModifierLocalReadScope", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class BackwardsCompatNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final a f15104a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final yh.l<BackwardsCompatNode, b2> f15105b = new yh.l<BackwardsCompatNode, b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        public final void a(@dl.d BackwardsCompatNode it) {
            kotlin.jvm.internal.f0.p(it, "it");
            it.U();
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(BackwardsCompatNode backwardsCompatNode) {
            a(backwardsCompatNode);
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final yh.l<BackwardsCompatNode, b2> f15106c = new yh.l<BackwardsCompatNode, b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        public final void a(@dl.d BackwardsCompatNode it) {
            kotlin.jvm.internal.f0.p(it, "it");
            it.d0();
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(BackwardsCompatNode backwardsCompatNode) {
            a(backwardsCompatNode);
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final yh.l<BackwardsCompatNode, b2> f15107d = new yh.l<BackwardsCompatNode, b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateFocusOrderModifierLocalConsumer$1
        public final void a(@dl.d BackwardsCompatNode it) {
            kotlin.jvm.internal.f0.p(it, "it");
            it.b0();
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(BackwardsCompatNode backwardsCompatNode) {
            a(backwardsCompatNode);
            return b2.f124493a;
        }
    };

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R$\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNodeKt$a", "Landroidx/compose/ui/modifier/n;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/modifier/c;", ak.av, "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.ui.modifier.n {
        a() {
        }

        @Override // androidx.compose.ui.modifier.n
        public <T> T a(@dl.d androidx.compose.ui.modifier.c<T> cVar) {
            kotlin.jvm.internal.f0.p(cVar, "<this>");
            return cVar.a().invoke();
        }
    }
}
