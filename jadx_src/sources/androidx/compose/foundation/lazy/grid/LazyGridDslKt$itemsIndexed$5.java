package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/foundation/lazy/grid/l;", "", "it", "Lkotlin/b2;", ak.av, "(Landroidx/compose/foundation/lazy/grid/l;ILandroidx/compose/runtime/p;I)V"}, k = 3, mv = {1, 7, 1})
public final class LazyGridDslKt$itemsIndexed$5 extends Lambda implements yh.r<l, Integer, androidx.compose.runtime.p, Integer, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.s<l, Integer, T, androidx.compose.runtime.p, Integer, b2> f6709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<T> f6710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$5(yh.s<? super l, ? super Integer, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> sVar, List<? extends T> list) {
        super(4);
        this.f6709b = sVar;
        this.f6710c = list;
    }

    @Override // yh.r
    public /* bridge */ /* synthetic */ b2 U0(l lVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
        a(lVar, num.intValue(), pVar, num2.intValue());
        return b2.f124493a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @androidx.compose.runtime.h
    public final void a(@dl.d l items, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
        int i12;
        f0.p(items, "$this$items");
        if ((i11 & 14) == 0) {
            i12 = (pVar.s(items) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= pVar.y(i10) ? 32 : 16;
        }
        if ((i12 & bb.c.b.f30586db) == 146 && pVar.b()) {
            pVar.l();
            return;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(1229287273, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:423)");
        }
        this.f6709b.N0(items, Integer.valueOf(i10), (T) this.f6710c.get(i10), pVar, Integer.valueOf((i12 & 14) | (i12 & 112)));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
    }
}
