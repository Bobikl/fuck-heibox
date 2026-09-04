package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.HeyBoxEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class WriteFeedbackActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WriteFeedbackActivity f78701b;

    @i1
    public WriteFeedbackActivity_ViewBinding(WriteFeedbackActivity writeFeedbackActivity) {
        this(writeFeedbackActivity, writeFeedbackActivity.getWindow().getDecorView());
    }

    @i1
    public WriteFeedbackActivity_ViewBinding(WriteFeedbackActivity writeFeedbackActivity, View view) {
        this.f78701b = writeFeedbackActivity;
        writeFeedbackActivity.rv_edit_comment_edit_pic = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_edit_comment_edit_pic, "field 'rv_edit_comment_edit_pic'", RecyclerView.class);
        writeFeedbackActivity.etContent = (HeyBoxEditText) butterknife.internal.f.f(view, R.id.et_content, "field 'etContent'", HeyBoxEditText.class);
        writeFeedbackActivity.rlRoot = (RelativeLayout) butterknife.internal.f.f(view, R.id.rl_root, "field 'rlRoot'", RelativeLayout.class);
        writeFeedbackActivity.ll_topic = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_topic, "field 'll_topic'", LinearLayout.class);
        writeFeedbackActivity.vg_topic_group = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_topic_group, "field 'vg_topic_group'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24720, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WriteFeedbackActivity writeFeedbackActivity = this.f78701b;
        if (writeFeedbackActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78701b = null;
        writeFeedbackActivity.rv_edit_comment_edit_pic = null;
        writeFeedbackActivity.etContent = null;
        writeFeedbackActivity.rlRoot = null;
        writeFeedbackActivity.ll_topic = null;
        writeFeedbackActivity.vg_topic_group = null;
    }
}
