package androidx.compose.foundation.interaction;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: InteractionSource.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/g;", "Landroidx/compose/foundation/interaction/e;", "Landroidx/compose/foundation/interaction/d;", "interaction", "Lkotlin/b2;", "b", "(Landroidx/compose/foundation/interaction/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface g extends e {
    boolean a(@dl.d d interaction);

    @dl.e
    Object b(@dl.d d dVar, @dl.d kotlin.coroutines.c<? super b2> cVar);
}
