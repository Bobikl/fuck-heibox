package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import pokercc.android.expandablerecyclerview.ExpandableRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class GameAccountActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameAccountActivity f77844b;

    @i1
    public GameAccountActivity_ViewBinding(GameAccountActivity gameAccountActivity) {
        this(gameAccountActivity, gameAccountActivity.getWindow().getDecorView());
    }

    @i1
    public GameAccountActivity_ViewBinding(GameAccountActivity gameAccountActivity, View view) {
        this.f77844b = gameAccountActivity;
        gameAccountActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameAccountActivity.tv_type_list = (TextView) butterknife.internal.f.f(view, R.id.tv_type_list, "field 'tv_type_list'", TextView.class);
        gameAccountActivity.tv_type_card = (TextView) butterknife.internal.f.f(view, R.id.tv_type_card, "field 'tv_type_card'", TextView.class);
        gameAccountActivity.sb_change_card_type = (SwitchButton) butterknife.internal.f.f(view, R.id.sb_change_card_type, "field 'sb_change_card_type'", SwitchButton.class);
        gameAccountActivity.rv_bind_list = (ExpandableRecyclerView) butterknife.internal.f.f(view, R.id.rv_bind_list, "field 'rv_bind_list'", ExpandableRecyclerView.class);
        gameAccountActivity.ns_root = (NestedScrollView) butterknife.internal.f.f(view, R.id.ns_root, "field 'ns_root'", NestedScrollView.class);
        gameAccountActivity.vg_quick_bind = butterknife.internal.f.e(view, R.id.vg_quick_bind, "field 'vg_quick_bind'");
        gameAccountActivity.et_qucik = (EditText) butterknife.internal.f.f(view, R.id.et_qucik, "field 'et_qucik'", EditText.class);
        gameAccountActivity.tv_quick_bind = (TextView) butterknife.internal.f.f(view, R.id.tv_quick_bind, "field 'tv_quick_bind'", TextView.class);
        gameAccountActivity.tv_quick_unbind = (TextView) butterknife.internal.f.f(view, R.id.tv_quick_unbind, "field 'tv_quick_unbind'", TextView.class);
        gameAccountActivity.vg_platform_card = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_platform_card, "field 'vg_platform_card'", ViewGroup.class);
        gameAccountActivity.rv_platform = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_platform, "field 'rv_platform'", RecyclerView.class);
        gameAccountActivity.vg_show_top = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_show_top, "field 'vg_show_top'", ViewGroup.class);
        gameAccountActivity.sb_show_top = (SwitchButton) butterknife.internal.f.f(view, R.id.sb_show_top, "field 'sb_show_top'", SwitchButton.class);
        gameAccountActivity.tv_platform_tip = (TextView) butterknife.internal.f.f(view, R.id.tv_platform_tip, "field 'tv_platform_tip'", TextView.class);
        gameAccountActivity.tv_platform_finish = (TextView) butterknife.internal.f.f(view, R.id.tv_platform_finish, "field 'tv_platform_finish'", TextView.class);
        gameAccountActivity.vg_platform_setting = butterknife.internal.f.e(view, R.id.vg_platform_setting, "field 'vg_platform_setting'");
        gameAccountActivity.vg_card_type = butterknife.internal.f.e(view, R.id.vg_card_type, "field 'vg_card_type'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23056, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameAccountActivity gameAccountActivity = this.f77844b;
        if (gameAccountActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77844b = null;
        gameAccountActivity.mRefreshLayout = null;
        gameAccountActivity.tv_type_list = null;
        gameAccountActivity.tv_type_card = null;
        gameAccountActivity.sb_change_card_type = null;
        gameAccountActivity.rv_bind_list = null;
        gameAccountActivity.ns_root = null;
        gameAccountActivity.vg_quick_bind = null;
        gameAccountActivity.et_qucik = null;
        gameAccountActivity.tv_quick_bind = null;
        gameAccountActivity.tv_quick_unbind = null;
        gameAccountActivity.vg_platform_card = null;
        gameAccountActivity.rv_platform = null;
        gameAccountActivity.vg_show_top = null;
        gameAccountActivity.sb_show_top = null;
        gameAccountActivity.tv_platform_tip = null;
        gameAccountActivity.tv_platform_finish = null;
        gameAccountActivity.vg_platform_setting = null;
        gameAccountActivity.vg_card_type = null;
    }
}
