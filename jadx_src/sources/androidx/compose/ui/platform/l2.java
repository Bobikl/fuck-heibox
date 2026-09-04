package androidx.compose.ui.platform;

import android.view.View;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewRootForTest.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.j1
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fJ\b\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/l2;", "Landroidx/compose/ui/node/i1;", "Lkotlin/b2;", "y", "Landroid/view/View;", "getView", "()Landroid/view/View;", sd.b.f139384b, "", "g", "()Z", "isLifecycleInResumedState", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "q0", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface l2 extends androidx.compose.ui.node.i1 {

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f15928a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.l2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewRootForTest.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\fR6\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/l2$a;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/l2;", "Lkotlin/b2;", "onViewCreatedCallback", "Lyh/l;", ak.av, "()Lyh/l;", ak.aF, "(Lyh/l;)V", "getOnViewCreatedCallback$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f15928a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private static yh.l<? super l2, kotlin.b2> f15929b;

        private Companion() {
        }

        @androidx.annotation.j1
        public static /* synthetic */ void b() {
        }

        @dl.e
        public final yh.l<l2, kotlin.b2> a() {
            return f15929b;
        }

        public final void c(@dl.e yh.l<? super l2, kotlin.b2> lVar) {
            f15929b = lVar;
        }
    }

    boolean g();

    boolean getHasPendingMeasureOrLayout();

    @dl.d
    View getView();

    void y();
}
