package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.m;
import xh.i;

/* JADX INFO: compiled from: LazyScopeAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyScopeAdapter extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<MemberScope> f127581b;

    @i
    public LazyScopeAdapter(@dl.d m storageManager, @dl.d final yh.a<? extends MemberScope> getScope) {
        f0.p(storageManager, "storageManager");
        f0.p(getScope, "getScope");
        this.f127581b = storageManager.c(new yh.a<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$lazyScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MemberScope invoke() {
                MemberScope memberScopeInvoke = getScope.invoke();
                return memberScopeInvoke instanceof a ? ((a) memberScopeInvoke).i() : memberScopeInvoke;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LazyScopeAdapter(m NO_LOCKS, yh.a aVar, int i10, u uVar) {
        if ((i10 & 1) != 0) {
            NO_LOCKS = LockBasedStorageManager.f127923e;
            f0.o(NO_LOCKS, "NO_LOCKS");
        }
        this(NO_LOCKS, aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @i
    public LazyScopeAdapter(@dl.d yh.a<? extends MemberScope> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        f0.p(getScope, "getScope");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @dl.d
    protected MemberScope j() {
        return this.f127581b.invoke();
    }
}
