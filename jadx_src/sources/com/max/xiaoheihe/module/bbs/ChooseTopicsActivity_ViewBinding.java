package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class ChooseTopicsActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ChooseTopicsActivity f79751b;

    @i1
    public ChooseTopicsActivity_ViewBinding(ChooseTopicsActivity chooseTopicsActivity) {
        this(chooseTopicsActivity, chooseTopicsActivity.getWindow().getDecorView());
    }

    @i1
    public ChooseTopicsActivity_ViewBinding(ChooseTopicsActivity chooseTopicsActivity, View view) {
        this.f79751b = chooseTopicsActivity;
        chooseTopicsActivity.rv_topics = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_topics, "field 'rv_topics'", RecyclerView.class);
        chooseTopicsActivity.vg_et = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_et, "field 'vg_et'", ViewGroup.class);
        chooseTopicsActivity.ll_topic = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_choosed, "field 'll_topic'", LinearLayout.class);
        chooseTopicsActivity.tv_finish = (TextView) butterknife.internal.f.f(view, R.id.tv_finish, "field 'tv_finish'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26168, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ChooseTopicsActivity chooseTopicsActivity = this.f79751b;
        if (chooseTopicsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79751b = null;
        chooseTopicsActivity.rv_topics = null;
        chooseTopicsActivity.vg_et = null;
        chooseTopicsActivity.ll_topic = null;
        chooseTopicsActivity.tv_finish = null;
    }
}
