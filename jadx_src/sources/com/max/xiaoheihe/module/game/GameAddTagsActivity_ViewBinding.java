package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameAddTagsActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameAddTagsActivity f84120b;

    @androidx.annotation.i1
    public GameAddTagsActivity_ViewBinding(GameAddTagsActivity gameAddTagsActivity) {
        this(gameAddTagsActivity, gameAddTagsActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameAddTagsActivity_ViewBinding(GameAddTagsActivity gameAddTagsActivity, View view) {
        this.f84120b = gameAddTagsActivity;
        gameAddTagsActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameAddTagsActivity.mRecommendTagsView = butterknife.internal.f.e(view, R.id.vg_recommend_tags, "field 'mRecommendTagsView'");
        gameAddTagsActivity.mRecommendTagsLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_recommend_tags, "field 'mRecommendTagsLinearLayout'", LinearLayout.class);
        gameAddTagsActivity.mAddTagEditText = (EditText) butterknife.internal.f.f(view, R.id.et_add_tag, "field 'mAddTagEditText'", EditText.class);
        gameAddTagsActivity.mAddTagTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_add_tag, "field 'mAddTagTextView'", TextView.class);
        gameAddTagsActivity.mMyTagsView = butterknife.internal.f.e(view, R.id.vg_my_tags, "field 'mMyTagsView'");
        gameAddTagsActivity.mMyTagsLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_my_tags, "field 'mMyTagsLinearLayout'", LinearLayout.class);
        gameAddTagsActivity.mMyTagsNumTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_my_tags_num, "field 'mMyTagsNumTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32475, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameAddTagsActivity gameAddTagsActivity = this.f84120b;
        if (gameAddTagsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84120b = null;
        gameAddTagsActivity.mRefreshLayout = null;
        gameAddTagsActivity.mRecommendTagsView = null;
        gameAddTagsActivity.mRecommendTagsLinearLayout = null;
        gameAddTagsActivity.mAddTagEditText = null;
        gameAddTagsActivity.mAddTagTextView = null;
        gameAddTagsActivity.mMyTagsView = null;
        gameAddTagsActivity.mMyTagsLinearLayout = null;
        gameAddTagsActivity.mMyTagsNumTextView = null;
    }
}
