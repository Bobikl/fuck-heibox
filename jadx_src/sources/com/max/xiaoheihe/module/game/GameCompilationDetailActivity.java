package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class GameCompilationDetailActivity extends BaseActivity implements kf.a, com.max.xiaoheihe.module.bbs.adapter.x.a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f84155c0 = "game_header";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f84156p1 = "share_image";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f84157x1 = 123;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f84158y1 = 0;
    private FrameLayout L;
    private LinkInfoObj M;
    private String N;
    private String O;
    private String P;
    private LoadingDialog T;
    private com.max.xiaoheihe.module.bbs.adapter.x U;
    private String V;
    private String W;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f84160b0;

    @BindView(R.id.tv_edit_comment_award_num)
    TextView mEditCommentAwardNumTextView;

    @BindView(R.id.vg_edit_comment_award)
    View mEditCommentAwardView;

    @BindView(R.id.tv_edit_comment_charge_num)
    TextView mEditCommentChargeNumTextView;

    @BindView(R.id.vg_edit_comment_charge)
    View mEditCommentChargeView;

    @BindView(R.id.vg_edit_comment_container)
    View mEditCommentContainer;

    @BindView(R.id.rv_edit_comment_edit_pic)
    RecyclerView mEditCommentEditPicRecyclerView;

    @BindView(R.id.et_edit_comment)
    EditText mEditCommentEditText;

    @BindView(R.id.vg_edit_comment_editor)
    View mEditCommentEditorView;

    @BindView(R.id.vg_edit_comment_ex)
    View mEditCommentExView;

    @BindView(R.id.vg_edit_comment_ex_new)
    View mEditCommentExViewNew;

    @BindView(R.id.tv_edit_comment_favor_text)
    TextView mEditCommentFavorTextView;

    @BindView(R.id.vg_edit_comment_favor)
    View mEditCommentFavorView;

    @BindView(R.id.vg_edit_comment_forward)
    View mEditCommentForwardView;

    @BindView(R.id.iv_edit_comment_reply_floor_avatar)
    ImageView mEditCommentReplyFloorAvatarImageView;

    @BindView(R.id.tv_edit_comment_reply_floor_msg)
    TextView mEditCommentReplyFloorMsgTextView;

    @BindView(R.id.vg_edit_comment_reply_floor)
    View mEditCommentReplyFloorView;

    @BindView(R.id.tv_edit_comment_send)
    TextView mEditCommentSendTextView;

    @BindView(R.id.v_edit_comment_translucent_layer)
    View mEditCommentTranslucentLayer;

    @BindView(R.id.vg_edit_comment)
    View mEditCommentView;

    @BindView(R.id.sb_edit_comment_award)
    ShineButton sb_edit_comment_award;
    private ArrayList<String> Q = new ArrayList<>();
    private int R = 9;
    private String S = "";
    private boolean X = false;
    private Boolean Y = Boolean.FALSE;
    private String Z = "";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f84159a0 = "";

    public class a extends ItemTouchHelper.SimpleCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 32615, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return (GameCompilationDetailActivity.this.Q == null || GameCompilationDetailActivity.this.Q.size() <= 0 || viewHolder.getAdapterPosition() >= GameCompilationDetailActivity.this.Q.size()) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(12, 3);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, viewHolder2}, this, changeQuickRedirect, false, 32613, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (GameCompilationDetailActivity.this.Q == null || GameCompilationDetailActivity.this.Q.size() <= 0 || adapterPosition >= GameCompilationDetailActivity.this.Q.size() || adapterPosition2 >= GameCompilationDetailActivity.this.Q.size()) {
                return false;
            }
            if (adapterPosition < adapterPosition2) {
                int i10 = adapterPosition;
                while (i10 < adapterPosition2) {
                    int i11 = i10 + 1;
                    Collections.swap(GameCompilationDetailActivity.this.Q, i10, i11);
                    i10 = i11;
                }
            } else {
                for (int i12 = adapterPosition; i12 > adapterPosition2; i12--) {
                    Collections.swap(GameCompilationDetailActivity.this.Q, i12, i12 - 1);
                }
            }
            GameCompilationDetailActivity.this.U.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 32614, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            if (GameCompilationDetailActivity.this.Q == null || GameCompilationDetailActivity.this.Q.size() <= 0 || adapterPosition >= GameCompilationDetailActivity.this.Q.size()) {
                return;
            }
            GameCompilationDetailActivity.this.Q.remove(adapterPosition);
            GameCompilationDetailActivity.this.U.notifyItemRemoved(adapterPosition);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32616, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCompilationDetailActivity gameCompilationDetailActivity = GameCompilationDetailActivity.this;
            GameCompilationDetailActivity.a2(gameCompilationDetailActivity, gameCompilationDetailActivity.mEditCommentEditText);
            GameCompilationDetailActivity.b2(GameCompilationDetailActivity.this);
        }
    }

    public class c implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32617, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported || !z10 || GameCompilationDetailActivity.this.isFinishing()) {
                return;
            }
            GameCompilationDetailActivity gameCompilationDetailActivity = GameCompilationDetailActivity.this;
            GameCompilationDetailActivity.a2(gameCompilationDetailActivity, gameCompilationDetailActivity.mEditCommentEditText);
            GameCompilationDetailActivity.b2(GameCompilationDetailActivity.this);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32618, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCompilationDetailActivity.c2(GameCompilationDetailActivity.this);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32619, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((BaseActivity) GameCompilationDetailActivity.this).f66601b)) {
                if (GameCompilationDetailActivity.this.X) {
                    if (com.max.hbcommon.utils.c.u(GameCompilationDetailActivity.this.mEditCommentEditText.getText().toString())) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.d(GameCompilationDetailActivity.this.getString(R.string.content_empty_msg));
                        return;
                    }
                    if (GameCompilationDetailActivity.this.T == null || !GameCompilationDetailActivity.this.T.i()) {
                        GameCompilationDetailActivity gameCompilationDetailActivity = GameCompilationDetailActivity.this;
                        gameCompilationDetailActivity.T = new LoadingDialog(((BaseActivity) gameCompilationDetailActivity).f66601b, GameCompilationDetailActivity.this.getString(R.string.commiting), true).r();
                    }
                    GameCompilationDetailActivity.k2(GameCompilationDetailActivity.this);
                    return;
                }
                if (com.max.hbcommon.utils.c.u(GameCompilationDetailActivity.this.mEditCommentEditText.getText().toString()) && (GameCompilationDetailActivity.this.Q == null || GameCompilationDetailActivity.this.Q.size() <= 0)) {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameCompilationDetailActivity.this.getString(R.string.content_empty_msg));
                    return;
                }
                if (GameCompilationDetailActivity.this.Q != null) {
                    GameCompilationDetailActivity.this.Q.size();
                }
                if (GameCompilationDetailActivity.this.T == null || !GameCompilationDetailActivity.this.T.i()) {
                    GameCompilationDetailActivity gameCompilationDetailActivity2 = GameCompilationDetailActivity.this;
                    gameCompilationDetailActivity2.T = new LoadingDialog(((BaseActivity) gameCompilationDetailActivity2).f66601b, GameCompilationDetailActivity.this.getString(R.string.commiting), true).r();
                }
                GameCompilationDetailActivity.Q1(GameCompilationDetailActivity.this);
            }
        }
    }

    public class g implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32620, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameCompilationDetailActivity.R1(GameCompilationDetailActivity.this);
        }
    }

    public class h implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 32621, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCompilationDetailActivity.this.S = com.max.xiaoheihe.utils.d.p0(strArr);
            if (com.max.hbcommon.utils.c.u(GameCompilationDetailActivity.this.S) && com.max.hbcommon.utils.c.u(GameCompilationDetailActivity.this.mEditCommentEditText.getText().toString())) {
                return;
            }
            if (!GameCompilationDetailActivity.this.Y.booleanValue() || com.max.hbcommon.utils.c.u(GameCompilationDetailActivity.this.f84159a0)) {
                GameCompilationDetailActivity.Y1(GameCompilationDetailActivity.this);
            } else {
                GameCompilationDetailActivity.Y1(GameCompilationDetailActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32622, new Class[]{String.class}, Void.TYPE).isSupported || GameCompilationDetailActivity.this.T == null) {
                return;
            }
            GameCompilationDetailActivity.this.T.c();
        }
    }

    public class i extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32623, new Class[0], Void.TYPE).isSupported && GameCompilationDetailActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32624, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameCompilationDetailActivity.this.isActive()) {
                super.onError(th2);
                if (GameCompilationDetailActivity.this.T != null) {
                    GameCompilationDetailActivity.this.T.c();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32625, new Class[]{Result.class}, Void.TYPE).isSupported && GameCompilationDetailActivity.this.isActive()) {
                super.onNext(result);
                GameCompilationDetailActivity.this.mEditCommentEditText.clearFocus();
                GameCompilationDetailActivity.this.mEditCommentEditText.setText("");
                GameCompilationDetailActivity.c2(GameCompilationDetailActivity.this);
                GameCompilationDetailActivity.this.Q.clear();
                if (GameCompilationDetailActivity.this.U != null) {
                    GameCompilationDetailActivity.this.U.r(GameCompilationDetailActivity.this.Q);
                }
                GameCompilationDetailActivity.this.S = "";
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(GameCompilationDetailActivity.this.getString(R.string.comment_success));
                GameCompilationDetailActivity.Z1(GameCompilationDetailActivity.this);
                if (GameCompilationDetailActivity.this.T != null) {
                    GameCompilationDetailActivity.this.T.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32626, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void Q1(GameCompilationDetailActivity gameCompilationDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailActivity}, null, changeQuickRedirect, true, 32609, new Class[]{GameCompilationDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationDetailActivity.o2();
    }

    static /* synthetic */ void R1(GameCompilationDetailActivity gameCompilationDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailActivity}, null, changeQuickRedirect, true, 32610, new Class[]{GameCompilationDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationDetailActivity.n2();
    }

    static /* synthetic */ void Y1(GameCompilationDetailActivity gameCompilationDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailActivity}, null, changeQuickRedirect, true, 32611, new Class[]{GameCompilationDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationDetailActivity.m2();
    }

    static /* synthetic */ void Z1(GameCompilationDetailActivity gameCompilationDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailActivity}, null, changeQuickRedirect, true, 32612, new Class[]{GameCompilationDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationDetailActivity.z2();
    }

    static /* synthetic */ void a2(GameCompilationDetailActivity gameCompilationDetailActivity, View view) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailActivity, view}, null, changeQuickRedirect, true, 32605, new Class[]{GameCompilationDetailActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationDetailActivity.showSoftKeyboard(view);
    }

    static /* synthetic */ void b2(GameCompilationDetailActivity gameCompilationDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailActivity}, null, changeQuickRedirect, true, 32606, new Class[]{GameCompilationDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationDetailActivity.q2();
    }

    static /* synthetic */ void c2(GameCompilationDetailActivity gameCompilationDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailActivity}, null, changeQuickRedirect, true, 32607, new Class[]{GameCompilationDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationDetailActivity.v2();
    }

    private void hideSoftKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32604, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    static /* synthetic */ void k2(GameCompilationDetailActivity gameCompilationDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailActivity}, null, changeQuickRedirect, true, 32608, new Class[]{GameCompilationDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationDetailActivity.x2();
    }

    private void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32602, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mEditCommentEditorView.getLayoutParams();
        marginLayoutParams.rightMargin = 0;
        this.mEditCommentEditorView.setLayoutParams(marginLayoutParams);
        this.mEditCommentAwardView.setVisibility(0);
        this.mEditCommentForwardView.setVisibility(8);
        this.mEditCommentFavorView.setVisibility(8);
        this.mEditCommentChargeView.setVisibility(8);
        this.mEditCommentExView.setVisibility(8);
        this.mEditCommentExViewNew.setVisibility(8);
        this.mEditCommentReplyFloorView.setVisibility(8);
        this.mEditCommentTranslucentLayer.setVisibility(8);
        this.mEditCommentEditText.setSingleLine(true);
    }

    private void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32600, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = null;
        HashMap map = new HashMap();
        if (this.Y.booleanValue() && !com.max.hbcommon.utils.c.u(this.Z)) {
            str = this.Z;
        }
        String str2 = str;
        if (this.Y.booleanValue() && !com.max.hbcommon.utils.c.u(this.f84159a0)) {
            map.put("Cookie", this.f84159a0);
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V4(null, map, this.N, this.mEditCommentEditText.getText().toString(), this.W, this.V, this.S, "0", null, str2, new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32591, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<String> arrayList = this.Q;
        com.max.mediaselector.e.g(this, (arrayList == null || arrayList.size() <= 0) ? this.R : this.R - this.Q.size(), 0);
    }

    private void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32596, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p2(null, null);
    }

    private void p2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 32597, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.v(str, str2)) {
            this.Y = Boolean.FALSE;
        } else {
            this.Y = Boolean.TRUE;
            this.Z = str;
            this.f84159a0 = str2;
        }
        if (com.max.xiaoheihe.utils.i0.g(this.f66601b)) {
            LoadingDialog loadingDialog = this.T;
            if (loadingDialog == null || !loadingDialog.i()) {
                this.T = new LoadingDialog(this.f66601b, getString(R.string.commiting), true).r();
            }
            ArrayList<String> arrayList = this.Q;
            if (arrayList != null && arrayList.size() > 0) {
                this.S = "";
                com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), this.Q, "bbs", new h());
                return;
            }
            this.S = "";
            if (!this.Y.booleanValue() || com.max.hbcommon.utils.c.u(this.f84159a0)) {
                m2();
            } else {
                m2();
            }
        }
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32601, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mEditCommentEditorView.getLayoutParams();
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        this.mEditCommentEditorView.setLayoutParams(marginLayoutParams);
        this.mEditCommentAwardView.setVisibility(8);
        this.mEditCommentForwardView.setVisibility(8);
        this.mEditCommentFavorView.setVisibility(8);
        this.mEditCommentChargeView.setVisibility(8);
        this.mEditCommentExView.setVisibility(0);
        this.mEditCommentExViewNew.setVisibility(0);
        this.mEditCommentReplyFloorView.setVisibility(this.X ? 0 : 8);
        this.mEditCommentTranslucentLayer.setVisibility(0);
        this.mEditCommentEditText.setSingleLine(false);
        this.mEditCommentEditText.setMaxLines(8);
    }

    public static Intent r2(Context context, GameListHeaderObj gameListHeaderObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, gameListHeaderObj}, null, changeQuickRedirect, true, 32579, new Class[]{Context.class, GameListHeaderObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameCompilationDetailActivity.class);
        intent.putExtra(f84155c0, gameListHeaderObj);
        return intent;
    }

    private void showSoftKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32603, new Class[]{View.class}, Void.TYPE).isSupported || !view.requestFocus() || (inputMethodManager = (InputMethodManager) getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    private void u2(Result<BBSLinkTreeObj> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32585, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null || result.getResult().getLink() == null) {
            return;
        }
        if (com.max.hbutils.utils.n.q(result.getResult().getLink().getComment_num()) == 0) {
            this.P = getString(R.string.no_comment_desc);
        } else {
            this.P = result.getResult().getLink().getComment_num() + getString(R.string.comment);
        }
        this.mEditCommentEditText.setHint(this.P);
        if (this.M != null) {
            return;
        }
        LinkInfoObj link = result.getResult().getLink();
        this.M = link;
        this.N = link.getLinkid();
        this.O = this.M.getLink_tag();
        this.mEditCommentContainer.setVisibility(0);
        this.mEditCommentAwardNumTextView.setText(this.M.getLink_award_num());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.L.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, ViewUtils.f(this.f66601b, 49.0f));
        this.L.setLayoutParams(layoutParams);
    }

    private void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32589, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        hideSoftKeyboard(this.mEditCommentEditText);
        this.mEditCommentEditText.clearFocus();
        l2();
    }

    private void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32598, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        y2(null, null);
    }

    private void y2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 32599, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.v(str, str2)) {
            this.Y = Boolean.FALSE;
        } else {
            this.Y = Boolean.TRUE;
            this.Z = str;
            this.f84159a0 = str2;
        }
        if (!com.max.xiaoheihe.utils.i0.g(this.f66601b) || com.max.hbcommon.utils.c.u(this.mEditCommentEditText.getText().toString())) {
            return;
        }
        LoadingDialog loadingDialog = this.T;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.T = new LoadingDialog(this.f66601b, getString(R.string.commiting), true).r();
        }
        if (!this.Y.booleanValue() || com.max.hbcommon.utils.c.u(this.f84159a0)) {
            m2();
        } else {
            m2();
        }
    }

    private void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32588, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v2();
        this.mEditCommentEditText.clearFocus();
        this.mEditCommentEditText.setText("");
        this.mEditCommentEditText.setHint(this.P);
        this.X = false;
        this.W = "-1";
        this.V = "-1";
        this.mEditCommentEditPicRecyclerView.setVisibility(0);
    }

    @Override // kf.a
    public String A() {
        return null;
    }

    @Override // kf.a
    public void I1() {
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public boolean K1() {
        return false;
    }

    @Override // kf.a
    public void M2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 32587, new Class[]{String.class, String.class}, Void.TYPE).isSupported || this.mEditCommentAwardView == null) {
            return;
        }
        boolean zEquals = ("3".equals(this.O) || "14".equals(this.O)) ? "1".equals(str) : "1".equals(str);
        this.sb_edit_comment_award.setBtnColor(this.f66601b.getResources().getColor(R.color.text_secondary_2_color));
        this.sb_edit_comment_award.setChecked(zEquals, zEquals);
        this.mEditCommentAwardNumTextView.setText(str2);
    }

    @Override // kf.a
    public void R2(int i10) {
    }

    @Override // kf.a
    public String X() {
        return null;
    }

    @Override // kf.a
    public void b3(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 32583, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.X || com.max.hbcommon.utils.c.u(this.mEditCommentEditText.getText().toString())) {
            z2();
        }
    }

    @Override // kf.a
    public String c3() {
        return null;
    }

    @Override // kf.a
    public void d(ShareImageDialogFragment shareImageDialogFragment) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogFragment}, this, changeQuickRedirect, false, 32594, new Class[]{ShareImageDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        shareImageDialogFragment.show(getSupportFragmentManager(), "share_image");
    }

    @Override // kf.a
    public void d1(Fragment fragment, int i10, String str, String str2) {
    }

    @Override // kf.a
    public void d3(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
    }

    @Override // kf.a
    public String getLinkId() {
        return null;
    }

    @Override // kf.a
    public void h0(@androidx.annotation.n0 LinkInfoObj linkInfoObj, @androidx.annotation.n0 Map<String, String> map, @androidx.annotation.n0 yh.l<? super Boolean, kotlin.b2> lVar) {
    }

    @Override // kf.a
    public BBSLinkRecObj i() {
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32592, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.S(this, new g());
    }

    @Override // kf.a
    public void k(String str) {
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32580, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_compilation_detail);
        ButterKnife.a(this);
        this.L = (FrameLayout) findViewById(R.id.fragment_container);
        getWindow().setFormat(-3);
        this.f84160b0 = com.max.xiaoheihe.utils.i0.i().getAccount_detail().getUserid();
        GameListHeaderObj gameListHeaderObj = (GameListHeaderObj) getIntent().getSerializableExtra(f84155c0);
        if (((GameCompilationDetailFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            GameCompilationDetailFragment gameCompilationDetailFragmentQ3 = GameCompilationDetailFragment.Q3(gameListHeaderObj);
            gameCompilationDetailFragmentQ3.setUserVisibleHint(true);
            gameCompilationDetailFragmentQ3.setMenuVisibility(true);
            getSupportFragmentManager().u().b(R.id.fragment_container, gameCompilationDetailFragmentQ3).m();
        }
        this.P = getString(R.string.no_comment_desc);
        this.mEditCommentEditPicRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        this.mEditCommentEditPicRecyclerView.setLayoutManager(linearLayoutManager);
        com.max.xiaoheihe.module.bbs.adapter.x xVar = new com.max.xiaoheihe.module.bbs.adapter.x(this.f66601b);
        this.U = xVar;
        xVar.s(this);
        this.mEditCommentEditPicRecyclerView.setAdapter(this.U);
        new ItemTouchHelper(new a(12, 3)).attachToRecyclerView(this.mEditCommentEditPicRecyclerView);
    }

    @Override // kf.a
    public void l(String str, boolean z10) {
    }

    @Override // kf.a
    public void m(BBSCommentObj bBSCommentObj, BBSCommentObj bBSCommentObj2) {
        if (PatchProxy.proxy(new Object[]{bBSCommentObj, bBSCommentObj2}, this, changeQuickRedirect, false, 32584, new Class[]{BBSCommentObj.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.V = bBSCommentObj2.getCommentid();
        this.W = bBSCommentObj.getCommentid();
        this.mEditCommentEditText.setHint(getString(R.string.reply) + bBSCommentObj2.getUser().getUsername());
        com.max.hbimage.b.H(bBSCommentObj2.getUser().getAvartar(), this.mEditCommentReplyFloorAvatarImageView);
        this.mEditCommentReplyFloorMsgTextView.setText(bBSCommentObj2.getText());
        this.mEditCommentEditPicRecyclerView.setVisibility(4);
        this.X = true;
        this.mEditCommentContainer.setVisibility(0);
        q2();
    }

    @Override // kf.a
    public boolean m0(String str) {
        return false;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        ArrayList<String> arrayList;
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32593, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && (arrayList = this.Q) != null && arrayList.size() > 0 && i10 < this.Q.size()) {
            this.Q.remove(i10);
            this.U.notifyItemRemoved(i10);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32595, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0 && i11 == -1) {
            ArrayList<LocalMedia> arrayListG = com.max.mediaselector.lib.basic.q.g(intent);
            if (arrayListG != null && arrayListG.size() > 0) {
                for (int i12 = 0; i12 < arrayListG.size(); i12++) {
                    this.Q.add(arrayListG.get(i12).G());
                }
            }
            this.U.r(this.Q);
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32590, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.mEditCommentTranslucentLayer;
        if (view != null && view.getVisibility() == 0) {
            v2();
            z10 = true;
        }
        if (z10) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32582, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        UMShareAPI.get(this).release();
    }

    @Override // kf.a
    public void p1() {
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32581, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mEditCommentEditorView.setOnClickListener(new b());
        this.mEditCommentEditText.setHint(this.P);
        this.mEditCommentEditText.clearFocus();
        this.mEditCommentEditText.setOnFocusChangeListener(new c());
        this.mEditCommentTranslucentLayer.setOnClickListener(new d());
        this.mEditCommentAwardView.setOnClickListener(new e());
        this.mEditCommentSendTextView.setOnClickListener(new f());
    }

    @Override // kf.a
    public void r1(BBSUserInfoObj bBSUserInfoObj, String str) {
    }

    @Override // kf.a
    public void v(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 32586, new Class[]{String.class, String.class}, Void.TYPE).isSupported || this.mEditCommentAwardView == null) {
            return;
        }
        boolean zEquals = ("3".equals(this.O) || "14".equals(this.O)) ? "1".equals(str) : "1".equals(str);
        this.sb_edit_comment_award.setBtnColor(this.f66601b.getResources().getColor(R.color.text_secondary_2_color));
        this.sb_edit_comment_award.setChecked(zEquals, zEquals);
        this.mEditCommentAwardNumTextView.setText(str2);
    }

    @Override // kf.a
    public boolean v0() {
        return false;
    }

    @Override // kf.a
    public boolean w0() {
        return false;
    }

    @Override // kf.a
    public void y(String str) {
    }
}
