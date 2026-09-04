package com.max.hbuikit.component;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import bb.c;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.HorizontalNestedScrollView;
import com.max.hbuikit.bean.UiKitCardObj;
import com.max.hbuikit.bean.UiKitImageObj;
import com.max.hbuikit.bean.UiKitLayoutObj;
import com.max.hbuikit.bean.UiKitLinearObj;
import com.max.hbuikit.bean.UiKitRelativeObj;
import com.max.hbuikit.bean.UiKitScrollObj;
import com.max.hbuikit.bean.UiKitTextObj;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbuikit.utils.UiKitUtil;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.view.TextRenderPreview;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import sd.b;

/* JADX INFO: compiled from: BaseUiKitView.kt */
/* JADX INFO: loaded from: classes13.dex */
public class BaseUiKitView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final a f73213e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f73214f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f73215g = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final q0 f73216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final q0 f73217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private UiKitViewObj f73218d;

    /* JADX INFO: compiled from: BaseUiKitView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseUiKitView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseUiKitView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUiKitView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f73216b = r0.a(e1.e());
        this.f73217c = r0.a(e1.c());
    }

    private final UiKitViewObj d(UiKitViewObj uiKitViewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitViewObj}, this, changeQuickRedirect, false, c.k.f33604hl, new Class[]{UiKitViewObj.class}, UiKitViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitViewObj) patchProxyResultProxy.result;
        }
        if (uiKitViewObj == null) {
            return null;
        }
        Object objA = k.a(q.P(k.p(uiKitViewObj), getContext()), UiKitViewObj.class);
        f0.o(objA, "deserialize(...)");
        UiKitViewObj uiKitViewObj2 = (UiKitViewObj) objA;
        UiKitUtil.z(uiKitViewObj2);
        uiKitViewObj2.setParent_type(b.f139392j);
        return uiKitViewObj2;
    }

    private final void e(View view, UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{view, uiKitViewObj}, this, changeQuickRedirect, false, 9001, new Class[]{View.class, UiKitViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        h(view, uiKitViewObj);
        if ((view instanceof ViewGroup) && (uiKitViewObj instanceof UiKitLayoutObj)) {
            UiKitLayoutObj uiKitLayoutObj = (UiKitLayoutObj) uiKitViewObj;
            if (uiKitLayoutObj.getChildren() != null) {
                List<UiKitViewObj> children = uiKitLayoutObj.getChildren();
                f0.m(children);
                int size = children.size();
                for (int i10 = 0; i10 < size; i10++) {
                    List<UiKitViewObj> children2 = uiKitLayoutObj.getChildren();
                    f0.m(children2);
                    UiKitViewObj uiKitViewObj2 = children2.get(i10);
                    View childAt = null;
                    if (!com.max.hbcommon.utils.c.u(uiKitViewObj2.getView_id())) {
                        com.max.hbuikit.utils.b bVarA = com.max.hbuikit.utils.b.f73246b.a();
                        String view_id = uiKitViewObj2.getView_id();
                        f0.m(view_id);
                        childAt = ((ViewGroup) view).findViewById(bVarA.c(view_id));
                    }
                    if (childAt == null) {
                        childAt = ((ViewGroup) view).getChildAt(i10);
                    }
                    e(childAt, uiKitViewObj2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    private final View f(View view, UiKitViewObj uiKitViewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, uiKitViewObj}, this, changeQuickRedirect, false, 9004, new Class[]{View.class, UiKitViewObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        Context context = getContext();
        f0.o(context, "getContext(...)");
        view.setLayoutParams(UiKitUtil.o(context, uiKitViewObj));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        final RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (layoutParams2.getRules() != null && layoutParams2.getRules().length > 0) {
            int[] rules = layoutParams2.getRules();
            f0.o(rules, "getRules(...)");
            for (int i10 : rules) {
                layoutParams2.removeRule(i10);
            }
        }
        String layout_gravity = uiKitViewObj.getLayout_gravity();
        if (layout_gravity != null) {
            switch (layout_gravity) {
                case "1":
                    layoutParams2.addRule(14);
                    layoutParams2.addRule(10);
                    break;
                case "2":
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(10);
                    break;
                case "3":
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(15);
                    break;
                case "4":
                    layoutParams2.addRule(13);
                    break;
                case "5":
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(15);
                    break;
                case "6":
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(12);
                    break;
                case "7":
                    layoutParams2.addRule(14);
                    layoutParams2.addRule(12);
                    break;
                case "8":
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(12);
                    break;
                default:
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(10);
                    break;
            }
        } else {
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
        }
        yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.hbuikit.component.BaseUiKitView$refreshRelativeChild$removeHorRule$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.rl, new Class[0], Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.ql, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                layoutParams2.removeRule(9);
                layoutParams2.removeRule(11);
                layoutParams2.removeRule(14);
                layoutParams2.removeRule(13);
            }
        };
        yh.a<b2> aVar2 = new yh.a<b2>() { // from class: com.max.hbuikit.component.BaseUiKitView$refreshRelativeChild$removeVerRule$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.tl, new Class[0], Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.sl, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                layoutParams2.removeRule(10);
                layoutParams2.removeRule(12);
                layoutParams2.removeRule(15);
                layoutParams2.removeRule(13);
            }
        };
        layoutParams2.alignWithParent = true;
        String left_of = uiKitViewObj.getLeft_of();
        if (left_of != null) {
            layoutParams2.addRule(0, com.max.hbuikit.utils.b.f73246b.a().c(left_of));
            aVar.invoke();
        }
        String top_of = uiKitViewObj.getTop_of();
        if (top_of != null) {
            layoutParams2.addRule(2, com.max.hbuikit.utils.b.f73246b.a().c(top_of));
            aVar2.invoke();
        }
        String right_of = uiKitViewObj.getRight_of();
        if (right_of != null) {
            layoutParams2.addRule(1, com.max.hbuikit.utils.b.f73246b.a().c(right_of));
            aVar.invoke();
        }
        String bottom_of = uiKitViewObj.getBottom_of();
        if (bottom_of != null) {
            layoutParams2.addRule(3, com.max.hbuikit.utils.b.f73246b.a().c(bottom_of));
            aVar2.invoke();
        }
        String align_left_of = uiKitViewObj.getAlign_left_of();
        if (align_left_of != null) {
            layoutParams2.addRule(5, com.max.hbuikit.utils.b.f73246b.a().c(align_left_of));
            aVar.invoke();
        }
        String align_top_of = uiKitViewObj.getAlign_top_of();
        if (align_top_of != null) {
            layoutParams2.addRule(6, com.max.hbuikit.utils.b.f73246b.a().c(align_top_of));
            aVar2.invoke();
        }
        String align_right_of = uiKitViewObj.getAlign_right_of();
        if (align_right_of != null) {
            layoutParams2.addRule(7, com.max.hbuikit.utils.b.f73246b.a().c(align_right_of));
            aVar.invoke();
        }
        String align_bottom_of = uiKitViewObj.getAlign_bottom_of();
        if (align_bottom_of != null) {
            layoutParams2.addRule(8, com.max.hbuikit.utils.b.f73246b.a().c(align_bottom_of));
            aVar2.invoke();
        }
        return view;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x012a A[Catch: all -> 0x012e, TRY_LEAVE, TryCatch #0 {all -> 0x012e, blocks: (B:7:0x002a, B:9:0x0030, B:13:0x003b, B:16:0x0045, B:17:0x005b, B:20:0x0065, B:21:0x007b, B:24:0x0085, B:25:0x009b, B:28:0x00a5, B:29:0x00bf, B:32:0x00c8, B:34:0x00d7, B:36:0x00de, B:35:0x00db, B:37:0x00ec, B:40:0x00f5, B:41:0x010a, B:44:0x0113, B:45:0x012a), top: B:51:0x002a }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void h(View view, UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{view, uiKitViewObj}, this, changeQuickRedirect, false, 9002, new Class[]{View.class, UiKitViewObj.class}, Void.TYPE).isSupported || view == null || uiKitViewObj == null) {
            return;
        }
        try {
            String type = uiKitViewObj.getType();
            if (type != null) {
                switch (type.hashCode()) {
                    case -1627567562:
                        if (!type.equals(b.f139387e)) {
                            g(view, uiKitViewObj);
                        } else {
                            UiKitUtil uiKitUtil = UiKitUtil.f73232a;
                            Context context = getContext();
                            f0.o(context, "getContext(...)");
                            f0.m(uiKitUtil.A(context, (TextRenderPreview) view, (UiKitTextObj) uiKitViewObj));
                        }
                        break;
                    case -1102672091:
                        if (!type.equals(b.f139390h)) {
                            g(view, uiKitViewObj);
                        } else {
                            Context context2 = getContext();
                            f0.o(context2, "getContext(...)");
                            f0.m(UiKitUtil.y(context2, (LinearLayout) view, (UiKitLinearObj) uiKitViewObj));
                        }
                        break;
                    case -907680051:
                        if (!type.equals(b.f139393k)) {
                            g(view, uiKitViewObj);
                        } else {
                            ViewGroup viewGroup = !f0.g(((UiKitScrollObj) uiKitViewObj).getScroll_orientation(), "0") ? (NestedScrollView) view : (HorizontalNestedScrollView) view;
                            Context context3 = getContext();
                            f0.o(context3, "getContext(...)");
                            UiKitUtil.u(context3, viewGroup, (UiKitLayoutObj) uiKitViewObj);
                        }
                        break;
                    case -554435892:
                        if (!type.equals(b.f139391i)) {
                            g(view, uiKitViewObj);
                        } else {
                            Context context4 = getContext();
                            f0.o(context4, "getContext(...)");
                            ViewGroup viewGroupU = UiKitUtil.u(context4, (ViewGroup) view, (UiKitRelativeObj) uiKitViewObj);
                            f0.n(viewGroupU, "null cannot be cast to non-null type android.widget.RelativeLayout");
                        }
                        break;
                    case 3046160:
                        if (!type.equals(b.f139392j)) {
                            g(view, uiKitViewObj);
                        } else {
                            Context context5 = getContext();
                            f0.o(context5, "getContext(...)");
                            f0.m(UiKitUtil.w(context5, (CardView) view, (UiKitCardObj) uiKitViewObj));
                        }
                        break;
                    case 3556653:
                        if (!type.equals("text")) {
                            g(view, uiKitViewObj);
                        } else {
                            Context context6 = getContext();
                            f0.o(context6, "getContext(...)");
                            f0.m(UiKitUtil.B(context6, (HBLineHeightTextView) view, (UiKitTextObj) uiKitViewObj));
                        }
                        break;
                    case 100313435:
                        if (!type.equals("image")) {
                            g(view, uiKitViewObj);
                        } else {
                            Context context7 = getContext();
                            f0.o(context7, "getContext(...)");
                            f0.m(UiKitUtil.x(context7, (ImageView) view, (UiKitImageObj) uiKitViewObj));
                        }
                        break;
                    default:
                        g(view, uiKitViewObj);
                        break;
                }
            } else {
                g(view, uiKitViewObj);
            }
        } catch (Throwable th2) {
            Log.e("refreshViewBase", "error   " + th2.getMessage());
        }
        i(view, uiKitViewObj);
    }

    private final void i(View view, UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{view, uiKitViewObj}, this, changeQuickRedirect, false, 9003, new Class[]{View.class, UiKitViewObj.class}, Void.TYPE).isSupported || view == null || uiKitViewObj == null) {
            return;
        }
        String parent_type = uiKitViewObj.getParent_type();
        if (!f0.g(parent_type, b.f139390h)) {
            if (f0.g(parent_type, b.f139391i)) {
                f(view, uiKitViewObj);
                return;
            }
            return;
        }
        Context context = getContext();
        f0.o(context, "getContext(...)");
        view.setLayoutParams(UiKitUtil.o(context, uiKitViewObj));
        String weight = uiKitViewObj.getWeight();
        if (weight != null) {
            ViewParent parent = view.getParent();
            f0.n(parent, "null cannot be cast to non-null type android.widget.LinearLayout");
            if (((LinearLayout) parent).getOrientation() == 0) {
                view.getLayoutParams().width = 0;
            } else {
                view.getLayoutParams().height = 0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).weight = n.p(weight);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9 A[LOOP:0: B:40:0x00d3->B:42:0x00d9, LOOP_END] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @d
    public final View a(@e ViewGroup viewGroup, @d UiKitViewObj viewObj) {
        ViewGroup viewGroup2;
        List<UiKitViewObj> children;
        UiKitViewObj uiKitViewObj;
        ViewGroup viewGroup3;
        UiKitLayoutObj uiKitLayoutObj;
        Iterator<UiKitViewObj> it;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, viewObj}, this, changeQuickRedirect, false, c.k.f33626il, new Class[]{ViewGroup.class, UiKitViewObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(viewObj, "viewObj");
        View viewB = b(viewObj);
        if (viewGroup != null) {
            viewGroup.addView(viewB);
        }
        h(viewB, viewObj);
        String type = viewObj.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1102672091:
                    if (type.equals(b.f139390h)) {
                        f0.n(viewB, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewGroup3 = (ViewGroup) viewB;
                        uiKitLayoutObj = (UiKitLayoutObj) viewObj;
                        if (!com.max.hbcommon.utils.c.w(uiKitLayoutObj.getChildren())) {
                            List<UiKitViewObj> children2 = uiKitLayoutObj.getChildren();
                            f0.m(children2);
                            it = children2.iterator();
                            while (it.hasNext()) {
                                a(viewGroup3, it.next());
                            }
                        }
                    }
                    break;
                case -907680051:
                    if (type.equals(b.f139393k)) {
                        UiKitScrollObj uiKitScrollObj = (UiKitScrollObj) viewObj;
                        if (f0.g(uiKitScrollObj.getScroll_orientation(), "0")) {
                            f0.n(viewB, "null cannot be cast to non-null type com.max.hbcustomview.HorizontalNestedScrollView");
                            viewGroup2 = (HorizontalNestedScrollView) viewB;
                        } else {
                            f0.n(viewB, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
                            viewGroup2 = (NestedScrollView) viewB;
                        }
                        if (!com.max.hbcommon.utils.c.w(((UiKitLayoutObj) viewObj).getChildren()) && (children = uiKitScrollObj.getChildren()) != null && (uiKitViewObj = children.get(0)) != null) {
                            a(viewGroup2, uiKitViewObj);
                        }
                    }
                    break;
                case -554435892:
                    if (type.equals(b.f139391i)) {
                        f0.n(viewB, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewGroup3 = (ViewGroup) viewB;
                        uiKitLayoutObj = (UiKitLayoutObj) viewObj;
                        if (!com.max.hbcommon.utils.c.w(uiKitLayoutObj.getChildren())) {
                            List<UiKitViewObj> children3 = uiKitLayoutObj.getChildren();
                            f0.m(children3);
                            it = children3.iterator();
                            while (it.hasNext()) {
                                a(viewGroup3, it.next());
                            }
                        }
                    }
                    break;
                case 3046160:
                    if (type.equals(b.f139392j)) {
                        f0.n(viewB, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewGroup3 = (ViewGroup) viewB;
                        uiKitLayoutObj = (UiKitLayoutObj) viewObj;
                        if (!com.max.hbcommon.utils.c.w(uiKitLayoutObj.getChildren())) {
                            List<UiKitViewObj> children4 = uiKitLayoutObj.getChildren();
                            f0.m(children4);
                            it = children4.iterator();
                            while (it.hasNext()) {
                                a(viewGroup3, it.next());
                            }
                        }
                    }
                    break;
            }
        }
        return viewB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @d
    public final View b(@d UiKitViewObj viewObj) {
        FrameLayout horizontalNestedScrollView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewObj}, this, changeQuickRedirect, false, 9000, new Class[]{UiKitViewObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(viewObj, "viewObj");
        String type = viewObj.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1627567562:
                    if (type.equals(b.f139387e)) {
                        return new TextRenderPreview(getContext());
                    }
                    break;
                case -1102672091:
                    if (type.equals(b.f139390h)) {
                        Context context = getContext();
                        f0.o(context, "getContext(...)");
                        LinearLayout linearLayoutY = UiKitUtil.y(context, new LinearLayout(getContext()), (UiKitLinearObj) viewObj);
                        f0.m(linearLayoutY);
                        return linearLayoutY;
                    }
                    break;
                case -907680051:
                    if (type.equals(b.f139393k)) {
                        if (f0.g(((UiKitScrollObj) viewObj).getScroll_orientation(), "0")) {
                            Context context2 = getContext();
                            f0.o(context2, "getContext(...)");
                            horizontalNestedScrollView = new HorizontalNestedScrollView(context2);
                        } else {
                            NestedScrollView nestedScrollView = new NestedScrollView(getContext());
                            nestedScrollView.setFillViewport(true);
                            horizontalNestedScrollView = nestedScrollView;
                        }
                        Context context3 = getContext();
                        f0.o(context3, "getContext(...)");
                        UiKitUtil.u(context3, horizontalNestedScrollView, (UiKitLayoutObj) viewObj);
                        return horizontalNestedScrollView;
                    }
                    break;
                case -554435892:
                    if (type.equals(b.f139391i)) {
                        Context context4 = getContext();
                        f0.o(context4, "getContext(...)");
                        ViewGroup viewGroupU = UiKitUtil.u(context4, new RelativeLayout(getContext()), (UiKitRelativeObj) viewObj);
                        f0.n(viewGroupU, "null cannot be cast to non-null type android.widget.RelativeLayout");
                        return (RelativeLayout) viewGroupU;
                    }
                    break;
                case 3046160:
                    if (type.equals(b.f139392j)) {
                        Context context5 = getContext();
                        f0.o(context5, "getContext(...)");
                        CardView cardViewW = UiKitUtil.w(context5, new CardView(getContext()), (UiKitCardObj) viewObj);
                        f0.m(cardViewW);
                        return cardViewW;
                    }
                    break;
                case 3556653:
                    if (type.equals("text")) {
                        Context context6 = getContext();
                        f0.o(context6, "getContext(...)");
                        return new HBLineHeightTextView(context6);
                    }
                    break;
                case 100313435:
                    if (type.equals("image")) {
                        return new ImageView(getContext());
                    }
                    break;
            }
        }
        return c(viewObj);
    }

    @d
    public View c(@d UiKitViewObj viewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewObj}, this, changeQuickRedirect, false, 9005, new Class[]{UiKitViewObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(viewObj, "viewObj");
        Context context = getContext();
        f0.o(context, "getContext(...)");
        View viewV = UiKitUtil.v(context, new View(getContext()), viewObj);
        f0.m(viewV);
        return viewV;
    }

    public void g(@e View view, @e UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{view, uiKitViewObj}, this, changeQuickRedirect, false, c.k.f33788pl, new Class[]{View.class, UiKitViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "getContext(...)");
        UiKitUtil.v(context, view, uiKitViewObj);
    }

    @e
    public final UiKitViewObj getRootViewObj() {
        return this.f73218d;
    }

    public final void setDataToCreate(@e UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{uiKitViewObj}, this, changeQuickRedirect, false, c.k.f33558fl, new Class[]{UiKitViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        removeAllViews();
        UiKitViewObj uiKitViewObjD = d(uiKitViewObj);
        if (uiKitViewObjD != null) {
            this.f73218d = uiKitViewObjD;
            long jCurrentTimeMillis = System.currentTimeMillis();
            a(this, uiKitViewObjD);
            Log.d("BaseUiKitView", "create addView  " + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    public final void setDataToRefresh(@e UiKitViewObj uiKitViewObj) {
        UiKitViewObj uiKitViewObjD;
        if (PatchProxy.proxy(new Object[]{uiKitViewObj}, this, changeQuickRedirect, false, c.k.f33581gl, new Class[]{UiKitViewObj.class}, Void.TYPE).isSupported || (uiKitViewObjD = d(uiKitViewObj)) == null) {
            return;
        }
        this.f73218d = uiKitViewObjD;
        long jCurrentTimeMillis = System.currentTimeMillis();
        e(getChildAt(0), uiKitViewObjD);
        Log.d("BaseUiKitView", "refresh refreshViewBase  " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void setRootViewObj(@e UiKitViewObj uiKitViewObj) {
        this.f73218d = uiKitViewObj;
    }
}
