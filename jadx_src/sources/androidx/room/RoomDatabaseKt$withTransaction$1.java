package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RoomDatabaseExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabaseExt.kt", i = {0, 0}, l = {51, 52}, m = "withTransaction", n = {"$this$withTransaction", "block"}, s = {"L$0", "L$1"})
public final class RoomDatabaseKt$withTransaction$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f27012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f27013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f27014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f27015e;

    RoomDatabaseKt$withTransaction$1(kotlin.coroutines.c<? super RoomDatabaseKt$withTransaction$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f27014d = obj;
        this.f27015e |= Integer.MIN_VALUE;
        return RoomDatabaseKt.e(null, null, this);
    }
}
