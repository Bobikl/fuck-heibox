package com.max.xiaoheihe.view.slicegradeview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.core.content.res.i;
import androidx.lifecycle.i0;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.LinkedList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SliceGradeView.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class SliceGradeView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f96116r = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private int[] f96117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f96118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final LinkedList<MaskImageView> f96120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f96123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f96124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f96125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f96126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f96127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f96128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final i0<Integer> f96129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f96130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f96131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @e
    private a f96132q;

    /* JADX INFO: compiled from: SliceGradeView.kt */
    public interface a {
        void a(@dl.d View view, int i10);
    }

    /* JADX INFO: compiled from: SliceGradeView.kt */
    public static final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f96133b = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: SliceGradeView.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaskImageView f96135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96136d;

        c(MaskImageView maskImageView, int i10) {
            this.f96135c = maskImageView;
            this.f96136d = i10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a onGradeClickListener;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49681, new Class[]{View.class}, Void.TYPE).isSupported || (onGradeClickListener = SliceGradeView.this.getOnGradeClickListener()) == null) {
                return;
            }
            onGradeClickListener.a(this.f96135c, this.f96136d);
        }
    }

    /* JADX INFO: compiled from: SliceGradeView.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49682, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SliceGradeView.this.c();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliceGradeView(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliceGradeView(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliceGradeView(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliceGradeView(@dl.d Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        int[] intArray = getContext().getResources().getIntArray(R.array.default_grade_color);
        f0.o(intArray, "context.resources.getInt…rray.default_grade_color)");
        this.f96117b = intArray;
        this.f96118c = true;
        this.f96119d = R.drawable.ic_rating_star;
        this.f96120e = new LinkedList<>();
        this.f96124i = 212.0f;
        this.f96125j = 28.0f;
        this.f96126k = true;
        this.f96127l = true;
        this.f96128m = 10;
        this.f96129n = new i0<>();
        this.f96130o = 1;
        this.f96131p = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.L3, i10, 0);
            f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…adeView, defStyleAttr, 0)");
            int[] intArray2 = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(0, R.array.default_grade_color));
            f0.o(intArray2, "context.resources.getInt…          )\n            )");
            this.f96117b = intArray2;
            this.f96128m = typedArrayObtainStyledAttributes.getInt(4, 10);
            this.f96130o = typedArrayObtainStyledAttributes.getInt(6, 1);
            this.f96118c = typedArrayObtainStyledAttributes.getBoolean(3, true);
            this.f96119d = typedArrayObtainStyledAttributes.getResourceId(5, R.drawable.ic_rating_star);
            this.f96124i = typedArrayObtainStyledAttributes.getFloat(1, 28.0f);
            this.f96125j = typedArrayObtainStyledAttributes.getFloat(2, 212.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        d();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    private final void a(float f10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 1;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49677, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f96118c) {
            int i17 = this.f96130o;
            if (i17 <= 1) {
                i13 = (i17 * this.f96122g) / 2;
            } else {
                i10 = (i17 / 2) * this.f96122g;
                i11 = (i17 / 2) - 1;
                i12 = this.f96123h;
            }
            if (f10 < i13) {
                e(this.f96130o);
                return;
            }
            if (f10 > ViewUtils.W(this)) {
                e(this.f96128m);
                return;
            }
            if (this.f96118c) {
                int i18 = this.f96122g;
                int i19 = this.f96123h;
                e(((int) (f10 / (i18 + i19))) + (((int) (f10 % ((float) (i19 + i18)))) <= i18 / 6 ? 0 : 1));
                return;
            }
            i14 = this.f96122g;
            int i20 = this.f96123h;
            int i21 = ((int) (f10 / (i14 + i20))) * 2;
            i15 = (int) (f10 % (i20 + i14));
            if (i15 >= i14 / 2) {
                i16 = 2;
            } else if (i15 <= i14 / 8) {
                i16 = 0;
            }
            e(i21 + i16);
        }
        int i22 = this.f96130o;
        i10 = this.f96122g * i22;
        i11 = i22 - 1;
        i12 = this.f96123h;
        i13 = (i11 * i12) + i10;
        if (f10 < i13) {
            e(this.f96130o);
            return;
        }
        if (f10 > ViewUtils.W(this)) {
            e(this.f96128m);
            return;
        }
        if (this.f96118c) {
            int i110 = this.f96122g;
            int i111 = this.f96123h;
            e(((int) (f10 / (i110 + i111))) + (((int) (f10 % ((float) (i111 + i110)))) <= i110 / 6 ? 0 : 1));
            return;
        }
        i14 = this.f96122g;
        int i23 = this.f96123h;
        int i24 = ((int) (f10 / (i14 + i23))) * 2;
        i15 = (int) (f10 % (i23 + i14));
        if (i15 >= i14 / 2) {
            i16 = 2;
        } else if (i15 <= i14 / 8) {
            i16 = 0;
        }
        e(i24 + i16);
    }

    private final void d() {
        int i10;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49675, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(getContext(), this.f96124i);
        int iF2 = ViewUtils.f(getContext(), this.f96125j);
        this.f96122g = iF;
        if (iF2 <= 0) {
            iF2 = ViewUtils.f(getContext(), 60.0f);
        }
        if (this.f96118c) {
            int i12 = this.f96128m;
            i10 = (iF2 - ((i12 / 2) * iF)) / ((i12 / 2) - 1);
        } else {
            int i13 = this.f96128m;
            i10 = (iF2 - (i13 * iF)) / (i13 - 1);
        }
        this.f96123h = i10;
        this.f96120e.clear();
        setOnClickListener(b.f96133b);
        while (i11 < this.f96128m) {
            Context context = getContext();
            f0.o(context, "context");
            MaskImageView maskImageView = new MaskImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
            if (i11 != this.f96128m - 1) {
                layoutParams.setMarginEnd(this.f96123h);
            }
            maskImageView.setSrcColor(i.e(getContext().getResources(), R.color.divider_primary_1_color, null));
            Drawable drawableG = i.g(getResources(), this.f96119d, null);
            if (drawableG != null) {
                maskImageView.setShape(drawableG);
                maskImageView.setBackgroundResource(this.f96119d);
            }
            maskImageView.setTag(R.id.grade_level, Integer.valueOf(i11));
            f(maskImageView);
            int i14 = this.f96118c ? i11 + 2 : i11 + 1;
            maskImageView.setOnClickListener(new c(maskImageView, i11));
            this.f96120e.add(maskImageView);
            addView(maskImageView, layoutParams);
            i11 = i14;
        }
        Log.d("cqtest", "Setup Space: " + this.f96123h + "  unitWidth: " + this.f96122g + "  containerW: " + iF2);
        post(new d());
    }

    private final void e(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49678, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.f96130o;
        if (i10 < i11) {
            setGrade(i11);
            return;
        }
        int i12 = this.f96131p;
        int i13 = this.f96128m;
        if (i12 > i13) {
            setGrade(i13);
        } else {
            setGrade(i10);
        }
    }

    private final void f(MaskImageView maskImageView) {
        if (PatchProxy.proxy(new Object[]{maskImageView}, this, changeQuickRedirect, false, 49680, new Class[]{MaskImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        Object tag = maskImageView.getTag(R.id.grade_level);
        f0.n(tag, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) tag).intValue();
        maskImageView.setMaskColor(this.f96117b[this.f96121f]);
        if (this.f96118c) {
            int i10 = this.f96131p;
            if (iIntValue < i10 && iIntValue + 1 < i10) {
                maskImageView.setProgressWidth(1.0f);
            } else if (iIntValue < i10) {
                maskImageView.setProgressWidth(0.5f);
            } else {
                maskImageView.setProgressWidth(0.0f);
            }
        } else if (iIntValue < this.f96131p) {
            maskImageView.setProgressWidth(1.0f);
        } else {
            maskImageView.setProgressWidth(0.0f);
        }
        maskImageView.postInvalidate();
    }

    public final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49679, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f96131p - 1;
        this.f96121f = i10;
        int[] iArr = this.f96117b;
        if (i10 >= iArr.length) {
            this.f96121f = iArr.length - 1;
        }
        if (this.f96121f < 0) {
            this.f96121f = 0;
        }
        for (MaskImageView itemView : this.f96120e) {
            f0.o(itemView, "itemView");
            f(itemView);
        }
    }

    public final void c() {
        int i10;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49674, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(getContext(), this.f96124i);
        int iV = ViewUtils.V(this);
        int iW = ViewUtils.W(this);
        if (iV <= 0) {
            ViewUtils.f(getContext(), this.f96124i);
            iW = ViewUtils.f(getContext(), this.f96125j);
        }
        this.f96122g = iF;
        if (iW <= 0) {
            iW = ViewUtils.f(getContext(), 60.0f);
        }
        if (this.f96118c) {
            int i12 = this.f96128m;
            i10 = (iW - ((i12 / 2) * iF)) / ((i12 / 2) - 1);
        } else {
            int i13 = this.f96128m;
            i10 = (iW - (i13 * iF)) / (i13 - 1);
        }
        this.f96123h = i10;
        for (MaskImageView maskImageView : this.f96120e) {
            int i14 = i11 + 1;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
            if (i11 != this.f96128m - 1) {
                layoutParams.setMarginEnd(this.f96123h);
            }
            maskImageView.setLayoutParams(layoutParams);
            i11 = i14;
        }
        Log.d("cqtest", "Relayout Space: " + this.f96123h + "  unitWidth: " + this.f96122g + "  containerW: " + iW);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@dl.d MotionEvent ev) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{ev}, this, changeQuickRedirect, false, 49676, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(ev, "ev");
        if (this.f96127l) {
            int actionMasked = ev.getActionMasked();
            if (actionMasked == 0) {
                this.f96126k = true;
                requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.f96126k = false;
                    a(ev.getX());
                    requestDisallowInterceptTouchEvent(false);
                }
            } else if (this.f96126k) {
                a(ev.getX());
                performClick();
                requestDisallowInterceptTouchEvent(true);
            }
        } else if (1 == ev.getActionMasked()) {
            performClick();
        }
        return super.dispatchTouchEvent(ev);
    }

    public final boolean getEnableSlide() {
        return this.f96127l;
    }

    public final int getGrade() {
        return this.f96131p;
    }

    public final int getGradeCount() {
        return this.f96128m;
    }

    @dl.d
    public final i0<Integer> getGradeLD() {
        return this.f96129n;
    }

    public final int getMinGrade() {
        return this.f96130o;
    }

    @e
    public final a getOnGradeClickListener() {
        return this.f96132q;
    }

    public final void setEnableSlide(boolean z10) {
        this.f96127l = z10;
    }

    public final void setGrade(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49673, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.f96130o;
        if (i10 < i11 || i10 > (i11 = this.f96128m)) {
            i10 = i11;
        }
        if (i10 != this.f96131p) {
            this.f96131p = i10;
            b();
            this.f96129n.r(Integer.valueOf(i10));
        }
    }

    public final void setGradeCount(int i10) {
        this.f96128m = i10;
    }

    public final void setMinGrade(int i10) {
        this.f96130o = i10;
    }

    public final void setOnGradeClickListener(@e a aVar) {
        this.f96132q = aVar;
    }
}
