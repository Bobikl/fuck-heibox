package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: ListFragment.java */
/* JADX INFO: loaded from: classes6.dex */
public class v0 extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f23868m = 16711681;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f23869n = 16711682;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f23870o = 16711683;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f23871b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f23872c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f23873d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ListAdapter f23874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ListView f23875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    View f23876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    TextView f23877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f23878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    View f23879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    CharSequence f23880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f23881l;

    /* JADX INFO: compiled from: ListFragment.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = v0.this.f23875f;
            listView.focusableViewAvailable(listView);
        }
    }

    /* JADX INFO: compiled from: ListFragment.java */
    public class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            v0.this.Q3((ListView) adapterView, view, i10, j10);
        }
    }

    private void L3() {
        if (this.f23875f != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f23875f = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f23868m);
            this.f23877h = textView;
            if (textView == null) {
                this.f23876g = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f23878i = view.findViewById(f23869n);
            this.f23879j = view.findViewById(f23870o);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f23875f = listView;
            View view2 = this.f23876g;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f23880k;
                if (charSequence != null) {
                    this.f23877h.setText(charSequence);
                    this.f23875f.setEmptyView(this.f23877h);
                }
            }
        }
        this.f23881l = true;
        this.f23875f.setOnItemClickListener(this.f23873d);
        ListAdapter listAdapter = this.f23874e;
        if (listAdapter != null) {
            this.f23874e = null;
            T3(listAdapter);
        } else if (this.f23878i != null) {
            V3(false, false);
        }
        this.f23871b.post(this.f23872c);
    }

    private void V3(boolean z10, boolean z11) {
        L3();
        View view = this.f23878i;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f23881l == z10) {
            return;
        }
        this.f23881l = z10;
        if (z10) {
            if (z11) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f23879j.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f23879j.clearAnimation();
            }
            this.f23878i.setVisibility(8);
            this.f23879j.setVisibility(0);
            return;
        }
        if (z11) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f23879j.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f23879j.clearAnimation();
        }
        this.f23878i.setVisibility(0);
        this.f23879j.setVisibility(8);
    }

    @androidx.annotation.p0
    public ListAdapter M3() {
        return this.f23874e;
    }

    @androidx.annotation.n0
    public ListView N3() {
        L3();
        return this.f23875f;
    }

    public long O3() {
        L3();
        return this.f23875f.getSelectedItemId();
    }

    public int P3() {
        L3();
        return this.f23875f.getSelectedItemPosition();
    }

    public void Q3(@androidx.annotation.n0 ListView listView, @androidx.annotation.n0 View view, int i10, long j10) {
    }

    @androidx.annotation.n0
    public final ListAdapter R3() {
        ListAdapter listAdapterM3 = M3();
        if (listAdapterM3 != null) {
            return listAdapterM3;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void S3(@androidx.annotation.p0 CharSequence charSequence) {
        L3();
        TextView textView = this.f23877h;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f23880k == null) {
            this.f23875f.setEmptyView(this.f23877h);
        }
        this.f23880k = charSequence;
    }

    public void T3(@androidx.annotation.p0 ListAdapter listAdapter) {
        boolean z10 = this.f23874e != null;
        this.f23874e = listAdapter;
        ListView listView = this.f23875f;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f23881l || z10) {
                return;
            }
            V3(true, requireView().getWindowToken() != null);
        }
    }

    public void U3(boolean z10) {
        V3(z10, true);
    }

    public void W3(boolean z10) {
        V3(z10, false);
    }

    public void X3(int i10) {
        L3();
        this.f23875f.setSelection(i10);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.p0
    public View onCreateView(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(f23869n);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(f23870o);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(f23868m);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f23871b.removeCallbacks(this.f23872c);
        this.f23875f = null;
        this.f23881l = false;
        this.f23879j = null;
        this.f23878i = null;
        this.f23876g = null;
        this.f23877h = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.n0 View view, @androidx.annotation.p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        L3();
    }
}
