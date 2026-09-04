package com.max.xiaoheihe.module.mall;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayTypeInfoObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.MyHcashActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GiftBotProgressObj;
import com.max.xiaoheihe.bean.mall.MallDiscountParamsObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.bean.mall.MallPayExtraInfo;
import com.max.xiaoheihe.bean.mall.MallPrepareStateObj;
import com.max.xiaoheihe.module.webview.NativeWebActionActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.o6;
import df.w5;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: MallUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class o {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: MallUtils.java */
    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40791, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90917b;

        a0(Activity activity) {
            this.f90917b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40822, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f90917b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131059v3);
            intent.putExtra("title", "帮助");
            this.f90917b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90918b;

        b(Activity activity) {
            this.f90918b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40792, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.e0(this.f90918b, 1).A();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class b0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90919b;

        b0(Activity activity) {
            this.f90919b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40823, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            o.x();
            o.a(this.f90919b);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90920b;

        c(BaseActivity baseActivity) {
            this.f90920b = baseActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40793, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f90920b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.G3);
            intent.putExtra("title", "常见问题");
            this.f90920b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class c0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40824, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f90921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckBox f90922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CheckBox f90923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CheckBox f90924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ MallPayExtraInfo f90925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextView f90926g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g0 f90927h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextView f90928i;

        d(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, MallPayExtraInfo mallPayExtraInfo, TextView textView, g0 g0Var, TextView textView2) {
            this.f90921b = checkBox;
            this.f90922c = checkBox2;
            this.f90923d = checkBox3;
            this.f90924e = checkBox4;
            this.f90925f = mallPayExtraInfo;
            this.f90926g = textView;
            this.f90927h = g0Var;
            this.f90928i = textView2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40794, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90921b.setChecked(true);
            this.f90922c.setChecked(false);
            this.f90923d.setChecked(false);
            this.f90924e.setChecked(false);
            if (com.max.hbcommon.utils.c.u(this.f90925f.getWeixin_msg())) {
                this.f90926g.setVisibility(8);
            } else {
                this.f90926g.setVisibility(0);
                this.f90926g.setText(this.f90925f.getWeixin_msg());
            }
            this.f90927h.c(PaymentManager.f71426y);
            this.f90928i.setText("确认支付");
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class d0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90929b;

        d0(Activity activity) {
            this.f90929b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40825, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            this.f90929b.finish();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f90930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckBox f90931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CheckBox f90932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CheckBox f90933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ MallPayExtraInfo f90934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextView f90935g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g0 f90936h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f90937i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextView f90938j;

        e(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, MallPayExtraInfo mallPayExtraInfo, TextView textView, g0 g0Var, boolean z10, TextView textView2) {
            this.f90930b = checkBox;
            this.f90931c = checkBox2;
            this.f90932d = checkBox3;
            this.f90933e = checkBox4;
            this.f90934f = mallPayExtraInfo;
            this.f90935g = textView;
            this.f90936h = g0Var;
            this.f90937i = z10;
            this.f90938j = textView2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40795, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90930b.setChecked(true);
            this.f90931c.setChecked(false);
            this.f90932d.setChecked(false);
            this.f90933e.setChecked(false);
            if (com.max.hbcommon.utils.c.u(this.f90934f.getAlipay_msg())) {
                this.f90935g.setVisibility(8);
            } else {
                this.f90935g.setVisibility(0);
                this.f90935g.setText(this.f90934f.getAlipay_msg());
            }
            this.f90936h.c(PaymentManager.f71427z);
            if (this.f90937i) {
                this.f90938j.setText("确认充值");
            }
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class e0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90940c;

        e0(Activity activity, String str) {
            this.f90939b = activity;
            this.f90940c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40826, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f90939b, (Class<?>) NativeWebActionActivity.class);
            intent.putExtra("title", "帮助");
            intent.putExtra("pageurl", this.f90940c);
            this.f90939b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f90941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckBox f90942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CheckBox f90943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CheckBox f90944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f90945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f90946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f90947h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextView f90948i;

        f(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, TextView textView, g0 g0Var, boolean z10, TextView textView2) {
            this.f90941b = checkBox;
            this.f90942c = checkBox2;
            this.f90943d = checkBox3;
            this.f90944e = checkBox4;
            this.f90945f = textView;
            this.f90946g = g0Var;
            this.f90947h = z10;
            this.f90948i = textView2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40796, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90941b.setChecked(false);
            this.f90942c.setChecked(false);
            this.f90943d.setChecked(true);
            this.f90944e.setChecked(false);
            this.f90945f.setVisibility(8);
            this.f90946g.c(PaymentManager.A);
            if (this.f90947h) {
                this.f90948i.setText("确认支付");
            }
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class f0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f90949b;

        f0(l0.g gVar) {
            this.f90949b = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40827, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            l0.g gVar = this.f90949b;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f90950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckBox f90951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CheckBox f90952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CheckBox f90953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f90954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextView f90955g;

        g(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, TextView textView, TextView textView2) {
            this.f90950b = checkBox;
            this.f90951c = checkBox2;
            this.f90952d = checkBox3;
            this.f90953e = checkBox4;
            this.f90954f = textView;
            this.f90955g = textView2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40797, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90950b.setChecked(false);
            this.f90951c.setChecked(false);
            this.f90952d.setChecked(false);
            this.f90953e.setChecked(true);
            this.f90954f.setVisibility(8);
            this.f90955g.setText("确认支付");
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public interface g0 {
        String a();

        void b(String str);

        void c(String str);
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class h extends com.max.hbcommon.network.d<Result<MallPayExtraInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f90956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f90957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f90958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f90959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ MallPayExtraInfo f90962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ CheckBox f90963i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextView f90964j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ CheckBox f90965k;

        /* JADX INFO: compiled from: MallUtils.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40800, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.e0(h.this.f90960f, 2).A();
                com.max.hbcommon.component.i iVar = h.this.f90961g;
                if (iVar == null || !iVar.isShowing()) {
                    return;
                }
                h.this.f90961g.dismiss();
            }
        }

        h(boolean z10, View view, TextView textView, TextView textView2, BaseActivity baseActivity, com.max.hbcommon.component.i iVar, MallPayExtraInfo mallPayExtraInfo, CheckBox checkBox, TextView textView3, CheckBox checkBox2) {
            this.f90956b = z10;
            this.f90957c = view;
            this.f90958d = textView;
            this.f90959e = textView2;
            this.f90960f = baseActivity;
            this.f90961g = iVar;
            this.f90962h = mallPayExtraInfo;
            this.f90963i = checkBox;
            this.f90964j = textView3;
            this.f90965k = checkBox2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result<MallPayExtraInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40798, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f90956b && result.getResult() != null && result.getResult().getProfit() != null && com.max.hbutils.utils.n.o(result.getResult().getProfit()) > 0.0d) {
                Double dValueOf = Double.valueOf(com.max.hbutils.utils.n.o(result.getResult().getProfit()));
                this.f90957c.setVisibility(0);
                String strN = com.max.hbutils.utils.n.n(Double.valueOf(dValueOf.doubleValue() / 100.0d));
                int iDoubleValue = (int) (dValueOf.doubleValue() / 100.0d);
                this.f90958d.setText(strN + "，可兑换" + iDoubleValue + "元余额");
                this.f90959e.setOnClickListener(new a());
            }
            if (result.getResult() != null) {
                if (!com.max.hbcommon.utils.c.u(result.getResult().getAlipay_msg())) {
                    this.f90962h.setAlipay_msg(result.getResult().getAlipay_msg());
                }
                if (!com.max.hbcommon.utils.c.u(result.getResult().getWeixin_msg())) {
                    this.f90962h.setWeixin_msg(result.getResult().getWeixin_msg());
                }
                if (this.f90963i.isChecked()) {
                    if (com.max.hbcommon.utils.c.u(this.f90962h.getAlipay_msg())) {
                        this.f90964j.setVisibility(8);
                        return;
                    } else {
                        this.f90964j.setText(this.f90962h.getAlipay_msg());
                        this.f90964j.setVisibility(0);
                        return;
                    }
                }
                if (!this.f90965k.isChecked()) {
                    this.f90964j.setVisibility(8);
                } else {
                    if (com.max.hbcommon.utils.c.u(this.f90962h.getWeixin_msg())) {
                        return;
                    }
                    this.f90964j.setText(this.f90962h.getWeixin_msg());
                    this.f90964j.setVisibility(0);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40799, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayExtraInfo>) obj);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f90967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f90969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90971f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f90972g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CheckBox f90973h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ CheckBox f90974i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ CheckBox f90975j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ PayTypeInfoObj f90976k;

        i(CheckBox checkBox, String str, String str2, BaseActivity baseActivity, com.max.hbcommon.component.i iVar, g0 g0Var, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, PayTypeInfoObj payTypeInfoObj) {
            this.f90967b = checkBox;
            this.f90968c = str;
            this.f90969d = str2;
            this.f90970e = baseActivity;
            this.f90971f = iVar;
            this.f90972g = g0Var;
            this.f90973h = checkBox2;
            this.f90974i = checkBox3;
            this.f90975j = checkBox4;
            this.f90976k = payTypeInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayTypeInfoObj payTypeInfoObj;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40801, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f90967b.isChecked()) {
                if (com.max.hbutils.utils.n.r(this.f90968c) < com.max.hbutils.utils.n.r(this.f90969d) / 10) {
                    o.r(this.f90970e, String.valueOf((int) Math.ceil(((com.max.hbutils.utils.n.o(this.f90969d) / 10.0d) - com.max.hbutils.utils.n.o(this.f90968c)) / 100.0d)), null);
                    com.max.hbcommon.component.i iVar = this.f90971f;
                    if (iVar == null || !iVar.isShowing()) {
                        return;
                    }
                    this.f90971f.dismiss();
                    return;
                }
                this.f90972g.b(PaymentManager.A);
                com.max.hbcommon.component.i iVar2 = this.f90971f;
                if (iVar2 == null || !iVar2.isShowing()) {
                    return;
                }
                this.f90971f.dismiss();
                return;
            }
            if (this.f90973h.isChecked()) {
                this.f90972g.b(PaymentManager.f71427z);
                com.max.hbcommon.component.i iVar3 = this.f90971f;
                if (iVar3 == null || !iVar3.isShowing()) {
                    return;
                }
                this.f90971f.dismiss();
                return;
            }
            if (this.f90974i.isChecked()) {
                this.f90972g.b(PaymentManager.f71426y);
                com.max.hbcommon.component.i iVar4 = this.f90971f;
                if (iVar4 == null || !iVar4.isShowing()) {
                    return;
                }
                this.f90971f.dismiss();
                return;
            }
            if (!this.f90975j.isChecked() || (payTypeInfoObj = this.f90976k) == null) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f90970e, payTypeInfoObj.getPay_url());
            com.max.hbcommon.component.i iVar5 = this.f90971f;
            if (iVar5 == null || !iVar5.isShowing()) {
                return;
            }
            this.f90971f.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90977b;

        j(com.max.hbcommon.component.i iVar) {
            this.f90977b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40802, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = this.f90977b) == null || !iVar.isShowing()) {
                return;
            }
            this.f90977b.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class k implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40790, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class l implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40804, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class m implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f90978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dialog f90979c;

        m(g0 g0Var, Dialog dialog) {
            this.f90978b = g0Var;
            this.f90979c = dialog;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40805, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f90978b.b(PaymentManager.A);
            dialogInterface.dismiss();
            Dialog dialog = this.f90979c;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            this.f90979c.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class n extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f90980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RadioGroup f90981c;

        n(int i10, RadioGroup radioGroup) {
            this.f90980b = i10;
            this.f90981c = radioGroup;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40806, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported || recyclerView == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                return;
            }
            ((RadioButton) this.f90981c.getChildAt(((LinearLayoutManager) recyclerView.getLayoutManager()).findLastCompletelyVisibleItemPosition() / this.f90980b)).setChecked(true);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.o$o, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MallUtils.java */
    public class ViewOnClickListenerC0839o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90982b;

        ViewOnClickListenerC0839o(Activity activity) {
            this.f90982b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40807, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f90982b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.W3);
            intent.putExtra("title", "黑盒商城（国际站）购买协议");
            this.f90982b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90983b;

        p(com.max.hbcommon.component.i iVar) {
            this.f90983b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40808, new Class[]{View.class}, Void.TYPE).isSupported && this.f90983b.isShowing()) {
                this.f90983b.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0.g f90985c;

        q(com.max.hbcommon.component.i iVar, l0.g gVar) {
            this.f90984b = iVar;
            this.f90985c = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40809, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f90984b.isShowing()) {
                this.f90984b.dismiss();
            }
            com.max.hbcache.c.z("mall_region_alert_agreed", "1");
            this.f90985c.a();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90987c;

        r(Activity activity, String str) {
            this.f90986b = activity;
            this.f90987c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40810, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f90986b, this.f90987c);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class s implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90988b;

        s(BaseActivity baseActivity) {
            this.f90988b = baseActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40811, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f90988b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130964f4);
            intent.putExtra("title", "帮助");
            this.f90988b.startActivity(intent);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class t extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        t(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 40812, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_title);
            TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* " + keyDescObj.getTitle());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.delete_red)), 0, 1, 34);
            textView.setText(spannableStringBuilder);
            textView2.setText(keyDescObj.getDesc());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 40813, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90989b;

        u(com.max.hbcommon.component.i iVar) {
            this.f90989b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40814, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90989b.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class v implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0.g f90992d;

        v(BaseActivity baseActivity, String str, l0.g gVar) {
            this.f90990b = baseActivity;
            this.f90991c = str;
            this.f90992d = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40803, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            BaseActivity baseActivity = this.f90990b;
            baseActivity.startActivity(MyHcashActivity.o2(baseActivity, this.f90991c));
            l0.g gVar = this.f90992d;
            if (gVar != null) {
                gVar.a();
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0.g f90994c;

        w(com.max.hbcommon.component.i iVar, l0.g gVar) {
            this.f90993b = iVar;
            this.f90994c = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40816, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90993b.dismiss();
            l0.g gVar = this.f90994c;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90995b;

        x(BaseActivity baseActivity) {
            this.f90995b = baseActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40817, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f90995b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130958e4);
            intent.putExtra("title", "帮助");
            this.f90995b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class y extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f90996b;

        y(l0.g gVar) {
            this.f90996b = gVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40820, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            l0.g gVar = this.f90996b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40819, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            l0.g gVar = this.f90996b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40818, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || com.max.hbcommon.utils.c.u(result.getMsg())) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.d(result.getMsg());
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40821, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: MallUtils.java */
    public class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GiftBotProgressObj f90998c;

        z(Activity activity, GiftBotProgressObj giftBotProgressObj) {
            this.f90997b = activity;
            this.f90998c = giftBotProgressObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40815, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(this.f90997b, this.f90998c.getHb_friends_code());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.copy_link_successful));
        }
    }

    static /* synthetic */ void a(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 40789, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        u(activity);
    }

    public static void b(HashMap<String, String> map, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{map, gVar}, null, changeQuickRedirect, true, 40787, new Class[]{HashMap.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        if (map != null && map.size() > 0) {
            com.max.xiaoheihe.network.i.a().L9(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new y(gVar));
        } else if (gVar != null) {
            gVar.a();
        }
    }

    public static void c(Activity activity, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{activity, gVar}, null, changeQuickRedirect, true, 40780, new Class[]{Activity.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.network.b.f68053j || (!"0".equals(com.max.hbcache.c.j("mall_region_alert_freq")) && "1".equals(com.max.hbcache.c.j("mall_region_alert_agreed")))) {
            gVar.a();
        } else {
            n(activity, gVar);
        }
    }

    public static View d(@n0 Activity activity, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, str, str2, str3}, null, changeQuickRedirect, true, 40782, new Class[]{Activity.class, String.class, String.class, String.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = activity.getLayoutInflater().inflate(R.layout.layout_discount_tip, (ViewGroup) null, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int iF = ViewUtils.f(activity, 20.0f);
        marginLayoutParams.bottomMargin = iF;
        marginLayoutParams.topMargin = iF;
        viewInflate.setLayoutParams(marginLayoutParams);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_center_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_center_msg);
        textView.setText(str);
        textView2.setText(str2);
        if (!com.max.hbcommon.utils.c.u(str3)) {
            viewInflate.setOnClickListener(new r(activity, str3));
        }
        return viewInflate;
    }

    public static String e(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40785, new Class[]{Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = com.max.hbcommon.network.b.c() + "mall/guide/index";
        if (!z10) {
            return str;
        }
        return str + "?show_open_btn=1";
    }

    public static String f(long j10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40788, new Class[]{Long.TYPE, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = String.format("%.2f", Double.valueOf(j10 / 1000.0d));
        if (z10 || !str.endsWith("0")) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - 1);
        return strSubstring.endsWith("0") ? strSubstring.substring(0, strSubstring.length() - 2) : strSubstring;
    }

    public static boolean g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 40786, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return com.max.hbcommon.network.b.f68052i ? "13".equals(str) : "8".equals(str);
    }

    public static boolean h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 40777, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return "cdkey".equals(str) || MallOrderDetailObj.ORDER_TYPE_THIRD_CDKEY.equals(str) || MallOrderDetailObj.ORDER_TYPE_CHARGE.equals(str) || MallOrderDetailObj.ORDER_TYPE_STEAM_CARDS.equals(str) || MallOrderDetailObj.ORDER_TYPE_GAME_STEAM_CARDS.equals(str) || MallOrderDetailObj.ORDER_TYPE_RECHARGE_CARDS.equals(str) || MallOrderDetailObj.ORDER_TYPE_GAME_RECHARGE_CARDS.equals(str) || "cdkey_coupon".equals(str) || "bundle".equals(str) || MallOrderDetailObj.ORDER_TYPE_PHYSICAL.equals(str) || "market_balance".equals(str);
    }

    public static void i(Context context, List<MallDiscountParamsObj> list, View view, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{context, list, view, viewGroup}, null, changeQuickRedirect, true, 40767, new Class[]{Context.class, List.class, View.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        viewGroup.removeAllViews();
        for (MallDiscountParamsObj mallDiscountParamsObj : list) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_mall_cat_desc, viewGroup, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
            textView.setText(mallDiscountParamsObj.getTitle());
            textView2.setTextColor(context.getResources().getColor(mallDiscountParamsObj.isBold() ? R.color.text_primary_1_color : R.color.text_primary_2_color));
            if (mallDiscountParamsObj.isBold()) {
                bb.d.d(textView2, 5);
                if (mallDiscountParamsObj.getValue() == null || !mallDiscountParamsObj.getValue().contains("￥")) {
                    textView2.setText(mallDiscountParamsObj.getValue());
                } else {
                    int iIndexOf = mallDiscountParamsObj.getValue().indexOf("￥");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mallDiscountParamsObj.getValue());
                    int i10 = iIndexOf + 1;
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.text_size_11)), iIndexOf, i10, 33);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.text_size_16)), i10, mallDiscountParamsObj.getValue().length(), 33);
                    textView2.setText(spannableStringBuilder);
                }
            } else {
                textView2.setText(mallDiscountParamsObj.getValue());
            }
            viewGroup.addView(viewInflate);
            viewGroup.addView(LayoutInflater.from(context).inflate(R.layout.divider, viewGroup, false));
        }
    }

    public static void j(RecyclerView recyclerView, RadioGroup radioGroup, int i10) {
        if (PatchProxy.proxy(new Object[]{recyclerView, radioGroup, new Integer(i10)}, null, changeQuickRedirect, true, 40778, new Class[]{RecyclerView.class, RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        recyclerView.addOnScrollListener(new n(i10, radioGroup));
    }

    public static void k(Context context, RadioGroup radioGroup, int i10) {
        if (PatchProxy.proxy(new Object[]{context, radioGroup, new Integer(i10)}, null, changeQuickRedirect, true, 40779, new Class[]{Context.class, RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        radioGroup.removeAllViews();
        int i11 = 0;
        while (i11 < i10) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setButtonDrawable(0);
            Drawable drawableX = com.max.xiaoheihe.utils.d.X(R.drawable.indicator_menu_page);
            radioButton.setBackground(drawableX);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(drawableX.getIntrinsicWidth() == -1 ? ViewUtils.f(context, 8.0f) : drawableX.getIntrinsicWidth(), drawableX.getIntrinsicHeight() == -1 ? ViewUtils.f(context, 2.0f) : drawableX.getIntrinsicHeight());
            layoutParams.setMargins(i11 == 0 ? 0 : ViewUtils.f(context, 7.0f), 0, 0, 0);
            radioButton.setLayoutParams(layoutParams);
            radioButton.setEnabled(false);
            radioGroup.addView(radioButton);
            i11++;
        }
        radioGroup.clearCheck();
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(true);
    }

    public static void l(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 40773, new Class[]{Activity.class}, Void.TYPE).isSupported || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(activity).y("充值成功").l("余额充值完毕，请前往钱包页面兑换所需H币");
        fVarL.u("去兑换", new b(activity)).o("取消", new a());
        fVarL.F();
    }

    public static void m(BaseActivity baseActivity, String str, Dialog dialog, g0 g0Var) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, dialog, g0Var}, null, changeQuickRedirect, true, 40776, new Class[]{BaseActivity.class, String.class, Dialog.class, g0.class}, Void.TYPE).isSupported || !baseActivity.isActive() || baseActivity.isFinishing()) {
            return;
        }
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(baseActivity).y("确定使用余额支付此订单？");
        fVarY.u(baseActivity.getString(R.string.confirm), new m(g0Var, dialog)).o(baseActivity.getString(R.string.cancel), new l());
        fVarY.F();
    }

    public static void n(Activity activity, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{activity, gVar}, null, changeQuickRedirect, true, 40781, new Class[]{Activity.class, l0.g.class}, Void.TYPE).isSupported || activity == null || activity.isFinishing()) {
            return;
        }
        w5 w5VarC = w5.c(LayoutInflater.from(activity));
        w5VarC.b().setElevation(ViewUtils.f(activity, 2.0f));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) activity, true, (View) w5VarC.b());
        w5VarC.f117034g.setBackground(com.max.hbutils.utils.q.o(activity, R.color.divider_secondary_1_color, 6.0f));
        w5VarC.f117035h.setBackground(com.max.hbutils.utils.q.o(activity, R.color.divider_secondary_1_color, 6.0f));
        w5VarC.f117036i.setBackground(com.max.hbutils.utils.q.o(activity, R.color.divider_secondary_1_color, 6.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击下方按钮即代表您同意《黑盒商城（国际站）购买协议》");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color)), spannableStringBuilder.length() - 15, spannableStringBuilder.length(), 33);
        w5VarC.f117030c.setText(spannableStringBuilder);
        w5VarC.f117030c.setOnClickListener(new ViewOnClickListenerC0839o(activity));
        iVar.setCancelable(true);
        p pVar = new p(iVar);
        w5VarC.f117031d.setOnClickListener(new q(iVar, gVar));
        w5VarC.f117032e.setOnClickListener(pVar);
        iVar.show();
    }

    public static void o(Activity activity, GiftBotProgressObj giftBotProgressObj) {
        if (!PatchProxy.proxy(new Object[]{activity, giftBotProgressObj}, null, changeQuickRedirect, true, 40768, new Class[]{Activity.class, GiftBotProgressObj.class}, Void.TYPE).isSupported && (activity instanceof BaseActivity) && ((BaseActivity) activity).isActive() && !activity.isFinishing()) {
            View viewInflate = LayoutInflater.from(activity).inflate(R.layout.layout_steam_bot_accept_dialog, (ViewGroup) null, false);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_tips);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_bot_steam_id);
            TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_copy);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_faq);
            ((ViewGroup) viewInflate.findViewById(R.id.vg_bot_steam_id_info)).setVisibility(0);
            textView4.setText(giftBotProgressObj.getHb_friends_code());
            textView5.setOnClickListener(new z(activity, giftBotProgressObj));
            imageView.setOnClickListener(new a0(activity));
            if (ViewUtils.h0(activity, ViewUtils.L(activity)) < 360) {
                textView3.setTextSize(1, 10.0f);
            }
            textView.setText(giftBotProgressObj.getTitle());
            textView2.setText(giftBotProgressObj.getContent());
            textView3.setText(giftBotProgressObj.getTips());
            com.max.hbcommon.view.a.f fVarI = new com.max.hbcommon.view.a.f(activity).i(viewInflate);
            fVarI.u("我已添加", new b0(activity));
            fVarI.o("我明白了", new c0());
            fVarI.w(true);
            fVarI.F();
        }
    }

    public static void p(BaseActivity baseActivity, String str, String str2, List<PayTypeInfoObj> list, g0 g0Var) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2, list, g0Var}, null, changeQuickRedirect, true, 40774, new Class[]{BaseActivity.class, String.class, String.class, List.class, g0.class}, Void.TYPE).isSupported) {
            return;
        }
        q(baseActivity, str, str2, list, false, g0Var);
    }

    public static void q(BaseActivity baseActivity, String str, String str2, List<PayTypeInfoObj> list, boolean z10, g0 g0Var) {
        ViewGroup viewGroup;
        boolean z11;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        ViewGroup viewGroup6;
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2, list, new Byte(z10 ? (byte) 1 : (byte) 0), g0Var}, null, changeQuickRedirect, true, 40775, new Class[]{BaseActivity.class, String.class, String.class, List.class, Boolean.TYPE, g0.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(baseActivity).inflate(R.layout.dialog_pay_type_in_mall, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(baseActivity, 2.0f));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) baseActivity, true, viewInflate);
        MallPayExtraInfo mallPayExtraInfo = new MallPayExtraInfo();
        ViewGroup viewGroup7 = (ViewGroup) viewInflate.findViewById(R.id.vg_container);
        ViewGroup viewGroup8 = (ViewGroup) viewInflate.findViewById(R.id.vg_faq);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_price);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_profit_tips);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_profit_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_profit_exchange);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_hbalance);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_ali_pay);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.tv_ali_pay_desc);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.cb_weixinpay);
        ViewGroup viewGroup9 = (ViewGroup) viewInflate.findViewById(R.id.vg_pay_weixin);
        ViewGroup viewGroup10 = (ViewGroup) viewInflate.findViewById(R.id.vg_pay_ali);
        ViewGroup viewGroup11 = (ViewGroup) viewInflate.findViewById(R.id.vg_pay_hbalace);
        ViewGroup viewGroup12 = (ViewGroup) viewInflate.findViewById(R.id.vg_pay_h5);
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.cb_alipay);
        CheckBox checkBox3 = (CheckBox) viewInflate.findViewById(R.id.cb_hbalancepay);
        CheckBox checkBox4 = (CheckBox) viewInflate.findViewById(R.id.cb_h5);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon_h5);
        TextView textView7 = (TextView) viewInflate.findViewById(R.id.tv_desc_h5);
        ViewGroup viewGroup13 = (ViewGroup) viewInflate.findViewById(R.id.vg_bg);
        ViewGroup viewGroup14 = (ViewGroup) viewInflate.findViewById(R.id.vg_alipay_to_hcash);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_close);
        textView.setText(lb.b.f131104t + (com.max.hbutils.utils.n.p(str) / 1000.0f));
        textView4.setText("我的余额: " + (com.max.hbutils.utils.n.p(str2) / 100.0f) + "元");
        TextView textView8 = (TextView) viewInflate.findViewById(R.id.tv_confirm);
        TextView textView9 = (TextView) viewInflate.findViewById(R.id.tv_pay_tips);
        boolean z12 = com.max.hbutils.utils.n.r(str2) < com.max.hbutils.utils.n.r(str) / 10;
        viewGroup8.setOnClickListener(new c(baseActivity));
        viewGroup9.setOnClickListener(new d(checkBox, checkBox2, checkBox3, checkBox4, mallPayExtraInfo, textView9, g0Var, textView8));
        viewGroup10.setOnClickListener(new e(checkBox2, checkBox, checkBox3, checkBox4, mallPayExtraInfo, textView9, g0Var, z10, textView8));
        viewGroup11.setOnClickListener(new f(checkBox2, checkBox, checkBox3, checkBox4, textView9, g0Var, z10, textView8));
        PayTypeInfoObj payTypeInfoObjB = PaymentManager.B(list);
        if (payTypeInfoObjB != null) {
            textView7.setText(payTypeInfoObjB.getName());
            com.max.hbimage.b.K(payTypeInfoObjB.getIcon(), imageView);
            viewGroup = viewGroup12;
            viewGroup.setVisibility(0);
            viewGroup.setOnClickListener(new g(checkBox2, checkBox, checkBox3, checkBox4, textView9, textView8));
        } else {
            viewGroup = viewGroup12;
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup15 = viewGroup;
        if (z10) {
            int iIndexOfChild = viewGroup7.indexOfChild(viewGroup9);
            int iIndexOfChild2 = viewGroup7.indexOfChild(viewGroup10);
            viewGroup7.removeView(viewGroup9);
            viewGroup7.removeView(viewGroup10);
            viewGroup7.addView(viewGroup9, iIndexOfChild2);
            viewGroup7.addView(viewGroup10, iIndexOfChild);
            textView5.setText("支付宝充值余额");
            viewGroup14.setVisibility(0);
            if (z12) {
                textView6.setText("需充值: " + String.valueOf((int) Math.ceil(((com.max.hbutils.utils.n.r(str) / 10.0f) - com.max.hbutils.utils.n.r(str2)) / 100.0f)) + ".00元");
                textView6.setVisibility(0);
                viewGroup10.setVisibility(0);
            } else {
                viewGroup10.setVisibility(8);
            }
        }
        ViewGroup viewGroup16 = viewGroup15;
        ViewGroup viewGroup17 = viewGroup10;
        ViewGroup viewGroup18 = viewGroup7;
        ViewGroup viewGroup19 = viewGroup9;
        ViewGroup viewGroup20 = viewGroup11;
        baseActivity.V0().c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i3(g0Var.a()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(z12, viewFindViewById, textView2, textView3, baseActivity, iVar, mallPayExtraInfo, checkBox2, textView9, checkBox)));
        textView8.setOnClickListener(new i(checkBox3, str2, str, baseActivity, iVar, g0Var, checkBox2, checkBox, checkBox4, payTypeInfoObjB));
        if (!com.max.hbcommon.utils.c.w(list)) {
            viewGroup18.removeAllViews();
            for (PayTypeInfoObj payTypeInfoObj : list) {
                if ("balance".equals(payTypeInfoObj.getPay_type())) {
                    viewGroup2 = viewGroup18;
                    viewGroup3 = viewGroup20;
                    viewGroup2.addView(viewGroup3);
                    viewGroup5 = viewGroup17;
                    viewGroup6 = viewGroup16;
                    viewGroup4 = viewGroup19;
                } else {
                    viewGroup2 = viewGroup18;
                    viewGroup3 = viewGroup20;
                    if ("wechat".equals(payTypeInfoObj.getPay_type())) {
                        viewGroup4 = viewGroup19;
                        viewGroup2.addView(viewGroup4);
                        viewGroup5 = viewGroup17;
                    } else {
                        viewGroup4 = viewGroup19;
                        if (PaymentManager.f71422u.equals(payTypeInfoObj.getPay_type())) {
                            viewGroup5 = viewGroup17;
                            viewGroup2.addView(viewGroup5);
                        } else {
                            viewGroup5 = viewGroup17;
                            if ("h5".equals(payTypeInfoObj.getPay_type())) {
                                viewGroup6 = viewGroup16;
                                viewGroup2.addView(viewGroup6);
                            }
                        }
                    }
                    viewGroup6 = viewGroup16;
                }
                viewGroup16 = viewGroup6;
                viewGroup18 = viewGroup2;
                viewGroup19 = viewGroup4;
                viewGroup17 = viewGroup5;
                viewGroup20 = viewGroup3;
            }
        }
        ViewGroup viewGroup21 = viewGroup18;
        ViewGroup viewGroup22 = viewGroup20;
        if (z12 || viewGroup21.indexOfChild(viewGroup22) < 0) {
            z11 = true;
            if (viewGroup21.getChildCount() > 1) {
                viewGroup21.getChildAt(1).performClick();
            } else {
                viewGroup21.getChildAt(0).performClick();
            }
        } else {
            viewGroup22.performClick();
            z11 = true;
        }
        r28.setContentView(viewInflate);
        r28.setCancelable(z11);
        j jVar = new j(r28);
        imageView2.setOnClickListener(jVar);
        viewGroup13.setOnClickListener(jVar);
        iVar.show();
    }

    public static void r(BaseActivity baseActivity, String str, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, gVar}, null, changeQuickRedirect, true, 40766, new Class[]{BaseActivity.class, String.class, l0.g.class}, Void.TYPE).isSupported || !baseActivity.isActive() || baseActivity.isFinishing()) {
            return;
        }
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(baseActivity).y("余额不足").l("请充值余额或更换支付方式");
        fVarL.u(baseActivity.getString(R.string.go_recharge), new v(baseActivity, str, gVar)).o(baseActivity.getString(R.string.cancel), new k());
        fVarL.F();
    }

    public static void s(BaseActivity baseActivity, MallPrepareStateObj mallPrepareStateObj, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{baseActivity, mallPrepareStateObj, gVar}, null, changeQuickRedirect, true, 40784, new Class[]{BaseActivity.class, MallPrepareStateObj.class, l0.g.class}, Void.TYPE).isSupported || !baseActivity.isActive() || baseActivity.isFinishing()) {
            return;
        }
        o6 o6VarC = o6.c(LayoutInflater.from(baseActivity));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) baseActivity, true, (View) o6VarC.b());
        o6VarC.f114108d.setLayoutManager(new LinearLayoutManager(baseActivity));
        o6VarC.f114108d.setAdapter(new t(baseActivity, mallPrepareStateObj.getInfos(), R.layout.item_steam_state_check));
        u uVar = new u(iVar);
        if (com.max.hbcommon.utils.c.x(mallPrepareStateObj.getRecheck())) {
            o6VarC.f114106b.setShowLeftButton(true);
            o6VarC.f114106b.setRightClickListener(new w(iVar, gVar));
            o6VarC.f114106b.setRightText("重新检测");
            o6VarC.f114106b.setLeftClickListener(uVar);
            o6VarC.f114106b.setLeftText("我知道了");
        } else {
            o6VarC.f114106b.setShowLeftButton(false);
            o6VarC.f114106b.setRightClickListener(uVar);
            o6VarC.f114106b.setRightText("我知道了");
        }
        o6VarC.f114112h.setOnClickListener(new x(baseActivity));
        o6VarC.f114110f.setOnClickListener(uVar);
        o6VarC.f114107c.setOnClickListener(uVar);
        iVar.setCancelable(true);
        iVar.show();
        baseActivity.N0(iVar);
    }

    public static void t(BaseActivity baseActivity, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{baseActivity, keyDescObj}, null, changeQuickRedirect, true, 40783, new Class[]{BaseActivity.class, KeyDescObj.class}, Void.TYPE).isSupported || !baseActivity.isActive() || baseActivity.isFinishing()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(baseActivity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(baseActivity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.f(baseActivity, 315.0f), ViewUtils.f(baseActivity, 146.0f));
        layoutParams.gravity = 17;
        imageView.setImageResource(R.drawable.common_default_placeholder_375x210);
        com.max.hbimage.b.L(keyDescObj.getImg(), imageView, R.drawable.common_default_placeholder_375x210);
        frameLayout.addView(imageView, layoutParams);
        com.max.hbcommon.view.a aVarF = new com.max.hbcommon.view.a.f(baseActivity).A(frameLayout).y(keyDescObj.getTitle()).l(keyDescObj.getDesc()).w(true).u("绑定领取奖励", new s(baseActivity)).F();
        aVarF.f().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVarF.f().getLayoutParams();
        marginLayoutParams.topMargin = ViewUtils.f(baseActivity, 10.0f);
        marginLayoutParams.bottomMargin = ViewUtils.f(baseActivity, 20.0f);
    }

    private static void u(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 40769, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y("正在确认好友状态").l("请稍后查看").t(R.string.confirm, new d0(activity)).F();
    }

    public static void v(Activity activity, String str) {
        if (PatchProxy.proxy(new Object[]{activity, str}, null, changeQuickRedirect, true, 40771, new Class[]{Activity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        w(activity, null, str, null, null);
    }

    public static void w(Activity activity, String str, String str2, String str3, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{activity, str, str2, str3, gVar}, null, changeQuickRedirect, true, 40772, new Class[]{Activity.class, String.class, String.class, String.class, l0.g.class}, Void.TYPE).isSupported || activity.isFinishing()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_dialog_error);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.setPadding(0, ViewUtils.f(activity, 16.0f), 0, ViewUtils.f(activity, 12.0f));
        frameLayout.addView(imageView, layoutParams);
        if (com.max.hbcommon.utils.c.u(str)) {
            str = "出现了一些问题";
        }
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(activity).A(frameLayout).y(str).l(str2);
        if (!com.max.hbcommon.utils.c.u(str3)) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            TextView textView = new TextView(activity);
            frameLayout2.addView(textView, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = ViewUtils.f(activity, 10.0f);
            layoutParams3.bottomMargin = ViewUtils.f(activity, 24.0f);
            layoutParams3.gravity = 1;
            frameLayout2.setLayoutParams(layoutParams3);
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView.setTextSize(1, 12.0f);
            textView.setText("查看原因");
            Drawable drawable = activity.getDrawable(R.drawable.special_right_small_line_24x24);
            drawable.setBounds(0, 0, ViewUtils.f(activity, 12.0f), ViewUtils.f(activity, 12.0f));
            drawable.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color), PorterDuff.Mode.SRC_ATOP);
            textView.setCompoundDrawables(null, null, drawable, null);
            textView.setCompoundDrawablePadding(ViewUtils.f(activity, 2.0f));
            frameLayout2.setOnClickListener(new e0(activity, str3));
            fVarL.i(frameLayout2);
        }
        fVarL.u(activity.getString(R.string.confirm), new f0(gVar));
        fVarL.w(true);
        com.max.hbcommon.view.a aVarF = fVarL.F();
        if (com.max.hbcommon.utils.c.u(str3)) {
            return;
        }
        aVarF.f().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
    }

    public static void x() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 40770, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().pb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p());
    }
}
