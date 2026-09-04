package com.scwang.smartrefresh.layout.header;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import com.scwang.smartrefresh.layout.internal.c;
import com.scwang.smartrefresh.layout.util.b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ng.g;
import ng.i;
import ng.j;

/* JADX INFO: loaded from: classes8.dex */
public class ClassicsHeader extends InternalClassics<ClassicsHeader> implements g {
    public static final int I = R.id.srl_classics_update;
    public static String J = null;
    public static String K = null;
    public static String L = null;
    public static String M = null;
    public static String N = null;
    public static String O = null;
    public static String P = null;
    public static String Q = null;
    protected String A;
    protected String B;
    protected String C;
    protected String D;
    protected String E;
    protected String F;
    protected String G;
    protected String H;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected String f96730u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Date f96731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected TextView f96732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected SharedPreferences f96733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected DateFormat f96734y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f96735z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96736a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f96736a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96736a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96736a[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96736a[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96736a[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96736a[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f96736a[RefreshState.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        FragmentManager supportFragmentManager;
        super(context, attributeSet, 0);
        this.f96730u = "LAST_UPDATE_TIME";
        this.f96735z = true;
        View.inflate(context, R.layout.srl_classics_header, this);
        ImageView imageView = (ImageView) findViewById(R.id.srl_classics_arrow);
        this.f96771f = imageView;
        TextView textView = (TextView) findViewById(R.id.srl_classics_update);
        this.f96732w = textView;
        ImageView imageView2 = (ImageView) findViewById(R.id.srl_classics_progress);
        this.f96772g = imageView2;
        this.f96770e = (TextView) findViewById(R.id.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f96576d);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsHeader_srlTextTimeMarginTop, b.d(0.0f));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsFooter_srlDrawableMarginRight, b.d(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i10 = R.styleable.ClassicsHeader_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.height);
        int i11 = R.styleable.ClassicsHeader_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.height);
        int i12 = R.styleable.ClassicsHeader_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.height);
        this.f96779n = typedArrayObtainStyledAttributes.getInt(R.styleable.ClassicsHeader_srlFinishDuration, this.f96779n);
        this.f96735z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ClassicsHeader_srlEnableLastTime, this.f96735z);
        this.f96765c = og.b.f132315i[typedArrayObtainStyledAttributes.getInt(R.styleable.ClassicsHeader_srlClassicsSpinnerStyle, this.f96765c.f132316a)];
        int i13 = R.styleable.ClassicsHeader_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f96771f.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i13));
        } else if (this.f96771f.getDrawable() == null) {
            com.scwang.smartrefresh.layout.internal.a aVar = new com.scwang.smartrefresh.layout.internal.a();
            this.f96774i = aVar;
            aVar.a(-10066330);
            this.f96771f.setImageDrawable(this.f96774i);
        }
        int i14 = R.styleable.ClassicsHeader_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f96772g.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i14));
        } else if (this.f96772g.getDrawable() == null) {
            c cVar = new c();
            this.f96775j = cVar;
            cVar.a(-10066330);
            this.f96772g.setImageDrawable(this.f96775j);
        }
        int i15 = R.styleable.ClassicsHeader_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f96770e.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, b.d(16.0f)));
        }
        int i16 = R.styleable.ClassicsHeader_srlTextSizeTime;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f96732w.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i16, b.d(12.0f)));
        }
        int i17 = R.styleable.ClassicsHeader_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            super.A(typedArrayObtainStyledAttributes.getColor(i17, 0));
        }
        int i18 = R.styleable.ClassicsHeader_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            k(typedArrayObtainStyledAttributes.getColor(i18, 0));
        }
        int i19 = R.styleable.ClassicsHeader_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            this.A = typedArrayObtainStyledAttributes.getString(i19);
        } else {
            String str = J;
            if (str != null) {
                this.A = str;
            } else {
                this.A = context.getString(R.string.srl_header_pulling);
            }
        }
        int i20 = R.styleable.ClassicsHeader_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i20)) {
            this.C = typedArrayObtainStyledAttributes.getString(i20);
        } else {
            String str2 = L;
            if (str2 != null) {
                this.C = str2;
            } else {
                this.C = context.getString(R.string.srl_header_loading);
            }
        }
        int i21 = R.styleable.ClassicsHeader_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            this.D = typedArrayObtainStyledAttributes.getString(i21);
        } else {
            String str3 = M;
            if (str3 != null) {
                this.D = str3;
            } else {
                this.D = context.getString(R.string.srl_header_release);
            }
        }
        int i22 = R.styleable.ClassicsHeader_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            this.E = typedArrayObtainStyledAttributes.getString(i22);
        } else {
            String str4 = N;
            if (str4 != null) {
                this.E = str4;
            } else {
                this.E = context.getString(R.string.srl_header_finish);
            }
        }
        int i23 = R.styleable.ClassicsHeader_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            this.F = typedArrayObtainStyledAttributes.getString(i23);
        } else {
            String str5 = O;
            if (str5 != null) {
                this.F = str5;
            } else {
                this.F = context.getString(R.string.srl_header_failed);
            }
        }
        int i24 = R.styleable.ClassicsHeader_srlTextSecondary;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            this.H = typedArrayObtainStyledAttributes.getString(i24);
        } else {
            String str6 = Q;
            if (str6 != null) {
                this.H = str6;
            } else {
                this.H = context.getString(R.string.srl_header_secondary);
            }
        }
        int i25 = R.styleable.ClassicsHeader_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i25)) {
            this.B = typedArrayObtainStyledAttributes.getString(i25);
        } else {
            String str7 = K;
            if (str7 != null) {
                this.B = str7;
            } else {
                this.B = context.getString(R.string.srl_header_refreshing);
            }
        }
        int i26 = R.styleable.ClassicsHeader_srlTextUpdate;
        if (typedArrayObtainStyledAttributes.hasValue(i26)) {
            this.G = typedArrayObtainStyledAttributes.getString(i26);
        } else {
            String str8 = P;
            if (str8 != null) {
                this.G = str8;
            } else {
                this.G = context.getString(R.string.srl_header_update);
            }
        }
        this.f96734y = new SimpleDateFormat(this.G, Locale.getDefault());
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(this.f96735z ? 0 : 8);
        this.f96770e.setText(isInEditMode() ? this.B : this.A);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
        try {
            if ((context instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) != null && supportFragmentManager.J0().size() > 0) {
                J(new Date());
                return;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f96730u += context.getClass().getName();
        this.f96733x = context.getSharedPreferences("ClassicsHeader", 0);
        J(new Date(this.f96733x.getLong(this.f96730u, System.currentTimeMillis())));
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public ClassicsHeader k(@l int i10) {
        this.f96732w.setTextColor((16777215 & i10) | (-872415232));
        return (ClassicsHeader) super.k(i10);
    }

    public ClassicsHeader H(boolean z10) {
        TextView textView = this.f96732w;
        this.f96735z = z10;
        textView.setVisibility(z10 ? 0 : 8);
        i iVar = this.f96773h;
        if (iVar != null) {
            iVar.b(this);
        }
        return this;
    }

    public ClassicsHeader I(CharSequence charSequence) {
        this.f96731v = null;
        this.f96732w.setText(charSequence);
        return this;
    }

    public ClassicsHeader J(Date date) {
        this.f96731v = date;
        this.f96732w.setText(this.f96734y.format(date));
        if (this.f96733x != null && !isInEditMode()) {
            this.f96733x.edit().putLong(this.f96730u, date.getTime()).apply();
        }
        return this;
    }

    public ClassicsHeader K(float f10) {
        this.f96732w.setTextSize(f10);
        i iVar = this.f96773h;
        if (iVar != null) {
            iVar.b(this);
        }
        return this;
    }

    public ClassicsHeader L(float f10) {
        TextView textView = this.f96732w;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = b.d(f10);
        textView.setLayoutParams(marginLayoutParams);
        return this;
    }

    public ClassicsHeader M(DateFormat dateFormat) {
        this.f96734y = dateFormat;
        Date date = this.f96731v;
        if (date != null) {
            this.f96732w.setText(dateFormat.format(date));
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public int g(@n0 j jVar, boolean z10) {
        if (z10) {
            this.f96770e.setText(this.E);
            if (this.f96731v != null) {
                J(new Date());
            }
        } else {
            this.f96770e.setText(this.F);
        }
        return super.g(jVar, z10);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, pg.f
    public void q(@n0 j jVar, @n0 RefreshState refreshState, @n0 RefreshState refreshState2) {
        ImageView imageView = this.f96771f;
        TextView textView = this.f96732w;
        switch (a.f96736a[refreshState2.ordinal()]) {
            case 1:
                textView.setVisibility(this.f96735z ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f96770e.setText(this.B);
                imageView.setVisibility(8);
                return;
            case 5:
                this.f96770e.setText(this.D);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.f96770e.setText(this.H);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(this.f96735z ? 4 : 8);
                this.f96770e.setText(this.C);
                return;
            default:
                return;
        }
        this.f96770e.setText(this.A);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }
}
