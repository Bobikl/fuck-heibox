package com.max.xiaoheihe.module.game.ow;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.f;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class OWGameDataFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OWGameDataFragment f87904b;

    @i1
    public OWGameDataFragment_ViewBinding(OWGameDataFragment oWGameDataFragment, View view) {
        this.f87904b = oWGameDataFragment;
        oWGameDataFragment.mPlayerInfoCardView = (CardView) f.f(view, R.id.cv_player_info, "field 'mPlayerInfoCardView'", CardView.class);
        oWGameDataFragment.mSmartRefreshLayout = (SmartRefreshLayout) f.f(view, R.id.srl_fragment_r6_data, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
        oWGameDataFragment.mVgMessage = (ViewGroup) f.f(view, R.id.rl_message, "field 'mVgMessage'", ViewGroup.class);
        oWGameDataFragment.vg_content_list = (ViewGroup) f.f(view, R.id.vg_content_list, "field 'vg_content_list'", ViewGroup.class);
        oWGameDataFragment.mVgPlayerInfoWrapper = (ViewGroup) f.f(view, R.id.vg_r6_data_player_info_wrapper, "field 'mVgPlayerInfoWrapper'", ViewGroup.class);
        oWGameDataFragment.mIvHeadImage = (ImageView) f.f(view, R.id.iv_r6_data_head_image, "field 'mIvHeadImage'", ImageView.class);
        oWGameDataFragment.mIvAvatar = (ImageView) f.f(view, R.id.iv_fragment_r6_data_avatar, "field 'mIvAvatar'", ImageView.class);
        oWGameDataFragment.tv_level = (TextView) f.f(view, R.id.tv_level, "field 'tv_level'", TextView.class);
        oWGameDataFragment.iv_level_frame = (ImageView) f.f(view, R.id.iv_level_frame, "field 'iv_level_frame'", ImageView.class);
        oWGameDataFragment.iv_level_frame_icon = (ImageView) f.f(view, R.id.iv_level_frame_icon, "field 'iv_level_frame_icon'", ImageView.class);
        oWGameDataFragment.mTvNickname = (TextView) f.f(view, R.id.tv_fragment_r6_data_nickname, "field 'mTvNickname'", TextView.class);
        oWGameDataFragment.mIvUpdateIcon = (ImageView) f.f(view, R.id.iv_fragment_r6_data_update_icon, "field 'mIvUpdateIcon'", ImageView.class);
        oWGameDataFragment.mTvUpdateBtnDesc = (TextView) f.f(view, R.id.tv_fragment_r6_data_update_text, "field 'mTvUpdateBtnDesc'", TextView.class);
        oWGameDataFragment.mVgUpdate = (ViewGroup) f.f(view, R.id.vg_fragment_r6_data_update, "field 'mVgUpdate'", ViewGroup.class);
        oWGameDataFragment.mTvUpdateDesc = (TextView) f.f(view, R.id.tv_fragment_r6_data_update_time, "field 'mTvUpdateDesc'", TextView.class);
        oWGameDataFragment.iv_rank_img = (ImageView) f.f(view, R.id.iv_rank_img, "field 'iv_rank_img'", ImageView.class);
        oWGameDataFragment.tv_r6_data_desc2 = (TextView) f.f(view, R.id.tv_r6_data_desc2, "field 'tv_r6_data_desc2'", TextView.class);
        oWGameDataFragment.tv_r6_data_desc1 = (TextView) f.f(view, R.id.tv_r6_data_desc1, "field 'tv_r6_data_desc1'", TextView.class);
        oWGameDataFragment.mVSpace = f.e(view, R.id.v_fragment_r6_game_data, "field 'mVSpace'");
        oWGameDataFragment.rv_header_data = (RecyclerView) f.f(view, R.id.rv_header_data, "field 'rv_header_data'", RecyclerView.class);
        oWGameDataFragment.mRadarChartWarpper = (ViewGroup) f.f(view, R.id.view_radar_chart, "field 'mRadarChartWarpper'", ViewGroup.class);
        oWGameDataFragment.mVgBindHint = (ViewGroup) f.f(view, R.id.vg_fragment_r6_bind_hint, "field 'mVgBindHint'", ViewGroup.class);
        oWGameDataFragment.mBottomSpaceView = f.e(view, R.id.bottom_space, "field 'mBottomSpaceView'");
        oWGameDataFragment.ll_expanded_data = f.e(view, R.id.ll_expanded_data, "field 'll_expanded_data'");
        oWGameDataFragment.tv_data_expand = (TextView) f.f(view, R.id.tv_data_expand, "field 'tv_data_expand'", TextView.class);
        oWGameDataFragment.rv_expanded_data = (RecyclerView) f.f(view, R.id.rv_expanded_data, "field 'rv_expanded_data'", RecyclerView.class);
        oWGameDataFragment.vg_season = (ViewGroup) f.f(view, R.id.vg_season, "field 'vg_season'", ViewGroup.class);
        oWGameDataFragment.tv_season = (TextView) f.f(view, R.id.tv_season, "field 'tv_season'", TextView.class);
        oWGameDataFragment.tv_season_arrow = (TextView) f.f(view, R.id.tv_season_arrow, "field 'tv_season_arrow'", TextView.class);
        oWGameDataFragment.vg_medal = (ViewGroup) f.f(view, R.id.vg_medal, "field 'vg_medal'", ViewGroup.class);
        oWGameDataFragment.tv_medal_gold = (TextView) f.f(view, R.id.tv_medal_gold, "field 'tv_medal_gold'", TextView.class);
        oWGameDataFragment.tv_medal_silver = (TextView) f.f(view, R.id.tv_medal_silver, "field 'tv_medal_silver'", TextView.class);
        oWGameDataFragment.tv_medal_bronze = (TextView) f.f(view, R.id.tv_medal_bronze, "field 'tv_medal_bronze'", TextView.class);
        oWGameDataFragment.mWebView = (WebView) f.f(view, R.id.webview_update, "field 'mWebView'", WebView.class);
        oWGameDataFragment.vg_data_container = f.e(view, R.id.vg_data_container, "field 'vg_data_container'");
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38005, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        OWGameDataFragment oWGameDataFragment = this.f87904b;
        if (oWGameDataFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f87904b = null;
        oWGameDataFragment.mPlayerInfoCardView = null;
        oWGameDataFragment.mSmartRefreshLayout = null;
        oWGameDataFragment.mVgMessage = null;
        oWGameDataFragment.vg_content_list = null;
        oWGameDataFragment.mVgPlayerInfoWrapper = null;
        oWGameDataFragment.mIvHeadImage = null;
        oWGameDataFragment.mIvAvatar = null;
        oWGameDataFragment.tv_level = null;
        oWGameDataFragment.iv_level_frame = null;
        oWGameDataFragment.iv_level_frame_icon = null;
        oWGameDataFragment.mTvNickname = null;
        oWGameDataFragment.mIvUpdateIcon = null;
        oWGameDataFragment.mTvUpdateBtnDesc = null;
        oWGameDataFragment.mVgUpdate = null;
        oWGameDataFragment.mTvUpdateDesc = null;
        oWGameDataFragment.iv_rank_img = null;
        oWGameDataFragment.tv_r6_data_desc2 = null;
        oWGameDataFragment.tv_r6_data_desc1 = null;
        oWGameDataFragment.mVSpace = null;
        oWGameDataFragment.rv_header_data = null;
        oWGameDataFragment.mRadarChartWarpper = null;
        oWGameDataFragment.mVgBindHint = null;
        oWGameDataFragment.mBottomSpaceView = null;
        oWGameDataFragment.ll_expanded_data = null;
        oWGameDataFragment.tv_data_expand = null;
        oWGameDataFragment.rv_expanded_data = null;
        oWGameDataFragment.vg_season = null;
        oWGameDataFragment.tv_season = null;
        oWGameDataFragment.tv_season_arrow = null;
        oWGameDataFragment.vg_medal = null;
        oWGameDataFragment.tv_medal_gold = null;
        oWGameDataFragment.tv_medal_silver = null;
        oWGameDataFragment.tv_medal_bronze = null;
        oWGameDataFragment.mWebView = null;
        oWGameDataFragment.vg_data_container = null;
    }
}
