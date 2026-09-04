package com.scwang.smartrefresh.layout.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.n0;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import com.scwang.smartrefresh.layout.internal.c;
import com.scwang.smartrefresh.layout.util.b;
import ng.f;
import ng.j;

/* JADX INFO: loaded from: classes8.dex */
public class ClassicsFooter extends InternalClassics<ClassicsFooter> implements f {
    public static String C;
    public static String D;
    public static String E;
    public static String F;
    public static String G;
    public static String H;
    public static String I;
    protected String A;
    protected boolean B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected String f96697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected String f96698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected String f96699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected String f96700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected String f96701y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected String f96702z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96703a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f96703a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96703a[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96703a[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96703a[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96703a[RefreshState.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96703a[RefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.B = false;
        View.inflate(context, R.layout.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(R.id.srl_classics_arrow);
        this.f96771f = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.srl_classics_progress);
        this.f96772g = imageView2;
        this.f96770e = (TextView) findViewById(R.id.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f96575c);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsFooter_srlDrawableMarginRight, b.d(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i10 = R.styleable.ClassicsFooter_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.height);
        int i11 = R.styleable.ClassicsFooter_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.height);
        int i12 = R.styleable.ClassicsFooter_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.height);
        this.f96779n = typedArrayObtainStyledAttributes.getInt(R.styleable.ClassicsFooter_srlFinishDuration, this.f96779n);
        this.f96765c = og.b.f132315i[typedArrayObtainStyledAttributes.getInt(R.styleable.ClassicsFooter_srlClassicsSpinnerStyle, this.f96765c.f132316a)];
        int i13 = R.styleable.ClassicsFooter_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f96771f.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i13));
        } else if (this.f96771f.getDrawable() == null) {
            com.scwang.smartrefresh.layout.internal.a aVar = new com.scwang.smartrefresh.layout.internal.a();
            this.f96774i = aVar;
            aVar.a(-10066330);
            this.f96771f.setImageDrawable(this.f96774i);
        }
        int i14 = R.styleable.ClassicsFooter_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f96772g.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i14));
        } else if (this.f96772g.getDrawable() == null) {
            c cVar = new c();
            this.f96775j = cVar;
            cVar.a(-10066330);
            this.f96772g.setImageDrawable(this.f96775j);
        }
        int i15 = R.styleable.ClassicsFooter_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f96770e.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, b.d(16.0f)));
        }
        int i16 = R.styleable.ClassicsFooter_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            super.A(typedArrayObtainStyledAttributes.getColor(i16, 0));
        }
        int i17 = R.styleable.ClassicsFooter_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            super.k(typedArrayObtainStyledAttributes.getColor(i17, 0));
        }
        int i18 = R.styleable.ClassicsFooter_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            this.f96697u = typedArrayObtainStyledAttributes.getString(i18);
        } else {
            String str = C;
            if (str != null) {
                this.f96697u = str;
            } else {
                this.f96697u = context.getString(R.string.srl_footer_pulling);
            }
        }
        int i19 = R.styleable.ClassicsFooter_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            this.f96698v = typedArrayObtainStyledAttributes.getString(i19);
        } else {
            String str2 = D;
            if (str2 != null) {
                this.f96698v = str2;
            } else {
                this.f96698v = context.getString(R.string.srl_footer_release);
            }
        }
        int i20 = R.styleable.ClassicsFooter_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i20)) {
            this.f96699w = typedArrayObtainStyledAttributes.getString(i20);
        } else {
            String str3 = E;
            if (str3 != null) {
                this.f96699w = str3;
            } else {
                this.f96699w = context.getString(R.string.srl_footer_loading);
            }
        }
        int i21 = R.styleable.ClassicsFooter_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            this.f96700x = typedArrayObtainStyledAttributes.getString(i21);
        } else {
            String str4 = F;
            if (str4 != null) {
                this.f96700x = str4;
            } else {
                this.f96700x = context.getString(R.string.srl_footer_refreshing);
            }
        }
        int i22 = R.styleable.ClassicsFooter_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            this.f96701y = typedArrayObtainStyledAttributes.getString(i22);
        } else {
            String str5 = G;
            if (str5 != null) {
                this.f96701y = str5;
            } else {
                this.f96701y = context.getString(R.string.srl_footer_finish);
            }
        }
        int i23 = R.styleable.ClassicsFooter_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            this.f96702z = typedArrayObtainStyledAttributes.getString(i23);
        } else {
            String str6 = H;
            if (str6 != null) {
                this.f96702z = str6;
            } else {
                this.f96702z = context.getString(R.string.srl_footer_failed);
            }
        }
        int i24 = R.styleable.ClassicsFooter_srlTextNothing;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            this.A = typedArrayObtainStyledAttributes.getString(i24);
        } else {
            String str7 = I;
            if (str7 != null) {
                this.A = str7;
            } else {
                this.A = context.getString(R.string.srl_footer_nothing);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f96770e.setText(isInEditMode() ? this.f96699w : this.f96697u);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public int g(@n0 j jVar, boolean z10) {
        super.g(jVar, z10);
        if (this.B) {
            return 0;
        }
        this.f96770e.setText(z10 ? this.f96701y : this.f96702z);
        return this.f96779n;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, pg.f
    public void q(@n0 j jVar, @n0 RefreshState refreshState, @n0 RefreshState refreshState2) {
        ImageView imageView = this.f96771f;
        if (this.B) {
            return;
        }
        switch (a.f96703a[refreshState2.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f96770e.setText(this.f96699w);
                return;
            case 5:
                this.f96770e.setText(this.f96698v);
                imageView.animate().rotation(0.0f);
                return;
            case 6:
                this.f96770e.setText(this.f96700x);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f96770e.setText(this.f96697u);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.f
    public boolean setNoMoreData(boolean z10) {
        if (this.B == z10) {
            return true;
        }
        this.B = z10;
        ImageView imageView = this.f96771f;
        if (z10) {
            this.f96770e.setText(this.A);
            imageView.setVisibility(8);
            return true;
        }
        this.f96770e.setText(this.f96697u);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    @Deprecated
    public void setPrimaryColors(@l int... iArr) {
        if (this.f96765c == og.b.f132312f) {
            super.setPrimaryColors(iArr);
        }
    }
}
