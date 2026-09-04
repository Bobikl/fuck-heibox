package com.max.xiaoheihe.module.account;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class SetSubscribedTagsActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SetSubscribedTagsActivity f78360b;

    @i1
    public SetSubscribedTagsActivity_ViewBinding(SetSubscribedTagsActivity setSubscribedTagsActivity) {
        this(setSubscribedTagsActivity, setSubscribedTagsActivity.getWindow().getDecorView());
    }

    @i1
    public SetSubscribedTagsActivity_ViewBinding(SetSubscribedTagsActivity setSubscribedTagsActivity, View view) {
        this.f78360b = setSubscribedTagsActivity;
        setSubscribedTagsActivity.lsh1 = (ListSectionHeader) butterknife.internal.f.f(view, R.id.lsh1, "field 'lsh1'", ListSectionHeader.class);
        setSubscribedTagsActivity.lsh2 = (ListSectionHeader) butterknife.internal.f.f(view, R.id.lsh2, "field 'lsh2'", ListSectionHeader.class);
        setSubscribedTagsActivity.mSelectedRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_selected, "field 'mSelectedRecyclerView'", RecyclerView.class);
        setSubscribedTagsActivity.mUnSelectedRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_unselected, "field 'mUnSelectedRecyclerView'", RecyclerView.class);
        setSubscribedTagsActivity.sb_mode = (Switch) butterknife.internal.f.f(view, R.id.sb_mode, "field 'sb_mode'", Switch.class);
        setSubscribedTagsActivity.tv_mode_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_mode_desc, "field 'tv_mode_desc'", TextView.class);
        setSubscribedTagsActivity.vg_rec = butterknife.internal.f.e(view, R.id.vg_rec, "field 'vg_rec'");
        setSubscribedTagsActivity.tv_rec_title = (TextView) butterknife.internal.f.f(view, R.id.tv_rec_title, "field 'tv_rec_title'", TextView.class);
        setSubscribedTagsActivity.tv_rec_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_rec_desc, "field 'tv_rec_desc'", TextView.class);
        setSubscribedTagsActivity.sb_rec_switch = (Switch) butterknife.internal.f.f(view, R.id.sb_rec_switch, "field 'sb_rec_switch'", Switch.class);
        setSubscribedTagsActivity.tv_rec_switch_desc = (TextView) butterknife.internal.f.f(view, R.id.tv_rec_switch_desc, "field 'tv_rec_switch_desc'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24113, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SetSubscribedTagsActivity setSubscribedTagsActivity = this.f78360b;
        if (setSubscribedTagsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78360b = null;
        setSubscribedTagsActivity.lsh1 = null;
        setSubscribedTagsActivity.lsh2 = null;
        setSubscribedTagsActivity.mSelectedRecyclerView = null;
        setSubscribedTagsActivity.mUnSelectedRecyclerView = null;
        setSubscribedTagsActivity.sb_mode = null;
        setSubscribedTagsActivity.tv_mode_desc = null;
        setSubscribedTagsActivity.vg_rec = null;
        setSubscribedTagsActivity.tv_rec_title = null;
        setSubscribedTagsActivity.tv_rec_desc = null;
        setSubscribedTagsActivity.sb_rec_switch = null;
        setSubscribedTagsActivity.tv_rec_switch_desc = null;
    }
}
