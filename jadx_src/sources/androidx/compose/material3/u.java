package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Elevation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000J\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/material3/u;", "", "Landroidx/compose/foundation/interaction/d;", "interaction", "Landroidx/compose/animation/core/h;", "Ls1/h;", ak.av, "b", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final u f12137a = new u();

    private u() {
    }

    @dl.e
    public final androidx.compose.animation.core.h<s1.h> a(@dl.d androidx.compose.foundation.interaction.d interaction) {
        kotlin.jvm.internal.f0.p(interaction, "interaction");
        if ((interaction instanceof androidx.compose.foundation.interaction.i.b) || (interaction instanceof androidx.compose.foundation.interaction.a.b) || (interaction instanceof androidx.compose.foundation.interaction.c.a) || (interaction instanceof androidx.compose.foundation.interaction.b.a)) {
            return v.f12142b;
        }
        return null;
    }

    @dl.e
    public final androidx.compose.animation.core.h<s1.h> b(@dl.d androidx.compose.foundation.interaction.d interaction) {
        kotlin.jvm.internal.f0.p(interaction, "interaction");
        if (!(interaction instanceof androidx.compose.foundation.interaction.i.b) && !(interaction instanceof androidx.compose.foundation.interaction.a.b)) {
            if (interaction instanceof androidx.compose.foundation.interaction.c.a) {
                return v.f12144d;
            }
            if (interaction instanceof androidx.compose.foundation.interaction.b.a) {
                return v.f12143c;
            }
            return null;
        }
        return v.f12143c;
    }
}
