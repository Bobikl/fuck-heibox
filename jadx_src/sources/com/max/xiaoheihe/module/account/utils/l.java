package com.max.xiaoheihe.module.account.utils;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Handler;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.github.penfeizhou.animation.apng.decode.APNGParser;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.SearchView;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AchieveObj;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.ISteamOnlineState;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.max.xiaoheihe.bean.account.SteamNativeObj;
import com.max.xiaoheihe.bean.account.steaminfo.BindSteamUrlResult;
import com.max.xiaoheihe.bean.account.steaminfo.SteamPrivacyJsObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamPublicSettingObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicMenuObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePlayStatObj;
import com.max.xiaoheihe.bean.game.steamproxy.BaseProxyParamObj;
import com.max.xiaoheihe.bean.game.steamproxy.SteamHttpProxyObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.proxy.ProxyItemObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.module.account.SteamPrivacyActivity;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.SteamBindActivity;
import com.max.xiaoheihe.module.game.component.GameAchieveItemView;
import com.max.xiaoheihe.module.game.component.GameDetailDataItemView;
import com.max.xiaoheihe.module.game.component.GameTimeAchieveItemView;
import com.max.xiaoheihe.module.game.component.PlatformDataView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.mall.ProxyType;
import com.max.xiaoheihe.module.proxy.ProxyManager;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.max.xiaoheihe.module.webview.HostPingHelper;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.b2;

