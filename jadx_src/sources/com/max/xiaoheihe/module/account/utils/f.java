package com.max.xiaoheihe.module.account.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.annotation.v;
import com.google.gson.JsonObject;
import com.max.hbcustomview.RippleView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.DraftListActivity;
import com.max.xiaoheihe.module.game.GameStoreActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ProfileUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f79302a = "menu_type__task";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f79303b = "menu_type_mall";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f79304c = "menu_type_creator_studio";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f79305d = "menu_type_drafts";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f79306e = "menu_type_create_inspiration";

    /* JADX INFO: compiled from: ProfileUtils.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79307b;

        a(Context context) {
            this.f79307b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25415, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(this.f79307b)) {
                com.max.xiaoheihe.base.router.b.d0(this.f79307b, i0.j(), "task").A();
            }
        }
    }

    /* JADX INFO: compiled from: ProfileUtils.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79308b;

        b(Context context) {
            this.f79308b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25416, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f79308b;
            context.startActivity(GameStoreActivity.R1(context));
        }
    }

    /* JADX INFO: compiled from: ProfileUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0.g f79311d;

        c(Context context, String str, l0.g gVar) {
            this.f79309b = context;
            this.f79310c = str;
            this.f79311d = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25417, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (i0.e(this.f79309b)) {
                com.max.xiaoheihe.base.router.b.k0(this.f79309b, this.f79310c);
            }
            l0.g gVar = this.f79311d;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: ProfileUtils.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79312b;

        d(Context context) {
            this.f79312b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25418, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(this.f79312b)) {
                com.max.hbcommon.analytics.d.d("4", lb.d.R1, null, new JsonObject());
                Context context = this.f79312b;
                context.startActivity(DraftListActivity.z2(context));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context, String str, View view) {
        if (!PatchProxy.proxy(new Object[]{context, str, view}, null, changeQuickRedirect, true, 25414, new Class[]{Context.class, String.class, View.class}, Void.TYPE).isSupported && i0.e(context)) {
            com.max.xiaoheihe.base.router.b.j0(context, str);
        }
    }

    public static void c(View view, String str, String str2, @p0 String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{view, str, str2, str3, str4}, null, changeQuickRedirect, true, 25410, new Class[]{View.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        d(view, str, str2, str3, str4, false);
    }

    public static void d(View view, String str, String str2, @p0 String str3, String str4, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, str, str2, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25411, new Class[]{View.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        e(view, str, str2, str3, str4, z10, null, Boolean.FALSE, null);
    }

    public static void e(View view, String str, String str2, @p0 String str3, final String str4, boolean z10, @p0 String str5, Boolean bool, l0.g gVar) {
        int i10;
        int i11;
        if (PatchProxy.proxy(new Object[]{view, str, str2, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0), str5, bool, gVar}, null, changeQuickRedirect, true, 25412, new Class[]{View.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, Boolean.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_img);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.radius_iv_img);
        TextView textView = (TextView) view.findViewById(R.id.tv_name);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_desc);
        RippleView rippleView = (RippleView) view.findViewById(R.id.rip_circle);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_red_dot);
        final Context context = view.getContext();
        if (f79302a.equals(str)) {
            f(imageView, imageView2, str3, R.drawable.ic_task, bool.booleanValue());
            if (com.max.hbcommon.utils.c.u(str5)) {
                textView.setText(R.string.my_task);
            } else {
                textView.setText(str5);
            }
            if (com.max.hbcommon.utils.c.u(str2)) {
                i10 = 0;
                i11 = 8;
                textView2.setVisibility(8);
            } else {
                i10 = 0;
                textView2.setVisibility(0);
                textView2.setText(str2);
                i11 = 8;
            }
            if (z10) {
                rippleView.setVisibility(i10);
                imageView3.setVisibility(i10);
            } else {
                rippleView.setVisibility(i11);
                imageView3.setVisibility(i11);
            }
            view.setOnClickListener(new a(context));
            return;
        }
        if (f79303b.equals(str)) {
            f(imageView, imageView2, str3, R.drawable.ic_shop, bool.booleanValue());
            if (com.max.hbcommon.utils.c.u(str5)) {
                textView.setText(R.string.h_coin_shop);
            } else {
                textView.setText(str5);
            }
            if (com.max.hbcommon.utils.c.u(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str2);
            }
            view.setOnClickListener(new b(context));
            return;
        }
        if (f79304c.equals(str)) {
            f(imageView, imageView2, str3, R.drawable.ic_creator_studio, bool.booleanValue());
            if (com.max.hbcommon.utils.c.u(str5)) {
                textView.setText(R.string.author_center);
            } else {
                textView.setText(str5);
            }
            if (com.max.hbcommon.utils.c.u(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str2);
            }
            view.setOnClickListener(new c(context, str4, gVar));
            return;
        }
        if (f79305d.equals(str)) {
            f(imageView, imageView2, str3, R.drawable.common_draft, bool.booleanValue());
            if (com.max.hbcommon.utils.c.u(str5)) {
                textView.setText(R.string.draft_box);
            } else {
                textView.setText(str5);
            }
            if (com.max.hbcommon.utils.c.u(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str2);
            }
            view.setOnClickListener(new d(context));
            return;
        }
        if (f79306e.equals(str)) {
            f(imageView, imageView2, str3, -1, bool.booleanValue());
            if (com.max.hbcommon.utils.c.u(str5)) {
                textView.setText(R.string.create_inspiration);
            } else {
                textView.setText(str5);
            }
            if (com.max.hbcommon.utils.c.u(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str2);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.utils.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.b(context, str4, view2);
                }
            });
        }
    }

    private static void f(ImageView imageView, ImageView imageView2, @p0 String str, @v int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{imageView, imageView2, str, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25413, new Class[]{ImageView.class, ImageView.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null || str.isEmpty()) {
            if (i10 != -1) {
                imageView.setImageResource(i10);
                return;
            }
            return;
        }
        if (z10) {
            imageView2.setVisibility(0);
            imageView.setVisibility(4);
            imageView = imageView2;
        } else {
            imageView2.setVisibility(4);
            imageView.setVisibility(0);
        }
        com.max.hbimage.b.K(str, imageView);
    }
}
