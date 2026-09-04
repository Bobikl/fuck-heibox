package com.max.hbwallet.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.i;
import com.max.hbcommon.utils.l;
import com.max.hbpay.PaymentManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.R;
import com.max.hbwallet.bean.RefundDetailObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: WalletUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: WalletUtils.java */
    public class a extends com.max.hbcommon.network.d<Result<RefundDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f74260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f74261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f74262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewGroup f74263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f74264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BaseActivity f74265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextView f74266h;

        /* JADX INFO: renamed from: com.max.hbwallet.utils.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WalletUtils.java */
        public class ViewOnClickListenerC0595a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            ViewOnClickListenerC0595a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.S5, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ob.a aVar = ob.a.f132240a;
                ob.a.p().a(a.this.f74265g, "常见问题", lb.a.H3);
            }
        }

        a(TextView textView, ImageView imageView, TextView textView2, ViewGroup viewGroup, TextView textView3, BaseActivity baseActivity, TextView textView4) {
            this.f74260b = textView;
            this.f74261c = imageView;
            this.f74262d = textView2;
            this.f74263e = viewGroup;
            this.f74264f = textView3;
            this.f74265g = baseActivity;
            this.f74266h = textView4;
        }

        public void onNext(Result<RefundDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.Q5, new Class[]{Result.class}, Void.TYPE).isSupported || result.getResult() == null) {
                return;
            }
            RefundDetailObj result2 = result.getResult();
            this.f74260b.setText(lb.b.f131104t + result2.getRefund_price());
            if (PaymentManager.f71426y.equals(result2.getRefund_way())) {
                this.f74261c.setImageResource(R.drawable.weixinpay);
                this.f74262d.setText("微信");
            } else {
                this.f74261c.setImageResource(R.drawable.common_alipay_38x38);
                this.f74262d.setText("支付宝");
            }
            if (com.max.hbcommon.utils.c.u(result2.getFee_title())) {
                this.f74263e.setVisibility(8);
            } else {
                this.f74263e.setVisibility(0);
                this.f74264f.setText(result2.getFee_title());
                this.f74263e.setOnClickListener(new ViewOnClickListenerC0595a());
            }
            this.f74266h.setText(result2.getTips());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.R5, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<RefundDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: WalletUtils.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f74268b;

        b(i iVar) {
            this.f74268b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.T5, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = this.f74268b) == null || !iVar.isShowing()) {
                return;
            }
            this.f74268b.dismiss();
        }
    }

    /* JADX INFO: compiled from: WalletUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f74269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f74270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f74271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC0596d f74272e;

        /* JADX INFO: compiled from: WalletUtils.java */
        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.V5, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: WalletUtils.java */
        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: WalletUtils.java */
            public class a extends com.max.hbcommon.network.d<Result> {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                public void onNext(Result result) {
                    if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.X5, new Class[]{Result.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f("发起退款成功！");
                    } else {
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(result.getMsg());
                    }
                    i iVar = c.this.f74271d;
                    if (iVar != null && iVar.isShowing()) {
                        c.this.f74271d.dismiss();
                    }
                    InterfaceC0596d interfaceC0596d = c.this.f74272e;
                    if (interfaceC0596d != null) {
                        interfaceC0596d.a();
                    }
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.Y5, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    onNext((Result) obj);
                }
            }

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.W5, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                c.this.f74269b.V0().c((io.reactivex.disposables.b) ce.b.a().p(c.this.f74270c).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
            }
        }

        c(BaseActivity baseActivity, String str, i iVar, InterfaceC0596d interfaceC0596d) {
            this.f74269b = baseActivity;
            this.f74270c = str;
            this.f74271d = iVar;
            this.f74272e = interfaceC0596d;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.U5, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            new com.max.hbcommon.view.a.f(this.f74269b).y("是否发起退款").t(R.string.confirm, new b()).n(R.string.cancel, new a()).F();
        }
    }

    /* JADX INFO: renamed from: com.max.hbwallet.utils.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WalletUtils.java */
    public interface InterfaceC0596d {
        void a();
    }

    public static ProgressDialog a(Context context, String str, String str2, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.P5, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, ProgressDialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressDialog) patchProxyResultProxy.result;
        }
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setProgressStyle(0);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(z10);
        return progressDialog;
    }

    public static void b(Context context, int i10) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.l.N5, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ob.a aVar = ob.a.f132240a;
        ob.a.l().f(context, lb.d.f131228p2).O("page_index", i10).A();
    }

    public static ProgressDialog c(Context context, String str, String str2, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.O5, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, ProgressDialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressDialog) patchProxyResultProxy.result;
        }
        ProgressDialog progressDialogA = a(context, str, str2, z10);
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return progressDialogA;
        }
        progressDialogA.show();
        return progressDialogA;
    }

    public static void d(BaseActivity baseActivity, String str, String str2, InterfaceC0596d interfaceC0596d) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2, interfaceC0596d}, null, changeQuickRedirect, true, bb.c.l.M5, new Class[]{BaseActivity.class, String.class, String.class, InterfaceC0596d.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(baseActivity).inflate(R.layout.hbwallet_dialog_refund_detail, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(baseActivity, 2.0f));
        i iVar = new i((Context) baseActivity, true, viewInflate);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.vg_bg);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_price);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_confirm);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_tips);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_cancel);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_refund_way);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_refund_way);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_fee_title);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.tv_fee_title);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_close);
        baseActivity.V0().c((io.reactivex.disposables.b) ce.b.a().g(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(textView, imageView, textView5, viewGroup2, textView6, baseActivity, textView3)));
        b bVar = new b(iVar);
        if ("0".equals(str2)) {
            textView4.setText("取消");
            textView4.setBackgroundResource(R.drawable.hint_border_2dp);
            textView4.setTextColor(l.a(R.color.text_primary_1_color));
            textView4.setOnClickListener(bVar);
            textView2.setVisibility(0);
            textView2.setOnClickListener(new c(baseActivity, str, iVar, interfaceC0596d));
        } else if ("1".equals(str2)) {
            textView4.setText("退款中");
            textView4.setBackgroundResource(R.drawable.divider_color_concept_2dp);
            textView4.setTextColor(l.a(R.color.text_secondary_1_color));
            textView2.setVisibility(8);
            textView4.setOnClickListener(null);
        } else if ("2".equals(str2)) {
            textView4.setText("退款成功");
            textView4.setBackgroundResource(R.drawable.divider_color_concept_2dp);
            textView4.setTextColor(l.a(R.color.text_primary_1_color));
            textView2.setVisibility(8);
            textView4.setOnClickListener(null);
        } else {
            textView4.setText("退款失败");
            textView4.setBackgroundResource(R.drawable.divider_color_concept_2dp);
            textView4.setTextColor(l.a(R.color.text_primary_1_color));
            textView2.setVisibility(8);
            textView4.setOnClickListener(null);
        }
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        imageView2.setOnClickListener(bVar);
        viewGroup.setOnClickListener(bVar);
        iVar.show();
    }
}
