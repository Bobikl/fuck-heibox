package com.max.xiaoheihe.module.account;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.BBSInfoObj;
import com.max.xiaoheihe.bean.account.UserProfileResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.w8;
import java.util.ArrayList;

/* JADX INFO: compiled from: FriendsAndFollowsFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@com.max.hbcommon.analytics.m(path = lb.d.N4)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f78906g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f78907h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w8 f78908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f78909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f78910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f78911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private UserProfileResultObj f78912f;

    /* JADX INFO: compiled from: FriendsAndFollowsFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final d a(@dl.e String str, @dl.e String str2, @dl.e String str3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 22944, new Class[]{String.class, String.class, String.class}, d.class);
            if (patchProxyResultProxy.isSupported) {
                return (d) patchProxyResultProxy.result;
            }
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("userid", str);
            bundle.putString("key", str2);
            bundle.putString("from", str3);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* JADX INFO: compiled from: FriendsAndFollowsFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<UserProfileResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22945, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (d.this.isActive()) {
                d.Q3(d.this);
            }
        }

        public void onNext(@dl.d Result<UserProfileResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22946, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (d.this.isActive()) {
                d.this.f78912f = result.getResult();
                d.this.T3();
                d.P3(d.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22947, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserProfileResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: FriendsAndFollowsFragment.kt */
    public static final class c extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(d.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22948, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 1) {
                FollowingAndFansFragment followingAndFansFragmentP4 = FollowingAndFansFragment.p4(d.this.f78909c, 0);
                kotlin.jvm.internal.f0.o(followingAndFansFragmentP4, "{\n                      … 0)\n                    }");
                return followingAndFansFragmentP4;
            }
            if (i10 == 2) {
                FollowingAndFansFragment followingAndFansFragmentQ4 = FollowingAndFansFragment.q4(d.this.f78909c, 1, d.this.f78911e);
                kotlin.jvm.internal.f0.o(followingAndFansFragmentQ4, "{\n                      …om)\n                    }");
                return followingAndFansFragmentQ4;
            }
            if (i10 != 3) {
                return new FriendsFragment();
            }
            FollowingAndFansFragment followingAndFansFragmentP5 = FollowingAndFansFragment.p4(d.this.f78909c, 2);
            kotlin.jvm.internal.f0.o(followingAndFansFragmentP5, "{\n                      … 2)\n                    }");
            return followingAndFansFragmentP5;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 4;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FriendsAndFollowsFragment.kt */
    public static final class C0651d extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0651d() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22949, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            w8 w8Var = d.this.f78908b;
            if (w8Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                w8Var = null;
            }
            w8Var.f117079b.c(i10);
        }
    }

    /* JADX INFO: compiled from: FriendsAndFollowsFragment.kt */
    public static final class e implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj data, int i10) {
            if (PatchProxy.proxy(new Object[]{data, new Integer(i10)}, this, changeQuickRedirect, false, 22950, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            w8 w8Var = d.this.f78908b;
            if (w8Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                w8Var = null;
            }
            w8Var.f117080c.setCurrentItem(i10, true);
        }
    }

    public static final /* synthetic */ void P3(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 22943, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.showContentView();
    }

    public static final /* synthetic */ void Q3(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 22942, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.showError();
    }

    private final void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22938, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w8 w8Var = this.f78908b;
        w8 w8Var2 = null;
        if (w8Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            w8Var = null;
        }
        w8Var.f117080c.setAdapter(new c());
        w8 w8Var3 = this.f78908b;
        if (w8Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            w8Var3 = null;
        }
        w8Var3.f117080c.registerOnPageChangeCallback(new C0651d());
        String str = this.f78910d;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 301801502) {
                if (str.equals(lb.c.f131110f)) {
                    w8 w8Var4 = this.f78908b;
                    if (w8Var4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        w8Var2 = w8Var4;
                    }
                    w8Var2.f117080c.setCurrentItem(3, false);
                    return;
                }
                return;
            }
            if (iHashCode == 765915793) {
                if (str.equals("following")) {
                    w8 w8Var5 = this.f78908b;
                    if (w8Var5 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        w8Var2 = w8Var5;
                    }
                    w8Var2.f117080c.setCurrentItem(2, false);
                    return;
                }
                return;
            }
            if (iHashCode == 989204668 && str.equals("recommend")) {
                w8 w8Var6 = this.f78908b;
                if (w8Var6 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    w8Var2 = w8Var6;
                }
                w8Var2.f117080c.setCurrentItem(1, false);
            }
        }
    }

    public final void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22940, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.d("getUserProfile", "getUserProfile");
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i8(this.f78909c).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    public final void T3() {
        AccountDetailObj account_detail;
        BBSInfoObj bbs_info;
        AccountDetailObj account_detail2;
        BBSInfoObj bbs_info2;
        AccountDetailObj account_detail3;
        BBSInfoObj bbs_info3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22939, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(getString(R.string.friend));
        keyDescObj.setKey("friend");
        UserProfileResultObj userProfileResultObj = this.f78912f;
        w8 w8Var = null;
        keyDescObj.setNum((userProfileResultObj == null || (account_detail3 = userProfileResultObj.getAccount_detail()) == null || (bbs_info3 = account_detail3.getBbs_info()) == null) ? null : bbs_info3.getFriend_num());
        keyDescObj.setChecked(kotlin.jvm.internal.f0.g(this.f78910d, keyDescObj.getKey()) || this.f78910d == null);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc(getString(R.string.recommend));
        keyDescObj2.setKey("recommend");
        keyDescObj2.setChecked(kotlin.jvm.internal.f0.g(this.f78910d, keyDescObj2.getKey()));
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setDesc(getString(R.string.follow));
        keyDescObj3.setKey("following");
        UserProfileResultObj userProfileResultObj2 = this.f78912f;
        keyDescObj3.setNum((userProfileResultObj2 == null || (account_detail2 = userProfileResultObj2.getAccount_detail()) == null || (bbs_info2 = account_detail2.getBbs_info()) == null) ? null : bbs_info2.getFollow_num());
        keyDescObj3.setChecked(kotlin.jvm.internal.f0.g(this.f78910d, keyDescObj3.getKey()));
        arrayList.add(keyDescObj3);
        KeyDescObj keyDescObj4 = new KeyDescObj();
        keyDescObj4.setDesc(getString(R.string.fans));
        keyDescObj4.setKey(lb.c.f131110f);
        UserProfileResultObj userProfileResultObj3 = this.f78912f;
        keyDescObj4.setNum((userProfileResultObj3 == null || (account_detail = userProfileResultObj3.getAccount_detail()) == null || (bbs_info = account_detail.getBbs_info()) == null) ? null : bbs_info.getFan_num());
        keyDescObj4.setChecked(kotlin.jvm.internal.f0.g(this.f78910d, keyDescObj4.getKey()));
        arrayList.add(keyDescObj4);
        w8 w8Var2 = this.f78908b;
        if (w8Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            w8Var2 = null;
        }
        w8Var2.f117079b.setData(arrayList);
        w8 w8Var3 = this.f78908b;
        if (w8Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            w8Var3 = null;
        }
        w8Var3.f117079b.setMOnTabCheckedListener(new e());
        w8 w8Var4 = this.f78908b;
        if (w8Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            w8Var = w8Var4;
        }
        w8Var.f117079b.d();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22937, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        w8 w8VarC = w8.c(this.mInflater);
        kotlin.jvm.internal.f0.o(w8VarC, "inflate(mInflater)");
        this.f78908b = w8VarC;
        if (w8VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            w8VarC = null;
        }
        setContentView(w8VarC);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f78909c = arguments.getString("userid");
            this.f78910d = arguments.getString("key");
            this.f78911e = arguments.getString("from");
        }
        S3();
        if (!com.max.xiaoheihe.utils.i0.q(this.f78909c)) {
            T3();
        } else {
            showLoading();
            R3();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22941, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        showLoading();
        R3();
    }
}
