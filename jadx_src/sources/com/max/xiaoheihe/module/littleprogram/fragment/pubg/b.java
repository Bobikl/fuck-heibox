package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.adapter.n;
import com.max.hbcommon.base.d;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.module.game.pubg.PUBGFriendRankFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import mb.y0;

/* JADX INFO: compiled from: PUBGFriendRankV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nPUBGFriendRankV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PUBGFriendRankV2Fragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGFriendRankV2Fragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1549#2:87\n1620#2,3:88\n*S KotlinDebug\n*F\n+ 1 PUBGFriendRankV2Fragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGFriendRankV2Fragment\n*L\n60#1:87\n60#1:88,3\n*E\n"})
@o(parameters = 0)
public final class b extends d implements PUBGFriendRankFragment.i {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f89303l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private String f89304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private String f89305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private String f89306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private String f89307e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private n f89309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private List<? extends KeyDescObj> f89310h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private TabLayout f89312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private y0 f89313k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private ArrayList<Fragment> f89308f = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private ArrayList<String> f89311i = new ArrayList<>();

    private final void L3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39481, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        Bundle arguments = getArguments();
        f0.m(arguments);
        this.f89304b = arguments.getString("nickname");
        Bundle arguments2 = getArguments();
        f0.m(arguments2);
        this.f89305c = arguments2.getString("season");
        Bundle arguments3 = getArguments();
        f0.m(arguments3);
        this.f89306d = arguments3.getString("region");
    }

    @e
    public final List<KeyDescObj> M3() {
        return this.f89310h;
    }

    @e
    public final TabLayout N3() {
        return this.f89312j;
    }

    @dl.d
    public final ArrayList<String> O3() {
        return this.f89311i;
    }

    public final void P3(@e List<? extends KeyDescObj> list) {
        this.f89310h = list;
    }

    public final void Q3(@e TabLayout tabLayout) {
        this.f89312j = tabLayout;
    }

    public final void R3(@dl.d ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 39479, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.f89311i = arrayList;
    }

    @Override // com.max.xiaoheihe.module.game.pubg.PUBGFriendRankFragment.i
    public void b1(@e List<? extends KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 39482, new Class[]{List.class}, Void.TYPE).isSupported || list == null || this.f89310h != null) {
            return;
        }
        this.f89310h = list;
        this.f89311i.clear();
        ArrayList<String> arrayList = this.f89311i;
        List<? extends KeyDescObj> list2 = this.f89310h;
        f0.m(list2);
        ArrayList arrayList2 = new ArrayList(t.Y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((KeyDescObj) it.next()).getValue());
        }
        arrayList.addAll(arrayList2);
        List<? extends KeyDescObj> list3 = this.f89310h;
        f0.m(list3);
        int size = list3.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                ArrayList<Fragment> arrayList3 = this.f89308f;
                String str = this.f89304b;
                String str2 = this.f89305c;
                String str3 = this.f89306d;
                List<? extends KeyDescObj> list4 = this.f89310h;
                f0.m(list4);
                arrayList3.add(PUBGFriendRankFragment.c4(str, str2, str3, list4.get(i10).getKey(), this.f89307e));
            } else if (this.f89308f.get(0) instanceof PUBGFriendRankFragment) {
                Fragment fragment = this.f89308f.get(0);
                f0.n(fragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.pubg.PUBGFriendRankFragment");
                List<? extends KeyDescObj> list5 = this.f89310h;
                f0.m(list5);
                ((PUBGFriendRankFragment) fragment).d4(list5.get(i10).getKey());
            }
        }
        n nVar = this.f89309g;
        f0.m(nVar);
        nVar.notifyDataSetChanged();
        TabLayout tabLayout = this.f89312j;
        if (tabLayout != null) {
            y0 y0Var = this.f89313k;
            if (y0Var == null) {
                f0.S("binding");
                y0Var = null;
            }
            tabLayout.setupWithViewPager(y0Var.f131834c);
        }
        TabLayout tabLayout2 = this.f89312j;
        if (tabLayout2 != null) {
            tabLayout2.setVisibility(0);
        }
        this.mTitleBar.getAppbarTitleTextView().setVisibility(8);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39480, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        y0 y0VarC = y0.c(this.mInflater);
        f0.o(y0VarC, "inflate(mInflater)");
        this.f89313k = y0VarC;
        y0 y0Var = null;
        if (y0VarC == null) {
            f0.S("binding");
            y0VarC = null;
        }
        setContentView(y0VarC);
        L3();
        y0 y0Var2 = this.f89313k;
        if (y0Var2 == null) {
            f0.S("binding");
            y0Var2 = null;
        }
        this.f89312j = y0Var2.f131833b;
        PUBGFriendRankFragment pUBGFriendRankFragmentC4 = PUBGFriendRankFragment.c4(this.f89304b, this.f89305c, this.f89306d, null, this.f89307e);
        this.f89308f.clear();
        this.f89308f.add(pUBGFriendRankFragmentC4);
        this.f89309g = new n(getChildFragmentManager(), this.f89308f, this.f89311i);
        y0 y0Var3 = this.f89313k;
        if (y0Var3 == null) {
            f0.S("binding");
        } else {
            y0Var = y0Var3;
        }
        y0Var.f131834c.setAdapter(this.f89309g);
    }
}
