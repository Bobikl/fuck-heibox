package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.PostModuleObj;
import com.max.xiaoheihe.bean.bbs.TemplateHashtagLaberObj;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: PostModuleAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostModuleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostModuleAdapter.kt\ncom/max/xiaoheihe/module/bbs/adapter/PostModuleAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,138:1\n262#2,2:139\n262#2,2:141\n262#2,2:143\n*S KotlinDebug\n*F\n+ 1 PostModuleAdapter.kt\ncom/max/xiaoheihe/module/bbs/adapter/PostModuleAdapter\n*L\n106#1:139,2\n115#1:141,2\n132#1:143,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public class p extends com.max.hbcommon.base.adapter.s<PostModuleObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80605d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f80606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private l0.g f80607c;

    /* JADX INFO: compiled from: PostModuleAdapter.kt */
    public static final class a implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f80608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f80609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f80610c;

        a(int i10, int i11, ImageView imageView) {
            this.f80608a = i10;
            this.f80609b = i11;
            this.f80610c = imageView;
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 27441, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                return;
            }
            this.f80610c.setImageDrawable(com.max.hbutils.utils.q.a(drawable, this.f80608a, com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color), this.f80609b));
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.e Drawable drawable) {
        }
    }

    /* JADX INFO: compiled from: PostModuleAdapter.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PostModuleObj f80612c;

        b(PostModuleObj postModuleObj) {
            this.f80612c = postModuleObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27442, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(p.this.o(), this.f80612c.getProtocol());
            l0.g gVarP = p.this.p();
            if (gVarP != null) {
                gVarP.a();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@dl.d Context context, @dl.d List<PostModuleObj> list, int i10) {
        super(context, list, i10);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f80606b = context;
    }

    public static /* synthetic */ void n(p pVar, TextView textView, PostModuleObj postModuleObj, float[] fArr, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{pVar, textView, postModuleObj, fArr, new Integer(i10), obj}, null, changeQuickRedirect, true, 27439, new Class[]{p.class, TextView.class, PostModuleObj.class, float[].class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindIconLabel");
        }
        if ((i10 & 4) != 0) {
            fArr = null;
        }
        pVar.m(textView, postModuleObj, fArr);
    }

    public final void m(@dl.e TextView textView, @dl.e PostModuleObj postModuleObj, @dl.e float[] fArr) {
        String end_color;
        String start_color;
        if (PatchProxy.proxy(new Object[]{textView, postModuleObj, fArr}, this, changeQuickRedirect, false, 27438, new Class[]{TextView.class, PostModuleObj.class, float[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (textView == null) {
            com.max.heybox.hblog.g.f74531b.v("[bindIconLabel] invalid tvIconLabel: null");
            return;
        }
        if (postModuleObj == null) {
            com.max.heybox.hblog.g.f74531b.v("[bindIconLabel] invalid data: null");
            textView.setVisibility(8);
            return;
        }
        TemplateHashtagLaberObj label = postModuleObj.getLabel();
        Integer numValueOf = null;
        String sub_title = label != null ? label.getSub_title() : null;
        TemplateHashtagLaberObj label2 = postModuleObj.getLabel();
        Integer numValueOf2 = (label2 == null || (start_color = label2.getStart_color()) == null) ? null : Integer.valueOf(com.max.hbutils.utils.a.g(start_color));
        TemplateHashtagLaberObj label3 = postModuleObj.getLabel();
        if (label3 != null && (end_color = label3.getEnd_color()) != null) {
            numValueOf = Integer.valueOf(com.max.hbutils.utils.a.g(end_color));
        }
        if (sub_title == null || numValueOf2 == null || numValueOf == null) {
            textView.setVisibility(8);
            return;
        }
        if (fArr == null) {
            fArr = new float[]{2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f};
        }
        GradientDrawable gradientDrawableK = com.max.hbutils.utils.q.k(this.f80606b, numValueOf2.intValue(), numValueOf.intValue(), GradientDrawable.Orientation.BL_TR, fArr);
        textView.setVisibility(0);
        textView.setText(sub_title);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView.setBackground(gradientDrawableK);
    }

    @dl.d
    public final Context o() {
        return this.f80606b;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PostModuleObj postModuleObj) {
        if (PatchProxy.proxy(new Object[]{eVar, postModuleObj}, this, changeQuickRedirect, false, 27440, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        q(eVar, postModuleObj);
    }

    @dl.e
    public final l0.g p() {
        return this.f80607c;
    }

    public void q(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e PostModuleObj postModuleObj) {
        float fL;
        float f10;
        if (PatchProxy.proxy(new Object[]{eVar, postModuleObj}, this, changeQuickRedirect, false, 27437, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PostModuleObj.class}, Void.TYPE).isSupported || eVar == null || postModuleObj == null) {
            return;
        }
        if (getDataList().size() <= 4) {
            fL = ViewUtils.L(this.f80606b);
            f10 = 4.0f;
        } else {
            fL = ViewUtils.L(this.f80606b);
            f10 = 4.5f;
        }
        eVar.itemView.getLayoutParams().width = (int) (fL / f10);
        View viewI = eVar.i(R.id.vg_img_container);
        f0.o(viewI, "viewHolder.getView(R.id.vg_img_container)");
        View viewI2 = eVar.i(R.id.iv_icon);
        f0.o(viewI2, "viewHolder.getView(R.id.iv_icon)");
        View viewI3 = eVar.i(R.id.iv_br_icon);
        f0.o(viewI3, "viewHolder.getView(R.id.iv_br_icon)");
        View viewI4 = eVar.i(R.id.tv_name);
        f0.o(viewI4, "viewHolder.getView(R.id.tv_name)");
        View viewI5 = eVar.i(R.id.tv_icon_label);
        f0.o(viewI5, "viewHolder.getView(R.id.tv_icon_label)");
        ((ViewGroup) viewI).setBackground(ViewUtils.G(ViewUtils.f(this.f80606b, 25.0f), com.max.xiaoheihe.utils.d.E(R.color.background_layer_1_color)));
        ((TextView) viewI4).setText(postModuleObj.getTitle());
        com.max.hbimage.b.K(postModuleObj.getImg(), (ImageView) viewI2);
        int iA = ic.a.f119343a.a(this.f80606b, 14.0f);
        Context context = this.f80606b;
        com.max.hbimage.b.W(this.f80606b, iA, iA, postModuleObj.getIcon(), new a(ViewUtils.m(context, ViewUtils.f(context, 14.0f), ViewUtils.f(this.f80606b, 14.0f)), ViewUtils.f(this.f80606b, 1.5f), (ImageView) viewI3));
        eVar.itemView.setOnClickListener(new b(postModuleObj));
        n(this, (TextView) viewI5, postModuleObj, null, 4, null);
    }

    public final void r(@dl.e l0.g gVar) {
        this.f80607c = gVar;
    }
}
