package com.max.xiaoheihe.module.bbs.post_edit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.gson.JsonObject;
import com.igexin.sdk.PushConsts;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbmmkv.MMKVManager;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.InProgressLargeObjHoldBinder;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.service.ForegroundService;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.ArticleCollectionObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkVoteObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.ConceptPostTagObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.HtmlLinkContentObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.bbs.LinkImageObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkVoteInfoObj;
import com.max.xiaoheihe.bean.bbs.MaxMinLimitObj;
import com.max.xiaoheihe.bean.bbs.PostBtnObj;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.max.xiaoheihe.bean.bbs.PostLimitObj;
import com.max.xiaoheihe.bean.bbs.PostSettingObj;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.bean.bbs.TopicListInfoObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.max.xiaoheihe.module.bbs.AddAtUserActivity;
import com.max.xiaoheihe.module.bbs.DraftListActivity;
import com.max.xiaoheihe.module.bbs.EditVoteActivity;
import com.max.xiaoheihe.module.bbs.HashtagDetailActivity;
import com.max.xiaoheihe.module.bbs.ImageModuleListActivity;
import com.max.xiaoheihe.module.bbs.component.PostFormatView;
import com.max.xiaoheihe.module.bbs.component.PostMoreView;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.bbs.post_edit.post_setting.ActivityPostSettingViewModel;
import com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostSettingDialogFragment;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: NewLinkEditFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nNewLinkEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewLinkEditFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/NewLinkEditFragment\n+ 2 AccelWorld.kt\ncom/max/hbutils/utils/AccelWorldKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,3759:1\n160#2,16:3760\n160#2,16:3776\n160#2,16:3796\n160#2,16:3815\n160#2,16:3831\n262#3,2:3792\n262#3,2:3794\n1#4:3812\n1855#5,2:3813\n1855#5,2:3852\n29#6:3847\n5#6,2:3848\n22#6:3850\n7#6:3851\n29#6:3854\n5#6,2:3855\n22#6:3857\n7#6:3858\n*S KotlinDebug\n*F\n+ 1 NewLinkEditFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/NewLinkEditFragment\n*L\n458#1:3760,16\n459#1:3776,16\n535#1:3796,16\n1014#1:3815,16\n2623#1:3831,16\n463#1:3792,2\n466#1:3794,2\n942#1:3813,2\n3386#1:3852,2\n3382#1:3847\n3382#1:3848,2\n3382#1:3850\n3382#1:3851\n3439#1:3854\n3439#1:3855,2\n3439#1:3857\n3439#1:3858\n*E\n"})
@com.max.hbcommon.analytics.m(path = lb.d.A0)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class NewLinkEditFragment extends com.max.hbcommon.base.d implements View.OnClickListener, com.max.xiaoheihe.module.bbs.utils.d.a, com.max.xiaoheihe.module.bbs.post_edit.j, com.max.hbexpression.q.a, com.max.hbexpression.q.b, com.max.xiaoheihe.module.bbs.post_edit.k, com.max.xiaoheihe.module.bbs.post_edit.a.c, com.max.xiaoheihe.module.bbs.post_edit.post_setting.a, com.max.xiaoheihe.module.bbs.post_edit.auto_save.d {
    public static final int A5 = 900;
    public static final int B5 = 480;
    public static final int C5 = 100;

    @dl.e
    private static String E5 = null;
    public static final int F5 = 1000;
    public static final float G5 = 125.0f;

    @dl.d
    public static final String N4 = "NewLinkEditActivity";

    @dl.d
    public static final String O4 = "topicid";

    @dl.d
    public static final String P4 = "hashtag";

    @dl.d
    public static final String Q4 = "topicinfo";

    @dl.d
    public static final String R4 = "topicinfos";

    @dl.d
    public static final String S4 = "tags";

    @dl.d
    public static final String T4 = "selected_post_plan";

    @dl.d
    public static final String U4 = "high_like_comment";

    @dl.d
    public static final String V4 = "title";

    @dl.d
    public static final String W4 = "checked_topics";

    @dl.d
    public static final String X4 = "imgpath";

    @dl.d
    public static final String Y4 = "link_tag";

    @dl.d
    public static final String Z4 = "link_id";

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    @dl.d
    public static final String f82058a5 = "edit";

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    @dl.d
    public static final String f82059b5 = "page_type";

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @dl.d
    public static final String f82060c5 = "games";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    @dl.d
    public static final String f82061d5 = "draft_info";

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    @dl.d
    public static final String f82062e5 = "extra_params";

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    @dl.d
    public static final String f82063f5 = "post_info";

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    @dl.d
    public static final String f82064g5 = "default_article_info";

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    @dl.d
    public static final String f82065h5 = "fixed_topic";

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    @dl.d
    public static final String f82066i5 = "simple_style";

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @dl.d
    public static final String f82067j5 = "default_post_info";

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final int f82068k5 = 0;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final int f82069l5 = 9;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final int f82070m5 = 10;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final int f82071n5 = 11;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final int f82072o5 = 12;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final int f82073p5 = 13;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final int f82074q5 = 14;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final int f82075r5 = 1001;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final int f82076s5 = 1002;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    private static final int f82077t5 = 101;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    private static final int f82078u5 = 102;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final int f82079v5 = 103;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    private static final int f82080w5 = 104;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    private static final int f82081x5 = 105;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    @dl.d
    public static final String f82082y5 = "articleimg.jpg";

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final long f82083z5 = 2097152;
    private ConsecutiveScrollerLayout A;

    @dl.e
    private String A4;
    private View B;

    @dl.e
    private JsonObject B4;
    private ImageView C;

    @dl.e
    private androidx.activity.result.g<Uri> C4;
    private ImageView D;

    @dl.e
    private com.max.mediaselector.lib.utils.f.a D4;
    private ImageView E;
    private ImageView F;

    @dl.e
    private ActivityPostSettingViewModel F4;
    private ImageView G;
    private boolean G2;

    @dl.e
    private LinkImageObj G3;

    @dl.e
    private String G4;
    private ImageView H;

    @dl.e
    private PostCompilationItemObj H4;
    private ImageView I;
    private ImageView J;

    @dl.e
    private String J3;
    private View K;

    @dl.e
    private String K3;
    private ViewGroup L;

    @dl.e
    private String L3;
    private LinearLayout M;

    @dl.e
    private String M3;
    private ViewGroup N;
    private long N3;
    private TextView O;
    private long O3;
    private TextView P;

    @dl.e
    private File P3;
    private SettingItemView Q;
    private int Q3;
    private SettingItemView R;

    @dl.e
    private String R3;
    private SettingItemView S;

    @dl.e
    private String S3;
    private ImageView T;

    @dl.e
    private UserPostLimitsObj T3;
    private ViewGroup U;

    @dl.e
    private LinkEvaluateJSBroadcastReceiver U3;
    private TextView V;

    @dl.e
    private String V3;
    private ViewGroup W;
    private boolean W3;
    private com.max.xiaoheihe.module.bbs.post_edit.i X;

    @dl.e
    private Result<BBSLinkTreeObj> X3;
    private int Y;

    @dl.e
    private LinkDraftObj Y3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private String f82084a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private ArrayList<BBSTopicObj> f82087b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f82089c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private BBSTopicObj f82090c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @dl.e
    private LoadingDialog f82091c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f82092d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @dl.e
    private HtmlLinkContentObj f82093d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearLayout f82094e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.bbs.utils.d f82095e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PostMoreView f82096f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private boolean f82097f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PostMoreView f82098g;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private boolean f82099g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PostMoreView f82100h;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    @dl.e
    private com.max.hbexpression.q f82101h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PostMoreView f82102i;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @dl.e
    private BBSLinkVoteObj f82103i4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PostMoreView f82104j;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    @dl.e
    private final String f82105j4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f82106k;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private long f82107k4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f82108l;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private boolean f82109l4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private FrameLayout f82110m;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    @dl.e
    private LinkDraftObj f82111m4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WebView f82112n;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private z0 f82113n4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PostFormatView f82114o;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private boolean f82115o4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PostFormatView f82116p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private String f82117p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private HashMap<String, String> f82118p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @dl.e
    private String f82119p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private int f82120p4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PostFormatView f82121q;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private int f82122q4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PostFormatView f82123r;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private boolean f82124r4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PostFormatView f82125s;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    @dl.e
    private BBSTopicIndexObj f82126s4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PostFormatView f82127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f82129u;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    @dl.e
    private String f82130u4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f82131v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f82133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f82135x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private String f82136x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.e
    private LinkInfoObj f82137x2;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private boolean f82138x4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ImageView f82139y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private PostBtnObj f82140y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.e
    private String f82141y2;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    @dl.e
    private PostTabActivityViewModel f82142y4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TextView f82143z;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private boolean f82144z4;

    @dl.d
    public static final a L4 = new a(null);
    public static final int M4 = 8;
    private static Pattern D5 = Pattern.compile("data-gameid=\"([0-9]+)\"");

    @dl.d
    private static final Integer[] H5 = {Integer.valueOf(R.drawable.bbs_at_filled_24x24), Integer.valueOf(R.drawable.share_link_filled_24x24), Integer.valueOf(R.drawable.bbs_game_filled_24x24), Integer.valueOf(R.drawable.bbs_vote_filled_24x24), Integer.valueOf(R.drawable.game_gamelist_filled_24x24)};

    @dl.d
    private static final Integer[] I5 = {Integer.valueOf(R.string.at_friends), Integer.valueOf(R.string.super_link), Integer.valueOf(R.string.game), Integer.valueOf(R.string.vote), Integer.valueOf(R.string.game_album)};

    @dl.d
    private static final Integer[] J5 = {Integer.valueOf(R.id.pm_at), Integer.valueOf(R.id.pm_super_link), Integer.valueOf(R.id.pm_game), Integer.valueOf(R.id.pm_vote), Integer.valueOf(R.id.pm_game_album)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private kotlinx.coroutines.q0 f82086b = kotlinx.coroutines.r0.a(e1.c());

    @dl.e
    private String Z = "1";

    @dl.d
    private final ArrayList<LinkImageObj> Z3 = new ArrayList<>();

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @dl.e
    private ArrayList<BBSTopicObj> f82085a4 = new ArrayList<>();

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @dl.e
    private ArrayList<KeyDescObj> f82088b4 = new ArrayList<>();

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private boolean f82128t4 = true;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    @dl.d
    private final List<KeyDescObj> f82132v4 = new ArrayList();

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    @dl.d
    private List<KeyDescObj> f82134w4 = new ArrayList();

    @dl.d
    private final List<Uri> E4 = new ArrayList();

    @dl.d
    private final View.OnClickListener I4 = new l0();

    @dl.d
    private View.OnClickListener J4 = new e0();

    @dl.d
    private View.OnClickListener K4 = new d0();

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public final class LinkEvaluateJSBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public LinkEvaluateJSBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.d Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 29899, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(intent, "intent");
            if (NewLinkEditFragment.this.isActive() && kotlin.jvm.internal.f0.g(lb.a.U, intent.getAction()) && NewLinkEditFragment.this.V3 != null && kotlin.jvm.internal.f0.g(NewLinkEditFragment.this.V3, NewLinkEditFragment.L4.a())) {
                String stringExtra = intent.getStringExtra(lb.a.f131032r0);
                if (com.max.hbcommon.utils.c.u(stringExtra)) {
                    return;
                }
                NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
                kotlin.jvm.internal.f0.m(stringExtra);
                NewLinkEditFragment.W3(newLinkEditFragment, stringExtra);
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.e
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29889, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : NewLinkEditFragment.E5;
        }

        @dl.d
        public final Integer[] b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29891, new Class[0], Integer[].class);
            return patchProxyResultProxy.isSupported ? (Integer[]) patchProxyResultProxy.result : NewLinkEditFragment.H5;
        }

        @dl.d
        public final Integer[] c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29893, new Class[0], Integer[].class);
            return patchProxyResultProxy.isSupported ? (Integer[]) patchProxyResultProxy.result : NewLinkEditFragment.J5;
        }

        @dl.d
        public final Integer[] d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29892, new Class[0], Integer[].class);
            return patchProxyResultProxy.isSupported ? (Integer[]) patchProxyResultProxy.result : NewLinkEditFragment.I5;
        }

        public final Pattern e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29887, new Class[0], Pattern.class);
            return patchProxyResultProxy.isSupported ? (Pattern) patchProxyResultProxy.result : NewLinkEditFragment.D5;
        }

        @dl.e
        public final WebProtocolObj f(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29894, new Class[]{String.class}, WebProtocolObj.class);
            if (patchProxyResultProxy.isSupported) {
                return (WebProtocolObj) patchProxyResultProxy.result;
            }
            try {
                String strI = com.max.xiaoheihe.utils.l0.i(str, "utf-8");
                kotlin.jvm.internal.f0.o(strI, "decodeUrlString(url, \"utf-8\")");
                String strSubstring = strI.substring(11);
                kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                return (WebProtocolObj) com.max.hbutils.utils.k.a(strSubstring, WebProtocolObj.class);
            } catch (Exception e10) {
                com.max.hbcommon.utils.d.d("zzzz", "Parse WebProtocol failed:" + str);
                e10.printStackTrace();
                return null;
            }
        }

        public final boolean g(int i10) {
            return i10 == 14 || i10 == 12 || i10 == 10 || i10 == 13;
        }

        public final boolean h(int i10) {
            return i10 == 12 || i10 == 10;
        }

        public final void i(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29890, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            NewLinkEditFragment.E5 = str;
        }

        public final void j(Pattern pattern) {
            if (PatchProxy.proxy(new Object[]{pattern}, this, changeQuickRedirect, false, 29888, new Class[]{Pattern.class}, Void.TYPE).isSupported) {
                return;
            }
            NewLinkEditFragment.D5 = pattern;
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class a0 extends WebViewClient {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SslErrorHandler f82147a;

            a(SslErrorHandler sslErrorHandler) {
                this.f82147a = sslErrorHandler;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 29960, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                this.f82147a.proceed();
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 29959, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                this.f82147a.cancel();
                dialog.dismiss();
            }
        }

        a0() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(@dl.d WebView view, @dl.d String url) {
            if (PatchProxy.proxy(new Object[]{view, url}, this, changeQuickRedirect, false, 29956, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(url, "url");
            super.onLoadResource(view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@dl.d WebView view, @dl.d String url) {
            String prompt;
            if (PatchProxy.proxy(new Object[]{view, url}, this, changeQuickRedirect, false, 29955, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(url, "url");
            if (NewLinkEditFragment.this.isActive()) {
                com.max.hbcommon.utils.d.b(NewLinkEditFragment.N4, "onPageFinished  " + url);
                NewLinkEditFragment.M5(NewLinkEditFragment.this);
                NewLinkEditFragment.L3(NewLinkEditFragment.this);
                WebView webView = null;
                if (NewLinkEditFragment.this.Y == 0) {
                    if (NewLinkEditFragment.this.f82140y1 != null) {
                        PostBtnObj postBtnObj = NewLinkEditFragment.this.f82140y1;
                        kotlin.jvm.internal.f0.m(postBtnObj);
                        prompt = postBtnObj.getPrompt();
                    } else {
                        prompt = null;
                    }
                    if (!com.max.hbcommon.utils.c.u(prompt)) {
                        NewLinkEditFragment.Y5(NewLinkEditFragment.this, prompt);
                    } else if (NewLinkEditFragment.this.f82124r4) {
                        NewLinkEditFragment.Y5(NewLinkEditFragment.this, "正文");
                    }
                } else if (NewLinkEditFragment.this.Y != 11 && NewLinkEditFragment.this.Y != 12 && NewLinkEditFragment.this.Y != 14) {
                    NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
                    NewLinkEditFragment.Y5(newLinkEditFragment, newLinkEditFragment.getString(R.string.post_timeline_hint));
                }
                LinkDraftObj linkDraftObj = NewLinkEditFragment.this.f82111m4;
                String content = linkDraftObj != null ? linkDraftObj.getContent() : null;
                if (!com.max.hbcommon.utils.c.u(content)) {
                    NewLinkEditFragment newLinkEditFragment2 = NewLinkEditFragment.this;
                    NewLinkEditFragment.J5(newLinkEditFragment2, content, newLinkEditFragment2.f82141y2);
                } else if (NewLinkEditFragment.this.X3 != null) {
                    NewLinkEditFragment newLinkEditFragment3 = NewLinkEditFragment.this;
                    NewLinkEditFragment.i6(newLinkEditFragment3, com.max.hbutils.utils.k.p(newLinkEditFragment3.X3), NewLinkEditFragment.this.f82141y2);
                }
                if (!com.max.hbcommon.utils.c.u(NewLinkEditFragment.this.S3)) {
                    NewLinkEditFragment newLinkEditFragment4 = NewLinkEditFragment.this;
                    NewLinkEditFragment.I5(newLinkEditFragment4, newLinkEditFragment4.S3);
                }
                WebView webView2 = NewLinkEditFragment.this.f82112n;
                if (webView2 == null) {
                    kotlin.jvm.internal.f0.S("mWebView");
                } else {
                    webView = webView2;
                }
                webView.requestFocus();
                if (!NewLinkEditFragment.this.f82115o4) {
                    com.max.xiaoheihe.utils.d.B1(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext);
                    NewLinkEditFragment.X3(NewLinkEditFragment.this);
                }
                if (NewLinkEditFragment.this.f82124r4) {
                    NewLinkEditFragment.h5(NewLinkEditFragment.this);
                } else {
                    NewLinkEditFragment.c6(NewLinkEditFragment.this);
                }
                NewLinkEditFragment.w5(NewLinkEditFragment.this);
                super.onPageFinished(view, url);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@dl.d WebView view, @dl.d String url, @dl.e Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{view, url, bitmap}, this, changeQuickRedirect, false, 29954, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(url, "url");
            com.max.hbcommon.utils.d.b(NewLinkEditFragment.N4, "onPageStarted  " + url);
            super.onPageStarted(view, url, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@dl.d WebView view, @dl.d SslErrorHandler handler, @dl.d SslError error) {
            if (PatchProxy.proxy(new Object[]{view, handler, error}, this, changeQuickRedirect, false, 29957, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(handler, "handler");
            kotlin.jvm.internal.f0.p(error, "error");
            if (NewLinkEditFragment.this.isActive()) {
                Activity activity = null;
                if (view.getContext() instanceof Activity) {
                    Context context = view.getContext();
                    kotlin.jvm.internal.f0.n(context, "null cannot be cast to non-null type android.app.Activity");
                    activity = (Activity) context;
                }
                Activity activity2 = activity;
                if (activity2 == null || activity2.isFinishing()) {
                    return;
                }
                com.max.xiaoheihe.view.l.D(activity2, activity2.getString(R.string.prompt), activity2.getString(R.string.ssl_error_hint), activity2.getString(R.string.confirm), activity2.getString(R.string.cancel), new a(handler));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v22, types: [boolean, int] */
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@dl.d WebView view, @dl.d String url) {
            WebProtocolObj webProtocolObjE0;
            TextView textView;
            com.max.xiaoheihe.module.bbs.post_edit.i iVar;
            ImageView imageView;
            ImageView imageView2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, url}, this, changeQuickRedirect, false, 29958, new Class[]{WebView.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(url, "url");
            if (!NewLinkEditFragment.this.isActive()) {
                return true;
            }
            com.max.hbcommon.utils.d.b(NewLinkEditFragment.N4, "shouldOverrideUrlLoading  " + url);
            if (kotlin.text.u.v2(url, "hbeditor", false, 2, null)) {
                WebProtocolObj webProtocolObjF = NewLinkEditFragment.L4.f(url);
                if (webProtocolObjF == null) {
                    return true;
                }
                if (kotlin.jvm.internal.f0.g("callback_selection_style", webProtocolObjF.getProtocol_type())) {
                    List listB = com.max.hbutils.utils.k.b(webProtocolObjF.valueOf("items"), String.class);
                    List listB2 = com.max.hbutils.utils.k.b(webProtocolObjF.valueOf("forbiddens"), String.class);
                    NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
                    PostFormatView postFormatView = newLinkEditFragment.f82114o;
                    if (postFormatView == null) {
                        kotlin.jvm.internal.f0.S("pf_first_title");
                        postFormatView = null;
                    }
                    ?? J6 = NewLinkEditFragment.j6(newLinkEditFragment, listB, "h2", postFormatView);
                    NewLinkEditFragment newLinkEditFragment2 = NewLinkEditFragment.this;
                    PostFormatView postFormatView2 = newLinkEditFragment2.f82116p;
                    if (postFormatView2 == null) {
                        kotlin.jvm.internal.f0.S("pf_second_title");
                        postFormatView2 = null;
                    }
                    int i10 = J6;
                    if (NewLinkEditFragment.j6(newLinkEditFragment2, listB, "h3", postFormatView2)) {
                        i10 = J6 + 1;
                    }
                    NewLinkEditFragment newLinkEditFragment3 = NewLinkEditFragment.this;
                    PostFormatView postFormatView3 = newLinkEditFragment3.f82121q;
                    if (postFormatView3 == null) {
                        kotlin.jvm.internal.f0.S("pf_bold");
                        postFormatView3 = null;
                    }
                    int i11 = i10;
                    if (NewLinkEditFragment.j6(newLinkEditFragment3, listB, com.google.android.exoplayer2.text.ttml.d.f49792k0, postFormatView3)) {
                        i11 = i10 + 1;
                    }
                    NewLinkEditFragment newLinkEditFragment4 = NewLinkEditFragment.this;
                    PostFormatView postFormatView4 = newLinkEditFragment4.f82123r;
                    if (postFormatView4 == null) {
                        kotlin.jvm.internal.f0.S("pf_blockquote");
                        postFormatView4 = null;
                    }
                    int i12 = i11;
                    if (NewLinkEditFragment.j6(newLinkEditFragment4, listB, "blockquote", postFormatView4)) {
                        i12 = i11 + 1;
                    }
                    NewLinkEditFragment newLinkEditFragment5 = NewLinkEditFragment.this;
                    PostFormatView postFormatView5 = newLinkEditFragment5.f82125s;
                    if (postFormatView5 == null) {
                        kotlin.jvm.internal.f0.S("pf_unorderlist");
                        postFormatView5 = null;
                    }
                    int i13 = i12;
                    if (NewLinkEditFragment.j6(newLinkEditFragment5, listB, "unorderedList", postFormatView5)) {
                        i13 = i12 + 1;
                    }
                    NewLinkEditFragment newLinkEditFragment6 = NewLinkEditFragment.this;
                    PostFormatView postFormatView6 = newLinkEditFragment6.f82127t;
                    if (postFormatView6 == null) {
                        kotlin.jvm.internal.f0.S("pf_orderlist");
                        postFormatView6 = null;
                    }
                    int i14 = i13;
                    if (NewLinkEditFragment.j6(newLinkEditFragment6, listB, "orderedList", postFormatView6)) {
                        i14 = i13 + 1;
                    }
                    NewLinkEditFragment newLinkEditFragment7 = NewLinkEditFragment.this;
                    ImageView imageView3 = newLinkEditFragment7.G;
                    if (imageView3 == null) {
                        kotlin.jvm.internal.f0.S("iv_format");
                        imageView3 = null;
                    }
                    NewLinkEditFragment.R3(newLinkEditFragment7, imageView3, i14 > 0);
                    NewLinkEditFragment newLinkEditFragment8 = NewLinkEditFragment.this;
                    PostFormatView postFormatView7 = newLinkEditFragment8.f82114o;
                    if (postFormatView7 == null) {
                        kotlin.jvm.internal.f0.S("pf_first_title");
                        postFormatView7 = null;
                    }
                    NewLinkEditFragment.Y3(newLinkEditFragment8, listB2, "h2", postFormatView7);
                    NewLinkEditFragment newLinkEditFragment9 = NewLinkEditFragment.this;
                    PostFormatView postFormatView8 = newLinkEditFragment9.f82116p;
                    if (postFormatView8 == null) {
                        kotlin.jvm.internal.f0.S("pf_second_title");
                        postFormatView8 = null;
                    }
                    NewLinkEditFragment.Y3(newLinkEditFragment9, listB2, "h3", postFormatView8);
                    NewLinkEditFragment newLinkEditFragment10 = NewLinkEditFragment.this;
                    PostFormatView postFormatView9 = newLinkEditFragment10.f82121q;
                    if (postFormatView9 == null) {
                        kotlin.jvm.internal.f0.S("pf_bold");
                        postFormatView9 = null;
                    }
                    NewLinkEditFragment.Y3(newLinkEditFragment10, listB2, com.google.android.exoplayer2.text.ttml.d.f49792k0, postFormatView9);
                    NewLinkEditFragment newLinkEditFragment11 = NewLinkEditFragment.this;
                    PostFormatView postFormatView10 = newLinkEditFragment11.f82123r;
                    if (postFormatView10 == null) {
                        kotlin.jvm.internal.f0.S("pf_blockquote");
                        postFormatView10 = null;
                    }
                    NewLinkEditFragment.Y3(newLinkEditFragment11, listB2, "blockquote", postFormatView10);
                    NewLinkEditFragment newLinkEditFragment12 = NewLinkEditFragment.this;
                    PostFormatView postFormatView11 = newLinkEditFragment12.f82125s;
                    if (postFormatView11 == null) {
                        kotlin.jvm.internal.f0.S("pf_unorderlist");
                        postFormatView11 = null;
                    }
                    NewLinkEditFragment.Y3(newLinkEditFragment12, listB2, "unorderedList", postFormatView11);
                    NewLinkEditFragment newLinkEditFragment13 = NewLinkEditFragment.this;
                    PostFormatView postFormatView12 = newLinkEditFragment13.f82127t;
                    if (postFormatView12 == null) {
                        kotlin.jvm.internal.f0.S("pf_orderlist");
                        postFormatView12 = null;
                    }
                    NewLinkEditFragment.Y3(newLinkEditFragment13, listB2, "orderedList", postFormatView12);
                } else if (kotlin.jvm.internal.f0.g("callback_link_tap", webProtocolObjF.getProtocol_type())) {
                    NewLinkEditFragment.d6(NewLinkEditFragment.this, webProtocolObjF.valueOf("url"), webProtocolObjF.valueOf("title"));
                } else if (kotlin.jvm.internal.f0.g("callback_img_upload", webProtocolObjF.getProtocol_type())) {
                    NewLinkEditFragment newLinkEditFragment14 = NewLinkEditFragment.this;
                    NewLinkEditFragment.j5(newLinkEditFragment14, newLinkEditFragment14.Z3, false);
                } else if (kotlin.jvm.internal.f0.g("callback_title_focus", webProtocolObjF.getProtocol_type())) {
                    ImageView imageView4 = NewLinkEditFragment.this.E;
                    if (imageView4 == null) {
                        kotlin.jvm.internal.f0.S("iv_emoji");
                        imageView4 = null;
                    }
                    imageView4.setVisibility(8);
                    ImageView imageView5 = NewLinkEditFragment.this.G;
                    if (imageView5 == null) {
                        kotlin.jvm.internal.f0.S("iv_format");
                        imageView2 = null;
                    } else {
                        imageView2 = imageView5;
                    }
                    imageView2.setVisibility(8);
                } else if (kotlin.jvm.internal.f0.g("callback_title_blur", webProtocolObjF.getProtocol_type())) {
                    ImageView imageView6 = NewLinkEditFragment.this.E;
                    if (imageView6 == null) {
                        kotlin.jvm.internal.f0.S("iv_emoji");
                        imageView6 = null;
                    }
                    imageView6.setVisibility(0);
                    ImageView imageView7 = NewLinkEditFragment.this.G;
                    if (imageView7 == null) {
                        kotlin.jvm.internal.f0.S("iv_format");
                        imageView = null;
                    } else {
                        imageView = imageView7;
                    }
                    imageView.setVisibility(0);
                } else if (kotlin.jvm.internal.f0.g("callback_click_title_faq", webProtocolObjF.getProtocol_type())) {
                    Intent intent = new Intent(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext, (Class<?>) WebActionActivity.class);
                    intent.putExtra("pageurl", lb.a.R2);
                    intent.putExtra("title", "如何写好标题");
                    ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext.startActivity(intent);
                } else if (kotlin.jvm.internal.f0.g("callback_imageDesc_tap", webProtocolObjF.getProtocol_type())) {
                    NewLinkEditFragment.b6(NewLinkEditFragment.this, webProtocolObjF.valueOf("id"), webProtocolObjF.valueOf("text"));
                } else if (kotlin.jvm.internal.f0.g("callback_open_friend_list", webProtocolObjF.getProtocol_type())) {
                    NewLinkEditFragment newLinkEditFragment15 = NewLinkEditFragment.this;
                    newLinkEditFragment15.startActivityForResult(AddAtUserActivity.N1(((com.max.hbcommon.base.d) newLinkEditFragment15).mContext, NewLinkEditFragment.this.f82105j4), 104);
                    NewLinkEditFragment.F5(NewLinkEditFragment.this);
                } else if (kotlin.jvm.internal.f0.g("callback_open_subject_list", webProtocolObjF.getProtocol_type())) {
                    com.max.xiaoheihe.module.bbs.post_edit.i iVar2 = NewLinkEditFragment.this.X;
                    if (iVar2 == null) {
                        kotlin.jvm.internal.f0.S("linkEditHashTagManager");
                        iVar = null;
                    } else {
                        iVar = iVar2;
                    }
                    iVar.k();
                    NewLinkEditFragment.F5(NewLinkEditFragment.this);
                } else if (kotlin.jvm.internal.f0.g("callback_update_contents_number", webProtocolObjF.getProtocol_type())) {
                    TextView textView2 = NewLinkEditFragment.this.P;
                    if (textView2 == null) {
                        kotlin.jvm.internal.f0.S("tv_total_text_num");
                        textView = null;
                    } else {
                        textView = textView2;
                    }
                    textView.setText(webProtocolObjF.valueOf("num") + (char) 23383);
                    NewLinkEditFragment.this.f82120p4 = com.max.hbutils.utils.n.q(webProtocolObjF.valueOf("num"));
                } else if (kotlin.jvm.internal.f0.g("callback_update_undo_redo", webProtocolObjF.getProtocol_type())) {
                    int color = NewLinkEditFragment.this.getViewContext().getResources().getColor(R.color.text_secondary_1_color);
                    int color2 = NewLinkEditFragment.this.getViewContext().getResources().getColor(R.color.divider_primary_1_color);
                    ImageView imageView8 = NewLinkEditFragment.this.I;
                    if (imageView8 == null) {
                        kotlin.jvm.internal.f0.S("iv_undo");
                        imageView8 = null;
                    }
                    imageView8.setColorFilter(com.max.hbcommon.utils.c.x(webProtocolObjF.valueOf("can_undo")) ? color : color2);
                    ImageView imageView9 = NewLinkEditFragment.this.J;
                    if (imageView9 == null) {
                        kotlin.jvm.internal.f0.S("iv_redo");
                        imageView9 = null;
                    }
                    if (!com.max.hbcommon.utils.c.x(webProtocolObjF.valueOf("can_redo"))) {
                        color = color2;
                    }
                    imageView9.setColorFilter(color);
                }
            } else if (kotlin.text.u.v2(url, "heybox", false, 2, null) && (webProtocolObjE0 = com.max.xiaoheihe.utils.l0.e0(url)) != null && kotlin.jvm.internal.f0.g("openBBSTag", webProtocolObjE0.getProtocol_type())) {
                Intent intentX2 = HashtagDetailActivity.x2(NewLinkEditFragment.this.getContext(), webProtocolObjE0.valueOf("tag"));
                String strValueOf = webProtocolObjE0.valueOf("extra_params");
                if (strValueOf != null) {
                    intentX2.putExtra("extra_params", strValueOf);
                }
                String strValueOf2 = webProtocolObjE0.valueOf("h_src");
                if (strValueOf2 != null) {
                    intentX2.putExtra("h_src", strValueOf2);
                }
                com.max.xiaoheihe.utils.d.G1(NewLinkEditFragment.this.getContext(), intentX2);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public interface b {
        void a(@dl.e String str);
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29963, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = NewLinkEditFragment.this.T;
            if (imageView == null) {
                kotlin.jvm.internal.f0.S("iv_post_setting");
                imageView = null;
            }
            imageView.performClick();
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public final class c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82150b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ WebProtocolObj f82151c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: NewLinkEditFragment.kt */
            public static final class C0707a implements com.max.xiaoheihe.module.webview.t {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ NewLinkEditFragment f82152b;

                C0707a(NewLinkEditFragment newLinkEditFragment) {
                    this.f82152b = newLinkEditFragment;
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void A1(WebProtocolObj webProtocolObj, Throwable th2) {
                    com.max.xiaoheihe.module.webview.s.o(this, webProtocolObj, th2);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void B0(boolean z10) {
                    com.max.xiaoheihe.module.webview.s.v(this, z10);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void C1(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.A(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void D1(boolean z10) {
                    com.max.xiaoheihe.module.webview.s.t(this, z10);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void E0(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.d(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void E1(String str) {
                    com.max.xiaoheihe.module.webview.s.s(this, str);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void F3() {
                    com.max.xiaoheihe.module.webview.s.m(this);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public void G3(@dl.d WebProtocolObj protocol) {
                    String strValueOf;
                    if (PatchProxy.proxy(new Object[]{protocol}, this, changeQuickRedirect, false, 29898, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(protocol, "protocol");
                    if (!this.f82152b.isActive() || (strValueOf = protocol.valueOf("jsfunc")) == null) {
                        return;
                    }
                    WebView webView = this.f82152b.f82112n;
                    if (webView == null) {
                        kotlin.jvm.internal.f0.S("mWebView");
                        webView = null;
                    }
                    webView.evaluateJavascript(strValueOf, null);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void K2(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.f(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                @dl.d
                public String M0(@dl.d String url) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, 29897, new Class[]{String.class}, String.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (String) patchProxyResultProxy.result;
                    }
                    kotlin.jvm.internal.f0.p(url, "url");
                    if (com.max.xiaoheihe.module.webview.t0.f(url)) {
                        com.max.xiaoheihe.utils.l0.c(((com.max.hbcommon.base.d) this.f82152b).mContext, url);
                    }
                    return url;
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void N0(ArrayList arrayList) {
                    com.max.xiaoheihe.module.webview.s.g(this, arrayList);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void P0(ArrayList arrayList) {
                    com.max.xiaoheihe.module.webview.s.i(this, arrayList);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void U(boolean z10, boolean z11) {
                    com.max.xiaoheihe.module.webview.s.n(this, z10, z11);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void V0(String str) {
                    com.max.xiaoheihe.module.webview.s.q(this, str);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void e0(boolean z10) {
                    com.max.xiaoheihe.module.webview.s.w(this, z10);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void e3() {
                    com.max.xiaoheihe.module.webview.s.y(this);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void f0(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.e(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void g0(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.p(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void g1(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.l(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ String l3() {
                    return com.max.xiaoheihe.module.webview.s.k(this);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void o2(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.z(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void reload() {
                    com.max.xiaoheihe.module.webview.s.r(this);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ boolean t0(String str, String str2, com.max.xiaoheihe.module.webview.t.b bVar) {
                    return com.max.xiaoheihe.module.webview.s.j(this, str, str2, bVar);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void u(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.c(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void x0(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.h(this, webProtocolObj);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void y3(String str) {
                    com.max.xiaoheihe.module.webview.s.u(this, str);
                }

                @Override // com.max.xiaoheihe.module.webview.t
                public /* synthetic */ void z2(WebProtocolObj webProtocolObj) {
                    com.max.xiaoheihe.module.webview.s.x(this, webProtocolObj);
                }
            }

            a(NewLinkEditFragment newLinkEditFragment, WebProtocolObj webProtocolObj) {
                this.f82150b = newLinkEditFragment;
                this.f82151c = webProtocolObj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29896, new Class[0], Void.TYPE).isSupported && this.f82150b.isActive()) {
                    HeyboxWebProtocolHandler heyboxWebProtocolHandler = com.max.xiaoheihe.utils.l0.f95687b;
                    Activity mContext = ((com.max.hbcommon.base.d) this.f82150b).mContext;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    WebView webView = this.f82150b.f82112n;
                    if (webView == null) {
                        kotlin.jvm.internal.f0.S("mWebView");
                        webView = null;
                    }
                    WebProtocolObj webProtocolObj = this.f82151c;
                    kotlin.jvm.internal.f0.o(webProtocolObj, "webProtocolObj");
                    heyboxWebProtocolHandler.C(mContext, webView, webProtocolObj, new C0707a(this.f82150b));
                }
            }
        }

        public c() {
        }

        @JavascriptInterface
        @dl.e
        public final String hbProtocol(@dl.d String protocol) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{protocol}, this, changeQuickRedirect, false, 29895, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(protocol, "protocol");
            com.max.hbcommon.utils.d.b(NewLinkEditFragment.N4, "hbProtocol==" + protocol);
            WebProtocolObj webProtocolObjE0 = com.max.xiaoheihe.utils.l0.e0(protocol);
            if (webProtocolObjE0 != null) {
                WebView webView = NewLinkEditFragment.this.f82112n;
                if (webView == null) {
                    kotlin.jvm.internal.f0.S("mWebView");
                    webView = null;
                }
                webView.post(new a(NewLinkEditFragment.this, webProtocolObjE0));
            }
            return null;
        }

        @JavascriptInterface
        public final void tradeConfirm() {
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class c0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29964, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            NewLinkEditFragment.p5(NewLinkEditFragment.this);
            MMKVManager.f71329a.k(ad.e.f1248a, ad.e.f1253f, false, false);
            ViewGroup viewGroup = NewLinkEditFragment.this.W;
            if (viewGroup == null) {
                kotlin.jvm.internal.f0.S("vg_post_setting_bubble");
                viewGroup = null;
            }
            com.max.xiaoheihe.accelworld.s.b(viewGroup);
            NewLinkEditFragment.e6(NewLinkEditFragment.this);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class d implements MessageQueue.IdleHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29900, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            NewLinkEditFragment.E5(NewLinkEditFragment.this);
            return false;
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82156b;

            a(NewLinkEditFragment newLinkEditFragment) {
                this.f82156b = newLinkEditFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29966, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                NewLinkEditFragment.F5(this.f82156b);
                NewLinkEditFragment newLinkEditFragment = this.f82156b;
                newLinkEditFragment.startActivityForResult(EditVoteActivity.k2(((com.max.hbcommon.base.d) newLinkEditFragment).mContext, this.f82156b.f82103i4), 102);
            }
        }

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f82157b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29967, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        d0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29965, new Class[]{View.class}, Void.TYPE).isSupported) {
            }
            NewLinkEditFragment.p5(NewLinkEditFragment.this);
            NewLinkEditFragment.I7(NewLinkEditFragment.this, null, 1, null);
            switch (view.getId()) {
                case R.id.pm_at /* 2131363786 */:
                    NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
                    newLinkEditFragment.startActivityForResult(AddAtUserActivity.N1(((com.max.hbcommon.base.d) newLinkEditFragment).mContext, NewLinkEditFragment.this.f82105j4), 104);
                    NewLinkEditFragment.F5(NewLinkEditFragment.this);
                    break;
                case R.id.pm_game /* 2131363787 */:
                    NewLinkEditFragment.F5(NewLinkEditFragment.this);
                    Activity mContext = ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    com.max.xiaoheihe.base.router.b.x0(mContext, com.max.xiaoheihe.module.search.page.e.M.a(true)).C(1001).A();
                    break;
                case R.id.pm_game_album /* 2131363788 */:
                    Activity mContext2 = ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext;
                    kotlin.jvm.internal.f0.o(mContext2, "mContext");
                    com.max.xiaoheihe.base.router.b.k0(mContext2, lb.a.f131036r4);
                    break;
                case R.id.pm_super_link /* 2131363789 */:
                    NewLinkEditFragment.F5(NewLinkEditFragment.this);
                    NewLinkEditFragment.d6(NewLinkEditFragment.this, null, null);
                    break;
                case R.id.pm_vote /* 2131363790 */:
                    if (!(NewLinkEditFragment.this.Y == 10 || NewLinkEditFragment.this.Y == 12) || NewLinkEditFragment.this.f82103i4 == null) {
                        NewLinkEditFragment.F5(NewLinkEditFragment.this);
                        NewLinkEditFragment newLinkEditFragment2 = NewLinkEditFragment.this;
                        newLinkEditFragment2.startActivityForResult(EditVoteActivity.k2(((com.max.hbcommon.base.d) newLinkEditFragment2).mContext, NewLinkEditFragment.this.f82103i4), 102);
                    } else {
                        new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext).x(R.string.prompt).k(R.string.delete_vote_tip).t(R.string.confirm, new a(NewLinkEditFragment.this)).n(R.string.cancel, b.f82157b).F();
                    }
                    break;
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<ResultVerifyInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82159b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Result<ResultVerifyInfoObj> f82160c;

            a(NewLinkEditFragment newLinkEditFragment, Result<ResultVerifyInfoObj> result) {
                this.f82159b = newLinkEditFragment;
                this.f82160c = result;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29905, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                NewLinkEditFragment newLinkEditFragment = this.f82159b;
                ResultVerifyInfoObj result = this.f82160c.getResult();
                NewLinkEditFragment.s5(newLinkEditFragment, result != null ? result.getLink_id() : null);
            }
        }

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29901, new Class[0], Void.TYPE).isSupported && NewLinkEditFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29902, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (NewLinkEditFragment.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = NewLinkEditFragment.this.f82091c4;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                PostUtils.f81983a.s(PostType.Article, e10.toString(), "createLink fail", NewLinkEditFragment.this.A4, NewLinkEditFragment.this.B4);
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0068  */
        public void onNext(@dl.d Result<ResultVerifyInfoObj> result) {
            boolean z10;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29903, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (NewLinkEditFragment.this.isActive()) {
                super.onNext(result);
                LoadingDialog loadingDialog = NewLinkEditFragment.this.f82091c4;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                if (result.getResult() != null) {
                    ResultVerifyInfoObj result2 = result.getResult();
                    kotlin.jvm.internal.f0.m(result2);
                    if (result2.getReply_push_state() != null) {
                        ResultVerifyInfoObj result3 = result.getResult();
                        kotlin.jvm.internal.f0.m(result3);
                        z10 = kotlin.jvm.internal.f0.g("1", result3.getReply_push_state().getPush_state());
                    }
                }
                if (z10) {
                    com.max.xiaoheihe.utils.v.a(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext, com.max.xiaoheihe.utils.v.f95760a, new a(NewLinkEditFragment.this, result));
                    return;
                }
                NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
                ResultVerifyInfoObj result4 = result.getResult();
                NewLinkEditFragment.s5(newLinkEditFragment, result4 != null ? result4.getLink_id() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29904, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ResultVerifyInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class e0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29968, new Class[]{View.class}, Void.TYPE).isSupported) {
            }
            switch (view.getId()) {
                case R.id.pf_blockquote /* 2131363774 */:
                    NewLinkEditFragment.P3(NewLinkEditFragment.this);
                    break;
                case R.id.pf_bold /* 2131363775 */:
                    NewLinkEditFragment.Q3(NewLinkEditFragment.this);
                    break;
                case R.id.pf_first_title /* 2131363776 */:
                    NewLinkEditFragment.e5(NewLinkEditFragment.this);
                    break;
                case R.id.pf_orderlist /* 2131363777 */:
                    NewLinkEditFragment.t5(NewLinkEditFragment.this);
                    break;
                case R.id.pf_second_title /* 2131363778 */:
                    NewLinkEditFragment.f5(NewLinkEditFragment.this);
                    break;
                case R.id.pf_unorderlist /* 2131363779 */:
                    NewLinkEditFragment.h6(NewLinkEditFragment.this);
                    break;
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class f implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f82163b;

        f(boolean z10) {
            this.f82163b = z10;
        }

        @Override // com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment.b
        public void a(@dl.e String str) {
            if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29906, new Class[]{String.class}, Void.TYPE).isSupported && NewLinkEditFragment.this.isActive()) {
                NewLinkEditFragment.this.f82122q4 = com.max.hbutils.utils.n.q(str);
                int iQ = 100;
                if (NewLinkEditFragment.this.T3 != null) {
                    UserPostLimitsObj userPostLimitsObj = NewLinkEditFragment.this.T3;
                    kotlin.jvm.internal.f0.m(userPostLimitsObj);
                    if (com.max.hbutils.utils.n.q(userPostLimitsObj.getMax_pictures_num()) > 0) {
                        UserPostLimitsObj userPostLimitsObj2 = NewLinkEditFragment.this.T3;
                        kotlin.jvm.internal.f0.m(userPostLimitsObj2);
                        iQ = com.max.hbutils.utils.n.q(userPostLimitsObj2.getMax_pictures_num());
                    }
                }
                if (NewLinkEditFragment.this.f82122q4 >= iQ) {
                    kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
                    String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.max_pic_select_tips);
                    kotlin.jvm.internal.f0.o(strN0, "getString(R.string.max_pic_select_tips)");
                    String str2 = String.format(strN0, Arrays.copyOf(new Object[]{Integer.valueOf(iQ)}, 1));
                    kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
                    com.max.hbutils.utils.c.d(str2);
                    return;
                }
                int i10 = iQ - NewLinkEditFragment.this.f82122q4 < 9 ? iQ - NewLinkEditFragment.this.f82122q4 : 9;
                ImageModuleListActivity.a aVar = ImageModuleListActivity.f79943x1;
                Activity mContext = ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                Intent intentA = aVar.a(mContext, i10, true, null);
                if (this.f82163b) {
                    intentA.putExtra(ImageModuleListActivity.f79942p3, 3);
                }
                NewLinkEditFragment.this.startActivityForResult(intentA, 105);
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class f0 implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82165b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$f0$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: NewLinkEditFragment.kt */
            public static final class C0708a implements com.max.xiaoheihe.module.bbs.utils.c.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ NewLinkEditFragment f82166a;

                C0708a(NewLinkEditFragment newLinkEditFragment) {
                    this.f82166a = newLinkEditFragment;
                }

                @Override // com.max.xiaoheihe.module.bbs.utils.c.h
                public final void onFinish(boolean z10) {
                    if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29973, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    PostTabActivityViewModel postTabActivityViewModel = this.f82166a.f82142y4;
                    if (postTabActivityViewModel != null) {
                        postTabActivityViewModel.z();
                    }
                    NewLinkEditFragment.f6(this.f82166a);
                }
            }

            a(NewLinkEditFragment newLinkEditFragment) {
                this.f82165b = newLinkEditFragment;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0045  */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29972, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                NewLinkEditFragment.D5(this.f82165b);
                if (this.f82165b.f82091c4 != null) {
                    LoadingDialog loadingDialog = this.f82165b.f82091c4;
                    kotlin.jvm.internal.f0.m(loadingDialog);
                    if (!loadingDialog.i()) {
                        NewLinkEditFragment newLinkEditFragment = this.f82165b;
                        Activity mContext = ((com.max.hbcommon.base.d) newLinkEditFragment).mContext;
                        kotlin.jvm.internal.f0.o(mContext, "mContext");
                        newLinkEditFragment.f82091c4 = new LoadingDialog(mContext, this.f82165b.getString(R.string.commiting), true).r();
                    }
                } else {
                    NewLinkEditFragment newLinkEditFragment2 = this.f82165b;
                    Activity mContext2 = ((com.max.hbcommon.base.d) newLinkEditFragment2).mContext;
                    kotlin.jvm.internal.f0.o(mContext2, "mContext");
                    newLinkEditFragment2.f82091c4 = new LoadingDialog(mContext2, this.f82165b.getString(R.string.commiting), true).r();
                }
                com.max.xiaoheihe.module.bbs.utils.c.k(this.f82165b.f82111m4, this.f82165b.W3, new C0708a(this.f82165b), this.f82165b.f82115o4, this.f82165b.N3);
                androidx.localbroadcastmanager.content.a.b(((com.max.hbcommon.base.d) this.f82165b).mContext).d(new Intent(lb.a.Z));
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82167b;

            b(NewLinkEditFragment newLinkEditFragment) {
                this.f82167b = newLinkEditFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29974, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                PostTabActivityViewModel postTabActivityViewModel = this.f82167b.f82142y4;
                if (postTabActivityViewModel != null) {
                    postTabActivityViewModel.z();
                }
                NewLinkEditFragment.C5(this.f82167b);
                dialogInterface.dismiss();
                NewLinkEditFragment.f6(this.f82167b);
            }
        }

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class c implements com.max.xiaoheihe.module.bbs.utils.c.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82168a;

            c(NewLinkEditFragment newLinkEditFragment) {
                this.f82168a = newLinkEditFragment;
            }

            @Override // com.max.xiaoheihe.module.bbs.utils.c.h
            public final void onFinish(boolean z10) {
                if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29975, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                PostTabActivityViewModel postTabActivityViewModel = this.f82168a.f82142y4;
                if (postTabActivityViewModel != null) {
                    postTabActivityViewModel.z();
                }
                NewLinkEditFragment.S3(this.f82168a);
                NewLinkEditFragment.f6(this.f82168a);
            }
        }

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class d implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82169b;

            /* JADX INFO: compiled from: NewLinkEditFragment.kt */
            public static final class a implements com.max.xiaoheihe.module.bbs.utils.c.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ NewLinkEditFragment f82170a;

                a(NewLinkEditFragment newLinkEditFragment) {
                    this.f82170a = newLinkEditFragment;
                }

                @Override // com.max.xiaoheihe.module.bbs.utils.c.h
                public final void onFinish(boolean z10) {
                    if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29977, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    PostTabActivityViewModel postTabActivityViewModel = this.f82170a.f82142y4;
                    if (postTabActivityViewModel != null) {
                        postTabActivityViewModel.z();
                    }
                    NewLinkEditFragment.f6(this.f82170a);
                }
            }

            d(NewLinkEditFragment newLinkEditFragment) {
                this.f82169b = newLinkEditFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29976, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                NewLinkEditFragment.D5(this.f82169b);
                com.max.xiaoheihe.module.bbs.utils.c.k(this.f82169b.f82111m4, this.f82169b.W3, new a(this.f82169b), this.f82169b.f82115o4, this.f82169b.N3);
                androidx.localbroadcastmanager.content.a.b(((com.max.hbcommon.base.d) this.f82169b).mContext).d(new Intent(lb.a.Z));
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class e implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82171b;

            e(NewLinkEditFragment newLinkEditFragment) {
                this.f82171b = newLinkEditFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29978, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                PostTabActivityViewModel postTabActivityViewModel = this.f82171b.f82142y4;
                if (postTabActivityViewModel != null) {
                    postTabActivityViewModel.z();
                }
                NewLinkEditFragment.C5(this.f82171b);
                NewLinkEditFragment.S3(this.f82171b);
                dialogInterface.dismiss();
                NewLinkEditFragment.f6(this.f82171b);
            }
        }

        f0() {
        }

        @Override // com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment.b
        public void a(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29971, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (NewLinkEditFragment.this.f82093d4 != null) {
                HtmlLinkContentObj htmlLinkContentObj = NewLinkEditFragment.this.f82093d4;
                kotlin.jvm.internal.f0.m(htmlLinkContentObj);
                if (!com.max.hbcommon.utils.c.u(htmlLinkContentObj.getContent())) {
                    NewLinkEditFragment.this.f82109l4 = true;
                    NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
                    String strP = com.max.hbutils.utils.k.p(newLinkEditFragment.f82093d4);
                    kotlin.jvm.internal.f0.o(strP, "serialize(mLocalContent)");
                    HtmlLinkContentObj htmlLinkContentObj2 = NewLinkEditFragment.this.f82093d4;
                    kotlin.jvm.internal.f0.m(htmlLinkContentObj2);
                    NewLinkEditFragment.g6(newLinkEditFragment, strP, htmlLinkContentObj2.getTitle());
                    if (NewLinkEditFragment.this.Y3 != null && !kotlin.jvm.internal.f0.g(NewLinkEditFragment.this.Y3, NewLinkEditFragment.this.f82111m4)) {
                        new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext).y(com.max.xiaoheihe.utils.d.n0(R.string.save_draft_confirm)).u(com.max.xiaoheihe.utils.d.n0(R.string.save), new a(NewLinkEditFragment.this)).o(com.max.xiaoheihe.utils.d.n0(R.string.not_save), new b(NewLinkEditFragment.this)).F();
                        return;
                    }
                    if (NewLinkEditFragment.this.Y3 == null) {
                        new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext).y(com.max.xiaoheihe.utils.d.n0(R.string.save_draft_confirm)).u(com.max.xiaoheihe.utils.d.n0(R.string.save), new d(NewLinkEditFragment.this)).o(com.max.xiaoheihe.utils.d.n0(R.string.not_save), new e(NewLinkEditFragment.this)).F();
                        return;
                    } else {
                        if (NewLinkEditFragment.this.W3) {
                            com.max.xiaoheihe.module.bbs.utils.c.k(NewLinkEditFragment.this.Y3, NewLinkEditFragment.this.W3, new c(NewLinkEditFragment.this), NewLinkEditFragment.this.f82115o4, NewLinkEditFragment.this.N3);
                            androidx.localbroadcastmanager.content.a.b(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext).d(new Intent(lb.a.Z));
                            return;
                        }
                        return;
                    }
                }
            }
            PostTabActivityViewModel postTabActivityViewModel = NewLinkEditFragment.this.f82142y4;
            if (postTabActivityViewModel != null) {
                postTabActivityViewModel.z();
            }
            NewLinkEditFragment.f6(NewLinkEditFragment.this);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class g implements oe.t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // oe.t
        public void onCancel() {
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 29907, new Class[]{ArrayList.class}, Void.TYPE).isSupported || arrayList == null || arrayList.size() <= 0) {
                return;
            }
            com.max.mediaselector.e.m(FileProvider.f(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext, "com.max.xiaoheihe.fileprovider", new File(arrayList.get(0).G())), ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext, 1002, NewLinkEditFragment.U3(NewLinkEditFragment.this), 900, 480);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class g0 implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29979, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            NewLinkEditFragment.V3(NewLinkEditFragment.this);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82179c;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a<T> implements ValueCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<T> f82180a = new a<>();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public final void a(String str) {
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29909, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a((String) obj);
            }
        }

        h(String str) {
            this.f82179c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29908, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebView webView = NewLinkEditFragment.this.f82112n;
            if (webView == null) {
                kotlin.jvm.internal.f0.S("mWebView");
                webView = null;
            }
            webView.evaluateJavascript(this.f82179c, a.f82180a);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class h0 implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29980, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            NewLinkEditFragment.G6(NewLinkEditFragment.this, false, 1, null);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class i extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        i(int i10) {
            super(i10);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View arg0) {
            if (PatchProxy.proxy(new Object[]{arg0}, this, changeQuickRedirect, false, 29910, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(arg0, "arg0");
            ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext.startActivity(DraftListActivity.z2(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext));
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class i0 implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment.b
        public void a(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, PushConsts.ALIAS_INVALID, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("NewLinkEditFragment, openChooseTopicDialog, value = " + str + ", mLocalContent = " + NewLinkEditFragment.this.f82093d4);
            com.max.xiaoheihe.module.bbs.post_edit.a.C0713a c0713a = com.max.xiaoheihe.module.bbs.post_edit.a.E;
            FragmentManager childFragmentManager = NewLinkEditFragment.this.getChildFragmentManager();
            kotlin.jvm.internal.f0.o(childFragmentManager, "childFragmentManager");
            io.reactivex.disposables.a compositeDisposable = NewLinkEditFragment.this.getCompositeDisposable();
            kotlin.jvm.internal.f0.o(compositeDisposable, "compositeDisposable");
            NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
            ArrayList<BBSTopicObj> arrayList = newLinkEditFragment.f82085a4;
            com.max.xiaoheihe.module.bbs.post_edit.i iVar = NewLinkEditFragment.this.X;
            if (iVar == null) {
                kotlin.jvm.internal.f0.S("linkEditHashTagManager");
                iVar = null;
            }
            List<String> listI = iVar.i();
            String strD4 = NewLinkEditFragment.d4(NewLinkEditFragment.this);
            HtmlLinkContentObj htmlLinkContentObj = NewLinkEditFragment.this.f82093d4;
            String title = htmlLinkContentObj != null ? htmlLinkContentObj.getTitle() : null;
            HtmlLinkContentObj htmlLinkContentObj2 = NewLinkEditFragment.this.f82093d4;
            c0713a.i(childFragmentManager, compositeDisposable, newLinkEditFragment, arrayList, listI, strD4, title, htmlLinkContentObj2 != null ? htmlLinkContentObj2.getText() : null);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29911, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            NewLinkEditFragment.this.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class j0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, PushConsts.ALIAS_SN_INVALID, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            NewLinkEditFragment.e6(NewLinkEditFragment.this);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f82189d;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a<T> implements ValueCallback {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82190a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f82191b;

            a(NewLinkEditFragment newLinkEditFragment, b bVar) {
                this.f82190a = newLinkEditFragment;
                this.f82191b = bVar;
            }

            public final void a(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29913, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.utils.d.b(NewLinkEditFragment.N4, "onReceiveValue==" + str);
                this.f82190a.f82093d4 = (HtmlLinkContentObj) com.max.hbutils.utils.k.a(str, HtmlLinkContentObj.class);
                b bVar = this.f82191b;
                if (bVar != null) {
                    bVar.a(str);
                }
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29914, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a((String) obj);
            }
        }

        k(String str, b bVar) {
            this.f82188c = str;
            this.f82189d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29912, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebView webView = NewLinkEditFragment.this.f82112n;
            if (webView == null) {
                kotlin.jvm.internal.f0.S("mWebView");
                webView = null;
            }
            webView.evaluateJavascript(this.f82188c, new a(NewLinkEditFragment.this, this.f82189d));
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class k0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30009, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            NewLinkEditFragment.this.Y = 0;
            NewLinkEditFragment.T3(NewLinkEditFragment.this);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class l implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f82195d;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a<T> implements ValueCallback {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f82196a;

            a(b bVar) {
                this.f82196a = bVar;
            }

            public final void a(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29916, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.utils.d.b(NewLinkEditFragment.N4, "onReceiveValue==" + str);
                b bVar = this.f82196a;
                if (bVar != null) {
                    bVar.a(str);
                }
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29917, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a((String) obj);
            }
        }

        l(String str, b bVar) {
            this.f82194c = str;
            this.f82195d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29915, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebView webView = NewLinkEditFragment.this.f82112n;
            if (webView == null) {
                kotlin.jvm.internal.f0.S("mWebView");
                webView = null;
            }
            webView.evaluateJavascript(this.f82194c, new a(this.f82195d));
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class l0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a implements b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82198a;

            a(NewLinkEditFragment newLinkEditFragment) {
                this.f82198a = newLinkEditFragment;
            }

            @Override // com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment.b
            public void a(@dl.e String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30011, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                w0 w0VarB4 = NewLinkEditFragment.b4(this.f82198a);
                if (w0VarB4.f() != PostCheckReason.CHECK_PASS) {
                    PostUtils.f81983a.q(PostType.Article, w0VarB4.f(), this.f82198a.A4, this.f82198a.B4);
                    if (com.max.hbcommon.utils.c.u(w0VarB4.e())) {
                        return;
                    }
                    com.max.hbutils.utils.c.f(w0VarB4.e());
                    return;
                }
                if (PostUtils.f81983a.k(this.f82198a.Y)) {
                    NewLinkEditFragment.u5(this.f82198a);
                } else {
                    NewLinkEditFragment.T3(this.f82198a);
                }
            }
        }

        l0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30010, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - NewLinkEditFragment.this.f82107k4 > 1000) {
                NewLinkEditFragment.this.f82107k4 = jCurrentTimeMillis;
                if (com.max.xiaoheihe.utils.i0.s() && com.max.xiaoheihe.utils.i0.d(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext)) {
                    if (NewLinkEditFragment.this.f82115o4 && com.max.hbcommon.utils.c.w(NewLinkEditFragment.this.f82085a4)) {
                        PostUtils.f81983a.q(PostType.Article, PostCheckReason.TOAST_NO_TOPIC, NewLinkEditFragment.this.A4, NewLinkEditFragment.this.B4);
                        com.max.hbutils.utils.c.f(NewLinkEditFragment.this.getString(R.string.choose_topic));
                    } else {
                        NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
                        NewLinkEditFragment.Z3(newLinkEditFragment, new a(newLinkEditFragment));
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class m extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        public void onNext(@dl.d Result<UserPostLimitsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29927, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (NewLinkEditFragment.this.isActive()) {
                super.onNext(result);
                NewLinkEditFragment.this.T3 = result.getResult();
                if (NewLinkEditFragment.this.T3 == null) {
                    return;
                }
                UserPostLimitsObj userPostLimitsObj = NewLinkEditFragment.this.T3;
                kotlin.jvm.internal.f0.m(userPostLimitsObj);
                if (userPostLimitsObj.isCan_post_link()) {
                    ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mTitleBar.getAppbarActionTextView().setEnabled(true);
                    return;
                }
                ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mTitleBar.getAppbarActionTextView().setEnabled(false);
                PostUtils.f81983a.q(PostType.Article, PostCheckReason.TOAST_POST_LIMIT_NOT_ALLOW, NewLinkEditFragment.this.A4, NewLinkEditFragment.this.B4);
                UserPostLimitsObj userPostLimitsObj2 = NewLinkEditFragment.this.T3;
                kotlin.jvm.internal.f0.m(userPostLimitsObj2);
                if (com.max.hbcommon.utils.c.u(userPostLimitsObj2.getMsg_post_link())) {
                    return;
                }
                UserPostLimitsObj userPostLimitsObj3 = NewLinkEditFragment.this.T3;
                kotlin.jvm.internal.f0.m(userPostLimitsObj3);
                com.max.hbutils.utils.c.d(userPostLimitsObj3.getMsg_post_link());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29928, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class m0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicIndexObj f82201c;

        m0(BBSTopicIndexObj bBSTopicIndexObj) {
            this.f82201c = bBSTopicIndexObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30012, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.k0(mContext, this.f82201c.getTips().getProtocol());
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class n extends com.max.hbcommon.network.d<Result<BBSTopicIndexObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29929, new Class[0], Void.TYPE).isSupported && NewLinkEditFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29930, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (NewLinkEditFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<BBSTopicIndexObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29931, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (NewLinkEditFragment.this.isActive()) {
                super.onNext(result);
                NewLinkEditFragment.this.f82126s4 = result.getResult();
                NewLinkEditFragment.w5(NewLinkEditFragment.this);
                NewLinkEditFragment.N3(NewLinkEditFragment.this);
                NewLinkEditFragment.M3(NewLinkEditFragment.this);
                NewLinkEditFragment.O3(NewLinkEditFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29932, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicIndexObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class n0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82204a;

            a(NewLinkEditFragment newLinkEditFragment) {
                this.f82204a = newLinkEditFragment;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 30014, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f82204a.L3 = keyDescObj.getKey();
                NewLinkEditFragment.y5(this.f82204a);
            }
        }

        n0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30013, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setDesc(NewLinkEditFragment.this.getString(R.string.not_selected));
            keyDescObj.setChecked(NewLinkEditFragment.this.L3 == null);
            arrayList.add(keyDescObj);
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setDesc(NewLinkEditFragment.this.getString(R.string.auth_granted));
            keyDescObj2.setKey("1");
            keyDescObj2.setChecked(kotlin.jvm.internal.f0.g(NewLinkEditFragment.this.L3, keyDescObj2.getKey()));
            arrayList.add(keyDescObj2);
            KeyDescObj keyDescObj3 = new KeyDescObj();
            keyDescObj3.setDesc(NewLinkEditFragment.this.getString(R.string.auth_denied));
            keyDescObj3.setKey("2");
            keyDescObj3.setChecked(kotlin.jvm.internal.f0.g(NewLinkEditFragment.this.L3, keyDescObj3.getKey()));
            arrayList.add(keyDescObj3);
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(NewLinkEditFragment.this.getViewContext(), arrayList);
            heyBoxPopupMenu.R(new a(NewLinkEditFragment.this));
            heyBoxPopupMenu.show();
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class o extends com.max.hbcommon.network.d<Result<TopicListInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        public void onNext(@dl.d Result<TopicListInfoObj> result) {
            ArrayList arrayList;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29933, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (NewLinkEditFragment.this.isActive() && (arrayList = NewLinkEditFragment.this.f82085a4) != null) {
                NewLinkEditFragment newLinkEditFragment = NewLinkEditFragment.this;
                TopicListInfoObj result2 = result.getResult();
                List<BBSTopicObj> topic_infos = result2 != null ? result2.getTopic_infos() : null;
                if (!com.max.hbcommon.utils.c.w(topic_infos)) {
                    kotlin.jvm.internal.f0.m(topic_infos);
                    for (BBSTopicObj bBSTopicObj : topic_infos) {
                        if (arrayList.contains(bBSTopicObj)) {
                            Object obj = arrayList.get(arrayList.indexOf(bBSTopicObj));
                            kotlin.jvm.internal.f0.o(obj, "topics[topics.indexOf(data)]");
                            BBSTopicObj bBSTopicObj2 = (BBSTopicObj) obj;
                            bBSTopicObj2.setName(bBSTopicObj.getName());
                            bBSTopicObj2.setPic_url(bBSTopicObj.getPic_url());
                        } else {
                            arrayList.add(bBSTopicObj);
                        }
                        com.max.xiaoheihe.module.bbs.b0.f80775b.a().c(bBSTopicObj);
                    }
                }
                newLinkEditFragment.j1();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29934, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicListInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class o0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82207a;

            a(NewLinkEditFragment newLinkEditFragment) {
                this.f82207a = newLinkEditFragment;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 30016, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f82207a.K3 = keyDescObj.getKey();
                NewLinkEditFragment.z5(this.f82207a);
            }
        }

        o0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30015, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setDesc(NewLinkEditFragment.this.getString(R.string.not_selected));
            keyDescObj.setChecked(NewLinkEditFragment.this.K3 == null);
            arrayList.add(keyDescObj);
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setDesc(NewLinkEditFragment.this.getString(R.string.auth_tips_1));
            keyDescObj2.setKey("1");
            keyDescObj2.setChecked(kotlin.jvm.internal.f0.g(NewLinkEditFragment.this.K3, keyDescObj2.getKey()));
            arrayList.add(keyDescObj2);
            KeyDescObj keyDescObj3 = new KeyDescObj();
            keyDescObj3.setDesc(NewLinkEditFragment.this.getString(R.string.auth_tips_2));
            keyDescObj3.setKey("2");
            keyDescObj3.setChecked(kotlin.jvm.internal.f0.g(NewLinkEditFragment.this.K3, keyDescObj3.getKey()));
            arrayList.add(keyDescObj3);
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(NewLinkEditFragment.this.getViewContext(), arrayList);
            heyBoxPopupMenu.R(new a(NewLinkEditFragment.this));
            heyBoxPopupMenu.show();
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class p implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
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
        public void c(@dl.d String[] urls, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{urls, str}, this, changeQuickRedirect, false, 29935, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(urls, "urls");
            if (NewLinkEditFragment.this.G3 != null) {
                LinkImageObj linkImageObj = NewLinkEditFragment.this.G3;
                kotlin.jvm.internal.f0.m(linkImageObj);
                linkImageObj.setUrl(urls[0]);
            }
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.e String str) {
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class p0 implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        p0() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0039  */
        @Override // com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment.b
        public void a(@dl.e String str) {
            boolean z10;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30017, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (NewLinkEditFragment.this.f82093d4 != null) {
                HtmlLinkContentObj htmlLinkContentObj = NewLinkEditFragment.this.f82093d4;
                kotlin.jvm.internal.f0.m(htmlLinkContentObj);
                z10 = com.max.hbcommon.utils.c.u(htmlLinkContentObj.getTitle()) ? false : true;
            }
            TextView textView = NewLinkEditFragment.this.f82129u;
            TextView textView2 = null;
            if (textView == null) {
                kotlin.jvm.internal.f0.S("tv_preview_title");
                textView = null;
            }
            textView.setVisibility(z10 ? 0 : 8);
            View view = NewLinkEditFragment.this.f82131v;
            if (view == null) {
                kotlin.jvm.internal.f0.S("vg_preview_title_placeholder");
                view = null;
            }
            view.setVisibility(z10 ? 8 : 0);
            if (z10) {
                TextView textView3 = NewLinkEditFragment.this.f82129u;
                if (textView3 == null) {
                    kotlin.jvm.internal.f0.S("tv_preview_title");
                } else {
                    textView2 = textView3;
                }
                HtmlLinkContentObj htmlLinkContentObj2 = NewLinkEditFragment.this.f82093d4;
                kotlin.jvm.internal.f0.m(htmlLinkContentObj2);
                textView2.setText(htmlLinkContentObj2.getTitle());
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class q implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<LinkImageObj> f82237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NewLinkEditFragment f82238b;

        /* JADX WARN: Multi-variable type inference failed */
        q(List<? extends LinkImageObj> list, NewLinkEditFragment newLinkEditFragment) {
            this.f82237a = list;
            this.f82238b = newLinkEditFragment;
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
        public void c(@dl.d String[] urls, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{urls, str}, this, changeQuickRedirect, false, 29936, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(urls, "urls");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = urls.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (com.max.hbcommon.utils.c.u(urls[i10])) {
                    if (!this.f82238b.Z3.contains(this.f82237a.get(i10))) {
                        this.f82238b.Z3.add(this.f82237a.get(i10));
                    }
                    LinkImageObj linkImageObj = new LinkImageObj();
                    linkImageObj.setId(this.f82237a.get(i10).getId());
                    arrayList2.add(linkImageObj);
                } else {
                    LinkImageObj linkImageObj2 = new LinkImageObj();
                    linkImageObj2.setId(this.f82237a.get(i10).getId());
                    linkImageObj2.setUrl(urls[i10]);
                    linkImageObj2.setWidth(this.f82237a.get(i10).getWidth());
                    linkImageObj2.setHeight(this.f82237a.get(i10).getHeight());
                    arrayList.add(linkImageObj2);
                    if (this.f82238b.Z3.contains(this.f82237a.get(i10))) {
                        this.f82238b.Z3.remove(this.f82237a.get(i10));
                    }
                }
            }
            if (!com.max.hbcommon.utils.c.w(arrayList)) {
                NewLinkEditFragment.m6(this.f82238b, com.max.hbutils.utils.k.p(arrayList));
            }
            if (com.max.hbcommon.utils.c.w(arrayList2)) {
                return;
            }
            NewLinkEditFragment.l6(this.f82238b, com.max.hbutils.utils.k.p(arrayList2));
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.e String str) {
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class q0 implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f82239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f82240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NewLinkEditFragment f82241c;

        q0(Ref.IntRef intRef, int i10, NewLinkEditFragment newLinkEditFragment) {
            this.f82239a = intRef;
            this.f82240b = i10;
            this.f82241c = newLinkEditFragment;
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public final void a(View view, int i10, int i11, int i12) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30018, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i12 == 0) {
                if (Math.abs(this.f82239a.f124889b) >= this.f82240b) {
                    NewLinkEditFragment.i5(this.f82241c);
                }
                this.f82239a.f124889b = 0;
            } else {
                this.f82239a.f124889b += i10 - i11;
            }
            Log.d("VerticalScroll", "scrollY: " + i10 + "  oldScrollY: " + i11 + "  scrollState: " + i12);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class r implements androidx.lifecycle.j0<PostCompilationItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{postCompilationItemObj}, this, changeQuickRedirect, false, 29938, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(postCompilationItemObj);
        }

        public final void b(@dl.e PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{postCompilationItemObj}, this, changeQuickRedirect, false, 29937, new Class[]{PostCompilationItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            NewLinkEditFragment.this.H4 = postCompilationItemObj;
            LinkDraftObj linkDraftObj = NewLinkEditFragment.this.f82111m4;
            if (linkDraftObj == null) {
                return;
            }
            PostCompilationItemObj postCompilationItemObj2 = NewLinkEditFragment.this.H4;
            linkDraftObj.setCompilation_obj_id(postCompilationItemObj2 != null ? postCompilationItemObj2.getObj_id() : null);
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class r0 implements MessageQueue.IdleHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        r0() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30019, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (NewLinkEditFragment.this.A == null) {
                kotlin.jvm.internal.f0.S("sv_container");
            }
            ConsecutiveScrollerLayout consecutiveScrollerLayout = NewLinkEditFragment.this.A;
            View view = null;
            if (consecutiveScrollerLayout == null) {
                kotlin.jvm.internal.f0.S("sv_container");
                consecutiveScrollerLayout = null;
            }
            View view2 = NewLinkEditFragment.this.B;
            if (view2 == null) {
                kotlin.jvm.internal.f0.S("vg_article_preview");
            } else {
                view = view2;
            }
            consecutiveScrollerLayout.y0(view);
            return false;
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class s implements androidx.lifecycle.j0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 29940, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public final void b(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 29939, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            PostTabActivityViewModel postTabActivityViewModel = NewLinkEditFragment.this.f82142y4;
            if ((postTabActivityViewModel == null || postTabActivityViewModel.h().f() == PostType.Article) && num != null && num.intValue() == 1) {
                NewLinkEditFragment.e6(NewLinkEditFragment.this);
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class s0 implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyBoxPopupMenu f82246b;

        s0(HeyBoxPopupMenu heyBoxPopupMenu) {
            this.f82246b = heyBoxPopupMenu;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 30020, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            SettingItemView settingItemView = NewLinkEditFragment.this.Q;
            if (settingItemView == null) {
                kotlin.jvm.internal.f0.S("siv_article_type");
                settingItemView = null;
            }
            settingItemView.setRightDesc(keyDescObj.getDesc());
            NewLinkEditFragment.this.f82119p3 = keyDescObj.getKey();
            NewLinkEditFragment.x5(NewLinkEditFragment.this);
            NewLinkEditFragment.G5(NewLinkEditFragment.this);
            this.f82246b.dismiss();
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class t implements androidx.lifecycle.j0<PostType> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PostTabActivityViewModel f82253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NewLinkEditFragment f82254b;

        t(PostTabActivityViewModel postTabActivityViewModel, NewLinkEditFragment newLinkEditFragment) {
            this.f82253a = postTabActivityViewModel;
            this.f82254b = newLinkEditFragment;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(PostType postType) {
            if (PatchProxy.proxy(new Object[]{postType}, this, changeQuickRedirect, false, 29944, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(postType);
        }

        public final void b(PostType postType) {
            if (!PatchProxy.proxy(new Object[]{postType}, this, changeQuickRedirect, false, 29943, new Class[]{PostType.class}, Void.TYPE).isSupported && postType == PostType.Article) {
                this.f82253a.L(this.f82254b.Q0());
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class t0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EditText f82257d;

        t0(String str, EditText editText) {
            this.f82256c = str;
            this.f82257d = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30021, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            NewLinkEditFragment.l5(NewLinkEditFragment.this, this.f82256c, this.f82257d.getText().toString());
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class u implements androidx.lifecycle.j0<com.max.xiaoheihe.module.bbs.post_edit.e> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostTabActivityViewModel f82259b;

        u(PostTabActivityViewModel postTabActivityViewModel) {
            this.f82259b = postTabActivityViewModel;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(com.max.xiaoheihe.module.bbs.post_edit.e eVar) {
            if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 29946, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(eVar);
        }

        public final void b(@dl.e com.max.xiaoheihe.module.bbs.post_edit.e eVar) {
            if (!PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 29945, new Class[]{com.max.xiaoheihe.module.bbs.post_edit.e.class}, Void.TYPE).isSupported && eVar != null && NewLinkEditFragment.this.isActive() && this.f82259b.h().f() == PostType.Article) {
                NewLinkEditFragment.q5(NewLinkEditFragment.this, eVar);
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class u0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u0 f82260b = new u0();
        public static ChangeQuickRedirect changeQuickRedirect;

        u0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30022, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class v implements androidx.lifecycle.j0<Pair<? extends Boolean, ? extends Uri>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PostTabActivityViewModel f82261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NewLinkEditFragment f82262b;

        v(PostTabActivityViewModel postTabActivityViewModel, NewLinkEditFragment newLinkEditFragment) {
            this.f82261a = postTabActivityViewModel;
            this.f82262b = newLinkEditFragment;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Pair<? extends Boolean, ? extends Uri> pair) {
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 29948, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(pair);
        }

        public final void b(@dl.d Pair<Boolean, ? extends Uri> gameShotPostToolEvent) {
            if (PatchProxy.proxy(new Object[]{gameShotPostToolEvent}, this, changeQuickRedirect, false, 29947, new Class[]{Pair.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(gameShotPostToolEvent, "gameShotPostToolEvent");
            if (this.f82261a.h().f() == PostType.Article) {
                NewLinkEditFragment.r5(this.f82262b, gameShotPostToolEvent.e().booleanValue(), gameShotPostToolEvent.f());
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class v0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f82264c;

        v0(BBSTopicObj bBSTopicObj) {
            this.f82264c = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30027, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = NewLinkEditFragment.this.f82085a4;
            if (arrayList != null) {
                arrayList.remove(this.f82264c);
            }
            NewLinkEditFragment.this.j1();
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class w implements androidx.lifecycle.j0<PostToolsV2TabType> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PostTabActivityViewModel f82265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NewLinkEditFragment f82266b;

        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f82267a;

            static {
                int[] iArr = new int[PostToolsV2TabType.valuesCustom().length];
                try {
                    iArr[PostToolsV2TabType.GALLERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PostToolsV2TabType.GAME_SHOT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PostToolsV2TabType.TEMPLATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f82267a = iArr;
            }
        }

        w(PostTabActivityViewModel postTabActivityViewModel, NewLinkEditFragment newLinkEditFragment) {
            this.f82265a = postTabActivityViewModel;
            this.f82266b = newLinkEditFragment;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(PostToolsV2TabType postToolsV2TabType) {
            if (PatchProxy.proxy(new Object[]{postToolsV2TabType}, this, changeQuickRedirect, false, 29950, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(postToolsV2TabType);
        }

        public final void b(PostToolsV2TabType postToolsV2TabType) {
            if (!PatchProxy.proxy(new Object[]{postToolsV2TabType}, this, changeQuickRedirect, false, 29949, new Class[]{PostToolsV2TabType.class}, Void.TYPE).isSupported && this.f82265a.h().f() == PostType.Article) {
                JsonObject jsonObject = new JsonObject();
                int i10 = postToolsV2TabType == null ? -1 : a.f82267a[postToolsV2TabType.ordinal()];
                if (i10 == 1) {
                    jsonObject.addProperty("tab", (Number) 1);
                } else if (i10 == 2) {
                    jsonObject.addProperty("tab", (Number) 2);
                } else if (i10 == 3) {
                    jsonObject.addProperty("tab", (Number) 3);
                }
                if (this.f82266b.Y == 11 || this.f82266b.Y == 12 || this.f82266b.Y == 14) {
                    jsonObject.addProperty("post_type", "2");
                } else {
                    jsonObject.addProperty("post_type", "1");
                }
                com.max.hbcommon.analytics.d.d("4", lb.d.Q0, null, jsonObject);
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29951, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext.startActivity(DraftListActivity.z2(((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext));
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29952, new Class[]{View.class}, Void.TYPE).isSupported && (((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext instanceof PostTabActivity)) {
                Activity activity = ((com.max.hbcommon.base.d) NewLinkEditFragment.this).mContext;
                kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity");
                ((PostTabActivity) activity).C2();
            }
        }
    }

    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    public static final class z implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 29953, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            NewLinkEditFragment.p5(NewLinkEditFragment.this);
            NewLinkEditFragment.I7(NewLinkEditFragment.this, null, 1, null);
            return false;
        }
    }

    public static final /* synthetic */ void A5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29878, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.e8();
    }

    private final void A6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29730, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.localbroadcastmanager.content.a.b(this.mContext).d(new Intent(lb.a.Z));
        LinkDraftObj linkDraftObj = this.f82111m4;
        kotlin.jvm.internal.f0.m(linkDraftObj);
        com.max.xiaoheihe.module.bbs.utils.c.a(linkDraftObj.getLocal_link_id());
    }

    private final void A7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29778, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("hb_editor.execute.insertGame(%s);", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
    }

    private final void A8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29698, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PostSettingObj postSettingObjF7 = F7();
        PostSettingDialogFragment.a aVar = PostSettingDialogFragment.f83089t;
        PostType postType = PostType.Article;
        BBSTopicIndexObj bBSTopicIndexObj = this.f82126s4;
        String plan_protocol = bBSTopicIndexObj != null ? bBSTopicIndexObj.getPlan_protocol() : null;
        long j10 = this.O3;
        Bundle arguments = getArguments();
        Boolean boolValueOf = Boolean.valueOf(arguments != null ? arguments.getBoolean(PostTabActivity.G2) : false);
        BBSTopicIndexObj bBSTopicIndexObj2 = this.f82126s4;
        String post_article_plan_notice = bBSTopicIndexObj2 != null ? bBSTopicIndexObj2.getPost_article_plan_notice() : null;
        BBSTopicIndexObj bBSTopicIndexObj3 = this.f82126s4;
        aVar.a(postType, postSettingObjF7, plan_protocol, j10, boolValueOf, post_article_plan_notice, Boolean.valueOf(com.max.hbcommon.utils.c.x(bBSTopicIndexObj3 != null ? bBSTopicIndexObj3.getAllow_schedule() : null))).show(getChildFragmentManager(), "PostSettingDialogFragment");
    }

    public static final /* synthetic */ void B5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29875, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.f8();
    }

    private final void B6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29735, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C6(null, null);
    }

    private final void B7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29783, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("hb_editor.execute.insertImage(%s);", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
    }

    private final void B8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29714, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z0 z0Var = this.f82113n4;
        if (z0Var == null) {
            kotlin.jvm.internal.f0.S("mSuperOnBackPressed");
            z0Var = null;
        }
        z0Var.a0();
    }

    public static final /* synthetic */ void C5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29855, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.g8();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0274  */
    /* JADX WARN: Code duplicated, block: B:98:0x026e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    @SuppressLint({"AutoDispose"})
    private final void C6(String str, String str2) {
        LinkInfoObj linkInfoObj;
        Object objValueOf;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29736, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f82091c4;
        if (loadingDialog != null) {
            kotlin.jvm.internal.f0.m(loadingDialog);
            if (!loadingDialog.i()) {
                Activity mContext = this.mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                this.f82091c4 = new LoadingDialog(mContext, getString(R.string.commiting), true).r();
            }
        } else {
            Activity mContext2 = this.mContext;
            kotlin.jvm.internal.f0.o(mContext2, "mContext");
            this.f82091c4 = new LoadingDialog(mContext2, getString(R.string.commiting), true).r();
        }
        String strG7 = g7();
        String strB7 = b7();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap(16);
        ArrayList arrayList = new ArrayList();
        if (this.f82093d4 != null) {
            BBSTextObj bBSTextObj = new BBSTextObj();
            bBSTextObj.setType(LinkDraftObj.DRAFT_TYPE_HTML);
            HtmlLinkContentObj htmlLinkContentObj = this.f82093d4;
            kotlin.jvm.internal.f0.m(htmlLinkContentObj);
            bBSTextObj.setText(htmlLinkContentObj.getContent());
            arrayList.add(bBSTextObj);
            if (!com.max.hbcommon.utils.c.u(this.Z) && kotlin.jvm.internal.f0.g("11", this.Z)) {
                HtmlLinkContentObj htmlLinkContentObj2 = this.f82093d4;
                kotlin.jvm.internal.f0.m(htmlLinkContentObj2);
                if (htmlLinkContentObj2.getDesc() != null) {
                    HtmlLinkContentObj htmlLinkContentObj3 = this.f82093d4;
                    kotlin.jvm.internal.f0.m(htmlLinkContentObj3);
                    String desc = htmlLinkContentObj3.getDesc();
                    kotlin.jvm.internal.f0.m(desc);
                    objValueOf = Integer.valueOf(desc.length());
                } else {
                    objValueOf = "0";
                }
                map2.put("words_count", objValueOf.toString());
            }
            HtmlLinkContentObj htmlLinkContentObj4 = this.f82093d4;
            kotlin.jvm.internal.f0.m(htmlLinkContentObj4);
            for (BBSTextObj bBSTextObj2 : htmlLinkContentObj4.getImgs()) {
                BBSTextObj bBSTextObj3 = new BBSTextObj();
                bBSTextObj3.setUrl(bBSTextObj2.getUrl());
                bBSTextObj3.setType(SocialConstants.PARAM_IMG_URL);
                bBSTextObj3.setWidth(bBSTextObj2.getWidth());
                bBSTextObj3.setHeight(bBSTextObj2.getHeight());
                arrayList.add(bBSTextObj3);
            }
            map2.put("text", com.max.hbutils.utils.k.p(arrayList));
            HtmlLinkContentObj htmlLinkContentObj5 = this.f82093d4;
            kotlin.jvm.internal.f0.m(htmlLinkContentObj5);
            map2.put(SocialConstants.PARAM_APP_DESC, htmlLinkContentObj5.getDesc());
            HtmlLinkContentObj htmlLinkContentObj6 = this.f82093d4;
            kotlin.jvm.internal.f0.m(htmlLinkContentObj6);
            if (!com.max.hbcommon.utils.c.u(htmlLinkContentObj6.getTitle())) {
                HtmlLinkContentObj htmlLinkContentObj7 = this.f82093d4;
                kotlin.jvm.internal.f0.m(htmlLinkContentObj7);
                map2.put("title", htmlLinkContentObj7.getTitle());
            }
            com.max.xiaoheihe.module.bbs.post_edit.i iVar = this.X;
            if (iVar == null) {
                kotlin.jvm.internal.f0.S("linkEditHashTagManager");
                iVar = null;
            }
            iVar.d(map2, this.f82093d4);
        }
        if (PostUtils.f81983a.k(this.Y)) {
            KeyDescObj keyDescObjF7 = f7();
            if (keyDescObjF7 != null) {
                map2.put("post_plan", keyDescObjF7.getKey());
            }
            if (com.max.hbcommon.utils.c.u(this.Z)) {
                this.Z = "1";
                map2.put("link_tag", "1");
            } else {
                map2.put("link_tag", this.Z);
            }
            if (!com.max.hbcommon.utils.c.u(strG7)) {
                map2.put("topic_ids", strG7);
            }
            map2.put("post_type", "3");
            LinkImageObj linkImageObj = this.G3;
            if (linkImageObj != null) {
                kotlin.jvm.internal.f0.m(linkImageObj);
                if (linkImageObj.getUrl() != null) {
                    LinkImageObj linkImageObj2 = this.G3;
                    kotlin.jvm.internal.f0.m(linkImageObj2);
                    map2.put("thumb", linkImageObj2.getUrl());
                }
            }
            if (!com.max.hbcommon.utils.c.u(this.f82119p3)) {
                map2.put(MallPriceObj.TYPE_ORIGINAL, this.f82119p3);
            }
            if (kotlin.jvm.internal.f0.g("1", this.f82119p3)) {
                if (!com.max.hbcommon.utils.c.u(this.K3)) {
                    map2.put("declaration", this.K3);
                }
            } else if (kotlin.jvm.internal.f0.g("0", this.f82119p3)) {
                TextView textView = this.f82108l;
                if (textView == null) {
                    kotlin.jvm.internal.f0.S("et_reference");
                    textView = null;
                }
                String string = textView.getText().toString();
                if (!com.max.hbcommon.utils.c.u(string)) {
                    map2.put("source", string);
                }
                if (!com.max.hbcommon.utils.c.u(this.L3)) {
                    map2.put("declaration", this.L3);
                }
            }
        } else {
            if (com.max.hbcommon.utils.c.u(this.Z)) {
                ArrayList<BBSTopicObj> arrayList2 = this.f82085a4;
                kotlin.jvm.internal.f0.m(arrayList2);
                String str3 = (arrayList2.size() > 0 || this.f82115o4) ? "1" : "21";
                this.Z = str3;
                map2.put("link_tag", str3);
            } else if (kotlin.jvm.internal.f0.g(this.Z, "1") || kotlin.jvm.internal.f0.g(this.Z, "21")) {
                ArrayList<BBSTopicObj> arrayList3 = this.f82085a4;
                kotlin.jvm.internal.f0.m(arrayList3);
                if (arrayList3.size() > 0 || this.f82115o4) {
                    map2.put("link_tag", "1");
                } else {
                    map2.put("link_tag", "21");
                }
            } else {
                map2.put("link_tag", this.Z);
            }
            if (kotlin.jvm.internal.f0.g("21", this.Z) || kotlin.jvm.internal.f0.g("1", this.Z)) {
                ArrayList<BBSTopicObj> arrayList4 = this.f82085a4;
                kotlin.jvm.internal.f0.m(arrayList4);
                if (arrayList4.size() == 0) {
                    map2.put("topic_ids", BBSTopicObj.TOPIC_ID_TIMELINE);
                } else if (!com.max.hbcommon.utils.c.u(strG7)) {
                    map2.put("topic_ids", strG7);
                }
            } else if (!com.max.hbcommon.utils.c.u(strG7)) {
                map2.put("topic_ids", strG7);
            }
        }
        if (!com.max.hbcommon.utils.c.u(this.f82136x1)) {
            map2.put("appid", this.f82136x1);
        }
        if (!com.max.hbcommon.utils.c.u(strB7)) {
            map2.put("tags", strB7);
        }
        if (!com.max.hbcommon.utils.c.u(this.M3)) {
            map2.put("view_limit", this.M3);
        }
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            map.put("Cookie", str2);
        }
        BBSLinkVoteObj bBSLinkVoteObj = this.f82103i4;
        if (bBSLinkVoteObj != null) {
            kotlin.jvm.internal.f0.m(bBSLinkVoteObj);
            if (!com.max.hbcommon.utils.c.w(bBSLinkVoteObj.getOption_list())) {
                BBSLinkVoteObj bBSLinkVoteObj2 = this.f82103i4;
                kotlin.jvm.internal.f0.m(bBSLinkVoteObj2);
                if (!com.max.hbcommon.utils.c.u(bBSLinkVoteObj2.getVote_title())) {
                    BBSLinkVoteObj bBSLinkVoteObj3 = this.f82103i4;
                    kotlin.jvm.internal.f0.m(bBSLinkVoteObj3);
                    map2.put("vote_title", bBSLinkVoteObj3.getVote_title());
                }
                BBSLinkVoteObj bBSLinkVoteObj4 = this.f82103i4;
                kotlin.jvm.internal.f0.m(bBSLinkVoteObj4);
                map2.put("vote_type", bBSLinkVoteObj4.getVote_type());
                BBSLinkVoteObj bBSLinkVoteObj5 = this.f82103i4;
                kotlin.jvm.internal.f0.m(bBSLinkVoteObj5);
                map2.put("vote_choose_limit", String.valueOf(bBSLinkVoteObj5.getVote_num()));
                StringBuilder sb2 = new StringBuilder();
                BBSLinkVoteObj bBSLinkVoteObj6 = this.f82103i4;
                kotlin.jvm.internal.f0.m(bBSLinkVoteObj6);
                sb2.append(com.max.hbutils.utils.w.P(bBSLinkVoteObj6.getVote_end_date().getTimeInMillis()));
                sb2.append("");
                map2.put("vote_expire_at", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                BBSLinkVoteObj bBSLinkVoteObj7 = this.f82103i4;
                kotlin.jvm.internal.f0.m(bBSLinkVoteObj7);
                int size = bBSLinkVoteObj7.getOption_list().size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (i10 != 0) {
                        sb3.append("<option>");
                        BBSLinkVoteObj bBSLinkVoteObj8 = this.f82103i4;
                        kotlin.jvm.internal.f0.m(bBSLinkVoteObj8);
                        if (bBSLinkVoteObj8.getOption_mode() != 0) {
                            sb4.append("<opt_img>");
                        }
                    }
                    BBSLinkVoteObj bBSLinkVoteObj9 = this.f82103i4;
                    kotlin.jvm.internal.f0.m(bBSLinkVoteObj9);
                    sb3.append(bBSLinkVoteObj9.getOption_list().get(i10).getText());
                    BBSLinkVoteObj bBSLinkVoteObj10 = this.f82103i4;
                    kotlin.jvm.internal.f0.m(bBSLinkVoteObj10);
                    if (bBSLinkVoteObj10.getOption_mode() != 0) {
                        BBSLinkVoteObj bBSLinkVoteObj11 = this.f82103i4;
                        kotlin.jvm.internal.f0.m(bBSLinkVoteObj11);
                        sb4.append(bBSLinkVoteObj11.getOption_list().get(i10).getImgurl());
                    }
                }
                map2.put("vote_options", sb3.toString());
                BBSLinkVoteObj bBSLinkVoteObj12 = this.f82103i4;
                kotlin.jvm.internal.f0.m(bBSLinkVoteObj12);
                if (bBSLinkVoteObj12.getOption_mode() != 0) {
                    map2.put("option_imgs", sb4.toString());
                }
            }
        }
        HashMap<String, String> map3 = this.f82118p2;
        if (map3 != null) {
            kotlin.jvm.internal.f0.m(map3);
            map2.putAll(map3);
        }
        int i11 = this.Y;
        if ((i11 == 10 || i11 == 12) && (linkInfoObj = this.f82137x2) != null) {
            kotlin.jvm.internal.f0.m(linkInfoObj);
            if (!com.max.hbcommon.utils.c.u(linkInfoObj.getVersion())) {
                LinkInfoObj linkInfoObj2 = this.f82137x2;
                kotlin.jvm.internal.f0.m(linkInfoObj2);
                map2.put("link_version", linkInfoObj2.getVersion());
            }
        }
        if (!com.max.hbcommon.utils.c.u(this.f82117p1)) {
            map2.put("link_id", this.f82117p1);
            map2.put("edit", "1");
        }
        long j10 = this.N3;
        if (j10 > 0) {
            map2.put("schedule_ts", String.valueOf(j10 / 1000));
        }
        LinkDraftObj linkDraftObj = this.f82111m4;
        String compilation_obj_id = linkDraftObj != null ? linkDraftObj.getCompilation_obj_id() : null;
        if (!(compilation_obj_id == null || compilation_obj_id.length() == 0)) {
            LinkDraftObj linkDraftObj2 = this.f82111m4;
            map2.put("compilation_obj_id", linkDraftObj2 != null ? linkDraftObj2.getCompilation_obj_id() : null);
        }
        String str4 = this.G4;
        if (!(str4 == null || str4.length() == 0)) {
            String str5 = this.G4;
            LinkDraftObj linkDraftObj3 = this.f82111m4;
            if (!kotlin.jvm.internal.f0.g(str5, linkDraftObj3 != null ? linkDraftObj3.getCompilation_obj_id() : null)) {
                map2.put("del_compilation_obj_id", this.G4);
            }
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ba(map, str, "0", map2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void C7(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29779, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str3 = String.format("hb_editor.execute.insertImageDesc(\"%s\", \"%s\");", Arrays.copyOf(new Object[]{str, str2}, 2));
        kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
        I6(str3);
    }

    private final void C8(String str, String str2) {
        LinkDraftObj linkDraftObj;
        LinkDraftObj linkDraftObj2;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29729, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("cqtest", str);
        LinkDraftObj linkDraftObj3 = this.f82111m4;
        kotlin.jvm.internal.f0.m(linkDraftObj3);
        linkDraftObj3.setLink_tag(this.Z);
        int i10 = this.Y;
        if (i10 == 11 || i10 == 12 || i10 == 14) {
            LinkDraftObj linkDraftObj4 = this.f82111m4;
            kotlin.jvm.internal.f0.m(linkDraftObj4);
            linkDraftObj4.setPost_type("3");
        }
        LinkDraftObj linkDraftObj5 = this.f82111m4;
        if (linkDraftObj5 != null) {
            linkDraftObj5.setContent(str);
        }
        if (str2 != null && (linkDraftObj2 = this.f82111m4) != null) {
            linkDraftObj2.setTitle(str2);
        }
        LinkDraftObj linkDraftObj6 = this.f82111m4;
        if (linkDraftObj6 != null) {
            linkDraftObj6.setVoteInfo(this.f82103i4);
        }
        LinkDraftObj linkDraftObj7 = this.f82111m4;
        if (linkDraftObj7 != null) {
            linkDraftObj7.setBtn(this.f82140y1);
        }
        LinkDraftObj linkDraftObj8 = this.f82111m4;
        if (linkDraftObj8 != null) {
            linkDraftObj8.setCheckedTopics(this.f82085a4);
        }
        String str3 = System.currentTimeMillis() + "";
        LinkDraftObj linkDraftObj9 = this.f82111m4;
        if (linkDraftObj9 != null) {
            linkDraftObj9.setCreat_time(str3);
        }
        LinkDraftObj linkDraftObj10 = this.f82111m4;
        if (linkDraftObj10 != null) {
            linkDraftObj10.setArticle_type(this.f82119p3);
        }
        LinkDraftObj linkDraftObj11 = this.f82111m4;
        if (linkDraftObj11 != null) {
            linkDraftObj11.setArticle_img(this.G3);
        }
        LinkDraftObj linkDraftObj12 = this.f82111m4;
        if (linkDraftObj12 != null) {
            linkDraftObj12.setArticle_reprint_tips(this.K3);
        }
        LinkDraftObj linkDraftObj13 = this.f82111m4;
        if (linkDraftObj13 != null) {
            linkDraftObj13.setView_limit(this.M3);
        }
        LinkDraftObj linkDraftObj14 = this.f82111m4;
        if (linkDraftObj14 != null) {
            TextView textView = this.f82108l;
            if (textView == null) {
                kotlin.jvm.internal.f0.S("et_reference");
                textView = null;
            }
            linkDraftObj14.setArticle_reference(textView.getText().toString());
        }
        LinkDraftObj linkDraftObj15 = this.f82111m4;
        if (linkDraftObj15 != null) {
            linkDraftObj15.setArticle_auth(this.L3);
        }
        LinkDraftObj linkDraftObj16 = this.f82111m4;
        if (linkDraftObj16 != null) {
            linkDraftObj16.setTags(b7());
        }
        LinkDraftObj linkDraftObj17 = this.f82111m4;
        if (linkDraftObj17 != null) {
            linkDraftObj17.setExtraParam(this.f82118p2);
        }
        LinkDraftObj linkDraftObj18 = this.f82111m4;
        if (linkDraftObj18 != null) {
            com.max.xiaoheihe.module.bbs.post_edit.i iVar = this.X;
            if (iVar == null) {
                kotlin.jvm.internal.f0.S("linkEditHashTagManager");
                iVar = null;
            }
            linkDraftObj18.setCheckedHashTags(iVar.h());
        }
        if (PostUtils.f81983a.k(this.Y) && (linkDraftObj = this.f82111m4) != null) {
            linkDraftObj.setPost_plan(f7());
        }
        LinkDraftObj linkDraftObj19 = this.f82111m4;
        if (linkDraftObj19 != null) {
            PostCompilationItemObj postCompilationItemObj = this.H4;
            linkDraftObj19.setCompilation_obj_id(postCompilationItemObj != null ? postCompilationItemObj.getObj_id() : null);
        }
        LinkDraftObj linkDraftObj20 = this.f82111m4;
        if (linkDraftObj20 != null) {
            linkDraftObj20.setOrigin_compilation_obj_id(this.G4);
        }
        LinkDraftObj linkDraftObj21 = this.f82111m4;
        if (linkDraftObj21 == null) {
            return;
        }
        linkDraftObj21.setSave_draft_selected_compilation(this.H4);
    }

    public static final /* synthetic */ void D5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29853, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.i8();
    }

    private final Uri D6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29810, new Class[0], Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        File file = new File(com.max.xiaoheihe.utils.d.T());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, System.currentTimeMillis() + "articleimg.jpg");
        this.P3 = file2;
        kotlin.jvm.internal.f0.m(file2);
        if (!file2.exists()) {
            try {
                File file3 = this.P3;
                kotlin.jvm.internal.f0.m(file3);
                file3.createNewFile();
            } catch (IOException unused) {
                com.max.hbcommon.utils.d.b("zzzz", "creat file IOException");
            }
        }
        return com.max.xiaoheihe.utils.d.w0(this.mContext, this.P3);
    }

    private final void D7(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29780, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str3 = String.format("hb_editor.execute.insertLink(\"%s\", \"%s\");", Arrays.copyOf(new Object[]{str, str2}, 2));
        kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
        I6(str3);
    }

    private final void D8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29769, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.undo();");
    }

    public static final /* synthetic */ void E5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29869, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.j8();
    }

    private final void E7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29777, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("hb_editor.execute.insertURLImage(%s);", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
    }

    private final void E8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29767, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.setUnorderedlist();");
    }

    public static final /* synthetic */ void F5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29847, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.k8();
    }

    private final void F6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29725, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        T6(new f(z10));
    }

    private final PostSettingObj F7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29813, new Class[0], PostSettingObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostSettingObj) patchProxyResultProxy.result;
        }
        PostSettingObj postSettingObj = new PostSettingObj(false, null, null, null, null, null, null, null, null, null, false, 0L, 4095, null);
        postSettingObj.setThumbImageObj(this.G3);
        postSettingObj.setArticleAuth(this.L3);
        postSettingObj.setArticleType(this.f82119p3);
        postSettingObj.setArticleReprintTips(this.K3);
        TextView textView = this.f82108l;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("et_reference");
            textView = null;
        }
        postSettingObj.setSource(textView.getText().toString());
        postSettingObj.setHeadLine(PostUtils.f81983a.k(this.Y));
        postSettingObj.setView_limit(this.M3);
        postSettingObj.setPost_plan(this.f82132v4);
        postSettingObj.setCheckedTopics(this.f82085a4);
        postSettingObj.setSelect_post_plan(com.max.hbcommon.utils.c.w(this.f82134w4) ? null : this.f82134w4);
        postSettingObj.set_edit(this.f82138x4);
        postSettingObj.setSchedulePostTimeMs(this.N3);
        return postSettingObj;
    }

    private final void F8(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29793, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str3 = String.format("hb_editor.updateArticleInfo(%s,%s);", Arrays.copyOf(new Object[]{str, str2}, 2));
        kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
        I6(str3);
        q6();
        s6();
    }

    public static final /* synthetic */ void G5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29851, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.l8();
    }

    static /* synthetic */ void G6(NewLinkEditFragment newLinkEditFragment, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 29726, new Class[]{NewLinkEditFragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        newLinkEditFragment.F6(z10);
    }

    private final void G7() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29691, new Class[0], Void.TYPE).isSupported && !this.f82144z4 && this.f82115o4 && (this.mContext instanceof PostTabActivity)) {
            PostTabActivityViewModel postTabActivityViewModel = this.f82142y4;
            if (postTabActivityViewModel != null) {
                postTabActivityViewModel.B();
            }
            this.f82144z4 = true;
        }
    }

    private final boolean G8(List<String> list, String str, PostFormatView postFormatView) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, postFormatView}, this, changeQuickRedirect, false, 29761, new Class[]{List.class, String.class, PostFormatView.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (list != null && list.contains(str)) {
            z10 = true;
        }
        if (postFormatView != null) {
            postFormatView.setChecked(z10);
        }
        return z10;
    }

    public static final /* synthetic */ void H5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29871, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.m8();
    }

    private final void H6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29727, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.e.i(this, 1, new g());
    }

    private final void H7(yh.a<b2> aVar) {
        PostTabActivityViewModel postTabActivityViewModel;
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 29692, new Class[]{yh.a.class}, Void.TYPE).isSupported || (postTabActivityViewModel = this.f82142y4) == null) {
            return;
        }
        postTabActivityViewModel.G(false, aVar);
    }

    private final void H8(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29781, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str3 = String.format("hb_editor.execute.updateLink(\"%s\", \"%s\");", Arrays.copyOf(new Object[]{str, str2}, 2));
        kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
        I6(str3);
    }

    public static final /* synthetic */ void I5(NewLinkEditFragment newLinkEditFragment, String str) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str}, null, changeQuickRedirect, true, 29836, new Class[]{NewLinkEditFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.n8(str);
    }

    private final void I6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29806, new Class[]{String.class}, Void.TYPE).isSupported || this.f82112n == null || this.mContext == null) {
            return;
        }
        com.max.hbcommon.utils.d.b(N4, "script==" + str);
        this.mContext.runOnUiThread(new h(str));
    }

    static /* synthetic */ void I7(NewLinkEditFragment newLinkEditFragment, yh.a aVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, aVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 29693, new Class[]{NewLinkEditFragment.class, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        newLinkEditFragment.H7(aVar);
    }

    private final void I8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29755, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PostMoreView postMoreView = this.f82102i;
        if (postMoreView == null) {
            kotlin.jvm.internal.f0.S("pm_vote");
            postMoreView = null;
        }
        postMoreView.setChecked(this.f82103i4 != null);
    }

    public static final /* synthetic */ void J5(NewLinkEditFragment newLinkEditFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str, str2}, null, changeQuickRedirect, true, 29834, new Class[]{NewLinkEditFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.o8(str, str2);
    }

    private final void J6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29773, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("javascript:window.focusTitle()");
    }

    private final void J7(com.max.xiaoheihe.module.bbs.post_edit.e eVar) {
        com.max.mediaselector.lib.utils.f.a aVar;
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 29689, new Class[]{com.max.xiaoheihe.module.bbs.post_edit.e.class}, Void.TYPE).isSupported) {
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.a) {
            androidx.activity.result.g<Uri> gVar = this.C4;
            if (gVar == null || (aVar = this.D4) == null) {
                return;
            }
            aVar.e(new yh.p<Uri, Boolean, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onArticleGalleryEvent$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(2);
                }

                public final void a(@dl.e Uri uri, boolean z10) {
                    Object objB;
                    if (PatchProxy.proxy(new Object[]{uri, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29969, new Class[]{Uri.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    ForegroundService.d(((com.max.hbcommon.base.d) this.f82208b).mContext);
                    Log.d("NewLink-dbg", "[onArticleGalleryEvent] ClickCameraEvent\nuri: " + uri + "\nresult: " + z10);
                    if (!z10 || uri == null) {
                        return;
                    }
                    NewLinkEditFragment newLinkEditFragment = this.f82208b;
                    try {
                        kotlin.Result.a aVar2 = kotlin.Result.f124476c;
                        Uri fileUri = Uri.fromFile(new File(com.max.mediaselector.lib.utils.n.m(((com.max.hbcommon.base.d) newLinkEditFragment).mContext, uri)));
                        kotlin.jvm.internal.f0.o(fileUri, "fileUri");
                        NewLinkEditFragment.O7(newLinkEditFragment, CollectionsKt__CollectionsKt.r(fileUri), false, 2, null);
                        objB = kotlin.Result.b(b2.f124493a);
                    } catch (Throwable th2) {
                        kotlin.Result.a aVar3 = kotlin.Result.f124476c;
                        objB = kotlin.Result.b(kotlin.t0.a(th2));
                    }
                    Throwable thE = kotlin.Result.e(objB);
                    if (thE != null) {
                        com.max.hbutils.utils.c.f("图片上传失败: " + thE.getMessage());
                    }
                }

                /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(Uri uri, Boolean bool) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, bool}, this, changeQuickRedirect, false, 29970, new Class[]{Object.class, Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(uri, bool.booleanValue());
                    return b2.f124493a;
                }
            });
            com.max.mediaselector.lib.utils.f.c(this, gVar, aVar);
            I7(this, null, 1, null);
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.b) {
            F6(true);
            I7(this, null, 1, null);
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.c) {
            com.max.xiaoheihe.module.bbs.post_edit.e.c cVar = (com.max.xiaoheihe.module.bbs.post_edit.e.c) eVar;
            int iF = cVar.f();
            Uri resultUri = cVar.e().I();
            if (iF == 0) {
                List<Uri> list = this.E4;
                kotlin.jvm.internal.f0.o(resultUri, "resultUri");
                list.add(resultUri);
                N7(CollectionsKt__CollectionsKt.r(resultUri), true);
                return;
            }
            if (iF != 1) {
                return;
            }
            Integer numValueOf = Integer.valueOf(this.E4.indexOf(resultUri));
            Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
            if (num != null) {
                d8(num.intValue());
            }
            this.E4.remove(resultUri);
        }
    }

    private final void J8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29785, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("hb_editor.execute.uploadFailedImage(%s);", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
    }

    private final void K6(List<String> list, String str, PostFormatView postFormatView) {
        if (PatchProxy.proxy(new Object[]{list, str, postFormatView}, this, changeQuickRedirect, false, 29762, new Class[]{List.class, String.class, PostFormatView.class}, Void.TYPE).isSupported || postFormatView == null) {
            return;
        }
        if (list == null || !list.contains(str)) {
            postFormatView.setOnClickListener(this.J4);
        } else {
            postFormatView.setColor(this.mContext.getResources().getColor(R.color.text_secondary_2_color));
            postFormatView.setOnClickListener(null);
        }
    }

    private final void K7(boolean z10, Uri uri) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), uri}, this, changeQuickRedirect, false, 29690, new Class[]{Boolean.TYPE, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.E4.add(uri);
            N7(CollectionsKt__CollectionsKt.r(uri), true);
            return;
        }
        Integer numValueOf = Integer.valueOf(this.E4.indexOf(uri));
        if (!(numValueOf.intValue() >= 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            d8(numValueOf.intValue());
        }
        this.E4.remove(uri);
    }

    private final void K8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29786, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("hb_editor.execute.uploadSuccessImage(%s);", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
    }

    public static final /* synthetic */ void L3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29832, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.p6();
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0294  */
    /* JADX WARN: Code duplicated, block: B:118:0x029d  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02be  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    private final void L6() {
        boolean z10;
        Bundle arguments;
        String string;
        Bundle arguments2;
        String string2;
        Bundle arguments3;
        String string3;
        Bundle arguments4;
        Serializable serializable;
        Object objB;
        KeyDescObj keyDescObj;
        String text;
        List listB;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29703, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments5 = getArguments();
        int i10 = arguments5 != null ? arguments5.getInt("page_type", 0) : 0;
        this.Y = i10;
        this.f82138x4 = L4.h(i10);
        Bundle arguments6 = getArguments();
        this.f82115o4 = arguments6 != null && arguments6.getBoolean(PictureVideoEditPostFragment.f82333b4, false);
        Bundle arguments7 = getArguments();
        Object obj = null;
        this.A4 = arguments7 != null ? arguments7.getString("source", null) : null;
        Bundle arguments8 = getArguments();
        this.B4 = (JsonObject) com.max.hbutils.utils.k.a(arguments8 != null ? arguments8.getString(PostTabActivity.J3) : null, JsonObject.class);
        Bundle arguments9 = getArguments();
        HashMap<String, String> map = (HashMap) (arguments9 != null ? arguments9.getSerializable("extra_params") : null);
        this.f82118p2 = map;
        if (map != null) {
            this.f82124r4 = map.containsKey("cate_id");
        }
        if (this.f82124r4) {
            z10 = true;
        } else {
            Bundle arguments10 = getArguments();
            if (com.max.hbcommon.utils.c.x(arguments10 != null ? arguments10.getString(f82066i5) : null)) {
                z10 = true;
            } else {
                Bundle arguments11 = getArguments();
                if (arguments11 != null && arguments11.getInt(f82066i5, 0) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        this.f82124r4 = z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!this.f82124r4) {
            int iQ = com.max.hbutils.utils.n.q(this.f82130u4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) this.mContext.getResources().getText(R.string.draft));
            sb2.append(iQ > 0 ? ' ' + iQ + "  " : "  ");
            spannableStringBuilder.append((CharSequence) sb2.toString());
            spannableStringBuilder.setSpan(new i(this.mContext.getResources().getColor(R.color.btn_text_primary_1_color)), 0, spannableStringBuilder.length(), 33);
        }
        this.mTitleBar.getAppbarActionTextView().setVisibility(0);
        Bundle arguments12 = getArguments();
        Serializable serializable2 = arguments12 != null ? arguments12.getSerializable(Q4) : null;
        if (serializable2 != null) {
            this.f82090c0 = (BBSTopicObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(serializable2), BBSTopicObj.class);
        }
        Bundle arguments13 = getArguments();
        Serializable serializable3 = arguments13 != null ? arguments13.getSerializable(f82063f5) : null;
        if (serializable3 != null) {
            this.f82140y1 = (PostBtnObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(serializable3), PostBtnObj.class);
        }
        Bundle arguments14 = getArguments();
        this.f82087b0 = (ArrayList) (arguments14 != null ? arguments14.getSerializable(W4) : null);
        Bundle arguments15 = getArguments();
        Serializable serializable4 = arguments15 != null ? arguments15.getSerializable(R4) : null;
        ArrayList arrayList = new ArrayList();
        if (serializable4 != null && (listB = com.max.hbutils.utils.k.b(com.max.hbutils.utils.k.p(serializable4), BBSTopicObj.class)) != null) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add((BBSTopicObj) it.next());
            }
        }
        if (arrayList.size() > 0) {
            if (this.f82087b0 == null) {
                this.f82087b0 = new ArrayList<>();
            }
            ArrayList<BBSTopicObj> arrayList2 = this.f82087b0;
            if (arrayList2 != null) {
                arrayList2.addAll(arrayList);
            }
        }
        this.mTitleBar.setActionOnClickListener(this.I4);
        int i11 = this.Y;
        if (i11 != 0) {
            switch (i11) {
                case 9:
                    s7();
                    arguments = getArguments();
                    if (arguments != null) {
                        string = arguments.getString("link_tag");
                    } else {
                        string = null;
                    }
                    this.Z = string;
                    arguments2 = getArguments();
                    if (arguments2 != null) {
                        string2 = arguments2.getString(O4);
                    } else {
                        string2 = null;
                    }
                    this.f82084a0 = string2;
                    arguments3 = getArguments();
                    if (arguments3 != null) {
                        string3 = arguments3.getString("hashtag");
                    } else {
                        string3 = null;
                    }
                    this.R3 = string3;
                    spannableStringBuilder.append((CharSequence) getString(R.string.post));
                    arguments4 = getArguments();
                    if (arguments4 != null) {
                        serializable = arguments4.getSerializable("extra_params");
                    } else {
                        serializable = null;
                    }
                    this.f82118p2 = (HashMap) serializable;
                    if (!this.f82115o4) {
                        this.mTitleBar.getAppbarActionTextView().setText(spannableStringBuilder);
                        this.mTitleBar.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
                        this.mTitleBar.setTitle(getString(R.string.links_or_timelines));
                    } else {
                        v7(this.f82128t4);
                    }
                    break;
                case 10:
                    s7();
                    this.mTitleBar.setTitle("编辑帖子");
                    spannableStringBuilder.append((CharSequence) getString(R.string.post));
                    this.mTitleBar.getAppbarActionTextView().setText(spannableStringBuilder);
                    this.mTitleBar.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
                    break;
                case 11:
                case 12:
                case 14:
                    s7();
                    if (com.max.hbcommon.utils.c.u(this.Z)) {
                        Bundle arguments16 = getArguments();
                        this.Z = arguments16 != null ? arguments16.getString("link_tag") : null;
                    }
                    Bundle arguments17 = getArguments();
                    this.f82084a0 = arguments17 != null ? arguments17.getString(O4) : null;
                    Bundle arguments18 = getArguments();
                    this.R3 = arguments18 != null ? arguments18.getString("hashtag") : null;
                    this.mTitleBar.setTitle(getString(R.string.contribute_text));
                    spannableStringBuilder.append((CharSequence) getString(R.string.post));
                    this.mTitleBar.getAppbarActionTextView().setText(spannableStringBuilder);
                    this.mTitleBar.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
                    break;
                case 13:
                    this.W3 = true;
                    s7();
                    this.mTitleBar.setTitle(this.f82115o4 ? "文章" : getString(R.string.links_or_timelines));
                    spannableStringBuilder.append((CharSequence) getString(R.string.post));
                    this.mTitleBar.getAppbarActionTextView().setText(spannableStringBuilder);
                    this.mTitleBar.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
                    break;
            }
        } else {
            s7();
            arguments = getArguments();
            if (arguments != null) {
                string = arguments.getString("link_tag");
            } else {
                string = null;
            }
            this.Z = string;
            arguments2 = getArguments();
            if (arguments2 != null) {
                string2 = arguments2.getString(O4);
            } else {
                string2 = null;
            }
            this.f82084a0 = string2;
            arguments3 = getArguments();
            if (arguments3 != null) {
                string3 = arguments3.getString("hashtag");
            } else {
                string3 = null;
            }
            this.R3 = string3;
            spannableStringBuilder.append((CharSequence) getString(R.string.post));
            arguments4 = getArguments();
            if (arguments4 != null) {
                serializable = arguments4.getSerializable("extra_params");
            } else {
                serializable = null;
            }
            this.f82118p2 = (HashMap) serializable;
            if (!this.f82115o4) {
                v7(this.f82128t4);
            } else {
                this.mTitleBar.getAppbarActionTextView().setText(spannableStringBuilder);
                this.mTitleBar.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
                this.mTitleBar.setTitle(getString(R.string.links_or_timelines));
            }
        }
        PostBtnObj postBtnObj = this.f82140y1;
        if (postBtnObj != null && (text = postBtnObj.getText()) != null) {
            this.mTitleBar.setTitle(text);
        }
        this.mTitleBar.getAppbarNavButtonView().setOnClickListener(new j());
        Bundle arguments19 = getArguments();
        if (arguments19 != null) {
            try {
                kotlin.Result.a aVar = kotlin.Result.f124476c;
                IBinder binder = arguments19.getBinder(T4);
                if (binder != null) {
                    kotlin.jvm.internal.f0.m(binder);
                    if (binder.isBinderAlive() && (binder instanceof InProgressLargeObjHoldBinder)) {
                        Object holdObj = ((InProgressLargeObjHoldBinder) binder).getHoldObj();
                        if (!(holdObj instanceof KeyDescObj)) {
                            holdObj = null;
                        }
                        keyDescObj = (KeyDescObj) holdObj;
                    } else {
                        keyDescObj = null;
                    }
                    objB = kotlin.Result.b(keyDescObj);
                    Throwable thE = kotlin.Result.e(objB);
                    if (thE != null) {
                        com.max.heybox.hblog.g.f74531b.w("[AccelWorld-dbg][fastGetObjFromHoldBinder]\nthis: " + arguments19 + ", key: " + T4, thE);
                    }
                    kotlin.Result.j(objB);
                    if (!kotlin.Result.i(objB)) {
                        obj = objB;
                    }
                }
            } catch (Throwable th2) {
                kotlin.Result.a aVar2 = kotlin.Result.f124476c;
                objB = kotlin.Result.b(kotlin.t0.a(th2));
            }
            KeyDescObj keyDescObj2 = (KeyDescObj) obj;
            if (keyDescObj2 != null) {
                this.f82134w4.add(keyDescObj2);
            }
        }
    }

    private final void L7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29724, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager permissionManager = PermissionManager.f71603a;
        Activity activity = this.mContext;
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        permissionManager.R(this, (AppCompatActivity) activity, new g0());
    }

    public static final /* synthetic */ void M3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29860, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.q6();
    }

    public static final /* synthetic */ void M5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29831, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.q8();
    }

    private final void M6(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 29804, new Class[]{b.class}, Void.TYPE).isSupported || this.f82112n == null || this.mContext == null) {
            return;
        }
        com.max.hbcommon.utils.d.b(N4, "script==hb_editor.getArticleInfo();");
        this.mContext.runOnUiThread(new k("hb_editor.getArticleInfo();", bVar));
    }

    private final void M7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29723, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        G7();
        I7(this, null, 1, null);
        PermissionManager permissionManager = PermissionManager.f71603a;
        Activity activity = this.mContext;
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        permissionManager.R(this, (AppCompatActivity) activity, new h0());
    }

    public static final /* synthetic */ void N3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29859, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.r6();
    }

    private final String N6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29722, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (kotlin.jvm.internal.f0.g("1", this.K3)) {
            String string = getString(R.string.auth_tips_1);
            kotlin.jvm.internal.f0.o(string, "getString(R.string.auth_tips_1)");
            return string;
        }
        if (!kotlin.jvm.internal.f0.g("2", this.K3)) {
            return "";
        }
        String string2 = getString(R.string.auth_tips_2);
        kotlin.jvm.internal.f0.o(string2, "getString(R.string.auth_tips_2)");
        return string2;
    }

    private final void N7(ArrayList<Uri> arrayList, boolean z10) {
        if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29808, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported || arrayList == null || arrayList.isEmpty()) {
            return;
        }
        kotlinx.coroutines.k.f(this.f82086b, null, null, new NewLinkEditFragment$onImagesPicked$1(this, z10, arrayList, null), 3, null);
    }

    public static final /* synthetic */ void O3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29861, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.s6();
    }

    private final String O6() {
        String strK;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29721, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (kotlin.jvm.internal.f0.g("1", this.f82119p3)) {
            if (com.max.hbcommon.utils.c.u(this.J3)) {
                strK = com.max.xiaoheihe.utils.i0.k();
            } else {
                strK = this.J3;
                kotlin.jvm.internal.f0.m(strK);
            }
            kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
            String string = getString(R.string.reprinted_tips_format);
            kotlin.jvm.internal.f0.o(string, "getString(R.string.reprinted_tips_format)");
            String str = String.format(string, Arrays.copyOf(new Object[]{strK, N6()}, 2));
            kotlin.jvm.internal.f0.o(str, "format(format, *args)");
            return str;
        }
        if (!kotlin.jvm.internal.f0.g("0", this.f82119p3)) {
            return "";
        }
        TextView textView = this.f82108l;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("et_reference");
            textView = null;
        }
        String string2 = textView.getText().toString();
        if (com.max.hbcommon.utils.c.u(string2)) {
            return "";
        }
        kotlin.jvm.internal.v0 v0Var2 = kotlin.jvm.internal.v0.f124986a;
        String string3 = getString(R.string.article_reference_format);
        kotlin.jvm.internal.f0.o(string3, "getString(R.string.article_reference_format)");
        String str2 = String.format(string3, Arrays.copyOf(new Object[]{string2}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        return str2;
    }

    static /* synthetic */ void O7(NewLinkEditFragment newLinkEditFragment, ArrayList arrayList, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, arrayList, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 29809, new Class[]{NewLinkEditFragment.class, ArrayList.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        newLinkEditFragment.N7(arrayList, z10);
    }

    public static final /* synthetic */ void P3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29884, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.w6();
    }

    private final w0 P6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29719, new Class[0], w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        if (this.f82093d4 == null) {
            return new w0("", PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
        }
        PostUtils.Companion companion = PostUtils.f81983a;
        PostLimitObj link_limit = null;
        if (companion.k(this.Y)) {
            UserPostLimitsObj userPostLimitsObj = this.T3;
            if (userPostLimitsObj != null) {
                link_limit = userPostLimitsObj.getArticle_limit();
            }
        } else {
            UserPostLimitsObj userPostLimitsObj2 = this.T3;
            if (userPostLimitsObj2 != null) {
                link_limit = userPostLimitsObj2.getLink_limit();
            }
        }
        if (link_limit != null) {
            MaxMinLimitObj title_limit = link_limit.getTitle_limit();
            if (title_limit != null) {
                if (title_limit.getMin() != null) {
                    HtmlLinkContentObj htmlLinkContentObj = this.f82093d4;
                    kotlin.jvm.internal.f0.m(htmlLinkContentObj);
                    if (htmlLinkContentObj.getTitle().length() < com.max.hbutils.utils.n.q(title_limit.getMin())) {
                        return new w0("标题字数不得少于" + title_limit.getMin(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                    }
                }
                if (title_limit.getMax() != null) {
                    HtmlLinkContentObj htmlLinkContentObj2 = this.f82093d4;
                    kotlin.jvm.internal.f0.m(htmlLinkContentObj2);
                    if (htmlLinkContentObj2.getTitle().length() > com.max.hbutils.utils.n.q(title_limit.getMax())) {
                        return new w0("标题字数不得多于" + title_limit.getMax(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                    }
                }
            }
            MaxMinLimitObj text_limit = link_limit.getText_limit();
            if (text_limit != null) {
                if (text_limit.getMin() != null && this.f82120p4 < com.max.hbutils.utils.n.q(text_limit.getMin())) {
                    return new w0("内容字数不得少于" + text_limit.getMin(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
                if (text_limit.getMax() != null && this.f82120p4 > com.max.hbutils.utils.n.q(text_limit.getMax())) {
                    return new w0("内容字数不得多于" + text_limit.getMax(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
            }
            MaxMinLimitObj pic_limit = link_limit.getPic_limit();
            if (pic_limit != null) {
                if (pic_limit.getMin() != null && this.f82122q4 < com.max.hbutils.utils.n.q(pic_limit.getMin())) {
                    return new w0("图片不得少于" + pic_limit.getMin(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
                if (pic_limit.getMax() != null && this.f82122q4 > com.max.hbutils.utils.n.q(pic_limit.getMax())) {
                    return new w0("图片不得多于" + pic_limit.getMax(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
            }
        } else {
            HtmlLinkContentObj htmlLinkContentObj3 = this.f82093d4;
            kotlin.jvm.internal.f0.m(htmlLinkContentObj3);
            if (com.max.hbcommon.utils.c.u(htmlLinkContentObj3.getContent())) {
                return new w0(getString(R.string.content_empty_msg), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
            }
            if (!this.f82115o4 && companion.k(this.Y) && com.max.hbcommon.utils.c.u(this.f82119p3)) {
                l8();
                kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
                String string = getString(R.string.choose_format);
                kotlin.jvm.internal.f0.o(string, "getString(R.string.choose_format)");
                String str = String.format(string, Arrays.copyOf(new Object[]{getString(R.string.article_type)}, 1));
                kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                return new w0(str, PostCheckReason.NO_ORIGINAL_CREATE_DECLARE);
            }
        }
        HtmlLinkContentObj htmlLinkContentObj4 = this.f82093d4;
        kotlin.jvm.internal.f0.m(htmlLinkContentObj4);
        return com.max.hbcommon.utils.c.n(htmlLinkContentObj4.getTitle()) ? new w0("标题中不能包含特殊符号", PostCheckReason.TOAST_TITLE_CONTAIN_EMOJI) : new w0("", PostCheckReason.CHECK_PASS);
    }

    private final void P7(final String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29737, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mContext.sendBroadcast(new Intent().setAction("com.heybox.refresh.topic"));
        this.mContext.sendBroadcast(new Intent().setAction(lb.a.f131043t));
        this.mContext.sendBroadcast(new Intent().setAction("com.max.xiaoheihe.post.gotop"));
        this.mContext.sendBroadcast(new Intent().setAction(lb.a.f130972h0).putExtra("link_id", str));
        PostTabActivityViewModel postTabActivityViewModel = this.f82142y4;
        if (postTabActivityViewModel != null) {
            postTabActivityViewModel.z();
        }
        PostUtils.Companion companion = PostUtils.f81983a;
        if (!companion.l() && !this.f82138x4) {
            companion.b(getActivity(), str, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onPostSucceed$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, PushConsts.ALIAS_CONNECT_LOST, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, PushConsts.ALIAS_CID_LOST, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    NewLinkEditFragment.v5(this.f82233b, str);
                }
            });
        } else {
            com.max.hbutils.utils.c.f(getString(R.string.post_success));
            T7(str);
        }
    }

    public static final /* synthetic */ void Q3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29883, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.x6();
    }

    private final void Q7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29768, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.setOrderedlist();");
    }

    public static final /* synthetic */ void R3(NewLinkEditFragment newLinkEditFragment, ImageView imageView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, imageView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 29842, new Class[]{NewLinkEditFragment.class, ImageView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.y6(imageView, z10);
    }

    private final String R6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29709, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        HtmlLinkContentObj htmlLinkContentObj = this.f82093d4;
        if (htmlLinkContentObj == null) {
            return null;
        }
        Pattern pattern = D5;
        kotlin.jvm.internal.f0.m(htmlLinkContentObj);
        Matcher matcher = pattern.matcher(htmlLinkContentObj.getContent());
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!matcher.find()) {
                break;
            }
            String strGroup = matcher.group(1);
            if (sb2.length() > 0) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(strGroup);
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    private final void R7() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29702, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkImageObj linkImageObj = this.G3;
        if (linkImageObj != null) {
            if ((linkImageObj != null ? linkImageObj.getUrl() : null) == null) {
                PostUtils.f81983a.q(PostType.Article, PostCheckReason.TOAST_PIC_UPLOAD, this.A4, this.B4);
                com.max.hbutils.utils.c.f("封面图片正在上传，请稍后在发布");
                return;
            }
        }
        t6();
        if (!this.f82115o4 || ((str = this.f82119p3) != null && this.G3 != null)) {
            B6();
            return;
        }
        if (str == null) {
            PostUtils.f81983a.q(PostType.Article, PostCheckReason.NO_ORIGINAL_CREATE_DECLARE, this.A4, this.B4);
            b2 b2Var = b2.f124493a;
        }
        if (this.G3 == null) {
            PostUtils.f81983a.q(PostType.Article, PostCheckReason.NO_COVER, this.A4, this.B4);
            b2 b2Var2 = b2.f124493a;
        }
        new com.max.hbcommon.view.a.f(this.mContext).x(R.string.prompt).l("您还未完成必填信息，将无法申请上头条").u("去填写", new j0()).o("直接发布", new k0()).F();
    }

    public static final /* synthetic */ void S3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29856, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.A6();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    private final void S7(PostSettingObj postSettingObj) {
        List<KeyDescObj> select_post_plan;
        if (PatchProxy.proxy(new Object[]{postSettingObj}, this, changeQuickRedirect, false, 29814, new Class[]{PostSettingObj.class}, Void.TYPE).isSupported || postSettingObj == null) {
            return;
        }
        if (postSettingObj.getHeadLine()) {
            this.Y = 11;
            this.f82119p3 = postSettingObj.getArticleType();
            this.L3 = postSettingObj.getArticleAuth();
            this.K3 = postSettingObj.getArticleReprintTips();
            TextView textView = this.f82108l;
            if (textView == null) {
                kotlin.jvm.internal.f0.S("et_reference");
                textView = null;
            }
            textView.setText(postSettingObj.getSource());
            LinkImageObj thumbImageObj = postSettingObj.getThumbImageObj();
            this.G3 = thumbImageObj;
            if (thumbImageObj != null) {
                if ((thumbImageObj != null ? thumbImageObj.getPath() : null) != null) {
                    LinkImageObj linkImageObj = this.G3;
                    if ((linkImageObj != null ? linkImageObj.getUrl() : null) == null) {
                        ArrayList arrayList = new ArrayList();
                        LinkImageObj linkImageObj2 = this.G3;
                        kotlin.jvm.internal.f0.m(linkImageObj2);
                        arrayList.add(linkImageObj2);
                        q7(arrayList, true);
                    }
                }
            }
        } else {
            this.Y = 0;
        }
        this.M3 = postSettingObj.getView_limit();
        if (this.f82085a4 == null) {
            this.f82085a4 = new ArrayList<>();
        }
        if (!kotlin.jvm.internal.f0.g(this.f82132v4, postSettingObj.getPost_plan())) {
            this.f82132v4.clear();
            if (!com.max.hbcommon.utils.c.w(postSettingObj.getPost_plan())) {
                this.f82132v4.clear();
                List<KeyDescObj> list = this.f82132v4;
                List<KeyDescObj> post_plan = postSettingObj.getPost_plan();
                kotlin.jvm.internal.f0.m(post_plan);
                list.addAll(post_plan);
            }
        }
        if (postSettingObj.is_edit()) {
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean(PostTabActivity.G2)) {
                select_post_plan = postSettingObj.getSelect_post_plan();
                if (select_post_plan != null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.f82134w4 = arrayList2;
                    arrayList2.addAll(select_post_plan);
                }
            }
        } else {
            select_post_plan = postSettingObj.getSelect_post_plan();
            if (select_post_plan != null) {
                ArrayList arrayList3 = new ArrayList();
                this.f82134w4 = arrayList3;
                arrayList3.addAll(select_post_plan);
            }
        }
        this.N3 = postSettingObj.getSchedulePostTimeMs();
        j1();
    }

    public static final /* synthetic */ void T3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29830, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.B6();
    }

    public static final /* synthetic */ KeyDescObj T4(NewLinkEditFragment newLinkEditFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29874, new Class[]{NewLinkEditFragment.class}, KeyDescObj.class);
        return patchProxyResultProxy.isSupported ? (KeyDescObj) patchProxyResultProxy.result : newLinkEditFragment.f7();
    }

    private final void T6(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 29805, new Class[]{b.class}, Void.TYPE).isSupported || this.f82112n == null || this.mContext == null) {
            return;
        }
        com.max.hbcommon.utils.d.b(N4, "script == hb_editor.getImageCount();");
        this.mContext.runOnUiThread(new l("hb_editor.getImageCount();", bVar));
    }

    private final void T7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29738, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        h8(str);
        this.f82109l4 = true;
        A6();
        HashMap<String, String> map = this.f82118p2;
        if (map != null) {
            com.max.xiaoheihe.utils.d.u1(this.mContext, map);
        }
        this.mContext.setResult(-1);
        this.mContext.finish();
    }

    public static final /* synthetic */ Uri U3(NewLinkEditFragment newLinkEditFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29858, new Class[]{NewLinkEditFragment.class}, Uri.class);
        return patchProxyResultProxy.isSupported ? (Uri) patchProxyResultProxy.result : newLinkEditFragment.D6();
    }

    private final void U7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29770, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.redo();");
    }

    public static final /* synthetic */ void V3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29857, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.H6();
    }

    private final void V6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29696, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            String strI = MMKVManager.f71329a.i(ad.e.f1248a, ad.e.f1252e, null, false);
            if (com.max.hbcommon.utils.c.u(strI)) {
                return;
            }
            List list = com.max.hbutils.utils.k.b(strI, KeyDescObj.class);
            this.f82132v4.clear();
            List<KeyDescObj> list2 = this.f82132v4;
            kotlin.jvm.internal.f0.o(list, "list");
            list2.addAll(list);
        } catch (Throwable unused) {
        }
    }

    private final void V7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29741, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BBSTopicIndexObj bBSTopicIndexObj = this.f82126s4;
        if (bBSTopicIndexObj == null) {
            v8(getString(R.string.content));
        } else if (bBSTopicIndexObj != null) {
            if (PostUtils.f81983a.k(this.Y) && bBSTopicIndexObj.getPost_article_notify() != null) {
                String text = bBSTopicIndexObj.getPost_article_notify().getText();
                if (com.max.hbcommon.utils.c.u(text)) {
                    v8(getString(R.string.content));
                } else {
                    v8(text);
                }
            } else if (bBSTopicIndexObj.getPost_link_notify() != null) {
                String text2 = bBSTopicIndexObj.getPost_link_notify().getText();
                if (com.max.hbcommon.utils.c.u(text2)) {
                    v8(getString(R.string.content));
                } else {
                    v8(text2);
                }
            }
            if (bBSTopicIndexObj.getTips() != null) {
                ViewGroup viewGroup = this.U;
                if (viewGroup == null) {
                    kotlin.jvm.internal.f0.S("vg_horn");
                    viewGroup = null;
                }
                viewGroup.setVisibility(0);
                TextView textView = this.V;
                if (textView == null) {
                    kotlin.jvm.internal.f0.S("tv_horn");
                    textView = null;
                }
                textView.setText(bBSTopicIndexObj.getTips().getDesc());
                ViewGroup viewGroup2 = this.U;
                if (viewGroup2 == null) {
                    kotlin.jvm.internal.f0.S("vg_horn");
                    viewGroup2 = null;
                }
                viewGroup2.setOnClickListener(new m0(bBSTopicIndexObj));
            } else {
                ViewGroup viewGroup3 = this.U;
                if (viewGroup3 == null) {
                    kotlin.jvm.internal.f0.S("vg_horn");
                    viewGroup3 = null;
                }
                viewGroup3.setVisibility(8);
            }
            if (!com.max.hbcommon.utils.c.w(bBSTopicIndexObj.getPost_article_plan())) {
                this.f82132v4.clear();
                List<KeyDescObj> list = this.f82132v4;
                List<BBSTopicIndexObj.PostPlan> post_article_plan = bBSTopicIndexObj.getPost_article_plan();
                kotlin.jvm.internal.f0.o(post_article_plan, "topicIndex.post_article_plan");
                list.addAll(post_article_plan);
                MMKVManager.f71329a.o(ad.e.f1248a, ad.e.f1252e, com.max.hbutils.utils.k.r(this.f82132v4), false);
            }
            String post_article_plan_notice = bBSTopicIndexObj.getPost_article_plan_notice();
            if (!(post_article_plan_notice == null || kotlin.text.u.V1(post_article_plan_notice)) && com.max.hbcommon.utils.c.w(bBSTopicIndexObj.getPost_article_plan())) {
                this.f82132v4.clear();
            }
        }
        PostBtnObj postBtnObj = this.f82140y1;
        if (com.max.hbcommon.utils.c.u(postBtnObj != null ? postBtnObj.getPrompt() : null)) {
            return;
        }
        PostBtnObj postBtnObj2 = this.f82140y1;
        v8(postBtnObj2 != null ? postBtnObj2.getPrompt() : null);
    }

    public static final /* synthetic */ void W3(NewLinkEditFragment newLinkEditFragment, String str) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str}, null, changeQuickRedirect, true, 29872, new Class[]{NewLinkEditFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.I6(str);
    }

    private final void W7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29795, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SettingItemView settingItemView = null;
        if (!kotlin.jvm.internal.f0.g("1", this.f82119p3) && !kotlin.jvm.internal.f0.g("0", this.f82119p3)) {
            SettingItemView settingItemView2 = this.R;
            if (settingItemView2 == null) {
                kotlin.jvm.internal.f0.S("siv_reprint_tips");
                settingItemView2 = null;
            }
            settingItemView2.setVisibility(8);
            View view = this.f82106k;
            if (view == null) {
                kotlin.jvm.internal.f0.S("vg_reference");
                view = null;
            }
            view.setVisibility(8);
            SettingItemView settingItemView3 = this.S;
            if (settingItemView3 == null) {
                kotlin.jvm.internal.f0.S("siv_auth");
            } else {
                settingItemView = settingItemView3;
            }
            settingItemView.setVisibility(8);
            return;
        }
        if (kotlin.jvm.internal.f0.g("1", this.f82119p3)) {
            SettingItemView settingItemView4 = this.R;
            if (settingItemView4 == null) {
                kotlin.jvm.internal.f0.S("siv_reprint_tips");
                settingItemView4 = null;
            }
            settingItemView4.setVisibility(0);
            View view2 = this.f82106k;
            if (view2 == null) {
                kotlin.jvm.internal.f0.S("vg_reference");
                view2 = null;
            }
            view2.setVisibility(8);
            SettingItemView settingItemView5 = this.S;
            if (settingItemView5 == null) {
                kotlin.jvm.internal.f0.S("siv_auth");
            } else {
                settingItemView = settingItemView5;
            }
            settingItemView.setVisibility(8);
            b8();
            return;
        }
        View view3 = this.f82106k;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("vg_reference");
            view3 = null;
        }
        view3.setVisibility(0);
        SettingItemView settingItemView6 = this.S;
        if (settingItemView6 == null) {
            kotlin.jvm.internal.f0.S("siv_auth");
            settingItemView6 = null;
        }
        settingItemView6.setVisibility(0);
        SettingItemView settingItemView7 = this.R;
        if (settingItemView7 == null) {
            kotlin.jvm.internal.f0.S("siv_reprint_tips");
        } else {
            settingItemView = settingItemView7;
        }
        settingItemView.setVisibility(8);
        a8();
    }

    public static final /* synthetic */ void X3(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29837, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.J6();
    }

    private final void X7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29801, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<BBSTopicObj> arrayList = this.f82085a4;
        View view = null;
        if (arrayList != null) {
            kotlin.jvm.internal.f0.m(arrayList);
            if (arrayList.size() > 0) {
                View view2 = this.f82135x;
                if (view2 == null) {
                    kotlin.jvm.internal.f0.S("vg_preview_bottom_bar_placeholder");
                    view2 = null;
                }
                view2.setVisibility(8);
                View view3 = this.f82133w;
                if (view3 == null) {
                    kotlin.jvm.internal.f0.S("vg_preview_bottom_bar");
                    view3 = null;
                }
                view3.setVisibility(0);
                View view4 = this.f82133w;
                if (view4 == null) {
                    kotlin.jvm.internal.f0.S("vg_preview_bottom_bar");
                    view4 = null;
                }
                View viewFindViewById = view4.findViewById(R.id.tv_desc);
                kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewFindViewById;
                View view5 = this.f82133w;
                if (view5 == null) {
                    kotlin.jvm.internal.f0.S("vg_preview_bottom_bar");
                    view5 = null;
                }
                View viewFindViewById2 = view5.findViewById(R.id.tv_comment);
                kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) viewFindViewById2;
                View view6 = this.f82133w;
                if (view6 == null) {
                    kotlin.jvm.internal.f0.S("vg_preview_bottom_bar");
                } else {
                    view = view6;
                }
                view.findViewById(R.id.iv_not_interested).setVisibility(8);
                kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
                String string = getString(R.string.default_desc_time_format);
                kotlin.jvm.internal.f0.o(string, "getString(R.string.default_desc_time_format)");
                ArrayList<BBSTopicObj> arrayList2 = this.f82085a4;
                kotlin.jvm.internal.f0.m(arrayList2);
                String str = String.format(string, Arrays.copyOf(new Object[]{arrayList2.get(0).getName()}, 1));
                kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                textView.setText(str);
                textView2.setText(R.string.default_comment_num);
                return;
            }
        }
        View view7 = this.f82133w;
        if (view7 == null) {
            kotlin.jvm.internal.f0.S("vg_preview_bottom_bar");
            view7 = null;
        }
        view7.setVisibility(8);
        View view8 = this.f82135x;
        if (view8 == null) {
            kotlin.jvm.internal.f0.S("vg_preview_bottom_bar_placeholder");
        } else {
            view = view8;
        }
        view.setVisibility(0);
    }

    public static final /* synthetic */ void Y3(NewLinkEditFragment newLinkEditFragment, List list, String str, PostFormatView postFormatView) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, list, str, postFormatView}, null, changeQuickRedirect, true, 29843, new Class[]{NewLinkEditFragment.class, List.class, String.class, PostFormatView.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.K6(list, str, postFormatView);
    }

    public static final /* synthetic */ void Y5(NewLinkEditFragment newLinkEditFragment, String str) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str}, null, changeQuickRedirect, true, 29833, new Class[]{NewLinkEditFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.v8(str);
    }

    @kotlin.k(message = "未被使用")
    private static /* synthetic */ void Y6() {
    }

    private final void Y7() {
        LinkImageObj linkImageObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29803, new Class[0], Void.TYPE).isSupported || (linkImageObj = this.G3) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(linkImageObj);
        ImageView imageView = null;
        if (!com.max.hbcommon.utils.c.u(linkImageObj.getPath())) {
            ImageView imageView2 = this.f82139y;
            if (imageView2 == null) {
                kotlin.jvm.internal.f0.S("iv_preview_img");
            } else {
                imageView = imageView2;
            }
            LinkImageObj linkImageObj2 = this.G3;
            kotlin.jvm.internal.f0.m(linkImageObj2);
            imageView.setImageBitmap(BitmapFactory.decodeFile(linkImageObj2.getPath()));
            return;
        }
        LinkImageObj linkImageObj3 = this.G3;
        kotlin.jvm.internal.f0.m(linkImageObj3);
        String url = linkImageObj3.getUrl();
        ImageView imageView3 = this.f82139y;
        if (imageView3 == null) {
            kotlin.jvm.internal.f0.S("iv_preview_img");
        } else {
            imageView = imageView3;
        }
        com.max.hbimage.b.K(url, imageView);
    }

    public static final /* synthetic */ void Z3(NewLinkEditFragment newLinkEditFragment, b bVar) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, bVar}, null, changeQuickRedirect, true, 29873, new Class[]{NewLinkEditFragment.class, b.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.M6(bVar);
    }

    private final LinearLayout Z6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29752, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = new LinearLayout(getViewContext());
        linearLayout.setOrientation(0);
        linearLayout.setPadding(0, ViewUtils.f(getViewContext(), 20.0f), 0, 0);
        return linearLayout;
    }

    private final void Z7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29800, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c8();
        Y7();
        X7();
    }

    private final View a7(int i10, String str, int i11) {
        Object[] objArr = {new Integer(i10), str, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29753, new Class[]{cls, String.class, cls}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        PostMoreView postMoreView = new PostMoreView(getViewContext());
        postMoreView.setId(i11);
        postMoreView.getIv_img().setImageResource(i10);
        postMoreView.getTv_content().setText(str);
        return postMoreView;
    }

    private final void a8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29796, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SettingItemView settingItemView = null;
        if (kotlin.jvm.internal.f0.g("1", this.L3) || kotlin.jvm.internal.f0.g("2", this.L3)) {
            SettingItemView settingItemView2 = this.S;
            if (settingItemView2 == null) {
                kotlin.jvm.internal.f0.S("siv_auth");
                settingItemView2 = null;
            }
            settingItemView2.setRightDesc(com.max.xiaoheihe.utils.d.n0(kotlin.jvm.internal.f0.g("1", this.L3) ? R.string.auth_granted : R.string.auth_denied));
        } else {
            SettingItemView settingItemView3 = this.S;
            if (settingItemView3 == null) {
                kotlin.jvm.internal.f0.S("siv_auth");
                settingItemView3 = null;
            }
            settingItemView3.setRightDesc(com.max.xiaoheihe.utils.d.n0(R.string.not_selected));
        }
        SettingItemView settingItemView4 = this.S;
        if (settingItemView4 == null) {
            kotlin.jvm.internal.f0.S("siv_auth");
        } else {
            settingItemView = settingItemView4;
        }
        settingItemView.setOnClickListener(new n0());
    }

    public static final /* synthetic */ w0 b4(NewLinkEditFragment newLinkEditFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29879, new Class[]{NewLinkEditFragment.class}, w0.class);
        return patchProxyResultProxy.isSupported ? (w0) patchProxyResultProxy.result : newLinkEditFragment.P6();
    }

    public static final /* synthetic */ void b6(NewLinkEditFragment newLinkEditFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str, str2}, null, changeQuickRedirect, true, 29846, new Class[]{NewLinkEditFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.x8(str, str2);
    }

    private final String b7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29745, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<KeyDescObj> arrayList2 = this.f82088b4;
        if (arrayList2 != null) {
            kotlin.jvm.internal.f0.m(arrayList2);
            if (arrayList2.size() > 0) {
                ArrayList<KeyDescObj> arrayList3 = this.f82088b4;
                kotlin.jvm.internal.f0.m(arrayList3);
                Iterator<KeyDescObj> it = arrayList3.iterator();
                while (it.hasNext()) {
                    String desc = it.next().getDesc();
                    kotlin.jvm.internal.f0.o(desc, "obj.desc");
                    arrayList.add(desc);
                }
            }
        }
        return com.max.hbutils.utils.k.r(arrayList);
    }

    private final void b8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29797, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SettingItemView settingItemView = null;
        if (kotlin.jvm.internal.f0.g("1", this.K3) || kotlin.jvm.internal.f0.g("2", this.K3)) {
            SettingItemView settingItemView2 = this.R;
            if (settingItemView2 == null) {
                kotlin.jvm.internal.f0.S("siv_reprint_tips");
                settingItemView2 = null;
            }
            settingItemView2.setRightDesc(com.max.xiaoheihe.utils.d.n0(kotlin.jvm.internal.f0.g("1", this.K3) ? R.string.auth_tips_1 : R.string.auth_tips_2));
        } else {
            SettingItemView settingItemView3 = this.R;
            if (settingItemView3 == null) {
                kotlin.jvm.internal.f0.S("siv_reprint_tips");
                settingItemView3 = null;
            }
            settingItemView3.setRightDesc(com.max.xiaoheihe.utils.d.n0(R.string.not_selected));
        }
        SettingItemView settingItemView4 = this.R;
        if (settingItemView4 == null) {
            kotlin.jvm.internal.f0.S("siv_reprint_tips");
        } else {
            settingItemView = settingItemView4;
        }
        settingItemView.setOnClickListener(new o0());
    }

    public static final /* synthetic */ void c6(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29839, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.y8();
    }

    private final void c8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29802, new Class[0], Void.TYPE).isSupported || this.f82097f4) {
            return;
        }
        M6(new p0());
    }

    public static final /* synthetic */ String d4(NewLinkEditFragment newLinkEditFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29848, new Class[]{NewLinkEditFragment.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : newLinkEditFragment.R6();
    }

    public static final /* synthetic */ void d6(NewLinkEditFragment newLinkEditFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str, str2}, null, changeQuickRedirect, true, 29844, new Class[]{NewLinkEditFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.z8(str, str2);
    }

    @SuppressLint({"AutoDispose"})
    private final void d7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29734, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        String strG7 = g7();
        if (!com.max.hbcommon.utils.c.u(strG7)) {
            kotlin.jvm.internal.f0.m(strG7);
            map.put("topic_ids", strG7);
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b6(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    private final void d8(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 29784, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str = String.format("hb_editor.execute.removeImageWithIndex(%s);", Arrays.copyOf(new Object[]{String.valueOf(i10)}, 1));
        kotlin.jvm.internal.f0.o(str, "format(format, *args)");
        I6(str);
    }

    public static final /* synthetic */ void e5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29881, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.k7();
    }

    public static final /* synthetic */ void e6(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29827, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.A8();
    }

    private final String e7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29740, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Bundle arguments = getArguments();
        if (!com.max.hbcommon.utils.c.u(arguments != null ? arguments.getString("h_src") : null)) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                return arguments2.getString("h_src");
            }
            return null;
        }
        Activity activity = this.mContext;
        if (!(activity instanceof PostTabActivity)) {
            return null;
        }
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity");
        return ((PostTabActivity) activity).n2();
    }

    private final void e8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29782, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.removeLink();");
    }

    public static final /* synthetic */ void f5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29882, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.l7();
    }

    public static final /* synthetic */ void f6(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29854, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.B8();
    }

    private final KeyDescObj f7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29742, new Class[0], KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (!com.max.hbcommon.utils.c.w(this.f82132v4) && !com.max.hbcommon.utils.c.w(this.f82134w4)) {
            for (KeyDescObj keyDescObj : this.f82132v4) {
                keyDescObj.setChecked(this.f82134w4.contains(keyDescObj));
            }
        }
        for (KeyDescObj keyDescObj2 : this.f82132v4) {
            if (keyDescObj2.isChecked()) {
                return keyDescObj2;
            }
        }
        return null;
    }

    private final void f8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82099g4 = true;
        FrameLayout frameLayout = this.f82110m;
        if (frameLayout == null) {
            kotlin.jvm.internal.f0.S("fl_expression");
            frameLayout = null;
        }
        frameLayout.setVisibility(0);
        com.max.hbexpression.q qVar = this.f82101h4;
        if (qVar == null) {
            com.max.hbexpression.q qVarB = com.max.hbexpression.e.b(false, 1, null);
            getParentFragmentManager().u().y(R.id.fl_expression, qVarB.P()).m();
            this.f82101h4 = qVarB;
        } else if (qVar != null) {
            qVar.q1();
        }
    }

    public static final /* synthetic */ void g5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29825, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.m7();
    }

    public static final /* synthetic */ void g6(NewLinkEditFragment newLinkEditFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str, str2}, null, changeQuickRedirect, true, 29852, new Class[]{NewLinkEditFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.C8(str, str2);
    }

    private final String g7() {
        StringBuilder sb2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29744, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(this.f82085a4)) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            ArrayList<BBSTopicObj> arrayList = this.f82085a4;
            kotlin.jvm.internal.f0.m(arrayList);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                ArrayList<BBSTopicObj> arrayList2 = this.f82085a4;
                kotlin.jvm.internal.f0.m(arrayList2);
                sb2.append(arrayList2.get(i10).getTopic_id());
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    private final void g8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29717, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        String strE7 = e7();
        if (!com.max.hbcommon.utils.c.u(strE7)) {
            jsonObject.addProperty("h_src", strE7);
        }
        jsonObject.addProperty("post_type", PostType.Article.toString());
        com.max.hbcommon.analytics.d.d("4", lb.d.U0, null, jsonObject);
    }

    public static final /* synthetic */ void h5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29838, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.o7();
    }

    public static final /* synthetic */ void h6(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29885, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.E8();
    }

    @SuppressLint({"AutoDispose"})
    private final void h7(String str) {
        String string;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29731, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("h_src")) == null) {
            string = "";
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b0("list", str, MainActivity.E4 ? "1" : null, string, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    private final void h8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29739, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("link_id", str);
        com.max.xiaoheihe.module.bbs.post_edit.i iVar = this.X;
        if (iVar == null) {
            kotlin.jvm.internal.f0.S("linkEditHashTagManager");
            iVar = null;
        }
        jsonObject.addProperty("tags", CollectionsKt___CollectionsKt.h3(iVar.h(), Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null));
        String strE7 = e7();
        if (!com.max.hbcommon.utils.c.u(strE7)) {
            jsonObject.addProperty("h_src", strE7);
        }
        LinkDraftObj linkDraftObj = this.f82111m4;
        String compilation_obj_id = linkDraftObj != null ? linkDraftObj.getCompilation_obj_id() : null;
        if (compilation_obj_id == null) {
            compilation_obj_id = "";
        }
        jsonObject.addProperty("compilation_id", compilation_obj_id);
        com.max.hbcommon.analytics.d.d("4", lb.d.P0, null, jsonObject);
    }

    public static final /* synthetic */ void i5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29849, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.p7();
    }

    public static final /* synthetic */ void i6(NewLinkEditFragment newLinkEditFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str, str2}, null, changeQuickRedirect, true, 29835, new Class[]{NewLinkEditFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.F8(str, str2);
    }

    private final void i7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29732, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        com.max.xiaoheihe.module.bbs.b0 b0VarA = com.max.xiaoheihe.module.bbs.b0.f80775b.a();
        if (!com.max.hbcommon.utils.c.w(this.f82085a4)) {
            ArrayList<BBSTopicObj> arrayList2 = this.f82085a4;
            kotlin.jvm.internal.f0.m(arrayList2);
            for (BBSTopicObj bBSTopicObj : arrayList2) {
                if (com.max.hbcommon.utils.c.u(bBSTopicObj.getName()) || com.max.hbcommon.utils.c.u(bBSTopicObj.getPic_url())) {
                    BBSTopicObj bBSTopicObjE = b0VarA.e(bBSTopicObj.getTopic_id());
                    if (bBSTopicObjE != null) {
                        bBSTopicObj.setName(bBSTopicObjE.getName());
                        bBSTopicObj.setPic_url(bBSTopicObjE.getPic_url());
                    } else {
                        String topic_id = bBSTopicObj.getTopic_id();
                        kotlin.jvm.internal.f0.o(topic_id, "topicObj.topic_id");
                        arrayList.add(topic_id);
                    }
                }
            }
        }
        if (!com.max.hbcommon.utils.c.u(this.f82084a0)) {
            BBSTopicObj bBSTopicObjE2 = b0VarA.e(this.f82084a0);
            if (bBSTopicObjE2 == null) {
                String str = this.f82084a0;
                kotlin.jvm.internal.f0.m(str);
                arrayList.add(str);
                ArrayList<BBSTopicObj> arrayList3 = this.f82085a4;
                kotlin.jvm.internal.f0.m(arrayList3);
                BBSTopicObj bBSTopicObj2 = new BBSTopicObj();
                bBSTopicObj2.setTopic_id(this.f82084a0);
                arrayList3.add(bBSTopicObj2);
            } else {
                ArrayList<BBSTopicObj> arrayList4 = this.f82085a4;
                kotlin.jvm.internal.f0.m(arrayList4);
                arrayList4.add(bBSTopicObjE2);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : arrayList) {
                if (sb2.length() > 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(str2);
            }
            String string = sb2.toString();
            kotlin.jvm.internal.f0.o(string, "topicIdsBuilder.toString()");
            j7(string);
        }
    }

    private final void i8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29716, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        String strE7 = e7();
        if (!com.max.hbcommon.utils.c.u(strE7)) {
            jsonObject.addProperty("h_src", strE7);
        }
        jsonObject.addProperty("post_type", PostType.Article.toString());
        com.max.hbcommon.analytics.d.d("4", lb.d.T0, null, jsonObject);
    }

    public static final /* synthetic */ void j5(NewLinkEditFragment newLinkEditFragment, List list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 29845, new Class[]{NewLinkEditFragment.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.q7(list, z10);
    }

    public static final /* synthetic */ boolean j6(NewLinkEditFragment newLinkEditFragment, List list, String str, PostFormatView postFormatView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newLinkEditFragment, list, str, postFormatView}, null, changeQuickRedirect, true, 29841, new Class[]{NewLinkEditFragment.class, List.class, String.class, PostFormatView.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : newLinkEditFragment.G8(list, str, postFormatView);
    }

    @SuppressLint({"AutoDispose"})
    private final void j7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29733, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().y3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    private final void j8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29799, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ConsecutiveScrollerLayout consecutiveScrollerLayout = this.A;
        WebView webView = null;
        if (consecutiveScrollerLayout == null) {
            kotlin.jvm.internal.f0.S("sv_container");
            consecutiveScrollerLayout = null;
        }
        int iV = ViewUtils.V(consecutiveScrollerLayout);
        int iV2 = ViewUtils.V(this.mTitleBar);
        View view = this.B;
        if (view == null) {
            kotlin.jvm.internal.f0.S("vg_article_preview");
            view = null;
        }
        if (view.getVisibility() == 0) {
            View view2 = this.B;
            if (view2 == null) {
                kotlin.jvm.internal.f0.S("vg_article_preview");
                view2 = null;
            }
            iV2 += ViewUtils.V(view2);
        }
        int i10 = iV - iV2;
        this.Q3 = i10;
        WebView webView2 = this.f82112n;
        if (webView2 == null) {
            kotlin.jvm.internal.f0.S("mWebView");
            webView2 = null;
        }
        if (i10 > webView2.getMinimumHeight()) {
            WebView webView3 = this.f82112n;
            if (webView3 == null) {
                kotlin.jvm.internal.f0.S("mWebView");
            } else {
                webView = webView3;
            }
            webView.setMinimumHeight(this.Q3);
        }
    }

    public static final /* synthetic */ void k5(NewLinkEditFragment newLinkEditFragment, String str) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str}, null, changeQuickRedirect, true, 29870, new Class[]{NewLinkEditFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.B7(str);
    }

    public static final /* synthetic */ void k6(NewLinkEditFragment newLinkEditFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str, str2}, null, changeQuickRedirect, true, 29876, new Class[]{NewLinkEditFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.H8(str, str2);
    }

    private final void k7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29763, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.setHead();");
    }

    private final void k8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29771, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.blurEditor();");
    }

    public static final /* synthetic */ void l5(NewLinkEditFragment newLinkEditFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str, str2}, null, changeQuickRedirect, true, 29866, new Class[]{NewLinkEditFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.C7(str, str2);
    }

    public static final /* synthetic */ void l6(NewLinkEditFragment newLinkEditFragment, String str) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str}, null, changeQuickRedirect, true, 29865, new Class[]{NewLinkEditFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.J8(str);
    }

    private final void l7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29764, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.setSubHead();");
    }

    private final void l8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29720, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Looper.myQueue().addIdleHandler(new r0());
    }

    public static final /* synthetic */ void m5(NewLinkEditFragment newLinkEditFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str, str2}, null, changeQuickRedirect, true, 29877, new Class[]{NewLinkEditFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.D7(str, str2);
    }

    public static final /* synthetic */ void m6(NewLinkEditFragment newLinkEditFragment, String str) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str}, null, changeQuickRedirect, true, 29864, new Class[]{NewLinkEditFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.K8(str);
    }

    private final void m7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29713, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.f82094e;
        ViewGroup viewGroup = null;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("vg_menu_element");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        ViewGroup viewGroup2 = this.L;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.f0.S("vg_menu_format");
        } else {
            viewGroup = viewGroup2;
        }
        viewGroup.setVisibility(8);
    }

    private final void m8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29788, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("window.scrollTo(0, document.documentElement.scrollHeight);");
    }

    private final void n6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29772, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.focusEditor();");
    }

    private final void n7(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 29819, new Class[]{Activity.class}, Void.TYPE).isSupported || activity == null) {
            return;
        }
        k8();
        View viewPeekDecorView = activity.getWindow().peekDecorView();
        if (viewPeekDecorView == null || viewPeekDecorView.getWindowToken() == null) {
            return;
        }
        Object systemService = activity.getSystemService("input_method");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
    }

    private final void n8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29792, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("hb_editor.setArticleInfo(%s);", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
        q6();
        s6();
    }

    private final void o6(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29751, new Class[]{View.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        LinearLayout linearLayout = this.f82094e;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("vg_menu_element");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayoutZ6 = Z6();
        int iL = ViewUtils.L(getViewContext()) - ViewUtils.f(getViewContext(), 6.0f);
        int iF = ViewUtils.f(getViewContext(), 62.0f);
        int length = H5.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 + iF > iL) {
                LinearLayout linearLayout3 = this.f82094e;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.f0.S("vg_menu_element");
                    linearLayout3 = null;
                }
                linearLayout3.addView(linearLayoutZ6);
                linearLayoutZ6 = Z6();
                i10 = 0;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, ViewUtils.f(getViewContext(), 44.0f));
            int iIntValue = H5[i11].intValue();
            String string = getViewContext().getResources().getString(I5[i11].intValue());
            kotlin.jvm.internal.f0.o(string, "viewContext.resources.getString(moreTextArray[i])");
            linearLayoutZ6.addView(a7(iIntValue, string, J5[i11].intValue()), layoutParams);
            i10 += iF;
        }
        LinearLayout linearLayout4 = this.f82094e;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.f0.S("vg_menu_element");
        } else {
            linearLayout2 = linearLayout4;
        }
        linearLayout2.addView(linearLayoutZ6);
        View viewFindViewById = view.findViewById(R.id.pm_at);
        kotlin.jvm.internal.f0.o(viewFindViewById, "rootView.findViewById(R.id.pm_at)");
        this.f82096f = (PostMoreView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.pm_super_link);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "rootView.findViewById(R.id.pm_super_link)");
        this.f82098g = (PostMoreView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.pm_game);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "rootView.findViewById(R.id.pm_game)");
        this.f82100h = (PostMoreView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.pm_vote);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "rootView.findViewById(R.id.pm_vote)");
        this.f82102i = (PostMoreView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.pm_game_album);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "rootView.findViewById(R.id.pm_game_album)");
        this.f82104j = (PostMoreView) viewFindViewById5;
    }

    private final void o7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29748, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebView webView = this.f82112n;
        if (webView == null) {
            kotlin.jvm.internal.f0.S("mWebView");
            webView = null;
        }
        webView.loadUrl("javascript:window.hideLabel()");
    }

    private final void o8(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29791, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str3 = String.format("hb_editor.setArticleInfo(%s,%s);", Arrays.copyOf(new Object[]{str, str2}, 2));
        kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
        I6(str3);
        q6();
        s6();
    }

    public static final /* synthetic */ void p5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29826, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.G7();
    }

    private final void p6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29749, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebView webView = this.f82112n;
        if (webView == null) {
            kotlin.jvm.internal.f0.S("mWebView");
            webView = null;
        }
        webView.loadUrl("javascript:window.showTitleBox()");
    }

    private final void p7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29818, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m7();
        if (this.f82097f4) {
            n7(this.mContext);
        }
        com.max.hbexpression.q qVar = this.f82101h4;
        if (qVar != null) {
            this.f82099g4 = false;
            if (qVar != null) {
                qVar.C();
            }
        }
        r6();
        q6();
        s6();
    }

    public static final /* synthetic */ void q5(NewLinkEditFragment newLinkEditFragment, com.max.xiaoheihe.module.bbs.post_edit.e eVar) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, eVar}, null, changeQuickRedirect, true, 29828, new Class[]{NewLinkEditFragment.class, com.max.xiaoheihe.module.bbs.post_edit.e.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.J7(eVar);
    }

    private final void q6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29794, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.Y;
        if (i10 == 11 || i10 == 12 || i10 == 14) {
            Z7();
            W7();
        }
    }

    private final void q7(List<? extends LinkImageObj> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29746, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends LinkImageObj> it = list.iterator();
        while (it.hasNext()) {
            String path = it.next().getPath();
            kotlin.jvm.internal.f0.o(path, "linkimg.path");
            arrayList.add(path);
        }
        com.max.xiaoheihe.module.upload.g.e qVar = new q(list, this);
        p pVar = new p();
        Activity activity = this.mContext;
        io.reactivex.disposables.a compositeDisposable = getCompositeDisposable();
        if (z10) {
            qVar = pVar;
        }
        com.max.xiaoheihe.module.upload.g.h(activity, compositeDisposable, arrayList, "bbs", qVar);
    }

    private final void q8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29750, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str = String.format("window.hashTagActionType = \"%s\"", Arrays.copyOf(new Object[]{"client"}, 1));
        kotlin.jvm.internal.f0.o(str, "format(format, *args)");
        I6(str);
    }

    public static final /* synthetic */ void r5(NewLinkEditFragment newLinkEditFragment, boolean z10, Uri uri) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, new Byte(z10 ? (byte) 1 : (byte) 0), uri}, null, changeQuickRedirect, true, 29829, new Class[]{NewLinkEditFragment.class, Boolean.TYPE, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.K7(z10, uri);
    }

    private final void r6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29807, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View currentFocus = this.mContext.getCurrentFocus();
        boolean z10 = currentFocus == null || currentFocus.getId() != R.id.et_reference;
        View view = this.K;
        LinearLayout linearLayout = null;
        if (view == null) {
            kotlin.jvm.internal.f0.S("vg_edit_bar");
            view = null;
        }
        view.setVisibility(z10 ? 0 : 8);
        if (z10) {
            return;
        }
        ViewGroup viewGroup = this.L;
        if (viewGroup == null) {
            kotlin.jvm.internal.f0.S("vg_menu_format");
            viewGroup = null;
        }
        viewGroup.setVisibility(8);
        LinearLayout linearLayout2 = this.f82094e;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.f0.S("vg_menu_element");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(8);
    }

    private final void r7() {
        PostCompilationItemObj save_draft_selected_compilation;
        ActivityPostSettingViewModel activityPostSettingViewModel;
        String origin_compilation_obj_id;
        LiveData<Integer> liveDataO;
        LiveData<PostCompilationItemObj> liveDataR;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29686, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ActivityPostSettingViewModel activityPostSettingViewModel2 = this.F4;
        if (activityPostSettingViewModel2 != null && (liveDataR = activityPostSettingViewModel2.r()) != null) {
            liveDataR.k(this, new r());
        }
        ActivityPostSettingViewModel activityPostSettingViewModel3 = this.F4;
        if (activityPostSettingViewModel3 != null && (liveDataO = activityPostSettingViewModel3.o()) != null) {
            liveDataO.k(this, new s());
        }
        LinkDraftObj linkDraftObj = this.f82111m4;
        if (linkDraftObj != null && (origin_compilation_obj_id = linkDraftObj.getOrigin_compilation_obj_id()) != null) {
            this.G4 = origin_compilation_obj_id;
        }
        LinkDraftObj linkDraftObj2 = this.f82111m4;
        if (linkDraftObj2 != null && (save_draft_selected_compilation = linkDraftObj2.getSave_draft_selected_compilation()) != null && (activityPostSettingViewModel = this.F4) != null) {
            activityPostSettingViewModel.v(save_draft_selected_compilation.getObj_id());
        }
        ActivityPostSettingViewModel activityPostSettingViewModel4 = this.F4;
        if (activityPostSettingViewModel4 != null) {
            activityPostSettingViewModel4.w(false, new NewLinkEditFragment$initActivityPostSettingViewModel$5(this));
        }
    }

    private final void r8(PostFormatView postFormatView) {
        if (PatchProxy.proxy(new Object[]{postFormatView}, this, changeQuickRedirect, false, 29760, new Class[]{PostFormatView.class}, Void.TYPE).isSupported || postFormatView == null || postFormatView.hasOnClickListeners()) {
            return;
        }
        postFormatView.setOnClickListener(this.J4);
    }

    public static final /* synthetic */ void s5(NewLinkEditFragment newLinkEditFragment, String str) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str}, null, changeQuickRedirect, true, 29862, new Class[]{NewLinkEditFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.P7(str);
    }

    private final void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29798, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Looper.myQueue().addIdleHandler(new d());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private final void s7() {
        Object objB;
        ActivityPostSettingViewModel activityPostSettingViewModel;
        ArticleCollectionObj article_collection;
        IBinder binder;
        Result result;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29754, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            if (arguments == null || (binder = arguments.getBinder("edit")) == null) {
                objB = null;
            } else {
                kotlin.jvm.internal.f0.m(binder);
                if (binder.isBinderAlive() && (binder instanceof InProgressLargeObjHoldBinder)) {
                    Object holdObj = ((InProgressLargeObjHoldBinder) binder).getHoldObj();
                    if (!(holdObj instanceof Result)) {
                        holdObj = null;
                    }
                    result = (Result) holdObj;
                } else {
                    result = null;
                }
                objB = kotlin.Result.b(result);
                Throwable thE = kotlin.Result.e(objB);
                if (thE != null) {
                    com.max.heybox.hblog.g.f74531b.w("[AccelWorld-dbg][fastGetObjFromHoldBinder]\nthis: " + arguments + ", key: edit", thE);
                }
                kotlin.Result.j(objB);
                if (kotlin.Result.i(objB)) {
                    objB = null;
                }
            }
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(kotlin.t0.a(th2));
        }
        this.X3 = (Result) objB;
        this.f82134w4.clear();
        Result<BBSLinkTreeObj> result2 = this.X3;
        if (result2 != null) {
            kotlin.jvm.internal.f0.m(result2);
            LinkInfoObj link = result2.getResult().getLink();
            this.f82137x2 = link;
            kotlin.jvm.internal.f0.m(link);
            this.f82117p1 = link.getLinkid();
            LinkInfoObj linkInfoObj = this.f82137x2;
            kotlin.jvm.internal.f0.m(linkInfoObj);
            this.Z = linkInfoObj.getLink_tag();
            ArrayList<BBSTopicObj> arrayList = this.f82085a4;
            if (arrayList != null) {
                LinkInfoObj linkInfoObj2 = this.f82137x2;
                kotlin.jvm.internal.f0.m(linkInfoObj2);
                arrayList.addAll(linkInfoObj2.getTopics());
            }
            boolean z10 = true;
            List[] listArr = new List[1];
            LinkInfoObj linkInfoObj3 = this.f82137x2;
            listArr[0] = linkInfoObj3 != null ? linkInfoObj3.getPlan_tags() : null;
            if (!com.max.hbcommon.utils.c.w(listArr)) {
                LinkInfoObj linkInfoObj4 = this.f82137x2;
                kotlin.jvm.internal.f0.m(linkInfoObj4);
                Iterator<ConceptPostTagObj> it = linkInfoObj4.getPlan_tags().iterator();
                while (it.hasNext()) {
                    this.f82134w4.add(it.next().toKeyDescObj());
                }
            }
            LinkInfoObj linkInfoObj5 = this.f82137x2;
            kotlin.jvm.internal.f0.m(linkInfoObj5);
            if (!com.max.hbcommon.utils.c.w(linkInfoObj5.getTags())) {
                if (this.f82088b4 == null) {
                    this.f82088b4 = new ArrayList<>();
                }
                LinkInfoObj linkInfoObj6 = this.f82137x2;
                kotlin.jvm.internal.f0.m(linkInfoObj6);
                for (String str : linkInfoObj6.getTags()) {
                    KeyDescObj keyDescObj = new KeyDescObj();
                    keyDescObj.setDesc(str);
                    ArrayList<KeyDescObj> arrayList2 = this.f82088b4;
                    if (arrayList2 != null) {
                        arrayList2.add(keyDescObj);
                    }
                }
            }
            LinkInfoObj linkInfoObj7 = this.f82137x2;
            kotlin.jvm.internal.f0.m(linkInfoObj7);
            LinkVoteInfoObj vote_info = linkInfoObj7.getVote_info();
            if (vote_info != null) {
                this.f82103i4 = com.max.xiaoheihe.module.bbs.utils.b.d(vote_info);
                I8();
            }
            LinkInfoObj linkInfoObj8 = this.f82137x2;
            kotlin.jvm.internal.f0.m(linkInfoObj8);
            if (linkInfoObj8.getUser() != null) {
                LinkInfoObj linkInfoObj9 = this.f82137x2;
                kotlin.jvm.internal.f0.m(linkInfoObj9);
                if (!com.max.hbcommon.utils.c.u(linkInfoObj9.getUser().getUsername())) {
                    LinkInfoObj linkInfoObj10 = this.f82137x2;
                    kotlin.jvm.internal.f0.m(linkInfoObj10);
                    this.J3 = linkInfoObj10.getUser().getUsername();
                }
            }
            LinkInfoObj linkInfoObj11 = this.f82137x2;
            kotlin.jvm.internal.f0.m(linkInfoObj11);
            if (!com.max.hbcommon.utils.c.u(linkInfoObj11.getThumb())) {
                LinkImageObj linkImageObj = new LinkImageObj();
                this.G3 = linkImageObj;
                LinkInfoObj linkInfoObj12 = this.f82137x2;
                kotlin.jvm.internal.f0.m(linkInfoObj12);
                linkImageObj.setUrl(linkInfoObj12.getThumb());
            }
            LinkInfoObj linkInfoObj13 = this.f82137x2;
            kotlin.jvm.internal.f0.m(linkInfoObj13);
            if (!com.max.hbcommon.utils.c.u(linkInfoObj13.getOriginal())) {
                LinkInfoObj linkInfoObj14 = this.f82137x2;
                this.f82119p3 = kotlin.jvm.internal.f0.g("1", linkInfoObj14 != null ? linkInfoObj14.getOriginal() : null) ? "1" : "0";
            }
            LinkInfoObj linkInfoObj15 = this.f82137x2;
            kotlin.jvm.internal.f0.m(linkInfoObj15);
            if (linkInfoObj15.getOriginal_info() != null) {
                LinkInfoObj linkInfoObj16 = this.f82137x2;
                kotlin.jvm.internal.f0.m(linkInfoObj16);
                this.f82119p3 = kotlin.jvm.internal.f0.g("1", String.valueOf(linkInfoObj16.getOriginal_info().getOriginal())) ? "1" : "0";
            }
            LinkInfoObj linkInfoObj17 = this.f82137x2;
            if (!com.max.hbcommon.utils.c.u(linkInfoObj17 != null ? linkInfoObj17.getSource() : null)) {
                TextView textView = this.f82108l;
                if (textView == null) {
                    kotlin.jvm.internal.f0.S("et_reference");
                    textView = null;
                }
                LinkInfoObj linkInfoObj18 = this.f82137x2;
                textView.setText(linkInfoObj18 != null ? linkInfoObj18.getSource() : null);
            }
            LinkInfoObj linkInfoObj19 = this.f82137x2;
            kotlin.jvm.internal.f0.m(linkInfoObj19);
            String declaration = linkInfoObj19.getDeclaration();
            if (!com.max.hbcommon.utils.c.u(declaration)) {
                if (kotlin.jvm.internal.f0.g("1", this.f82119p3)) {
                    if (kotlin.jvm.internal.f0.g("1", declaration) || kotlin.jvm.internal.f0.g("2", declaration)) {
                        this.K3 = kotlin.jvm.internal.f0.g("1", declaration) ? "1" : "2";
                    }
                } else if (kotlin.jvm.internal.f0.g("1", declaration) || kotlin.jvm.internal.f0.g("2", declaration)) {
                    this.L3 = kotlin.jvm.internal.f0.g("1", declaration) ? "1" : "2";
                }
            }
            LinkInfoObj linkInfoObj20 = this.f82137x2;
            long jO = (long) (com.max.hbutils.utils.n.o(linkInfoObj20 != null ? linkInfoObj20.getSchedule_ts() : null) * 1000);
            this.N3 = jO;
            if (this.f82138x4) {
                this.O3 = jO;
            }
            LinkInfoObj linkInfoObj21 = this.f82137x2;
            this.M3 = linkInfoObj21 != null ? linkInfoObj21.getView_limit() : null;
            LinkInfoObj linkInfoObj22 = this.f82137x2;
            String obj_id = (linkInfoObj22 == null || (article_collection = linkInfoObj22.getArticle_collection()) == null) ? null : article_collection.getObj_id();
            this.G4 = obj_id;
            if (obj_id != null && obj_id.length() != 0) {
                z10 = false;
            }
            if (z10 || ad.a.b(ad.a.I, false, 2, null) || (activityPostSettingViewModel = this.F4) == null) {
                return;
            }
            activityPostSettingViewModel.v(this.G4);
        }
    }

    public static final /* synthetic */ void t5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29886, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.Q7();
    }

    private final void t6() {
        HtmlLinkContentObj htmlLinkContentObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29718, new Class[0], Void.TYPE).isSupported || (htmlLinkContentObj = this.f82093d4) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(htmlLinkContentObj);
        if (htmlLinkContentObj.getContent() == null) {
            return;
        }
        String strO6 = O6();
        if (com.max.hbcommon.utils.c.u(strO6)) {
            return;
        }
        HtmlLinkContentObj htmlLinkContentObj2 = this.f82093d4;
        kotlin.jvm.internal.f0.m(htmlLinkContentObj2);
        StringBuilder sb2 = new StringBuilder();
        HtmlLinkContentObj htmlLinkContentObj3 = this.f82093d4;
        kotlin.jvm.internal.f0.m(htmlLinkContentObj3);
        sb2.append(htmlLinkContentObj3.getContent());
        sb2.append(strO6);
        htmlLinkContentObj2.setContent(sb2.toString());
    }

    private final void t7() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29687, new Class[0], Void.TYPE).isSupported && (this.mContext instanceof PostTabActivity)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
            PostTabActivityViewModel postTabActivityViewModel = (PostTabActivityViewModel) new androidx.lifecycle.y0(fragmentActivityRequireActivity).a(PostTabActivityViewModel.class);
            this.f82142y4 = postTabActivityViewModel;
            if (postTabActivityViewModel != null) {
                postTabActivityViewModel.h().k(this, new t(postTabActivityViewModel, this));
                u7(postTabActivityViewModel);
            }
        }
    }

    public static final /* synthetic */ void u5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29880, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.R7();
    }

    private final void u6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29774, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.backspace();");
    }

    private final void u7(PostTabActivityViewModel postTabActivityViewModel) {
        if (!PatchProxy.proxy(new Object[]{postTabActivityViewModel}, this, changeQuickRedirect, false, 29688, new Class[]{PostTabActivityViewModel.class}, Void.TYPE).isSupported && postTabActivityViewModel.v(this.A4)) {
            postTabActivityViewModel.o().k(this, new u(postTabActivityViewModel));
            postTabActivityViewModel.r().k(this, new v(postTabActivityViewModel, this));
            postTabActivityViewModel.t().k(this, new w(postTabActivityViewModel, this));
        }
    }

    public static final /* synthetic */ void v5(NewLinkEditFragment newLinkEditFragment, String str) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment, str}, null, changeQuickRedirect, true, 29863, new Class[]{NewLinkEditFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.T7(str);
    }

    private final void v6(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29701, new Class[]{View.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.rl_root);
        kotlin.jvm.internal.f0.o(viewFindViewById, "rootView.findViewById(R.id.rl_root)");
        this.f82089c = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vg_topic);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "rootView.findViewById(R.id.vg_topic)");
        this.f82092d = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.vg_menu_element);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "rootView.findViewById(R.id.vg_menu_element)");
        this.f82094e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.et_reference);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "rootView.findViewById(R.id.et_reference)");
        this.f82108l = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.fl_expression);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "rootView.findViewById(R.id.fl_expression)");
        this.f82110m = (FrameLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.webView);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "rootView.findViewById(R.id.webView)");
        this.f82112n = (WebView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.pf_first_title);
        kotlin.jvm.internal.f0.o(viewFindViewById7, "rootView.findViewById(R.id.pf_first_title)");
        this.f82114o = (PostFormatView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.pf_second_title);
        kotlin.jvm.internal.f0.o(viewFindViewById8, "rootView.findViewById(R.id.pf_second_title)");
        this.f82116p = (PostFormatView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.pf_bold);
        kotlin.jvm.internal.f0.o(viewFindViewById9, "rootView.findViewById(R.id.pf_bold)");
        this.f82121q = (PostFormatView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.pf_blockquote);
        kotlin.jvm.internal.f0.o(viewFindViewById10, "rootView.findViewById(R.id.pf_blockquote)");
        this.f82123r = (PostFormatView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.pf_unorderlist);
        kotlin.jvm.internal.f0.o(viewFindViewById11, "rootView.findViewById(R.id.pf_unorderlist)");
        this.f82125s = (PostFormatView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.pf_orderlist);
        kotlin.jvm.internal.f0.o(viewFindViewById12, "rootView.findViewById(R.id.pf_orderlist)");
        this.f82127t = (PostFormatView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.tv_preview_title);
        kotlin.jvm.internal.f0.o(viewFindViewById13, "rootView.findViewById(R.id.tv_preview_title)");
        this.f82129u = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.vg_preview_title_placeholder);
        kotlin.jvm.internal.f0.o(viewFindViewById14, "rootView.findViewById(R.…review_title_placeholder)");
        this.f82131v = viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.vg_preview_bottom_bar);
        kotlin.jvm.internal.f0.o(viewFindViewById15, "rootView.findViewById(R.id.vg_preview_bottom_bar)");
        this.f82133w = viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.vg_preview_bottom_bar_placeholder);
        kotlin.jvm.internal.f0.o(viewFindViewById16, "rootView.findViewById(R.…w_bottom_bar_placeholder)");
        this.f82135x = viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.iv_preview_img);
        kotlin.jvm.internal.f0.o(viewFindViewById17, "rootView.findViewById(R.id.iv_preview_img)");
        this.f82139y = (ImageView) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.tv_change_preview_img);
        kotlin.jvm.internal.f0.o(viewFindViewById18, "rootView.findViewById(R.id.tv_change_preview_img)");
        this.f82143z = (TextView) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.siv_article_type);
        kotlin.jvm.internal.f0.o(viewFindViewById19, "rootView.findViewById(R.id.siv_article_type)");
        this.Q = (SettingItemView) viewFindViewById19;
        View viewFindViewById20 = view.findViewById(R.id.siv_reprint_tips);
        kotlin.jvm.internal.f0.o(viewFindViewById20, "rootView.findViewById(R.id.siv_reprint_tips)");
        this.R = (SettingItemView) viewFindViewById20;
        View viewFindViewById21 = view.findViewById(R.id.siv_auth);
        kotlin.jvm.internal.f0.o(viewFindViewById21, "rootView.findViewById(R.id.siv_auth)");
        this.S = (SettingItemView) viewFindViewById21;
        View viewFindViewById22 = view.findViewById(R.id.vg_reference);
        kotlin.jvm.internal.f0.o(viewFindViewById22, "rootView.findViewById(R.id.vg_reference)");
        this.f82106k = viewFindViewById22;
        View viewFindViewById23 = view.findViewById(R.id.sv_container);
        kotlin.jvm.internal.f0.o(viewFindViewById23, "rootView.findViewById(R.id.sv_container)");
        this.A = (ConsecutiveScrollerLayout) viewFindViewById23;
        View viewFindViewById24 = view.findViewById(R.id.vg_article_preview);
        kotlin.jvm.internal.f0.o(viewFindViewById24, "rootView.findViewById(R.id.vg_article_preview)");
        this.B = viewFindViewById24;
        View viewFindViewById25 = view.findViewById(R.id.iv_hashtag);
        kotlin.jvm.internal.f0.o(viewFindViewById25, "rootView.findViewById(R.id.iv_hashtag)");
        this.C = (ImageView) viewFindViewById25;
        View viewFindViewById26 = view.findViewById(R.id.iv_at);
        kotlin.jvm.internal.f0.o(viewFindViewById26, "rootView.findViewById(R.id.iv_at)");
        this.D = (ImageView) viewFindViewById26;
        View viewFindViewById27 = view.findViewById(R.id.iv_emoji);
        kotlin.jvm.internal.f0.o(viewFindViewById27, "rootView.findViewById(R.id.iv_emoji)");
        this.E = (ImageView) viewFindViewById27;
        View viewFindViewById28 = view.findViewById(R.id.iv_picture);
        kotlin.jvm.internal.f0.o(viewFindViewById28, "rootView.findViewById(R.id.iv_picture)");
        this.F = (ImageView) viewFindViewById28;
        View viewFindViewById29 = view.findViewById(R.id.iv_format);
        kotlin.jvm.internal.f0.o(viewFindViewById29, "rootView.findViewById(R.id.iv_format)");
        this.G = (ImageView) viewFindViewById29;
        View viewFindViewById30 = view.findViewById(R.id.iv_more);
        kotlin.jvm.internal.f0.o(viewFindViewById30, "rootView.findViewById(R.id.iv_more)");
        this.H = (ImageView) viewFindViewById30;
        View viewFindViewById31 = view.findViewById(R.id.iv_undo);
        kotlin.jvm.internal.f0.o(viewFindViewById31, "rootView.findViewById(R.id.iv_undo)");
        this.I = (ImageView) viewFindViewById31;
        View viewFindViewById32 = view.findViewById(R.id.iv_redo);
        kotlin.jvm.internal.f0.o(viewFindViewById32, "rootView.findViewById(R.id.iv_redo)");
        this.J = (ImageView) viewFindViewById32;
        View viewFindViewById33 = view.findViewById(R.id.vg_edit_bar);
        kotlin.jvm.internal.f0.o(viewFindViewById33, "rootView.findViewById(R.id.vg_edit_bar)");
        this.K = viewFindViewById33;
        View viewFindViewById34 = view.findViewById(R.id.vg_menu_format);
        kotlin.jvm.internal.f0.o(viewFindViewById34, "rootView.findViewById(R.id.vg_menu_format)");
        this.L = (ViewGroup) viewFindViewById34;
        View viewFindViewById35 = view.findViewById(R.id.ll_topic);
        kotlin.jvm.internal.f0.o(viewFindViewById35, "rootView.findViewById(R.id.ll_topic)");
        this.M = (LinearLayout) viewFindViewById35;
        View viewFindViewById36 = view.findViewById(R.id.vg_add_topics);
        kotlin.jvm.internal.f0.o(viewFindViewById36, "rootView.findViewById(R.id.vg_add_topics)");
        this.N = (ViewGroup) viewFindViewById36;
        View viewFindViewById37 = view.findViewById(R.id.tv_add_topics);
        kotlin.jvm.internal.f0.o(viewFindViewById37, "rootView.findViewById(R.id.tv_add_topics)");
        this.O = (TextView) viewFindViewById37;
        View viewFindViewById38 = view.findViewById(R.id.tv_total_text_num);
        kotlin.jvm.internal.f0.o(viewFindViewById38, "rootView.findViewById(R.id.tv_total_text_num)");
        this.P = (TextView) viewFindViewById38;
        View viewFindViewById39 = view.findViewById(R.id.iv_post_setting);
        kotlin.jvm.internal.f0.o(viewFindViewById39, "rootView.findViewById(R.id.iv_post_setting)");
        this.T = (ImageView) viewFindViewById39;
        View viewFindViewById40 = view.findViewById(R.id.vg_horn);
        kotlin.jvm.internal.f0.o(viewFindViewById40, "rootView.findViewById(R.id.vg_horn)");
        this.U = (ViewGroup) viewFindViewById40;
        View viewFindViewById41 = view.findViewById(R.id.tv_horn);
        kotlin.jvm.internal.f0.o(viewFindViewById41, "rootView.findViewById(R.id.tv_horn)");
        this.V = (TextView) viewFindViewById41;
        View viewFindViewById42 = view.findViewById(R.id.vg_post_setting_bubble);
        kotlin.jvm.internal.f0.o(viewFindViewById42, "rootView.findViewById(R.id.vg_post_setting_bubble)");
        this.W = (ViewGroup) viewFindViewById42;
    }

    private final void v7(boolean z10) {
        String string;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29704, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.Y;
        if (i10 == 0 || i10 == 9) {
            int iQ = com.max.hbutils.utils.n.q(this.f82130u4);
            if (!z10 || (this.f82130u4 != null && iQ <= 0)) {
                this.mTitleBar.getAppbarActionTextView().setText(R.string.post);
                this.mTitleBar.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
                this.mTitleBar.getAppbarActionTextView().setOnClickListener(this.I4);
            } else {
                TextView appbarActionTextView = this.mTitleBar.getAppbarActionTextView();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) this.mContext.getResources().getText(R.string.draft));
                if (iQ > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(' ');
                    sb3.append(iQ);
                    string = sb3.toString();
                } else {
                    string = "";
                }
                sb2.append(string);
                appbarActionTextView.setText(sb2.toString());
                this.mTitleBar.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
                this.mTitleBar.getAppbarActionTextView().setOnClickListener(new x());
            }
            String string2 = getString(R.string.post_article);
            kotlin.jvm.internal.f0.o(string2, "if (BuildConfig.MAX) get…ng(R.string.post_article)");
            if (!z10) {
                this.mTitleBar.setTitle(string2);
                this.mTitleBar.getAppbarTitleTextView().setOnClickListener(null);
                return;
            }
            this.mTitleBar.getAppbarTitleTextView().setOnClickListener(new y());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2 + " \uf0d7");
            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), string2.length() + 1, spannableStringBuilder.length(), 33);
            this.mTitleBar.setTitle(spannableStringBuilder);
        }
    }

    private final void v8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29776, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("hb_editor.setPlaceHolder(\"%s\");", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
    }

    public static final /* synthetic */ void w5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29840, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.V7();
    }

    private final void w6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29766, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.setBlockquote();");
    }

    private final void w7(WebView webView) {
        if (PatchProxy.proxy(new Object[]{webView}, this, changeQuickRedirect, false, 29705, new Class[]{WebView.class}, Void.TYPE).isSupported) {
            return;
        }
        webView.setOnTouchListener(new z());
        webView.setWebViewClient(new a0());
        WebSettings settings = webView.getSettings();
        kotlin.jvm.internal.f0.o(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setMixedContentMode(0);
        WebView webView2 = this.f82112n;
        if (webView2 == null) {
            kotlin.jvm.internal.f0.S("mWebView");
            webView2 = null;
        }
        webView2.addJavascriptInterface(new c(), "local_obj");
    }

    private final void w8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29710, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey("1");
        keyDescObj.setDesc(getString(R.string.original_article));
        keyDescObj.setChecked(kotlin.jvm.internal.f0.g(this.f82119p3, "1"));
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("0");
        keyDescObj2.setDesc(getString(R.string.reprinted_article));
        keyDescObj2.setChecked(kotlin.jvm.internal.f0.g(this.f82119p3, "0"));
        arrayList.add(keyDescObj2);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList, true);
        heyBoxPopupMenu.R(new s0(heyBoxPopupMenu));
        heyBoxPopupMenu.show();
    }

    public static final /* synthetic */ void x5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29850, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.W7();
    }

    private final void x6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29765, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I6("hb_editor.execute.setBold();");
    }

    private final void x7(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29790, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b(N4, "insertAtUser userName=" + str + "\tuserID=" + str2);
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(str);
        String str3 = String.format("hb_editor.execute.insertFriend('%s',%s);", Arrays.copyOf(new Object[]{sb2.toString(), str2}, 2));
        kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
        I6(str3);
    }

    private final void x8(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29756, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.dialog_post_link_edit, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View viewFindViewById = viewInflate.findViewById(R.id.et_link_title);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_url);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_title);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = viewInflate.findViewById(R.id.vg_url_editor);
        kotlin.jvm.internal.f0.n(viewFindViewById4, "null cannot be cast to non-null type android.view.ViewGroup");
        ((TextView) viewFindViewById3).setText("图片注解");
        editText.setHint("输入图片注解");
        ((TextView) viewFindViewById2).setVisibility(8);
        ((ViewGroup) viewFindViewById4).setVisibility(8);
        boolean z10 = !com.max.hbcommon.utils.c.u(str2);
        if (!com.max.hbcommon.utils.c.u(str2)) {
            editText.setText(str2);
            editText.setSelection(str2 != null ? str2.length() : 0);
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.mContext);
        fVar.y("").i(viewInflate).w(true).u(z10 ? "更新注解" : "确定", new t0(str, editText)).o("取消", u0.f82260b);
        fVar.F();
    }

    public static final /* synthetic */ void y5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29867, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.a8();
    }

    private final void y6(ImageView imageView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{imageView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29711, new Class[]{ImageView.class, Boolean.TYPE}, Void.TYPE).isSupported || imageView == null) {
            return;
        }
        imageView.setColorFilter(getViewContext().getResources().getColor(z10 ? R.color.text_primary_1_color : R.color.text_secondary_1_color));
    }

    private final void y7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29775, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("hb_editor.execute.insertEmoji(\"%s\");", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
    }

    private final void y8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29747, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebView webView = this.f82112n;
        if (webView == null) {
            kotlin.jvm.internal.f0.S("mWebView");
            webView = null;
        }
        webView.loadUrl("javascript:window.showLabel()");
    }

    public static final /* synthetic */ void z5(NewLinkEditFragment newLinkEditFragment) {
        if (PatchProxy.proxy(new Object[]{newLinkEditFragment}, null, changeQuickRedirect, true, 29868, new Class[]{NewLinkEditFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newLinkEditFragment.b8();
    }

    private final boolean z6() {
        LiveData<Boolean> liveDataU;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29694, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        PostTabActivityViewModel postTabActivityViewModel = this.f82142y4;
        if (postTabActivityViewModel != null) {
            if (!((postTabActivityViewModel == null || (liveDataU = postTabActivityViewModel.u()) == null) ? false : kotlin.jvm.internal.f0.g(liveDataU.f(), Boolean.FALSE))) {
                PostTabActivityViewModel postTabActivityViewModel2 = this.f82142y4;
                if (!((postTabActivityViewModel2 == null || postTabActivityViewModel2.v(this.A4)) ? false : true)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void z7(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29787, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b(N4, "insertFriend text=" + str + "    user_id" + str2);
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str3 = String.format("hb_editor.execute.insertFriend(\"%s\", \"%s\");", Arrays.copyOf(new Object[]{str, str2}, 2));
        kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
        I6(str3);
    }

    private final void z8(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29759, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        final boolean z10 = (com.max.hbcommon.utils.c.u(str) && com.max.hbcommon.utils.c.u(str2)) ? false : true;
        final com.max.xiaoheihe.module.bbs.post_edit.h hVarA = com.max.xiaoheihe.module.bbs.post_edit.h.f82972l.a(z10, str, str2);
        hVarA.T3(new yh.p<String, String, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$showLinkEditDialog$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(String str3, String str4) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str3, str4}, this, changeQuickRedirect, false, 30024, new Class[]{Object.class, Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str3, str4);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e String str3, @dl.e String str4) {
                if (PatchProxy.proxy(new Object[]{str3, str4}, this, changeQuickRedirect, false, 30023, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (z10) {
                    NewLinkEditFragment.k6(this, str3, str4);
                } else {
                    NewLinkEditFragment.m5(this, str3, str4);
                }
                hVarA.dismiss();
            }
        });
        hVarA.S3(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$showLinkEditDialog$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30026, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30025, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (z10) {
                    NewLinkEditFragment.A5(this);
                }
                hVarA.dismiss();
            }
        });
        hVarA.M3(getChildFragmentManager(), "NewLinkEditFragment");
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.k
    public void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29821, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82128t4 = false;
        if (isActive()) {
            v7(false);
        }
    }

    public final void E6(@dl.e Intent intent) {
        Bitmap bitmapDecodeFile;
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 29816, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        activity.revokeUriPermission(com.max.xiaoheihe.utils.d.w0(activity, this.P3), 2);
        try {
            if (this.P3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("size:");
                File file = this.P3;
                kotlin.jvm.internal.f0.m(file);
                sb2.append(file.length());
                sb2.append(" max:2097152");
                Log.d("BitmapSize", sb2.toString());
                try {
                    File file2 = this.P3;
                    kotlin.jvm.internal.f0.m(file2);
                    if (file2.length() <= 2097152) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = 1;
                        File file3 = this.P3;
                        kotlin.jvm.internal.f0.m(file3);
                        Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(file3.getPath(), options);
                        Log.d("BitmapSize", "width:" + options.outWidth + " height:" + options.outHeight);
                        if (options.outWidth >= 900 && options.outHeight >= 480) {
                            bitmapDecodeFile = bitmapDecodeFile2;
                        }
                        com.max.hbutils.utils.c.d("请选择尺寸不低于900*480的图片");
                        return;
                    }
                    File file4 = this.P3;
                    kotlin.jvm.internal.f0.m(file4);
                    bitmapDecodeFile = com.max.hbimage.b.k0(file4.getPath(), 1125.0f, 600.0f);
                    Log.d("BitmapSize", "width:" + bitmapDecodeFile.getWidth() + " height:" + bitmapDecodeFile.getHeight());
                } catch (Exception unused) {
                    File file5 = this.P3;
                    kotlin.jvm.internal.f0.m(file5);
                    bitmapDecodeFile = BitmapFactory.decodeFile(file5.getPath());
                }
                ImageView imageView = this.f82139y;
                if (imageView == null) {
                    kotlin.jvm.internal.f0.S("iv_preview_img");
                    imageView = null;
                }
                imageView.setImageBitmap(bitmapDecodeFile);
                ArrayList arrayList = new ArrayList();
                kotlin.jvm.internal.f0.m(bitmapDecodeFile);
                int height = bitmapDecodeFile.getHeight();
                int width = bitmapDecodeFile.getWidth();
                LinkImageObj linkImageObj = new LinkImageObj();
                this.G3 = linkImageObj;
                kotlin.jvm.internal.f0.m(linkImageObj);
                linkImageObj.setHeight(String.valueOf(height));
                LinkImageObj linkImageObj2 = this.G3;
                kotlin.jvm.internal.f0.m(linkImageObj2);
                linkImageObj2.setWidth(String.valueOf(width));
                LinkImageObj linkImageObj3 = this.G3;
                kotlin.jvm.internal.f0.m(linkImageObj3);
                File file6 = this.P3;
                kotlin.jvm.internal.f0.m(file6);
                linkImageObj3.setPath(file6.getPath());
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.f0.o(string, "randomUUID().toString()");
                LinkImageObj linkImageObj4 = this.G3;
                kotlin.jvm.internal.f0.m(linkImageObj4);
                linkImageObj4.setId(string);
                LinkImageObj linkImageObj5 = this.G3;
                kotlin.jvm.internal.f0.m(linkImageObj5);
                arrayList.add(linkImageObj5);
                q7(arrayList, true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.j
    public void F1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29706, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        M6(new i0());
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.d
    @dl.d
    public com.max.xiaoheihe.module.bbs.post_edit.auto_save.c<PostEditAutoSaveData> Q0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29824, new Class[0], com.max.xiaoheihe.module.bbs.post_edit.auto_save.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.xiaoheihe.module.bbs.post_edit.auto_save.c) patchProxyResultProxy.result;
        }
        Log.d("NewLinkEditFragment-dbg", "[getPostEditSaveDataProvider] postTypeEnumName: Article");
        boolean z10 = this.f82138x4;
        Bundle arguments = getArguments();
        return new com.max.xiaoheihe.module.bbs.post_edit.auto_save.a(z10, arguments != null ? arguments.getBoolean(PostTabActivity.G2) : false, this.f82141y2, this.Z, new yh.a<Integer>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$getPostEditSaveDataProvider$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29918, new Class[0], Integer.class);
                return patchProxyResultProxy2.isSupported ? (Integer) patchProxyResultProxy2.result : Integer.valueOf(this.f82174b.Y);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29919, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        }, new yh.a<LinkDraftObj>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$getPostEditSaveDataProvider$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: NewLinkEditFragment.kt */
            public static final class a implements NewLinkEditFragment.b {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ NewLinkEditFragment f82176a;

                a(NewLinkEditFragment newLinkEditFragment) {
                    this.f82176a = newLinkEditFragment;
                }

                @Override // com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment.b
                public void a(@dl.e String str) {
                    if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29922, new Class[]{String.class}, Void.TYPE).isSupported || this.f82176a.f82093d4 == null) {
                        return;
                    }
                    HtmlLinkContentObj htmlLinkContentObj = this.f82176a.f82093d4;
                    if (com.max.hbcommon.utils.c.u(htmlLinkContentObj != null ? htmlLinkContentObj.getContent() : null)) {
                        return;
                    }
                    this.f82176a.f82109l4 = true;
                    NewLinkEditFragment newLinkEditFragment = this.f82176a;
                    String strP = com.max.hbutils.utils.k.p(newLinkEditFragment.f82093d4);
                    kotlin.jvm.internal.f0.o(strP, "serialize(mLocalContent)");
                    HtmlLinkContentObj htmlLinkContentObj2 = this.f82176a.f82093d4;
                    NewLinkEditFragment.g6(newLinkEditFragment, strP, htmlLinkContentObj2 != null ? htmlLinkContentObj2.getTitle() : null);
                }
            }

            {
                super(0);
            }

            @dl.e
            public final LinkDraftObj a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29920, new Class[0], LinkDraftObj.class);
                if (patchProxyResultProxy2.isSupported) {
                    return (LinkDraftObj) patchProxyResultProxy2.result;
                }
                NewLinkEditFragment newLinkEditFragment = this.f82175b;
                NewLinkEditFragment.Z3(newLinkEditFragment, new a(newLinkEditFragment));
                if (this.f82175b.f82093d4 != null) {
                    NewLinkEditFragment newLinkEditFragment2 = this.f82175b;
                    String strP = com.max.hbutils.utils.k.p(newLinkEditFragment2.f82093d4);
                    kotlin.jvm.internal.f0.o(strP, "serialize(mLocalContent)");
                    HtmlLinkContentObj htmlLinkContentObj = newLinkEditFragment2.f82093d4;
                    NewLinkEditFragment.g6(newLinkEditFragment2, strP, htmlLinkContentObj != null ? htmlLinkContentObj.getTitle() : null);
                }
                return this.f82175b.f82111m4;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.bean.bbs.LinkDraftObj, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ LinkDraftObj invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29921, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        }, new yh.a<String>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$getPostEditSaveDataProvider$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.e
            public final String a() {
                List<BBSTextObj> imgs;
                BBSTextObj bBSTextObj;
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29923, new Class[0], String.class);
                if (patchProxyResultProxy2.isSupported) {
                    return (String) patchProxyResultProxy2.result;
                }
                HtmlLinkContentObj htmlLinkContentObj = this.f82177b.f82093d4;
                if (htmlLinkContentObj == null || (imgs = htmlLinkContentObj.getImgs()) == null || (bBSTextObj = (BBSTextObj) CollectionsKt___CollectionsKt.R2(imgs, 0)) == null) {
                    return null;
                }
                return bBSTextObj.getUrl();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ String invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29924, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        }, new NewLinkEditFragment$getPostEditSaveDataProvider$4(this));
    }

    @dl.e
    public final String Q6() {
        return this.f82130u4;
    }

    public final void S6(@dl.e Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 29815, new Class[]{Intent.class}, Void.TYPE).isSupported || intent == null) {
            return;
        }
        GameObj gameObj = (GameObj) intent.getSerializableExtra(com.max.hbsearch.l.B);
        String stringExtra = intent.getStringExtra(com.max.hbsearch.l.C);
        if (gameObj == null || com.max.hbcommon.utils.c.u(stringExtra)) {
            com.max.hbutils.utils.c.f(getString(R.string.fail));
        } else {
            A7(com.max.hbutils.utils.k.p(gameObj));
        }
    }

    @dl.d
    public final kotlinx.coroutines.q0 U6() {
        return this.f82086b;
    }

    @dl.d
    public final View.OnClickListener W6() {
        return this.K4;
    }

    @dl.d
    public final View.OnClickListener X6() {
        return this.J4;
    }

    @dl.d
    public final View.OnClickListener c7() {
        return this.I4;
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29822, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        u6();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        String string;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29823, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = this.B4;
        com.max.xiaoheihe.module.bbs.post_edit.i iVar = null;
        JsonObject jsonObjectDeepCopy = jsonObject != null ? jsonObject.deepCopy() : null;
        if (jsonObjectDeepCopy == null) {
            jsonObjectDeepCopy = new JsonObject();
        }
        int i10 = this.Y;
        if (i10 == 11 || i10 == 12 || i10 == 14) {
            jsonObjectDeepCopy.addProperty("post_type", "2");
        } else {
            jsonObjectDeepCopy.addProperty("post_type", "1");
        }
        com.max.xiaoheihe.module.bbs.post_edit.i iVar2 = this.X;
        if (iVar2 == null) {
            kotlin.jvm.internal.f0.S("linkEditHashTagManager");
        } else {
            iVar = iVar2;
        }
        jsonObjectDeepCopy.addProperty("tags", CollectionsKt___CollectionsKt.h3(iVar.h(), Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null));
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("h_src")) == null) {
            string = "";
        }
        jsonObjectDeepCopy.addProperty("h_src", string);
        if (!com.max.hbcommon.utils.c.u(this.A4)) {
            jsonObjectDeepCopy.addProperty("source", this.A4);
        }
        return jsonObjectDeepCopy.toString();
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.a.c
    public void h2(@dl.e ArrayList<TopicHashtagWrapper> arrayList, boolean z10) {
        String name;
        String name2;
        if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29811, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        G7();
        String str = "onChooseTopic result = " + arrayList;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (NewLinkEditFragment.class.isAnonymousClass()) {
            name = NewLinkEditFragment.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = NewLinkEditFragment.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        ArrayList<BBSTopicObj> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        if (arrayList != null) {
            for (TopicHashtagWrapper topicHashtagWrapper : arrayList) {
                if (topicHashtagWrapper.isTopic()) {
                    BBSTopicObj topic = topicHashtagWrapper.getTopic();
                    kotlin.jvm.internal.f0.m(topic);
                    arrayList2.add(topic);
                    p0("");
                } else {
                    HashtagObj hashtag = topicHashtagWrapper.getHashtag();
                    if (hashtag != null && (name2 = hashtag.getName()) != null) {
                        kotlin.jvm.internal.f0.o(name2, "name");
                        arrayList3.add(name2);
                        p0(name2);
                    }
                }
            }
            this.f82085a4 = arrayList2;
            com.max.xiaoheihe.module.bbs.post_edit.i iVar = this.X;
            if (iVar == null) {
                kotlin.jvm.internal.f0.S("linkEditHashTagManager");
                iVar = null;
            }
            iVar.m(arrayList3);
            j1();
            d7();
        }
        if (z10) {
            I7(this, null, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:225:0x038c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127  */
    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        Object objB;
        Object objB2;
        Object objB3;
        LinearLayout linearLayout;
        IBinder binder;
        String str;
        IBinder binder2;
        String str2;
        IBinder binder3;
        LinkDraftObj linkDraftObj;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29685, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        setContentView(R.layout.fragment_new_link_edit);
        v6(view);
        o6(view);
        L6();
        WebView webView = this.f82112n;
        if (webView == null) {
            kotlin.jvm.internal.f0.S("mWebView");
            webView = null;
        }
        w7(webView);
        View view2 = this.mContentView;
        int iD = n3.m.d();
        View mContentView = this.mContentView;
        kotlin.jvm.internal.f0.o(mContentView, "mContentView");
        j1.y2(view2, new bf.d(iD, mContentView, new yh.l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.e Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 29961, new Class[]{Boolean.class}, Void.TYPE).isSupported || kotlin.jvm.internal.f0.g(bool, Boolean.FALSE)) {
                    return;
                }
                NewLinkEditFragment.g5(NewLinkEditFragment.this);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 29962, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool);
                return b2.f124493a;
            }
        }, null, null, 24, null));
        if (com.max.hbcommon.network.b.f68052i) {
            WebView webView2 = this.f82112n;
            if (webView2 == null) {
                kotlin.jvm.internal.f0.S("mWebView");
                webView2 = null;
            }
            webView2.loadUrl("file:///android_asset/WebEditor/heybox_android.html");
        } else {
            WebView webView3 = this.f82112n;
            if (webView3 == null) {
                kotlin.jvm.internal.f0.S("mWebView");
                webView3 = null;
            }
            webView3.loadUrl("file:///android_asset/WebEditor/heybox_android.html");
        }
        Bundle arguments = getArguments();
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            if (arguments == null || (binder3 = arguments.getBinder("draft_info")) == null) {
                objB = null;
            } else {
                kotlin.jvm.internal.f0.m(binder3);
                if (binder3.isBinderAlive() && (binder3 instanceof InProgressLargeObjHoldBinder)) {
                    Object holdObj = ((InProgressLargeObjHoldBinder) binder3).getHoldObj();
                    if (!(holdObj instanceof LinkDraftObj)) {
                        holdObj = null;
                    }
                    linkDraftObj = (LinkDraftObj) holdObj;
                } else {
                    linkDraftObj = null;
                }
                objB = kotlin.Result.b(linkDraftObj);
                Throwable thE = kotlin.Result.e(objB);
                if (thE != null) {
                    com.max.heybox.hblog.g.f74531b.w("[AccelWorld-dbg][fastGetObjFromHoldBinder]\nthis: " + arguments + ", key: draft_info", thE);
                }
                kotlin.Result.j(objB);
                if (kotlin.Result.i(objB)) {
                    objB = null;
                }
            }
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(kotlin.t0.a(th2));
        }
        this.f82111m4 = (LinkDraftObj) objB;
        Bundle arguments2 = getArguments();
        try {
            kotlin.Result.a aVar3 = kotlin.Result.f124476c;
            if (arguments2 == null || (binder2 = arguments2.getBinder(f82060c5)) == null) {
                objB2 = null;
            } else {
                kotlin.jvm.internal.f0.m(binder2);
                if (binder2.isBinderAlive() && (binder2 instanceof InProgressLargeObjHoldBinder)) {
                    Object holdObj2 = ((InProgressLargeObjHoldBinder) binder2).getHoldObj();
                    if (!(holdObj2 instanceof String)) {
                        holdObj2 = null;
                    }
                    str2 = (String) holdObj2;
                } else {
                    str2 = null;
                }
                objB2 = kotlin.Result.b(str2);
                Throwable thE2 = kotlin.Result.e(objB2);
                if (thE2 != null) {
                    com.max.heybox.hblog.g.f74531b.w("[AccelWorld-dbg][fastGetObjFromHoldBinder]\nthis: " + arguments2 + ", key: " + f82060c5, thE2);
                }
                kotlin.Result.j(objB2);
                if (kotlin.Result.i(objB2)) {
                    objB2 = null;
                }
            }
        } catch (Throwable th3) {
            kotlin.Result.a aVar4 = kotlin.Result.f124476c;
            objB2 = kotlin.Result.b(kotlin.t0.a(th3));
        }
        this.f82141y2 = (String) objB2;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.V3 = strValueOf;
        E5 = strValueOf;
        ViewGroup viewGroup = this.W;
        if (viewGroup == null) {
            kotlin.jvm.internal.f0.S("vg_post_setting_bubble");
            viewGroup = null;
        }
        int i10 = 8;
        viewGroup.setVisibility(8);
        if (!this.f82115o4 || this.f82124r4) {
            ImageView imageView = this.T;
            if (imageView == null) {
                kotlin.jvm.internal.f0.S("iv_post_setting");
                imageView = null;
            }
            imageView.setVisibility(8);
        } else {
            if (MMKVManager.f71329a.d(ad.e.f1248a, ad.e.f1253f, true, false)) {
                ViewGroup viewGroup2 = this.W;
                if (viewGroup2 == null) {
                    kotlin.jvm.internal.f0.S("vg_post_setting_bubble");
                    viewGroup2 = null;
                }
                viewGroup2.setVisibility(0);
                ViewGroup viewGroup3 = this.W;
                if (viewGroup3 == null) {
                    kotlin.jvm.internal.f0.S("vg_post_setting_bubble");
                    viewGroup3 = null;
                }
                com.max.xiaoheihe.accelworld.s.c(viewGroup3);
                ViewGroup viewGroup4 = this.W;
                if (viewGroup4 == null) {
                    kotlin.jvm.internal.f0.S("vg_post_setting_bubble");
                    viewGroup4 = null;
                }
                viewGroup4.setOnClickListener(new b0());
            }
            ImageView imageView2 = this.T;
            if (imageView2 == null) {
                kotlin.jvm.internal.f0.S("iv_post_setting");
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.T;
            if (imageView3 == null) {
                kotlin.jvm.internal.f0.S("iv_post_setting");
                imageView3 = null;
            }
            imageView3.setOnClickListener(new c0());
        }
        if (this.f82124r4) {
            ImageView imageView4 = this.I;
            if (imageView4 == null) {
                kotlin.jvm.internal.f0.S("iv_undo");
                imageView4 = null;
            }
            imageView4.setVisibility(8);
            ImageView imageView5 = this.J;
            if (imageView5 == null) {
                kotlin.jvm.internal.f0.S("iv_redo");
                imageView5 = null;
            }
            imageView5.setVisibility(8);
        } else {
            ImageView imageView6 = this.I;
            if (imageView6 == null) {
                kotlin.jvm.internal.f0.S("iv_undo");
                imageView6 = null;
            }
            imageView6.setVisibility(0);
            ImageView imageView7 = this.J;
            if (imageView7 == null) {
                kotlin.jvm.internal.f0.S("iv_redo");
                imageView7 = null;
            }
            imageView7.setVisibility(0);
        }
        LinkDraftObj linkDraftObj2 = this.f82111m4;
        if (linkDraftObj2 == null) {
            this.f82111m4 = new LinkDraftObj(System.currentTimeMillis() + "", LinkDraftObj.DRAFT_TYPE_HTML);
        } else {
            this.W3 = true;
            if ((linkDraftObj2 != null ? linkDraftObj2.getVoteInfo() : null) != null) {
                LinkDraftObj linkDraftObj3 = this.f82111m4;
                this.f82103i4 = linkDraftObj3 != null ? linkDraftObj3.getVoteInfo() : null;
                I8();
            }
            int i11 = this.Y;
            if ((i11 == 0 || i11 == 9 || i11 == 11 || i11 == 12 || i11 == 14) && this.f82140y1 == null) {
                LinkDraftObj linkDraftObj4 = this.f82111m4;
                this.f82140y1 = linkDraftObj4 != null ? linkDraftObj4.getBtn() : null;
            }
            List[] listArr = new List[1];
            LinkDraftObj linkDraftObj5 = this.f82111m4;
            listArr[0] = linkDraftObj5 != null ? linkDraftObj5.getCheckedTopics() : null;
            if (!com.max.hbcommon.utils.c.w(listArr)) {
                ArrayList<BBSTopicObj> arrayList = this.f82085a4;
                kotlin.jvm.internal.f0.m(arrayList);
                LinkDraftObj linkDraftObj6 = this.f82111m4;
                kotlin.jvm.internal.f0.m(linkDraftObj6);
                arrayList.addAll(linkDraftObj6.getCheckedTopics());
            }
            LinkDraftObj linkDraftObj7 = this.f82111m4;
            this.Y3 = linkDraftObj7 != null ? linkDraftObj7.deepCopyByJson() : null;
            LinkDraftObj linkDraftObj8 = this.f82111m4;
            this.f82119p3 = linkDraftObj8 != null ? linkDraftObj8.getArticle_type() : null;
            LinkDraftObj linkDraftObj9 = this.f82111m4;
            this.G3 = linkDraftObj9 != null ? linkDraftObj9.getArticle_img() : null;
            LinkDraftObj linkDraftObj10 = this.f82111m4;
            this.K3 = linkDraftObj10 != null ? linkDraftObj10.getArticle_reprint_tips() : null;
            LinkDraftObj linkDraftObj11 = this.f82111m4;
            String article_reference = linkDraftObj11 != null ? linkDraftObj11.getArticle_reference() : null;
            LinkDraftObj linkDraftObj12 = this.f82111m4;
            this.L3 = linkDraftObj12 != null ? linkDraftObj12.getArticle_auth() : null;
            LinkDraftObj linkDraftObj13 = this.f82111m4;
            this.M3 = linkDraftObj13 != null ? linkDraftObj13.getView_limit() : null;
            if (!com.max.hbcommon.utils.c.u(article_reference)) {
                TextView textView = this.f82108l;
                if (textView == null) {
                    kotlin.jvm.internal.f0.S("et_reference");
                    textView = null;
                }
                textView.setText(article_reference);
            }
        }
        LinkDraftObj linkDraftObj14 = this.f82111m4;
        if (linkDraftObj14 != null) {
            linkDraftObj14.setLink_id(this.f82117p1);
        }
        View view3 = this.B;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("vg_article_preview");
            view3 = null;
        }
        if (!this.f82115o4 && PostUtils.f81983a.k(this.Y)) {
            i10 = 0;
        }
        view3.setVisibility(i10);
        if (!com.max.hbcommon.utils.c.w(this.f82087b0)) {
            ArrayList<BBSTopicObj> arrayList2 = this.f82085a4;
            kotlin.jvm.internal.f0.m(arrayList2);
            ArrayList<BBSTopicObj> arrayList3 = this.f82087b0;
            kotlin.jvm.internal.f0.m(arrayList3);
            arrayList2.addAll(arrayList3);
        } else if (this.f82090c0 != null) {
            ArrayList<BBSTopicObj> arrayList4 = this.f82085a4;
            kotlin.jvm.internal.f0.m(arrayList4);
            BBSTopicObj bBSTopicObj = this.f82090c0;
            kotlin.jvm.internal.f0.m(bBSTopicObj);
            arrayList4.add(bBSTopicObj);
        }
        i7();
        V6();
        Bundle arguments3 = getArguments();
        try {
            kotlin.Result.a aVar5 = kotlin.Result.f124476c;
            if (arguments3 == null || (binder = arguments3.getBinder(f82064g5)) == null) {
                objB3 = null;
            } else {
                kotlin.jvm.internal.f0.m(binder);
                if (binder.isBinderAlive() && (binder instanceof InProgressLargeObjHoldBinder)) {
                    Object holdObj3 = ((InProgressLargeObjHoldBinder) binder).getHoldObj();
                    if (!(holdObj3 instanceof String)) {
                        holdObj3 = null;
                    }
                    str = (String) holdObj3;
                } else {
                    str = null;
                }
                objB3 = kotlin.Result.b(str);
                Throwable thE3 = kotlin.Result.e(objB3);
                if (thE3 != null) {
                    com.max.heybox.hblog.g.f74531b.w("[AccelWorld-dbg][fastGetObjFromHoldBinder]\nthis: " + arguments3 + ", key: " + f82064g5, thE3);
                }
                kotlin.Result.j(objB3);
                if (kotlin.Result.i(objB3)) {
                    objB3 = null;
                }
            }
        } catch (Throwable th4) {
            kotlin.Result.a aVar6 = kotlin.Result.f124476c;
            objB3 = kotlin.Result.b(kotlin.t0.a(th4));
        }
        this.S3 = (String) objB3;
        h7(null);
        ViewGroup viewGroup5 = this.f82089c;
        if (viewGroup5 == null) {
            kotlin.jvm.internal.f0.S("rl_root");
            viewGroup5 = null;
        }
        com.max.xiaoheihe.module.bbs.utils.d dVar = new com.max.xiaoheihe.module.bbs.utils.d(viewGroup5);
        this.f82095e4 = dVar;
        dVar.d(this);
        if (com.max.xiaoheihe.utils.i0.s()) {
            d7();
        }
        t7();
        PostTabActivityViewModel postTabActivityViewModel = this.f82142y4;
        if (postTabActivityViewModel != null && postTabActivityViewModel.v(this.A4)) {
            com.max.mediaselector.lib.utils.f.a aVar7 = new com.max.mediaselector.lib.utils.f.a();
            this.C4 = registerForActivityResult(new z.b.o(), aVar7);
            this.D4 = aVar7;
        }
        r7();
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        LayoutInflater mInflater = this.mInflater;
        kotlin.jvm.internal.f0.o(mInflater, "mInflater");
        int i12 = this.Y;
        LinearLayout linearLayout2 = this.M;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.f0.S("ll_topic");
            linearLayout = null;
        } else {
            linearLayout = linearLayout2;
        }
        this.X = new com.max.xiaoheihe.module.bbs.post_edit.i(mContext, this, mInflater, i12, linearLayout, getArguments(), this.f82137x2);
        j1();
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.j
    public void j1() {
        KeyDescObj keyDescObjF7;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29743, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.M;
        ViewGroup viewGroup = null;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("ll_topic");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (this.f82140y1 == null) {
            boolean z10 = this.f82124r4;
        }
        if (PostUtils.f81983a.k(this.Y) && (keyDescObjF7 = f7()) != null) {
            LayoutInflater layoutInflater = this.mInflater;
            LinearLayout linearLayout2 = this.M;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.f0.S("ll_topic");
                linearLayout2 = null;
            }
            View viewInflate = layoutInflater.inflate(R.layout.item_topics_new, (ViewGroup) linearLayout2, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_topic_icon);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_topic_name);
            ((ImageView) viewInflate.findViewById(R.id.iv_close)).setVisibility(8);
            textView.setText(keyDescObjF7.getName());
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            imageView.setImageResource(R.drawable.bbs_post_plan_icon_12x12);
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            LinearLayout linearLayout3 = this.M;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.f0.S("ll_topic");
                linearLayout3 = null;
            }
            linearLayout3.addView(viewInflate);
        }
        ArrayList<BBSTopicObj> arrayList = this.f82085a4;
        if (arrayList != null) {
            for (BBSTopicObj bBSTopicObj : arrayList) {
                if (kotlin.jvm.internal.f0.g(BBSTopicObj.TOPIC_ID_TIMELINE, bBSTopicObj.getTopic_id())) {
                    arrayList.remove(bBSTopicObj);
                } else {
                    LayoutInflater layoutInflater2 = this.mInflater;
                    LinearLayout linearLayout4 = this.M;
                    if (linearLayout4 == null) {
                        kotlin.jvm.internal.f0.S("ll_topic");
                        linearLayout4 = null;
                    }
                    View viewInflate2 = layoutInflater2.inflate(R.layout.item_topics_new, (ViewGroup) linearLayout4, false);
                    ImageView imageView2 = (ImageView) viewInflate2.findViewById(R.id.iv_topic_icon);
                    TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_topic_name);
                    ImageView imageView3 = (ImageView) viewInflate2.findViewById(R.id.iv_close);
                    com.max.hbimage.b.K(bBSTopicObj.getPic_url(), imageView2);
                    textView2.setText(bBSTopicObj.getName());
                    imageView3.setOnClickListener(new v0(bBSTopicObj));
                    imageView3.setVisibility(0);
                    LinearLayout linearLayout5 = this.M;
                    if (linearLayout5 == null) {
                        kotlin.jvm.internal.f0.S("ll_topic");
                        linearLayout5 = null;
                    }
                    linearLayout5.addView(viewInflate2);
                }
            }
        }
        com.max.xiaoheihe.module.bbs.post_edit.i iVar = this.X;
        if (iVar == null) {
            kotlin.jvm.internal.f0.S("linkEditHashTagManager");
            iVar = null;
        }
        iVar.p();
        TextView textView3 = this.O;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_add_topics");
            textView3 = null;
        }
        textView3.setText(this.mContext.getString(R.string.add_partitions_and_topics));
        ViewGroup viewGroup2 = this.N;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.f0.S("vg_add_topics");
        } else {
            viewGroup = viewGroup2;
        }
        viewGroup.setVisibility(0);
        Z7();
    }

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 29820, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.m(expressionObj);
        if (expressionObj.getType() != 0) {
            y7(expressionObj.getEmoji_key());
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkImageObj linkImageObj = new LinkImageObj();
        linkImageObj.setUrl(expressionObj.getUrl());
        arrayList.add(linkImageObj);
        E7(com.max.hbutils.utils.k.p(arrayList));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        String name;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29812, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 == -1) {
            if (i10 == 1001) {
                S6(intent);
            } else if (i10 != 1002) {
                com.max.xiaoheihe.module.bbs.post_edit.i iVar = null;
                switch (i10) {
                    case 101:
                        if (intent != null) {
                            this.f82085a4 = (ArrayList) intent.getSerializableExtra("choosed_topics");
                            j1();
                            d7();
                        }
                        break;
                    case 102:
                        this.f82103i4 = intent != null ? (BBSLinkVoteObj) intent.getSerializableExtra(EditVoteActivity.R) : null;
                        I8();
                        break;
                    case 103:
                        if (intent != null) {
                            String stringExtra = intent.getStringExtra("hashtag_name");
                            String str = "onActivityResult data = " + intent + ", hashtagname = " + stringExtra;
                            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
                            StringBuilder sb2 = new StringBuilder();
                            if (NewLinkEditFragment.class.isAnonymousClass()) {
                                name = NewLinkEditFragment.class.getName();
                                kotlin.jvm.internal.f0.m(name);
                            } else {
                                name = NewLinkEditFragment.class.getSimpleName();
                                kotlin.jvm.internal.f0.m(name);
                            }
                            sb2.append(name);
                            sb2.append(", ");
                            sb2.append(str);
                            aVar.q(sb2.toString());
                            if (stringExtra != null) {
                                com.max.xiaoheihe.module.bbs.post_edit.i iVar2 = this.X;
                                if (iVar2 == null) {
                                    kotlin.jvm.internal.f0.S("linkEditHashTagManager");
                                } else {
                                    iVar = iVar2;
                                }
                                iVar.c(stringExtra);
                            }
                        }
                        break;
                    case 104:
                        if (intent != null) {
                            x7(intent.getStringExtra("user_name"), intent.getStringExtra("user_id"));
                        }
                        break;
                    case 105:
                        if (intent != null) {
                            O7(this, (ArrayList) intent.getSerializableExtra("HEYBOX_UCROP.Multi_OutputUri"), false, 2, null);
                        }
                        break;
                }
            } else {
                E6(intent);
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 29683, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        if (context instanceof z0) {
            this.f82113n4 = (z0) context;
        } else {
            if (!(getActivity() instanceof z0)) {
                throw new IllegalArgumentException("parent must be SuperOnBackPressed");
            }
            androidx.activity.result.b parentFragment = getParentFragment();
            kotlin.jvm.internal.f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.post_edit.SuperOnBackPressed");
            this.f82113n4 = (z0) parentFragment;
        }
    }

    public final void onBackPressed() {
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29715, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f82124r4 && (i10 = this.Y) != 10 && i10 != 12) {
            M6(new f0());
            return;
        }
        PostTabActivityViewModel postTabActivityViewModel = this.f82142y4;
        if (postTabActivityViewModel != null) {
            postTabActivityViewModel.z();
        }
        B8();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29708, new Class[]{View.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        ImageView imageView = null;
        LinearLayout linearLayout = null;
        LinearLayout linearLayout2 = null;
        com.max.xiaoheihe.module.bbs.post_edit.i iVar = null;
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = null;
        switch (view.getId()) {
            case R.id.iv_at /* 2131362707 */:
                startActivityForResult(AddAtUserActivity.N1(this.mContext, this.f82105j4), 104);
                k8();
                break;
            case R.id.iv_emoji /* 2131362853 */:
                G7();
                if (this.f82099g4) {
                    this.f82099g4 = false;
                    com.max.hbexpression.q qVar = this.f82101h4;
                    if (qVar != null) {
                        qVar.C();
                    }
                    Object systemService = this.mContext.getSystemService("input_method");
                    kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).toggleSoftInput(0, 2);
                } else if (z6()) {
                    n7(this.mContext);
                    m7();
                    f8();
                } else {
                    H7(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onClick$1$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29982, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29981, new Class[0], Void.TYPE).isSupported && this.f82209b.isActive()) {
                                NewLinkEditFragment.g5(this.f82209b);
                                NewLinkEditFragment.B5(this.f82209b);
                            }
                        }
                    });
                }
                ImageView imageView2 = this.E;
                if (imageView2 == null) {
                    kotlin.jvm.internal.f0.S("iv_emoji");
                } else {
                    imageView = imageView2;
                }
                imageView.setImageResource(this.f82099g4 ? R.drawable.bbs_keyboard_filled_24x24 : R.drawable.bbs_emoji_filled_24x24);
                break;
            case R.id.iv_format /* 2131362878 */:
                G7();
                I7(this, null, 1, null);
                n7(this.mContext);
                com.max.hbexpression.q qVar2 = this.f82101h4;
                if (qVar2 != null) {
                    this.f82099g4 = false;
                    if (qVar2 != null) {
                        qVar2.C();
                    }
                }
                LinearLayout linearLayout3 = this.f82094e;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.f0.S("vg_menu_element");
                    linearLayout3 = null;
                }
                linearLayout3.setVisibility(8);
                ViewGroup viewGroup3 = this.L;
                if (viewGroup3 == null) {
                    kotlin.jvm.internal.f0.S("vg_menu_format");
                    viewGroup3 = null;
                }
                if (viewGroup3.getVisibility() != 0) {
                    ViewGroup viewGroup4 = this.L;
                    if (viewGroup4 == null) {
                        kotlin.jvm.internal.f0.S("vg_menu_format");
                    } else {
                        viewGroup2 = viewGroup4;
                    }
                    viewGroup2.setVisibility(0);
                } else {
                    ViewGroup viewGroup5 = this.L;
                    if (viewGroup5 == null) {
                        kotlin.jvm.internal.f0.S("vg_menu_format");
                    } else {
                        viewGroup = viewGroup5;
                    }
                    viewGroup.setVisibility(8);
                }
                break;
            case R.id.iv_hashtag /* 2131362911 */:
                com.max.xiaoheihe.module.bbs.post_edit.i iVar2 = this.X;
                if (iVar2 == null) {
                    kotlin.jvm.internal.f0.S("linkEditHashTagManager");
                } else {
                    iVar = iVar2;
                }
                iVar.k();
                k8();
                break;
            case R.id.iv_more /* 2131363040 */:
                n7(this.mContext);
                com.max.hbexpression.q qVar3 = this.f82101h4;
                if (qVar3 != null) {
                    this.f82099g4 = false;
                    if (qVar3 != null) {
                        qVar3.C();
                    }
                }
                ViewGroup viewGroup6 = this.L;
                if (viewGroup6 == null) {
                    kotlin.jvm.internal.f0.S("vg_menu_format");
                    viewGroup6 = null;
                }
                viewGroup6.setVisibility(8);
                LinearLayout linearLayout4 = this.f82094e;
                if (linearLayout4 == null) {
                    kotlin.jvm.internal.f0.S("vg_menu_element");
                    linearLayout4 = null;
                }
                if (linearLayout4.getVisibility() != 0) {
                    LinearLayout linearLayout5 = this.f82094e;
                    if (linearLayout5 == null) {
                        kotlin.jvm.internal.f0.S("vg_menu_element");
                    } else {
                        linearLayout2 = linearLayout5;
                    }
                    linearLayout2.setVisibility(0);
                } else {
                    LinearLayout linearLayout6 = this.f82094e;
                    if (linearLayout6 == null) {
                        kotlin.jvm.internal.f0.S("vg_menu_element");
                    } else {
                        linearLayout = linearLayout6;
                    }
                    linearLayout.setVisibility(8);
                }
                break;
            case R.id.iv_picture /* 2131363079 */:
                M7();
                k8();
                break;
            case R.id.iv_preview_img /* 2131363098 */:
                L7();
                break;
            case R.id.iv_redo /* 2131363120 */:
                G7();
                I7(this, null, 1, null);
                U7();
                break;
            case R.id.iv_undo /* 2131363240 */:
                G7();
                I7(this, null, 1, null);
                D8();
                break;
            case R.id.siv_article_type /* 2131364265 */:
                w8();
                break;
            case R.id.vg_add_topics /* 2131366223 */:
                F1();
                break;
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 29684, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null || ad.a.b(ad.a.I, false, 2, null)) {
            return;
        }
        this.F4 = (ActivityPostSettingViewModel) new androidx.lifecycle.y0(activity).a(ActivityPostSettingViewModel.class);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29695, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        MMKVManager.f71329a.k(ad.e.f1248a, ad.e.f1253f, false, false);
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29697, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        LinkEvaluateJSBroadcastReceiver linkEvaluateJSBroadcastReceiver = new LinkEvaluateJSBroadcastReceiver();
        this.U3 = linkEvaluateJSBroadcastReceiver;
        registerReceiver(linkEvaluateJSBroadcastReceiver, lb.a.U);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29712, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        E5 = this.V3;
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29700, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.U3);
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.j
    public void p0(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29789, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b(N4, "insertSubject text=" + str + "    subject_id");
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String str2 = String.format("window.onSelectedHashTag(\"%s\");", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        I6(str2);
    }

    public final void p8(@dl.e String str) {
        this.f82130u4 = str;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.post_setting.a
    public void r3(@dl.d PostSettingObj postSetting, boolean z10) {
        if (PatchProxy.proxy(new Object[]{postSetting, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29699, new Class[]{PostSettingObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(postSetting, "postSetting");
        S7(postSetting);
        if (z10) {
            I7(this, null, 1, null);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29707, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.registerEvents();
        ImageView imageView = this.C;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = null;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_hashtag");
            imageView = null;
        }
        imageView.setVisibility(8);
        ImageView imageView2 = this.D;
        if (imageView2 == null) {
            kotlin.jvm.internal.f0.S("iv_at");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this);
        ImageView imageView3 = this.E;
        if (imageView3 == null) {
            kotlin.jvm.internal.f0.S("iv_emoji");
            imageView3 = null;
        }
        imageView3.setOnClickListener(this);
        ImageView imageView4 = this.F;
        if (imageView4 == null) {
            kotlin.jvm.internal.f0.S("iv_picture");
            imageView4 = null;
        }
        imageView4.setOnClickListener(this);
        ImageView imageView5 = this.G;
        if (imageView5 == null) {
            kotlin.jvm.internal.f0.S("iv_format");
            imageView5 = null;
        }
        imageView5.setOnClickListener(this);
        ImageView imageView6 = this.H;
        if (imageView6 == null) {
            kotlin.jvm.internal.f0.S("iv_more");
            imageView6 = null;
        }
        imageView6.setOnClickListener(this);
        ImageView imageView7 = this.I;
        if (imageView7 == null) {
            kotlin.jvm.internal.f0.S("iv_undo");
            imageView7 = null;
        }
        imageView7.setOnClickListener(this);
        ImageView imageView8 = this.J;
        if (imageView8 == null) {
            kotlin.jvm.internal.f0.S("iv_redo");
            imageView8 = null;
        }
        imageView8.setOnClickListener(this);
        ViewGroup viewGroup = this.N;
        if (viewGroup == null) {
            kotlin.jvm.internal.f0.S("vg_add_topics");
            viewGroup = null;
        }
        viewGroup.setOnClickListener(this);
        ImageView imageView9 = this.f82139y;
        if (imageView9 == null) {
            kotlin.jvm.internal.f0.S("iv_preview_img");
            imageView9 = null;
        }
        imageView9.setOnClickListener(this);
        SettingItemView settingItemView = this.Q;
        if (settingItemView == null) {
            kotlin.jvm.internal.f0.S("siv_article_type");
            settingItemView = null;
        }
        settingItemView.setOnClickListener(this);
        SettingItemView settingItemView2 = this.R;
        if (settingItemView2 == null) {
            kotlin.jvm.internal.f0.S("siv_reprint_tips");
            settingItemView2 = null;
        }
        settingItemView2.setOnClickListener(this);
        SettingItemView settingItemView3 = this.S;
        if (settingItemView3 == null) {
            kotlin.jvm.internal.f0.S("siv_auth");
            settingItemView3 = null;
        }
        settingItemView3.setOnClickListener(this);
        PostMoreView postMoreView = this.f82096f;
        if (postMoreView == null) {
            kotlin.jvm.internal.f0.S("pm_at");
            postMoreView = null;
        }
        postMoreView.setOnClickListener(this.K4);
        PostMoreView postMoreView2 = this.f82098g;
        if (postMoreView2 == null) {
            kotlin.jvm.internal.f0.S("pm_super_link");
            postMoreView2 = null;
        }
        postMoreView2.setOnClickListener(this.K4);
        PostMoreView postMoreView3 = this.f82100h;
        if (postMoreView3 == null) {
            kotlin.jvm.internal.f0.S("pm_game");
            postMoreView3 = null;
        }
        postMoreView3.setOnClickListener(this.K4);
        PostMoreView postMoreView4 = this.f82102i;
        if (postMoreView4 == null) {
            kotlin.jvm.internal.f0.S("pm_vote");
            postMoreView4 = null;
        }
        postMoreView4.setOnClickListener(this.K4);
        PostMoreView postMoreView5 = this.f82104j;
        if (postMoreView5 == null) {
            kotlin.jvm.internal.f0.S("pm_game_album");
            postMoreView5 = null;
        }
        postMoreView5.setOnClickListener(this.K4);
        Ref.IntRef intRef = new Ref.IntRef();
        int iF = ViewUtils.f(getViewContext(), 125.0f);
        ConsecutiveScrollerLayout consecutiveScrollerLayout2 = this.A;
        if (consecutiveScrollerLayout2 == null) {
            kotlin.jvm.internal.f0.S("sv_container");
        } else {
            consecutiveScrollerLayout = consecutiveScrollerLayout2;
        }
        consecutiveScrollerLayout.setOnVerticalScrollChangeListener(new q0(intRef, iF, this));
    }

    @Override // com.max.xiaoheihe.module.bbs.utils.d.a
    public void s(boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 29817, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10 || i10 < 0) {
            this.f82097f4 = false;
        } else {
            this.f82097f4 = true;
        }
        com.max.hbexpression.q qVar = this.f82101h4;
        if (qVar != null && z10) {
            this.f82099g4 = false;
            if (qVar != null) {
                qVar.C();
            }
        }
        r6();
        q6();
        s6();
    }

    public final void s8(@dl.d kotlinx.coroutines.q0 q0Var) {
        if (PatchProxy.proxy(new Object[]{q0Var}, this, changeQuickRedirect, false, 29682, new Class[]{kotlinx.coroutines.q0.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(q0Var, "<set-?>");
        this.f82086b = q0Var;
    }

    public final void t8(@dl.d View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 29758, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(onClickListener, "<set-?>");
        this.K4 = onClickListener;
    }

    public final void u8(@dl.d View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 29757, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(onClickListener, "<set-?>");
        this.J4 = onClickListener;
    }
}
