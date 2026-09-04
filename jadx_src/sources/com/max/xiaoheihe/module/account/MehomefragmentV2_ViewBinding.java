package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.flyco.tablayout.widget.MsgView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.component.HomeTitleBar;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class MehomefragmentV2_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MehomefragmentV2 f78203b;

    @i1
    public MehomefragmentV2_ViewBinding(MehomefragmentV2 mehomefragmentV2, View view) {
        this.f78203b = mehomefragmentV2;
        mehomefragmentV2.mAppBarLayout = (AppBarLayout) butterknife.internal.f.f(view, R.id.abl, "field 'mAppBarLayout'", AppBarLayout.class);
        mehomefragmentV2.mIvAvatar = (HeyBoxAvatarView) butterknife.internal.f.f(view, R.id.iv_me_home_fragment_avatar, "field 'mIvAvatar'", HeyBoxAvatarView.class);
        mehomefragmentV2.mTvUsername = (TextView) butterknife.internal.f.f(view, R.id.tv_me_home_fragment_username, "field 'mTvUsername'", TextView.class);
        mehomefragmentV2.mUserLevelContainer = (RelativeLayout) butterknife.internal.f.f(view, R.id.rl_me_home_fragment_level, "field 'mUserLevelContainer'", RelativeLayout.class);
        mehomefragmentV2.iv_default_medal = (ImageView) butterknife.internal.f.f(view, R.id.iv_default_medal, "field 'iv_default_medal'", ImageView.class);
        mehomefragmentV2.mVgLogin = (RelativeLayout) butterknife.internal.f.f(view, R.id.vg_me_home_fragment_login, "field 'mVgLogin'", RelativeLayout.class);
        mehomefragmentV2.vg_bbs_info = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_bbs_info, "field 'vg_bbs_info'", ViewGroup.class);
        mehomefragmentV2.tv_signature = (TextView) butterknife.internal.f.f(view, R.id.tv_signature, "field 'tv_signature'", TextView.class);
        mehomefragmentV2.ll_friends = (ViewGroup) butterknife.internal.f.f(view, R.id.ll_friends, "field 'll_friends'", ViewGroup.class);
        mehomefragmentV2.tv_friend_num = (TextView) butterknife.internal.f.f(view, R.id.tv_friend_num, "field 'tv_friend_num'", TextView.class);
        mehomefragmentV2.msg_friend_online_num = (MsgView) butterknife.internal.f.f(view, R.id.msg_friend_online_num, "field 'msg_friend_online_num'", MsgView.class);
        mehomefragmentV2.iv_no_friends = (ImageView) butterknife.internal.f.f(view, R.id.iv_no_friends, "field 'iv_no_friends'", ImageView.class);
        mehomefragmentV2.iv_not_friend_red_point = (ImageView) butterknife.internal.f.f(view, R.id.iv_not_friend_red_point, "field 'iv_not_friend_red_point'", ImageView.class);
        mehomefragmentV2.tv_follow_num = (TextView) butterknife.internal.f.f(view, R.id.tv_follow_num, "field 'tv_follow_num'", TextView.class);
        mehomefragmentV2.ll_follow = (ViewGroup) butterknife.internal.f.f(view, R.id.ll_follow, "field 'll_follow'", ViewGroup.class);
        mehomefragmentV2.ll_fans = (ViewGroup) butterknife.internal.f.f(view, R.id.ll_fans, "field 'll_fans'", ViewGroup.class);
        mehomefragmentV2.tv_fan_num = (TextView) butterknife.internal.f.f(view, R.id.tv_fan_num, "field 'tv_fan_num'", TextView.class);
        mehomefragmentV2.vg_person_award = butterknife.internal.f.e(view, R.id.vg_person_award, "field 'vg_person_award'");
        mehomefragmentV2.tv_person_award = (TextView) butterknife.internal.f.f(view, R.id.tv_person_award, "field 'tv_person_award'", TextView.class);
        mehomefragmentV2.ll_history = (ViewGroup) butterknife.internal.f.f(view, R.id.ll_history, "field 'll_history'", ViewGroup.class);
        mehomefragmentV2.tv_history_num = (TextView) butterknife.internal.f.f(view, R.id.tv_history_num, "field 'tv_history_num'", TextView.class);
        mehomefragmentV2.iv_red_dot_history = (ImageView) butterknife.internal.f.f(view, R.id.iv_red_dot_history, "field 'iv_red_dot_history'", ImageView.class);
        mehomefragmentV2.ll_award = (ViewGroup) butterknife.internal.f.f(view, R.id.ll_award, "field 'll_award'", ViewGroup.class);
        mehomefragmentV2.tv_award_num = (TextView) butterknife.internal.f.f(view, R.id.tv_award_num, "field 'tv_award_num'", TextView.class);
        mehomefragmentV2.tv_favour_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_favour_desc, "field 'tv_favour_desc'", TextView.class);
        mehomefragmentV2.tv_friend_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_friend_desc, "field 'tv_friend_desc'", TextView.class);
        mehomefragmentV2.tv_fan_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_fan_desc, "field 'tv_fan_desc'", TextView.class);
        mehomefragmentV2.tv_follow_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_follow_desc, "field 'tv_follow_desc'", TextView.class);
        mehomefragmentV2.tv_history_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_history_desc, "field 'tv_history_desc'", TextView.class);
        mehomefragmentV2.mToolbar = (TitleBar) butterknife.internal.f.f(view, R.id.toolbar, "field 'mToolbar'", TitleBar.class);
        mehomefragmentV2.tb_home = (HomeTitleBar) butterknife.internal.f.f(view, R.id.tb_home, "field 'tb_home'", HomeTitleBar.class);
        mehomefragmentV2.mHomeMenuView = butterknife.internal.f.e(view, R.id.vg_home_menu, "field 'mHomeMenuView'");
        mehomefragmentV2.vg_menu_task = butterknife.internal.f.e(view, R.id.vg_menu_task, "field 'vg_menu_task'");
        mehomefragmentV2.vg_menu_mall = butterknife.internal.f.e(view, R.id.vg_menu_mall, "field 'vg_menu_mall'");
        mehomefragmentV2.vp = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'vp'", ViewPager.class);
        mehomefragmentV2.ctl = (CollapsingToolbarLayout) butterknife.internal.f.f(view, R.id.ctl, "field 'ctl'", CollapsingToolbarLayout.class);
        mehomefragmentV2.tv_forbid_info = (TextView) butterknife.internal.f.f(view, R.id.tv_forbid_info, "field 'tv_forbid_info'", TextView.class);
        mehomefragmentV2.vg_room_Info = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_room_Info, "field 'vg_room_Info'", ViewGroup.class);
        mehomefragmentV2.bottom_button = (BottomButtonLeftItemView) butterknife.internal.f.f(view, R.id.bottom_button, "field 'bottom_button'", BottomButtonLeftItemView.class);
        mehomefragmentV2.vg_horn = (RelativeLayout) butterknife.internal.f.f(view, R.id.vg_horn, "field 'vg_horn'", RelativeLayout.class);
        mehomefragmentV2.vg_platform_card = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_platform_card, "field 'vg_platform_card'", ViewGroup.class);
        mehomefragmentV2.tv_game_state = (TextView) butterknife.internal.f.f(view, R.id.tv_game_state, "field 'tv_game_state'", TextView.class);
        mehomefragmentV2.v_login_mask = butterknife.internal.f.e(view, R.id.v_login_mask, "field 'v_login_mask'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23691, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MehomefragmentV2 mehomefragmentV2 = this.f78203b;
        if (mehomefragmentV2 == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78203b = null;
        mehomefragmentV2.mAppBarLayout = null;
        mehomefragmentV2.mIvAvatar = null;
        mehomefragmentV2.mTvUsername = null;
        mehomefragmentV2.mUserLevelContainer = null;
        mehomefragmentV2.iv_default_medal = null;
        mehomefragmentV2.mVgLogin = null;
        mehomefragmentV2.vg_bbs_info = null;
        mehomefragmentV2.tv_signature = null;
        mehomefragmentV2.ll_friends = null;
        mehomefragmentV2.tv_friend_num = null;
        mehomefragmentV2.msg_friend_online_num = null;
        mehomefragmentV2.iv_no_friends = null;
        mehomefragmentV2.iv_not_friend_red_point = null;
        mehomefragmentV2.tv_follow_num = null;
        mehomefragmentV2.ll_follow = null;
        mehomefragmentV2.ll_fans = null;
        mehomefragmentV2.tv_fan_num = null;
        mehomefragmentV2.vg_person_award = null;
        mehomefragmentV2.tv_person_award = null;
        mehomefragmentV2.ll_history = null;
        mehomefragmentV2.tv_history_num = null;
        mehomefragmentV2.iv_red_dot_history = null;
        mehomefragmentV2.ll_award = null;
        mehomefragmentV2.tv_award_num = null;
        mehomefragmentV2.tv_favour_desc = null;
        mehomefragmentV2.tv_friend_desc = null;
        mehomefragmentV2.tv_fan_desc = null;
        mehomefragmentV2.tv_follow_desc = null;
        mehomefragmentV2.tv_history_desc = null;
        mehomefragmentV2.mToolbar = null;
        mehomefragmentV2.tb_home = null;
        mehomefragmentV2.mHomeMenuView = null;
        mehomefragmentV2.vg_menu_task = null;
        mehomefragmentV2.vg_menu_mall = null;
        mehomefragmentV2.vp = null;
        mehomefragmentV2.ctl = null;
        mehomefragmentV2.tv_forbid_info = null;
        mehomefragmentV2.vg_room_Info = null;
        mehomefragmentV2.bottom_button = null;
        mehomefragmentV2.vg_horn = null;
        mehomefragmentV2.vg_platform_card = null;
        mehomefragmentV2.tv_game_state = null;
        mehomefragmentV2.v_login_mask = null;
    }
}
