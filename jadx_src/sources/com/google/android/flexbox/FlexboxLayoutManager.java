package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements d, RecyclerView.SmoothScroller.ScrollVectorProvider {
    private static final String B = "FlexboxLayoutManager";
    private static final Rect C = new Rect();
    private static final boolean D = false;
    static final /* synthetic */ boolean E = false;
    private h.b A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<f> f52173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f52174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RecyclerView.Recycler f52175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RecyclerView.State f52176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f52177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f52178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private OrientationHelper f52179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private OrientationHelper f52180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SavedState f52181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f52182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f52183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f52184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f52185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f52186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private SparseArray<View> f52187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Context f52188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f52189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f52190z;

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f52191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f52192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f52193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f52194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f52195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f52196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f52197h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f52198i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f52199j;

        public static final class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f52191b = 0.0f;
            this.f52192c = 1.0f;
            this.f52193d = -1;
            this.f52194e = -1.0f;
            this.f52197h = 16777215;
            this.f52198i = 16777215;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52191b = 0.0f;
            this.f52192c = 1.0f;
            this.f52193d = -1;
            this.f52194e = -1.0f;
            this.f52197h = 16777215;
            this.f52198i = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f52191b = 0.0f;
            this.f52192c = 1.0f;
            this.f52193d = -1;
            this.f52194e = -1.0f;
            this.f52197h = 16777215;
            this.f52198i = 16777215;
            this.f52191b = parcel.readFloat();
            this.f52192c = parcel.readFloat();
            this.f52193d = parcel.readInt();
            this.f52194e = parcel.readFloat();
            this.f52195f = parcel.readInt();
            this.f52196g = parcel.readInt();
            this.f52197h = parcel.readInt();
            this.f52198i = parcel.readInt();
            this.f52199j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52191b = 0.0f;
            this.f52192c = 1.0f;
            this.f52193d = -1;
            this.f52194e = -1.0f;
            this.f52197h = 16777215;
            this.f52198i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52191b = 0.0f;
            this.f52192c = 1.0f;
            this.f52193d = -1;
            this.f52194e = -1.0f;
            this.f52197h = 16777215;
            this.f52198i = 16777215;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52191b = 0.0f;
            this.f52192c = 1.0f;
            this.f52193d = -1;
            this.f52194e = -1.0f;
            this.f52197h = 16777215;
            this.f52198i = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
            this.f52191b = 0.0f;
            this.f52192c = 1.0f;
            this.f52193d = -1;
            this.f52194e = -1.0f;
            this.f52197h = 16777215;
            this.f52198i = 16777215;
            this.f52191b = layoutParams.f52191b;
            this.f52192c = layoutParams.f52192c;
            this.f52193d = layoutParams.f52193d;
            this.f52194e = layoutParams.f52194e;
            this.f52195f = layoutParams.f52195f;
            this.f52196g = layoutParams.f52196g;
            this.f52197h = layoutParams.f52197h;
            this.f52198i = layoutParams.f52198i;
            this.f52199j = layoutParams.f52199j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int A1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void B0(int i10) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        @Override // com.google.android.flexbox.FlexItem
        public int E0() {
            return this.f52193d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void G1(int i10) {
            ((ViewGroup.MarginLayoutParams) this).height = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float H0() {
            return this.f52192c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void J(int i10) {
            this.f52198i = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int K1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int L1() {
            return this.f52196g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int R() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void R0(int i10) {
            this.f52196g = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int S1() {
            return this.f52198i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void U1(int i10) {
            this.f52193d = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void V(float f10) {
            this.f52191b = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float X0() {
            return this.f52191b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void Y(float f10) {
            this.f52194e = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float Z0() {
            return this.f52194e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean e1() {
            return this.f52199j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void g(int i10) {
            this.f52197h = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int h0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void i(boolean z10) {
            this.f52199j = z10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int m1() {
            return this.f52197h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void t0(int i10) {
            ((ViewGroup.MarginLayoutParams) this).width = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void w1(float f10) {
            this.f52192c = f10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f52191b);
            parcel.writeFloat(this.f52192c);
            parcel.writeInt(this.f52193d);
            parcel.writeFloat(this.f52194e);
            parcel.writeInt(this.f52195f);
            parcel.writeInt(this.f52196g);
            parcel.writeInt(this.f52197h);
            parcel.writeInt(this.f52198i);
            parcel.writeByte(this.f52199j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int x() {
            return this.f52195f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void z1(int i10) {
            this.f52195f = i10;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52201c;

        public static final class a implements Parcelable.Creator<SavedState> {
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

        private SavedState(Parcel parcel) {
            this.f52200b = parcel.readInt();
            this.f52201c = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.f52200b = savedState.f52200b;
            this.f52201c = savedState.f52201c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j(int i10) {
            int i11 = this.f52200b;
            return i11 >= 0 && i11 < i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            this.f52200b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f52200b + ", mAnchorOffset=" + this.f52201c + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f52200b);
            parcel.writeInt(this.f52201c);
        }
    }

    public class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final /* synthetic */ boolean f52202i = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f52206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f52207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f52208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f52209g;

        private b() {
            this.f52206d = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            if (FlexboxLayoutManager.this.k() || !FlexboxLayoutManager.this.f52171g) {
                this.f52205c = this.f52207e ? FlexboxLayoutManager.this.f52179o.getEndAfterPadding() : FlexboxLayoutManager.this.f52179o.getStartAfterPadding();
            } else {
                this.f52205c = this.f52207e ? FlexboxLayoutManager.this.f52179o.getEndAfterPadding() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.f52179o.getStartAfterPadding();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(View view) {
            OrientationHelper orientationHelper = FlexboxLayoutManager.this.f52167c == 0 ? FlexboxLayoutManager.this.f52180p : FlexboxLayoutManager.this.f52179o;
            if (FlexboxLayoutManager.this.k() || !FlexboxLayoutManager.this.f52171g) {
                if (this.f52207e) {
                    this.f52205c = orientationHelper.getDecoratedEnd(view) + orientationHelper.getTotalSpaceChange();
                } else {
                    this.f52205c = orientationHelper.getDecoratedStart(view);
                }
            } else if (this.f52207e) {
                this.f52205c = orientationHelper.getDecoratedStart(view) + orientationHelper.getTotalSpaceChange();
            } else {
                this.f52205c = orientationHelper.getDecoratedEnd(view);
            }
            this.f52203a = FlexboxLayoutManager.this.getPosition(view);
            this.f52209g = false;
            int[] iArr = FlexboxLayoutManager.this.f52174j.f52259c;
            int i10 = this.f52203a;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = iArr[i10];
            this.f52204b = i11 != -1 ? i11 : 0;
            if (FlexboxLayoutManager.this.f52173i.size() > this.f52204b) {
                this.f52203a = ((f) FlexboxLayoutManager.this.f52173i.get(this.f52204b)).f52247o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s() {
            this.f52203a = -1;
            this.f52204b = -1;
            this.f52205c = Integer.MIN_VALUE;
            this.f52208f = false;
            this.f52209g = false;
            if (FlexboxLayoutManager.this.k()) {
                if (FlexboxLayoutManager.this.f52167c == 0) {
                    this.f52207e = FlexboxLayoutManager.this.f52166b == 1;
                    return;
                } else {
                    this.f52207e = FlexboxLayoutManager.this.f52167c == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.f52167c == 0) {
                this.f52207e = FlexboxLayoutManager.this.f52166b == 3;
            } else {
                this.f52207e = FlexboxLayoutManager.this.f52167c == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f52203a + ", mFlexLinePosition=" + this.f52204b + ", mCoordinate=" + this.f52205c + ", mPerpendicularCoordinate=" + this.f52206d + ", mLayoutFromEnd=" + this.f52207e + ", mValid=" + this.f52208f + ", mAssignedFromSavedState=" + this.f52209g + '}';
        }
    }

    public static class c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f52211k = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f52212l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f52213m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f52214n = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f52218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f52219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f52220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f52221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f52222h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f52223i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f52224j;

        private c() {
            this.f52222h = 1;
            this.f52223i = 1;
        }

        static /* synthetic */ int i(c cVar) {
            int i10 = cVar.f52217c;
            cVar.f52217c = i10 + 1;
            return i10;
        }

        static /* synthetic */ int j(c cVar) {
            int i10 = cVar.f52217c;
            cVar.f52217c = i10 - 1;
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean w(RecyclerView.State state, List<f> list) {
            int i10;
            int i11 = this.f52218d;
            return i11 >= 0 && i11 < state.getItemCount() && (i10 = this.f52217c) >= 0 && i10 < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f52215a + ", mFlexLinePosition=" + this.f52217c + ", mPosition=" + this.f52218d + ", mOffset=" + this.f52219e + ", mScrollingOffset=" + this.f52220f + ", mLastScrollDelta=" + this.f52221g + ", mItemDirection=" + this.f52222h + ", mLayoutDirection=" + this.f52223i + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    public FlexboxLayoutManager(Context context, int i10) {
        this(context, i10, 1);
    }

    public FlexboxLayoutManager(Context context, int i10, int i11) {
        this.f52170f = -1;
        this.f52173i = new ArrayList();
        this.f52174j = new h(this);
        this.f52178n = new b();
        this.f52182r = -1;
        this.f52183s = Integer.MIN_VALUE;
        this.f52184t = Integer.MIN_VALUE;
        this.f52185u = Integer.MIN_VALUE;
        this.f52187w = new SparseArray<>();
        this.f52190z = -1;
        this.A = new h.b();
        setFlexDirection(i10);
        setFlexWrap(i11);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.f52188x = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f52170f = -1;
        this.f52173i = new ArrayList();
        this.f52174j = new h(this);
        this.f52178n = new b();
        this.f52182r = -1;
        this.f52183s = Integer.MIN_VALUE;
        this.f52184t = Integer.MIN_VALUE;
        this.f52185u = Integer.MIN_VALUE;
        this.f52187w = new SparseArray<>();
        this.f52190z = -1;
        this.A = new h.b();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i10, i11);
        int i12 = properties.orientation;
        if (i12 != 0) {
            if (i12 == 1) {
                if (properties.reverseLayout) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.reverseLayout) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.f52188x = context;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private View A(View view, f fVar) {
        boolean zK = k();
        int childCount = (getChildCount() - fVar.f52240h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f52171g || zK) {
                    if (this.f52179o.getDecoratedEnd(view) < this.f52179o.getDecoratedEnd(childAt)) {
                        view = childAt;
                    }
                } else if (this.f52179o.getDecoratedStart(view) > this.f52179o.getDecoratedStart(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View B(int i10, int i11, boolean z10) {
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (L(childAt, z10)) {
                return childAt;
            }
            i10 += i12;
        }
        return null;
    }

    private View C(int i10, int i11, int i12) {
        v();
        ensureLayoutState();
        int startAfterPadding = this.f52179o.getStartAfterPadding();
        int endAfterPadding = this.f52179o.getEndAfterPadding();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            if (position >= 0 && position < i12) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f52179o.getDecoratedStart(childAt) >= startAfterPadding && this.f52179o.getDecoratedEnd(childAt) <= endAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    private int D(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    private int E(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    private int F(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    private int G(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    private int I(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        v();
        int i11 = 1;
        this.f52177m.f52224j = true;
        boolean z10 = !k() && this.f52171g;
        if (!z10 ? i10 <= 0 : i10 >= 0) {
            i11 = -1;
        }
        int iAbs = Math.abs(i10);
        Z(i11, iAbs);
        int iW = this.f52177m.f52220f + w(recycler, state, this.f52177m);
        if (iW < 0) {
            return 0;
        }
        if (z10) {
            if (iAbs > iW) {
                i10 = (-i11) * iW;
            }
        } else if (iAbs > iW) {
            i10 = i11 * iW;
        }
        this.f52179o.offsetChildren(-i10);
        this.f52177m.f52221g = i10;
        return i10;
    }

    private int J(int i10) {
        int iMin;
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        v();
        boolean zK = k();
        View view = this.f52189y;
        int width = zK ? view.getWidth() : view.getHeight();
        int width2 = zK ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i10);
            if (i10 < 0) {
                iMin = Math.min((width2 + this.f52178n.f52206d) - width, iAbs);
            } else {
                if (this.f52178n.f52206d + i10 <= 0) {
                    return i10;
                }
                iMin = this.f52178n.f52206d;
            }
        } else {
            if (i10 > 0) {
                return Math.min((width2 - this.f52178n.f52206d) - width, i10);
            }
            if (this.f52178n.f52206d + i10 >= 0) {
                return i10;
            }
            iMin = this.f52178n.f52206d;
        }
        return -iMin;
    }

    private boolean L(View view, boolean z10) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int iE = E(view);
        int iG = G(view);
        int iF = F(view);
        int iD = D(view);
        boolean z11 = paddingLeft <= iE && width >= iF;
        boolean z12 = iE >= width || iF >= paddingLeft;
        boolean z13 = paddingTop <= iG && height >= iD;
        boolean z14 = iG >= height || iD >= paddingTop;
        if (z10) {
            return z11 && z13;
        }
        return z12 && z14;
    }

    private int M(f fVar, c cVar) {
        return k() ? N(fVar, cVar) : O(fVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192 A[SYNTHETIC] */
    private int N(f fVar, c cVar) {
        float f10;
        float f11;
        float f12;
        float measuredWidth;
        float measuredWidth2;
        float fMax;
        int i10;
        int iC;
        int i11;
        View viewB;
        int iY;
        int iX;
        LayoutParams layoutParams;
        float leftDecorationWidth;
        float rightDecorationWidth;
        int topDecorationHeight;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width = getWidth();
        int i12 = cVar.f52219e;
        if (cVar.f52223i == -1) {
            i12 -= fVar.f52239g;
        }
        int i13 = i12;
        int i14 = cVar.f52218d;
        int i15 = this.f52168d;
        int i16 = 1;
        if (i15 != 0) {
            if (i15 == 1) {
                int i17 = fVar.f52237e;
                float f13 = (width - i17) + paddingRight;
                f12 = 0.0f;
                f11 = i17 - paddingLeft;
                f10 = f13;
            } else if (i15 == 2) {
                int i18 = fVar.f52237e;
                f10 = paddingLeft + ((width - i18) / 2.0f);
                f11 = (width - paddingRight) - ((width - i18) / 2.0f);
            } else if (i15 == 3) {
                f10 = paddingLeft;
                int i19 = fVar.f52240h;
                f12 = (width - fVar.f52237e) / (i19 != 1 ? i19 - 1 : 1.0f);
                f11 = width - paddingRight;
            } else if (i15 == 4) {
                int i20 = fVar.f52240h;
                f12 = i20 != 0 ? (width - fVar.f52237e) / i20 : 0.0f;
                float f14 = f12 / 2.0f;
                f10 = paddingLeft + f14;
                f11 = (width - paddingRight) - f14;
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f52168d);
                }
                int i21 = fVar.f52240h;
                f12 = i21 != 0 ? (width - fVar.f52237e) / (i21 + 1) : 0.0f;
                f10 = paddingLeft + f12;
                f11 = (width - paddingRight) - f12;
            }
            measuredWidth = f10 - this.f52178n.f52206d;
            measuredWidth2 = f11 - this.f52178n.f52206d;
            fMax = Math.max(f12, 0.0f);
            i10 = 0;
            iC = fVar.c();
            i11 = i14;
            while (i11 < i14 + iC) {
                viewB = b(i11);
                if (viewB != null) {
                    if (cVar.f52223i == i16) {
                        calculateItemDecorationsForChild(viewB, C);
                        addView(viewB);
                    } else {
                        calculateItemDecorationsForChild(viewB, C);
                        addView(viewB, i10);
                        i10++;
                    }
                    int i22 = i10;
                    h hVar = this.f52174j;
                    long j10 = hVar.f52260d[i11];
                    iY = hVar.y(j10);
                    iX = this.f52174j.x(j10);
                    layoutParams = (LayoutParams) viewB.getLayoutParams();
                    if (shouldMeasureChild(viewB, iY, iX, layoutParams)) {
                        viewB.measure(iY, iX);
                    }
                    leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getLeftDecorationWidth(viewB);
                    rightDecorationWidth = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(viewB));
                    topDecorationHeight = i13 + getTopDecorationHeight(viewB);
                    if (this.f52171g) {
                        this.f52174j.Q(viewB, fVar, Math.round(rightDecorationWidth) - viewB.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + viewB.getMeasuredHeight());
                    } else {
                        this.f52174j.Q(viewB, fVar, Math.round(leftDecorationWidth), topDecorationHeight, Math.round(leftDecorationWidth) + viewB.getMeasuredWidth(), topDecorationHeight + viewB.getMeasuredHeight());
                    }
                    i10 = i22;
                    measuredWidth = leftDecorationWidth + viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(viewB) + fMax;
                    measuredWidth2 = rightDecorationWidth - (((viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(viewB)) + fMax);
                }
                i11++;
                i16 = 1;
            }
            cVar.f52217c += this.f52177m.f52223i;
            return fVar.a();
        }
        f10 = paddingLeft;
        f11 = width - paddingRight;
        f12 = 0.0f;
        measuredWidth = f10 - this.f52178n.f52206d;
        measuredWidth2 = f11 - this.f52178n.f52206d;
        fMax = Math.max(f12, 0.0f);
        i10 = 0;
        iC = fVar.c();
        i11 = i14;
        while (i11 < i14 + iC) {
            viewB = b(i11);
            if (viewB != null) {
                if (cVar.f52223i == i16) {
                    calculateItemDecorationsForChild(viewB, C);
                    addView(viewB);
                } else {
                    calculateItemDecorationsForChild(viewB, C);
                    addView(viewB, i10);
                    i10++;
                }
                int i23 = i10;
                h hVar2 = this.f52174j;
                long j11 = hVar2.f52260d[i11];
                iY = hVar2.y(j11);
                iX = this.f52174j.x(j11);
                layoutParams = (LayoutParams) viewB.getLayoutParams();
                if (shouldMeasureChild(viewB, iY, iX, layoutParams)) {
                    viewB.measure(iY, iX);
                }
                leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getLeftDecorationWidth(viewB);
                rightDecorationWidth = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(viewB));
                topDecorationHeight = i13 + getTopDecorationHeight(viewB);
                if (this.f52171g) {
                    this.f52174j.Q(viewB, fVar, Math.round(rightDecorationWidth) - viewB.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + viewB.getMeasuredHeight());
                } else {
                    this.f52174j.Q(viewB, fVar, Math.round(leftDecorationWidth), topDecorationHeight, Math.round(leftDecorationWidth) + viewB.getMeasuredWidth(), topDecorationHeight + viewB.getMeasuredHeight());
                }
                i10 = i23;
                measuredWidth = leftDecorationWidth + viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(viewB) + fMax;
                measuredWidth2 = rightDecorationWidth - (((viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(viewB)) + fMax);
            }
            i11++;
            i16 = 1;
        }
        cVar.f52217c += this.f52177m.f52223i;
        return fVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:0x0198  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c0  */
    private int O(f fVar, c cVar) {
        float f10;
        float f11;
        float f12;
        float measuredHeight;
        float measuredHeight2;
        float fMax;
        int i10;
        int iC;
        int i11;
        View viewB;
        float f13;
        int iY;
        int iX;
        LayoutParams layoutParams;
        float topDecorationHeight;
        float bottomDecorationHeight;
        int leftDecorationWidth;
        int rightDecorationWidth;
        boolean z10;
        boolean z11;
        View view;
        int i12;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = cVar.f52219e;
        int i14 = cVar.f52219e;
        if (cVar.f52223i == -1) {
            int i15 = fVar.f52239g;
            i13 -= i15;
            i14 += i15;
        }
        int i16 = i13;
        int i17 = i14;
        int i18 = cVar.f52218d;
        int i19 = this.f52168d;
        boolean z12 = true;
        if (i19 != 0) {
            if (i19 == 1) {
                int i20 = fVar.f52237e;
                float f14 = (height - i20) + paddingBottom;
                f12 = 0.0f;
                f11 = i20 - paddingTop;
                f10 = f14;
            } else if (i19 == 2) {
                int i21 = fVar.f52237e;
                f10 = paddingTop + ((height - i21) / 2.0f);
                f11 = (height - paddingBottom) - ((height - i21) / 2.0f);
            } else if (i19 == 3) {
                f10 = paddingTop;
                int i22 = fVar.f52240h;
                f12 = (height - fVar.f52237e) / (i22 != 1 ? i22 - 1 : 1.0f);
                f11 = height - paddingBottom;
            } else if (i19 == 4) {
                int i23 = fVar.f52240h;
                f12 = i23 != 0 ? (height - fVar.f52237e) / i23 : 0.0f;
                float f15 = f12 / 2.0f;
                f10 = paddingTop + f15;
                f11 = (height - paddingBottom) - f15;
            } else {
                if (i19 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f52168d);
                }
                int i24 = fVar.f52240h;
                f12 = i24 != 0 ? (height - fVar.f52237e) / (i24 + 1) : 0.0f;
                f10 = paddingTop + f12;
                f11 = (height - paddingBottom) - f12;
            }
            measuredHeight = f10 - this.f52178n.f52206d;
            measuredHeight2 = f11 - this.f52178n.f52206d;
            fMax = Math.max(f12, 0.0f);
            i10 = 0;
            iC = fVar.c();
            i11 = i18;
            while (i11 < i18 + iC) {
                viewB = b(i11);
                if (viewB == null) {
                    i12 = i11;
                    z11 = z12;
                    f13 = fMax;
                } else {
                    h hVar = this.f52174j;
                    f13 = fMax;
                    long j10 = hVar.f52260d[i11];
                    iY = hVar.y(j10);
                    iX = this.f52174j.x(j10);
                    layoutParams = (LayoutParams) viewB.getLayoutParams();
                    if (shouldMeasureChild(viewB, iY, iX, layoutParams)) {
                        viewB.measure(iY, iX);
                    }
                    topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getTopDecorationHeight(viewB);
                    bottomDecorationHeight = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getBottomDecorationHeight(viewB));
                    if (cVar.f52223i == 1) {
                        calculateItemDecorationsForChild(viewB, C);
                        addView(viewB);
                    } else {
                        calculateItemDecorationsForChild(viewB, C);
                        addView(viewB, i10);
                        i10++;
                    }
                    int i25 = i10;
                    leftDecorationWidth = i16 + getLeftDecorationWidth(viewB);
                    rightDecorationWidth = i17 - getRightDecorationWidth(viewB);
                    z10 = this.f52171g;
                    if (z10) {
                        z11 = true;
                        view = viewB;
                        i12 = i11;
                        if (this.f52172h) {
                            this.f52174j.R(view, fVar, z10, leftDecorationWidth, Math.round(bottomDecorationHeight) - view.getMeasuredHeight(), leftDecorationWidth + view.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                        } else {
                            this.f52174j.R(view, fVar, z10, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + view.getMeasuredWidth(), Math.round(topDecorationHeight) + view.getMeasuredHeight());
                        }
                    } else if (this.f52172h) {
                        z11 = true;
                        view = viewB;
                        i12 = i11;
                        this.f52174j.R(viewB, fVar, z10, rightDecorationWidth - viewB.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewB.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                    } else {
                        z11 = true;
                        view = viewB;
                        i12 = i11;
                        this.f52174j.R(view, fVar, z10, rightDecorationWidth - view.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, Math.round(topDecorationHeight) + view.getMeasuredHeight());
                    }
                    View view2 = view;
                    measuredHeight = topDecorationHeight + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getBottomDecorationHeight(view2) + f13;
                    i10 = i25;
                    measuredHeight2 = bottomDecorationHeight - (((view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getTopDecorationHeight(view2)) + f13);
                }
                i11 = i12 + 1;
                fMax = f13;
                z12 = z11;
            }
            cVar.f52217c += this.f52177m.f52223i;
            return fVar.a();
        }
        f10 = paddingTop;
        f11 = height - paddingBottom;
        f12 = 0.0f;
        measuredHeight = f10 - this.f52178n.f52206d;
        measuredHeight2 = f11 - this.f52178n.f52206d;
        fMax = Math.max(f12, 0.0f);
        i10 = 0;
        iC = fVar.c();
        i11 = i18;
        while (i11 < i18 + iC) {
            viewB = b(i11);
            if (viewB == null) {
                i12 = i11;
                z11 = z12;
                f13 = fMax;
            } else {
                h hVar2 = this.f52174j;
                f13 = fMax;
                long j11 = hVar2.f52260d[i11];
                iY = hVar2.y(j11);
                iX = this.f52174j.x(j11);
                layoutParams = (LayoutParams) viewB.getLayoutParams();
                if (shouldMeasureChild(viewB, iY, iX, layoutParams)) {
                    viewB.measure(iY, iX);
                }
                topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getTopDecorationHeight(viewB);
                bottomDecorationHeight = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getBottomDecorationHeight(viewB));
                if (cVar.f52223i == 1) {
                    calculateItemDecorationsForChild(viewB, C);
                    addView(viewB);
                } else {
                    calculateItemDecorationsForChild(viewB, C);
                    addView(viewB, i10);
                    i10++;
                }
                int i26 = i10;
                leftDecorationWidth = i16 + getLeftDecorationWidth(viewB);
                rightDecorationWidth = i17 - getRightDecorationWidth(viewB);
                z10 = this.f52171g;
                if (z10) {
                    z11 = true;
                    view = viewB;
                    i12 = i11;
                    if (this.f52172h) {
                        this.f52174j.R(view, fVar, z10, leftDecorationWidth, Math.round(bottomDecorationHeight) - view.getMeasuredHeight(), leftDecorationWidth + view.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                    } else {
                        this.f52174j.R(view, fVar, z10, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + view.getMeasuredWidth(), Math.round(topDecorationHeight) + view.getMeasuredHeight());
                    }
                } else if (this.f52172h) {
                    z11 = true;
                    view = viewB;
                    i12 = i11;
                    this.f52174j.R(viewB, fVar, z10, rightDecorationWidth - viewB.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewB.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                } else {
                    z11 = true;
                    view = viewB;
                    i12 = i11;
                    this.f52174j.R(view, fVar, z10, rightDecorationWidth - view.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, Math.round(topDecorationHeight) + view.getMeasuredHeight());
                }
                View view3 = view;
                measuredHeight = topDecorationHeight + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getBottomDecorationHeight(view3) + f13;
                i10 = i26;
                measuredHeight2 = bottomDecorationHeight - (((view3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getTopDecorationHeight(view3)) + f13);
            }
            i11 = i12 + 1;
            fMax = f13;
            z12 = z11;
        }
        cVar.f52217c += this.f52177m.f52223i;
        return fVar.a();
    }

    private void P(RecyclerView.Recycler recycler, c cVar) {
        if (cVar.f52224j) {
            if (cVar.f52223i == -1) {
                Q(recycler, cVar);
            } else {
                R(recycler, cVar);
            }
        }
    }

    private void Q(RecyclerView.Recycler recycler, c cVar) {
        if (cVar.f52220f < 0) {
            return;
        }
        this.f52179o.getEnd();
        int unused = cVar.f52220f;
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int i10 = childCount - 1;
        int i11 = this.f52174j.f52259c[getPosition(getChildAt(i10))];
        if (i11 == -1) {
            return;
        }
        f fVar = this.f52173i.get(i11);
        for (int i12 = i10; i12 >= 0; i12--) {
            View childAt = getChildAt(i12);
            if (!s(childAt, cVar.f52220f)) {
                break;
            }
            if (fVar.f52247o == getPosition(childAt)) {
                if (i11 <= 0) {
                    childCount = i12;
                    break;
                } else {
                    i11 += cVar.f52223i;
                    fVar = this.f52173i.get(i11);
                    childCount = i12;
                }
            }
        }
        recycleChildren(recycler, childCount, i10);
    }

    private void R(RecyclerView.Recycler recycler, c cVar) {
        int childCount;
        if (cVar.f52220f >= 0 && (childCount = getChildCount()) != 0) {
            int i10 = this.f52174j.f52259c[getPosition(getChildAt(0))];
            int i11 = -1;
            if (i10 == -1) {
                return;
            }
            f fVar = this.f52173i.get(i10);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!t(childAt, cVar.f52220f)) {
                    break;
                }
                if (fVar.f52248p == getPosition(childAt)) {
                    if (i10 >= this.f52173i.size() - 1) {
                        i11 = i12;
                        break;
                    } else {
                        i10 += cVar.f52223i;
                        fVar = this.f52173i.get(i10);
                        i11 = i12;
                    }
                }
            }
            recycleChildren(recycler, 0, i11);
        }
    }

    private void S() {
        int heightMode = k() ? getHeightMode() : getWidthMode();
        this.f52177m.f52216b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    private void T() {
        int layoutDirection = getLayoutDirection();
        int i10 = this.f52166b;
        if (i10 == 0) {
            this.f52171g = layoutDirection == 1;
            this.f52172h = this.f52167c == 2;
            return;
        }
        if (i10 == 1) {
            this.f52171g = layoutDirection != 1;
            this.f52172h = this.f52167c == 2;
            return;
        }
        if (i10 == 2) {
            boolean z10 = layoutDirection == 1;
            this.f52171g = z10;
            if (this.f52167c == 2) {
                this.f52171g = !z10;
            }
            this.f52172h = false;
            return;
        }
        if (i10 != 3) {
            this.f52171g = false;
            this.f52172h = false;
            return;
        }
        boolean z11 = layoutDirection == 1;
        this.f52171g = z11;
        if (this.f52167c == 2) {
            this.f52171g = !z11;
        }
        this.f52172h = true;
    }

    private boolean U(RecyclerView.State state, b bVar) {
        if (getChildCount() == 0) {
            return false;
        }
        View viewZ = bVar.f52207e ? z(state.getItemCount()) : x(state.getItemCount());
        if (viewZ == null) {
            return false;
        }
        bVar.r(viewZ);
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            if (this.f52179o.getDecoratedStart(viewZ) >= this.f52179o.getEndAfterPadding() || this.f52179o.getDecoratedEnd(viewZ) < this.f52179o.getStartAfterPadding()) {
                bVar.f52205c = bVar.f52207e ? this.f52179o.getEndAfterPadding() : this.f52179o.getStartAfterPadding();
            }
        }
        return true;
    }

    private boolean V(RecyclerView.State state, b bVar, SavedState savedState) {
        int i10;
        if (!state.isPreLayout() && (i10 = this.f52182r) != -1) {
            if (i10 >= 0 && i10 < state.getItemCount()) {
                bVar.f52203a = this.f52182r;
                bVar.f52204b = this.f52174j.f52259c[bVar.f52203a];
                SavedState savedState2 = this.f52181q;
                if (savedState2 != null && savedState2.j(state.getItemCount())) {
                    bVar.f52205c = this.f52179o.getStartAfterPadding() + savedState.f52201c;
                    bVar.f52209g = true;
                    bVar.f52204b = -1;
                    return true;
                }
                if (this.f52183s != Integer.MIN_VALUE) {
                    if (k() || !this.f52171g) {
                        bVar.f52205c = this.f52179o.getStartAfterPadding() + this.f52183s;
                    } else {
                        bVar.f52205c = this.f52183s - this.f52179o.getEndPadding();
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.f52182r);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        bVar.f52207e = this.f52182r < getPosition(getChildAt(0));
                    }
                    bVar.q();
                } else {
                    if (this.f52179o.getDecoratedMeasurement(viewFindViewByPosition) > this.f52179o.getTotalSpace()) {
                        bVar.q();
                        return true;
                    }
                    if (this.f52179o.getDecoratedStart(viewFindViewByPosition) - this.f52179o.getStartAfterPadding() < 0) {
                        bVar.f52205c = this.f52179o.getStartAfterPadding();
                        bVar.f52207e = false;
                        return true;
                    }
                    if (this.f52179o.getEndAfterPadding() - this.f52179o.getDecoratedEnd(viewFindViewByPosition) < 0) {
                        bVar.f52205c = this.f52179o.getEndAfterPadding();
                        bVar.f52207e = true;
                        return true;
                    }
                    bVar.f52205c = bVar.f52207e ? this.f52179o.getDecoratedEnd(viewFindViewByPosition) + this.f52179o.getTotalSpaceChange() : this.f52179o.getDecoratedStart(viewFindViewByPosition);
                }
                return true;
            }
            this.f52182r = -1;
            this.f52183s = Integer.MIN_VALUE;
        }
        return false;
    }

    private void W(RecyclerView.State state, b bVar) {
        if (V(state, bVar, this.f52181q) || U(state, bVar)) {
            return;
        }
        bVar.q();
        bVar.f52203a = 0;
        bVar.f52204b = 0;
    }

    private void X(int i10) {
        if (i10 >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.f52174j.t(childCount);
        this.f52174j.u(childCount);
        this.f52174j.s(childCount);
        if (i10 >= this.f52174j.f52259c.length) {
            return;
        }
        this.f52190z = i10;
        View childClosestToStart = getChildClosestToStart();
        if (childClosestToStart == null) {
            return;
        }
        this.f52182r = getPosition(childClosestToStart);
        if (k() || !this.f52171g) {
            this.f52183s = this.f52179o.getDecoratedStart(childClosestToStart) - this.f52179o.getStartAfterPadding();
        } else {
            this.f52183s = this.f52179o.getDecoratedEnd(childClosestToStart) + this.f52179o.getEndPadding();
        }
    }

    private void Y(int i10) {
        boolean z10;
        int i11;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        if (k()) {
            int i12 = this.f52184t;
            z10 = (i12 == Integer.MIN_VALUE || i12 == width) ? false : true;
            i11 = this.f52177m.f52216b ? this.f52188x.getResources().getDisplayMetrics().heightPixels : this.f52177m.f52215a;
        } else {
            int i13 = this.f52185u;
            z10 = (i13 == Integer.MIN_VALUE || i13 == height) ? false : true;
            i11 = this.f52177m.f52216b ? this.f52188x.getResources().getDisplayMetrics().widthPixels : this.f52177m.f52215a;
        }
        int i14 = i11;
        this.f52184t = width;
        this.f52185u = height;
        int i15 = this.f52190z;
        if (i15 == -1 && (this.f52182r != -1 || z10)) {
            if (this.f52178n.f52207e) {
                return;
            }
            this.f52173i.clear();
            this.A.a();
            if (k()) {
                this.f52174j.e(this.A, iMakeMeasureSpec, iMakeMeasureSpec2, i14, this.f52178n.f52203a, this.f52173i);
            } else {
                this.f52174j.h(this.A, iMakeMeasureSpec, iMakeMeasureSpec2, i14, this.f52178n.f52203a, this.f52173i);
            }
            this.f52173i = this.A.f52262a;
            this.f52174j.p(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f52174j.X();
            b bVar = this.f52178n;
            bVar.f52204b = this.f52174j.f52259c[bVar.f52203a];
            this.f52177m.f52217c = this.f52178n.f52204b;
            return;
        }
        int iMin = i15 != -1 ? Math.min(i15, this.f52178n.f52203a) : this.f52178n.f52203a;
        this.A.a();
        if (k()) {
            if (this.f52173i.size() > 0) {
                this.f52174j.j(this.f52173i, iMin);
                this.f52174j.b(this.A, iMakeMeasureSpec, iMakeMeasureSpec2, i14, iMin, this.f52178n.f52203a, this.f52173i);
            } else {
                this.f52174j.s(i10);
                this.f52174j.d(this.A, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, this.f52173i);
            }
        } else if (this.f52173i.size() > 0) {
            this.f52174j.j(this.f52173i, iMin);
            this.f52174j.b(this.A, iMakeMeasureSpec2, iMakeMeasureSpec, i14, iMin, this.f52178n.f52203a, this.f52173i);
        } else {
            this.f52174j.s(i10);
            this.f52174j.g(this.A, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, this.f52173i);
        }
        this.f52173i = this.A.f52262a;
        this.f52174j.q(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
        this.f52174j.Y(iMin);
    }

    private void Z(int i10, int i11) {
        this.f52177m.f52223i = i10;
        boolean zK = k();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z10 = !zK && this.f52171g;
        if (i10 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.f52177m.f52219e = this.f52179o.getDecoratedEnd(childAt);
            int position = getPosition(childAt);
            View viewA = A(childAt, this.f52173i.get(this.f52174j.f52259c[position]));
            this.f52177m.f52222h = 1;
            c cVar = this.f52177m;
            cVar.f52218d = position + cVar.f52222h;
            if (this.f52174j.f52259c.length <= this.f52177m.f52218d) {
                this.f52177m.f52217c = -1;
            } else {
                c cVar2 = this.f52177m;
                cVar2.f52217c = this.f52174j.f52259c[cVar2.f52218d];
            }
            if (z10) {
                this.f52177m.f52219e = this.f52179o.getDecoratedStart(viewA);
                this.f52177m.f52220f = (-this.f52179o.getDecoratedStart(viewA)) + this.f52179o.getStartAfterPadding();
                c cVar3 = this.f52177m;
                cVar3.f52220f = cVar3.f52220f >= 0 ? this.f52177m.f52220f : 0;
            } else {
                this.f52177m.f52219e = this.f52179o.getDecoratedEnd(viewA);
                this.f52177m.f52220f = this.f52179o.getDecoratedEnd(viewA) - this.f52179o.getEndAfterPadding();
            }
            if ((this.f52177m.f52217c == -1 || this.f52177m.f52217c > this.f52173i.size() - 1) && this.f52177m.f52218d <= getFlexItemCount()) {
                int i12 = i11 - this.f52177m.f52220f;
                this.A.a();
                if (i12 > 0) {
                    if (zK) {
                        this.f52174j.d(this.A, iMakeMeasureSpec, iMakeMeasureSpec2, i12, this.f52177m.f52218d, this.f52173i);
                    } else {
                        this.f52174j.g(this.A, iMakeMeasureSpec, iMakeMeasureSpec2, i12, this.f52177m.f52218d, this.f52173i);
                    }
                    this.f52174j.q(iMakeMeasureSpec, iMakeMeasureSpec2, this.f52177m.f52218d);
                    this.f52174j.Y(this.f52177m.f52218d);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.f52177m.f52219e = this.f52179o.getDecoratedStart(childAt2);
            int position2 = getPosition(childAt2);
            View viewY = y(childAt2, this.f52173i.get(this.f52174j.f52259c[position2]));
            this.f52177m.f52222h = 1;
            int i13 = this.f52174j.f52259c[position2];
            if (i13 == -1) {
                i13 = 0;
            }
            if (i13 > 0) {
                this.f52177m.f52218d = position2 - this.f52173i.get(i13 - 1).c();
            } else {
                this.f52177m.f52218d = -1;
            }
            this.f52177m.f52217c = i13 > 0 ? i13 - 1 : 0;
            if (z10) {
                this.f52177m.f52219e = this.f52179o.getDecoratedEnd(viewY);
                this.f52177m.f52220f = this.f52179o.getDecoratedEnd(viewY) - this.f52179o.getEndAfterPadding();
                c cVar4 = this.f52177m;
                cVar4.f52220f = cVar4.f52220f >= 0 ? this.f52177m.f52220f : 0;
            } else {
                this.f52177m.f52219e = this.f52179o.getDecoratedStart(viewY);
                this.f52177m.f52220f = (-this.f52179o.getDecoratedStart(viewY)) + this.f52179o.getStartAfterPadding();
            }
        }
        c cVar5 = this.f52177m;
        cVar5.f52215a = i11 - cVar5.f52220f;
    }

    private void a0(b bVar, boolean z10, boolean z11) {
        if (z11) {
            S();
        } else {
            this.f52177m.f52216b = false;
        }
        if (k() || !this.f52171g) {
            this.f52177m.f52215a = this.f52179o.getEndAfterPadding() - bVar.f52205c;
        } else {
            this.f52177m.f52215a = bVar.f52205c - getPaddingRight();
        }
        this.f52177m.f52218d = bVar.f52203a;
        this.f52177m.f52222h = 1;
        this.f52177m.f52223i = 1;
        this.f52177m.f52219e = bVar.f52205c;
        this.f52177m.f52220f = Integer.MIN_VALUE;
        this.f52177m.f52217c = bVar.f52204b;
        if (!z10 || this.f52173i.size() <= 1 || bVar.f52204b < 0 || bVar.f52204b >= this.f52173i.size() - 1) {
            return;
        }
        f fVar = this.f52173i.get(bVar.f52204b);
        c.i(this.f52177m);
        this.f52177m.f52218d += fVar.c();
    }

    private void b0(b bVar, boolean z10, boolean z11) {
        if (z11) {
            S();
        } else {
            this.f52177m.f52216b = false;
        }
        if (k() || !this.f52171g) {
            this.f52177m.f52215a = bVar.f52205c - this.f52179o.getStartAfterPadding();
        } else {
            this.f52177m.f52215a = (this.f52189y.getWidth() - bVar.f52205c) - this.f52179o.getStartAfterPadding();
        }
        this.f52177m.f52218d = bVar.f52203a;
        this.f52177m.f52222h = 1;
        this.f52177m.f52223i = -1;
        this.f52177m.f52219e = bVar.f52205c;
        this.f52177m.f52220f = Integer.MIN_VALUE;
        this.f52177m.f52217c = bVar.f52204b;
        if (!z10 || bVar.f52204b <= 0 || this.f52173i.size() <= bVar.f52204b) {
            return;
        }
        f fVar = this.f52173i.get(bVar.f52204b);
        c.j(this.f52177m);
        this.f52177m.f52218d -= fVar.c();
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        v();
        View viewX = x(itemCount);
        View viewZ = z(itemCount);
        if (state.getItemCount() == 0 || viewX == null || viewZ == null) {
            return 0;
        }
        return Math.min(this.f52179o.getTotalSpace(), this.f52179o.getDecoratedEnd(viewZ) - this.f52179o.getDecoratedStart(viewX));
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewX = x(itemCount);
        View viewZ = z(itemCount);
        if (state.getItemCount() != 0 && viewX != null && viewZ != null) {
            int position = getPosition(viewX);
            int position2 = getPosition(viewZ);
            int iAbs = Math.abs(this.f52179o.getDecoratedEnd(viewZ) - this.f52179o.getDecoratedStart(viewX));
            int[] iArr = this.f52174j.f52259c;
            int i10 = iArr[position];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (iAbs / ((iArr[position2] - i10) + 1))) + (this.f52179o.getStartAfterPadding() - this.f52179o.getDecoratedStart(viewX)));
            }
        }
        return 0;
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewX = x(itemCount);
        View viewZ = z(itemCount);
        if (state.getItemCount() == 0 || viewX == null || viewZ == null) {
            return 0;
        }
        return (int) ((Math.abs(this.f52179o.getDecoratedEnd(viewZ) - this.f52179o.getDecoratedStart(viewX)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1)) * state.getItemCount());
    }

    private void ensureLayoutState() {
        if (this.f52177m == null) {
            this.f52177m = new c();
        }
    }

    private int fixLayoutEndGap(int i10, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10) {
        int I;
        int endAfterPadding;
        if (!k() && this.f52171g) {
            int startAfterPadding = i10 - this.f52179o.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            I = I(startAfterPadding, recycler, state);
        } else {
            int endAfterPadding2 = this.f52179o.getEndAfterPadding() - i10;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            I = -I(-endAfterPadding2, recycler, state);
        }
        int i11 = i10 + I;
        if (!z10 || (endAfterPadding = this.f52179o.getEndAfterPadding() - i11) <= 0) {
            return I;
        }
        this.f52179o.offsetChildren(endAfterPadding);
        return endAfterPadding + I;
    }

    private int fixLayoutStartGap(int i10, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10) {
        int I;
        int startAfterPadding;
        if (k() || !this.f52171g) {
            int startAfterPadding2 = i10 - this.f52179o.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            I = -I(startAfterPadding2, recycler, state);
        } else {
            int endAfterPadding = this.f52179o.getEndAfterPadding() - i10;
            if (endAfterPadding <= 0) {
                return 0;
            }
            I = I(-endAfterPadding, recycler, state);
        }
        int i11 = i10 + I;
        if (!z10 || (startAfterPadding = i11 - this.f52179o.getStartAfterPadding()) <= 0) {
            return I;
        }
        this.f52179o.offsetChildren(-startAfterPadding);
        return I - startAfterPadding;
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private static boolean isMeasurementUpToDate(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i10, int i11) {
        while (i11 >= i10) {
            removeAndRecycleViewAt(i11, recycler);
            i11--;
        }
    }

    private boolean s(View view, int i10) {
        if (k() || !this.f52171g) {
            return this.f52179o.getDecoratedStart(view) >= this.f52179o.getEnd() - i10;
        }
        return this.f52179o.getDecoratedEnd(view) <= i10;
    }

    private boolean shouldMeasureChild(View view, int i10, int i11, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    private boolean t(View view, int i10) {
        if (k() || !this.f52171g) {
            return this.f52179o.getDecoratedEnd(view) <= i10;
        }
        return this.f52179o.getEnd() - this.f52179o.getDecoratedStart(view) <= i10;
    }

    private void u() {
        this.f52173i.clear();
        this.f52178n.s();
        this.f52178n.f52206d = 0;
    }

    private void v() {
        if (this.f52179o != null) {
            return;
        }
        if (k()) {
            if (this.f52167c == 0) {
                this.f52179o = OrientationHelper.createHorizontalHelper(this);
                this.f52180p = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.f52179o = OrientationHelper.createVerticalHelper(this);
                this.f52180p = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (this.f52167c == 0) {
            this.f52179o = OrientationHelper.createVerticalHelper(this);
            this.f52180p = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.f52179o = OrientationHelper.createHorizontalHelper(this);
            this.f52180p = OrientationHelper.createVerticalHelper(this);
        }
    }

    private int w(RecyclerView.Recycler recycler, RecyclerView.State state, c cVar) {
        if (cVar.f52220f != Integer.MIN_VALUE) {
            if (cVar.f52215a < 0) {
                cVar.f52220f += cVar.f52215a;
            }
            P(recycler, cVar);
        }
        int i10 = cVar.f52215a;
        int iA = cVar.f52215a;
        int iM = 0;
        boolean zK = k();
        while (true) {
            if ((iA <= 0 && !this.f52177m.f52216b) || !cVar.w(state, this.f52173i)) {
                break;
            }
            f fVar = this.f52173i.get(cVar.f52217c);
            cVar.f52218d = fVar.f52247o;
            iM += M(fVar, cVar);
            if (zK || !this.f52171g) {
                cVar.f52219e += fVar.a() * cVar.f52223i;
            } else {
                cVar.f52219e -= fVar.a() * cVar.f52223i;
            }
            iA -= fVar.a();
        }
        cVar.f52215a -= iM;
        if (cVar.f52220f != Integer.MIN_VALUE) {
            cVar.f52220f += iM;
            if (cVar.f52215a < 0) {
                cVar.f52220f += cVar.f52215a;
            }
            P(recycler, cVar);
        }
        return i10 - cVar.f52215a;
    }

    private View x(int i10) {
        View viewC = C(0, getChildCount(), i10);
        if (viewC == null) {
            return null;
        }
        int i11 = this.f52174j.f52259c[getPosition(viewC)];
        if (i11 == -1) {
            return null;
        }
        return y(viewC, this.f52173i.get(i11));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    private View y(View view, f fVar) {
        boolean zK = k();
        int i10 = fVar.f52240h;
        for (int i11 = 1; i11 < i10; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f52171g || zK) {
                    if (this.f52179o.getDecoratedStart(view) > this.f52179o.getDecoratedStart(childAt)) {
                        view = childAt;
                    }
                } else if (this.f52179o.getDecoratedEnd(view) < this.f52179o.getDecoratedEnd(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View z(int i10) {
        View viewC = C(getChildCount() - 1, -1, i10);
        if (viewC == null) {
            return null;
        }
        return A(viewC, this.f52173i.get(this.f52174j.f52259c[getPosition(viewC)]));
    }

    int H(int i10) {
        return this.f52174j.f52259c[i10];
    }

    boolean K() {
        return this.f52171g;
    }

    @Override // com.google.android.flexbox.d
    public void a(View view, int i10, int i11, f fVar) {
        calculateItemDecorationsForChild(view, C);
        if (k()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            fVar.f52237e += leftDecorationWidth;
            fVar.f52238f += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            fVar.f52237e += topDecorationHeight;
            fVar.f52238f += topDecorationHeight;
        }
    }

    @Override // com.google.android.flexbox.d
    public View b(int i10) {
        View view = this.f52187w.get(i10);
        return view != null ? view : this.f52175k.getViewForPosition(i10);
    }

    @Override // com.google.android.flexbox.d
    public int c(int i10, int i11, int i12) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i11, i12, canScrollVertically());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.f52167c == 0) {
            return k();
        }
        if (k()) {
            int width = getWidth();
            View view = this.f52189y;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.f52167c == 0) {
            return !k();
        }
        if (k()) {
            return true;
        }
        int height = getHeight();
        View view = this.f52189y;
        return height > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        int i11 = i10 < getPosition(getChildAt(0)) ? -1 : 1;
        return k() ? new PointF(0.0f, i11) : new PointF(i11, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // com.google.android.flexbox.d
    public int d(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (k()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // com.google.android.flexbox.d
    public View e(int i10) {
        return b(i10);
    }

    @Override // com.google.android.flexbox.d
    public int f(View view, int i10, int i11) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (k()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewB = B(0, getChildCount(), true);
        if (viewB == null) {
            return -1;
        }
        return getPosition(viewB);
    }

    public int findFirstVisibleItemPosition() {
        View viewB = B(0, getChildCount(), false);
        if (viewB == null) {
            return -1;
        }
        return getPosition(viewB);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewB = B(getChildCount() - 1, -1, true);
        if (viewB == null) {
            return -1;
        }
        return getPosition(viewB);
    }

    public int findLastVisibleItemPosition() {
        View viewB = B(getChildCount() - 1, -1, false);
        if (viewB == null) {
            return -1;
        }
        return getPosition(viewB);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.d
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.d
    public int getAlignItems() {
        return this.f52169e;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexDirection() {
        return this.f52166b;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexItemCount() {
        return this.f52176l.getItemCount();
    }

    @Override // com.google.android.flexbox.d
    public List<f> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f52173i.size());
        int size = this.f52173i.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f52173i.get(i10);
            if (fVar.c() != 0) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.d
    public List<f> getFlexLinesInternal() {
        return this.f52173i;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexWrap() {
        return this.f52167c;
    }

    @Override // com.google.android.flexbox.d
    public int getJustifyContent() {
        return this.f52168d;
    }

    @Override // com.google.android.flexbox.d
    public int getLargestMainSize() {
        if (this.f52173i.size() == 0) {
            return 0;
        }
        int iMax = Integer.MIN_VALUE;
        int size = this.f52173i.size();
        for (int i10 = 0; i10 < size; i10++) {
            iMax = Math.max(iMax, this.f52173i.get(i10).f52237e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.d
    public int getMaxLine() {
        return this.f52170f;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.f52186v;
    }

    @Override // com.google.android.flexbox.d
    public int getSumOfCrossSize() {
        int size = this.f52173i.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.f52173i.get(i11).f52239g;
        }
        return i10;
    }

    @Override // com.google.android.flexbox.d
    public int h(int i10, int i11, int i12) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i11, i12, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.d
    public void i(f fVar) {
    }

    @Override // com.google.android.flexbox.d
    public void j(int i10, View view) {
        this.f52187w.put(i10, view);
    }

    @Override // com.google.android.flexbox.d
    public boolean k() {
        int i10 = this.f52166b;
        return i10 == 0 || i10 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f52189y = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f52186v) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@n0 RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        X(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(@n0 RecyclerView recyclerView, int i10, int i11, int i12) {
        super.onItemsMoved(recyclerView, i10, i11, i12);
        X(Math.min(i10, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@n0 RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        X(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@n0 RecyclerView recyclerView, int i10, int i11) {
        super.onItemsUpdated(recyclerView, i10, i11);
        X(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@n0 RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.onItemsUpdated(recyclerView, i10, i11, obj);
        X(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i10;
        int i11;
        this.f52175k = recycler;
        this.f52176l = state;
        int itemCount = state.getItemCount();
        if (itemCount == 0 && state.isPreLayout()) {
            return;
        }
        T();
        v();
        ensureLayoutState();
        this.f52174j.t(itemCount);
        this.f52174j.u(itemCount);
        this.f52174j.s(itemCount);
        this.f52177m.f52224j = false;
        SavedState savedState = this.f52181q;
        if (savedState != null && savedState.j(itemCount)) {
            this.f52182r = this.f52181q.f52200b;
        }
        if (!this.f52178n.f52208f || this.f52182r != -1 || this.f52181q != null) {
            this.f52178n.s();
            W(state, this.f52178n);
            this.f52178n.f52208f = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (this.f52178n.f52207e) {
            b0(this.f52178n, false, true);
        } else {
            a0(this.f52178n, false, true);
        }
        Y(itemCount);
        if (this.f52178n.f52207e) {
            w(recycler, state, this.f52177m);
            i11 = this.f52177m.f52219e;
            a0(this.f52178n, true, false);
            w(recycler, state, this.f52177m);
            i10 = this.f52177m.f52219e;
        } else {
            w(recycler, state, this.f52177m);
            i10 = this.f52177m.f52219e;
            b0(this.f52178n, true, false);
            w(recycler, state, this.f52177m);
            i11 = this.f52177m.f52219e;
        }
        if (getChildCount() > 0) {
            if (this.f52178n.f52207e) {
                fixLayoutStartGap(i11 + fixLayoutEndGap(i10, recycler, state, true), recycler, state, false);
            } else {
                fixLayoutEndGap(i10 + fixLayoutStartGap(i11, recycler, state, true), recycler, state, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f52181q = null;
        this.f52182r = -1;
        this.f52183s = Integer.MIN_VALUE;
        this.f52190z = -1;
        this.f52178n.s();
        this.f52187w.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f52181q = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f52181q != null) {
            return new SavedState(this.f52181q);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            View childClosestToStart = getChildClosestToStart();
            savedState.f52200b = getPosition(childClosestToStart);
            savedState.f52201c = this.f52179o.getDecoratedStart(childClosestToStart) - this.f52179o.getStartAfterPadding();
        } else {
            savedState.k();
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!k() || (this.f52167c == 0 && k())) {
            int I = I(i10, recycler, state);
            this.f52187w.clear();
            return I;
        }
        int iJ = J(i10);
        this.f52178n.f52206d += iJ;
        this.f52180p.offsetChildren(-iJ);
        return iJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.f52182r = i10;
        this.f52183s = Integer.MIN_VALUE;
        SavedState savedState = this.f52181q;
        if (savedState != null) {
            savedState.k();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (k() || (this.f52167c == 0 && !k())) {
            int I = I(i10, recycler, state);
            this.f52187w.clear();
            return I;
        }
        int iJ = J(i10);
        this.f52178n.f52206d += iJ;
        this.f52180p.offsetChildren(-iJ);
        return iJ;
    }

    @Override // com.google.android.flexbox.d
    public void setAlignContent(int i10) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    @Override // com.google.android.flexbox.d
    public void setAlignItems(int i10) {
        int i11 = this.f52169e;
        if (i11 != i10) {
            if (i11 == 4 || i10 == 4) {
                removeAllViews();
                u();
            }
            this.f52169e = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setFlexDirection(int i10) {
        if (this.f52166b != i10) {
            removeAllViews();
            this.f52166b = i10;
            this.f52179o = null;
            this.f52180p = null;
            u();
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setFlexLines(List<f> list) {
        this.f52173i = list;
    }

    @Override // com.google.android.flexbox.d
    public void setFlexWrap(int i10) {
        if (i10 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i11 = this.f52167c;
        if (i11 != i10) {
            if (i11 == 0 || i10 == 0) {
                removeAllViews();
                u();
            }
            this.f52167c = i10;
            this.f52179o = null;
            this.f52180p = null;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setJustifyContent(int i10) {
        if (this.f52168d != i10) {
            this.f52168d = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setMaxLine(int i10) {
        if (this.f52170f != i10) {
            this.f52170f = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.f52186v = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(linearSmoothScroller);
    }
}
