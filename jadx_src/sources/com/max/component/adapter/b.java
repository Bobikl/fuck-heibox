package com.max.component.adapter;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.max.component.R;
import com.max.component.bean.ComponentObj;
import com.max.component.componentactivities.ComponentDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComponentListAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends e<ComponentObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final Context f65429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<ComponentObj> f65430h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d Context context, @dl.d List<ComponentObj> list) {
        super(context, list, R.layout.item_component);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f65429g = context;
        this.f65430h = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(b this$0, ComponentObj componentObj, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, componentObj, view}, null, changeQuickRedirect, true, bb.c.b.Pk, new Class[]{b.class, ComponentObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        Context context = this$0.f65429g;
        context.startActivity(ComponentDetailActivity.f65484e.a(context, componentObj != null ? componentObj.getAndroidName() : null));
    }

    public void A(@dl.e e.C0530e c0530e, @dl.e final ComponentObj componentObj) {
        View view;
        if (PatchProxy.proxy(new Object[]{c0530e, componentObj}, this, changeQuickRedirect, false, bb.c.b.Nk, new Class[]{e.C0530e.class, ComponentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = c0530e != null ? (ImageView) c0530e.g(R.id.iv) : null;
        TextView textView = c0530e != null ? (TextView) c0530e.g(R.id.tv_design_name) : null;
        TextView textView2 = c0530e != null ? (TextView) c0530e.g(R.id.tv_android_name) : null;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = z(imageView.getContext()) / 3;
            }
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = ((z(imageView.getContext()) / 3) * 5) / 8;
            }
            Glide.F(imageView.getContext()).load(componentObj != null ? componentObj.getImage() : null).C1(imageView);
        }
        if (textView != null) {
            textView.setText(componentObj != null ? componentObj.getDesignName() : null);
        }
        if (textView2 != null) {
            textView2.setText(componentObj != null ? componentObj.getAndroidName() : null);
        }
        if (c0530e == null || (view = c0530e.itemView) == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.max.component.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.B(this.f65427b, componentObj, view2);
            }
        });
    }

    @Override // com.max.component.adapter.e
    public /* bridge */ /* synthetic */ void r(e.C0530e c0530e, ComponentObj componentObj) {
        if (PatchProxy.proxy(new Object[]{c0530e, componentObj}, this, changeQuickRedirect, false, bb.c.b.Qk, new Class[]{e.C0530e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        A(c0530e, componentObj);
    }

    @dl.d
    public final Context x() {
        return this.f65429g;
    }

    @dl.d
    public final List<ComponentObj> y() {
        return this.f65430h;
    }

    public final int z(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.b.Ok, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (context == null) {
            return 0;
        }
        Object systemService = context.getSystemService("window");
        f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
