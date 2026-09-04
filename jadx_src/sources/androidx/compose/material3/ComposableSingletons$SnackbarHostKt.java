package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$SnackbarHostKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$SnackbarHostKt f9324a = new ComposableSingletons$SnackbarHostKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> f9325b = androidx.compose.runtime.internal.b.c(818736383, false, new yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.h
        public final void a(@dl.d l1 it, @dl.e androidx.compose.runtime.p pVar, int i10) {
            int i11;
            kotlin.jvm.internal.f0.p(it, "it");
            if ((i10 & 14) == 0) {
                i11 = i10 | (pVar.s(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(818736383, i11, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:221)");
            }
            SnackbarKt.d(it, null, false, null, 0L, 0L, 0L, 0L, 0L, pVar, i11 & 14, 510);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(l1 l1Var, androidx.compose.runtime.p pVar, Integer num) {
            a(l1Var, pVar, num.intValue());
            return kotlin.b2.f124493a;
        }
    });

    @dl.d
    public final yh.q<l1, androidx.compose.runtime.p, Integer, kotlin.b2> a() {
        return f9325b;
    }
}
