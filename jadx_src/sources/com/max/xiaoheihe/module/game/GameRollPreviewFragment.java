package com.max.xiaoheihe.module.game;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@n9.a({com.max.hbminiprogram.d.class})
public class GameRollPreviewFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private WebviewFragment f84732p;

    public class a extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 1;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33639, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            GameRollPreviewFragment.this.f84732p = new com.max.xiaoheihe.module.webview.u(lb.a.I3).w("1").x("1").a();
            GameRollPreviewFragment.this.f84732p.Q7(true);
            return GameRollPreviewFragment.this.f84732p;
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33640, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : com.max.xiaoheihe.utils.d.n0(R.string.miniprogram_roll);
        }

        @Override // androidx.fragment.app.n0, androidx.viewpager.widget.a
        @androidx.annotation.p0
        public Parcelable saveState() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L4(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33638, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.M2);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.rules));
        startActivity(intent);
    }

    public static Fragment M4(@androidx.annotation.p0 Map<String, ?> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 33632, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        new Bundle();
        return new GameRollPreviewFragment();
    }

    private void N4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33635, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBar.setLeftActionIcon(R.drawable.common_question);
        this.mTitleBar.setLeftActionIconOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87760b.L4(view);
            }
        });
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @androidx.annotation.n0
    public Fragment a2(@androidx.annotation.p0 Map<String, ?> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 33637, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : M4(map);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33633, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.layout_sample_vp);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mTitleBar.setTitle("0元抽奖");
        this.mViewPager.setAdapter(new a(getChildFragmentManager()));
        N4(0);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33634, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        WebviewFragment webviewFragment = this.f84732p;
        if (webviewFragment != null) {
            webviewFragment.onRefresh();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    @androidx.annotation.p0
    public HBShareProtocolData y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33636, new Class[0], HBShareProtocolData.class);
        return patchProxyResultProxy.isSupported ? (HBShareProtocolData) patchProxyResultProxy.result : new HBShareProtocolData(getString(R.string.miniprogram_roll), getString(R.string.miniprogram_share_desc), lb.a.A1, "", null, null, com.max.hbshare.c.f72558n, null, null);
    }
}
