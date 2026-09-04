package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.ProgressBgView;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.trade.ItemStickerObj;
import com.max.xiaoheihe.bean.trade.TradeInfoObj;
import com.max.xiaoheihe.bean.trade.TradeItemFlagObj;
import com.max.xiaoheihe.bean.trade.TradeMallFollowInfo;
import com.max.xiaoheihe.bean.trade.TradePurchaseInfoObj;
import com.max.xiaoheihe.bean.trade.TradeStateCheckItemObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryGroup;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryWrapper;
import com.max.xiaoheihe.bean.trade.TradeTipsStateObj;
import com.max.xiaoheihe.bean.trade.TradeWechatDataObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.media.UMImage;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TradeInfoUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeInfoUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeInfoUtil.kt\ncom/max/xiaoheihe/module/trade/TradeInfoUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1449:1\n1#2:1450\n*E\n"})
public final class TradeInfoUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f92852a = "6";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f92853b = "小黑盒饰品交易";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<TradeWechatDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f92854b;

        a(Activity activity) {
            this.f92854b = activity;
        }

        public void onNext(@dl.d Result<TradeWechatDataObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45231, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            Activity activity = this.f92854b;
            TradeWechatDataObj result2 = result.getResult();
            kotlin.jvm.internal.f0.o(result2, "result.result");
            TradeInfoUtilKt.R(activity, result2);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45232, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeWechatDataObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class a0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a0 f92855b = new a0();
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45273, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeMallFollowInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f92856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<TradeMallFollowInfo, b2> f92857c;

        /* JADX WARN: Multi-variable type inference failed */
        b(BaseActivity baseActivity, yh.l<? super TradeMallFollowInfo, b2> lVar) {
            this.f92856b = baseActivity;
            this.f92857c = lVar;
        }

        public void onNext(@dl.d Result<TradeMallFollowInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45233, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (this.f92856b.isActive()) {
                yh.l<TradeMallFollowInfo, b2> lVar = this.f92857c;
                TradeMallFollowInfo result2 = result.getResult();
                kotlin.jvm.internal.f0.o(result2, "result.result");
                lVar.invoke(result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45234, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeMallFollowInfo>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<TextView> f92858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f92859c;

        b0(Ref.ObjectRef<TextView> objectRef, Activity activity) {
            this.f92858b = objectRef;
            this.f92859c = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TextView textView;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45274, new Class[]{View.class}, Void.TYPE).isSupported || (textView = this.f92858b.f124891b) == null) {
                return;
            }
            Activity activity = this.f92859c;
            com.max.xiaoheihe.utils.d.o(activity, textView.getText());
            com.max.hbutils.utils.c.f(activity.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f92860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92861c;

        c(BaseActivity baseActivity, yh.a<b2> aVar) {
            this.f92860b = baseActivity;
            this.f92861c = aVar;
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45235, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (this.f92860b.isActive()) {
                super.onNext(result);
                this.f92861c.invoke();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45236, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class c0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<TextView> f92862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f92863c;

        c0(Ref.ObjectRef<TextView> objectRef, Activity activity) {
            this.f92862b = objectRef;
            this.f92863c = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TextView textView;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45275, new Class[]{View.class}, Void.TYPE).isSupported || (textView = this.f92862b.f124891b) == null) {
                return;
            }
            Activity activity = this.f92863c;
            com.max.xiaoheihe.utils.d.o(activity, textView.getText());
            com.max.hbutils.utils.c.f(activity.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class d implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<EditText> f92864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92865c;

        d(Ref.ObjectRef<EditText> objectRef, yh.a<b2> aVar) {
            this.f92864b = objectRef;
            this.f92865c = aVar;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView v10, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 45243, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 != 6) {
                return false;
            }
            Editable text = this.f92864b.f124891b.getText();
            if (text == null || text.length() == 0) {
                return false;
            }
            kotlin.jvm.internal.f0.o(v10, "v");
            TradeInfoUtilKt.k(v10);
            this.f92865c.invoke();
            return true;
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class d0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f92866b;

        d0(Activity activity) {
            this.f92866b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45276, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                this.f92866b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("weixin://")));
            } catch (Exception unused) {
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class e implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<String, b2> f92867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<ImageView> f92868c;

        /* JADX WARN: Multi-variable type inference failed */
        e(yh.l<? super String, b2> lVar, Ref.ObjectRef<ImageView> objectRef) {
            this.f92867b = lVar;
            this.f92868c = objectRef;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 45246, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
            this.f92867b.invoke(s10.toString());
            String string = s10.toString();
            if (string != null && string.length() != 0) {
                z10 = false;
            }
            if (z10) {
                this.f92868c.f124891b.setVisibility(8);
            } else {
                this.f92868c.f124891b.setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45244, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45245, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class e0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e0 f92869b = new e0();
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45277, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<EditText> f92870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92871c;

        f(Ref.ObjectRef<EditText> objectRef, yh.a<b2> aVar) {
            this.f92870b = objectRef;
            this.f92871c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45247, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f92870b.f124891b.setText("");
            this.f92871c.invoke();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class f0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f92872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92873c;

        f0(BaseActivity baseActivity, String str) {
            this.f92872b = baseActivity;
            this.f92873c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45278, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f92872b, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", "交易学习");
            intent.putExtra("pageurl", lb.a.J3 + "src=" + this.f92873c);
            this.f92872b.startActivity(intent);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92874b;

        g(yh.a<b2> aVar) {
            this.f92874b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45250, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            this.f92874b.invoke();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class g0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g0 f92875b = new g0();
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45279, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92876b;

        h(yh.a<b2> aVar) {
            this.f92876b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45251, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            this.f92876b.invoke();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class h0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92877b;

        h0(Context context) {
            this.f92877b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45280, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.xiaoheihe.utils.d.H0(this.f92877b, lb.a.f130983j)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("heyboxacc://%7B%22protocol_type%22%3A%22openAcc%22%2C%22app_id%22%3A%2299934778%22%2C%22from_scheme%22%3A%22heybox%3A%2F%2F%22%7D"));
                intent.addFlags(268435456);
                com.max.xiaoheihe.utils.d.G1(this.f92877b, intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("https://acc.xiaoheihe.cn"));
            intent2.addFlags(268435456);
            com.max.xiaoheihe.utils.d.G1(this.f92877b, intent2);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92878b;

        i(yh.a<b2> aVar) {
            this.f92878b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45252, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            this.f92878b.invoke();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class i0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92879b;

        i0(yh.a<b2> aVar) {
            this.f92879b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45281, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f92879b.invoke();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92893b;

        j(yh.a<b2> aVar) {
            this.f92893b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45253, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f92893b.invoke();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class j0 extends com.max.hbcommon.base.adapter.s<TradeStateCheckItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92894b;

        /* JADX INFO: compiled from: TradeInfoUtil.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f92895b;

            a(Context context) {
                this.f92895b = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45284, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(this.f92895b)) {
                    Context context = this.f92895b;
                    context.startActivity(TradeAccountSettingActivity.f92620p2.a(context));
                }
            }
        }

        /* JADX INFO: compiled from: TradeInfoUtil.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f92896b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeStateCheckItemObj f92897c;

            b(Context context, TradeStateCheckItemObj tradeStateCheckItemObj) {
                this.f92896b = context;
                this.f92897c = tradeStateCheckItemObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45285, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Intent intent = new Intent(this.f92896b, (Class<?>) WebActionActivity.class);
                intent.putExtra("title", "帮助");
                intent.putExtra("pageurl", com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/detail/page?seq_id=" + this.f92897c.getSkip_id());
                this.f92896b.startActivity(intent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(Context context, Ref.ObjectRef<ArrayList<TradeStateCheckItemObj>> objectRef) {
            super(context, objectRef.f124891b, R.layout.item_trade_check_state);
            this.f92894b = context;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeStateCheckItemObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45282, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TradeStateCheckItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            ProgressBar progressBar = (ProgressBar) viewHolder.i(R.id.pb_progress);
            View viewI = viewHolder.i(R.id.vg_state);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_state);
            TextView textView = (TextView) viewHolder.i(R.id.tv_action);
            ((TextView) viewHolder.i(R.id.tv_desc)).setText(data.getDesc());
            if (kotlin.jvm.internal.f0.g(data.getState(), "0")) {
                progressBar.setVisibility(0);
                viewI.setVisibility(8);
            } else {
                progressBar.setVisibility(8);
                viewI.setVisibility(0);
                if (kotlin.jvm.internal.f0.g(data.getState(), "1")) {
                    viewI.setBackground(com.max.hbutils.utils.q.o(this.f92894b, R.color.lowest_discount_color, 8.0f));
                    imageView.setImageResource(R.drawable.ic_0icon_action_select_16);
                    imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                } else if (kotlin.jvm.internal.f0.g(data.getState(), "-1")) {
                    viewI.setBackground(com.max.hbutils.utils.q.o(this.f92894b, R.color.red, 8.0f));
                    imageView.setImageResource(R.drawable.ic_close_square_12);
                    imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                } else {
                    viewI.setBackground(com.max.hbutils.utils.q.o(this.f92894b, R.color.text_secondary_2_color, 8.0f));
                    imageView.setImageResource(R.drawable.ic_close_question_mark_12);
                    imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                }
            }
            if (!kotlin.jvm.internal.f0.g(data.getState(), "-1")) {
                textView.setVisibility(4);
                return;
            }
            textView.setVisibility(0);
            if (kotlin.jvm.internal.f0.g(data.getSkip_type(), "steam")) {
                textView.setBackground(com.max.hbutils.utils.q.o(this.f92894b, R.color.text_primary_1_color, 2.0f));
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                textView.setText("去设置");
                textView.setOnClickListener(new a(this.f92894b));
                return;
            }
            textView.setBackground(com.max.hbutils.utils.q.o(this.f92894b, R.color.divider_secondary_1_color, 2.0f));
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            textView.setText("帮助");
            textView.setOnClickListener(new b(this.f92894b, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, TradeStateCheckItemObj tradeStateCheckItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeStateCheckItemObj}, this, changeQuickRedirect, false, 45283, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeStateCheckItemObj);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<ViewGroup> f92898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<TradeItemFlagObj> f92899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f92900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f92901e;

        k(Ref.ObjectRef<ViewGroup> objectRef, List<TradeItemFlagObj> list, com.max.hbcommon.base.adapter.s.e eVar, Context context) {
            this.f92898b = objectRef;
            this.f92899c = list;
            this.f92900d = eVar;
            this.f92901e = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextView textView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45254, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f92898b.f124891b.setBackgroundResource(R.color.transparent);
            int iW = ViewUtils.W(this.f92898b.f124891b);
            com.max.hbcommon.utils.d.b("zzzztest", "flag width=" + iW);
            int i10 = 0;
            int i11 = 0;
            for (TradeItemFlagObj tradeItemFlagObj : this.f92899c) {
                int i12 = i10 + 1;
                if (this.f92900d.d() == R.layout.item_inventory_group_put_on && i10 > 0) {
                    break;
                }
                if (i10 <= this.f92898b.f124891b.getChildCount() - 1) {
                    View childAt = this.f92898b.f124891b.getChildAt(i10);
                    kotlin.jvm.internal.f0.n(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) childAt;
                } else {
                    textView = new TextView(this.f92901e);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (i10 > 0) {
                    layoutParams.leftMargin = ViewUtils.f(this.f92901e, 6.0f);
                } else {
                    layoutParams.leftMargin = 0;
                }
                textView.setText(tradeItemFlagObj.getDesc());
                textView.setGravity(17);
                textView.setPadding(ViewUtils.f(this.f92901e, 4.0f), 0, ViewUtils.f(this.f92901e, 4.0f), 0);
                textView.setBackgroundDrawable(com.max.hbutils.utils.q.O(com.max.hbutils.utils.q.o(this.f92901e, R.color.transparent, 1.0f), this.f92901e, com.max.xiaoheihe.utils.d.e1(tradeItemFlagObj.getColor()), 0.5f));
                textView.setIncludeFontPadding(false);
                textView.setTextSize(1, 10.0f);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(com.max.xiaoheihe.utils.d.e1(tradeItemFlagObj.getColor()));
                int iW2 = ViewUtils.W(textView) + layoutParams.leftMargin;
                if (iW2 > iW) {
                    break;
                }
                if (this.f92898b.f124891b.indexOfChild(textView) == -1) {
                    this.f92898b.f124891b.addView(textView, layoutParams);
                } else {
                    textView.setLayoutParams(layoutParams);
                }
                i11++;
                iW -= iW2;
                i10 = i12;
            }
            if (this.f92898b.f124891b.getChildCount() > i11) {
                ViewGroup viewGroup = this.f92898b.f124891b;
                viewGroup.removeViews(i11, viewGroup.getChildCount() - i11);
            }
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class k0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92903c;

        k0(Context context, String str) {
            this.f92902b = context;
            this.f92903c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45286, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeInfoUtilKt.o(this.f92902b, false, this.f92903c, 2, null);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<View> f92905c;

        l(Context context, Ref.ObjectRef<View> objectRef) {
            this.f92904b = context;
            this.f92905c = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45255, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(this.f92904b)) {
                com.max.hbcache.c.C("last_trade_msg_tap_time", com.max.hbcache.c.o("trade_msg_tap_time", ""));
                this.f92904b.sendBroadcast(new Intent(lb.a.N));
                Context context = this.f92904b;
                context.startActivity(TradeMsgActivity.P.a(context));
                this.f92905c.f124891b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class l0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92906b;

        l0(yh.a<b2> aVar) {
            this.f92906b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45287, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f92906b.invoke();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92907b;

        m(Context context) {
            this.f92907b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45256, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(this.f92907b)) {
                Context context = this.f92907b;
                context.startActivity(TradeAssistantActivity.X.a(context));
            }
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<View> f92909c;

        n(Context context, Ref.ObjectRef<View> objectRef) {
            this.f92908b = context;
            this.f92909c = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45257, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(this.f92908b)) {
                com.max.hbcache.c.C("last_trade_msg_tap_time", com.max.hbcache.c.o("trade_msg_tap_time", ""));
                this.f92908b.sendBroadcast(new Intent(lb.a.N));
                Context context = this.f92908b;
                context.startActivity(TradeMsgActivity.P.a(context));
                this.f92909c.f124891b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92911b;

        o(Context context) {
            this.f92911b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45258, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(this.f92911b)) {
                Context context = this.f92911b;
                context.startActivity(TradeAssistantActivity.X.a(context));
            }
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92912b;

        p(Context context) {
            this.f92912b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45259, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.xiaoheihe.utils.i0.e(this.f92912b)) {
                Context context = this.f92912b;
                context.startActivity(TradeAccountSettingActivity.f92620p2.a(context));
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class q implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f92913b = new q();
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45260, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class r implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92914b;

        r(Context context) {
            this.f92914b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45261, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.xiaoheihe.utils.i0.e(this.f92914b)) {
                Context context = this.f92914b;
                context.startActivity(ItemTradeCenterActivity.U.b(context, "me"));
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class s implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f92915b = new s();
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45262, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class t implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92924b;

        t(yh.a<b2> aVar) {
            this.f92924b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45263, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            this.f92924b.invoke();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f92925b;

        u(AppCompatActivity appCompatActivity) {
            this.f92925b = appCompatActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45264, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f92925b, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", "绑定短信通知");
            intent.putExtra("pageurl", lb.a.N3);
            this.f92925b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f92926b;

        v(AppCompatActivity appCompatActivity) {
            this.f92926b = appCompatActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45265, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeInfoUtilKt.d(this.f92926b);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f92927b;

        w(AppCompatActivity appCompatActivity) {
            this.f92927b = appCompatActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45266, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.B0(this.f92927b);
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class x implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.utils.l0.g f92928b;

        x(com.max.xiaoheihe.utils.l0.g gVar) {
            this.f92928b = gVar;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 45267, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f92928b.a();
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<com.max.hbcommon.component.i> f92929b;

        y(Ref.ObjectRef<com.max.hbcommon.component.i> objectRef) {
            this.f92929b = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45271, new Class[]{View.class}, Void.TYPE).isSupported && this.f92929b.f124891b.isShowing()) {
                this.f92929b.f124891b.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: TradeInfoUtil.kt */
    public static final class z implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92930b;

        z(yh.a<b2> aVar) {
            this.f92930b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45272, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f92930b.invoke();
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, android.view.View] */
    public static final void A(@dl.d Context mContext, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeSteamInventoryObj data, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mContext, viewHolder, data, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 45189, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, TradeSteamInventoryObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_special);
        ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_rarity_tag);
        ImageView imageView3 = (ImageView) viewHolder.i(R.id.iv_item_img);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = viewHolder.i(R.id.vg_tag);
        TextView textView = (TextView) viewHolder.i(R.id.tv_name);
        Integer special = data.getSpecial();
        if (special != null && special.intValue() == 1) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.item_special_st);
        } else if (special != null && special.intValue() == 2) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.item_special_souvenir);
        } else {
            imageView.setVisibility(8);
        }
        int iW = ViewUtils.W(imageView2);
        imageView2.setBackgroundDrawable(ViewUtils.D(iW, iW, 1, com.max.xiaoheihe.utils.d.e1(data.getRarity_color())));
        com.max.hbimage.b.L(data.getImg_url(), imageView3, R.drawable.item_trade_placeholder);
        if (textView != null) {
            textView.setText(data.getName());
        }
        if (!z10 || objectRef.f124891b == 0) {
            return;
        }
        List<TradeItemFlagObj> flags = data.getFlags();
        if (flags != null) {
            ((ViewGroup) objectRef.f124891b).post(new k(objectRef, flags, viewHolder, mContext));
        } else {
            ((ViewGroup) objectRef.f124891b).removeAllViews();
        }
    }

    public static /* synthetic */ void B(Context context, com.max.hbcommon.base.adapter.s.e eVar, TradeSteamInventoryObj tradeSteamInventoryObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{context, eVar, tradeSteamInventoryObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 45190, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, TradeSteamInventoryObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        A(context, eVar, tradeSteamInventoryObj, z10);
    }

    public static final void C(@dl.d ViewGroup vg_state, @dl.e Integer num, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{vg_state, num, str}, null, changeQuickRedirect, true, 45179, new Class[]{ViewGroup.class, Integer.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(vg_state, "vg_state");
        View viewFindViewById = vg_state.findViewById(R.id.iv_trade_state);
        kotlin.jvm.internal.f0.o(viewFindViewById, "vg_state.findViewById(R.id.iv_trade_state)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = vg_state.findViewById(R.id.tv_trade_state);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "vg_state.findViewById(R.id.tv_trade_state)");
        TextView textView = (TextView) viewFindViewById2;
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 5)) {
            imageView.setImageResource(R.drawable.state_deal_ban);
            if (str == null || str.length() == 0) {
                str = (num != null && num.intValue() == 5) ? "不可交易" : "不可出售";
            }
            textView.setText(str);
            vg_state.setBackgroundDrawable(com.max.hbutils.utils.q.o(vg_state.getContext(), R.color.delete_red, 2.0f));
            return;
        }
        if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
            imageView.setImageResource(R.drawable.state_deal_warn);
            if (str == null || str.length() == 0) {
                str = (num != null && num.intValue() == 3) ? "冻结出售" : "交易暂挂";
            }
            textView.setText(str);
            vg_state.setBackgroundDrawable(com.max.hbutils.utils.q.o(vg_state.getContext(), R.color.gold_light, 2.0f));
            return;
        }
        if (num == null || num.intValue() != 1) {
            vg_state.setVisibility(8);
            return;
        }
        imageView.setImageResource(R.drawable.state_deal_normal);
        if (str == null || str.length() == 0) {
            str = "正常交易";
        }
        textView.setText(str);
        vg_state.setBackgroundDrawable(com.max.hbutils.utils.q.o(vg_state.getContext(), R.color.lowest_discount_color, 2.0f));
    }

    public static final void D(@dl.d Context mContext, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeSteamInventoryWrapper data) {
        if (PatchProxy.proxy(new Object[]{mContext, viewHolder, data}, null, changeQuickRedirect, true, 45194, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, TradeSteamInventoryWrapper.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        View viewI = viewHolder.i(R.id.vg_warn);
        TextView textView = (TextView) viewHolder.i(R.id.tv_warn_desc);
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_warn_tag);
        TradeSteamInventoryGroup itemGroup = data.getItemGroup();
        kotlin.jvm.internal.f0.m(itemGroup);
        char c10 = 0;
        loop0: for (TradeSteamInventoryObj tradeSteamInventoryObj : itemGroup.getItems()) {
            List<TradeItemFlagObj> flags = tradeSteamInventoryObj.getFlags();
            if (!(flags == null || flags.isEmpty())) {
                List<TradeItemFlagObj> flags2 = tradeSteamInventoryObj.getFlags();
                kotlin.jvm.internal.f0.m(flags2);
                for (TradeItemFlagObj tradeItemFlagObj : flags2) {
                    if (kotlin.jvm.internal.f0.g(tradeItemFlagObj.is_special(), "1")) {
                        if (c10 >= 3) {
                            break loop0;
                        }
                        c10 = 3;
                        break loop0;
                    } else if (kotlin.jvm.internal.f0.g(tradeItemFlagObj.getDesc(), "改名") && c10 < 1) {
                        c10 = 1;
                    }
                }
            }
            List<ItemStickerObj> stickers = tradeSteamInventoryObj.getStickers();
            if (!(stickers == null || stickers.isEmpty()) && c10 < 2) {
                c10 = 2;
            }
        }
        if (c10 == 1 || c10 == 2) {
            viewI.setVisibility(0);
            textView.setText(c10 == 2 ? "饰品中含有印花，请谨慎定价!" : "饰品中含有已改名饰品，请谨慎定价!");
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
            return;
        }
        if (c10 != 3) {
            viewI.setVisibility(8);
            return;
        }
        viewI.setVisibility(0);
        textView.setText("饰品中含有特殊效果饰品，请谨慎定价!");
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
    }

    private static final void E(TextView textView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 45212, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView.setBackgroundResource(R.drawable.divider_color_concept_2dp);
            textView.setText("已开启");
            textView.setEnabled(false);
            return;
        }
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        textView.setBackgroundResource(R.drawable.text_primary_2dp);
        textView.setEnabled(true);
        textView.setText("去开启");
    }

    public static final void F(@dl.e ProgressBgView progressBgView) {
        if (PatchProxy.proxy(new Object[]{progressBgView}, null, changeQuickRedirect, true, 45187, new Class[]{ProgressBgView.class}, Void.TYPE).isSupported || progressBgView == null) {
            return;
        }
        progressBgView.setBackgroundAsTile(R.drawable.trade_bg_indeterminate_progressbar_18x6);
        progressBgView.b();
        progressBgView.setBackgroundResource(R.color.text_primary_1_color);
    }

    public static final void G(@dl.e ProgressBgView progressBgView) {
        if (PatchProxy.proxy(new Object[]{progressBgView}, null, changeQuickRedirect, true, 45188, new Class[]{ProgressBgView.class}, Void.TYPE).isSupported || progressBgView == null) {
            return;
        }
        progressBgView.setBackgroundAsTile(R.drawable.trade_bg_indeterminate_progressbar_18x6);
        progressBgView.b();
        progressBgView.setBackgroundResource(R.color.badge_bg_color);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.view.View] */
    public static final void H(@dl.d Context context, @dl.d TitleBar mToolbar, @dl.d String title) {
        if (PatchProxy.proxy(new Object[]{context, mToolbar, title}, null, changeQuickRedirect, true, 45196, new Class[]{Context.class, TitleBar.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(mToolbar, "mToolbar");
        kotlin.jvm.internal.f0.p(title, "title");
        mToolbar.setBackIconInvisible();
        mToolbar.setTitle(title);
        mToolbar.setLeftActionIcon(R.drawable.appbar_msg);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = mToolbar.findViewById(R.id.iv_left_action_point);
        mToolbar.findViewById(R.id.iv_left_action_point_x);
        mToolbar.setLeftActionIconOnClickListener(new l(context, objectRef));
        mToolbar.setLeftActionXIcon(R.drawable.common_robot_24x24);
        mToolbar.setLeftActionXIconOnClickListener(new m(context));
        ImageView appbarLeftActionButtonView = mToolbar.getAppbarLeftActionButtonView();
        if (appbarLeftActionButtonView != null) {
            appbarLeftActionButtonView.setPadding(ViewUtils.f(context, 12.0f), 0, ViewUtils.f(context, 14.0f), 0);
        }
        ImageView appbarLeftActionButtonXView = mToolbar.getAppbarLeftActionButtonXView();
        if (appbarLeftActionButtonXView != null) {
            appbarLeftActionButtonXView.setPadding(0, 0, ViewUtils.f(context, 14.0f), 0);
        }
        w(context, mToolbar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.view.View] */
    public static final void I(@dl.d Context context, @dl.d TitleBar mToolbar) {
        if (PatchProxy.proxy(new Object[]{context, mToolbar}, null, changeQuickRedirect, true, 45197, new Class[]{Context.class, TitleBar.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(mToolbar, "mToolbar");
        mToolbar.setActionIcon(R.drawable.appbar_msg);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = mToolbar.findViewById(R.id.iv_action_point);
        mToolbar.setActionIconOnClickListener(new n(context, objectRef));
        mToolbar.setActionXIcon(R.drawable.common_robot_24x24);
        mToolbar.setActionXIconOnClickListener(new o(context));
        mToolbar.getAppbarActionButtonView().setPadding(ViewUtils.f(context, 7.0f), 0, ViewUtils.f(context, 14.0f), 0);
        mToolbar.getAppbarActionButtonXView().setPadding(ViewUtils.f(context, 7.0f), 0, ViewUtils.f(context, 7.0f), 0);
        x(context, mToolbar);
    }

    public static final void J(@dl.d Context mContext, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{mContext, str}, null, changeQuickRedirect, true, 45207, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(mContext);
        if (str == null || str.length() == 0) {
            str = "请完善Steam交易信息（公开库存、交易链接、API KEY）";
        }
        fVar.y(str).u("去设置", new p(mContext)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), q.f92913b);
        fVar.F();
    }

    public static /* synthetic */ void K(Context context, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{context, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 45208, new Class[]{Context.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        J(context, str);
    }

    public static final void L(@dl.d Context mContext) {
        if (PatchProxy.proxy(new Object[]{mContext}, null, changeQuickRedirect, true, 45209, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(mContext);
        fVar.y("该功能需要绑定Steam账号使用").u("去绑定", new r(mContext)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), s.f92915b);
        fVar.F();
    }

    public static final void M(@dl.d com.max.hbcommon.base.f baseView, @dl.d String time, @dl.d yh.a<b2> onconfirm) {
        if (PatchProxy.proxy(new Object[]{baseView, time, onconfirm}, null, changeQuickRedirect, true, 45222, new Class[]{com.max.hbcommon.base.f.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(baseView, "baseView");
        kotlin.jvm.internal.f0.p(time, "time");
        kotlin.jvm.internal.f0.p(onconfirm, "onconfirm");
        if (baseView.isActive()) {
            View viewInflate = LayoutInflater.from(baseView.getViewContext()).inflate(R.layout.dialog_trade_offer_confirm, (ViewGroup) null, false);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_year_desc);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_month_desc);
            TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_day_desc);
            bb.d.d(textView3, 5);
            bb.d.d(textView4, 5);
            bb.d.d(textView5, 5);
            textView.setText("前往steam核对求购方加入时间,\n并进行令牌确认");
            textView2.setText("确认后请等待求购方接受报价");
            String strI = com.max.hbutils.utils.w.i(time, "yyyy-MM-dd");
            List listU4 = strI != null ? StringsKt__StringsKt.U4(strI, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, null) : null;
            if (listU4 != null) {
                textView3.setText((CharSequence) listU4.get(0));
                textView4.setText((CharSequence) listU4.get(1));
                textView5.setText((CharSequence) listU4.get(2));
            }
            com.max.hbcommon.view.a.f fVarI = new com.max.hbcommon.view.a.f(baseView.getViewContext()).i(viewInflate);
            fVarI.u("我知道了", new t(onconfirm));
            fVarI.w(true);
            fVarI.F();
        }
    }

    private static final void N(final AppCompatActivity appCompatActivity, com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{appCompatActivity, gVar}, null, changeQuickRedirect, true, 45215, new Class[]{AppCompatActivity.class, com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported || appCompatActivity.isFinishing()) {
            return;
        }
        View viewInflate = LayoutInflater.from(appCompatActivity).inflate(R.layout.dialog_trade_notify_tips, (ViewGroup) null);
        final TextView tv_push_note = (TextView) viewInflate.findViewById(R.id.tv_push_note);
        final TextView tv_push_wechat = (TextView) viewInflate.findViewById(R.id.tv_push_wechat);
        final TextView tv_push_app = (TextView) viewInflate.findViewById(R.id.tv_push_app);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(appCompatActivity).y("收货发货不错过").i(viewInflate).w(true).d();
        boolean zG = kotlin.jvm.internal.f0.g("1", com.max.hbcache.c.o("trade_sms_push", ""));
        boolean zG2 = kotlin.jvm.internal.f0.g("1", com.max.hbcache.c.o("trade_wechat_push", ""));
        boolean zN0 = com.max.xiaoheihe.utils.d.N0(appCompatActivity);
        kotlin.jvm.internal.f0.o(tv_push_note, "tv_push_note");
        E(tv_push_note, zG);
        kotlin.jvm.internal.f0.o(tv_push_wechat, "tv_push_wechat");
        E(tv_push_wechat, zG2);
        kotlin.jvm.internal.f0.o(tv_push_app, "tv_push_app");
        E(tv_push_app, zN0);
        tv_push_note.setOnClickListener(new u(appCompatActivity));
        tv_push_wechat.setOnClickListener(new v(appCompatActivity));
        tv_push_app.setOnClickListener(new w(appCompatActivity));
        aVarD.show();
        aVarD.setOnDismissListener(new x(gVar));
        aVarD.d().setPadding(0, ViewUtils.f(appCompatActivity, 14.0f), 0, 0);
        appCompatActivity.getLifecycle().a(new androidx.lifecycle.x() { // from class: com.max.xiaoheihe.module.trade.TradeInfoUtilKt$showTradeNotificationDialog$5
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: TradeInfoUtil.kt */
            public static final class a extends com.max.hbcommon.network.d<Result<TradeTipsStateObj>> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ AppCompatActivity f92920b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ TextView f92921c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ TextView f92922d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ TextView f92923e;

                a(AppCompatActivity appCompatActivity, TextView textView, TextView textView2, TextView textView3) {
                    this.f92920b = appCompatActivity;
                    this.f92921c = textView;
                    this.f92922d = textView2;
                    this.f92923e = textView3;
                }

                public void onNext(@dl.d Result<TradeTipsStateObj> tipsStateObjResult) {
                    if (PatchProxy.proxy(new Object[]{tipsStateObjResult}, this, changeQuickRedirect, false, 45269, new Class[]{Result.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(tipsStateObjResult, "tipsStateObjResult");
                    if (this.f92920b.isFinishing()) {
                        return;
                    }
                    TradeTipsStateObj result = tipsStateObjResult.getResult();
                    if (result != null) {
                        com.max.hbcache.c.C("trade_wechat_push", result.getWechat_push());
                        com.max.hbcache.c.C("trade_sms_push", result.getSms_push());
                    }
                    TradeTipsStateObj result2 = tipsStateObjResult.getResult();
                    boolean zG = f0.g("1", result2 != null ? result2.getSms_push() : null);
                    TradeTipsStateObj result3 = tipsStateObjResult.getResult();
                    boolean zG2 = f0.g("1", result3 != null ? result3.getWechat_push() : null);
                    boolean zN0 = com.max.xiaoheihe.utils.d.N0(this.f92920b);
                    TextView tv_push_note = this.f92921c;
                    f0.o(tv_push_note, "tv_push_note");
                    TradeInfoUtilKt.b(tv_push_note, zG);
                    TextView tv_push_wechat = this.f92922d;
                    f0.o(tv_push_wechat, "tv_push_wechat");
                    TradeInfoUtilKt.b(tv_push_wechat, zG2);
                    TextView tv_push_app = this.f92923e;
                    f0.o(tv_push_app, "tv_push_app");
                    TradeInfoUtilKt.b(tv_push_app, zN0);
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45270, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    onNext((Result<TradeTipsStateObj>) obj);
                }
            }

            @k0(Lifecycle.Event.ON_RESUME)
            public final void onActivityResume() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45268, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (!(appCompatActivity instanceof ItemTradeCenterActivity)) {
                    i.a().l1().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(appCompatActivity, tv_push_note, tv_push_wechat, tv_push_app));
                    return;
                }
                boolean zG3 = f0.g("1", com.max.hbcache.c.o("trade_sms_push", ""));
                boolean zG4 = f0.g("1", com.max.hbcache.c.o("trade_wechat_push", ""));
                boolean zN1 = com.max.xiaoheihe.utils.d.N0(appCompatActivity);
                TextView tv_push_note2 = tv_push_note;
                f0.o(tv_push_note2, "tv_push_note");
                TradeInfoUtilKt.b(tv_push_note2, zG3);
                TextView tv_push_wechat2 = tv_push_wechat;
                f0.o(tv_push_wechat2, "tv_push_wechat");
                TradeInfoUtilKt.b(tv_push_wechat2, zG4);
                TextView tv_push_app2 = tv_push_app;
                f0.o(tv_push_app2, "tv_push_app");
                TradeInfoUtilKt.b(tv_push_app2, zN1);
            }
        });
        com.max.hbcache.c.z("trade_notify_dialog_show", String.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.max.hbcommon.component.i] */
    @dl.d
    public static final com.max.hbcommon.component.i O(@dl.d Context mContext) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext}, null, changeQuickRedirect, true, 45218, new Class[]{Context.class}, com.max.hbcommon.component.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.component.i) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        View viewInflate = LayoutInflater.from(mContext).inflate(R.layout.dialog_trade_state_check, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(mContext, 2.0f));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = new com.max.hbcommon.component.i(mContext, true, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_bg);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_confirm);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_close);
        textView.setBackground(com.max.hbutils.utils.q.o(mContext, R.color.divider_secondary_1_color, 2.0f));
        textView.setText("检测中");
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        ((com.max.hbcommon.component.i) objectRef.f124891b).setContentView(viewInflate);
        ((com.max.hbcommon.component.i) objectRef.f124891b).setCancelable(true);
        y yVar = new y(objectRef);
        viewFindViewById.setOnClickListener(yVar);
        imageView.setOnClickListener(yVar);
        textView.setOnClickListener(yVar);
        return (com.max.hbcommon.component.i) objectRef.f124891b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x019a  */
    public static final void P(@dl.d Context mContext, @dl.d String title, @dl.d String message, @dl.d String countDesc, @dl.d String countValue, @dl.d String rateDesc, @dl.d String rateValue, @dl.d String profitDesc, @dl.d String profitValue, @dl.e String str, @dl.d yh.a<b2> block) {
        int i10;
        String str2;
        if (PatchProxy.proxy(new Object[]{mContext, title, message, countDesc, countValue, rateDesc, rateValue, profitDesc, profitValue, str, block}, null, changeQuickRedirect, true, 45219, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(title, "title");
        kotlin.jvm.internal.f0.p(message, "message");
        kotlin.jvm.internal.f0.p(countDesc, "countDesc");
        kotlin.jvm.internal.f0.p(countValue, "countValue");
        kotlin.jvm.internal.f0.p(rateDesc, "rateDesc");
        kotlin.jvm.internal.f0.p(rateValue, "rateValue");
        kotlin.jvm.internal.f0.p(profitDesc, "profitDesc");
        kotlin.jvm.internal.f0.p(profitValue, "profitValue");
        kotlin.jvm.internal.f0.p(block, "block");
        View viewInflate = LayoutInflater.from(mContext).inflate(R.layout.dialog_trade_puton_info, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = ViewUtils.f(mContext, 10.0f);
        marginLayoutParams.bottomMargin = ViewUtils.f(mContext, 10.0f);
        viewInflate.setLayoutParams(marginLayoutParams);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_count_desc);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_rate_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_profit_desc);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_count);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_fee_rate);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.tv_fee_rate_symbol);
        TextView textView7 = (TextView) viewInflate.findViewById(R.id.tv_profit);
        TextView textView8 = (TextView) viewInflate.findViewById(R.id.tv_profit_symbol);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_hcash_info);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_item);
        TextView textView9 = (TextView) viewInflate.findViewById(R.id.tv_hcash);
        View viewFindViewById3 = viewInflate.findViewById(R.id.vg_item_profit);
        viewFindViewById2.setBackground(com.max.hbutils.utils.q.o(mContext, R.color.white, 4.0f));
        bb.d.d(textView4, 5);
        bb.d.d(textView5, 5);
        bb.d.d(textView6, 5);
        bb.d.d(textView7, 5);
        bb.d.d(textView8, 5);
        textView.setText(countDesc);
        textView2.setText(rateDesc);
        textView3.setText(profitDesc);
        textView4.setText(countValue);
        textView5.setText(rateValue);
        textView7.setText(profitValue);
        if (profitDesc.length() == 0) {
            if (profitValue.length() == 0) {
                i10 = 8;
                viewFindViewById3.setVisibility(8);
            } else {
                i10 = 8;
                viewFindViewById3.setVisibility(0);
            }
        } else {
            i10 = 8;
            viewFindViewById3.setVisibility(0);
        }
        if (str == null || str.length() == 0) {
            viewFindViewById.setVisibility(i10);
            str2 = "确定";
        } else {
            viewFindViewById.setVisibility(0);
            textView9.setText(str);
            str2 = "余额支付";
        }
        com.max.hbcommon.view.a.f fVarO = new com.max.hbcommon.view.a.f(mContext).y(title).i(viewInflate).u(str2, new z(block)).o(mContext.getString(R.string.cancel), a0.f92855b);
        fVarO.w(false);
        if (!com.max.hbcommon.utils.c.u(message)) {
            fVarO.l(message);
        }
        fVarO.F().f().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
    }

    public static /* synthetic */ void Q(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, yh.a aVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, aVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 45220, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        P(context, str, str2, str3, str4, str5, str6, str7, str8, (i10 & 512) != 0 ? null : str9, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, android.view.View] */
    public static final void R(@dl.d Activity mContext, @dl.d TradeWechatDataObj data) {
        if (PatchProxy.proxy(new Object[]{mContext, data}, null, changeQuickRedirect, true, 45214, new Class[]{Activity.class, TradeWechatDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(data, "data");
        if (mContext.isFinishing()) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(mContext);
        View viewInflate = LayoutInflater.from(mContext).inflate(R.layout.dialog_trade_wechat_bind, (ViewGroup) null, false);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = viewInflate.findViewById(R.id.tv_number_id);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.f124891b = viewInflate.findViewById(R.id.tv_dynamic_code);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_id);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_code);
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_id_copy);
        View viewFindViewById4 = viewInflate.findViewById(R.id.tv_code_copy);
        viewFindViewById.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(mContext, R.color.white, 2.0f), mContext, R.color.divider_secondary_1_color, 0.5f));
        viewFindViewById2.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(mContext, R.color.white, 2.0f), mContext, R.color.divider_secondary_1_color, 0.5f));
        TextView textView = (TextView) objectRef.f124891b;
        if (textView != null) {
            textView.setText(data.getAccount_id());
        }
        TextView textView2 = (TextView) objectRef2.f124891b;
        if (textView2 != null) {
            textView2.setText(data.getCode());
        }
        viewFindViewById3.setOnClickListener(new b0(objectRef, mContext));
        viewFindViewById4.setOnClickListener(new c0(objectRef2, mContext));
        fVar.y("微信通知").i(viewInflate).u("前往微信", new d0(mContext)).g(true).o("取消", e0.f92869b);
        fVar.F();
        viewInflate.getLayoutParams().width = -1;
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(mContext, 16.0f);
        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = ViewUtils.f(mContext, 23.0f);
    }

    public static final void S(@dl.d BaseActivity mContext, @dl.d String src) {
        if (PatchProxy.proxy(new Object[]{mContext, src}, null, changeQuickRedirect, true, 45210, new Class[]{BaseActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(src, "src");
        if (!mContext.isActive() || mContext.isFinishing()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(mContext);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(R.drawable.ic_trade_exam);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.setPadding(0, ViewUtils.f(mContext, 16.0f), 0, ViewUtils.f(mContext, 12.0f));
        frameLayout.addView(imageView, layoutParams);
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(mContext).A(frameLayout).y(kotlin.jvm.internal.f0.g("purchase", src) ? "求购须知" : "上架须知").l(kotlin.jvm.internal.f0.g("purchase", src) ? "您正在使用求购功能，进行操作前请先学习求购功能流程并完成考试" : "您正在使用卖家自售交易模式，上架前请先学习交易教程并完成考试");
        fVarL.u("前往学习", new f0(mContext, src));
        fVarL.o(mContext.getString(R.string.cancel), g0.f92875b);
        fVarL.w(false);
        TextView textViewF = fVarL.F().f();
        ViewGroup.LayoutParams layoutParams2 = textViewF.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(mContext, 10.0f);
        textViewF.setTextSize(1, 12.0f);
        textViewF.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
    }

    public static /* synthetic */ void T(BaseActivity baseActivity, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 45211, new Class[]{BaseActivity.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            str = "exam";
        }
        S(baseActivity, str);
    }

    public static final void U(@dl.d Context context, boolean z10, @dl.d yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), callback}, null, changeQuickRedirect, true, 45185, new Class[]{Context.class, Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(callback, "callback");
        if (!z10 && com.max.hbcommon.utils.i.d()) {
            callback.invoke();
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(context);
        fVar.y("开启加速器").l("该功能需要访问任天堂页面，建议使用小黑盒加速器加速小黑盒任天堂").u("启动加速", new h0(context)).o("我已开启", new i0(callback));
        fVar.F();
    }

    public static /* synthetic */ void V(Context context, boolean z10, yh.a aVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), aVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 45186, new Class[]{Context.class, Boolean.TYPE, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        U(context, z10, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
    public static final void W(@dl.d Context mContext, @dl.d Result<StateObj> result, @dl.d com.max.hbcommon.component.i mDialog, int i10) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{mContext, result, mDialog, new Integer(i10)}, null, changeQuickRedirect, true, 45217, new Class[]{Context.class, Result.class, com.max.hbcommon.component.i.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(result, "result");
        kotlin.jvm.internal.f0.p(mDialog, "mDialog");
        RecyclerView recyclerView = (RecyclerView) mDialog.j().findViewById(R.id.rv);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = new ArrayList();
        TextView textView = (TextView) mDialog.j().findViewById(R.id.tv_confirm);
        ArrayList arrayList = (ArrayList) objectRef.f124891b;
        StateObj result2 = result.getResult();
        kotlin.jvm.internal.f0.m(result2);
        arrayList.addAll(result2.getCheck_results());
        Iterator it = ((ArrayList) objectRef.f124891b).iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.f0.g(((TradeStateCheckItemObj) it.next()).getState(), "0")) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            textView.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(mContext, R.color.white, 2.0f), mContext, R.color.text_secondary_2_color, 0.5f));
            textView.setText("我知道了");
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        } else if (i10 > 10) {
            textView.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(mContext, R.color.white, 2.0f), mContext, R.color.text_secondary_2_color, 0.5f));
            textView.setText("检测失败，请稍后再试");
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        } else {
            textView.setBackground(com.max.hbutils.utils.q.o(mContext, R.color.divider_secondary_1_color, 2.0f));
            textView.setText("检测中");
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        }
        recyclerView.setAdapter(new j0(mContext, objectRef));
    }

    @xh.i
    public static final void X(@dl.d Context context, @dl.d yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{context, callback}, null, changeQuickRedirect, true, 45228, new Class[]{Context.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(callback, "callback");
        b0(context, false, null, null, callback, 14, null);
    }

    @xh.i
    public static final void Y(@dl.d Context context, boolean z10, @dl.e String str, @dl.e String str2, @dl.d yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, callback}, null, changeQuickRedirect, true, 45180, new Class[]{Context.class, Boolean.TYPE, String.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(callback, "callback");
        if (!z10 && com.max.hbcommon.utils.i.d()) {
            callback.invoke();
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(context);
        com.max.hbcommon.view.a.f fVarY = fVar.y("开启加速器");
        if (str2 == null) {
            str2 = com.max.xiaoheihe.utils.d.n0(R.string.acc_steam_tips);
        }
        fVarY.l(str2).u("启动加速", new k0(context, str)).o("我已开启", new l0(callback));
        fVar.F();
    }

    @xh.i
    public static final void Z(@dl.d Context context, boolean z10, @dl.e String str, @dl.d yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), str, callback}, null, changeQuickRedirect, true, 45226, new Class[]{Context.class, Boolean.TYPE, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(callback, "callback");
        b0(context, z10, str, null, callback, 8, null);
    }

    public static final /* synthetic */ void a(BaseActivity baseActivity, String str, String str2, boolean z10, yh.a aVar) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), aVar}, null, changeQuickRedirect, true, 45229, new Class[]{BaseActivity.class, String.class, String.class, Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        j(baseActivity, str, str2, z10, aVar);
    }

    @xh.i
    public static final void a0(@dl.d Context context, boolean z10, @dl.d yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), callback}, null, changeQuickRedirect, true, 45227, new Class[]{Context.class, Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(callback, "callback");
        b0(context, z10, null, null, callback, 12, null);
    }

    public static final /* synthetic */ void b(TextView textView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 45230, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        E(textView, z10);
    }

    public static /* synthetic */ void b0(Context context, boolean z10, String str, String str2, yh.a aVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, aVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 45181, new Class[]{Context.class, Boolean.TYPE, String.class, String.class, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        Y(context, (i10 & 2) == 0 ? z10 ? 1 : 0 : false, (i10 & 4) != 0 ? null : str, (i10 & 8) == 0 ? str2 : null, aVar);
    }

    public static final void c(@dl.d AppCompatActivity mContext, @dl.d com.max.xiaoheihe.utils.l0.g actiton) {
        if (PatchProxy.proxy(new Object[]{mContext, actiton}, null, changeQuickRedirect, true, 45216, new Class[]{AppCompatActivity.class, com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(actiton, "actiton");
        boolean zG = kotlin.jvm.internal.f0.g("1", com.max.hbcache.c.o("trade_sms_push", ""));
        boolean zG2 = kotlin.jvm.internal.f0.g("1", com.max.hbcache.c.o("trade_wechat_push", ""));
        boolean zN0 = com.max.xiaoheihe.utils.d.N0(mContext);
        if (zG && zG2 && zN0) {
            actiton.a();
            return;
        }
        if (!zG && !zG2) {
            N(mContext, actiton);
        } else if (System.currentTimeMillis() - com.max.hbutils.utils.n.r(com.max.hbcache.c.j("trade_notify_dialog_show")) >= 604800000) {
            N(mContext, actiton);
        } else {
            actiton.a();
        }
    }

    public static final void d(@dl.d Activity mContext) {
        if (PatchProxy.proxy(new Object[]{mContext}, null, changeQuickRedirect, true, 45213, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        com.max.xiaoheihe.network.i.a().k1().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(mContext));
    }

    @dl.d
    public static final String e() {
        return f92852a;
    }

    @dl.d
    public static final String f() {
        return f92853b;
    }

    @dl.d
    public static final Intent g(@dl.d Context mContext, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, str}, null, changeQuickRedirect, true, 45200, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        return TradeItemSkuActivity.R.a(mContext, str);
    }

    @dl.d
    public static final Intent h(@dl.d Context mContext, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, str}, null, changeQuickRedirect, true, 45201, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        return TradeItemSpuActivity.Q.a(mContext, str);
    }

    public static final void i(@dl.d BaseActivity activity, @dl.d String id2, @dl.d String type, @dl.d yh.l<? super TradeMallFollowInfo, b2> action) {
        if (PatchProxy.proxy(new Object[]{activity, id2, type, action}, null, changeQuickRedirect, true, 45205, new Class[]{BaseActivity.class, String.class, String.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(activity, "activity");
        kotlin.jvm.internal.f0.p(id2, "id");
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(action, "action");
        activity.V0().c((io.reactivex.disposables.b) (kotlin.jvm.internal.f0.g("spu", type) ? com.max.xiaoheihe.network.i.a().C4(id2) : com.max.xiaoheihe.network.i.a().L8(id2)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(activity, action)));
    }

    private static final void j(BaseActivity baseActivity, String str, String str2, boolean z10, yh.a<b2> aVar) {
        io.reactivex.z<Result> zVarR1;
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), aVar}, null, changeQuickRedirect, true, 45206, new Class[]{BaseActivity.class, String.class, String.class, Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        if (kotlin.jvm.internal.f0.g("spu", str2)) {
            zVarR1 = z10 ? com.max.xiaoheihe.network.i.a().Q1(str) : com.max.xiaoheihe.network.i.a().I2(str);
        } else {
            zVarR1 = z10 ? com.max.xiaoheihe.network.i.a().R1(str) : com.max.xiaoheihe.network.i.a().r6(str);
        }
        baseActivity.V0().c((io.reactivex.disposables.b) zVarR1.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(baseActivity, aVar)));
    }

    public static final void k(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 45202, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        Object systemService = view.getContext().getSystemService("input_method");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void l(@dl.d final BaseActivity activity, @dl.d final UMShareListener umShareListener, @dl.d final TitleBar mTitleBar, @dl.d final String id2, @dl.d final String type) {
        if (PatchProxy.proxy(new Object[]{activity, umShareListener, mTitleBar, id2, type}, null, changeQuickRedirect, true, 45204, new Class[]{BaseActivity.class, UMShareListener.class, TitleBar.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(activity, "activity");
        kotlin.jvm.internal.f0.p(umShareListener, "umShareListener");
        kotlin.jvm.internal.f0.p(mTitleBar, "mTitleBar");
        kotlin.jvm.internal.f0.p(id2, "id");
        kotlin.jvm.internal.f0.p(type, "type");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        mTitleBar.a0();
        mTitleBar.setActionIcon(R.drawable.common_share);
        mTitleBar.getAppbarActionButtonView().setPadding(ViewUtils.f(activity, 7.0f), 0, ViewUtils.f(activity, 14.0f), 0);
        mTitleBar.getAppbarActionButtonXView().setPadding(ViewUtils.f(activity, 7.0f), 0, ViewUtils.f(activity, 7.0f), 0);
        mTitleBar.getAppbarActionButtonXView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        mTitleBar.setActionXIconOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.TradeInfoUtilKt$initItemPageTitle$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45237, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (f0.g("1", objectRef.f124891b)) {
                    mTitleBar.setActionXIcon(activity.getResources().getDrawable(R.drawable.trade_star_24x24));
                } else {
                    mTitleBar.setActionXIcon(activity.getResources().getDrawable(R.drawable.trade_star_filled_24x24));
                }
                BaseActivity baseActivity = activity;
                String str = id2;
                String str2 = type;
                boolean zG = true ^ f0.g("1", objectRef.f124891b);
                final Ref.ObjectRef<String> objectRef2 = objectRef;
                TradeInfoUtilKt.a(baseActivity, str, str2, zG, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeInfoUtilKt$initItemPageTitle$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45239, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45238, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        if (f0.g("1", objectRef2.f124891b)) {
                            objectRef2.f124891b = "0";
                            com.max.hbutils.utils.c.f("取消收藏成功");
                        } else {
                            objectRef2.f124891b = "1";
                            com.max.hbutils.utils.c.f("收藏成功");
                        }
                    }
                });
            }
        });
        i(activity, id2, type, new yh.l<TradeMallFollowInfo, b2>() { // from class: com.max.xiaoheihe.module.trade.TradeInfoUtilKt$initItemPageTitle$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: TradeInfoUtil.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ShareInfoObj f92890b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ BaseActivity f92891c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ UMShareListener f92892d;

                a(ShareInfoObj shareInfoObj, BaseActivity baseActivity, UMShareListener uMShareListener) {
                    this.f92890b = shareInfoObj;
                    this.f92891c = baseActivity;
                    this.f92892d = uMShareListener;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45242, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.hbshare.d.E(this.f92891c, new HBShareData(false, true, this.f92890b.getShare_title(), this.f92890b.getShare_desc(), this.f92890b.getShare_url(), null, com.max.hbcommon.utils.c.u(this.f92890b.getShare_img()) ? null : new UMImage(this.f92891c, this.f92890b.getShare_img()), this.f92892d, null, null, null, null, null, bb.c.k.L0, null));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
            public final void a(@dl.d TradeMallFollowInfo followInfo) {
                if (PatchProxy.proxy(new Object[]{followInfo}, this, changeQuickRedirect, false, 45240, new Class[]{TradeMallFollowInfo.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(followInfo, "followInfo");
                ShareInfoObj share_info = followInfo.getShare_info();
                if (share_info != null) {
                    mTitleBar.setActionIconOnClickListener(new a(share_info, activity, umShareListener));
                }
                objectRef.f124891b = followInfo.getFollow_state();
                if (f0.g("1", followInfo.getFollow_state())) {
                    mTitleBar.setActionXIcon(activity.getResources().getDrawable(R.drawable.trade_star_filled_24x24));
                } else {
                    mTitleBar.setActionXIcon(activity.getResources().getDrawable(R.drawable.trade_star_24x24));
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(TradeMallFollowInfo tradeMallFollowInfo) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeMallFollowInfo}, this, changeQuickRedirect, false, 45241, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(tradeMallFollowInfo);
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, android.view.View] */
    public static final void m(@dl.d View mRootView, @dl.d yh.a<b2> action, @dl.d yh.l<? super String, b2> setQ) {
        if (PatchProxy.proxy(new Object[]{mRootView, action, setQ}, null, changeQuickRedirect, true, 45203, new Class[]{View.class, yh.a.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mRootView, "mRootView");
        kotlin.jvm.internal.f0.p(action, "action");
        kotlin.jvm.internal.f0.p(setQ, "setQ");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = mRootView.findViewById(R.id.et_item_search);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.f124891b = mRootView.findViewById(R.id.iv_del);
        ((EditText) objectRef.f124891b).setImeOptions(6);
        ((EditText) objectRef.f124891b).setOnEditorActionListener(new d(objectRef, action));
        ((EditText) objectRef.f124891b).addTextChangedListener(new e(setQ, objectRef2));
        ((ImageView) objectRef2.f124891b).setOnClickListener(new f(objectRef, action));
    }

    public static final void n(@dl.d Context context, boolean z10, @dl.e String str) {
        Uri uri;
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 45183, new Class[]{Context.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        if (!com.max.xiaoheihe.utils.d.H0(context, lb.a.f130983j)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://acc.xiaoheihe.cn"));
            intent.addFlags(268435456);
            com.max.xiaoheihe.utils.d.G1(context, intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        if (z10) {
            uri = Uri.parse("heyboxacc://%7B%22protocol_type%22%3A%22openAcc%22%2C%22app_id%22%3A%2299928013%22%2C%22from_scheme%22%3A%22h%22%7D");
        } else {
            if (str == null || str.length() == 0) {
                uri = Uri.parse("heyboxacc://%7B%22protocol_type%22%3A%22openAcc%22%2C%22app_id%22%3A%2299928032%22%2C%22from_scheme%22%3A%22heybox%3A%2F%2F%22%7D");
            } else {
                uri = Uri.parse("heyboxacc://%7B%22protocol_type%22%3A%22openAcc%22%2C%22app_id%22%3A%22" + str + "%22%2C%22from_scheme%22%3A%22heybox%3A%2F%2F%22%7D");
            }
        }
        intent2.setData(uri);
        intent2.addFlags(268435456);
        com.max.xiaoheihe.utils.d.G1(context, intent2);
    }

    public static /* synthetic */ void o(Context context, boolean z10, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), str, new Integer(i10), obj}, null, changeQuickRedirect, true, 45184, new Class[]{Context.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        n(context, z10, str);
    }

    @xh.i
    public static final void p(@dl.d Context context, @dl.e AccProxyObj accProxyObj, @dl.d final yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{context, accProxyObj, callback}, null, changeQuickRedirect, true, 45182, new Class[]{Context.class, AccProxyObj.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(callback, "callback");
        if (accProxyObj != null) {
            b0(context, false, accProxyObj.getAppid(), null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeInfoUtilKt$needShowAccAlert$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45249, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45248, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    callback.invoke();
                }
            }, 8, null);
        } else {
            callback.invoke();
        }
    }

    public static final void q(@dl.d Context mContext, @dl.d yh.a<b2> action) {
        if (PatchProxy.proxy(new Object[]{mContext, action}, null, changeQuickRedirect, true, 45225, new Class[]{Context.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(action, "action");
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(mContext).y("报价处理失败，请稍后查看");
        fVarY.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new g(action));
        fVarY.F();
    }

    public static final void r(@dl.d Context mContext, @dl.d yh.a<b2> action) {
        if (PatchProxy.proxy(new Object[]{mContext, action}, null, changeQuickRedirect, true, 45223, new Class[]{Context.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(action, "action");
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(mContext).y("报价发送成功");
        fVarY.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new h(action));
        fVarY.F();
    }

    public static final void s(@dl.d Context mContext, @dl.d yh.a<b2> action) {
        if (PatchProxy.proxy(new Object[]{mContext, action}, null, changeQuickRedirect, true, 45224, new Class[]{Context.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(action, "action");
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(mContext).y("正在处理报价...，请稍后查看");
        fVarY.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new i(action));
        fVarY.F();
    }

    public static final void t(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, null, changeQuickRedirect, true, 45195, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        TextView textView = (TextView) viewHolder.i(R.id.tv_arrow);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_trend_symbol);
        TextView textView3 = (TextView) viewHolder.i(R.id.tv_trend_price);
        bb.d.d(textView2, 5);
        bb.d.d(textView3, 5);
        bb.d.d(textView, 0);
        String delta = data.getDelta();
        if (delta != null && delta.length() != 0) {
            z10 = false;
        }
        if (z10) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView3.setVisibility(0);
        String delta2 = data.getDelta();
        kotlin.jvm.internal.f0.m(delta2);
        if (!StringsKt__StringsKt.W2(delta2, Constants.ACCEPT_TIME_SEPARATOR_SERVER, false, 2, null)) {
            textView.setText(lb.b.f131087c);
            textView3.setText(data.getDelta());
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
            return;
        }
        textView.setText(lb.b.f131088d);
        String delta3 = data.getDelta();
        kotlin.jvm.internal.f0.m(delta3);
        textView3.setText(kotlin.text.u.l2(delta3, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null));
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
        textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
    }

    public static final void u(@dl.d Context mContext, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{mContext, viewHolder, data}, null, changeQuickRedirect, true, 45192, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        View viewI = viewHolder.i(R.id.tv_float_value);
        View viewI2 = viewHolder.i(R.id.v_float_bar);
        View viewI3 = viewHolder.i(R.id.v_float_cursor);
        View viewI4 = viewHolder.i(R.id.cl_root);
        String float_value = data.getFloat_value();
        if (float_value != null) {
            TextView textView = (TextView) viewI;
            textView.setText("磨损: " + float_value);
            viewI2.setVisibility(0);
            textView.setVisibility(0);
            ((ImageView) viewI3).setVisibility(0);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            ConstraintLayout constraintLayout = (ConstraintLayout) viewI4;
            cVar.H(constraintLayout);
            cVar.f1(R.id.v_progress, com.max.hbutils.utils.n.p(float_value));
            cVar.r(constraintLayout);
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            viewI2.setVisibility(8);
            ((TextView) viewI).setVisibility(8);
            ((ImageView) viewI3).setVisibility(8);
        }
    }

    public static final void v(@dl.d Context mContext, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{mContext, viewHolder, data}, null, changeQuickRedirect, true, 45191, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        View viewI = viewHolder.i(R.id.vg_trade_info);
        View viewI2 = viewHolder.i(R.id.iv_trade_state);
        View viewI3 = viewHolder.i(R.id.tv_trade_info);
        View viewI4 = viewHolder.i(R.id.tv_price);
        View viewI5 = viewHolder.i(R.id.tv_price_symbol);
        View viewI6 = viewHolder.i(R.id.tv_name);
        View viewI7 = viewHolder.i(R.id.vg_tag);
        TextView textView = (TextView) viewI4;
        bb.d.d(textView, 5);
        textView.setText(data.getPrice());
        TradeInfoObj trade_info = data.getTrade_info();
        if (trade_info != null) {
            viewI.setVisibility(0);
            Integer state = trade_info.getState();
            if (state != null && state.intValue() == 1) {
                ImageView imageView = (ImageView) viewI2;
                imageView.setImageResource(R.drawable.trade_state_on_sale_12x12);
                imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.light_blue));
                TextView textView2 = (TextView) viewI3;
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.light_blue));
                textView2.setText(trade_info.getDesc());
            } else {
                Integer state2 = trade_info.getState();
                if (state2 != null && state2.intValue() == 2) {
                    ((ImageView) viewI2).setImageResource(R.drawable.trade_state_non_tradable_12x12);
                } else if (state2 != null && state2.intValue() == 3) {
                    ((ImageView) viewI2).setImageResource(R.drawable.trade_state_locked_12x12);
                } else {
                    ((ImageView) viewI2).setImageResource(R.drawable.trade_state_on_sale_12x12);
                }
                ((ImageView) viewI2).setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                TextView textView3 = (TextView) viewI3;
                textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                textView3.setText(trade_info.getDesc());
            }
            ((TextView) viewI6).setAlpha(0.5f);
            textView.setAlpha(0.5f);
            ((TextView) viewI5).setAlpha(0.5f);
            ((ViewGroup) viewI7).setAlpha(0.5f);
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            viewI.setVisibility(8);
            ((TextView) viewI6).setAlpha(1.0f);
            textView.setAlpha(1.0f);
            ((TextView) viewI5).setAlpha(1.0f);
            ((ViewGroup) viewI7).setAlpha(1.0f);
        }
    }

    public static final void w(@dl.d Context context, @dl.d TitleBar mToolbar) {
        if (PatchProxy.proxy(new Object[]{context, mToolbar}, null, changeQuickRedirect, true, 45198, new Class[]{Context.class, TitleBar.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(mToolbar, "mToolbar");
        View viewFindViewById = mToolbar.findViewById(R.id.iv_left_action_point);
        View viewFindViewById2 = mToolbar.findViewById(R.id.iv_left_action_point_x);
        String strO = com.max.hbcache.c.o("trade_msg_tap_time", "");
        String strO2 = com.max.hbcache.c.o("trade_bot_tap_time", "");
        if (com.max.hbutils.utils.n.r(strO) > com.max.hbutils.utils.n.r(com.max.hbcache.c.o("last_trade_msg_tap_time", ""))) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        if (com.max.hbutils.utils.n.r(strO2) > 0) {
            viewFindViewById2.setVisibility(0);
        } else {
            viewFindViewById2.setVisibility(8);
        }
    }

    public static final void x(@dl.d Context context, @dl.d TitleBar mToolbar) {
        if (PatchProxy.proxy(new Object[]{context, mToolbar}, null, changeQuickRedirect, true, 45199, new Class[]{Context.class, TitleBar.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(mToolbar, "mToolbar");
        View viewFindViewById = mToolbar.findViewById(R.id.iv_action_point);
        View viewFindViewById2 = mToolbar.findViewById(R.id.iv_action_point_x);
        String strO = com.max.hbcache.c.o("trade_msg_tap_time", "");
        String strO2 = com.max.hbcache.c.o("trade_bot_tap_time", "");
        if (com.max.hbutils.utils.n.r(strO) > com.max.hbutils.utils.n.r(com.max.hbcache.c.o("last_trade_msg_tap_time", ""))) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        if (com.max.hbutils.utils.n.r(strO2) > 0) {
            viewFindViewById2.setVisibility(0);
        } else {
            viewFindViewById2.setVisibility(8);
        }
    }

    public static final void y(@dl.d Context mContext, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradePurchaseInfoObj data, boolean z10, @dl.d yh.a<b2> onclick) {
        if (PatchProxy.proxy(new Object[]{mContext, viewHolder, data, new Byte(z10 ? (byte) 1 : (byte) 0), onclick}, null, changeQuickRedirect, true, 45221, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, TradePurchaseInfoObj.class, Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(onclick, "onclick");
        TradeSteamInventoryObj asset = data.getAsset();
        kotlin.jvm.internal.f0.m(asset);
        B(mContext, viewHolder, asset, false, 8, null);
        TextView textView = (TextView) viewHolder.i(R.id.tv_create_time);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_price);
        TextView textView3 = (TextView) viewHolder.i(R.id.tv_price_symbol);
        TextView textView4 = (TextView) viewHolder.i(R.id.tv_price_desc);
        TextView textView5 = (TextView) viewHolder.i(R.id.tv_highest_price);
        TextView textView6 = (TextView) viewHolder.i(R.id.tv_record_state);
        View viewI = viewHolder.i(R.id.vg_supply_state);
        View viewI2 = viewHolder.i(R.id.v_supply_state);
        TextView textView7 = (TextView) viewHolder.i(R.id.tv_supply_state);
        TextView textView8 = (TextView) viewHolder.i(R.id.tv_count);
        TextView textView9 = (TextView) viewHolder.i(R.id.tv_total);
        bb.d.d(textView3, 5);
        bb.d.d(textView2, 5);
        bb.d.d(textView8, 5);
        if (textView != null) {
            textView.setText(data.getCreate_time());
        }
        textView2.setText(data.getPrice());
        if (z10) {
            textView8.setVisibility(8);
            textView9.setText(data.getCount() + IOUtils.DIR_SEPARATOR_UNIX + data.getTotal());
            textView4.setText("单价:");
            textView5.setText("");
            textView6.setVisibility(0);
            viewI.setVisibility(8);
            if (kotlin.jvm.internal.f0.g(data.getState(), "1")) {
                textView6.setText("已完成");
            } else if (kotlin.jvm.internal.f0.g(data.getState(), "2")) {
                textView6.setText("进行中");
            } else {
                textView6.setText("已终止");
            }
        } else {
            textView8.setVisibility(0);
            textView9.setText(IOUtils.DIR_SEPARATOR_UNIX + data.getTotal());
            textView8.setText(String.valueOf(data.getCount()));
            textView4.setText("求购价:");
            textView5.setText("最高: ￥" + data.getHigh_price());
            textView6.setVisibility(8);
            if (com.max.hbutils.utils.n.q(data.getSupply()) > 0) {
                viewI.setVisibility(0);
                viewI2.setVisibility(0);
                viewI2.setBackground(ViewUtils.j(3.0f, com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color)));
                textView7.setText("正在供应: " + data.getSupply());
            } else {
                viewI.setVisibility(8);
            }
        }
        viewHolder.itemView.setOnClickListener(new j(onclick));
    }

    public static final void z(@dl.d Context mContext, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeSteamInventoryObj data, boolean z10) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{mContext, viewHolder, data, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 45193, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, TradeSteamInventoryObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_stickers);
        viewGroup.removeAllViews();
        List<ItemStickerObj> stickers = data.getStickers();
        if (stickers != null) {
            for (ItemStickerObj itemStickerObj : stickers) {
                if (z10) {
                    View viewInflate = LayoutInflater.from(mContext).inflate(R.layout.item_sticker_with_float, viewGroup, false);
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
                    View viewFindViewById = viewInflate.findViewById(R.id.tv_float_value);
                    Integer placeholder = itemStickerObj.getPlaceholder();
                    if (placeholder != null && placeholder.intValue() == 1) {
                        ((TextView) viewFindViewById).setText("");
                        imageView.setImageResource(R.drawable.trade_sticker_placeholder_14x14);
                        imageView.setAlpha(0.3f);
                        viewInflate = viewInflate;
                    } else {
                        com.max.hbimage.b.K(itemStickerObj.getImg_url(), imageView);
                        Float float_value = itemStickerObj.getFloat_value();
                        if (float_value != null) {
                            float fFloatValue = float_value.floatValue();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((int) Math.ceil(((double) fFloatValue) * 100.0d));
                            sb2.append('%');
                            SpannableString spannableString = new SpannableString(sb2.toString());
                            spannableString.setSpan(new AbsoluteSizeSpan(mContext.getResources().getDimensionPixelSize(R.dimen.text_size_6)), spannableString.length() - 1, spannableString.length(), 33);
                            ((TextView) viewFindViewById).setText(spannableString);
                            b2Var = b2.f124493a;
                        } else {
                            b2Var = null;
                        }
                        if (b2Var == null) {
                            ((TextView) viewFindViewById).setText("");
                        }
                        if (itemStickerObj.getFloat_value() == null || kotlin.jvm.internal.f0.e(itemStickerObj.getFloat_value(), 1.0f)) {
                            imageView.setAlpha(1.0f);
                        } else {
                            imageView.setAlpha(0.3f);
                        }
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    if (viewGroup.getChildCount() > 0) {
                        layoutParams.leftMargin = ViewUtils.f(mContext, -4.0f);
                    }
                    viewGroup.addView(viewInflate, layoutParams);
                } else {
                    Integer placeholder2 = itemStickerObj.getPlaceholder();
                    if (placeholder2 == null || placeholder2.intValue() != 1) {
                        ImageView imageView2 = new ImageView(mContext);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ViewUtils.f(mContext, 22.0f), ViewUtils.f(mContext, 16.0f));
                        if (viewGroup.getChildCount() > 0) {
                            layoutParams2.leftMargin = ViewUtils.f(mContext, -4.0f);
                        }
                        com.max.hbimage.b.K(itemStickerObj.getImg_url(), imageView2);
                        viewGroup.addView(imageView2, layoutParams2);
                    }
                }
            }
        }
    }
}
