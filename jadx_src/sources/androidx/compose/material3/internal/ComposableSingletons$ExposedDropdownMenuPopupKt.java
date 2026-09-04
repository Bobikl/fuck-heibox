package androidx.compose.material3.internal;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h;
import androidx.compose.runtime.internal.b;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import yh.p;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$ExposedDropdownMenuPopupKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final ComposableSingletons$ExposedDropdownMenuPopupKt f11919a = new ComposableSingletons$ExposedDropdownMenuPopupKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static p<androidx.compose.runtime.p, Integer, b2> f11920b = b.c(1584933307, false, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopupKt$lambda-1$1
        @h
        public final void a(@e androidx.compose.runtime.p pVar, int i10) {
            if ((i10 & 11) == 2 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1584933307, i10, -1, "androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.lambda-1.<anonymous> (ExposedDropdownMenuPopup.kt:284)");
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

    @d
    public final p<androidx.compose.runtime.p, Integer, b2> a() {
        return f11920b;
    }
}
