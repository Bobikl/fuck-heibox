package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.widget.x0;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f2075s = "ListMenuItemView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f2076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f2077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RadioButton f2078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f2079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CheckBox f2080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f2081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f2082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f2083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LinearLayout f2084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f2085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f2087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f2089o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LayoutInflater f2091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2092r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        x0 x0VarG = x0.G(getContext(), attributeSet, R.styleable.f1590w, i10, 0);
        this.f2085k = x0VarG.h(R.styleable.MenuView_android_itemBackground);
        this.f2086l = x0VarG.u(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f2088n = x0VarG.a(R.styleable.MenuView_preserveIconSpacing, false);
        this.f2087m = context;
        this.f2089o = x0VarG.h(R.styleable.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f2090p = typedArrayObtainStyledAttributes.hasValue(0);
        x0VarG.I();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f2084j;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void f() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f2080f = checkBox;
        a(checkBox);
    }

    private void g() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f2077c = imageView;
        b(imageView, 0);
    }

    private LayoutInflater getInflater() {
        if (this.f2091q == null) {
            this.f2091q = LayoutInflater.from(getContext());
        }
        return this.f2091q;
    }

    private void h() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f2078d = radioButton;
        a(radioButton);
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f2082h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2083i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2083i.getLayoutParams();
        rect.top += this.f2083i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void d(j jVar, int i10) {
        this.f2076b = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.l(this));
        setCheckable(jVar.isCheckable());
        setShortcut(jVar.D(), jVar.j());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean e() {
        return this.f2092r;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public j getItemData() {
        return this.f2076b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        j1.I1(this, this.f2085k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f2079e = textView;
        int i10 = this.f2086l;
        if (i10 != -1) {
            textView.setTextAppearance(this.f2087m, i10);
        }
        this.f2081g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f2082h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2089o);
        }
        this.f2083i = (ImageView) findViewById(R.id.group_divider);
        this.f2084j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2077c != null && this.f2088n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2077c.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f2078d == null && this.f2080f == null) {
            return;
        }
        if (this.f2076b.p()) {
            if (this.f2078d == null) {
                h();
            }
            compoundButton = this.f2078d;
            view = this.f2080f;
        } else {
            if (this.f2080f == null) {
                f();
            }
            compoundButton = this.f2080f;
            view = this.f2078d;
        }
        if (z10) {
            compoundButton.setChecked(this.f2076b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f2080f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f2078d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f2076b.p()) {
            if (this.f2078d == null) {
                h();
            }
            compoundButton = this.f2078d;
        } else {
            if (this.f2080f == null) {
                f();
            }
            compoundButton = this.f2080f;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f2092r = z10;
        this.f2088n = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f2083i;
        if (imageView != null) {
            imageView.setVisibility((this.f2090p || !z10) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setIcon(Drawable drawable) {
        boolean z10 = this.f2076b.C() || this.f2092r;
        if (z10 || this.f2088n) {
            ImageView imageView = this.f2077c;
            if (imageView == null && drawable == null && !this.f2088n) {
                return;
            }
            if (imageView == null) {
                g();
            }
            if (drawable == null && !this.f2088n) {
                this.f2077c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f2077c;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f2077c.getVisibility() != 0) {
                this.f2077c.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setShortcut(boolean z10, char c10) {
        int i10 = (z10 && this.f2076b.D()) ? 0 : 8;
        if (i10 == 0) {
            this.f2081g.setText(this.f2076b.k());
        }
        if (this.f2081g.getVisibility() != i10) {
            this.f2081g.setVisibility(i10);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2079e.getVisibility() != 8) {
                this.f2079e.setVisibility(8);
            }
        } else {
            this.f2079e.setText(charSequence);
            if (this.f2079e.getVisibility() != 0) {
                this.f2079e.setVisibility(0);
            }
        }
    }
}
