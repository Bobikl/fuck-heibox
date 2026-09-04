package com.max.xiaoheihe.module.game;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.question.QuestionListObj;
import com.max.hbcommon.bean.question.QuestionObj;
import com.max.hbcommon.component.QuestionView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.game.GameCommentResultObj;
import com.max.xiaoheihe.bean.game.SteamReviewInfo;
import com.max.xiaoheihe.module.expression.widget.HeyBoxEditText;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.Y2)
@ig.d(path = {lb.d.f131150e1})
public class WriteGameCommentImpressionsActivity extends BaseActivity {
    public static final String Z3 = "rating";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final String f85465a4 = "appid";

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final String f85466b4 = "game_impression";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final String f85467c4 = "game_platf";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final int f85468d4 = 1000;
    private String G2;
    private int G3;
    private float J3;
    private String K3;
    private HeyBoxEditText L;
    private String L3;
    private View M;
    private String M3;
    private ImageView N;
    private String N3;
    private TextView O;
    private String O3;
    private View P;
    private String P3;
    private SliceGradeView Q;
    private String Q3;
    private TextView R;
    private String R3;
    private TextView S;
    private TextView T;
    private View U;
    private ImageView V;
    private String V3;
    private ViewGroup W;
    private TextView X;
    private SegmentFilterView Y;
    private QuestionView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private TextView f85469a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f85470b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private LoadingDialog f85471c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f85472p1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private String f85474p3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private LinkInfoObj f85476x2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private String f85478y2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean f85475x1 = false;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private boolean f85477y1 = false;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private long f85473p2 = 0;
    private ArrayList<QuestionObj> S3 = new ArrayList<>();
    private boolean T3 = true;
    private String U3 = "";
    private boolean W3 = false;
    private boolean X3 = false;
    private int Y3 = -1;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35478, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentImpressionsActivity.this.W.setVisibility(8);
            WriteGameCommentImpressionsActivity.m2(WriteGameCommentImpressionsActivity.this);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85480b;

