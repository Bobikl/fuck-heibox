package com.max.hbcommon.component.segmentfilters;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: SegmentFilterView.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.segmentfilters.SegmentFilterView$refresh$1", f = "SegmentFilterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SegmentFilterView$refresh$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f67886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SegmentFilterView f67887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentFilterView$refresh$1(SegmentFilterView segmentFilterView, kotlin.coroutines.c<? super SegmentFilterView$refresh$1> cVar) {
        super(2, cVar);
        this.f67887c = segmentFilterView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SegmentFilterView segmentFilterView, int i10, View view) {
        if (PatchProxy.proxy(new Object[]{segmentFilterView, new Integer(i10), view}, null, changeQuickRedirect, true, bb.c.e.f31900m4, new Class[]{SegmentFilterView.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        segmentFilterView.c(i10);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.e.f31866k4, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new SegmentFilterView$refresh$1(this.f67887c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f31917n4, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f31883l4, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((SegmentFilterView$refresh$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        String text;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.f31849j4, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f67886b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        this.f67887c.setVisibility(0);
        this.f67887c.removeAllViews();
        int size = this.f67887c.getList().size();
        for (final int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                View view = new View(this.f67887c.getContext());
                view.setLayoutParams(new LinearLayout.LayoutParams(ViewUtils.f(this.f67887c.getContext(), 0.5f), (int) this.f67887c.getDivLineHeight()));
                view.setBackgroundColor(this.f67887c.getResources().getColor(this.f67887c.getLineColorId()));
                this.f67887c.addView(view);
            }
            KeyDescObj keyDescObj = this.f67887c.getList().get(i10);
            RelativeLayout relativeLayout = new RelativeLayout(this.f67887c.getContext());
            relativeLayout.setGravity(17);
            this.f67887c.addView(relativeLayout);
            relativeLayout.setTag(this.f67887c.getList().get(i10));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f67887c.g()) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                int iF = ViewUtils.f(this.f67887c.getContext(), 8.0f);
                relativeLayout.setPadding(iF, 0, iF, 0);
            }
            relativeLayout.setLayoutParams(layoutParams);
            final SegmentFilterView segmentFilterView = this.f67887c;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.segmentfilters.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SegmentFilterView$refresh$1.f(segmentFilterView, i10, view2);
                }
            });
            if (this.f67887c.i() || keyDescObj.isShowIcon()) {
                ImageView imageView = new ImageView(this.f67887c.getContext());
                int iF2 = ViewUtils.f(this.f67887c.getContext(), 14.0f);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iF2, iF2);
                layoutParams2.rightMargin = ViewUtils.f(this.f67887c.getContext(), 4.0f);
                layoutParams2.addRule(15);
                layoutParams2.addRule(16, R.id.tv_tab_title);
                imageView.setLayoutParams(layoutParams2);
                imageView.setId(R.id.tv_icon);
                String img = !com.max.hbcommon.utils.c.u(keyDescObj.getImg()) ? keyDescObj.getImg() : keyDescObj.getImg();
                if (!com.max.hbcommon.utils.c.u(img)) {
                    com.max.hbimage.b.K(img, imageView);
                    relativeLayout.addView(imageView);
                } else if (keyDescObj.getIconId() != -1) {
                    imageView.setImageResource(keyDescObj.getIconId());
                    relativeLayout.addView(imageView);
                }
            }
            if (!com.max.hbcommon.utils.c.u(keyDescObj.getTitle())) {
                text = keyDescObj.getTitle();
            } else if (com.max.hbcommon.utils.c.u(keyDescObj.getDesc())) {
                text = !com.max.hbcommon.utils.c.u(keyDescObj.getText()) ? keyDescObj.getText() : "";
            } else {
                text = keyDescObj.getDesc();
            }
            TextView textView = new TextView(this.f67887c.getContext());
            textView.setId(R.id.tv_tab_title);
            textView.setText(text);
            textView.setGravity(17);
            textView.setTextSize(this.f67887c.getTextSize());
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(15);
            textView.setLayoutParams(layoutParams3);
            relativeLayout.addView(textView);
            if (com.max.hbutils.utils.n.q(keyDescObj.getNum()) > 0) {
                relativeLayout.addView(SegmentFilterView.a(this.f67887c, keyDescObj));
            }
        }
        SegmentFilterView.b(this.f67887c);
        return b2.f124493a;
    }
}
