package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GameRollCreateRoomFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameRollCreateRoomFragment f84714b;

    @androidx.annotation.i1
    public GameRollCreateRoomFragment_ViewBinding(GameRollCreateRoomFragment gameRollCreateRoomFragment, View view) {
        this.f84714b = gameRollCreateRoomFragment;
        gameRollCreateRoomFragment.mItemTitleView = butterknife.internal.f.e(view, R.id.vg_item_title, "field 'mItemTitleView'");
        gameRollCreateRoomFragment.mItemListRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_item_list, "field 'mItemListRecyclerView'", RecyclerView.class);
        gameRollCreateRoomFragment.mRollTimeView = butterknife.internal.f.e(view, R.id.vg_roll_time, "field 'mRollTimeView'");
        gameRollCreateRoomFragment.mRollTimeTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_roll_time, "field 'mRollTimeTextView'", TextView.class);
        gameRollCreateRoomFragment.mGetPrizeUserNumEditText = (EditText) butterknife.internal.f.f(view, R.id.et_get_prize_user_num, "field 'mGetPrizeUserNumEditText'", EditText.class);
        gameRollCreateRoomFragment.mRollLimitView = butterknife.internal.f.e(view, R.id.vg_roll_limit, "field 'mRollLimitView'");
        gameRollCreateRoomFragment.vg_roll_encryption_switch = (SettingItemView) butterknife.internal.f.f(view, R.id.vg_roll_encryption_switch, "field 'vg_roll_encryption_switch'", SettingItemView.class);
        gameRollCreateRoomFragment.mRollNeedPwdView = butterknife.internal.f.e(view, R.id.vg_roll_need_pwd, "field 'mRollNeedPwdView'");
        gameRollCreateRoomFragment.mRollNeedPwdEditText = (EditText) butterknife.internal.f.f(view, R.id.et_roll_need_pwd, "field 'mRollNeedPwdEditText'", EditText.class);
        gameRollCreateRoomFragment.mRollRoomDescEditText = (EditText) butterknife.internal.f.f(view, R.id.et_roll_room_desc, "field 'mRollRoomDescEditText'", EditText.class);
        gameRollCreateRoomFragment.bottom_button = (BottomButtonLeftItemView) butterknife.internal.f.f(view, R.id.bottom_button, "field 'bottom_button'", BottomButtonLeftItemView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33609, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameRollCreateRoomFragment gameRollCreateRoomFragment = this.f84714b;
        if (gameRollCreateRoomFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84714b = null;
        gameRollCreateRoomFragment.mItemTitleView = null;
        gameRollCreateRoomFragment.mItemListRecyclerView = null;
        gameRollCreateRoomFragment.mRollTimeView = null;
        gameRollCreateRoomFragment.mRollTimeTextView = null;
        gameRollCreateRoomFragment.mGetPrizeUserNumEditText = null;
        gameRollCreateRoomFragment.mRollLimitView = null;
        gameRollCreateRoomFragment.vg_roll_encryption_switch = null;
        gameRollCreateRoomFragment.mRollNeedPwdView = null;
        gameRollCreateRoomFragment.mRollNeedPwdEditText = null;
        gameRollCreateRoomFragment.mRollRoomDescEditText = null;
        gameRollCreateRoomFragment.bottom_button = null;
    }
}
