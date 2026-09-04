package com.max.xiaoheihe.module.game;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.DefaultAxisValueFormatter;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.component.CollapsibleView;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcommon.component.inappnotification.InAppNotificationManager;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.CircleProgressView;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.bubble.BubbleView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbcustomview.tickerview.TickerUtils;
import com.max.hbcustomview.tickerview.TickerView;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.impl.PlainVideoUI;
import com.max.video.impl.TopMuteAction;
import com.max.video.player.VideoPlayerManager;
import com.max.video.player.info.PlaybackState;
import com.max.video.ui.widget.BasicBottomPanel;
import com.max.video.ui.widget.BasicCenterPanel;
import com.max.video.ui.widget.BasicTopPanel;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt;
import com.max.xiaoheihe.bean.ButtonObj;
import com.max.xiaoheihe.bean.RelatedGoodsInfo;
import com.max.xiaoheihe.bean.SourceInfoObj;
import com.max.xiaoheihe.bean.SourceType;
import com.max.xiaoheihe.bean.TypedButtonObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.bbs.GameCommentsObj;
import com.max.xiaoheihe.bean.bbs.LastEventObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.CommentTrendInfo;
import com.max.xiaoheihe.bean.game.EpicAddFreeGameObj;
import com.max.xiaoheihe.bean.game.FollowNotifierObj;
import com.max.xiaoheihe.bean.game.FollowNotifierResult;
import com.max.xiaoheihe.bean.game.FreeLicenseObj;
import com.max.xiaoheihe.bean.game.GameAwardObj;
import com.max.xiaoheihe.bean.game.GameBundleObj;
import com.max.xiaoheihe.bean.game.GameCommentStatsObj;
import com.max.xiaoheihe.bean.game.GameDetailCommonTags;
import com.max.xiaoheihe.bean.game.GameDetailDataObj;
import com.max.xiaoheihe.bean.game.GameDetailsObj;
import com.max.xiaoheihe.bean.game.GameDetailsWrapperObj;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePlatformInfoObj;
import com.max.xiaoheihe.bean.game.GamePreviewInfoObj;
import com.max.xiaoheihe.bean.game.GamePreviewRequirementObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.bean.game.GameScreenshotObj;
import com.max.xiaoheihe.bean.game.GlobalRegionPriceObj;
import com.max.xiaoheihe.bean.game.GroupingPriceObj;
import com.max.xiaoheihe.bean.game.HardwarePerformance;
import com.max.xiaoheihe.bean.game.MobileGameDetailsObj;
import com.max.xiaoheihe.bean.game.MultiDimensionRadarObj;
import com.max.xiaoheihe.bean.game.TagDetailObj;
import com.max.xiaoheihe.bean.game.recommend.GradientColorObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.mall.MallRegisterOrderObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.account.SteamPrivacyActivity;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.component.GameDetailScore;
import com.max.xiaoheihe.module.game.component.GameGradeCommentCardView;
import com.max.xiaoheihe.module.magic.MagicUtil;
import com.max.xiaoheihe.module.mall.EpicAddFreeGamesActivity;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.max.xiaoheihe.module.mall.SteamStoreAddFreeGamesActivity;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebFragmentDialog;
import com.max.xiaoheihe.utils.ShareViewUtil;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.HandlerRequestCode;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.xiaomi.mipush.sdk.Constants;
import df.c9;
import df.nk;
import df.x60;
import java.io.File;
import java.lang.ref.WeakReference;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.X2)
public class GameDetailFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.mall.i.d, com.max.xiaoheihe.module.account.p0 {
    private static final String G4 = "game_id";
    private static final String H4 = "game_type";
    private static final String I4 = "player_id";
    private static final String J4 = "steam_id";
    private static final String K4 = "hey_box_id";
    private static final String L4 = "game_details";
    private static final String M4 = "comments_lazy_load";
    private static final String N4 = "sku_id";
    private static final String O4 = "h_src";
    private static final String P4 = "platform";
    private static final String Q4 = "isdownload";
    private static final String R4 = "top_comment_id";
    public static final String S4 = "grouping_id";
    private static final String T4 = "game_global_prices";
    private static final String U4 = "game_lang";
    private static final String V4 = "game_purchase";
    private static final String W4 = "console_game_price_history";
    private static final String X4 = "movie";
    public static final int Y4 = 1;
    public static final int Z4 = 2;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final int f84205a5 = 3;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    private static final long f84206b5 = 15000;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final int f84207c5 = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final int f84208d5 = 2;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final int f84209e5 = 3;
    ListSectionHeader A;
    private nk A4;
    RecyclerView B;
    LinearLayout C;
    private com.max.xiaoheihe.module.game.adapter.v C4;
    ViewGroup D;
    private b2 D4;
    View E;
    private int E4;
    View F;
    TextView G;
    private RecyclerView.ItemDecoration G2;
    TextView H;
    RecyclerView I;
    RecyclerView J;
    private com.max.xiaoheihe.module.game.adapter.m J3;
    View K;
    LinearLayout L;
    TickerView M;
    TextView N;
    TextView O;
    LinearLayout P;
    View Q;
    private GameCommentsObj Q3;
    RichStackModelView R;
    private boolean R3;
    View S;
    private boolean S3;
    View T;
    private a2 T3;
    GameGradeCommentCardView U;
    private NetworkBroadcastReceiver U3;
    ViewGroup V;
    private RefreshBroadcastReceiver V3;
    CardView W;
    private RefreshBroadcastReceiver W3;
    TickerView X;
    private ShowOrderTipBroadcastReceiver X3;
    TextView Y;
    private GameCommentRefreshBroadcastReceiver Y3;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f84210a0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private boolean f84211a4;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f84213b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    VideoViewX f84215c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f84216c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private List<FilterGroup> f84217c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    PlainVideoUI f84218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ViewPager2 f84220e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private boolean f84221e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    LinearLayout f84222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    RecyclerView f84224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.max.hbcommon.base.adapter.s<GameScreenshotObj> f84226h;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<GameAwardObj> f84227h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.max.hbcommon.base.adapter.s<GameScreenshotObj> f84228i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    LinearLayout f84232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    View f84234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    TextView f84236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    TextView f84238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    View f84240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    TextView f84242p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f84243p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private String f84244p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private RecyclerView.ItemDecoration f84245p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private String f84246p4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ImageView f84247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    TextView f84249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    TextView f84251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    CardView f84253t;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private com.max.hbcommon.analytics.j f84254t4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    CardView f84255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    RecyclerView f84257v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    LinearLayout f84259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    LinearLayout f84261x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private String f84262x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f84263x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    RecyclerView f84265y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private String f84266y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private GameDetailsWrapperObj f84267y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    TextView f84269z;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private c9 f84270z4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f84212b = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<GameScreenshotObj> f84230j = new ArrayList();
    private int G3 = -1;
    private final List<LinkInfoObj> K3 = new ArrayList();
    private final List<LinkInfoObj> L3 = new ArrayList();
    private final List<LinkInfoObj> M3 = new ArrayList();
    private boolean N3 = false;
    private boolean O3 = false;
    private String P3 = null;
    private boolean Z3 = true;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private boolean f84214b4 = false;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.b f84219d4 = new com.max.xiaoheihe.module.game.b();

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private boolean f84223f4 = false;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private final boolean f84225g4 = false;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private List<GameAwardObj> f84229i4 = new ArrayList();

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private BubbleView f84231j4 = null;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private final z1 f84233k4 = new z1(this);

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private long f84235l4 = 0;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private long f84237m4 = 0;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private String f84239n4 = null;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private boolean f84241o4 = true;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private long f84248q4 = 0;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private boolean f84250r4 = true;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private boolean f84252s4 = true;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private boolean f84256u4 = true;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private boolean f84258v4 = false;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private Map<String, String> f84260w4 = null;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private FollowNotifierObj f84264x4 = null;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private final ArrayList<TagDetailObj> f84268y4 = new ArrayList<>();
    private final boolean B4 = true;
    private final ViewPager2.OnPageChangeCallback F4 = new k();

    public class GameCommentRefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private GameCommentRefreshBroadcastReceiver() {
        }

