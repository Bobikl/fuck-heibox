package com.max.xiaoheihe.module.account.mine;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class SetAvatarDecorFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SetAvatarDecorFragment f79054b;

    @i1
    public SetAvatarDecorFragment_ViewBinding(SetAvatarDecorFragment setAvatarDecorFragment, View view) {
        this.f79054b = setAvatarDecorFragment;
        setAvatarDecorFragment.mToolbar = (TitleBar) butterknife.internal.f.f(view, R.id.toolbar, "field 'mToolbar'", TitleBar.class);
        setAvatarDecorFragment.mAvatarView = (HeyBoxAvatarView) butterknife.internal.f.f(view, R.id.avatar, "field 'mAvatarView'", HeyBoxAvatarView.class);
        setAvatarDecorFragment.mCommentTextView = (TextView) butterknife.internal.f.f(view, R.id.comment, "field 'mCommentTextView'", TextView.class);
        setAvatarDecorFragment.mConfirmTextView = (TextView) butterknife.internal.f.f(view, R.id.confirm, "field 'mConfirmTextView'", TextView.class);
        setAvatarDecorFragment.mTitleDividerView = butterknife.internal.f.e(view, R.id.title_divider, "field 'mTitleDividerView'");
        setAvatarDecorFragment.mBottomBarView = butterknife.internal.f.e(view, R.id.bottom_bar, "field 'mBottomBarView'");
        setAvatarDecorFragment.mTabLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_tab, "field 'mTabLinearLayout'", LinearLayout.class);
        setAvatarDecorFragment.mDecorListContainers = (LinearLayout) butterknife.internal.f.f(view, R.id.avatar_decor_list_containers, "field 'mDecorListContainers'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25071, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SetAvatarDecorFragment setAvatarDecorFragment = this.f79054b;
        if (setAvatarDecorFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79054b = null;
        setAvatarDecorFragment.mToolbar = null;
        setAvatarDecorFragment.mAvatarView = null;
        setAvatarDecorFragment.mCommentTextView = null;
        setAvatarDecorFragment.mConfirmTextView = null;
        setAvatarDecorFragment.mTitleDividerView = null;
        setAvatarDecorFragment.mBottomBarView = null;
        setAvatarDecorFragment.mTabLinearLayout = null;
        setAvatarDecorFragment.mDecorListContainers = null;
    }
}
