package jf;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.z;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserMessageDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class g extends BaseFakeRemoteDataSource<BBSUserMsgResult<BBSUserMsgsObj>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f124353k = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f124354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f124355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f124356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f124357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private z<BBSUserMsgResult<BBSUserMsgsObj>> f124358j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d com.max.xiaoheihe.base.mvvm.repository.a<BBSUserMsgResult<BBSUserMsgsObj>> callBack) {
        super(callBack);
        f0.p(callBack, "callBack");
        this.f124357i = 30;
        this.f124358j = g().Z9(this.f124354f, this.f124355g, this.f124356h, this.f124357i);
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    @dl.e
    public z<BBSUserMsgResult<BBSUserMsgsObj>> d() {
        return this.f124358j;
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    public void j(@dl.e z<BBSUserMsgResult<BBSUserMsgsObj>> zVar) {
        this.f124358j = zVar;
    }

    public final void k(@dl.e String str, @dl.e String str2, int i10, int i11) {
        Object[] objArr = {str, str2, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28485, new Class[]{String.class, String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f124354f = str;
        this.f124355g = str2;
        this.f124356h = i10;
        this.f124357i = i11;
        j(g().Z9(str, str2, i10, i11));
        h(true);
    }
}