        /* synthetic */ GameCommentRefreshBroadcastReceiver(GameDetailFragment gameDetailFragment, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 32983, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported || GameDetailFragment.this.T3 == null) {
                return;
            }
            GameDetailFragment.this.T3.Z(false, GameDetailFragment.this.f84244p2, GameDetailFragment.this.Z);
        }
    }

    public class NetworkBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NetworkBroadcastReceiver() {
        }

        /* synthetic */ NetworkBroadcastReceiver(GameDetailFragment gameDetailFragment, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 32985, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoPlayerManager.f76079a.d(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext);
        }
    }

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(GameDetailFragment gameDetailFragment, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 32986, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            String action = intent.getAction();
            if (lb.a.A.equals(action) || (lb.a.V.equals(action) && GameDetailFragment.this.Z != null && GameDetailFragment.this.Z.equals(intent.getStringExtra(lb.a.f131038s0)))) {
                GameDetailFragment.this.G3 = 0;
                if (GameDetailFragment.this.T3 != null) {
                    GameDetailFragment.this.T3.Z(true, GameDetailFragment.this.f84244p2, GameDetailFragment.this.Z);
                }
            }
        }
    }

    public class ShowOrderTipBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32988, new Class[]{View.class}, Void.TYPE).isSupported || ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext == null) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, lb.d.W1);
            }
        }

        private ShowOrderTipBroadcastReceiver() {
        }

        /* synthetic */ ShowOrderTipBroadcastReceiver(GameDetailFragment gameDetailFragment, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 32987, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported || !lb.a.R.equals(intent.getAction()) || "1".equals(com.max.hbcache.c.o(com.max.hbcache.c.W, ""))) {
                return;
            }
            com.max.hbcache.c.C(com.max.hbcache.c.W, "1");
            InAppNotificationManager.f67721a.s(new jb.a("可在黑盒商城-我的订单找到对应订单", "点击前往查看该订单", ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.getResources().getDrawable(R.drawable.ic_orders), (Context) ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, true, 4000L, (View.OnClickListener) new a()), 1000L);
        }
    }

    public class a implements ze.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // ze.e
        public void invoke() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32867, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.this.onBackPressed();
        }
    }

    public class a0 extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(Context context, List list, int i10, String str) {
            super(context, list, i10);
            this.f84277b = str;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 32913, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewI = eVar.i(R.id.indicator_top);
            View viewI2 = eVar.i(R.id.indicator_bottom);
            TextView textView = (TextView) eVar.i(R.id.tv_num);
            TextView textView2 = (TextView) eVar.i(R.id.tv_title);
            TextView textView3 = (TextView) eVar.i(R.id.tv_desc);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            textView2.setText(keyDescObj.getTitle());
            textView3.setText(keyDescObj.getDesc());
            com.max.hbimage.b.K(keyDescObj.getImg(), imageView);
            int adapterPosition = eVar.getAdapterPosition() + 1;
            boolean z10 = com.max.hbutils.utils.n.q(this.f84277b) >= adapterPosition;
            boolean z11 = getItemCount() > 1 && adapterPosition == getItemCount();
            textView.setText(String.format(Locale.US, TimeModel.f55754j, Integer.valueOf(adapterPosition)));
            Resources resources = GameDetailFragment.this.getResources();
            int i10 = R.color.divider_secondary_1_color;
            int i11 = R.color.text_primary_1_color;
            viewI.setBackgroundColor(resources.getColor(z10 ? R.color.text_primary_1_color : R.color.divider_secondary_1_color));
            Resources resources2 = GameDetailFragment.this.getResources();
            if (z10) {
                i10 = R.color.text_primary_1_color;
            }
            viewI2.setBackgroundColor(resources2.getColor(i10));
            textView.setBackgroundResource(z10 ? R.drawable.circle_text_primary : R.drawable.circle_white_primary_border);
            Resources resources3 = GameDetailFragment.this.getResources();
            if (z10) {
                i11 = R.color.white;
            }
            textView.setTextColor(resources3.getColor(i11));
            viewI2.setVisibility(z11 ? 4 : 0);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 32914, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    public class a1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84279b;

        a1(String str) {
            this.f84279b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32942, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext)) {
                String str = "unfollowing".equals(this.f84279b) ? "following" : "unfollowing";
                if ("following".equals(str)) {
                    GameDetailFragment.this.f84233k4.removeMessages(1);
                    GameDetailFragment.C4(GameDetailFragment.this);
                }
                GameDetailFragment.R4(GameDetailFragment.this, "unfollowing".equals(this.f84279b) ? "1" : "0");
                GameDetailFragment.N4(GameDetailFragment.this, str, true);
                GameDetailFragment.M4(GameDetailFragment.this, str);
                GameDetailFragment.O4(GameDetailFragment.this, str);
            }
        }
    }

    public interface a2 {
        boolean I();

        void Z(boolean z10, String str, String str2);

        void c(AbsVideoView absVideoView, ViewGroup viewGroup);

        void d(ShareImageDialogFragment shareImageDialogFragment);

        void e();
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32868, new Class[]{View.class}, Void.TYPE).isSupported || GameDetailFragment.i4(GameDetailFragment.this) == null) {
                return;
            }
            GameDetailFragment gameDetailFragment = GameDetailFragment.this;
            GameDetailFragment.t4(gameDetailFragment, GameDetailFragment.i4(gameDetailFragment).getUrl());
        }
    }

    public class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32915, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.d6(GameDetailFragment.this);
        }
    }

    public class b1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f84284c;

        b1(String str, String str2) {
            this.f84283b = str;
            this.f84284c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32943, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if ("cart".equals(GameDetailFragment.this.f84267y2.getGameDetailsObj().getOrder_src())) {
                com.max.xiaoheihe.base.router.b.D(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84283b).A();
            } else if ("game".equals(this.f84284c)) {
                ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(GameStoreOrderDetailActivity.y4(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84283b));
            } else if ("mall".equals(this.f84284c)) {
                com.max.xiaoheihe.base.router.b.R(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84283b, true).A();
            }
        }
    }

    public class b2 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f84286b;

        b2(int i10) {
            this.f84286b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32984, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.V3(GameDetailFragment.this);
            GameDetailFragment.W3(GameDetailFragment.this, this.f84286b, false, false);
        }
    }

    public class c implements com.max.video.device.c.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.video.device.c.a
        public int a(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32870, new Class[]{cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.setRequestedOrientation(8);
            return 8;
        }

        @Override // com.max.video.device.c.a
        public int b(int i10) {
            return i10;
        }

        @Override // com.max.video.device.c.a
        public int c(int i10) {
            return i10;
        }

        @Override // com.max.video.device.c.a
        public int d(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32869, new Class[]{cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.setRequestedOrientation(0);
            return 0;
        }
    }

    public class c0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32916, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131052u2);
            intent.putExtra("title", ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.getResources().getString(R.string.ratting_role));
            ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(intent);
        }
    }

    public class c1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32944, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.D4(GameDetailFragment.this, false);
            GameDetailFragment.E4(GameDetailFragment.this, false);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LastEventObj f84291b;

        d(LastEventObj lastEventObj) {
            this.f84291b = lastEventObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32871, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84291b.getDvp_protocol());
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("app_id", GameDetailFragment.this.Z);
            com.max.hbcommon.analytics.d.e("4", lb.d.f131243r3, null, null, jsonObject, null, true);
        }
    }

    public class d0 implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f84293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameDetailScore f84294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f84295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f84296d;

        d0(View view, GameDetailScore gameDetailScore, View view2, View view3) {
            this.f84293a = view;
            this.f84294b = gameDetailScore;
            this.f84295c = view2;
            this.f84296d = view3;
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@androidx.annotation.n0 KeyDescObj keyDescObj, int i10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 32917, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if ("trend".equals(keyDescObj.getKey())) {
                this.f84293a.setVisibility(0);
                this.f84294b.setVisibility(8);
                this.f84295c.setVisibility(8);
            } else if (!com.max.xiaoheihe.module.game.adapter.overview.b.f85776u.equals(keyDescObj.getKey())) {
                this.f84294b.setVisibility(0);
                this.f84293a.setVisibility(8);
                this.f84295c.setVisibility(8);
            } else {
                this.f84296d.setVisibility(8);
                this.f84293a.setVisibility(8);
                this.f84294b.setVisibility(8);
                this.f84295c.setVisibility(0);
                GameDetailFragment.r4(GameDetailFragment.this);
            }
        }
    }

    public class d1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32945, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.D4(GameDetailFragment.this, false);
            GameDetailFragment.E4(GameDetailFragment.this, false);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LastEventObj f84299b;

        e(LastEventObj lastEventObj) {
            this.f84299b = lastEventObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32872, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.F(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, null, this.f84299b.getLink_id(), this.f84299b.getLink_tag(), this.f84299b.getHas_video(), null);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("app_id", GameDetailFragment.this.Z);
            jsonObject.addProperty("link_id", this.f84299b.getLink_id());
            com.max.hbcommon.analytics.d.e("4", lb.d.f131236q3, null, null, jsonObject, null, true);
        }
    }

    public class e0 implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f84301a;

        e0(ArrayList arrayList) {
            this.f84301a = arrayList;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 32918, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            int i10 = (int) f10;
            return (i10 >= this.f84301a.size() || i10 % 4 != 2) ? "" : String.valueOf(((KeyDescObj) this.f84301a.get(i10)).getDesc());
        }
    }

    public class e1 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f84303b;

        public class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32948, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameDetailFragment gameDetailFragment = GameDetailFragment.this;
                GameDetailFragment.a5(gameDetailFragment, gameDetailFragment.f84266y1, GameDetailFragment.this.Z, GameDetailFragment.this.f84244p2, null, null, null, GameDetailFragment.this.f84262x1, e1.this.f84303b);
            }
        }

        e1(boolean z10) {
            this.f84303b = z10;
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32946, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            boolean zBooleanValue = ((Boolean) result.getKeyMap().get("certificated")).booleanValue();
            User userI = com.max.xiaoheihe.utils.i0.i();
            userI.setCertificated(zBooleanValue);
            com.max.xiaoheihe.utils.i0.z(userI);
            if (!zBooleanValue) {
                com.max.xiaoheihe.module.game.mobilelicense.a.b((BaseActivity) ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, new a());
            } else {
                GameDetailFragment gameDetailFragment = GameDetailFragment.this;
                GameDetailFragment.a5(gameDetailFragment, gameDetailFragment.f84266y1, GameDetailFragment.this.Z, GameDetailFragment.this.f84244p2, null, null, null, GameDetailFragment.this.f84262x1, this.f84303b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32947, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.base.adapter.s<GameScreenshotObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameScreenshotObj f84307b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f84308c;

            a(GameScreenshotObj gameScreenshotObj, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f84307b = gameScreenshotObj;
                this.f84308c = eVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32875, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameDetailFragment gameDetailFragment = GameDetailFragment.this;
                GameDetailFragment.F5(gameDetailFragment, gameDetailFragment.f84230j, this.f84307b);
                if (GameDetailFragment.this.f84215c.G()) {
                    GameDetailFragment.this.f84215c.K();
                }
                GameDetailFragment.a6(GameDetailFragment.this, this.f84308c.getAbsoluteAdapterPosition(), GameDetailFragment.S5(GameDetailFragment.this));
                f.this.notifyDataSetChanged();
            }
        }

        f(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameScreenshotObj gameScreenshotObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameScreenshotObj}, this, changeQuickRedirect, false, 32873, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameScreenshotObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar.b();
            ImageView imageView = (ImageView) eVar.i(R.id.iv_video_thumb);
            View viewI = eVar.i(R.id.vg_frame);
            View viewI2 = eVar.i(R.id.vg_video_play);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_video_play);
            com.max.hbimage.b.L(gameScreenshotObj.getThumbnail(), imageView, R.drawable.common_default_placeholder_375x210);
            viewB.setTag(gameScreenshotObj);
            viewI.setBackground(com.max.hbutils.utils.q.K(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, R.color.divider_primary_1_color, 2.0f));
            if (gameScreenshotObj.isChecked()) {
                viewI.setVisibility(0);
            } else {
                viewI.setVisibility(8);
            }
            viewB.setOnClickListener(new a(gameScreenshotObj, eVar));
            if (!"movie".equalsIgnoreCase(gameScreenshotObj.getType()) || TextUtils.isEmpty(gameScreenshotObj.getUrl())) {
                viewI2.setVisibility(8);
            } else {
                imageView2.setImageDrawable(ViewUtils.T(ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 6.0f), ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 8.0f), 2, -1275068417));
                viewI2.setVisibility(0);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameScreenshotObj gameScreenshotObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameScreenshotObj}, this, changeQuickRedirect, false, 32874, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameScreenshotObj);
        }
    }

    public class f0 extends DefaultAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        f0(int i10) {
            super(i10);
        }

        @Override // com.github.mikephil.charting.formatter.DefaultAxisValueFormatter, com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 32919, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : super.getFormattedValue(f10, axisBase).replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        }
    }

    public class f1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FreeLicenseObj f84311b;

        public class a implements yh.l<SteamWalletJsObj, kotlin.b2> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public kotlin.b2 a(SteamWalletJsObj steamWalletJsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 32950, new Class[]{SteamWalletJsObj.class}, kotlin.b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.b2) patchProxyResultProxy.result;
                }
                if (!GameDetailFragment.this.isActive()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                EpicAddFreeGameObj epicAddFreeGameObj = new EpicAddFreeGameObj();
                epicAddFreeGameObj.setName(GameDetailFragment.this.f84267y2.getName());
                epicAddFreeGameObj.setAppid(f1.this.f84311b.getId());
                epicAddFreeGameObj.setHome_name(f1.this.f84311b.getProduct_home_name());
                arrayList.add(epicAddFreeGameObj);
                ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(SteamStoreAddFreeGamesActivity.p2(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, com.max.hbutils.utils.k.r(arrayList), steamWalletJsObj));
                return null;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(SteamWalletJsObj steamWalletJsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 32951, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(steamWalletJsObj);
            }
        }

        f1(FreeLicenseObj freeLicenseObj) {
            this.f84311b = freeLicenseObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32949, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!"epic".equals(this.f84311b.getPlatform())) {
                if ("steam".equals(this.f84311b.getPlatform())) {
                    MagicUtil.f89378a.d(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, new a());
                }
            } else {
                EpicAddFreeGameObj epicAddFreeGameObj = new EpicAddFreeGameObj();
                epicAddFreeGameObj.setName(this.f84311b.getId());
                epicAddFreeGameObj.setType(this.f84311b.getType());
                epicAddFreeGameObj.setAppid(GameDetailFragment.this.f84267y2.getGameDetailsObj().getAppid());
                epicAddFreeGameObj.setHome_name(this.f84311b.getProduct_home_name());
                ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(EpicAddFreeGamesActivity.E2(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, com.max.hbutils.utils.k.r(Collections.singletonList(epicAddFreeGameObj))));
            }
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32876, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.d6(GameDetailFragment.this);
        }
    }

    public class g0 implements IValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return "";
        }
    }

    public class g1 implements com.max.xiaoheihe.module.game.r1.y0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f84316a;

        g1(com.max.hbcommon.base.adapter.s.e eVar) {
            this.f84316a = eVar;
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32953, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.I4(GameDetailFragment.this, this.f84316a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING);
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32952, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.I4(GameDetailFragment.this, this.f84316a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING);
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32877, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            try {
                if (com.max.hbcommon.utils.c.w(GameDetailFragment.this.K3)) {
                    return;
                }
                if (((com.max.hbcommon.base.d) GameDetailFragment.this).mContext instanceof ChannelsDetailActivity) {
                    ((ChannelsDetailActivity) ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext).N1();
                }
                GameDetailFragment.this.f84270z4.f109226b.y0(GameDetailFragment.this.f84270z4.f109240p.b());
            } catch (Throwable unused) {
            }
        }
    }

    public class h0 implements IValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return "";
        }
    }

    public class h1 extends com.max.hbcommon.network.d<Result<GameCommentsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f84320b;

        h1(int i10) {
            this.f84320b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32955, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.this.f84214b4 = false;
            if (GameDetailFragment.this.isActive()) {
                super.onComplete();
                GameDetailFragment.this.f84270z4.f109231g.A(0);
                GameDetailFragment.this.f84270z4.f109231g.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32954, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.this.f84214b4 = false;
            if (GameDetailFragment.this.isActive()) {
                super.onError(th2);
                GameDetailFragment.this.f84270z4.f109231g.A(0);
                GameDetailFragment.this.f84270z4.f109231g.p(0);
            }
        }

        public void onNext(Result<GameCommentsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32956, new Class[]{Result.class}, Void.TYPE).isSupported && GameDetailFragment.this.isActive()) {
                super.onNext(result);
                GameDetailFragment.this.Q3 = result.getResult();
                GameDetailFragment gameDetailFragment = GameDetailFragment.this;
                GameDetailFragment.k5(gameDetailFragment, gameDetailFragment.Q3, this.f84320b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32957, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameCommentsObj>) obj);
        }
    }

    public class i extends com.max.hbcommon.base.adapter.u<GameDetailCommonTags> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameDetailCommonTags f84323b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameDetailFragment$i$a$a, reason: collision with other inner class name */
            public class C0747a implements com.max.xiaoheihe.module.game.y.e {
                public static ChangeQuickRedirect changeQuickRedirect;

                C0747a() {
                }

                @Override // com.max.xiaoheihe.module.game.y.e
                public void a(GamePlatformInfoObj gamePlatformInfoObj) {
                    if (PatchProxy.proxy(new Object[]{gamePlatformInfoObj}, this, changeQuickRedirect, false, 32885, new Class[]{GamePlatformInfoObj.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (((com.max.hbcommon.base.d) GameDetailFragment.this).reporter != null) {
                        ((com.max.hbcommon.base.d) GameDetailFragment.this).reporter.e();
                    }
                    GameDetailFragment.this.f84244p2 = gamePlatformInfoObj.getPlatf();
                    if (!com.max.hbcommon.utils.c.u(gamePlatformInfoObj.getAppid())) {
                        GameDetailFragment.this.Z = gamePlatformInfoObj.getAppid();
                    }
                    if (((com.max.hbcommon.base.d) GameDetailFragment.this).reporter != null) {
                        ((com.max.hbcommon.base.d) GameDetailFragment.this).reporter.f();
                    }
                    GameDetailFragment.E6(GameDetailFragment.this);
                    if (GameDetailFragment.this.T3 != null) {
                        GameDetailFragment.this.f84258v4 = true;
                        GameDetailFragment.this.T3.Z(false, GameDetailFragment.this.f84244p2, GameDetailFragment.this.Z);
                    }
                }
            }

            a(GameDetailCommonTags gameDetailCommonTags) {
                this.f84323b = gameDetailCommonTags;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32884, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.analytics.l.f66572a.m(lb.d.f131180i3, GameDetailFragment.this.getPageAdditional());
                com.max.xiaoheihe.module.game.y.c(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84323b.getPlatform_list(), GameDetailFragment.this.f84267y2.getPlatf(), new C0747a());
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameDetailCommonTags f84326b;

            b(GameDetailCommonTags gameDetailCommonTags) {
                this.f84326b = gameDetailCommonTags;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32886, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext)) {
                    com.max.xiaoheihe.base.router.b.K(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, GameDetailFragment.this.Z).A();
                }
                GameDetailFragment.K6(GameDetailFragment.this, this.f84326b);
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameDetailCommonTags f84328b;

            c(GameDetailCommonTags gameDetailCommonTags) {
                this.f84328b = gameDetailCommonTags;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32887, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameDetailFragment.this.G9();
                GameDetailFragment.K6(GameDetailFragment.this, this.f84328b);
            }
        }

        public class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameDetailCommonTags f84330b;

            d(GameDetailCommonTags gameDetailCommonTags) {
                this.f84330b = gameDetailCommonTags;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32888, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f84330b.getProt())) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84330b.getProt());
                GameDetailFragment.K6(GameDetailFragment.this, this.f84330b);
            }
        }

        i(Context context, List list) {
            super(context, list);
        }

        private View o() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32881, new Class[0], View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            View view = new View(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 0.5f), ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 8.0f));
            layoutParams.leftMargin = ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 4.0f);
            layoutParams.rightMargin = ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 4.5f);
            view.setBackgroundResource(R.color.divider_primary_1_color);
            view.setLayoutParams(layoutParams);
            return view;
        }

        private TextView p(String str, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 32880, new Class[]{String.class, Integer.TYPE}, TextView.class);
            if (patchProxyResultProxy.isSupported) {
                return (TextView) patchProxyResultProxy.result;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int iIndexOf = str.indexOf(61658);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), iIndexOf, iIndexOf + 1, 33);
            }
            TextView textView = new TextView(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            textView.setIncludeFontPadding(false);
            textView.setText(spannableStringBuilder);
            textView.setTextColor(i10);
            textView.setGravity(17);
            textView.setTextSize(1, 10.0f);
            return textView;
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameDetailCommonTags gameDetailCommonTags) {
            Object[] objArr = {new Integer(i10), gameDetailCommonTags};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32882, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, gameDetailCommonTags);
        }

        public int n(int i10, GameDetailCommonTags gameDetailCommonTags) {
            Object[] objArr = {new Integer(i10), gameDetailCommonTags};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32879, new Class[]{cls, GameDetailCommonTags.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if ("platform".equals(gameDetailCommonTags.getType())) {
                return R.layout.item_gamedetail_platform_info;
            }
            return GameDetailCommonTags.RICH_TAG.equals(gameDetailCommonTags.getType()) ? R.layout.item_rich_stack : R.layout.item_gamedetail_tag;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 32883, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            q(eVar, (GameDetailCommonTags) obj);
        }

        public void q(com.max.hbcommon.base.adapter.s.e eVar, GameDetailCommonTags gameDetailCommonTags) {
            if (PatchProxy.proxy(new Object[]{eVar, gameDetailCommonTags}, this, changeQuickRedirect, false, 32878, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameDetailCommonTags.class}, Void.TYPE).isSupported) {
                return;
            }
            int iH0 = ViewUtils.h0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, ViewUtils.o(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, eVar.itemView));
            if ("platform".equals(gameDetailCommonTags.getType())) {
                LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.ll_platform);
                linearLayout.removeAllViews();
                Iterator<GamePlatformInfoObj> it = gameDetailCommonTags.getPlatform_list().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (!com.max.hbcommon.utils.c.u(it.next().getPlatf())) {
                        i10++;
                    }
                }
                boolean z10 = i10 > 1;
                for (GamePlatformInfoObj gamePlatformInfoObj : gameDetailCommonTags.getPlatform_list()) {
                    ImageView imageView = new ImageView(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext);
                    if (z10) {
                        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                        if (gamePlatformInfoObj.getPlatf() == null || !gamePlatformInfoObj.getPlatf().equals(GameDetailFragment.this.f84267y2.getPlatf())) {
                            imageView.setAlpha(0.5f);
                        } else {
                            imageView.setAlpha(1.0f);
                        }
                    } else {
                        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                        imageView.setAlpha(1.0f);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 12.0f), ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 12.0f));
                    layoutParams.leftMargin = ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 4.0f);
                    com.max.hbimage.b.K(gamePlatformInfoObj.getImg_url(), imageView);
                    linearLayout.addView(imageView, layoutParams);
                }
                if (!z10) {
                    linearLayout.setBackground(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, com.max.xiaoheihe.module.game.r1.R(gameDetailCommonTags.getPlatform_list().get(0).getPlatf()), iH0));
                    linearLayout.setPadding(ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 3.0f), 0, ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 7.0f), 0);
                    linearLayout.setOnClickListener(null);
                    return;
                }
                linearLayout.setBackground(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, com.max.xiaoheihe.module.game.r1.R(GameDetailFragment.this.f84267y2.getPlatf()), iH0));
                ImageView imageView2 = new ImageView(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 12.0f), ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 12.0f));
                layoutParams2.leftMargin = ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 4.0f);
                layoutParams2.rightMargin = ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 4.0f);
                imageView2.setImageResource(R.drawable.ic_0icon_arrow_s_triangle_right_12);
                imageView2.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                linearLayout.addView(imageView2, layoutParams2);
                linearLayout.setOnClickListener(new a(gameDetailCommonTags));
                return;
            }
            if (GameDetailCommonTags.RICH_TAG.equals(gameDetailCommonTags.getType())) {
                RichStackModelView richStackModelView = (RichStackModelView) eVar.i(R.id.rich_view);
                richStackModelView.setRichStackData(gameDetailCommonTags.getRich_text());
                ViewUtils.n0(richStackModelView, 0, 0, ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 3.0f), 0);
                return;
            }
            View viewI = eVar.i(R.id.vg_container);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            ImageView imageView3 = (ImageView) eVar.i(R.id.iv_add);
            CircleProgressView circleProgressView = (CircleProgressView) eVar.i(R.id.cp_percent);
            LinearLayout linearLayout2 = (LinearLayout) eVar.i(R.id.ll_tags);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            if (GameDetailCommonTags.ADD_TAG.equals(gameDetailCommonTags.getType())) {
                textView.setText(gameDetailCommonTags.getDesc());
                imageView3.setVisibility(0);
                circleProgressView.setVisibility(8);
                textView.setVisibility(0);
                linearLayout2.setVisibility(8);
                viewI.setBackgroundResource(R.drawable.topic_bg_1dp);
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
                eVar.itemView.setOnClickListener(new b(gameDetailCommonTags));
                return;
            }
            if (!GameDetailCommonTags.STEAM_TAG.equals(gameDetailCommonTags.getType())) {
                imageView3.setVisibility(8);
                textView.setVisibility(0);
                linearLayout2.setVisibility(8);
                viewI.setBackground(com.max.hbutils.utils.q.v(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, com.max.xiaoheihe.utils.d.H(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, gameDetailCommonTags.getBackground_color()), iH0));
                if (com.max.hbcommon.utils.c.u(gameDetailCommonTags.getPercent())) {
                    circleProgressView.setVisibility(8);
                } else {
                    circleProgressView.setVisibility(0);
                    circleProgressView.f(com.max.hbutils.utils.n.p(gameDetailCommonTags.getPercent()) / 100.0f);
                }
                String desc = gameDetailCommonTags.getDesc();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(desc);
                int iIndexOf = desc.indexOf(61658);
                if (iIndexOf != -1) {
                    spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), iIndexOf, iIndexOf + 1, 33);
                }
                textView.setText(spannableStringBuilder);
                textView.setTextColor(com.max.xiaoheihe.utils.d.H(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, gameDetailCommonTags.getText_color()));
                eVar.itemView.setOnClickListener(new d(gameDetailCommonTags));
                return;
            }
            imageView3.setVisibility(8);
            circleProgressView.setVisibility(8);
            textView.setVisibility(8);
            linearLayout2.setVisibility(0);
            viewI.setBackground(com.max.hbutils.utils.q.v(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, com.max.xiaoheihe.utils.d.H(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, gameDetailCommonTags.getBackground_color()), iH0));
            linearLayout2.removeAllViews();
            if (!com.max.hbcommon.utils.c.w(gameDetailCommonTags.getDesc_list())) {
                int iH = com.max.xiaoheihe.utils.d.H(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, gameDetailCommonTags.getText_color());
                for (int i11 = 0; i11 < gameDetailCommonTags.getDesc_list().size(); i11++) {
                    linearLayout2.addView(p(gameDetailCommonTags.getDesc_list().get(i11), iH));
                    if (i11 < gameDetailCommonTags.getDesc_list().size() - 1) {
                        linearLayout2.addView(o());
                    }
                }
                eVar.itemView.setVisibility(0);
                eVar.itemView.setOnClickListener(new c(gameDetailCommonTags));
                return;
            }
            com.max.heybox.hblog.g.W("GameDetailFragment, steam_aggre empty, mGameId = " + GameDetailFragment.this.Z);
            if (GameDetailFragment.this.f84267y2 != null) {
                com.max.heybox.hblog.g.W("GameDetailFragment, steam_aggre empty, name = " + GameDetailFragment.this.f84267y2.getName());
            }
            eVar.itemView.setVisibility(4);
        }
    }

    public class i0 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f84332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BarChart f84333c;

        i0(ImageView imageView, BarChart barChart) {
            this.f84332b = imageView;
            this.f84333c = barChart;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32921, new Class[0], Void.TYPE).isSupported && GameDetailFragment.this.isActive()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f84332b.getLayoutParams();
                ViewPortHandler viewPortHandler = this.f84333c.getViewPortHandler();
                int iF = ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 12.0f);
                layoutParams.leftMargin = ((int) viewPortHandler.offsetLeft()) + iF;
                layoutParams.topMargin = 14;
                layoutParams.width = (ViewUtils.L(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext) - layoutParams.leftMargin) - iF;
                layoutParams.height = (int) (viewPortHandler.contentHeight() - viewPortHandler.offsetBottom());
                this.f84332b.setLayoutParams(layoutParams);
                this.f84332b.requestLayout();
            }
        }
    }

    public class i1 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84335b;

        i1(String str) {
            this.f84335b = str;
        }

        public void onNext(Result result) {
            FollowNotifierResult followNotifierResult;
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32958, new Class[]{Result.class}, Void.TYPE).isSupported && GameDetailFragment.this.isActive()) {
                String protocol = null;
                if (result.getResult() != null && (followNotifierResult = (FollowNotifierResult) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(result.getResult()), FollowNotifierResult.class)) != null) {
                    protocol = followNotifierResult.getProtocol();
                }
                if (com.max.hbcommon.utils.c.u(protocol) || !this.f84335b.equals("following")) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.j0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, protocol);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32959, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32889, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WebFragmentDialog.d4(String.format(lb.a.f131018o4, GameDetailFragment.this.Z)).show(GameDetailFragment.this.getFragmentManager(), "WebFragmentDialog");
        }
    }

    public class j0 implements GameImpressionDialogFragment.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // com.max.xiaoheihe.module.game.GameImpressionDialogFragment.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32922, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.v4(GameDetailFragment.this, true);
        }
    }

    public class j1 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j1() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32960, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("cqtest", "syncWishList");
            GameDetailFragment.m5(GameDetailFragment.this);
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32961, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class k extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32866, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            GameDetailFragment gameDetailFragment = GameDetailFragment.this;
            List<GameScreenshotObj> list = gameDetailFragment.f84230j;
            GameDetailFragment.F5(gameDetailFragment, list, list.get(i10));
            GameDetailFragment gameDetailFragment2 = GameDetailFragment.this;
            GameDetailFragment.Z5(gameDetailFragment2, i10, true, GameDetailFragment.S5(gameDetailFragment2), false);
            GameDetailFragment.this.f84224g.scrollToPosition(i10);
            if (GameDetailFragment.this.f84215c.G()) {
                GameDetailFragment.this.f84215c.K();
            }
            com.max.hbcommon.base.adapter.s<GameScreenshotObj> sVar = GameDetailFragment.this.f84226h;
            if (sVar != null) {
                sVar.notifyDataSetChanged();
            }
        }
    }

    public class k0 implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f84341a;

        k0(List list) {
            this.f84341a = list;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.h hVar) {
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 32923, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            String value = ((KeyDescObj) this.f84341a.get(hVar.k())).getValue();
            TextView textView = (TextView) hVar.g().findViewById(R.id.text);
            if (textView != null) {
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
            GameDetailFragment.w4(GameDetailFragment.this, value);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.h hVar) {
            TextView textView;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 32924, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || (textView = (TextView) hVar.g().findViewById(R.id.text)) == null) {
                return;
            }
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.h hVar) {
        }
    }

    public class k1 implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        k1() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32941, new Class[]{ng.j.class}, Void.TYPE).isSupported || GameDetailFragment.this.f84214b4) {
                return;
            }
            if (GameDetailFragment.this.G3 == -1) {
                GameDetailFragment.this.G3 = 0;
            } else {
                GameDetailFragment.t5(GameDetailFragment.this, 30);
            }
            GameDetailFragment.C5(GameDetailFragment.this);
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84344b;

        l(KeyDescObj keyDescObj) {
            this.f84344b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32893, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f84344b.getProtocol())) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84344b.getProtocol());
            } else if (com.max.hbcommon.utils.c.u(this.f84344b.getKey())) {
                ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(GameListActivity.W1(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, GameDetailFragment.this.Z, this.f84344b));
            } else {
                ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(GameDeveloperDetailActivity.o2(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84344b.getKey()));
            }
        }
    }

    public class l0 implements com.max.hbcommon.component.segmentfilters.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.d
        public void a(@androidx.annotation.n0 FilterGroup filterGroup, int i10) {
            if (PatchProxy.proxy(new Object[]{filterGroup, new Integer(i10)}, this, changeQuickRedirect, false, 32925, new Class[]{FilterGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Map<String, String> filter = GameDetailFragment.this.getFilter();
            if (GameDetailFragment.this.f84260w4 == null || GameDetailFragment.this.f84260w4.equals(filter)) {
                return;
            }
            GameDetailFragment.this.f84260w4 = filter;
            GameDetailFragment.this.G3 = 0;
            GameDetailFragment.C5(GameDetailFragment.this);
        }
    }

    public class l1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallProductObj f84347b;

        l1(MallProductObj mallProductObj) {
            this.f84347b = mallProductObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32963, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f84347b.getGame_info() != null) {
                GameDetailFragment.n5(GameDetailFragment.this, this.f84347b);
            } else {
                GameDetailFragment.o5(GameDetailFragment.this);
            }
        }
    }

    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84349b;

        m(KeyDescObj keyDescObj) {
            this.f84349b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32894, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f84349b.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84349b.getProtocol());
        }
    }

    public class m0 implements com.max.hbcommon.component.segmentfilters.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SecondaryWindowSegmentFilterView f84351a;

        m0(SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView) {
            this.f84351a = secondaryWindowSegmentFilterView;
        }

        @Override // com.max.hbcommon.component.segmentfilters.e
        public void a(@androidx.annotation.n0 FilterGroup filterGroup, int i10) {
            if (PatchProxy.proxy(new Object[]{filterGroup, new Integer(i10)}, this, changeQuickRedirect, false, 32926, new Class[]{FilterGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (((com.max.hbcommon.base.d) GameDetailFragment.this).mContext instanceof ChannelsDetailActivity) {
                ((ChannelsDetailActivity) ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext).N1();
            }
            if (!GameDetailFragment.this.f84270z4.f109226b.E0(GameDetailFragment.this.f84270z4.f109240p.b())) {
                GameDetailFragment.this.f84270z4.f109226b.y0(GameDetailFragment.this.f84270z4.f109240p.b());
            }
            if (FilterGroup.TYPE_SINGLE.equals(filterGroup.getType())) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(filterGroup.getProtocol())) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, filterGroup.getProtocol());
            } else if (this.f84351a.getDismissListener() != null) {
                this.f84351a.getDismissListener().a(filterGroup, i10);
            }
        }
    }

    public class m1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CollapsibleView f84353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f84354c;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32965, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameDetailFragment.o5(GameDetailFragment.this);
            }
        }

        m1(CollapsibleView collapsibleView, View view) {
            this.f84353b = collapsibleView;
            this.f84354c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32964, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f84353b.h();
            this.f84354c.setOnClickListener(new a());
        }
    }

    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84357b;

        n(KeyDescObj keyDescObj) {
            this.f84357b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32895, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f84357b.getProtocol())) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84357b.getProtocol());
            } else {
                com.max.xiaoheihe.utils.d.o(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84357b.getValue());
                com.max.hbutils.utils.c.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.getString(R.string.text_copied));
            }
        }
    }

    public class n0 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        n0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32927, new Class[0], Void.TYPE).isSupported && GameDetailFragment.this.isActive()) {
                GameDetailFragment.C4(GameDetailFragment.this);
            }
        }
    }

    public class n1 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CollapsibleView f84360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f84361c;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32967, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameDetailFragment.o5(GameDetailFragment.this);
            }
        }

        n1(CollapsibleView collapsibleView, View view) {
            this.f84360b = collapsibleView;
            this.f84361c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32966, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f84360b.h();
            this.f84361c.setOnClickListener(new a());
        }
    }

    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84364b;

        o(KeyDescObj keyDescObj) {
            this.f84364b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32896, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f84364b.getProtocol())) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84364b.getProtocol());
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", this.f84364b.getKey());
            intent.putExtra("title", this.f84364b.getTitle());
            ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(intent);
        }
    }

    public class o0 implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        o0() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32920, new Class[]{ng.j.class}, Void.TYPE).isSupported || GameDetailFragment.this.T3 == null) {
                return;
            }
            GameDetailFragment.this.T3.Z(false, GameDetailFragment.this.f84244p2, GameDetailFragment.this.Z);
        }
    }

    public class o1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32968, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.E4(GameDetailFragment.this, false);
        }
    }

    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84368b;

        p(KeyDescObj keyDescObj) {
            this.f84368b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32897, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84368b.getProtocol());
        }
    }

    public class p0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class p1 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f84371b;

        public class a implements Animator.AnimatorListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 32970, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                    return;
                }
                p1.this.f84371b.setVisibility(8);
                com.max.hbcache.c.C("display_purchase_guarantee", "0");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        p1(TextView textView) {
            this.f84371b = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32969, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f84371b, "alpha", 1.0f, 0.0f).setDuration(300L);
            duration.addListener(new a());
            duration.start();
        }
    }

    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84374b;

        q(KeyDescObj keyDescObj) {
            this.f84374b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32898, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84374b.getProtocol());
        }
    }

    public class q0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32929, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.D4(GameDetailFragment.this, true);
            GameDetailFragment.E4(GameDetailFragment.this, true);
        }
    }

    public class q1 implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q1() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 32972, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(GameDetailFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 32971, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(GameDetailFragment.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32899, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.this.G.setVisibility(8);
            Intent intent = new Intent(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", String.format(lb.a.V2, GameDetailFragment.this.Z));
            intent.putExtra("title", GameDetailFragment.this.getString(R.string.developers_words));
            ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(intent);
        }
    }

    public class r0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ButtonObj f84379b;

        r0(ButtonObj buttonObj) {
            this.f84379b = buttonObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32930, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84379b.getProtocol());
        }
    }

    public class r1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r1() {
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, HandlerRequestCode.SINA_AUTH_REQUEST_CODE, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
            com.max.hbshare.c.a(com.max.hbshare.c.f72568x, "1", com.max.hbshare.d.f72589k, null);
            GameDetailFragment.A5(GameDetailFragment.this);
        }
    }

    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32900, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.Y1 + "?steam_appid=" + GameDetailFragment.this.Z);
            intent.putExtra("title", GameDetailFragment.this.getString(R.string.game_brief_introduction));
            ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(intent);
        }
    }

    public class s0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f84383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f84384c;

        s0(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            this.f84383b = eVar;
            this.f84384c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32931, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.H4(GameDetailFragment.this, this.f84383b, this.f84384c);
        }
    }

    public class s1 implements ReportReasonFragment.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        s1() {
        }

        @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
        public void a(@androidx.annotation.n0 String str, @androidx.annotation.p0 String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 32974, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.B5(GameDetailFragment.this, str, str2);
        }
    }

    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GamePreviewInfoObj f84387b;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32902, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        t(GamePreviewInfoObj gamePreviewInfoObj) {
            this.f84387b = gamePreviewInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32901, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext).y(this.f84387b.getAgreement().getTitle()).l(this.f84387b.getAgreement().getText()).t(R.string.confirm, new a()).F();
        }
    }

    public class t0 implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f84390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84391b;

        t0(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            this.f84390a = eVar;
            this.f84391b = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 32933, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.I4(GameDetailFragment.this, this.f84390a, this.f84391b);
            GameDetailFragment.J4(GameDetailFragment.this, this.f84391b, null);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 32932, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class t1 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        t1() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32975, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(GameDetailFragment.this.getString(R.string.report_success));
            } else {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32976, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84394b;

        u(String str) {
            this.f84394b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32903, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if ("10".equals(this.f84394b)) {
                com.max.xiaoheihe.module.account.utils.l.D(GameDetailFragment.this.getCompositeDisposable(), ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, false, true, 0);
            } else if ("11".equals(this.f84394b)) {
                ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(SteamPrivacyActivity.X1(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, GameDetailFragment.this.f84216c0));
            }
        }
    }

    public class u0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f84396b;

        u0(com.max.hbcommon.base.adapter.s.e eVar) {
            this.f84396b = eVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32934, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("cqtest", "预约********");
            GameDetailFragment gameDetailFragment = GameDetailFragment.this;
            GameDetailFragment.H4(gameDetailFragment, this.f84396b, gameDetailFragment.f84267y2.getSubscribe_state());
            dialogInterface.dismiss();
        }
    }

    public class u1 implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        u1() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public void a(View view, int i10, int i11, int i12) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32962, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.q1(GameDetailFragment.this.f84270z4.f109230f, GameDetailFragment.this.L3, GameDetailFragment.this.M3, LinkInfoObj.class);
            if (!GameDetailFragment.this.N3 && ViewUtils.f0(GameDetailFragment.this.A4.f113864d)) {
                com.max.xiaoheihe.module.game.m.f87809a.f(lb.d.f131166g3, GameDetailFragment.this.Z);
                GameDetailFragment.this.N3 = true;
            }
            if (!GameDetailFragment.this.O3 && ViewUtils.f0(GameDetailFragment.this.A4.f113902w)) {
                com.max.xiaoheihe.module.game.m.f87809a.f(lb.d.f131159f3, GameDetailFragment.this.Z);
                GameDetailFragment.this.O3 = true;
            }
            if (ViewUtils.f0(GameDetailFragment.this.A4.O)) {
                GameDetailFragment.this.C4.q();
            }
            if (GameDetailFragment.M5(GameDetailFragment.this)) {
                GameDetailFragment.N5(GameDetailFragment.this);
            } else {
                GameDetailFragment.O5(GameDetailFragment.this);
            }
        }
    }

    public class v implements com.max.xiaoheihe.module.game.adapter.m.k {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.m.k
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32891, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.S6(GameDetailFragment.this, str);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.m.k
        public boolean b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32892, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return GameDetailFragment.this.f84270z4.f109239o.b().getVisibility() == 0;
        }

        @Override // com.max.xiaoheihe.module.game.adapter.m.k
        public void c() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32890, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.H6(GameDetailFragment.this);
        }
    }

    public class v0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32935, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class v1 extends com.max.hbcommon.base.adapter.s<GameAwardObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameAwardObj f84402b;

            a(GameAwardObj gameAwardObj) {
                this.f84402b = gameAwardObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32979, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.hbcommon.utils.c.u(this.f84402b.getCollection_id())) {
                    if (com.max.hbcommon.utils.c.u(this.f84402b.getProt())) {
                        return;
                    }
                    com.max.xiaoheihe.base.router.b.j0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84402b.getProt());
                } else {
                    GameListHeaderObj gameListHeaderObj = new GameListHeaderObj();
                    gameListHeaderObj.setCompilation_id(this.f84402b.getCollection_id());
                    GameDetailFragment gameDetailFragment = GameDetailFragment.this;
                    gameDetailFragment.startActivity(GameCompilationDetailActivity.r2(((com.max.hbcommon.base.d) gameDetailFragment).mContext, gameListHeaderObj));
                }
            }
        }

        v1(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameAwardObj gameAwardObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameAwardObj}, this, changeQuickRedirect, false, 32977, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameAwardObj.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_desc);
            TextView textView2 = (TextView) eVar.i(R.id.tv_name);
            textView.setText(gameAwardObj.getDesc());
            textView2.setText(gameAwardObj.getDetail_name());
            eVar.b().setOnClickListener(new a(gameAwardObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameAwardObj gameAwardObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameAwardObj}, this, changeQuickRedirect, false, 32978, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameAwardObj);
        }
    }

    public class w extends com.max.hbcommon.base.adapter.s<GameScreenshotObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ImageView f84405b;

            a(ImageView imageView) {
                this.f84405b = imageView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32906, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                List<GameScreenshotObj> screenshots = GameDetailFragment.this.f84267y2 != null ? GameDetailFragment.this.f84267y2.getScreenshots() : null;
                int size = screenshots != null ? screenshots.size() : 0;
                if (size <= 0) {
                    return;
                }
                String[] strArr = new String[size];
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    GameScreenshotObj gameScreenshotObj = screenshots.get(i11);
                    strArr[i11] = gameScreenshotObj.getThumbnail();
                    if (gameScreenshotObj.isChecked()) {
                        i10 = i11;
                    }
                }
                ImageViewerHelper.a(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext).m(ImageViewerHelper.d(this.f84405b, i10), strArr).d(i10).p();
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32907, new Class[]{View.class}, Void.TYPE).isSupported || GameDetailFragment.i4(GameDetailFragment.this) == null) {
                    return;
                }
                GameDetailFragment gameDetailFragment = GameDetailFragment.this;
                GameDetailFragment.t4(gameDetailFragment, GameDetailFragment.i4(gameDetailFragment).getUrl());
            }
        }

        w(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameScreenshotObj gameScreenshotObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameScreenshotObj}, this, changeQuickRedirect, false, 32904, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameScreenshotObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_video_thumb);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_video_play);
            if (!"movie".equalsIgnoreCase(gameScreenshotObj.getType()) || TextUtils.isEmpty(gameScreenshotObj.getUrl())) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
            }
            com.max.hbimage.b.L(gameScreenshotObj.getThumbnail(), imageView, R.drawable.common_default_placeholder_375x210);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (com.max.hbcommon.utils.c.u(gameScreenshotObj.getThumbnail())) {
                imageView.setVisibility(8);
            } else if ("movie".equalsIgnoreCase(gameScreenshotObj.getType())) {
                imageView.setOnClickListener(new b());
            } else {
                imageView.setVisibility(0);
                imageView.setOnClickListener(new a(imageView));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameScreenshotObj gameScreenshotObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameScreenshotObj}, this, changeQuickRedirect, false, 32905, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameScreenshotObj);
        }
    }

    public class w0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84408b;

        w0(String str) {
            this.f84408b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32936, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext)) {
                String str = "unfollowing".equals(this.f84408b) ? "following" : "unfollowing";
                if ("unfollowing".equals(this.f84408b)) {
                    GameDetailFragment.this.f84267y2.setFollow_num(String.valueOf(((int) com.max.hbutils.utils.n.p(GameDetailFragment.this.f84267y2.getFollow_num())) + 1));
                } else {
                    GameDetailFragment.this.f84267y2.setFollow_num(String.valueOf(Math.max(0, ((int) com.max.hbutils.utils.n.p(GameDetailFragment.this.f84267y2.getFollow_num())) - 1)));
                }
                if ("following".equals(str)) {
                    GameDetailFragment.this.f84233k4.removeMessages(1);
                    GameDetailFragment.C4(GameDetailFragment.this);
                }
                GameDetailFragment.M4(GameDetailFragment.this, str);
                GameDetailFragment.N4(GameDetailFragment.this, str, true);
                GameDetailFragment.O4(GameDetailFragment.this, str);
            }
        }
    }

    public class w1 extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        w1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 32980, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            super.getItemOffsets(rect, view, recyclerView, state);
            if (recyclerView.getChildAdapterPosition(view) == GameDetailFragment.this.f84229i4.size() - 1) {
                rect.right = 0;
            } else {
                rect.right = ViewUtils.f(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 16.0f);
            }
        }
    }

    public class x extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 32908, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(ViewUtils.t0(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, 4.0f), 0, 0, 0);
            }
        }
    }

    public class x0 implements ShineButton.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f84412a;

        x0(WeakReference weakReference) {
            this.f84412a = weakReference;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(WeakReference weakReference) {
            ShineButton shineButton;
            if (PatchProxy.proxy(new Object[]{weakReference}, null, changeQuickRedirect, true, 32938, new Class[]{WeakReference.class}, Void.TYPE).isSupported || (shineButton = (ShineButton) weakReference.get()) == null) {
                return;
            }
            shineButton.setVisibility(4);
        }

        @Override // com.max.hbcustomview.shinebuttonlib.ShineButton.g
        public void a(View view, boolean z10) {
            ShineButton shineButton;
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32937, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported || (shineButton = (ShineButton) this.f84412a.get()) == null) {
                return;
            }
            final WeakReference weakReference = this.f84412a;
            shineButton.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.game.x
                @Override // java.lang.Runnable
                public final void run() {
                    GameDetailFragment.x0.c(weakReference);
                }
            }, z10 ? 620L : 0L);
        }
    }

    public class x1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f84414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f84415b;

        x1(View view, View view2) {
            this.f84414a = view;
            this.f84415b = view2;
        }
    }

    public class y extends com.max.hbcommon.base.adapter.s<GameBundleObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f84417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f84418c;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84420b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f84421c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f84422d;

            a(String str, String str2, String str3) {
                this.f84420b = str;
                this.f84421c = str2;
                this.f84422d = str3;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32911, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.xiaoheihe.module.game.adapter.b.f85645g.equals(this.f84420b)) {
                    ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(com.max.xiaoheihe.module.game.z.b(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84421c, this.f84422d, "pc", null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
                } else {
                    ((com.max.hbcommon.base.d) GameDetailFragment.this).mContext.startActivity(GameListActivity.T1(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, this.f84422d));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Context context, List list, int i10, int i11, int i12) {
            super(context, list, i10);
            this.f84417b = i11;
            this.f84418c = i12;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameBundleObj gameBundleObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameBundleObj}, this, changeQuickRedirect, false, 32909, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameBundleObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar.b();
            TextView textView = (TextView) eVar.i(R.id.tv_discount);
            TextView textView2 = (TextView) eVar.i(R.id.tv_name);
            ViewGroup.LayoutParams layoutParams = viewB.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = this.f84417b;
            if (i10 != i11) {
                layoutParams.width = i11;
                viewB.setLayoutParams(layoutParams);
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i12 = layoutParams2.height;
            int i13 = this.f84418c;
            if (i12 != i13) {
                layoutParams2.height = i13;
                imageView.setLayoutParams(layoutParams2);
            }
            com.max.hbimage.b.L(gameBundleObj.getImage(), imageView, R.drawable.common_default_placeholder_375x210);
            if (gameBundleObj.getHeybox_price() == null || com.max.hbutils.utils.n.q(gameBundleObj.getHeybox_price().getDiscount()) <= 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                bb.d.d(textView, 2);
                textView.setText(String.format(Locale.US, "-%s%%", gameBundleObj.getHeybox_price().getDiscount()));
            }
            textView2.setText(gameBundleObj.getName());
            GameObj gameObj = new GameObj();
            gameObj.setHeybox_price(gameBundleObj.getHeybox_price());
            gameObj.setPrice(gameBundleObj.getPrice());
            gameObj.setPlatforms_url(gameBundleObj.getPlatforms_url());
            com.max.xiaoheihe.module.game.r1.B(eVar, gameObj, false, false);
            viewB.setOnClickListener(new a(gameBundleObj.getType(), gameBundleObj.getH_src(), gameBundleObj.getBundle_id()));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameBundleObj gameBundleObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameBundleObj}, this, changeQuickRedirect, false, 32910, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameBundleObj);
        }
    }

    public class y0 implements ShineButton.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ShineButton f84424a;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32940, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                y0.this.f84424a.setVisibility(4);
            }
        }

        y0(ShineButton shineButton) {
            this.f84424a = shineButton;
        }

        @Override // com.max.hbcustomview.shinebuttonlib.ShineButton.g
        public void a(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32939, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f84424a.postDelayed(new a(), z10 ? 620L : 0L);
        }
    }

    public static class y1 implements com.max.hbcommon.analytics.d.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<GameDetailFragment> f84427b;

        public y1(GameDetailFragment gameDetailFragment) {
            this.f84427b = new WeakReference<>(gameDetailFragment);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ String H() {
            return com.max.hbcommon.analytics.e.a(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean d2() {
            return com.max.hbcommon.analytics.e.c(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        @androidx.annotation.p0
        public PathSrcNode getClickSrc() {
            return null;
        }

        @Override // com.max.hbcommon.analytics.d.f
        @androidx.annotation.p0
        public String getPageAdditional() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32981, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            GameDetailFragment gameDetailFragment = this.f84427b.get();
            if (gameDetailFragment == null || !gameDetailFragment.isAdded()) {
                return null;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("app_id", gameDetailFragment.Z);
            if (gameDetailFragment.f84267y2 != null && gameDetailFragment.f84267y2.getPrice() != null) {
                jsonObject.addProperty("super_lowest", gameDetailFragment.f84267y2.getPrice().isSuper_lowest() ? "1" : "0");
                jsonObject.addProperty("new_lowest", gameDetailFragment.f84267y2.getPrice().getNew_lowest());
                jsonObject.addProperty("is_lowest", gameDetailFragment.f84267y2.getPrice().getIs_lowest());
            }
            return jsonObject.toString();
        }

        @Override // com.max.hbcommon.analytics.d.f
        @androidx.annotation.p0
        public String getPagePath() {
            return lb.d.f131138c3;
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean isPageVisited() {
            return com.max.hbcommon.analytics.e.e(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void l1(View view) {
            com.max.hbcommon.analytics.e.f(this, view);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean o3() {
            return com.max.hbcommon.analytics.e.d(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void onPageVisitSuccess() {
            com.max.hbcommon.analytics.e.g(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public void setClickSrc(@androidx.annotation.p0 PathSrcNode pathSrcNode) {
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void setPageVisited(boolean z10) {
            com.max.hbcommon.analytics.e.h(this, z10);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ String v3() {
            return com.max.hbcommon.analytics.e.b(this);
        }
    }

    public class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32912, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.N(((com.max.hbcommon.base.d) GameDetailFragment.this).mContext, GameDetailFragment.this.Z).A();
        }
    }

    public class z0 extends pg.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        z0() {
        }

        @Override // pg.g, pg.c
        public void i(ng.f fVar, boolean z10, float f10, int i10, int i11, int i12) {
            Object[] objArr = {fVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32928, new Class[]{ng.f.class, Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailFragment.this.f84270z4.f109226b.setStickyOffset(i10);
            super.i(fVar, z10, f10, i10, i11, i12);
        }
    }

    public static class z1 extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<GameDetailFragment> f84430a;

        public z1(GameDetailFragment gameDetailFragment) {
            this.f84430a = new WeakReference<>(gameDetailFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 32982, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            GameDetailFragment gameDetailFragment = this.f84430a.get();
            if (gameDetailFragment == null || !gameDetailFragment.isActive()) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                GameDetailFragment.q5(gameDetailFragment);
            } else if (i10 == 2) {
                GameDetailFragment.s5(gameDetailFragment);
            } else {
                if (i10 != 3) {
                    return;
                }
                GameDetailFragment.u5(gameDetailFragment);
            }
        }
    }

    static /* synthetic */ void A5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32864, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.E9();
    }

    private View A7(TypedButtonObj typedButtonObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typedButtonObj}, this, changeQuickRedirect, false, 32739, new Class[]{TypedButtonObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (typedButtonObj == null) {
            return null;
        }
        int iQ = com.max.hbutils.utils.n.q(typedButtonObj.getType());
        if (iQ == GameDetailsWrapperObj.BottomButtonStyle.Purchase.getValue()) {
            return H7() ? Q7() : W7();
        }
        if (iQ == GameDetailsWrapperObj.BottomButtonStyle.GroupPurchase.getValue()) {
            return P7();
        }
        if (iQ == GameDetailsWrapperObj.BottomButtonStyle.CountDown.getValue()) {
            return M7();
        }
        if (iQ == GameDetailsWrapperObj.BottomButtonStyle.AddFreeLicence.getValue()) {
            return K7();
        }
        if (iQ == GameDetailsWrapperObj.BottomButtonStyle.NotFinishOrder.getValue()) {
            return R7();
        }
        if (iQ == GameDetailsWrapperObj.BottomButtonStyle.CustomButton.getValue()) {
            return V7(typedButtonObj);
        }
        if (iQ == GameDetailsWrapperObj.BottomButtonStyle.Follow.getValue()) {
            return N7();
        }
        return null;
    }

    private void A8(String str) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32732, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (Objects.equals(this.P3, str)) {
            z10 = false;
        } else {
            this.P3 = str;
        }
        if (z10) {
            this.G3 = 0;
            E7();
        }
    }

    private void A9(com.max.hbcommon.base.adapter.s.e eVar) {
    }

    static /* synthetic */ void B5(GameDetailFragment gameDetailFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str, str2}, null, changeQuickRedirect, true, 32865, new Class[]{GameDetailFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.p9(str, str2);
    }

    private GameScreenshotObj B7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32703, new Class[0], GameScreenshotObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameScreenshotObj) patchProxyResultProxy.result;
        }
        List<GameScreenshotObj> list = this.f84230j;
        if (list == null) {
            return null;
        }
        for (GameScreenshotObj gameScreenshotObj : list) {
            if (gameScreenshotObj.isChecked()) {
                return gameScreenshotObj;
            }
        }
        return null;
    }

    private void B8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32687, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        C8(str, 0);
    }

    private void B9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32721, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.game.d0.l4(this.Z, this.f84267y2.getPlatf()).show(getChildFragmentManager(), T4);
    }

    static /* synthetic */ void C4(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32846, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.J7();
    }

    static /* synthetic */ void C5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32835, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.E7();
    }

    @androidx.annotation.n0
    private PostOptionObj C7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32813, new Class[0], PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName("反馈");
        postOptionObj.setImage_resource_id(R.drawable.share_dislike_46x46);
        postOptionObj.setClick_listener(new r1());
        return postOptionObj;
    }

    private void C8(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 32688, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported || str == null) {
            return;
        }
        if (this.f84215c.D()) {
            this.f84215c.setOriginContainer(F7());
        } else {
            this.f84222f.setVisibility(4);
            if (this.f84215c.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f84215c.getParent()).removeView(this.f84215c);
            }
            o7();
        }
        com.max.video.player.a player = this.f84215c.getPlayer();
        if (player != null && !str.equals(player.s())) {
            this.f84215c.S(this.mContext);
        }
        if (this.f84212b) {
            this.f84215c.H();
        } else {
            this.f84215c.a0();
        }
        this.f84215c.setVideoRes(str);
        if (i10 > 0) {
            this.f84215c.P(i10);
        } else {
            this.f84215c.O();
        }
        if (this.mIsVisible) {
            this.f84215c.Y();
        }
    }

    private void C9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32706, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameDetailsWrapperObj gameDetailsWrapperObj = this.f84267y2;
        String string = (gameDetailsWrapperObj == null || com.max.hbcommon.utils.c.u(gameDetailsWrapperObj.getPrice_placeholder())) ? this.mContext.getResources().getString(R.string.no_price) : this.f84267y2.getPrice_placeholder();
        this.O.setVisibility(8);
        this.f84236m.setTextSize(1, 16.0f);
        this.f84236m.setText(string);
    }

    static /* synthetic */ void D4(GameDetailFragment gameDetailFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32847, new Class[]{GameDetailFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.s9(z10);
    }

    private int D7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32698, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.w(this.f84230j)) {
            return -1;
        }
        for (int i10 = 0; i10 < this.f84230j.size(); i10++) {
            if ("movie".equals(this.f84230j.get(i10).getType()) && !com.max.hbcommon.utils.c.u(this.f84230j.get(i10).getUrl())) {
                return i10;
            }
        }
        return 0;
    }

    private void D9(MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductObj}, this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.B, new Class[]{MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        u8(this.f84266y1, mallProductObj.getGame_info().getAppid(), null, null, null, mallProductObj.getGame_info().getPackage_id(), mallProductObj.getSku_id(), false);
    }

    static /* synthetic */ void E4(GameDetailFragment gameDetailFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32848, new Class[]{GameDetailFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.v8(z10);
    }

    static /* synthetic */ void E6(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32841, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.showLoading();
    }

    private void E7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32780, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Map<String, String> filter = getFilter();
        this.f84260w4 = filter;
        if (this.G3 == 0) {
            if (this.K3.size() > 0) {
                this.f84241o4 = false;
            }
            this.L3.clear();
            this.M3.clear();
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().S5(this.Z, this.P3, "4", this.G3, 30, filter, this.f84241o4 ? this.f84239n4 : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h1(this.G3)));
    }

    private void E8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32799, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", String.format(lb.a.f131070x2, this.f84267y2.getGameDetailsObj().getAppid()));
        intent.putExtra("title", getString(R.string.related_goods));
        this.mContext.startActivity(intent);
    }

    private void E9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32814, new Class[0], Void.TYPE).isSupported || !isActive() || this.f84267y2 == null) {
            return;
        }
        s1 s1Var = new s1();
        HashMap<String, String> map = new HashMap<>();
        map.put("appid", this.Z);
        ReportReasonFragment.f80025u.b(s1Var, ReportReasonFragment.REPORT_TYPE.game, map).show(getChildFragmentManager(), "ForbidReasonFragment");
    }

    static /* synthetic */ void F5(GameDetailFragment gameDetailFragment, List list, GameScreenshotObj gameScreenshotObj) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, list, gameScreenshotObj}, null, changeQuickRedirect, true, 32828, new Class[]{GameDetailFragment.class, List.class, GameScreenshotObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.N9(list, gameScreenshotObj);
    }

    private ViewGroup F7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32690, new Class[0], ViewGroup.class);
        return patchProxyResultProxy.isSupported ? (ViewGroup) patchProxyResultProxy.result : (ViewGroup) ((ViewGroup) this.f84220e.getChildAt(0)).getChildAt(this.f84220e.getCurrentItem());
    }

    private void F8(ImageView imageView, BarChart barChart, ArrayList<KeyDescObj> arrayList, ArrayList<KeyDescObj> arrayList2) {
        ArrayList<KeyDescObj> arrayList3 = arrayList2;
        if (PatchProxy.proxy(new Object[]{imageView, barChart, arrayList, arrayList3}, this, changeQuickRedirect, false, 32726, new Class[]{ImageView.class, BarChart.class, ArrayList.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        int color = this.mContext.getResources().getColor(R.color.divider_secondary_1_color);
        int color2 = this.mContext.getResources().getColor(R.color.text_secondary_1_color);
        YAxis axisRight = barChart.getAxisRight();
        YAxis axisLeft = barChart.getAxisLeft();
        XAxis xAxis = barChart.getXAxis();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < arrayList.size()) {
            int i12 = Integer.parseInt(arrayList.get(i10).getValue());
            if (i11 < i12) {
                i11 = i12;
            }
            arrayList4.add(new BarEntry(i10, i12));
            i10++;
            i11 = i11;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < arrayList2.size()) {
            int i15 = Integer.parseInt(arrayList3.get(i13).getValue());
            if (i14 > i15) {
                i14 = i15;
            }
            arrayList5.add(new BarEntry(i13, i15));
            i13++;
            arrayList3 = arrayList2;
            i14 = i14;
        }
        e0 e0Var = new e0(arrayList);
        f0 f0Var = new f0(0);
        BarDataSet barDataSet = new BarDataSet(arrayList4, null);
        BarDataSet barDataSet2 = new BarDataSet(arrayList5, null);
        barDataSet.setValueFormatter(new g0());
        barDataSet2.setValueFormatter(new h0());
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        barDataSet.setAxisDependency(axisDependency);
        barDataSet2.setAxisDependency(axisDependency);
        barDataSet.setColor(-688059);
        barDataSet2.setColor(-2433568);
        BarData barData = new BarData(barDataSet);
        barData.addDataSet(barDataSet2);
        barData.setBarWidth(0.6666667f);
        barChart.setData(barData);
        int i16 = i11 == 0 ? 1 : 0;
        if (i14 == 0) {
            i16++;
        }
        int i17 = ((((i11 / 100) + 1) * 100) - (((i14 / 100) - 1) * 100)) / 100;
        axisLeft.setLabelCount(i17 < 5 ? (i17 - i16) + 1 : 5, false);
        axisLeft.setAxisLineColor(color);
        axisLeft.setTextColor(color2);
        axisLeft.setGridColor(color);
        axisLeft.setTextSize(10.0f);
        axisLeft.setZeroLineColor(-2433568);
        axisLeft.setValueFormatter(f0Var);
        axisRight.setEnabled(false);
        xAxis.setAxisLineColor(color);
        xAxis.setDrawGridLines(false);
        xAxis.setTextColor(color2);
        xAxis.setTextSize(10.0f);
        xAxis.setLabelCount(24);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(e0Var);
        barChart.post(new i0(imageView, barChart));
        barChart.setHighlightFullBarEnabled(false);
        barChart.setHighlightPerTapEnabled(false);
        barChart.getDescription().setEnabled(false);
        barChart.getLegend().setEnabled(false);
        barChart.setScaleEnabled(false);
        barChart.setDragEnabled(false);
        barChart.notifyDataSetChanged();
        barChart.invalidate();
    }

    private void F9(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32730, new Class[]{String.class}, Void.TYPE).isSupported || this.f84267y2 == null) {
            return;
        }
        ComponentCallbacks2 componentCallbacks2 = this.mContext;
        if (componentCallbacks2 instanceof com.max.hbcommon.base.f) {
            ShareViewUtil.h((com.max.hbcommon.base.f) componentCallbacks2, this.Z, str, null);
        }
    }

    private boolean G7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32740, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Iterator<String> it = this.f84267y2.getButton_style_list().iterator();
        while (it.hasNext()) {
            if (com.max.hbutils.utils.n.q(it.next()) == GameDetailsWrapperObj.BottomButtonStyle.GroupPurchase.getValue()) {
                return true;
            }
        }
        return false;
    }

    private void G8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32734, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84270z4.f109228d.removeAllViews();
        this.E4 = 0;
        x1 x1VarX7 = x7();
        H8(this.f84267y2.getIcon_style_list());
        View view = x1VarX7.f84414a;
        View view2 = x1VarX7.f84415b;
        if (view != null) {
            this.f84270z4.f109228d.addView(view);
        }
        if (view != null && view2 != null) {
            View view3 = new View(this.mContext);
            view3.setLayoutParams(new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 9.0f), ViewUtils.f(this.mContext, 1.0f)));
            this.f84270z4.f109228d.addView(view3);
        }
        if (view2 != null) {
            this.f84270z4.f109228d.addView(view2);
        }
        if (this.f84270z4.f109228d.getChildCount() > 0) {
            this.f84270z4.f109228d.setVisibility(0);
        }
    }

    static /* synthetic */ void H4(GameDetailFragment gameDetailFragment, com.max.hbcommon.base.adapter.s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, eVar, str}, null, changeQuickRedirect, true, 32849, new Class[]{GameDetailFragment.class, com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.u7(eVar, str);
    }

    static /* synthetic */ void H6(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32831, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.K9();
    }

    private boolean H7() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32741, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        GameDetailsWrapperObj gameDetailsWrapperObj = this.f84267y2;
        if (gameDetailsWrapperObj == null) {
            com.max.heybox.hblog.g.G("[GameDetailFragment][hasGroupBuyV2] mGameDetailsWrapperObj should not be null!");
            return false;
        }
        List<TypedButtonObj> button_style_list_v2 = gameDetailsWrapperObj.getButton_style_list_v2();
        if (!com.max.hbcommon.utils.c.w(button_style_list_v2)) {
            for (TypedButtonObj typedButtonObj : button_style_list_v2) {
                if (typedButtonObj != null && com.max.hbutils.utils.n.q(typedButtonObj.getType()) == GameDetailsWrapperObj.BottomButtonStyle.GroupPurchase.getValue()) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    private void H8(List<KeyDescObj> list) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 32742, new Class[]{List.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list) || this.E4 < 0) {
            return;
        }
        while (i10 < list.size()) {
            KeyDescObj keyDescObj = list.get(i10);
            if (keyDescObj != null && !com.max.hbcommon.utils.c.u(keyDescObj.getType())) {
                String type = keyDescObj.getType();
                View viewL7 = null;
                int i11 = i10 == list.size() - 1 ? 12 : 6;
                if (Objects.equals(type, GameDetailsWrapperObj.BottomIconStyle.ICON_STYLE_FOLLOW_STATUE.getType())) {
                    viewL7 = O7(i11);
                } else if (Objects.equals(type, GameDetailsWrapperObj.BottomIconStyle.ICON_STYLE_OWNED.getType())) {
                    viewL7 = T7(i11);
                } else if (Objects.equals(type, GameDetailsWrapperObj.BottomIconStyle.ICON_STYLE_CUSTOM.getType())) {
                    viewL7 = L7(keyDescObj, i11);
                } else {
                    com.max.heybox.hblog.g.G("[refreshBottomIcons] invalid iconStyleKey: " + keyDescObj);
                }
                if (viewL7 != null) {
                    this.f84270z4.f109228d.addView(viewL7, this.E4);
                    this.E4++;
                }
            }
            i10++;
        }
    }

    private void H9(com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105205o, new Class[]{com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        String strY0 = com.max.xiaoheihe.module.game.r1.y0(this.f84267y2.getMobileGameDetailsObj());
        if (!com.max.hbcommon.utils.c.B(strY0)) {
            strY0 = null;
        }
        com.max.xiaoheihe.module.game.r1.h2((BaseActivity) this.mContext, strY0, this.Z, new g1(eVar));
    }

    static /* synthetic */ void I4(GameDetailFragment gameDetailFragment, com.max.hbcommon.base.adapter.s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, eVar, str}, null, changeQuickRedirect, true, 32850, new Class[]{GameDetailFragment.class, com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.l9(eVar, str);
    }

    private boolean I7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32764, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f84267y2.getGameDetailsObj() != null && "1".equals(this.f84267y2.getGameDetailsObj().getHas_unfinished_order());
    }

    private void I8(GameCommentsObj gameCommentsObj) {
        if (PatchProxy.proxy(new Object[]{gameCommentsObj}, this, changeQuickRedirect, false, 32731, new Class[]{GameCommentsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TabLayout tabLayout = (TabLayout) this.f84270z4.f109240p.b().findViewById(R.id.tl);
        SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView = (SecondaryWindowSegmentFilterView) this.f84270z4.f109240p.b().findViewById(R.id.secondary_filter);
        secondaryWindowSegmentFilterView.setDelayShowSecondaryWindowTime(300L);
        secondaryWindowSegmentFilterView.setList(this.f84217c4);
        if (tabLayout.getTabCount() < 1) {
            List<KeyDescObj> sort_type_list = this.Q3.getSort_type_list();
            int i10 = -1;
            if (sort_type_list != null) {
                for (int i11 = 0; i11 < sort_type_list.size(); i11++) {
                    KeyDescObj keyDescObj = sort_type_list.get(i11);
                    if (keyDescObj.getValue().equals(this.P3)) {
                        i10 = i11;
                    }
                    TabLayout.h hVarI = tabLayout.I();
                    hVarI.u(R.layout.layout_plain_tab);
                    TextView textView = (TextView) hVarI.g().findViewById(R.id.text);
                    if (textView != null) {
                        textView.setText(keyDescObj.getText());
                    }
                    tabLayout.i(hVarI);
                }
            }
            if (i10 != -1) {
                TabLayout.h hVarD = tabLayout.D(i10);
                if (hVarD != null) {
                    hVarD.r();
                    TextView textView2 = (TextView) hVarD.g().findViewById(R.id.text);
                    if (textView2 != null) {
                        textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                    }
                }
            } else {
                TabLayout.h hVarD2 = tabLayout.D(0);
                if (hVarD2 != null) {
                    hVarD2.r();
                    TextView textView3 = (TextView) hVarD2.g().findViewById(R.id.text);
                    if (textView3 != null) {
                        textView3.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                    }
                }
            }
            tabLayout.h(new k0(sort_type_list));
        }
        List<FilterGroup> list = this.f84217c4;
        if (list == null || list.size() <= 0) {
            secondaryWindowSegmentFilterView.setVisibility(8);
            return;
        }
        secondaryWindowSegmentFilterView.setVisibility(0);
        secondaryWindowSegmentFilterView.setDismissListener(new l0());
        secondaryWindowSegmentFilterView.setFilterClickListener(new m0(secondaryWindowSegmentFilterView));
    }

    private void I9(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105208r, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z<Result> zVarNb = null;
        if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().l8(this.Z);
        } else if (GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().nb(this.Z, str2);
        }
        if (zVarNb != null) {
            addDisposable((io.reactivex.disposables.b) zVarNb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q()));
        }
    }

    static /* synthetic */ void J4(GameDetailFragment gameDetailFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str, str2}, null, changeQuickRedirect, true, 32851, new Class[]{GameDetailFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.I9(str, str2);
    }

    private void J7() {
        BubbleView bubbleView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32745, new Class[0], Void.TYPE).isSupported || (bubbleView = this.f84231j4) == null || bubbleView.getAlpha() <= 0.0f) {
            return;
        }
        com.max.hbutils.anim.b.c(this.f84231j4, 500, false);
    }

    private void J8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32710, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.setVisibility(8);
    }

    private void J9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32794, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s9(this.Z).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j1()));
    }

    static /* synthetic */ void K6(GameDetailFragment gameDetailFragment, GameDetailCommonTags gameDetailCommonTags) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, gameDetailCommonTags}, null, changeQuickRedirect, true, 32842, new Class[]{GameDetailFragment.class, GameDetailCommonTags.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.t9(gameDetailCommonTags);
    }

    private View K7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32773, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.layout_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.layout_bottom_btn, viewInflate);
        View viewI = eVar.i(R.id.vg_btn);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        TextView textView3 = (TextView) eVar.i(R.id.tv_tag);
        imageView.setVisibility(8);
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        viewI.setBackgroundResource(R.drawable.btn_primary_2dp);
        textView.setTextColor(getResources().getColor(R.color.background_layer_2_color));
        textView.setText("一键免费领取");
        viewInflate.setOnClickListener(new f1(this.f84267y2.getFreeLicenseObj()));
        return viewInflate;
    }

    private void K8(View view, String str) {
        if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105203m, new Class[]{View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.M = (TickerView) view.findViewById(R.id.tv_time);
        TextView textView = (TextView) view.findViewById(R.id.tv_desc);
        Z7(this.M);
        L8();
        textView.setText(str);
    }

    private void K9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32729, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.k(this.mContext, this.Z, com.max.hbutils.utils.n.q(this.f84267y2.getScore()), this.f84244p2, false).C(2).A();
    }

    private View L7(@androidx.annotation.n0 final KeyDescObj keyDescObj, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 32763, new Class[]{KeyDescObj.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.item_single_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        int iF = ViewUtils.f(this.mContext, i10);
        if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(iF);
            viewInflate.setLayoutParams(layoutParams);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_desc);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        textView.setText(keyDescObj.getText());
        if (!com.max.hbcommon.utils.c.u(keyDescObj.getColor())) {
            textView.setTextColor(com.max.xiaoheihe.utils.d.e1(keyDescObj.getColor()));
        }
        com.max.hbimage.b.K(keyDescObj.getIcon(), imageView);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87837b.e8(keyDescObj, view);
            }
        });
        return viewInflate;
    }

    private void L8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105204n, new Class[0], Void.TYPE).isSupported || !isActive() || this.M == null) {
            return;
        }
        long jR = com.max.hbutils.utils.n.r(this.f84267y2.getDeadline_timestamp()) * 1000;
        if (jR - System.currentTimeMillis() > 0) {
            this.M.setText(com.max.hbutils.utils.w.m(this.mContext, jR, false));
            this.f84233k4.sendEmptyMessageDelayed(2, 1000L);
            return;
        }
        this.M.setText("00:00:00");
        this.G3 = 0;
        a2 a2Var = this.T3;
        if (a2Var != null) {
            a2Var.Z(true, this.f84244p2, this.Z);
        }
    }

    private void L9(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32691, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            a2 a2Var = this.T3;
            if (a2Var != null) {
                a2Var.c(this.f84215c, F7());
                return;
            }
            return;
        }
        a2 a2Var2 = this.T3;
        if (a2Var2 != null) {
            a2Var2.e();
        }
    }

    static /* synthetic */ void M4(GameDetailFragment gameDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str}, null, changeQuickRedirect, true, 32852, new Class[]{GameDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.O8(str);
    }

    static /* synthetic */ boolean M5(GameDetailFragment gameDetailFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32836, new Class[]{GameDetailFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : gameDetailFragment.d8();
    }

    private View M7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105202l, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.layout_deadline, (ViewGroup) this.f84270z4.f109228d, false);
        K8(viewInflate, this.f84267y2.getDeadline_desc());
        return viewInflate;
    }

    private void M8(LastEventObj lastEventObj) {
        if (PatchProxy.proxy(new Object[]{lastEventObj}, this, changeQuickRedirect, false, 32694, new Class[]{LastEventObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (lastEventObj == null) {
            this.A4.f113907y0.setVisibility(8);
            return;
        }
        this.A4.f113907y0.setVisibility(0);
        LinearLayout linearLayout = this.A4.f113907y0;
        Activity activity = this.mContext;
        linearLayout.setBackground(ViewUtils.G(ViewUtils.m(activity, ViewUtils.L(activity), ViewUtils.f(this.mContext, 34.0f)), com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_2_color)));
        if (lastEventObj.getUser() != null) {
            this.A4.f113878k.setVisibility(0);
            d dVar = new d(lastEventObj);
            com.max.hbimage.b.I(lastEventObj.getUser().getAvartar(), this.A4.f113878k, R.drawable.common_default_avatar_40x40);
            this.A4.f113878k.setOnClickListener(dVar);
        } else {
            this.A4.f113878k.setVisibility(8);
        }
        this.A4.f113869f0.setText(lastEventObj.getTitle());
        this.A4.f113907y0.setOnClickListener(new e(lastEventObj));
    }

    private void M9(List<FilterGroup> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 32795, new Class[]{List.class}, Void.TYPE).isSupported && this.f84217c4 == null && list != null && list.size() > 0) {
            this.f84217c4 = new ArrayList();
            for (FilterGroup filterGroup : list) {
                SecondaryWindowSegmentFilterView.setDefaultChecked(filterGroup);
                this.f84217c4.add(filterGroup);
            }
        }
    }

    static /* synthetic */ void N4(GameDetailFragment gameDetailFragment, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32853, new Class[]{GameDetailFragment.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.P8(str, z10);
    }

    static /* synthetic */ void N5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32837, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.s8();
    }

    private View N7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32756, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (this.S == null) {
            this.S = this.mInflater.inflate(R.layout.layout_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        }
        O8(this.f84267y2.getFollow_state_v2());
        return this.S;
    }

    private void N8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32718, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<GameBundleObj> dlcs = this.f84267y2.getDlcs();
        if (dlcs == null || dlcs.size() <= 0) {
            this.A4.f113862c.setVisibility(8);
            this.A4.S.setVisibility(8);
            return;
        }
        this.A4.f113862c.setVisibility(0);
        this.A4.S.setVisibility(0);
        this.I.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.I.setNestedScrollingEnabled(false);
        this.I.setClipChildren(false);
        this.I.setClipToPadding(false);
        this.I.setPadding(ViewUtils.t0(this.mContext, 10.0f), 0, ViewUtils.t0(this.mContext, 10.0f), 0);
        RecyclerView.ItemDecoration itemDecoration = this.G2;
        if (itemDecoration == null) {
            this.G2 = new x();
        } else {
            this.I.removeItemDecoration(itemDecoration);
        }
        this.I.addItemDecoration(this.G2);
        int iL = (int) (((ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 36.0f)) / 3.0f) + 0.5f);
        this.I.setAdapter(new y(this.mContext, dlcs, R.layout.item_dlc, iL, (int) (((iL * 52) / 113.0f) + 0.5f)));
        this.A4.f113862c.setOnClickListener(new z());
    }

    private void N9(List<GameScreenshotObj> list, GameScreenshotObj gameScreenshotObj) {
        if (PatchProxy.proxy(new Object[]{list, gameScreenshotObj}, this, changeQuickRedirect, false, 32702, new Class[]{List.class, GameScreenshotObj.class}, Void.TYPE).isSupported || list == null || gameScreenshotObj == null) {
            return;
        }
        for (GameScreenshotObj gameScreenshotObj2 : list) {
            gameScreenshotObj2.setChecked(gameScreenshotObj2.equals(gameScreenshotObj));
        }
    }

    static /* synthetic */ void O4(GameDetailFragment gameDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str}, null, changeQuickRedirect, true, 32854, new Class[]{GameDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.v7(str);
    }

    static /* synthetic */ void O5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32838, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.r8();
    }

    private View O7(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32760, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (this.T == null) {
            this.T = this.mInflater.inflate(R.layout.item_single_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        }
        ViewGroup.LayoutParams layoutParams = this.T.getLayoutParams();
        int iF = ViewUtils.f(this.mContext, i10);
        if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(iF);
            this.T.setLayoutParams(layoutParams);
        }
        P8(this.f84267y2.getFollow_state_v2(), false);
        return this.T;
    }

    private void O8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32757, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        w0 w0Var = new w0(str);
        CardView cardView = this.f84255u;
        if (cardView != null) {
            View viewFindViewById = cardView.findViewById(R.id.vg_follow_num_container);
            ImageView imageView = (ImageView) this.f84255u.findViewById(R.id.iv_follow_icon);
            GradientTextView gradientTextView = (GradientTextView) this.f84255u.findViewById(R.id.tv_follow_desc);
            TextView textView = (TextView) this.f84255u.findViewById(R.id.tv_follow_num);
            TextView textView2 = (TextView) this.f84255u.findViewById(R.id.tv_follow_num_unit);
            View viewFindViewById2 = this.f84255u.findViewById(R.id.vg_rank);
            ImageView imageView2 = (ImageView) this.f84255u.findViewById(R.id.iv_tritangle);
            GradientTextView gradientTextView2 = (GradientTextView) this.f84255u.findViewById(R.id.tv_rank);
            if ("unfollowing".equals(str)) {
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                viewFindViewById.setBackgroundResource(R.color.divider_secondary_2_color);
                imageView.setColorFilter(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
                gradientTextView.setColors(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color), com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
                gradientTextView.setText(this.mContext.getResources().getText(R.string.follow));
                imageView2.setImageResource(R.drawable.common_tritangle_rt_black);
                imageView2.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
                gradientTextView2.setColors(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color), com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
            } else {
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                viewFindViewById.setBackground(ViewUtils.i(0, com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color)));
                imageView.clearColorFilter();
                imageView.setImageResource(R.drawable.game_follow_gradient_red_30x30);
                gradientTextView.setColors(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color));
                gradientTextView.setText(this.mContext.getResources().getText(R.string.has_followed));
                imageView2.setImageResource(R.drawable.common_tritangle_rt_white);
                imageView2.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                gradientTextView2.setColors(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color));
            }
            if (com.max.hbcommon.utils.c.u(this.f84267y2.getWish_rank())) {
                viewFindViewById2.setVisibility(8);
            } else {
                viewFindViewById2.setVisibility(0);
                gradientTextView2.setTextSize(1, this.f84267y2.getWish_rank().length() > 1 ? 8.0f : 7.0f);
                gradientTextView2.setText("#" + this.f84267y2.getWish_rank());
            }
            Q8(this.f84267y2.getFollow_num(), textView, textView2);
            this.f84255u.setOnClickListener(w0Var);
        }
        View view = this.S;
        if (view != null) {
            View viewFindViewById3 = view.findViewById(R.id.vg_btn);
            ImageView imageView3 = (ImageView) this.S.findViewById(R.id.iv_icon);
            GradientTextView gradientTextView3 = (GradientTextView) this.S.findViewById(R.id.tv_name);
            TextView textView3 = (TextView) this.S.findViewById(R.id.tv_desc);
            TextView textView4 = (TextView) this.S.findViewById(R.id.tv_tag);
            textView3.setVisibility(8);
            textView4.setVisibility(8);
            if ("unfollowing".equals(str)) {
                imageView3.setImageResource(R.drawable.game_like_filled_24x24);
                imageView3.setColorFilter(this.mContext.getResources().getColor(R.color.background_layer_2_color));
                gradientTextView3.f68498j = false;
                gradientTextView3.setTextColor(getResources().getColor(R.color.background_layer_2_color));
                gradientTextView3.setText(R.string.follow);
                viewFindViewById3.setBackgroundResource(R.drawable.btn_text_primary_2dp);
            } else {
                imageView3.clearColorFilter();
                imageView3.setImageResource(R.drawable.game_follow_gradient_red_30x30);
                gradientTextView3.setColors(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color));
                gradientTextView3.setText(R.string.has_followed);
                viewFindViewById3.setBackgroundResource(R.drawable.btn_divider_concept_2dp);
            }
            imageView3.setVisibility(0);
            this.S.setOnClickListener(w0Var);
        }
    }

    private View P7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32747, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (!r7()) {
            return null;
        }
        GroupingPriceObj grouping_price = this.f84267y2.getGrouping_price();
        x60 x60VarD = x60.d(this.mInflater, this.f84270z4.f109228d, false);
        x60VarD.b().setBackground(ViewUtils.x(ViewUtils.f(this.mContext, 5.0f), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_start_color), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_end_color)));
        x60VarD.b().setOnClickListener(new q0());
        if (this.S3 && com.max.xiaoheihe.utils.i0.s()) {
            this.S3 = false;
            if (!com.max.hbcommon.utils.c.x(this.f84267y2.getShow_luck_coupon())) {
                s9(true);
                v8(true);
            }
        }
        x60VarD.f117403c.setText(grouping_price.getDesc());
        x60VarD.f117406f.setText(com.max.xiaoheihe.module.game.r1.H(grouping_price.getPrice()));
        X7(x60VarD.f117405e);
        this.X = x60VarD.f117405e;
        this.Y = x60VarD.f117404d;
        X8();
        return x60VarD.b();
    }

    private void P8(String str, boolean z10) {
        View view;
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32759, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || (view = this.T) == null) {
            return;
        }
        GradientTextView gradientTextView = (GradientTextView) view.findViewById(R.id.tv_desc);
        ImageView imageView = (ImageView) this.T.findViewById(R.id.iv_img);
        ShineButton shineButton = (ShineButton) this.T.findViewById(R.id.shine_button);
        if (z10) {
            shineButton.setVisibility(0);
        } else {
            shineButton.setVisibility(4);
        }
        shineButton.setBtnFillColor(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color));
        if ("unfollowing".equals(str)) {
            shineButton.setChecked(false, z10);
            imageView.setImageResource(R.drawable.game_like_filled_24x24);
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            gradientTextView.setText(R.string.follow);
            gradientTextView.f68498j = false;
            gradientTextView.setTextColor(getResources().getColor(R.color.text_primary_2_color));
        } else {
            imageView.clearColorFilter();
            imageView.setImageResource(R.drawable.game_follow_gradient_red_30x30);
            shineButton.setChecked(true, z10);
            gradientTextView.setText(R.string.has_followed);
            gradientTextView.setColors(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color));
        }
        if (MMKV.mmkvWithID("improve_ab_test").decodeInt(ad.a.f1195b) > 3) {
            shineButton.setOnCheckStateChangeListener(new x0(new WeakReference(shineButton)));
        } else {
            shineButton.setOnCheckStateChangeListener(new y0(shineButton));
        }
        this.T.setOnClickListener(new a1(str));
    }

    private View Q7() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105196f, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.layout_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.layout_bottom_btn, viewInflate);
        View viewI = eVar.i(R.id.vg_btn);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        TextView textView3 = (TextView) eVar.i(R.id.tv_tag);
        TextView textView4 = (TextView) eVar.i(R.id.tv_after);
        textView2.setVisibility(8);
        imageView.setVisibility(8);
        textView4.setVisibility(8);
        GamePriceObj heybox_price = this.f84267y2.getHeybox_price();
        viewI.setBackground(com.max.hbutils.utils.q.o(this.mContext, R.color.text_primary_1_color_alpha10, 5.0f));
        textView4.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        textView.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        StringBuilder sb2 = new StringBuilder();
        if (GameObj.GAME_TYPE_CONSOLE.equals(this.f84210a0) || heybox_price == null) {
            sb2.append(getString(R.string.purchase));
            textView3.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.wallet_money_filled_24x24);
            imageView.setColorFilter(this.mContext.getResources().getColor(R.color.text_primary_1_color));
            int iF = ViewUtils.f(this.mContext, 10.0f);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iF, iF));
            ViewUtils.n0(imageView, 0, ViewUtils.f(this.mContext, 1.5f), ViewUtils.f(this.mContext, 1.0f), 0);
            if (heybox_price.getCoupon_info() == null || com.max.hbutils.utils.n.q(heybox_price.getCoupon_info().getMax_reduce()) <= 0) {
                String strF = com.max.xiaoheihe.module.game.r1.F(heybox_price.getCost_coin());
                textView.setText(com.max.xiaoheihe.utils.e0.d(String.format(getString(R.string.purchase_cost_rmb), strF), this.mContext.getResources().getColor(R.color.background_layer_2_color), 0, strF.length(), true, bb.d.a().b(1), null));
            } else {
                textView4.setVisibility(0);
                textView4.setText("券后");
                textView.setText(com.max.xiaoheihe.module.game.r1.F(String.valueOf(Math.max(0, com.max.hbutils.utils.n.q(heybox_price.getCost_coin()) - com.max.hbutils.utils.n.q(heybox_price.getCoupon_info().getMax_reduce())))));
                bb.d.d(textView, 1);
            }
            if (com.max.hbutils.utils.n.o(heybox_price.getDiscount()) > 0.0d) {
                textView3.setVisibility(0);
                textView3.setBackgroundDrawable(ViewUtils.l(ViewUtils.f(this.mContext, 34.0f), getResources().getColor(R.color.background_layer_3_color), com.max.xiaoheihe.module.game.r1.T(heybox_price.getDiscount(), true), bb.d.a().b(2), getResources().getDimensionPixelSize(R.dimen.text_size_10), getResources().getColor(R.color.text_primary_1_color), 0));
            } else {
                textView3.setVisibility(8);
            }
            z10 = true;
        }
        if (!z10) {
            textView.setText(sb2);
        }
        viewInflate.setOnClickListener(new d1());
        o8();
        return viewInflate;
    }

    private void Q8(String str, TextView textView, TextView textView2) {
        if (PatchProxy.proxy(new Object[]{str, textView, textView2}, this, changeQuickRedirect, false, 32709, new Class[]{String.class, TextView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.setText(com.max.xiaoheihe.module.game.r1.p(str));
        if (com.max.hbutils.utils.n.p(str) >= 10000.0f) {
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }

    static /* synthetic */ void R4(GameDetailFragment gameDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str}, null, changeQuickRedirect, true, 32855, new Class[]{GameDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.q9(str);
    }

    private View R7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32765, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.layout_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.layout_bottom_btn, viewInflate);
        View viewI = eVar.i(R.id.vg_btn);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        TextView textView3 = (TextView) eVar.i(R.id.tv_tag);
        imageView.setVisibility(8);
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        textView.setTextColor(getResources().getColor(R.color.white));
        textView.setText(R.string.purchase_in_progress);
        viewI.setBackgroundResource(R.drawable.btn_green_2dp);
        String order_id = this.f84267y2.getGameDetailsObj().getOrder_id();
        String order_type = this.f84267y2.getGameDetailsObj().getOrder_type();
        if (!com.max.hbcommon.utils.c.u(order_id)) {
            viewInflate.setOnClickListener(new b1(order_id, order_type));
        }
        return viewInflate;
    }

    private void R8(GameCommentsObj gameCommentsObj, int i10) {
        if (PatchProxy.proxy(new Object[]{gameCommentsObj, new Integer(i10)}, this, changeQuickRedirect, false, 32722, new Class[]{GameCommentsObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (gameCommentsObj != null && i10 == 0) {
            M9(gameCommentsObj.getFilters());
            I8(gameCommentsObj);
        }
        if (gameCommentsObj != null && gameCommentsObj.getLinks() != null) {
            if (this.G3 == 0) {
                this.K3.clear();
                int i11 = -1;
                for (int i12 = 0; i12 < gameCommentsObj.getLinks().size(); i12++) {
                    LinkInfoObj linkInfoObj = gameCommentsObj.getLinks().get(i12);
                    if (linkInfoObj.getSpecial_tag() == null || !"10".equals(linkInfoObj.getSpecial_tag().getId())) {
                        this.K3.add(linkInfoObj);
                    } else if (i11 == -1) {
                        this.K3.add(linkInfoObj);
                        i11 = i12;
                    } else {
                        this.K3.get(i11).getCustom_collapse_game_comments().add(linkInfoObj);
                    }
                }
            } else {
                this.K3.addAll(gameCommentsObj.getLinks());
            }
            if (com.max.hbcommon.utils.c.w(gameCommentsObj.getLinks())) {
                this.f84270z4.f109239o.b().setBackgroundResource(R.color.background_layer_2_color);
                this.f84270z4.f109239o.b().setVisibility(0);
                this.f84270z4.f109239o.f112012b.setVisibility(0);
            } else {
                this.f84270z4.f109239o.b().setVisibility(8);
            }
        }
        this.J3.notifyDataSetChanged();
        if (gameCommentsObj == null || this.G3 != 0) {
            return;
        }
        if (!this.f84241o4) {
            c9 c9Var = this.f84270z4;
            if (c9Var.f109226b.E0(c9Var.f109240p.b())) {
                c9 c9Var2 = this.f84270z4;
                c9Var2.f109226b.v0(c9Var2.f109240p.b());
            }
        }
        if (!this.f84241o4 || com.max.hbcommon.utils.c.u(this.f84239n4)) {
            return;
        }
        Activity activity = this.mContext;
        if (activity instanceof ChannelsDetailActivity) {
            ((ChannelsDetailActivity) activity).N1();
        }
        c9 c9Var3 = this.f84270z4;
        c9Var3.f109226b.y0(c9Var3.f109240p.b());
    }

    static /* synthetic */ boolean S5(GameDetailFragment gameDetailFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32829, new Class[]{GameDetailFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : gameDetailFragment.c8();
    }

    static /* synthetic */ void S6(GameDetailFragment gameDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str}, null, changeQuickRedirect, true, 32832, new Class[]{GameDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.F9(str);
    }

    private View S7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32761, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.layout_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.layout_bottom_btn, viewInflate);
        View viewI = eVar.i(R.id.vg_btn);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        TextView textView3 = (TextView) eVar.i(R.id.tv_tag);
        imageView.setVisibility(0);
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        imageView.setImageResource(R.drawable.common_selected_line_24x24);
        imageView.setColorFilter(getResources().getColor(R.color.text_secondary_2_color));
        textView.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
        textView.setText(R.string.own);
        viewI.setBackgroundResource(R.drawable.btn_divider_concept_2dp);
        return viewInflate;
    }

    private void S8() {
        LinearLayout linearLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32716, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        float f10 = 6.0f;
        float f11 = 1.0f;
        if ("1".equals(this.f84267y2.getIs_official())) {
            TextView tv_desc = this.A.getTv_desc();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tv_desc.getLayoutParams();
            marginLayoutParams.leftMargin = ViewUtils.f(this.mContext, 6.0f);
            tv_desc.setLayoutParams(marginLayoutParams);
            tv_desc.setPadding(ViewUtils.f(this.mContext, 4.0f), ViewUtils.f(this.mContext, 1.0f), ViewUtils.f(this.mContext, 4.0f), ViewUtils.f(this.mContext, 1.0f));
            tv_desc.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_10));
            tv_desc.setTextColor(this.mContext.getResources().getColor(R.color.white));
            Activity activity = this.mContext;
            tv_desc.setBackground(com.max.hbutils.utils.q.h(this.mContext, ViewUtils.h0(activity, ViewUtils.m(activity, 0, 0))));
            tv_desc.setText(getString(R.string.official_here));
            tv_desc.setVisibility(0);
        }
        String about_the_game = this.f84267y2.getAbout_the_game();
        if ((!this.f84267y2.isMobile() || com.max.hbcommon.utils.c.u(this.f84267y2.getMobileGameDetailsObj().getBundle_size()) || com.max.hbcommon.utils.c.u(this.f84267y2.getMobileGameDetailsObj().getVersion_num())) ? false : true) {
            about_the_game = getString(R.string.size) + " " + this.f84267y2.getMobileGameDetailsObj().getBundle_size() + "MB    " + getString(R.string.version) + " " + this.f84267y2.getMobileGameDetailsObj().getVersion_num() + "\n" + about_the_game;
        }
        this.H.setText(about_the_game);
        List<KeyDescObj> menu_v2 = this.f84267y2.getMenu_v2();
        if (menu_v2 == null || menu_v2.size() <= 0) {
            this.C.setVisibility(8);
        } else {
            this.C.setVisibility(0);
            this.C.removeAllViews();
            int i10 = 0;
            while (i10 < menu_v2.size()) {
                KeyDescObj keyDescObj = menu_v2.get(i10);
                if (i10 % 2 == 0) {
                    linearLayout = new LinearLayout(this.mContext);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = i10 == 0 ? 0 : ViewUtils.f(this.mContext, f10);
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(0);
                    this.C.addView(linearLayout);
                } else {
                    linearLayout = (LinearLayout) this.C.getChildAt(i10 / 2);
                }
                View viewInflate = this.mInflater.inflate(R.layout.item_game_menu_2, (ViewGroup) linearLayout, false);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                layoutParams2.width = 0;
                layoutParams2.weight = f11;
                viewInflate.setLayoutParams(layoutParams2);
                linearLayout.addView(viewInflate);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_value);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_copy);
                textView.setText(keyDescObj.getTitle());
                textView2.setText(keyDescObj.getValue());
                if ("developer".equals(keyDescObj.getType()) || "publisher".equals(keyDescObj.getType())) {
                    textView3.setVisibility(8);
                    textView2.setTextColor(this.mContext.getResources().getColor(R.color.click_blue));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(keyDescObj.getValue() + " " + lb.b.f131097m);
                    spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    textView2.setText(spannableStringBuilder);
                    textView2.setOnClickListener(new l(keyDescObj));
                } else if (GameListHeaderObj.KEY_STORE.equals(keyDescObj.getType())) {
                    textView3.setVisibility(8);
                    textView2.setTextColor(this.mContext.getResources().getColor(R.color.click_blue));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(keyDescObj.getValue() + " " + lb.b.f131097m);
                    spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    textView2.setText(spannableStringBuilder2);
                    textView2.setOnClickListener(new m(keyDescObj));
                } else if ("qq".equals(keyDescObj.getType())) {
                    textView3.setVisibility(0);
                    textView3.setOnClickListener(new n(keyDescObj));
                    textView2.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
                    textView2.setClickable(false);
                } else if ("homepage".equals(keyDescObj.getType())) {
                    textView3.setVisibility(8);
                    textView2.setTextColor(this.mContext.getResources().getColor(R.color.click_blue));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(keyDescObj.getValue() + " " + lb.b.f131097m);
                    spannableStringBuilder3.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                    textView2.setText(spannableStringBuilder3);
                    textView2.setOnClickListener(new o(keyDescObj));
                } else if ("mscore".equals(keyDescObj.getType())) {
                    textView3.setVisibility(8);
                    textView2.setTextColor(this.mContext.getResources().getColor(R.color.white));
                    textView2.setBackground(com.max.hbutils.utils.q.v(this.mContext, com.max.xiaoheihe.utils.d.e1(keyDescObj.getColor()), 0.0f));
                    textView2.setGravity(17);
                    textView2.getLayoutParams().width = ViewUtils.f(this.mContext, 16.0f);
                    textView2.getLayoutParams().height = ViewUtils.f(this.mContext, 15.0f);
                    textView2.setTextSize(1, "100".equals(keyDescObj.getValue()) ? 8.0f : 10.0f);
                    bb.d.d(textView2, 5);
                    textView2.setOnClickListener(new p(keyDescObj));
                } else {
                    textView3.setVisibility(8);
                    if (com.max.hbcommon.utils.c.u(keyDescObj.getProtocol())) {
                        textView2.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
                        textView2.setClickable(false);
                    } else {
                        textView2.setTextColor(this.mContext.getResources().getColor(R.color.click_blue));
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(keyDescObj.getValue() + " " + lb.b.f131097m);
                        spannableStringBuilder4.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        textView2.setText(spannableStringBuilder4);
                        textView2.setOnClickListener(new q(keyDescObj));
                    }
                }
                i10++;
                f10 = 6.0f;
                f11 = 1.0f;
            }
        }
        HardwarePerformance hardware_performance = this.f84267y2.getHardware_performance();
        if (hardware_performance == null || com.max.hbcommon.utils.c.w(hardware_performance.getSupport_system())) {
            this.D.setVisibility(8);
            this.E.setVisibility(0);
        } else {
            this.D.setVisibility(0);
            this.E.setVisibility(8);
            com.max.xiaoheihe.module.game.m.f87809a.e(this.mContext, hardware_performance, this.D);
        }
        if (this.f84267y2.getDeveloper_words() != null) {
            this.F.setVisibility(0);
            this.F.setOnClickListener(new r());
            long jR = com.max.hbutils.utils.n.r(this.f84267y2.getDeveloper_words().getTime());
            if (jR > com.max.hbutils.utils.n.r(com.max.hbcache.c.o("developer_words", ""))) {
                this.G.setVisibility(0);
                com.max.hbcache.c.C("developer_words", jR + "");
            } else {
                this.G.setVisibility(8);
            }
        } else {
            this.F.setVisibility(8);
        }
        this.A4.f113864d.setOnClickListener(new s());
        this.f84229i4.clear();
        if (this.f84267y2.getGameAward() != null) {
            this.f84229i4.addAll(this.f84267y2.getGameAward());
            if (this.f84229i4.size() > 0) {
                this.f84227h4.notifyDataSetChanged();
                this.B.setVisibility(0);
            }
        }
    }

    private View T7(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32762, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.item_single_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        int iF = ViewUtils.f(this.mContext, i10);
        if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(iF);
            viewInflate.setLayoutParams(layoutParams);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_desc);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        textView.setText(R.string.own);
        textView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_2_color));
        imageView.setImageResource(R.drawable.common_selected_line_24x24);
        imageView.setColorFilter(this.mContext.getResources().getColor(R.color.text_secondary_2_color));
        return viewInflate;
    }

    private void T8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32708, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84249r.setText(this.f84267y2.getName());
        if (com.max.hbcommon.utils.c.u(this.f84267y2.getName()) || com.max.xiaoheihe.utils.d.q0(this.f84267y2.getName()) <= 30) {
            this.f84249r.setTextSize(1, 18.0f);
        } else {
            this.f84249r.setTextSize(1, 13.0f);
        }
        this.f84249r.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88210b.i8(view);
            }
        });
        if (this.f84267y2.isMobile()) {
            this.f84247q.setVisibility(0);
            com.max.hbimage.b.K(this.f84267y2.getMobileGameDetailsObj().getAppicon(), this.f84247q);
            final String short_desc = this.f84267y2.getMobileGameDetailsObj().getShort_desc();
            if (com.max.hbcommon.utils.c.u(short_desc)) {
                this.f84251s.setVisibility(8);
                ((ViewGroup) this.f84251s.getParent()).setOnClickListener(null);
            } else {
                this.f84251s.setVisibility(0);
                this.f84251s.setText(short_desc);
                this.f84251s.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88332b.j8(short_desc, view);
                    }
                });
                ((ViewGroup) this.f84251s.getParent()).setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88335b.k8(view);
                    }
                });
            }
        } else {
            this.f84247q.setVisibility(8);
            if (com.max.hbcommon.utils.c.u(this.f84267y2.getGameDetailsObj().getName_en())) {
                this.f84251s.setVisibility(8);
                ((ViewGroup) this.f84251s.getParent()).setOnClickListener(null);
            } else {
                this.f84251s.setVisibility(0);
                this.f84251s.setText(this.f84267y2.getGameDetailsObj().getName_en());
                this.f84251s.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88396b.l8(view);
                    }
                });
                ((ViewGroup) this.f84251s.getParent()).setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88398b.m8(view);
                    }
                });
            }
        }
        String score_desc = this.f84267y2.getScore_desc();
        String score = this.f84267y2.getScore();
        String expect_num = this.f84267y2.getComment_stats() != null ? this.f84267y2.getComment_stats().getExpect_num() : null;
        String score_comment = this.f84267y2.getComment_stats() != null ? this.f84267y2.getComment_stats().getScore_comment() : null;
        String follow_num = this.f84267y2.getFollow_num();
        Activity activity = this.mContext;
        int iM = ViewUtils.m(activity, ViewUtils.f(activity, 63.0f), ViewUtils.f(this.mContext, 48.0f));
        if (com.max.hbutils.utils.n.p(score) > 0.0f || com.max.hbutils.utils.n.q(follow_num) <= 0) {
            this.f84253t.setRadius(iM);
            this.f84253t.setVisibility(0);
            this.f84255u.setVisibility(8);
            com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.activity_game_details, this.f84253t);
            com.max.xiaoheihe.module.game.r1.R1(eVar, score_desc, score, expect_num, score_comment);
            TextView textView = (TextView) eVar.i(R.id.tv_score);
            if (!TextUtils.isEmpty(score_desc) && TextUtils.isEmpty(follow_num)) {
                this.f84253t.setPadding(ViewUtils.f(this.mContext, 12.0f), 0, ViewUtils.f(this.mContext, 12.0f), 0);
                textView.setPadding(0, 0, 0, 0);
                textView.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            } else if (!TextUtils.isEmpty(score) && TextUtils.isEmpty(follow_num)) {
                this.f84253t.setPadding(ViewUtils.f(this.mContext, 3.0f), 0, ViewUtils.f(this.mContext, 8.0f), 0);
                textView.setPadding(ViewUtils.f(this.mContext, 1.0f), 0, 0, 0);
                textView.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_22));
            }
            this.f84253t.setOnClickListener(new h());
        } else {
            this.f84255u.setVisibility(0);
            this.f84255u.setRadius(iM);
            this.f84253t.setVisibility(8);
            View viewFindViewById = this.f84255u.findViewById(R.id.vg_follow_btn);
            this.f84255u.setCardBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
            viewFindViewById.setBackgroundResource(R.color.background_card_1_color);
            O8(this.f84267y2.getFollow_state_v2());
        }
        J8();
        m9();
        if (this.f84267y2.isMobile()) {
            W8(this.f84267y2.getMobileGameDetailsObj().getGame_data(), 3);
        } else {
            W8(this.f84267y2.getUser_num() != null ? this.f84267y2.getUser_num().getGame_data() : null, 4);
        }
        S8();
        com.max.xiaoheihe.module.game.m mVar = com.max.xiaoheihe.module.game.m.f87809a;
        Activity activity2 = this.mContext;
        nk nkVar = this.A4;
        mVar.b(activity2, nkVar.f113902w, nkVar.W, this.f84267y2, this.Z);
        nk nkVar2 = this.A4;
        mVar.a(nkVar2.f113890q, nkVar2.R, this.f84267y2);
        this.C4 = new com.max.xiaoheihe.module.game.adapter.v(this, this.A4.O);
        N8();
        mVar.d(this.A4.getRoot(), this.f84267y2);
        k9();
        Z8();
        e9();
        d9();
        this.J3.notifyDataSetChanged();
    }

    private View U7(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32750, new Class[]{Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (this.f84267y2.getBottom_btn() == null) {
            return null;
        }
        BaseBottomButton baseBottomButton = new BaseBottomButton(this.mContext);
        b9(baseBottomButton, this.f84267y2.getBottom_btn(), z10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 170.0f), -2);
        layoutParams.weight = 1.0f;
        baseBottomButton.setLayoutParams(layoutParams);
        return baseBottomButton;
    }

    private void U8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32695, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j9();
        a9();
        T8();
    }

    static /* synthetic */ void V3(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32826, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.o9();
    }

    private View V7(@androidx.annotation.n0 TypedButtonObj typedButtonObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typedButtonObj}, this, changeQuickRedirect, false, 32752, new Class[]{TypedButtonObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        BaseBottomButton baseBottomButton = new BaseBottomButton(this.mContext);
        c9(baseBottomButton, typedButtonObj);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 170.0f), -2);
        layoutParams.weight = 1.0f;
        baseBottomButton.setLayoutParams(layoutParams);
        return baseBottomButton;
    }

    private void V8() {
        boolean z10;
        boolean z11;
        Resources resources;
        int i10;
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32707, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84236m.setTextSize(1, 28.0f);
        bb.d.d(this.f84236m, 1);
        int iQ = com.max.hbutils.utils.n.q(this.f84267y2.getPrice().getDiscount());
        com.max.hbutils.utils.n.p(this.f84267y2.getPrice().getCurrent());
        com.max.hbutils.utils.n.p(this.f84267y2.getPrice().getLowest_price());
        if (com.max.hbcommon.utils.c.u(this.f84267y2.getPrice_placeholder())) {
            this.O.setVisibility(0);
            this.f84236m.setText(this.f84267y2.getPrice().getCurrent());
        } else {
            C9();
        }
        boolean z12 = this.f84267y2.getHeybox_price() != null && this.f84267y2.getHeybox_price().isSuper_lowest();
        if ("1".equals(this.f84267y2.getPrice().getIs_lowest())) {
            if (com.max.hbcommon.utils.c.u(this.f84267y2.getPrice().getRegion_name())) {
                str = "";
            } else {
                str = this.f84267y2.getPrice().getRegion_name() + " ";
            }
            if ("1".equals(this.f84267y2.getPrice().getNew_lowest())) {
                this.f84238n.setText(str + getString(R.string.new_lowest_price_in_history_desc));
                z10 = true;
            } else {
                this.f84238n.setText(str + getString(R.string.lowest_price_in_history_desc));
                z10 = false;
            }
            this.f84238n.setVisibility(0);
            z11 = true;
        } else {
            this.f84238n.setVisibility(8);
            z10 = false;
            z11 = false;
        }
        if (z12) {
            this.f84232k.setBackgroundResource(R.color.super_cost_green);
            this.f84234l.setBackground(com.max.xiaoheihe.utils.d.X(R.drawable.gradient_super_cost_green));
        } else if (z10) {
            this.f84232k.setBackgroundResource(R.color.emerald_green);
            this.f84234l.setBackground(com.max.xiaoheihe.utils.d.X(R.drawable.gradient_lowest_discount));
        } else {
            this.f84232k.setBackgroundResource(R.color.text_primary_1_color_alpha90);
            this.f84234l.setBackground(com.max.xiaoheihe.utils.d.X(R.drawable.gradient_no_discount));
        }
        if (iQ > 0) {
            this.f84240o.setVisibility(0);
            this.f84240o.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.drawable.white_alpha10_2dp));
            TextView textView = (TextView) this.f84240o.findViewById(R.id.tv_discount);
            TextView textView2 = (TextView) this.f84240o.findViewById(R.id.tv_current_price);
            TextView textView3 = (TextView) this.f84240o.findViewById(R.id.tv_original_price);
            TextView textView4 = (TextView) this.f84232k.findViewById(R.id.tv_deadline_date);
            bb.d.d(textView, 2);
            textView.setPadding(ViewUtils.f(this.mContext, 6.0f), ViewUtils.f(this.mContext, 1.0f), ViewUtils.f(this.mContext, 3.0f), ViewUtils.f(this.mContext, 1.0f));
            textView.setText(String.format("-%s%%", this.f84267y2.getPrice().getDiscount()));
            int iF = ViewUtils.f(this.mContext, 2.0f);
            if (!z11 || z10 || z12) {
                resources = this.mContext.getResources();
                i10 = R.color.white_alpha30;
            } else {
                resources = this.mContext.getResources();
                i10 = R.color.lowest_discount_color;
            }
            int color = resources.getColor(i10);
            float f10 = iF;
            textView.setBackgroundDrawable(ViewUtils.I(new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10}, color, color));
            textView.setVisibility(0);
            textView2.setVisibility(8);
            if (TextUtils.isEmpty(this.f84267y2.getPrice().getInitial())) {
                textView3.setVisibility(8);
            } else {
                SpannableString spannableString = new SpannableString(String.format("￥%s", this.f84267y2.getPrice().getInitial()));
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                textView3.setText(spannableString);
                textView3.setTextColor(this.mContext.getResources().getColor(R.color.white));
                textView3.setPadding(ViewUtils.f(this.mContext, 2.0f), ViewUtils.f(this.mContext, 1.0f), ViewUtils.f(this.mContext, 2.0f), ViewUtils.f(this.mContext, 1.0f));
                textView3.setVisibility(0);
            }
            if (com.max.hbcommon.utils.c.u(this.f84267y2.getPrice().getDeadline_date())) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_10));
                textView4.setTextColor(this.mContext.getResources().getColor(R.color.white));
                textView4.setText(this.f84267y2.getPrice().getDeadline_date());
                textView4.setVisibility(0);
            }
        } else {
            this.f84240o.setVisibility(8);
        }
        this.P.removeAllViews();
        if (com.max.hbcommon.utils.c.w(this.f84267y2.getPrice().getPrice_tips())) {
            return;
        }
        Iterator<RichAttributeModelObj> it = this.f84267y2.getPrice().getPrice_tips().iterator();
        while (it.hasNext()) {
            this.P.addView(com.max.xiaoheihe.module.game.r1.s0(this.mContext, it.next()));
        }
    }

    static /* synthetic */ void W3(GameDetailFragment gameDetailFragment, int i10, boolean z10, boolean z11) {
        Object[] objArr = {gameDetailFragment, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 32827, new Class[]{GameDetailFragment.class, Integer.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.y8(i10, z10, z11);
    }

    private View W7() {
        boolean z10;
        boolean z11;
        boolean z12;
        int color;
        boolean z13 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32767, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.layout_bottom_btn, (ViewGroup) this.f84270z4.f109228d, false);
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.layout_bottom_btn, viewInflate);
        View viewI = eVar.i(R.id.vg_btn);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        TextView textView3 = (TextView) eVar.i(R.id.tv_tag);
        TextView textView4 = (TextView) eVar.i(R.id.tv_after);
        textView2.setVisibility(8);
        imageView.setVisibility(8);
        textView4.setVisibility(8);
        GamePriceObj heybox_price = this.f84267y2.getHeybox_price();
        if (heybox_price != null && heybox_price.isSuper_lowest()) {
            z11 = false;
            z10 = true;
        } else if (heybox_price != null && "1".equals(heybox_price.getIs_lowest()) && "1".equals(heybox_price.getNew_lowest())) {
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        if (z10) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, ViewUtils.i(0, com.max.xiaoheihe.utils.d.I(0.8f, com.max.xiaoheihe.utils.d.E(R.color.super_cost_green_left)), com.max.xiaoheihe.utils.d.I(0.8f, com.max.xiaoheihe.utils.d.E(R.color.super_cost_green_Right))));
            stateListDrawable.addState(new int[0], ViewUtils.i(0, com.max.xiaoheihe.utils.d.E(R.color.super_cost_green_left), com.max.xiaoheihe.utils.d.E(R.color.super_cost_green_Right)));
            viewI.setBackground(stateListDrawable);
        } else if (z11) {
            viewI.setBackground(com.max.hbutils.utils.q.c(this.mContext, R.color.lowest_discount_color, R.color.lowest_discount_color_alpha80, 0.0f));
        } else {
            viewI.setBackgroundResource(R.drawable.btn_primary_2dp);
        }
        textView.setTextColor(getResources().getColor(R.color.background_layer_2_color));
        StringBuilder sb2 = new StringBuilder();
        if (GameObj.GAME_TYPE_CONSOLE.equals(this.f84210a0) || heybox_price == null) {
            sb2.append(getString(R.string.purchase));
            textView3.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.wallet_money_filled_24x24);
            imageView.setColorFilter(this.mContext.getResources().getColor(R.color.background_layer_2_color));
            int iF = ViewUtils.f(this.mContext, 10.0f);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iF, iF));
            ViewUtils.n0(imageView, 0, ViewUtils.f(this.mContext, 1.5f), ViewUtils.f(this.mContext, 1.0f), 0);
            if (heybox_price.getCoupon_info() == null || com.max.hbutils.utils.n.q(heybox_price.getCoupon_info().getMax_reduce()) <= 0) {
                String strF = com.max.xiaoheihe.module.game.r1.F(heybox_price.getCost_coin());
                textView.setText(com.max.xiaoheihe.utils.e0.d(String.format(getString(R.string.purchase_cost_rmb), strF), this.mContext.getResources().getColor(R.color.background_layer_2_color), 0, strF.length(), true, bb.d.a().b(1), null));
            } else {
                textView4.setVisibility(0);
                textView4.setText("券后");
                textView.setText(com.max.xiaoheihe.module.game.r1.F(String.valueOf(Math.max(0, com.max.hbutils.utils.n.q(heybox_price.getCost_coin()) - com.max.hbutils.utils.n.q(heybox_price.getCoupon_info().getMax_reduce())))));
                bb.d.d(textView, 1);
            }
            if (com.max.hbutils.utils.n.o(heybox_price.getDiscount()) > 0.0d) {
                textView3.setVisibility(0);
                if (z10) {
                    color = getResources().getColor(R.color.super_cost_green);
                } else {
                    color = z11 ? getResources().getColor(R.color.lowest_discount_color) : getResources().getColor(R.color.text_primary_1_color);
                }
                z12 = true;
                textView3.setBackgroundDrawable(ViewUtils.l(ViewUtils.f(this.mContext, 34.0f), getResources().getColor(R.color.background_layer_3_color), com.max.xiaoheihe.module.game.r1.T(heybox_price.getDiscount(), true), bb.d.a().b(2), getResources().getDimensionPixelSize(R.dimen.text_size_10), color, 0));
            } else {
                z12 = true;
                textView3.setVisibility(8);
            }
            z13 = z12;
        }
        if (!z13) {
            textView.setText(sb2);
        }
        viewInflate.setOnClickListener(new c1());
        o8();
        return viewInflate;
    }

    private void W8(List<GameDetailDataObj> list, int i10) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{list, new Integer(i10)}, this, changeQuickRedirect, false, 32715, new Class[]{List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || list.size() <= 0) {
            this.f84261x.setVisibility(8);
            return;
        }
        Iterator<GameDetailDataObj> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = true;
                break;
            }
            GameDetailDataObj next = it.next();
            if (!"N/A".equals(next.getValue()) || (next.getPeak_values() != null && next.getPeak_values().size() > 0)) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            this.f84261x.setVisibility(8);
            return;
        }
        ViewUtils.f(this.mContext, 2.0f);
        if (this.f84267y2 == null) {
            this.f84261x.setVisibility(8);
            return;
        }
        this.f84261x.setVisibility(0);
        if (list.size() > 0) {
            this.f84265y.setLayoutManager(new GridLayoutManager(this.mContext, i10));
            if (this.f84265y.getItemDecorationCount() == 0) {
                this.f84265y.addItemDecoration(new fc.b(i10, ViewUtils.f(this.mContext, 4.0f), false));
            }
            this.f84265y.setAdapter(new com.max.xiaoheihe.module.game.adapter.r(this.mContext, list));
        }
        if (this.f84267y2.isMobile() || GameObj.GAME_TYPE_CONSOLE.equals(this.f84210a0) || com.max.xiaoheihe.module.game.adapter.b.f85645g.equalsIgnoreCase(this.f84267y2.getType())) {
            this.f84269z.setVisibility(8);
            return;
        }
        this.f84269z.setVisibility(0);
        bb.d.d(this.f84269z, 0);
        this.f84269z.setText(String.format("%s %s", getString(R.string.view_user_gane_data), lb.b.f131097m));
        this.f84269z.setOnClickListener(new j());
    }

    private void X7(TickerView tickerView) {
        if (PatchProxy.proxy(new Object[]{tickerView}, this, changeQuickRedirect, false, 32748, new Class[]{TickerView.class}, Void.TYPE).isSupported) {
            return;
        }
        tickerView.setTextColor(this.mContext.getResources().getColor(R.color.white));
        tickerView.setTextSize(ViewUtils.f(this.mContext, 11.0f));
        tickerView.setTypeface(bb.d.a().b(2));
        tickerView.setAnimationDuration(500L);
        tickerView.setAnimationInterpolator(new DecelerateInterpolator());
        tickerView.setGravity(androidx.core.view.n.f21701b);
        tickerView.setPreferredScrollingDirection(TickerView.ScrollingDirection.DOWN);
        tickerView.setTickerTimeFormat(TickerUtils.TickerTimeFormat.FORMAT_HMS_SEPARATE_BY_SEMICOLON);
    }

    private void X8() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32749, new Class[0], Void.TYPE).isSupported && isActive() && this.X != null && r7()) {
            long jR = com.max.hbutils.utils.n.r(this.f84267y2.getGrouping_price().getDeadline_timestamp()) * 1000;
            long jCurrentTimeMillis = jR - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                this.X.setText("00:00:00");
                this.G3 = 0;
                a2 a2Var = this.T3;
                if (a2Var != null) {
                    a2Var.Z(true, this.f84244p2, this.Z);
                    return;
                }
                return;
            }
            long j10 = jCurrentTimeMillis / 86400000;
            if (j10 > 0) {
                this.Y.setVisibility(0);
                this.Y.setText(j10 + "天");
            } else {
                this.Y.setVisibility(8);
            }
            this.X.setText(com.max.hbutils.utils.w.m(this.mContext, jR - (j10 * 86400000), false));
            this.f84233k4.sendEmptyMessageDelayed(3, 1000L);
        }
    }

    private void Y7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32798, new Class[0], Void.TYPE).isSupported || this.mContentView.findViewById(R.id.tv_purchase_protected) == null) {
            return;
        }
        TextView textView = (TextView) this.mContentView.findViewById(R.id.tv_purchase_protected);
        if (!"1".equals(com.max.hbcache.c.o("display_purchase_guarantee", "0")) || this.f84267y2.isMobile() || this.f84267y2.getGameDetailsObj() == null || !s7()) {
            textView.setVisibility(8);
            return;
        }
        com.max.hbcommon.utils.d.b("user_guide", "protected");
        Drawable drawable = getResources().getDrawable(R.drawable.ic_purchase_protect);
        drawable.setBounds(0, 0, ViewUtils.f(this.mContext, 12.0f), ViewUtils.f(this.mContext, 14.0f));
        textView.setVisibility(0);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setOnClickListener(new o1());
        new Handler().postDelayed(new p1(textView), 5000L);
    }

    private void Y8(com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 32727, new Class[]{com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        String comment_state = this.f84267y2.getComment_state();
        boolean z10 = this.f84267y2.getUser_comment() != null;
        GameGradeCommentCardView gameGradeCommentCardView = (GameGradeCommentCardView) eVar.i(R.id.vg_add_grade);
        this.U = gameGradeCommentCardView;
        gameGradeCommentCardView.setGameDetail(this.f84267y2);
        this.U.setGameType(this.f84210a0);
        this.U.setPlatform(this.f84244p2);
        this.U.setGameId(this.Z);
        this.U.setFragmentRef(new WeakReference<>(this));
        this.U.setCommented(z10);
        this.U.setAvatar(com.max.xiaoheihe.utils.i0.i().getAccount_detail().getAvartar());
        if (z10) {
            this.U.setGrade((int) com.max.hbutils.utils.n.p(this.f84267y2.getUser_comment().getScore()));
            this.U.setVisibility(8);
        } else {
            int iQ = com.max.hbutils.utils.n.q(this.f84267y2.getImpression_score());
            this.U.setGrade(iQ);
            this.U.setVisibility(0);
            if (iQ > 0) {
                this.U.setCommentHint(com.max.xiaoheihe.utils.d.n0(R.string.game_rating_hint));
            }
        }
        if (comment_state != null) {
            switch (comment_state) {
                case "0":
                    if (z10) {
                        if (!"14".equals(this.f84267y2.getUser_comment().getLink_tag())) {
                            this.U.setStyle(GameGradeCommentCardView.TYPE.STEAM_OWNED);
                        } else {
                            this.U.setStyle(GameGradeCommentCardView.TYPE.STEAM_UNOWNED);
                        }
                        break;
                    } else {
                        this.U.setStyle(GameGradeCommentCardView.TYPE.NOT_STEAM);
                        break;
                    }
                    break;
                case "1":
                    this.U.setStyle(GameGradeCommentCardView.TYPE.STEAM_OWNED);
                    break;
                case "2":
                    this.U.setStyle(GameGradeCommentCardView.TYPE.STEAM_UNOWNED);
                    break;
            }
        } else if (!z10) {
            this.U.setStyle(GameGradeCommentCardView.TYPE.NOT_STEAM);
        } else if ("14".equals(this.f84267y2.getUser_comment().getLink_tag())) {
            this.U.setStyle(GameGradeCommentCardView.TYPE.STEAM_UNOWNED);
        } else {
            this.U.setStyle(GameGradeCommentCardView.TYPE.STEAM_OWNED);
        }
        this.U.getChildAt(0).setBackground(com.max.hbutils.utils.q.O(com.max.hbutils.utils.q.o(this.mContext, R.color.divider_secondary_2_color, 5.0f), this.mContext, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color), 0.5f));
        ((ViewGroup) eVar.i(R.id.vg_game_impression)).setVisibility(8);
    }

    static /* synthetic */ void Z5(GameDetailFragment gameDetailFragment, int i10, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {gameDetailFragment, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 32830, new Class[]{GameDetailFragment.class, Integer.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.z8(i10, z10, z11, z12);
    }

    private void Z7(TickerView tickerView) {
        if (PatchProxy.proxy(new Object[]{tickerView}, this, changeQuickRedirect, false, 32778, new Class[]{TickerView.class}, Void.TYPE).isSupported) {
            return;
        }
        tickerView.setCharacterLists(TickerUtils.b());
        tickerView.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
        tickerView.setTextSize(ViewUtils.f(this.mContext, 16.0f));
        tickerView.setTypeface(bb.d.a().b(1));
        tickerView.setAnimationDuration(500L);
        tickerView.setAnimationInterpolator(new DecelerateInterpolator());
        tickerView.setGravity(androidx.core.view.n.f21701b);
        tickerView.setPreferredScrollingDirection(TickerView.ScrollingDirection.DOWN);
        tickerView.setTickerTimeFormat(TickerUtils.TickerTimeFormat.FORMAT_HMS_SEPARATE_BY_SEMICOLON);
    }

    private void Z8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32717, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GamePreviewInfoObj preview_info = this.f84267y2.getPreview_info();
        if (preview_info == null) {
            this.A4.f113866e.setVisibility(8);
            this.A4.U.setVisibility(8);
            return;
        }
        this.A4.f113866e.setVisibility(0);
        this.A4.U.setVisibility(0);
        TextView textView = (TextView) this.A4.f113866e.findViewById(R.id.tv_requirements_faq);
        ImageView imageView = (ImageView) this.A4.f113866e.findViewById(R.id.iv_requirements_faq);
        LinearLayout linearLayout = (LinearLayout) this.A4.f113866e.findViewById(R.id.ll_requirements);
        t tVar = new t(preview_info);
        textView.setOnClickListener(tVar);
        imageView.setOnClickListener(tVar);
        if (com.max.hbcommon.utils.c.w(preview_info.getRequirements())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.removeAllViews();
        linearLayout.setVisibility(0);
        for (GamePreviewRequirementObj gamePreviewRequirementObj : preview_info.getRequirements()) {
            View viewInflate = this.mInflater.inflate(R.layout.item_game_preview_requirement, (ViewGroup) linearLayout, false);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_requirement_state);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_requirement);
            String type = gamePreviewRequirementObj.getType();
            String state = gamePreviewRequirementObj.getState();
            if ("1".equals(gamePreviewRequirementObj.getState())) {
                imageView2.setImageResource(R.drawable.account_cb_checked_16_16x16);
                textView2.setText(gamePreviewRequirementObj.getDesc());
            } else {
                imageView2.setImageResource(R.drawable.common_cb_failed);
                if ("bind".equals(type)) {
                    SpannableString spannableString = new SpannableString(gamePreviewRequirementObj.getDesc() + " 去完成");
                    spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.click_blue)), spannableString.length() + (-3), spannableString.length(), 33);
                    textView2.setText(spannableString);
                    viewInflate.setOnClickListener(new u(state));
                } else {
                    textView2.setText(gamePreviewRequirementObj.getDesc());
                }
            }
            linearLayout.addView(viewInflate);
        }
    }

    static /* synthetic */ void a5(GameDetailFragment gameDetailFragment, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str, str2, str3, str4, str5, str6, str7, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32856, new Class[]{GameDetailFragment.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.u8(str, str2, str3, str4, str5, str6, str7, z10);
    }

    static /* synthetic */ void a6(GameDetailFragment gameDetailFragment, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32839, new Class[]{GameDetailFragment.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.x8(i10, z10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void a8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32685, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BasicTopPanel basicTopPanel = new BasicTopPanel(this.mContext);
        BasicCenterPanel basicCenterPanel = new BasicCenterPanel(this.mContext);
        BasicBottomPanel basicBottomPanel = new BasicBottomPanel(this.mContext);
        basicTopPanel.setBackwardAction(new a());
        TopMuteAction topMuteAction = new TopMuteAction();
        topMuteAction.a(this.mContext);
        topMuteAction.g(this.mContext, this.f84215c.getMuteState());
        topMuteAction.k(new ze.a() { // from class: com.max.xiaoheihe.module.game.o
            @Override // ze.a
            public final void a(boolean z10) {
                this.f87845a.f8(z10);
            }
        });
        basicTopPanel.b(topMuteAction);
        basicBottomPanel.setFullScreenAction(new ze.a() { // from class: com.max.xiaoheihe.module.game.p
            @Override // ze.a
            public final void a(boolean z10) {
                this.f87965a.g8(z10);
            }
        });
        this.f84218d.m(basicTopPanel).k(basicCenterPanel).q(basicBottomPanel);
        this.f84218d.getCoverView().setOnClickListener(new b());
        this.f84218d.setOrientationChangeListener(new c());
    }

    private void a9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32704, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Q.setVisibility(0);
        this.R.setVisibility(8);
        if (this.f84267y2.getPrice_rich_text() != null) {
            this.Q.setVisibility(8);
            this.R.setVisibility(0);
            this.R.setRichStackData(this.f84267y2.getPrice_rich_text());
            if (this.f84267y2.getScreen_shot_bg_color() != null) {
                this.f84234l.setBackground(ViewUtils.x(0, com.max.xiaoheihe.utils.d.e1(this.f84267y2.getScreen_shot_bg_color().getStart_color()), com.max.xiaoheihe.utils.d.e1(this.f84267y2.getScreen_shot_bg_color().getEnd_color())));
            } else {
                this.f84234l.setBackground(com.max.xiaoheihe.utils.d.X(R.drawable.gradient_no_discount));
            }
            if (this.f84267y2.getPrice_bg_color() != null) {
                this.f84234l.setBackground(ViewUtils.x(0, com.max.xiaoheihe.utils.d.e1(this.f84267y2.getPrice_bg_color().getStart_color()), com.max.xiaoheihe.utils.d.e1(this.f84267y2.getPrice_bg_color().getEnd_color())));
            } else {
                this.f84232k.setBackgroundResource(R.color.text_primary_1_color_alpha90);
            }
        } else if (this.f84267y2.isMobile()) {
            if (this.f84267y2.getPrice() != null) {
                V8();
            } else {
                this.f84234l.setVisibility(8);
            }
        } else if (this.f84267y2.isIs_free()) {
            this.f84234l.setVisibility(8);
        } else if (this.f84267y2.getPrice() != null) {
            V8();
        } else {
            C9();
        }
        if (this.f84267y2.isMobile()) {
            u9(false);
        } else {
            u9(this.f84267y2.getPrice() != null || com.max.hbcommon.utils.c.x(this.f84267y2.getIs_show_all_price()));
        }
    }

    private void b8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32686, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mContext.setRequestedOrientation(1);
        this.f84218d = new PlainVideoUI(this.mContext);
        a8();
        this.f84215c.o(new com.max.video.impl.f(this.mContext)).p(this.f84218d).n(getViewLifecycleOwner()).s(this.mContext);
        this.f84215c.H();
        this.f84215c.setPlaybackStateChangeListener(new xe.a() { // from class: com.max.xiaoheihe.module.game.w
            @Override // xe.a
            public final void a(PlaybackState playbackState) {
                this.f88526a.h8(playbackState);
            }
        });
    }

    private void b9(BaseBottomButton baseBottomButton, ButtonObj buttonObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{baseBottomButton, buttonObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32751, new Class[]{BaseBottomButton.class, ButtonObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            if (com.max.hbcommon.utils.c.u(buttonObj.getImg())) {
                baseBottomButton.f67215m.setVisibility(8);
            } else {
                baseBottomButton.f67215m.setVisibility(0);
                com.max.hbimage.b.K(buttonObj.getImg(), baseBottomButton.f67215m);
            }
            int iG = !com.max.hbcommon.utils.c.u(buttonObj.getText_color()) ? com.max.hbutils.utils.a.g(buttonObj.getText_color()) : com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color);
            int iG2 = !com.max.hbcommon.utils.c.u(buttonObj.getBg_color()) ? com.max.hbutils.utils.a.g(buttonObj.getBg_color()) : com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color);
            baseBottomButton.f67215m.setColorFilter(iG);
            baseBottomButton.f67213k.setTextColor(iG);
            baseBottomButton.f67214l.setBackgroundColor(iG2);
        } else {
            baseBottomButton.f67215m.setVisibility(8);
            baseBottomButton.setButtonStyle(BaseBottomButton.BaseBottomButtonStyle.GrayBlack);
        }
        baseBottomButton.f67213k.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        baseBottomButton.setRadius(ViewUtils.f(this.mContext, 5.0f));
        baseBottomButton.setText(buttonObj.getTitle());
        baseBottomButton.setOnClickListener(new r0(buttonObj));
    }

    private boolean c8() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32696, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return com.max.hbcommon.utils.i.e(this.mContext) || this.f84250r4;
    }

    private void c9(@androidx.annotation.n0 BaseBottomButton baseBottomButton, @androidx.annotation.n0 final TypedButtonObj typedButtonObj) {
        if (PatchProxy.proxy(new Object[]{baseBottomButton, typedButtonObj}, this, changeQuickRedirect, false, 32753, new Class[]{BaseBottomButton.class, TypedButtonObj.class}, Void.TYPE).isSupported) {
            return;
        }
        int iG = !com.max.hbcommon.utils.c.u(typedButtonObj.getTextColor()) ? com.max.hbutils.utils.a.g(typedButtonObj.getTextColor()) : com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color);
        if (com.max.hbcommon.utils.c.u(typedButtonObj.getImg())) {
            baseBottomButton.f67215m.setVisibility(8);
        } else {
            baseBottomButton.f67215m.setVisibility(0);
            com.max.hbimage.b.K(typedButtonObj.getImg(), baseBottomButton.f67215m);
        }
        baseBottomButton.f67215m.setColorFilter(iG);
        int iF = ViewUtils.f(this.mContext, 5.0f);
        baseBottomButton.f67213k.setTextColor(iG);
        baseBottomButton.f67213k.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        baseBottomButton.setRadius(iF);
        baseBottomButton.setText(typedButtonObj.getTitle());
        baseBottomButton.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88206b.n8(typedButtonObj, view);
            }
        });
        GradientColorObj bgColor = typedButtonObj.getBgColor();
        if (bgColor == null || com.max.hbcommon.utils.c.u(bgColor.getStart_color()) || com.max.hbcommon.utils.c.u(bgColor.getEnd_color())) {
            baseBottomButton.f67214l.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        } else {
            baseBottomButton.f67214l.setBackground(com.max.hbutils.utils.q.k(this.mContext, com.max.hbutils.utils.a.g(bgColor.getStart_color()), com.max.hbutils.utils.a.g(bgColor.getEnd_color()), com.max.xiaoheihe.accelworld.f.c(bgColor.getDirection()), new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}));
        }
    }

    static /* synthetic */ void d6(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32840, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.B9();
    }

    private boolean d8() {
        RecyclerView recyclerView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32803, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.J3 == null || (recyclerView = this.f84270z4.f109230f) == null) {
            return false;
        }
        return ViewUtils.f0(recyclerView);
    }

    private void d9() {
        GameDetailsWrapperObj gameDetailsWrapperObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32711, new Class[0], Void.TYPE).isSupported || (gameDetailsWrapperObj = this.f84267y2) == null || this.J3 == null) {
            return;
        }
        if (gameDetailsWrapperObj.getTopic_detail() == null) {
            this.f84270z4.f109242r.b().setVisibility(8);
            return;
        }
        this.f84270z4.f109242r.b().setVisibility(0);
        GameCommentStatsObj comment_stats = this.f84267y2.getComment_stats();
        String score = this.f84267y2.getScore();
        String score_desc = this.f84267y2.getScore_desc();
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.layout_game_rating_card, this.f84270z4.f109242r.b());
        if (this.f84267y2.isMobile()) {
            h9(eVar, this.f84267y2.getMobileGameDetailsObj(), comment_stats, score, score_desc);
        } else {
            g9(eVar, this.f84267y2.getGameDetailsObj(), comment_stats, score, score_desc);
        }
        Y8(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e8(KeyDescObj keyDescObj, View view) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, view}, this, changeQuickRedirect, false, 32816, new Class[]{KeyDescObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.k0(this.mContext, keyDescObj.getProtocol());
    }

    private void e9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32720, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<GlobalRegionPriceObj> region_prices = this.f84267y2.getRegion_prices();
        if (com.max.hbcommon.utils.c.w(region_prices)) {
            this.A4.f113870g.setVisibility(8);
            this.A4.X.setVisibility(8);
            return;
        }
        this.A4.f113870g.setVisibility(0);
        this.A4.X.setVisibility(0);
        TextView textView = (TextView) this.K.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) this.K.findViewById(R.id.tv_more);
        ImageView imageView = (ImageView) this.K.findViewById(R.id.iv_more);
        View viewFindViewById = this.K.findViewById(R.id.vg_more);
        textView.setText("低价排名");
        textView2.setText("全区价格/趋势");
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        this.L.removeAllViews();
        viewFindViewById.setOnClickListener(new b0());
        for (GlobalRegionPriceObj globalRegionPriceObj : region_prices) {
            View viewInflate = this.mInflater.inflate(R.layout.item_global_price_trend, (ViewGroup) this.L, false);
            com.max.xiaoheihe.module.game.y.b(new com.max.hbcommon.base.adapter.s.e(R.layout.item_global_price_trend, viewInflate), globalRegionPriceObj);
            this.L.addView(viewInflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f8(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32825, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f84212b = z10;
        if (z10) {
            this.f84215c.H();
        } else {
            this.f84215c.a0();
        }
    }

    private void f9() {
        CollapsibleView collapsibleView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32797, new Class[0], Void.TYPE).isSupported || (collapsibleView = (CollapsibleView) this.mContentView.findViewById(R.id.cv_container_float)) == null || !this.Z3) {
            return;
        }
        GameDetailsWrapperObj gameDetailsWrapperObj = this.f84267y2;
        if (gameDetailsWrapperObj == null || gameDetailsWrapperObj.getGameDetailsObj() == null || this.f84267y2.getGameDetailsObj().getRelated_good() == null || this.f84267y2.getGameDetailsObj().getRelated_good().getGood() == null) {
            collapsibleView.setVisibility(8);
            Y7();
        } else {
            RelatedGoodsInfo related_good = this.f84267y2.getGameDetailsObj().getRelated_good();
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.item_related_goods_tinny, (ViewGroup) null, false);
            View viewInflate2 = LayoutInflater.from(this.mContext).inflate(R.layout.item_related_goods, (ViewGroup) null, false);
            MallProductObj good = related_good.getGood();
            ((TextView) viewInflate.findViewById(R.id.tv_item_num)).setText(related_good.getRelated_goods_num_desc());
            com.max.hbimage.b.K(good.getHead_image(), (ImageView) viewInflate2.findViewById(R.id.iv_img_rec_float));
            com.max.xiaoheihe.module.game.r1.K1((ViewGroup) viewInflate2.findViewById(R.id.ll_price_related), good.getPrice());
            ((TextView) viewInflate2.findViewById(R.id.tv_related_name)).setText(good.getName());
            collapsibleView.setBackgroundPaintColor(this.mContext.getResources().getColor(R.color.text_primary_1_color_alpha90));
            collapsibleView.setViews(viewInflate2, viewInflate);
            viewInflate2.setOnClickListener(new l1(good));
            viewInflate2.findViewById(R.id.iv_bg_close).setOnClickListener(new m1(collapsibleView, viewInflate));
            new Handler().postDelayed(new n1(collapsibleView, viewInflate), ((long) Integer.parseInt(related_good.getDuration() == null ? "3" : related_good.getDuration())) * 1000);
        }
        this.Z3 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g8(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32824, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        L9(z10);
    }

    private void g9(com.max.hbcommon.base.adapter.s.e eVar, GameDetailsObj gameDetailsObj, GameCommentStatsObj gameCommentStatsObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{eVar, gameDetailsObj, gameCommentStatsObj, str, str2}, this, changeQuickRedirect, false, 32724, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameDetailsObj.class, GameCommentStatsObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i9(eVar, gameDetailsObj.getComment_trend(), gameCommentStatsObj, str, str2, gameDetailsObj.getMultidimensional_score_radar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h8(PlaybackState playbackState) {
        if (PatchProxy.proxy(new Object[]{playbackState}, this, changeQuickRedirect, false, 32823, new Class[]{PlaybackState.class}, Void.TYPE).isSupported || playbackState != PlaybackState.COMPLETE || com.max.hbcommon.utils.c.w(this.f84230j)) {
            return;
        }
        if (!this.f84215c.D() && (this.f84215c.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f84215c.getParent()).removeView(this.f84215c);
        }
        GameScreenshotObj gameScreenshotObj = null;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            if (i10 >= this.f84230j.size()) {
                i10 = -1;
                break;
            }
            gameScreenshotObj = this.f84230j.get(i10);
            if (z10) {
                break;
            }
            if (gameScreenshotObj.isChecked()) {
                z10 = true;
            }
            i10++;
        }
        if (gameScreenshotObj != null) {
            if (this.f84215c.G()) {
                this.f84215c.K();
            }
            boolean z11 = i10 == -1;
            if (!z11 && !com.max.hbcommon.utils.c.w(this.f84230j) && i10 >= 0 && i10 < this.f84230j.size()) {
                this.f84230j.get(i10);
                if (i10 != this.f84220e.getCurrentItem()) {
                    this.f84250r4 = true;
                    this.f84220e.setCurrentItem(i10, true ^ this.f84215c.D());
                }
            }
            if ((!"movie".equals(gameScreenshotObj.getType()) || z11) && this.f84215c.D()) {
                ComponentCallbacks2 componentCallbacks2 = this.mContext;
                if (componentCallbacks2 instanceof com.max.xiaoheihe.module.video.b) {
                    ((com.max.xiaoheihe.module.video.b) componentCallbacks2).e();
                }
                if (this.f84215c.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.f84215c.getParent()).removeView(this.f84215c);
                }
            }
        }
    }

    private void h9(com.max.hbcommon.base.adapter.s.e eVar, MobileGameDetailsObj mobileGameDetailsObj, GameCommentStatsObj gameCommentStatsObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{eVar, mobileGameDetailsObj, gameCommentStatsObj, str, str2}, this, changeQuickRedirect, false, 32723, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MobileGameDetailsObj.class, GameCommentStatsObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i9(eVar, mobileGameDetailsObj.getComment_trend(), gameCommentStatsObj, str, str2, mobileGameDetailsObj.getMultidimensional_score_radar());
    }

    static /* synthetic */ GameScreenshotObj i4(GameDetailFragment gameDetailFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32833, new Class[]{GameDetailFragment.class}, GameScreenshotObj.class);
        return patchProxyResultProxy.isSupported ? (GameScreenshotObj) patchProxyResultProxy.result : gameDetailFragment.B7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i8(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32822, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.o(this.mContext, this.f84267y2.getName());
        com.max.hbutils.utils.x.p("复制成功");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0120  */
    /* JADX WARN: Code duplicated, block: B:16:0x0134  */
    /* JADX WARN: Code duplicated, block: B:19:0x014d  */
    /* JADX WARN: Code duplicated, block: B:22:0x016f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0175  */
    /* JADX WARN: Code duplicated, block: B:25:0x0195  */
    /* JADX WARN: Code duplicated, block: B:27:0x019b  */
    /* JADX WARN: Code duplicated, block: B:29:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x0234  */
    /* JADX WARN: Code duplicated, block: B:43:0x0238  */
    /* JADX WARN: Code duplicated, block: B:46:0x0277  */
    /* JADX WARN: Code duplicated, block: B:51:0x0289  */
    /* JADX WARN: Code duplicated, block: B:53:0x029a  */
    /* JADX WARN: Code duplicated, block: B:54:0x029d  */
    /* JADX WARN: Code duplicated, block: B:57:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0311  */
    /* JADX WARN: Code duplicated, block: B:69:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0175, please report this as an issue */
    private void i9(com.max.hbcommon.base.adapter.s.e eVar, List<CommentTrendInfo> list, GameCommentStatsObj gameCommentStatsObj, String str, String str2, MultiDimensionRadarObj multiDimensionRadarObj) {
        char c10;
        char c11;
        boolean z10;
        ArrayList arrayList;
        ArrayList<KeyDescObj> arrayList2;
        ArrayList<KeyDescObj> arrayList3;
        int month;
        boolean z11;
        int iIntValue;
        long jIntValue;
        int i10;
        int i11;
        String expect_num;
        if (PatchProxy.proxy(new Object[]{eVar, list, gameCommentStatsObj, str, str2, multiDimensionRadarObj}, this, changeQuickRedirect, false, 32725, new Class[]{com.max.hbcommon.base.adapter.s.e.class, List.class, GameCommentStatsObj.class, String.class, String.class, MultiDimensionRadarObj.class}, Void.TYPE).isSupported) {
            return;
        }
        SegmentFilterView segmentFilterView = (SegmentFilterView) eVar.i(R.id.sfv);
        TextView textView = (TextView) eVar.i(R.id.tv_title);
        TextView textView2 = (TextView) eVar.i(R.id.tv_subtitle);
        GameDetailScore gameDetailScore = (GameDetailScore) eVar.i(R.id.game_detail_score);
        View viewI = eVar.i(R.id.vg_trend);
        View viewI2 = eVar.i(R.id.vg_radar);
        View viewI3 = eVar.i(R.id.iv_multi_dimension_point);
        BarChart barChart = (BarChart) eVar.i(R.id.bc_trend);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_chart_bg);
        if (multiDimensionRadarObj != null) {
            c10 = 0;
            if (!com.max.hbcommon.utils.c.w(multiDimensionRadarObj.getDimension_list())) {
                c11 = 1;
            }
            List[] listArr = new List[1];
            listArr[c10] = list;
            z10 = !com.max.hbcommon.utils.c.w(listArr);
            textView.setText("游戏评价");
            Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.common_help_line_24x24);
            drawable.setBounds(0, 0, ViewUtils.f(this.mContext, 12.0f), ViewUtils.f(this.mContext, 12.0f));
            drawable.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color), PorterDuff.Mode.SRC_IN);
            textView2.setCompoundDrawables(null, null, drawable, null);
            textView2.setOnClickListener(new c0());
            arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setDesc("评分统计");
            keyDescObj.setKey(GameObj.KEY_POINT_SCORE);
            arrayList.add(keyDescObj);
            if (c11 != 0) {
                KeyDescObj keyDescObj2 = new KeyDescObj();
                keyDescObj2.setDesc("印象评分");
                keyDescObj2.setKey(com.max.xiaoheihe.module.game.adapter.overview.b.f85776u);
                arrayList.add(keyDescObj2);
            }
            if (z10) {
                KeyDescObj keyDescObj3 = new KeyDescObj();
                keyDescObj3.setDesc("评分趋势");
                keyDescObj3.setKey("trend");
                arrayList.add(keyDescObj3);
            }
            if (arrayList.size() > 1) {
                segmentFilterView.setData(arrayList);
            }
            segmentFilterView.setMOnTabCheckedListener(new d0(viewI, gameDetailScore, viewI2, viewI3));
            segmentFilterView.d();
            if (gameCommentStatsObj != null) {
                if (!com.max.hbcommon.utils.c.u(str)) {
                    gameDetailScore.setScore(str);
                    gameDetailScore.setRatingNum(com.max.hbutils.utils.n.q(gameCommentStatsObj.getScore_comment()) + "");
                } else if (com.max.hbcommon.utils.c.u(str2)) {
                    gameDetailScore.f86723f.setVisibility(4);
                } else {
                    gameDetailScore.setScoreDesc(str2);
                    if (this.f84267y2.getComment_stats() != null) {
                        expect_num = this.f84267y2.getComment_stats().getExpect_num();
                    } else {
                        expect_num = null;
                    }
                    gameDetailScore.setW2PNum(expect_num);
                }
                gameDetailScore.setAllStarRatingNum(gameCommentStatsObj);
            } else {
                gameDetailScore.setVisibility(8);
            }
            if (c11 != 0) {
                com.max.xiaoheihe.module.game.m.f87809a.c(multiDimensionRadarObj, viewI2, this.f84267y2.getScore());
            }
            if (z10) {
                barChart.setVisibility(8);
                imageView.setVisibility(8);
                return;
            }
            barChart.setVisibility(0);
            imageView.setVisibility(0);
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            Long l10 = 0L;
            month = new Date(Long.valueOf(l10.longValue() + ((long) list.get(0).getTime().intValue())).longValue() * 1000).getMonth() + 1 + (list.size() / 2) + 12;
            z11 = false;
            while (arrayList2.size() + list.size() < 24) {
                i11 = month % 12;
                if (i11 == 0) {
                    i11 = 12;
                }
                KeyDescObj keyDescObj4 = new KeyDescObj();
                keyDescObj4.setValue("0");
                keyDescObj4.setDesc(i11 + "月");
                arrayList2.add(keyDescObj4);
                KeyDescObj keyDescObj5 = new KeyDescObj();
                keyDescObj5.setValue("0");
                keyDescObj5.setDesc(i11 + "月");
                arrayList3.add(keyDescObj5);
                if (z11) {
                    month++;
                }
                z11 = !z11;
            }
            for (CommentTrendInfo commentTrendInfo : list) {
                KeyDescObj keyDescObj6 = new KeyDescObj();
                if (commentTrendInfo.getUp_count() == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = commentTrendInfo.getUp_count().intValue();
                }
                keyDescObj6.setValue(String.valueOf(iIntValue));
                if (commentTrendInfo.getTime() == null) {
                    jIntValue = 0;
                } else {
                    jIntValue = ((long) commentTrendInfo.getTime().intValue()) * 1000;
                }
                keyDescObj6.setDesc((new Date(new Timestamp(jIntValue).getTime()).getMonth() + 1) + "月");
                arrayList2.add(keyDescObj6);
                KeyDescObj keyDescObj7 = new KeyDescObj();
                if (commentTrendInfo.getDown_count() == null) {
                    i10 = 0;
                } else {
                    i10 = -commentTrendInfo.getDown_count().intValue();
                }
                keyDescObj7.setValue(String.valueOf(i10));
                arrayList3.add(keyDescObj7);
            }
            F8(imageView, barChart, arrayList2, arrayList3);
        }
        c10 = 0;
        c11 = c10;
        List[] listArr2 = new List[1];
        listArr2[c10] = list;
        z10 = !com.max.hbcommon.utils.c.w(listArr2);
        textView.setText("游戏评价");
        Drawable drawable2 = this.mContext.getResources().getDrawable(R.drawable.common_help_line_24x24);
        drawable2.setBounds(0, 0, ViewUtils.f(this.mContext, 12.0f), ViewUtils.f(this.mContext, 12.0f));
        drawable2.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color), PorterDuff.Mode.SRC_IN);
        textView2.setCompoundDrawables(null, null, drawable2, null);
        textView2.setOnClickListener(new c0());
        arrayList = new ArrayList();
        KeyDescObj keyDescObj8 = new KeyDescObj();
        keyDescObj8.setDesc("评分统计");
        keyDescObj8.setKey(GameObj.KEY_POINT_SCORE);
        arrayList.add(keyDescObj8);
        if (c11 != 0) {
            KeyDescObj keyDescObj9 = new KeyDescObj();
            keyDescObj9.setDesc("印象评分");
            keyDescObj9.setKey(com.max.xiaoheihe.module.game.adapter.overview.b.f85776u);
            arrayList.add(keyDescObj9);
        }
        if (z10) {
            KeyDescObj keyDescObj10 = new KeyDescObj();
            keyDescObj10.setDesc("评分趋势");
            keyDescObj10.setKey("trend");
            arrayList.add(keyDescObj10);
        }
        if (arrayList.size() > 1) {
            segmentFilterView.setData(arrayList);
        }
        segmentFilterView.setMOnTabCheckedListener(new d0(viewI, gameDetailScore, viewI2, viewI3));
        segmentFilterView.d();
        if (gameCommentStatsObj != null) {
            if (!com.max.hbcommon.utils.c.u(str)) {
                gameDetailScore.setScore(str);
                gameDetailScore.setRatingNum(com.max.hbutils.utils.n.q(gameCommentStatsObj.getScore_comment()) + "");
            } else if (com.max.hbcommon.utils.c.u(str2)) {
                gameDetailScore.setScoreDesc(str2);
                if (this.f84267y2.getComment_stats() != null) {
                    expect_num = this.f84267y2.getComment_stats().getExpect_num();
                } else {
                    expect_num = null;
                }
                gameDetailScore.setW2PNum(expect_num);
            } else {
                gameDetailScore.f86723f.setVisibility(4);
            }
            gameDetailScore.setAllStarRatingNum(gameCommentStatsObj);
        } else {
            gameDetailScore.setVisibility(8);
        }
        if (c11 != 0) {
            com.max.xiaoheihe.module.game.m.f87809a.c(multiDimensionRadarObj, viewI2, this.f84267y2.getScore());
        }
        if (z10) {
            barChart.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        barChart.setVisibility(0);
        imageView.setVisibility(0);
        arrayList2 = new ArrayList<>();
        arrayList3 = new ArrayList<>();
        Long l11 = 0L;
        month = new Date(Long.valueOf(l11.longValue() + ((long) list.get(0).getTime().intValue())).longValue() * 1000).getMonth() + 1 + (list.size() / 2) + 12;
        z11 = false;
        while (arrayList2.size() + list.size() < 24) {
            i11 = month % 12;
            if (i11 == 0) {
                i11 = 12;
            }
            KeyDescObj keyDescObj11 = new KeyDescObj();
            keyDescObj11.setValue("0");
            keyDescObj11.setDesc(i11 + "月");
            arrayList2.add(keyDescObj11);
            KeyDescObj keyDescObj12 = new KeyDescObj();
            keyDescObj12.setValue("0");
            keyDescObj12.setDesc(i11 + "月");
            arrayList3.add(keyDescObj12);
            if (z11) {
                month++;
            }
            z11 = !z11;
        }
        while (r1.hasNext()) {
            KeyDescObj keyDescObj13 = new KeyDescObj();
            if (commentTrendInfo.getUp_count() == null) {
                iIntValue = 0;
            } else {
                iIntValue = commentTrendInfo.getUp_count().intValue();
            }
            keyDescObj13.setValue(String.valueOf(iIntValue));
            if (commentTrendInfo.getTime() == null) {
                jIntValue = 0;
            } else {
                jIntValue = ((long) commentTrendInfo.getTime().intValue()) * 1000;
            }
            keyDescObj13.setDesc((new Date(new Timestamp(jIntValue).getTime()).getMonth() + 1) + "月");
            arrayList2.add(keyDescObj13);
            KeyDescObj keyDescObj14 = new KeyDescObj();
            if (commentTrendInfo.getDown_count() == null) {
                i10 = 0;
            } else {
                i10 = -commentTrendInfo.getDown_count().intValue();
            }
            keyDescObj14.setValue(String.valueOf(i10));
            arrayList3.add(keyDescObj14);
        }
        F8(imageView, barChart, arrayList2, arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j8(String str, View view) {
        if (PatchProxy.proxy(new Object[]{str, view}, this, changeQuickRedirect, false, 32821, new Class[]{String.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.o(this.mContext, str);
        com.max.hbutils.utils.x.p("复制成功");
    }

    private void j9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32697, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f84267y2.getScreenshots())) {
            this.f84220e.setVisibility(8);
            this.f84224g.setVisibility(8);
            return;
        }
        GameScreenshotObj gameScreenshotObjB7 = B7();
        this.f84230j.clear();
        this.f84230j.addAll(this.f84267y2.getScreenshots());
        List<GameScreenshotObj> list = this.f84230j;
        if (list == null || list.size() <= 0) {
            this.f84220e.setVisibility(8);
        } else {
            this.f84220e.setVisibility(0);
            this.f84220e.setOffscreenPageLimit(this.f84230j.size());
            N9(this.f84230j, gameScreenshotObjB7);
            if ((this.f84252s4 && c8()) || this.f84258v4) {
                this.f84258v4 = false;
                this.f84228i.notifyDataSetChanged();
                this.f84252s4 = false;
                int iD7 = D7();
                if (!com.max.hbcommon.utils.c.u(this.f84246p4)) {
                    for (int i10 = 0; i10 < this.f84267y2.getScreenshots().size(); i10++) {
                        if (this.f84246p4.equals(this.f84267y2.getScreenshots().get(i10).getUrl())) {
                            iD7 = i10;
                            break;
                        }
                    }
                }
                if (iD7 >= 0) {
                    List<GameScreenshotObj> list2 = this.f84230j;
                    N9(list2, list2.get(iD7));
                    b2 b2Var = new b2(iD7);
                    this.D4 = b2Var;
                    ViewPager2 viewPager2 = this.f84220e;
                    if (viewPager2 != null) {
                        viewPager2.postDelayed(b2Var, 100L);
                    }
                }
            } else if (this.f84252s4) {
                this.f84252s4 = false;
                o9();
            }
        }
        List<GameScreenshotObj> list3 = this.f84230j;
        if (list3 == null || list3.size() <= 1) {
            this.f84224g.setVisibility(8);
            return;
        }
        this.f84224g.setVisibility(0);
        this.f84224g.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.f84224g.setPadding(ViewUtils.f(this.mContext, 2.0f), 0, ViewUtils.f(this.mContext, 2.0f), 0);
        this.f84224g.clearOnScrollListeners();
        com.max.hbcommon.base.adapter.s<GameScreenshotObj> sVar = this.f84226h;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
            return;
        }
        f fVar = new f(this.mContext, this.f84230j, R.layout.item_game_screenshots_banner);
        this.f84226h = fVar;
        this.f84224g.setAdapter(fVar);
    }

    static /* synthetic */ void k5(GameDetailFragment gameDetailFragment, GameCommentsObj gameCommentsObj, int i10) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, gameCommentsObj, new Integer(i10)}, null, changeQuickRedirect, true, 32857, new Class[]{GameDetailFragment.class, GameCommentsObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.R8(gameCommentsObj, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k8(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32820, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f84251s.performClick();
    }

    private void k9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32719, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<KeyDescObj> list = (this.f84267y2.getSubscribe_info() == null || this.f84267y2.getSubscribe_info().getAwards() == null) ? null : this.f84267y2.getSubscribe_info().getAwards().getList();
        if (list == null || list.isEmpty()) {
            this.A4.f113872h.setVisibility(8);
            this.A4.Y.setVisibility(8);
            return;
        }
        String reached = this.f84267y2.getSubscribe_info().getAwards().getReached();
        this.A4.f113872h.setVisibility(0);
        this.A4.Y.setVisibility(0);
        this.J.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.J.setNestedScrollingEnabled(false);
        this.J.setAdapter(new a0(this.mContext, list, R.layout.item_subscribe_awards, reached));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l8(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32819, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.o(this.mContext, this.f84267y2.getGameDetailsObj().getName_en());
        com.max.hbutils.utils.x.p("复制成功");
    }

    private void l9(com.max.hbcommon.base.adapter.s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 32754, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        View viewI = eVar.i(R.id.vg_btn);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        ((TextView) eVar.i(R.id.tv_tag)).setVisibility(8);
        if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equals(str)) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_reserve_24);
            textView.setTextColor(getResources().getColor(R.color.white));
            textView.setText(R.string.reserve);
            textView2.setVisibility(8);
            viewI.setBackgroundResource(R.drawable.btn_primary_2dp);
            A9(eVar);
        } else {
            imageView.setVisibility(8);
            textView.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            textView.setText(R.string.reserved);
            if (this.f84267y2.getSubscribe_info() == null || com.max.hbutils.utils.n.r(this.f84267y2.getSubscribe_info().getCount()) <= 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                textView2.setText(String.format(com.max.xiaoheihe.utils.d.n0(R.string.game_subscribed_count), this.f84267y2.getSubscribe_info().getCount()));
            }
            viewI.setBackgroundResource(R.drawable.btn_reference_2dp);
        }
        viewB.setOnClickListener(new s0(eVar, str));
    }

    static /* synthetic */ void m5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32858, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.G8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m8(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32818, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f84251s.performClick();
    }

    private void m9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32712, new Class[0], Void.TYPE).isSupported || this.f84267y2 == null) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.mContext);
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        flexboxLayoutManager.setJustifyContent(0);
        this.f84257v.setLayoutManager(new FlexboxLayoutManager(this.mContext));
        ArrayList<GameDetailCommonTags> arrayList = new ArrayList();
        if (!com.max.hbcommon.utils.c.w(this.f84267y2.getPlatforms_list())) {
            arrayList.add(new GameDetailCommonTags("platform", this.f84267y2.getPlatforms_list()));
        }
        if (!com.max.hbcommon.utils.c.w(this.f84267y2.getCommon_tags())) {
            arrayList.addAll(this.f84267y2.getCommon_tags());
        }
        for (GameDetailCommonTags gameDetailCommonTags : arrayList) {
            if (GameDetailCommonTags.STEAM_TAG.equals(gameDetailCommonTags.getType()) && !com.max.hbcommon.utils.c.w(gameDetailCommonTags.getDetail_list())) {
                this.f84268y4.clear();
                this.f84268y4.addAll(gameDetailCommonTags.getDetail_list());
            }
        }
        this.f84257v.setAdapter(new i(this.mContext, arrayList));
    }

    static /* synthetic */ void n5(GameDetailFragment gameDetailFragment, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, mallProductObj}, null, changeQuickRedirect, true, 32859, new Class[]{GameDetailFragment.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.D9(mallProductObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n8(TypedButtonObj typedButtonObj, View view) {
        if (PatchProxy.proxy(new Object[]{typedButtonObj, view}, this, changeQuickRedirect, false, 32817, new Class[]{TypedButtonObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.k0(this.mContext, typedButtonObj.getProtocol());
    }

    private void n9() {
        int iL;
        float fO;
        int iF = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32693, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        if ((activity instanceof ChannelsDetailActivity) && ((ChannelsDetailActivity) activity).W3()) {
            iF = ViewUtils.f(this.mContext, 12.0f);
            iL = (int) ((((ViewUtils.L(this.mContext) - (iF * 2)) * 178.0f) / 351.0f) + 0.5f);
            fO = ViewUtils.o(this.mContext, this.W);
        } else {
            iL = (int) (((ViewUtils.L(this.mContext) * 211.0f) / 375.0f) + 0.5f);
            fO = 0.0f;
        }
        ViewGroup.LayoutParams layoutParams = this.f84220e.getLayoutParams();
        if (layoutParams.height != iL) {
            layoutParams.height = iL;
            this.f84220e.setLayoutParams(layoutParams);
        }
        ((ViewGroup.MarginLayoutParams) this.W.getLayoutParams()).leftMargin = iF;
        ((ViewGroup.MarginLayoutParams) this.W.getLayoutParams()).rightMargin = iF;
        this.W.setRadius(fO);
    }

    static /* synthetic */ void o5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32860, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.E8();
    }

    private void o7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32689, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        F7().addView(this.f84215c, new ViewGroup.LayoutParams(-1, -1));
    }

    private void o8() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32768, new Class[0], Void.TYPE).isSupported && !r7() && this.S3 && com.max.xiaoheihe.utils.i0.s()) {
            this.S3 = false;
            if (com.max.hbcommon.utils.c.x(this.f84267y2.getShow_luck_coupon())) {
                return;
            }
            s9(false);
            v8(false);
        }
    }

    private void o9() {
        ViewPager2 viewPager2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32683, new Class[0], Void.TYPE).isSupported || (viewPager2 = this.f84220e) == null) {
            return;
        }
        viewPager2.registerOnPageChangeCallback(this.F4);
    }

    private boolean p7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32758, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : com.max.hbcommon.utils.c.x(this.f84267y2.getOwn_State());
    }

    public static GameDetailFragment p8(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, GameDetailsWrapperObj gameDetailsWrapperObj, String str8, boolean z11, String str9, String str10, long j10, String str11, String str12) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, new Byte(z10 ? (byte) 1 : (byte) 0), gameDetailsWrapperObj, str8, new Byte(z11 ? (byte) 1 : (byte) 0), str9, str10, new Long(j10), str11, str12};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 32677, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, GameDetailsWrapperObj.class, String.class, cls, String.class, String.class, Long.TYPE, String.class, String.class}, GameDetailFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDetailFragment) patchProxyResultProxy.result;
        }
        GameDetailFragment gameDetailFragment = new GameDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(G4, str);
        bundle.putString("game_type", str2);
        bundle.putString("platform", str3);
        bundle.putString("h_src", str4);
        bundle.putString("player_id", str5);
        bundle.putString("steam_id", str6);
        bundle.putString(K4, str7);
        bundle.putBoolean(M4, z10);
        bundle.putSerializable(L4, gameDetailsWrapperObj);
        bundle.putString("sku_id", str8);
        bundle.putBoolean(Q4, z11);
        bundle.putString("top_comment_id", str9);
        bundle.putString(ChannelsDetailActivity.f79599i4, str10);
        bundle.putLong(ChannelsDetailActivity.f79600j4, j10);
        bundle.putString(ChannelsDetailActivity.f79601k4, str11);
        bundle.putString(S4, str12);
        gameDetailFragment.setArguments(bundle);
        return gameDetailFragment;
    }

    @SuppressLint({"AutoDispose"})
    private void p9(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 32815, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        GameDetailsWrapperObj gameDetailsWrapperObj = this.f84267y2;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i4(this.Z, gameDetailsWrapperObj != null ? gameDetailsWrapperObj.getName() : null, str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t1()));
    }

    static /* synthetic */ void q5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32861, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.v9();
    }

    private boolean q7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105199i, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f84267y2.getFreeLicenseObj() != null;
    }

    private void q9(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32807, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.Z);
        jsonObject.addProperty("action", str);
        com.max.hbcommon.analytics.l.f66572a.l(lb.d.f131215n3, jsonObject);
    }

    static /* synthetic */ void r4(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32843, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.r9();
    }

    private boolean r7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32746, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f84267y2.getGrouping_price() != null;
    }

    private void r8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32805, new Class[0], Void.TYPE).isSupported || this.f84256u4) {
            return;
        }
        this.f84256u4 = true;
        com.max.hbcommon.analytics.j jVar = this.f84254t4;
        if (jVar != null) {
            jVar.e();
        }
    }

    private void r9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32809, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.Z);
        com.max.hbcommon.analytics.l.f66572a.l(lb.d.f131124a3, jsonObject);
    }

    static /* synthetic */ void s5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32862, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.L8();
    }

    private boolean s7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32766, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f84267y2.isMobile()) {
            return (com.max.hbcommon.utils.c.u(this.f84267y2.getPurchase_url()) || "1".equals(this.f84267y2.getMobileGameDetailsObj().getPurchased_state())) ? false : true;
        }
        return !com.max.hbcommon.utils.c.u(this.f84267y2.getPurchase_url());
    }

    private void s8() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32804, new Class[0], Void.TYPE).isSupported && this.f84256u4) {
            this.f84256u4 = false;
            com.max.hbcommon.analytics.j jVar = this.f84254t4;
            if (jVar != null) {
                jVar.f();
            }
        }
    }

    private void s9(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32808, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (!com.max.hbcommon.utils.c.u(this.Z)) {
            jsonObject.addProperty("app_id", this.Z);
        }
        if (!com.max.hbcommon.utils.c.u(this.f84266y1)) {
            jsonObject.addProperty("h_src", this.f84266y1);
        }
        if (!com.max.hbcommon.utils.c.u(this.f84262x1)) {
            jsonObject.addProperty("sku_id", this.f84262x1);
        }
        if (z10) {
            jsonObject.addProperty(MallPurchaseDetailDialogFragment.f89681y1, "1");
        }
        com.max.hbcommon.analytics.l.f66572a.l(lb.d.f131222o3, jsonObject);
    }

    static /* synthetic */ void t4(GameDetailFragment gameDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str}, null, changeQuickRedirect, true, 32834, new Class[]{GameDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.B8(str);
    }

    static /* synthetic */ int t5(GameDetailFragment gameDetailFragment, int i10) {
        int i11 = gameDetailFragment.G3 + i10;
        gameDetailFragment.G3 = i11;
        return i11;
    }

    private void t7(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32789, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                t7(viewGroup.getChildAt(i10));
            }
            return;
        }
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            com.max.hbimage.b.c(imageView);
            imageView.setImageDrawable(null);
            imageView.setBackground(null);
        }
    }

    private void t9(GameDetailCommonTags gameDetailCommonTags) {
        if (PatchProxy.proxy(new Object[]{gameDetailCommonTags}, this, changeQuickRedirect, false, 32713, new Class[]{GameDetailCommonTags.class}, Void.TYPE).isSupported || gameDetailCommonTags == null) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.Z);
        jsonObject.addProperty("tag_type", gameDetailCommonTags.getType());
        jsonObject.addProperty("tag_desc", gameDetailCommonTags.getDesc());
        com.max.hbcommon.analytics.d.e("4", lb.d.A3, null, null, jsonObject, null, true);
    }

    static /* synthetic */ void u5(GameDetailFragment gameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment}, null, changeQuickRedirect, true, 32863, new Class[]{GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.X8();
    }

    private void u7(com.max.hbcommon.base.adapter.s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 32755, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported || !com.max.xiaoheihe.utils.i0.e(this.mContext) || eVar == null || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        String str2 = GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING;
        if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equals(str)) {
            str2 = GameObj.SUBSCRIBE_STATE_SUBSCRIBING;
        }
        if (!GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(str2)) {
            com.max.xiaoheihe.view.l.D(this.mContext, getString(R.string.cancel_reserve_confirm), "", getString(R.string.confirm), getString(R.string.cancel), new t0(eVar, str2));
        } else if (this.f84267y2.getSubscribe_info() != null && "1".equals(this.f84267y2.getSubscribe_info().getNeed_phonenum())) {
            H9(eVar);
        } else {
            l9(eVar, str2);
            I9(str2, null);
        }
    }

    private void u8(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105198h, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported || !isActive() || this.mContext.isFinishing()) {
            return;
        }
        com.max.heybox.hblog.g.x("GameDetailFragment, onPurchaseGame, gameID = " + str2 + ", skuID = " + str7);
        if (com.max.xiaoheihe.utils.i0.e(this.mContext)) {
            com.max.hbcache.c.C(GameStorePurchaseShareActivity.f85087a0, "game_detail");
            MallCartUtils.H((AppCompatActivity) this.mContext, getChildFragmentManager(), str, str2, str3, str4, str5, str6, str7, this.f84263x2, Boolean.valueOf(z10));
        }
    }

    private void u9(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32705, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            this.f84242p.setVisibility(8);
            return;
        }
        this.f84242p.setVisibility(0);
        this.f84242p.setText(((Object) this.mContext.getResources().getText(R.string.region_prices)) + " " + lb.b.f131097m);
        this.f84242p.setOnClickListener(new g());
    }

    static /* synthetic */ void v4(GameDetailFragment gameDetailFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32844, new Class[]{GameDetailFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.w8(z10);
    }

    @SuppressLint({"AutoDispose"})
    private void v7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105206p, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z<Result> zVarH6 = null;
        if ("unfollowing".equalsIgnoreCase(str)) {
            zVarH6 = com.max.xiaoheihe.network.i.a().x3(this.Z);
        } else if ("following".equalsIgnoreCase(str)) {
            zVarH6 = com.max.xiaoheihe.network.i.a().H6(this.Z, com.max.xiaoheihe.utils.d.N0(this.mContext) ? "1" : "0");
            com.max.hbcache.c.C(com.max.hbcache.c.U, String.valueOf(System.currentTimeMillis()));
        }
        if (zVarH6 != null) {
            addDisposable((io.reactivex.disposables.b) zVarH6.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i1(str)));
        }
    }

    @SuppressLint({"AutoDispose"})
    private void v8(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105197g, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f84267y2.isMobile() || com.max.xiaoheihe.utils.i0.i().isCertificated()) {
            u8(this.f84266y1, this.Z, this.f84244p2, null, null, null, this.f84262x1, z10);
        } else {
            addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z5("1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e1(z10)));
        }
    }

    private void v9() {
        GameDetailsWrapperObj gameDetailsWrapperObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32743, new Class[0], Void.TYPE).isSupported || (gameDetailsWrapperObj = this.f84267y2) == null || !"unfollowing".equals(gameDetailsWrapperObj.getFollow_state_v2())) {
            return;
        }
        if (System.currentTimeMillis() - com.max.hbutils.utils.n.r(com.max.hbcache.c.o(com.max.hbcache.c.U, "0")) > 2419200000L) {
            if (System.currentTimeMillis() - com.max.hbutils.utils.n.r(com.max.hbcache.c.o(com.max.hbcache.c.V, "0")) > 604800000) {
                w9();
                new Handler().postDelayed(new n0(), 15000L);
            }
        }
    }

    static /* synthetic */ void w4(GameDetailFragment gameDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gameDetailFragment, str}, null, changeQuickRedirect, true, 32845, new Class[]{GameDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailFragment.A8(str);
    }

    private View w7(int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32737, new Class[]{Integer.TYPE, Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (i10 == GameDetailsWrapperObj.BottomButtonStyle.Purchase.getValue()) {
            return G7() ? Q7() : W7();
        }
        if (i10 == GameDetailsWrapperObj.BottomButtonStyle.GroupPurchase.getValue()) {
            return P7();
        }
        if (i10 == GameDetailsWrapperObj.BottomButtonStyle.CountDown.getValue()) {
            return M7();
        }
        if (i10 == GameDetailsWrapperObj.BottomButtonStyle.AddFreeLicence.getValue()) {
            return K7();
        }
        if (i10 == GameDetailsWrapperObj.BottomButtonStyle.NotFinishOrder.getValue()) {
            return R7();
        }
        if (i10 == GameDetailsWrapperObj.BottomButtonStyle.CustomButton.getValue()) {
            return U7(z10);
        }
        if (i10 == GameDetailsWrapperObj.BottomButtonStyle.Follow.getValue()) {
            return N7();
        }
        return null;
    }

    private void w8(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105207q, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        String str = this.Z;
        GameGradeCommentCardView gameGradeCommentCardView = this.U;
        com.max.xiaoheihe.base.router.b.k(activity, str, gameGradeCommentCardView != null ? gameGradeCommentCardView.getGrade() : 0, this.f84244p2, z10).C(1).A();
    }

    private void w9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32744, new Class[0], Void.TYPE).isSupported || this.f84267y2.isMobile() || this.T == null) {
            return;
        }
        if (this.f84231j4 == null) {
            ExpressionTextView expressionTextView = new ExpressionTextView(this.mContext);
            expressionTextView.setTextColor(this.mContext.getResources().getColor(R.color.background_layer_2_color));
            expressionTextView.setTextSize(ViewUtils.g(this.mContext, 12.0f));
            expressionTextView.setText("点此关注，第一时间获取折扣消息~");
            expressionTextView.setPadding(ViewUtils.f(this.mContext, 4.0f), 0, 0, 0);
            ImageView imageView = new ImageView(this.mContext);
            imageView.setImageResource(R.drawable.expression_heygirl_qiaokaixin);
            int iF = ViewUtils.f(this.mContext, 18.0f);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(iF, iF));
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            int iF2 = ViewUtils.f(this.mContext, 16.0f);
            int iF3 = ViewUtils.f(this.mContext, 8.0f);
            linearLayout.setPadding(iF2, iF3, iF2, iF3);
            linearLayout.addView(imageView);
            linearLayout.addView(expressionTextView);
            BubbleView bubbleViewC = com.max.hbcommon.component.bubble.k.c(this.mContext, linearLayout, R.color.text_primary_1_color_alpha90, 3.0f, BubbleView.TailDirection.Bottom, 6.0f, 10.0f);
            this.f84231j4 = bubbleViewC;
            bubbleViewC.setTailPosition(ViewUtils.f(this.mContext, 21.5f));
            this.f84270z4.f109241q.addView(this.f84231j4);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f84231j4.getLayoutParams();
            int i10 = this.E4;
            layoutParams.leftMargin = ViewUtils.f(this.mContext, i10 > 0 ? 12 + ((i10 - 1) * 50) : 12);
            layoutParams.bottomMargin = ViewUtils.f(this.mContext, 6.0f);
            layoutParams.addRule(2, R.id.ll_bottom_bar);
            this.f84231j4.setLayoutParams(layoutParams);
            this.f84231j4.setOnClickListener(new p0());
        }
        com.max.hbutils.anim.b.c(this.f84231j4, 500, true);
        com.max.hbcache.c.C(com.max.hbcache.c.V, String.valueOf(System.currentTimeMillis()));
    }

    private x1 x7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32735, new Class[0], x1.class);
        if (patchProxyResultProxy.isSupported) {
            return (x1) patchProxyResultProxy.result;
        }
        GameDetailsWrapperObj gameDetailsWrapperObj = this.f84267y2;
        if (gameDetailsWrapperObj == null) {
            return new x1(null, null);
        }
        List<TypedButtonObj> button_style_list_v2 = gameDetailsWrapperObj.getButton_style_list_v2();
        return com.max.hbcommon.utils.c.w(button_style_list_v2) ? y7() : z7(button_style_list_v2);
    }

    private void x8(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32699, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        y8(i10, z10, false);
    }

    private x1 y7() {
        View viewW7;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32736, new Class[0], x1.class);
        if (patchProxyResultProxy.isSupported) {
            return (x1) patchProxyResultProxy.result;
        }
        View viewW8 = null;
        if (this.f84267y2.getButton_style_list() != null) {
            viewW7 = null;
            for (int i10 = 0; i10 < this.f84267y2.getButton_style_list().size(); i10++) {
                int iQ = com.max.hbutils.utils.n.q(this.f84267y2.getButton_style_list().get(i10));
                if (i10 != 0) {
                    if (i10 != 1) {
                        break;
                    }
                    viewW7 = w7(iQ, this.f84267y2.getButton_style_list().size() == 1);
                } else {
                    viewW8 = w7(iQ, this.f84267y2.getButton_style_list().size() == 1);
                }
            }
        } else {
            viewW7 = null;
        }
        return new x1(viewW8, viewW7);
    }

    private void y8(int i10, boolean z10, boolean z11) {
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32700, new Class[]{Integer.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        z8(i10, z10, z11, true);
    }

    private boolean y9() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105201k, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f84267y2.getDeadline_timestamp() != null && com.max.hbutils.utils.n.r(this.f84267y2.getDeadline_timestamp()) * 1000 > System.currentTimeMillis();
    }

    private x1 z7(List<TypedButtonObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 32738, new Class[]{List.class}, x1.class);
        if (patchProxyResultProxy.isSupported) {
            return (x1) patchProxyResultProxy.result;
        }
        View viewA7 = null;
        View viewA8 = null;
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        break;
                    }
                    viewA8 = A7(list.get(i10));
                } else {
                    viewA7 = A7(list.get(i10));
                }
            }
        }
        return new x1(viewA7, viewA8);
    }

    private void z8(int i10, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32701, new Class[]{Integer.TYPE, cls, cls, cls}, Void.TYPE).isSupported && !com.max.hbcommon.utils.c.w(this.f84230j) && i10 >= 0 && i10 < this.f84230j.size()) {
            GameScreenshotObj gameScreenshotObj = this.f84230j.get(i10);
            if (z12 && i10 != this.f84220e.getCurrentItem()) {
                this.f84215c.K();
                this.f84220e.setCurrentItem(i10, z10);
            }
            if (z11) {
                this.f84250r4 = false;
                if (gameScreenshotObj != null && "movie".equals(gameScreenshotObj.getType()) && !com.max.hbcommon.utils.c.u(gameScreenshotObj.getUrl())) {
                    B8(gameScreenshotObj.getUrl());
                }
            }
            if (gameScreenshotObj == null || this.f84222f.getChildCount() <= 0 || this.f84215c.G()) {
                return;
            }
            this.f84222f.setVisibility(0);
        }
    }

    private void z9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameImpressionDialogFragment gameImpressionDialogFragmentA = GameImpressionDialogFragment.f84468q.a(this.Z);
        gameImpressionDialogFragmentA.f4(new j0());
        gameImpressionDialogFragmentA.show(getChildFragmentManager(), "GameImpressionDialogFragment");
    }

    public void D8(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32811, new Class[]{String.class}, Void.TYPE).isSupported && isActive()) {
            if (com.max.hbcommon.utils.c.u(str)) {
                str = this.Z;
            }
            com.max.xiaoheihe.module.game.a0.a4(this.mContext, str, getChildFragmentManager(), this);
        }
    }

    public void G9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32714, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f84268y4)) {
            return;
        }
        com.max.hbcommon.analytics.l.f66572a.m(lb.d.f131194k3, getPageAdditional());
        com.max.xiaoheihe.module.game.d1.Z3("基本信息", this.f84268y4).show(getFragmentManager(), "GameTagDialogFragment");
    }

    @Override // com.max.xiaoheihe.module.account.p0
    public void P1(@androidx.annotation.p0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32812, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            AccelWorldScreenShotKt.d(str, new SourceInfoObj(SourceType.game.getKey(), this.Z));
            if (!ad.a.a(ad.a.f1202i, true) || !isActive() || this.f84267y2 == null || str == null) {
                return;
            }
            File file = new File(str);
            if (file.exists()) {
                HBShareData hBShareData = new HBShareData(true);
                hBShareData.setShareListener(new com.max.hbshare.c.b(com.max.hbshare.c.f72568x, new q1()));
                hBShareData.setUmImage(new UMImage(this.mContext, file));
                ArrayList arrayList = new ArrayList();
                if (this.f84267y2.getTopic_detail() != null) {
                    arrayList.add(AccelWorldScreenShotKt.a(this.mContext, file, this.f84267y2.getTopic_detail(), com.max.hbshare.c.f72568x));
                }
                arrayList.add(com.max.hbshare.d.l(this.mContext, hBShareData));
                arrayList.add(C7());
                arrayList.add(com.max.hbshare.d.g(this.mContext, hBShareData));
                arrayList.add(com.max.hbshare.d.m(this.mContext, hBShareData));
                arrayList.add(com.max.hbshare.d.f(this.mContext, hBShareData));
                arrayList.add(com.max.hbshare.d.k(this.mContext, hBShareData));
                hBShareData.setShareActionList(arrayList);
                hBShareData.setShareFilePath(str);
                com.max.hbshare.d.p(this.mContext, hBShareData);
            }
        } catch (Throwable unused) {
        }
    }

    public Map<String, String> getFilter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32796, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap(16);
        List<FilterGroup> list = this.f84217c4;
        if (list != null) {
            for (FilterGroup filterGroup : list) {
                String key = filterGroup.getKey();
                if (filterGroup.isNormalSlider()) {
                    if (filterGroup.getCustom_range() != null) {
                        map.put(key, filterGroup.getCustom_range().getStart().getKey() + Constants.ACCEPT_TIME_SEPARATOR_SP + filterGroup.getCustom_range().getEnd().getKey());
                    }
                } else if (FilterGroup.TYPE_SLIDER_TREND_WITH_SWITCH.equals(filterGroup.getType())) {
                    if (filterGroup.getCustom_switch_key() != null) {
                        map.put(filterGroup.getSwitchoptions().getKey(), filterGroup.getCustom_switch_key());
                    }
                    if (filterGroup.getCustom_range() != null) {
                        map.put(key, filterGroup.getCustom_range().getStart().getKey() + Constants.ACCEPT_TIME_SEPARATOR_SP + filterGroup.getCustom_range().getEnd().getKey());
                    }
                } else if (!FilterGroup.TYPE_MULTI.equals(filterGroup.getType())) {
                    FilterItem filterItemH = SecondaryWindowSegmentFilterView.h(filterGroup);
                    if (filterItemH != null) {
                        map.put(key, filterItemH.getKey());
                    }
                } else if (!com.max.hbcommon.utils.c.w(filterGroup.getFilters())) {
                    StringBuilder sb2 = new StringBuilder();
                    for (FilterItem filterItem : filterGroup.getFilters()) {
                        if (filterItem.isCustom_checked()) {
                            if (sb2.length() > 0) {
                                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            }
                            sb2.append(filterItem.getKey());
                        }
                    }
                    if (sb2.length() > 0) {
                        map.put(key, sb2.toString());
                    }
                }
            }
        }
        return map;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32806, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        if (!com.max.hbcommon.utils.c.u(this.Z)) {
            jsonObject.addProperty("app_id", this.Z);
        }
        if (!com.max.hbcommon.utils.c.u(this.f84262x1)) {
            jsonObject.addProperty("sku_id", this.f84262x1);
        }
        if (!com.max.hbcommon.utils.c.u(this.f84266y1)) {
            jsonObject.addProperty("h_src", this.f84266y1);
        }
        GameDetailsWrapperObj gameDetailsWrapperObj = this.f84267y2;
        if (gameDetailsWrapperObj != null && gameDetailsWrapperObj.getPrice() != null) {
            jsonObject.addProperty("super_lowest", this.f84267y2.getPrice().isSuper_lowest() ? "1" : "0");
            jsonObject.addProperty("new_lowest", this.f84267y2.getPrice().getNew_lowest());
            jsonObject.addProperty("is_lowest", this.f84267y2.getPrice().getIs_lowest());
        }
        jsonObject.addProperty("game_type", this.f84244p2);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32684, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        a2 a2Var = this.T3;
        if (a2Var != null) {
            a2Var.Z(false, this.f84244p2, this.Z);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32681, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        c9 c9VarC = c9.c(this.mInflater);
        this.f84270z4 = c9VarC;
        setContentView(c9VarC);
        this.A4 = nk.a(this.f84270z4.b());
        if (getArguments() != null) {
            this.Z = getArguments().getString(G4);
            this.f84210a0 = getArguments().getString("game_type");
            this.f84213b0 = getArguments().getString("player_id");
            this.f84266y1 = getArguments().getString("h_src");
            this.f84244p2 = getArguments().getString("platform");
            this.f84216c0 = getArguments().getString("steam_id");
            this.f84243p1 = getArguments().getString(K4);
            this.f84267y2 = (GameDetailsWrapperObj) getArguments().getSerializable(L4);
            this.f84262x1 = getArguments().getString("sku_id");
            this.f84221e4 = getArguments().getBoolean(Q4);
            this.f84239n4 = getArguments().getString("top_comment_id");
            this.f84246p4 = getArguments().getString(ChannelsDetailActivity.f79599i4);
            this.f84248q4 = getArguments().getLong(ChannelsDetailActivity.f79600j4);
            this.f84250r4 = com.max.hbcommon.utils.c.x(getArguments().getString(ChannelsDetailActivity.f79601k4));
            this.f84263x2 = getArguments().getString(S4);
        }
        this.S3 = !com.max.hbcommon.utils.c.u(this.f84262x1);
        this.f84270z4.f109230f.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f84270z4.f109231g.setBackgroundResource(R.color.divider_secondary_2_color);
        com.max.xiaoheihe.module.game.adapter.m mVar = new com.max.xiaoheihe.module.game.adapter.m((BaseActivity) this.mContext, this.K3);
        this.J3 = mVar;
        mVar.S(new v());
        this.J3.T(this.P3);
        this.J3.P(this.f84270z4.f109240p.b());
        this.J3.O(this.f84270z4.f109228d);
        this.W = (CardView) findViewById(R.id.cv_game_video_and_price);
        this.f84220e = (ViewPager2) findViewById(R.id.vp2);
        this.f84215c = new VideoViewX(this.mContext);
        this.f84222f = (LinearLayout) findViewById(R.id.ll_platforms);
        this.f84224g = (RecyclerView) findViewById(R.id.rv_screenshots);
        this.f84232k = (LinearLayout) findViewById(R.id.vg_price_bg);
        this.f84234l = findViewById(R.id.vg_price);
        this.f84236m = (TextView) findViewById(R.id.tv_current_price);
        this.f84238n = (TextView) findViewById(R.id.tv_lowest_discount_and_price);
        this.f84240o = findViewById(R.id.vg_discount_sale);
        this.f84242p = (TextView) findViewById(R.id.tv_minimum_price);
        this.f84247q = (ImageView) findViewById(R.id.iv_icon);
        this.f84249r = (TextView) findViewById(R.id.tv_name);
        this.f84251s = (TextView) findViewById(R.id.tv_name_en);
        this.f84253t = (CardView) findViewById(R.id.vg_score);
        this.f84255u = (CardView) findViewById(R.id.vg_follow_container);
        this.f84257v = (RecyclerView) findViewById(R.id.ll_tags);
        this.f84259w = (LinearLayout) findViewById(R.id.ll_platform_tags);
        this.f84261x = (LinearLayout) findViewById(R.id.ll_user_num);
        this.f84265y = (RecyclerView) findViewById(R.id.ll_user_num_preview);
        this.f84269z = (TextView) findViewById(R.id.tv_user_num_expand);
        this.A = (ListSectionHeader) findViewById(R.id.lsh_game_desc);
        this.C = (LinearLayout) findViewById(R.id.ll_menu_2);
        this.D = (ViewGroup) findViewById(R.id.vg_hardware_info);
        this.E = findViewById(R.id.space_ll_menu_2);
        this.F = findViewById(R.id.vg_developers_words);
        this.G = (TextView) findViewById(R.id.tv_developers_words_time);
        this.H = (TextView) findViewById(R.id.tv_game_desc);
        this.I = (RecyclerView) findViewById(R.id.rv_dlc);
        this.J = (RecyclerView) findViewById(R.id.rv_subscribe_awards);
        this.K = findViewById(R.id.vg_region_price_title);
        this.L = (LinearLayout) findViewById(R.id.ll_region_price);
        this.N = (TextView) findViewById(R.id.tv_coupon_tag);
        this.O = (TextView) findViewById(R.id.tv_current_price_desc);
        this.P = (LinearLayout) findViewById(R.id.ll_rich_tags);
        this.Q = findViewById(R.id.ll_price_left);
        this.R = (RichStackModelView) findViewById(R.id.v_rich_stack);
        this.V = (ViewGroup) this.K.findViewById(R.id.vg_platform_tag);
        bb.d.d(this.f84242p, 0);
        Activity activity = this.mContext;
        this.f84242p.setBackground(com.max.hbutils.utils.q.o(this.mContext, R.color.white_alpha20, ViewUtils.h0(activity, ViewUtils.m(activity, 0, ViewUtils.f(activity, 30.0f)))));
        int iL = (int) (((ViewUtils.L(this.mContext) * 211.0f) / 375.0f) + 0.5f);
        ViewGroup.LayoutParams layoutParams = this.f84220e.getLayoutParams();
        if (layoutParams.height != iL) {
            layoutParams.height = iL;
            this.f84220e.setLayoutParams(layoutParams);
        }
        w wVar = new w(this.mContext, this.f84230j, R.layout.item_video_big_screen);
        this.f84228i = wVar;
        this.f84220e.setAdapter(wVar);
        this.W.setVisibility(0);
        b8();
        this.f84270z4.f109230f.setAdapter(this.J3);
        this.f84270z4.f109231g.S(new o0());
        this.f84270z4.f109231g.k0(new z0());
        this.f84270z4.f109231g.V(true);
        this.f84270z4.f109231g.a(true);
        this.f84270z4.f109231g.f0(new k1());
        this.f84270z4.f109226b.setOnVerticalScrollChangeListener(new u1());
        if (this.mIsFirst) {
            showLoading();
        }
        this.f84227h4 = new v1(this.mContext, this.f84229i4, R.layout.layout_game_award);
        this.B = (RecyclerView) findViewById(R.id.rv_game_award);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(0);
        this.B.setLayoutManager(linearLayoutManager);
        this.B.addItemDecoration(new w1());
        this.B.setAdapter(this.f84227h4);
        n9();
        this.f84235l4 = System.currentTimeMillis();
        this.f84254t4 = new com.max.hbcommon.analytics.j(new y1(this));
        new OneTimeValidExposureViewWatcher(this, this.f84249r);
    }

    @Override // com.max.xiaoheihe.module.mall.i.d
    public void o(MallRegisterOrderObj mallRegisterOrderObj) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        boolean z10 = false;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, com.umeng.commonsdk.internal.a.f105211u, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1) {
            if (i10 == 3) {
                GameDetailsWrapperObj gameDetailsWrapperObj = this.f84267y2;
                if (gameDetailsWrapperObj != null && gameDetailsWrapperObj.getGameDetailsObj() != null && this.f84267y2.getGameDetailsObj().getDisplay_add_wishlist() != null) {
                    this.f84267y2.getGameDetailsObj().setDisplay_add_wishlist("2");
                    G8();
                }
                J9();
                return;
            }
            if (i10 == 9991 && intent != null) {
                PostUtils.s((AppCompatActivity) this.mContext, intent);
                return;
            }
            if ((i10 == 1 || i10 == 2) && intent != null) {
                z10 = true;
            }
            if (z10) {
                this.f84267y2.setUser_comment((LinkInfoObj) intent.getSerializableExtra("comment"));
                this.R3 = true;
                a2 a2Var = this.T3;
                if (a2Var != null) {
                    a2Var.Z(true, this.f84244p2, this.Z);
                }
            }
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 32678, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof a2) {
            this.T3 = (a2) getParentFragment();
            return;
        }
        if (context instanceof a2) {
            this.T3 = (a2) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement GameDetailInteractionListener");
    }

    public boolean onBackPressed() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105216z, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        VideoViewX videoViewX = this.f84215c;
        if (videoViewX == null || !videoViewX.D()) {
            return false;
        }
        L9(false);
        return true;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105214x, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84254t4.d();
        this.f84254t4 = null;
        this.J3 = null;
        com.max.xiaoheihe.module.game.b bVar = this.f84219d4;
        if (bVar != null) {
            bVar.g();
            this.f84219d4 = null;
        }
        this.I = null;
        View view = this.T;
        if (view != null) {
            view.setOnClickListener(null);
            this.T = null;
        }
        this.f84227h4 = null;
        List<GameAwardObj> list = this.f84229i4;
        if (list != null) {
            list.clear();
            this.f84229i4 = null;
        }
        this.Q3 = null;
        List<GameScreenshotObj> list2 = this.f84230j;
        if (list2 != null) {
            list2.clear();
            this.f84230j = null;
        }
        this.f84226h = null;
        CardView cardView = this.f84253t;
        if (cardView != null) {
            cardView.setOnClickListener(null);
            this.f84253t = null;
        }
        this.f84224g = null;
        this.J = null;
        this.f84257v = null;
        this.f84265y = null;
        this.f84215c = null;
        PlainVideoUI plainVideoUI = this.f84218d;
        if (plainVideoUI != null) {
            plainVideoUI.setOrientationChangeListener(null);
            this.f84218d = null;
        }
        ViewPager2 viewPager2 = this.f84220e;
        if (viewPager2 != null) {
            b2 b2Var = this.D4;
            if (b2Var != null) {
                viewPager2.removeCallbacks(b2Var);
            }
            this.f84220e.unregisterOnPageChangeCallback(this.F4);
        }
        this.f84228i = null;
        t7(getView());
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105213w, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoViewX videoViewX = this.f84215c;
        if (videoViewX != null) {
            videoViewX.Q();
        }
        this.f84219d4.g();
        this.f84233k4.removeCallbacksAndMessages(null);
        if (ad.a.d()) {
            this.J3 = null;
            this.f84257v = null;
            this.f84265y = null;
            this.B = null;
            this.I = null;
            this.J = null;
            this.f84224g = null;
        }
        this.f84268y4.clear();
        this.K3.clear();
        this.L3.clear();
        this.M3.clear();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32679, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.T3 = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentHide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32802, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentHide();
        if (d8()) {
            r8();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.C, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        if (d8()) {
            s8();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onInvisible() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105212v, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoViewX videoViewX = this.f84215c;
        if (videoViewX != null) {
            videoViewX.K();
        }
        super.onInvisible();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105210t, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        VideoViewX videoViewX = this.f84215c;
        if (videoViewX != null) {
            videoViewX.K();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.A, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        a2 a2Var = this.T3;
        if (a2Var != null) {
            a2Var.Z(false, this.f84244p2, this.Z);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32682, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        k kVar = null;
        NetworkBroadcastReceiver networkBroadcastReceiver = new NetworkBroadcastReceiver(this, kVar);
        this.U3 = networkBroadcastReceiver;
        registerReceiver(networkBroadcastReceiver, "android.net.conn.CONNECTIVITY_CHANGE");
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, kVar);
        this.V3 = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.A);
        RefreshBroadcastReceiver refreshBroadcastReceiver2 = new RefreshBroadcastReceiver(this, kVar);
        this.W3 = refreshBroadcastReceiver2;
        registerReceiver(refreshBroadcastReceiver2, lb.a.V);
        ShowOrderTipBroadcastReceiver showOrderTipBroadcastReceiver = new ShowOrderTipBroadcastReceiver(this, kVar);
        this.X3 = showOrderTipBroadcastReceiver;
        registerReceiver(showOrderTipBroadcastReceiver, lb.a.R);
        GameCommentRefreshBroadcastReceiver gameCommentRefreshBroadcastReceiver = new GameCommentRefreshBroadcastReceiver(this, kVar);
        this.Y3 = gameCommentRefreshBroadcastReceiver;
        registerReceiver(gameCommentRefreshBroadcastReceiver, lb.a.W);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        a2 a2Var;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105209s, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (!this.R3 || this.f84267y2 == null || (a2Var = this.T3) == null) {
            return;
        }
        this.R3 = false;
        if (a2Var.I()) {
            return;
        }
        this.G3 = 0;
        E7();
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.umeng.commonsdk.internal.a.f105215y, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        NetworkBroadcastReceiver networkBroadcastReceiver = this.U3;
        if (networkBroadcastReceiver != null) {
            unregisterReceiver(networkBroadcastReceiver);
        }
        RefreshBroadcastReceiver refreshBroadcastReceiver = this.V3;
        if (refreshBroadcastReceiver != null) {
            unregisterReceiver(refreshBroadcastReceiver);
        }
        RefreshBroadcastReceiver refreshBroadcastReceiver2 = this.W3;
        if (refreshBroadcastReceiver2 != null) {
            unregisterReceiver(refreshBroadcastReceiver2);
        }
        ShowOrderTipBroadcastReceiver showOrderTipBroadcastReceiver = this.X3;
        if (showOrderTipBroadcastReceiver != null) {
            unregisterReceiver(showOrderTipBroadcastReceiver);
        }
        GameCommentRefreshBroadcastReceiver gameCommentRefreshBroadcastReceiver = this.Y3;
        if (gameCommentRefreshBroadcastReceiver != null) {
            unregisterReceiver(gameCommentRefreshBroadcastReceiver);
        }
    }

    public void q8(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32733, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = -(i10 - 1);
        this.f84270z4.f109228d.setTranslationY(f10);
        this.f84270z4.f109237m.setTranslationY(f10);
        this.f84270z4.f109238n.setTranslationY(f10);
        BubbleView bubbleView = this.f84231j4;
        if (bubbleView != null) {
            bubbleView.setTranslationY(f10);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32680, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setUserVisibleHint(z10);
        if (z10) {
            long j10 = this.f84237m4;
            if (j10 == 0) {
                this.f84233k4.sendEmptyMessageDelayed(1, 15000L);
            } else {
                long j11 = 15000 - (j10 - this.f84235l4);
                if (j11 > 0) {
                    this.f84233k4.sendEmptyMessageDelayed(1, j11);
                }
            }
        } else if (this.f84235l4 > 0) {
            this.f84237m4 = System.currentTimeMillis();
            if (this.f84233k4.hasMessages(1)) {
                this.f84233k4.removeMessages(1);
            }
        }
        Log.d("GameDetailFragment", "setUserVisibleHint: " + z10);
        Log.d("GameDetailFragment", "mCreateTime: " + this.f84235l4);
        Log.d("GameDetailFragment", "mHideTime: " + this.f84237m4);
    }

    public void t8(GameDetailsWrapperObj gameDetailsWrapperObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameDetailsWrapperObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32692, new Class[]{GameDetailsWrapperObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f84267y2 = gameDetailsWrapperObj;
        this.N3 = false;
        this.O3 = false;
        if (gameDetailsWrapperObj != null && !com.max.hbcommon.utils.c.u(gameDetailsWrapperObj.getGame_type())) {
            this.f84210a0 = this.f84267y2.getGame_type();
        }
        GameDetailsWrapperObj gameDetailsWrapperObj2 = this.f84267y2;
        this.f84244p2 = gameDetailsWrapperObj2 != null ? gameDetailsWrapperObj2.getPlatf() : null;
        ViewGroup viewGroup = this.V;
        GameDetailsWrapperObj gameDetailsWrapperObj3 = this.f84267y2;
        viewGroup.setVisibility(com.max.hbcommon.utils.c.x(gameDetailsWrapperObj3 != null ? gameDetailsWrapperObj3.getShow_authentic_guarantee() : null) ? 0 : 8);
        ViewGroup viewGroup2 = this.V;
        viewGroup2.setBackground(ViewUtils.G(ViewUtils.o(this.mContext, viewGroup2), com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color)));
        f9();
        GameDetailsWrapperObj gameDetailsWrapperObj4 = this.f84267y2;
        M8(gameDetailsWrapperObj4 != null ? gameDetailsWrapperObj4.getLatest_event() : null);
        this.f84270z4.f109231g.A(0);
        this.f84270z4.f109231g.p(0);
        showContentView();
        if (gameDetailsWrapperObj == null) {
            showError();
            return;
        }
        if (com.max.hbcommon.utils.c.x(this.f84267y2.getShow_luck_coupon())) {
            com.max.xiaoheihe.module.mall.q.g4(this.Z, this.f84266y1).show(getChildFragmentManager(), "FreshManDiscountDialogFragment");
        }
        U8();
        G8();
        if (gameDetailsWrapperObj.getTopic_detail() != null) {
            if (!z10) {
                this.G3 = 0;
                E7();
            }
            this.f84211a4 = true;
        } else {
            this.f84211a4 = false;
        }
        this.f84270z4.f109231g.i0(this.f84211a4);
        this.f84270z4.f109231g.b0(this.f84211a4);
        if (com.max.hbcommon.utils.c.u(gameDetailsWrapperObj.getLike_lottie_key())) {
            return;
        }
        this.J3.Q(gameDetailsWrapperObj.getLike_lottie_key());
    }

    public void x9(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32810, new Class[]{String.class}, Void.TYPE).isSupported && isActive()) {
            if (com.max.hbcommon.utils.c.u(str)) {
                str = this.Z;
            }
            com.max.xiaoheihe.module.game.i.a4(str).show(getChildFragmentManager(), W4);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("app_id", this.Z);
            com.max.hbcommon.analytics.d.d("4", lb.d.f131229p3, null, jsonObject);
        }
    }
}
