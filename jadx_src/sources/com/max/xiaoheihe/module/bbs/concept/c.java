package com.max.xiaoheihe.module.bbs.concept;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ConceptPostTagObjKt;
import com.max.xiaoheihe.bean.bbs.PostContentTagObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConceptLinkContentRender.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends RecyclerView.Adapter<a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final AppCompatActivity f81152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final List<PostContentTagObj> f81153c;

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    @o(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f81154f = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        private final View f81155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        private final TextView f81156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @d
        private final QMUIRadiusImageView f81157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @d
        private final TextView f81158e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d View cardView) {
            super(cardView);
            f0.p(cardView, "cardView");
            this.f81155b = cardView;
            View viewFindViewById = cardView.findViewById(R.id.tv_name);
            f0.o(viewFindViewById, "cardView.findViewById<TextView>(R.id.tv_name)");
            this.f81156c = (TextView) viewFindViewById;
            View viewFindViewById2 = cardView.findViewById(R.id.iv_pic);
            f0.o(viewFindViewById2, "cardView.findViewById<QM…usImageView>(R.id.iv_pic)");
            this.f81157d = (QMUIRadiusImageView) viewFindViewById2;
            View viewFindViewById3 = cardView.findViewById(R.id.tv_hot_tag);
            f0.o(viewFindViewById3, "cardView.findViewById<TextView>(R.id.tv_hot_tag)");
            this.f81158e = (TextView) viewFindViewById3;
        }

        @d
        public final View a() {
            return this.f81155b;
        }

        @d
        public final QMUIRadiusImageView b() {
            return this.f81157d;
        }

        @d
        public final TextView d() {
            return this.f81158e;
        }

        @d
        public final TextView g() {
            return this.f81156c;
        }
    }

    /* JADX INFO: compiled from: ConceptLinkContentRender.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PostContentTagObj f81160c;

        b(PostContentTagObj postContentTagObj) {
            this.f81160c = postContentTagObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28211, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(c.this.f81152b, this.f81160c.getProtocol());
        }
    }

    public c(@d AppCompatActivity context, @d List<PostContentTagObj> postContentTagObjList) {
        f0.p(context, "context");
        f0.p(postContentTagObjList, "postContentTagObjList");
        this.f81152b = context;
        this.f81153c = postContentTagObjList;
    }

    private final void n(a aVar, PostContentTagObj postContentTagObj) {
        if (PatchProxy.proxy(new Object[]{aVar, postContentTagObj}, this, changeQuickRedirect, false, 28207, new Class[]{a.class, PostContentTagObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Integer style_type = postContentTagObj.getStyle_type();
        boolean z10 = style_type != null && 2 == style_type.intValue();
        int iO = ViewUtils.o(BaseApplication.a(), aVar.a());
        String bg_color = postContentTagObj.getBg_color();
        if (bg_color != null) {
            aVar.a().setBackground(ViewUtils.G(iO, com.max.hbutils.utils.a.g(bg_color)));
        }
        aVar.a().setPadding(z10 ? ViewUtils.f(BaseApplication.a(), 7.0f) : ViewUtils.f(BaseApplication.a(), 2.0f), 0, ViewUtils.f(BaseApplication.a(), 7.0f), 0);
        aVar.a().setOnClickListener(new b(postContentTagObj));
    }

    private final void o(a aVar, PostContentTagObj postContentTagObj) {
        if (PatchProxy.proxy(new Object[]{aVar, postContentTagObj}, this, changeQuickRedirect, false, 28205, new Class[]{a.class, PostContentTagObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Integer style_type = postContentTagObj.getStyle_type();
        boolean z10 = style_type != null && 2 == style_type.intValue();
        aVar.b().setVisibility(0);
        aVar.b().setCornerRadius(ViewUtils.p(BaseApplication.a(), aVar.b(), ViewUtils.ViewType.IMAGE));
        com.max.hbimage.b.L(postContentTagObj.getIcon(), aVar.b(), R.drawable.common_default_game_avatar_74x74);
        int iF = z10 ? ViewUtils.f(BaseApplication.a(), 3.0f) : ViewUtils.f(BaseApplication.a(), 7.0f);
        int iF2 = z10 ? ViewUtils.f(BaseApplication.a(), 12.0f) : ViewUtils.f(BaseApplication.a(), 20.0f);
        QMUIRadiusImageView qMUIRadiusImageViewB = aVar.b();
        qMUIRadiusImageViewB.getLayoutParams().width = iF2;
        qMUIRadiusImageViewB.getLayoutParams().height = iF2;
        ViewGroup.LayoutParams layoutParams = qMUIRadiusImageViewB.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(iF);
    }

    private final void p(a aVar, PostContentTagObj postContentTagObj) {
        String end_color;
        String start_color;
        String sub_title;
        if (PatchProxy.proxy(new Object[]{aVar, postContentTagObj}, this, changeQuickRedirect, false, 28206, new Class[]{a.class, PostContentTagObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (ConceptPostTagObjKt.isNullOrEmpty(postContentTagObj.getSublabel())) {
            aVar.d().setVisibility(8);
            return;
        }
        aVar.d().setVisibility(0);
        PostContentTagObj.TagSubLabel sublabel = postContentTagObj.getSublabel();
        if (sublabel != null && (sub_title = sublabel.getSub_title()) != null) {
            aVar.d().setText(sub_title);
        }
        PostContentTagObj.TagSubLabel sublabel2 = postContentTagObj.getSublabel();
        Integer numValueOf = null;
        Integer numValueOf2 = (sublabel2 == null || (start_color = sublabel2.getStart_color()) == null) ? null : Integer.valueOf(com.max.hbutils.utils.a.g(start_color));
        PostContentTagObj.TagSubLabel sublabel3 = postContentTagObj.getSublabel();
        if (sublabel3 != null && (end_color = sublabel3.getEnd_color()) != null) {
            numValueOf = Integer.valueOf(com.max.hbutils.utils.a.g(end_color));
        }
        if (numValueOf2 != null && numValueOf != null) {
            aVar.d().setBackground(ViewUtils.w(ViewUtils.o(BaseApplication.a(), aVar.d()), numValueOf2.intValue(), numValueOf.intValue(), GradientDrawable.Orientation.BL_TR));
            return;
        }
        g.f74531b.v("[bindSubLabelTextView] sub_label color config error: " + postContentTagObj);
    }

    private final void q(a aVar, PostContentTagObj postContentTagObj) {
        if (PatchProxy.proxy(new Object[]{aVar, postContentTagObj}, this, changeQuickRedirect, false, 28204, new Class[]{a.class, PostContentTagObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textViewG = aVar.g();
        String text = postContentTagObj.getText();
        if (text != null) {
            textViewG.setText(text);
        }
        String text_color = postContentTagObj.getText_color();
        if (text_color != null) {
            textViewG.setTextColor(com.max.hbutils.utils.a.g(text_color));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28208, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f81153c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 28210, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        r((a) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 28209, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : s(viewGroup, i10);
    }

    public void r(@d a holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 28203, new Class[]{a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        PostContentTagObj postContentTagObj = this.f81153c.get(i10);
        q(holder, postContentTagObj);
        o(holder, postContentTagObj);
        p(holder, postContentTagObj);
        n(holder, postContentTagObj);
    }

    @d
    public a s(@d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 28202, new Class[]{ViewGroup.class, Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f81152b).inflate(R.layout.item_link_hashtag, parent, false);
        f0.o(viewInflate, "from(context)\n          …k_hashtag, parent, false)");
        return new a(viewInflate);
    }
}
