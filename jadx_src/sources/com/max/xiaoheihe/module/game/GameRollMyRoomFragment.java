package com.max.xiaoheihe.module.game;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbwallet.MallCouponListFragment;
import com.max.hbwallet.RollCouponListFragment;
import com.max.hbwallet.bean.MallCouponListResultObj;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameRollMyRoomFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d, MallCouponListFragment.k {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewPager f84727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SlidingTabLayout f84728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String[] f84729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.viewpager.widget.a f84730s;

    public class a extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 3;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33631, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 0) {
                return GameRollRoomListFragment.j5("me", GameListObj.ROLL_RELATE_TYPE_JOINED);
            }
            return i10 == 1 ? GameRollRoomListFragment.j5("me", GameListObj.ROLL_RELATE_TYPE_FOUNDED) : RollCouponListFragment.X4();
        }
    }

    public static GameRollMyRoomFragment I4(Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 33629, new Class[]{Bundle.class}, GameRollMyRoomFragment.class);
        return patchProxyResultProxy.isSupported ? (GameRollMyRoomFragment) patchProxyResultProxy.result : new GameRollMyRoomFragment();
    }

    @Override // com.max.hbwallet.MallCouponListFragment.k
    public void U1(String str, MallCouponListResultObj mallCouponListResultObj) {
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33630, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.fragment_roll_my_room);
        this.f84727p = (ViewPager) view.findViewById(R.id.vp);
        this.f84728q = (SlidingTabLayout) view.findViewById(R.id.tab_title);
        a aVar = new a(getChildFragmentManager());
        this.f84730s = aVar;
        this.f84727p.setAdapter(aVar);
        String[] strArr = {getString(R.string.roll_activity_include_me), getString(R.string.roll_activity_i_started), "我的卡券"};
        this.f84729r = strArr;
        this.f84728q.setViewPager(this.f84727p, strArr);
        this.f84728q.setVisibility(0);
        this.mTitleBar.setTitle("ROLL房间");
        this.mTitleBarDivider.setVisibility(8);
    }

    @Override // com.max.hbwallet.MallCouponListFragment.k
    public void b(List<MallCouponObj> list) {
    }
}
