package com.max.xiaoheihe.module.game.pubg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.n;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGFriendRankActivity extends BaseActivity implements PUBGFriendRankFragment.i {
    public static final String T = "nickname";
    public static final String U = "player_id";
    public static final String V = "season";
    public static final String W = "mode";
    public static final String X = "region";
    public static final String Y = "category";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;
    private String N;
    private String O;
    private List<Fragment> P = new ArrayList();
    private n Q;
    SlidingTabLayout R;
    List<KeyDescObj> S;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    public static Intent M1(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 38240, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) PUBGFriendRankActivity.class);
        intent.putExtra("nickname", str);
        intent.putExtra("season", str2);
        intent.putExtra("region", str3);
        return intent;
    }

    private void N1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38242, new Class[0], Void.TYPE).isSupported || getIntent() == null) {
            return;
        }
        this.L = getIntent().getStringExtra("nickname");
        this.M = getIntent().getStringExtra("player_id");
        this.N = getIntent().getStringExtra("season");
        this.O = getIntent().getStringExtra("region");
        String str = this.M;
        if (str == null || str.isEmpty()) {
            this.M = this.L;
        }
    }

    public static void O1(Context context, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 38239, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("nickname", str);
        bundle.putString("season", str2);
        bundle.putString("region", str3);
        if (com.max.xiaoheihe.module.littleprogram.b.p(context, com.max.xiaoheihe.module.littleprogram.b.f88751l, bundle)) {
            Intent intentM1 = M1(context, str, str2, str3);
            if (!(context instanceof Activity)) {
                intentM1.addFlags(268435456);
            }
            context.startActivity(intentM1);
        }
    }

    @Override // com.max.xiaoheihe.module.game.pubg.PUBGFriendRankFragment.i
    public void b1(List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 38243, new Class[]{List.class}, Void.TYPE).isSupported || list == null || this.S != null) {
            return;
        }
        this.S = list;
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < this.S.size(); i10++) {
            strArr[i10] = this.S.get(i10).getValue();
            if (i10 != 0) {
                this.P.add(PUBGFriendRankFragment.c4(this.L, this.N, this.O, this.S.get(i10).getKey(), this.M));
            } else if (this.P.get(0) instanceof PUBGFriendRankFragment) {
                ((PUBGFriendRankFragment) this.P.get(0)).d4(this.S.get(i10).getKey());
            }
        }
        this.Q.notifyDataSetChanged();
        this.R.setViewPager(this.mViewPager, strArr);
        this.R.setVisibility(0);
        this.f66616q.getAppbarTitleTextView().setVisibility(8);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38241, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        ButterKnife.a(this);
        N1();
        this.f66616q.setTitle(getString(R.string.friend_rank));
        this.R = this.f66616q.getTitleTabLayout();
        PUBGFriendRankFragment pUBGFriendRankFragmentC4 = PUBGFriendRankFragment.c4(this.L, this.N, this.O, null, this.M);
        this.P.clear();
        this.P.add(pUBGFriendRankFragmentC4);
        n nVar = new n(getSupportFragmentManager(), this.P);
        this.Q = nVar;
        this.mViewPager.setAdapter(nVar);
    }
}
