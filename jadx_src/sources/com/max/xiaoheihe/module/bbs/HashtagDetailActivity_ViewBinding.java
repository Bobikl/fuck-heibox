package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.post.FloatingPostButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class HashtagDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashtagDetailActivity f79882b;

    @i1
    public HashtagDetailActivity_ViewBinding(HashtagDetailActivity hashtagDetailActivity) {
        this(hashtagDetailActivity, hashtagDetailActivity.getWindow().getDecorView());
    }

    @i1
    public HashtagDetailActivity_ViewBinding(HashtagDetailActivity hashtagDetailActivity, View view) {
        this.f79882b = hashtagDetailActivity;
        hashtagDetailActivity.viewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp_content, "field 'viewPager'", ViewPager.class);
        hashtagDetailActivity.mCommonTabLayout = (TabLayout) butterknife.internal.f.f(view, R.id.tab, "field 'mCommonTabLayout'", TabLayout.class);
        hashtagDetailActivity.tv_name = (TextView) butterknife.internal.f.f(view, R.id.tv_name, "field 'tv_name'", TextView.class);
        hashtagDetailActivity.tv_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_desc, "field 'tv_desc'", TextView.class);
        hashtagDetailActivity.tv_long_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_long_desc, "field 'tv_long_desc'", TextView.class);
        hashtagDetailActivity.iv_icon_hashtag = (QMUIRadiusImageView) butterknife.internal.f.f(view, R.id.iv_icon_hashtag, "field 'iv_icon_hashtag'", QMUIRadiusImageView.class);
        hashtagDetailActivity.abl = (AppBarLayout) butterknife.internal.f.f(view, R.id.abl, "field 'abl'", AppBarLayout.class);
        hashtagDetailActivity.v_title_bg = butterknife.internal.f.e(view, R.id.v_title_bg, "field 'v_title_bg'");
        hashtagDetailActivity.tb_title_trans = (TitleBar) butterknife.internal.f.f(view, R.id.tb_title_trans, "field 'tb_title_trans'", TitleBar.class);
        hashtagDetailActivity.vg_post = (FloatingPostButton) butterknife.internal.f.f(view, R.id.vg_post, "field 'vg_post'", FloatingPostButton.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26510, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashtagDetailActivity hashtagDetailActivity = this.f79882b;
        if (hashtagDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79882b = null;
        hashtagDetailActivity.viewPager = null;
        hashtagDetailActivity.mCommonTabLayout = null;
        hashtagDetailActivity.tv_name = null;
        hashtagDetailActivity.tv_desc = null;
        hashtagDetailActivity.tv_long_desc = null;
        hashtagDetailActivity.iv_icon_hashtag = null;
        hashtagDetailActivity.abl = null;
        hashtagDetailActivity.v_title_bg = null;
        hashtagDetailActivity.tb_title_trans = null;
        hashtagDetailActivity.vg_post = null;
    }
}
