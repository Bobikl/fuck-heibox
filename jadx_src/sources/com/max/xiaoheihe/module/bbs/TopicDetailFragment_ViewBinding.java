package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class TopicDetailFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TopicDetailFragment f80149b;

    @i1
    public TopicDetailFragment_ViewBinding(TopicDetailFragment topicDetailFragment, View view) {
        this.f80149b = topicDetailFragment;
        topicDetailFragment.mAppBarLayout = (AppBarLayout) butterknife.internal.f.f(view, R.id.abl, "field 'mAppBarLayout'", AppBarLayout.class);
        topicDetailFragment.mCollapsingToolbarLayout = (CollapsingToolbarLayout) butterknife.internal.f.f(view, R.id.ctl, "field 'mCollapsingToolbarLayout'", CollapsingToolbarLayout.class);
        topicDetailFragment.mToolbar = (TitleBar) butterknife.internal.f.f(view, R.id.toolbar, "field 'mToolbar'", TitleBar.class);
        topicDetailFragment.mStatusBar = butterknife.internal.f.e(view, R.id.status_bar, "field 'mStatusBar'");
        topicDetailFragment.mHeaderContainerView = butterknife.internal.f.e(view, R.id.vg_header_container, "field 'mHeaderContainerView'");
        topicDetailFragment.mBGContainer = butterknife.internal.f.e(view, R.id.bg_container, "field 'mBGContainer'");
        topicDetailFragment.mBGColorImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bg_color, "field 'mBGColorImageView'", ImageView.class);
        topicDetailFragment.mBGImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bg_img, "field 'mBGImageView'", ImageView.class);
        topicDetailFragment.mBGScrimImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bg_scrim, "field 'mBGScrimImageView'", ImageView.class);
        topicDetailFragment.mBGTopScrimImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bg_top_scrim, "field 'mBGTopScrimImageView'", ImageView.class);
        topicDetailFragment.mBGBottomGradientImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bg_bottom_gradient, "field 'mBGBottomGradientImageView'", ImageView.class);
        topicDetailFragment.mBGBottomScrimImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bg_bottom_scrim, "field 'mBGBottomScrimImageView'", ImageView.class);
        topicDetailFragment.mTopicNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_topic_name, "field 'mTopicNameTextView'", TextView.class);
        topicDetailFragment.mUserForbidInfoView = butterknife.internal.f.e(view, R.id.vg_user_forbid_info, "field 'mUserForbidInfoView'");
        topicDetailFragment.mUserAvatarImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_user_avatar, "field 'mUserAvatarImageView'", ImageView.class);
        topicDetailFragment.mUserNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_user_name, "field 'mUserNameTextView'", TextView.class);
        topicDetailFragment.mTopicToWikiView = butterknife.internal.f.e(view, R.id.vg_topic_to_wiki, "field 'mTopicToWikiView'");
        topicDetailFragment.ll_nav = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_nav, "field 'll_nav'", LinearLayout.class);
        topicDetailFragment.iv_game_icon = (ImageView) butterknife.internal.f.f(view, R.id.iv_game_icon, "field 'iv_game_icon'", ImageView.class);
        topicDetailFragment.vg_game_icon = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_game_icon, "field 'vg_game_icon'", ViewGroup.class);
        topicDetailFragment.vg_topic_name = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_topic_name, "field 'vg_topic_name'", ViewGroup.class);
        topicDetailFragment.iv_game_arrow = (ImageView) butterknife.internal.f.f(view, R.id.iv_game_arrow, "field 'iv_game_arrow'", ImageView.class);
        topicDetailFragment.mTopicToForbidHistoryView = butterknife.internal.f.e(view, R.id.vg_topic_to_forbid_history, "field 'mTopicToForbidHistoryView'");
        topicDetailFragment.mTopicProvisionsView = butterknife.internal.f.e(view, R.id.vg_topic_provisions, "field 'mTopicProvisionsView'");
        topicDetailFragment.vg_topic_entry = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_topic_entry, "field 'vg_topic_entry'", ViewGroup.class);
        topicDetailFragment.mSortView = butterknife.internal.f.e(view, R.id.vg_sort_header, "field 'mSortView'");
        topicDetailFragment.mTypeFilterTabLayout = (TabLayout) butterknife.internal.f.f(view, R.id.tl, "field 'mTypeFilterTabLayout'", TabLayout.class);
        topicDetailFragment.mSortFilterTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_filter_desc, "field 'mSortFilterTextView'", TextView.class);
        topicDetailFragment.mSortFilterDividerView = butterknife.internal.f.e(view, R.id.filter_desc_divider, "field 'mSortFilterDividerView'");
        topicDetailFragment.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
        topicDetailFragment.mWritePostImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_write_post, "field 'mWritePostImageView'", ImageView.class);
        topicDetailFragment.iv_follow_status = (ImageView) butterknife.internal.f.f(view, R.id.iv_follow_status, "field 'iv_follow_status'", ImageView.class);
        topicDetailFragment.v_related_topics_divider = butterknife.internal.f.e(view, R.id.v_related_topics_divider, "field 'v_related_topics_divider'");
        topicDetailFragment.vg_related_topics = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_related_topics, "field 'vg_related_topics'", ViewGroup.class);
        topicDetailFragment.ll_related_topics = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_related_topics, "field 'll_related_topics'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26932, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TopicDetailFragment topicDetailFragment = this.f80149b;
        if (topicDetailFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f80149b = null;
        topicDetailFragment.mAppBarLayout = null;
        topicDetailFragment.mCollapsingToolbarLayout = null;
        topicDetailFragment.mToolbar = null;
        topicDetailFragment.mStatusBar = null;
        topicDetailFragment.mHeaderContainerView = null;
        topicDetailFragment.mBGContainer = null;
        topicDetailFragment.mBGColorImageView = null;
        topicDetailFragment.mBGImageView = null;
        topicDetailFragment.mBGScrimImageView = null;
        topicDetailFragment.mBGTopScrimImageView = null;
        topicDetailFragment.mBGBottomGradientImageView = null;
        topicDetailFragment.mBGBottomScrimImageView = null;
        topicDetailFragment.mTopicNameTextView = null;
        topicDetailFragment.mUserForbidInfoView = null;
        topicDetailFragment.mUserAvatarImageView = null;
        topicDetailFragment.mUserNameTextView = null;
        topicDetailFragment.mTopicToWikiView = null;
        topicDetailFragment.ll_nav = null;
        topicDetailFragment.iv_game_icon = null;
        topicDetailFragment.vg_game_icon = null;
        topicDetailFragment.vg_topic_name = null;
        topicDetailFragment.iv_game_arrow = null;
        topicDetailFragment.mTopicToForbidHistoryView = null;
        topicDetailFragment.mTopicProvisionsView = null;
        topicDetailFragment.vg_topic_entry = null;
        topicDetailFragment.mSortView = null;
        topicDetailFragment.mTypeFilterTabLayout = null;
        topicDetailFragment.mSortFilterTextView = null;
        topicDetailFragment.mSortFilterDividerView = null;
        topicDetailFragment.mViewPager = null;
        topicDetailFragment.mWritePostImageView = null;
        topicDetailFragment.iv_follow_status = null;
        topicDetailFragment.v_related_topics_divider = null;
        topicDetailFragment.vg_related_topics = null;
        topicDetailFragment.ll_related_topics = null;
    }
}
