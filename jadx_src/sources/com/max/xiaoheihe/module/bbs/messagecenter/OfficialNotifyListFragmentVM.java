package com.max.xiaoheihe.module.bbs.messagecenter;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.BaseDisplayState;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.max.xiaoheihe.bean.bbs.BBSOfficialMessagesObj;
import com.max.xiaoheihe.bean.bbs.BBSUserNotifyObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.message.common.inter.ITagManager;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OfficialNotifyListFragmentVM.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class OfficialNotifyListFragmentVM extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f81341t = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private String f81342k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @e
    private String f81343l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f81344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f81345n = 30;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private ArrayList<BBSUserNotifyObj> f81346o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private i0<String> f81347p = new i0<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private i0<Boolean> f81348q = new i0<>(Boolean.FALSE);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private i0<Result<BBSOfficialMessagesObj>> f81349r = new i0<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final c f81350s = new c();

    /* JADX INFO: compiled from: OfficialNotifyListFragmentVM.kt */
    public static final class a implements com.max.xiaoheihe.base.mvvm.repository.a<Result<BBSOfficialMessagesObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void a(@dl.d Result<BBSOfficialMessagesObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28429, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(OfficialNotifyListFragmentVM.this.m().f(), Boolean.TRUE)) {
                com.max.hbcommon.utils.d.b("cqtest", ITagManager.SUCCESS);
                OfficialNotifyListFragmentVM.this.z().r(Boolean.FALSE);
                OfficialNotifyListFragmentVM.this.k().r(BaseDisplayState.CONTENT);
                if (result.getResult().getMessages() != null) {
                    if (OfficialNotifyListFragmentVM.this.t() == 0) {
                        OfficialNotifyListFragmentVM.this.p().clear();
                    }
                    OfficialNotifyListFragmentVM.this.p().addAll(result.getResult().getMessages());
                    int size = OfficialNotifyListFragmentVM.this.p().size();
                    for (int i10 = 0; i10 < size; i10++) {
                        OfficialNotifyListFragmentVM.this.p().get(i10).setIndex(i10);
                    }
                    OfficialNotifyListFragmentVM.this.v().r(result);
                }
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28428, new Class[0], Void.TYPE).isSupported && f0.g(OfficialNotifyListFragmentVM.this.m().f(), Boolean.TRUE)) {
                OfficialNotifyListFragmentVM.this.z().r(Boolean.FALSE);
                OfficialNotifyListFragmentVM.this.k().r(BaseDisplayState.CONTENT);
                com.max.hbcommon.utils.d.b("cqtest", "finish");
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28427, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(OfficialNotifyListFragmentVM.this.m().f(), Boolean.TRUE)) {
                OfficialNotifyListFragmentVM.this.k().r(BaseDisplayState.ERROR);
                OfficialNotifyListFragmentVM.this.z().r(Boolean.FALSE);
                com.max.hbcommon.utils.d.b("cqtest", "error");
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<BBSOfficialMessagesObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28430, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    public final void A() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28425, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81348q.r(Boolean.TRUE);
        this.f81344m += 30;
        u();
    }

    public final void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28424, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81348q.r(Boolean.TRUE);
        this.f81344m = 0;
        u();
    }

    public final void C(@dl.d ArrayList<BBSUserNotifyObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 28419, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.f81346o = arrayList;
    }

    public final void D(@e String str) {
        this.f81342k = str;
    }

    public final void E(int i10) {
        this.f81345n = i10;
    }

    public final void F(int i10) {
        this.f81344m = i10;
    }

    public final void G(@dl.d i0<Result<BBSOfficialMessagesObj>> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 28422, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f81349r = i0Var;
    }

    public final void H(@dl.d i0<Boolean> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 28421, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f81348q = i0Var;
    }

    public final void I(@e String str) {
        this.f81343l = str;
    }

    public final void J(@dl.d i0<String> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 28420, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f81347p = i0Var;
    }

    @Override // com.max.xiaoheihe.base.mvvm.a
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28423, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        B();
    }

    @dl.d
    public final ArrayList<BBSUserNotifyObj> p() {
        return this.f81346o;
    }

    @e
    public final String r() {
        return this.f81342k;
    }

    public final int s() {
        return this.f81345n;
    }

    public final int t() {
        return this.f81344m;
    }

    public final void u() {
        String timestamp;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28426, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f81344m <= 0 || com.max.hbcommon.utils.c.w(this.f81346o)) {
            timestamp = null;
        } else {
            ArrayList<BBSUserNotifyObj> arrayList = this.f81346o;
            timestamp = arrayList.get(arrayList.size() - 1).getTimestamp();
        }
        this.f81350s.a(this.f81343l, this.f81344m, this.f81345n, timestamp, new a());
    }

    @dl.d
    public final i0<Result<BBSOfficialMessagesObj>> v() {
        return this.f81349r;
    }

    @dl.d
    public final c w() {
        return this.f81350s;
    }

    @e
    public final String x() {
        return this.f81343l;
    }

    @dl.d
    public final i0<String> y() {
        return this.f81347p;
    }

    @dl.d
    public final i0<Boolean> z() {
        return this.f81348q;
    }
}
