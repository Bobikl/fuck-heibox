package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LayoutInflater f50667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckedTextView f50668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CheckedTextView f50669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f50670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<com.google.android.exoplayer2.trackselection.f.C0399f> f50671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v0 f50674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CheckedTextView[][] f50675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.exoplayer2.trackselection.l.a f50676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p1 f50678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f50679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private Comparator<c> f50680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private d f50681q;

    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.g(view);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a2 f50685c;

        public c(int i10, int i11, a2 a2Var) {
            this.f50683a = i10;
            this.f50684b = i11;
            this.f50685c = a2Var;
        }
    }

    public interface d {
        void a(boolean z10, List<com.google.android.exoplayer2.trackselection.f.C0399f> list);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public TrackSelectionView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.f50671g = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f50666b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f50667c = layoutInflaterFrom;
        b bVar = new b();
        this.f50670f = bVar;
        this.f50674j = new i(getResources());
        this.f50678n = p1.f48606e;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f50668d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f50669e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    private static int[] c(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i10;
        return iArrCopyOf;
    }

    private static int[] d(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != i10) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(Comparator comparator, c cVar, c cVar2) {
        return comparator.compare(cVar.f50685c, cVar2.f50685c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(View view) {
        if (view == this.f50668d) {
            i();
        } else if (view == this.f50669e) {
            h();
        } else {
            j(view);
        }
        m();
        d dVar = this.f50681q;
        if (dVar != null) {
            dVar.a(getIsDisabled(), getOverrides());
        }
    }

    private void h() {
        this.f50679o = false;
        this.f50671g.clear();
    }

    private void i() {
        this.f50679o = true;
        this.f50671g.clear();
    }

    private void j(View view) {
        this.f50679o = false;
        c cVar = (c) com.google.android.exoplayer2.util.a.g(view.getTag());
        int i10 = cVar.f50683a;
        int i11 = cVar.f50684b;
        com.google.android.exoplayer2.trackselection.f.C0399f c0399f = this.f50671g.get(i10);
        com.google.android.exoplayer2.util.a.g(this.f50676l);
        if (c0399f == null) {
            if (!this.f50673i && this.f50671g.size() > 0) {
                this.f50671g.clear();
            }
            this.f50671g.put(i10, new com.google.android.exoplayer2.trackselection.f.C0399f(i10, i11));
            return;
        }
        int i12 = c0399f.f50084d;
        int[] iArr = c0399f.f50083c;
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zK = k(i10);
        boolean z10 = zK || l();
        if (zIsChecked && z10) {
            if (i12 == 1) {
                this.f50671g.remove(i10);
                return;
            } else {
                this.f50671g.put(i10, new com.google.android.exoplayer2.trackselection.f.C0399f(i10, d(iArr, i11)));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zK) {
            this.f50671g.put(i10, new com.google.android.exoplayer2.trackselection.f.C0399f(i10, c(iArr, i11)));
        } else {
            this.f50671g.put(i10, new com.google.android.exoplayer2.trackselection.f.C0399f(i10, i11));
        }
    }

    @mk.m({"mappedTrackInfo"})
    private boolean k(int i10) {
        return this.f50672h && this.f50678n.c(i10).f48599b > 1 && this.f50676l.a(this.f50677m, i10, false) != 0;
    }

    private boolean l() {
        return this.f50673i && this.f50678n.f48609b > 1;
    }

    private void m() {
        this.f50668d.setChecked(this.f50679o);
        this.f50669e.setChecked(!this.f50679o && this.f50671g.size() == 0);
        for (int i10 = 0; i10 < this.f50675k.length; i10++) {
            com.google.android.exoplayer2.trackselection.f.C0399f c0399f = this.f50671g.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f50675k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (c0399f != null) {
                        this.f50675k[i10][i11].setChecked(c0399f.c(((c) com.google.android.exoplayer2.util.a.g(checkedTextViewArr[i11].getTag())).f50684b));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void n() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f50676l == null) {
            this.f50668d.setEnabled(false);
            this.f50669e.setEnabled(false);
            return;
        }
        this.f50668d.setEnabled(true);
        this.f50669e.setEnabled(true);
        p1 p1VarG = this.f50676l.g(this.f50677m);
        this.f50678n = p1VarG;
        this.f50675k = new CheckedTextView[p1VarG.f48609b][];
        boolean zL = l();
        int i10 = 0;
        while (true) {
            p1 p1Var = this.f50678n;
            if (i10 >= p1Var.f48609b) {
                m();
                return;
            }
            n1 n1VarC = p1Var.c(i10);
            boolean zK = k(i10);
            CheckedTextView[][] checkedTextViewArr = this.f50675k;
            int i11 = n1VarC.f48599b;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < n1VarC.f48599b; i12++) {
                cVarArr[i12] = new c(i10, i12, n1VarC.c(i12));
            }
            Comparator<c> comparator = this.f50680p;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f50667c.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f50667c.inflate((zK || zL) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f50666b);
                checkedTextView.setText(this.f50674j.a(cVarArr[i13].f50685c));
                checkedTextView.setTag(cVarArr[i13]);
                if (this.f50676l.h(this.f50677m, i10, i13) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f50670f);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f50675k[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
            i10++;
        }
    }

    public void e(com.google.android.exoplayer2.trackselection.l.a aVar, int i10, boolean z10, List<com.google.android.exoplayer2.trackselection.f.C0399f> list, @androidx.annotation.p0 final Comparator<a2> comparator, @androidx.annotation.p0 d dVar) {
        this.f50676l = aVar;
        this.f50677m = i10;
        this.f50679o = z10;
        this.f50680p = comparator == null ? null : new Comparator() { // from class: com.google.android.exoplayer2.ui.z0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TrackSelectionView.f(comparator, (TrackSelectionView.c) obj, (TrackSelectionView.c) obj2);
            }
        };
        this.f50681q = dVar;
        int size = this.f50673i ? list.size() : Math.min(list.size(), 1);
        for (int i11 = 0; i11 < size; i11++) {
            com.google.android.exoplayer2.trackselection.f.C0399f c0399f = list.get(i11);
            this.f50671g.put(c0399f.f50082b, c0399f);
        }
        n();
    }

    public boolean getIsDisabled() {
        return this.f50679o;
    }

    public List<com.google.android.exoplayer2.trackselection.f.C0399f> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f50671g.size());
        for (int i10 = 0; i10 < this.f50671g.size(); i10++) {
            arrayList.add(this.f50671g.valueAt(i10));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f50672h != z10) {
            this.f50672h = z10;
            n();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f50673i != z10) {
            this.f50673i = z10;
            if (!z10 && this.f50671g.size() > 1) {
                for (int size = this.f50671g.size() - 1; size > 0; size--) {
                    this.f50671g.remove(size);
                }
            }
            n();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f50668d.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(v0 v0Var) {
        this.f50674j = (v0) com.google.android.exoplayer2.util.a.g(v0Var);
        n();
    }
}
