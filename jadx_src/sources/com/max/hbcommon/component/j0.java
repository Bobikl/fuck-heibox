package com.max.hbcommon.component;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.j1;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LoadingDialogComponent.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class j0 implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, bb.c.d.Xc, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "$context");
        new LoadingDialog(context, "加载中...", true).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, bb.c.d.Yc, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "$context");
        new LoadingDialog(context, null, true).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.d.Zc, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c.f("提示提示");
    }

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d final Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Wc, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        TextView textView = new TextView(context);
        textView.setText("展示Loading");
        textView.setPadding(60, 60, 60, 60);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j0.i(context, view);
            }
        });
        textView.setGravity(17);
        textView.setBackgroundColor(j1.f21601t);
        textView.setTextColor(-1);
        linearLayout.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText("展示无文字Loading");
        textView2.setPadding(60, 60, 60, 60);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j0.j(context, view);
            }
        });
        textView2.setGravity(17);
        textView2.setBackgroundColor(j1.f21601t);
        textView2.setTextColor(-1);
        linearLayout.addView(textView2, layoutParams);
        TextView textView3 = new TextView(context);
        textView3.setText("展示Toast");
        textView3.setPadding(60, 60, 60, 60);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j0.k(view);
            }
        });
        textView3.setGravity(17);
        textView3.setBackgroundColor(j1.f21601t);
        textView3.setTextColor(-1);
        linearLayout.addView(textView3, layoutParams);
        return linearLayout;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/3eafa30b85c0c9bb22ef90581390b370.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Vc, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String simpleName = LoadingDialog.class.getSimpleName();
        kotlin.jvm.internal.f0.o(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return com.max.component.b.f65479f;
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "dialog/toast";
    }
}
