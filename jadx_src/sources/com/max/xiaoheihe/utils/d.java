package com.max.xiaoheihe.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.l2;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.bpea.entry.common.DataType;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.framework.common.ContainerUtils;
import com.lzy.okgo.model.Progress;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewShowsObj;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.RvVisiableRangeObj;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbminiprogram.fragment.BaseLittleProgramFragment;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbview.AutoRotatingView;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.BgConfigObj;
import com.max.xiaoheihe.bean.CookieClearDomain;
import com.max.xiaoheihe.bean.LevelInfoObj;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.BBSInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.UserMedalObj;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.max.xiaoheihe.bean.news.events.EventObj;
import com.max.xiaoheihe.module.account.RegisterOrLoginActivityV2;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.littleprogram.MiniProgramContainerActivity;
import com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity;
import com.max.xiaoheihe.module.signin.SignInManager;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.vasdolly.helper.ChannelReaderUtil;
import com.umeng.analytics.MobclickAgent;
import com.umeng.message.PushAgent;
import com.umeng.message.UTrack;
import com.xiaomi.mipush.sdk.Constants;
import df.q00;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: compiled from: CommonUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LoadingDialog f95341a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95342b = 321;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CommonUtils.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Dialog f95345d;

        a(Context context, String str, Dialog dialog) {
            this.f95343b = context;
            this.f95344c = str;
            this.f95345d = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48640, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.d0(this.f95343b, this.f95344c, "achieve").A();
            this.f95345d.dismiss();
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95346b;

        b(Context context) {
            this.f95346b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48641, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(this.f95346b, lb.d.f131300z4);
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48642, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.utils.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CommonUtils.java */
    public class DialogInterfaceOnClickListenerC0905d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f95347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95348c;

        DialogInterfaceOnClickListenerC0905d(Activity activity, String str) {
            this.f95347b = activity;
            this.f95348c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48643, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            d.Q1(this.f95347b, this.f95348c);
            dialogInterface.dismiss();
            this.f95347b.finish();
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95349a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            f95349a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95349a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95349a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95349a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95350b;

        f(Context context) {
            this.f95350b = context;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48639, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            d.b(this.f95350b);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48638, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            d.b(this.f95350b);
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95351b;

        g(Context context) {
            this.f95351b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48644, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f95351b, (Class<?>) RegisterOrLoginActivityV2.class);
            intent.addFlags(32768);
            intent.addFlags(268435456);
            this.f95351b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class h implements UTrack.ICallBack {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.umeng.message.api.UPushAliasCallback
        public void onMessage(boolean z10, String str) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 48645, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzupush", "deleteAlias   " + str + "   isSuccess==" + z10);
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class i implements UTrack.ICallBack {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.umeng.message.api.UPushAliasCallback
        public void onMessage(boolean z10, String str) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 48646, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzupush", "deleteAlias   " + str + "   isSuccess==" + z10);
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class j implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95352b;

        j(Context context) {
            this.f95352b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48647, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f95352b.startActivity(new Intent(this.f95352b, (Class<?>) RegisterOrLoginActivityV2.class));
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f95354c;

        k(Context context, Runnable runnable) {
            this.f95353b = context;
            this.f95354c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48648, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            i0.o().setLoginFlag(false);
            i0.h();
            com.max.hbcache.c.c();
            d.h(this.f95353b).removeAllCookie();
            m0.x().u();
            Runnable runnable = this.f95354c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class l implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f95355a;

        l(Context context) {
            this.f95355a = context;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48650, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            d.I1(this.f95355a);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48649, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f95356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f95358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f95359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ LevelInfoObj f95360f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f95361g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f95362h;

        m(RelativeLayout relativeLayout, Context context, List list, List list2, LevelInfoObj levelInfoObj, String str, String str2) {
            this.f95356b = relativeLayout;
            this.f95357c = context;
            this.f95358d = list;
            this.f95359e = list2;
            this.f95360f = levelInfoObj;
            this.f95361g = str;
            this.f95362h = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48651, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            int iV = ViewUtils.V(this.f95356b);
            int[] iArr = new int[2];
            this.f95356b.getLocationOnScreen(iArr);
            d.F1(this.f95357c, this.f95356b, ViewUtils.f(this.f95357c, 20.0f), ((iArr[1] + iV) + ViewUtils.f(this.f95357c, 10.0f)) - com.max.hbutils.utils.t.m(this.f95357c), this.f95358d, this.f95359e, this.f95360f, this.f95361g, this.f95362h);
        }
    }

    /* JADX INFO: compiled from: CommonUtils.java */
    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserMedalObj f95364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Dialog f95365d;

        n(Context context, UserMedalObj userMedalObj, Dialog dialog) {
            this.f95363b = context;
            this.f95364c = userMedalObj;
            this.f95365d = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48652, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f95363b, this.f95364c.getProt());
            this.f95365d.dismiss();
        }
    }

    public static String A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48627, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : z(BaseApplication.a(), "APP_NAME");
    }

    public static String A0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48557, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!\\\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(95)));
        }
        return stringBuffer.toString();
    }

    public static void A1(TextView textView, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 48544, new Class[]{TextView.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText("Lv." + str);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView.setGravity(17);
        int iO = ViewUtils.o(textView.getContext(), textView);
        if (Integer.parseInt(str) > 21) {
            textView.setBackgroundResource(R.color.transparent);
        } else if (Integer.parseInt(str) > 18) {
            textView.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.user_level_7_start), com.max.hbcommon.utils.l.a(R.color.user_level_7_end)));
        } else if (Integer.parseInt(str) > 15) {
            textView.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.user_level_6_start), com.max.hbcommon.utils.l.a(R.color.user_level_6_end)));
        } else if (Integer.parseInt(str) > 12) {
            textView.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.user_level_5_start), com.max.hbcommon.utils.l.a(R.color.user_level_5_end)));
        } else if (Integer.parseInt(str) > 9) {
            textView.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.user_level_4_start), com.max.hbcommon.utils.l.a(R.color.user_level_4_end)));
        } else if (Integer.parseInt(str) > 6) {
            textView.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.user_level_3_start), com.max.hbcommon.utils.l.a(R.color.user_level_3_end)));
        } else if (Integer.parseInt(str) > 3) {
            textView.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.user_level_2_start), com.max.hbcommon.utils.l.a(R.color.user_level_2_end)));
        } else {
            textView.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.user_level_1_start), com.max.hbcommon.utils.l.a(R.color.user_level_1_end)));
            if (z10) {
                textView.setVisibility(4);
                return;
            }
        }
        textView.setVisibility(0);
    }

    public static BubbleTipPopup B(Context context, View view, String str, int i10, float f10, View.OnClickListener onClickListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, view, str, new Integer(i10), new Float(f10), onClickListener}, null, changeQuickRedirect, true, 48635, new Class[]{Context.class, View.class, String.class, Integer.TYPE, Float.TYPE, View.OnClickListener.class}, BubbleTipPopup.class);
        return patchProxyResultProxy.isSupported ? (BubbleTipPopup) patchProxyResultProxy.result : new BubbleTipPopup.a(context).c(view).p1(str).s1(12.0f).p0(f10).i0(i10).d(true).f(30.0f).u0(ViewUtils.f(context, 16.0f), ViewUtils.f(context, 10.0f), ViewUtils.f(context, 16.0f), ViewUtils.f(context, 10.0f)).y(false).x(true).w(ViewUtils.f(context, 8.0f)).q0(onClickListener).r();
    }

    public static void B0(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48559, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent2.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            intent2.putExtra("app_package", context.getPackageName());
            intent2.putExtra("app_uid", context.getApplicationInfo().uid);
            context.startActivity(intent2);
        } catch (Exception e10) {
            e10.printStackTrace();
            Intent intent3 = new Intent();
            intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent3);
        }
    }

    public static void B1(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 48530, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(0, 2);
    }

    public static BubbleTipPopup C(Context context, View view, String str, int i10, View.OnClickListener onClickListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, view, str, new Integer(i10), onClickListener}, null, changeQuickRedirect, true, 48634, new Class[]{Context.class, View.class, String.class, Integer.TYPE, View.OnClickListener.class}, BubbleTipPopup.class);
        return patchProxyResultProxy.isSupported ? (BubbleTipPopup) patchProxyResultProxy.result : B(context, view, str, i10, 8.0f, onClickListener);
    }

    public static void C0(ConsoleMessage consoleMessage) {
        if (PatchProxy.proxy(new Object[]{consoleMessage}, null, changeQuickRedirect, true, 48629, new Class[]{ConsoleMessage.class}, Void.TYPE).isSupported) {
            return;
        }
        String strMessage = consoleMessage.message();
        com.max.heybox.hblog.g gVarU = com.max.heybox.hblog.g.U();
        if (strMessage == null || gVarU == null) {
            return;
        }
        int i10 = e.f95349a[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            gVarU.k0(strMessage);
            return;
        }
        if (i10 == 2) {
            gVarU.a0(strMessage);
            return;
        }
        if (i10 == 3) {
            gVarU.L(strMessage);
        } else if (i10 != 4) {
            gVarU.C(strMessage);
        } else {
            gVarU.s0(strMessage);
        }
    }

    public static void C1(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 48531, new Class[]{Context.class, View.class}, Void.TYPE).isSupported || view == null || !view.requestFocus() || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    public static String D() {
        ClipData.Item itemAt;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48590, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        ClipData primaryClip = ((ClipboardManager) HeyBoxApplication.C().getSystemService(DataType.CLIPBOARD)).getPrimaryClip();
        return (primaryClip == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null || itemAt.getText() == null) ? "" : itemAt.getText().toString();
    }

    public static void D0(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 48529, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
    }

    public static void D1(Context context, View view, AccountDetailObj accountDetailObj, boolean z10) {
        char c10;
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{context, view, accountDetailObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 48542, new Class[]{Context.class, View.class, AccountDetailObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iV = ViewUtils.V(view);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        BBSInfoObj bbs_info = accountDetailObj.getBbs_info();
        int iF = ViewUtils.f(context, 20.0f);
        int iF2 = iArr[1] + iV + ViewUtils.f(context, 10.0f);
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || bbs_info == null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundDrawable(com.max.hbcommon.component.ezcalendarview.utils.c.g(context, E(R.color.background_layer_2_color), com.max.hbcommon.component.ezcalendarview.utils.c.a(4.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(3.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(3.0f)));
        PopupWindow popupWindow = new PopupWindow((View) linearLayout, ViewUtils.L(context) - ViewUtils.f(context, 40.0f), -2, true);
        int i10 = 0;
        for (int i11 = 3; i10 < i11; i11 = 3) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_user_fav_award_info, (ViewGroup) null);
            q00 q00VarA = q00.a(viewInflate);
            if (i10 == 0) {
                q00VarA.f114645c.setImageResource(R.drawable.user_medal_content_14x14);
                q00VarA.f114647e.setText("发布内容数");
                q00VarA.f114648f.setText(com.max.hbutils.utils.n.q(bbs_info.getPost_link_num()) + "");
                q00VarA.f114644b.getRoot().setVisibility(8);
            } else {
                if (i10 == z11) {
                    q00VarA.f114645c.setImageResource(R.drawable.user_medal_like_14x14);
                    q00VarA.f114647e.setText("获得点赞数");
                    q00VarA.f114648f.setText(com.max.hbutils.utils.n.q(bbs_info.getAwd_num()) + "");
                    if (z10) {
                        q00VarA.f114646d.setVisibility(0);
                        q00VarA.b().setOnClickListener(new b(context));
                    } else {
                        q00VarA.b().setOnClickListener(null);
                    }
                } else {
                    c10 = 2;
                    if (i10 == 2) {
                        q00VarA.f114645c.setImageResource(R.drawable.user_medal_collect_14x14);
                        q00VarA.f114647e.setText("获得收藏数");
                        q00VarA.f114648f.setText(com.max.hbutils.utils.n.q(bbs_info.getBe_favoured_num()) + "");
                    }
                }
                linearLayout.addView(viewInflate);
                i10++;
                z11 = true;
            }
            c10 = 2;
            linearLayout.addView(viewInflate);
            i10++;
            z11 = true;
        }
        popupWindow.setTouchable(z11);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setAnimationStyle(R.style.DropDownPopupWindowAnimation);
        if (popupWindow.isShowing()) {
            return;
        }
        popupWindow.showAtLocation(view, 0, iF, iF2);
    }

    public static int E(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48487, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : l0().getColor(i10, BaseApplication.a().getTheme());
    }

    public static void E0(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 48532, new Class[]{Context.class, View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void E1(Context context, View view, int i10, int i11, List<UserMedalObj> list, List<UserMedalObj> list2, LevelInfoObj levelInfoObj, String str) {
        Object[] objArr = {context, view, new Integer(i10), new Integer(i11), list, list2, levelInfoObj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48540, new Class[]{Context.class, View.class, cls, cls, List.class, List.class, LevelInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        F1(context, view, i10, i11, list, list2, levelInfoObj, str, null);
    }

    public static int F(Context context, int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48488, new Class[]{Context.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : androidx.core.content.res.i.e(context.getResources(), i10, context.getTheme());
    }

    public static boolean F0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48598, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : com.max.xiaoheihe.a.f76429f.equals(t0());
    }

    public static void F1(final Context context, View view, int i10, int i11, List<UserMedalObj> list, List<UserMedalObj> list2, LevelInfoObj levelInfoObj, final String str, String str2) {
        int i12;
        int i13;
        Object[] objArr = {context, view, new Integer(i10), new Integer(i11), list, list2, levelInfoObj, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48541, new Class[]{Context.class, View.class, cls, cls, List.class, List.class, LevelInfoObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundDrawable(com.max.hbcommon.component.ezcalendarview.utils.c.g(context, E(R.color.background_layer_2_color), com.max.hbcommon.component.ezcalendarview.utils.c.a(4.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(3.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(3.0f)));
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_profile_badge_id, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_user_id)).setText(str);
        linearLayout.addView(viewInflate);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.utils.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d.S0(context, str, view2);
            }
        });
        if (!com.max.hbcommon.utils.c.u(str2)) {
            View view2 = new View(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ViewUtils.f(context, 0.5f));
            view2.setBackgroundResource(R.color.divider_secondary_1_color);
            layoutParams.leftMargin = ViewUtils.f(context, 40.0f);
            layoutParams.rightMargin = ViewUtils.f(context, 16.0f);
            linearLayout.addView(view2, layoutParams);
            View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_profile_badge_id, (ViewGroup) null);
            ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.iv_user_id);
            ((TextView) viewInflate2.findViewById(R.id.tv_user_id)).setText(str2.replaceAll("IP: ", ""));
            imageView.setImageResource(R.drawable.user_medal_ip_14x14);
            linearLayout.addView(viewInflate2);
        }
        Dialog dialog = new Dialog(context);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.5f);
            window.setGravity(49);
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.addFlags(1024);
            attributes.y = i11;
            attributes.width = ViewUtils.L(context) - ViewUtils.f(context, 40.0f);
            attributes.height = -2;
            window.setAttributes(attributes);
            window.getDecorView().setPadding(0, 0, 0, 0);
        }
        int size = list != null ? list.size() : 0;
        for (int i14 = 0; i14 < size; i14++) {
            UserMedalObj userMedalObj = list.get(i14);
            View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_profile_badge_wear, (ViewGroup) null);
            ImageView imageView2 = (ImageView) viewInflate3.findViewById(R.id.iv_icon);
            TextView textView = (TextView) viewInflate3.findViewById(R.id.tv_name);
            TextView textView2 = (TextView) viewInflate3.findViewById(R.id.tv_desc);
            ImageView imageView3 = (ImageView) viewInflate3.findViewById(R.id.iv_arrow);
            linearLayout.addView(viewInflate3);
            com.max.hbimage.b.K(userMedalObj.getImg_url(), imageView2);
            textView.setText(userMedalObj.getName());
            if (com.max.hbcommon.utils.c.u(userMedalObj.getDescription())) {
                i12 = 0;
                i13 = 8;
                textView2.setVisibility(8);
            } else {
                i12 = 0;
                textView2.setVisibility(0);
                textView2.setText(userMedalObj.getDescription());
                i13 = 8;
            }
            if (com.max.hbcommon.utils.c.u(userMedalObj.getProt())) {
                imageView3.setVisibility(i13);
            } else {
                imageView3.setVisibility(i12);
                viewInflate3.setOnClickListener(new n(context, userMedalObj, dialog));
            }
        }
        int size2 = list2 != null ? list2.size() : 0;
        if (size2 > 0) {
            View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.item_profile_badge_list, (ViewGroup) null);
            TextView textView3 = (TextView) viewInflate4.findViewById(R.id.tv_name);
            LinearLayout linearLayout2 = (LinearLayout) viewInflate4.findViewById(R.id.ll_badge);
            linearLayout.addView(viewInflate4);
            textView3.setText((str == null || !str.equals(i0.j())) ? context.getResources().getString(R.string.his_badge) : context.getResources().getString(R.string.my_badge));
            for (int i15 = 0; i15 < size2; i15++) {
                UserMedalObj userMedalObj2 = list2.get(i15);
                if (i15 > 3) {
                    break;
                }
                ImageView imageView4 = new ImageView(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ViewUtils.f(context, 14.0f), ViewUtils.f(context, 14.0f));
                layoutParams2.rightMargin = ViewUtils.f(context, 6.0f);
                imageView4.setLayoutParams(layoutParams2);
                linearLayout2.addView(imageView4);
                com.max.hbimage.b.K(userMedalObj2.getImg_url(), imageView4);
                imageView4.setAlpha("1".equals(userMedalObj2.getAchieved()) ? 1.0f : 0.2f);
            }
            viewInflate4.setOnClickListener(new a(context, str, dialog));
        }
        if (dialog.isShowing()) {
            return;
        }
        dialog.show();
    }

    public static int G(Context context, int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48621, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return com.max.hbutils.utils.u.b(context) ? fd.a.e(i10) : i10;
    }

    public static void G0(Context context, Progress progress) {
        if (PatchProxy.proxy(new Object[]{context, progress}, null, changeQuickRedirect, true, 48564, new Class[]{Context.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64791q = "1";
        com.lzy.okgo.db.g.Q().B(progress);
        com.max.hbapkinstaller.d.b(context, progress.f64779e);
    }

    public static void G1(Context context, Intent intent) {
        if (PatchProxy.proxy(new Object[]{context, intent}, null, changeQuickRedirect, true, 48576, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        H1(context, intent, -1);
    }

    public static int H(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48620, new Class[]{Context.class, String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : G(context, e1(str));
    }

    public static boolean H0(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48569, new Class[]{Context.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str.trim(), 0) != null;
        } catch (Exception e10) {
            e10.printStackTrace();
            com.max.heybox.hblog.g.W("isAppInstalled " + str + " false");
            return false;
        }
    }

    public static void H1(Context context, Intent intent, int i10) {
        if (PatchProxy.proxy(new Object[]{context, intent, new Integer(i10)}, null, changeQuickRedirect, true, 48577, new Class[]{Context.class, Intent.class, Integer.TYPE}, Void.TYPE).isSupported || context == null || intent == null) {
            return;
        }
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, i10);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int I(float f10, int i10) {
        Object[] objArr = {new Float(f10), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48622, new Class[]{Float.TYPE, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Color.argb(Math.round(f10 * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static boolean I0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48615, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        if ((activityA instanceof AppCompatActivity) && !activityA.isFinishing()) {
            List<Fragment> listJ0 = ((AppCompatActivity) activityA).getSupportFragmentManager().J0();
            if (!com.max.hbcommon.utils.c.w(listJ0)) {
                Iterator<Fragment> it = listJ0.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof ShareImageDialogFragment) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void I1(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48513, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i0.s()) {
            PushAgent.getInstance(HeyBoxApplication.C()).deleteAlias(i0.j(), "heybox", new i());
            com.max.hbcommon.push.a.a(context, i0.j(), false);
        }
        l(context, new j(context));
    }

    public static int J(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48631, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Color.argb(255, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static boolean J0(Context context, Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, cls}, null, changeQuickRedirect, true, 48521, new Class[]{Context.class, Class.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ComponentName componentNameResolveActivity = new Intent(context, cls).resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity == null) {
            return false;
        }
        Iterator<ActivityManager.RunningTaskInfo> it = ((ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getRunningTasks(10).iterator();
        while (it.hasNext()) {
            if (it.next().baseActivity.equals(componentNameResolveActivity)) {
                return true;
            }
        }
        return false;
    }

    public static String J1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48526, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
        return String.valueOf(date.getTime() / 1000);
    }

    public static CookieManager K(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48518, new Class[]{Context.class}, CookieManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (CookieManager) patchProxyResultProxy.result;
        }
        CookieSyncManager.createInstance(context);
        return CookieManager.getInstance();
    }

    public static boolean K0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48578, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strX0 = x0();
        if (!com.max.hbcommon.utils.c.u(str) && !com.max.hbcommon.utils.c.u(strX0)) {
            String[] strArrSplit = strX0.split("\\.");
            String[] strArrSplit2 = str.split("\\.");
            if (com.max.hbutils.utils.n.q(strArrSplit[0]) > com.max.hbutils.utils.n.q(strArrSplit2[0]) || com.max.hbutils.utils.n.q(strArrSplit[1]) > com.max.hbutils.utils.n.q(strArrSplit2[1]) || com.max.hbutils.utils.n.q(strArrSplit[2]) > com.max.hbutils.utils.n.q(strArrSplit2[2])) {
                return true;
            }
        }
        return false;
    }

    public static String K1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48527, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return com.max.hbcommon.utils.c.u(str) ? "" : new SimpleDateFormat("yyyy/MM/dd").format(new Date(Long.valueOf(str).longValue() * 1000));
    }

    public static String L() {
        String line;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48571, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return null;
                }
            } while (!line.contains("Hardware"));
            return line.split(":")[1];
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean L0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48597, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null) {
            return false;
        }
        for (char c10 : str.toCharArray()) {
            if ((c10 < 'a' || c10 > 'z') && (c10 < 'A' || c10 > 'Z')) {
                return false;
            }
        }
        return true;
    }

    public static String L1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48525, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return !com.max.hbcommon.utils.c.u(str) ? Pattern.compile("[\u200e\u200f\u200d\u200c\u202a\u202d\u202e\u202c\u206e\u206f\u206b\u206a\u206d\u206c\u001e\u001f]").matcher(str).replaceAll("") : str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public static KeyDescObj M(FiltersObj filtersObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj}, null, changeQuickRedirect, true, 48581, new Class[]{FiltersObj.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (filtersObj == null) {
            return null;
        }
        return N(filtersObj.getFilters());
    }

    public static boolean M0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48553, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return 1.0d - ((((((double) Color.red(i10)) * 0.299d) + (((double) Color.green(i10)) * 0.587d)) + (((double) Color.blue(i10)) * 0.114d)) / 255.0d) < 0.5d;
    }

    public static String M1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48522, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return !com.max.hbcommon.utils.c.u(str) ? Pattern.compile("^(\\s*|\t|\r|\n)|(\\s*|\t|\r|\n)$").matcher(str).replaceAll("") : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static KeyDescObj N(List<KeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, 48582, new Class[]{List.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (list == null) {
            return null;
        }
        for (KeyDescObj keyDescObj : list) {
            if (keyDescObj.isChecked()) {
                return keyDescObj;
            }
        }
        return null;
    }

    public static boolean N0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48558, new Class[]{Context.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : com.max.hbutils.utils.u.c(context);
    }

    public static String N1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48528, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if ("男".equals(str)) {
            return "1";
        }
        if ("女".equals(str)) {
            return "2";
        }
        if ("1".equals(str)) {
            return "男";
        }
        return "2".equals(str) ? "女" : "";
    }

    public static BaseLittleProgramFragment O() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48614, new Class[0], BaseLittleProgramFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (BaseLittleProgramFragment) patchProxyResultProxy.result;
        }
        ComponentCallbacks2 componentCallbacks2A = com.max.hbutils.utils.e.b().a();
        if ((componentCallbacks2A instanceof AppCompatActivity) && (componentCallbacks2A instanceof com.max.hbcommon.base.f) && ((com.max.hbcommon.base.f) componentCallbacks2A).isActive()) {
            if (componentCallbacks2A instanceof MiniProgramHostActivity) {
                Fragment fragmentT = ((MiniProgramHostActivity) componentCallbacks2A).T();
                if (fragmentT instanceof BaseLittleProgramFragment) {
                    return (BaseLittleProgramFragment) fragmentT;
                }
                return null;
            }
            if (componentCallbacks2A instanceof WebActionActivity) {
                return ((WebActionActivity) componentCallbacks2A).N2();
            }
            if (componentCallbacks2A instanceof MiniProgramContainerActivity) {
                Fragment fragmentT2 = ((MiniProgramContainerActivity) componentCallbacks2A).T();
                if (fragmentT2 instanceof BaseLittleProgramFragment) {
                    return (BaseLittleProgramFragment) fragmentT2;
                }
                return null;
            }
            if (componentCallbacks2A instanceof ChannelsDetailActivity) {
                Fragment fragmentT3 = ((ChannelsDetailActivity) componentCallbacks2A).T();
                if (fragmentT3 instanceof BaseLittleProgramFragment) {
                    return (BaseLittleProgramFragment) fragmentT3;
                }
                return null;
            }
            for (Fragment fragment : ((AppCompatActivity) componentCallbacks2A).getSupportFragmentManager().J0()) {
                if ((fragment instanceof BaseLittleProgramFragment) && fragment.isVisible()) {
                    BaseLittleProgramFragment baseLittleProgramFragment = (BaseLittleProgramFragment) fragment;
                    if (baseLittleProgramFragment.isActive()) {
                        return baseLittleProgramFragment;
                    }
                }
            }
        }
        return null;
    }

    public static boolean O0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48504, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !P0();
    }

    public static String O1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48524, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return !com.max.hbcommon.utils.c.u(str) ? Pattern.compile("\t|\r|\n").matcher(str).replaceAll("") : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static WebviewFragment P() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48613, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        ComponentCallbacks2 componentCallbacks2A = com.max.hbutils.utils.e.b().a();
        if ((componentCallbacks2A instanceof AppCompatActivity) && (componentCallbacks2A instanceof com.max.hbcommon.base.f) && ((com.max.hbcommon.base.f) componentCallbacks2A).isActive()) {
            if (componentCallbacks2A instanceof WebActionActivity) {
                return ((WebActionActivity) componentCallbacks2A).N2();
            }
            if (componentCallbacks2A instanceof ChannelsDetailActivity) {
                Fragment fragmentT = ((ChannelsDetailActivity) componentCallbacks2A).T();
                if (fragmentT instanceof WebviewFragment) {
                    return (WebviewFragment) fragmentT;
                }
                return null;
            }
            for (Fragment fragment : ((AppCompatActivity) componentCallbacks2A).getSupportFragmentManager().J0()) {
                if ((fragment instanceof WebviewFragment) && fragment.isVisible()) {
                    WebviewFragment webviewFragment = (WebviewFragment) fragment;
                    if (webviewFragment.isActive()) {
                        return webviewFragment;
                    }
                }
            }
        }
        return null;
    }

    public static boolean P0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48503, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String P1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48523, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return !com.max.hbcommon.utils.c.u(str) ? Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("") : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String Q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48495, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : HeyBoxApplication.C().getCacheDir().getAbsolutePath();
    }

    public static boolean Q0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48612, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return lb.a.f131057v1.equals(str) || lb.a.f131051u1.equals(str);
    }

    public static void Q1(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48563, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!H0(context, lb.a.f130983j)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://acc.xiaoheihe.cn"));
            G1(context, intent);
        } else if (com.max.hbcommon.utils.c.u(str)) {
            d1(context, lb.a.f130983j);
        } else {
            TradeInfoUtilKt.n(context, false, str);
        }
    }

    public static String R() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48496, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return HeyBoxApplication.C().getFilesDir() + File.separator;
    }

    public static boolean R0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48611, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return Q0(Uri.parse(str).getHost());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void R1(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48575, new Class[]{Context.class}, Void.TYPE).isSupported || b1(context)) {
            return;
        }
        com.max.xiaoheihe.base.router.b.w(context).A();
        if (com.max.hbcache.c.v()) {
            com.max.hbcommon.utils.k.d("19");
        }
        com.max.hbcache.c.M(false);
        Intent intent = new Intent();
        intent.setAction(lb.a.f131025q);
        context.sendBroadcast(intent);
    }

    public static String S(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48497, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return R() + str + File.separator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S0(Context context, String str, View view) {
        if (PatchProxy.proxy(new Object[]{context, str, view}, null, changeQuickRedirect, true, 48636, new Class[]{Context.class, String.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        o(context, str);
        com.max.hbutils.utils.x.p("复制成功");
    }

    public static void S1(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48568, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            context.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)));
        } catch (Exception e10) {
            e10.printStackTrace();
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(n0(R.string.fail));
        }
    }

    public static String T() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48493, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath());
            String str = File.separator;
            sb2.append(str);
            sb2.append(lb.a.f130977i);
            sb2.append(str);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Environment.getExternalStorageDirectory());
        String str2 = File.separator;
        sb3.append(str2);
        sb3.append(lb.a.f130977i);
        sb3.append(str2);
        String string = sb3.toString();
        File file = new File(string);
        if (!file.exists()) {
            file.mkdirs();
        }
        return string;
    }

    public static String T0(List list, char c10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, new Character(c10)}, null, changeQuickRedirect, true, 48554, new Class[]{List.class, Character.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10));
            sb2.append(c10);
        }
        return sb2.toString().substring(0, sb2.toString().length() - 1);
    }

    public static void T1(FiltersObj filtersObj, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{filtersObj, keyDescObj}, null, changeQuickRedirect, true, 48583, new Class[]{FiltersObj.class, KeyDescObj.class}, Void.TYPE).isSupported || filtersObj == null || keyDescObj == null) {
            return;
        }
        U1(filtersObj.getFilters(), keyDescObj);
    }

    public static String U() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48506, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new com.max.xiaoheihe.utils.h(HeyBoxApplication.C()).d();
    }

    public static void U0(BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, null, changeQuickRedirect, true, 48580, new Class[]{BaseActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        V0(baseActivity);
    }

    public static void U1(List<KeyDescObj> list, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{list, keyDescObj}, null, changeQuickRedirect, true, 48584, new Class[]{List.class, KeyDescObj.class}, Void.TYPE).isSupported || list == null || keyDescObj == null) {
            return;
        }
        for (KeyDescObj keyDescObj2 : list) {
            if (keyDescObj2.getKey() == null || !keyDescObj2.getKey().equals(keyDescObj.getKey())) {
                keyDescObj2.setChecked(false);
            } else {
                keyDescObj2.setChecked(true);
            }
        }
    }

    public static float V(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48492, new Class[]{Integer.TYPE}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : l0().getDimension(i10);
    }

    public static void V0(BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, null, changeQuickRedirect, true, 48579, new Class[]{BaseActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        if (J0(baseActivity, MainActivity.class) || HeyBoxApplication.f76795q) {
            com.max.hbcommon.utils.d.b("zzzztest", "loginToMainActivity true");
            MainActivity.f76169p5 = true;
        } else {
            baseActivity.startActivity(new Intent(baseActivity, (Class<?>) MainActivity.class));
        }
        baseActivity.finish();
        if (i0.s()) {
            SignInManager.f().d(1000L);
        }
        r1.I1();
    }

    public static AccountDetailObj V1(BBSUserInfoObj bBSUserInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj}, null, changeQuickRedirect, true, 48533, new Class[]{BBSUserInfoObj.class}, AccountDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AccountDetailObj) patchProxyResultProxy.result;
        }
        AccountDetailObj accountDetailObj = new AccountDetailObj();
        accountDetailObj.setLevel_info(bBSUserInfoObj.getLevel_info());
        accountDetailObj.setBbs_medal(bBSUserInfoObj.getMedal());
        accountDetailObj.setMedals(bBSUserInfoObj.getMedals());
        accountDetailObj.setUserid(bBSUserInfoObj.getUserid());
        accountDetailObj.setUsername(bBSUserInfoObj.getUsername());
        accountDetailObj.setAvartar(bBSUserInfoObj.getAvartar());
        return accountDetailObj;
    }

    public static String W() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48565, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbapkinstaller.d.a();
    }

    public static void W0(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48508, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        X0(context, false);
        j();
    }

    public static boolean W1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48626, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        HashSet hashSet = new HashSet();
        char[] charArray = str.toCharArray();
        if (charArray.length > 6) {
            return false;
        }
        for (char c10 : charArray) {
            hashSet.add(String.valueOf(c10));
        }
        return hashSet.size() <= 1 || str.equals("112233") || str.equals("123123") || str.equals("123321") || str.equals("123456") || str.equals("654321") || str.equals("abcdef") || str.equals("abcabc");
    }

    public static Drawable X(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48486, new Class[]{Integer.TYPE}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : l0().getDrawable(i10);
    }

    public static void X0(Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 48510, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().x5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new f(context));
    }

    public static BubbleTipPopup Y(Context context, ViewGroup viewGroup, View view, String str, int i10, View.OnClickListener onClickListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, view, str, new Integer(i10), onClickListener}, null, changeQuickRedirect, true, 48633, new Class[]{Context.class, ViewGroup.class, View.class, String.class, Integer.TYPE, View.OnClickListener.class}, BubbleTipPopup.class);
        if (patchProxyResultProxy.isSupported) {
            return (BubbleTipPopup) patchProxyResultProxy.result;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View view2 = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ViewUtils.V(view) + ViewUtils.f(context, 8.0f));
        layoutParams.topMargin = (iArr[1] - com.max.hbutils.utils.t.p(context)) - ViewUtils.f(context, 4.0f);
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        view2.setOnClickListener(onClickListener);
        int iF = F(context, R.color.background_layer_2_color);
        return new BubbleTipPopup.a(context).c(view2).p1(str).s1(12.0f).p0(8.0f).i0(i10).d(true).f(30.0f).u0(ViewUtils.f(context, 20.0f), ViewUtils.f(context, 10.0f), ViewUtils.f(context, 20.0f), ViewUtils.f(context, 10.0f)).y(false).x(true).h(iF).p(iF).w(ViewUtils.f(context, 8.0f)).q1(F(context, R.color.text_primary_1_color)).r();
    }

    private static void Y0(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48511, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.account.accelworld.a.g(i0.o());
        Z0(context, new g(context));
    }

    public static String Z() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48494, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return Build.VERSION.SDK_INT >= 29 ? n0(R.string.saved_in_pictures) : String.format(n0(R.string.saved_in), lb.a.f130977i);
    }

    public static void Z0(Context context, Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{context, runnable}, null, changeQuickRedirect, true, 48512, new Class[]{Context.class, Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i0.s()) {
            MobclickAgent.onProfileSignOff();
            PushAgent.getInstance(HeyBoxApplication.C()).deleteAlias(i0.j(), "heybox", new h());
            com.max.hbcommon.push.a.a(context, i0.j(), false);
        }
        l(context, runnable);
    }

    public static Intent a0(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48566, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        File file = new File(str);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setDataAndType(FileProvider.f(context, "com.max.xiaoheihe.fileprovider", file), "application/vnd.android.package-archive");
            intent.addFlags(1);
        } else {
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        }
        intent.addFlags(268435456);
        return intent;
    }

    public static String a1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48555, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b10 : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    static /* synthetic */ void b(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48637, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        Y0(context);
    }

    public static String b0(List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, 48632, new Class[]{List.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = "";
        for (String str2 : list) {
            if (str.length() > 0) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            str = str + str2;
        }
        return str;
    }

    public static boolean b1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48519, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (i0.o().isLoginFlag()) {
            return false;
        }
        com.max.xiaoheihe.view.l.D(context, "", n0(R.string.need_login_to_use), "去登录", "取消", new l(context));
        return true;
    }

    public static void c(JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{jsonObject}, null, changeQuickRedirect, true, 48609, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        pageEventObj.setPath(lb.d.f131177i0);
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setType("3");
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    public static String c0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48505, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("getPackageName error: " + th2.getMessage());
            return com.max.xiaoheihe.a.f76425b;
        }
    }

    public static com.max.hbcommon.view.a c1(Activity activity, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, str}, null, changeQuickRedirect, true, 48562, new Class[]{Activity.class, String.class}, com.max.hbcommon.view.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.view.a) patchProxyResultProxy.result : new com.max.hbcommon.view.a.f(activity).y("页面无法打开").l("请尝试开启小黑盒加速器后重试").u("去开启", new DialogInterfaceOnClickListenerC0905d(activity, str)).o(n0(R.string.cancel), new c()).d();
    }

    public static void d(boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 48608, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        pageEventObj.setPath(z10 ? lb.d.Z : lb.d.f131121a0);
        pageEventObj.setAddition((JsonObject) com.max.hbutils.utils.k.a(str, JsonObject.class));
        pageEventObj.setType("3");
        com.max.hbcommon.utils.d.b("zzzzpageevent", "reportEvent==" + com.max.hbutils.utils.k.p(pageEventObj));
        com.max.hbcommon.analytics.d.v().add(pageEventObj);
    }

    public static String d0(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48570, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1);
        if (packageArchiveInfo != null) {
            return packageArchiveInfo.applicationInfo.packageName;
        }
        return null;
    }

    public static void d1(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48561, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(packageInfo.packageName);
            ResolveInfo next = packageManager.queryIntentActivities(intent, 0).iterator().next();
            if (next != null) {
                ActivityInfo activityInfo = next.activityInfo;
                String str2 = activityInfo.packageName;
                String str3 = activityInfo.name;
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setComponent(new ComponentName(str2, str3));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void e(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48567, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        l2.p(context).b(str.hashCode());
    }

    public static String e0(String str, int i10, boolean z10) {
        StringBuilder sb2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 48560, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(str) || i10 < 0) {
            return "";
        }
        double dDoubleValue = Double.valueOf(str).doubleValue();
        if (i10 == 0) {
            sb2 = new StringBuilder("##0");
        } else {
            sb2 = new StringBuilder("##0.");
            for (int i11 = 0; i11 < i10; i11++) {
                if (z10) {
                    sb2.append("0");
                } else {
                    sb2.append("#");
                }
            }
        }
        sb2.append("%");
        return new DecimalFormat(sb2.toString()).format(dDoubleValue);
    }

    public static int e1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48499, new Class[]{String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.hbutils.utils.a.d(str);
    }

    public static void f() {
        if (!PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48606, new Class[0], Void.TYPE).isSupported && com.max.hbcommon.analytics.d.v().size() >= com.max.hbcommon.analytics.d.f66538a) {
            com.max.hbcommon.analytics.d.h(com.max.hbcommon.analytics.d.v());
            com.max.hbcommon.analytics.d.v().clear();
        }
    }

    public static StateListDrawable f0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48595, new Class[]{Context.class}, StateListDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (StateListDrawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getResources().getColor(R.color.checked_color));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public static void f1(Context context, BgConfigObj bgConfigObj, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{context, bgConfigObj, imageView}, null, changeQuickRedirect, true, 48628, new Class[]{Context.class, BgConfigObj.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        int iL = ViewUtils.L(context);
        int i10 = (iL * bb.c.b.S8) / bb.c.b.Yh;
        Bitmap bitmapC = com.max.mediaselector.lib.utils.c.c(i10, i10, e1(bgConfigObj.getColor1()));
        Bitmap bitmapC2 = com.max.mediaselector.lib.utils.c.c(i10, i10, e1(bgConfigObj.getColor2()));
        Bitmap bitmapC3 = com.max.mediaselector.lib.utils.c.c(i10, i10, e1(bgConfigObj.getColor3()));
        Bitmap bitmapC4 = com.max.mediaselector.lib.utils.c.c(i10, i10, e1(bgConfigObj.getColor4()));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iL, iL, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapC, 0.0f, 0.0f, (Paint) null);
        float f10 = iL - i10;
        canvas.drawBitmap(bitmapC3, 0.0f, f10, (Paint) null);
        canvas.drawBitmap(bitmapC2, f10, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapC4, f10, f10, (Paint) null);
        canvas.save();
        canvas.restore();
        zb.b bVar = new zb.b();
        bVar.f141959a = iL;
        bVar.f141960b = iL;
        bVar.f141962d = 6;
        imageView.setImageBitmap(zb.a.b(context, bitmapCreateBitmap, bVar));
        imageView.setAlpha(0.65f);
    }

    public static void g() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48591, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ((ClipboardManager) HeyBoxApplication.C().getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText(null, null));
    }

    public static StateListDrawable g0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48594, new Class[]{Context.class}, StateListDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (StateListDrawable) patchProxyResultProxy.result;
        }
        int iF = ViewUtils.f(context, 2.0f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getResources().getColor(R.color.checked_color));
        float f10 = iF;
        gradientDrawable.setCornerRadii(new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10});
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        gradientDrawable2.setCornerRadii(new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10});
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public static void g1() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48616, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strJ = com.max.hbcache.c.j(com.max.hbcache.c.f66157x0);
        if ("0".equals(strJ)) {
            s();
        } else if ("1".equals(strJ)) {
            t();
        } else {
            r();
        }
    }

    @androidx.annotation.n0
    public static CookieManager h(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48515, new Class[]{Context.class}, CookieManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (CookieManager) patchProxyResultProxy.result;
        }
        CookieManager cookieManagerK = K(context);
        cookieManagerK.setAcceptCookie(true);
        cookieManagerK.removeAllCookie();
        cookieManagerK.removeSessionCookie();
        CookieSyncManager.getInstance().sync();
        new ka.d(context).c();
        return cookieManagerK;
    }

    public static StateListDrawable h0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48596, new Class[]{Context.class}, StateListDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (StateListDrawable) patchProxyResultProxy.result;
        }
        int iF = ViewUtils.f(context, 2.0f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getResources().getColor(R.color.checked_color));
        float f10 = iF;
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f});
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f});
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public static void h1(RelativeLayout relativeLayout, AccountDetailObj accountDetailObj) {
        if (PatchProxy.proxy(new Object[]{relativeLayout, accountDetailObj}, null, changeQuickRedirect, true, 48534, new Class[]{RelativeLayout.class, AccountDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        i1(relativeLayout, accountDetailObj, 16);
    }

    @androidx.annotation.n0
    public static CookieManager i(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48517, new Class[]{Context.class, String.class}, CookieManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (CookieManager) patchProxyResultProxy.result;
        }
        if (str == null) {
            return h(context);
        }
        List listB = com.max.hbutils.utils.k.b(str, CookieClearDomain.class);
        CookieManager cookieManagerK = K(context);
        cookieManagerK.setAcceptCookie(true);
        ka.d dVar = new ka.d(context);
        for (int i10 = 0; i10 < listB.size(); i10++) {
            String domain = ((CookieClearDomain) listB.get(i10)).getDomain();
            if (domain != null) {
                if (!domain.startsWith("https://")) {
                    domain = "https://" + domain;
                }
                String cookie = cookieManagerK.getCookie(domain);
                Uri uri = Uri.parse(domain);
                if (cookie != null) {
                    for (String str2 : cookie.split(";")) {
                        String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strArrSplit[0].trim());
                        sb2.append("=; Expires=Wed, 31 Dec 2000 23:59:59 GMT; Max-Age=0; Domain=");
                        sb2.append(uri.getHost());
                        sb2.append(com.max.hbcommon.utils.c.u(uri.getPath()) ? "" : "; Path=" + uri.getPath());
                        cookieManagerK.setCookie(domain, sb2.toString());
                        if (com.max.hbcommon.utils.c.u(uri.getPath())) {
                            cookieManagerK.setCookie(domain, strArrSplit[0].trim() + "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT; Max-Age=0;");
                        } else {
                            cookieManagerK.setCookie(domain, strArrSplit[0].trim() + "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT; Max-Age=0;; Path=" + uri.getPath());
                        }
                    }
                    com.max.heybox.hblog.g.W("clearCookie  url: " + domain + "  host: " + uri.getHost() + "  path: " + uri.getPath());
                }
                try {
                    dVar.d(okhttp3.t.J(domain));
                } catch (Throwable unused) {
                }
            }
        }
        CookieManager.getInstance().flush();
        return cookieManagerK;
    }

    public static String i0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48556, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(36)));
        }
        return stringBuffer.toString();
    }

    public static void i1(RelativeLayout relativeLayout, AccountDetailObj accountDetailObj, int i10) {
        if (PatchProxy.proxy(new Object[]{relativeLayout, accountDetailObj, new Integer(i10)}, null, changeQuickRedirect, true, 48536, new Class[]{RelativeLayout.class, AccountDetailObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        l1(relativeLayout, accountDetailObj.getBbs_medal(), accountDetailObj.getMedals(), accountDetailObj.getLevel_info(), accountDetailObj.getUserid(), i10);
    }

    public static void j() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48509, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.b();
    }

    public static RvVisiableRangeObj j0(RecyclerView recyclerView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView}, null, changeQuickRedirect, true, 48602, new Class[]{RecyclerView.class}, RvVisiableRangeObj.class);
        return patchProxyResultProxy.isSupported ? (RvVisiableRangeObj) patchProxyResultProxy.result : k0(recyclerView, 0.0f);
    }

    public static void j1(RelativeLayout relativeLayout, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{relativeLayout, bBSUserInfoObj}, null, changeQuickRedirect, true, 48535, new Class[]{RelativeLayout.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        i1(relativeLayout, V1(bBSUserInfoObj), 16);
    }

    public static void k(Context context, String... strArr) {
        if (PatchProxy.proxy(new Object[]{context, strArr}, null, changeQuickRedirect, true, 48516, new Class[]{Context.class, String[].class}, Void.TYPE).isSupported || strArr == null || strArr.length <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String strS = l0.s(str);
            String strC = l0.C(str);
            if (strC != null) {
                arrayList.add(new CookieClearDomain(strS + strC));
            } else {
                arrayList.add(new CookieClearDomain(strS));
            }
        }
        i(context, com.max.hbutils.utils.k.r(arrayList));
    }

    public static RvVisiableRangeObj k0(RecyclerView recyclerView, float f10) {
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, new Float(f10)}, null, changeQuickRedirect, true, 48604, new Class[]{RecyclerView.class, Float.TYPE}, RvVisiableRangeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RvVisiableRangeObj) patchProxyResultProxy.result;
        }
        RvVisiableRangeObj rvVisiableRangeObj = new RvVisiableRangeObj(-1, -1);
        if (recyclerView != null && (((recyclerView.getLayoutManager() instanceof LinearLayoutManager) || (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager)) && ViewUtils.f0(recyclerView))) {
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                View viewFindViewByPosition = recyclerView.getLayoutManager().findViewByPosition(iFindFirstVisibleItemPosition);
                View viewFindViewByPosition2 = recyclerView.getLayoutManager().findViewByPosition(iFindLastVisibleItemPosition);
                if (viewFindViewByPosition == null || z0(viewFindViewByPosition) < f10) {
                    iFindFirstVisibleItemPosition++;
                }
                if (viewFindViewByPosition2 == null || z0(viewFindViewByPosition2) < f10) {
                    iFindLastVisibleItemPosition--;
                }
            } else {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
                int[] iArrFindFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                int[] iArrFindLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                iFindFirstVisibleItemPosition = iArrFindFirstVisibleItemPositions[0];
                for (int i10 : iArrFindFirstVisibleItemPositions) {
                    if (i10 < iFindFirstVisibleItemPosition) {
                        iFindFirstVisibleItemPosition = i10;
                    }
                }
                int i11 = iArrFindLastVisibleItemPositions[0];
                for (int i12 : iArrFindLastVisibleItemPositions) {
                    if (i12 > i11) {
                        i11 = i12;
                    }
                }
                View viewFindViewByPosition3 = recyclerView.getLayoutManager().findViewByPosition(iFindFirstVisibleItemPosition);
                View viewFindViewByPosition4 = recyclerView.getLayoutManager().findViewByPosition(i11);
                if (viewFindViewByPosition3 == null || z0(viewFindViewByPosition3) < f10) {
                    iFindFirstVisibleItemPosition++;
                }
                if (viewFindViewByPosition4 == null || z0(viewFindViewByPosition4) < f10) {
                    i11--;
                }
                iFindLastVisibleItemPosition = i11;
                com.max.hbcommon.utils.d.b("zzzzreporttest", "StaggeredGridLayoutManager  first==" + iFindFirstVisibleItemPosition + "    last==" + iFindLastVisibleItemPosition);
            }
            rvVisiableRangeObj.setFirst(iFindFirstVisibleItemPosition);
            rvVisiableRangeObj.setLast(iFindLastVisibleItemPosition);
        }
        return rvVisiableRangeObj;
    }

    public static void k1(RelativeLayout relativeLayout, BBSUserInfoObj bBSUserInfoObj, int i10) {
        if (PatchProxy.proxy(new Object[]{relativeLayout, bBSUserInfoObj, new Integer(i10)}, null, changeQuickRedirect, true, 48537, new Class[]{RelativeLayout.class, BBSUserInfoObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        AccountDetailObj accountDetailObjV1 = V1(bBSUserInfoObj);
        l1(relativeLayout, accountDetailObjV1.getBbs_medal(), accountDetailObjV1.getMedals(), accountDetailObjV1.getLevel_info(), accountDetailObjV1.getUserid(), i10);
    }

    private static void l(Context context, Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{context, runnable}, null, changeQuickRedirect, true, 48514, new Class[]{Context.class, Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        new Handler().postDelayed(new k(context, runnable), 50L);
    }

    public static Resources l0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48489, new Class[0], Resources.class);
        if (patchProxyResultProxy.isSupported) {
            return (Resources) patchProxyResultProxy.result;
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        return (activityA == null || activityA.isFinishing()) ? HeyBoxApplication.C().getResources() : activityA.getResources();
    }

    public static void l1(RelativeLayout relativeLayout, List<UserMedalObj> list, List<UserMedalObj> list2, LevelInfoObj levelInfoObj, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{relativeLayout, list, list2, levelInfoObj, str, new Integer(i10)}, null, changeQuickRedirect, true, 48538, new Class[]{RelativeLayout.class, List.class, List.class, LevelInfoObj.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        m1(relativeLayout, list, list2, levelInfoObj, str, null, i10);
    }

    public static String m(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48500, new Class[]{Integer.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format("#%02X%02X%02X%02X", Integer.valueOf((i10 >> 24) & 255), Integer.valueOf((i10 >> 16) & 255), Integer.valueOf((i10 >> 8) & 255), Integer.valueOf(i10 & 255));
    }

    public static String m0(okhttp3.c0 c0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, null, changeQuickRedirect, true, 48592, new Class[]{okhttp3.c0.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Charset charsetForName = Charset.forName("UTF-8");
        okhttp3.d0 d0VarQ = c0Var.q();
        BufferedSource f132479c = d0VarQ.getSource();
        try {
            f132479c.request(Long.MAX_VALUE);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        Buffer buffer = f132479c.getBufferField();
        okhttp3.v f132480d = d0VarQ.getF132480d();
        if (f132480d != null) {
            try {
                charsetForName = f132480d.f(charsetForName);
            } catch (UnsupportedCharsetException e11) {
                e11.printStackTrace();
            }
        }
        return buffer.clone().readString(charsetForName);
    }

    public static void m1(RelativeLayout relativeLayout, List<UserMedalObj> list, List<UserMedalObj> list2, LevelInfoObj levelInfoObj, String str, String str2, int i10) {
        int iS;
        BoxAutoPlayView boxAutoPlayView;
        char c10;
        if (PatchProxy.proxy(new Object[]{relativeLayout, list, list2, levelInfoObj, str, str2, new Integer(i10)}, null, changeQuickRedirect, true, 48539, new Class[]{RelativeLayout.class, List.class, List.class, LevelInfoObj.class, String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported || relativeLayout == null) {
            return;
        }
        relativeLayout.removeAllViews();
        Context context = relativeLayout.getContext();
        int size = list != null ? list.size() : 0;
        int iF = ViewUtils.f(context, 16.0f);
        char c11 = 0;
        int iF2 = ViewUtils.f(context, 4.0f);
        int i11 = -2;
        int i12 = 15;
        if (size > 0) {
            int i13 = 0;
            iS = iF2;
            while (i13 < size) {
                UserMedalObj userMedalObj = list.get(i13);
                ImageView imageView = new ImageView(context);
                if (com.max.hbcommon.utils.c.u(userMedalObj.getName_short())) {
                    c10 = c11;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
                    layoutParams.addRule(15);
                    layoutParams.setMargins(iS, 0, 0, 0);
                    imageView.setLayoutParams(layoutParams);
                    com.max.hbimage.b.K(userMedalObj.getImg_url(), imageView);
                    relativeLayout.addView(imageView);
                    iS += iF + iF2;
                } else {
                    TextView textView = new TextView(context);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i11, iF);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iF, iF);
                    layoutParams2.addRule(i12);
                    int i14 = iF / 2;
                    layoutParams2.setMargins(iS + i14, 0, 0, 0);
                    textView.setLayoutParams(layoutParams2);
                    textView.setGravity(17);
                    c10 = 0;
                    textView.setPadding(ViewUtils.f(context, 10.0f), 0, ViewUtils.f(context, 4.0f), 0);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(ViewUtils.f(context, 1.0f));
                    gradientDrawable.setColor(e1(userMedalObj.getColor()));
                    textView.setBackgroundDrawable(gradientDrawable);
                    textView.getBackground().setAlpha(85);
                    textView.setTextColor(e1(userMedalObj.getColor()));
                    textView.setText(userMedalObj.getName_short());
                    if (i10 < ViewUtils.f(context, 12.0f)) {
                        textView.setTextSize(1, 7.0f);
                    } else {
                        textView.setTextSize(1, 9.0f);
                    }
                    layoutParams3.addRule(15);
                    layoutParams3.setMargins(iS, 0, 0, 0);
                    imageView.setLayoutParams(layoutParams3);
                    com.max.hbimage.b.K(userMedalObj.getImg_url(), imageView);
                    relativeLayout.addView(textView);
                    relativeLayout.addView(imageView);
                    iS = (int) (iS + ViewUtils.S(textView.getPaint(), userMedalObj.getName_short()) + i14 + iF2 + ViewUtils.f(context, 14.0f));
                }
                i13++;
                c11 = c10;
                size = size;
                i11 = -2;
                i12 = 15;
            }
        } else {
            iS = iF2;
        }
        if (levelInfoObj != null && !"0".equals(levelInfoObj.getStatus())) {
            int i15 = Integer.parseInt(levelInfoObj.getLevel());
            TextView textView2 = new TextView(context);
            textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            textView2.setTextColor(context.getResources().getColor(R.color.white));
            textView2.setTextSize(1, 7.0f);
            textView2.setGravity(17);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(context, 10.0f));
            layoutParams4.addRule(15);
            layoutParams4.setMargins(iS, 0, 0, 0);
            if (i15 > 9) {
                layoutParams4.width = ViewUtils.f(context, 22.0f);
            } else {
                textView2.setPadding(ViewUtils.f(context, 2.0f), 0, ViewUtils.f(context, 2.0f), 0);
            }
            textView2.setLayoutParams(layoutParams4);
            A1(textView2, levelInfoObj.getLevel(), false);
            int iF3 = ViewUtils.f(context, 22.0f);
            if (i15 > 21 && i15 < 28) {
                if (i15 < 24) {
                    boxAutoPlayView = new BoxAutoPlayView(context, true, R.drawable.user_level_8_bg, 0, iF3);
                } else {
                    boxAutoPlayView = i15 < 26 ? new BoxAutoPlayView(context, true, R.drawable.user_level_9_bg, 0, iF3) : new BoxAutoPlayView(context, true, R.drawable.user_level_10_bg, 0, iF3);
                }
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iF3, ViewUtils.f(context, 10.0f));
                layoutParams5.addRule(15);
                layoutParams5.setMargins(iS, 0, 0, 0);
                boxAutoPlayView.setRadius(ViewUtils.m(context, layoutParams5.width, layoutParams5.height));
                boxAutoPlayView.setLayoutParams(layoutParams5);
                relativeLayout.addView(boxAutoPlayView);
            } else if (i15 > 27) {
                AutoRotatingView autoRotatingView = new AutoRotatingView(context);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(iF3, ViewUtils.f(context, 10.0f));
                layoutParams6.addRule(15);
                layoutParams6.setMargins(iS, 0, 0, 0);
                autoRotatingView.setDisplayRoundRadius(ViewUtils.m(context, layoutParams6.width, layoutParams6.height));
                autoRotatingView.setLayoutParams(layoutParams6);
                autoRotatingView.setRotateSpeed(60.0d);
                autoRotatingView.setRotateItemSize(ViewUtils.f(context, 46.0f), ViewUtils.f(context, 46.0f));
                autoRotatingView.setRotateDrawable((BitmapDrawable) androidx.core.content.res.i.g(l0(), R.drawable.user_level_28_29_bg, null));
                autoRotatingView.j();
                relativeLayout.addView(autoRotatingView);
            }
            relativeLayout.addView(textView2);
        }
        if (relativeLayout.getChildCount() <= 0) {
            relativeLayout.setVisibility(8);
        } else {
            relativeLayout.setVisibility(0);
            relativeLayout.setOnClickListener(new m(relativeLayout, context, list, list2, levelInfoObj, str, str2));
        }
    }

    public static HashMap<String, String> n(JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject}, null, changeQuickRedirect, true, 48625, new Class[]{JsonObject.class}, HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>();
        if (jsonObject != null) {
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                try {
                    map.put(entry.getKey(), entry.getValue().getAsString());
                } catch (Throwable unused) {
                }
            }
        }
        return map;
    }

    public static String n0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48491, new Class[]{Integer.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : l0().getString(i10);
    }

    public static void n1(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48520, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    public static void o(Context context, CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{context, charSequence}, null, changeQuickRedirect, true, 48599, new Class[]{Context.class, CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        ((ClipboardManager) context.getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("Label", charSequence));
    }

    public static String[] o0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48490, new Class[]{Integer.TYPE}, String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : l0().getStringArray(i10);
    }

    public static void o1(List list, List list2) {
        if (PatchProxy.proxy(new Object[]{list, list2}, null, changeQuickRedirect, true, 48607, new Class[]{List.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        for (Object obj : list) {
            if (!list2.contains(obj)) {
                list2.add(obj);
                BBSLinkViewShowsObj bBSLinkViewShowsObjGenerateLinkViewShowInfo = null;
                if (obj instanceof LinkInfoObj) {
                    LinkInfoObj linkInfoObj = (LinkInfoObj) obj;
                    linkInfoObj.setTime("" + com.max.hbutils.utils.w.C());
                    bBSLinkViewShowsObjGenerateLinkViewShowInfo = LinkInfoObj.generateLinkViewShowInfo(linkInfoObj);
                } else if (obj instanceof RecommendBoardItem) {
                    bBSLinkViewShowsObjGenerateLinkViewShowInfo = ((RecommendBoardItem) obj).generateShowInfo();
                } else if (obj instanceof BBSLinkObj) {
                    BBSLinkObj bBSLinkObj = (BBSLinkObj) obj;
                    bBSLinkObj.setTime("" + com.max.hbutils.utils.w.C());
                    bBSLinkViewShowsObjGenerateLinkViewShowInfo = BBSLinkObj.generateLinkViewShowInfo(bBSLinkObj);
                }
                if (bBSLinkViewShowsObjGenerateLinkViewShowInfo != null) {
                    d(false, com.max.hbutils.utils.k.p(bBSLinkViewShowsObjGenerateLinkViewShowInfo));
                }
            }
        }
        f();
    }

    public static Bitmap p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48585, new Class[]{String.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : q(str, -1);
    }

    public static String p0(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 48589, new Class[]{String[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = "";
        if (strArr == null) {
            return "";
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (!com.max.hbcommon.utils.c.u(strArr[i10])) {
                str = com.max.hbcommon.utils.c.u(str) ? str + strArr[i10] : str + ";" + strArr[i10];
            }
        }
        return str;
    }

    public static void p1(RecyclerView recyclerView, List list, List list2) {
        if (PatchProxy.proxy(new Object[]{recyclerView, list, list2}, null, changeQuickRedirect, true, 48601, new Class[]{RecyclerView.class, List.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        q1(recyclerView, list, list2, BBSLinkObj.class);
    }

    public static Bitmap q(String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, null, changeQuickRedirect, true, 48586, new Class[]{String.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        return com.max.hbqrcode.b.b(str, i10);
    }

    public static int q0(String str) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48600, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i10 + 1;
            i11 = str.substring(i10, i12).matches("[Α-￥]") ? i11 + 2 : i11 + 1;
            i10 = i12;
        }
        return i11;
    }

    public static <T> void q1(RecyclerView recyclerView, List list, List list2, Class<T> cls) {
        BBSLinkViewShowsObj bBSLinkViewShowsObjGenerateLinkViewShowInfo;
        Object tag;
        if (PatchProxy.proxy(new Object[]{recyclerView, list, list2, cls}, null, changeQuickRedirect, true, 48605, new Class[]{RecyclerView.class, List.class, List.class, Class.class}, Void.TYPE).isSupported) {
            return;
        }
        RvVisiableRangeObj rvVisiableRangeObjJ0 = j0(recyclerView);
        ArrayList arrayList = new ArrayList(list);
        if (((rvVisiableRangeObjJ0.getFirst() == -1 || rvVisiableRangeObjJ0.getLast() == -1) ? 0 : (rvVisiableRangeObjJ0.getLast() - rvVisiableRangeObjJ0.getFirst()) + 1) > 0) {
            int first = rvVisiableRangeObjJ0.getFirst();
            while (true) {
                BBSLinkViewShowsObj bBSLinkViewShowsObjGenerateLinkViewShowInfo2 = null;
                if (first >= rvVisiableRangeObjJ0.getLast() + 1) {
                    break;
                }
                View viewFindViewByPosition = recyclerView.getLayoutManager().findViewByPosition(first);
                if (viewFindViewByPosition != null && cls.isInstance(viewFindViewByPosition.getTag()) && ViewUtils.f0(viewFindViewByPosition) && (tag = viewFindViewByPosition.getTag()) != null) {
                    arrayList.remove(tag);
                    if (!list.contains(tag)) {
                        if (tag instanceof EventObj) {
                            c(((EventObj) tag).getReport_extra());
                        } else {
                            if (tag instanceof LinkInfoObj) {
                                LinkInfoObj linkInfoObj = (LinkInfoObj) tag;
                                linkInfoObj.setTime("" + com.max.hbutils.utils.w.C());
                                bBSLinkViewShowsObjGenerateLinkViewShowInfo2 = LinkInfoObj.generateLinkViewShowInfo(linkInfoObj);
                            } else if (tag instanceof RecommendBoardItem) {
                                bBSLinkViewShowsObjGenerateLinkViewShowInfo2 = ((RecommendBoardItem) tag).generateShowInfo();
                            } else if (tag instanceof BBSLinkObj) {
                                BBSLinkObj bBSLinkObj = (BBSLinkObj) tag;
                                bBSLinkObj.setTime("" + com.max.hbutils.utils.w.C());
                                bBSLinkViewShowsObjGenerateLinkViewShowInfo2 = BBSLinkObj.generateLinkViewShowInfo(bBSLinkObj);
                            }
                            if (bBSLinkViewShowsObjGenerateLinkViewShowInfo2 != null) {
                                d(true, com.max.hbutils.utils.k.p(bBSLinkViewShowsObjGenerateLinkViewShowInfo2));
                            }
                        }
                        list.add(tag);
                    }
                }
                first++;
            }
            for (Object obj : arrayList) {
                if (!list2.contains(obj)) {
                    list2.add(obj);
                    if (obj instanceof LinkInfoObj) {
                        LinkInfoObj linkInfoObj2 = (LinkInfoObj) obj;
                        linkInfoObj2.setTime("" + com.max.hbutils.utils.w.C());
                        bBSLinkViewShowsObjGenerateLinkViewShowInfo = LinkInfoObj.generateLinkViewShowInfo(linkInfoObj2);
                    } else if (obj instanceof RecommendBoardItem) {
                        bBSLinkViewShowsObjGenerateLinkViewShowInfo = ((RecommendBoardItem) obj).generateShowInfo();
                    } else if (obj instanceof BBSLinkObj) {
                        BBSLinkObj bBSLinkObj2 = (BBSLinkObj) obj;
                        bBSLinkObj2.setTime("" + com.max.hbutils.utils.w.C());
                        bBSLinkViewShowsObjGenerateLinkViewShowInfo = BBSLinkObj.generateLinkViewShowInfo(bBSLinkObj2);
                    } else {
                        bBSLinkViewShowsObjGenerateLinkViewShowInfo = null;
                    }
                    d(false, bBSLinkViewShowsObjGenerateLinkViewShowInfo != null ? com.max.hbutils.utils.k.p(bBSLinkViewShowsObjGenerateLinkViewShowInfo) : null);
                }
            }
            f();
        }
    }

    public static void r() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48619, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.z(com.max.hbcache.c.f66157x0, "2");
        if (Build.VERSION.SDK_INT <= 30) {
            androidx.appcompat.app.e.N(1);
        } else {
            ((UiModeManager) BaseApplication.a().getSystemService("uimode")).setApplicationNightMode(1);
        }
    }

    public static ImageView r0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48624, new Class[]{Context.class}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewUtils.f(context, 54.0f), ViewUtils.f(context, 16.0f)));
        imageView.setImageResource(R.drawable.common_bottom_logo);
        imageView.setColorFilter(F(context, R.color.text_primary_1_color));
        return imageView;
    }

    public static void r1(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48548, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        context.sendBroadcast(new Intent(lb.a.f131079z));
    }

    public static void s() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48617, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.z(com.max.hbcache.c.f66157x0, "0");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30) {
            ((UiModeManager) BaseApplication.a().getSystemService("uimode")).setApplicationNightMode(0);
        } else if (i10 >= 29) {
            androidx.appcompat.app.e.N(-1);
        } else {
            androidx.appcompat.app.e.N(3);
        }
    }

    public static ImageView s0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48623, new Class[]{Context.class}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewUtils.f(context, 54.0f), ViewUtils.f(context, 16.0f)));
        imageView.setImageResource(R.drawable.common_bottom_logo);
        imageView.setColorFilter(F(context, R.color.white_alpha80));
        return imageView;
    }

    public static void s1(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48551, new Class[]{Context.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        Intent intent = new Intent(lb.a.U);
        intent.putExtra(lb.a.f131032r0, str);
        context.sendBroadcast(intent);
    }

    public static void t() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48618, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.z(com.max.hbcache.c.f66157x0, "1");
        if (Build.VERSION.SDK_INT <= 30) {
            androidx.appcompat.app.e.N(2);
        } else {
            ((UiModeManager) BaseApplication.a().getSystemService("uimode")).setApplicationNightMode(2);
        }
    }

    public static String t0() throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48572, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (HeyBoxApplication.f76790l == null) {
            String strF = e7.a.f(HeyBoxApplication.C());
            String channel = ChannelReaderUtil.getChannel(HeyBoxApplication.C());
            if (com.max.hbcommon.utils.c.u(channel)) {
                channel = z(HeyBoxApplication.C(), "UMENG_CHANNEL");
            }
            if (!com.max.hbcommon.utils.c.u(strF)) {
                channel = channel + "(" + strF + ")";
            }
            com.max.hbcommon.utils.d.b("zzzzchannel", "subChannel==" + strF + "    umengChannel==" + channel);
            HeyBoxApplication.f76790l = channel;
        }
        return HeyBoxApplication.f76790l;
    }

    public static void t1(Context context, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 48549, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(lb.a.Q);
        if (!com.max.hbcommon.utils.c.u(str)) {
            intent.putExtra(lb.a.f131014o0, str);
        }
        if (!com.max.hbcommon.utils.c.u(str2)) {
            intent.putExtra(lb.a.f131008n0, str2);
        }
        if (!com.max.hbcommon.utils.c.u(str3)) {
            intent.putExtra(lb.a.f131020p0, str3);
        }
        context.sendBroadcast(intent);
    }

    public static <T> T u(EncryptionParamsObj encryptionParamsObj, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{encryptionParamsObj, cls}, null, changeQuickRedirect, true, 48593, new Class[]{EncryptionParamsObj.class, Class.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        String strC = com.max.hbcommon.utils.e.c(encryptionParamsObj.getP1(), w.c(encryptionParamsObj.getP3()));
        if (a1(strC).equals(encryptionParamsObj.getP2())) {
            try {
                return (T) com.max.hbutils.utils.k.a(strC, cls);
            } catch (Exception e10) {
                if (e10 instanceof JsonSyntaxException) {
                    com.max.hbcommon.utils.d.b("zzzztest", "decrypt ==" + e10);
                    MobclickAgent.reportError(HeyBoxApplication.C(), e10);
                }
            }
        }
        return null;
    }

    public static PostEncryptParamsObj u0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48587, new Class[]{String.class}, PostEncryptParamsObj.class);
        return patchProxyResultProxy.isSupported ? (PostEncryptParamsObj) patchProxyResultProxy.result : v0(str, false);
    }

    public static void u1(Context context, HashMap<String, String> map) {
        if (PatchProxy.proxy(new Object[]{context, map}, null, changeQuickRedirect, true, 48550, new Class[]{Context.class, HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(lb.a.S);
        if (map != null) {
            intent.putExtra("extra_params", map);
        }
        context.sendBroadcast(intent);
    }

    public static String v(EncryptionParamsObj encryptionParamsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{encryptionParamsObj}, null, changeQuickRedirect, true, 48501, new Class[]{EncryptionParamsObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (encryptionParamsObj == null) {
            return null;
        }
        String strC = com.max.hbcommon.utils.e.c(encryptionParamsObj.getP1(), w.c(encryptionParamsObj.getP3()));
        String strA1 = a1(strC);
        com.max.hbcommon.utils.d.b("zzzzdecrypt", "md5js==" + strA1 + "    p2==" + encryptionParamsObj.getP2());
        if (strA1.equals(encryptionParamsObj.getP2())) {
            return strC;
        }
        com.max.hbcommon.utils.d.b("zzzzdecrypt", "not match");
        return null;
    }

    public static PostEncryptParamsObj v0(String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 48588, new Class[]{String.class, Boolean.TYPE}, PostEncryptParamsObj.class);
        return patchProxyResultProxy.isSupported ? (PostEncryptParamsObj) patchProxyResultProxy.result : com.max.hbcommon.utils.e.h(str, z10);
    }

    public static void v1(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48552, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        context.sendBroadcast(new Intent(lb.a.f130960f0));
    }

    public static String w(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48502, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        return str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }

    public static Uri w0(Context context, File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, file}, null, changeQuickRedirect, true, 48574, new Class[]{Context.class, File.class}, Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        if (file == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? FileProvider.f(context, "com.max.xiaoheihe.fileprovider", file) : Uri.fromFile(file);
    }

    public static void w1(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48547, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        context.sendBroadcast(new Intent(lb.a.P));
    }

    public static float x(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48630, new Class[]{Integer.TYPE}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : Color.alpha(i10) / 255.0f;
    }

    public static String x0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48507, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return HeyBoxApplication.C().getPackageManager().getPackageInfo(HeyBoxApplication.C().getPackageName(), 0).versionName.replace(" ", "");
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static void x1(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48545, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        y1(context, null);
    }

    public static String y() {
        File externalFilesDir;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48498, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if ("mounted".equals(Environment.getExternalStorageState()) && (externalFilesDir = HeyBoxApplication.C().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)) != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return HeyBoxApplication.C().getFilesDir().getAbsolutePath();
    }

    public static RecyclerView y0(ViewPager2 viewPager2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewPager2}, null, changeQuickRedirect, true, 48610, new Class[]{ViewPager2.class}, RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        if (viewPager2 == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewPager2.getChildCount(); i10++) {
            if (viewPager2.getChildAt(i10) instanceof RecyclerView) {
                return (RecyclerView) viewPager2.getChildAt(i10);
            }
        }
        return null;
    }

    public static void y1(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48546, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(lb.a.f131055v);
        if (!com.max.hbcommon.utils.c.u(str)) {
            intent.putExtra(lb.a.f131002m0, str);
        }
        context.sendBroadcast(intent);
    }

    public static String z(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48573, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = null;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                    string = bundle.getString(str);
                }
                com.max.heybox.hblog.g.x("getAppMetaData  key：" + str + "  value: " + string);
            } catch (PackageManager.NameNotFoundException e10) {
                com.max.heybox.hblog.g.G("getAppMetaData  key：" + str + "  error: " + e10.getMessage());
            }
        }
        return string;
    }

    private static float z0(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 48603, new Class[]{View.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        Rect rect = new Rect();
        if (!view.getLocalVisibleRect(rect)) {
            return 0.0f;
        }
        return ((rect.right - rect.left) * (rect.bottom - rect.top)) / (ViewUtils.W(view) * ViewUtils.V(view));
    }

    public static void z1(TextView textView, String str) {
        if (PatchProxy.proxy(new Object[]{textView, str}, null, changeQuickRedirect, true, 48543, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        A1(textView, str, true);
    }
}
