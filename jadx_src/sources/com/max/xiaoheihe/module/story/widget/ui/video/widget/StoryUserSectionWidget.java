package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.j1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import com.max.hbstory.bean.StoryBBSUserInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ai0;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;

/* JADX INFO: compiled from: StoryUserSectionWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryUserSectionWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryUserSectionWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryUserSectionWidget\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,185:1\n262#2,2:186\n262#2,2:188\n13579#3,2:190\n*S KotlinDebug\n*F\n+ 1 StoryUserSectionWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryUserSectionWidget\n*L\n112#1:186,2\n115#1:188,2\n170#1:190,2\n*E\n"})
@o(parameters = 0)
public final class StoryUserSectionWidget extends BBSUserSectionView implements com.max.hbstory.viewpage2.video.a {
    public static final int B = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d
    private final c f92349x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @e
    private com.max.hbstory.d f92350y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f92351z;

    /* JADX INFO: compiled from: StoryUserSectionWidget.kt */
    public static final class a implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 44260, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean isExpanded) {
            if (!PatchProxy.proxy(new Object[]{isExpanded}, this, changeQuickRedirect, false, 44259, new Class[]{Boolean.class}, Void.TYPE).isSupported && StoryUtilsKt.h(StoryUserSectionWidget.this)) {
                StoryUserSectionWidget storyUserSectionWidget = StoryUserSectionWidget.this;
                f0.o(isExpanded, "isExpanded");
                storyUserSectionWidget.setBackground(isExpanded.booleanValue() ? ViewUtils.w(0, com.max.xiaoheihe.utils.d.I(0.0f, j1.f21601t), com.max.xiaoheihe.utils.d.I(0.05f, j1.f21601t), GradientDrawable.Orientation.TOP_BOTTOM) : ViewUtils.w(0, com.max.xiaoheihe.utils.d.I(0.0f, j1.f21601t), com.max.xiaoheihe.utils.d.I(0.03f, j1.f21601t), GradientDrawable.Orientation.TOP_BOTTOM));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryUserSectionWidget(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryUserSectionWidget(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryUserSectionWidget(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        ai0 ai0VarC = ai0.c(LayoutInflater.from(context));
        f0.o(ai0VarC, "inflate(LayoutInflater.from(context))");
        this.f92349x = ai0VarC;
        this.f92351z = -1;
    }

    public /* synthetic */ StoryUserSectionWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final BBSUserInfoObj getUserInfo() {
        g gVarD;
        LiveData<List<StoryItemsObj>> liveDataF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44248, new Class[0], BBSUserInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSUserInfoObj) patchProxyResultProxy.result;
        }
        com.max.hbstory.d mStoryContext = getMStoryContext();
        List<StoryItemsObj> listF = (mStoryContext == null || (gVarD = mStoryContext.d()) == null || (liveDataF = gVarD.F()) == null) ? null : liveDataF.f();
        if (!(listF == null || listF.isEmpty())) {
            int size = listF.size();
            int mPosition = getMPosition();
            if (mPosition >= 0 && mPosition < size) {
                StoryLinkCardInfoObj link_card_info = listF.get(getMPosition()).getLink_card_info();
                StoryBBSUserInfoObj user_info = link_card_info != null ? link_card_info.getUser_info() : null;
                if (user_info == null) {
                    setVisibility(8);
                    return null;
                }
                setVisibility(0);
                return (BBSUserInfoObj) k.a(k.p(user_info), BBSUserInfoObj.class);
            }
        }
        return null;
    }

    public static final /* synthetic */ BBSUserInfoObj k(StoryUserSectionWidget storyUserSectionWidget) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyUserSectionWidget}, null, changeQuickRedirect, true, 44254, new Class[]{StoryUserSectionWidget.class}, BBSUserInfoObj.class);
        return patchProxyResultProxy.isSupported ? (BBSUserInfoObj) patchProxyResultProxy.result : storyUserSectionWidget.getUserInfo();
    }

    private final int l(View... viewArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewArr}, this, changeQuickRedirect, false, 44251, new Class[]{View[].class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int id2 = -1;
        for (View view : viewArr) {
            if (view != null) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private final boolean m(int i10) {
        return i10 != -1;
    }

    private final void n() {
        com.max.hbstory.d mStoryContext;
        Fragment fragmentB;
        g gVarQ;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44249, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (gVarQ = StoryUtilsKt.q(this)) == null) {
            return;
        }
        gVarQ.n().k(fragmentB, new j0<Integer>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryUserSectionWidget$observeCurrentPosition$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(Integer num) {
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 44256, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(num);
            }

            public final void b(Integer num) {
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 44255, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                    return;
                }
                final StoryUserSectionWidget storyUserSectionWidget = this.f92353a;
                StoryUtilsKt.f(storyUserSectionWidget, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryUserSectionWidget$observeCurrentPosition$1$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44258, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BBSUserInfoObj bBSUserInfoObjK;
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44257, new Class[0], Void.TYPE).isSupported || (bBSUserInfoObjK = StoryUserSectionWidget.k(storyUserSectionWidget)) == null) {
                            return;
                        }
                        StoryUserSectionWidget storyUserSectionWidget2 = storyUserSectionWidget;
                        LinkInfoObj linkInfoObj = new LinkInfoObj();
                        linkInfoObj.setUser(bBSUserInfoObjK);
                        storyUserSectionWidget2.h(linkInfoObj, true);
                    }
                });
            }
        });
    }

    private final void o() {
        com.max.hbstory.d mStoryContext;
        Fragment fragmentB;
        g gVarQ;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44250, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (gVarQ = StoryUtilsKt.q(this)) == null) {
            return;
        }
        gVarQ.C().k(fragmentB, new a());
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44246, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44247, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        BBSUserSectionView.b bVarJ = j(getUserInfo());
        ViewGroup viewGroupD = bVarJ.d();
        View viewB = bVarJ.b();
        View viewC = bVarJ.c();
        View viewE = bVarJ.e();
        View viewA = bVarJ.a();
        if (viewGroupD != null) {
            int iL = l(viewB, viewC, viewE);
            if (m(iL)) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(1, iL);
                layoutParams.addRule(15, -1);
                Context context = getContext();
                f0.o(context, "context");
                int iC = com.max.accelworld.c.c(10, context);
                Context context2 = getContext();
                f0.o(context2, "context");
                layoutParams.setMargins(iC, 0, 0, com.max.accelworld.c.c(4, context2));
                mo41getCoreViewBinding().getRoot().setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(9, -1);
                layoutParams2.addRule(15, -1);
                Context context3 = getContext();
                f0.o(context3, "context");
                int iC2 = com.max.accelworld.c.c(10, context3);
                Context context4 = getContext();
                f0.o(context4, "context");
                layoutParams2.setMargins(iC2, 0, 0, com.max.accelworld.c.c(4, context4));
                mo41getCoreViewBinding().getRoot().setLayoutParams(layoutParams2);
            }
            ViewParent parent = mo41getCoreViewBinding().getRoot().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mo41getCoreViewBinding().getRoot());
                viewGroupD.addView(mo41getCoreViewBinding().getRoot());
            } else {
                viewGroupD.addView(mo41getCoreViewBinding().getRoot());
            }
        }
        if (viewA != null) {
            addView(viewA);
        }
        addView(viewGroupD);
        if (!this.A) {
            this.A = true;
            n();
            o();
        }
        TextView tv_name = getTv_name();
        tv_name.setTextSize(1, 16.0f);
        tv_name.setShadowLayer(11.0f, 0.0f, 2.0f, l.h(tv_name.getContext(), R.color.black_alpha24));
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @d
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f92349x;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92351z;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public com.max.hbstory.d getMStoryContext() {
        return this.f92350y;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44253, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92351z = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e com.max.hbstory.d dVar) {
        this.f92350y = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44252, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
