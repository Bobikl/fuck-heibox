package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.text.TextUtils;
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
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGDetailActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    SlidingTabLayout L;
    private String M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private ArrayList<KeyDescObj> S;
    private ArrayList<Fragment> T = new ArrayList<>();

    @BindView(R.id.vp_region)
    ViewPager vpRegion;

    private void M1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38171, new Class[0], Void.TYPE).isSupported || getIntent() == null) {
            return;
        }
        this.S = (ArrayList) getIntent().getSerializableExtra("region_filter");
        this.Q = getIntent().getStringExtra("nickname");
        this.P = getIntent().getStringExtra("mode");
        this.M = getIntent().getStringExtra("season");
        this.N = getIntent().getStringExtra("region");
        this.R = getIntent().getStringExtra("fpp");
        String stringExtra = getIntent().getStringExtra("player_id");
        this.O = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.O = this.Q;
        }
    }

    private void N1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38172, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.S)) {
            return;
        }
        String[] strArr = new String[this.S.size()];
        for (int i10 = 0; i10 < this.S.size(); i10++) {
            this.T.add(PUBGDetailFragment.h4(this.Q, this.P, this.M, this.R, this.S.get(i10).getKey(), this.O));
            strArr[i10] = this.S.get(i10).getValue();
        }
        this.vpRegion.setAdapter(new n(getSupportFragmentManager(), this.T));
        this.L.setViewPager(this.vpRegion, strArr);
        for (int i11 = 0; i11 < this.S.size(); i11++) {
            if (this.S.get(i11).getKey().equals(this.N)) {
                this.L.setCurrentTab(i11);
                return;
            }
        }
    }

    public static void O1(Context context, ArrayList<KeyDescObj> arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (PatchProxy.proxy(new Object[]{context, arrayList, str, str2, str3, str4, str5, str6, str7, str8}, null, changeQuickRedirect, true, 38169, new Class[]{Context.class, ArrayList.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.X(context, arrayList, str, str2, str3, str4, str5, str6, str7, str8));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38170, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_pubg_detail);
        this.f66620u = ButterKnife.a(this);
        this.L = this.f66616q.getTitleTabLayout();
        this.f66616q.a0();
        this.f66617r.setVisibility(0);
        M1();
        N1();
    }
}
