package androidx.compose.foundation;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/d0;", "Landroidx/compose/foundation/x;", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/foundation/y;", ak.av, "(Landroidx/compose/foundation/interaction/e;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/y;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class d0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d0 f5094a = new d0();

    /* JADX INFO: compiled from: Indication.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/d0$a;", "Landroidx/compose/foundation/y;", "Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/b2;", ak.av, "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final a f5095b = new a();

        private a() {
        }

        @Override // androidx.compose.foundation.y
        public void a(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
            kotlin.jvm.internal.f0.p(dVar, "<this>");
            dVar.T0();
        }
    }

    private d0() {
    }

    @Override // androidx.compose.foundation.x
    @dl.d
    @androidx.compose.runtime.h
    public y a(@dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(285654452);
        if (ComposerKt.g0()) {
            ComposerKt.w0(285654452, i10, -1, "androidx.compose.foundation.NoIndication.rememberUpdatedInstance (Indication.kt:140)");
        }
        a aVar = a.f5095b;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return aVar;
    }
}
