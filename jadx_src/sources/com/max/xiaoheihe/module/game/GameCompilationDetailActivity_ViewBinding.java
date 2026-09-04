package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GameCompilationDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameCompilationDetailActivity f84170b;

    @androidx.annotation.i1
    public GameCompilationDetailActivity_ViewBinding(GameCompilationDetailActivity gameCompilationDetailActivity) {
        this(gameCompilationDetailActivity, gameCompilationDetailActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameCompilationDetailActivity_ViewBinding(GameCompilationDetailActivity gameCompilationDetailActivity, View view) {
        this.f84170b = gameCompilationDetailActivity;
        gameCompilationDetailActivity.mEditCommentContainer = butterknife.internal.f.e(view, R.id.vg_edit_comment_container, "field 'mEditCommentContainer'");
        gameCompilationDetailActivity.mEditCommentView = butterknife.internal.f.e(view, R.id.vg_edit_comment, "field 'mEditCommentView'");
        gameCompilationDetailActivity.mEditCommentTranslucentLayer = butterknife.internal.f.e(view, R.id.v_edit_comment_translucent_layer, "field 'mEditCommentTranslucentLayer'");
        gameCompilationDetailActivity.mEditCommentForwardView = butterknife.internal.f.e(view, R.id.vg_edit_comment_forward, "field 'mEditCommentForwardView'");
        gameCompilationDetailActivity.mEditCommentFavorView = butterknife.internal.f.e(view, R.id.vg_edit_comment_favor, "field 'mEditCommentFavorView'");
        gameCompilationDetailActivity.mEditCommentFavorTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_favor_text, "field 'mEditCommentFavorTextView'", TextView.class);
        gameCompilationDetailActivity.mEditCommentChargeView = butterknife.internal.f.e(view, R.id.vg_edit_comment_charge, "field 'mEditCommentChargeView'");
        gameCompilationDetailActivity.mEditCommentChargeNumTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_charge_num, "field 'mEditCommentChargeNumTextView'", TextView.class);
        gameCompilationDetailActivity.mEditCommentAwardView = butterknife.internal.f.e(view, R.id.vg_edit_comment_award, "field 'mEditCommentAwardView'");
        gameCompilationDetailActivity.sb_edit_comment_award = (ShineButton) butterknife.internal.f.f(view, R.id.sb_edit_comment_award, "field 'sb_edit_comment_award'", ShineButton.class);
        gameCompilationDetailActivity.mEditCommentAwardNumTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_award_num, "field 'mEditCommentAwardNumTextView'", TextView.class);
        gameCompilationDetailActivity.mEditCommentEditorView = butterknife.internal.f.e(view, R.id.vg_edit_comment_editor, "field 'mEditCommentEditorView'");
        gameCompilationDetailActivity.mEditCommentEditText = (EditText) butterknife.internal.f.f(view, R.id.et_edit_comment, "field 'mEditCommentEditText'", EditText.class);
        gameCompilationDetailActivity.mEditCommentExView = butterknife.internal.f.e(view, R.id.vg_edit_comment_ex, "field 'mEditCommentExView'");
        gameCompilationDetailActivity.mEditCommentExViewNew = butterknife.internal.f.e(view, R.id.vg_edit_comment_ex_new, "field 'mEditCommentExViewNew'");
        gameCompilationDetailActivity.mEditCommentEditPicRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_edit_comment_edit_pic, "field 'mEditCommentEditPicRecyclerView'", RecyclerView.class);
        gameCompilationDetailActivity.mEditCommentSendTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_send, "field 'mEditCommentSendTextView'", TextView.class);
        gameCompilationDetailActivity.mEditCommentReplyFloorView = butterknife.internal.f.e(view, R.id.vg_edit_comment_reply_floor, "field 'mEditCommentReplyFloorView'");
        gameCompilationDetailActivity.mEditCommentReplyFloorAvatarImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_edit_comment_reply_floor_avatar, "field 'mEditCommentReplyFloorAvatarImageView'", ImageView.class);
        gameCompilationDetailActivity.mEditCommentReplyFloorMsgTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_edit_comment_reply_floor_msg, "field 'mEditCommentReplyFloorMsgTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32627, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameCompilationDetailActivity gameCompilationDetailActivity = this.f84170b;
        if (gameCompilationDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84170b = null;
        gameCompilationDetailActivity.mEditCommentContainer = null;
        gameCompilationDetailActivity.mEditCommentView = null;
        gameCompilationDetailActivity.mEditCommentTranslucentLayer = null;
        gameCompilationDetailActivity.mEditCommentForwardView = null;
        gameCompilationDetailActivity.mEditCommentFavorView = null;
        gameCompilationDetailActivity.mEditCommentFavorTextView = null;
        gameCompilationDetailActivity.mEditCommentChargeView = null;
        gameCompilationDetailActivity.mEditCommentChargeNumTextView = null;
        gameCompilationDetailActivity.mEditCommentAwardView = null;
        gameCompilationDetailActivity.sb_edit_comment_award = null;
        gameCompilationDetailActivity.mEditCommentAwardNumTextView = null;
        gameCompilationDetailActivity.mEditCommentEditorView = null;
        gameCompilationDetailActivity.mEditCommentEditText = null;
        gameCompilationDetailActivity.mEditCommentExView = null;
        gameCompilationDetailActivity.mEditCommentExViewNew = null;
        gameCompilationDetailActivity.mEditCommentEditPicRecyclerView = null;
        gameCompilationDetailActivity.mEditCommentSendTextView = null;
        gameCompilationDetailActivity.mEditCommentReplyFloorView = null;
        gameCompilationDetailActivity.mEditCommentReplyFloorAvatarImageView = null;
        gameCompilationDetailActivity.mEditCommentReplyFloorMsgTextView = null;
    }
}
