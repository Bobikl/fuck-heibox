package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: MallPriceCamelView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class MallPriceCamelView extends ConstraintLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextView J;
    private TextView K;
    private TextView L;
    private float M;
    private float N;
    private float O;
    private float P;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MallPriceCamelView(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MallPriceCamelView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MallPriceCamelView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallPriceCamelView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        ic.a aVar = ic.a.f119343a;
        Context context2 = getContext();
        f0.o(context2, "getContext(...)");
        this.M = aVar.a(context2, 18.0f);
        Context context3 = getContext();
        f0.o(context3, "getContext(...)");
        float fA = aVar.a(context3, 11.0f);
        this.N = fA;
        this.O = this.M;
        this.P = fA;
        C(attributeSet);
    }

    private final void C(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.S7, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f68746z1);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.O = typedArrayObtainStyledAttributes.getDimension(R.styleable.MallPriceCamelView_mainSize, this.M);
        this.P = typedArrayObtainStyledAttributes.getDimension(R.styleable.MallPriceCamelView_secondarySize, this.N);
        LayoutInflater.from(getContext()).inflate(R.layout.hbcustomview_price_camel_view, this);
        View viewFindViewById = findViewById(R.id.tv_rmb_symbol);
        f0.o(viewFindViewById, "findViewById(...)");
        this.J = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_current_price);
        f0.o(viewFindViewById2, "findViewById(...)");
        this.K = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_price_fee);
        f0.o(viewFindViewById3, "findViewById(...)");
        this.L = (TextView) viewFindViewById3;
        TextView textView = this.K;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_current_price");
            textView = null;
        }
        textView.setTextSize(0, this.O);
        TextView textView3 = this.J;
        if (textView3 == null) {
            f0.S("tv_rmb_symbol");
            textView3 = null;
        }
        textView3.setTextSize(0, this.P);
        TextView textView4 = this.L;
        if (textView4 == null) {
            f0.S("tv_price_fee");
        } else {
            textView2 = textView4;
        }
        textView2.setTextSize(0, this.P);
    }

    public final void setPrice(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.T7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        int iS3 = str != null ? StringsKt__StringsKt.s3(str, ".", 0, false, 6, null) : 0;
        TextView textView = null;
        if (iS3 > 0) {
            TextView textView2 = this.K;
            if (textView2 == null) {
                f0.S("tv_current_price");
                textView2 = null;
            }
            f0.m(str);
            String strSubstring = str.substring(0, iS3);
            f0.o(strSubstring, "substring(...)");
            textView2.setText(strSubstring);
            TextView textView3 = this.L;
            if (textView3 == null) {
                f0.S("tv_price_fee");
                textView3 = null;
            }
            String strSubstring2 = str.substring(iS3);
            f0.o(strSubstring2, "substring(...)");
            textView3.setText(strSubstring2);
            TextView textView4 = this.J;
            if (textView4 == null) {
                f0.S("tv_rmb_symbol");
            } else {
                textView = textView4;
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView5 = this.K;
        if (textView5 == null) {
            f0.S("tv_current_price");
            textView5 = null;
        }
        textView5.setText(str);
        if (TextUtils.isDigitsOnly(str)) {
            TextView textView6 = this.L;
            if (textView6 == null) {
                f0.S("tv_price_fee");
                textView6 = null;
            }
            textView6.setText(".00");
            TextView textView7 = this.J;
            if (textView7 == null) {
                f0.S("tv_rmb_symbol");
            } else {
                textView = textView7;
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView8 = this.L;
        if (textView8 == null) {
            f0.S("tv_price_fee");
            textView8 = null;
        }
        textView8.setText("");
        TextView textView9 = this.J;
        if (textView9 == null) {
            f0.S("tv_rmb_symbol");
        } else {
            textView = textView9;
        }
        textView.setVisibility(8);
    }

    public final void setPriceFeeScale(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.U7, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        if (z10) {
            TextView textView2 = this.L;
            if (textView2 == null) {
                f0.S("tv_price_fee");
            } else {
                textView = textView2;
            }
            textView.setTextSize(0, this.O);
            return;
        }
        TextView textView3 = this.L;
        if (textView3 == null) {
            f0.S("tv_price_fee");
        } else {
            textView = textView3;
        }
        textView.setTextSize(0, this.P);
    }
}
