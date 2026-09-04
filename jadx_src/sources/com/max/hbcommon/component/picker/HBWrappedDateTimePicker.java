package com.max.hbcommon.component.picker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bb.c;
import com.loper7.date_time_picker.DateTimePicker;
import com.max.hbcommon.R;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import mb.r1;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: HBWrappedDateTimePicker.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nHBWrappedDateTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBWrappedDateTimePicker.kt\ncom/max/hbcommon/component/picker/HBWrappedDateTimePicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,106:1\n1#2:107\n254#3,2:108\n254#3,2:110\n*S KotlinDebug\n*F\n+ 1 HBWrappedDateTimePicker.kt\ncom/max/hbcommon/component/picker/HBWrappedDateTimePicker\n*L\n76#1:108,2\n79#1:110,2\n*E\n"})
public final class HBWrappedDateTimePicker extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private r1 f67815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private l<? super Long, b2> f67816c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBWrappedDateTimePicker(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBWrappedDateTimePicker(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public HBWrappedDateTimePicker(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        r1 r1VarD = r1.d(LayoutInflater.from(context), this, true);
        f0.o(r1VarD, "inflate(...)");
        this.f67815b = r1VarD;
        c();
        b();
    }

    public /* synthetic */ HBWrappedDateTimePicker(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31999s1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = this.f67815b.f131730b;
        Drawable drawableI = ViewUtils.i(0, com.max.hbcommon.utils.l.a(R.color.icon_gradient_dark_start_color), com.max.hbcommon.utils.l.a(R.color.icon_gradient_dark_end_color));
        f0.o(drawableI, "getBL2TRGradientRoundedRectDrawable(...)");
        bottomButtonLeftItemView.setRightBackground(drawableI);
        BottomButtonLeftItemView bottomButtonLeftItemView2 = this.f67815b.f131730b;
        GradientDrawable gradientDrawableN = q.n(getContext(), R.color.text_primary_1_color_alpha10);
        f0.o(gradientDrawableN, "getRectShape(...)");
        bottomButtonLeftItemView2.setLeftBackground(gradientDrawableN);
        this.f67815b.f131730b.setShowLeftButton(true);
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31982r1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        DateTimePicker dateTimePicker = this.f67815b.f131732d;
        dateTimePicker.setDisplayType(new int[]{0, 1, 2, 3, 4});
        dateTimePicker.setOnDateTimeChangedListener(new l<Long, b2>() { // from class: com.max.hbcommon.component.picker.HBWrappedDateTimePicker$initDateTimePicker$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(long j10) {
                l lVar;
                if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, c.e.B1, new Class[]{Long.TYPE}, Void.TYPE).isSupported || (lVar = this.f67817b.f67816c) == null) {
                    return;
                }
                lVar.invoke(Long.valueOf(j10));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, c.e.C1, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(l10.longValue());
                return b2.f124493a;
            }
        });
        dateTimePicker.setWrapSelectorWheel(false);
    }

    public final long getTimestampMs() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f32033u1, new Class[0], Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f67815b.f131732d.getMillisecond();
    }

    public final void setBottomSafeSpace(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.e.A1, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f67815b.f131731c.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i10;
            requestLayout();
        }
    }

    public final void setOnCancelClickListener(@d View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, c.e.f32118z1, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onClickListener, "onClickListener");
        this.f67815b.f131730b.setLeftClickListener(onClickListener);
    }

    public final void setOnConfirmClickListener(@d View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, c.e.f32101y1, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onClickListener, "onClickListener");
        this.f67815b.f131730b.setRightClickListener(onClickListener);
    }

    public final void setOnTimestampChangeListener(@d l<? super Long, b2> listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, c.e.f32067w1, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        this.f67816c = listener;
    }

    public final void setTimestampMs(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, c.e.f32016t1, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67815b.f131732d.setDefaultMillisecond(j10);
    }

    public final void setTimestampRange(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.f32084x1, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f67815b.f131732d.setMinMillisecond(j10);
        this.f67815b.f131732d.setMaxMillisecond(j11);
    }

    public final void setTitleOrHide(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.e.f32050v1, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        b2 b2Var = null;
        if (!(true ^ (str == null || kotlin.text.u.V1(str)))) {
            str = null;
        }
        if (str != null) {
            TextView tvTitle = this.f67815b.f131733e;
            f0.o(tvTitle, "tvTitle");
            tvTitle.setVisibility(0);
            this.f67815b.f131733e.setText(str);
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            TextView tvTitle2 = this.f67815b.f131733e;
            f0.o(tvTitle2, "tvTitle");
            tvTitle2.setVisibility(8);
        }
    }
}
