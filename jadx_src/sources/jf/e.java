package jf;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.max.xiaoheihe.bean.bbs.BBSOfficialMessagesObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OfficialMessageV2DataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class e extends BaseFakeRemoteDataSource<Result<BBSOfficialMessagesObj>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f124348f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<BBSOfficialMessagesObj>> callback) {
        super(callback);
        f0.p(callback, "callback");
    }

    public final void k(@dl.e String str, int i10, int i11, @dl.e String str2) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28483, new Class[]{String.class, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        j(g().O5(str, i10, i11, str2));
        h(true);
    }
}
