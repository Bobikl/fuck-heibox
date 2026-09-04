package androidx.compose.foundation.interaction;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.o;

/* JADX INFO: compiled from: InteractionSource.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "Landroidx/compose/foundation/interaction/g;", "Landroidx/compose/foundation/interaction/d;", "interaction", "Lkotlin/b2;", "b", "(Landroidx/compose/foundation/interaction/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", ak.av, "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/i;", "d", "()Lkotlinx/coroutines/flow/i;", "interactions", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.i<d> interactions = o.b(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.g
    public boolean a(@dl.d d interaction) {
        f0.p(interaction, "interaction");
        return c().d(interaction);
    }

    @Override // androidx.compose.foundation.interaction.g
    @dl.e
    public Object b(@dl.d d dVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objEmit = c().emit(dVar, cVar);
        return objEmit == kotlin.coroutines.intrinsics.b.h() ? objEmit : b2.f124493a;
    }

    @Override // androidx.compose.foundation.interaction.e
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.flow.i<d> c() {
        return this.interactions;
    }
}
