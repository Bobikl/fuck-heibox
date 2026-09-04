package jf;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.z;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccessFriendInviteDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a extends BaseFakeRemoteDataSource<Result<?>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f124334i = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f124335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f124336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private z<Result<?>> f124337h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callBack) {
        super(callBack);
        f0.p(callBack, "callBack");
        this.f124337h = g().D(this.f124335f, this.f124336g);
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    @dl.e
    public z<Result<?>> d() {
        return this.f124337h;
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    public void j(@dl.e z<Result<?>> zVar) {
        this.f124337h = zVar;
    }

    public final void k(@dl.d String inviteID, @dl.d String state) {
        if (PatchProxy.proxy(new Object[]{inviteID, state}, this, changeQuickRedirect, false, 28479, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(inviteID, "inviteID");
        f0.p(state, "state");
        this.f124335f = inviteID;
        this.f124336g = state;
        j(g().D(inviteID, state));
        h(false);
    }
}
