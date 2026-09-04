package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ExpandMoreButton.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ExpandMoreButton extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f66991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f66992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinearLayout f66993d;

    /* JADX INFO: compiled from: ExpandMoreButton.kt */
    public enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public static kotlin.enums.a<Direction> getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.d.Z6, new Class[]{String.class}, Direction.class);
            return (Direction) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Direction.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Direction[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.d.Y6, new Class[0], Direction[].class);
            return (Direction[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: ExpandMoreButton.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66994a;

        static {
            int[] iArr = new int[Direction.valuesCustom().length];
            try {
                iArr[Direction.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Direction.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66994a = iArr;
        }
    }

    public ExpandMoreButton(@dl.e Context context) {
        this(context, null);
    }

    public ExpandMoreButton(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandMoreButton(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ExpandMoreButton(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b();
        c(attributeSet);
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.R6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        setBackgroundResource(R.drawable.window_bg_4dp);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f66993d = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f66993d;
        View view = null;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.f0.S("ll_left");
            linearLayout2 = null;
        }
        linearLayout2.setGravity(17);
        View view2 = this.f66993d;
        if (view2 == null) {
            kotlin.jvm.internal.f0.S("ll_left");
            view2 = null;
        }
        addView(view2);
        TextView textView = new TextView(getContext());
        this.f66991b = textView;
        Resources resources = getContext().getResources();
        int i10 = R.color.text_primary_1_color;
        textView.setTextColor(resources.getColor(i10));
        TextView textView2 = this.f66991b;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView2 = null;
        }
        textView2.setTextSize(ViewUtils.g(getContext(), 13.0f));
        View view3 = this.f66991b;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
        } else {
            view = view3;
        }
        addView(view);
        int iF = ViewUtils.f(getContext(), 8.0f);
        setIv_arrow(new ImageView(getContext()));
        getIv_arrow().setImageResource(R.drawable.common_arrow_down_filled_24x24);
        getIv_arrow().setColorFilter(getContext().getResources().getColor(i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.leftMargin = ViewUtils.f(getContext(), 4.0f);
        addView(getIv_arrow(), layoutParams);
    }

    private final void c(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.S6, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f66480y0);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.ExpandMoreButton_embText);
        int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.ExpandMoreButton_embArrowDirection, 3);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ExpandMoreButton_embColor, getContext().getResources().getColor(R.color.text_primary_1_color));
        setText(string);
        setColor(color);
        if (i10 == 0) {
            setArrowDirection(Direction.LEFT);
            return;
        }
        if (i10 == 1) {
            setArrowDirection(Direction.UP);
        } else if (i10 == 2) {
            setArrowDirection(Direction.RIGHT);
        } else {
            if (i10 != 3) {
                return;
            }
            setArrowDirection(Direction.DOWN);
        }
    }

    public final void a(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.W6, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        LinearLayout linearLayout = this.f66993d;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("ll_left");
            linearLayout = null;
        }
        linearLayout.addView(view);
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.X6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.f66993d;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("ll_left");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
    }

    @dl.d
    public final ImageView getIv_arrow() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.P6, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f66992c;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_arrow");
        return null;
    }

    public final void setArrowDirection(@dl.d Direction direction) {
        if (PatchProxy.proxy(new Object[]{direction}, this, changeQuickRedirect, false, bb.c.d.U6, new Class[]{Direction.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(direction, "direction");
        int i10 = a.f66994a[direction.ordinal()];
        float f10 = 0.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 180.0f;
            } else if (i10 == 3) {
                f10 = 90.0f;
            } else if (i10 == 4) {
                f10 = 270.0f;
            }
        }
        getIv_arrow().animate().rotation(f10).setDuration(200L);
    }

    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.V6, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f66991b;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView = null;
        }
        textView.setTextColor(i10);
        getIv_arrow().setColorFilter(i10);
    }

    public final void setIv_arrow(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.Q6, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.f66992c = imageView;
    }

    public final void setText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.T6, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f66991b;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView = null;
        }
        textView.setText(str);
    }
}
