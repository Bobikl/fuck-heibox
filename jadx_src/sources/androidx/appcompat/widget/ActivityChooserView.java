package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements androidx.appcompat.widget.b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final f f2359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f2360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f2361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Drawable f2362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final FrameLayout f2363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImageView f2364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final FrameLayout f2365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageView f2366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f2367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    androidx.core.view.b f2368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final DataSetObserver f2369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f2370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListPopupWindow f2371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    PopupWindow.OnDismissListener f2372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f2373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f2374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2376s;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f2377b = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            x0 x0VarF = x0.F(context, attributeSet, f2377b);
            setBackgroundDrawable(x0VarF.h(0));
            x0VarF.I();
        }
    }

    public class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f2359b.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f2359b.notifyDataSetInvalidated();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                androidx.core.view.b bVar = ActivityChooserView.this.f2368k;
                if (bVar != null) {
                    bVar.m(true);
                }
            }
        }
    }

    public class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            androidx.core.view.accessibility.a0.g2(accessibilityNodeInfo).Y0(true);
        }
    }

    public class d extends f0 {
        d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.f0
        public androidx.appcompat.view.menu.p b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.f0
        protected boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.f0
        protected boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    public class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    public class f extends BaseAdapter {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f2383h = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f2384i = 4;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f2385j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f2386k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f2387l = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.appcompat.widget.b f2388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2389c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f2392f;

        f() {
        }

        public int a() {
            return this.f2388b.f();
        }

        public androidx.appcompat.widget.b b() {
            return this.f2388b;
        }

        public ResolveInfo c() {
            return this.f2388b.h();
        }

        public int d() {
            return this.f2388b.j();
        }

        public boolean e() {
            return this.f2390d;
        }

        public int f() {
            int i10 = this.f2389c;
            this.f2389c = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i11 = 0; i11 < count; i11++) {
                view = getView(i11, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f2389c = i10;
            return iMax;
        }

        public void g(androidx.appcompat.widget.b bVar) {
            androidx.appcompat.widget.b bVarB = ActivityChooserView.this.f2359b.b();
            if (bVarB != null && ActivityChooserView.this.isShown()) {
                bVarB.unregisterObserver(ActivityChooserView.this.f2369l);
            }
            this.f2388b = bVar;
            if (bVar != null && ActivityChooserView.this.isShown()) {
                bVar.registerObserver(ActivityChooserView.this.f2369l);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iF = this.f2388b.f();
            if (!this.f2390d && this.f2388b.h() != null) {
                iF--;
            }
            int iMin = Math.min(iF, this.f2389c);
            return this.f2392f ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f2390d && this.f2388b.h() != null) {
                i10++;
            }
            return this.f2388b.e(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return (this.f2392f && i10 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(androidx.appcompat.R.id.title)).setText(ActivityChooserView.this.getContext().getString(androidx.appcompat.R.string.abc_activity_chooser_view_see_all));
                return viewInflate;
            }
            if (view == null || view.getId() != androidx.appcompat.R.id.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(androidx.appcompat.R.id.icon);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(androidx.appcompat.R.id.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f2390d && i10 == 0 && this.f2391e) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i10) {
            if (this.f2389c != i10) {
                this.f2389c = i10;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z10, boolean z11) {
            if (this.f2390d == z10 && this.f2391e == z11) {
                return;
            }
            this.f2390d = z10;
            this.f2391e = z11;
            notifyDataSetChanged();
        }

        public void j(boolean z10) {
            if (this.f2392f != z10) {
                this.f2392f = z10;
                notifyDataSetChanged();
            }
        }
    }

    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f2372o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f2365h) {
                if (view != activityChooserView.f2363f) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f2373p = false;
                activityChooserView.d(activityChooserView.f2374q);
                return;
            }
            activityChooserView.a();
            Intent intentB = ActivityChooserView.this.f2359b.b().b(ActivityChooserView.this.f2359b.b().g(ActivityChooserView.this.f2359b.c()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            androidx.core.view.b bVar = ActivityChooserView.this.f2368k;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f2373p) {
                if (i10 > 0) {
                    activityChooserView.f2359b.b().r(i10);
                    return;
                }
                return;
            }
            if (!activityChooserView.f2359b.e()) {
                i10++;
            }
            Intent intentB = ActivityChooserView.this.f2359b.b().b(i10);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f2365h) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f2359b.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f2373p = true;
                activityChooserView2.d(activityChooserView2.f2374q);
            }
            return true;
        }
    }

    public ActivityChooserView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public ActivityChooserView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2369l = new a();
        this.f2370m = new b();
        this.f2374q = 4;
        int[] iArr = androidx.appcompat.R.styleable.f1573f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        j1.z1(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        this.f2374q = typedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        g gVar = new g();
        this.f2360c = gVar;
        View viewFindViewById = findViewById(androidx.appcompat.R.id.activity_chooser_view_content);
        this.f2361d = viewFindViewById;
        this.f2362e = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(androidx.appcompat.R.id.default_activity_button);
        this.f2365h = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i11 = androidx.appcompat.R.id.image;
        this.f2366i = (ImageView) frameLayout.findViewById(i11);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(androidx.appcompat.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f2363f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i11);
        this.f2364g = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f2359b = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f2367j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_config_prefDialogWidth));
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f2370m);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().b();
    }

    public boolean c() {
        if (b() || !this.f2375r) {
            return false;
        }
        this.f2373p = false;
        d(this.f2374q);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void d(int i10) {
        if (this.f2359b.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f2370m);
        ?? r10 = this.f2365h.getVisibility() == 0 ? 1 : 0;
        int iA = this.f2359b.a();
        if (i10 == Integer.MAX_VALUE || iA <= i10 + r10) {
            this.f2359b.j(false);
            this.f2359b.h(i10);
        } else {
            this.f2359b.j(true);
            this.f2359b.h(i10 - 1);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.b()) {
            return;
        }
        if (this.f2373p || r10 == 0) {
            this.f2359b.i(true, r10);
        } else {
            this.f2359b.i(false, false);
        }
        listPopupWindow.T(Math.min(this.f2359b.f(), this.f2367j));
        listPopupWindow.show();
        androidx.core.view.b bVar = this.f2368k;
        if (bVar != null) {
            bVar.m(true);
        }
        listPopupWindow.j().setContentDescription(getContext().getString(androidx.appcompat.R.string.abc_activitychooserview_choose_application));
        listPopupWindow.j().setSelector(new ColorDrawable(0));
    }

    void e() {
        if (this.f2359b.getCount() > 0) {
            this.f2363f.setEnabled(true);
        } else {
            this.f2363f.setEnabled(false);
        }
        int iA = this.f2359b.a();
        int iD = this.f2359b.d();
        if (iA == 1 || (iA > 1 && iD > 0)) {
            this.f2365h.setVisibility(0);
            ResolveInfo resolveInfoC = this.f2359b.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f2366i.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.f2376s != 0) {
                this.f2365h.setContentDescription(getContext().getString(this.f2376s, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.f2365h.setVisibility(8);
        }
        if (this.f2365h.getVisibility() == 0) {
            this.f2361d.setBackgroundDrawable(this.f2362e);
        } else {
            this.f2361d.setBackgroundDrawable(null);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public androidx.appcompat.widget.b getDataModel() {
        return this.f2359b.b();
    }

    ListPopupWindow getListPopupWindow() {
        if (this.f2371n == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f2371n = listPopupWindow;
            listPopupWindow.p(this.f2359b);
            this.f2371n.R(this);
            this.f2371n.c0(true);
            this.f2371n.e0(this.f2360c);
            this.f2371n.d0(this.f2360c);
        }
        return this.f2371n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.b bVarB = this.f2359b.b();
        if (bVarB != null) {
            bVarB.registerObserver(this.f2369l);
        }
        this.f2375r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.b bVarB = this.f2359b.b();
        if (bVarB != null) {
            bVarB.unregisterObserver(this.f2369l);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2370m);
        }
        if (b()) {
            a();
        }
        this.f2375r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f2361d.layout(0, 0, i12 - i10, i13 - i11);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        View view = this.f2361d;
        if (this.f2365h.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.b.a
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.b bVar) {
        this.f2359b.g(bVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.f2376s = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f2364g.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2364g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.f2374q = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f2372o = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(androidx.core.view.b bVar) {
        this.f2368k = bVar;
    }
}
