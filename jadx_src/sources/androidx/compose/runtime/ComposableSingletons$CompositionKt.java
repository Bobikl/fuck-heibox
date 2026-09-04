package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$CompositionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$CompositionKt f12208a = new ComposableSingletons$CompositionKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static yh.p<p, Integer, kotlin.b2> f12209b = androidx.compose.runtime.internal.b.c(954879418, false, new yh.p<p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-1$1
        @h
        public final void a(@dl.e p pVar, int i10) {
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:505)");
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

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static yh.p<p, Integer, kotlin.b2> f12210c = androidx.compose.runtime.internal.b.c(1918065384, false, new yh.p<p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-2$1
        @h
        public final void a(@dl.e p pVar, int i10) {
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:596)");
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
        return f12209b;
    }

    @dl.d
    public final yh.p<p, Integer, kotlin.b2> b() {
        return f12210c;
    }
}
