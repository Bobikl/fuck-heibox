package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class ForwardEditActiviy_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ForwardEditActiviy f79866b;

    @i1
    public ForwardEditActiviy_ViewBinding(ForwardEditActiviy forwardEditActiviy) {
        this(forwardEditActiviy, forwardEditActiviy.getWindow().getDecorView());
    }

    @i1
    public ForwardEditActiviy_ViewBinding(ForwardEditActiviy forwardEditActiviy, View view) {
        this.f79866b = forwardEditActiviy;
        forwardEditActiviy.textCountView = (TextView) butterknife.internal.f.f(view, R.id.tv_count, "field 'textCountView'", TextView.class);
        forwardEditActiviy.addImgView = (ImageView) butterknife.internal.f.f(view, R.id.iv_add_img, "field 'addImgView'", ImageView.class);
        forwardEditActiviy.addEmojiView = (ImageView) butterknife.internal.f.f(view, R.id.iv_emoji, "field 'addEmojiView'", ImageView.class);
        forwardEditActiviy.addHashtagView = (ImageView) butterknife.internal.f.f(view, R.id.iv_hashtag, "field 'addHashtagView'", ImageView.class);
        forwardEditActiviy.linkCardView = (CardView) butterknife.internal.f.f(view, R.id.cv_postcard, "field 'linkCardView'", CardView.class);
        forwardEditActiviy.atView = (ImageView) butterknife.internal.f.f(view, R.id.iv_at, "field 'atView'", ImageView.class);
        forwardEditActiviy.editContentView = (EditText) butterknife.internal.f.f(view, R.id.et_content, "field 'editContentView'", EditText.class);
        forwardEditActiviy.bottomBarArrow = (ImageView) butterknife.internal.f.f(view, R.id.iv_btmbar_expand, "field 'bottomBarArrow'", ImageView.class);
        forwardEditActiviy.toolPopUpBox = (FrameLayout) butterknife.internal.f.f(view, R.id.fl_toolbar_popup_box, "field 'toolPopUpBox'", FrameLayout.class);
        forwardEditActiviy.vgImgPreview = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_img_preview, "field 'vgImgPreview'", ViewGroup.class);
        forwardEditActiviy.rvImgPreview = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_img_preview, "field 'rvImgPreview'", RecyclerView.class);
        forwardEditActiviy.cbAlsoComment = (CheckBox) butterknife.internal.f.f(view, R.id.cb_also_comment, "field 'cbAlsoComment'", CheckBox.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26434, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ForwardEditActiviy forwardEditActiviy = this.f79866b;
        if (forwardEditActiviy == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79866b = null;
        forwardEditActiviy.textCountView = null;
        forwardEditActiviy.addImgView = null;
        forwardEditActiviy.addEmojiView = null;
        forwardEditActiviy.addHashtagView = null;
        forwardEditActiviy.linkCardView = null;
        forwardEditActiviy.atView = null;
        forwardEditActiviy.editContentView = null;
        forwardEditActiviy.bottomBarArrow = null;
        forwardEditActiviy.toolPopUpBox = null;
        forwardEditActiviy.vgImgPreview = null;
        forwardEditActiviy.rvImgPreview = null;
        forwardEditActiviy.cbAlsoComment = null;
    }
}
