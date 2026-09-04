package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.b implements androidx.core.view.b.a {
    private static final String F = "ActionMenuPresenter";
    a A;
    c B;
    private b C;
    final e D;
    int E;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    OverflowMenuButton f2327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f2328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2335t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2336u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2337v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f2338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f2339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final SparseBooleanArray f2340y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    d f2341z;

    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.a {

        public class a extends f0 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f2343k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f2343k = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.f0
            public androidx.appcompat.view.menu.p b() {
                d dVar = ActionMenuPresenter.this.f2341z;
                if (dVar == null) {
                    return null;
                }
                return dVar.e();
            }

            @Override // androidx.appcompat.widget.f0
            public boolean c() {
                ActionMenuPresenter.this.Q();
                return true;
            }

            @Override // androidx.appcompat.widget.f0
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.B != null) {
                    return false;
                }
                actionMenuPresenter.E();
                return true;
            }
        }

        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            b1.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.Q();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.d.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2345b;

        public class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2345b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2345b);
        }
    }

    public class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, R.attr.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.j) rVar.getItem()).o()) {
                View view2 = ActionMenuPresenter.this.f2327l;
                h(view2 == null ? (View) ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f2128j : view2);
            }
            a(ActionMenuPresenter.this.D);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void g() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.A = null;
            actionMenuPresenter.E = 0;
            super.g();
        }
    }

    public class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = ActionMenuPresenter.this.A;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f2348b;

        public c(d dVar) {
            this.f2348b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f2122d != null) {
                ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f2122d.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f2128j;
            if (view != null && view.getWindowToken() != null && this.f2348b.o()) {
                ActionMenuPresenter.this.f2341z = this.f2348b;
            }
            ActionMenuPresenter.this.B = null;
        }
    }

    public class d extends androidx.appcompat.view.menu.l {
        public d(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z10) {
            super(context, gVar, view, z10, R.attr.actionOverflowMenuStyle);
            j(androidx.core.view.n.f21702c);
            a(ActionMenuPresenter.this.D);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void g() {
            if (((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f2122d != null) {
                ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f2122d.close();
            }
            ActionMenuPresenter.this.f2341z = null;
            super.g();
        }
    }

    public class e implements androidx.appcompat.view.menu.m.a {
        e() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.G().f(false);
            }
            androidx.appcompat.view.menu.m.a aVarQ = ActionMenuPresenter.this.q();
            if (aVarQ != null) {
                aVarQ.a(gVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f2122d) {
                return false;
            }
            ActionMenuPresenter.this.E = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            androidx.appcompat.view.menu.m.a aVarQ = ActionMenuPresenter.this.q();
            if (aVarQ != null) {
                return aVarQ.b(gVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f2340y = new SparseBooleanArray();
        this.D = new e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2128j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof androidx.appcompat.view.menu.n.a) && ((androidx.appcompat.view.menu.n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        OverflowMenuButton overflowMenuButton = this.f2327l;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.f2329n) {
            return this.f2328m;
        }
        return null;
    }

    public boolean E() {
        Object obj;
        c cVar = this.B;
        if (cVar != null && (obj = this.f2128j) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.B = null;
            return true;
        }
        d dVar = this.f2341z;
        if (dVar == null) {
            return false;
        }
        dVar.dismiss();
        return true;
    }

    public boolean F() {
        a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    public boolean G() {
        return this.B != null || H();
    }

    public boolean H() {
        d dVar = this.f2341z;
        return dVar != null && dVar.f();
    }

    public boolean I() {
        return this.f2330o;
    }

    public void J(Configuration configuration) {
        if (!this.f2335t) {
            this.f2334s = androidx.appcompat.view.a.b(this.f2121c).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f2122d;
        if (gVar != null) {
            gVar.N(true);
        }
    }

    public void K(boolean z10) {
        this.f2338w = z10;
    }

    public void L(int i10) {
        this.f2334s = i10;
        this.f2335t = true;
    }

    public void M(ActionMenuView actionMenuView) {
        this.f2128j = actionMenuView;
        actionMenuView.a(this.f2122d);
    }

    public void N(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.f2327l;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            this.f2329n = true;
            this.f2328m = drawable;
        }
    }

    public void O(boolean z10) {
        this.f2330o = z10;
        this.f2331p = true;
    }

    public void P(int i10, boolean z10) {
        this.f2332q = i10;
        this.f2336u = z10;
        this.f2337v = true;
    }

    public boolean Q() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f2330o || H() || (gVar = this.f2122d) == null || this.f2128j == null || this.B != null || gVar.C().isEmpty()) {
            return false;
        }
        c cVar = new c(new d(this.f2121c, this.f2122d, this.f2327l, true));
        this.B = cVar;
        ((View) this.f2128j).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        B();
        super.a(gVar, z10);
    }

    @Override // androidx.core.view.b.a
    public void b(boolean z10) {
        if (z10) {
            super.l(null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.f2122d;
        if (gVar != null) {
            gVar.f(false);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable d() {
        SavedState savedState = new SavedState();
        savedState.f2345b = this.E;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        super.e(z10);
        ((View) this.f2128j).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f2122d;
        boolean z11 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.j> arrayListV = gVar.v();
            int size = arrayListV.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b bVarA = arrayListV.get(i10).a();
                if (bVarA != null) {
                    bVarA.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f2122d;
        ArrayList<androidx.appcompat.view.menu.j> arrayListC = gVar2 != null ? gVar2.C() : null;
        if (this.f2330o && arrayListC != null) {
            int size2 = arrayListC.size();
            if (size2 == 1) {
                z11 = !arrayListC.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f2327l == null) {
                this.f2327l = new OverflowMenuButton(this.f2120b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2327l.getParent();
            if (viewGroup != this.f2128j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2327l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2128j;
                actionMenuView.addView(this.f2327l, actionMenuView.G());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.f2327l;
            if (overflowMenuButton != null) {
                Object parent = overflowMenuButton.getParent();
                Object obj = this.f2128j;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2327l);
                }
            }
        }
        ((ActionMenuView) this.f2128j).setOverflowReserved(this.f2330o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.j] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean f() {
        ArrayList<androidx.appcompat.view.menu.j> arrayListH;
        int size;
        int i10;
        int iM;
        ?? r10;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.g gVar = actionMenuPresenter.f2122d;
        View view = null;
        ?? r11 = 0;
        if (gVar != null) {
            arrayListH = gVar.H();
            size = arrayListH.size();
        } else {
            arrayListH = null;
            size = 0;
        }
        int i11 = actionMenuPresenter.f2334s;
        int i12 = actionMenuPresenter.f2333r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f2128j;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.appcompat.view.menu.j jVar = arrayListH.get(i15);
            if (jVar.b()) {
                i13++;
            } else if (jVar.q()) {
                i14++;
            } else {
                z10 = true;
            }
            if (actionMenuPresenter.f2338w && jVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (actionMenuPresenter.f2330o && (z10 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f2340y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f2336u) {
            int i17 = actionMenuPresenter.f2339x;
            iM = i12 / i17;
            i10 = i17 + ((i12 % i17) / iM);
        } else {
            i10 = 0;
            iM = 0;
        }
        int i18 = 0;
        int i19 = 0;
        ?? r12 = actionMenuPresenter;
        while (i18 < size) {
            androidx.appcompat.view.menu.j jVar2 = arrayListH.get(i18);
            if (jVar2.b()) {
                View viewR = r12.r(jVar2, view, viewGroup);
                if (r12.f2336u) {
                    iM -= ActionMenuView.M(viewR, i10, iM, iMakeMeasureSpec, r11);
                } else {
                    viewR.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewR.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.x(true);
                r10 = r11;
            } else if (jVar2.q()) {
                int groupId2 = jVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i16 > 0 || z11) && i12 > 0 && (!r12.f2336u || iM > 0);
                boolean z13 = z12;
                if (z12) {
                    View viewR2 = r12.r(jVar2, null, viewGroup);
                    if (r12.f2336u) {
                        int iM2 = ActionMenuView.M(viewR2, i10, iM, iMakeMeasureSpec, 0);
                        iM -= iM2;
                        if (iM2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewR2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewR2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z12 = z14 & (!r12.f2336u ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.j jVar3 = arrayListH.get(i20);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.o()) {
                                i16++;
                            }
                            jVar3.x(false);
                        }
                    }
                }
                if (z12) {
                    i16--;
                }
                jVar2.x(z12);
                r10 = 0;
            } else {
                r10 = r11;
                jVar2.x(r10);
            }
            i18++;
            r11 = r10;
            size = size;
            view = null;
            r12 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void h(@androidx.annotation.n0 Context context, @androidx.annotation.p0 androidx.appcompat.view.menu.g gVar) {
        super.h(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f2331p) {
            this.f2330o = aVarB.h();
        }
        if (!this.f2337v) {
            this.f2332q = aVarB.c();
        }
        if (!this.f2335t) {
            this.f2334s = aVarB.d();
        }
        int measuredWidth = this.f2332q;
        if (this.f2330o) {
            if (this.f2327l == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f2120b);
                this.f2327l = overflowMenuButton;
                if (this.f2329n) {
                    overflowMenuButton.setImageDrawable(this.f2328m);
                    this.f2328m = null;
                    this.f2329n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2327l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2327l.getMeasuredWidth();
        } else {
            this.f2327l = null;
        }
        this.f2333r = measuredWidth;
        this.f2339x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f2345b) > 0 && (menuItemFindItem = this.f2122d.findItem(i10)) != null) {
            l((androidx.appcompat.view.menu.r) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean l(androidx.appcompat.view.menu.r rVar) {
        boolean z10 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.n0() != this.f2122d) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.n0();
        }
        View viewC = C(rVar2.getItem());
        if (viewC == null) {
            return false;
        }
        this.E = rVar.getItem().getItemId();
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = rVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
        }
        a aVar = new a(this.f2121c, rVar, viewC);
        this.A = aVar;
        aVar.i(z10);
        this.A.l();
        super.l(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public androidx.appcompat.view.menu.n m(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f2128j;
        androidx.appcompat.view.menu.n nVarM = super.m(viewGroup);
        if (nVar != nVarM) {
            ((ActionMenuView) nVarM).setPresenter(this);
        }
        return nVarM;
    }

    @Override // androidx.appcompat.view.menu.b
    public void n(androidx.appcompat.view.menu.j jVar, androidx.appcompat.view.menu.n.a aVar) {
        aVar.d(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2128j);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean p(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f2327l) {
            return false;
        }
        return super.p(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.b
    public View r(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.m()) {
            actionView = super.r(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean t(int i10, androidx.appcompat.view.menu.j jVar) {
        return jVar.o();
    }
}
