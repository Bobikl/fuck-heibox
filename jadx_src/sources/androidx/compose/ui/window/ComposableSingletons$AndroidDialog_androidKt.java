package androidx.compose.ui.window;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.b2;
import yh.p;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$AndroidDialog_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$AndroidDialog_androidKt f17165a = new ComposableSingletons$AndroidDialog_androidKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static p<androidx.compose.runtime.p, Integer, b2> f17166b = androidx.compose.runtime.internal.b.c(210148896, false, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt$lambda-1$1
        @androidx.compose.runtime.h
        public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(210148896, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda-1.<anonymous> (AndroidDialog.android.kt:219)");
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
            a(pVar, num.intValue());
            return b2.f124493a;
        }
    });

    @dl.d
    public final p<androidx.compose.runtime.p, Integer, b2> a() {
        return f17166b;
    }
}
