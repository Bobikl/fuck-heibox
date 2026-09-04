package com.max.xiaoheihe.module.bbs.messagecenter;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSOfficialMessagesObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OfficialNotifyListFragmentRepo.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f81369b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private jf.e f81370a;

    public final void a(@e String str, int i10, int i11, @e String str2, @dl.d com.max.xiaoheihe.base.mvvm.repository.a<Result<BBSOfficialMessagesObj>> callback) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11), str2, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28418, new Class[]{String.class, cls, cls, String.class, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        if (this.f81370a == null) {
            this.f81370a = new jf.e(callback);
        }
        jf.e eVar = this.f81370a;
        f0.m(eVar);
        eVar.k(str, i10, i11, str2);
    }

    @e
    public final jf.e b() {
        return this.f81370a;
    }

    public final void c(@e jf.e eVar) {
        this.f81370a = eVar;
    }
}
