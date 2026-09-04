package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a8\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aD\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0019\b\b\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a-\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0001\"\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\"(\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "definitions", ak.av, "Landroidx/compose/ui/n;", "inspectorInfo", "factory", ak.aF, "wrapped", "d", "", "b", "Z", "e", "()Z", "f", "(Z)V", "isDebugInspectorInfoEnabled", "NoInspectorInfo", "Lyh/l;", "()Lyh/l;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class InspectableValueKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final yh.l<x0, kotlin.b2> f15650a = new yh.l<x0, kotlin.b2>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void a(@dl.d x0 x0Var) {
            kotlin.jvm.internal.f0.p(x0Var, "$this$null");
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(x0 x0Var) {
            a(x0Var);
            return kotlin.b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f15651b;

    @dl.d
    public static final yh.l<x0, kotlin.b2> a(@dl.d yh.l<? super x0, kotlin.b2> definitions) {
        kotlin.jvm.internal.f0.p(definitions, "definitions");
        return e() ? new InspectableValueKt$debugInspectorInfo$1(definitions) : b();
    }

    @dl.d
    public static final yh.l<x0, kotlin.b2> b() {
        return f15650a;
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d yh.l<? super x0, kotlin.b2> inspectorInfo, @dl.d yh.l<? super androidx.compose.ui.n, ? extends androidx.compose.ui.n> factory) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.f0.p(factory, "factory");
        return d(nVar, inspectorInfo, factory.invoke(androidx.compose.ui.n.INSTANCE));
    }

    @dl.d
    @kotlin.r0
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d yh.l<? super x0, kotlin.b2> inspectorInfo, @dl.d androidx.compose.ui.n wrapped) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.f0.p(wrapped, "wrapped");
        u0 u0Var = new u0(inspectorInfo);
        return nVar.s0(u0Var).s0(wrapped).s0(u0Var.getCom.google.android.exoplayer2.text.ttml.d.p0 java.lang.String());
    }

    public static final boolean e() {
        return f15651b;
    }

    public static final void f(boolean z10) {
        f15651b = z10;
    }
}
