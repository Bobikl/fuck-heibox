package com.max.xiaoheihe.module.account;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class SetSubscribedTagsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SetSubscribedTagsFragment f78376b;

    @i1
    public SetSubscribedTagsFragment_ViewBinding(SetSubscribedTagsFragment setSubscribedTagsFragment, View view) {
        this.f78376b = setSubscribedTagsFragment;
        setSubscribedTagsFragment.mContainerView = butterknife.internal.f.e(view, R.id.vg_container, "field 'mContainerView'");
        setSubscribedTagsFragment.mTagsRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_tags, "field 'mTagsRecyclerView'", RecyclerView.class);
        setSubscribedTagsFragment.mConfirmTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm, "field 'mConfirmTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24141, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SetSubscribedTagsFragment setSubscribedTagsFragment = this.f78376b;
        if (setSubscribedTagsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78376b = null;
        setSubscribedTagsFragment.mContainerView = null;
        setSubscribedTagsFragment.mTagsRecyclerView = null;
        setSubscribedTagsFragment.mConfirmTextView = null;
    }
}
