package com.max.xiaoheihe.module.favour;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.z;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CYPageDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class b extends BaseFakeRemoteDataSource<BBSUserMsgResult<List<? extends BBSUserMsgObj>>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83850g = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private z<BBSUserMsgResult<List<BBSUserMsgObj>>> f83851f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d com.max.xiaoheihe.base.mvvm.repository.a<BBSUserMsgResult<List<BBSUserMsgObj>>> callBack) {
        super(callBack);
        f0.p(callBack, "callBack");
        com.max.xiaoheihe.network.e eVarG = g();
        String userid = i0.o().getAccount_detail().getUserid();
        this.f83851f = eVarG.V5(userid == null ? "-1" : userid, 0, 30, "1");
    }

    public static /* synthetic */ void l(b bVar, int i10, String str, int i11, Object obj) {
        Object[] objArr = {bVar, new Integer(i10), str, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31542, new Class[]{b.class, cls, String.class, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            str = "0";
        }
        bVar.k(i10, str);
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    @dl.e
    public z<BBSUserMsgResult<List<? extends BBSUserMsgObj>>> d() {
        return this.f83851f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    public void j(@dl.e z<BBSUserMsgResult<List<? extends BBSUserMsgObj>>> zVar) {
        this.f83851f = zVar;
    }

    public final void k(int i10, @dl.d String filterType) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), filterType}, this, changeQuickRedirect, false, 31541, new Class[]{Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(filterType, "filterType");
        com.max.xiaoheihe.network.e eVarG = g();
        String userid = i0.o().getAccount_detail().getUserid();
        if (userid == null) {
            userid = "-1";
        }
        j(eVarG.G2(userid, i10, 30, "1", filterType));
        h(true);
    }
}
