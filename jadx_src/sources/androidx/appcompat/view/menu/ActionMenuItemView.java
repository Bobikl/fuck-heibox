package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.f0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f2058m = "ActionMenuItemView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f2059n = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f2060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f2061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f2062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g.b f2063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f0 f2064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    b f2065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2070l;

    public class a extends f0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.f0
        public p b() {
            b bVar = ActionMenuItemView.this.f2065g;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.f0
        protected boolean c() {
            p pVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f2063e;
            return bVar != null && bVar.b(actionMenuItemView.f2060b) && (pVarB = b()) != null && pVarB.b();
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f2066h = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f1570c, i10, 0);
        this.f2068j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2070l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2069k = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f2061c);
        if (this.f2062d != null && (!this.f2060b.E() || (!this.f2066h && !this.f2067i))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f2061c : null);
        CharSequence contentDescription = this.f2060b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f2060b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2060b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            b1.a(this, z12 ? null : this.f2060b.getTitle());
        } else {
            b1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f2060b.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void d(j jVar, int i10) {
        this.f2060b = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.l(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f2064f == null) {
            this.f2064f = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean e() {
        return true;
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public j getItemData() {
        return this.f2060b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f2063e;
        if (bVar != null) {
            bVar.b(this.f2060b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2066h = g();
        h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zF = f();
        if (zF && (i12 = this.f2069k) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f2068j) : this.f2068j;
        if (mode != 1073741824 && this.f2068j > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zF || this.f2062d == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2062d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        if (this.f2060b.hasSubMenu() && (f0Var = this.f2064f) != null && f0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setCheckable(boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f2067i != z10) {
            this.f2067i = z10;
            j jVar = this.f2060b;
            if (jVar != null) {
                jVar.e();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setIcon(Drawable drawable) {
        this.f2062d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f2070l;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(g.b bVar) {
        this.f2063e = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f2069k = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f2065g = bVar;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setShortcut(boolean z10, char c10) {
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setTitle(CharSequence charSequence) {
        this.f2061c = charSequence;
        h();
    }
}
