package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$RecomposerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$RecomposerKt f12213a = new ComposableSingletons$RecomposerKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static yh.p<p, Integer, kotlin.b2> f12214b = androidx.compose.runtime.internal.b.c(-1091980426, false, new yh.p<p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.ComposableSingletons$RecomposerKt$lambda-1$1
        @h
        public final void a(@dl.e p pVar, int i10) {
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1091980426, i10, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda-1.<anonymous> (Recomposer.kt:380)");
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(p pVar, Integer num) {
            a(pVar, num.intValue());
            return kotlin.b2.f124493a;
        }
    });

    @dl.d
    public final yh.p<p, Integer, kotlin.b2> a() {
        return f12214b;
    }
}
