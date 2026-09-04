package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.j1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.d;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.story.comment.StoryCommentBottomSheetDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.fb0;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: StoryTextContentWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryTextContentWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryTextContentWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryTextContentWidget\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,128:1\n262#2,2:129\n262#2,2:131\n262#2,2:133\n262#2,2:135\n262#2,2:137\n*S KotlinDebug\n*F\n+ 1 StoryTextContentWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryTextContentWidget\n*L\n61#1:129,2\n63#1:131,2\n67#1:133,2\n69#1:135,2\n104#1:137,2\n*E\n"})
@o(parameters = 0)
public final class StoryTextContentWidget extends RelativeLayout implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f92340g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final c f92341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private d f92342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f92344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private fb0 f92345f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryTextContentWidget(@dl.d Context context) {
        this(context, null, 0, 0, 14, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryTextContentWidget(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryTextContentWidget(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryTextContentWidget(@dl.d Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        this.f92343d = -1;
        fb0 fb0VarB = fb0.b(kb.c.d(context), this);
        f0.o(fb0VarB, "inflate(context.layoutInflater(), this)");
        this.f92345f = fb0VarB;
    }

    public /* synthetic */ StoryTextContentWidget(Context context, AttributeSet attributeSet, int i10, int i11, int i12, u uVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    private final void a(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44239, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        fb0 fb0Var = this.f92345f;
        ExpressionTextView expressionTextView = fb0Var.f110514d;
        expressionTextView.setMaxLines(1);
        expressionTextView.setTextSize(1, 14.0f);
        com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
        int i10 = com.max.hbresource.a.f71894b;
        expressionTextView.setTypeface(aVar.a(i10));
        ViewGroup.LayoutParams layoutParams = expressionTextView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        ExpressionTextView expressionTextView2 = fb0Var.f110512b;
        expressionTextView2.setMaxLines(1);
        expressionTextView2.setTextSize(1, 14.0f);
        expressionTextView2.setTypeface(aVar.a(i10));
        HBLineHeightTextView tvExpend = fb0Var.f110513c;
        f0.o(tvExpend, "tvExpend");
        tvExpend.setVisibility(z10 ? 0 : 8);
        setBackground(ViewUtils.w(0, com.max.xiaoheihe.utils.d.I(0.0f, j1.f21601t), com.max.xiaoheihe.utils.d.I(0.12f, j1.f21601t), GradientDrawable.Orientation.TOP_BOTTOM));
    }

    private final boolean b(TextView textView, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, str}, this, changeQuickRedirect, false, 44240, new Class[]{TextView.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        float fL = ViewUtils.L(getContext());
        Context context = getContext();
        f0.o(context, "context");
        return (str != null ? textView.getPaint().measureText(str) : 0.0f) > fL - com.max.accelworld.c.a(24.0f, context);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44237, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b3  */
    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d d storyContext, int i10) {
        StoryLinkCardInfoObj link_card_info;
        boolean z10;
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44238, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        fb0 fb0Var = this.f92345f;
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        if (storyItemsObjN != null && (link_card_info = storyItemsObjN.getLink_card_info()) != null) {
            if (com.max.hbcommon.utils.c.u(link_card_info.getTitle())) {
                ExpressionTextView tvTitle = fb0Var.f110514d;
                f0.o(tvTitle, "tvTitle");
                tvTitle.setVisibility(8);
            } else {
                fb0Var.f110514d.setText(link_card_info.getTitle());
                ExpressionTextView tvTitle2 = fb0Var.f110514d;
                f0.o(tvTitle2, "tvTitle");
                tvTitle2.setVisibility(0);
            }
            if (com.max.hbcommon.utils.c.u(link_card_info.getDescription())) {
                ExpressionTextView tvDesc = fb0Var.f110512b;
                f0.o(tvDesc, "tvDesc");
                tvDesc.setVisibility(8);
            } else {
                fb0Var.f110512b.setText(link_card_info.getDescription());
                ExpressionTextView tvDesc2 = fb0Var.f110512b;
                f0.o(tvDesc2, "tvDesc");
                tvDesc2.setVisibility(0);
            }
            ExpressionTextView tvTitle3 = fb0Var.f110514d;
            f0.o(tvTitle3, "tvTitle");
            if (!b(tvTitle3, link_card_info.getTitle())) {
                ExpressionTextView tvDesc3 = fb0Var.f110512b;
                f0.o(tvDesc3, "tvDesc");
                z10 = b(tvDesc3, link_card_info.getDescription());
            }
            a(z10);
            setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryTextContentWidget$onBindViewHolder$1$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final d mStoryContext;
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44243, new Class[]{View.class}, Void.TYPE).isSupported || (mStoryContext = this.f92346b.getMStoryContext()) == null) {
                        return;
                    }
                    final StoryTextContentWidget storyTextContentWidget = this.f92346b;
                    StoryUtilsKt.p(storyTextContentWidget, storyTextContentWidget.getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryTextContentWidget$onBindViewHolder$1$1$1$1$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@e StoryItemsObj storyItemsObj) {
                            FragmentManager supportFragmentManager;
                            Fragment fragmentB;
                            if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44244, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            StoryCommentBottomSheetDialog storyCommentBottomSheetDialog = new StoryCommentBottomSheetDialog(mStoryContext, storyTextContentWidget.getMPosition(), true);
                            d mStoryContext2 = storyTextContentWidget.getMStoryContext();
                            FragmentActivity activity = (mStoryContext2 == null || (fragmentB = mStoryContext2.b()) == null) ? null : fragmentB.getActivity();
                            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                                return;
                            }
                            storyCommentBottomSheetDialog.M3(supportFragmentManager, "linkContentDialog");
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44245, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(storyItemsObj);
                            return b2.f124493a;
                        }
                    });
                }
            });
        }
        if (this.f92344e) {
            return;
        }
        this.f92344e = true;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f92341b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92343d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public d getMStoryContext() {
        return this.f92342c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44242, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92343d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e d dVar) {
        this.f92342c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44241, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
