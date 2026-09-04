package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B \u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\b\u001a\u00060\u0003R\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/u0;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/platform/u0$a;", "e", "Landroidx/compose/ui/platform/u0$a;", "f", "()Landroidx/compose/ui/platform/u0$a;", com.google.android.exoplayer2.text.ttml.d.f49800p0, "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Lyh/l;)V", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public final class u0 extends y0 implements androidx.compose.ui.n.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15986f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a end;

    /* JADX INFO: compiled from: InspectableValue.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/u0$a;", "Landroidx/compose/ui/n$c;", "<init>", "(Landroidx/compose/ui/platform/u0;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class a implements androidx.compose.ui.n.c {
        public a() {
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean a0(yh.l lVar) {
            return androidx.compose.ui.o.a(this, lVar);
        }

        @Override // androidx.compose.ui.n
        public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
            return androidx.compose.ui.m.a(this, nVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean t(yh.l lVar) {
            return androidx.compose.ui.o.b(this, lVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object v(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.d(this, obj, pVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object x(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.c(this, obj, pVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(@dl.d yh.l<? super x0, kotlin.b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.end = new a();
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
