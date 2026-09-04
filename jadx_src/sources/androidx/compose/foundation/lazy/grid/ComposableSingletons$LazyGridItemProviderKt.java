package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$LazyGridItemProviderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$LazyGridItemProviderKt f6652a = new ComposableSingletons$LazyGridItemProviderKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static yh.r<g, Integer, androidx.compose.runtime.p, Integer, b2> f6653b = androidx.compose.runtime.internal.b.c(637163000, false, new yh.r<g, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.ComposableSingletons$LazyGridItemProviderKt$lambda-1$1
        @Override // yh.r
        public /* bridge */ /* synthetic */ b2 U0(g gVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
            a(gVar, num.intValue(), pVar, num2.intValue());
            return b2.f124493a;
        }

        @androidx.compose.runtime.h
        public final void a(@dl.d g interval, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
            int i12;
            f0.p(interval, "interval");
            if ((i11 & 14) == 0) {
                i12 = (pVar.s(interval) ? 4 : 2) | i11;
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
                ComposerKt.w0(637163000, i12, -1, "androidx.compose.foundation.lazy.grid.ComposableSingletons$LazyGridItemProviderKt.lambda-1.<anonymous> (LazyGridItemProvider.kt:86)");
            }
            interval.a().U0(LazyGridItemScopeImpl.f6756a, Integer.valueOf(i10), pVar, Integer.valueOf((i12 & 112) | 6));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
    });

    @dl.d
    public final yh.r<g, Integer, androidx.compose.runtime.p, Integer, b2> a() {
        return f6653b;
    }
}
