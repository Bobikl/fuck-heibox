package jf;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.z;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CancelFollowUserDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class b extends BaseFakeRemoteDataSource<Result<?>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f124338h = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f124339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private z<Result<?>> f124340g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callBack) {
        super(callBack);
        f0.p(callBack, "callBack");
        this.f124340g = g().f6(this.f124339f);
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    @dl.e
    public z<Result<?>> d() {
        return this.f124340g;
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    public void j(@dl.e z<Result<?>> zVar) {
        this.f124340g = zVar;
    }

    public final void k(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28480, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f124339f = str;
        j(g().f6(str));
        h(true);
    }
}
