package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.o;
import androidx.core.view.j1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import androidx.lifecycle.y;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: AbstractListDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nAbstractListDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,239:1\n232#2,3:240\n1#3:243\n28#4,12:244\n65#5,4:256\n37#5:260\n53#5:261\n71#5,2:262\n*S KotlinDebug\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n*L\n100#1:240,3\n157#1:244,12\n164#1:256,4\n164#1:260\n164#1:261\n164#1:262,2\n*E\n"})
public abstract class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private o f25127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private NavHostFragment f25128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25129d;

    /* JADX INFO: renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractListDetailFragment.kt */
    public static final class C0191a extends o implements SlidingPaneLayout.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final SlidingPaneLayout f25130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0191a(@dl.d SlidingPaneLayout slidingPaneLayout) {
            super(true);
            f0.p(slidingPaneLayout, "slidingPaneLayout");
            this.f25130a = slidingPaneLayout;
            slidingPaneLayout.a(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void a(@dl.d View panel) {
            f0.p(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void b(@dl.d View panel) {
            f0.p(panel, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void c(@dl.d View panel, float f10) {
            f0.p(panel, "panel");
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            this.f25130a.d();
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n*L\n1#1,384:1\n69#2:385\n70#2:389\n165#3,3:386\n*E\n"})
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SlidingPaneLayout f25132c;

        public b(SlidingPaneLayout slidingPaneLayout) {
            this.f25132c = slidingPaneLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@dl.d View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            f0.q(view, "view");
            view.removeOnLayoutChangeListener(this);
            o oVar = a.this.f25127b;
            f0.m(oVar);
            oVar.setEnabled(this.f25132c.o() && this.f25132c.isOpen());
        }
    }

    @dl.d
    public final NavHostFragment M3() {
        NavHostFragment navHostFragment = this.f25128c;
        if (navHostFragment != null) {
            f0.n(navHostFragment, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            return navHostFragment;
        }
        throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
    }

    @dl.d
    public final SlidingPaneLayout N3() {
        View viewRequireView = requireView();
        f0.n(viewRequireView, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout");
        return (SlidingPaneLayout) viewRequireView;
    }

    @dl.d
    public NavHostFragment O3() {
        int i10 = this.f25129d;
        return i10 != 0 ? NavHostFragment.a.c(NavHostFragment.f25114f, i10, null, 2, null) : new NavHostFragment();
    }

    @dl.d
    public abstract View P3(@dl.d LayoutInflater layoutInflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle);

    public void Q3(@dl.d View view, @dl.e Bundle bundle) {
        f0.p(view, "view");
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    @dl.d
    public final View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        NavHostFragment navHostFragmentO3;
        f0.p(inflater, "inflater");
        if (bundle != null) {
            this.f25129d = bundle.getInt(NavHostFragment.f25115g);
        }
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(R.id.sliding_pane_layout);
        View viewP3 = P3(inflater, slidingPaneLayout, bundle);
        if (!f0.g(viewP3, slidingPaneLayout) && !f0.g(viewP3.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewP3);
        }
        Context context = inflater.getContext();
        f0.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i10 = R.id.sliding_pane_detail_container;
        fragmentContainerView.setId(i10);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(inflater.getContext().getResources().getDimensionPixelSize(R.dimen.sliding_pane_detail_pane_width), -1);
        layoutParams.f27443a = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        Fragment fragmentR0 = getChildFragmentManager().r0(i10);
        if (fragmentR0 != null) {
            navHostFragmentO3 = (NavHostFragment) fragmentR0;
        } else {
            navHostFragmentO3 = O3();
            FragmentManager childFragmentManager = getChildFragmentManager();
            f0.o(childFragmentManager, "childFragmentManager");
            p0 p0VarU = childFragmentManager.u();
            f0.o(p0VarU, "beginTransaction()");
            p0VarU.M(true);
            p0VarU.b(i10, navHostFragmentO3);
            p0VarU.m();
        }
        this.f25128c = navHostFragmentO3;
        this.f25127b = new C0191a(slidingPaneLayout);
        if (!j1.U0(slidingPaneLayout) || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new b(slidingPaneLayout));
        } else {
            o oVar = this.f25127b;
            f0.m(oVar);
            oVar.setEnabled(slidingPaneLayout.o() && slidingPaneLayout.isOpen());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        y viewLifecycleOwner = getViewLifecycleOwner();
        f0.o(viewLifecycleOwner, "viewLifecycleOwner");
        o oVar2 = this.f25127b;
        f0.m(oVar2);
        onBackPressedDispatcher.c(viewLifecycleOwner, oVar2);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onInflate(@dl.d Context context, @dl.d AttributeSet attrs, @dl.e Bundle bundle) {
        f0.p(context, "context");
        f0.p(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.navigation.R.styleable.f24955b);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f25129d = resourceId;
        }
        b2 b2Var = b2.f124493a;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onSaveInstanceState(@dl.d Bundle outState) {
        f0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        int i10 = this.f25129d;
        if (i10 != 0) {
            outState.putInt(NavHostFragment.f25115g, i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public final void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View listPaneView = N3().getChildAt(0);
        f0.o(listPaneView, "listPaneView");
        Q3(listPaneView, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onViewStateRestored(@dl.e Bundle bundle) {
        super.onViewStateRestored(bundle);
        o oVar = this.f25127b;
        f0.m(oVar);
        oVar.setEnabled(N3().o() && N3().isOpen());
    }
}
