package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$SnackbarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$SnackbarKt f9327a = new ComposableSingletons$SnackbarKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> f9328b = androidx.compose.runtime.internal.b.c(-505750804, false, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarKt$lambda-1$1
        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.h
        public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-505750804, i10, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:222)");
            }
            IconKt.c(o0.m.a(n0.a.C1205a.f131925a), null, null, 0L, pVar, 48, 12);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
            a(pVar, num.intValue());
            return kotlin.b2.f124493a;
        }
    });

    @dl.d
    public final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> a() {
        return f9328b;
    }
}