        b(String str) {
            this.f85480b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35479, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Editable text = WriteGameCommentImpressionsActivity.this.L.getText();
            if (text != null) {
                WriteGameCommentImpressionsActivity.this.L.setText(String.format("%s%s", text.toString(), this.f85480b));
            } else {
                WriteGameCommentImpressionsActivity.this.L.setText(this.f85480b);
            }
            WriteGameCommentImpressionsActivity.n2(WriteGameCommentImpressionsActivity.this);
            WriteGameCommentImpressionsActivity.this.W.setVisibility(8);
        }
    }

    public class c implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 35480, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentImpressionsActivity.this.W.setVisibility(0);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35481, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentImpressionsActivity.this.N3 = "2";
            WriteGameCommentImpressionsActivity.this.f85478y2 = "14";
            if (WriteGameCommentImpressionsActivity.this.Q != null && WriteGameCommentImpressionsActivity.this.R != null) {
                WriteGameCommentImpressionsActivity.this.Q.setVisibility(8);
                WriteGameCommentImpressionsActivity.this.Y.setVisibility(8);
                WriteGameCommentImpressionsActivity.this.R.setVisibility(8);
            }
            WriteGameCommentImpressionsActivity.u2(WriteGameCommentImpressionsActivity.this);
            if (WriteGameCommentImpressionsActivity.this.W != null) {
                WriteGameCommentImpressionsActivity.this.W.setVisibility(8);
            }
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35482, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentImpressionsActivity.this.N3 = "1";
            WriteGameCommentImpressionsActivity.this.f85478y2 = "3";
            if (WriteGameCommentImpressionsActivity.this.Q != null && WriteGameCommentImpressionsActivity.this.R != null) {
                WriteGameCommentImpressionsActivity.this.Q.setVisibility(0);
                if (WriteGameCommentImpressionsActivity.this.T3) {
                    WriteGameCommentImpressionsActivity.this.Y.setVisibility(0);
                }
                WriteGameCommentImpressionsActivity.this.R.setVisibility(0);
                WriteGameCommentImpressionsActivity.this.Q.setGrade(5);
            }
            WriteGameCommentImpressionsActivity.u2(WriteGameCommentImpressionsActivity.this);
            if (WriteGameCommentImpressionsActivity.this.f85477y1) {
                return;
            }
            WriteGameCommentImpressionsActivity.j2(WriteGameCommentImpressionsActivity.this);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35483, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity = WriteGameCommentImpressionsActivity.this;
            writeGameCommentImpressionsActivity.f85472p1 = true ^ writeGameCommentImpressionsActivity.f85472p1;
            WriteGameCommentImpressionsActivity.z2(WriteGameCommentImpressionsActivity.this);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<ResultVerifyInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Result f85487b;

            a(Result result) {
                this.f85487b = result;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35488, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                WriteGameCommentImpressionsActivity.E2(WriteGameCommentImpressionsActivity.this, (ResultVerifyInfoObj) this.f85487b.getResult());
            }
        }

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35484, new Class[0], Void.TYPE).isSupported && WriteGameCommentImpressionsActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35485, new Class[]{Throwable.class}, Void.TYPE).isSupported && WriteGameCommentImpressionsActivity.this.isActive()) {
                super.onError(th2);
                if (WriteGameCommentImpressionsActivity.this.f85471c0 != null) {
                    WriteGameCommentImpressionsActivity.this.f85471c0.c();
                }
            }
        }

        public void onNext(Result<ResultVerifyInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35486, new Class[]{Result.class}, Void.TYPE).isSupported && WriteGameCommentImpressionsActivity.this.isActive()) {
                super.onNext(result);
                if (WriteGameCommentImpressionsActivity.this.f85471c0 != null) {
                    WriteGameCommentImpressionsActivity.this.f85471c0.c();
                }
                if (WriteGameCommentImpressionsActivity.this.G2 == null && result.getResult().getLink_id() != null) {
                    WriteGameCommentImpressionsActivity.this.G2 = result.getResult().getLink_id();
                }
                if ((result.getResult() == null || result.getResult().getReply_push_state() == null || !"1".equals(result.getResult().getReply_push_state().getPush_state())) ? false : true) {
                    com.max.xiaoheihe.utils.v.a(((BaseActivity) WriteGameCommentImpressionsActivity.this).f66601b, com.max.xiaoheihe.utils.v.f95760a, new a(result));
                } else {
                    WriteGameCommentImpressionsActivity.E2(WriteGameCommentImpressionsActivity.this, result.getResult());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35487, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ResultVerifyInfoObj>) obj);
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35489, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            WriteGameCommentImpressionsActivity.I2(WriteGameCommentImpressionsActivity.this);
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35490, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) WriteGameCommentImpressionsActivity.this).f66616q.getAppbarActionTextView().performClick();
            dialogInterface.dismiss();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35491, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class k implements androidx.lifecycle.j0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 35477, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public void b(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 35476, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentImpressionsActivity.N1(WriteGameCommentImpressionsActivity.this, num.floatValue());
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35493, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            WriteGameCommentImpressionsActivity.K2(WriteGameCommentImpressionsActivity.this);
        }
    }

    public class m extends com.max.hbcommon.network.d<Result<QuestionListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35494, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            WriteGameCommentImpressionsActivity.L2(WriteGameCommentImpressionsActivity.this);
        }

        public void onNext(Result<QuestionListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35495, new Class[]{Result.class}, Void.TYPE).isSupported && WriteGameCommentImpressionsActivity.this.isActive()) {
                WriteGameCommentImpressionsActivity.this.S3.clear();
                if (result.getResult() == null || com.max.hbcommon.utils.c.w(result.getResult().getQuestion_list())) {
                    WriteGameCommentImpressionsActivity.this.X3 = false;
                    WriteGameCommentImpressionsActivity.this.Y.setVisibility(8);
                    WriteGameCommentImpressionsActivity.this.Y.c(0);
                } else {
                    if ("2".equals(WriteGameCommentImpressionsActivity.this.N3)) {
                        WriteGameCommentImpressionsActivity.this.Y.setVisibility(8);
                        WriteGameCommentImpressionsActivity.this.Y.c(0);
                    } else {
                        WriteGameCommentImpressionsActivity.this.Y.setVisibility(0);
                    }
                    WriteGameCommentImpressionsActivity.this.S3.addAll(result.getResult().getQuestion_list());
                    WriteGameCommentImpressionsActivity.this.Z.setList(WriteGameCommentImpressionsActivity.this.S3);
                    WriteGameCommentImpressionsActivity.this.Z.m();
                }
                WriteGameCommentImpressionsActivity.P2(WriteGameCommentImpressionsActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35496, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<QuestionListObj>) obj);
        }
    }

    public class n extends com.max.hbcommon.network.d<Result<GameCommentResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35497, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            WriteGameCommentImpressionsActivity.Q2(WriteGameCommentImpressionsActivity.this);
        }

        public void onNext(Result<GameCommentResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35498, new Class[]{Result.class}, Void.TYPE).isSupported && WriteGameCommentImpressionsActivity.this.isActive()) {
                WriteGameCommentImpressionsActivity.this.N3 = result.getResult().getComment_state();
                WriteGameCommentImpressionsActivity.this.P3 = result.getResult().getComment_change();
                WriteGameCommentImpressionsActivity.this.L3 = !com.max.hbcommon.utils.c.u(result.getResult().getAppicon()) ? result.getResult().getAppicon() : result.getResult().getImage();
                WriteGameCommentImpressionsActivity.this.M3 = result.getResult().getName();
                WriteGameCommentImpressionsActivity.this.O3 = result.getResult().getFollow_state();
                if ("1".equals(WriteGameCommentImpressionsActivity.this.N3)) {
                    WriteGameCommentImpressionsActivity.this.f85478y2 = "3";
                } else if ("3".equals(WriteGameCommentImpressionsActivity.this.N3)) {
                    WriteGameCommentImpressionsActivity.this.f85478y2 = "24";
                } else {
                    WriteGameCommentImpressionsActivity.this.f85478y2 = "14";
                }
                int iQ = com.max.hbutils.utils.n.q(result.getResult().getImpression_score());
                if (iQ > 0) {
                    WriteGameCommentImpressionsActivity.this.G3 = iQ;
                }
                if (!result.getResult().getExists() || result.getResult().getLink() == null) {
                    WriteGameCommentImpressionsActivity.a3(WriteGameCommentImpressionsActivity.this, null, null);
                } else {
                    WriteGameCommentImpressionsActivity.a3(WriteGameCommentImpressionsActivity.this, result.getResult().getLink(), "1");
                }
                if ("2".equals(WriteGameCommentImpressionsActivity.this.N3)) {
                    WriteGameCommentImpressionsActivity.this.Q.setVisibility(8);
                    WriteGameCommentImpressionsActivity.this.R.setVisibility(8);
                    WriteGameCommentImpressionsActivity.this.J3 = 5.0f;
                }
                if (WriteGameCommentImpressionsActivity.this.T3) {
                    WriteGameCommentImpressionsActivity.e3(WriteGameCommentImpressionsActivity.this);
                } else {
                    WriteGameCommentImpressionsActivity.f3(WriteGameCommentImpressionsActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35499, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameCommentResultObj>) obj);
        }
    }

    public class o extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        public void onNext(Result<UserPostLimitsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35500, new Class[]{Result.class}, Void.TYPE).isSupported && WriteGameCommentImpressionsActivity.this.isActive()) {
                super.onNext(result);
                UserPostLimitsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                if (result2.isCan_post_link()) {
                    ((BaseActivity) WriteGameCommentImpressionsActivity.this).f66616q.getAppbarActionTextView().setEnabled(true);
                    return;
                }
                ((BaseActivity) WriteGameCommentImpressionsActivity.this).f66616q.getAppbarActionTextView().setEnabled(false);
                if (com.max.hbcommon.utils.c.u(result2.getMsg_post_link())) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.d(result2.getMsg_post_link());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35501, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35492, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentImpressionsActivity.this.L.requestFocus();
        }
    }

    public class q implements HeyBoxEditText.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // com.max.xiaoheihe.module.expression.widget.HeyBoxEditText.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35502, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            String string = WriteGameCommentImpressionsActivity.this.L.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                return;
            }
            WriteGameCommentImpressionsActivity.this.L.setText(WriteGameCommentImpressionsActivity.e2(WriteGameCommentImpressionsActivity.this, string));
            WriteGameCommentImpressionsActivity.this.L.setSelection(string.length());
            WriteGameCommentImpressionsActivity.this.L.setMovementMethod(com.max.hbcustomview.spans.f.a());
        }
    }

    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35503, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentImpressionsActivity.this.onBackPressed();
        }
    }

    public class s implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@androidx.annotation.n0 KeyDescObj keyDescObj, int i10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 35504, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 0) {
                WriteGameCommentImpressionsActivity.this.Z.setVisibility(8);
                WriteGameCommentImpressionsActivity.this.L.setVisibility(0);
                WriteGameCommentImpressionsActivity.this.f85469a0.setText("分享真实评价，帮助更多用户做决策");
            } else {
                WriteGameCommentImpressionsActivity.this.X3 = true;
                com.max.xiaoheihe.utils.d.D0(((BaseActivity) WriteGameCommentImpressionsActivity.this).f66601b);
                WriteGameCommentImpressionsActivity.this.Z.setVisibility(0);
                WriteGameCommentImpressionsActivity.this.L.setVisibility(8);
                WriteGameCommentImpressionsActivity.this.f85469a0.setText("分享游戏印象，帮助更多用户了解游戏");
            }
        }
    }

    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35506, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                WriteGameCommentImpressionsActivity.V1(WriteGameCommentImpressionsActivity.this, true, false);
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35507, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                WriteGameCommentImpressionsActivity.V1(WriteGameCommentImpressionsActivity.this, true, true);
            }
        }

        public class c implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35508, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                WriteGameCommentImpressionsActivity.V1(WriteGameCommentImpressionsActivity.this, false, true);
            }
        }

        public class d implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            d() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35509, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                WriteGameCommentImpressionsActivity.V1(WriteGameCommentImpressionsActivity.this, true, true);
            }
        }

        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35505, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - WriteGameCommentImpressionsActivity.this.f85473p2 > 1000) {
                WriteGameCommentImpressionsActivity.this.f85473p2 = jCurrentTimeMillis;
                if (com.max.xiaoheihe.utils.i0.s() && com.max.xiaoheihe.utils.i0.d(((BaseActivity) WriteGameCommentImpressionsActivity.this).f66601b)) {
                    boolean zEquals = "2".equals(WriteGameCommentImpressionsActivity.this.N3);
                    if (!zEquals && WriteGameCommentImpressionsActivity.this.J3 <= 0.0f) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f("请评分");
                        return;
                    }
                    if (!WriteGameCommentImpressionsActivity.this.T3 || zEquals) {
                        if (!com.max.hbcommon.utils.c.u(WriteGameCommentImpressionsActivity.this.L.getText().toString())) {
                            WriteGameCommentImpressionsActivity.V1(WriteGameCommentImpressionsActivity.this, true, false);
                            return;
                        } else {
                            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                            com.max.hbutils.utils.c.f(WriteGameCommentImpressionsActivity.this.getString(R.string.content_empty_msg));
                            return;
                        }
                    }
                    String strW1 = WriteGameCommentImpressionsActivity.W1(WriteGameCommentImpressionsActivity.this);
                    if (!com.max.hbcommon.utils.c.u(WriteGameCommentImpressionsActivity.this.f85474p3)) {
                        if (!com.max.hbcommon.utils.c.u(WriteGameCommentImpressionsActivity.this.L.getText().toString()) || !com.max.hbcommon.utils.c.u(strW1)) {
                            WriteGameCommentImpressionsActivity.V1(WriteGameCommentImpressionsActivity.this, true, !com.max.hbcommon.utils.c.u(strW1));
                            return;
                        } else {
                            com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                            com.max.hbutils.utils.c.f(WriteGameCommentImpressionsActivity.this.getString(R.string.content_empty_msg));
                            return;
                        }
                    }
                    if (WriteGameCommentImpressionsActivity.this.Y.getCurrentIndex() == 0) {
                        if (com.max.hbcommon.utils.c.u(WriteGameCommentImpressionsActivity.this.L.getText().toString())) {
                            com.max.hbutils.utils.c cVar4 = com.max.hbutils.utils.c.f73533a;
                            com.max.hbutils.utils.c.f(WriteGameCommentImpressionsActivity.this.getString(R.string.content_empty_msg));
                            return;
                        } else if (com.max.hbcommon.utils.c.u(strW1)) {
                            WriteGameCommentImpressionsActivity.V1(WriteGameCommentImpressionsActivity.this, true, false);
                            return;
                        } else {
                            new com.max.hbcommon.view.a.f(((BaseActivity) WriteGameCommentImpressionsActivity.this).f66601b).x(R.string.post_game_comment_tips).l("若单独发布游戏评价，请选择“发布当前页”").t(R.string.post_all, new b()).n(R.string.post_select, new a()).F();
                            return;
                        }
                    }
                    if (com.max.hbcommon.utils.c.u(strW1)) {
                        com.max.hbutils.utils.c cVar5 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f("至少选择一个游戏印象");
                    } else if (com.max.hbcommon.utils.c.u(WriteGameCommentImpressionsActivity.this.L.getText().toString())) {
                        WriteGameCommentImpressionsActivity.V1(WriteGameCommentImpressionsActivity.this, false, true);
                    } else {
                        new com.max.hbcommon.view.a.f(((BaseActivity) WriteGameCommentImpressionsActivity.this).f66601b).x(R.string.post_game_comment_tips).l("若单独发布游戏印象，请选择“发布当前页”").t(R.string.post_all, new d()).n(R.string.post_select, new c()).F();
                    }
                }
            }
        }
    }

    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35510, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) WriteGameCommentImpressionsActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131052u2);
            intent.putExtra("title", WriteGameCommentImpressionsActivity.this.getString(R.string.ratting_role));
            ((BaseActivity) WriteGameCommentImpressionsActivity.this).f66601b.startActivity(intent);
        }
    }

    public class v extends com.max.hbcommon.network.d<Result<SteamReviewInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        public void onNext(@androidx.annotation.n0 Result<SteamReviewInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35511, new Class[]{Result.class}, Void.TYPE).isSupported || result.getResult() == null || com.max.hbcommon.utils.c.u(result.getResult().getSteam_review())) {
                return;
            }
            WriteGameCommentImpressionsActivity.this.V3 = result.getResult().getSteam_review();
            WriteGameCommentImpressionsActivity.i2(WriteGameCommentImpressionsActivity.this, result.getResult().getSteam_review().replaceAll(WriteGameCommentImpressionsActivity.this.U3, ""));
            if ("1".equals(WriteGameCommentImpressionsActivity.this.N3)) {
                WriteGameCommentImpressionsActivity.j2(WriteGameCommentImpressionsActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(@androidx.annotation.n0 Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35512, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamReviewInfo>) obj);
        }
    }

    public class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35513, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.m0(((BaseActivity) WriteGameCommentImpressionsActivity.this).f66601b, com.max.xiaoheihe.utils.d.n0(R.string.help), lb.a.T1);
        }
    }

    private String A3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35444, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<max_tag_img> url=" + str + "</max_tag_img>";
    }

    private void B3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35452, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v4(this.K3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    private String C3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35442, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : M1();
    }

    private void D3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35453, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b6(new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    static /* synthetic */ void E2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity, ResultVerifyInfoObj resultVerifyInfoObj) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity, resultVerifyInfoObj}, null, changeQuickRedirect, true, 35466, new Class[]{WriteGameCommentImpressionsActivity.class, ResultVerifyInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.X3(resultVerifyInfoObj);
    }

    private void F3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35451, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O7(this.K3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    static /* synthetic */ void G2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35467, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    private String G3(String str) {
        return str;
    }

    private String H3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35446, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<max_tag_url>" + str + "</max_tag_url>";
    }

    static /* synthetic */ void I2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35468, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    private String I3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35445, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<max_tag_video> url=" + str + "</max_tag_video>";
    }

    static /* synthetic */ void K2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35469, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    private void K3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35425, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.K3 = getIntent().getStringExtra("appid");
        this.Q3 = getIntent().getStringExtra("game_platf");
        this.G3 = getIntent().getIntExtra("rating", 0);
    }

    static /* synthetic */ void L2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35470, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.C1();
    }

    private void L3(LinkInfoObj linkInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, str}, this, changeQuickRedirect, false, 35427, new Class[]{LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f85476x2 = linkInfoObj;
        this.f85474p3 = str;
        this.f66616q.setTitle(getString(R.string.edit_comments));
        this.f66616q.getAppbarActionTextView().setText(getString(R.string.post));
        this.f66616q.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
        LinkInfoObj linkInfoObj2 = this.f85476x2;
        if (linkInfoObj2 != null) {
            SpannableStringBuilder spannableStringBuilderV3 = V3(O3(linkInfoObj2));
            this.R3 = spannableStringBuilderV3.toString();
            this.L.setText(spannableStringBuilderV3);
            this.L.setSelection(spannableStringBuilderV3.length());
            this.L.setMovementMethod(com.max.hbcustomview.spans.f.a());
            this.G2 = this.f85476x2.getLinkid();
            S3(com.max.hbutils.utils.n.p(this.f85476x2.getScore()));
            P3();
        }
    }

    private String M1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35443, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = this.L.getText().toString();
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "text");
        jsonObject.addProperty("text", string);
        jsonArray.add(jsonObject);
        return jsonArray.toString();
    }

    private void M3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35433, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().m9(this.K3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d()));
    }

    static /* synthetic */ void N1(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity, float f10) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity, new Float(f10)}, null, changeQuickRedirect, true, 35456, new Class[]{WriteGameCommentImpressionsActivity.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.S3(f10);
    }

    private void N3(String str) {
        ViewGroup viewGroup;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35430, new Class[]{String.class}, Void.TYPE).isSupported || (viewGroup = this.W) == null || this.X == null) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.tv_cancel);
        View viewFindViewById2 = this.W.findViewById(R.id.tv_import);
        View viewFindViewById3 = this.W.findViewById(R.id.vg_import_rule);
        if (viewFindViewById == null || viewFindViewById2 == null || viewFindViewById3 == null) {
            return;
        }
        this.X.setText(str);
        viewFindViewById3.setOnClickListener(new w());
        viewFindViewById.setOnClickListener(new a());
        viewFindViewById2.setOnClickListener(new b(str));
        this.f85475x1 = true;
    }

    private String O3(LinkInfoObj linkInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 35448, new Class[]{LinkInfoObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = "";
        if (linkInfoObj == null) {
            return "";
        }
        if (!"1".equals(linkInfoObj.getIs_web()) || com.max.hbcommon.utils.c.u(linkInfoObj.getText()) || !linkInfoObj.getText().startsWith(Constants.ARRAY_TYPE) || !linkInfoObj.getText().endsWith("]")) {
            return ("3".equals(linkInfoObj.getLink_tag()) || "24".equals(linkInfoObj.getLink_tag()) || "14".equals(linkInfoObj.getLink_tag())) ? linkInfoObj.getDescription() : linkInfoObj.getText();
        }
        List<BBSTextObj> listB = com.max.hbutils.utils.k.b(linkInfoObj.getText(), BBSTextObj.class);
        if (listB == null || listB.size() <= 0) {
            return "";
        }
        for (BBSTextObj bBSTextObj : listB) {
            if (bBSTextObj.getType().equals(SocialConstants.PARAM_IMG_URL)) {
                str = str + A3(bBSTextObj.getUrl());
            } else if (bBSTextObj.getType().equals("video")) {
                str = str + I3(bBSTextObj.getUrl());
            } else if (bBSTextObj.getType().equals("url")) {
                str = str + H3(bBSTextObj.getText());
            } else {
                str = str + G3(bBSTextObj.getText());
            }
        }
        return str;
    }

    static /* synthetic */ void P2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35471, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.x1();
    }

    private void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35436, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("0".equals(this.P3)) {
            this.S.setVisibility(8);
            this.T.setVisibility(8);
            if (!this.T3) {
                if ("1".equals(this.N3)) {
                    this.T.setVisibility(0);
                } else {
                    this.S.setVisibility(0);
                }
            }
            Q3();
            return;
        }
        if (this.T3) {
            this.S.setVisibility(8);
            this.T.setVisibility(8);
        } else {
            this.S.setVisibility(0);
            this.T.setVisibility(0);
        }
        Q3();
        this.S.setOnClickListener(new d());
        this.T.setOnClickListener(new e());
    }

    static /* synthetic */ void Q2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35472, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.C1();
    }

    private void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35438, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("1".equals(this.N3)) {
            this.U.setVisibility(8);
            this.Q.setVisibility(0);
            this.R.setVisibility(0);
            this.J3 = this.Q.getGrade();
            this.T.setTextColor(this.f66601b.getResources().getColor(R.color.white));
            this.T.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_primary_2dp));
            this.S.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
            this.S.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_divider_concept_2dp));
            return;
        }
        if ("3".equals(this.N3)) {
            this.U.setVisibility(8);
            this.Q.setVisibility(0);
            this.R.setVisibility(0);
            this.J3 = this.Q.getGrade();
            this.T.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
            this.T.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_divider_concept_2dp));
            this.S.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
            this.S.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_divider_concept_2dp));
            return;
        }
        this.U.setVisibility(0);
        this.U.setOnClickListener(new f());
        this.Q.setVisibility(8);
        this.R.setVisibility(8);
        this.S.setTextColor(this.f66601b.getResources().getColor(R.color.white));
        this.S.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_primary_2dp));
        this.T.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
        this.T.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_divider_concept_2dp));
    }

    private void R3(LinkInfoObj linkInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, str}, this, changeQuickRedirect, false, 35426, new Class[]{LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String str2 = this.N3;
        if (str2 == null || "0".equals(str2)) {
            this.N3 = "1";
            this.P3 = "1";
        }
        String str3 = this.O3;
        if (str3 != null) {
            if ("unfollowing".equals(str3)) {
                this.f85472p1 = false;
            } else {
                this.f85472p1 = true;
            }
        }
        Y3();
        this.M.setVisibility(0);
        if (com.max.hbcommon.utils.c.u(this.L3)) {
            this.N.setVisibility(8);
        } else {
            com.max.hbimage.b.d0(this.L3, this.N, 2);
            this.N.setVisibility(0);
        }
        this.O.setText(this.M3);
        if (linkInfoObj != null && "1".equals(str)) {
            L3(linkInfoObj, str);
            return;
        }
        r3();
        this.f66616q.setTitle(getString(R.string.add_comment));
        this.f66616q.getAppbarActionTextView().setText(getString(R.string.post));
        this.f66616q.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
        S3(this.G3);
        P3();
    }

    private void S3(float f10) {
        String string;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 35435, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if ("2".equals(this.N3)) {
            SliceGradeView sliceGradeView = this.Q;
            if (sliceGradeView != null) {
                sliceGradeView.setVisibility(8);
                return;
            }
            return;
        }
        this.J3 = f10;
        SliceGradeView sliceGradeView2 = this.Q;
        if (sliceGradeView2 == null) {
            return;
        }
        sliceGradeView2.setGrade((int) f10);
        this.Q.setEnableSlide(true);
        if (f10 >= 5.0f) {
            string = getString(R.string.rating_detail_10);
        } else if (f10 >= 4.5f) {
            string = getString(R.string.rating_detail_9);
        } else if (f10 >= 4.0f) {
            string = getString(R.string.rating_detail_8);
        } else if (f10 >= 3.5f) {
            string = getString(R.string.rating_detail_7);
        } else if (f10 >= 2.5f) {
            string = getString(R.string.rating_detail_6and5);
        } else if (f10 >= 1.5f) {
            string = getString(R.string.rating_detail_4and3);
        } else {
            string = f10 > 0.0f ? getString(R.string.rating_detail_2and1) : getString(R.string.rating_detail_no_check);
        }
        this.R.setText(string);
        if (f10 > 0.0f) {
            this.Q.setMinGrade(1);
        }
    }

    @SuppressLint({"CheckResult"})
    private void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35431, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().c2(this.K3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d());
    }

    private void U3() {
        ViewGroup viewGroup;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35432, new Class[0], Void.TYPE).isSupported || (viewGroup = this.W) == null || this.X == null || !this.f85475x1) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.tv_cancel);
        View viewFindViewById2 = this.W.findViewById(R.id.tv_import);
        View viewFindViewById3 = this.W.findViewById(R.id.vg_import_rule);
        if (viewFindViewById == null || viewFindViewById2 == null || viewFindViewById3 == null) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f66601b, R.anim.activity_bottom_in);
        animationLoadAnimation.setAnimationListener(new c());
        this.W.startAnimation(animationLoadAnimation);
        this.W.setVisibility(0);
        this.f85477y1 = true;
    }

    static /* synthetic */ void V1(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity, boolean z10, boolean z11) {
        Object[] objArr = {writeGameCommentImpressionsActivity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 35458, new Class[]{WriteGameCommentImpressionsActivity.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.u3(z10, z11);
    }

    private SpannableStringBuilder V3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35449, new Class[]{String.class}, SpannableStringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableStringBuilder) patchProxyResultProxy.result;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (com.max.hbcommon.utils.c.u(str)) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    static /* synthetic */ String W1(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35459, new Class[]{WriteGameCommentImpressionsActivity.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : writeGameCommentImpressionsActivity.w3();
    }

    private void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35434, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f85472p1 ? "following" : "unfollowing";
        if (str.equals("following") && !com.max.xiaoheihe.utils.d.N0(this.f66601b)) {
            com.max.xiaoheihe.utils.v.i(this.f66601b, this.f66602c);
        }
        io.reactivex.z<Result> zVarCb = null;
        if ("unfollowing".equalsIgnoreCase(str)) {
            zVarCb = com.max.xiaoheihe.network.i.a().x3(this.K3);
        } else if ("following".equalsIgnoreCase(str)) {
            zVarCb = com.max.xiaoheihe.network.i.a().cb(this.K3);
            com.max.hbcache.c.C(com.max.hbcache.c.U, String.valueOf(System.currentTimeMillis()));
        }
        if (zVarCb != null) {
            V((io.reactivex.disposables.b) zVarCb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q()));
        }
    }

    private void X3(ResultVerifyInfoObj resultVerifyInfoObj) {
        if (PatchProxy.proxy(new Object[]{resultVerifyInfoObj}, this, changeQuickRedirect, false, 35441, new Class[]{ResultVerifyInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66601b.sendBroadcast(new Intent().setAction("com.heybox.refresh.topic"));
        this.f66601b.sendBroadcast(new Intent().setAction(lb.a.f131043t));
        this.f66601b.sendBroadcast(new Intent().setAction("com.max.xiaoheihe.post.gotop"));
        this.f66601b.sendBroadcast(new Intent(lb.a.W));
        Intent intent = new Intent();
        LinkInfoObj linkInfoObj = new LinkInfoObj();
        linkInfoObj.setScore(String.format(Locale.US, "%.0f", Float.valueOf(this.J3)));
        linkInfoObj.setDescription(this.L.getText().toString());
        linkInfoObj.setLinkid(this.G2);
        linkInfoObj.setLink_tag(this.f85478y2);
        intent.putExtra("comment", linkInfoObj);
        Activity activity = this.f66601b;
        GameCommentSuccessActivity.a aVar = GameCommentSuccessActivity.R;
        String str = this.K3;
        int i10 = this.Y3;
        activity.startActivity(aVar.a(activity, resultVerifyInfoObj, linkInfoObj, str, i10 > 0 ? String.valueOf(i10) : null));
        this.f66601b.setResult(-1, intent);
        this.f66601b.finish();
    }

    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35437, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f85472p1) {
            this.V.setImageResource(R.drawable.common_select_single_filled_16x16);
        } else {
            this.V.setImageResource(R.drawable.common_select_line_16x16);
        }
    }

    static /* synthetic */ void a3(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity, LinkInfoObj linkInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity, linkInfoObj, str}, null, changeQuickRedirect, true, 35473, new Class[]{WriteGameCommentImpressionsActivity.class, LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.R3(linkInfoObj, str);
    }

    static /* synthetic */ SpannableStringBuilder e2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity, str}, null, changeQuickRedirect, true, 35457, new Class[]{WriteGameCommentImpressionsActivity.class, String.class}, SpannableStringBuilder.class);
        return patchProxyResultProxy.isSupported ? (SpannableStringBuilder) patchProxyResultProxy.result : writeGameCommentImpressionsActivity.V3(str);
    }

    static /* synthetic */ void e3(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35474, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.F3();
    }

    static /* synthetic */ void f3(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35475, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.x1();
    }

    static /* synthetic */ void i2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity, String str) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity, str}, null, changeQuickRedirect, true, 35460, new Class[]{WriteGameCommentImpressionsActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.N3(str);
    }

    static /* synthetic */ void j2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35461, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.U3();
    }

    static /* synthetic */ void m2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35462, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.M3();
    }

    static /* synthetic */ void n2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35463, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.T3();
    }

    private void r3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35429, new Class[0], Void.TYPE).isSupported || "ps4".equals(this.Q3) || "switch".equals(this.Q3) || "xbox".equals(this.Q3)) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w(this.K3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new v()));
    }

    private void s3(boolean z10, boolean z11, String str, String str2) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35440, new Class[]{cls, cls, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strC3 = z10 ? C3() : null;
        String strW3 = z11 ? w3() : null;
        this.W3 = z10;
        if (z10 && z11) {
            this.Y3 = 1;
        } else if (z10) {
            this.Y3 = 2;
        } else {
            this.Y3 = 3;
        }
        HashMap map = new HashMap();
        new HashMap(16);
        String str3 = "2".equals(this.N3) ? String.format(Locale.US, "%.0f", Float.valueOf(5.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(this.J3));
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            map.put("Cookie", str2);
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().la(map, null, strC3, strW3, this.Y3, this.f85478y2, null, null, null, null, this.f85474p3, this.G2, this.K3, str3, str, null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void t3(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35439, new Class[]{cls, cls}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.g(this.f66601b)) {
            this.f85471c0 = new LoadingDialog(this.f66601b, getString(R.string.commiting), false).r();
            s3(z10, z11, null, null);
        }
    }

    static /* synthetic */ void u2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35464, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.Q3();
    }

    private void u3(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35424, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        t3(z10, z11);
        if ("14".equals(this.f85478y2) && this.f85472p1) {
            W3();
        }
    }

    private String w3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35428, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(this.S3)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        for (QuestionObj questionObj : this.S3) {
            if (!com.max.hbcommon.utils.c.u(questionObj.getSelected())) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("q_id", (Object) questionObj.getQ_id());
                jSONObject2.put("q_version", (Object) questionObj.getQ_version());
                jSONObject2.put("o_id", (Object) questionObj.getSelected());
                arrayList.add(jSONObject2);
            }
        }
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            return null;
        }
        jSONObject.put("selected", (Object) arrayList);
        return com.max.hbutils.utils.k.p(jSONObject);
    }

    private String y3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35447, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<max_tag_game> url=" + str + "</max_tag_game>";
    }

    static /* synthetic */ void z2(WriteGameCommentImpressionsActivity writeGameCommentImpressionsActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentImpressionsActivity}, null, changeQuickRedirect, true, 35465, new Class[]{WriteGameCommentImpressionsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentImpressionsActivity.Y3();
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35454, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.K3);
        jsonObject.addProperty("has_visit_impression", Integer.valueOf(this.X3 ? 1 : 0));
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35422, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_write_game_comment_impressions);
        this.L = (HeyBoxEditText) findViewById(R.id.et_content);
        this.M = findViewById(R.id.vg_game_rating);
        this.N = (ImageView) findViewById(R.id.iv_game_logo);
        this.O = (TextView) findViewById(R.id.tv_game_name);
        this.P = findViewById(R.id.tv_ratting_role_faq);
        this.Q = (SliceGradeView) findViewById(R.id.sgv);
        this.U = findViewById(R.id.vg_follow_game);
        this.V = (ImageView) findViewById(R.id.iv_follow_game);
        this.R = (TextView) findViewById(R.id.tv_game_rating_detail);
        this.S = (TextView) findViewById(R.id.tv_want_to_play);
        this.T = (TextView) findViewById(R.id.tv_played);
        this.Y = (SegmentFilterView) findViewById(R.id.filter_tab);
        this.Z = (QuestionView) findViewById(R.id.question_view);
        this.f85469a0 = (TextView) findViewById(R.id.tv_tips);
        this.Q.setMinGrade(0);
        this.U3 = "\n——来自" + com.max.xiaoheihe.utils.d.A() + "用户" + com.max.xiaoheihe.utils.i0.k() + "的评价";
        this.Q.getGradeLD().k(this, new k());
        this.L.setOnClickListener(new p());
        this.L.setContextMenuItemSelectedListener(new q());
        this.W = (ViewGroup) findViewById(R.id.vg_import_from_steam);
        this.X = (TextView) findViewById(R.id.tv_steam_comment);
        if (com.max.xiaoheihe.utils.i0.s()) {
            this.f85470b0 = com.max.xiaoheihe.utils.i0.i().getAccount_detail().getUserid();
        }
        this.f66616q.getAppbarActionTextView().setVisibility(0);
        this.f66617r.setVisibility(0);
        SpannableString spannableString = new SpannableString("\u200e从多个角度评价游戏，可以帮助更多玩家");
        Drawable drawableMutate = getResources().getDrawable(R.drawable.common_write_line_24x24).getConstantState().newDrawable().mutate();
        drawableMutate.setColorFilter(getResources().getColor(R.color.text_secondary_2_color), PorterDuff.Mode.SRC_IN);
        drawableMutate.setBounds(0, 0, ViewUtils.f(this.f66601b, 16.0f), ViewUtils.f(this.f66601b, 16.0f));
        spannableString.setSpan(new com.max.hbcustomview.spans.b(drawableMutate, 2, 0, ViewUtils.f(this.f66601b, 6.0f)), 0, 1, 33);
        this.L.setHint(spannableString);
        K3();
        this.f66616q.getAppbarNavButtonView().setOnClickListener(new r());
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setText(com.max.xiaoheihe.utils.d.n0(R.string.game_comments));
        keyDescObj.setKey("comment");
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setText("游戏印象");
        keyDescObj2.setKey("question");
        arrayList.add(keyDescObj2);
        this.Y.setData(arrayList);
        this.Y.setMOnTabCheckedListener(new s());
        this.Y.d();
        if (this.T3 && !"2".equals(this.N3) && getIntent().getBooleanExtra("game_impression", false)) {
            this.Y.c(1);
            com.max.hbcache.c.C(com.max.hbcache.c.f66129j0, "0");
        } else {
            this.Y.c(0);
        }
        this.Y.setVisibility(8);
        n1();
        if (com.max.xiaoheihe.utils.i0.s()) {
            D3();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35455, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        E1();
        B3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35450, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.L.getText().toString())) {
            super.onBackPressed();
            return;
        }
        if (!"1".equals(this.f85474p3)) {
            new com.max.hbcommon.view.a.f(this.f66601b).y("返回则输入内容不会保存").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new l()).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new j()).F();
        } else if (this.L.getText().toString().equals(this.R3)) {
            G2(this);
        } else {
            new com.max.hbcommon.view.a.f(this.f66601b).y("是否发布此次编辑?").u("发布", new i()).o("不发布", new h()).F();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35423, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setActionOnClickListener(new t());
        this.P.setOnClickListener(new u());
    }
}
