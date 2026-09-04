package com.max.xiaoheihe.module.game.pubg;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.adapter.n;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGFriendRankContainerFragment extends NativeLittleProgramFragment implements PUBGFriendRankFragment.i {
    private static final String A = "category";
    private static final String B = "player_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f88065w = "nickname";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f88066x = "season";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f88067y = "mode";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f88068z = "region";

    @BindView(R.id.vp)
    ViewPager mViewPager;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f88069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f88070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f88071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f88072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<Fragment> f88073t = new ArrayList();

    @BindView(R.id.tab_title)
    SlidingTabLayout tabCategory;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private n f88074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    List<KeyDescObj> f88075v;

    private void I4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38247, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        this.f88069p = getArguments().getString("nickname");
        this.f88070q = getArguments().getString("season");
        this.f88071r = getArguments().getString("region");
        String string = getArguments().getString("player_id");
        this.f88072s = string;
        if (TextUtils.isEmpty(string)) {
            this.f88072s = this.f88069p;
        }
    }

    public static PUBGFriendRankContainerFragment J4(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 38245, new Class[]{String.class, String.class, String.class}, PUBGFriendRankContainerFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PUBGFriendRankContainerFragment) patchProxyResultProxy.result;
        }
        PUBGFriendRankContainerFragment pUBGFriendRankContainerFragment = new PUBGFriendRankContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("nickname", str);
        bundle.putString("season", str2);
        bundle.putString("region", str3);
        pUBGFriendRankContainerFragment.setArguments(bundle);
        return pUBGFriendRankContainerFragment;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38246, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(this.rootView, z10);
        setContentView(R.layout.layout_sample_tab_layout_with_vp);
        ButterKnife.f(this, this.rootView);
        I4();
        this.mTitleBar.setTitle(getString(R.string.rank_in_friend));
        PUBGFriendRankFragment pUBGFriendRankFragmentC4 = PUBGFriendRankFragment.c4(this.f88069p, this.f88070q, this.f88071r, null, this.f88072s);
        this.f88073t.clear();
        this.f88073t.add(pUBGFriendRankFragmentC4);
        n nVar = new n(getChildFragmentManager(), this.f88073t);
        this.f88074u = nVar;
        this.mViewPager.setAdapter(nVar);
    }

    @Override // com.max.xiaoheihe.module.game.pubg.PUBGFriendRankFragment.i
    public void b1(List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 38248, new Class[]{List.class}, Void.TYPE).isSupported || list == null || this.f88075v != null) {
            return;
        }
        this.f88075v = list;
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < this.f88075v.size(); i10++) {
            strArr[i10] = this.f88075v.get(i10).getValue();
            if (i10 != 0) {
                this.f88073t.add(PUBGFriendRankFragment.c4(this.f88069p, this.f88070q, this.f88071r, this.f88075v.get(i10).getKey(), this.f88072s));
            } else if (this.f88073t.get(0) instanceof PUBGFriendRankFragment) {
                ((PUBGFriendRankFragment) this.f88073t.get(0)).d4(this.f88075v.get(i10).getKey());
            }
        }
        this.f88074u.notifyDataSetChanged();
        this.tabCategory.setViewPager(this.mViewPager, strArr);
        this.tabCategory.setVisibility(0);
    }
}
