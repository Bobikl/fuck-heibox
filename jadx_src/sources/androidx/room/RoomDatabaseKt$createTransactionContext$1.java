package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RoomDatabaseExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabaseExt.kt", i = {0, 0}, l = {100}, m = "createTransactionContext", n = {"$this$createTransactionContext", "controlJob"}, s = {"L$0", "L$1"})
public final class RoomDatabaseKt$createTransactionContext$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f27007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f27008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f27009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f27010e;

    RoomDatabaseKt$createTransactionContext$1(kotlin.coroutines.c<? super RoomDatabaseKt$createTransactionContext$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f27009d = obj;
        this.f27010e |= Integer.MIN_VALUE;
        return RoomDatabaseKt.d(null, this);
    }
}
