package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.component.triplebanner.TripleBannerDecorationView;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.viewpager2.widget.HBViewPager2;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.CookieClearDomain;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.account.AccountCsGoInfoObj;
import com.max.xiaoheihe.bean.account.AccountDota2InfoObj;
import com.max.xiaoheihe.bean.account.BindGameDetailProtocolObj;
import com.max.xiaoheihe.bean.account.BindGameInfosObj;
import com.max.xiaoheihe.bean.account.BindProtocolObj;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.PlatformBindStatus;
import com.max.xiaoheihe.bean.account.PlatformCardBgObj;
import com.max.xiaoheihe.bean.account.PlatformCurrentDataObj;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.AllRecommendGameHeaderObj;
import com.max.xiaoheihe.bean.game.BindGameCardV2;
import com.max.xiaoheihe.bean.game.CommonAccountInfo;
import com.max.xiaoheihe.bean.game.GameCardObj;
import com.max.xiaoheihe.bean.game.GameDeveloperObj;
import com.max.xiaoheihe.bean.game.GameMobileBundleObj;
import com.max.xiaoheihe.bean.game.GameMonthlyPlayerInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePeakValueObj;
import com.max.xiaoheihe.bean.game.GamePlatformInfoObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.bean.game.GameScreenshotObj;
import com.max.xiaoheihe.bean.game.GameStoreItemObj;
import com.max.xiaoheihe.bean.game.GameStoreOrderObj;
import com.max.xiaoheihe.bean.game.MobileGameDetailsObj;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.epic.EpicAccountInfo;
import com.max.xiaoheihe.bean.game.epic.EpicAddFreeAssets;
import com.max.xiaoheihe.bean.game.epic.EpicAddFreeObj;
import com.max.xiaoheihe.bean.game.epic.EpicFriendInfo;
import com.max.xiaoheihe.bean.game.nswitch.SwitchAccountInfo;
import com.max.xiaoheihe.bean.game.nswitch.SwitchFriendInfo;
import com.max.xiaoheihe.bean.game.psn.PSNAccountInfo;
import com.max.xiaoheihe.bean.game.xbox.XboxFriendInfo;
import com.max.xiaoheihe.bean.game.xbox.XboxShortAccountInfo;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.account.GameBindingFragment;
import com.max.xiaoheihe.module.account.MeHomeFragmentx;
import com.max.xiaoheihe.module.account.PlatformFriendsActivity;
import com.max.xiaoheihe.module.account.SteamPrivacyActivity;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.max.xiaoheihe.module.game.component.PlatformDataView;
import com.max.xiaoheihe.module.game.epic.EpicFriendActivity;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.game.ow.OWGameDataFragment;
import com.max.xiaoheihe.module.game.ow.OWPlayerOverViewActivity;
import com.max.xiaoheihe.module.game.pubg.PUBGPlayerOverViewActivity;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2GameDetailFragment;
import com.max.xiaoheihe.module.mall.EpicAddFreeGamesActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.view.ContentAutoPlayTextView;
import com.max.xiaoheihe.view.richtext.RichViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: GameUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<String> f88212a = new ArrayList();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GameUtils.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CommonAccountInfo f88214c;

        a(Context context, CommonAccountInfo commonAccountInfo) {
            this.f88213b = context;
            this.f88214c = commonAccountInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34747, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88213b, this.f88214c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f88216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f88218e;

        a0(String str, Context context, String str2, String str3) {
            this.f88215b = str;
            this.f88216c = context;
            this.f88217d = str2;
            this.f88218e = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34773, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f88215b)) {
                com.max.xiaoheihe.base.router.b.j0(this.f88216c, this.f88215b);
            } else {
                if (com.max.hbcommon.utils.c.u(this.f88217d)) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.U(this.f88216c, this.f88217d, this.f88218e).A();
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public interface a1 {
        void onError();

        void onSuccess();
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BindGameCardV2 f88220c;

        b(Context context, BindGameCardV2 bindGameCardV2) {
            this.f88219b = context;
            this.f88220c = bindGameCardV2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34748, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88219b, this.f88220c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88222c;

        b0(Context context, String str) {
            this.f88221b = context;
            this.f88222c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34774, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f88221b, this.f88222c);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SwitchAccountInfo f88224c;

        c(Context context, SwitchAccountInfo switchAccountInfo) {
            this.f88223b = context;
            this.f88224c = switchAccountInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34749, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.b0.a(this.f88223b, this.f88224c.getFriend_code());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class c0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ XboxShortAccountInfo f88225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f88226c;

        c0(XboxShortAccountInfo xboxShortAccountInfo, Context context) {
            this.f88225b = xboxShortAccountInfo;
            this.f88226c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34775, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f88225b.getFriend_protocol())) {
                com.max.xiaoheihe.base.router.b.k0(this.f88226c, this.f88225b.getFriend_protocol());
            } else {
                Context context = this.f88226c;
                context.startActivity(PlatformFriendsActivity.a2(context, this.f88225b.getXuid(), "xbox"));
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88227b;

        d(Context context) {
            this.f88227b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34750, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f88227b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.U2);
            intent.putExtra("title", this.f88227b.getResources().getString(R.string.setting_faq));
            this.f88227b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88229c;

        d0(Context context, String str) {
            this.f88228b = context;
            this.f88229c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34776, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88228b, String.format(lb.a.f131030q4, this.f88229c));
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PSNAccountInfo f88230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f88231c;

        e(PSNAccountInfo pSNAccountInfo, Context context) {
            this.f88230b = pSNAccountInfo;
            this.f88231c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34751, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f88230b.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88231c, this.f88230b.getProtocol());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class e0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f88233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f88234d;

        e0(Context context, List list, int i10) {
            this.f88232b = context;
            this.f88233c = list;
            this.f88234d = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34777, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f88232b;
            context.startActivity(com.max.xiaoheihe.module.game.epic.a.a(context, ((EpicFriendInfo) this.f88233c.get(this.f88234d)).getBind_heybox_info().getUserid()));
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34752, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activityA = com.max.hbutils.utils.e.b().a();
            if (activityA instanceof BaseActivity) {
                BaseActivity baseActivity = (BaseActivity) activityA;
                if (baseActivity.isActive()) {
                    com.max.xiaoheihe.module.account.utils.l.D(baseActivity.V0(), baseActivity, false, true, 3);
                }
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EpicAccountInfo f88235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f88236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88237d;

        f0(EpicAccountInfo epicAccountInfo, Context context, String str) {
            this.f88235b = epicAccountInfo;
            this.f88236c = context;
            this.f88237d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34778, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f88235b.getFriend_protocol())) {
                com.max.xiaoheihe.base.router.b.j0(this.f88236c, this.f88235b.getFriend_protocol());
            } else {
                Context context = this.f88236c;
                context.startActivity(EpicFriendActivity.Z1(context, this.f88237d));
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f88238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountDota2InfoObj f88239c;

        g(View view, AccountDota2InfoObj accountDota2InfoObj) {
            this.f88238b = view;
            this.f88239c = accountDota2InfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34753, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88238b.getContext(), this.f88239c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class g0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88240b;

        g0(String str) {
            this.f88240b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34768, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(view.getContext(), this.f88240b).A();
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f88241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountCsGoInfoObj f88242c;

        h(View view, AccountCsGoInfoObj accountCsGoInfoObj) {
            this.f88241b = view;
            this.f88242c = accountCsGoInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34754, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88241b.getContext(), this.f88242c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class h0 extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f88243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f88244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f88245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GameBindingFragment.n f88246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f88247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88248g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f88249h;

        h0(View view, View view2, View view3, GameBindingFragment.n nVar, String str, String str2, String str3) {
            this.f88243b = view;
            this.f88244c = view2;
            this.f88245d = view3;
            this.f88246e = nVar;
            this.f88247f = str;
            this.f88248g = str2;
            this.f88249h = str3;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34780, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            this.f88243b.setVisibility(4);
            this.f88244c.setVisibility(0);
            this.f88245d.setVisibility(0);
            GameBindingFragment.n nVar = this.f88246e;
            if (nVar != null) {
                nVar.C0(this.f88247f, new Exception(GameBindingFragment.f77866s, th2));
            }
        }

        public void onNext(Result<StateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34781, new Class[]{Result.class}, Void.TYPE).isSupported) {
            }
            if (result == null || result.getResult().getState() == null) {
                this.f88243b.setVisibility(4);
                this.f88244c.setVisibility(0);
                this.f88245d.setVisibility(0);
                GameBindingFragment.n nVar = this.f88246e;
                if (nVar != null) {
                    nVar.C0(this.f88247f, new Exception(GameBindingFragment.f77868u));
                    return;
                }
                return;
            }
            String state = result.getResult().getState();
            state.hashCode();
            switch (state) {
                case "failed":
                    this.f88243b.setVisibility(4);
                    this.f88244c.setVisibility(0);
                    this.f88245d.setVisibility(0);
                    GameBindingFragment.n nVar2 = this.f88246e;
                    if (nVar2 != null) {
                        nVar2.C0(this.f88247f, new Exception(GameBindingFragment.f77868u));
                        break;
                    }
                    break;
                case "ok":
                    this.f88243b.setVisibility(4);
                    this.f88244c.setVisibility(0);
                    this.f88245d.setVisibility(0);
                    GameBindingFragment.n nVar3 = this.f88246e;
                    if (nVar3 != null) {
                        nVar3.B1(this.f88247f);
                        break;
                    }
                    break;
                case "waiting":
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.binding));
                    r1.L(this.f88243b.getContext(), this.f88243b, this.f88244c, this.f88245d, this.f88248g, this.f88247f, this.f88249h, 1, this.f88246e);
                    break;
                default:
                    this.f88243b.setVisibility(4);
                    this.f88244c.setVisibility(0);
                    this.f88245d.setVisibility(0);
                    GameBindingFragment.n nVar4 = this.f88246e;
                    if (nVar4 != null) {
                        nVar4.C0(this.f88247f, new Exception(state));
                        break;
                    }
                    break;
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34782, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class i0 extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f88250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f88251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f88252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GameBindingFragment.n f88253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f88254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f88255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f88256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f88257i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f88258j;

        /* JADX INFO: compiled from: GameUtils.java */
        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 34787, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 34786, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        i0(View view, View view2, View view3, GameBindingFragment.n nVar, String str, int i10, Context context, String str2, String str3) {
            this.f88250b = view;
            this.f88251c = view2;
            this.f88252d = view3;
            this.f88253e = nVar;
            this.f88254f = str;
            this.f88255g = i10;
            this.f88256h = context;
            this.f88257i = str2;
            this.f88258j = str3;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34783, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            View view = this.f88250b;
            if (view != null) {
                view.setVisibility(4);
            }
            View view2 = this.f88251c;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f88252d;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            GameBindingFragment.n nVar = this.f88253e;
            if (nVar != null) {
                nVar.C0(this.f88254f, new Exception(GameBindingFragment.f77866s, th2));
            }
        }

        public void onNext(Result<StateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34784, new Class[]{Result.class}, Void.TYPE).isSupported) {
            }
            if (result == null || result.getResult().getState() == null) {
                View view = this.f88250b;
                if (view != null) {
                    view.setVisibility(4);
                }
                View view2 = this.f88251c;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View view3 = this.f88252d;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                GameBindingFragment.n nVar = this.f88253e;
                if (nVar != null) {
                    nVar.C0(this.f88254f, new Exception(GameBindingFragment.f77868u));
                    return;
                }
                return;
            }
            String state = result.getResult().getState();
            state.hashCode();
            switch (state) {
                case "failed":
                    View view4 = this.f88250b;
                    if (view4 != null) {
                        view4.setVisibility(4);
                    }
                    View view5 = this.f88251c;
                    if (view5 != null) {
                        view5.setVisibility(0);
                    }
                    View view6 = this.f88252d;
                    if (view6 != null) {
                        view6.setVisibility(0);
                    }
                    GameBindingFragment.n nVar2 = this.f88253e;
                    if (nVar2 != null) {
                        nVar2.C0(this.f88254f, new Exception(GameBindingFragment.f77868u));
                        break;
                    }
                    break;
                case "ok":
                    View view7 = this.f88250b;
                    if (view7 != null) {
                        view7.setVisibility(4);
                    }
                    View view8 = this.f88251c;
                    if (view8 != null) {
                        view8.setVisibility(0);
                    }
                    View view9 = this.f88252d;
                    if (view9 != null) {
                        view9.setVisibility(0);
                    }
                    GameBindingFragment.n nVar3 = this.f88253e;
                    if (nVar3 != null) {
                        nVar3.B1(this.f88254f);
                        break;
                    }
                    break;
                case "waiting":
                    int i10 = this.f88255g;
                    if (i10 > 8) {
                        View view10 = this.f88250b;
                        if (view10 != null) {
                            view10.setVisibility(4);
                        }
                        View view11 = this.f88251c;
                        if (view11 != null) {
                            view11.setVisibility(0);
                        }
                        View view12 = this.f88252d;
                        if (view12 != null) {
                            view12.setVisibility(0);
                        }
                        if (!"psn".equals(this.f88254f)) {
                            GameBindingFragment.n nVar4 = this.f88253e;
                            if (nVar4 != null) {
                                nVar4.C0(this.f88254f, new Exception(GameBindingFragment.f77867t));
                            }
                        } else {
                            com.max.xiaoheihe.view.l.D(this.f88256h, "", com.max.xiaoheihe.utils.d.n0(R.string.bind_psn_time_out_msg), com.max.xiaoheihe.utils.d.n0(R.string.confirm), null, new a());
                        }
                        break;
                    } else {
                        r1.L(this.f88256h, this.f88250b, this.f88251c, this.f88252d, this.f88257i, this.f88254f, this.f88258j, i10 + 1, this.f88253e);
                        break;
                    }
                    break;
                default:
                    View view13 = this.f88250b;
                    if (view13 != null) {
                        view13.setVisibility(4);
                    }
                    View view14 = this.f88251c;
                    if (view14 != null) {
                        view14.setVisibility(0);
                    }
                    View view15 = this.f88252d;
                    if (view15 != null) {
                        view15.setVisibility(0);
                    }
                    GameBindingFragment.n nVar5 = this.f88253e;
                    if (nVar5 != null) {
                        nVar5.C0(this.f88254f, new Exception(state));
                        break;
                    }
                    break;
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34785, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f88261c;

        j(Context context, GameObj gameObj) {
            this.f88260b = context;
            this.f88261c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34755, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f88260b;
            context.startActivity(com.max.xiaoheihe.module.game.z.b(context, this.f88261c.getH_src(), r1.Z(this.f88261c), this.f88261c.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class j0 extends com.max.hbcommon.network.d<Result<EpicAddFreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f88262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.network.p f88263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f88264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f88265e;

        j0(Activity activity, com.max.hbcommon.network.p pVar, boolean z10, String str) {
            this.f88262b = activity;
            this.f88263c = pVar;
            this.f88264d = z10;
            this.f88265e = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34788, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = this.f88262b;
            if ((!(activity instanceof BaseActivity) || ((BaseActivity) activity).isActive()) && !this.f88262b.isFinishing()) {
                super.onError(th2);
                com.max.hbcommon.network.p pVar = this.f88263c;
                if (pVar != null) {
                    pVar.onError(th2);
                }
            }
        }

        public void onNext(Result<EpicAddFreeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34789, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = this.f88262b;
            if ((!(activity instanceof BaseActivity) || ((BaseActivity) activity).isActive()) && !this.f88262b.isFinishing()) {
                super.onNext(result);
                if (result.getResult() == null || result.getResult().getAddfreelicense_epic() == null) {
                    Activity activity2 = this.f88262b;
                    activity2.startActivity(EpicAddFreeGamesActivity.G2(activity2, this.f88265e, this.f88264d));
                } else {
                    Boolean boolValueOf = Boolean.valueOf(this.f88264d);
                    if (this.f88264d) {
                        for (EpicAddFreeAssets epicAddFreeAssets : result.getResult().getAddfreelicense_epic().getAssets()) {
                            boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && JDCacheResourceManager.f94723a.m(epicAddFreeAssets.getKey(), epicAddFreeAssets.getSource()));
                        }
                    }
                    com.max.heybox.hblog.g.W("[EpicAddFree] actual_use_web_pack:" + boolValueOf);
                    Activity activity3 = this.f88262b;
                    activity3.startActivity(EpicAddFreeGamesActivity.G2(activity3, this.f88265e, boolValueOf.booleanValue()));
                }
                com.max.hbcommon.network.p pVar = this.f88263c;
                if (pVar != null) {
                    pVar.onNext((Result) result);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34790, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<EpicAddFreeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FlexboxLayout f88266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f88267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f88268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f88269e;

        k(FlexboxLayout flexboxLayout, List list, boolean z10, int i10) {
            this.f88266b = flexboxLayout;
            this.f88267c = list;
            this.f88268d = z10;
            this.f88269e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34746, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f88266b.setVisibility(0);
            this.f88266b.removeAllViews();
            int iW = ViewUtils.W(this.f88266b);
            for (View view : this.f88267c) {
                int iW2 = ViewUtils.W(view);
                if ((view instanceof TextView) && this.f88268d) {
                    iW2 += this.f88269e;
                }
                if (iW <= iW2 || iW <= 0) {
                    return;
                }
                this.f88266b.addView(view);
                iW -= iW2;
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class k0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f88270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CheckBox f88272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a1 f88273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f88274f;

        k0(BaseActivity baseActivity, String str, CheckBox checkBox, a1 a1Var, y0 y0Var) {
            this.f88270b = baseActivity;
            this.f88271c = str;
            this.f88272d = checkBox;
            this.f88273e = a1Var;
            this.f88274f = y0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34791, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            r1.l2(this.f88270b, null, this.f88271c, this.f88272d.isChecked(), this.f88273e);
            y0 y0Var = this.f88274f;
            if (y0Var != null) {
                y0Var.a();
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f88276c;

        l(Context context, GameObj gameObj) {
            this.f88275b = context;
            this.f88276c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34756, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((this.f88275b instanceof SearchNewActivity) && this.f88276c.getReport_id() != null) {
                com.max.hbcommon.utils.k.f(this.f88276c.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f88276c.getCustom_index(), this.f88276c.getCustom_suggested_from());
            }
            Context context = this.f88275b;
            context.startActivity(com.max.xiaoheihe.module.game.z.b(context, this.f88276c.getH_src(), r1.Z(this.f88276c), this.f88276c.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class l0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f88277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseActivity f88278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CheckBox f88280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a1 f88281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y0 f88282g;

        l0(EditText editText, BaseActivity baseActivity, String str, CheckBox checkBox, a1 a1Var, y0 y0Var) {
            this.f88277b = editText;
            this.f88278c = baseActivity;
            this.f88279d = str;
            this.f88280e = checkBox;
            this.f88281f = a1Var;
            this.f88282g = y0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34792, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String string = this.f88277b.getText().toString();
            if (!com.max.hbcommon.utils.c.B(string)) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.input_right_phonenum));
                return;
            }
            r1.l2(this.f88278c, string, this.f88279d, this.f88280e.isChecked(), this.f88281f);
            y0 y0Var = this.f88282g;
            if (y0Var != null) {
                y0Var.b();
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class m implements RadioGroup.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HBViewPager2 f88283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f88284b;

        m(HBViewPager2 hBViewPager2, z0 z0Var) {
            this.f88283a = hBViewPager2;
            this.f88284b = z0Var;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            int i11 = 0;
            if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, 34757, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            for (int i12 = 0; i12 < radioGroup.getChildCount(); i12++) {
                if (i10 == radioGroup.getChildAt(i12).getId()) {
                    i11 = i12;
                    break;
                }
            }
            Log.d("onCheckedChanged", "current:" + i11);
            this.f88283a.setCurrentItem(i11);
            String strI0 = r1.i0(i10);
            com.max.hbcache.c.C(com.max.hbcache.c.f66158y, strI0);
            z0 z0Var = this.f88284b;
            if (z0Var != null) {
                z0Var.a(strI0);
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class m0 extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f88285b;

        m0(a1 a1Var) {
            this.f88285b = a1Var;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34794, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            a1 a1Var = this.f88285b;
            if (a1Var != null) {
                a1Var.onSuccess();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34793, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            a1 a1Var = this.f88285b;
            if (a1Var != null) {
                a1Var.onError();
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class n extends HBViewPager2.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RadioGroup f88286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f88287b;

        n(RadioGroup radioGroup, z0 z0Var) {
            this.f88286a = radioGroup;
            this.f88287b = z0Var;
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
        public void a(int i10) {
            z0 z0Var;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34759, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.a(i10);
            if (i10 != 0 || (z0Var = this.f88287b) == null) {
                return;
            }
            z0Var.b();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
        public void c(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34758, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.c(i10);
            if (this.f88286a.getCheckedRadioButtonId() != this.f88286a.getChildAt(i10).getId()) {
                Log.d("vp_platform", "onPageSelected  current:" + i10);
                RadioButton radioButton = (RadioButton) this.f88286a.getChildAt(i10);
                if (radioButton != null) {
                    radioButton.setChecked(true);
                }
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class n0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34795, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class o extends com.max.hbcommon.base.adapter.s<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f88288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameBindingFragment.n f88289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88290d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Context context, List list, int i10, z0 z0Var, GameBindingFragment.n nVar, String str) {
            super(context, list, i10);
            this.f88288b = z0Var;
            this.f88289c = nVar;
            this.f88290d = str;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, Integer num) {
            if (PatchProxy.proxy(new Object[]{eVar, num}, this, changeQuickRedirect, false, 34760, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) eVar.b();
            viewGroup.setTag(R.id.absolute_position, Integer.valueOf(eVar.getAbsoluteAdapterPosition()));
            if (viewGroup.getChildCount() == 0) {
                r1.X1(r1.i0(num.intValue()), viewGroup, this.f88288b, this.f88289c, this.f88290d);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Integer num) {
            if (PatchProxy.proxy(new Object[]{eVar, num}, this, changeQuickRedirect, false, 34761, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, num);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class o0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88292c;

        o0(Context context, String str) {
            this.f88291b = context;
            this.f88292c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34796, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            com.max.hbapkinstaller.d.b(this.f88291b, this.f88292c);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f88293b;

        p(HomeDataObj homeDataObj) {
            this.f88293b = homeDataObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34762, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            r1.e1(view.getContext(), this.f88293b.getSteam_id_info().getSteamid() == null ? "-1" : this.f88293b.getSteam_id_info().getSteamid());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class p0 extends com.max.hbcommon.network.d<Result<BindProtocolObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88294b;

        p0(Context context) {
            this.f88294b = context;
        }

        public void onNext(Result<BindProtocolObj> result) {
            Context context;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34797, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (result == null || result.getResult() == null || (context = this.f88294b) == null) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(context, result.getResult().getLogin_protocol());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34798, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BindProtocolObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f88295b;

        q(z0 z0Var) {
            this.f88295b = z0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z0 z0Var;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34763, new Class[]{View.class}, Void.TYPE).isSupported || (z0Var = this.f88295b) == null) {
                return;
            }
            z0Var.e();
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class q0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f88296b;

        q0(a1 a1Var) {
            this.f88296b = a1Var;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34800, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            a1 a1Var = this.f88296b;
            if (a1Var != null) {
                a1Var.onSuccess();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34799, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            a1 a1Var = this.f88296b;
            if (a1Var != null) {
                a1Var.onError();
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f88297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f88298c;

        r(HomeDataObj homeDataObj, Context context) {
            this.f88297b = homeDataObj;
            this.f88298c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34764, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f88297b.getSteam_id_info().getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f88298c, this.f88297b.getSteam_id_info().getProtocol());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class r0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f88300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f88302e;

        r0(Context context, GameObj gameObj, String str, View.OnClickListener onClickListener) {
            this.f88299b = context;
            this.f88300c = gameObj;
            this.f88301d = str;
            this.f88302e = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34779, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f88299b.startActivity(ChannelsDetailActivity.e3(com.max.xiaoheihe.module.game.z.b(this.f88299b, this.f88300c.getH_src(), r1.Z(this.f88300c), this.f88300c.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null), this.f88301d));
            View.OnClickListener onClickListener = this.f88302e;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f88303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f88304c;

        s(HomeDataObj homeDataObj, Context context) {
            this.f88303b = homeDataObj;
            this.f88304c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34765, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f88303b.getXbox_account_info().getV3_protocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88304c, this.f88303b.getXbox_account_info().getV3_protocol());
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class s0 extends com.max.hbcommon.network.d<Result<BindGameDetailProtocolObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88305b;

        s0(Context context) {
            this.f88305b = context;
        }

        public void onNext(Result<BindGameDetailProtocolObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34802, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (SwitchDetailActivity.P.equals(result.getResult().getType())) {
                com.max.xiaoheihe.base.router.b.k0(this.f88305b, result.getResult().getProtocol());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34803, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BindGameDetailProtocolObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f88307c;

        t(Context context, HomeDataObj homeDataObj) {
            this.f88306b = context;
            this.f88307c = homeDataObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34766, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f88306b;
            context.startActivity(com.max.xiaoheihe.module.game.epic.a.a(context, this.f88307c.getAccount_detail().getUserid()));
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class t0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecommendGameListItemObj f88309c;

        t0(Context context, RecommendGameListItemObj recommendGameListItemObj) {
            this.f88308b = context;
            this.f88309c = recommendGameListItemObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34801, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f88308b;
            context.startActivity(com.max.xiaoheihe.module.game.z.b(context, this.f88309c.getGame().getH_src(), this.f88309c.getGame().getAppid(), null, null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f88311c;

        u(Context context, HomeDataObj homeDataObj) {
            this.f88310b = context;
            this.f88311c = homeDataObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34767, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.c0(this.f88310b, this.f88311c.getSwitch_account_info().getHeybox_id(), this.f88311c.getSwitch_account_info().getType(), this.f88311c.getSwitch_account_info().getProtocol()).A();
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class u0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecommendGameListItemObj f88313c;

        u0(Context context, RecommendGameListItemObj recommendGameListItemObj) {
            this.f88312b = context;
            this.f88313c = recommendGameListItemObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34804, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.F(this.f88312b, this.f88313c.getH_src(), this.f88313c.getLinkid(), this.f88313c.getLink_tag(), this.f88313c.getHas_video(), null);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class v implements IValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return "";
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class v0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecommendGameListItemObj f88315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f88316d;

        v0(Context context, RecommendGameListItemObj recommendGameListItemObj, View.OnClickListener onClickListener) {
            this.f88314b = context;
            this.f88315c = recommendGameListItemObj;
            this.f88316d = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34805, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88314b, this.f88315c.getProtocol());
            View.OnClickListener onClickListener = this.f88316d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f88317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f88318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88319d;

        w(HomeDataObj homeDataObj, Context context, String str) {
            this.f88317b = homeDataObj;
            this.f88318c = context;
            this.f88319d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34769, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f88317b.getHardware_info() != null && !com.max.hbcommon.utils.c.u(this.f88317b.getHardware_info().getProtocol())) {
                com.max.xiaoheihe.base.router.b.k0(this.f88318c, this.f88317b.getHardware_info().getProtocol());
                return;
            }
            Intent intent = new Intent(this.f88318c, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130950d2 + this.f88317b.getAccount_detail().getUserid());
            intent.putExtra("title", this.f88319d);
            this.f88318c.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class w0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecommendGameListItemObj f88321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f88322d;

        w0(Context context, RecommendGameListItemObj recommendGameListItemObj, View.OnClickListener onClickListener) {
            this.f88320b = context;
            this.f88321c = recommendGameListItemObj;
            this.f88322d = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34806, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(this.f88320b, r1.x(this.f88321c));
            View.OnClickListener onClickListener = this.f88322d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88324c;

        x(Context context, String str) {
            this.f88323b = context;
            this.f88324c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34770, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f88323b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130956e2);
            intent.putExtra("title", this.f88324c);
            this.f88323b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class x0 implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayout.LayoutParams f88325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f88327c;

        x0(LinearLayout.LayoutParams layoutParams, Context context, ImageView imageView) {
            this.f88325a = layoutParams;
            this.f88326b = context;
            this.f88327c = imageView;
        }

        @Override // com.max.hbimage.b.q
        public void a(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 34807, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                return;
            }
            this.f88325a.width = ViewUtils.f(this.f88326b, drawable.getMinimumWidth() / 3.0f);
            this.f88325a.height = ViewUtils.f(this.f88326b, drawable.getMinimumHeight() / 3.0f);
            this.f88327c.setImageDrawable(drawable);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(Drawable drawable) {
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0 f88329c;

        y(Context context, z0 z0Var) {
            this.f88328b = context;
            this.f88329c = z0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z0 z0Var;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34771, new Class[]{View.class}, Void.TYPE).isSupported || !com.max.xiaoheihe.utils.i0.e(this.f88328b) || (z0Var = this.f88329c) == null) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.D(z0Var.c(), (Activity) this.f88328b, false, true, 1);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public interface y0 {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0 f88331c;

        z(Context context, z0 z0Var) {
            this.f88330b = context;
            this.f88331c = z0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z0 z0Var;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34772, new Class[]{View.class}, Void.TYPE).isSupported || !com.max.xiaoheihe.utils.i0.e(this.f88330b) || (z0Var = this.f88331c) == null) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.D(z0Var.c(), (Activity) this.f88330b, false, false, 1);
        }
    }

    /* JADX INFO: compiled from: GameUtils.java */
    public interface z0 {
        void a(String str);

        void b();

        io.reactivex.disposables.a c();

        void d(View view, String str);

        void e();
    }

    public static void A(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj}, null, changeQuickRedirect, true, 34599, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        B(eVar, gameObj, false, true);
    }

    public static View A0(final Context context, ViewGroup viewGroup, final GameBindingFragment.n nVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, nVar}, null, changeQuickRedirect, true, 34695, new Class[]{Context.class, ViewGroup.class, GameBindingFragment.n.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_bind_card_dota2_v2, viewGroup, false);
        final View viewFindViewById = viewInflate.findViewById(R.id.tv_bind_btn);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.name_edit_text);
        final CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.cp_loading);
        float fM = M(context);
        editText.setBackground(com.max.hbutils.utils.q.o(context, R.color.white, ViewUtils.h0(context, fM)));
        viewFindViewById.setBackground(com.max.hbutils.utils.q.o(context, R.color.dota2_red, ViewUtils.h0(context, fM)));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.S0(context, nVar, editText, circularProgressIndicator, viewFindViewById, view);
            }
        });
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x014a  */
    public static void A1(CustomHorizontalScrollView customHorizontalScrollView, List<KeyDescObj> list, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        View view;
        int i11 = 0;
        boolean z13 = true;
        int i12 = 2;
        Object[] objArr = {customHorizontalScrollView, list, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34614, new Class[]{CustomHorizontalScrollView.class, List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = customHorizontalScrollView.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        customHorizontalScrollView.removeAllViews();
        if (list == null || list.size() <= 0) {
            return;
        }
        linearLayout.removeAllViews();
        int iF = ViewUtils.f(context, 6.0f);
        int iF2 = ViewUtils.f(context, 5.0f);
        int color = context.getResources().getColor(z11 ? R.color.text_secondary_1_color : R.color.desc_color);
        int i13 = 0;
        while (i13 < list.size() && i13 <= i12) {
            String desc = list.get(i13).getDesc();
            list.get(i13).getType();
            if (com.max.hbcommon.utils.c.u(desc)) {
                z12 = z13;
                i10 = i12;
            } else {
                TextView textView = new TextView(context);
                if (z10) {
                    textView.setPadding(ViewUtils.f(context, 4.0f), ViewUtils.f(context, 1.0f), ViewUtils.f(context, 4.0f), ViewUtils.f(context, 1.0f));
                } else {
                    textView.setPadding(i11, i11, i11, i11);
                }
                textView.setTextSize(i11, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
                textView.setTextColor(color);
                textView.setBackgroundResource(R.drawable.btn_border_1dp);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMinHeight(ViewUtils.f(context, 16.0f));
                textView.setGravity(17);
                textView.setText(desc);
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                if (z10) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i13 == 0 ? i11 : iF;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i11;
                }
                i10 = 2;
                if (i13 != 2) {
                    z12 = true;
                    if (i13 == list.size() - 1) {
                    }
                    textView.setLayoutParams(layoutParams);
                    view = null;
                    if (!z10 && i13 != 0) {
                        view = new View(context);
                        FlexboxLayout.LayoutParams layoutParams2 = new FlexboxLayout.LayoutParams(ViewUtils.f(context, 0.5f), ViewUtils.f(context, 9.0f));
                        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = iF2;
                        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = iF2;
                        view.setLayoutParams(layoutParams2);
                        view.setBackgroundColor(color);
                    }
                    if (view != null) {
                        linearLayout.addView(view);
                    }
                    linearLayout.addView(textView);
                } else {
                    z12 = true;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = iF;
                textView.setLayoutParams(layoutParams);
                view = null;
                if (!z10) {
                    view = new View(context);
                    FlexboxLayout.LayoutParams layoutParams3 = new FlexboxLayout.LayoutParams(ViewUtils.f(context, 0.5f), ViewUtils.f(context, 9.0f));
                    ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = iF2;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = iF2;
                    view.setLayoutParams(layoutParams3);
                    view.setBackgroundColor(color);
                }
                if (view != null) {
                    linearLayout.addView(view);
                }
                linearLayout.addView(textView);
            }
            i13++;
            i12 = i10;
            z13 = z12;
            i11 = 0;
        }
        customHorizontalScrollView.addView(linearLayout);
    }

    public static void B(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, boolean z11) {
        Object[] objArr = {eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34600, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        C((GamePriceView) eVar.i(R.id.gpv), gameObj, z10, z11);
    }

    public static View B0(final Context context, ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup}, null, changeQuickRedirect, true, 34692, new Class[]{Context.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = ((Activity) context).getLayoutInflater().inflate(R.layout.layout_bind_card_epic_v2, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.rl_bind);
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_help);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        imageView.setBackground(com.max.hbutils.utils.q.o(context, R.color.epic_blue, ViewUtils.h0(context, ViewUtils.o(context, imageView))));
        viewFindViewById.setBackground(com.max.hbutils.utils.q.o(context, R.color.epic_blue, ViewUtils.h0(context, M(context))));
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.cp_loading);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.T0(context, view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.U0(context, view);
            }
        });
        if (MeHomeFragmentx.Z3) {
            circularProgressIndicator.p();
            viewFindViewById.setVisibility(8);
            L(context, viewFindViewById, circularProgressIndicator, null, null, "epic", null, 1, null);
        } else {
            circularProgressIndicator.j();
            viewFindViewById.setVisibility(0);
        }
        return viewInflate;
    }

    public static void B1(LinearLayout linearLayout, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{linearLayout, gameObj}, null, changeQuickRedirect, true, 34641, new Class[]{LinearLayout.class, GameObj.class}, Void.TYPE).isSupported || linearLayout == null) {
            return;
        }
        Context context = linearLayout.getContext();
        List<String> platforms_icon = gameObj.getPlatforms_icon();
        if (platforms_icon == null || platforms_icon.size() <= 0) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        Iterator<String> it = platforms_icon.iterator();
        while (it.hasNext()) {
            ImageView imageViewN0 = n0(context, it.next(), ViewUtils.f(context, 14.0f));
            if (imageViewN0 != null) {
                linearLayout.addView(imageViewN0);
            }
        }
    }

    public static boolean C(GamePriceView gamePriceView, GameObj gameObj, boolean z10, boolean z11) {
        Object[] objArr = {gamePriceView, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34601, new Class[]{GamePriceView.class, GameObj.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (gamePriceView != null) {
            return gamePriceView.h(gameObj, z10, z11 ? GamePriceView.ColorType.Light : GamePriceView.ColorType.Dark);
        }
        return false;
    }

    public static View C0(final Context context, ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup}, null, changeQuickRedirect, true, 34694, new Class[]{Context.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = ((Activity) context).getLayoutInflater().inflate(R.layout.layout_bind_card_hardware_v2, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.rl_bind);
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) viewInflate.findViewById(R.id.iv_icon);
        qMUIRadiusImageView.setCornerRadius(ViewUtils.o(context, qMUIRadiusImageView));
        viewFindViewById.setBackground(ViewUtils.x(M(context), com.max.hbcommon.utils.l.a(R.color.btn_blue_start), com.max.hbcommon.utils.l.a(R.color.btn_purple_end)));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.V0(context, view);
            }
        });
        return viewInflate;
    }

    public static void C1(Context context, LineChart lineChart, List<GamePeakValueObj> list) {
        if (PatchProxy.proxy(new Object[]{context, lineChart, list}, null, changeQuickRedirect, true, 34625, new Class[]{Context.class, LineChart.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        int color = context.getResources().getColor(R.color.divider_secondary_1_color);
        int color2 = context.getResources().getColor(R.color.text_primary_2_color);
        YAxis axisRight = lineChart.getAxisRight();
        YAxis axisLeft = lineChart.getAxisLeft();
        XAxis xAxis = lineChart.getXAxis();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(new Entry(i10, Integer.parseInt(list.get(i10).getPeak_value())));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, null);
        lineDataSet.setValueFormatter(new v());
        Drawable drawable = context.getResources().getDrawable(R.drawable.game_linechart_fill_gradient);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillDrawable(drawable);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setColor(color2);
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineChart.setData(new LineData(lineDataSet));
        axisLeft.setAxisLineColor(color);
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawAxisLine(false);
        axisRight.setEnabled(false);
        xAxis.setAxisLineColor(color);
        xAxis.setDrawLabels(false);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        lineChart.setHighlightPerTapEnabled(false);
        lineChart.getDescription().setEnabled(false);
        lineChart.getLegend().setEnabled(false);
        lineChart.setScaleEnabled(false);
        lineChart.setDragEnabled(false);
        lineChart.setViewPortOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        lineChart.notifyDataSetChanged();
        lineChart.invalidate();
    }

    public static void D(String str, String str2, a1 a1Var) {
        if (PatchProxy.proxy(new Object[]{str, str2, a1Var}, null, changeQuickRedirect, true, 34728, new Class[]{String.class, String.class, a1.class}, Void.TYPE).isSupported) {
            return;
        }
        ("following".equalsIgnoreCase(str2) ? com.max.xiaoheihe.network.i.a().cb(str) : com.max.xiaoheihe.network.i.a().x3(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q0(a1Var));
    }

    public static List<PlatformCardBgObj> D0(ArrayList<String> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 34682, new Class[]{ArrayList.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!com.max.hbcommon.utils.c.w(arrayList)) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(I0(it.next()));
            }
        }
        return arrayList2;
    }

    public static void D1(com.max.hbcommon.base.adapter.s.e eVar, GameMobileBundleObj gameMobileBundleObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameMobileBundleObj}, null, changeQuickRedirect, true, 34667, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameMobileBundleObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        TextView textView = (TextView) eVar.i(R.id.tv_time_desc);
        com.max.hbimage.b.K(gameMobileBundleObj.getImg(), imageView);
        eVar.p(R.id.tv_name, gameMobileBundleObj.getName());
        eVar.p(R.id.tv_desc, gameMobileBundleObj.getDescription());
        if (com.max.hbcommon.utils.c.u(gameMobileBundleObj.getTime_desc())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(gameMobileBundleObj.getTime_desc());
        }
    }

    public static String E(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34608, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? new DecimalFormat("###,###.##").format(com.max.hbutils.utils.n.o(str)) : str;
    }

    public static View E0(final Context context, ViewGroup viewGroup, final GameBindingFragment.n nVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, nVar}, null, changeQuickRedirect, true, 34690, new Class[]{Context.class, ViewGroup.class, GameBindingFragment.n.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = ((Activity) context).getLayoutInflater().inflate(R.layout.layout_bind_card_psn_v2, viewGroup, false);
        final View viewFindViewById = viewInflate.findViewById(R.id.tv_bind_btn);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.name_edit_text);
        final CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.cp_loading);
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_help);
        int iM = M(context);
        imageView.setBackground(com.max.hbutils.utils.q.o(context, R.color.psn_blue, ViewUtils.h0(context, ViewUtils.o(context, imageView))));
        float f10 = iM;
        editText.setBackground(com.max.hbutils.utils.q.o(context, R.color.white, ViewUtils.h0(context, f10)));
        viewFindViewById.setBackground(com.max.hbutils.utils.q.o(context, R.color.psn_blue, ViewUtils.h0(context, f10)));
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.W0(context, view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.X0(context, nVar, editText, circularProgressIndicator, viewFindViewById, view);
            }
        });
        return viewInflate;
    }

    public static void E1(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, a2 a2Var) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, a2Var}, null, changeQuickRedirect, true, 34668, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, a2.class}, Void.TYPE).isSupported) {
            return;
        }
        List<GamePlatformInfoObj> platform_infos = gameObj.getPlatform_infos();
        if (platform_infos != null && platform_infos.size() > 0) {
            for (int i10 = 0; i10 < platform_infos.size(); i10++) {
                if ("iOS".equals(platform_infos.get(i10).getKey())) {
                    platform_infos.remove(i10);
                    break;
                }
            }
        }
        View viewB = eVar.b();
        Context context = viewB.getContext();
        GradientTextView gradientTextView = (GradientTextView) eVar.i(R.id.tv_rank);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        FlexboxLayout flexboxLayout = (FlexboxLayout) eVar.i(R.id.fl_tags);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        if (gradientTextView != null) {
            ViewGroup.LayoutParams layoutParams = gradientTextView.getLayoutParams();
            int rank = gameObj.getRank();
            int iF = ViewUtils.f(context, rank > 0 ? 42.0f : 12.0f);
            if (layoutParams != null && layoutParams.width != iF) {
                layoutParams.width = iF;
                gradientTextView.setLayoutParams(layoutParams);
            }
            if (rank > 0) {
                gradientTextView.setTextSize(0, context.getResources().getDimensionPixelSize(rank < 10 ? R.dimen.text_size_19 : rank < 100 ? R.dimen.text_size_18 : R.dimen.text_size_16));
                Pair<Integer, Integer> pairO = com.max.xiaoheihe.module.account.utils.l.o(rank);
                gradientTextView.setColors(((Integer) pairO.first).intValue(), ((Integer) pairO.second).intValue(), GradientDrawable.Orientation.BL_TR);
                bb.d.d(gradientTextView, 2);
                gradientTextView.setText(String.format(Locale.US, TimeModel.f55754j, Integer.valueOf(rank)));
            } else {
                gradientTextView.setText((CharSequence) null);
            }
        }
        com.max.hbimage.b.L(gameObj.getAppicon(), imageView, R.drawable.common_default_placeholder_375x210);
        textView.setText(gameObj.getName());
        if (eVar.i(R.id.vg_score) != null) {
            P1(eVar, gameObj.getScore_desc(), gameObj.getScore());
        }
        z1(flexboxLayout, gameObj.getHot_tags(), true, true);
        if (eVar.i(R.id.gpv) != null) {
            B(eVar, gameObj, false, true);
            eVar.i(R.id.tv_download).setVisibility(8);
        } else {
            a2Var.d(eVar, gameObj, true);
        }
        viewB.setOnClickListener(new l(context, gameObj));
    }

    public static String F(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34603, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? com.max.hbutils.utils.n.f("#.##").format(q(str)) : str;
    }

    public static View F0(Context context, ViewGroup viewGroup, z0 z0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, z0Var}, null, changeQuickRedirect, true, 34689, new Class[]{Context.class, ViewGroup.class, z0.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup2 = (ViewGroup) ((Activity) context).getLayoutInflater().inflate(R.layout.layout_bind_card_steam_v2, viewGroup, false);
        com.max.xiaoheihe.module.account.utils.l.Z(viewGroup2, null, new y(context, z0Var), new z(context, z0Var));
        return viewGroup2;
    }

    public static void F1(View view, GameMonthlyPlayerInfoObj gameMonthlyPlayerInfoObj) {
        if (PatchProxy.proxy(new Object[]{view, gameMonthlyPlayerInfoObj}, null, changeQuickRedirect, true, 34660, new Class[]{View.class, GameMonthlyPlayerInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_month);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_player);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_delta);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_delta_percent);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_peak);
        textView.setText(gameMonthlyPlayerInfoObj.getMonth());
        textView2.setText(gameMonthlyPlayerInfoObj.getAvg_player());
        textView5.setText(gameMonthlyPlayerInfoObj.getPeak_value());
        if ("inc".equals(gameMonthlyPlayerInfoObj.getType())) {
            textView3.setText("+" + gameMonthlyPlayerInfoObj.getDelta());
            textView4.setText("+" + gameMonthlyPlayerInfoObj.getDelta_percent() + "%");
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (!"dec".equals(gameMonthlyPlayerInfoObj.getType())) {
            textView3.setText(gameMonthlyPlayerInfoObj.getDelta());
            textView4.setText(gameMonthlyPlayerInfoObj.getDelta_percent());
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.appbar_text_color));
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.appbar_text_color));
            return;
        }
        textView3.setText(Constants.ACCEPT_TIME_SEPARATOR_SERVER + gameMonthlyPlayerInfoObj.getDelta());
        textView4.setText(Constants.ACCEPT_TIME_SEPARATOR_SERVER + gameMonthlyPlayerInfoObj.getDelta_percent() + "%");
        textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
    }

    public static String G(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34606, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? new DecimalFormat("#").format(Math.ceil(q(str))) : str;
    }

    public static View G0(final Context context, ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup}, null, changeQuickRedirect, true, 34693, new Class[]{Context.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = ((Activity) context).getLayoutInflater().inflate(R.layout.layout_bind_card_switch_v2, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.rl_bind);
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_help);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        imageView.setBackground(com.max.hbutils.utils.q.o(context, R.color.switch_color, ViewUtils.h0(context, ViewUtils.o(context, imageView))));
        viewFindViewById.setBackground(com.max.hbutils.utils.q.o(context, R.color.switch_color, ViewUtils.h0(context, M(context))));
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.Y0(context, view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.Z0(context, view);
            }
        });
        return viewInflate;
    }

    public static void G1(com.max.hbcommon.base.adapter.s.e eVar, MallPriceObj mallPriceObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, mallPriceObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34598, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallPriceObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewI = eVar.i(R.id.vg_normal_price);
        TextView textView = (TextView) viewI.findViewById(R.id.tv_current_price_symbol);
        TextView textView2 = (TextView) viewI.findViewById(R.id.tv_current_price);
        TextView textView3 = (TextView) viewI.findViewById(R.id.tv_original_price);
        TextView textView4 = (TextView) viewI.findViewById(R.id.tv_lowest_in_history);
        Context context = viewI.getContext();
        viewI.setBackgroundResource(z10 ? R.drawable.price_bg_1dp : R.drawable.price_bg_dark_1dp);
        if (mallPriceObj == null || com.max.hbcommon.utils.c.u(mallPriceObj.getFinal_price())) {
            viewI.setVisibility(8);
            return;
        }
        Resources resources = context.getResources();
        int i10 = R.color.text_primary_1_color;
        int i11 = R.color.white;
        textView.setTextColor(resources.getColor(z10 ? R.color.text_primary_1_color : R.color.white));
        Resources resources2 = context.getResources();
        if (!z10) {
            i10 = R.color.white;
        }
        textView2.setTextColor(resources2.getColor(i10));
        Resources resources3 = context.getResources();
        if (z10) {
            i11 = R.color.text_secondary_1_color;
        }
        textView3.setTextColor(resources3.getColor(i11));
        bb.d.d(textView2, 2);
        textView2.setText(G(mallPriceObj.getFinal_price()));
        if (com.max.hbcommon.utils.c.u(mallPriceObj.getInitial_price()) || mallPriceObj.getInitial_price().equals(mallPriceObj.getFinal_price())) {
            textView3.setVisibility(8);
        } else {
            bb.d.d(textView3, 2);
            SpannableString spannableString = new SpannableString(context.getResources().getString(R.string.rmb_symbol) + G(mallPriceObj.getInitial_price()));
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            textView3.setText(spannableString);
            textView3.setVisibility(0);
        }
        textView4.setVisibility(8);
        viewI.setVisibility(0);
    }

    public static String H(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34604, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? com.max.hbutils.utils.n.f("#.#").format(q(str)) : str;
    }

    public static View H0(final Context context, ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup}, null, changeQuickRedirect, true, 34691, new Class[]{Context.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = ((Activity) context).getLayoutInflater().inflate(R.layout.layout_bind_card_xbox_v2, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_bind_btn);
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_help);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        imageView.setBackground(com.max.hbutils.utils.q.o(context, R.color.xbox_green2, ViewUtils.h0(context, ViewUtils.o(context, imageView))));
        viewFindViewById.setBackground(com.max.hbutils.utils.q.o(context, R.color.xbox_green3, ViewUtils.h0(context, M(context))));
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.a1(context, view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.b1(context, view);
            }
        });
        return viewInflate;
    }

    public static void H1(View view, HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{view, homeDataObj}, null, changeQuickRedirect, true, 34657, new Class[]{View.class, HomeDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_game_data_card_bg);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_avatar);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ll_tips);
        TextView textView = (TextView) view.findViewById(R.id.tv_tips);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_tips);
        PlatformDataView platformDataView = (PlatformDataView) view.findViewById(R.id.pdv0);
        PlatformDataView platformDataView2 = (PlatformDataView) view.findViewById(R.id.pdv1);
        PlatformDataView platformDataView3 = (PlatformDataView) view.findViewById(R.id.pdv2);
        PlatformDataView platformDataView4 = (PlatformDataView) view.findViewById(R.id.pdv3);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_card_desc);
        PSNAccountInfo psn_account_info = homeDataObj.getPsn_account_info();
        if ("1".equals(psn_account_info.getIs_open())) {
            textView.setText(psn_account_info.getDescription());
            viewGroup.setVisibility(0);
            imageView3.setVisibility(8);
        } else {
            textView.setText(R.string.make_psn_info_public);
            viewGroup.setVisibility(0);
            imageView3.setVisibility(0);
            viewGroup.setOnClickListener(new d(context));
        }
        psn_account_info.getName();
        if (!com.max.hbcommon.utils.c.u(psn_account_info.getBg_img())) {
            com.max.hbimage.b.L(psn_account_info.getBg_img(), imageView, R.drawable.psn_game_data_bg);
        }
        if (!com.max.hbcommon.utils.c.u(psn_account_info.getAvatar())) {
            com.max.hbimage.b.K(psn_account_info.getAvatar(), imageView2);
        }
        platformDataView.setValue(psn_account_info.getValue1());
        platformDataView.setDesc(psn_account_info.getKey1());
        platformDataView2.setValue(psn_account_info.getValue2());
        platformDataView2.setDesc(psn_account_info.getKey2());
        platformDataView3.setValue(psn_account_info.getValue3());
        platformDataView3.setDesc(psn_account_info.getKey3());
        platformDataView4.setValue(psn_account_info.getValue4());
        platformDataView4.setDesc(psn_account_info.getKey4());
        linearLayout.removeAllViews();
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        layoutParams.setMargins(ViewUtils.f(context, 10.0f), 0, 0, 0);
        textView2.setLayoutParams(layoutParams);
        textView2.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
        textView2.setTextColor(context.getResources().getColor(R.color.white));
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(psn_account_info.getName());
        linearLayout.addView(textView2);
        ImageView imageView4 = new ImageView(context);
        int iF = ViewUtils.f(context, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iF, iF);
        layoutParams2.gravity = 16;
        layoutParams2.setMargins(ViewUtils.f(context, 6.0f), 0, 0, 0);
        imageView4.setLayoutParams(layoutParams2);
        imageView4.setImageResource(R.drawable.game_details_psn_trophy_star);
        linearLayout.addView(imageView4);
        TextView textView3 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.setMargins(ViewUtils.f(context, 2.0f), 0, 0, 0);
        textView3.setLayoutParams(layoutParams3);
        textView3.setTextSize(1, 12.0f);
        textView3.setTextColor(context.getResources().getColor(R.color.white));
        textView3.setGravity(17);
        textView3.setIncludeFontPadding(false);
        textView3.setText(psn_account_info.getLevel());
        linearLayout.addView(textView3);
        view.setOnClickListener(new e(psn_account_info, context));
    }

    public static String I(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34605, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? com.max.hbutils.utils.n.f("##0.00").format(q(str)) : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static PlatformCardBgObj I0(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34685, new Class[]{String.class}, PlatformCardBgObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformCardBgObj) patchProxyResultProxy.result;
        }
        PlatformCardBgObj platformCardBgObj = new PlatformCardBgObj();
        str.hashCode();
        switch (str.hashCode()) {
            case -1808629708:
                b10 = !str.equals(GameObj.PLATFORM_HARDWARE) ? (byte) -1 : (byte) 0;
                break;
            case -889473228:
                if (!str.equals("switch")) {
                    b10 = -1;
                }
                break;
            case -501007740:
                b10 = !str.equals(GameObj.PLATFORM_STEAM) ? (byte) -1 : (byte) 2;
                break;
            case 3063128:
                b10 = !str.equals("csgo") ? (byte) -1 : (byte) 3;
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 4;
                break;
            case 95773434:
                b10 = !str.equals("dota2") ? (byte) -1 : (byte) 5;
                break;
            case 538159775:
                b10 = !str.equals(GameObj.PLATFORM_XBOX) ? (byte) -1 : (byte) 6;
                break;
            case 1251955023:
                b10 = !str.equals(GameObj.PLATFORM_PS) ? (byte) -1 : (byte) 7;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 2:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.gradient_hardware_bg);
                return platformCardBgObj;
            case 1:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.game_ns_entry_367x126);
                return platformCardBgObj;
            case 3:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.max_csgo_bind_367x150);
                return platformCardBgObj;
            case 4:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.game_epic_entry_367_126);
                return platformCardBgObj;
            case 5:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.max_dota2_bind_367x150);
                return platformCardBgObj;
            case 6:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.game_xbox_entry_367x126);
                return platformCardBgObj;
            case 7:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.psn_game_data_bg);
                platformCardBgObj.setMaskDrawableResourceId(R.color.psn_data_card_mask_alpha70);
                return platformCardBgObj;
            default:
                return platformCardBgObj;
        }
    }

    public static void I1() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 34727, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BaseApplication.a().sendBroadcast(new Intent(lb.a.X));
    }

    public static String J(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34607, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? new DecimalFormat("#.##").format(com.max.hbutils.utils.n.o(str)) : str;
    }

    public static void J0(Context context, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 34732, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().a8("xbox", str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new s0(context));
    }

    public static void J1(ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 34724, new Class[]{ArrayList.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(arrayList)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = arrayList.get(i10);
            str.hashCode();
            switch (str) {
                case "switch":
                    arrayList2.add("switch");
                    break;
                case "pc":
                    arrayList2.add(GameObj.PLATFORM_HARDWARE);
                    break;
                case "psn":
                    arrayList2.add(GameObj.PLATFORM_PS);
                    break;
                case "csgo":
                    arrayList2.add("csgo");
                    break;
                case "epic":
                    arrayList2.add("epic");
                    break;
                case "xbox":
                    arrayList2.add(GameObj.PLATFORM_XBOX);
                    break;
                case "dota2":
                    arrayList2.add("dota2");
                    break;
                case "steam":
                    arrayList2.add(GameObj.PLATFORM_STEAM);
                    break;
            }
        }
        GameObj.ALL_PLATFORMS.clear();
        GameObj.ALL_PLATFORMS.addAll(arrayList2);
    }

    public static String K(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34609, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? new DecimalFormat("#").format(com.max.hbutils.utils.n.o(str)) : str;
    }

    public static boolean K0(BindGameInfosObj bindGameInfosObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bindGameInfosObj, str}, null, changeQuickRedirect, true, 34719, new Class[]{BindGameInfosObj.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (bindGameInfosObj != null && !com.max.hbcommon.utils.c.w(bindGameInfosObj.getCards())) {
            Iterator<GameCardObj> it = bindGameInfosObj.getCards().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getGame_type())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void K1(ViewGroup viewGroup, MallPriceObj mallPriceObj) {
        if (PatchProxy.proxy(new Object[]{viewGroup, mallPriceObj}, null, changeQuickRedirect, true, 34672, new Class[]{ViewGroup.class, MallPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (mallPriceObj == null) {
            viewGroup.setVisibility(8);
            return;
        }
        if (mallPriceObj.getFinal_price() != null) {
            ((TextView) viewGroup.findViewById(R.id.tv_current_price)).setText(String.valueOf(Float.parseFloat(mallPriceObj.getFinal_price()) / 1000.0f));
        }
        if (mallPriceObj.getInitial_price() == null || mallPriceObj.getInitial_price().equals(mallPriceObj.getFinal_price())) {
            return;
        }
        ((TextView) viewGroup.findViewById(R.id.tv_origin_price)).getPaint().setFlags(16);
        ((TextView) viewGroup.findViewById(R.id.tv_origin_price)).setText(String.valueOf(Float.parseFloat(mallPriceObj.getInitial_price()) / 1000.0f));
    }

    public static void L(Context context, View view, View view2, View view3, String str, String str2, String str3, int i10, GameBindingFragment.n nVar) {
        if (PatchProxy.proxy(new Object[]{context, view, view2, view3, str, str2, str3, new Integer(i10), nVar}, null, changeQuickRedirect, true, 34709, new Class[]{Context.class, View.class, View.class, View.class, String.class, String.class, String.class, Integer.TYPE, GameBindingFragment.n.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().r5(str, str2, str3).w1((i10 - 1) * 2, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i0(view2, view, view3, nVar, str2, i10, context, str, str3));
    }

    public static boolean L0(GamePriceObj gamePriceObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePriceObj}, null, changeQuickRedirect, true, 34591, new Class[]{GamePriceObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return gamePriceObj != null && M0(gamePriceObj.getDiscount(), gamePriceObj.getLowest_discount());
    }

    public static void L1(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, int i10, a2 a2Var) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Integer(i10), a2Var}, null, changeQuickRedirect, true, 34666, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Integer.TYPE, a2.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        Context context = viewB.getContext();
        View viewI = eVar.i(R.id.ll_container);
        TextView textView = (TextView) eVar.i(R.id.tv_title);
        View viewI2 = eVar.i(R.id.vg_screenshots);
        AbsVideoView absVideoView = (AbsVideoView) eVar.i(R.id.video_view);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_screenshot);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_video_play);
        ImageView imageView3 = (ImageView) eVar.i(R.id.iv_icon);
        TextView textView2 = (TextView) eVar.i(R.id.tv_name);
        FlexboxLayout flexboxLayout = (FlexboxLayout) eVar.i(R.id.fl_tags);
        TextView textView3 = (TextView) eVar.i(R.id.tv_desc);
        viewI.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(gameObj.getOverlay_color()));
        textView.setText(!com.max.hbcommon.utils.c.u(gameObj.getTitle()) ? gameObj.getTitle() : context.getResources().getString(R.string.editors_choice));
        if (com.max.hbcommon.utils.c.w(gameObj.getScreenshots())) {
            viewI2.setVisibility(8);
        } else {
            viewI2.setVisibility(0);
            GameScreenshotObj gameScreenshotObj = gameObj.getScreenshots().get(0);
            ViewGroup.LayoutParams layoutParams = viewI2.getLayoutParams();
            int i11 = (int) (((i10 * 9.0f) / 16.0f) + 0.5f);
            if (layoutParams.height != i11) {
                layoutParams.height = i11;
                viewI2.setLayoutParams(layoutParams);
            }
            if ("image".equals(gameScreenshotObj.getType())) {
                absVideoView.setVisibility(8);
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
            } else {
                absVideoView.setVisibility(0);
                if (absVideoView.F()) {
                    imageView.setVisibility(0);
                    imageView2.setVisibility(0);
                    viewI2.setClickable(false);
                } else {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                    viewI2.setOnClickListener(new i());
                }
            }
            com.max.hbimage.b.L(gameScreenshotObj.getThumbnail(), imageView, R.drawable.common_default_placeholder_375x210);
        }
        com.max.hbimage.b.K(gameObj.getAppicon(), imageView3);
        textView2.setText(gameObj.getName());
        z1(flexboxLayout, gameObj.getHot_tags(), false, false);
        if (GameObj.REC_TYPE_HEADER_GAME.equals(gameObj.getType())) {
            a2Var.d(eVar, gameObj, false);
        } else {
            a2Var.d(eVar, gameObj, true);
        }
        if (com.max.hbcommon.utils.c.u(gameObj.getShort_desc())) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(gameObj.getShort_desc());
        }
        viewB.setOnClickListener(new j(context, gameObj));
    }

    public static int M(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 34688, new Class[]{Context.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ViewUtils.m(context, ViewUtils.L(context), ViewUtils.f(context, 30.0f));
    }

    public static boolean M0(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 34592, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int iQ = com.max.hbutils.utils.n.q(str2);
        return iQ != 0 && com.max.hbutils.utils.n.q(str) >= iQ;
    }

    public static void M1(com.max.hbcommon.base.adapter.s.e eVar, View.OnClickListener onClickListener, AllRecommendGameHeaderObj allRecommendGameHeaderObj, String str, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, onClickListener, allRecommendGameHeaderObj, str, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34645, new Class[]{com.max.hbcommon.base.adapter.s.e.class, View.OnClickListener.class, AllRecommendGameHeaderObj.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        Context context = viewB.getContext();
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        TextView textView = (TextView) eVar.i(R.id.tv_title);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        View viewI = eVar.i(R.id.tv_tag_ad);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams.height != i10) {
            layoutParams.height = i10;
            imageView.setLayoutParams(layoutParams);
        }
        RecommendGameListItemObj header_content = allRecommendGameHeaderObj.getHeader_content();
        textView.setVisibility(0);
        textView2.setVisibility(0);
        if (header_content != null) {
            String str2 = null;
            if (!"协议".equals(str)) {
                if (header_content.getImgs() != null && header_content.getImgs().size() > 0) {
                    str2 = header_content.getImgs().get(0);
                }
                com.max.hbimage.b.L(str2, imageView, R.drawable.common_default_placeholder_375x210);
                textView.setText(header_content.getTitle());
                textView2.setText(header_content.getDescription());
                viewI.setVisibility(8);
                viewB.setOnClickListener(new w0(context, header_content, onClickListener));
                return;
            }
            if (!com.max.hbcommon.utils.c.u(header_content.getImg_gif())) {
                com.max.hbcommon.utils.b.d(header_content.getImg_gif(), header_content.getImg(), imageView, 0, R.drawable.common_default_placeholder_375x210);
            } else if (header_content.getSplit_imgs() == null || com.max.hbcommon.utils.c.u(header_content.getSplit_imgs().getImg_mid())) {
                com.max.hbimage.b.L(header_content.getImg(), imageView, R.drawable.common_default_placeholder_375x210);
            } else {
                textView.setVisibility(4);
                textView2.setVisibility(4);
                viewI.setVisibility(4);
                String img_mid = header_content.getSplit_imgs().getImg_mid();
                if (z10) {
                    TripleBannerDecorationView.a aVar = TripleBannerDecorationView.f67922v;
                    if (aVar.a().containsKey(img_mid)) {
                        imageView.setImageBitmap(aVar.a().get(img_mid));
                    } else {
                        File fileP = com.max.hbimage.b.p(img_mid);
                        if (fileP != null && fileP.isFile() && fileP.exists()) {
                            try {
                                imageView.setImageBitmap(BitmapFactory.decodeFile(fileP.getAbsolutePath()));
                            } catch (Throwable unused) {
                                com.max.hbimage.b.K(img_mid, imageView);
                            }
                        } else {
                            com.max.hbimage.b.K(img_mid, imageView);
                        }
                    }
                } else {
                    imageView.setImageResource(R.drawable.common_default_placeholder_375x210);
                }
            }
            textView.setText(header_content.getTitle());
            if (com.max.hbcommon.utils.c.u(header_content.getDesc())) {
                textView2.setText((CharSequence) null);
            } else {
                textView2.setText(header_content.getDesc());
            }
            if ("advertise".equals(header_content.getLabel())) {
                viewI.setVisibility(0);
            } else {
                viewI.setVisibility(8);
            }
            viewB.setOnClickListener(new v0(context, header_content, onClickListener));
        }
    }

    public static void N(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 34720, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().N1(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p0(context));
    }

    public static boolean N0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34731, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return "dota2".equals(str) || "csgo".equals(str);
    }

    public static void N1(CustomHorizontalScrollView customHorizontalScrollView, List<RichAttributeModelObj> list, int i10) {
        if (PatchProxy.proxy(new Object[]{customHorizontalScrollView, list, new Integer(i10)}, null, changeQuickRedirect, true, 34615, new Class[]{CustomHorizontalScrollView.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        customHorizontalScrollView.removeAllViews();
        if (com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        Context context = customHorizontalScrollView.getContext();
        customHorizontalScrollView.setFillViewport(true);
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        customHorizontalScrollView.addView(linearLayout, layoutParams);
        Iterator<RichAttributeModelObj> it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView(s0(context, it.next()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static PlatformCardBgObj O(HomeDataObj homeDataObj, Boolean bool, String str) {
        byte b10 = 3;
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{homeDataObj, bool, str}, null, changeQuickRedirect, true, 34684, new Class[]{HomeDataObj.class, Boolean.class, String.class}, PlatformCardBgObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformCardBgObj) patchProxyResultProxy.result;
        }
        PlatformCardBgObj platformCardBgObj = new PlatformCardBgObj();
        str.hashCode();
        switch (str.hashCode()) {
            case -1808629708:
                b10 = !str.equals(GameObj.PLATFORM_HARDWARE) ? (byte) -1 : (byte) 0;
                break;
            case -889473228:
                b10 = !str.equals("switch") ? (byte) -1 : (byte) 1;
                break;
            case -501007740:
                b10 = !str.equals(GameObj.PLATFORM_STEAM) ? (byte) -1 : (byte) 2;
                break;
            case 3063128:
                if (!str.equals("csgo")) {
                    b10 = -1;
                }
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 4;
                break;
            case 95773434:
                b10 = !str.equals("dota2") ? (byte) -1 : (byte) 5;
                break;
            case 538159775:
                b10 = !str.equals(GameObj.PLATFORM_XBOX) ? (byte) -1 : (byte) 6;
                break;
            case 1251955023:
                b10 = !str.equals(GameObj.PLATFORM_PS) ? (byte) -1 : (byte) 7;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.game_heyboxacc_entry_367_150);
                return platformCardBgObj;
            case 1:
                platformCardBgObj.setBgDrawableResourceId(R.drawable.game_ns_entry_367x126);
                return platformCardBgObj;
            case 2:
                if (homeDataObj.getSteam_id_info() != null && !"1".equals(homeDataObj.getSteam_id_info().getPersonal_infomation_open()) && !"1".equals(homeDataObj.getSteam_id_info().getHas_history())) {
                    z10 = true;
                }
                if (z10) {
                    platformCardBgObj.setBgDrawableResourceId(R.color.steam_blue);
                } else {
                    if (com.max.hbcommon.utils.c.u(homeDataObj.getSteam_id_info().getHead_video())) {
                        platformCardBgObj.setBgUrl(homeDataObj.getSteam_id_info().getHead_image());
                        platformCardBgObj.setDefaultBgResourceId(R.color.dark_blue);
                    } else {
                        platformCardBgObj.setMaskDrawableResourceId(R.drawable.steam_card_mask_gradient_left_to_right);
                        platformCardBgObj.setBgVideoUrl(homeDataObj.getSteam_id_info().getHead_video());
                    }
                    if (com.max.xiaoheihe.module.account.utils.l.v(homeDataObj.getSteam_id_info())) {
                        platformCardBgObj.setHeight(168.0f);
                    }
                }
                return platformCardBgObj;
            case 3:
                if (homeDataObj.getCsgo_platform_info() != null) {
                    platformCardBgObj.setBgUrl(homeDataObj.getCsgo_platform_info().getBg());
                }
                platformCardBgObj.setDefaultBgResourceId(R.drawable.max_csgo_bind_367x150);
                platformCardBgObj.setMaskDrawableResourceId(R.drawable.gradient_csgo_platform_bg);
                return platformCardBgObj;
            case 4:
                platformCardBgObj.setBgUrl(homeDataObj.getEpic_account_info().getBackground_url());
                platformCardBgObj.setDefaultBgResourceId(R.drawable.game_epic_entry_367_126);
                platformCardBgObj.setMaskDrawableResourceId(R.drawable.gradient_epic_grey_alpha90_85_to_right);
                return platformCardBgObj;
            case 5:
                if (homeDataObj.getDota2_platform_info() != null) {
                    platformCardBgObj.setBgUrl(homeDataObj.getDota2_platform_info().getBg());
                }
                platformCardBgObj.setDefaultBgResourceId(R.drawable.max_dota2_bind_367x150);
                platformCardBgObj.setMaskDrawableResourceId(R.drawable.gradient_dota2_platform_bg);
                return platformCardBgObj;
            case 6:
                platformCardBgObj.setBgUrl(homeDataObj.getXbox_account_info().getBackground_url());
                platformCardBgObj.setDefaultBgResourceId(R.drawable.game_xbox_entry_367x126);
                platformCardBgObj.setMaskDrawableResourceId(R.drawable.game_xbox_entry_g_367x126);
                return platformCardBgObj;
            case 7:
                platformCardBgObj.setBgUrl(homeDataObj.getPsn_account_info().getBg_img());
                platformCardBgObj.setDefaultBgResourceId(R.drawable.psn_game_data_bg);
                platformCardBgObj.setMaskDrawableResourceId(R.color.psn_data_card_mask_alpha70);
                return platformCardBgObj;
            default:
                return platformCardBgObj;
        }
    }

    public static boolean O0(PlatformBindStatus platformBindStatus, String str) {
        byte b10 = 2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{platformBindStatus, str}, null, changeQuickRedirect, true, 34698, new Class[]{PlatformBindStatus.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1808629708:
                b10 = !str.equals(GameObj.PLATFORM_HARDWARE) ? (byte) -1 : (byte) 0;
                break;
            case -889473228:
                b10 = !str.equals("switch") ? (byte) -1 : (byte) 1;
                break;
            case -501007740:
                if (!str.equals(GameObj.PLATFORM_STEAM)) {
                    b10 = -1;
                }
                break;
            case 3063128:
                b10 = !str.equals("csgo") ? (byte) -1 : (byte) 3;
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 4;
                break;
            case 95773434:
                b10 = !str.equals("dota2") ? (byte) -1 : (byte) 5;
                break;
            case 538159775:
                b10 = !str.equals(GameObj.PLATFORM_XBOX) ? (byte) -1 : (byte) 6;
                break;
            case 1251955023:
                b10 = !str.equals(GameObj.PLATFORM_PS) ? (byte) -1 : (byte) 7;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return platformBindStatus.isBindHardware();
            case 1:
                return platformBindStatus.isBindSwitch();
            case 2:
                return platformBindStatus.isBindSteam();
            case 3:
                return platformBindStatus.isBindCsgo();
            case 4:
                return platformBindStatus.isBindEpic();
            case 5:
                return platformBindStatus.isBindDota2();
            case 6:
                return platformBindStatus.isBindXbox();
            case 7:
                return platformBindStatus.isBindPSN();
            default:
                return false;
        }
    }

    public static void O1(LinearLayout linearLayout, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{linearLayout, str, str2}, null, changeQuickRedirect, true, 34624, new Class[]{LinearLayout.class, String.class, String.class}, Void.TYPE).isSupported || linearLayout == null) {
            return;
        }
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iv_score);
        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_score);
        Context context = textView.getContext();
        if (!TextUtils.isEmpty(str)) {
            Drawable drawableX = ViewUtils.x(ViewUtils.f(context, 2.0f), context.getResources().getColor(R.color.user_level_1_start), context.getResources().getColor(R.color.user_level_1_end));
            bb.d.d(textView, 1);
            linearLayout.setPadding(ViewUtils.f(context, 4.0f), 0, ViewUtils.f(context, 4.0f), 0);
            textView.setPadding(0, 0, 0, 0);
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
            textView.setText(str);
            linearLayout.setBackgroundDrawable(drawableX);
            imageView.setVisibility(8);
            linearLayout.setVisibility(0);
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            linearLayout.setVisibility(4);
            return;
        }
        Drawable drawableI = ViewUtils.i(ViewUtils.f(context, 2.0f), u0(context, str2), t0(context, str2));
        bb.d.d(textView, 1);
        linearLayout.setPadding(ViewUtils.f(context, 3.0f), 0, ViewUtils.f(context, 4.0f), 0);
        textView.setPadding(ViewUtils.f(context, 1.0f), 0, 0, 0);
        textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView.setText(String.format(Locale.US, "%.1f", Float.valueOf(com.max.hbutils.utils.n.p(str2))));
        linearLayout.setBackgroundDrawable(drawableI);
        imageView.setVisibility(0);
        linearLayout.setVisibility(0);
    }

    public static int P(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34697, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (GameObj.PLATFORM_STEAM.equals(str)) {
            return R.id.rb_platform_steam;
        }
        if (GameObj.PLATFORM_PS.equals(str)) {
            return R.id.rb_platform_ps;
        }
        if (GameObj.PLATFORM_HARDWARE.equals(str)) {
            return R.id.rb_platform_hardware;
        }
        if (GameObj.PLATFORM_XBOX.equals(str)) {
            return R.id.rb_platform_xbox;
        }
        if ("switch".equals(str)) {
            return R.id.rb_platform_switch;
        }
        if ("epic".equals(str)) {
            return R.id.rb_platform_epic;
        }
        if ("dota2".equals(str)) {
            return R.id.rb_platform_dota;
        }
        if ("csgo".equals(str)) {
            return R.id.rb_platform_csgo;
        }
        return -1;
    }

    public static boolean P0(HomeDataObj homeDataObj, String str) {
        byte b10 = 2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{homeDataObj, str}, null, changeQuickRedirect, true, 34699, new Class[]{HomeDataObj.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -889473228:
                b10 = !str.equals("switch") ? (byte) -1 : (byte) 0;
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 1;
                break;
            case 538159775:
                if (!str.equals(GameObj.PLATFORM_XBOX)) {
                    b10 = -1;
                }
                break;
            case 1251955023:
                b10 = !str.equals(GameObj.PLATFORM_PS) ? (byte) -1 : (byte) 3;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return homeDataObj.isSwitch_account_info_hidden();
            case 1:
                return homeDataObj.isEpic_account_info_hidden();
            case 2:
                return homeDataObj.isXbox_account_info_hidden();
            case 3:
                return homeDataObj.isPsn_account_info_hidden();
            default:
                return false;
        }
    }

    @Deprecated
    public static void P1(com.max.hbcommon.base.adapter.s.e eVar, String str, String str2) {
        O1((LinearLayout) eVar.i(R.id.vg_score), str, str2);
        Log.d("cqtest", new Throwable().toString());
    }

    public static Intent Q(Context context, String str, String str2) {
        String str3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 34664, new Class[]{Context.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        String str4 = null;
        if (com.max.hbcommon.utils.c.u(str2) || "pc".equals(str)) {
            return null;
        }
        if (!lb.a.V0.equals(str)) {
            if ("csgo".equals(str)) {
                str3 = "csgo";
            } else if (lb.a.T0.equals(str)) {
                str4 = "b5";
            }
            return ChannelsDetailActivity.n3(context, null, str2, null, null, null, null, null, null, "game_data", str3);
        }
        str4 = "5e";
        str3 = str4;
        return ChannelsDetailActivity.n3(context, null, str2, null, null, null, null, null, null, "game_data", str3);
    }

    public static boolean Q0(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 34730, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str != null && str2 != null) {
            if (str.equals(str2)) {
                return true;
            }
            if (GameObj.PLATFORM_STEAM_NAMES.contains(str) && GameObj.PLATFORM_STEAM_NAMES.contains(str2)) {
                return true;
            }
            if (GameObj.PLATFORM_SWITCH_NAMES.contains(str) && GameObj.PLATFORM_SWITCH_NAMES.contains(str2)) {
                return true;
            }
            if (GameObj.PLATFORM_XBOX_NAMES.contains(str) && GameObj.PLATFORM_XBOX_NAMES.contains(str2)) {
                return true;
            }
            if (GameObj.PLATFORM_PSN_NAMES.contains(str) && GameObj.PLATFORM_PSN_NAMES.contains(str2)) {
                return true;
            }
            if (GameObj.PLATFORM_EPIC_NAMES.contains(str) && GameObj.PLATFORM_EPIC_NAMES.contains(str2)) {
                return true;
            }
            if (GameObj.PLATFORM_PC_NAMES.contains(str) && GameObj.PLATFORM_PC_NAMES.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void Q1(View view, LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{view, linearLayout, imageView, textView, textView2, str, str2, str3, str4}, null, changeQuickRedirect, true, 34623, new Class[]{View.class, LinearLayout.class, ImageView.class, TextView.class, TextView.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = textView.getContext();
        bb.d.d(textView, 1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        float fP = com.max.hbutils.utils.n.p(str2);
        int iQ = com.max.hbutils.utils.n.q(str3);
        if (fP > 0.0f) {
            Drawable drawableI = ViewUtils.i(0, u0(context, str2), t0(context, str2));
            layoutParams.rightMargin = ViewUtils.f(context, 9.0f);
            layoutParams.leftMargin = ViewUtils.f(context, 0.0f);
            textView.setTextSize(1, 18.0f);
            textView.setLayoutParams(layoutParams);
            textView.setText(String.format(Locale.US, "%.1f", Float.valueOf(com.max.hbutils.utils.n.p(str2))));
            linearLayout.setBackground(drawableI);
            imageView.setVisibility(0);
            linearLayout.setVisibility(0);
            if (textView2 != null) {
                String strR = r(str4);
                textView2.setVisibility(0);
                textView2.setText(strR);
                return;
            }
            return;
        }
        if (iQ >= 0) {
            Drawable drawableX = ViewUtils.x(0, context.getResources().getColor(R.color.text_secondary_2_color), context.getResources().getColor(R.color.score_end_none));
            bb.d.d(textView, 1);
            layoutParams.gravity = 17;
            textView.setLayoutParams(layoutParams);
            layoutParams.rightMargin = ViewUtils.f(context, 7.0f);
            layoutParams.leftMargin = ViewUtils.f(context, 7.0f);
            textView.setTextSize(1, 12.0f);
            textView.setText(str);
            linearLayout.setBackground(drawableX);
            imageView.setVisibility(8);
            view.setVisibility(0);
            if (textView2 != null) {
                if (com.max.hbcommon.utils.c.u(str3)) {
                    textView2.setVisibility(8);
                    return;
                }
                String strZ = z(str3);
                textView2.setVisibility(0);
                textView2.setText(strZ);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            view.setVisibility(8);
            return;
        }
        Drawable drawableX2 = ViewUtils.x(0, context.getResources().getColor(R.color.user_level_1_start), context.getResources().getColor(R.color.user_level_1_end));
        bb.d.d(textView, 1);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = ViewUtils.f(context, 7.0f);
        layoutParams.leftMargin = ViewUtils.f(context, 7.0f);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(1, 12.0f);
        textView.setText(str);
        linearLayout.setBackground(drawableX2);
        imageView.setVisibility(8);
        view.setVisibility(0);
        if (textView2 != null) {
            if (com.max.hbcommon.utils.c.u(str4)) {
                textView2.setVisibility(8);
                return;
            }
            String strR2 = r(str4);
            textView2.setVisibility(0);
            textView2.setText(strR2);
        }
    }

    public static int R(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34673, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if ("ps4".equals(str)) {
            return R.color.game_card_level;
        }
        if ("switch".equals(str)) {
            return R.color.switch_color;
        }
        return "xbox".equals(str) ? R.color.xbox_color : R.color.steam_color;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R0(Context context, String str, View view) {
        if (PatchProxy.proxy(new Object[]{context, str, view}, null, changeQuickRedirect, true, 34734, new Class[]{Context.class, String.class, View.class}, Void.TYPE).isSupported || !com.max.xiaoheihe.utils.i0.e(context) || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        com.max.xiaoheihe.base.router.b.k0(context, str);
    }

    public static void R1(com.max.hbcommon.base.adapter.s.e eVar, String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{eVar, str, str2, str3, str4}, null, changeQuickRedirect, true, 34622, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Q1(eVar.i(R.id.vg_score), (LinearLayout) eVar.i(R.id.vg_score_content), (ImageView) eVar.i(R.id.iv_score), (TextView) eVar.i(R.id.tv_score), (TextView) eVar.i(R.id.tv_score_detail), str, str2, str3, str4);
    }

    public static PlatformCurrentDataObj S(HomeDataObj homeDataObj, String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{homeDataObj, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34676, new Class[]{HomeDataObj.class, String.class, Boolean.TYPE}, PlatformCurrentDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformCurrentDataObj) patchProxyResultProxy.result;
        }
        boolean zQ = com.max.xiaoheihe.utils.i0.q(homeDataObj.getAccount_detail().getUserid());
        String strV = GameObj.PLATFORM_STEAM;
        if (str == null) {
            str = zQ ? com.max.hbcache.c.o(com.max.hbcache.c.f66158y, GameObj.PLATFORM_STEAM) : V(homeDataObj);
        }
        if (str != null) {
            strV = str;
        }
        PlatformBindStatus platformBindStatusH0 = h0(homeDataObj);
        boolean zContains = com.max.hbcache.c.o(com.max.hbcache.c.R, "").contains("epic");
        int i10 = !platformBindStatusH0.isBindSteam() ? 1 : 0;
        if (!platformBindStatusH0.isBindPSN()) {
            i10++;
        }
        if (!platformBindStatusH0.isBindEpic() && !zContains) {
            i10++;
        }
        if (!platformBindStatusH0.isBindXbox()) {
            i10++;
        }
        if (!platformBindStatusH0.isBindSwitch()) {
            i10++;
        }
        if (!platformBindStatusH0.isBindHardware()) {
            i10++;
        }
        if (zQ) {
            if (!z10 && (O0(platformBindStatusH0, strV) || P0(homeDataObj, strV))) {
                strV = X(homeDataObj);
            } else if (z10 && P0(homeDataObj, strV)) {
                strV = V(homeDataObj);
            }
        } else if (!O0(platformBindStatusH0, strV)) {
            strV = V(homeDataObj);
        }
        PlatformCurrentDataObj platformCurrentDataObj = new PlatformCurrentDataObj();
        platformCurrentDataObj.setMCurrentPlatform(strV);
        platformCurrentDataObj.setUnBindPlatFormNum(i10);
        platformCurrentDataObj.setMe(zQ);
        platformCurrentDataObj.setHideEpic(zContains);
        return platformCurrentDataObj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S0(Context context, GameBindingFragment.n nVar, EditText editText, CircularProgressIndicator circularProgressIndicator, View view, View view2) {
        if (PatchProxy.proxy(new Object[]{context, nVar, editText, circularProgressIndicator, view, view2}, null, changeQuickRedirect, true, 34735, new Class[]{Context.class, GameBindingFragment.n.class, EditText.class, CircularProgressIndicator.class, View.class, View.class}, Void.TYPE).isSupported || !com.max.xiaoheihe.utils.i0.e(context) || nVar == null) {
            return;
        }
        String string = editText.getText().toString();
        if (com.max.hbcommon.utils.c.u(string)) {
            return;
        }
        com.max.xiaoheihe.utils.d.E0(context, editText);
        n(editText, circularProgressIndicator, view, string, "dota2", null, nVar);
    }

    public static void S1(com.max.hbcommon.base.adapter.s.e eVar, String str, String str2, String str3) {
        int i10;
        if (PatchProxy.proxy(new Object[]{eVar, str, str2, str3}, null, changeQuickRedirect, true, 34621, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewI = eVar.i(R.id.vg_score);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_score);
        TextView textView = (TextView) eVar.i(R.id.tv_score);
        TextView textView2 = (TextView) eVar.i(R.id.tv_extra);
        Context context = textView.getContext();
        bb.d.d(textView, 1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
        float fP = com.max.hbutils.utils.n.p(str2);
        int iQ = com.max.hbutils.utils.n.q(str3);
        Log.d("cqtest", "want2Play is :" + iQ);
        Log.d("cqtest", "score is :" + fP);
        int iM = ViewUtils.m(context, ViewUtils.W(viewI), ViewUtils.f(context, 16.0f));
        com.max.hbcommon.utils.d.b("zzzzradius", "radius==" + iM);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
        if (fP > 0.0f) {
            Drawable drawableI = ViewUtils.i(iM, u0(context, str2), t0(context, str2));
            layoutParams.rightMargin = ViewUtils.f(context, 4.0f);
            layoutParams.leftMargin = ViewUtils.f(context, 0.0f);
            layoutParams2.rightMargin = ViewUtils.f(context, 1.0f);
            layoutParams2.leftMargin = ViewUtils.f(context, 3.0f);
            imageView.setLayoutParams(layoutParams2);
            textView.setLayoutParams(layoutParams);
            bb.d.d(textView, 1);
            textView.setTextSize(1, 12.0f);
            textView.setText(String.format(Locale.US, "%.1f", Float.valueOf(com.max.hbutils.utils.n.p(str2))));
            viewI.setBackground(drawableI);
            imageView.setVisibility(0);
            viewI.setVisibility(0);
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            return;
        }
        if (iQ > 0) {
            Drawable drawableX = ViewUtils.x(iM, context.getResources().getColor(R.color.no_score_start_color), context.getResources().getColor(R.color.no_score_end_color));
            bb.d.d(textView, 5);
            layoutParams.gravity = 17;
            textView.setLayoutParams(layoutParams);
            layoutParams.rightMargin = ViewUtils.f(context, 0.0f);
            layoutParams.leftMargin = ViewUtils.f(context, 3.0f);
            if (textView2 != null) {
                if (com.max.hbutils.utils.n.q(str3) >= 10000) {
                    textView2.setText("万想玩");
                } else {
                    textView2.setText("想玩");
                }
                i10 = 0;
                textView2.setVisibility(0);
            } else {
                i10 = 0;
            }
            textView.setTextSize(1, 12.0f);
            textView.setText(y(str3));
            viewI.setBackground(drawableX);
            imageView.setVisibility(8);
            viewI.setVisibility(i10);
            return;
        }
        if (iQ == 0 && !TextUtils.isEmpty(str)) {
            Drawable drawableX2 = ViewUtils.x(iM, context.getResources().getColor(R.color.no_score_start_color), context.getResources().getColor(R.color.no_score_end_color));
            layoutParams.gravity = 17;
            layoutParams.rightMargin = ViewUtils.f(context, 3.0f);
            layoutParams.leftMargin = ViewUtils.f(context, 3.0f);
            textView.setLayoutParams(layoutParams);
            textView.setTextSize(1, 10.0f);
            textView.setText(str);
            viewI.setBackground(drawableX2);
            imageView.setVisibility(8);
            viewI.setVisibility(0);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            viewI.setVisibility(8);
            return;
        }
        Drawable drawableX3 = ViewUtils.x(iM, context.getResources().getColor(R.color.no_score_start_color), context.getResources().getColor(R.color.no_score_end_color));
        layoutParams.gravity = 17;
        layoutParams.rightMargin = ViewUtils.f(context, 3.0f);
        layoutParams.leftMargin = ViewUtils.f(context, 3.0f);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(1, 10.0f);
        textView.setText(str);
        viewI.setBackground(drawableX3);
        imageView.setVisibility(8);
        viewI.setVisibility(0);
    }

    public static String T(String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34597, new Class[]{String.class, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str);
            if (!z10) {
                bigDecimal = new BigDecimal("1").subtract(bigDecimal).multiply(new BigDecimal("100"));
            }
            return String.format(Locale.US, "-%s%%", bigDecimal.setScale(0, 0).toString());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T0(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 34740, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f131064w2);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.help));
        context.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v39, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    public static void T1(HomeDataObj homeDataObj, PlatformBindStatus platformBindStatus, String str, ViewGroup viewGroup, List<PlayerRankObj> list, z0 z0Var, com.max.xiaoheihe.module.account.mine.k kVar, GameBindingFragment.n nVar) {
        View viewZ0;
        View viewA0;
        View viewC0;
        View viewG0;
        View viewB0;
        View viewH0;
        View viewE0;
        ?? r10;
        ViewGroup viewGroup2;
        if (PatchProxy.proxy(new Object[]{homeDataObj, platformBindStatus, str, viewGroup, list, z0Var, kVar, nVar}, null, changeQuickRedirect, true, 34686, new Class[]{HomeDataObj.class, PlatformBindStatus.class, String.class, ViewGroup.class, List.class, z0.class, com.max.xiaoheihe.module.account.mine.k.class, GameBindingFragment.n.class}, Void.TYPE).isSupported || homeDataObj == null || viewGroup == 0) {
            return;
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        viewGroup.removeAllViews();
        boolean zQ = com.max.xiaoheihe.utils.i0.q(homeDataObj.getAccount_detail().getUserid());
        Object gpu = null;
        if (GameObj.PLATFORM_STEAM.equals(str)) {
            if (platformBindStatus.isBindSteam()) {
                if (homeDataObj.getSteam_id_info() == null || "1".equals(homeDataObj.getSteam_id_info().getPersonal_infomation_open()) || "1".equals(homeDataObj.getSteam_id_info().getHas_history())) {
                    viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.layout_game_data_card_steam_v2, viewGroup, false);
                    com.max.xiaoheihe.module.account.utils.l.V(z0Var.c(), viewGroup2, homeDataObj, new r(homeDataObj, context), kVar);
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.vg_friends);
                    TextView textView = (TextView) viewGroup2.findViewById(R.id.tv_no_friends_tips);
                    View viewFindViewById = viewGroup2.findViewById(R.id.ll_friends);
                    if (com.max.hbcommon.utils.c.w(list)) {
                        viewFindViewById.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(homeDataObj.getSteam_id_info().getDesc());
                    } else {
                        viewFindViewById.setVisibility(0);
                        textView.setVisibility(8);
                        q1(viewGroup3, list, homeDataObj.getSteam_id_info() != null ? homeDataObj.getSteam_id_info().getFriend_list_protocol() : null);
                        r10 = viewGroup2;
                    }
                } else {
                    View viewInflate = layoutInflater.inflate(R.layout.layout_public_steam_profile_card_v2, viewGroup, false);
                    com.max.xiaoheihe.module.account.utils.l.R((ViewGroup) viewInflate, new p(homeDataObj), new q(z0Var));
                    viewGroup.addView(viewInflate);
                }
                if (r10 != 0) {
                    r10 = viewGroup2;
                    return;
                } else {
                    r10 = viewGroup2;
                    viewGroup.addView(r10);
                    return;
                }
            }
            gpu = (ViewGroup) F0(context, viewGroup, z0Var);
            r10 = gpu;
            if (r10 != 0) {
                r10 = viewGroup2;
                return;
            } else {
                r10 = viewGroup2;
                viewGroup.addView(r10);
                return;
            }
        }
        if (GameObj.PLATFORM_PS.equals(str)) {
            if (platformBindStatus.isBindPSN()) {
                viewE0 = layoutInflater.inflate(R.layout.layout_psn_game_data_card_v2, viewGroup, false);
                H1(viewE0, homeDataObj);
            } else {
                viewE0 = E0(context, viewGroup, nVar);
            }
            viewGroup.addView(viewE0);
            return;
        }
        if (GameObj.PLATFORM_XBOX.equals(str)) {
            if (platformBindStatus.isBindXbox()) {
                viewH0 = layoutInflater.inflate(R.layout.layout_xbox_game_data_card_v2, viewGroup, false);
                Z1(viewH0, homeDataObj);
                if (homeDataObj.getXbox_account_info() != null && homeDataObj.getXbox_account_info().getXuid() != null && z0Var != null) {
                    z0Var.d(viewH0, homeDataObj.getXbox_account_info().getXuid());
                }
                if (homeDataObj.getXbox_account_info() != null) {
                    ViewGroup viewGroup4 = (ViewGroup) viewH0.findViewById(R.id.vg_friends);
                    TextView textView2 = (TextView) viewH0.findViewById(R.id.tv_no_friends_tips);
                    View viewFindViewById2 = viewH0.findViewById(R.id.ll_friends);
                    if (com.max.hbcommon.utils.c.w(homeDataObj.getXbox_account_info().getFriends().getList())) {
                        textView2.setVisibility(0);
                        viewFindViewById2.setVisibility(8);
                        textView2.setText(homeDataObj.getXbox_account_info().getDesc());
                    } else {
                        textView2.setVisibility(8);
                        viewFindViewById2.setVisibility(0);
                        Y1(viewGroup4, homeDataObj.getXbox_account_info());
                    }
                    viewH0.setOnClickListener(new s(homeDataObj, context));
                }
            } else {
                viewH0 = H0(context, viewGroup);
            }
            viewGroup.addView(viewH0);
            return;
        }
        if ("epic".equals(str)) {
            if (platformBindStatus.isBindEpic()) {
                viewB0 = layoutInflater.inflate(R.layout.layout_epic_game_data_card_v2, viewGroup, false);
                o1(viewB0, homeDataObj);
                n1((ViewGroup) viewB0.findViewById(R.id.vg_friends), homeDataObj.getEpic_account_info(), homeDataObj.getAccount_detail().getUserid());
                viewB0.setOnClickListener(new t(context, homeDataObj));
            } else {
                viewB0 = B0(context, viewGroup);
            }
            viewGroup.addView(viewB0);
            return;
        }
        if ("switch".equals(str)) {
            if (platformBindStatus.isBindSwitch()) {
                viewG0 = layoutInflater.inflate(R.layout.layout_switch_game_data_card_v2, viewGroup, false);
                W1(viewG0, homeDataObj);
                if (homeDataObj.getSwitch_account_info() != null) {
                    V1((ViewGroup) viewG0.findViewById(R.id.vg_friends), homeDataObj.getSwitch_account_info(), homeDataObj.getAccount_detail().getUserid());
                    viewG0.setOnClickListener(new u(context, homeDataObj));
                }
            } else {
                viewG0 = G0(context, viewGroup);
            }
            viewGroup.addView(viewG0);
            return;
        }
        if (!GameObj.PLATFORM_HARDWARE.equals(str)) {
            if ("dota2".equals(str)) {
                if (platformBindStatus.isBindDota2()) {
                    viewA0 = layoutInflater.inflate(R.layout.layout_dota2_game_data_card_v2, viewGroup, false);
                    m1(viewA0, homeDataObj);
                } else {
                    viewA0 = A0(context, viewGroup, nVar);
                }
                viewGroup.addView(viewA0);
                return;
            }
            if ("csgo".equals(str)) {
                if (platformBindStatus.isBindCsgo()) {
                    viewZ0 = layoutInflater.inflate(R.layout.layout_csgo_game_data_card_v2, viewGroup, false);
                    h1(viewZ0, homeDataObj);
                } else {
                    viewZ0 = z0(context, viewGroup, homeDataObj.getCsgo_platform_info() != null ? homeDataObj.getCsgo_platform_info().getProtocol() : null);
                }
                viewGroup.addView(viewZ0);
                return;
            }
            return;
        }
        if (platformBindStatus.isBindHardware()) {
            viewC0 = layoutInflater.inflate(R.layout.layout_hardware_card_v2, viewGroup, false);
            TextView textView3 = (TextView) viewC0.findViewById(R.id.tv_my_hardware);
            TextView textView4 = (TextView) viewC0.findViewById(R.id.tv_info);
            ContentAutoPlayTextView contentAutoPlayTextView = (ContentAutoPlayTextView) viewC0.findViewById(R.id.tv_score);
            TextView textView5 = (TextView) viewC0.findViewById(R.id.tv_more);
            TextView textView6 = (TextView) viewC0.findViewById(R.id.tv_detail);
            String strN0 = zQ ? com.max.xiaoheihe.utils.d.n0(R.string.my_computer) : com.max.xiaoheihe.utils.d.n0(R.string.his_computer);
            String strN1 = zQ ? com.max.xiaoheihe.utils.d.n0(R.string.reward_points) : com.max.xiaoheihe.utils.d.n0(R.string.get_hardware_info_by_heybox_acc);
            String cpu = homeDataObj.getHardware_info() != null ? homeDataObj.getHardware_info().getCpu() : null;
            gpu = homeDataObj.getHardware_info() != null ? homeDataObj.getHardware_info().getGpu() : null;
            textView3.setText(strN0);
            textView4.setText(String.format("%s %s", cpu, gpu));
            contentAutoPlayTextView.setDrawableResId(R.drawable.game_heybox_stat_sss_290x36);
            contentAutoPlayTextView.setNeedAutoPlay("SSS".equals(homeDataObj.getHardware_info().getPerf_level()));
            contentAutoPlayTextView.setText(homeDataObj.getHardware_info().getPerf_level());
            textView5.setText(strN1);
            w wVar = new w(homeDataObj, context, strN0);
            x xVar = new x(context, strN1);
            if (zQ) {
                textView6.setVisibility(8);
                viewC0.setOnClickListener(wVar);
            } else {
                textView6.setVisibility(0);
                textView6.setOnClickListener(wVar);
                viewC0.setOnClickListener(xVar);
            }
        } else {
            viewC0 = C0(context, viewGroup);
        }
        viewGroup.addView(viewC0);
    }

    public static String U(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34674, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (lb.a.S0.equals(str)) {
            return com.max.xiaoheihe.utils.d.n0(R.string.do_not_show_again_dac_tips);
        }
        if (lb.a.L0.equals(str)) {
            return com.max.xiaoheihe.utils.d.n0(R.string.do_not_show_again_apex_tips);
        }
        if (lb.a.J0.equals(str)) {
            return com.max.xiaoheihe.utils.d.n0(R.string.do_not_show_again_pubg_tips);
        }
        if (lb.a.K0.equals(str)) {
            return com.max.xiaoheihe.utils.d.n0(R.string.do_not_show_again_r6_tips);
        }
        if (lb.a.M0.equals(str)) {
            return com.max.xiaoheihe.utils.d.n0(R.string.do_not_show_again_ow_tips);
        }
        if ("psn".equals(str)) {
            return "";
        }
        if (lb.a.R0.equals(str)) {
            return com.max.xiaoheihe.utils.d.n0(R.string.do_not_show_again_destiny2_tips);
        }
        return (lb.a.T0.equals(str) || "csgo".equals(str) || lb.a.V0.equals(str)) ? com.max.xiaoheihe.utils.d.n0(R.string.do_not_show_again_csgo_tips) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U0(Context context, View view) {
        if (!PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 34739, new Class[]{Context.class, View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(context)) {
            com.max.xiaoheihe.base.router.b.O(context, "epic_bind", null).A();
        }
    }

    public static void U1(ImageView imageView, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{imageView, bBSUserInfoObj}, null, changeQuickRedirect, true, 34636, new Class[]{ImageView.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.e0(bBSUserInfoObj.getAvartar(), imageView, ViewUtils.f(imageView.getContext(), 2.0f), R.drawable.common_default_avatar_40x40);
        String userid = bBSUserInfoObj.getUserid();
        if (com.max.hbcommon.utils.c.u(userid)) {
            imageView.setClickable(false);
        } else {
            imageView.setOnClickListener(new g0(userid));
        }
    }

    public static String V(HomeDataObj homeDataObj) {
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{homeDataObj}, null, changeQuickRedirect, true, 34701, new Class[]{HomeDataObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str2 = null;
        if (homeDataObj != null && homeDataObj.getAccount_detail() != null) {
            boolean zContains = com.max.hbcache.c.o(com.max.hbcache.c.R, "").contains("epic");
            boolean z10 = com.max.xiaoheihe.module.account.utils.c.c(homeDataObj.getAccount_detail().getUserid()) == 1;
            PlatformBindStatus platformBindStatusH0 = h0(homeDataObj);
            if (platformBindStatusH0.isBindSteam()) {
                str = GameObj.PLATFORM_STEAM;
            } else if (platformBindStatusH0.isBindPSN() && !homeDataObj.isPsn_account_info_hidden()) {
                str = GameObj.PLATFORM_PS;
            } else if (!platformBindStatusH0.isBindXbox() || homeDataObj.isXbox_account_info_hidden()) {
                if (!zContains && platformBindStatusH0.isBindEpic() && !homeDataObj.isEpic_account_info_hidden()) {
                    str2 = "epic";
                } else if (platformBindStatusH0.isBindSwitch() && !homeDataObj.isSwitch_account_info_hidden()) {
                    str = "switch";
                } else if (platformBindStatusH0.isBindHardware()) {
                    str = GameObj.PLATFORM_HARDWARE;
                }
                if (str2 != null && z10) {
                    com.max.hbcache.c.C(com.max.hbcache.c.f66158y, str2);
                }
            } else {
                str = GameObj.PLATFORM_XBOX;
            }
            str2 = str;
            if (str2 != null) {
                com.max.hbcache.c.C(com.max.hbcache.c.f66158y, str2);
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V0(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 34736, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f130956e2);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.get_hardware_info_by_heybox_acc));
        context.startActivity(intent);
    }

    private static void V1(ViewGroup viewGroup, SwitchAccountInfo switchAccountInfo, String str) {
        if (PatchProxy.proxy(new Object[]{viewGroup, switchAccountInfo, str}, null, changeQuickRedirect, true, 34706, new Class[]{ViewGroup.class, SwitchAccountInfo.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        List<SwitchFriendInfo> friends = switchAccountInfo.getFriends();
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_no_friends);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.ll_friends);
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        if (com.max.hbcommon.utils.c.w(friends)) {
            linearLayout.setVisibility(4);
            textView.setVisibility(0);
            if (com.max.hbcommon.utils.c.u(switchAccountInfo.getDesc())) {
                return;
            }
            textView.setText(switchAccountInfo.getDesc());
            return;
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(4);
        int iMin = Math.min(friends.size(), (ViewUtils.L(context) - ViewUtils.f(context, 48.0f)) / ViewUtils.f(context, 26.0f));
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < iMin; i10++) {
            View viewInflate = layoutInflater.inflate(R.layout.item_platform_card_friend, (ViewGroup) linearLayout, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
            if (friends.get(i10) != null && friends.get(i10).getSwitch_account_info() != null) {
                com.max.hbimage.b.e0(friends.get(i10).getSwitch_account_info().getAvatar(), imageView, ViewUtils.f(context, 3.0f), R.drawable.common_default_game_avatar_74x74);
                linearLayout.addView(viewInflate);
            }
        }
        View viewY = Y(context);
        int iF = ViewUtils.f(context, 20.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.leftMargin = ViewUtils.f(context, 3.0f);
        linearLayout.addView(viewY, layoutParams);
        linearLayout.setOnClickListener(new d0(context, str));
    }

    public static String W(BindGameInfosObj bindGameInfosObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bindGameInfosObj}, null, changeQuickRedirect, true, 34717, new Class[]{BindGameInfosObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        PlatformBindStatus platformBindStatusG0 = g0(bindGameInfosObj);
        if (!platformBindStatusG0.isBindSteam()) {
            return GameObj.PLATFORM_STEAM;
        }
        if (!platformBindStatusG0.isBindPSN()) {
            return GameObj.PLATFORM_PS;
        }
        if (!com.max.hbcache.c.o(com.max.hbcache.c.R, "").contains("epic") && !platformBindStatusG0.isBindEpic()) {
            return "epic";
        }
        if (!platformBindStatusG0.isBindXbox()) {
            return GameObj.PLATFORM_XBOX;
        }
        if (!platformBindStatusG0.isBindSwitch()) {
            return "switch";
        }
        if (platformBindStatusG0.isBindHardware()) {
            return null;
        }
        return GameObj.PLATFORM_HARDWARE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W0(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 34744, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f131010n2);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.help));
        context.startActivity(intent);
    }

    public static void W1(View view, HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{view, homeDataObj}, null, changeQuickRedirect, true, 34654, new Class[]{View.class, HomeDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        SwitchAccountInfo switch_account_info = homeDataObj.getSwitch_account_info();
        if (switch_account_info == null) {
            view.setVisibility(8);
            return;
        }
        Context context = view.getContext();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_avatar);
        TextView textView = (TextView) view.findViewById(R.id.tv_nickname);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_friend_code);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_copy_friend_code);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_server);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_arrow);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_value_0);
        TextView textView6 = (TextView) view.findViewById(R.id.tv_value_1);
        TextView textView7 = (TextView) view.findViewById(R.id.tv_value_2);
        TextView textView8 = (TextView) view.findViewById(R.id.tv_key_0);
        TextView textView9 = (TextView) view.findViewById(R.id.tv_key_1);
        TextView textView10 = (TextView) view.findViewById(R.id.tv_key_2);
        View viewFindViewById = view.findViewById(R.id.vg_data);
        view.setVisibility(0);
        if ("web".equals(switch_account_info.getType()) || SwitchDetailActivity.P.equals(switch_account_info.getType())) {
            viewFindViewById.setVisibility(0);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            imageView2.setVisibility(0);
            textView8.setText(switch_account_info.getStats().get(0).getKey());
            textView9.setText(switch_account_info.getStats().get(1).getKey());
            textView10.setText(switch_account_info.getStats().get(2).getKey());
            textView5.setText(switch_account_info.getStats().get(0).getValue());
            textView6.setText(switch_account_info.getStats().get(1).getValue());
            textView7.setText(switch_account_info.getStats().get(2).getValue());
        } else {
            viewFindViewById.setVisibility(8);
            imageView2.setVisibility(8);
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setOnClickListener(new c(context, switch_account_info));
            textView2.setText(switch_account_info.getFriend_code());
            bb.d.d(textView2, 5);
        }
        textView4.setText(switch_account_info.getServer_name());
        com.max.hbimage.b.K(switch_account_info.getAvatar(), imageView);
        textView.setText(switch_account_info.getNickname());
    }

    public static String X(HomeDataObj homeDataObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{homeDataObj}, null, changeQuickRedirect, true, 34700, new Class[]{HomeDataObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        PlatformBindStatus platformBindStatusH0 = h0(homeDataObj);
        if (!platformBindStatusH0.isBindSteam()) {
            return GameObj.PLATFORM_STEAM;
        }
        if (!platformBindStatusH0.isBindPSN() && !homeDataObj.isPsn_account_info_hidden()) {
            return GameObj.PLATFORM_PS;
        }
        if (!com.max.hbcache.c.o(com.max.hbcache.c.R, "").contains("epic") && !platformBindStatusH0.isBindEpic() && !homeDataObj.isEpic_account_info_hidden()) {
            return "epic";
        }
        if (!platformBindStatusH0.isBindXbox() && !homeDataObj.isXbox_account_info_hidden()) {
            return GameObj.PLATFORM_XBOX;
        }
        if (!platformBindStatusH0.isBindSwitch() && !homeDataObj.isSwitch_account_info_hidden()) {
            return "switch";
        }
        if (platformBindStatusH0.isBindHardware()) {
            return null;
        }
        return GameObj.PLATFORM_HARDWARE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X0(Context context, GameBindingFragment.n nVar, EditText editText, CircularProgressIndicator circularProgressIndicator, View view, View view2) {
        if (PatchProxy.proxy(new Object[]{context, nVar, editText, circularProgressIndicator, view, view2}, null, changeQuickRedirect, true, 34743, new Class[]{Context.class, GameBindingFragment.n.class, EditText.class, CircularProgressIndicator.class, View.class, View.class}, Void.TYPE).isSupported || !com.max.xiaoheihe.utils.i0.e(context) || nVar == null) {
            return;
        }
        String string = editText.getText().toString();
        if (com.max.hbcommon.utils.c.u(string)) {
            return;
        }
        com.max.xiaoheihe.utils.d.E0(context, editText);
        n(editText, circularProgressIndicator, view, string, "psn", null, nVar);
    }

    public static void X1(String str, ViewGroup viewGroup, z0 z0Var, GameBindingFragment.n nVar, String str2) {
        if (PatchProxy.proxy(new Object[]{str, viewGroup, z0Var, nVar, str2}, null, changeQuickRedirect, true, 34687, new Class[]{String.class, ViewGroup.class, z0.class, GameBindingFragment.n.class, String.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        Context context = viewGroup.getContext();
        viewGroup.removeAllViews();
        if (GameObj.PLATFORM_STEAM.equals(str)) {
            viewGroup.addView((ViewGroup) F0(context, viewGroup, z0Var));
            return;
        }
        if (GameObj.PLATFORM_PS.equals(str)) {
            viewGroup.addView(E0(context, viewGroup, nVar));
            return;
        }
        if (GameObj.PLATFORM_XBOX.equals(str)) {
            viewGroup.addView(H0(context, viewGroup));
            return;
        }
        if ("epic".equals(str)) {
            viewGroup.addView(B0(context, viewGroup));
            return;
        }
        if ("switch".equals(str)) {
            viewGroup.addView(G0(context, viewGroup));
            return;
        }
        if (GameObj.PLATFORM_HARDWARE.equals(str)) {
            viewGroup.addView(C0(context, viewGroup));
        } else if ("dota2".equals(str)) {
            viewGroup.addView(A0(context, viewGroup, nVar));
        } else if ("csgo".equals(str)) {
            viewGroup.addView(z0(context, viewGroup, str2));
        }
    }

    public static View Y(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 34703, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.common_arrow_right_line_24x24);
        imageView.setColorFilter(context.getResources().getColor(R.color.white_alpha50));
        int iF = ViewUtils.f(context, 4.0f);
        imageView.setPadding(iF, iF, iF, iF);
        int color = context.getResources().getColor(R.color.white_alpha10);
        imageView.setBackground(ViewUtils.H(ViewUtils.f(context, 1.0f), color, color));
        int iF2 = ViewUtils.f(context, 20.0f);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(iF2, iF2));
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y0(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 34738, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f131058v2);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.help));
        context.startActivity(intent);
    }

    private static void Y1(ViewGroup viewGroup, XboxShortAccountInfo xboxShortAccountInfo) {
        if (PatchProxy.proxy(new Object[]{viewGroup, xboxShortAccountInfo}, null, changeQuickRedirect, true, 34705, new Class[]{ViewGroup.class, XboxShortAccountInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<XboxFriendInfo> list = xboxShortAccountInfo.getFriends().getList();
        if (viewGroup == null || list == null || list.isEmpty()) {
            return;
        }
        final Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        ViewGroup viewGroup2 = (LinearLayout) viewGroup.findViewById(R.id.ll_friends);
        int iMin = Math.min(list.size(), (ViewUtils.L(context) - ViewUtils.f(context, 48.0f)) / ViewUtils.f(context, 26.0f));
        viewGroup2.removeAllViews();
        for (int i10 = 0; i10 < iMin; i10++) {
            View viewInflate = layoutInflater.inflate(R.layout.item_platform_card_friend, viewGroup2, false);
            ViewGroup viewGroup3 = (ViewGroup) viewInflate.findViewById(R.id.vg_icon);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
            final XboxFriendInfo xboxFriendInfo = list.get(i10);
            final String xuid = xboxFriendInfo.getXuid();
            com.max.hbimage.b.L(list.get(i10).getAvatar_url(), imageView, R.drawable.common_default_game_avatar_74x74);
            viewGroup3.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r1.d1(xuid, context, xboxFriendInfo, view);
                }
            });
            viewGroup2.addView(viewInflate);
        }
        View viewY = Y(context);
        int iF = ViewUtils.f(context, 20.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.leftMargin = ViewUtils.f(context, 3.0f);
        viewGroup2.addView(viewY, layoutParams);
        viewGroup2.setOnClickListener(new c0(xboxShortAccountInfo, context));
    }

    public static String Z(GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj}, null, changeQuickRedirect, true, 34665, new Class[]{GameObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (gameObj != null) {
            return gameObj.getAppid();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z0(Context context, View view) {
        if (!PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 34737, new Class[]{Context.class, View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(context)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CookieClearDomain("accounts.nintendo.com"));
            arrayList.add(new CookieClearDomain(".nintendo.com"));
            com.max.xiaoheihe.utils.d.i(context, com.max.hbutils.utils.k.r(arrayList));
            new HeyboxWebProtocolHandler().C(context, null, com.max.xiaoheihe.utils.l0.A(lb.a.f131006m4, " ", false, true, false, false), null);
        }
    }

    public static void Z1(View view, HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{view, homeDataObj}, null, changeQuickRedirect, true, 34653, new Class[]{View.class, HomeDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        view.getContext();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_avatar);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_bg);
        TextView textView = (TextView) view.findViewById(R.id.tv_nickname);
        XboxShortAccountInfo xbox_account_info = homeDataObj.getXbox_account_info();
        if (xbox_account_info == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (!com.max.hbcommon.utils.c.u(xbox_account_info.getBackground_url())) {
            com.max.hbimage.b.L(xbox_account_info.getBackground_url(), imageView2, R.drawable.game_xbox_entry_367x126);
        }
        com.max.hbimage.b.K(xbox_account_info.getAvatar_url(), imageView);
        textView.setText(xbox_account_info.getNickname());
        PlatformDataView[] platformDataViewArr = {(PlatformDataView) view.findViewById(R.id.pdv0), (PlatformDataView) view.findViewById(R.id.pdv1), (PlatformDataView) view.findViewById(R.id.pdv2)};
        if (xbox_account_info.getStats() == null || xbox_account_info.getStats().size() < 3) {
            return;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            platformDataViewArr[i10].setDesc(xbox_account_info.getStats().get(i10).getKey());
            platformDataViewArr[i10].setValue(xbox_account_info.getStats().get(i10).getValue());
        }
    }

    public static CommonAccountInfo a0(List<CommonAccountInfo> list, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, null, changeQuickRedirect, true, 34652, new Class[]{List.class, String.class}, CommonAccountInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonAccountInfo) patchProxyResultProxy.result;
        }
        if (list == null) {
            return null;
        }
        for (CommonAccountInfo commonAccountInfo : list) {
            if (commonAccountInfo.getGame_stat().equals(str)) {
                return commonAccountInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a1(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 34742, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f131016o2);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.help));
        context.startActivity(intent);
    }

    public static void a2(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34679, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<String> it = f88212a.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return;
            }
        }
        f88212a.add(str);
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType("3");
        pageEventObj.setPath("/me/data/select_game_platform");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("platform", o0(str));
        jsonObject.addProperty("new_style", Boolean.TRUE);
        jsonObject.addProperty("has_bind", Boolean.valueOf(z10));
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        com.max.hbcommon.analytics.d.c(pageEventObj, false);
    }

    public static String b0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34610, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (lb.a.f131080z0.equals(str)) {
            return lb.a.J0;
        }
        if (lb.a.A0.equals(str)) {
            return lb.a.K0;
        }
        if (lb.a.B0.equals(str)) {
            return lb.a.S0;
        }
        if (lb.a.C0.equals(str)) {
            return lb.a.L0;
        }
        if (lb.a.E0.equals(str)) {
            return lb.a.M0;
        }
        if (lb.a.F0.equals(str)) {
            return lb.a.R0;
        }
        if (lb.a.H0.equals(str)) {
            return "psn";
        }
        if (lb.a.G0.equals(str)) {
            return lb.a.T0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b1(Context context, View view) {
        if (!PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 34741, new Class[]{Context.class, View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(context)) {
            N(context, "xbox");
        }
    }

    public static void b2(TextView textView, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{textView, str, str2}, null, changeQuickRedirect, true, 34656, new Class[]{TextView.class, String.class, String.class}, Void.TYPE).isSupported || textView == null) {
            return;
        }
        Context context = textView.getContext();
        int color = context.getResources().getColor(R.color.default_epic_avartar_red_color);
        if (!com.max.hbcommon.utils.c.u(str2)) {
            color = com.max.xiaoheihe.utils.d.e1(str2);
        }
        if (!com.max.hbcommon.utils.c.u(str)) {
            textView.setText(str.substring(0, 1));
        }
        textView.setBackground(com.max.hbutils.utils.q.v(context, color, 1.0f));
    }

    public static TextView c0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 34649, new Class[]{Context.class}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        layoutParams.setMargins(ViewUtils.f(context, 10.0f), 0, 0, 0);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
        textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_not_change_color));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c1(com.max.hbcommon.base.adapter.s.e eVar, Context context, GameObj gameObj, View view) {
        if (PatchProxy.proxy(new Object[]{eVar, context, gameObj, view}, null, changeQuickRedirect, true, 34745, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Context.class, GameObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, context, gameObj);
        D(Z(gameObj), gameObj.getFollow_state(), null);
    }

    private static void c2(TextView textView, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{textView, str, str2}, null, changeQuickRedirect, true, 34651, new Class[]{TextView.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str) || !com.max.accelworld.h.b(str2)) {
            textView.setTextSize(1, 18.0f);
        } else {
            textView.setTextSize(1, 14.0f);
        }
    }

    public static Fragment d0(String str, String str2, String str3, String str4, String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 34661, new Class[]{String.class, String.class, String.class, String.class, String.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (lb.a.f131080z0.equals(str)) {
            return com.max.xiaoheihe.module.littleprogram.fragment.pubg.c.c(str5, str3);
        }
        if (lb.a.E0.equals(str)) {
            return OWGameDataFragment.G5(str5);
        }
        if (lb.a.Y0.equals(str)) {
            return Dota2GameDetailFragment.n5(str3, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d1(String str, Context context, XboxFriendInfo xboxFriendInfo, View view) {
        if (PatchProxy.proxy(new Object[]{str, context, xboxFriendInfo, view}, null, changeQuickRedirect, true, 34733, new Class[]{String.class, Context.class, XboxFriendInfo.class, View.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        J0(context, xboxFriendInfo.getBind_heybox_info() == null ? "0" : xboxFriendInfo.getBind_heybox_info().getUserid(), str);
    }

    public static void d2(View view, GameObj gameObj, View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{view, gameObj, onClickListener}, null, changeQuickRedirect, true, 34640, new Class[]{View.class, GameObj.class, View.OnClickListener.class}, Void.TYPE).isSupported || view == null || gameObj == null) {
            return;
        }
        view.setOnClickListener(new r0(view.getContext(), gameObj, com.max.hbcommon.utils.c.w(gameObj.getPlatform_infos()) ? "" : gameObj.getPlatform_infos().get(0).getKey(), onClickListener));
    }

    public static Intent e0(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 34663, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        if (lb.a.J0.equals(str)) {
            return PUBGPlayerOverViewActivity.M1(context, str3, null, str2);
        }
        if (lb.a.M0.equals(str)) {
            return OWPlayerOverViewActivity.N1(context, str3, null, str2);
        }
        if ("epic".equals(str)) {
            return com.max.xiaoheihe.module.game.epic.a.a(context, str2);
        }
        return null;
    }

    public static void e1(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 34704, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        context.startActivity(SteamPrivacyActivity.X1(context, str));
    }

    public static void e2(View view, RecommendGameListItemObj recommendGameListItemObj, View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{view, recommendGameListItemObj, onClickListener}, null, changeQuickRedirect, true, 34639, new Class[]{View.class, RecommendGameListItemObj.class, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        d2(view, w(recommendGameListItemObj), onClickListener);
    }

    public static com.sankuai.waimai.router.common.c f0(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 34662, new Class[]{Context.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        if ("switch".equals(str)) {
            return com.max.xiaoheihe.base.router.b.c0(context, str2, null, null);
        }
        if ("xbox".equals(str)) {
            J0(context, str2, str3);
            return null;
        }
        if (lb.a.J0.equals(str)) {
            return com.max.xiaoheihe.base.router.b.Z(context, str2, str3);
        }
        return null;
    }

    public static void f1(Activity activity, String str, boolean z10, com.max.hbcommon.network.p pVar) {
        if (PatchProxy.proxy(new Object[]{activity, str, new Byte(z10 ? (byte) 1 : (byte) 0), pVar}, null, changeQuickRedirect, true, 34710, new Class[]{Activity.class, String.class, Boolean.TYPE, com.max.hbcommon.network.p.class}, Void.TYPE).isSupported || activity == null || activity.isFinishing() || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        com.max.hbcommon.network.d dVar = (com.max.hbcommon.network.d) com.max.xiaoheihe.network.i.a().W7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j0(activity, pVar, z10, str));
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).V(dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00b0  */
    public static void f2(Context context, Boolean bool, Boolean bool2, Boolean bool3, @androidx.annotation.d0 int i10, @androidx.annotation.v int i11, ViewGroup viewGroup, boolean z10) {
        Object[] objArr = {context, bool, bool2, bool3, new Integer(i10), new Integer(i11), viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34680, new Class[]{Context.class, Boolean.class, Boolean.class, Boolean.class, cls, cls, ViewGroup.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RadioButton radioButton = (RadioButton) ((Activity) context).getLayoutInflater().inflate(R.layout.item_platform_rb, viewGroup, false);
        radioButton.setId(i10);
        Drawable drawable = context.getDrawable(i11);
        int iF = ViewUtils.f(context, 14.0f);
        drawable.setBounds(0, 0, iF, iF);
        if (bool2.booleanValue()) {
            if ((!bool3.booleanValue() || z10) && !bool.booleanValue()) {
                radioButton.setVisibility(0);
                radioButton.setCompoundDrawables(null, drawable, null, null);
            } else {
                radioButton = null;
            }
        } else if (bool3.booleanValue()) {
            radioButton.setVisibility(0);
            radioButton.setCompoundDrawables(null, drawable, null, null);
        } else {
            radioButton = null;
        }
        if (radioButton != null) {
            viewGroup.addView(radioButton);
        }
    }

    public static PlatformBindStatus g0(BindGameInfosObj bindGameInfosObj) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bindGameInfosObj}, null, changeQuickRedirect, true, 34718, new Class[]{BindGameInfosObj.class}, PlatformBindStatus.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformBindStatus) patchProxyResultProxy.result;
        }
        PlatformBindStatus platformBindStatus = new PlatformBindStatus();
        if (bindGameInfosObj != null) {
            platformBindStatus.setBindSteam(K0(bindGameInfosObj, "steam"));
            platformBindStatus.setBindPSN(K0(bindGameInfosObj, "psn"));
            platformBindStatus.setBindXbox(K0(bindGameInfosObj, "xbox"));
            if (!K0(bindGameInfosObj, "switch") && !K0(bindGameInfosObj, "ns") && !K0(bindGameInfosObj, "switchjp") && !K0(bindGameInfosObj, "switchall")) {
                z10 = false;
            }
            platformBindStatus.setBindSwitch(z10);
            platformBindStatus.setBindEpic(K0(bindGameInfosObj, "epic"));
            platformBindStatus.setBindHardware(K0(bindGameInfosObj, "pc"));
            platformBindStatus.setBindDota2(K0(bindGameInfosObj, "dota2"));
            platformBindStatus.setBindCsgo(K0(bindGameInfosObj, GameObj.GAME_CSGO_KEY));
        }
        return platformBindStatus;
    }

    public static void g1(com.max.hbcommon.base.adapter.s.e eVar, RecommendGameListItemObj recommendGameListItemObj) {
        if (PatchProxy.proxy(new Object[]{eVar, recommendGameListItemObj}, null, changeQuickRedirect, true, 34644, new Class[]{com.max.hbcommon.base.adapter.s.e.class, RecommendGameListItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        Context context = viewB.getContext();
        ImageView imageView = (ImageView) eVar.i(R.id.iv_bg_img);
        View viewI = eVar.i(R.id.vg_content);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_img);
        TextView textView = (TextView) eVar.i(R.id.tv_game_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_rec_cnt);
        TextView textView3 = (TextView) eVar.i(R.id.tv_description);
        TextView textView4 = (TextView) eVar.i(R.id.tv_username);
        GameRateStarView gameRateStarView = (GameRateStarView) eVar.i(R.id.ll_rating);
        TextView textView5 = (TextView) eVar.i(R.id.tv_time);
        int iV = ViewUtils.V(viewI);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams.height != iV) {
            layoutParams.height = iV;
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setColorFilter(context.getResources().getColor(R.color.white_alpha95));
        if (recommendGameListItemObj.getGame() != null) {
            com.max.hbimage.b.L(recommendGameListItemObj.getGame().getImage(), imageView, R.drawable.common_default_placeholder_375x210);
            com.max.hbimage.b.e0(recommendGameListItemObj.getGame().getImage(), imageView2, ViewUtils.f(context, 2.0f), R.drawable.common_default_placeholder_375x210);
            textView.setText(recommendGameListItemObj.getGame().getName());
            imageView2.setOnClickListener(new t0(context, recommendGameListItemObj));
        } else {
            com.max.hbimage.b.c(imageView);
            com.max.hbimage.b.c(imageView2);
            textView.setText((CharSequence) null);
            imageView2.setClickable(false);
        }
        textView2.setText(String.format(context.getResources().getString(R.string.recommend_cnt_format), recommendGameListItemObj.getRec_cnt()));
        textView3.setText(recommendGameListItemObj.getDescription());
        textView4.setText(recommendGameListItemObj.getUser().getUsername());
        gameRateStarView.setRating(com.max.hbutils.utils.n.p(recommendGameListItemObj.getScore()));
        textView5.setText(com.max.hbutils.utils.w.v(context, recommendGameListItemObj.getCreate_at()));
        viewB.setOnClickListener(new u0(context, recommendGameListItemObj));
    }

    public static void g2(Context context, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 34714, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(context instanceof Activity)) {
            context = com.max.hbutils.utils.e.b().a();
        }
        ImageView imageView = new ImageView(context);
        int iF = ViewUtils.f(context, 90.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams.topMargin = ViewUtils.f(context, 10.0f);
        layoutParams.bottomMargin = ViewUtils.f(context, 24.0f);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        com.max.hbimage.b.e0(str3, imageView, ViewUtils.f(context, 10.0f), R.drawable.common_default_placeholder_375x210);
        new com.max.hbcommon.view.a.f(context).y("预约游戏已下载完成").l(String.format("您预约的《%s》已下载完成，现在去安装吧", str2)).i(imageView).u("立即安装", new o0(context, str)).n(R.string.cancel, new n0()).F();
    }

    public static PlatformBindStatus h0(HomeDataObj homeDataObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{homeDataObj}, null, changeQuickRedirect, true, 34675, new Class[]{HomeDataObj.class}, PlatformBindStatus.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformBindStatus) patchProxyResultProxy.result;
        }
        PlatformBindStatus platformBindStatus = new PlatformBindStatus();
        if (homeDataObj != null) {
            platformBindStatus.setBindSteam((homeDataObj.getSteam_id_info() == null || com.max.hbcommon.utils.c.u(homeDataObj.getSteam_id_info().getSteamid())) ? false : true);
            platformBindStatus.setBindPSN(homeDataObj.getPsn_account_info() != null);
            platformBindStatus.setBindXbox(homeDataObj.getXbox_account_info() != null);
            platformBindStatus.setBindSwitch(homeDataObj.getSwitch_account_info() != null);
            platformBindStatus.setBindEpic(homeDataObj.getEpic_account_info() != null);
            platformBindStatus.setBindHardware(homeDataObj.getHardware_info() != null);
            platformBindStatus.setBindDota2(homeDataObj.getDota2_platform_info() != null && homeDataObj.getDota2_platform_info().is_bind().booleanValue());
            platformBindStatus.setBindCsgo(homeDataObj.getCsgo_platform_info() != null && homeDataObj.getCsgo_platform_info().is_bind().booleanValue());
        }
        return platformBindStatus;
    }

    public static void h1(View view, HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{view, homeDataObj}, null, changeQuickRedirect, true, 34659, new Class[]{View.class, HomeDataObj.class}, Void.TYPE).isSupported || homeDataObj == null || homeDataObj.getCsgo_platform_info() == null || !homeDataObj.getCsgo_platform_info().is_bind().booleanValue()) {
            return;
        }
        AccountCsGoInfoObj csgo_platform_info = homeDataObj.getCsgo_platform_info();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_game_data_card_bg);
        TextView textView = (TextView) view.findViewById(R.id.tv_nick_name);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_map_name);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom_desc);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_bottom_data);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vg_platform_data);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_not_data_desc);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.ll_tips);
        PlatformDataView platformDataView = (PlatformDataView) view.findViewById(R.id.pdv0);
        PlatformDataView platformDataView2 = (PlatformDataView) view.findViewById(R.id.pdv1);
        PlatformDataView platformDataView3 = (PlatformDataView) view.findViewById(R.id.pdv2);
        com.max.hbimage.b.K(csgo_platform_info.getBg(), imageView);
        textView.setText(csgo_platform_info.getNickname());
        view.setOnClickListener(new h(view, csgo_platform_info));
        if (!com.max.hbcommon.utils.c.u(csgo_platform_info.getDefault_msg())) {
            viewGroup.setVisibility(8);
            textView5.setVisibility(0);
            viewGroup2.setVisibility(4);
            textView5.setText(csgo_platform_info.getDefault_msg());
            return;
        }
        viewGroup.setVisibility(0);
        textView5.setVisibility(8);
        viewGroup2.setVisibility(0);
        textView2.setText(csgo_platform_info.getMap_name());
        textView4.setText(csgo_platform_info.getBottom_data());
        textView3.setText(csgo_platform_info.getBottom_data_desc());
        platformDataView.setValue(csgo_platform_info.getRating());
        platformDataView.setDesc("Rating");
        platformDataView2.setValue(csgo_platform_info.getKda_detail());
        platformDataView2.setDesc("K/D/A");
        platformDataView3.setValue(csgo_platform_info.getElo());
        platformDataView3.setDesc("ELO");
        platformDataView3.setDelta(csgo_platform_info.getDelta());
    }

    public static void h2(BaseActivity baseActivity, String str, String str2, y0 y0Var) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2, y0Var}, null, changeQuickRedirect, true, 34711, new Class[]{BaseActivity.class, String.class, String.class, y0.class}, Void.TYPE).isSupported) {
            return;
        }
        i2(baseActivity, str, str2, y0Var, null);
    }

    public static String i0(int i10) {
        if (i10 == R.id.rb_platform_steam) {
            return GameObj.PLATFORM_STEAM;
        }
        if (i10 == R.id.rb_platform_ps) {
            return GameObj.PLATFORM_PS;
        }
        if (i10 == R.id.rb_platform_xbox) {
            return GameObj.PLATFORM_XBOX;
        }
        if (i10 == R.id.rb_platform_switch) {
            return "switch";
        }
        if (i10 == R.id.rb_platform_hardware) {
            return GameObj.PLATFORM_HARDWARE;
        }
        if (i10 == R.id.rb_platform_epic) {
            return "epic";
        }
        if (i10 == R.id.rb_platform_dota) {
            return "dota2";
        }
        return i10 == R.id.rb_platform_csgo ? "csgo" : GameObj.PLATFORM_STEAM;
    }

    public static void i1(TextView textView, GamePriceObj gamePriceObj, String str) {
        if (PatchProxy.proxy(new Object[]{textView, gamePriceObj, str}, null, changeQuickRedirect, true, 34594, new Class[]{TextView.class, GamePriceObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        l1(textView, gamePriceObj != null ? gamePriceObj.getDiscount() : null, true, str);
    }

    public static void i2(BaseActivity baseActivity, String str, String str2, y0 y0Var, a1 a1Var) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2, y0Var, a1Var}, null, changeQuickRedirect, true, 34712, new Class[]{BaseActivity.class, String.class, String.class, y0.class, a1.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = baseActivity.getLayoutInflater().inflate(R.layout.layout_subscribe_game, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_number);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.cb_check);
        editText.setText(str);
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(baseActivity);
        fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.confirm_your_cell_phone_number)).l(com.max.xiaoheihe.utils.d.n0(R.string.game_reserve_desc)).i(viewInflate).u(com.max.xiaoheihe.utils.d.n0(R.string.commit), new l0(editText, baseActivity, str2, checkBox, a1Var, y0Var)).o(com.max.xiaoheihe.utils.d.n0(R.string.skip), new k0(baseActivity, str2, checkBox, a1Var, y0Var));
        fVar.F();
    }

    public static String j0(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34725, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -889473228:
                b10 = !str.equals("switch") ? (byte) -1 : (byte) 0;
                break;
            case bb.c.e.X /* 3571 */:
                if (!str.equals("pc")) {
                    b10 = -1;
                }
                break;
            case 111307:
                b10 = !str.equals("psn") ? (byte) -1 : (byte) 2;
                break;
            case 3063128:
                b10 = !str.equals("csgo") ? (byte) -1 : (byte) 3;
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 4;
                break;
            case 3672659:
                b10 = !str.equals("xbox") ? (byte) -1 : (byte) 5;
                break;
            case 95773434:
                b10 = !str.equals("dota2") ? (byte) -1 : (byte) 6;
                break;
            case 109760848:
                b10 = !str.equals("steam") ? (byte) -1 : (byte) 7;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return "switch";
            case 1:
                return GameObj.PLATFORM_HARDWARE;
            case 2:
                return GameObj.PLATFORM_PS;
            case 3:
                return "csgo";
            case 4:
                return "epic";
            case 5:
                return GameObj.PLATFORM_XBOX;
            case 6:
                return "dota2";
            case 7:
                return GameObj.PLATFORM_STEAM;
            default:
                return null;
        }
    }

    public static void j1(TextView textView, MallPriceObj mallPriceObj, String str) {
        if (PatchProxy.proxy(new Object[]{textView, mallPriceObj, str}, null, changeQuickRedirect, true, 34595, new Class[]{TextView.class, MallPriceObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        l1(textView, mallPriceObj != null ? mallPriceObj.getDiscount() : null, false, str);
    }

    public static void j2(View view, ArrayList<String> arrayList, z0 z0Var, GameBindingFragment.n nVar) {
        if (PatchProxy.proxy(new Object[]{view, arrayList, z0Var, nVar}, null, changeQuickRedirect, true, 34677, new Class[]{View.class, ArrayList.class, z0.class, GameBindingFragment.n.class}, Void.TYPE).isSupported) {
            return;
        }
        k2(view, arrayList, z0Var, nVar, null);
    }

    public static PlatformCardBgObj k0(HomeDataObj homeDataObj, String str, Boolean bool, Boolean bool2, Boolean bool3, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{homeDataObj, str, bool, bool2, bool3, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34683, new Class[]{HomeDataObj.class, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.TYPE}, PlatformCardBgObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformCardBgObj) patchProxyResultProxy.result;
        }
        if (!bool2.booleanValue()) {
            if (bool3.booleanValue()) {
                return O(homeDataObj, bool2, str);
            }
            return null;
        }
        if ((!bool3.booleanValue() || z10) && !bool.booleanValue()) {
            return bool3.booleanValue() ? O(homeDataObj, bool2, str) : I0(str);
        }
        return null;
    }

    public static void k1(TextView textView, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{textView, str, str2, str3}, null, changeQuickRedirect, true, 34593, new Class[]{TextView.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        double dO = com.max.hbutils.utils.n.o(str);
        double dO2 = com.max.hbutils.utils.n.o(str2);
        if (str == null || str2 == null) {
            l1(textView, "1", false, str3);
            return;
        }
        l1(textView, (dO / dO2) + "", false, str3);
    }

    public static void k2(View view, ArrayList<String> arrayList, z0 z0Var, GameBindingFragment.n nVar, String str) {
        if (PatchProxy.proxy(new Object[]{view, arrayList, z0Var, nVar, str}, null, changeQuickRedirect, true, 34678, new Class[]{View.class, ArrayList.class, z0.class, GameBindingFragment.n.class, String.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        if (arrayList == null || arrayList.size() <= 0) {
            view.setVisibility(8);
            return;
        }
        Context context = view.getContext();
        view.setVisibility(0);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.rg_platforms);
        HBViewPager2 hBViewPager2 = (HBViewPager2) view.findViewById(R.id.vp_platform);
        view.findViewById(R.id.iv_setting).setVisibility(8);
        radioGroup.setVisibility(0);
        radioGroup.removeAllViews();
        hBViewPager2.setMaxOverScrollPages(1);
        String strO = com.max.hbcache.c.o(com.max.hbcache.c.f66158y, GameObj.PLATFORM_STEAM);
        boolean zContains = com.max.hbcache.c.o(com.max.hbcache.c.R, "").contains("epic");
        for (String str2 : arrayList) {
            if (str2 != null) {
                switch (str2) {
                    case "platform_hardware":
                        Boolean bool = Boolean.FALSE;
                        f2(context, bool, Boolean.TRUE, bool, R.id.rb_platform_hardware, R.drawable.rb_platform_hardware, radioGroup, false);
                        break;
                    case "switch":
                        Boolean bool2 = Boolean.FALSE;
                        f2(context, bool2, Boolean.TRUE, bool2, R.id.rb_platform_switch, R.drawable.rb_platform_switch, radioGroup, false);
                        break;
                    case "platform_steam":
                        Boolean bool3 = Boolean.FALSE;
                        f2(context, bool3, Boolean.TRUE, bool3, R.id.rb_platform_steam, R.drawable.rb_platform_steam, radioGroup, false);
                        break;
                    case "csgo":
                        Boolean bool4 = Boolean.FALSE;
                        f2(context, bool4, Boolean.TRUE, bool4, R.id.rb_platform_csgo, R.drawable.rb_platform_csgo, radioGroup, false);
                        break;
                    case "epic":
                        if (zContains) {
                            Boolean bool5 = Boolean.TRUE;
                            f2(context, bool5, bool5, bool5, R.id.rb_platform_epic, R.drawable.rb_platform_epic, radioGroup, false);
                            break;
                        } else {
                            Boolean bool6 = Boolean.FALSE;
                            f2(context, bool6, Boolean.TRUE, bool6, R.id.rb_platform_epic, R.drawable.rb_platform_epic, radioGroup, false);
                            break;
                        }
                        break;
                    case "dota2":
                        Boolean bool7 = Boolean.FALSE;
                        f2(context, bool7, Boolean.TRUE, bool7, R.id.rb_platform_dota, R.drawable.rb_platform_dota, radioGroup, false);
                        break;
                    case "platform_xbox":
                        Boolean bool8 = Boolean.FALSE;
                        f2(context, bool8, Boolean.TRUE, bool8, R.id.rb_platform_xbox, R.drawable.rb_platform_xbox, radioGroup, false);
                        break;
                    case "platform_ps":
                        Boolean bool9 = Boolean.FALSE;
                        f2(context, bool9, Boolean.TRUE, bool9, R.id.rb_platform_ps, R.drawable.rb_platform_ps, radioGroup, false);
                        break;
                }
            }
        }
        int iP = P(strO);
        radioGroup.setOnCheckedChangeListener(new m(hBViewPager2, z0Var));
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < radioGroup.getChildCount(); i10++) {
            arrayList2.add(Integer.valueOf(radioGroup.getChildAt(i10).getId()));
        }
        hBViewPager2.setOffscreenPageLimit(arrayList2.size());
        List<PlatformCardBgObj> listD0 = D0(arrayList);
        p000if.a aVar = new p000if.a((ViewGroup) view.findViewById(R.id.vg_bg_container), listD0, hBViewPager2, null);
        hBViewPager2.setPageTransformer(aVar);
        hBViewPager2.n(new n(radioGroup, z0Var));
        hBViewPager2.setAdapter(new o(context, arrayList2, R.layout.item_platform_card_v2, z0Var, nVar, str));
        int i11 = 0;
        while (i11 < radioGroup.getChildCount()) {
            if (iP == radioGroup.getChildAt(i11).getId()) {
                radioGroup.clearCheck();
                hBViewPager2.setCurrentItem(i11, false);
                aVar.u(listD0.get(i11), i11);
            }
            i11++;
        }
        i11 = 0;
        radioGroup.clearCheck();
        hBViewPager2.setCurrentItem(i11, false);
        aVar.u(listD0.get(i11), i11);
    }

    public static List<PlatformCardBgObj> l0(HomeDataObj homeDataObj, Boolean bool, boolean z10, PlatformCurrentDataObj platformCurrentDataObj) {
        PlatformCardBgObj platformCardBgObjK0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{homeDataObj, bool, new Byte(z10 ? (byte) 1 : (byte) 0), platformCurrentDataObj}, null, changeQuickRedirect, true, 34681, new Class[]{HomeDataObj.class, Boolean.class, Boolean.TYPE, PlatformCurrentDataObj.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        PlatformBindStatus platformBindStatusH0 = h0(homeDataObj);
        boolean zIsHideEpic = platformCurrentDataObj.isHideEpic();
        for (String str : GameObj.ALL_PLATFORMS) {
            PlatformCardBgObj platformCardBgObjK1 = null;
            str.hashCode();
            switch (str) {
                case "platform_hardware":
                    platformCardBgObjK1 = k0(homeDataObj, GameObj.PLATFORM_HARDWARE, Boolean.FALSE, bool, Boolean.valueOf(platformBindStatusH0.isBindHardware()), z10);
                    break;
                case "switch":
                    platformCardBgObjK1 = k0(homeDataObj, "switch", Boolean.valueOf(homeDataObj.isSwitch_account_info_hidden()), bool, Boolean.valueOf(platformBindStatusH0.isBindSwitch()), z10);
                    break;
                case "platform_steam":
                    platformCardBgObjK1 = k0(homeDataObj, GameObj.PLATFORM_STEAM, Boolean.FALSE, bool, Boolean.valueOf(platformBindStatusH0.isBindSteam()), z10);
                    break;
                case "csgo":
                    platformCardBgObjK1 = k0(homeDataObj, "csgo", Boolean.FALSE, bool, Boolean.valueOf(platformBindStatusH0.isBindCsgo()), z10);
                    break;
                case "epic":
                    if (zIsHideEpic) {
                        Boolean bool2 = Boolean.TRUE;
                        platformCardBgObjK0 = k0(homeDataObj, "epic", bool2, bool2, bool2, z10);
                    } else {
                        platformCardBgObjK0 = k0(homeDataObj, "epic", Boolean.valueOf(homeDataObj.isEpic_account_info_hidden()), bool, Boolean.valueOf(platformBindStatusH0.isBindEpic()), z10);
                    }
                    platformCardBgObjK1 = platformCardBgObjK0;
                    break;
                case "dota2":
                    platformCardBgObjK1 = k0(homeDataObj, "dota2", Boolean.FALSE, bool, Boolean.valueOf(platformBindStatusH0.isBindDota2()), z10);
                    break;
                case "platform_xbox":
                    platformCardBgObjK1 = k0(homeDataObj, GameObj.PLATFORM_XBOX, Boolean.valueOf(homeDataObj.isXbox_account_info_hidden()), bool, Boolean.valueOf(platformBindStatusH0.isBindXbox()), z10);
                    break;
                case "platform_ps":
                    platformCardBgObjK1 = k0(homeDataObj, GameObj.PLATFORM_PS, Boolean.valueOf(homeDataObj.isPsn_account_info_hidden()), bool, Boolean.valueOf(platformBindStatusH0.isBindPSN()), z10);
                    break;
            }
            if (platformCardBgObjK1 != null) {
                arrayList.add(platformCardBgObjK1);
            }
        }
        return arrayList;
    }

    public static void l1(TextView textView, String str, boolean z10, String str2) {
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{textView, str, new Byte(z10 ? (byte) 1 : (byte) 0), str2}, null, changeQuickRedirect, true, 34596, new Class[]{TextView.class, String.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!com.max.hbcommon.utils.c.u(str2)) {
            sb2.append(str2);
        }
        int iQ = com.max.hbutils.utils.n.q(str);
        if (!z10 ? iQ >= 1 : iQ <= 0) {
            z11 = false;
        }
        if (z11) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(T(str, z10));
        }
        if (sb2.length() <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        bb.d.d(textView, 5);
        textView.setText(sb2);
    }

    public static void l2(BaseActivity baseActivity, String str, String str2, boolean z10, a1 a1Var) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), a1Var}, null, changeQuickRedirect, true, 34713, new Class[]{BaseActivity.class, String.class, String.class, Boolean.TYPE, a1.class}, Void.TYPE).isSupported) {
            return;
        }
        baseActivity.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F6(str2, str, z10 ? "1" : "0").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m0(a1Var)));
    }

    public static int m0(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34722, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -889473228:
                b10 = !str.equals("switch") ? (byte) -1 : (byte) 0;
                break;
            case 111307:
                if (!str.equals("psn")) {
                    b10 = -1;
                }
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 2;
                break;
            case 3672659:
                b10 = !str.equals("xbox") ? (byte) -1 : (byte) 3;
                break;
            case 538159775:
                b10 = !str.equals(GameObj.PLATFORM_XBOX) ? (byte) -1 : (byte) 4;
                break;
            case 1251955023:
                b10 = !str.equals(GameObj.PLATFORM_PS) ? (byte) -1 : (byte) 5;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return R.drawable.common_platform_switch;
            case 1:
            case 5:
                return R.drawable.common_platform_ps;
            case 2:
                return R.drawable.common_platform_epic;
            case 3:
            case 4:
                return R.drawable.common_platform_xbox;
            default:
                return R.drawable.common_platform_steam_filled;
        }
    }

    public static void m1(View view, HomeDataObj homeDataObj) {
        PlatformDataView platformDataView;
        PlatformDataView platformDataView2;
        if (PatchProxy.proxy(new Object[]{view, homeDataObj}, null, changeQuickRedirect, true, 34658, new Class[]{View.class, HomeDataObj.class}, Void.TYPE).isSupported || homeDataObj == null || homeDataObj.getDota2_platform_info() == null || !homeDataObj.getDota2_platform_info().is_bind().booleanValue()) {
            return;
        }
        AccountDota2InfoObj dota2_platform_info = homeDataObj.getDota2_platform_info();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_game_data_card_bg);
        TextView textView = (TextView) view.findViewById(R.id.tv_nick_name);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_hero_name);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_damage);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_damage_rate);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vg_platform_data);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_not_data_desc);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.ll_tips);
        PlatformDataView platformDataView3 = (PlatformDataView) view.findViewById(R.id.pdv0);
        PlatformDataView platformDataView4 = (PlatformDataView) view.findViewById(R.id.pdv1);
        PlatformDataView platformDataView5 = (PlatformDataView) view.findViewById(R.id.pdv2);
        PlatformDataView platformDataView6 = (PlatformDataView) view.findViewById(R.id.pdv3);
        View viewFindViewById = view.findViewById(R.id.vg_auth);
        TextView textView6 = (TextView) view.findViewById(R.id.tv_auth);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_auth_arrow);
        if (com.max.hbcommon.utils.c.x(dota2_platform_info.is_heybox_user())) {
            platformDataView2 = platformDataView4;
            platformDataView = platformDataView3;
            viewFindViewById.setBackground(com.max.hbutils.utils.q.o(BaseApplication.a(), R.color.white_alpha8, 7.0f));
            textView6.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha60));
            textView6.setText(R.string.already_certified);
            imageView2.setVisibility(8);
        } else {
            platformDataView = platformDataView3;
            platformDataView2 = platformDataView4;
            boolean z10 = homeDataObj.getAccount_detail() != null && com.max.xiaoheihe.utils.i0.q(homeDataObj.getAccount_detail().getUserid());
            viewFindViewById.setBackground(com.max.hbutils.utils.q.o(BaseApplication.a(), R.color.white, 7.0f));
            textView6.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_not_change_color));
            textView6.setText(R.string.not_verify);
            if (z10) {
                imageView2.setVisibility(0);
                viewFindViewById.setOnClickListener(new f());
            } else {
                imageView2.setVisibility(8);
                viewFindViewById.setOnClickListener(null);
            }
        }
        com.max.hbimage.b.K(dota2_platform_info.getBg(), imageView);
        textView.setText(dota2_platform_info.getNickname());
        view.setOnClickListener(new g(view, dota2_platform_info));
        if (!com.max.hbcommon.utils.c.u(dota2_platform_info.getDefault_msg())) {
            viewGroup.setVisibility(8);
            textView5.setVisibility(0);
            viewGroup2.setVisibility(4);
            textView5.setText(dota2_platform_info.getDefault_msg());
            return;
        }
        viewGroup.setVisibility(0);
        textView5.setVisibility(8);
        viewGroup2.setVisibility(0);
        textView2.setText(dota2_platform_info.getHero_name());
        textView3.setText(dota2_platform_info.getDamage());
        textView4.setText(dota2_platform_info.getDamage_rate());
        PlatformDataView platformDataView7 = platformDataView;
        platformDataView7.setValue(dota2_platform_info.getRating());
        platformDataView7.setDesc("评分");
        PlatformDataView platformDataView8 = platformDataView2;
        platformDataView8.setValue(dota2_platform_info.getKda_detail());
        platformDataView8.setDesc("K/D/A");
        platformDataView5.setValue(dota2_platform_info.getKda());
        platformDataView5.setDesc("KDA");
        platformDataView6.setValue(dota2_platform_info.getMmr());
        platformDataView6.setDesc("MMR");
        platformDataView6.setDelta(dota2_platform_info.getDelta());
    }

    public static void m2(TextView textView, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34648, new Class[]{TextView.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = textView.getContext();
        boolean zEqualsIgnoreCase = "unfollowing".equalsIgnoreCase(str);
        int i10 = R.drawable.btn_bg_layer_2_color_alpha20_2dp;
        if (zEqualsIgnoreCase) {
            textView.setVisibility(0);
            Resources resources = context.getResources();
            if (z10) {
                i10 = R.drawable.btn_primary_2dp;
            }
            textView.setBackgroundDrawable(resources.getDrawable(i10));
            textView.setText(context.getResources().getText(R.string.follow));
            textView.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
            return;
        }
        if (!"following".equalsIgnoreCase(str)) {
            n2(textView, str, z10, false);
            return;
        }
        textView.setVisibility(0);
        Resources resources2 = context.getResources();
        if (z10) {
            i10 = R.drawable.btn_divider_concept_2dp;
        }
        textView.setBackgroundDrawable(resources2.getDrawable(i10));
        textView.setText(context.getResources().getText(R.string.has_followed));
        textView.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
    }

    public static void n(View view, View view2, View view3, String str, String str2, String str3, GameBindingFragment.n nVar) {
        io.reactivex.z<Result<StateObj>> zVarFb;
        if (PatchProxy.proxy(new Object[]{view, view2, view3, str, str2, str3, nVar}, null, changeQuickRedirect, true, 34708, new Class[]{View.class, View.class, View.class, String.class, String.class, String.class, GameBindingFragment.n.class}, Void.TYPE).isSupported) {
            return;
        }
        view2.setVisibility(0);
        view.setVisibility(4);
        view3.setVisibility(4);
        if ("psn".equals(str2)) {
            zVarFb = com.max.xiaoheihe.network.i.a().Vb(str, str2, null);
        } else {
            zVarFb = "xbox".equals(str2) ? com.max.xiaoheihe.network.i.a().fb(str, str2) : com.max.xiaoheihe.network.i.a().B0(str, str2, str3);
        }
        zVarFb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h0(view2, view, view3, nVar, str2, str, str3));
    }

    public static ImageView n0(Context context, String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, new Integer(i10)}, null, changeQuickRedirect, true, 34721, new Class[]{Context.class, String.class, Integer.TYPE}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str) || i10 <= 0) {
            return null;
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(i10, i10));
        com.max.hbimage.b.d0(str, imageView, ViewUtils.f(context, 2.0f));
        return imageView;
    }

    private static void n1(ViewGroup viewGroup, EpicAccountInfo epicAccountInfo, String str) {
        if (PatchProxy.proxy(new Object[]{viewGroup, epicAccountInfo, str}, null, changeQuickRedirect, true, 34707, new Class[]{ViewGroup.class, EpicAccountInfo.class, String.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_no_friends);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.ll_friends);
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        if (epicAccountInfo.getFriends() == null || com.max.hbcommon.utils.c.w(epicAccountInfo.getFriends().getList())) {
            linearLayout.setVisibility(4);
            textView.setVisibility(0);
            if (com.max.hbcommon.utils.c.u(epicAccountInfo.getDesc())) {
                return;
            }
            textView.setText(epicAccountInfo.getDesc());
            return;
        }
        ArrayList<EpicFriendInfo> list = epicAccountInfo.getFriends().getList();
        linearLayout.setVisibility(0);
        textView.setVisibility(4);
        int iMin = Math.min(list.size(), (ViewUtils.L(context) - ViewUtils.f(context, 48.0f)) / ViewUtils.f(context, 26.0f));
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < iMin; i10++) {
            View viewInflate = layoutInflater.inflate(R.layout.item_platform_card_friend, (ViewGroup) linearLayout, false);
            b2((TextView) viewInflate.findViewById(R.id.tv_icon), list.get(i10).getEpic_name(), list.get(i10).getHead_color());
            linearLayout.addView(viewInflate);
            viewInflate.setOnClickListener(new e0(context, list, i10));
        }
        View viewY = Y(context);
        int iF = ViewUtils.f(context, 20.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.leftMargin = ViewUtils.f(context, 3.0f);
        linearLayout.addView(viewY, layoutParams);
        linearLayout.setOnClickListener(new f0(epicAccountInfo, context, str));
    }

    public static void n2(TextView textView, String str, boolean z10, boolean z11) {
        Object[] objArr = {textView, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34647, new Class[]{TextView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = textView.getContext();
        boolean zEqualsIgnoreCase = GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(str);
        int i10 = R.drawable.btn_bg_layer_2_color_alpha20_2dp;
        if (zEqualsIgnoreCase) {
            textView.setVisibility(0);
            Resources resources = context.getResources();
            if (z10) {
                i10 = R.drawable.btn_primary_2dp;
            }
            textView.setBackgroundDrawable(resources.getDrawable(i10));
            textView.setText(context.getResources().getText(R.string.reserve));
            textView.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
            return;
        }
        if (GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(str)) {
            textView.setVisibility(0);
            Resources resources2 = context.getResources();
            if (z10) {
                i10 = R.drawable.btn_divider_concept_2dp;
            }
            textView.setBackgroundDrawable(resources2.getDrawable(i10));
            textView.setText(context.getResources().getText(R.string.reserved));
            textView.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
            return;
        }
        if (!GameObj.FOLLOW_STATE_OWNED.equalsIgnoreCase(str)) {
            textView.setVisibility(8);
            return;
        }
        if (z11) {
            textView.setBackground(context.getResources().getDrawable(R.drawable.divider_color_concept_2dp));
            textView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
        } else {
            Resources resources3 = context.getResources();
            if (z10) {
                i10 = R.drawable.btn_text_hint_2dp;
            }
            textView.setBackgroundDrawable(resources3.getDrawable(i10));
            textView.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
        }
        textView.setVisibility(0);
        textView.setText(context.getResources().getText(R.string.own));
    }

    public static void o(@androidx.annotation.n0 com.max.hbcommon.base.adapter.s.e eVar, @androidx.annotation.n0 Context context, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, context, gameObj}, null, changeQuickRedirect, true, 34627, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Context.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if ("following".equalsIgnoreCase(gameObj.getFollow_state())) {
            gameObj.setFollow_state("unfollowing");
            gameObj.setFollow_num(String.valueOf(Math.max(0, ((int) com.max.hbutils.utils.n.p(gameObj.getFollow_num())) - 1)));
        } else {
            gameObj.setFollow_state("following");
            gameObj.setFollow_num(String.valueOf(((int) com.max.hbutils.utils.n.p(gameObj.getFollow_num())) + 1));
        }
        p1(eVar, context, gameObj.getFollow_state(), (int) com.max.hbutils.utils.n.p(gameObj.getFollow_num()));
    }

    public static String o0(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34715, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1808629708:
                b10 = !str.equals(GameObj.PLATFORM_HARDWARE) ? (byte) -1 : (byte) 0;
                break;
            case -889473228:
                if (!str.equals("switch")) {
                    b10 = -1;
                }
                break;
            case 3063128:
                b10 = !str.equals("csgo") ? (byte) -1 : (byte) 2;
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 3;
                break;
            case 95773434:
                b10 = !str.equals("dota2") ? (byte) -1 : (byte) 4;
                break;
            case 538159775:
                b10 = !str.equals(GameObj.PLATFORM_XBOX) ? (byte) -1 : (byte) 5;
                break;
            case 1251955023:
                b10 = !str.equals(GameObj.PLATFORM_PS) ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return "pc";
            case 1:
                return "switch";
            case 2:
                return "csgo";
            case 3:
                return "epic";
            case 4:
                return "dota2";
            case 5:
                return "xbox";
            case 6:
                return "psn";
            default:
                return "steam";
        }
    }

    public static void o1(View view, HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{view, homeDataObj}, null, changeQuickRedirect, true, 34655, new Class[]{View.class, HomeDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_avatar);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_bg);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_nickname);
        view.getContext();
        EpicAccountInfo epic_account_info = homeDataObj.getEpic_account_info();
        if (epic_account_info == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (!com.max.hbcommon.utils.c.u(epic_account_info.getBackground_url())) {
            com.max.hbimage.b.L(epic_account_info.getBackground_url(), imageView, R.drawable.game_epic_entry_367_126);
        }
        b2(textView, epic_account_info.getNickname(), epic_account_info.getHead_color());
        textView2.setText(epic_account_info.getNickname());
        PlatformDataView[] platformDataViewArr = {(PlatformDataView) view.findViewById(R.id.pdv0), (PlatformDataView) view.findViewById(R.id.pdv1), (PlatformDataView) view.findViewById(R.id.pdv2)};
        if (epic_account_info.getStats() == null || epic_account_info.getStats().size() < 3) {
            return;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            platformDataViewArr[i10].setDesc(epic_account_info.getStats().get(i10).getKey());
            platformDataViewArr[i10].setValue(epic_account_info.getStats().get(i10).getValue());
        }
    }

    public static String p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34620, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iP = str != null ? (int) com.max.hbutils.utils.n.p(str) : 0;
        return iP >= 10000 ? String.format(Locale.CHINA, "%.1f", Float.valueOf(iP / 10000.0f)) : str;
    }

    public static ArrayList<String> p0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 34723, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : GameObj.ALL_PLATFORMS) {
            str.hashCode();
            switch (str) {
                case "switch":
                    arrayList.add("switch");
                    break;
                case "platform_steam":
                    arrayList.add("steam");
                    break;
                case "csgo":
                    arrayList.add("csgo");
                    break;
                case "epic":
                    arrayList.add("epic");
                    break;
                case "dota2":
                    arrayList.add("dota2");
                    break;
                case "platform_xbox":
                    arrayList.add("xbox");
                    break;
                case "platform_ps":
                    arrayList.add("psn");
                    break;
            }
        }
        return arrayList;
    }

    public static void p1(@androidx.annotation.n0 com.max.hbcommon.base.adapter.s.e eVar, @androidx.annotation.n0 Context context, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{eVar, context, str, new Integer(i10)}, null, changeQuickRedirect, true, 34628, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Context.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_follow_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_follow_num);
        TextView textView2 = (TextView) eVar.i(R.id.tv_follow_num_unit);
        if ("following".equalsIgnoreCase(str)) {
            int iE = com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color);
            imageView.setColorFilter(iE);
            textView.setTextColor(iE);
            textView2.setTextColor(iE);
        } else {
            imageView.setColorFilter(context.getColor(R.color.text_secondary_2_color));
            int iE2 = com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color);
            textView.setTextColor(iE2);
            textView2.setTextColor(iE2);
        }
        textView.setText(p(String.valueOf(Math.max(i10, 0))));
        if (i10 >= 10000) {
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }

    public static double q(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34602, new Class[]{String.class}, Double.TYPE);
        return patchProxyResultProxy.isSupported ? ((Double) patchProxyResultProxy.result).doubleValue() : com.max.hbutils.utils.n.r(str) / 1000.0d;
    }

    public static String q0(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34716, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -889473228:
                b10 = !str.equals("switch") ? (byte) -1 : (byte) 0;
                break;
            case 111307:
                if (!str.equals("psn")) {
                    b10 = -1;
                }
                break;
            case 3063128:
                b10 = !str.equals("csgo") ? (byte) -1 : (byte) 2;
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 3;
                break;
            case 3672659:
                b10 = !str.equals("xbox") ? (byte) -1 : (byte) 4;
                break;
            case 95773434:
                b10 = !str.equals("dota2") ? (byte) -1 : (byte) 5;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return "switch";
            case 1:
                return GameObj.PLATFORM_PS;
            case 2:
                return GameObj.PLATFORM_CSGO_NAME;
            case 3:
                return "epic";
            case 4:
                return GameObj.PLATFORM_XBOX;
            case 5:
                return GameObj.PLATFORM_DOTA2_NAME;
            default:
                return GameObj.PLATFORM_STEAM;
        }
    }

    public static void q1(ViewGroup viewGroup, List<PlayerRankObj> list, String str) {
        if (PatchProxy.proxy(new Object[]{viewGroup, list, str}, null, changeQuickRedirect, true, 34702, new Class[]{ViewGroup.class, List.class, String.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ll_friends);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_no_friends_tips);
        if (viewGroup2 == null || textView == null) {
            return;
        }
        viewGroup2.removeAllViews();
        if (com.max.hbcommon.utils.c.w(list)) {
            viewGroup2.setVisibility(8);
            textView.setVisibility(0);
        } else {
            viewGroup2.setVisibility(0);
            textView.setVisibility(8);
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        int iMin = Math.min(list.size(), (ViewUtils.L(context) - ViewUtils.f(context, 48.0f)) / ViewUtils.f(context, 26.0f));
        for (int i10 = 0; i10 < iMin; i10++) {
            View viewInflate = layoutInflater.inflate(R.layout.item_steam_card_friend, viewGroup2, false);
            ViewGroup viewGroup3 = (ViewGroup) viewInflate.findViewById(R.id.vg_icon);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
            int iO = ViewUtils.o(context, viewGroup3);
            viewGroup3.setBackgroundDrawable(com.max.hbutils.utils.q.v(context, com.max.xiaoheihe.module.account.utils.l.p(list.get(i10).getPersonastate(), list.get(i10).getGameid()), ViewUtils.h0(context, iO) - 1));
            com.max.hbimage.b.e0(list.get(i10).getAvatar(), imageView, iO - ViewUtils.f(context, 1.0f), R.drawable.common_default_game_avatar_74x74);
            viewInflate.setOnClickListener(new a0(list.get(i10).getProtocol(), context, list.get(i10).getHeybox_info() != null ? list.get(i10).getHeybox_info().getUserid() : null, list.get(i10).getSteamid()));
            viewGroup2.addView(viewInflate);
        }
        View viewY = Y(context);
        int iF = ViewUtils.f(context, 20.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.leftMargin = ViewUtils.f(context, 3.0f);
        viewGroup2.addView(viewY, layoutParams);
        viewGroup.setOnClickListener(new b0(context, str));
    }

    public static String r(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34617, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iP = str != null ? (int) com.max.hbutils.utils.n.p(str) : 0;
        return iP >= 10000 ? String.format(Locale.CHINA, "%.1f万人评分", Float.valueOf(iP / 10000.0f)) : String.format(Locale.CHINA, "%d人评分", Integer.valueOf(iP));
    }

    public static String r0(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34726, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -889473228:
                b10 = !str.equals("switch") ? (byte) -1 : (byte) 0;
                break;
            case 111307:
                if (!str.equals("psn")) {
                    b10 = -1;
                }
                break;
            case 3063128:
                b10 = !str.equals("csgo") ? (byte) -1 : (byte) 2;
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 3;
                break;
            case 3672659:
                b10 = !str.equals("xbox") ? (byte) -1 : (byte) 4;
                break;
            case 95773434:
                b10 = !str.equals("dota2") ? (byte) -1 : (byte) 5;
                break;
            case 109760848:
                b10 = !str.equals("steam") ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return GameObj.PLATFORM_SWITCH_NAME;
            case 1:
                return GameObj.PLATFORM_PS_NAME;
            case 2:
                return GameObj.PLATFORM_CSGO_NAME;
            case 3:
                return GameObj.PLATFORM_EPIC_NAME;
            case 4:
                return GameObj.PLATFORM_XBOX_NAME;
            case 5:
                return GameObj.PLATFORM_DOTA2_NAME;
            case 6:
                return GameObj.PLATFORM_STEAM_NAME;
            default:
                return null;
        }
    }

    public static void r1(final com.max.hbcommon.base.adapter.s.e eVar, final GameObj gameObj, String str) {
        int i10;
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, str}, null, changeQuickRedirect, true, 34626, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, String.class}, Void.TYPE).isSupported || eVar == null || gameObj == null) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        final Context context = imageView.getContext();
        com.max.hbimage.b.L(gameObj.getImage(), imageView, R.drawable.common_default_placeholder_375x210);
        View viewI = eVar.i(R.id.vg_is_owned);
        char c10 = '\b';
        if ("1".equals(gameObj.getIs_owned())) {
            viewI.setVisibility(0);
        } else {
            viewI.setVisibility(8);
        }
        i1((TextView) eVar.i(R.id.tv_discount), gameObj.getHeybox_price(), null);
        LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.vg_name);
        linearLayout.removeAllViews();
        TextView textView = new TextView(context);
        int i11 = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(gameObj.getName());
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = (LinearLayout) eVar.i(R.id.ll_genres);
        if ("mobile".equals(gameObj.getGame_type())) {
            List<GamePlatformInfoObj> platform_infos = gameObj.getPlatform_infos();
            if (platform_infos != null && !platform_infos.isEmpty()) {
                for (int i12 = 0; i12 < platform_infos.size(); i12++) {
                    if ("iOS".equals(platform_infos.get(i12).getKey())) {
                        platform_infos.remove(i12);
                        break;
                    }
                }
            }
            A(eVar, gameObj);
            if (gameObj.getGenres_v2() == null || gameObj.getGenres_v2().isEmpty()) {
                linearLayout2.setVisibility(8);
            } else {
                List<KeyDescObj> genres_v2 = gameObj.getGenres_v2();
                if (genres_v2.size() > 3) {
                    genres_v2 = genres_v2.subList(0, 3);
                }
                linearLayout2.setVisibility(0);
                linearLayout2.removeAllViews();
                int i13 = 0;
                while (i13 < genres_v2.size()) {
                    String name = genres_v2.get(i13).getName();
                    TextView textView2 = new TextView(context);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i11, i11);
                    if (i13 == 0) {
                        layoutParams2.setMargins(0, 0, 0, 0);
                    } else {
                        layoutParams2.setMargins(ViewUtils.f(context, 4.0f), 0, 0, 0);
                    }
                    textView2.setLayoutParams(layoutParams2);
                    textView2.setPadding(ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f), ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f));
                    textView2.setBackground(ViewUtils.H(ViewUtils.f(context, 1.0f), context.getColor(R.color.divider_secondary_2_color), context.getColor(R.color.divider_secondary_2_color)));
                    textView2.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
                    textView2.setTextColor(context.getColor(R.color.text_primary_1_color));
                    textView2.setIncludeFontPadding(false);
                    textView2.setText(name);
                    linearLayout2.addView(textView2);
                    i13++;
                    c10 = '\b';
                    i11 = -2;
                }
            }
        } else {
            A(eVar, gameObj);
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = (LinearLayout) eVar.i(R.id.ll_platform_icon);
        List<String> platforms_icon = gameObj.getPlatforms_icon();
        if (platforms_icon == null || platforms_icon.isEmpty() || GameObj.KEY_POINT_DISCOUNT_LIST.equalsIgnoreCase(str)) {
            i10 = 8;
            linearLayout3.setVisibility(8);
        } else {
            linearLayout3.setVisibility(0);
            linearLayout3.removeAllViews();
            Iterator<String> it = platforms_icon.iterator();
            while (it.hasNext()) {
                ImageView imageViewN0 = n0(context, it.next(), ViewUtils.f(context, 14.0f));
                if (imageViewN0 != null) {
                    linearLayout3.addView(imageViewN0);
                }
            }
            i10 = 8;
        }
        TextView textView3 = (TextView) eVar.i(R.id.tv_peak_user_num);
        textView3.setVisibility(i10);
        if (GameObj.KEY_POINT_PEAK_USER_NUM.equalsIgnoreCase(str) && !TextUtils.isEmpty(gameObj.getOnline_player())) {
            String online_player = gameObj.getOnline_player();
            SpannableString spannableString = new SpannableString(context.getResources().getString(R.string.current_online) + "  " + online_player);
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.text_primary_1_color)), spannableString.length() - online_player.length(), spannableString.length(), 33);
            spannableString.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.text_size_13)), spannableString.length() - online_player.length(), spannableString.length(), 33);
            spannableString.setSpan(new StyleSpan(1), spannableString.length() - online_player.length(), spannableString.length(), 33);
            textView3.setText(spannableString);
            textView3.setVisibility(0);
            return;
        }
        TextView textView4 = (TextView) eVar.i(R.id.tv_release_date);
        textView4.setVisibility(8);
        if ("release_date".equalsIgnoreCase(str) && !TextUtils.isEmpty(gameObj.getRelease_date())) {
            textView4.setText(gameObj.getRelease_date());
            textView4.setVisibility(0);
            return;
        }
        ((LinearLayout) eVar.i(R.id.vg_score)).setVisibility(8);
        TextView textView5 = (TextView) eVar.i(R.id.tv_follow_state);
        textView5.setVisibility(8);
        if (GameObj.KEY_POINT_FOLLOW_STATE.equalsIgnoreCase(str) && !com.max.hbcommon.utils.c.u(gameObj.getDownload_url_android())) {
            textView5.setVisibility(0);
            P1(eVar, gameObj.getScore_desc(), gameObj.getScore());
            textView5.setBackground(ViewUtils.x(ViewUtils.f(context, 2.0f), context.getColor(R.color.text_primary_1_color), context.getColor(R.color.text_primary_1_color)));
            textView5.setText(context.getResources().getText(R.string.download));
            textView5.setTextColor(context.getColor(R.color.background_layer_2_color));
            return;
        }
        LinearLayout linearLayout4 = (LinearLayout) eVar.i(R.id.vg_follow_num);
        linearLayout4.setVisibility(8);
        if (!GameObj.KEY_POINT_FOLLOW_STATE.equalsIgnoreCase(str) || TextUtils.isEmpty(gameObj.getFollow_state())) {
            P1(eVar, gameObj.getScore_desc(), gameObj.getScore());
            return;
        }
        P1(eVar, gameObj.getScore_desc(), gameObj.getScore());
        if (!"unfollowing".equalsIgnoreCase(gameObj.getFollow_state()) && !"following".equalsIgnoreCase(gameObj.getFollow_state())) {
            n2(textView5, gameObj.getFollow_state(), true, true);
            return;
        }
        linearLayout4.setVisibility(0);
        linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.c1(eVar, context, gameObj, view);
            }
        });
        linearLayout4.setBackground(com.max.hbutils.utils.q.o(context, R.color.background_layer_1_color_day_night, 2.0f));
        p1(eVar, context, gameObj.getFollow_state(), (int) com.max.hbutils.utils.n.p(gameObj.getFollow_num()));
    }

    public static RecommendGameListItemObj s(GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj}, null, changeQuickRedirect, true, 34631, new Class[]{GameObj.class}, RecommendGameListItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendGameListItemObj) patchProxyResultProxy.result;
        }
        RecommendGameListItemObj recommendGameListItemObj = new RecommendGameListItemObj();
        if (gameObj != null) {
            recommendGameListItemObj.setGame_name(gameObj.getName());
            recommendGameListItemObj.setGame_img(gameObj.getImage());
            recommendGameListItemObj.setHeybox_price(gameObj.getHeybox_price());
            recommendGameListItemObj.setPrice(gameObj.getPrice());
            recommendGameListItemObj.setIs_free(gameObj.isIs_free());
            recommendGameListItemObj.setAppid(gameObj.getAppid());
            recommendGameListItemObj.setIs_owned(gameObj.getIs_owned());
            recommendGameListItemObj.setRecommend_desc(gameObj.getRecommend_desc());
            recommendGameListItemObj.setHot_tags(gameObj.getHot_tags());
            recommendGameListItemObj.setLabel(gameObj.getLabel());
            recommendGameListItemObj.setH_src(gameObj.getH_src());
            recommendGameListItemObj.setHb_rich_texts(gameObj.getHb_rich_texts());
            recommendGameListItemObj.setRich_tags(gameObj.getRich_tags());
            recommendGameListItemObj.setPlatforms_icon(gameObj.getPlatforms_icon());
            recommendGameListItemObj.setRelease_timestamp(gameObj.getRelease_timestamp());
        }
        return recommendGameListItemObj;
    }

    public static RichViewGroup s0(Context context, RichAttributeModelObj richAttributeModelObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, richAttributeModelObj}, null, changeQuickRedirect, true, 34616, new Class[]{Context.class, RichAttributeModelObj.class}, RichViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (RichViewGroup) patchProxyResultProxy.result;
        }
        RichViewGroup richViewGroup = new RichViewGroup(context);
        richViewGroup.setRichText(richAttributeModelObj, true);
        return richViewGroup;
    }

    public static void s1(View view, String str, HomeDataObj homeDataObj, boolean z10) {
        View view2;
        if (PatchProxy.proxy(new Object[]{view, str, homeDataObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34650, new Class[]{View.class, String.class, HomeDataObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_game_data_card_bg);
        CardView cardView = (CardView) view.findViewById(R.id.vg_card);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_img0);
        TextView textView = (TextView) view.findViewById(R.id.tv_data0);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_desc0);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_img1);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_data1);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_desc1);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_img2);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_data2);
        TextView textView6 = (TextView) view.findViewById(R.id.tv_desc2);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vg_kv3);
        ImageView imageView5 = (ImageView) view.findViewById(R.id.iv_img3);
        TextView textView7 = (TextView) view.findViewById(R.id.tv_data3);
        TextView textView8 = (TextView) view.findViewById(R.id.tv_desc3);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_card_desc);
        ImageView imageView6 = (ImageView) view.findViewById(R.id.iv_game_data_card_role);
        int iN = ViewUtils.n(context, ViewUtils.L(context), ViewUtils.V(cardView), ViewUtils.ViewType.IMAGE);
        CommonAccountInfo commonAccountInfoA0 = a0(homeDataObj.getBind_game_infos(), str);
        if (commonAccountInfoA0 != null) {
            if (com.max.hbcommon.utils.c.u(commonAccountInfoA0.getBg_image())) {
                com.max.hbimage.b.a0(Integer.valueOf(R.drawable.game_data_card_bg_pubg), imageView, iN, 0, -1);
            } else {
                com.max.hbimage.b.N(commonAccountInfoA0.getBg_image(), imageView, iN, z10 ? 5 : 0, -1);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView6.getLayoutParams();
            layoutParams.rightMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(commonAccountInfoA0.getRight_image_gap()));
            layoutParams.width = ViewUtils.f(context, com.max.hbutils.utils.n.p(commonAccountInfoA0.getRight_image_width()));
            if (com.max.hbcommon.utils.c.u(commonAccountInfoA0.getImage())) {
                imageView6.setImageDrawable(null);
            } else {
                com.max.hbimage.b.K(commonAccountInfoA0.getImage(), imageView6);
            }
            textView.setText(commonAccountInfoA0.getValue1());
            c2(textView, commonAccountInfoA0.getIcon1(), commonAccountInfoA0.getValue1());
            textView2.setText(commonAccountInfoA0.getKey1());
            textView3.setText(commonAccountInfoA0.getValue2());
            c2(textView3, commonAccountInfoA0.getIcon2(), commonAccountInfoA0.getValue2());
            textView4.setText(commonAccountInfoA0.getKey2());
            textView5.setText(commonAccountInfoA0.getValue3());
            c2(textView5, commonAccountInfoA0.getIcon3(), commonAccountInfoA0.getValue3());
            textView6.setText(commonAccountInfoA0.getKey3());
            if (com.max.hbutils.utils.n.q(commonAccountInfoA0.getData_count()) == 4) {
                viewGroup.setVisibility(0);
                textView7.setText(commonAccountInfoA0.getValue4());
                c2(textView7, commonAccountInfoA0.getIcon4(), commonAccountInfoA0.getValue4());
                textView8.setText(commonAccountInfoA0.getKey4());
            } else {
                viewGroup.setVisibility(8);
            }
            if (com.max.hbcommon.utils.c.u(commonAccountInfoA0.getIcon1())) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int iF = ViewUtils.f(context, 15.0f);
                marginLayoutParams.height = iF;
                marginLayoutParams.width = iF;
                marginLayoutParams.rightMargin = ViewUtils.f(context, 1.0f);
                imageView2.setLayoutParams(marginLayoutParams);
                com.max.hbimage.b.K(commonAccountInfoA0.getIcon1(), imageView2);
            }
            if (com.max.hbcommon.utils.c.u(commonAccountInfoA0.getIcon2())) {
                imageView3.setVisibility(8);
            } else {
                imageView3.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView3.getLayoutParams();
                int iF2 = ViewUtils.f(context, 15.0f);
                marginLayoutParams2.height = iF2;
                marginLayoutParams2.width = iF2;
                marginLayoutParams2.rightMargin = ViewUtils.f(context, 1.0f);
                imageView3.setLayoutParams(marginLayoutParams2);
                com.max.hbimage.b.K(commonAccountInfoA0.getIcon2(), imageView3);
            }
            if (com.max.hbcommon.utils.c.u(commonAccountInfoA0.getIcon3())) {
                imageView4.setVisibility(8);
            } else {
                imageView4.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) imageView4.getLayoutParams();
                int iF3 = ViewUtils.f(context, 15.0f);
                marginLayoutParams3.height = iF3;
                marginLayoutParams3.width = iF3;
                marginLayoutParams3.rightMargin = ViewUtils.f(context, 1.0f);
                imageView4.setLayoutParams(marginLayoutParams3);
                com.max.hbimage.b.K(commonAccountInfoA0.getIcon3(), imageView4);
            }
            if (com.max.hbcommon.utils.c.u(commonAccountInfoA0.getIcon4())) {
                imageView5.setVisibility(8);
            } else {
                imageView5.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) imageView5.getLayoutParams();
                int iF4 = ViewUtils.f(context, 15.0f);
                marginLayoutParams4.height = iF4;
                marginLayoutParams4.width = iF4;
                marginLayoutParams4.rightMargin = ViewUtils.f(context, 1.0f);
                imageView5.setLayoutParams(marginLayoutParams4);
                com.max.hbimage.b.K(commonAccountInfoA0.getIcon4(), imageView5);
            }
            linearLayout.removeAllViews();
            TextView textViewC0 = c0(context);
            textViewC0.setText(commonAccountInfoA0.getNickname());
            linearLayout.addView(textViewC0);
            if (!com.max.hbcommon.utils.c.u(commonAccountInfoA0.getLogo_image())) {
                ImageView imageView7 = new ImageView(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 16;
                layoutParams2.setMargins(ViewUtils.f(context, 6.0f), 0, 0, 0);
                imageView7.setLayoutParams(layoutParams2);
                linearLayout.addView(imageView7);
                com.max.hbimage.b.Y(context, commonAccountInfoA0.getLogo_image(), new x0(layoutParams2, context, imageView7));
            }
            if (!com.max.hbcommon.utils.c.u(commonAccountInfoA0.getDesc())) {
                TextView textView9 = new TextView(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 16;
                layoutParams3.setMargins(ViewUtils.f(context, 4.0f), 0, ViewUtils.f(context, 100.0f), 0);
                textView9.setLayoutParams(layoutParams3);
                textView9.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
                textView9.setTextColor(com.max.xiaoheihe.utils.d.e1(commonAccountInfoA0.getDesc_color()));
                textView9.setText(commonAccountInfoA0.getDesc());
                linearLayout.addView(textView9);
            }
            view2 = view;
            view2.setOnClickListener(new a(context, commonAccountInfoA0));
        } else {
            view2 = view;
        }
        if (str == null || com.max.hbcommon.utils.c.w(homeDataObj.getGame_cards())) {
            return;
        }
        for (BindGameCardV2 bindGameCardV2 : homeDataObj.getGame_cards()) {
            if (bindGameCardV2 != null && str.equals(bindGameCardV2.getGame_type()) && !com.max.hbcommon.utils.c.u(bindGameCardV2.getProtocol())) {
                view2.setOnClickListener(new b(context, bindGameCardV2));
            }
        }
    }

    public static GameObj t(GameStoreItemObj gameStoreItemObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameStoreItemObj}, null, changeQuickRedirect, true, 34632, new Class[]{GameStoreItemObj.class}, GameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameObj) patchProxyResultProxy.result;
        }
        GameObj gameObj = new GameObj();
        gameObj.setAppid(gameStoreItemObj.getAppid());
        gameObj.setPlatforms(gameStoreItemObj.getPlatforms());
        gameObj.setName(gameStoreItemObj.getGame_name());
        gameObj.setImage(gameStoreItemObj.getGame_img());
        gameObj.setGame_type(gameStoreItemObj.getGame_type());
        gameObj.setHeybox_price(gameStoreItemObj.getHeybox_price());
        gameObj.setPrice(gameStoreItemObj.getPrice());
        gameObj.setAppid(gameStoreItemObj.getAppid());
        gameObj.setIs_owned(gameStoreItemObj.getIs_owned());
        gameObj.setPlatforms_url(gameStoreItemObj.getPlatforms_url());
        gameObj.setH_src(gameStoreItemObj.getH_src());
        return gameObj;
    }

    public static int t0(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 34612, new Class[]{Context.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        float fP = com.max.hbutils.utils.n.p(str);
        if (fP >= 9.0f) {
            return context.getResources().getColor(R.color.orange_end);
        }
        if (fP >= 7.0f) {
            return context.getResources().getColor(R.color.purple_end);
        }
        return fP >= 5.0f ? context.getResources().getColor(R.color.blue_end) : context.getResources().getColor(R.color.green_end);
    }

    public static void t1(com.max.hbcommon.base.adapter.s.e eVar, GameDeveloperObj gameDeveloperObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameDeveloperObj}, null, changeQuickRedirect, true, 34646, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameDeveloperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        TextView textView3 = (TextView) eVar.i(R.id.tv_game_desc);
        com.max.hbimage.b.K(gameDeveloperObj.getImg_url(), imageView);
        textView.setText(gameDeveloperObj.getName());
        textView2.setText(gameDeveloperObj.getDesc());
        textView3.setText(gameDeveloperObj.getGame_desc());
    }

    public static GameObj u(GameStoreOrderObj gameStoreOrderObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameStoreOrderObj}, null, changeQuickRedirect, true, 34633, new Class[]{GameStoreOrderObj.class}, GameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameObj) patchProxyResultProxy.result;
        }
        GameObj gameObj = new GameObj();
        gameObj.setAppid(gameStoreOrderObj.getAppid());
        gameObj.setName(gameStoreOrderObj.getGame_name());
        gameObj.setImage(gameStoreOrderObj.getGame_img());
        gameObj.setHeybox_price(gameStoreOrderObj.getHeybox_price());
        gameObj.setAppid(gameStoreOrderObj.getAppid());
        return gameObj;
    }

    public static int u0(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 34611, new Class[]{Context.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        float fP = com.max.hbutils.utils.n.p(str);
        if (fP >= 9.0f) {
            return context.getResources().getColor(R.color.orange_start);
        }
        if (fP >= 7.0f) {
            return context.getResources().getColor(R.color.purple_start);
        }
        return fP >= 5.0f ? context.getResources().getColor(R.color.blue_start) : context.getResources().getColor(R.color.green_start);
    }

    public static void u1(com.max.hbcommon.base.adapter.s.e eVar, View.OnClickListener onClickListener, GameObj gameObj, String str, boolean z10) {
        int i10;
        if (PatchProxy.proxy(new Object[]{eVar, onClickListener, gameObj, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34638, new Class[]{com.max.hbcommon.base.adapter.s.e.class, View.OnClickListener.class, GameObj.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        Context context = viewB.getContext();
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.ll_platform_icon);
        CardView cardView = (CardView) eVar.i(R.id.cv_img);
        if (cardView != null) {
            cardView.setRadius(ViewUtils.f(context, 4.0f));
        }
        View viewI = eVar.i(R.id.vg_is_owned);
        TextView textView = (TextView) eVar.i(R.id.tv_discount);
        TextView textView2 = (TextView) eVar.i(R.id.tv_tag_ad);
        TextView textView3 = (TextView) eVar.i(R.id.tv_name);
        LinearLayout linearLayout2 = (LinearLayout) eVar.i(R.id.ll_htag);
        CustomHorizontalScrollView customHorizontalScrollView = (CustomHorizontalScrollView) eVar.i(R.id.hsv_tags);
        FlexboxLayout flexboxLayout = (FlexboxLayout) eVar.i(R.id.fl_tags);
        View viewI2 = eVar.i(R.id.vg_score);
        GamePriceView gamePriceView = (GamePriceView) eVar.i(R.id.gpv);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_owned);
        TextView textView4 = (TextView) eVar.i(R.id.tv_owned);
        com.max.hbimage.b.L(gameObj.getImage(), imageView, R.drawable.common_default_placeholder_375x210);
        if (flexboxLayout != null) {
            i1(textView, gameObj.getHeybox_price(), null);
        } else {
            gamePriceView.x(gameObj.getHeybox_price());
        }
        B1(linearLayout, gameObj);
        if (viewI != null) {
            if (GameObj.KEY_POINT_DISCOUNT_LIST.equalsIgnoreCase(str)) {
                GamePriceObj price = !com.max.hbcommon.utils.c.w(gameObj.getPlatform_infos()) ? gameObj.getPlatform_infos().get(0).getPrice() : gameObj.getPrice();
                if (price == null || com.max.hbcommon.utils.c.u(price.getDeadline_timestamp())) {
                    viewI.setVisibility(8);
                } else {
                    viewI.setVisibility(0);
                    String[] strArrR = com.max.hbutils.utils.w.r(context, com.max.hbutils.utils.n.r(price.getDeadline_timestamp()));
                    if (com.max.hbcommon.utils.c.u(strArrR[0]) || com.max.hbcommon.utils.c.u(strArrR[1])) {
                        imageView2.setVisibility(8);
                        textView4.setText("已过期");
                    } else {
                        imageView2.setImageResource(R.drawable.common_clock_21x21);
                        imageView2.setVisibility(0);
                        textView4.setText("剩" + strArrR[0] + strArrR[1]);
                    }
                }
            } else if ("1".equals(gameObj.getIs_owned())) {
                viewI.setVisibility(0);
                imageView2.setImageResource(R.drawable.ic_more_white_small);
                textView4.setText(R.string.own);
            } else {
                viewI.setVisibility(8);
            }
        }
        if ("recommend".equals(str)) {
            textView3.setText(gameObj.getName());
            i10 = 0;
            B(eVar, gameObj, false, z10);
        } else {
            i10 = 0;
            textView3.setText(gameObj.getName());
            if (viewI2 != null) {
                viewI2.setVisibility(8);
            }
            if (GameObj.KEY_POINT_PEAK_USER_NUM.equalsIgnoreCase(str) || GameObj.KEY_POINT_PEAK_MAX.equalsIgnoreCase(str) || "release_date".equalsIgnoreCase(str) || "discount".equalsIgnoreCase(str) || GameObj.KEY_POINT_PEAK_CHANGE.equalsIgnoreCase(str)) {
                B(eVar, gameObj, false, z10);
            } else {
                P1(eVar, gameObj.getScore_desc(), gameObj.getScore());
                if (viewI2 != null) {
                    viewI2.setVisibility(0);
                }
            }
        }
        x1(customHorizontalScrollView, flexboxLayout, linearLayout2, gameObj, Boolean.valueOf(z10));
        if (textView2 != null) {
            if ("advertise".equals(gameObj.getLabel())) {
                textView2.setVisibility(i10);
                textView2.setText(R.string.advertisement);
            } else {
                textView2.setVisibility(8);
            }
        }
        d2(viewB, gameObj, onClickListener);
    }

    public static GameObj v(MobileGameDetailsObj mobileGameDetailsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mobileGameDetailsObj}, null, changeQuickRedirect, true, 34634, new Class[]{MobileGameDetailsObj.class}, GameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameObj) patchProxyResultProxy.result;
        }
        GameObj gameObj = new GameObj();
        gameObj.setAppid(mobileGameDetailsObj.getAppid());
        gameObj.setAppicon(mobileGameDetailsObj.getAppicon());
        gameObj.setPlatforms(mobileGameDetailsObj.getPlatforms());
        gameObj.setName(mobileGameDetailsObj.getName());
        gameObj.setImage(mobileGameDetailsObj.getImage());
        gameObj.setGame_type("mobile");
        gameObj.setPrice(mobileGameDetailsObj.getPrice());
        gameObj.setPlatforms_url(mobileGameDetailsObj.getPlatforms_url());
        gameObj.setVersion_code(mobileGameDetailsObj.getVersion_code());
        gameObj.setVersion_num(mobileGameDetailsObj.getVersion_num());
        gameObj.setBundle_size(mobileGameDetailsObj.getBundle_size());
        gameObj.setBundle_id(mobileGameDetailsObj.getBundle_id());
        gameObj.setDownload_url_android(mobileGameDetailsObj.getDownload_url_android());
        gameObj.setLast_release_time(mobileGameDetailsObj.getLast_release_time());
        return gameObj;
    }

    public static View v0(Context context, KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, keyDescObj}, null, changeQuickRedirect, true, 34643, new Class[]{Context.class, KeyDescObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (keyDescObj == null) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, ViewUtils.f(context, 14.0f)));
        int iF = ViewUtils.f(context, 3.0f);
        textView.setPadding(iF, 0, iF, 0);
        textView.setText(keyDescObj.getDesc());
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
        textView.setTextSize(ViewUtils.g(context, 8.0f));
        textView.setBackgroundResource(R.drawable.divider_color_concept_1dp);
        textView.setGravity(17);
        return textView;
    }

    public static void v1(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34637, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        u1(eVar, null, gameObj, str, z10);
    }

    public static GameObj w(RecommendGameListItemObj recommendGameListItemObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendGameListItemObj}, null, changeQuickRedirect, true, 34630, new Class[]{RecommendGameListItemObj.class}, GameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameObj) patchProxyResultProxy.result;
        }
        GameObj gameObj = new GameObj();
        if (recommendGameListItemObj != null) {
            gameObj.setName(recommendGameListItemObj.getGame_name());
            gameObj.setImage(recommendGameListItemObj.getGame_img());
            gameObj.setHeybox_price(recommendGameListItemObj.getHeybox_price());
            gameObj.setPrice(recommendGameListItemObj.getPrice());
            gameObj.setIs_free(recommendGameListItemObj.isIs_free());
            gameObj.setAppid(recommendGameListItemObj.getAppid());
            gameObj.setIs_owned(recommendGameListItemObj.getIs_owned());
            gameObj.setRecommend_desc(recommendGameListItemObj.getRecommend_desc());
            gameObj.setHot_tags(recommendGameListItemObj.getHot_tags());
            gameObj.setLabel(recommendGameListItemObj.getLabel());
            gameObj.setH_src(recommendGameListItemObj.getH_src());
            gameObj.setHb_rich_texts(recommendGameListItemObj.getHb_rich_texts());
            gameObj.setRich_tags(recommendGameListItemObj.getRich_tags());
            gameObj.setPlatforms_icon(recommendGameListItemObj.getPlatforms_icon());
            gameObj.setRelease_timestamp(recommendGameListItemObj.getRelease_timestamp());
        }
        return gameObj;
    }

    public static int w0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 34729, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.w(GameObj.ALL_PLATFORMS)) {
            return -1;
        }
        for (int i10 = 0; i10 < GameObj.ALL_PLATFORMS.size(); i10++) {
            if (GameObj.PLATFORM_STEAM.equals(GameObj.ALL_PLATFORMS.get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public static void w1(com.max.hbcommon.base.adapter.s.e eVar, GameStoreItemObj gameStoreItemObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameStoreItemObj}, null, changeQuickRedirect, true, 34629, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameStoreItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.vg_name);
        View viewI = eVar.i(R.id.vg_is_owned);
        TextView textView = (TextView) eVar.i(R.id.tv_discount);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_heybox_price);
        TextView textView2 = (TextView) eVar.i(R.id.tv_rmb_signal);
        TextView textView3 = (TextView) eVar.i(R.id.tv_heybox_price);
        Context context = imageView.getContext();
        com.max.hbimage.b.L(gameStoreItemObj.getGame_img(), imageView, R.drawable.common_default_placeholder_375x210);
        if ("1".equals(gameStoreItemObj.getIs_owned())) {
            viewI.setVisibility(0);
        } else {
            viewI.setVisibility(8);
        }
        i1(textView, gameStoreItemObj.getHeybox_price(), null);
        textView.setBackgroundColor(context.getResources().getColor(R.color.red_alpha70));
        linearLayout.removeAllViews();
        TextView textView4 = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        textView4.setLayoutParams(layoutParams);
        textView4.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
        textView4.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
        textView4.setSingleLine(true);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setText(gameStoreItemObj.getGame_name());
        linearLayout.addView(textView4);
        B(eVar, t(gameStoreItemObj), true, true);
        imageView2.setVisibility(0);
        textView2.setVisibility(0);
        bb.d.d(textView3, 2);
        textView3.setText(gameStoreItemObj.getHeybox_price() != null ? G(gameStoreItemObj.getHeybox_price().getCost_coin()) : null);
    }

    public static BBSLinkObj x(RecommendGameListItemObj recommendGameListItemObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendGameListItemObj}, null, changeQuickRedirect, true, 34635, new Class[]{RecommendGameListItemObj.class}, BBSLinkObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkObj) patchProxyResultProxy.result;
        }
        BBSLinkObj bBSLinkObj = new BBSLinkObj();
        bBSLinkObj.setTitle(recommendGameListItemObj.getTitle());
        bBSLinkObj.setDescription(recommendGameListItemObj.getDescription());
        bBSLinkObj.setImgs(recommendGameListItemObj.getImgs());
        bBSLinkObj.setLinkid(recommendGameListItemObj.getLinkid());
        bBSLinkObj.setLink_tag(recommendGameListItemObj.getLink_tag());
        bBSLinkObj.setCreate_at(recommendGameListItemObj.getCreate_at());
        bBSLinkObj.setUser(recommendGameListItemObj.getUser());
        bBSLinkObj.setMaxjia(recommendGameListItemObj.getMaxjia());
        bBSLinkObj.setContent_type(recommendGameListItemObj.getContent_type());
        bBSLinkObj.setVideo_info(recommendGameListItemObj.getVideo_info());
        bBSLinkObj.setVideo_thumb(recommendGameListItemObj.getVideo_thumb());
        bBSLinkObj.setVideo_url(recommendGameListItemObj.getVideo_url());
        bBSLinkObj.setShare_url(recommendGameListItemObj.getShare_url());
        bBSLinkObj.setHas_video(recommendGameListItemObj.getHas_video());
        bBSLinkObj.setH_src(recommendGameListItemObj.getH_src());
        return bBSLinkObj;
    }

    public static String x0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 34670, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strO = com.max.hbcache.c.o("user_bind_phone", "" + com.max.xiaoheihe.utils.i0.o().getPhonenum());
        return strO.length() > 3 ? strO.substring(3) : strO;
    }

    public static void x1(CustomHorizontalScrollView customHorizontalScrollView, FlexboxLayout flexboxLayout, LinearLayout linearLayout, GameObj gameObj, Boolean bool) {
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{customHorizontalScrollView, flexboxLayout, linearLayout, gameObj, bool}, null, changeQuickRedirect, true, 34642, new Class[]{CustomHorizontalScrollView.class, FlexboxLayout.class, LinearLayout.class, GameObj.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        if (customHorizontalScrollView == null && flexboxLayout == null) {
            return;
        }
        Context context = customHorizontalScrollView != null ? customHorizontalScrollView.getContext() : flexboxLayout.getContext();
        ArrayList arrayList = new ArrayList();
        if (gameObj.getHeybox_price() != null && gameObj.getHeybox_price().getCoupon_info() != null && flexboxLayout != null) {
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setType(GameObj.TAG_TYPE_COUPON);
            keyDescObj2.setDesc(gameObj.getHeybox_price().getCoupon_info().getCoupon_desc());
            arrayList.add(keyDescObj2);
        }
        if (linearLayout != null) {
            KeyDescObj keyDescObj3 = null;
            if (gameObj.getHeybox_price() == null || gameObj.getHeybox_price().getCoupon_info() == null) {
                keyDescObj = null;
            } else {
                keyDescObj = new KeyDescObj();
                keyDescObj.setDesc(gameObj.getHeybox_price().getCoupon_info().getCoupon_desc());
            }
            if (gameObj.getHeybox_price() != null && gameObj.getHeybox_price().getRebate_desc() != null) {
                keyDescObj3 = new KeyDescObj();
                keyDescObj3.setDesc(gameObj.getHeybox_price().getRebate_desc());
            }
            y1(context, linearLayout, keyDescObj, keyDescObj3);
        }
        if (!com.max.hbcommon.utils.c.u(gameObj.getRecommend_desc())) {
            KeyDescObj keyDescObj4 = new KeyDescObj();
            keyDescObj4.setType("rec");
            keyDescObj4.setDesc(gameObj.getRecommend_desc());
            arrayList.add(keyDescObj4);
        }
        if (gameObj.getHot_tags() != null) {
            arrayList.addAll(gameObj.getHot_tags());
        }
        if (customHorizontalScrollView != null) {
            A1(customHorizontalScrollView, arrayList, true, bool.booleanValue());
        } else {
            z1(flexboxLayout, arrayList, true, bool.booleanValue());
        }
    }

    public static String y(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34618, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iP = str != null ? (int) com.max.hbutils.utils.n.p(str) : 0;
        return iP >= 10000 ? String.format(Locale.CHINA, "%.1f", Float.valueOf(iP / 10000.0f)) : String.format(Locale.CHINA, TimeModel.f55754j, Integer.valueOf(iP));
    }

    public static String y0(MobileGameDetailsObj mobileGameDetailsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mobileGameDetailsObj}, null, changeQuickRedirect, true, 34671, new Class[]{MobileGameDetailsObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (mobileGameDetailsObj == null || mobileGameDetailsObj.getSubscribe_info() == null) {
            com.max.hbcommon.utils.d.b("cqtest", "null gamedetail");
            return "";
        }
        com.max.hbcommon.utils.d.b("cqtest", "phone: " + mobileGameDetailsObj.getSubscribe_info().getSub_default());
        return mobileGameDetailsObj.getSubscribe_info().getSub_default() == null ? "" : mobileGameDetailsObj.getSubscribe_info().getSub_default();
    }

    public static void y1(Context context, LinearLayout linearLayout, KeyDescObj keyDescObj, KeyDescObj keyDescObj2) {
        if (PatchProxy.proxy(new Object[]{context, linearLayout, keyDescObj, keyDescObj2}, null, changeQuickRedirect, true, 34669, new Class[]{Context.class, LinearLayout.class, KeyDescObj.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        linearLayout.removeAllViews();
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 10.0f);
        com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
        int i10 = com.max.hbresource.a.f71895c;
        textView.setTypeface(aVar.a(i10));
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setPadding(ViewUtils.f(context, 4.0f), ViewUtils.f(context, 1.0f), ViewUtils.f(context, 4.0f), ViewUtils.f(context, 1.0f));
        textView.setBackgroundResource(R.color.gold_light);
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 10.0f);
        textView2.setTypeface(aVar.a(i10));
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView2.setPadding(ViewUtils.f(context, 4.0f), ViewUtils.f(context, 1.0f), ViewUtils.f(context, 4.0f), ViewUtils.f(context, 1.0f));
        textView2.setBackgroundResource(R.color.delete_red);
        if (keyDescObj != null && keyDescObj2 != null) {
            textView.setText("券");
            textView2.setText("返");
            linearLayout.addView(textView);
            linearLayout.addView(textView2);
            return;
        }
        if (keyDescObj != null) {
            textView.setText(keyDescObj.getDesc());
            linearLayout.addView(textView);
        } else if (keyDescObj2 != null) {
            textView2.setText(keyDescObj2.getDesc());
            linearLayout.addView(textView2);
        }
    }

    public static String z(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 34619, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iP = str != null ? (int) com.max.hbutils.utils.n.p(str) : 0;
        return iP >= 10000 ? String.format(Locale.CHINA, "%.1f万人想玩", Float.valueOf(iP / 10000.0f)) : String.format(Locale.CHINA, "%d人想玩", Integer.valueOf(iP));
    }

    public static View z0(final Context context, ViewGroup viewGroup, final String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, str}, null, changeQuickRedirect, true, 34696, new Class[]{Context.class, ViewGroup.class, String.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_bind_card_csgo_v2, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_bind_btn);
        viewFindViewById.setBackground(com.max.hbutils.utils.q.o(context, R.color.game_pubg_color_variant_1, ViewUtils.h0(context, M(context))));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.R0(context, str, view);
            }
        });
        return viewInflate;
    }

    public static void z1(FlexboxLayout flexboxLayout, List<KeyDescObj> list, boolean z10, boolean z11) {
        int i10;
        View view;
        boolean z12;
        int i11;
        View view2;
        View view3;
        List<KeyDescObj> list2 = list;
        int i12 = 0;
        boolean z13 = true;
        Object[] objArr = {flexboxLayout, list2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34613, new Class[]{FlexboxLayout.class, List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = flexboxLayout.getContext();
        if (list2 == null || list.size() <= 0) {
            flexboxLayout.setVisibility(8);
            return;
        }
        flexboxLayout.setVisibility(0);
        flexboxLayout.removeAllViews();
        int iF = ViewUtils.f(context, 6.0f);
        int iF2 = ViewUtils.f(context, 5.0f);
        LinkedList linkedList = new LinkedList();
        int color = z10 ? context.getResources().getColor(z11 ? R.color.text_primary_1_color : R.color.background_layer_2_color) : context.getResources().getColor(z11 ? R.color.text_secondary_1_color : R.color.desc_color);
        int i13 = 0;
        for (int i14 = 2; i13 < list.size() && i13 <= i14; i14 = 2) {
            String desc = list2.get(i13).getDesc();
            String type = list2.get(i13).getType();
            int iF3 = ViewUtils.f(context, 16.0f);
            if (com.max.hbcommon.utils.c.u(desc)) {
                i11 = i12;
                z12 = z13;
            } else {
                TextView textView = new TextView(context);
                if (z10) {
                    textView.setPadding(ViewUtils.f(context, 4.0f), ViewUtils.f(context, 1.0f), ViewUtils.f(context, 4.0f), ViewUtils.f(context, 1.0f));
                    i10 = 0;
                } else {
                    i10 = i12;
                    textView.setPadding(i10, i10, i10, i10);
                }
                textView.setTextSize(i10, context.getResources().getDimensionPixelSize(z10 ? R.dimen.text_size_10 : R.dimen.text_size_12));
                textView.setTextColor(GameObj.TAG_TYPE_COUPON.equals(type) ? context.getResources().getColor(R.color.gold_light) : color);
                if (z10) {
                    int iH0 = ViewUtils.h0(context, ViewUtils.m(context, ViewUtils.W(textView), iF3));
                    textView.setBackground(GameObj.TAG_TYPE_COUPON.equals(type) ? com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(context, R.color.gold_light_alpha8, iH0), context, R.color.gold_light, 0.5f) : com.max.hbutils.utils.q.o(context, R.color.divider_secondary_1_color, iH0));
                    view = null;
                } else {
                    view = null;
                    textView.setBackground(null);
                }
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                z12 = true;
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMinHeight(iF3);
                textView.setGravity(17);
                textView.setText(desc);
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                if (z10) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i13 == 0 ? 0 : iF;
                    i11 = 0;
                } else {
                    i11 = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
                }
                textView.setLayoutParams(layoutParams);
                if (z10 || i13 == 0) {
                    view2 = view;
                } else {
                    view3 = new View(context);
                    FlexboxLayout.LayoutParams layoutParams2 = new FlexboxLayout.LayoutParams(ViewUtils.f(context, 0.5f), ViewUtils.f(context, 9.0f));
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = iF2;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = iF2;
                    view3.setLayoutParams(layoutParams2);
                    view3.setBackgroundColor(color);
                }
                if (view2 != null) {
                    view2 = view3;
                    linkedList.add(view2);
                }
                view2 = view3;
                linkedList.add(textView);
            }
            i13++;
            list2 = list;
            z13 = z12;
            i12 = i11;
        }
        flexboxLayout.post(new k(flexboxLayout, linkedList, z10, iF));
    }
}
