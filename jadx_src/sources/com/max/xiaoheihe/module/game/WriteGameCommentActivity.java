package com.max.xiaoheihe.module.game;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.game.GameCommentDimensionObj;
import com.max.xiaoheihe.bean.game.GameCommentResultObj;
import com.max.xiaoheihe.bean.game.MultiDimensionListResult;
import com.max.xiaoheihe.bean.game.PostMultiDimensionObj;
import com.max.xiaoheihe.bean.game.SteamReviewInfo;
import com.max.xiaoheihe.module.expression.widget.HeyBoxEditText;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import df.j3;
import df.jk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.Y2)
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.q.class}, path = {lb.d.f131143d1, lb.d.Y2})
public class WriteGameCommentActivity extends BaseActivity {
    public static final String M3 = "rating";
    public static final String N3 = "appid";
    public static final String O3 = "game_impression";
    public static final String P3 = "game_platf";
    public static final int Q3 = 2;
    public static final int R3 = 1000;
    private static final int S3 = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.hbcommon.base.adapter.s<GameCommentDimensionObj> G3;
    private long J3;
    private boolean K3;
    private String L;
    private LoadingDialog M;
    private boolean N;
    private LinkInfoObj R;
    private String S;
    private String T;
    private String U;
    private int V;
    private float W;
    private String X;
    private String Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f85415a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f85416b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f85417c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f85418p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private String f85419p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private String f85421x1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private j3 f85424y2;
    private boolean O = false;
    private boolean P = false;
    private long Q = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private String f85423y1 = "";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f85422x2 = false;
    private ArrayList<GameCommentDimensionObj> G2 = new ArrayList<>();

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private HashMap<String, PostMultiDimensionObj> f85420p3 = new HashMap<>();
    private b0 L3 = new b0(this);

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35378, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentActivity.this.f85424y2.f111996v.setVisibility(8);
            WriteGameCommentActivity.e2(WriteGameCommentActivity.this);
        }
    }

    public class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35420, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.m0(((BaseActivity) WriteGameCommentActivity.this).f66601b, com.max.xiaoheihe.utils.d.n0(R.string.help), lb.a.T1);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85427b;

        b(String str) {
            this.f85427b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35379, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Editable text = WriteGameCommentActivity.this.f85424y2.f111976b.getText();
            if (text != null) {
                WriteGameCommentActivity.this.f85424y2.f111976b.setText(String.format("%s%s", text.toString(), this.f85427b));
            } else {
                WriteGameCommentActivity.this.f85424y2.f111976b.setText(this.f85427b);
            }
            WriteGameCommentActivity.f2(WriteGameCommentActivity.this);
            WriteGameCommentActivity.this.f85424y2.f111996v.setVisibility(8);
        }
    }

    public static class b0 extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<WriteGameCommentActivity> f85429a;

        public b0(WriteGameCommentActivity writeGameCommentActivity) {
            this.f85429a = new WeakReference<>(writeGameCommentActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 35421, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            WriteGameCommentActivity writeGameCommentActivity = this.f85429a.get();
            if (writeGameCommentActivity == null || !writeGameCommentActivity.isActive()) {
                return;
            }
            WriteGameCommentActivity.V2(writeGameCommentActivity);
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
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 35380, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentActivity.this.f85424y2.f111996v.setVisibility(0);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35381, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentActivity.this.f85415a0 = "2";
            WriteGameCommentActivity.this.S = "14";
            if (WriteGameCommentActivity.this.f85424y2.f111982h != null && WriteGameCommentActivity.this.f85424y2.f111985k != null) {
                WriteGameCommentActivity.this.f85424y2.f111982h.setVisibility(8);
                WriteGameCommentActivity.this.f85424y2.f111985k.setVisibility(8);
            }
            WriteGameCommentActivity.i2(WriteGameCommentActivity.this);
            if (WriteGameCommentActivity.this.f85424y2.f111996v != null) {
                WriteGameCommentActivity.this.f85424y2.f111996v.setVisibility(8);
            }
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35382, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentActivity.this.f85415a0 = "1";
            WriteGameCommentActivity.this.S = "3";
            if (WriteGameCommentActivity.this.f85424y2.f111982h != null && WriteGameCommentActivity.this.f85424y2.f111985k != null) {
                WriteGameCommentActivity.this.f85424y2.f111982h.setVisibility(0);
                WriteGameCommentActivity.this.f85424y2.f111985k.setVisibility(0);
                WriteGameCommentActivity.this.f85424y2.f111982h.setGrade(5);
            }
            WriteGameCommentActivity.i2(WriteGameCommentActivity.this);
            if (WriteGameCommentActivity.this.P) {
                return;
            }
            WriteGameCommentActivity.a2(WriteGameCommentActivity.this);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35383, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentActivity writeGameCommentActivity = WriteGameCommentActivity.this;
            writeGameCommentActivity.N = true ^ writeGameCommentActivity.N;
            WriteGameCommentActivity.m2(WriteGameCommentActivity.this);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<ResultVerifyInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Result f85435b;

            a(Result result) {
                this.f85435b = result;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35388, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                WriteGameCommentActivity.u2(WriteGameCommentActivity.this, (ResultVerifyInfoObj) this.f85435b.getResult());
            }
        }

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35384, new Class[0], Void.TYPE).isSupported && WriteGameCommentActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35385, new Class[]{Throwable.class}, Void.TYPE).isSupported && WriteGameCommentActivity.this.isActive()) {
                super.onError(th2);
                if (WriteGameCommentActivity.this.M != null) {
                    WriteGameCommentActivity.this.M.c();
                }
            }
        }

        public void onNext(Result<ResultVerifyInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35386, new Class[]{Result.class}, Void.TYPE).isSupported && WriteGameCommentActivity.this.isActive()) {
                super.onNext(result);
                if (WriteGameCommentActivity.this.M != null) {
                    WriteGameCommentActivity.this.M.c();
                }
                if (WriteGameCommentActivity.this.T == null && result.getResult().getLink_id() != null) {
                    WriteGameCommentActivity.this.T = result.getResult().getLink_id();
                }
                if ((result.getResult() == null || result.getResult().getReply_push_state() == null || !"1".equals(result.getResult().getReply_push_state().getPush_state())) ? false : true) {
                    com.max.xiaoheihe.utils.v.a(((BaseActivity) WriteGameCommentActivity.this).f66601b, com.max.xiaoheihe.utils.v.f95760a, new a(result));
                } else {
                    WriteGameCommentActivity.u2(WriteGameCommentActivity.this, result.getResult());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35387, new Class[]{Object.class}, Void.TYPE).isSupported) {
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
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35389, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            WriteGameCommentActivity.x2(WriteGameCommentActivity.this);
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35390, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) WriteGameCommentActivity.this).f66616q.getAppbarActionTextView().performClick();
            dialogInterface.dismiss();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35391, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
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
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 35377, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public void b(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 35376, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentActivity.N1(WriteGameCommentActivity.this, num.floatValue());
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35393, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            WriteGameCommentActivity.z2(WriteGameCommentActivity.this);
        }
    }

    public class m extends com.max.hbcommon.network.d<Result<MultiDimensionListResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35394, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            WriteGameCommentActivity.A2(WriteGameCommentActivity.this);
        }

        public void onNext(Result<MultiDimensionListResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35395, new Class[]{Result.class}, Void.TYPE).isSupported && WriteGameCommentActivity.this.isActive()) {
                if (result.getResult() != null) {
                    WriteGameCommentActivity.this.G2.clear();
                    if (!com.max.hbcommon.utils.c.w(result.getResult().getDimension_list())) {
                        WriteGameCommentActivity.this.G2.addAll(result.getResult().getDimension_list());
                    }
                    if (!com.max.hbcommon.utils.c.w(WriteGameCommentActivity.this.G2) && WriteGameCommentActivity.this.f85420p3.size() > 0) {
                        for (GameCommentDimensionObj gameCommentDimensionObj : WriteGameCommentActivity.this.G2) {
                            PostMultiDimensionObj postMultiDimensionObj = (PostMultiDimensionObj) WriteGameCommentActivity.this.f85420p3.get(gameCommentDimensionObj.getDimension_id());
                            if (postMultiDimensionObj != null) {
                                gameCommentDimensionObj.getDefault_label_map().put(postMultiDimensionObj.getUser_star(), postMultiDimensionObj.getUser_label());
                            }
                        }
                    }
                }
                WriteGameCommentActivity.C2(WriteGameCommentActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35396, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MultiDimensionListResult>) obj);
        }
    }

    public class n extends com.max.hbcommon.network.d<Result<GameCommentResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35397, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            WriteGameCommentActivity.D2(WriteGameCommentActivity.this);
        }

        public void onNext(Result<GameCommentResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35398, new Class[]{Result.class}, Void.TYPE).isSupported && WriteGameCommentActivity.this.isActive()) {
                WriteGameCommentActivity.this.f85415a0 = result.getResult().getComment_state();
                WriteGameCommentActivity.this.f85417c0 = result.getResult().getComment_change();
                WriteGameCommentActivity.this.Y = !com.max.hbcommon.utils.c.u(result.getResult().getAppicon()) ? result.getResult().getAppicon() : result.getResult().getImage();
                WriteGameCommentActivity.this.Z = result.getResult().getName();
                WriteGameCommentActivity.this.f85416b0 = result.getResult().getFollow_state();
                if ("1".equals(WriteGameCommentActivity.this.f85415a0)) {
                    WriteGameCommentActivity.this.S = "3";
                } else if ("3".equals(WriteGameCommentActivity.this.f85415a0)) {
                    WriteGameCommentActivity.this.S = "24";
                } else {
                    WriteGameCommentActivity.this.S = "14";
                }
                int iQ = com.max.hbutils.utils.n.q(result.getResult().getImpression_score());
                if (iQ > 0) {
                    WriteGameCommentActivity.this.V = iQ;
                }
                if (!result.getResult().getExists() || result.getResult().getLink() == null) {
                    WriteGameCommentActivity.O2(WriteGameCommentActivity.this, null, null);
                } else {
                    WriteGameCommentActivity.O2(WriteGameCommentActivity.this, result.getResult().getLink(), "1");
                }
                if ("2".equals(WriteGameCommentActivity.this.f85415a0)) {
                    WriteGameCommentActivity.this.f85424y2.f111982h.setVisibility(8);
                    WriteGameCommentActivity.this.f85424y2.f111985k.setVisibility(8);
                    WriteGameCommentActivity.this.W = 5.0f;
                }
                if (result.getResult().getMultidimensional_score() != null && result.getResult().getMultidimensional_score().size() > 0) {
                    for (String str : result.getResult().getMultidimensional_score().keySet()) {
                        WriteGameCommentActivity.this.f85420p3.put(str, result.getResult().getMultidimensional_score().get(str));
                    }
                }
                WriteGameCommentActivity.P2(WriteGameCommentActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35399, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameCommentResultObj>) obj);
        }
    }

    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35400, new Class[]{View.class}, Void.TYPE).isSupported && System.currentTimeMillis() - WriteGameCommentActivity.this.J3 >= 500) {
                WriteGameCommentActivity.this.J3 = System.currentTimeMillis();
                if (WriteGameCommentActivity.this.f85424y2.f111981g.getVisibility() == 0) {
                    WriteGameCommentActivity.c2(WriteGameCommentActivity.this, false);
                    WriteGameCommentActivity.this.f85424y2.f111977c.setRotation(180.0f);
                } else {
                    WriteGameCommentActivity.c2(WriteGameCommentActivity.this, true);
                    WriteGameCommentActivity.this.f85424y2.f111977c.setRotation(0.0f);
                }
            }
        }
    }

    public class p extends com.max.hbcommon.base.adapter.s<GameCommentDimensionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements androidx.lifecycle.j0<Integer> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ jk f85446a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameCommentDimensionObj f85447b;

            a(jk jkVar, GameCommentDimensionObj gameCommentDimensionObj) {
                this.f85446a = jkVar;
                this.f85447b = gameCommentDimensionObj;
            }

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(Integer num) {
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 35404, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(num);
            }

            public void b(Integer num) {
                String str;
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 35403, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f85446a.f112212d.setGrade(num.intValue());
                if (num.intValue() > 0) {
                    WriteGameCommentActivity.this.K3 = true;
                    this.f85446a.f112212d.setMinGrade(1);
                    this.f85446a.f112211c.setVisibility(0);
                    this.f85446a.f112210b.setEnabled(true);
                    PostMultiDimensionObj postMultiDimensionObj = (PostMultiDimensionObj) WriteGameCommentActivity.this.f85420p3.get(this.f85447b.getDimension_id());
                    if (postMultiDimensionObj == null) {
                        String str2 = this.f85447b.getDefault_label_map().get(num.toString());
                        WriteGameCommentActivity.this.f85420p3.put(this.f85447b.getDimension_id(), new PostMultiDimensionObj(String.valueOf(num), str2));
                        str = str2;
                    } else if (String.valueOf(num).equals(postMultiDimensionObj.getUser_star())) {
                        str = "";
                    } else {
                        postMultiDimensionObj.setUser_star(String.valueOf(num));
                        str = this.f85447b.getDefault_label_map().get(num.toString());
                        postMultiDimensionObj.setUser_label(str);
                    }
                    if (!com.max.hbcommon.utils.c.u(str)) {
                        this.f85446a.f112210b.setText(str);
                    }
                    if (this.f85446a.f112210b.isFocused()) {
                        this.f85446a.f112210b.setSelection(str.length());
                    }
                }
            }
        }

        public class b implements TextWatcher {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameCommentDimensionObj f85449b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ jk f85450c;

            b(GameCommentDimensionObj gameCommentDimensionObj, jk jkVar) {
                this.f85449b = gameCommentDimensionObj;
                this.f85450c = jkVar;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 35405, new Class[]{Editable.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(editable.toString())) {
                    return;
                }
                WriteGameCommentActivity.this.K3 = true;
                this.f85449b.getDefault_label_map().put(String.valueOf(this.f85450c.f112212d.getGrade()), editable.toString());
                PostMultiDimensionObj postMultiDimensionObj = (PostMultiDimensionObj) WriteGameCommentActivity.this.f85420p3.get(this.f85449b.getDimension_id());
                if (postMultiDimensionObj != null) {
                    postMultiDimensionObj.setUser_label(editable.toString());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }

        p(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameCommentDimensionObj gameCommentDimensionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameCommentDimensionObj}, this, changeQuickRedirect, false, 35401, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameCommentDimensionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            jk jkVarA = jk.a(eVar.b());
            jkVarA.f112213e.setText(gameCommentDimensionObj.getDimension_name());
            jkVarA.f112212d.setEnableSlide(true);
            PostMultiDimensionObj postMultiDimensionObj = (PostMultiDimensionObj) WriteGameCommentActivity.this.f85420p3.get(gameCommentDimensionObj.getDimension_id());
            if (((androidx.lifecycle.j0) jkVarA.f112212d.getTag(R.id.rb_0)) == null) {
                a aVar = new a(jkVarA, gameCommentDimensionObj);
                jkVarA.f112212d.getGradeLD().k(WriteGameCommentActivity.this, aVar);
                jkVarA.f112212d.setTag(R.id.rb_0, aVar);
            }
            if (postMultiDimensionObj == null) {
                jkVarA.f112212d.setMinGrade(0);
                jkVarA.f112211c.setVisibility(8);
                jkVarA.f112210b.setText("");
                jkVarA.f112212d.setGrade(0);
                jkVarA.f112210b.setEnabled(false);
            } else {
                jkVarA.f112212d.setMinGrade(1);
                jkVarA.f112211c.setVisibility(0);
                jkVarA.f112212d.setGrade(com.max.hbutils.utils.n.q(postMultiDimensionObj.getUser_star()));
                jkVarA.f112210b.setText(postMultiDimensionObj.getUser_label());
                jkVarA.f112210b.setEnabled(true);
            }
            jkVarA.f112210b.addTextChangedListener(new b(gameCommentDimensionObj, jkVarA));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameCommentDimensionObj gameCommentDimensionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameCommentDimensionObj}, this, changeQuickRedirect, false, 35402, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameCommentDimensionObj);
        }
    }

    public class q implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 35406, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = WriteGameCommentActivity.this.f85424y2.f111981g.getLayoutParams();
            layoutParams.height = iIntValue;
            WriteGameCommentActivity.this.f85424y2.f111981g.setLayoutParams(layoutParams);
        }
    }

    public class r implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f85453b;

        r(boolean z10) {
            this.f85453b = z10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 35408, new Class[]{Animator.class}, Void.TYPE).isSupported || this.f85453b) {
                return;
            }
            WriteGameCommentActivity.this.f85424y2.f111981g.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 35407, new Class[]{Animator.class}, Void.TYPE).isSupported && this.f85453b) {
                WriteGameCommentActivity.this.f85424y2.f111981g.setVisibility(0);
            }
        }
    }

    public class s extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        public void onNext(Result<UserPostLimitsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35409, new Class[]{Result.class}, Void.TYPE).isSupported && WriteGameCommentActivity.this.isActive()) {
                super.onNext(result);
                UserPostLimitsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                if (result2.isCan_post_link()) {
                    ((BaseActivity) WriteGameCommentActivity.this).f66616q.getAppbarActionTextView().setEnabled(true);
                    return;
                }
                ((BaseActivity) WriteGameCommentActivity.this).f66616q.getAppbarActionTextView().setEnabled(false);
                if (com.max.hbcommon.utils.c.u(result2.getMsg_post_link())) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.d(result2.getMsg_post_link());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35410, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35392, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentActivity.this.f85424y2.f111976b.requestFocus();
            if (WriteGameCommentActivity.this.f85424y2.f111981g.getVisibility() == 0) {
                WriteGameCommentActivity.c2(WriteGameCommentActivity.this, false);
                WriteGameCommentActivity.this.f85424y2.f111977c.setRotation(180.0f);
            }
        }
    }

    public class u implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (!PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35411, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported && z10 && WriteGameCommentActivity.this.f85424y2.f111981g.getVisibility() == 0) {
                WriteGameCommentActivity.c2(WriteGameCommentActivity.this, false);
                WriteGameCommentActivity.this.f85424y2.f111977c.setRotation(180.0f);
            }
        }
    }

    public class v implements HeyBoxEditText.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // com.max.xiaoheihe.module.expression.widget.HeyBoxEditText.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35412, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            String string = WriteGameCommentActivity.this.f85424y2.f111976b.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                return;
            }
            WriteGameCommentActivity.this.f85424y2.f111976b.setText(WriteGameCommentActivity.r2(WriteGameCommentActivity.this, string));
            WriteGameCommentActivity.this.f85424y2.f111976b.setSelection(string.length());
            WriteGameCommentActivity.this.f85424y2.f111976b.setMovementMethod(com.max.hbcustomview.spans.f.a());
        }
    }

    public class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35413, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WriteGameCommentActivity.this.onBackPressed();
        }
    }

    public class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35415, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                WriteGameCommentActivity.this.f85420p3.clear();
                WriteGameCommentActivity.this.G3.notifyDataSetChanged();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35416, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35414, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - WriteGameCommentActivity.this.Q > 1000) {
                WriteGameCommentActivity.this.Q = jCurrentTimeMillis;
                if (com.max.xiaoheihe.utils.i0.s() && com.max.xiaoheihe.utils.i0.d(((BaseActivity) WriteGameCommentActivity.this).f66601b)) {
                    if (!"2".equals(WriteGameCommentActivity.this.f85415a0) && WriteGameCommentActivity.this.W <= 0.0f) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f("请评分");
                    } else if (com.max.hbcommon.utils.c.u(WriteGameCommentActivity.this.f85424y2.f111976b.getText().toString())) {
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(WriteGameCommentActivity.this.getString(R.string.content_empty_msg));
                    } else if (WriteGameCommentActivity.h3(WriteGameCommentActivity.this)) {
                        new com.max.hbcommon.view.a.f(((BaseActivity) WriteGameCommentActivity.this).f66601b).y("提示").l("请完成全部的游戏印象后发布评价").u("填写印象", new b()).o("清空印象", new a()).F();
                    } else {
                        WriteGameCommentActivity.T1(WriteGameCommentActivity.this);
                    }
                }
            }
        }
    }

    public class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35417, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) WriteGameCommentActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131052u2);
            intent.putExtra("title", WriteGameCommentActivity.this.getString(R.string.ratting_role));
            ((BaseActivity) WriteGameCommentActivity.this).f66601b.startActivity(intent);
        }
    }

    public class z extends com.max.hbcommon.network.d<Result<SteamReviewInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        public void onNext(@androidx.annotation.n0 Result<SteamReviewInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35418, new Class[]{Result.class}, Void.TYPE).isSupported || result.getResult() == null || com.max.hbcommon.utils.c.u(result.getResult().getSteam_review())) {
                return;
            }
            WriteGameCommentActivity.this.f85419p2 = result.getResult().getSteam_review();
            WriteGameCommentActivity.Z1(WriteGameCommentActivity.this, result.getResult().getSteam_review().replaceAll(WriteGameCommentActivity.this.f85423y1, ""));
            if ("1".equals(WriteGameCommentActivity.this.f85415a0)) {
                WriteGameCommentActivity.a2(WriteGameCommentActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(@androidx.annotation.n0 Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35419, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamReviewInfo>) obj);
        }
    }

    static /* synthetic */ void A2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35370, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.C1();
    }

    private String A3(String str) {
        return str;
    }

    private String B3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35340, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<max_tag_url>" + str + "</max_tag_url>";
    }

    static /* synthetic */ void C2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35371, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.K3();
    }

    private String C3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35339, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<max_tag_video> url=" + str + "</max_tag_video>";
    }

    static /* synthetic */ void D2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35372, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.C1();
    }

    private void D3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35319, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.X = getIntent().getStringExtra("appid");
        this.f85418p1 = getIntent().getStringExtra("game_platf");
        this.V = getIntent().getIntExtra("rating", 0);
    }

    private void F3(LinkInfoObj linkInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, str}, this, changeQuickRedirect, false, 35321, new Class[]{LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.R = linkInfoObj;
        this.U = str;
        this.f66616q.setTitle(getString(R.string.edit_comments));
        this.f66616q.getAppbarActionTextView().setText(getString(R.string.post));
        this.f66616q.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
        LinkInfoObj linkInfoObj2 = this.R;
        if (linkInfoObj2 != null) {
            SpannableStringBuilder spannableStringBuilderV3 = V3(M3(linkInfoObj2));
            this.f85421x1 = spannableStringBuilderV3.toString();
            this.f85424y2.f111976b.setText(spannableStringBuilderV3);
            this.f85424y2.f111976b.setSelection(spannableStringBuilderV3.length());
            this.f85424y2.f111976b.setMovementMethod(com.max.hbcustomview.spans.f.a());
            this.T = this.R.getLinkid();
            Q3(com.max.hbutils.utils.n.p(this.R.getScore()));
            N3();
        }
    }

    private void G3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35326, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().m9(this.X).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d()));
    }

    private void H3(String str) {
        j3 j3Var;
        LinearLayout linearLayout;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35323, new Class[]{String.class}, Void.TYPE).isSupported || (linearLayout = (j3Var = this.f85424y2).f111996v) == null || j3Var.f111989o == null) {
            return;
        }
        View viewFindViewById = linearLayout.findViewById(R.id.tv_cancel);
        View viewFindViewById2 = this.f85424y2.f111996v.findViewById(R.id.tv_import);
        View viewFindViewById3 = this.f85424y2.f111996v.findViewById(R.id.vg_import_rule);
        if (viewFindViewById == null || viewFindViewById2 == null || viewFindViewById3 == null) {
            return;
        }
        this.f85424y2.f111989o.setText(str);
        viewFindViewById3.setOnClickListener(new a0());
        viewFindViewById.setOnClickListener(new a());
        viewFindViewById2.setOnClickListener(new b(str));
        this.O = true;
    }

    private boolean I3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35317, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (com.max.hbcommon.utils.c.w(this.G2) || this.f85420p3.size() == 0 || this.f85420p3.size() == this.G2.size()) ? false : true;
    }

    private void K3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35347, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.G2)) {
            this.f85424y2.f111998x.setVisibility(8);
        } else {
            this.f85424y2.f111998x.setVisibility(0);
            S3();
        }
        x1();
    }

    private void L3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35349, new Class[0], Void.TYPE).isSupported || this.K3) {
            return;
        }
        this.f85424y2.f111999y.performClick();
    }

    private String M1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35337, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = this.f85424y2.f111976b.getText().toString();
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "text");
        jsonObject.addProperty("text", string);
        jsonArray.add(jsonObject);
        return jsonArray.toString();
    }

    private String M3(LinkInfoObj linkInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 35342, new Class[]{LinkInfoObj.class}, String.class);
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
                str = str + s3(bBSTextObj.getUrl());
            } else if (bBSTextObj.getType().equals("video")) {
                str = str + C3(bBSTextObj.getUrl());
            } else if (bBSTextObj.getType().equals("url")) {
                str = str + B3(bBSTextObj.getText());
            } else {
                str = str + A3(bBSTextObj.getText());
            }
        }
        return str;
    }

    static /* synthetic */ void N1(WriteGameCommentActivity writeGameCommentActivity, float f10) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity, new Float(f10)}, null, changeQuickRedirect, true, 35355, new Class[]{WriteGameCommentActivity.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.Q3(f10);
    }

    private void N3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35329, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("0".equals(this.f85417c0)) {
            this.f85424y2.f111991q.setVisibility(8);
            this.f85424y2.f111987m.setVisibility(8);
            if ("1".equals(this.f85415a0)) {
                this.f85424y2.f111987m.setVisibility(0);
            } else {
                this.f85424y2.f111991q.setVisibility(0);
            }
            O3();
        } else {
            this.f85424y2.f111991q.setVisibility(0);
            this.f85424y2.f111987m.setVisibility(0);
            O3();
            this.f85424y2.f111991q.setOnClickListener(new d());
            this.f85424y2.f111987m.setOnClickListener(new e());
        }
        k3();
    }

    static /* synthetic */ void O2(WriteGameCommentActivity writeGameCommentActivity, LinkInfoObj linkInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity, linkInfoObj, str}, null, changeQuickRedirect, true, 35373, new Class[]{WriteGameCommentActivity.class, LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.P3(linkInfoObj, str);
    }

    private void O3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35331, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("1".equals(this.f85415a0)) {
            this.f85424y2.f111993s.setVisibility(8);
            this.f85424y2.f111982h.setVisibility(0);
            this.f85424y2.f111985k.setVisibility(0);
            this.W = this.f85424y2.f111982h.getGrade();
            this.f85424y2.f111987m.setTextColor(this.f66601b.getResources().getColor(R.color.white));
            this.f85424y2.f111987m.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_primary_2dp));
            this.f85424y2.f111991q.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
            this.f85424y2.f111991q.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_divider_concept_2dp));
            return;
        }
        if ("3".equals(this.f85415a0)) {
            this.f85424y2.f111993s.setVisibility(8);
            this.f85424y2.f111982h.setVisibility(0);
            this.f85424y2.f111985k.setVisibility(0);
            this.W = this.f85424y2.f111982h.getGrade();
            this.f85424y2.f111987m.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
            this.f85424y2.f111987m.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_divider_concept_2dp));
            this.f85424y2.f111991q.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
            this.f85424y2.f111991q.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_divider_concept_2dp));
            return;
        }
        this.f85424y2.f111993s.setVisibility(0);
        this.f85424y2.f111993s.setOnClickListener(new f());
        this.f85424y2.f111982h.setVisibility(8);
        this.f85424y2.f111985k.setVisibility(8);
        this.f85424y2.f111991q.setTextColor(this.f66601b.getResources().getColor(R.color.white));
        this.f85424y2.f111991q.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_primary_2dp));
        this.f85424y2.f111987m.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
        this.f85424y2.f111987m.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_divider_concept_2dp));
    }

    static /* synthetic */ void P2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35374, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.t3();
    }

    private void P3(LinkInfoObj linkInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, str}, this, changeQuickRedirect, false, 35320, new Class[]{LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String str2 = this.f85415a0;
        if (str2 == null || "0".equals(str2)) {
            this.f85415a0 = "1";
            this.f85417c0 = "1";
        }
        String str3 = this.f85416b0;
        if (str3 != null) {
            if ("unfollowing".equals(str3)) {
                this.N = false;
            } else {
                this.N = true;
            }
        }
        Y3();
        this.f85424y2.f111994t.setVisibility(0);
        if (com.max.hbcommon.utils.c.u(this.Y)) {
            this.f85424y2.f111979e.setVisibility(8);
        } else {
            com.max.hbimage.b.d0(this.Y, this.f85424y2.f111979e, 2);
            this.f85424y2.f111979e.setVisibility(0);
        }
        this.f85424y2.f111984j.setText(this.Z);
        if (linkInfoObj != null && "1".equals(str)) {
            F3(linkInfoObj, str);
            return;
        }
        l3();
        this.f66616q.setTitle(getString(R.string.add_comment));
        this.f66616q.getAppbarActionTextView().setText(getString(R.string.post));
        this.f66616q.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
        Q3(this.V);
        N3();
    }

    private void Q3(float f10) {
        String string;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 35328, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if ("2".equals(this.f85415a0)) {
            SliceGradeView sliceGradeView = this.f85424y2.f111982h;
            if (sliceGradeView != null) {
                sliceGradeView.setVisibility(8);
                return;
            }
            return;
        }
        this.W = f10;
        SliceGradeView sliceGradeView2 = this.f85424y2.f111982h;
        if (sliceGradeView2 == null) {
            return;
        }
        sliceGradeView2.setGrade((int) f10);
        this.f85424y2.f111982h.setEnableSlide(true);
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
        this.f85424y2.f111985k.setText(string);
        if (f10 > 0.0f) {
            this.f85424y2.f111982h.setMinGrade(1);
        }
    }

    @SuppressLint({"CheckResult"})
    private void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35324, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().c2(this.X).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d());
    }

    private void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35348, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f85424y2.f111999y.setOnClickListener(new o());
        if (!com.max.hbcommon.utils.c.x(com.max.hbcache.c.j("is_game_multi_dimension_show"))) {
            this.f85424y2.f111999y.performClick();
            this.L3.sendEmptyMessageDelayed(1, 2000L);
            com.max.hbcache.c.z("is_game_multi_dimension_show", "1");
        }
        this.f85424y2.f111981g.setLayoutManager(new LinearLayoutManager(this.f66601b));
        p pVar = new p(this.f66601b, this.G2, R.layout.item_game_comment_multi_dimension);
        this.G3 = pVar;
        this.f85424y2.f111981g.setAdapter(pVar);
    }

    static /* synthetic */ void T1(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35359, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.q3();
    }

    private void T3() {
        j3 j3Var;
        LinearLayout linearLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35325, new Class[0], Void.TYPE).isSupported || (linearLayout = (j3Var = this.f85424y2).f111996v) == null || j3Var.f111989o == null || !this.O) {
            return;
        }
        View viewFindViewById = linearLayout.findViewById(R.id.tv_cancel);
        View viewFindViewById2 = this.f85424y2.f111996v.findViewById(R.id.tv_import);
        View viewFindViewById3 = this.f85424y2.f111996v.findViewById(R.id.vg_import_rule);
        if (viewFindViewById == null || viewFindViewById2 == null || viewFindViewById3 == null) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f66601b, R.anim.activity_bottom_in);
        animationLoadAnimation.setAnimationListener(new c());
        this.f85424y2.f111996v.startAnimation(animationLoadAnimation);
        this.f85424y2.f111996v.setVisibility(0);
        this.P = true;
    }

    private void U3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35351, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iF = (ViewUtils.f(this.f66601b, 30.0f) * this.G2.size()) + ViewUtils.f(this.f66601b, 12.0f);
        ValueAnimator valueAnimatorOfInt = z10 ? ValueAnimator.ofInt(0, iF) : ValueAnimator.ofInt(iF, 0);
        valueAnimatorOfInt.setDuration(150L);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new q());
        valueAnimatorOfInt.addListener(new r(z10));
        valueAnimatorOfInt.start();
        addValueAnimator(valueAnimatorOfInt);
    }

    static /* synthetic */ void V2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35375, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.L3();
    }

    private SpannableStringBuilder V3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35343, new Class[]{String.class}, SpannableStringBuilder.class);
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

    private void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35327, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.N ? "following" : "unfollowing";
        if (str.equals("following") && !com.max.xiaoheihe.utils.d.N0(this.f66601b)) {
            com.max.xiaoheihe.utils.v.i(this.f66601b, this.f66602c);
        }
        io.reactivex.z<Result> zVarCb = null;
        if ("unfollowing".equalsIgnoreCase(str)) {
            zVarCb = com.max.xiaoheihe.network.i.a().x3(this.X);
        } else if ("following".equalsIgnoreCase(str)) {
            zVarCb = com.max.xiaoheihe.network.i.a().cb(this.X);
            com.max.hbcache.c.C(com.max.hbcache.c.U, String.valueOf(System.currentTimeMillis()));
        }
        if (zVarCb != null) {
            V((io.reactivex.disposables.b) zVarCb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q()));
        }
    }

    private void X3(ResultVerifyInfoObj resultVerifyInfoObj) {
        if (PatchProxy.proxy(new Object[]{resultVerifyInfoObj}, this, changeQuickRedirect, false, 35335, new Class[]{ResultVerifyInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66601b.sendBroadcast(new Intent().setAction("com.heybox.refresh.topic"));
        this.f66601b.sendBroadcast(new Intent().setAction(lb.a.f131043t));
        this.f66601b.sendBroadcast(new Intent().setAction("com.max.xiaoheihe.post.gotop"));
        this.f66601b.sendBroadcast(new Intent(lb.a.W));
        Intent intent = new Intent();
        LinkInfoObj linkInfoObj = new LinkInfoObj();
        linkInfoObj.setScore(String.format(Locale.US, "%.0f", Float.valueOf(this.W)));
        linkInfoObj.setDescription(this.f85424y2.f111976b.getText().toString());
        linkInfoObj.setLinkid(this.T);
        linkInfoObj.setLink_tag(this.S);
        intent.putExtra("comment", linkInfoObj);
        Activity activity = this.f66601b;
        activity.startActivity(GameCommentSuccessActivity.R.a(activity, resultVerifyInfoObj, linkInfoObj, this.X, String.valueOf(2)));
        this.f66601b.setResult(-1, intent);
        this.f66601b.finish();
    }

    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35330, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.N) {
            this.f85424y2.f111978d.setImageResource(R.drawable.common_select_single_filled_16x16);
        } else {
            this.f85424y2.f111978d.setImageResource(R.drawable.common_select_line_16x16);
        }
    }

    static /* synthetic */ void Z1(WriteGameCommentActivity writeGameCommentActivity, String str) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity, str}, null, changeQuickRedirect, true, 35360, new Class[]{WriteGameCommentActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.H3(str);
    }

    static /* synthetic */ void a2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35361, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.T3();
    }

    static /* synthetic */ void c2(WriteGameCommentActivity writeGameCommentActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 35356, new Class[]{WriteGameCommentActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.U3(z10);
    }

    static /* synthetic */ void e2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35362, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.G3();
    }

    static /* synthetic */ void f2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35363, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.R3();
    }

    static /* synthetic */ boolean h3(WriteGameCommentActivity writeGameCommentActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35358, new Class[]{WriteGameCommentActivity.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : writeGameCommentActivity.I3();
    }

    static /* synthetic */ void i2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35364, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.O3();
    }

    private void k3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35332, new Class[0], Void.TYPE).isSupported && this.f85424y2.f111996v.getVisibility() == 8 && this.f85424y2.f111993s.getVisibility() == 8) {
            ((ViewGroup.MarginLayoutParams) this.f85424y2.f111992r.getLayoutParams()).bottomMargin = ViewUtils.f(this.f66601b, 7.0f);
        }
    }

    private void l3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35322, new Class[0], Void.TYPE).isSupported || "ps4".equals(this.f85418p1) || "switch".equals(this.f85418p1) || "xbox".equals(this.f85418p1)) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w(this.X).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new z()));
    }

    static /* synthetic */ void m2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35365, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.Y3();
    }

    private void n3(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 35334, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strW3 = w3();
        HashMap map = new HashMap();
        String str3 = "2".equals(this.f85415a0) ? String.format(Locale.US, "%.0f", Float.valueOf(5.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(this.W));
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            map.put("Cookie", str2);
        }
        String strP = null;
        if (!com.max.hbcommon.utils.c.w(this.G2) && this.f85420p3.size() == this.G2.size()) {
            strP = com.max.hbutils.utils.k.p(this.f85420p3);
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().la(map, null, strW3, null, 2, this.S, null, null, null, null, this.U, this.T, this.X, str3, str, null, strP).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void p3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35333, new Class[0], Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.g(this.f66601b)) {
            this.M = new LoadingDialog(this.f66601b, getString(R.string.commiting), false).r();
            n3(null, null);
        }
    }

    private void q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35318, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p3();
        if ("14".equals(this.S) && this.N) {
            W3();
        }
    }

    static /* synthetic */ SpannableStringBuilder r2(WriteGameCommentActivity writeGameCommentActivity, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{writeGameCommentActivity, str}, null, changeQuickRedirect, true, 35357, new Class[]{WriteGameCommentActivity.class, String.class}, SpannableStringBuilder.class);
        return patchProxyResultProxy.isSupported ? (SpannableStringBuilder) patchProxyResultProxy.result : writeGameCommentActivity.V3(str);
    }

    private String r3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35341, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<max_tag_game> url=" + str + "</max_tag_game>";
    }

    private String s3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35338, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<max_tag_img> url=" + str + "</max_tag_img>";
    }

    private void t3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35345, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().xb(this.X).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    static /* synthetic */ void u2(WriteGameCommentActivity writeGameCommentActivity, ResultVerifyInfoObj resultVerifyInfoObj) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity, resultVerifyInfoObj}, null, changeQuickRedirect, true, 35366, new Class[]{WriteGameCommentActivity.class, ResultVerifyInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        writeGameCommentActivity.X3(resultVerifyInfoObj);
    }

    private void u3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35346, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v4(this.X).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    static /* synthetic */ void v2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35367, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    private String w3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35336, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : M1();
    }

    static /* synthetic */ void x2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35368, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    private void y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35352, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b6(new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new s()));
    }

    static /* synthetic */ void z2(WriteGameCommentActivity writeGameCommentActivity) {
        if (PatchProxy.proxy(new Object[]{writeGameCommentActivity}, null, changeQuickRedirect, true, 35369, new Class[]{WriteGameCommentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35353, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.X);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35315, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j3 j3VarC = j3.c(this.f66602c);
        this.f85424y2 = j3VarC;
        setContentView(j3VarC.b());
        getWindow().setNavigationBarColor(this.f66601b.getResources().getColor(R.color.divider_secondary_2_color));
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        this.f85424y2.f111982h.setMinGrade(0);
        this.f85423y1 = "\n——来自" + com.max.xiaoheihe.utils.d.A() + "用户" + com.max.xiaoheihe.utils.i0.k() + "的评价";
        this.f85424y2.f111982h.getGradeLD().k(this, new k());
        this.f85424y2.f111976b.setOnClickListener(new t());
        this.f85424y2.f111976b.setOnFocusChangeListener(new u());
        this.f85424y2.f111976b.setContextMenuItemSelectedListener(new v());
        if (com.max.xiaoheihe.utils.i0.s()) {
            this.L = com.max.xiaoheihe.utils.i0.i().getAccount_detail().getUserid();
        }
        this.f66616q.getAppbarActionTextView().setVisibility(0);
        this.f66617r.setVisibility(0);
        SpannableString spannableString = new SpannableString("\u200e从多个角度评价游戏，可以帮助更多玩家");
        Drawable drawableMutate = getResources().getDrawable(R.drawable.common_write_line_24x24).getConstantState().newDrawable().mutate();
        drawableMutate.setColorFilter(getResources().getColor(R.color.text_secondary_2_color), PorterDuff.Mode.SRC_IN);
        drawableMutate.setBounds(0, 0, ViewUtils.f(this.f66601b, 16.0f), ViewUtils.f(this.f66601b, 16.0f));
        spannableString.setSpan(new com.max.hbcustomview.spans.b(drawableMutate, 2, 0, ViewUtils.f(this.f66601b, 6.0f)), 0, 1, 33);
        this.f85424y2.f111976b.setHint(spannableString);
        D3();
        this.f66616q.getAppbarNavButtonView().setOnClickListener(new w());
        n1();
        if (com.max.xiaoheihe.utils.i0.s()) {
            y3();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35354, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        E1();
        u3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35344, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f85424y2.f111976b.getText().toString())) {
            super.onBackPressed();
            return;
        }
        if (!"1".equals(this.U)) {
            new com.max.hbcommon.view.a.f(this.f66601b).y("返回则输入内容不会保存").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new l()).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new j()).F();
        } else if (this.f85424y2.f111976b.getText().toString().equals(this.f85421x1)) {
            v2(this);
        } else {
            new com.max.hbcommon.view.a.f(this.f66601b).y("是否发布此次编辑?").u("发布", new i()).o("不发布", new h()).F();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35350, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L3.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35316, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setActionOnClickListener(new x());
        this.f85424y2.f111988n.setOnClickListener(new y());
    }
}
