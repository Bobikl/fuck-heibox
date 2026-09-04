package com.max.xiaoheihe.module.favour;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.z;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CYPageDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a extends BaseFakeRemoteDataSource<Result<?>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83848g = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private z<Result<?>> f83849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callBack) {
        super(callBack);
        f0.p(callBack, "callBack");
        this.f83849f = g().d4("-1", new HashMap(16));
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    @dl.e
    public z<Result<?>> d() {
        return this.f83849f;
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    public void j(@dl.e z<Result<?>> zVar) {
        this.f83849f = zVar;
    }

    public final void k(@dl.d String commentID) {
        if (PatchProxy.proxy(new Object[]{commentID}, this, changeQuickRedirect, false, 31526, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(commentID, "commentID");
        j(g().d4(commentID, new HashMap(16)));
        h(true);
    }

    public final void l(@dl.d String commentID, @dl.d String op) {
        if (PatchProxy.proxy(new Object[]{commentID, op}, this, changeQuickRedirect, false, 31528, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(commentID, "commentID");
        f0.p(op, "op");
        j(g().C3(commentID, op));
        h(false);
    }

    public final void m(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 31527, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        j(g().n6(str, str2, str3, str4, str5, str6, str7));
        h(false);
    }
}
