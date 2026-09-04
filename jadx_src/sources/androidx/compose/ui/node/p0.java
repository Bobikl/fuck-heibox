package androidx.compose.ui.node;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectableValueKt$debugInspectorInfo$1;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: ModifierNodeElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\r\u001a\u00020\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0019\b\u0004\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u001aC\u0010\u000e\u001a\u00020\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0019\b\u0004\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/n$d;", androidx.exifinterface.media.a.f23244d5, "", "params", "Lkotlin/Function0;", TopicHashtagWrapper.TYPE_CREATE, "Lkotlin/Function1;", "Lkotlin/b2;", "update", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "definitions", "Landroidx/compose/ui/n;", ak.av, "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class p0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ModifierNodeElement.kt */
    @Metadata(bv = {}, d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/node/p0$a", "Landroidx/compose/ui/node/o0;", "f", "()Landroidx/compose/ui/n$d;", "node", "m", "(Landroidx/compose/ui/n$d;)Landroidx/compose/ui/n$d;", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<T> extends o0<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.a<T> f15355g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ yh.l<T, b2> f15356h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, yh.a<? extends T> aVar, yh.l<? super T, b2> lVar, yh.l<? super androidx.compose.ui.platform.x0, b2> lVar2) {
            super(obj, lVar2);
            this.f15355g = aVar;
            this.f15356h = lVar;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // androidx.compose.ui.node.o0
        @dl.d
        public androidx.compose.ui.n.d f() {
            return (androidx.compose.ui.n.d) this.f15355g.invoke();
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
        @Override // androidx.compose.ui.node.o0
        @dl.d
        public androidx.compose.ui.n.d m(@dl.d androidx.compose.ui.n.d node) {
            kotlin.jvm.internal.f0.p(node, "node");
            this.f15356h.invoke(node);
            return node;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ModifierNodeElement.kt */
    @Metadata(bv = {}, d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/node/p0$b", "Landroidx/compose/ui/node/o0;", "f", "()Landroidx/compose/ui/n$d;", "node", "m", "(Landroidx/compose/ui/n$d;)Landroidx/compose/ui/n$d;", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b<T> extends o0<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.a<T> f15357g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(yh.a<? extends T> aVar, yh.l<? super androidx.compose.ui.platform.x0, b2> lVar) {
            super(null, lVar);
            this.f15357g = aVar;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // androidx.compose.ui.node.o0
        @dl.d
        public androidx.compose.ui.n.d f() {
            return (androidx.compose.ui.n.d) this.f15357g.invoke();
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
        @Override // androidx.compose.ui.node.o0
        @dl.d
        public androidx.compose.ui.n.d m(@dl.d androidx.compose.ui.n.d node) {
            kotlin.jvm.internal.f0.p(node, "node");
            return node;
        }
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T extends androidx.compose.ui.n.d> androidx.compose.ui.n a(Object obj, yh.a<? extends T> create, yh.l<? super T, b2> update, yh.l<? super androidx.compose.ui.platform.x0, b2> definitions) {
        kotlin.jvm.internal.f0.p(create, "create");
        kotlin.jvm.internal.f0.p(update, "update");
        kotlin.jvm.internal.f0.p(definitions, "definitions");
        yh.l inspectableValueKt$debugInspectorInfo$1 = InspectableValueKt.e() ? new InspectableValueKt$debugInspectorInfo$1(definitions) : InspectableValueKt.b();
        kotlin.jvm.internal.f0.w();
        return new a(obj, create, update, inspectableValueKt$debugInspectorInfo$1);
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T extends androidx.compose.ui.n.d> androidx.compose.ui.n b(yh.a<? extends T> create, yh.l<? super androidx.compose.ui.platform.x0, b2> definitions) {
        kotlin.jvm.internal.f0.p(create, "create");
        kotlin.jvm.internal.f0.p(definitions, "definitions");
        yh.l inspectableValueKt$debugInspectorInfo$1 = InspectableValueKt.e() ? new InspectableValueKt$debugInspectorInfo$1(definitions) : InspectableValueKt.b();
        kotlin.jvm.internal.f0.w();
        return new b(create, inspectableValueKt$debugInspectorInfo$1);
    }
}
