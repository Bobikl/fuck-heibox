package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JF\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/f;", "", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/d;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "Lkotlin/t;", "block", "b", "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "delta", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface f {

    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
    }

    void a(float f10);

    @dl.e
    Object b(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar);
}
