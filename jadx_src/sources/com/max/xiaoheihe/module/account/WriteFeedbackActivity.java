package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebExtraObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.FeedbackPromptObj;
import com.max.xiaoheihe.module.bbs.ChooseTopicsActivity;
import com.max.xiaoheihe.module.expression.widget.HeyBoxEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.android.spdy.SpdyProtocol;

/* JADX INFO: loaded from: classes9.dex */
public class WriteFeedbackActivity extends BaseActivity implements com.max.xiaoheihe.module.bbs.adapter.x.a {
    private static final String G2 = "allow_video";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f78679p1 = 0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f78680p2 = "faq_group_id";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f78681p3 = "feedback_upload";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f78682x1 = 5;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f78683x2 = "order_id";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String f78684y1 = "faq_id";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final String f78685y2 = "wiki";
    private com.max.xiaoheihe.module.bbs.adapter.x L;
    private LoadingDialog O;
    private String R;
    private String S;
    private TextView T;
    private String U;
    private String V;
    private String W;
    private String X;
    private WebExtraObj Y;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f78687b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private BBSTopicObj f78688c0;

    @BindView(R.id.et_content)
    HeyBoxEditText etContent;

    @BindView(R.id.ll_topic)
    LinearLayout ll_topic;

    @BindView(R.id.rl_root)
    RelativeLayout rlRoot;

    @BindView(R.id.rv_edit_comment_edit_pic)
    RecyclerView rv_edit_comment_edit_pic;

