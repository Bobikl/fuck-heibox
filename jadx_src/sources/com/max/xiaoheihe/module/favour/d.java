package com.max.xiaoheihe.module.favour;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CYPageRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83883c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private b f83884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private a f83885b;

    public static /* synthetic */ void e(d dVar, int i10, String str, com.max.xiaoheihe.base.mvvm.repository.a aVar, int i11, Object obj) {
        Object[] objArr = {dVar, new Integer(i10), str, aVar, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31580, new Class[]{d.class, cls, String.class, com.max.xiaoheihe.base.mvvm.repository.a.class, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        dVar.d(i10, str, aVar);
    }

    public final void a(@dl.d String id2, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callBack) {
        if (PatchProxy.proxy(new Object[]{id2, callBack}, this, changeQuickRedirect, false, 31581, new Class[]{String.class, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(id2, "id");
        f0.p(callBack, "callBack");
        a aVar = new a(callBack);
        this.f83885b = aVar;
        f0.m(aVar);
        aVar.k(id2);
    }

    public final void b(@dl.d String commentID, @dl.d String op, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callBack) {
        if (PatchProxy.proxy(new Object[]{commentID, op, callBack}, this, changeQuickRedirect, false, 31583, new Class[]{String.class, String.class, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(commentID, "commentID");
        f0.p(op, "op");
        f0.p(callBack, "callBack");
        a aVar = new a(callBack);
        this.f83885b = aVar;
        f0.m(aVar);
        aVar.l(commentID, op);
    }

    public final void c(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> callBack) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, callBack}, this, changeQuickRedirect, false, 31582, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callBack, "callBack");
        a aVar = new a(callBack);
        this.f83885b = aVar;
        f0.m(aVar);
        aVar.m(str, str2, str3, str4, str5, str6, str7);
    }

    public final void d(int i10, @dl.d String filterType, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<BBSUserMsgResult<List<BBSUserMsgObj>>> callback) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), filterType, callback}, this, changeQuickRedirect, false, 31579, new Class[]{Integer.TYPE, String.class, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(filterType, "filterType");
        f0.p(callback, "callback");
        b bVar = new b(callback);
        this.f83884a = bVar;
        f0.m(bVar);
        bVar.k(i10, filterType);
    }
}
