package com.max.xiaoheihe.module.account;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes9.dex */
public class FeedBackFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FeedBackFragment f77735b;

    @i1
    public FeedBackFragment_ViewBinding(FeedBackFragment feedBackFragment, View view) {
        this.f77735b = feedBackFragment;
        feedBackFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        feedBackFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        feedBackFragment.view_empty = butterknife.internal.f.e(view, R.id.view_empty, "field 'view_empty'");
        feedBackFragment.iv_empty = (ImageView) butterknife.internal.f.f(view, R.id.iv_empty, "field 'iv_empty'", ImageView.class);
        feedBackFragment.tv_empty = (TextView) butterknife.internal.f.f(view, R.id.tv_empty, "field 'tv_empty'", TextView.class);
        feedBackFragment.rootview = (RelativeLayout) butterknife.internal.f.f(view, R.id.rl_root, "field 'rootview'", RelativeLayout.class);
        feedBackFragment.mEditCommentContainer = butterknife.internal.f.e(view, R.id.vg_edit_comment_container, "field 'mEditCommentContainer'");
        feedBackFragment.mEditCommentView = butterknife.internal.f.e(view, R.id.vg_edit_comment, "field 'mEditCommentView'");
        feedBackFragment.mEditCommentTranslucentLayer = butterknife.internal.f.e(view, R.id.v_edit_comment_translucent_layer, "field 'mEditCommentTranslucentLayer'");
        feedBackFragment.mEditCommentAwardView = butterknife.internal.f.e(view, R.id.vg_edit_comment_award, "field 'mEditCommentAwardView'");
        feedBackFragment.sb_edit_comment_award = (ShineButton) butterknife.internal.f.f(view, R.id.sb_edit_comment_award, "field 'sb_edit_comment_award'", ShineButton.class);
        feedBackFragment.mEditCommentForwardView = butterknife.internal.f.e(view, R.id.vg_edit_comment_forward, "field 'mEditCommentForwardView'");
        feedBackFragment.mEditCommentFavorView = butterknife.internal.f.e(view, R.id.vg_edit_comment_favor, "field 'mEditCommentFavorView'");
        feedBackFragment.mEditCommentFavorTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_favor_text, "field 'mEditCommentFavorTextView'", TextView.class);
        feedBackFragment.mEditCommentChargeView = butterknife.internal.f.e(view, R.id.vg_edit_comment_charge, "field 'mEditCommentChargeView'");
        feedBackFragment.mEditCommentChargeNumTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_charge_num, "field 'mEditCommentChargeNumTextView'", TextView.class);
        feedBackFragment.mEditCommentAwardNumTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_award_num, "field 'mEditCommentAwardNumTextView'", TextView.class);
        feedBackFragment.mEditCommentEditorView = butterknife.internal.f.e(view, R.id.vg_edit_comment_editor, "field 'mEditCommentEditorView'");
        feedBackFragment.mEditCommentEditText = (EditText) butterknife.internal.f.f(view, R.id.et_edit_comment, "field 'mEditCommentEditText'", EditText.class);
        feedBackFragment.mEditCommentExView = butterknife.internal.f.e(view, R.id.vg_edit_comment_ex, "field 'mEditCommentExView'");
        feedBackFragment.mEditCommentExViewNew = butterknife.internal.f.e(view, R.id.vg_edit_comment_ex_new, "field 'mEditCommentExViewNew'");
        feedBackFragment.iv_add_img = (ImageView) butterknife.internal.f.f(view, R.id.iv_add_img, "field 'iv_add_img'", ImageView.class);
        feedBackFragment.iv_expression = (ImageView) butterknife.internal.f.f(view, R.id.iv_expression, "field 'iv_expression'", ImageView.class);
        feedBackFragment.fl_expression = (FrameLayout) butterknife.internal.f.f(view, R.id.fl_expression, "field 'fl_expression'", FrameLayout.class);
        feedBackFragment.mEditCommentEditPicRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_edit_comment_edit_pic, "field 'mEditCommentEditPicRecyclerView'", RecyclerView.class);
        feedBackFragment.mEditCommentSendTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_send, "field 'mEditCommentSendTextView'", TextView.class);
        feedBackFragment.mEditCommentReplyFloorView = butterknife.internal.f.e(view, R.id.vg_edit_comment_reply_floor, "field 'mEditCommentReplyFloorView'");
        feedBackFragment.mEditCommentReplyFloorAvatarImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_edit_comment_reply_floor_avatar, "field 'mEditCommentReplyFloorAvatarImageView'", ImageView.class);
        feedBackFragment.mEditCommentReplyFloorMsgTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_reply_floor_msg, "field 'mEditCommentReplyFloorMsgTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22832, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FeedBackFragment feedBackFragment = this.f77735b;
        if (feedBackFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77735b = null;
        feedBackFragment.mRecyclerView = null;
        feedBackFragment.mRefreshLayout = null;
        feedBackFragment.view_empty = null;
        feedBackFragment.iv_empty = null;
        feedBackFragment.tv_empty = null;
        feedBackFragment.rootview = null;
        feedBackFragment.mEditCommentContainer = null;
        feedBackFragment.mEditCommentView = null;
        feedBackFragment.mEditCommentTranslucentLayer = null;
        feedBackFragment.mEditCommentAwardView = null;
        feedBackFragment.sb_edit_comment_award = null;
        feedBackFragment.mEditCommentForwardView = null;
        feedBackFragment.mEditCommentFavorView = null;
        feedBackFragment.mEditCommentFavorTextView = null;
        feedBackFragment.mEditCommentChargeView = null;
        feedBackFragment.mEditCommentChargeNumTextView = null;
        feedBackFragment.mEditCommentAwardNumTextView = null;
        feedBackFragment.mEditCommentEditorView = null;
        feedBackFragment.mEditCommentEditText = null;
        feedBackFragment.mEditCommentExView = null;
        feedBackFragment.mEditCommentExViewNew = null;
        feedBackFragment.iv_add_img = null;
        feedBackFragment.iv_expression = null;
        feedBackFragment.fl_expression = null;
        feedBackFragment.mEditCommentEditPicRecyclerView = null;
        feedBackFragment.mEditCommentSendTextView = null;
        feedBackFragment.mEditCommentReplyFloorView = null;
        feedBackFragment.mEditCommentReplyFloorAvatarImageView = null;
        feedBackFragment.mEditCommentReplyFloorMsgTextView = null;
    }
}