    @BindView(R.id.vg_topic_group)
    ViewGroup vg_topic_group;
    private ArrayList<String> M = new ArrayList<>();
    private int N = 4;
    private String P = "";
    private String Q = "";
    private ArrayList<BBSTopicCategoryObj> Z = new ArrayList<>();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ArrayList<BBSTopicObj> f78686a0 = new ArrayList<>();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24701, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(WriteFeedbackActivity.this.etContent.getText().toString()) && (WriteFeedbackActivity.this.M == null || WriteFeedbackActivity.this.M.size() <= 0)) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(WriteFeedbackActivity.this.getString(R.string.content_empty_msg));
            } else if (!com.max.hbcommon.utils.c.w(WriteFeedbackActivity.this.M) || WriteFeedbackActivity.this.etContent.length() >= 5) {
                WriteFeedbackActivity.R1(WriteFeedbackActivity.this);
            } else {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(WriteFeedbackActivity.this.getString(R.string.feedback_lenth_limit_msg));
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24702, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) WriteFeedbackActivity.this).f66601b.startActivityForResult(ChooseTopicsActivity.c2(((BaseActivity) WriteFeedbackActivity.this).f66601b, WriteFeedbackActivity.this.f78686a0, 1), 5);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<FeedbackPromptObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24703, new Class[0], Void.TYPE).isSupported && WriteFeedbackActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24704, new Class[]{Throwable.class}, Void.TYPE).isSupported && WriteFeedbackActivity.this.isActive()) {
                super.onError(th2);
                WriteFeedbackActivity.i2(WriteFeedbackActivity.this);
            }
        }

        public void onNext(Result<FeedbackPromptObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24705, new Class[]{Result.class}, Void.TYPE).isSupported && WriteFeedbackActivity.this.isActive()) {
                super.onNext(result);
                if (result == null || result.getResult() == null) {
                    WriteFeedbackActivity.k2(WriteFeedbackActivity.this);
                } else {
                    WriteFeedbackActivity.j2(WriteFeedbackActivity.this);
                    WriteFeedbackActivity.this.etContent.setHint(result.getResult().getInput_prompt());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24706, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FeedbackPromptObj>) obj);
        }
    }

    public class d extends ItemTouchHelper.SimpleCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 24709, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return (WriteFeedbackActivity.this.M == null || WriteFeedbackActivity.this.M.size() <= 0 || viewHolder.getAdapterPosition() >= WriteFeedbackActivity.this.M.size()) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(12, 3);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, viewHolder2}, this, changeQuickRedirect, false, 24707, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (WriteFeedbackActivity.this.M == null || WriteFeedbackActivity.this.M.size() <= 0 || adapterPosition >= WriteFeedbackActivity.this.M.size() || adapterPosition2 >= WriteFeedbackActivity.this.M.size()) {
                return false;
            }
            if (adapterPosition < adapterPosition2) {
                int i10 = adapterPosition;
                while (i10 < adapterPosition2) {
                    int i11 = i10 + 1;
                    Collections.swap(WriteFeedbackActivity.this.M, i10, i11);
                    i10 = i11;
                }
            } else {
                for (int i12 = adapterPosition; i12 > adapterPosition2; i12--) {
                    Collections.swap(WriteFeedbackActivity.this.M, i12, i12 - 1);
                }
            }
            WriteFeedbackActivity.this.L.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 24708, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            if (WriteFeedbackActivity.this.M == null || WriteFeedbackActivity.this.M.size() <= 0 || adapterPosition >= WriteFeedbackActivity.this.M.size()) {
                return;
            }
            WriteFeedbackActivity.this.M.remove(adapterPosition);
            WriteFeedbackActivity.this.L.notifyItemRemoved(adapterPosition);
        }
    }

    public class e implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24710, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WriteFeedbackActivity.m2(WriteFeedbackActivity.this);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24711, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) WriteFeedbackActivity.this).f66601b.startActivityForResult(ChooseTopicsActivity.c2(((BaseActivity) WriteFeedbackActivity.this).f66601b, WriteFeedbackActivity.this.f78686a0, 1), 5);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, SpdyProtocol.L7E_SSSL_1RTT_HTTP2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) WriteFeedbackActivity.this).f66601b.startActivityForResult(ChooseTopicsActivity.c2(((BaseActivity) WriteFeedbackActivity.this).f66601b, WriteFeedbackActivity.this.f78686a0, 1), 5);
        }
    }

    public class h implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f78696a;

        h(String str) {
            this.f78696a = str;
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
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 24713, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f78696a.equals("video")) {
                WriteFeedbackActivity.this.Q = com.max.xiaoheihe.utils.d.p0(strArr);
            } else {
                WriteFeedbackActivity.this.P = com.max.xiaoheihe.utils.d.p0(strArr);
            }
            com.max.xiaoheihe.utils.a0.g().d(WriteFeedbackActivity.f78681p3);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24714, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (WriteFeedbackActivity.this.O != null) {
                com.max.hbcommon.utils.d.b("cqtest", "upload failed ");
                WriteFeedbackActivity.this.O.c();
            }
            com.max.xiaoheihe.utils.a0.g().d(WriteFeedbackActivity.f78681p3);
        }
    }

    public class i extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f78699b;

            a(String str) {
                this.f78699b = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24719, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                WriteFeedbackActivity.c2(WriteFeedbackActivity.this, this.f78699b);
            }
        }

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24715, new Class[0], Void.TYPE).isSupported && WriteFeedbackActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24716, new Class[]{Throwable.class}, Void.TYPE).isSupported && WriteFeedbackActivity.this.isActive()) {
                super.onError(th2);
                if (WriteFeedbackActivity.this.O != null) {
                    WriteFeedbackActivity.this.O.c();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24717, new Class[]{Result.class}, Void.TYPE).isSupported && WriteFeedbackActivity.this.isActive()) {
                com.max.xiaoheihe.utils.v.a(((BaseActivity) WriteFeedbackActivity.this).f66601b, com.max.xiaoheihe.utils.v.f95762c, new a(result.getMsg()));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24718, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    private void A2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24685, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.f66602c.inflate(R.layout.item_topics, (ViewGroup) this.ll_topic, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_topic_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_topic_name);
        imageView.setImageResource(R.drawable.common_add_with_padding_16x16);
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        textView.setText("添加社区");
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        viewInflate.setOnClickListener(new f());
        this.ll_topic.addView(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B2(ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 24694, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        H2(arrayList, "video");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C2(ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 24693, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        H2(arrayList, "bbs");
    }

    private void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24680, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.Q(null, this, new e());
    }

    private void E2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24692, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.O;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        this.etContent.clearFocus();
        if (com.max.hbcommon.utils.c.u(str)) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.feedback_commit_success));
        } else {
            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(str);
        }
        finish();
    }

    private void G2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24687, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.ll_topic.removeAllViews();
        for (BBSTopicObj bBSTopicObj : this.f78686a0) {
            View viewInflate = this.f66602c.inflate(R.layout.item_topics, (ViewGroup) this.ll_topic, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_topic_icon);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_topic_name);
            com.max.hbimage.b.d0(bBSTopicObj.getPic_url(), imageView, ViewUtils.f(this.f66601b, 2.0f));
            textView.setText(bBSTopicObj.getName());
            this.ll_topic.addView(viewInflate);
        }
        if (this.ll_topic.getChildCount() >= 3) {
            ImageView imageView2 = new ImageView(this.f66601b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.f66601b, 20.0f), ViewUtils.f(this.f66601b, 20.0f));
            layoutParams.leftMargin = ViewUtils.f(this.f66601b, 10.0f);
            imageView2.setLayoutParams(layoutParams);
            imageView2.setImageResource(R.drawable.ic_arrow);
            imageView2.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            this.ll_topic.addView(imageView2);
            return;
        }
        View viewInflate2 = this.f66602c.inflate(R.layout.item_topics, (ViewGroup) this.ll_topic, false);
        ImageView imageView3 = (ImageView) viewInflate2.findViewById(R.id.iv_topic_icon);
        TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_topic_name);
        imageView3.setImageResource(R.drawable.common_add_with_padding_16x16);
        imageView3.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        textView2.setText("添加社区");
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        viewInflate2.setOnClickListener(new g());
        this.ll_topic.addView(viewInflate2);
    }

    private void H2(List<String> list, String str) {
        if (PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 24690, new Class[]{List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), list, str, new h(str));
    }

    static /* synthetic */ void R1(WriteFeedbackActivity writeFeedbackActivity) {
        if (PatchProxy.proxy(new Object[]{writeFeedbackActivity}, null, changeQuickRedirect, true, 24695, new Class[]{WriteFeedbackActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeFeedbackActivity.p2();
    }

    static /* synthetic */ void c2(WriteFeedbackActivity writeFeedbackActivity, String str) {
        if (PatchProxy.proxy(new Object[]{writeFeedbackActivity, str}, null, changeQuickRedirect, true, 24700, new Class[]{WriteFeedbackActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        writeFeedbackActivity.E2(str);
    }

    static /* synthetic */ void i2(WriteFeedbackActivity writeFeedbackActivity) {
        if (PatchProxy.proxy(new Object[]{writeFeedbackActivity}, null, changeQuickRedirect, true, 24696, new Class[]{WriteFeedbackActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeFeedbackActivity.C1();
    }

    static /* synthetic */ void j2(WriteFeedbackActivity writeFeedbackActivity) {
        if (PatchProxy.proxy(new Object[]{writeFeedbackActivity}, null, changeQuickRedirect, true, 24697, new Class[]{WriteFeedbackActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeFeedbackActivity.x1();
    }

    static /* synthetic */ void k2(WriteFeedbackActivity writeFeedbackActivity) {
        if (PatchProxy.proxy(new Object[]{writeFeedbackActivity}, null, changeQuickRedirect, true, 24698, new Class[]{WriteFeedbackActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeFeedbackActivity.C1();
    }

    static /* synthetic */ void m2(WriteFeedbackActivity writeFeedbackActivity) {
        if (PatchProxy.proxy(new Object[]{writeFeedbackActivity}, null, changeQuickRedirect, true, 24699, new Class[]{WriteFeedbackActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeFeedbackActivity.o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24691, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("cqtest", " \nimg : " + this.P + "\nvideo : " + this.Q);
        String string = this.etContent.getText().toString();
        WebExtraObj webExtraObj = this.Y;
        String wiki_id = webExtraObj != null ? webExtraObj.getWiki_id() : null;
        WebExtraObj webExtraObj2 = this.Y;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z1(Build.MODEL, string, this.P, this.Q, this.U, this.V, this.W, wiki_id, webExtraObj2 != null ? webExtraObj2.getArticle_id() : null, y2()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24681, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<String> arrayList = this.M;
        int size = (arrayList == null || arrayList.size() <= 0) ? this.N : this.N - this.M.size();
        if (size > 0) {
            com.max.mediaselector.e.h(this, size, 0, true, true, "1".equals(this.X));
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("图片选择已达上限");
        }
    }

    private void p2() {
        int i10;
        boolean z10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24689, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.O;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.O = new LoadingDialog(this.f66601b, getString(R.string.commiting), true).r();
        }
        ArrayList<String> arrayList = this.M;
        if (arrayList == null || arrayList.size() <= 0) {
            this.P = "";
            this.Q = "";
            n2();
            return;
        }
        this.P = "";
        final ArrayList<String> arrayList2 = new ArrayList<>();
        final ArrayList arrayList3 = new ArrayList();
        if ("1".equals(this.X)) {
            for (String str : this.M) {
                String[] strArr = com.max.mediaselector.e.f74752e;
                int length = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        break;
                    } else {
                        if (strArr[i11].equals(com.max.mediaselector.e.a(str))) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                }
                if (z10) {
                    arrayList3.add(str);
                } else {
                    arrayList2.add(str);
                }
            }
        } else {
            arrayList2 = this.M;
        }
        com.max.xiaoheihe.utils.a0.g().k(f78681p3);
        if (com.max.hbcommon.utils.c.w(arrayList3)) {
            i10 = 0;
        } else {
            com.max.xiaoheihe.utils.a0.g().b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.account.r0
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f79177a.B2(arrayList3);
                }
            }, f78681p3);
            i10 = 1;
        }
        if (!com.max.hbcommon.utils.c.w(arrayList2)) {
            com.max.xiaoheihe.utils.a0.g().b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.account.s0
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f79180a.C2(arrayList2);
                }
            }, f78681p3);
            i10++;
        }
        com.max.xiaoheihe.utils.a0.g().b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.account.t0
            @Override // com.max.xiaoheihe.utils.a0.a
            public final void a() {
                this.f79272a.n2();
            }
        }, f78681p3);
        com.max.xiaoheihe.utils.a0.g().o(f78681p3, i10);
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24677, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().a1(this.U).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static Intent r2(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 24673, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) WriteFeedbackActivity.class);
        intent.putExtra(f78684y1, str);
        intent.putExtra(f78680p2, str2);
        intent.putExtra("order_id", str3);
        return intent;
    }

    public static Intent u2(Context context, String str, String str2, String str3, WebExtraObj webExtraObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, webExtraObj}, null, changeQuickRedirect, true, 24674, new Class[]{Context.class, String.class, String.class, String.class, WebExtraObj.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : v2(context, str, str2, str3, webExtraObj, "0");
    }

    public static Intent v2(Context context, String str, String str2, String str3, WebExtraObj webExtraObj, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, webExtraObj, str4}, null, changeQuickRedirect, true, 24675, new Class[]{Context.class, String.class, String.class, String.class, WebExtraObj.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) WriteFeedbackActivity.class);
        intent.putExtra(f78684y1, str);
        intent.putExtra(f78680p2, str2);
        intent.putExtra("order_id", str3);
        intent.putExtra("wiki", webExtraObj);
        intent.putExtra(G2, str4);
        return intent;
    }

    private String x2() {
        StringBuilder sb2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24688, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(this.f78686a0)) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder(Constants.ARRAY_TYPE);
            for (int i10 = 0; i10 < this.f78686a0.size(); i10++) {
                if (i10 != 0) {
                    sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(this.f78686a0.get(i10).getTopic_id());
            }
            sb2.append("]");
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    private String y2() {
        StringBuilder sb2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24686, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(this.f78686a0)) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            for (int i10 = 0; i10 < this.f78686a0.size(); i10++) {
                if (i10 != 0) {
                    sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(this.f78686a0.get(i10).getTopic_id());
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    private void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24679, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.rv_edit_comment_edit_pic.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        this.rv_edit_comment_edit_pic.setLayoutManager(linearLayoutManager);
        com.max.xiaoheihe.module.bbs.adapter.x xVar = new com.max.xiaoheihe.module.bbs.adapter.x(this.f66601b, true);
        this.L = xVar;
        xVar.s(this);
        this.rv_edit_comment_edit_pic.setAdapter(this.L);
        new ItemTouchHelper(new d(12, 3)).attachToRecyclerView(this.rv_edit_comment_edit_pic);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24682, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        D2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24676, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_write_feedback);
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.U = intent.getStringExtra(f78684y1);
            this.V = intent.getStringExtra(f78680p2);
            this.W = intent.getStringExtra("order_id");
            this.Y = (WebExtraObj) getIntent().getSerializableExtra("wiki");
            this.X = intent.getStringExtra(G2);
        }
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle(R.string.feedback_problem);
        this.f66616q.setAction(R.string.commit);
        this.f66616q.setActionOnClickListener(new a());
        this.R = com.max.xiaoheihe.utils.i0.o().isLoginFlag() ? com.max.xiaoheihe.utils.i0.o().getAccount_detail().getUserid() : "-1";
        z2();
        A2();
        ViewGroup viewGroup = this.vg_topic_group;
        WebExtraObj webExtraObj = this.Y;
        viewGroup.setVisibility((webExtraObj == null || !"1".equals(webExtraObj.getChooseTopic())) ? 8 : 0);
        this.ll_topic.setOnClickListener(new b());
        E1();
        q2();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        ArrayList<String> arrayList;
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24683, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && (arrayList = this.M) != null && arrayList.size() > 0 && i10 < this.M.size()) {
            this.M.remove(i10);
            this.L.notifyItemRemoved(i10);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24678, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        q2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24684, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            if (i11 == -1) {
                ArrayList<LocalMedia> arrayListG = com.max.mediaselector.lib.basic.q.g(intent);
                if (arrayListG != null && arrayListG.size() > 0) {
                    for (int i12 = 0; i12 < arrayListG.size(); i12++) {
                        this.M.add(arrayListG.get(i12).G());
                    }
                }
                this.L.r(this.M);
            }
        } else if (i10 == 5 && i11 == -1 && intent != null) {
            this.f78686a0 = (ArrayList) intent.getSerializableExtra("choosed_topics");
            G2();
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }
}
