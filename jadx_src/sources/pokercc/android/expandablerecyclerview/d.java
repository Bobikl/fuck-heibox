package pokercc.android.expandablerecyclerview;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.igexin.assist.sdk.AssistPushConsts;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: StickyHeader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u001b\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0\u001f¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lpokercc/android/expandablerecyclerview/d;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "g", "Landroid/graphics/Canvas;", ak.aF, "p", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "Lkotlin/b2;", "onDraw", "", "b", "I", "headerGroup", "Ljava/lang/Integer;", "headerType", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;", "d", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;", "header", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter;", "e", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter;", "adapter", "pokercc/android/expandablerecyclerview/d$a", "f", "Lpokercc/android/expandablerecyclerview/d$a;", "changeObservable", "Lkotlin/Function2;", "Landroid/view/View;", "", "onShowHeader", "<init>", "(Lyh/p;)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
public final class d extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int headerGroup;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Integer headerType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ExpandableAdapter.c header;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ExpandableAdapter<ExpandableAdapter.c> adapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a changeObservable;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p<View, Float, b2> f138522g;

    /* JADX INFO: compiled from: StickyHeader.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"pokercc/android/expandablerecyclerview/d$a", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "", "positionStart", "itemCount", "", AssistPushConsts.MSG_TYPE_PAYLOAD, "Lkotlin/b2;", "onItemRangeChanged", "onChanged", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class a extends RecyclerView.AdapterDataObserver {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
            d.this.headerGroup = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11, @dl.e Object obj) {
            ExpandableAdapter.c cVar;
            List<Object> arrayList;
            super.onItemRangeChanged(i10, i11, obj);
            ExpandableAdapter expandableAdapter = d.this.adapter;
            if (expandableAdapter == null || (cVar = d.this.header) == null) {
                return;
            }
            int iZ = expandableAdapter.z(d.this.headerGroup);
            int i12 = i11 + i10;
            if (i10 <= iZ && i12 >= iZ) {
                if (obj == null || (arrayList = CollectionsKt__CollectionsKt.P(obj)) == null) {
                    arrayList = new ArrayList<>();
                }
                expandableAdapter.onBindViewHolder(cVar, iZ, arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.d p<? super View, ? super Float, b2> onShowHeader) {
        f0.p(onShowHeader, "onShowHeader");
        this.f138522g = onShowHeader;
        this.headerGroup = -1;
        this.changeObservable = new a();
    }

    private final RecyclerView.ViewHolder g(RecyclerView recyclerView) {
        View next;
        boolean z10;
        Iterator<View> it = ViewGroupKt.e(recyclerView).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            View view = next;
            z10 = false;
            float f10 = 0;
            if (view.getY() <= f10 && view.getY() + view.getHeight() > f10) {
                z10 = true;
            }
        } while (!z10);
        View view2 = next;
        if (view2 != null) {
            return recyclerView.getChildViewHolder(view2);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@dl.d Canvas c10, @dl.d RecyclerView p10, @dl.d RecyclerView.State state) {
        ExpandableAdapter.ItemPosition itemPositionF;
        float height;
        Integer num;
        f0.p(c10, "c");
        f0.p(p10, "p");
        f0.p(state, "state");
        super.onDraw(c10, p10, state);
        if (!(p10 instanceof ExpandableRecyclerView)) {
            p10 = null;
        }
        ExpandableRecyclerView expandableRecyclerView = (ExpandableRecyclerView) p10;
        if (expandableRecyclerView != null) {
            RecyclerView.Adapter adapter = expandableRecyclerView.getAdapter();
            if (!(adapter instanceof ExpandableAdapter)) {
                adapter = null;
            }
            ExpandableAdapter<ExpandableAdapter.c> expandableAdapter = (ExpandableAdapter) adapter;
            if (expandableAdapter != null) {
                if (!f0.g(this.adapter, expandableAdapter)) {
                    ExpandableAdapter<ExpandableAdapter.c> expandableAdapter2 = this.adapter;
                    if (expandableAdapter2 != null) {
                        expandableAdapter2.unregisterAdapterDataObserver(this.changeObservable);
                    }
                    expandableAdapter.registerAdapterDataObserver(this.changeObservable);
                    this.adapter = expandableAdapter;
                    this.header = null;
                }
                RecyclerView.ViewHolder viewHolderG = g(expandableRecyclerView);
                if (viewHolderG == null || (itemPositionF = expandableAdapter.F(viewHolderG)) == null) {
                    return;
                }
                int iF = itemPositionF.f();
                int iB = expandableAdapter.B(iF);
                if (this.header == null || (num = this.headerType) == null || num.intValue() != iB) {
                    this.headerGroup = -1;
                    this.headerType = Integer.valueOf(iB);
                    this.header = expandableAdapter.onCreateViewHolder(expandableRecyclerView, iB);
                }
                ExpandableAdapter.c cVar = this.header;
                if (cVar != null) {
                    if (this.headerGroup != iF) {
                        expandableAdapter.onBindViewHolder(cVar, expandableAdapter.z(iF), new ArrayList());
                        this.headerGroup = iF;
                    }
                    RecyclerView.ViewHolder viewHolderJ = expandableRecyclerView.j(iF + 1);
                    View view = viewHolderJ != null ? viewHolderJ.itemView : null;
                    if (view != null) {
                        float y10 = view.getY();
                        View view2 = cVar.itemView;
                        f0.o(view2, "headerViewHolder.itemView");
                        height = y10 - view2.getHeight();
                    } else {
                        height = 0.0f;
                    }
                    float fA = u.A(height, 0.0f);
                    p<View, Float, b2> pVar = this.f138522g;
                    View view3 = cVar.itemView;
                    f0.o(view3, "headerViewHolder.itemView");
                    pVar.invoke(view3, Float.valueOf(fA));
                }
            }
        }
    }
}