/* JADX INFO: compiled from: SteamInfoUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f79321a = "SteamInfoUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Timer f79322b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f79323c = "weeks";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f79324d = "achievement";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f79325e = "all";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f79326f = "none";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f79327g = "search";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f79328h = "search_cancel";

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f79329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f79330c;

        a(List list, k0 k0Var) {
            this.f79329b = list;
            this.f79330c = k0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25485, new Class[]{View.class}, Void.TYPE).isSupported || (list = this.f79329b) == null || list.size() <= 2 || this.f79329b.get(2) == null || ((KeyDescObj) this.f79329b.get(2)).getKey() == null) {
                return;
            }
            this.f79330c.a(((KeyDescObj) this.f79329b.get(2)).getKey());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class a0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25521, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f79331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f79332c;

        b(List list, k0 k0Var) {
            this.f79331b = list;
            this.f79332c = k0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25486, new Class[]{View.class}, Void.TYPE).isSupported || (list = this.f79331b) == null || list.size() <= 3 || this.f79331b.get(3) == null || ((KeyDescObj) this.f79331b.get(3)).getKey() == null) {
                return;
            }
            this.f79332c.a(((KeyDescObj) this.f79331b.get(3)).getKey());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class b0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79333b;

        b0(String str) {
            this.f79333b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25522, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            com.max.xiaoheihe.network.i.a().R2(this.f79333b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0 f79334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f79335c;

        c(k0 k0Var, int i10) {
            this.f79334b = k0Var;
            this.f79335c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25487, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f79334b.a(Integer.valueOf(this.f79335c));
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public static /* synthetic */ class c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79336a;

        static {
            int[] iArr = new int[GameTimeAchieveItemView.Type.valuesCustom().length];
            f79336a = iArr;
            try {
                iArr[GameTimeAchieveItemView.Type.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79336a[GameTimeAchieveItemView.Type.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79336a[GameTimeAchieveItemView.Type.Achievement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f79336a[GameTimeAchieveItemView.Type.GameRate.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79340e;

        d(Context context, String str, String str2, String str3) {
            this.f79337b = context;
            this.f79338c = str;
            this.f79339d = str2;
            this.f79340e = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25488, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f79337b;
            context.startActivity(com.max.xiaoheihe.module.game.z.b(context, this.f79338c, this.f79339d, this.f79340e, null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f79341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f79342c;

        d0(HomeDataObj homeDataObj, Context context) {
            this.f79341b = homeDataObj;
            this.f79342c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25513, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f79341b.getSteam_id_info().getApi_key_protocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f79342c, this.f79341b.getSteam_id_info().getApi_key_protocol());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class e extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e(int i10) {
            super(i10);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class e0 implements com.max.xiaoheihe.module.account.utils.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f79343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SteamNativeObj f79344b;

        e0(TextView textView, SteamNativeObj steamNativeObj) {
            this.f79343a = textView;
            this.f79344b = steamNativeObj;
        }

        @Override // com.max.xiaoheihe.module.account.utils.b
        public void onError() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25524, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f79343a.setVisibility(0);
            l.X(this.f79343a, this.f79344b.getPersonastate(), this.f79344b.getGameid());
        }

        @Override // com.max.xiaoheihe.module.account.utils.b
        public void onSuccess() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25523, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f79343a.setVisibility(0);
            l.X(this.f79343a, this.f79344b.getPersonastate(), this.f79344b.getGameid());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class f extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        f(int i10) {
            super(i10);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameTimeAchieveItemView f79345b;

        f0(GameTimeAchieveItemView gameTimeAchieveItemView) {
            this.f79345b = gameTimeAchieveItemView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25525, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String strA = GameTimeAchieveItemView.f86832z.a();
            if (com.max.hbcommon.utils.c.u(strA)) {
                strA = com.max.xiaoheihe.utils.d.n0(R.string.not_owned_tips);
            }
            l.d0(this.f79345b.getVg_not_owned().getContext(), this.f79345b.getIv_not_owned_help(), strA, true, 60, 10, true);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameAchieveItemView f79346b;

        g(GameAchieveItemView gameAchieveItemView) {
            this.f79346b = gameAchieveItemView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 25489, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f79346b.f86625i.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class g0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f79348c;

        g0(Context context, GameObj gameObj) {
            this.f79347b = context;
            this.f79348c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25526, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k(this.f79347b, r1.Z(this.f79348c), 0, null, false).A();
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class h implements com.max.xiaoheihe.module.account.utils.m.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f79349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GamePlayStatObj f79350b;

        h(Context context, GamePlayStatObj gamePlayStatObj) {
            this.f79349a = context;
            this.f79350b = gamePlayStatObj;
        }

        @Override // com.max.xiaoheihe.module.account.utils.m.b
        public int a() {
            return 4;
        }

        @Override // com.max.xiaoheihe.module.account.utils.m.b
        public void b(View view, int i10) {
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 25491, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ViewUtils.f(this.f79349a, 50.0f));
            layoutParams.weight = 1.0f;
            layoutParams.setMargins(ViewUtils.f(this.f79349a, 2.0f), ViewUtils.f(this.f79349a, 0.0f), ViewUtils.f(this.f79349a, 2.0f), ViewUtils.f(this.f79349a, 0.0f));
            view.setLayoutParams(layoutParams);
            GameDetailDataItemView gameDetailDataItemView = (GameDetailDataItemView) view.findViewById(R.id.gddiv);
            gameDetailDataItemView.setType(GameDetailDataItemView.ValueType.Text);
            if (i10 == 0) {
                gameDetailDataItemView.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.achievement_point));
                gameDetailDataItemView.setValueText(this.f79350b.getAchieved_point());
                try {
                    view.setBackgroundDrawable(ViewUtils.x(0, com.max.xiaoheihe.utils.d.e1(this.f79350b.getAchieved_start_color()), com.max.xiaoheihe.utils.d.e1(this.f79350b.getAchieved_end_color())));
                    gameDetailDataItemView.f86711g.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.tablayout_bg_not_change));
                    gameDetailDataItemView.setValueColor(com.max.xiaoheihe.utils.d.E(R.color.tablayout_bg_not_change));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i10 == 1) {
                gameDetailDataItemView.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.achievement_point_rank));
                gameDetailDataItemView.setValueText(this.f79350b.getAchieved_rank());
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                gameDetailDataItemView.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.game_time_rank));
                gameDetailDataItemView.setValueText(this.f79350b.getPlaytime_rank());
                return;
            }
            gameDetailDataItemView.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.achievement));
            gameDetailDataItemView.setType(GameDetailDataItemView.ValueType.OnlyValue);
            if (this.f79350b.getAchivement_count() == 0) {
                gameDetailDataItemView.setOnlyValue("-/-");
            } else {
                gameDetailDataItemView.setOnlyValue(Html.fromHtml(String.format("%s<font color=\"#8C9196\">/%s</font>", Integer.valueOf(this.f79350b.getAchieved_count()), Integer.valueOf(this.f79350b.getAchivement_count()))).toString());
            }
        }

        @Override // com.max.xiaoheihe.module.account.utils.m.b
        public View c(LayoutInflater layoutInflater, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, new Integer(i10)}, this, changeQuickRedirect, false, 25490, new Class[]{LayoutInflater.class, Integer.TYPE}, View.class);
            return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : layoutInflater.inflate(R.layout.item_expandable_grid, (ViewGroup) null);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class h0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameObj f79351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f79352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f79355f;

        h0(GameObj gameObj, Context context, String str, String str2, String str3) {
            this.f79351b = gameObj;
            this.f79352c = context;
            this.f79353d = str;
            this.f79354e = str2;
            this.f79355f = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25527, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f79351b.getProtocol())) {
                com.max.xiaoheihe.base.router.b.j0(this.f79352c, this.f79351b.getProtocol());
            } else {
                if (com.max.hbcommon.utils.c.u(r1.Z(this.f79351b))) {
                    return;
                }
                Context context = this.f79352c;
                context.startActivity(ChannelsDetailActivity.l3(context, null, null, r1.Z(this.f79351b), this.f79351b.getGame_type(), this.f79353d, this.f79354e, this.f79355f, null, BBSTopicMenuObj.TYPE_STATISTIC));
            }
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressBar f79356b;

        i(ProgressBar progressBar) {
            this.f79356b = progressBar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 25492, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f79356b.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class i0 implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressBar f79357b;

        i0(ProgressBar progressBar) {
            this.f79357b = progressBar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 25528, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f79357b.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f79359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79361e;

        j(String str, Context context, String str2, String str3) {
            this.f79358b = str;
            this.f79359c = context;
            this.f79360d = str2;
            this.f79361e = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25493, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f79358b)) {
                return;
            }
            Context context = this.f79359c;
            context.startActivity(com.max.xiaoheihe.module.game.z.b(context, null, this.f79358b, "pc", null, this.f79360d, this.f79361e, null));
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class j0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f79362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f79363c;

        j0(List list, k0 k0Var) {
            this.f79362b = list;
            this.f79363c = k0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25529, new Class[]{View.class}, Void.TYPE).isSupported || (list = this.f79362b) == null || list.size() <= 1 || this.f79362b.get(1) == null || ((KeyDescObj) this.f79362b.get(1)).getKey() == null) {
                return;
            }
            this.f79363c.a(((KeyDescObj) this.f79362b.get(1)).getKey());
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class k extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f79364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewAnimator f79365c;

        k(Handler handler, ViewAnimator viewAnimator) {
            this.f79364b = handler;
            this.f79365c = viewAnimator;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25484, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Handler handler = this.f79364b;
            final ViewAnimator viewAnimator = this.f79365c;
            Objects.requireNonNull(viewAnimator);
            handler.post(new Runnable() { // from class: com.max.xiaoheihe.module.account.utils.k
                @Override // java.lang.Runnable
                public final void run() {
                    viewAnimator.showNext();
                }
            });
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public interface k0<T> {
        void a(T t10);
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.utils.l$l, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class C0661l implements Comparator<ISteamOnlineState> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0661l() {
        }

        public int a(ISteamOnlineState iSteamOnlineState, ISteamOnlineState iSteamOnlineState2) {
            int i10;
            int i11 = 2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iSteamOnlineState, iSteamOnlineState2}, this, changeQuickRedirect, false, 25495, new Class[]{ISteamOnlineState.class, ISteamOnlineState.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (iSteamOnlineState.getSteamPersonastate() != 1 || com.max.hbcommon.utils.c.u(iSteamOnlineState.getSteamGameextrainfo())) {
                i10 = iSteamOnlineState.getSteamPersonastate() != 0 ? 2 : 0;
            } else {
                i10 = 4;
            }
            boolean z10 = iSteamOnlineState instanceof PlayerRankObj;
            if (z10 && "1".equals(((PlayerRankObj) iSteamOnlineState).getHas_heybox())) {
                i10++;
            }
            if (iSteamOnlineState2.getSteamPersonastate() == 1 && !com.max.hbcommon.utils.c.u(iSteamOnlineState2.getSteamGameextrainfo())) {
                i11 = 4;
            } else if (iSteamOnlineState2.getSteamPersonastate() == 0) {
                i11 = 0;
            }
            if (z10 && "1".equals(((PlayerRankObj) iSteamOnlineState2).getHas_heybox())) {
                i11++;
            }
            return i11 - i10;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ISteamOnlineState iSteamOnlineState, ISteamOnlineState iSteamOnlineState2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iSteamOnlineState, iSteamOnlineState2}, this, changeQuickRedirect, false, 25496, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(iSteamOnlineState, iSteamOnlineState2);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public interface l0 {
        void a(Map<String, Object> map, String str);
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class m extends com.max.hbcommon.network.d<Result<BindSteamUrlResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f79366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f79368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f79369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f79370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f79371g;

        /* JADX INFO: compiled from: SteamInfoUtils.java */
        public class a implements ProxyManager.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BindSteamUrlResult f79372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f79373b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProxyManager f79374c;

            a(BindSteamUrlResult bindSteamUrlResult, String str, ProxyManager proxyManager) {
                this.f79372a = bindSteamUrlResult;
                this.f79373b = str;
                this.f79374c = proxyManager;
            }

            @Override // com.max.xiaoheihe.module.proxy.ProxyManager.a
            public void a(@p0 ProxyItemObj proxyItemObj) {
                if (PatchProxy.proxy(new Object[]{proxyItemObj}, this, changeQuickRedirect, false, 25499, new Class[]{ProxyItemObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (proxyItemObj != null) {
                    m mVar = m.this;
                    l.d(mVar.f79367c, this.f79372a, mVar.f79368d, mVar.f79369e, mVar.f79366b, mVar.f79370f, mVar.f79371g, proxyItemObj, this.f79373b, this.f79374c.f());
                } else {
                    m mVar2 = m.this;
                    l.e(mVar2.f79367c, mVar2.f79368d, mVar2.f79369e, mVar2.f79366b, mVar2.f79370f, mVar2.f79371g, this.f79372a);
                }
            }
        }

        m(boolean z10, String str, Activity activity, Fragment fragment, boolean z11, int i10) {
            this.f79366b = z10;
            this.f79367c = str;
            this.f79368d = activity;
            this.f79369e = fragment;
            this.f79370f = z11;
            this.f79371g = i10;
        }

        public void onNext(Result<BindSteamUrlResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25497, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            BindSteamUrlResult result2 = result.getResult();
            if (ad.a.a(ad.a.f1216w, false)) {
                l.e(this.f79367c, this.f79368d, this.f79369e, this.f79366b, this.f79370f, this.f79371g, result2);
                return;
            }
            String unbind_url = this.f79366b ? result2.getUnbind_url() : result2.getBind_url();
            ProxyManager proxyManager = new ProxyManager("bind_steam", unbind_url, null);
            proxyManager.q(new a(result2, unbind_url, proxyManager));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25498, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BindSteamUrlResult>) obj);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public @interface m0 {
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class n implements yh.a<b2> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BindSteamUrlResult f79377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f79378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f79379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f79380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f79381g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f79382h;

        n(String str, BindSteamUrlResult bindSteamUrlResult, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10) {
            this.f79376b = str;
            this.f79377c = bindSteamUrlResult;
            this.f79378d = activity;
            this.f79379e = fragment;
            this.f79380f = z10;
            this.f79381g = z11;
            this.f79382h = i10;
        }

        public b2 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25500, new Class[0], b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (b2) patchProxyResultProxy.result;
            }
            l.f(this.f79376b, this.f79377c, this.f79378d, this.f79379e, this.f79380f, this.f79381g, this.f79382h, ProxyType.ACC);
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25501, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class o implements HostPingHelper.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BindSteamUrlResult f79383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f79385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f79386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f79387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f79388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f79389g;

        o(BindSteamUrlResult bindSteamUrlResult, String str, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10) {
            this.f79383a = bindSteamUrlResult;
            this.f79384b = str;
            this.f79385c = activity;
            this.f79386d = fragment;
            this.f79387e = z10;
            this.f79388f = z11;
            this.f79389g = i10;
        }

        @Override // com.max.xiaoheihe.module.webview.HostPingHelper.a
        public void a(@p0 HashMap<String, String> map) {
            if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 25502, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f79383a.setHost(map);
            l.f(this.f79384b, this.f79383a, this.f79385c, this.f79386d, this.f79387e, this.f79388f, this.f79389g, ProxyType.DNS_IP_DIRECT);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class p implements yh.a<b2> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SteamPublicSettingObj f79390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f79391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f79392d;

        /* JADX INFO: compiled from: SteamInfoUtils.java */
        public class a implements HostPingHelper.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.module.webview.HostPingHelper.a
            public void a(@p0 HashMap<String, String> map) {
                if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 25505, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
                    return;
                }
                p.this.f79390b.setHost(map);
                p pVar = p.this;
                l.g(pVar.f79391c, pVar.f79390b, pVar.f79392d);
            }
        }

        p(SteamPublicSettingObj steamPublicSettingObj, Context context, boolean z10) {
            this.f79390b = steamPublicSettingObj;
            this.f79391c = context;
            this.f79392d = z10;
        }

        public b2 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25503, new Class[0], b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (b2) patchProxyResultProxy.result;
            }
            if (com.max.hbcommon.utils.i.d()) {
                l.g(this.f79391c, this.f79390b, this.f79392d);
                return null;
            }
            if (this.f79390b.getR_proxy() != null && com.max.hbcommon.utils.c.x(this.f79390b.getR_proxy().getEnable()) && !com.max.hbcommon.utils.c.u(this.f79390b.getR_url())) {
                l.g(this.f79391c, this.f79390b, this.f79392d);
                return null;
            }
            if (this.f79390b.getSteam_proxy() == null || this.f79390b.getSteam_proxy().getHosts() == null || this.f79390b.getSteam_proxy().getHosts().size() <= 0) {
                l.g(this.f79391c, this.f79390b, this.f79392d);
                return null;
            }
            HostPingHelper.b(this.f79391c, this.f79390b.getSteam_proxy().getHosts(), new a());
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25504, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class q implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25506, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class r extends com.bumptech.glide.request.target.n<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f79394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f79395f;

        r(int i10, View view) {
            this.f79394e = i10;
            this.f79395f = view;
        }

        public void c(@n0 Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            if (PatchProxy.proxy(new Object[]{bitmap, fVar}, this, changeQuickRedirect, false, 25507, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported || bitmap == null) {
                return;
            }
            com.max.hbcommon.utils.d.b("cqtest", "BitmapReady");
            this.f79395f.setBackground(new BitmapDrawable(Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 10) * this.f79394e, bitmap.getWidth(), bitmap.getHeight() / 10)));
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, 25508, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Bitmap) obj, fVar);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class s extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f79396b;

        s(ImageView imageView) {
            this.f79396b = imageView;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 25509, new Class[]{File.class}, Void.TYPE).isSupported || file == null) {
                return;
            }
            l.l(file, this.f79396b);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25510, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class t implements com.max.hbimage.b.s {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // com.max.hbimage.b.s
        public String getFileName(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25511, new Class[]{String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.s.d(str);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class u implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f79397a;

        u(List list) {
            this.f79397a = list;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 25512, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            int i10 = (int) f10;
            return (i10 < 0 || i10 >= this.f79397a.size()) ? "" : ((KeyDescObj) this.f79397a.get(i10)).getName();
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79399c;

        v(Context context, String str) {
            this.f79398b = context;
            this.f79399c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25494, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f79398b;
            context.startActivity(SteamPrivacyActivity.X1(context, this.f79399c));
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class w implements IValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), entry, new Integer(i10), viewPortHandler}, this, changeQuickRedirect, false, 25514, new Class[]{Float.TYPE, Entry.class, Integer.TYPE, ViewPortHandler.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (f10 >= 100000.0f) {
                return (String.format("%.1f", Float.valueOf(f10 / 10000.0f)) + RXScreenCaptureService.KEY_WIDTH).replace(".0", "");
            }
            if (f10 < 1000.0f) {
                return String.valueOf((int) f10);
            }
            return (String.format("%.1f", Float.valueOf(f10 / 1000.0f)) + "k").replace(".0", "");
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class x implements yh.a<b2> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseProxyParamObj f79400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f79401c;

        x(BaseProxyParamObj baseProxyParamObj, l0 l0Var) {
            this.f79400b = baseProxyParamObj;
            this.f79401c = l0Var;
        }

        public b2 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25515, new Class[0], b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (b2) patchProxyResultProxy.result;
            }
            l.h(this.f79400b, this.f79401c);
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25516, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class y implements HostPingHelper.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseProxyParamObj f79402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f79403b;

        y(BaseProxyParamObj baseProxyParamObj, l0 l0Var) {
            this.f79402a = baseProxyParamObj;
            this.f79403b = l0Var;
        }

        @Override // com.max.xiaoheihe.module.webview.HostPingHelper.a
        public void a(@p0 HashMap<String, String> map) {
            if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 25517, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f79402a.getSteam_proxy().setHost(map);
            l.h(this.f79402a, this.f79403b);
        }
    }

    /* JADX INFO: compiled from: SteamInfoUtils.java */
    public class z extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79404b;

        z(Context context) {
            this.f79404b = context;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25518, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25519, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            SteamWalletJsObj result2 = result.getResult();
            result2.setGameDlc(true);
            com.max.xiaoheihe.accelworld.p.b(this.f79404b, result2);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25520, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ec  */
    private static void A(BaseProxyParamObj baseProxyParamObj, l0 l0Var) {
        String str;
        if (PatchProxy.proxy(new Object[]{baseProxyParamObj, l0Var}, null, changeQuickRedirect, true, 25474, new Class[]{BaseProxyParamObj.class, l0.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        if (baseProxyParamObj != null) {
            String url = baseProxyParamObj.getUrl();
            if (!com.max.hbcommon.utils.i.d()) {
                if (baseProxyParamObj.getR_proxy() != null && com.max.hbcommon.utils.c.x(baseProxyParamObj.getR_proxy().getEnable()) && !com.max.hbcommon.utils.c.u(baseProxyParamObj.getR_url())) {
                    url = baseProxyParamObj.getR_url();
                    map.put(WebviewFragment.O4, "1");
                } else if (baseProxyParamObj.getSteam_proxy() != null) {
                    SteamHttpProxyObj steam_proxy = baseProxyParamObj.getSteam_proxy();
                    if (steam_proxy.getHost() != null && steam_proxy.getHost().size() > 0 && !com.max.hbcommon.utils.c.w(steam_proxy.getJs_list())) {
                        map.put("hosts", steam_proxy.getHost());
                        map.put(WebviewFragment.K4, steam_proxy.getJs_list());
                        map.put(WebviewFragment.I4, new IpDirectObj(steam_proxy.getHost(), steam_proxy.getJs_list()));
                    } else if (steam_proxy.getProxy() != null) {
                        String strC = com.max.hbcommon.utils.e.c(steam_proxy.getProxy().getP1(), com.max.xiaoheihe.utils.w.c(steam_proxy.getProxy().getP3()));
                        String str2 = null;
                        if (com.max.xiaoheihe.utils.d.a1(strC).equals(steam_proxy.getProxy().getP2())) {
                            String[] strArrSplit = strC.split(":");
                            if (strArrSplit.length > 1) {
                                str2 = strArrSplit[0];
                                str = strArrSplit[1];
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        if (!com.max.hbcommon.utils.c.v(str2, str)) {
                            map.put("host", str2);
                            map.put(HeyboxMicFragment.f93763y, str);
                            map.put(WebviewFragment.A4, new ProxyAddressObj(str2, str));
                        }
                    }
                }
            }
            map.put("pageurl", url);
            if (l0Var != null) {
                l0Var.a(map, url);
            }
        }
    }

    public static void B(String str, io.reactivex.disposables.a aVar, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10) {
        Object[] objArr = {str, aVar, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25466, new Class[]{String.class, io.reactivex.disposables.a.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        E(str, aVar, activity, fragment, z10, z11, i10);
    }

    public static com.max.hbcommon.network.d<Result<BindSteamUrlResult>> C(String str, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10) {
        Object[] objArr = {str, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25462, new Class[]{String.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE}, com.max.hbcommon.network.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.network.d) patchProxyResultProxy.result;
        }
        Matcher matcher = Pattern.compile("Chrome/(\\d+).").matcher(new WebView(activity).getSettings().getUserAgentString());
        return (com.max.hbcommon.network.d) com.max.xiaoheihe.network.i.a().g0(str, matcher.find() ? matcher.group(1) : "").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m(z10, str, activity, fragment, z11, i10));
    }

    public static void D(io.reactivex.disposables.a aVar, Activity activity, boolean z10, boolean z11, int i10) {
        Object[] objArr = {aVar, activity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25460, new Class[]{io.reactivex.disposables.a.class, Activity.class, cls, cls, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        E(null, aVar, activity, null, z10, z11, i10);
    }

    public static void E(String str, @p0 io.reactivex.disposables.a aVar, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10) {
        Object[] objArr = {str, aVar, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25461, new Class[]{String.class, io.reactivex.disposables.a.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            com.max.xiaoheihe.utils.d.h(activity);
        }
        if (aVar != null) {
            aVar.c(C(str, activity, fragment, z10, z11, i10));
        } else {
            C(str, activity, fragment, z10, z11, i10);
        }
    }

    public static void F(ViewGroup viewGroup, int i10, k0<Integer> k0Var) {
        if (PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10), k0Var}, null, changeQuickRedirect, true, 25442, new Class[]{ViewGroup.class, Integer.TYPE, k0.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        ViewGroup[] viewGroupArr = {(ViewGroup) viewGroup.findViewById(R.id.vg_item_achievement_title_recently), (ViewGroup) viewGroup.findViewById(R.id.vg_item_achievement_title_person), (ViewGroup) viewGroup.findViewById(R.id.vg_item_achievement_title_point)};
        ImageView[] imageViewArr = {(ImageView) viewGroup.findViewById(R.id.iv_item_achievement_title_recently), (ImageView) viewGroup.findViewById(R.id.iv_item_achievement_title_person), (ImageView) viewGroup.findViewById(R.id.iv_item_achievement_title_point)};
        for (int i11 = 0; i11 < 3; i11++) {
            imageViewArr[i11].setVisibility(8);
        }
        if (i10 != -1) {
            if (i10 < 0) {
                i10 = 0;
            }
            imageViewArr[i10 <= 2 ? i10 : 2].setVisibility(0);
        }
        if (k0Var != null) {
            for (int i12 = 0; i12 < 3; i12++) {
                viewGroupArr[i12].setOnClickListener(new c(k0Var, i12));
            }
        }
    }

    public static void G(Context context, List<KeyDescObj> list, BarChart barChart, int i10, int i11, boolean z10) {
        List<KeyDescObj> list2 = list;
        Object[] objArr = {context, list2, barChart, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25472, new Class[]{Context.class, List.class, BarChart.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int color = context.getResources().getColor(R.color.divider_secondary_1_color);
        int color2 = context.getResources().getColor(R.color.text_secondary_1_color);
        YAxis axisRight = barChart.getAxisRight();
        YAxis axisLeft = barChart.getAxisLeft();
        XAxis xAxis = barChart.getXAxis();
        ArrayList arrayList = new ArrayList();
        u uVar = new u(list2);
        int i12 = 0;
        while (i12 < list.size()) {
            KeyDescObj keyDescObj = list2.get(i12);
            arrayList.add(new BarEntry(i12, com.max.hbutils.utils.n.p(keyDescObj.getValue()), keyDescObj));
            i12++;
            list2 = list;
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, null);
        barDataSet.setDrawValues(z10);
        barDataSet.setValueFormatter(new w());
        Typeface typefaceA = com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b);
        if (typefaceA == null) {
            typefaceA = Typeface.DEFAULT;
        }
        barDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        barDataSet.setColor(context.getResources().getColor(R.color.orange_start));
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(0.5652174f);
        barChart.setData(barData);
        axisLeft.setLabelCount(5, true);
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setAxisLineColor(color);
        axisLeft.setTextColor(color2);
        axisLeft.setTypeface(typefaceA);
        axisLeft.setGridColor(color);
        float f10 = i11;
        axisLeft.setTextSize(f10);
        axisRight.setEnabled(false);
        xAxis.setAxisLineColor(color);
        xAxis.setGridColor(color);
        xAxis.setTextColor(color2);
        xAxis.setTextSize(f10);
        xAxis.setTypeface(typefaceA);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(uVar);
        xAxis.setLabelRotationAngle(i10);
        barChart.getDescription().setEnabled(false);
        barChart.getLegend().setEnabled(false);
        barChart.setScaleEnabled(false);
        barChart.setDragEnabled(false);
        barChart.notifyDataSetChanged();
        barChart.invalidate();
    }

    public static void H(ViewGroup viewGroup, GameObj gameObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25443, new Class[]{ViewGroup.class, GameObj.class, Boolean.TYPE}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (gameObj == null) {
            viewGroup.setVisibility(8);
            return;
        }
        Context context = viewGroup.getContext();
        r1.r1(new com.max.hbcommon.base.adapter.s.e(R.layout.item_game, viewGroup), gameObj, GameObj.KEY_POINT_GAME_PLATFORM);
        View viewFindViewById = viewGroup.findViewById(R.id.divider);
        if (z10) {
            viewFindViewById.setVisibility(4);
        } else {
            viewFindViewById.setVisibility(0);
        }
        viewGroup.setOnClickListener(new d(context, gameObj.getH_src(), gameObj.getAppid(), gameObj.getGame_type()));
    }

    public static void I(ViewGroup viewGroup, GamePlayStatObj gamePlayStatObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{viewGroup, gamePlayStatObj, str, str2}, null, changeQuickRedirect, true, 25451, new Class[]{ViewGroup.class, GamePlayStatObj.class, String.class, String.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (gamePlayStatObj == null) {
            viewGroup.setVisibility(8);
            return;
        }
        Context context = viewGroup.getContext();
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.vg_view_game_info_card);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.vg_view_game_info_card_grid);
        J(viewGroup2, gamePlayStatObj, str, str2);
        if (gamePlayStatObj.getAchivement_count() == 0) {
            viewGroup3.setVisibility(8);
            return;
        }
        com.max.xiaoheihe.module.account.utils.m mVarP = new com.max.xiaoheihe.module.account.utils.m().y(true).w(viewGroup3).m().p(new h(context, gamePlayStatObj));
        viewGroup3.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        mVarP.n();
        ((ViewGroup.MarginLayoutParams) mVarP.l().getLayoutParams()).setMargins(ViewUtils.f(context, 8.0f), ViewUtils.f(context, 0.0f), ViewUtils.f(context, 8.0f), ViewUtils.f(context, 10.0f));
    }

    public static void J(ViewGroup viewGroup, GamePlayStatObj gamePlayStatObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{viewGroup, gamePlayStatObj, str, str2}, null, changeQuickRedirect, true, 25452, new Class[]{ViewGroup.class, GamePlayStatObj.class, String.class, String.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (gamePlayStatObj == null) {
            viewGroup.setVisibility(8);
            return;
        }
        Context context = viewGroup.getContext();
        viewGroup.setVisibility(0);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_item_game_with_time);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_item_game_with_time_name);
        ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(R.id.pb_item_game_with_time);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_item_game_with_total_time);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_item_game_with_two_weeks);
        GameObj game_info = gamePlayStatObj.getGame_info();
        if (game_info == null) {
            viewGroup.setVisibility(8);
            return;
        }
        com.max.hbimage.b.d0(game_info.getImage(), imageView, ViewUtils.f(context, 2.0f));
        textView.setText(game_info.getName());
        textView2.setText(i(gamePlayStatObj.getPlaytime_forever()));
        textView3.setText(i(gamePlayStatObj.getPlaytime_2weeks()));
        float fP = 0.0f;
        try {
            fP = com.max.hbutils.utils.n.p(gamePlayStatObj.getPlaytime_percent());
        } catch (Exception unused) {
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) (fP * 100.0f));
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new i(progressBar));
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.start();
        if (!TextUtils.isEmpty(gamePlayStatObj.getStart_color()) && !TextUtils.isEmpty(gamePlayStatObj.getEnd_color())) {
            try {
                ((LayerDrawable) progressBar.getProgressDrawable()).setDrawableByLayerId(android.R.id.progress, new ScaleDrawable(ViewUtils.x(ViewUtils.f(context, 2.0f), com.max.xiaoheihe.utils.d.e1(gamePlayStatObj.getStart_color()), com.max.xiaoheihe.utils.d.e1(gamePlayStatObj.getEnd_color())), 3, 1.0f, -1.0f));
            } catch (Exception unused2) {
            }
        }
        viewGroup.setOnClickListener(new j(gamePlayStatObj.getGame_info().getAppid(), context, str2, str));
    }

    public static void K(ViewGroup viewGroup, boolean z10, View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener}, null, changeQuickRedirect, true, 25439, new Class[]{ViewGroup.class, Boolean.TYPE, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            viewGroup.setOnClickListener(onClickListener);
        }
    }

    public static void L(Context context, int i10, String str, View view) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10), str, view}, null, changeQuickRedirect, true, 25469, new Class[]{Context.class, Integer.TYPE, String.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Glide.F(context).l().load(str).z1(new r(i10, view));
    }

    public static void M(ViewGroup viewGroup, String str, String str2, @m0 String str3, k0<String> k0Var, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, str, str2, str3, k0Var, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25440, new Class[]{ViewGroup.class, String.class, String.class, String.class, k0.class, Boolean.TYPE}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        Context context = viewGroup.getContext();
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(str);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc(context.getResources().getString(R.string.total_time));
        keyDescObj2.setKey("all");
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setDesc(context.getResources().getString(R.string.in_two_weeks));
        keyDescObj3.setKey(f79323c);
        arrayList.add(keyDescObj3);
        KeyDescObj keyDescObj4 = new KeyDescObj();
        keyDescObj4.setDesc(context.getResources().getString(R.string.achievement));
        keyDescObj4.setKey(f79324d);
        arrayList.add(keyDescObj4);
        N(viewGroup, arrayList, str2, str3, k0Var, z10);
    }

    public static void N(ViewGroup viewGroup, List<KeyDescObj> list, String str, @m0 String str2, k0<String> k0Var, boolean z10) {
        int i10;
        if (PatchProxy.proxy(new Object[]{viewGroup, list, str, str2, k0Var, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25441, new Class[]{ViewGroup.class, List.class, String.class, String.class, k0.class, Boolean.TYPE}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_item_my_game_title_count);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_item_my_game_title_title);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_item_game_title_all);
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.tv_item_game_title_weeks);
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.tv_item_game_title_achievement);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.vg_item_game_title_weeks_wrapper);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.vg_item_game_title_all_wrapper);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.vg_item_game_title_achievement_wrapper);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_item_game_title_weeks);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.iv_item_game_title_all);
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.iv_item_game_title_achievement);
        SearchView searchView = (SearchView) viewGroup.findViewById(R.id.sv_game);
        if (com.max.hbcommon.utils.c.w(list)) {
            i10 = 3;
        } else {
            if (list.get(0) != null) {
                textView2.setText(list.get(0).getDesc());
            } else {
                textView2.setText((CharSequence) null);
            }
            if (list.size() <= 1 || list.get(1) == null) {
                textView3.setText((CharSequence) null);
            } else {
                textView3.setText(list.get(1).getDesc());
            }
            if (list.size() <= 2 || list.get(2) == null) {
                textView4.setText((CharSequence) null);
            } else {
                textView4.setText(list.get(2).getDesc());
            }
            i10 = 3;
            if (list.size() <= 3 || list.get(3) == null) {
                textView5.setText((CharSequence) null);
            } else {
                textView5.setText(list.get(3).getDesc());
            }
        }
        textView.setText(str);
        Context context = textView2.getContext();
        int color = context.getResources().getColor(R.color.text_secondary_1_color);
        int color2 = context.getResources().getColor(R.color.text_secondary_2_color);
        int color3 = context.getResources().getColor(R.color.text_primary_1_color);
        imageView2.setVisibility(8);
        imageView.setVisibility(8);
        imageView3.setVisibility(8);
        imageView2.setColorFilter(color2);
        textView3.setTextColor(color);
        imageView.setColorFilter(color2);
        textView4.setTextColor(color);
        imageView3.setColorFilter(color2);
        textView5.setTextColor(color);
        if (list != null) {
            if (list.size() > 1 && list.get(1) != null && !com.max.hbcommon.utils.c.u(list.get(1).getKey())) {
                imageView2.setVisibility(0);
                if (str2 != null && str2.equals(list.get(1).getKey())) {
                    imageView2.setColorFilter(color3);
                    textView3.setTextColor(color3);
                }
            }
            if (list.size() > 2 && list.get(2) != null && !com.max.hbcommon.utils.c.u(list.get(2).getKey())) {
                imageView.setVisibility(0);
                if (str2 != null && str2.equals(list.get(2).getKey())) {
                    imageView.setColorFilter(color3);
                    textView4.setTextColor(color3);
                }
            }
            if (list.size() > i10 && list.get(i10) != null && !com.max.hbcommon.utils.c.u(list.get(i10).getKey())) {
                imageView3.setVisibility(0);
                if (str2 != null && str2.equals(list.get(i10).getKey())) {
                    imageView3.setColorFilter(color3);
                    textView5.setTextColor(color3);
                }
            }
        }
        if (k0Var != null) {
            viewGroup3.setOnClickListener(new j0(list, k0Var));
            viewGroup2.setOnClickListener(new a(list, k0Var));
            viewGroup4.setOnClickListener(new b(list, k0Var));
        } else {
            viewGroup4.setOnClickListener(null);
            viewGroup3.setOnClickListener(null);
            viewGroup2.setOnClickListener(null);
        }
        if (z10) {
            searchView.setVisibility(0);
        } else {
            searchView.setVisibility(8);
        }
    }

    public static void O(GameTimeAchieveItemView gameTimeAchieveItemView, GameObj gameObj, int i10, boolean z10, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{gameTimeAchieveItemView, gameObj, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, str3}, null, changeQuickRedirect, true, 25434, new Class[]{GameTimeAchieveItemView.class, GameObj.class, Integer.TYPE, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        P(gameTimeAchieveItemView, gameObj, i10, z10, str, str2, str3, GameTimeAchieveItemView.Type.Normal, GameObj.PLATFORM_STEAM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static void P(GameTimeAchieveItemView gameTimeAchieveItemView, GameObj gameObj, int i10, boolean z10, String str, String str2, String str3, GameTimeAchieveItemView.Type type, String str4) {
        ?? r14;
        if (PatchProxy.proxy(new Object[]{gameTimeAchieveItemView, gameObj, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, str3, type, str4}, null, changeQuickRedirect, true, 25435, new Class[]{GameTimeAchieveItemView.class, GameObj.class, Integer.TYPE, Boolean.TYPE, String.class, String.class, String.class, GameTimeAchieveItemView.Type.class, String.class}, Void.TYPE).isSupported || gameTimeAchieveItemView == 0) {
            return;
        }
        if (gameObj == null) {
            gameTimeAchieveItemView.setVisibility(8);
            return;
        }
        if (gameObj.isNot_owned()) {
            gameTimeAchieveItemView.getVg_not_owned().setVisibility(0);
            gameTimeAchieveItemView.getVg_not_owned().setOnClickListener(new f0(gameTimeAchieveItemView));
        } else {
            gameTimeAchieveItemView.getVg_not_owned().setVisibility(8);
        }
        com.max.hbimage.b.L(gameObj.getImage(), gameTimeAchieveItemView.f86834c, R.drawable.common_default_placeholder_375x210);
        gameTimeAchieveItemView.setGameName(gameObj.getName());
        if (com.max.hbcommon.utils.c.u(gameObj.getPlaytime_forever())) {
            gameTimeAchieveItemView.setForeverPlayTime(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        } else {
            gameTimeAchieveItemView.setForeverPlayTime(i(gameObj.getPlaytime_forever()));
        }
        if ("switch".equals(str4)) {
            r14 = 0;
            gameTimeAchieveItemView.d(false);
            gameTimeAchieveItemView.setPrefectAchievement(false);
            gameTimeAchieveItemView.setAchievementText(gameObj.getLast_play_time());
        } else {
            r14 = 0;
            gameTimeAchieveItemView.setAchievementNum(gameObj.getAchieved_count(), gameObj.getAchivement_count(), gameObj.getAchievement_cleared_icon(), "1".equals(gameObj.getIs_cleared()), "1".equals(gameObj.getShow_cleared_icon()));
        }
        f0(gameObj.getPlaytime_percent(), gameTimeAchieveItemView.f86838g);
        Q(gameTimeAchieveItemView.f86838g, gameObj);
        Context context = gameTimeAchieveItemView.getContext();
        if (type == GameTimeAchieveItemView.Type.Comment) {
            gameTimeAchieveItemView.setFreeGet(r14);
            gameTimeAchieveItemView.setOnlinePlayersAndFriends(null, r14);
            gameTimeAchieveItemView.f86853v.setOnClickListener(new g0(context, gameObj));
        } else if ("epic".equals(str4)) {
            gameTimeAchieveItemView.setFreeGet(gameObj.isIs_free_get());
        } else {
            gameTimeAchieveItemView.setOnlinePlayersAndFriends(gameObj.getOnline_player(), i10);
        }
        gameTimeAchieveItemView.setOnClickListener(new h0(gameObj, context, str3, str, str2));
        gameTimeAchieveItemView.setType(type);
        if (GameTimeAchieveItemView.Type.GameRate == type) {
            gameTimeAchieveItemView.setRating(com.max.hbutils.utils.n.p(gameObj.getComment_score()));
        }
        gameTimeAchieveItemView.f86847p.setVisibility(r5);
        gameTimeAchieveItemView.f86840i.setVisibility(r14);
        gameTimeAchieveItemView.f86851t.setVisibility(8);
        gameTimeAchieveItemView.f86840i.setTextColor(gameTimeAchieveItemView.getContext().getResources().getColor(R.color.text_secondary_1_color));
        int i11 = c0.f79336a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            a0(gameTimeAchieveItemView, gameObj, str4);
        } else if (i11 != 3) {
            if (i11 == 4) {
                if ("1".equals(gameObj.getShow_create_at()) && !com.max.hbcommon.utils.c.u(gameObj.getComment_create_at())) {
                    gameTimeAchieveItemView.setSpecialPlayTime(com.max.hbutils.utils.w.w(context, com.max.hbutils.utils.n.r(gameObj.getComment_create_at())));
                } else if (com.max.hbcommon.utils.c.u(gameObj.getComment_playtime())) {
                    gameTimeAchieveItemView.setSpecialPlayTime(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                } else {
                    gameTimeAchieveItemView.setSpecialPlayTime(i(gameObj.getComment_playtime()));
                }
            }
        } else if (com.max.hbcommon.utils.c.u(gameObj.getClear_time())) {
            gameTimeAchieveItemView.setSpecialPlayTime(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        } else {
            gameTimeAchieveItemView.setSpecialPlayTime(com.max.hbutils.utils.w.w(context, com.max.hbutils.utils.n.r(gameObj.getClear_time())));
        }
        if (z10) {
            gameTimeAchieveItemView.f86852u.setVisibility(4);
        } else {
            gameTimeAchieveItemView.f86852u.setVisibility(r14);
        }
    }

    public static void Q(ProgressBar progressBar, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{progressBar, gameObj}, null, changeQuickRedirect, true, 25438, new Class[]{ProgressBar.class, GameObj.class}, Void.TYPE).isSupported || progressBar == null || gameObj == null) {
            return;
        }
        Context context = progressBar.getContext();
        if (TextUtils.isEmpty(gameObj.getStart_color()) || TextUtils.isEmpty(gameObj.getEnd_color())) {
            return;
        }
        int iE1 = com.max.xiaoheihe.utils.d.e1(gameObj.getStart_color());
        int iE2 = com.max.xiaoheihe.utils.d.e1(gameObj.getEnd_color());
        LayerDrawable layerDrawable = (LayerDrawable) progressBar.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(android.R.id.progress, new ScaleDrawable(ViewUtils.i(ViewUtils.f(context, 2.0f), iE1, iE2), 3, 1.0f, -1.0f));
    }

    public static void R(ViewGroup viewGroup, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (PatchProxy.proxy(new Object[]{viewGroup, onClickListener, onClickListener2}, null, changeQuickRedirect, true, 25446, new Class[]{ViewGroup.class, View.OnClickListener.class, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_pio_card_make_public);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_pio_card_have_made_public);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_information_not_open);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("您未公开 游戏资料 及 库存");
        spannableStringBuilder.setSpan(new e(viewGroup.getContext().getResources().getColor(R.color.white)), 5, 9, 33);
        spannableStringBuilder.setSpan(new f(viewGroup.getContext().getResources().getColor(R.color.white)), 12, 14, 33);
        textView3.setText(spannableStringBuilder);
        textView.setOnClickListener(onClickListener);
        textView2.setOnClickListener(onClickListener2);
    }

    public static void S(ProgressBar progressBar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{progressBar, str, str2}, null, changeQuickRedirect, true, 25456, new Class[]{ProgressBar.class, String.class, String.class}, Void.TYPE).isSupported || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || progressBar == null) {
            return;
        }
        try {
            int iE1 = com.max.xiaoheihe.utils.d.e1(str);
            int iE2 = com.max.xiaoheihe.utils.d.e1(str2);
            LayerDrawable layerDrawable = (LayerDrawable) progressBar.getProgressDrawable();
            progressBar.setProgressDrawable(null);
            layerDrawable.setDrawableByLayerId(android.R.id.progress, new ScaleDrawable(ViewUtils.i(ViewUtils.f(progressBar.getContext(), 2.0f), iE1, iE2), 3, 1.0f, -1.0f));
            progressBar.setProgressDrawable(layerDrawable);
        } catch (Exception unused) {
        }
    }

    public static void T(ViewGroup viewGroup, AchieveObj achieveObj, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {viewGroup, achieveObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25449, new Class[]{ViewGroup.class, AchieveObj.class, cls, cls, cls}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (achieveObj == null) {
            viewGroup.setVisibility(8);
            return;
        }
        GameAchieveItemView gameAchieveItemView = (GameAchieveItemView) viewGroup.findViewById(R.id.gai);
        gameAchieveItemView.f86620d.setVisibility(8);
        gameAchieveItemView.setName(achieveObj.getDesc());
        if (TextUtils.isEmpty(achieveObj.getFull_desc())) {
            gameAchieveItemView.f86626j.setVisibility(8);
        } else {
            gameAchieveItemView.f86626j.setVisibility(0);
            gameAchieveItemView.setDesc(achieveObj.getFull_desc());
        }
        gameAchieveItemView.setTime(j(achieveObj.getUnlocktime()));
        gameAchieveItemView.setFirstGray(z11);
        float fP = com.max.hbutils.utils.n.p(achieveObj.getAchieved_percent());
        gameAchieveItemView.setPercent(fP + "%");
        if (fP < 0.0f) {
            fP = 0.0f;
        }
        if (fP > 100.0f) {
            fP = 100.0f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) fP);
        valueAnimatorOfInt.addUpdateListener(new g(gameAchieveItemView));
        valueAnimatorOfInt.start();
        gameAchieveItemView.setAchieved(1 == achieveObj.getAchieved(), fP, achieveObj.getIcon(), achieveObj.getIcongray());
        if (z10) {
            gameAchieveItemView.f86627k.setVisibility(4);
        } else {
            gameAchieveItemView.f86627k.setVisibility(0);
        }
    }

    public static void U(List<SteamNativeObj> list, List<? extends ISteamOnlineState> list2, int i10) {
        if (PatchProxy.proxy(new Object[]{list, list2, new Integer(i10)}, null, changeQuickRedirect, true, 25445, new Class[]{List.class, List.class, Integer.TYPE}, Void.TYPE).isSupported || list == null || list2 == null) {
            return;
        }
        while (i10 < list2.size()) {
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    i11 = -1;
                    break;
                } else if (TextUtils.equals(list.get(i11).getSteamid(), list2.get(i10).getSteamSteamid())) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                list2.get(i10).setSteamPersonastate(list.get(i11).getPersonastate());
                list2.get(i10).setSteamGameextrainfo(list.get(i11).getGameextrainfo());
                list2.get(i10).setSteamGameid(list.get(i11).getGameid());
            }
            i10++;
        }
    }

    public static void V(io.reactivex.disposables.a aVar, ViewGroup viewGroup, HomeDataObj homeDataObj, View.OnClickListener onClickListener, com.max.xiaoheihe.module.account.mine.k kVar) {
        int i10;
        if (PatchProxy.proxy(new Object[]{aVar, viewGroup, homeDataObj, onClickListener, kVar}, null, changeQuickRedirect, true, 25432, new Class[]{io.reactivex.disposables.a.class, ViewGroup.class, HomeDataObj.class, View.OnClickListener.class, com.max.xiaoheihe.module.account.mine.k.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (homeDataObj == null || homeDataObj.getSteam_id_info() == null || TextUtils.isEmpty(homeDataObj.getSteam_id_info().getSteamid())) {
            viewGroup.setVisibility(8);
            return;
        }
        String steamid = homeDataObj.getSteam_id_info().getSteamid();
        viewGroup.setVisibility(0);
        final Context context = viewGroup.getContext();
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_steam_info_card_head_image);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.vg_card);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ll_tips);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_tips);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.iv_steam_info_card_avatar);
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.iv_steam_info_card_avatar_frame);
        View viewFindViewById = viewGroup.findViewById(R.id.tv_management);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_steam_info_card_username);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_steam_info_card_level);
        View viewFindViewById2 = viewGroup.findViewById(R.id.vg_steam_info_card_level);
        final TextView textView4 = (TextView) viewGroup.findViewById(R.id.tv_online_state);
        PlatformDataView[] platformDataViewArr = {(PlatformDataView) viewGroup.findViewById(R.id.pdv0), (PlatformDataView) viewGroup.findViewById(R.id.pdv1), (PlatformDataView) viewGroup.findViewById(R.id.pdv2)};
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(R.id.rl_steam_info_card_more_data);
        if (!"1".equals(homeDataObj.getSteam_id_info().getPersonal_infomation_open())) {
            textView.setText("因steam隐私策略的变更，现需要您重新公开游戏资料及库存");
            viewGroup2.setOnClickListener(new v(context, steamid));
        } else if (!com.max.hbcommon.utils.c.u(homeDataObj.getSteam_id_info().getApi_key_desc())) {
            textView.setText(homeDataObj.getSteam_id_info().getApi_key_desc());
            viewGroup2.setOnClickListener(new d0(homeDataObj, context));
        }
        if (v(homeDataObj.getSteam_id_info())) {
            frameLayout.getLayoutParams().height = ViewUtils.f(context, 168.0f);
            viewGroup2.setVisibility(0);
        } else {
            frameLayout.getLayoutParams().height = ViewUtils.f(context, 150.0f);
            viewGroup2.setVisibility(8);
        }
        com.max.hbimage.b.e0(homeDataObj.getSteam_id_info().getHead_image(), imageView, ViewUtils.f(viewGroup.getContext(), 2.0f), R.drawable.unbind_steam_view_bg);
        com.max.hbimage.b.e0(homeDataObj.getSteam_id_info().getAvatar(), imageView2, ViewUtils.f(viewGroup.getContext(), 2.0f), -1);
        if (com.max.hbcommon.utils.c.u(homeDataObj.getSteam_id_info().getAvatar_frame())) {
            i10 = 0;
            imageView3.setVisibility(8);
        } else {
            i10 = 0;
            imageView3.setVisibility(0);
            b0(aVar, homeDataObj.getSteam_id_info().getAvatar_frame(), imageView3);
        }
        Object[] objArr = new Object[1];
        objArr[i10] = homeDataObj.getSteam_id_info().getNickname();
        textView2.setText(String.format("%s", objArr));
        textView3.setText(homeDataObj.getSteam_id_info().getLevel() + "");
        L(context, (homeDataObj.getSteam_id_info().getLevel() / 10) % 10, homeDataObj.getSteam_id_info().getLevel_icon(), viewFindViewById2);
        viewFindViewById.setVisibility(8);
        for (int i11 = i10; i11 < 3; i11++) {
            platformDataViewArr[i11].setDesc(homeDataObj.getGame_overview().get(i11).getDesc());
            platformDataViewArr[i11].setValue(homeDataObj.getGame_overview().get(i11).getValue());
        }
        kVar.B(new com.max.xiaoheihe.module.account.mine.c() { // from class: com.max.xiaoheihe.module.account.utils.j
            @Override // com.max.xiaoheihe.module.account.mine.c
            public final void a(SteamNativeObj steamNativeObj) {
                l.w(context, textView4, steamNativeObj);
            }
        });
        relativeLayout.setOnClickListener(onClickListener);
        viewGroup.setOnClickListener(onClickListener);
        homeDataObj.getAchieve_list();
    }

    public static void W(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 25476, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(context).y("是否需要更新？").l("只会检测最近200张公开截图。如果您的截图数量较多，更早的数据将不会更新。").t(R.string.confirm, new b0(str)).n(R.string.cancel, new a0()).F();
    }

    public static void X(TextView textView, int i10, String str) {
        if (PatchProxy.proxy(new Object[]{textView, new Integer(i10), str}, null, changeQuickRedirect, true, 25447, new Class[]{TextView.class, Integer.TYPE, String.class}, Void.TYPE).isSupported || textView == null) {
            return;
        }
        Context context = textView.getContext();
        switch (i10) {
            case 0:
                textView.setText(context.getString(R.string.offline));
                textView.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                break;
            case 1:
                String strC = com.max.xiaoheihe.module.account.utils.g.f79313a.c(str);
                if (!TextUtils.isEmpty(strC)) {
                    textView.setText(context.getString(R.string.in_game, strC));
                    textView.setTextColor(context.getResources().getColor(R.color.green_70));
                } else {
                    textView.setText(context.getString(R.string.on_line));
                    textView.setTextColor(context.getResources().getColor(R.color.interactive_color));
                }
                break;
            case 2:
                textView.setText(context.getString(R.string.status_busy));
                textView.setTextColor(context.getResources().getColor(R.color.interactive_color_alpha50));
                break;
            case 3:
                textView.setText(context.getString(R.string.status_leave));
                textView.setTextColor(context.getResources().getColor(R.color.interactive_color_alpha50));
                break;
            case 4:
                textView.setText(context.getString(R.string.status_not_disturb));
                textView.setTextColor(context.getResources().getColor(R.color.interactive_color_alpha50));
                break;
            case 5:
                textView.setText(context.getString(R.string.status_want_trade));
                textView.setTextColor(context.getResources().getColor(R.color.interactive_color));
                break;
            case 6:
                textView.setText(context.getString(R.string.status_want_play));
                textView.setTextColor(context.getResources().getColor(R.color.interactive_color));
                break;
            default:
                textView.setText(context.getString(R.string.offline));
                textView.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                break;
        }
    }

    @Deprecated
    public static void Y() {
        com.max.xiaoheihe.network.i.a().G7("info", "-1", com.max.xiaoheihe.utils.i0.j()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.p());
    }

    public static void Z(ViewGroup viewGroup, SteamIdInfoObj steamIdInfoObj, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (PatchProxy.proxy(new Object[]{viewGroup, steamIdInfoObj, onClickListener, onClickListener2}, null, changeQuickRedirect, true, 25430, new Class[]{ViewGroup.class, SteamIdInfoObj.class, View.OnClickListener.class, View.OnClickListener.class}, Void.TYPE).isSupported || viewGroup == null || !(viewGroup instanceof CardView)) {
            return;
        }
        if (steamIdInfoObj != null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_dont_display);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_icon);
        ViewAnimator viewAnimator = (ViewAnimator) viewGroup.findViewById(R.id.va_desc);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_replace);
        textView.setText("海外用户点此绑定");
        textView.setVisibility(0);
        textView.setOnClickListener(onClickListener2);
        String strO = com.max.hbcache.c.o("display_steam_msg", "");
        if (com.max.hbcommon.utils.c.u(strO)) {
            Timer timer = f79322b;
            if (timer != null) {
                timer.cancel();
            }
        } else {
            viewAnimator.setInAnimation(viewAnimator.getContext(), R.anim.slide_in_down);
            viewAnimator.setOutAnimation(viewAnimator.getContext(), R.anim.slide_out_up);
            textView2.setText(strO);
            Handler handler = new Handler();
            Timer timer2 = f79322b;
            if (timer2 != null) {
                timer2.cancel();
            }
            f79322b = new Timer();
            f79322b.schedule(new k(handler, viewAnimator), 5000L, 5000L);
        }
        Context context = viewGroup.getContext();
        imageView.setBackground(com.max.hbutils.utils.q.o(context, R.color.aux_blue, ViewUtils.h0(context, ViewUtils.o(context, imageView))));
        View viewFindViewById = viewGroup.findViewById(R.id.rl_steam_unbind_view_bind);
        viewFindViewById.setBackground(ViewUtils.x(r1.M(context), com.max.hbcommon.utils.l.a(R.color.btn_blue_start), com.max.hbcommon.utils.l.a(R.color.btn_purple_end)));
        viewFindViewById.setOnClickListener(onClickListener);
    }

    private static void a0(GameTimeAchieveItemView gameTimeAchieveItemView, GameObj gameObj, String str) {
        if (PatchProxy.proxy(new Object[]{gameTimeAchieveItemView, gameObj, str}, null, changeQuickRedirect, true, 25436, new Class[]{GameTimeAchieveItemView.class, GameObj.class, String.class}, Void.TYPE).isSupported) {
        }
        if (str == null) {
            str = "";
        }
        switch (str) {
            case "epic":
                if (!com.max.hbcommon.utils.c.u(gameObj.getAchieved_exp()) && !com.max.hbcommon.utils.c.u(gameObj.getAchievement_exp())) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s/%s", gameObj.getAchieved_exp(), gameObj.getAchievement_exp()));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), 0, gameObj.getAchieved_exp().length(), 33);
                    gameTimeAchieveItemView.setSpecialPlayTime(spannableStringBuilder);
                    break;
                } else {
                    gameTimeAchieveItemView.setSpecialPlayTime("-/-");
                    break;
                }
                break;
            case "platform_xbox":
                gameTimeAchieveItemView.f86851t.setVisibility(0);
                if (com.max.hbcommon.utils.c.u(gameObj.getTotal_gamerscore())) {
                    gameTimeAchieveItemView.setSpecialPlayTime(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                } else {
                    gameTimeAchieveItemView.setSpecialPlayTime(String.format("%s/%s", gameObj.getCurrent_gamerscore(), gameObj.getTotal_gamerscore()));
                }
                gameTimeAchieveItemView.f86840i.setTextColor(gameTimeAchieveItemView.getContext().getResources().getColor(R.color.text_primary_1_color));
                break;
            case "platform_ps":
                gameTimeAchieveItemView.setPsnTrophy(gameObj.getGold(), gameObj.getSilver(), gameObj.getBronze());
                break;
            default:
                gameTimeAchieveItemView.setSpecialPlayTime(i(gameObj.getPlaytime_2weeks()));
                break;
        }
    }

    public static void b0(io.reactivex.disposables.a aVar, String str, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{aVar, str, imageView}, null, changeQuickRedirect, true, 25470, new Class[]{io.reactivex.disposables.a.class, String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        File file = new File(com.max.xiaoheihe.utils.d.Q(), com.max.hbutils.utils.s.d(str));
        if (file.exists()) {
            l(file, imageView);
        } else {
            aVar.c((io.reactivex.disposables.b) com.max.hbimage.b.i(com.max.xiaoheihe.utils.d.Q(), new t(), str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new s(imageView)));
        }
    }

    public static void c0(final Context context, String str, String str2, final String str3) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 25475, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            new com.max.hbcommon.component.bottomsheet.a().z(str).n(R.drawable.bottom_sheets_broken_steam_80x80).k(true).x(false).l(new SpannableString(str2)).v("去登录", true, new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.utils.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.x(str3, context, view);
                }
            }).p("暂时不用", true, new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.utils.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.y(view);
                }
            }).a().M3((context instanceof AppCompatActivity ? (AppCompatActivity) context : (AppCompatActivity) com.max.hbutils.utils.e.b().a()).getSupportFragmentManager(), "login_steam");
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ void d(String str, BindSteamUrlResult bindSteamUrlResult, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10, ProxyItemObj proxyItemObj, String str2, String str3) {
        Object[] objArr = {str, bindSteamUrlResult, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), proxyItemObj, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25479, new Class[]{String.class, BindSteamUrlResult.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE, ProxyItemObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        u(str, bindSteamUrlResult, activity, fragment, z10, z11, i10, proxyItemObj, str2, str3);
    }

    public static BubbleTipPopup d0(Context context, View view, String str, boolean z10, int i10, int i11, boolean z11) {
        Object[] objArr = {context, view, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25433, new Class[]{Context.class, View.class, String.class, cls, cls2, cls2, cls}, BubbleTipPopup.class);
        if (patchProxyResultProxy.isSupported) {
            return (BubbleTipPopup) patchProxyResultProxy.result;
        }
        float f10 = ViewUtils.f(context, 20.0f);
        float f11 = ViewUtils.f(context, 14.0f);
        BubbleTipPopup.a aVarO0 = new BubbleTipPopup.a(context).c(view).p1(str).s1(12.0f).q1(com.max.xiaoheihe.utils.d.F(context, R.color.text_secondary_2_not_change_color)).r1(17).i0(z10 ? 48 : 80).u0(f10, f11, f10, f11).l0(ViewUtils.f(context, 220.0f) + (f10 * 2.0f)).p(com.max.xiaoheihe.utils.d.F(context, R.color.background_card_2_color)).m(ViewUtils.f(context, 13.0f)).l(ViewUtils.f(context, 6.0f)).h(com.max.xiaoheihe.utils.d.F(context, R.color.background_card_2_color)).w(ViewUtils.f(context, 12.0f)).o0(ViewUtils.f(context, i10));
        int iF = ViewUtils.f(context, i11);
        if (z10) {
            iF = -iF;
        }
        BubbleTipPopup bubbleTipPopupR = aVarO0.p0(iF).z(z11).x(true).y(true).r();
        bubbleTipPopupR.O();
        return bubbleTipPopupR;
    }

    static /* synthetic */ void e(String str, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10, BindSteamUrlResult bindSteamUrlResult) {
        Object[] objArr = {str, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), bindSteamUrlResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25480, new Class[]{String.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE, BindSteamUrlResult.class}, Void.TYPE).isSupported) {
            return;
        }
        s(str, activity, fragment, z10, z11, i10, bindSteamUrlResult);
    }

    public static void e0(List<? extends ISteamOnlineState> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, 25455, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        Collections.sort(list, new C0661l());
    }

    static /* synthetic */ void f(String str, BindSteamUrlResult bindSteamUrlResult, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10, ProxyType proxyType) {
        Object[] objArr = {str, bindSteamUrlResult, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), proxyType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25481, new Class[]{String.class, BindSteamUrlResult.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE, ProxyType.class}, Void.TYPE).isSupported) {
            return;
        }
        t(str, bindSteamUrlResult, activity, fragment, z10, z11, i10, proxyType);
    }

    public static void f0(String str, ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{str, progressBar}, null, changeQuickRedirect, true, 25437, new Class[]{String.class, ProgressBar.class}, Void.TYPE).isSupported || progressBar == null) {
            return;
        }
        float f10 = 0.0f;
        try {
            f10 = Float.parseFloat(str);
        } catch (Exception unused) {
        }
        float f11 = f10 * 100.0f;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(f11 < 3.0f ? 3 : (int) f11);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new i0(progressBar));
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.start();
    }

    static /* synthetic */ void g(Context context, SteamPublicSettingObj steamPublicSettingObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, steamPublicSettingObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25482, new Class[]{Context.class, SteamPublicSettingObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        q(context, steamPublicSettingObj, z10);
    }

    public static void g0(Context context, BaseProxyParamObj baseProxyParamObj, l0 l0Var) {
        if (PatchProxy.proxy(new Object[]{context, baseProxyParamObj, l0Var}, null, changeQuickRedirect, true, 25473, new Class[]{Context.class, BaseProxyParamObj.class, l0.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.i.d()) {
            A(baseProxyParamObj, l0Var);
            return;
        }
        if (baseProxyParamObj.getAcc_proxy() != null) {
            TradeInfoUtilKt.Z(context, false, baseProxyParamObj.getAcc_proxy().getAppid(), new x(baseProxyParamObj, l0Var));
            return;
        }
        if (baseProxyParamObj.getR_proxy() != null && com.max.hbcommon.utils.c.x(baseProxyParamObj.getR_proxy().getEnable()) && !com.max.hbcommon.utils.c.u(baseProxyParamObj.getR_url())) {
            A(baseProxyParamObj, l0Var);
            return;
        }
        if (baseProxyParamObj.getSteam_proxy() == null || baseProxyParamObj.getSteam_proxy().getHosts() == null || baseProxyParamObj.getSteam_proxy().getHosts().size() <= 0 || com.max.hbcommon.utils.c.w(baseProxyParamObj.getSteam_proxy().getJs_list())) {
            A(baseProxyParamObj, l0Var);
        } else {
            HostPingHelper.b(context, baseProxyParamObj.getSteam_proxy().getHosts(), new y(baseProxyParamObj, l0Var));
        }
    }

    static /* synthetic */ void h(BaseProxyParamObj baseProxyParamObj, l0 l0Var) {
        if (PatchProxy.proxy(new Object[]{baseProxyParamObj, l0Var}, null, changeQuickRedirect, true, 25483, new Class[]{BaseProxyParamObj.class, l0.class}, Void.TYPE).isSupported) {
            return;
        }
        A(baseProxyParamObj, l0Var);
    }

    public static String i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25444, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        long jR = com.max.hbutils.utils.n.r(str);
        if (jR == 0) {
            return "0 h";
        }
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(jR).divide(BigDecimal.valueOf(3600.0d), 1, 2);
        return bigDecimalDivide.floatValue() > 10.0f ? String.format("%.0f h", bigDecimalDivide) : String.format("%.1f h", bigDecimalDivide);
    }

    public static String j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25450, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return TextUtils.isEmpty(str) ? "" : new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(Long.valueOf(Long.parseLong(str) * 1000).longValue()));
    }

    public static String k(float f10) {
        float f11;
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, 25459, new Class[]{Float.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (f10 > 10000.0f) {
            f11 = f10 / 10000.0f;
            str = RXScreenCaptureService.KEY_WIDTH;
        } else {
            if (f10 <= 1000.0f) {
                return ((int) f10) + "";
            }
            f11 = f10 / 1000.0f;
            str = "k";
        }
        return String.format("%.1f%s", Float.valueOf(f11), str);
    }

    public static void l(File file, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{file, imageView}, null, changeQuickRedirect, true, 25471, new Class[]{File.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (APNGParser.d(file.getPath())) {
            imageView.setImageDrawable(new com.github.penfeizhou.animation.apng.b(new com.github.penfeizhou.animation.loader.c(file.getPath())));
        } else {
            Glide.F(imageView.getContext()).b(file).C1(imageView);
        }
    }

    public static Pair<Integer, Integer> m(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 25458, new Class[]{Integer.TYPE}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        if (i10 < 0) {
            return new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.white_alpha50)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.white_alpha50)));
        }
        return (i10 <= 0 || i10 >= 4) ? new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.white_alpha50)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.white_alpha50))) : new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.game_pubg_color)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.game_pubg_color)));
    }

    public static Pair<Integer, Integer> n(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, 25453, new Class[]{Float.TYPE}, Pair.class);
        return patchProxyResultProxy.isSupported ? (Pair) patchProxyResultProxy.result : new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.blue_start)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.blue_end)));
    }

    public static Pair<Integer, Integer> o(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 25457, new Class[]{Integer.TYPE}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        if (i10 < 0) {
            return new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)));
        }
        if (i10 == 1) {
            return new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.orange_start)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.orange_end)));
        }
        if (i10 != 2) {
            return i10 != 3 ? new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color))) : new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.blue_start)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.blue_end)));
        }
        return new Pair<>(Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.purple_start)), Integer.valueOf(com.max.xiaoheihe.utils.d.E(R.color.purple_end)));
    }

    public static int p(int i10, String str) {
        Object[] objArr = {new Integer(i10), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25448, new Class[]{cls, String.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        switch (i10) {
            case 0:
                return com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color_alpha60);
            case 1:
                return TextUtils.isEmpty(str) ? com.max.xiaoheihe.utils.d.E(R.color.interactive_color) : com.max.xiaoheihe.utils.d.E(R.color.green_70);
            case 2:
                return com.max.xiaoheihe.utils.d.E(R.color.interactive_color_alpha50);
            case 3:
                return com.max.xiaoheihe.utils.d.E(R.color.interactive_color_alpha50);
            case 4:
                return com.max.xiaoheihe.utils.d.E(R.color.interactive_color_alpha50);
            case 5:
                return com.max.xiaoheihe.utils.d.E(R.color.interactive_color);
            case 6:
                return com.max.xiaoheihe.utils.d.E(R.color.interactive_color);
            default:
                return com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color_alpha60);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    private static void q(Context context, SteamPublicSettingObj steamPublicSettingObj, boolean z10) {
        String str;
        if (PatchProxy.proxy(new Object[]{context, steamPublicSettingObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25468, new Class[]{Context.class, SteamPublicSettingObj.class, Boolean.TYPE}, Void.TYPE).isSupported || steamPublicSettingObj == null || com.max.hbcommon.utils.c.u(steamPublicSettingObj.getUrl())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        String str2 = null;
        if (steamPublicSettingObj.getSteam_proxy() == null || steamPublicSettingObj.getSteam_proxy().getProxy() == null) {
            str = null;
        } else {
            String strC = com.max.hbcommon.utils.e.c(steamPublicSettingObj.getSteam_proxy().getProxy().getP1(), com.max.xiaoheihe.utils.w.c(steamPublicSettingObj.getSteam_proxy().getProxy().getP3()));
            if (com.max.xiaoheihe.utils.d.a1(strC).equals(steamPublicSettingObj.getSteam_proxy().getProxy().getP2())) {
                String[] strArrSplit = strC.split(":");
                if (strArrSplit.length > 1) {
                    str2 = strArrSplit[0];
                    str = strArrSplit[1];
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
        }
        if ("1".equals(steamPublicSettingObj.getBanned())) {
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(context);
            fVar.l(steamPublicSettingObj.getMsg()).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new q());
            fVar.F();
            return;
        }
        String url = steamPublicSettingObj.getUrl();
        if (!com.max.hbcommon.utils.i.d()) {
            if (steamPublicSettingObj.getR_proxy() == null || !com.max.hbcommon.utils.c.x(steamPublicSettingObj.getR_proxy().getEnable()) || com.max.hbcommon.utils.c.u(steamPublicSettingObj.getR_url())) {
                if (z10 && "1".equals(steamPublicSettingObj.getUse_http()) && !com.max.hbcommon.utils.c.v(str2, str)) {
                    intent.putExtra("host", str2);
                    intent.putExtra(HeyboxMicFragment.f93763y, str);
                }
                if (steamPublicSettingObj.getHost() != null && steamPublicSettingObj.getJs_list() != null) {
                    intent.putExtra("hosts", steamPublicSettingObj.getHost());
                    intent.putExtra(WebviewFragment.K4, steamPublicSettingObj.getJs_list());
                }
            } else {
                url = steamPublicSettingObj.getR_url();
            }
        }
        intent.putExtra("pageurl", url);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.login_steam_to_verify));
        if (!com.max.hbcommon.utils.c.v(steamPublicSettingObj.getP1(), steamPublicSettingObj.getP2(), steamPublicSettingObj.getP3(), steamPublicSettingObj.getQ1(), steamPublicSettingObj.getQ2(), steamPublicSettingObj.getQ3())) {
            String strC2 = com.max.hbcommon.utils.e.c(steamPublicSettingObj.getP1(), com.max.xiaoheihe.utils.w.c(steamPublicSettingObj.getP3()));
            String strA1 = com.max.xiaoheihe.utils.d.a1(strC2);
            String strC3 = com.max.hbcommon.utils.e.c(steamPublicSettingObj.getQ1(), com.max.xiaoheihe.utils.w.c(steamPublicSettingObj.getQ3()));
            String strA2 = com.max.xiaoheihe.utils.d.a1(strC3);
            if (strA1.equals(steamPublicSettingObj.getP2()) && strA2.equals(steamPublicSettingObj.getQ2())) {
                SteamPrivacyJsObj steamPrivacyJsObj = new SteamPrivacyJsObj();
                steamPrivacyJsObj.setOpenSteamPrivacyJs(strC2);
                steamPrivacyJsObj.setGetSteamPrivacyJs(strC3);
                intent.putExtra("steam_privacy_js", steamPrivacyJsObj);
            }
        }
        if (!com.max.hbcommon.utils.c.u(steamPublicSettingObj.getSys_msg())) {
            intent.putExtra("message", steamPublicSettingObj.getSys_msg());
        }
        context.startActivity(intent);
    }

    public static final void r(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25454, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", String.format(lb.a.I1, com.max.xiaoheihe.module.account.utils.c.i()));
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.invite_friend));
        context.startActivity(intent);
    }

    private static void s(String str, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10, BindSteamUrlResult bindSteamUrlResult) {
        Object[] objArr = {str, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), bindSteamUrlResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25463, new Class[]{String.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE, BindSteamUrlResult.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.i.d()) {
            t(str, bindSteamUrlResult, activity, fragment, z10, z11, i10, ProxyType.ACC);
            return;
        }
        if (bindSteamUrlResult.getR_proxy() != null && com.max.hbcommon.utils.c.x(bindSteamUrlResult.getR_proxy().getEnable()) && ((z10 && !com.max.hbcommon.utils.c.u(bindSteamUrlResult.getR_unbind_url())) || (!z10 && !com.max.hbcommon.utils.c.u(bindSteamUrlResult.getR_bind_url())))) {
            t(str, bindSteamUrlResult, activity, fragment, z10, z11, i10, ProxyType.R_PROXY);
            return;
        }
        if (bindSteamUrlResult.getAcc_proxy() != null) {
            TradeInfoUtilKt.Z(activity, false, bindSteamUrlResult.getAcc_proxy().getAppid(), new n(str, bindSteamUrlResult, activity, fragment, z10, z11, i10));
            return;
        }
        if (bindSteamUrlResult.getSteam_proxy() != null && bindSteamUrlResult.getSteam_proxy().getHosts() != null && bindSteamUrlResult.getSteam_proxy().getHosts().size() > 0) {
            HostPingHelper.b(activity, bindSteamUrlResult.getSteam_proxy().getHosts(), new o(bindSteamUrlResult, str, activity, fragment, z10, z11, i10));
        } else if (bindSteamUrlResult.getSteam_proxy() == null || bindSteamUrlResult.getSteam_proxy().getProxy() == null) {
            t(str, bindSteamUrlResult, activity, fragment, z10, z11, i10, ProxyType.DIRECT);
        } else {
            t(str, bindSteamUrlResult, activity, fragment, z10, z11, i10, ProxyType.PROXY);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    private static void t(String str, BindSteamUrlResult bindSteamUrlResult, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10, ProxyType proxyType) {
        String str2;
        Object[] objArr = {str, bindSteamUrlResult, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), proxyType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25464, new Class[]{String.class, BindSteamUrlResult.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE, ProxyType.class}, Void.TYPE).isSupported || bindSteamUrlResult == null) {
            return;
        }
        String unbind_url = z10 ? bindSteamUrlResult.getUnbind_url() : bindSteamUrlResult.getBind_url();
        Intent intentY1 = SteamBindActivity.Y1(activity, z10 ? "0" : "1", proxyType);
        if (!com.max.hbcommon.utils.i.d()) {
            if (bindSteamUrlResult.getR_proxy() != null && com.max.hbcommon.utils.c.x(bindSteamUrlResult.getR_proxy().getEnable()) && ((z10 && !com.max.hbcommon.utils.c.u(bindSteamUrlResult.getR_unbind_url())) || (!z10 && !com.max.hbcommon.utils.c.u(bindSteamUrlResult.getR_bind_url())))) {
                unbind_url = z10 ? bindSteamUrlResult.getR_unbind_url() : bindSteamUrlResult.getR_bind_url();
            } else if (bindSteamUrlResult.getSteam_proxy() != null && bindSteamUrlResult.getSteam_proxy().getProxy() != null) {
                String strC = com.max.hbcommon.utils.e.c(bindSteamUrlResult.getSteam_proxy().getProxy().getP1(), com.max.xiaoheihe.utils.w.c(bindSteamUrlResult.getSteam_proxy().getProxy().getP3()));
                String str3 = null;
                if (com.max.xiaoheihe.utils.d.a1(strC).equals(bindSteamUrlResult.getSteam_proxy().getProxy().getP2())) {
                    String[] strArrSplit = strC.split(":");
                    if (strArrSplit.length > 1) {
                        str3 = strArrSplit[0];
                        str2 = strArrSplit[1];
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if ("1".equals(bindSteamUrlResult.getUse_http()) && !com.max.hbcommon.utils.c.v(str3, str2) && z11) {
                    intentY1.putExtra("host", str3);
                    intentY1.putExtra(HeyboxMicFragment.f93763y, str2);
                }
            } else if (bindSteamUrlResult.getHost() != null && bindSteamUrlResult.getHost().size() > 0 && !com.max.hbcommon.utils.c.w(bindSteamUrlResult.getJs_list())) {
                intentY1.putExtra("hosts", bindSteamUrlResult.getHost());
                intentY1.putExtra(WebviewFragment.K4, bindSteamUrlResult.getJs_list());
            }
        }
        MallOrderNotifyObj sys_msg_unbind = z10 ? bindSteamUrlResult.getSys_msg_unbind() : bindSteamUrlResult.getSys_msg_bind();
        intentY1.putExtra("pageurl", unbind_url);
        intentY1.putExtra("title", com.max.xiaoheihe.utils.d.n0(str == null ? R.string.login_steam_to_verify : R.string.bind));
        intentY1.putExtra("bind_game", str != null);
        if (sys_msg_unbind != null) {
            intentY1.putExtra(WebviewFragment.f94376w4, sys_msg_unbind);
        }
        intentY1.putExtra(WebviewFragment.N4, true);
        if (fragment != null) {
            fragment.startActivityForResult(intentY1, i10);
        } else {
            activity.startActivityForResult(intentY1, i10);
        }
    }

    private static void u(String str, BindSteamUrlResult bindSteamUrlResult, Activity activity, Fragment fragment, boolean z10, boolean z11, int i10, ProxyItemObj proxyItemObj, String str2, String str3) {
        Object[] objArr = {str, bindSteamUrlResult, activity, fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), proxyItemObj, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 25465, new Class[]{String.class, BindSteamUrlResult.class, Activity.class, Fragment.class, cls, cls, Integer.TYPE, ProxyItemObj.class, String.class, String.class}, Void.TYPE).isSupported || bindSteamUrlResult == null) {
            return;
        }
        String url = proxyItemObj != null ? proxyItemObj.getUrl() : str2;
        ProxyType proxyTypeD = null;
        if (proxyItemObj != null && proxyItemObj.getKey() != null) {
            proxyTypeD = ProxyManager.f91541g.d(proxyItemObj.getKey());
        }
        Intent intentY1 = SteamBindActivity.Y1(activity, z10 ? "0" : "1", proxyTypeD);
        if (proxyItemObj != null && ProxyManager.ProxyType.ip_direct.getKey().equals(proxyItemObj.getKey()) && proxyItemObj.getFilter_hosts() != null && !proxyItemObj.getFilter_hosts().isEmpty() && !com.max.hbcommon.utils.c.w(bindSteamUrlResult.getJs_list())) {
            intentY1.putExtra("hosts", proxyItemObj.getFilter_hosts());
            intentY1.putExtra(WebviewFragment.K4, bindSteamUrlResult.getJs_list());
        }
        MallOrderNotifyObj sys_msg_unbind = z10 ? bindSteamUrlResult.getSys_msg_unbind() : bindSteamUrlResult.getSys_msg_bind();
        intentY1.putExtra("pageurl", url);
        intentY1.putExtra("title", com.max.xiaoheihe.utils.d.n0(str == null ? R.string.login_steam_to_verify : R.string.bind));
        intentY1.putExtra("bind_game", str != null);
        intentY1.putExtra(com.max.xiaoheihe.module.proxy.a.f91563d, str3);
        if (sys_msg_unbind != null) {
            intentY1.putExtra(WebviewFragment.f94376w4, sys_msg_unbind);
        }
        intentY1.putExtra(WebviewFragment.N4, true);
        if (fragment != null) {
            fragment.startActivityForResult(intentY1, i10);
        } else {
            activity.startActivityForResult(intentY1, i10);
        }
    }

    public static boolean v(SteamIdInfoObj steamIdInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamIdInfoObj}, null, changeQuickRedirect, true, 25431, new Class[]{SteamIdInfoObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (steamIdInfoObj == null) {
            return false;
        }
        return ("1".equals(steamIdInfoObj.getPersonal_infomation_open()) && com.max.hbcommon.utils.c.u(steamIdInfoObj.getApi_key_desc())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context, TextView textView, SteamNativeObj steamNativeObj) {
        if (PatchProxy.proxy(new Object[]{context, textView, steamNativeObj}, null, changeQuickRedirect, true, 25478, new Class[]{Context.class, TextView.class, SteamNativeObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("SteamInfoUtils, setMineSteamOnlineStateListener , steamNativeObj = " + steamNativeObj);
        if (steamNativeObj == null || !(context instanceof androidx.lifecycle.y)) {
            return;
        }
        HBSteamInfoUtilsKt.j(steamNativeObj.getGameid(), new e0(textView, steamNativeObj), (androidx.lifecycle.y) context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(String str, Context context, View view) {
        if (PatchProxy.proxy(new Object[]{str, context, view}, null, changeQuickRedirect, true, 25477, new Class[]{String.class, Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        if (com.max.hbcommon.utils.c.u(str)) {
            str = SteamWalletJsObj.KEY_STEAM_GAME_DLC;
        }
        eVarA.h7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new z(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(View view) {
    }

    public static void z(Context context, SteamPublicSettingObj steamPublicSettingObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, steamPublicSettingObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25467, new Class[]{Context.class, SteamPublicSettingObj.class, Boolean.TYPE}, Void.TYPE).isSupported || steamPublicSettingObj == null || com.max.hbcommon.utils.c.u(steamPublicSettingObj.getUrl())) {
            return;
        }
        TradeInfoUtilKt.p(context, steamPublicSettingObj.getAcc_proxy(), new p(steamPublicSettingObj, context, z10));
    }
}
