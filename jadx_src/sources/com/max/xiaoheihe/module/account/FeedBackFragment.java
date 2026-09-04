package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.max.xiaoheihe.bean.NotifyPushMessageObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.FaqObj;
import com.max.xiaoheihe.bean.bbs.FeedBackObj;
import com.max.xiaoheihe.bean.bbs.FeedBackResultObj;
import com.max.xiaoheihe.bean.bbs.PostImageObj;
import com.max.xiaoheihe.bean.chat.MessageResultObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FeedBackFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.bbs.adapter.x.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b, com.max.xiaoheihe.utils.m0.g {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f77678x = "user_id";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f77679y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f77680z = 500;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.x f77684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f77685f;

    @BindView(R.id.fl_expression)
    FrameLayout fl_expression;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f77686g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<FeedBackObj> f77688i;

    @BindView(R.id.iv_add_img)
    ImageView iv_add_img;

    @BindView(R.id.iv_empty)
    ImageView iv_empty;

    @BindView(R.id.iv_expression)
    ImageView iv_expression;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LoadingDialog f77690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f77691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f77692m;

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

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private User f77693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f77694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f77695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f77696q;

    @BindView(R.id.rl_root)
    RelativeLayout rootview;

    @BindView(R.id.sb_edit_comment_award)
    ShineButton sb_edit_comment_award;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private BBSUserInfoObj f77699t;

    @BindView(R.id.tv_empty)
    TextView tv_empty;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f77700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.max.hbexpression.q f77701v;

    @BindView(R.id.view_empty)
    View view_empty;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f77681b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f77682c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f77683d = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f77687h = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<FeedBackObj> f77689j = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f77697r = new Handler();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f77698s = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f77702w = 0;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22798, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - FeedBackFragment.this.f77702w > 1000) {
                FeedBackFragment.this.f77702w = jCurrentTimeMillis;
                if (com.max.hbcommon.utils.c.u(FeedBackFragment.this.mEditCommentEditText.getText().toString()) && (FeedBackFragment.this.f77681b == null || FeedBackFragment.this.f77681b.size() <= 0)) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(FeedBackFragment.this.getString(R.string.content_empty_msg));
                    return;
                }
                if (FeedBackFragment.this.f77681b != null) {
                    FeedBackFragment.this.f77681b.size();
                }
                if (FeedBackFragment.this.f77690k == null || !FeedBackFragment.this.f77690k.i()) {
                    FeedBackFragment feedBackFragment = FeedBackFragment.this;
                    feedBackFragment.f77690k = new LoadingDialog(((com.max.hbcommon.base.d) feedBackFragment).mContext, FeedBackFragment.this.getString(R.string.commiting), true).r();
                }
                FeedBackFragment.x4(FeedBackFragment.this);
            }
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<MessageResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77705c;

        b(String str, String str2) {
            this.f77704b = str;
            this.f77705c = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22800, new Class[0], Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                FeedBackFragment.this.mRefreshLayout.A(0);
                FeedBackFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22799, new Class[]{Throwable.class}, Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                FeedBackFragment.this.mRefreshLayout.A(0);
                FeedBackFragment.this.mRefreshLayout.p(0);
                FeedBackFragment.y4(FeedBackFragment.this);
                super.onError(th2);
            }
        }

        public void onNext(Result<MessageResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22801, new Class[]{Result.class}, Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                if (result.getResult() != null) {
                    FeedBackFragment.this.f77699t = result.getResult().getRecipient();
                }
                if (result.getResult().getNewer() != null && this.f77704b == null) {
                    FeedBackFragment.this.f77685f = result.getResult().getNewer();
                }
                if (result.getResult().getOlder() != null && this.f77705c == null) {
                    FeedBackFragment.this.f77686g = result.getResult().getOlder();
                }
                FeedBackFragment.z4(FeedBackFragment.this, result.getResult().getList(), this.f77705c == null && this.f77704b != null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22802, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MessageResultObj>) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<FeedBackResultObj<List<FeedBackObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77708c;

        c(String str, String str2) {
            this.f77707b = str;
            this.f77708c = str2;
        }

        public void a(FeedBackResultObj<List<FeedBackObj>> feedBackResultObj) {
            if (!PatchProxy.proxy(new Object[]{feedBackResultObj}, this, changeQuickRedirect, false, 22805, new Class[]{FeedBackResultObj.class}, Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                if (feedBackResultObj.getNewer() != null && this.f77707b == null) {
                    FeedBackFragment.this.f77685f = feedBackResultObj.getNewer();
                }
                if (feedBackResultObj.getOlder() != null && this.f77708c == null) {
                    FeedBackFragment.this.f77686g = feedBackResultObj.getOlder();
                }
                FeedBackFragment.z4(FeedBackFragment.this, feedBackResultObj.getResult(), this.f77708c == null && this.f77707b != null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22804, new Class[0], Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                FeedBackFragment.this.mRefreshLayout.A(0);
                FeedBackFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22803, new Class[]{Throwable.class}, Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                FeedBackFragment.this.mRefreshLayout.A(0);
                FeedBackFragment.this.mRefreshLayout.p(0);
                FeedBackFragment.B4(FeedBackFragment.this);
                super.onError(th2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22806, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((FeedBackResultObj) obj);
        }
    }

    public class d implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22807, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FeedBackFragment.D4(FeedBackFragment.this);
        }
    }

    public class e implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
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
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 22808, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            FeedBackFragment.this.f77683d = com.max.xiaoheihe.utils.d.p0(strArr);
            if (com.max.hbcommon.utils.c.u(FeedBackFragment.this.f77683d) && com.max.hbcommon.utils.c.u(FeedBackFragment.this.mEditCommentEditText.getText().toString())) {
                return;
            }
            FeedBackFragment.G4(FeedBackFragment.this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22809, new Class[]{String.class}, Void.TYPE).isSupported || FeedBackFragment.this.f77690k == null) {
                return;
            }
            FeedBackFragment.this.f77690k.c();
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22810, new Class[0], Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22811, new Class[]{Throwable.class}, Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                super.onError(th2);
                if (FeedBackFragment.this.f77690k != null) {
                    FeedBackFragment.this.f77690k.c();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22812, new Class[]{Result.class}, Void.TYPE).isSupported && FeedBackFragment.this.isActive()) {
                FeedBackFragment.this.mEditCommentEditText.clearFocus();
                FeedBackFragment.this.mEditCommentEditText.setText("");
                FeedBackFragment.this.g5();
                FeedBackFragment.this.f77681b.clear();
                if (FeedBackFragment.this.f77684e != null) {
                    FeedBackFragment.this.f77684e.r(FeedBackFragment.this.f77681b);
                }
                FeedBackFragment.this.f77683d = "";
                FeedBackFragment.this.f77689j.clear();
                FeedBackFragment.this.f77687h = true;
                FeedBackFragment.h4(FeedBackFragment.this, null, null);
                FeedBackFragment.I4(FeedBackFragment.this);
                if (FeedBackFragment.this.f77690k != null) {
                    FeedBackFragment.this.f77690k.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22813, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77713b;

        g(String str) {
            this.f77713b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22814, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", this.f77713b);
            intent.putExtra("title", "常见问题");
            ((com.max.hbcommon.base.d) FeedBackFragment.this).mContext.startActivity(intent);
        }
    }

    public class h extends ItemTouchHelper.SimpleCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        h(int i10, int i11) {
            super(i10, i11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 22797, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return (FeedBackFragment.this.f77681b == null || FeedBackFragment.this.f77681b.size() <= 0 || viewHolder.getAdapterPosition() >= FeedBackFragment.this.f77681b.size()) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(12, 3);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, viewHolder2}, this, changeQuickRedirect, false, 22795, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (FeedBackFragment.this.f77681b == null || FeedBackFragment.this.f77681b.size() <= 0 || adapterPosition >= FeedBackFragment.this.f77681b.size() || adapterPosition2 >= FeedBackFragment.this.f77681b.size()) {
                return false;
            }
            if (adapterPosition < adapterPosition2) {
                int i10 = adapterPosition;
                while (i10 < adapterPosition2) {
                    int i11 = i10 + 1;
                    Collections.swap(FeedBackFragment.this.f77681b, i10, i11);
                    i10 = i11;
                }
            } else {
                for (int i12 = adapterPosition; i12 > adapterPosition2; i12--) {
                    Collections.swap(FeedBackFragment.this.f77681b, i12, i12 - 1);
                }
            }
            FeedBackFragment.this.f77684e.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 22796, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            if (FeedBackFragment.this.f77681b == null || FeedBackFragment.this.f77681b.size() <= 0 || adapterPosition >= FeedBackFragment.this.f77681b.size()) {
                return;
            }
            FeedBackFragment.this.f77681b.remove(adapterPosition);
            FeedBackFragment.this.f77684e.notifyItemRemoved(adapterPosition);
        }
    }

    public class i extends com.max.hbcommon.base.adapter.u<FeedBackObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22819, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.T(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, FeedBackFragment.this.f77699t.getUserid()).A();
            }
        }

        public class b implements View.OnTouchListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextView f77718b;

            public class a implements Runnable {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22821, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    b.this.f77718b.performLongClick();
                    FeedBackFragment.this.f77698s = true;
                }
            }

            b(TextView textView) {
                this.f77718b = textView;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 22820, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                com.max.hbcommon.utils.d.b("clicktestzzzz", "onTouch");
                FeedBackFragment.this.f77695p = motionEvent.getRawX();
                FeedBackFragment.this.f77696q = motionEvent.getRawY();
                TextView textView = (TextView) view;
                Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
                int action = motionEvent.getAction();
                if (action == 3 && FeedBackFragment.this.f77697r != null) {
                    FeedBackFragment.this.f77697r.removeCallbacksAndMessages(null);
                }
                if (action != 1 && action != 0) {
                    return false;
                }
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
                int totalPaddingTop = y10 - textView.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + textView.getScrollX();
                int scrollY = totalPaddingTop + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableNewSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length == 0) {
                    Selection.removeSelection(spannableNewSpannable);
                    return false;
                }
                if (action == 1) {
                    if (FeedBackFragment.this.f77697r != null) {
                        FeedBackFragment.this.f77697r.removeCallbacksAndMessages(null);
                    }
                    if (!FeedBackFragment.this.f77698s) {
                        clickableSpanArr[0].onClick(textView);
                    }
                    FeedBackFragment.this.f77698s = false;
                } else if (action == 0) {
                    Selection.setSelection(spannableNewSpannable, spannableNewSpannable.getSpanStart(clickableSpanArr[0]), spannableNewSpannable.getSpanEnd(clickableSpanArr[0]));
                    FeedBackFragment.this.f77697r.postDelayed(new a(), FeedBackFragment.f77680z);
                }
                return true;
            }
        }

        public class c implements View.OnLongClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f77721b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FeedBackObj f77722c;

            public class a implements com.max.xiaoheihe.view.popuplist.a.g {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // com.max.xiaoheihe.view.popuplist.a.h
                public boolean a(View view, View view2, int i10) {
                    return true;
                }

                @Override // com.max.xiaoheihe.view.popuplist.a.h
                public void b(View view, int i10, int i11) {
                    Object[] objArr = {view, new Integer(i10), new Integer(i11)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Integer.TYPE;
                    if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22823, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.xiaoheihe.utils.d.o(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, c.this.f77722c.getText());
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext.getString(R.string.text_copied));
                }

                @Override // com.max.xiaoheihe.view.popuplist.a.g
                public String c(View view, View view2, int i10, int i11, String str) {
                    return str;
                }

                @Override // com.max.xiaoheihe.view.popuplist.a.h
                public /* synthetic */ void onDismiss() {
                    com.max.xiaoheihe.view.popuplist.b.a(this);
                }
            }

            c(int i10, FeedBackObj feedBackObj) {
                this.f77721b = i10;
                this.f77722c = feedBackObj;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22822, new Class[]{View.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                com.max.xiaoheihe.view.popuplist.a aVar = new com.max.xiaoheihe.view.popuplist.a(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext);
                ArrayList arrayList = new ArrayList();
                arrayList.add(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext.getString(R.string.copy));
                aVar.g0(view, this.f77721b, FeedBackFragment.this.f77695p, FeedBackFragment.this.f77696q, arrayList, new a());
                return true;
            }
        }

        public class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ImageView f77725b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f77726c;

            d(ImageView imageView, String str) {
                this.f77725b = imageView;
                this.f77726c = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22824, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ImageViewerHelper.a(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext).m(ImageViewerHelper.d(this.f77725b, 0), this.f77726c.split(";")).d(0).p();
            }
        }

        i(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, FeedBackObj feedBackObj) {
            Object[] objArr = {new Integer(i10), feedBackObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22817, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, feedBackObj);
        }

        public int n(int i10, FeedBackObj feedBackObj) {
            Object[] objArr = {new Integer(i10), feedBackObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22815, new Class[]{cls, FeedBackObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return (!com.max.hbcommon.utils.c.u(FeedBackFragment.this.f77691l) && "1".equals(feedBackObj.getIs_user())) ? R.layout.table_row_feedback_user : R.layout.table_row_feedback_supporter;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:44:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:45:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:48:0x0203  */
        /* JADX WARN: Code duplicated, block: B:66:0x02c3  */
        public void o(com.max.hbcommon.base.adapter.s.e eVar, FeedBackObj feedBackObj) {
            boolean z10;
            boolean z11;
            LinearLayout linearLayout;
            LinearLayout.LayoutParams layoutParams;
            int i10;
            PostImageObj img;
            if (PatchProxy.proxy(new Object[]{eVar, feedBackObj}, this, changeQuickRedirect, false, 22816, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedBackObj.class}, Void.TYPE).isSupported) {
                return;
            }
            switch (eVar.d()) {
                case R.layout.table_row_feedback_supporter /* 2131560097 */:
                    HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) eVar.i(R.id.avatar);
                    if ("1".equals(feedBackObj.getIs_user())) {
                        if (com.max.xiaoheihe.utils.i0.o().isLoginFlag()) {
                            heyBoxAvatarView.setAvatar(FeedBackFragment.this.f77693n.getAccount_detail().getAvartar(), FeedBackFragment.this.f77693n.getAccount_detail().getAvatar_decoration());
                            heyBoxAvatarView.setOnClickListener(null);
                        } else {
                            heyBoxAvatarView.setAvatar((String) null, (AvatarDecorationObj) null);
                            heyBoxAvatarView.setOnClickListener(null);
                        }
                    } else if (com.max.hbcommon.utils.c.u(FeedBackFragment.this.f77691l)) {
                        heyBoxAvatarView.setAvatar(R.drawable.supporter_avatar, (AvatarDecorationObj) null);
                        heyBoxAvatarView.setOnClickListener(null);
                    } else {
                        heyBoxAvatarView.setAvatar(FeedBackFragment.this.f77699t.getAvartar(), FeedBackFragment.this.f77699t.getAvatar_decoration());
                        heyBoxAvatarView.setOnClickListener(new a());
                    }
                    break;
                case R.layout.table_row_feedback_user /* 2131560098 */:
                    HeyBoxAvatarView heyBoxAvatarView2 = (HeyBoxAvatarView) eVar.i(R.id.avatar);
                    if (com.max.xiaoheihe.utils.i0.o().isLoginFlag()) {
                        heyBoxAvatarView2.setAvatar(FeedBackFragment.this.f77693n.getAccount_detail().getAvartar(), FeedBackFragment.this.f77693n.getAccount_detail().getAvatar_decoration());
                        heyBoxAvatarView2.setOnClickListener(null);
                    } else {
                        heyBoxAvatarView2.setAvatar((String) null, (AvatarDecorationObj) null);
                        heyBoxAvatarView2.setOnClickListener(null);
                    }
                    break;
            }
            int iIndexOf = getDataList().indexOf(feedBackObj);
            TextView textView = (TextView) eVar.i(R.id.tv_comment);
            if (com.max.hbcommon.utils.c.u(feedBackObj.getText())) {
                textView.setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                textView.setVisibility(0);
                String text = feedBackObj.getText();
                int length = text.length();
                SpannableString spannableString = new SpannableString(text);
                Linkify.addLinks(spannableString, 1);
                for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, length, URLSpan.class)) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    spannableString.setSpan(new com.max.xiaoheihe.view.o(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, uRLSpan.getURL()), spanStart, spanEnd, 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                textView.setText(spannableStringBuilder);
                textView.setOnTouchListener(new b(textView));
            }
            int adapterPosition = eVar.getAdapterPosition();
            if (adapterPosition != 0) {
                z10 = true;
                if (com.max.hbutils.utils.n.r(feedBackObj.getCreate_at()) - com.max.hbutils.utils.n.r(((FeedBackObj) FeedBackFragment.this.f77689j.get(adapterPosition - 1)).getCreate_at()) <= 300) {
                    z11 = false;
                }
                if (com.max.hbcommon.utils.c.u(feedBackObj.getCreate_at()) && z11) {
                    eVar.p(R.id.tv_time, com.max.hbutils.utils.w.q(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, feedBackObj.getCreate_at()));
                    eVar.i(R.id.tv_time).setVisibility(0);
                } else {
                    eVar.i(R.id.tv_time).setVisibility(8);
                }
                textView.setOnLongClickListener(new c(iIndexOf, feedBackObj));
                linearLayout = (LinearLayout) eVar.i(R.id.ll_pic);
                layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                if (com.max.hbcommon.utils.c.u(feedBackObj.getText())) {
                    i10 = 0;
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.topMargin = ViewUtils.f(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, 10.0f);
                    i10 = 0;
                }
                if (feedBackObj.getImg() != null) {
                    linearLayout.removeAllViews();
                    linearLayout.setVisibility(8);
                    return;
                }
                linearLayout.setVisibility(i10);
                linearLayout.removeAllViews();
                int iL = ViewUtils.L(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, 112.0f);
                String url = feedBackObj.getImg().getUrl();
                img = feedBackObj.getImg();
                if (!com.max.hbcommon.utils.c.u(img.getWidth()) || img.getWidth().equals("0") || com.max.hbcommon.utils.c.u(img.getHeight()) || img.getHeight().equals("0")) {
                    return;
                }
                int i11 = Integer.parseInt(img.getWidth());
                if (i11 <= iL) {
                    iL = i11 < ViewUtils.f(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, 180.0f) ? ViewUtils.f(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, 180.0f) : i11;
                }
                int i12 = (Integer.parseInt(img.getHeight()) * iL) / Integer.parseInt(img.getWidth());
                ImageView imageView = new ImageView(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(iL, i12));
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setId(R.id.iv_image);
                com.max.hbimage.b.L(img.getUrl(), imageView, R.color.black);
                imageView.setOnClickListener(new d(imageView, url));
                linearLayout.addView(imageView);
                return;
            }
            z10 = true;
            z11 = z10;
            if (com.max.hbcommon.utils.c.u(feedBackObj.getCreate_at())) {
                eVar.i(R.id.tv_time).setVisibility(8);
            } else {
                eVar.i(R.id.tv_time).setVisibility(8);
            }
            textView.setOnLongClickListener(new c(iIndexOf, feedBackObj));
            linearLayout = (LinearLayout) eVar.i(R.id.ll_pic);
            layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (com.max.hbcommon.utils.c.u(feedBackObj.getText())) {
                layoutParams.topMargin = ViewUtils.f(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, 10.0f);
                i10 = 0;
            } else {
                i10 = 0;
                layoutParams.topMargin = 0;
            }
            if (feedBackObj.getImg() != null) {
                linearLayout.removeAllViews();
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(i10);
            linearLayout.removeAllViews();
            int iL2 = ViewUtils.L(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) FeedBackFragment.this).mContext, 112.0f);
            String url2 = feedBackObj.getImg().getUrl();
            img = feedBackObj.getImg();
            if (com.max.hbcommon.utils.c.u(img.getWidth())) {
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 22818, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (FeedBackObj) obj);
        }
    }

    public class j implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22825, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FeedBackFragment feedBackFragment = FeedBackFragment.this;
            FeedBackFragment.h4(feedBackFragment, null, feedBackFragment.f77686g);
        }
    }

    public class k implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22826, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FeedBackFragment feedBackFragment = FeedBackFragment.this;
            FeedBackFragment.h4(feedBackFragment, feedBackFragment.f77685f, null);
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22827, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!FeedBackFragment.this.f77700u) {
                FeedBackFragment feedBackFragment = FeedBackFragment.this;
                FeedBackFragment.p4(feedBackFragment, feedBackFragment.mEditCommentEditText);
                FeedBackFragment.q4(FeedBackFragment.this);
            } else {
                FeedBackFragment.this.f77700u = false;
                if (FeedBackFragment.this.f77701v != null) {
                    FeedBackFragment.this.iv_expression.setImageResource(R.drawable.ic_add_emoji);
                    FeedBackFragment.this.f77701v.C();
                }
                FeedBackFragment feedBackFragment2 = FeedBackFragment.this;
                FeedBackFragment.o4(feedBackFragment2, feedBackFragment2.mEditCommentEditText);
            }
        }
    }

    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22828, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FeedBackFragment.this.i0();
        }
    }

    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22829, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FeedBackFragment feedBackFragment = FeedBackFragment.this;
            FeedBackFragment.o4(feedBackFragment, feedBackFragment.mEditCommentEditText);
            FeedBackFragment.r4(FeedBackFragment.this);
        }
    }

    public class o implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (!PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22830, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported && z10) {
                FeedBackFragment feedBackFragment = FeedBackFragment.this;
                FeedBackFragment.o4(feedBackFragment, feedBackFragment.mEditCommentEditText);
                FeedBackFragment.r4(FeedBackFragment.this);
            }
        }
    }

    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22831, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FeedBackFragment.this.g5();
        }
    }

    static /* synthetic */ void B4(FeedBackFragment feedBackFragment) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment}, null, changeQuickRedirect, true, 22791, new Class[]{FeedBackFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.showError();
    }

    static /* synthetic */ void D4(FeedBackFragment feedBackFragment) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment}, null, changeQuickRedirect, true, 22792, new Class[]{FeedBackFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.V4();
    }

    static /* synthetic */ void G4(FeedBackFragment feedBackFragment) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment}, null, changeQuickRedirect, true, 22793, new Class[]{FeedBackFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.U4();
    }

    static /* synthetic */ void I4(FeedBackFragment feedBackFragment) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment}, null, changeQuickRedirect, true, 22794, new Class[]{FeedBackFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.i5();
    }

    private void S4(FaqObj faqObj, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{faqObj, viewGroup}, this, changeQuickRedirect, false, 22777, new Class[]{FaqObj.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = new TextView(this.mContext);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setPadding(0, ViewUtils.f(this.mContext, 2.0f), 0, ViewUtils.f(this.mContext, 2.0f));
        textView.setTextSize(1, 14.0f);
        textView.setText(faqObj.getText());
        if ("url".equals(faqObj.getType())) {
            textView.setTextColor(this.mContext.getResources().getColor(R.color.click_blue));
            textView.setOnClickListener(new g(faqObj.getUrl()));
        } else {
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
        }
        viewGroup.addView(textView);
    }

    private void T4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22774, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mEditCommentEditorView.getLayoutParams();
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        this.mEditCommentEditorView.setLayoutParams(marginLayoutParams);
        this.mEditCommentAwardView.setVisibility(8);
        this.mEditCommentExView.setVisibility(8);
        this.mEditCommentExViewNew.setVisibility(8);
        this.mEditCommentReplyFloorView.setVisibility(8);
        this.mEditCommentTranslucentLayer.setVisibility(8);
        this.mEditCommentEditText.setSingleLine(true);
        if (this.f77701v != null) {
            this.f77700u = false;
            this.iv_expression.setImageResource(R.drawable.ic_add_emoji);
            this.f77701v.C();
        }
    }

    private void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22771, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String string = this.mEditCommentEditText.getText().toString();
        addDisposable((io.reactivex.disposables.b) (!com.max.hbcommon.utils.c.u(this.f77691l) ? com.max.xiaoheihe.network.i.a().Oa(this.f77691l, string, this.f77683d) : com.max.xiaoheihe.network.i.a().A6(Build.MODEL, string, this.f77683d)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22763, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<String> arrayList = this.f77681b;
        com.max.mediaselector.e.g(this, (arrayList == null || arrayList.size() <= 0) ? this.f77682c : this.f77682c - this.f77681b.size(), 0);
    }

    private void W4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22770, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f77690k;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.f77690k = new LoadingDialog(this.mContext, getString(R.string.commiting), true).r();
        }
        ArrayList<String> arrayList = this.f77681b;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f77683d = "";
            U4();
        } else {
            this.f77683d = "";
            com.max.xiaoheihe.module.upload.g.h(this.mContext, getCompositeDisposable(), this.f77681b, "bbs", new e());
        }
    }

    private void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22773, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mEditCommentEditorView.getLayoutParams();
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        this.mEditCommentEditorView.setLayoutParams(marginLayoutParams);
        this.mEditCommentAwardView.setVisibility(8);
        this.mEditCommentExView.setVisibility(0);
        this.mEditCommentExViewNew.setVisibility(0);
        this.mEditCommentReplyFloorView.setVisibility(8);
        this.mEditCommentTranslucentLayer.setVisibility(0);
        this.mEditCommentEditText.setSingleLine(false);
        this.mEditCommentEditText.setMaxLines(8);
        if (this.f77701v != null) {
            this.f77700u = false;
            this.iv_expression.setImageResource(R.drawable.ic_add_emoji);
            this.f77701v.C();
        }
    }

    private void Y4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 22760, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X8(this.f77691l, str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str2, str)));
    }

    private void Z4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 22761, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().H4(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str2, str)));
    }

    private void a5(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 22759, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f77691l)) {
            Z4(str, str2);
        } else {
            Y4(str, str2);
        }
    }

    private void b5(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22776, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean d5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22782, new Class[0], Boolean.class);
        if (patchProxyResultProxy.isSupported) {
            return (Boolean) patchProxyResultProxy.result;
        }
        return Boolean.valueOf(this.mEditCommentEditText.getText() != null ? !com.max.hbcommon.utils.c.u(this.mEditCommentEditText.getText().toString()) : false);
    }

    public static FeedBackFragment e5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 22754, new Class[0], FeedBackFragment.class);
        return patchProxyResultProxy.isSupported ? (FeedBackFragment) patchProxyResultProxy.result : new FeedBackFragment();
    }

    public static FeedBackFragment f5(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 22755, new Class[]{String.class}, FeedBackFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedBackFragment) patchProxyResultProxy.result;
        }
        FeedBackFragment feedBackFragment = new FeedBackFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        feedBackFragment.setArguments(bundle);
        return feedBackFragment;
    }

    static /* synthetic */ void h4(FeedBackFragment feedBackFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment, str, str2}, null, changeQuickRedirect, true, 22783, new Class[]{FeedBackFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.a5(str, str2);
    }

    private void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22758, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77700u = true;
        this.fl_expression.setVisibility(0);
        this.iv_expression.setImageResource(R.drawable.ic_keyboard);
        com.max.hbexpression.q qVar = this.f77701v;
        if (qVar != null) {
            qVar.q1();
            return;
        }
        com.max.hbexpression.q qVarA = com.max.hbexpression.e.a(true);
        this.f77701v = qVarA;
        qVarA.b2(new yh.a() { // from class: com.max.xiaoheihe.module.account.c
            @Override // yh.a
            public final Object invoke() {
                return this.f78814b.d5();
            }
        });
        getChildFragmentManager().u().b(R.id.fl_expression, this.f77701v.P()).m();
    }

    private void i5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22772, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g5();
        this.mEditCommentEditText.clearFocus();
        this.mEditCommentEditText.setText("");
        this.mEditCommentEditText.setHint(this.f77694o);
        this.mEditCommentEditPicRecyclerView.setVisibility(0);
    }

    private void j5(List<FeedBackObj> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22762, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f77687h && com.max.hbcommon.utils.c.w(list)) {
            this.f77687h = false;
            this.view_empty.setVisibility(0);
            this.tv_empty.setText(com.max.hbcommon.utils.c.u(this.f77691l) ? R.string.no_feedback : R.string.no_msg);
            this.iv_empty.setImageResource(R.drawable.common_tag_message_46x45);
            return;
        }
        this.view_empty.setVisibility(8);
        if (com.max.hbcommon.utils.c.u(this.f77691l)) {
            Collections.reverse(list);
        }
        if (z10) {
            this.f77689j.addAll(0, list);
        } else {
            this.f77689j.addAll(list);
        }
        this.f77688i.notifyDataSetChanged();
        if (this.f77687h) {
            this.f77687h = false;
            this.mRecyclerView.scrollToPosition(this.f77689j.size() - 1);
        }
    }

    private void k5(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22775, new Class[]{View.class}, Void.TYPE).isSupported || !view.requestFocus() || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    static /* synthetic */ void o4(FeedBackFragment feedBackFragment, View view) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment, view}, null, changeQuickRedirect, true, 22784, new Class[]{FeedBackFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.k5(view);
    }

    static /* synthetic */ void p4(FeedBackFragment feedBackFragment, View view) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment, view}, null, changeQuickRedirect, true, 22785, new Class[]{FeedBackFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.b5(view);
    }

    static /* synthetic */ void q4(FeedBackFragment feedBackFragment) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment}, null, changeQuickRedirect, true, 22786, new Class[]{FeedBackFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.h5();
    }

    static /* synthetic */ void r4(FeedBackFragment feedBackFragment) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment}, null, changeQuickRedirect, true, 22787, new Class[]{FeedBackFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.X4();
    }

    static /* synthetic */ void x4(FeedBackFragment feedBackFragment) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment}, null, changeQuickRedirect, true, 22788, new Class[]{FeedBackFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.W4();
    }

    static /* synthetic */ void y4(FeedBackFragment feedBackFragment) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment}, null, changeQuickRedirect, true, 22789, new Class[]{FeedBackFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.showError();
    }

    static /* synthetic */ void z4(FeedBackFragment feedBackFragment, List list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{feedBackFragment, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 22790, new Class[]{FeedBackFragment.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        feedBackFragment.j5(list, z10);
    }

    @Override // com.max.xiaoheihe.utils.m0.g
    public /* synthetic */ void F2() {
        com.max.xiaoheihe.utils.n0.a(this);
    }

    public boolean c5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22769, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        View view = this.mEditCommentTranslucentLayer;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22779, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mEditCommentEditText.onKeyDown(67, new KeyEvent(0, 67));
    }

    public void g5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22768, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b5(this.mEditCommentEditText);
        this.mEditCommentEditText.clearFocus();
        T4();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22765, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.Q(this, (AppCompatActivity) getActivity(), new d());
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22756, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_feedback);
        if (getArguments() != null) {
            this.f77691l = getArguments().getString("user_id");
        }
        this.mUnBinder = ButterKnife.f(this, view);
        if (com.max.hbcommon.utils.c.u(this.f77691l)) {
            this.f77694o = getString(R.string.feedback_hint);
        } else {
            this.f77694o = "发送消息";
        }
        User userO = com.max.xiaoheihe.utils.i0.o();
        this.f77693n = userO;
        this.f77692m = userO.isLoginFlag() ? this.f77693n.getAccount_detail().getUserid() : "-1";
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mEditCommentEditorView.getLayoutParams();
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        this.mEditCommentEditorView.setLayoutParams(marginLayoutParams);
        this.mEditCommentAwardView.setVisibility(8);
        this.mEditCommentForwardView.setVisibility(8);
        this.mEditCommentFavorView.setVisibility(8);
        this.mEditCommentChargeView.setVisibility(8);
        this.mEditCommentEditPicRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(0);
        this.mEditCommentEditPicRecyclerView.setLayoutManager(linearLayoutManager);
        com.max.xiaoheihe.module.bbs.adapter.x xVar = new com.max.xiaoheihe.module.bbs.adapter.x(this.mContext);
        this.f77684e = xVar;
        xVar.s(this);
        this.mEditCommentEditPicRecyclerView.setAdapter(this.f77684e);
        new ItemTouchHelper(new h(12, 3)).attachToRecyclerView(this.mEditCommentEditPicRecyclerView);
        this.f77688i = new i(this.mContext, this.f77689j);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.mContext);
        linearLayoutManager2.setOrientation(1);
        this.mRecyclerView.setLayoutManager(linearLayoutManager2);
        this.mRecyclerView.setAdapter(this.f77688i);
        this.mRefreshLayout.S(new j());
        this.mRefreshLayout.f0(new k());
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mRefreshLayout.getLayoutParams();
        marginLayoutParams2.bottomMargin = ViewUtils.f(this.mContext, 49.0f);
        this.mRefreshLayout.setLayoutParams(marginLayoutParams2);
        this.mEditCommentContainer.setVisibility(0);
        showLoading();
        a5(null, null);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        ArrayList<String> arrayList;
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22766, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && (arrayList = this.f77681b) != null && arrayList.size() > 0 && i10 < this.f77681b.size()) {
            this.f77681b.remove(i10);
            this.f77684e.notifyItemRemoved(i10);
        }
    }

    @Override // com.max.hbexpression.q.a
    public void o0(ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 22778, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (expressionObj.getType() != 0) {
            int selectionStart = this.mEditCommentEditText.getSelectionStart();
            Editable editableText = this.mEditCommentEditText.getEditableText();
            if (selectionStart < 0 || selectionStart >= editableText.length()) {
                editableText.append((CharSequence) expressionObj.getEmoji_key());
                return;
            } else {
                editableText.insert(selectionStart, expressionObj.getEmoji_key());
                return;
            }
        }
        if (expressionObj.getResId() > 0) {
            this.f77681b.add(expressionObj.getResId() + "");
        } else {
            this.f77681b.add(expressionObj.getFilePath());
        }
        this.f77684e.r(this.f77681b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22767, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0 && i11 == -1) {
            ArrayList<LocalMedia> arrayListG = com.max.mediaselector.lib.basic.q.g(intent);
            if (arrayListG != null && arrayListG.size() > 0) {
                for (int i12 = 0; i12 < arrayListG.size(); i12++) {
                    this.f77681b.add(arrayListG.get(i12).G());
                }
            }
            this.f77684e.r(this.f77681b);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22780, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.f77691l)) {
            com.max.xiaoheihe.utils.m0.x().I(this);
        }
        this.f77697r.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22764, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f77689j.clear();
        this.f77687h = true;
        a5(null, null);
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22757, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.f77691l)) {
            com.max.xiaoheihe.utils.m0.x().q(this);
        }
        this.iv_expression.setOnClickListener(new l());
        this.iv_add_img.setOnClickListener(new m());
        this.mEditCommentEditorView.setOnClickListener(new n());
        this.mEditCommentEditText.setHint(this.f77694o);
        this.mEditCommentEditText.clearFocus();
        this.mEditCommentEditText.setOnFocusChangeListener(new o());
        this.mEditCommentTranslucentLayer.setOnClickListener(new p());
        this.mEditCommentSendTextView.setOnClickListener(new a());
    }

    @Override // com.max.xiaoheihe.utils.m0.g
    public void s2(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 22781, new Class[]{String.class, String.class}, Void.TYPE).isSupported && BizMessageObj.TYPE_PUSH.equals(str2)) {
            try {
                NotifyPushMessageObj notifyPushMessageObj = (NotifyPushMessageObj) com.max.hbutils.utils.k.a(str, NotifyPushMessageObj.class);
                if (notifyPushMessageObj == null || !"notify".equals(notifyPushMessageObj.getType())) {
                    return;
                }
                if ("80".equals(notifyPushMessageObj.getEvent()) || "81".equals(notifyPushMessageObj.getEvent())) {
                    this.f77689j.clear();
                    this.f77687h = true;
                    a5(null, null);
                }
            } catch (Throwable th2) {
                Log.e("FeedBackFragment", "onReceiveMsg error: " + th2.getMessage());
            }
        }
    }
}
