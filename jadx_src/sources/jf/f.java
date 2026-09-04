package jf;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.max.xiaoheihe.bean.chat.StrangerMsgListResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.z;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StrangerMessageDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class f extends BaseFakeRemoteDataSource<Result<StrangerMsgListResultObj>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f124349i = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f124350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f124351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private z<Result<StrangerMsgListResultObj>> f124352h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<StrangerMsgListResultObj>> callBack) {
        super(callBack);
        f0.p(callBack, "callBack");
        this.f124351g = 30;
        this.f124352h = g().O4(this.f124350f, this.f124351g);
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    @dl.e
    public z<Result<StrangerMsgListResultObj>> d() {
        return this.f124352h;
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    public void j(@dl.e z<Result<StrangerMsgListResultObj>> zVar) {
        this.f124352h = zVar;
    }

    public final void k(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28484, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f124350f = i10;
        this.f124351g = i11;
        j(g().O4(i10, i11));
        h(true);
    }
}
