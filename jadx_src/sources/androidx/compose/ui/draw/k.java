package androidx.compose.ui.draw;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\"\b\u0000\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\f\u0010\u000bR3\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/draw/k;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/b2;", "Lkotlin/t;", "block", "Lyh/l;", ak.av, "()Lyh/l;", "b", "(Lyh/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13470b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private yh.l<? super androidx.compose.ui.graphics.drawscope.d, b2> f13471a;

    public k(@dl.d yh.l<? super androidx.compose.ui.graphics.drawscope.d, b2> block) {
        f0.p(block, "block");
        this.f13471a = block;
    }

    @dl.d
    public final yh.l<androidx.compose.ui.graphics.drawscope.d, b2> a() {
        return this.f13471a;
    }

    public final void b(@dl.d yh.l<? super androidx.compose.ui.graphics.drawscope.d, b2> lVar) {
        f0.p(lVar, "<set-?>");
        this.f13471a = lVar;
    }
}
