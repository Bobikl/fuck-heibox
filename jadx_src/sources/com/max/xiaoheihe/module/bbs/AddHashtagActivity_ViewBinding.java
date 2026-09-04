package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class AddHashtagActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AddHashtagActivity f79557b;

    @i1
    public AddHashtagActivity_ViewBinding(AddHashtagActivity addHashtagActivity) {
        this(addHashtagActivity, addHashtagActivity.getWindow().getDecorView());
    }

    @i1
    public AddHashtagActivity_ViewBinding(AddHashtagActivity addHashtagActivity, View view) {
        this.f79557b = addHashtagActivity;
        addHashtagActivity.etHashtag = (EditText) butterknife.internal.f.f(view, R.id.et_hashtag, "field 'etHashtag'", EditText.class);
        addHashtagActivity.rvList = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_list, "field 'rvList'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25764, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AddHashtagActivity addHashtagActivity = this.f79557b;
        if (addHashtagActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79557b = null;
        addHashtagActivity.etHashtag = null;
        addHashtagActivity.rvList = null;
    }
}
