package com.max.xiaoheihe.utils.imageviewer.ui;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.c1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.core.c;
import com.heybox.imageviewer.core.i;
import com.heybox.imageviewer.core.j;
import com.heybox.imageviewer.widgets.PhotoView2;
import com.heybox.imageviewer.widgets.SubsamplingScaleImageView2;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.imageviewer.ExtentionsKt;
import com.max.xiaoheihe.utils.imageviewer.HBImageLoader;
import com.max.xiaoheihe.utils.imageviewer.MediaData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.i70;
import dl.d;
import dl.e;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: HighResUICustomizer.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class HighResUICustomizer extends BaseResUICustomizer implements i, c, j {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f95621q = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @e
    private i70 f95622p;

    /* JADX INFO: compiled from: HighResUICustomizer.kt */
    public static final class a implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaData f95624c;

        a(MediaData mediaData) {
            this.f95624c = mediaData;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49351, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            HighResUICustomizer.this.J(this.f95624c);
            return true;
        }
    }

    /* JADX INFO: compiled from: HighResUICustomizer.kt */
    public static final class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaData f95626c;

        b(MediaData mediaData) {
            this.f95626c = mediaData;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49354, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            HighResUICustomizer.this.J(this.f95626c);
            return true;
        }
    }

    @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
    public void a(@d RecyclerView.ViewHolder viewHolder, @d View view, float f10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 49348, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j.a.h(this, viewHolder, view, f10);
    }

    @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
    public void b(@d RecyclerView.ViewHolder viewHolder, @d View view, float f10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 49345, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j.a.a(this, viewHolder, view, f10);
    }

    @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
    public void c(@d RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 49343, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        D(true);
    }

    @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
    public void d(@d RecyclerView.ViewHolder viewHolder, @d View view) {
        if (PatchProxy.proxy(new Object[]{viewHolder, view}, this, changeQuickRedirect, false, 49344, new Class[]{RecyclerView.ViewHolder.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(view, "view");
        D(false);
        n();
        com.heybox.imageviewer.core.b bVarF = Components.f59730a.f();
        if (bVarF instanceof HBImageLoader) {
            ((HBImageLoader) bVarF).l();
        }
    }

    @Override // com.heybox.imageviewer.core.i
    public void e(int i10, @d com.heybox.imageviewer.core.d data, @d RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), data, viewHolder}, this, changeQuickRedirect, false, 49339, new Class[]{Integer.TYPE, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        f0.p(viewHolder, "viewHolder");
        MediaData mediaData = (MediaData) data;
        View viewFindViewById = viewHolder.itemView.findViewById(R.id.progress_indicator);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.b) {
            com.heybox.imageviewer.viewholders.b bVar = (com.heybox.imageviewer.viewholders.b) viewHolder;
            SubsamplingScaleImageView2 subsamplingScaleImageView2 = bVar.b().f141012b;
            f0.o(subsamplingScaleImageView2, "viewHolder.binding.subsamplingView");
            ExtentionsKt.k(subsamplingScaleImageView2, 0L, new l<View, b2>() { // from class: com.max.xiaoheihe.utils.imageviewer.ui.HighResUICustomizer$bind$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@d View it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 49349, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    com.heybox.imageviewer.d dVarX = this.f95627b.x();
                    if (dVarX != null) {
                        dVarX.c();
                    }
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(View view) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49350, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(view);
                    return b2.f124493a;
                }
            }, 1, null);
            bVar.b().f141012b.setOnLongClickListener(new a(mediaData));
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.a) {
            com.heybox.imageviewer.viewholders.a aVar = (com.heybox.imageviewer.viewholders.a) viewHolder;
            PhotoView2 photoView2 = aVar.b().f141010b;
            f0.o(photoView2, "viewHolder.binding.photoView");
            ExtentionsKt.k(photoView2, 0L, new l<View, b2>() { // from class: com.max.xiaoheihe.utils.imageviewer.ui.HighResUICustomizer$bind$3
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@d View it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 49352, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    com.heybox.imageviewer.d dVarX = this.f95628b.x();
                    if (dVarX != null) {
                        dVarX.c();
                    }
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(View view) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49353, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(view);
                    return b2.f124493a;
                }
            }, 1, null);
            aVar.b().f141010b.setOnLongClickListener(new b(mediaData));
        }
    }

    @Override // com.heybox.imageviewer.core.j
    public void f(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 49341, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.l lVar = com.max.hbcommon.analytics.l.f66572a;
        if (f0.g(lVar.e(), lb.d.M)) {
            PageEventObj pageEventObj = new PageEventObj();
            pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
            pageEventObj.setPath(lb.d.N);
            pageEventObj.setType("2");
            ArrayList<ArrayList<PathSrcNode>> arrayListG = lVar.g();
            if (!(arrayListG == null || arrayListG.isEmpty())) {
                pageEventObj.setSrc(arrayListG);
            }
            pageEventObj.setStay_duration(String.valueOf((int) ((j10 / 1000.0f) + 0.5f)));
            pageEventObj.setStay_duration_ms(String.valueOf(j10));
            com.max.hbcommon.analytics.d.c(pageEventObj, true);
        }
    }

    @Override // com.heybox.imageviewer.core.i
    public void g(int i10, @d RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 49338, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(ExtentionsKt.e(viewGroup, R.layout.layout_imageviewer_custom_page));
        }
    }

    @Override // com.heybox.imageviewer.core.c
    @d
    public View h(@d ViewGroup parent) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent}, this, changeQuickRedirect, false, 49340, new Class[]{ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        i70 i70VarD = i70.d(LayoutInflater.from(parent.getContext()), parent, false);
        this.f95622p = i70VarD;
        if (i70VarD != null && (imageView = i70VarD.f111667c) != null) {
            com.max.xiaoheihe.accelworld.l.u(imageView, R.color.background_layer_4_color_alpha60, 5.0f, R.color.white, 1.0f);
        }
        i70 i70Var = this.f95622p;
        if (i70Var != null && (textView2 = i70Var.f111668d) != null) {
            com.max.xiaoheihe.accelworld.l.u(textView2, R.color.background_layer_4_color_alpha60, 5.0f, R.color.white, 1.0f);
        }
        i70 i70Var2 = this.f95622p;
        if (i70Var2 != null && (textView = i70Var2.f111669e) != null) {
            com.max.xiaoheihe.accelworld.l.u(textView, R.color.background_layer_4_color_alpha60, 5.0f, R.color.white, 1.0f);
        }
        i70 i70Var3 = this.f95622p;
        f0.m(i70Var3);
        ConstraintLayout constraintLayoutB = i70Var3.b();
        f0.o(constraintLayoutB, "binding!!.root");
        return constraintLayoutB;
    }

    @Override // com.heybox.imageviewer.core.j
    public void i(int i10, @d RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 49342, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        i70 i70Var = this.f95622p;
        y(i10, viewHolder, i70Var != null ? i70Var.f111668d : null, i70Var != null ? i70Var.f111669e : null, i70Var != null ? i70Var.f111667c : null);
    }

    @Override // com.heybox.imageviewer.core.i
    public void j(@d Context context, @d com.heybox.imageviewer.utils.c builder) {
        if (PatchProxy.proxy(new Object[]{context, builder}, this, changeQuickRedirect, false, 49337, new Class[]{Context.class, com.heybox.imageviewer.utils.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(builder, "builder");
        E(context);
        ComponentCallbacks2 componentCallbacks2P = p(context);
        if (componentCallbacks2P instanceof FragmentActivity) {
            H((com.heybox.imageviewer.d) new y0((c1) componentCallbacks2P).a(com.heybox.imageviewer.d.class));
        }
        builder.c(this);
        builder.e(this);
        builder.d(this);
    }

    @Override // com.heybox.imageviewer.core.j
    public void onPageScrollStateChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49346, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j.a.d(this, i10);
    }

    @Override // com.heybox.imageviewer.core.j
    public void onPageScrolled(int i10, float f10, int i11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49347, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
            return;
        }
        j.a.e(this, i10, f10, i11);
    }
}
