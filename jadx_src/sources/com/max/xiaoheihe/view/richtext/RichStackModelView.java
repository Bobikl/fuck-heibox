package com.max.xiaoheihe.view.richtext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.n;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.InsetObj;
import com.max.xiaoheihe.bean.rich.BaseRichModelObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RichStackModelView.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class RichStackModelView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f96078s = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f96079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f96080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f96081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e
    private Drawable f96082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f96083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f96084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f96085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f96086r;

    /* JADX INFO: compiled from: RichStackModelView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RichStackModelObj f96088c;

        a(RichStackModelObj richStackModelObj) {
            this.f96088c = richStackModelObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49647, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = RichStackModelView.this.getContext();
            f0.o(context, "context");
            b.k0(context, this.f96088c.getProtocol());
        }
    }

    public RichStackModelView(@e Context context) {
        this(context, null);
    }

    public RichStackModelView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichStackModelView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        this.f96081m = -1;
        this.f96083o = -1;
        this.f96085q = -9527;
        this.f96086r = -9527;
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49636, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setLl_richtags(new LinearLayout(getContext()));
        addView(getLl_richtags(), new ViewGroup.LayoutParams(-1, -1));
        setCardElevation(0.0f);
        super.setCardBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        if (this.f96081m != -1) {
            getLl_richtags().setBackgroundColor(this.f96081m);
            this.f96081m = -1;
        }
        if (this.f96082n != null) {
            getLl_richtags().setBackground(this.f96082n);
            this.f96082n = null;
        }
        if (this.f96083o != -1) {
            getLl_richtags().setBackgroundResource(this.f96083o);
            this.f96083o = -1;
        }
        this.f96080l = true;
    }

    public static /* synthetic */ void setAlignment$default(RichStackModelView richStackModelView, String str, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{richStackModelView, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 49641, new Class[]{RichStackModelView.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        richStackModelView.setAlignment(str, z10);
    }

    @d
    public final LinearLayout getLl_richtags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49634, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f96079k;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_richtags");
        return null;
    }

    public final int getMMaxHeight() {
        return this.f96085q;
    }

    public final int getMMaxWidth() {
        return this.f96086r;
    }

    public final boolean i() {
        return this.f96084p;
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49646, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.f96085q;
        if (size > i12 && i12 != -9527) {
            size = i12;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = this.f96086r;
        if (size2 > i13 && i13 != -9527) {
            size2 = i13;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), iMakeMeasureSpec);
    }

    public final void setAlignment(@e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49640, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        this.f96084p = true;
                        return;
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        if (z10) {
                            getLl_richtags().setGravity(n.f21701b);
                            return;
                        } else {
                            getLl_richtags().setGravity(48);
                            return;
                        }
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        getLl_richtags().setGravity(17);
                        return;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        if (z10) {
                            getLl_richtags().setGravity(n.f21702c);
                            return;
                        } else {
                            getLl_richtags().setGravity(80);
                            return;
                        }
                    }
                    break;
            }
        }
        getLl_richtags().setGravity(z10 ? 1 : 16);
    }

    public final void setAxis(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49639, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            getLl_richtags().setOrientation(1);
        } else {
            getLl_richtags().setOrientation(0);
        }
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 49644, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f96080l) {
            getLl_richtags().setBackground(drawable);
        } else {
            this.f96082n = drawable;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49643, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f96080l) {
            getLl_richtags().setBackgroundColor(i10);
        } else {
            this.f96081m = i10;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49645, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f96080l) {
            getLl_richtags().setBackgroundResource(i10);
        } else {
            this.f96083o = i10;
        }
    }

    public final void setChildrenNeedFill(boolean z10) {
        this.f96084p = z10;
    }

    public final void setInset(@e InsetObj insetObj) {
        if (PatchProxy.proxy(new Object[]{insetObj}, this, changeQuickRedirect, false, 49642, new Class[]{InsetObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (insetObj != null) {
            getLl_richtags().setPadding(ViewUtils.f(getContext(), insetObj.getLeft()), ViewUtils.f(getContext(), insetObj.getTop()), ViewUtils.f(getContext(), insetObj.getRight()), ViewUtils.f(getContext(), insetObj.getBottom()));
        } else {
            getLl_richtags().setPadding(0, 0, 0, 0);
        }
    }

    public final void setLl_richtags(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 49635, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f96079k = linearLayout;
    }

    public final void setMMaxHeight(int i10) {
        this.f96085q = i10;
    }

    public final void setMMaxWidth(int i10) {
        this.f96086r = i10;
    }

    public final void setRichStackData(@e RichStackModelObj richStackModelObj) {
        if (PatchProxy.proxy(new Object[]{richStackModelObj}, this, changeQuickRedirect, false, 49637, new Class[]{RichStackModelObj.class}, Void.TYPE).isSupported) {
            return;
        }
        setRichStackData(richStackModelObj, true);
    }

    public final void setRichStackData(@e RichStackModelObj richStackModelObj, boolean z10) {
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{richStackModelObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49638, new Class[]{RichStackModelObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getLl_richtags().removeAllViews();
        if (richStackModelObj != null) {
            richStackModelObj = (RichStackModelObj) k.a(q.Q(k.p(richStackModelObj), getContext(), z10), RichStackModelObj.class);
        }
        if (richStackModelObj != null) {
            boolean zG = f0.g("1", richStackModelObj.getAxis());
            setAxis(zG);
            setAlignment(richStackModelObj.getAlignment(), zG);
            setInset(richStackModelObj.getInset());
            if (!c.u(richStackModelObj.getProtocol())) {
                setOnClickListener(new a(richStackModelObj));
            }
            ViewGroup.LayoutParams layoutParams = getLl_richtags().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            } else {
                f0.o(layoutParams, "ll_richtags.layoutParams…RAP_CONTENT\n            )");
            }
            if (!c.u(richStackModelObj.getHeight())) {
                layoutParams.height = ViewUtils.f(getContext(), com.max.hbutils.utils.n.p(richStackModelObj.getHeight()));
            }
            if (!c.u(richStackModelObj.getWidth())) {
                layoutParams.width = ViewUtils.f(getContext(), com.max.hbutils.utils.n.p(richStackModelObj.getWidth()));
            }
            getLl_richtags().setLayoutParams(layoutParams);
            setRadius(ViewUtils.f(getContext(), com.max.hbutils.utils.n.p(richStackModelObj.getCorner_radius())));
            String background_color = richStackModelObj.getBackground_color();
            int iE1 = background_color != null ? com.max.xiaoheihe.utils.d.e1(background_color) : 0;
            String border_color = richStackModelObj.getBorder_color();
            if (border_color != null && border_color.length() != 0) {
                z11 = false;
            }
            int iE2 = !z11 ? com.max.xiaoheihe.utils.d.e1(richStackModelObj.getBorder_color()) : iE1;
            float fP = richStackModelObj.getBorder_width() != null ? com.max.hbutils.utils.n.p(richStackModelObj.getBorder_width()) : 0.0f;
            String corner_radius = richStackModelObj.getCorner_radius();
            setBackground(q.O(q.v(getContext(), iE1, corner_radius != null ? com.max.hbutils.utils.n.p(corner_radius) : 0.0f), getContext(), iE2, fP));
            List<BaseRichModelObj> models = richStackModelObj.getModels();
            if (models != null) {
                float fP2 = com.max.hbutils.utils.n.p(richStackModelObj.getSpace());
                for (BaseRichModelObj baseRichModelObj : models) {
                    boolean z12 = this.f96084p;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((z12 && zG) ? -1 : -2, (!z12 || zG) ? -2 : -1);
                    if (getLl_richtags().getChildCount() > 0 && fP2 > 0.0f) {
                        getLl_richtags().addView(new View(getContext()), new LinearLayout.LayoutParams(zG ? 0 : ViewUtils.f(getContext(), fP2), zG ? ViewUtils.f(getContext(), fP2) : 0));
                    }
                    if (baseRichModelObj instanceof RichStackModelObj) {
                        RichStackModelView richStackModelView = new RichStackModelView(getContext());
                        richStackModelView.setLayoutParams(layoutParams2);
                        richStackModelView.setRichStackData((RichStackModelObj) baseRichModelObj, false);
                        getLl_richtags().addView(richStackModelView);
                    } else if (baseRichModelObj instanceof RichAttributeModelObj) {
                        Context context = getContext();
                        f0.o(context, "context");
                        RichViewGroup richViewGroup = new RichViewGroup(context);
                        richViewGroup.setLayoutParams(layoutParams2);
                        richViewGroup.setRichText((RichAttributeModelObj) baseRichModelObj, false);
                        getLl_richtags().addView(richViewGroup);
                    }
                }
            }
        }
    }
}
