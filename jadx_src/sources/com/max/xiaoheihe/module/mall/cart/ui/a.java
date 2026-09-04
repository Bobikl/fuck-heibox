package com.max.xiaoheihe.module.mall.cart.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.text.SpannableString;
import android.view.View;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.HBDialogManagerKt;
import com.max.xiaoheihe.bean.mall.MoreOptionBtnsObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.view.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cart.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
    @t0({"SMAP\nFastManageOrderActionBarRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastManageOrderActionBarRight.kt\ncom/max/xiaoheihe/module/mall/cart/ui/FastManageOrderActionBarRightKt$handleOrderAction$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1855#2,2:166\n*S KotlinDebug\n*F\n+ 1 FastManageOrderActionBarRight.kt\ncom/max/xiaoheihe/module/mall/cart/ui/FastManageOrderActionBarRightKt$handleOrderAction$1\n*L\n35#1:166,2\n*E\n"})
    public static final class ViewOnClickListenerC0828a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<MoreOptionBtnsObj> f90487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.mall.cart.ui.c f90488d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cart.ui.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
        @t0({"SMAP\nFastManageOrderActionBarRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastManageOrderActionBarRight.kt\ncom/max/xiaoheihe/module/mall/cart/ui/FastManageOrderActionBarRightKt$handleOrderAction$1$2\n+ 2 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n1#1,165:1\n30#2:166\n30#2:167\n30#2:168\n30#2:169\n*S KotlinDebug\n*F\n+ 1 FastManageOrderActionBarRight.kt\ncom/max/xiaoheihe/module/mall/cart/ui/FastManageOrderActionBarRightKt$handleOrderAction$1$2\n*L\n78#1:166\n79#1:167\n81#1:168\n83#1:169\n*E\n"})
        public static final class C0829a implements com.max.xiaoheihe.view.popupmenu.a.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<MoreOptionBtnsObj> f90489a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f90490b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.xiaoheihe.module.mall.cart.ui.c f90491c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cart.ui.a$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
            public static final class C0830a implements m {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ MoreOptionBtnsObj f90492a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.max.xiaoheihe.module.mall.cart.ui.c f90493b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Activity f90494c;

                C0830a(MoreOptionBtnsObj moreOptionBtnsObj, com.max.xiaoheihe.module.mall.cart.ui.c cVar, Activity activity) {
                    this.f90492a = moreOptionBtnsObj;
                    this.f90493b = cVar;
                    this.f90494c = activity;
                }

                @Override // com.max.xiaoheihe.view.m
                public void a(@dl.d Dialog dialog) {
                    if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 41438, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(dialog, "dialog");
                    if (!f0.g(this.f90492a.getTips_alert_next_on_cancel(), Boolean.TRUE)) {
                        C0829a.c(this.f90493b, this.f90494c, this.f90492a.getType());
                    }
                    dialog.dismiss();
                }

                @Override // com.max.xiaoheihe.view.m
                public void b(@dl.d Dialog dialog) {
                    if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 41437, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(dialog, "dialog");
                    if (f0.g(this.f90492a.getTips_alert_next_on_cancel(), Boolean.TRUE)) {
                        C0829a.c(this.f90493b, this.f90494c, this.f90492a.getType());
                    }
                    dialog.dismiss();
                }
            }

            C0829a(List<MoreOptionBtnsObj> list, Activity activity, com.max.xiaoheihe.module.mall.cart.ui.c cVar) {
                this.f90489a = list;
                this.f90490b = activity;
                this.f90491c = cVar;
            }

            public static final /* synthetic */ void c(com.max.xiaoheihe.module.mall.cart.ui.c cVar, Activity activity, String str) {
                if (PatchProxy.proxy(new Object[]{cVar, activity, str}, null, changeQuickRedirect, true, 41436, new Class[]{com.max.xiaoheihe.module.mall.cart.ui.c.class, Activity.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                d(cVar, activity, str);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            private static final void d(com.max.xiaoheihe.module.mall.cart.ui.c cVar, Activity activity, String str) {
                if (PatchProxy.proxy(new Object[]{cVar, activity, str}, null, changeQuickRedirect, true, 41435, new Class[]{com.max.xiaoheihe.module.mall.cart.ui.c.class, Activity.class, String.class}, Void.TYPE).isSupported || str == null) {
                    return;
                }
                switch (str.hashCode()) {
                    case -1854767153:
                        if (str.equals("support")) {
                            com.max.xiaoheihe.base.router.b.i0(activity, lb.d.f131195k4);
                            break;
                        }
                        break;
                    case -1480207031:
                        if (str.equals("cancel_order") && cVar != null) {
                            cVar.b();
                        }
                        break;
                    case -934813832:
                        if (str.equals("refund") && cVar != null) {
                            cVar.c();
                            break;
                        }
                        break;
                    case 1158910855:
                        if (str.equals("return_goods")) {
                            a.a(activity);
                            break;
                        }
                        break;
                }
            }

            @Override // com.max.xiaoheihe.view.popupmenu.a.g
            public void a(@e View view, int i10) {
                if (!PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 41434, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported && i10 >= 0 && i10 <= CollectionsKt__CollectionsKt.G(this.f90489a)) {
                    MoreOptionBtnsObj moreOptionBtnsObj = this.f90489a.get(i10);
                    String tips_type = moreOptionBtnsObj.getTips_type();
                    if (f0.g(tips_type, ob.b.f132262n)) {
                        com.max.hbutils.utils.c.f(moreOptionBtnsObj.getTips_message());
                        return;
                    }
                    if (!f0.g(tips_type, "alert")) {
                        if (tips_type == null) {
                            d(this.f90491c, this.f90490b, moreOptionBtnsObj.getType());
                            return;
                        }
                        return;
                    }
                    Activity activity = this.f90490b;
                    String tips_title = moreOptionBtnsObj.getTips_title();
                    if (tips_title == null) {
                        tips_title = "";
                    }
                    SpannableString spannableStringValueOf = SpannableString.valueOf(tips_title);
                    f0.o(spannableStringValueOf, "valueOf(this)");
                    String tips_message = moreOptionBtnsObj.getTips_message();
                    if (tips_message == null) {
                        tips_message = "";
                    }
                    SpannableString spannableStringValueOf2 = SpannableString.valueOf(tips_message);
                    f0.o(spannableStringValueOf2, "valueOf(this)");
                    String tips_alert_confirm_btn_text = moreOptionBtnsObj.getTips_alert_confirm_btn_text();
                    if (tips_alert_confirm_btn_text == null) {
                        tips_alert_confirm_btn_text = "";
                    }
                    SpannableString spannableStringValueOf3 = SpannableString.valueOf(tips_alert_confirm_btn_text);
                    f0.o(spannableStringValueOf3, "valueOf(this)");
                    String tips_alert_cancel_btn_text = moreOptionBtnsObj.getTips_alert_cancel_btn_text();
                    SpannableString spannableStringValueOf4 = SpannableString.valueOf(tips_alert_cancel_btn_text != null ? tips_alert_cancel_btn_text : "");
                    f0.o(spannableStringValueOf4, "valueOf(this)");
                    HBDialogManagerKt.d(activity, spannableStringValueOf, spannableStringValueOf2, spannableStringValueOf3, spannableStringValueOf4, new C0830a(moreOptionBtnsObj, this.f90491c, this.f90490b));
                }
            }

            @Override // com.max.xiaoheihe.view.popupmenu.a.g
            public boolean b(@e View view, @e View view2) {
                return true;
            }
        }

        ViewOnClickListenerC0828a(Activity activity, List<MoreOptionBtnsObj> list, com.max.xiaoheihe.module.mall.cart.ui.c cVar) {
            this.f90486b = activity;
            this.f90487c = list;
            this.f90488d = cVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41433, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.popupmenu.a aVar = new com.max.xiaoheihe.view.popupmenu.a(this.f90486b);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.f90487c.iterator();
            while (it.hasNext()) {
                String btn_title = ((MoreOptionBtnsObj) it.next()).getBtn_title();
                if (btn_title != null) {
                    arrayList.add(btn_title);
                }
            }
            aVar.Z(view, arrayList, new C0829a(this.f90487c, this.f90486b, this.f90488d));
        }
    }

    /* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.mall.cart.ui.c f90496c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cart.ui.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
        public static final class C0831a implements com.max.xiaoheihe.view.popupmenu.a.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.max.xiaoheihe.module.mall.cart.ui.c f90497a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f90498b;

            C0831a(com.max.xiaoheihe.module.mall.cart.ui.c cVar, Activity activity) {
                this.f90497a = cVar;
                this.f90498b = activity;
            }

            @Override // com.max.xiaoheihe.view.popupmenu.a.g
            public void a(@e View view, int i10) {
                if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 41440, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        return;
                    }
                    com.max.xiaoheihe.base.router.b.i0(this.f90498b, lb.d.f131195k4);
                } else {
                    com.max.xiaoheihe.module.mall.cart.ui.c cVar = this.f90497a;
                    if (cVar != null) {
                        cVar.b();
                    }
                }
            }

            @Override // com.max.xiaoheihe.view.popupmenu.a.g
            public boolean b(@e View view, @e View view2) {
                return true;
            }
        }

        b(Activity activity, com.max.xiaoheihe.module.mall.cart.ui.c cVar) {
            this.f90495b = activity;
            this.f90496c = cVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41439, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.popupmenu.a aVar = new com.max.xiaoheihe.view.popupmenu.a(this.f90495b);
            ArrayList arrayList = new ArrayList();
            arrayList.add("取消订单");
            arrayList.add("帮助中心");
            aVar.Z(view, arrayList, new C0831a(this.f90496c, this.f90495b));
        }
    }

    /* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90499b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cart.ui.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
        public static final class C0832a implements com.max.xiaoheihe.view.popupmenu.a.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f90500a;

            C0832a(Activity activity) {
                this.f90500a = activity;
            }

            @Override // com.max.xiaoheihe.view.popupmenu.a.g
            public void a(@e View view, int i10) {
                if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 41442, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (i10 == 0) {
                    com.max.xiaoheihe.base.router.b.i0(this.f90500a, lb.d.f131195k4);
                } else {
                    if (i10 != 1) {
                        return;
                    }
                    a.a(this.f90500a);
                }
            }

            @Override // com.max.xiaoheihe.view.popupmenu.a.g
            public boolean b(@e View view, @e View view2) {
                return true;
            }
        }

        c(Activity activity) {
            this.f90499b = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41441, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.popupmenu.a aVar = new com.max.xiaoheihe.view.popupmenu.a(this.f90499b);
            ArrayList arrayList = new ArrayList();
            arrayList.add("帮助中心");
            arrayList.add("售后服务");
            aVar.Z(view, arrayList, new C0832a(this.f90499b));
        }
    }

    /* JADX INFO: compiled from: FastManageOrderActionBarRight.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90501b;

        d(Activity activity) {
            this.f90501b = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41443, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(this.f90501b, lb.d.f131195k4);
        }
    }

    public static final /* synthetic */ void a(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 41432, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        c(activity);
    }

    public static final void b(@dl.d TitleBar titleBar, @dl.d Activity mContext, @e List<MoreOptionBtnsObj> list, @e com.max.xiaoheihe.module.mall.cart.ui.c cVar) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{titleBar, mContext, list, cVar}, null, changeQuickRedirect, true, 41430, new Class[]{TitleBar.class, Activity.class, List.class, com.max.xiaoheihe.module.mall.cart.ui.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(titleBar, "<this>");
        f0.p(mContext, "mContext");
        if (!(list == null || list.isEmpty())) {
            titleBar.setActionIcon(R.drawable.common_more);
            titleBar.setActionIconOnClickListener(new ViewOnClickListenerC0828a(mContext, list, cVar));
            return;
        }
        if (cVar != null && cVar.a()) {
            titleBar.setActionIcon(R.drawable.common_more);
            titleBar.setActionIconOnClickListener(new b(mContext, cVar));
            return;
        }
        if (cVar != null && cVar.d()) {
            z10 = true;
        }
        if (z10) {
            titleBar.setActionIcon(R.drawable.common_more);
            titleBar.setActionIconOnClickListener(new c(mContext));
        } else {
            titleBar.setActionIcon(R.drawable.common_service);
            titleBar.setActionIconOnClickListener(new d(mContext));
        }
    }

    private static final void c(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 41431, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f131011n3);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.request_return_replacement));
        activity.startActivity(intent);
    }
}
