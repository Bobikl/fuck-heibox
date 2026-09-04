package jf;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.z;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FollowUserDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class d extends BaseFakeRemoteDataSource<Result<?>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f124344i = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f124345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f124346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private z<Result<?>> f124347h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callBack) {
        super(callBack);
        f0.p(callBack, "callBack");
        this.f124347h = g().J7(this.f124345f, this.f124346g);
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    @dl.e
    public z<Result<?>> d() {
        return this.f124347h;
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    public void j(@dl.e z<Result<?>> zVar) {
        this.f124347h = zVar;
    }

    public final void k(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 28482, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f124345f = str;
        this.f124346g = str2;
        j(g().J7(str, str2));
        h(true);
    }
}
