package androidx.room;

import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/room/RoomDatabase;", "Lkotlinx/coroutines/CoroutineDispatcher;", ak.av, "b", "(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/CoroutineDispatcher;", "transactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final CoroutineDispatcher a(@dl.d RoomDatabase roomDatabase) {
        kotlin.jvm.internal.f0.p(roomDatabase, "<this>");
        Map<String, Object> mapN = roomDatabase.n();
        Object objC = mapN.get("QueryDispatcher");
        if (objC == null) {
            objC = kotlinx.coroutines.s1.c(roomDatabase.t());
            mapN.put("QueryDispatcher", objC);
        }
        kotlin.jvm.internal.f0.n(objC, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) objC;
    }

    @dl.d
    public static final CoroutineDispatcher b(@dl.d RoomDatabase roomDatabase) {
        kotlin.jvm.internal.f0.p(roomDatabase, "<this>");
        Map<String, Object> mapN = roomDatabase.n();
        Object objC = mapN.get("TransactionDispatcher");
        if (objC == null) {
            objC = kotlinx.coroutines.s1.c(roomDatabase.x());
            mapN.put("TransactionDispatcher", objC);
        }
        kotlin.jvm.internal.f0.n(objC, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) objC;
    }
}
