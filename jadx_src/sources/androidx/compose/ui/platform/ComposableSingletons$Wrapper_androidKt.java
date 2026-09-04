package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$Wrapper_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$Wrapper_androidKt f15588a = new ComposableSingletons$Wrapper_androidKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> f15589b = androidx.compose.runtime.internal.b.c(-1759434350, false, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda-1$1
        @androidx.compose.runtime.h
        public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1759434350, i10, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:127)");
            }
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
        return f15589b;
    }
}
