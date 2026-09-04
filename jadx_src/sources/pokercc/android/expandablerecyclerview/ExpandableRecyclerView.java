package pokercc.android.expandablerecyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.core.view.ViewGroupKt;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.s0;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: ExpandableRecyclerView.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 82\u00020\u0001:\u00029:B'\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00105\u001a\u00020%¢\u0006\u0004\b6\u00107J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0016\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010H\u0016J\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013J\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J9\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010!\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00172\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u001cJ*\u0010$\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\"H\u0005J\u0010\u0010'\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020%J\u0018\u0010)\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020%J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020-H\u0014J\u0012\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010-H\u0014¨\u0006;"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "child", "", "x", "y", "", "f", "Landroid/graphics/Canvas;", ak.aF, "Lkotlin/b2;", "draw", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", com.google.android.exoplayer2.text.ttml.d.f49813w, "setLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "setAdapter", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter;", "k", "getExpandableAdapter", "canvas", "Landroid/view/View;", "", "drawingTime", "drawChild", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "drawAction", "g", "(Landroid/graphics/Canvas;Landroid/view/View;Lyh/l;)Ljava/lang/Object;", "drawOperate", RXScreenCaptureService.KEY_HEIGHT, "Landroid/graphics/PointF;", "outLocalPoint", "isTransformedTouchPointInView", "", "groupLayoutPosition", "j", "childLayoutPosition", "i", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "Landroid/os/Parcelable;", "onSaveInstanceState", "state", "onRestoreInstanceState", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "d", ak.av, "SavedState", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
public class ExpandableRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f138414b = "ExpandableRecyclerView";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f138415c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ExpandableRecyclerView.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB\u001b\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\t\u0010\r¨\u0006\u0016"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView$SavedState;", "Landroidx/customview/view/AbsSavedState;", "Landroid/os/Parcel;", "dest", "", Constants.KEY_FLAGS, "Lkotlin/b2;", "writeToParcel", "Landroid/os/Parcelable;", "b", "Landroid/os/Parcelable;", ak.av, "()Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "expandState", "in", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "superState", "CREATOR", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class SavedState extends AbsSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Parcelable expandState;

        /* JADX INFO: renamed from: pokercc.android.expandablerecyclerview.ExpandableRecyclerView$SavedState$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: ExpandableRecyclerView.kt */
        @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView$SavedState$a;", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView$SavedState;", "Landroid/os/Parcel;", "in", "Ljava/lang/ClassLoader;", "loader", "b", ak.av, "", UiKitSpanObj.TYPE_SIZE, "", ak.aF, "(I)[Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView$SavedState;", "<init>", "()V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
        public static final class Companion implements Parcelable.ClassLoaderCreator<SavedState> {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@dl.d Parcel in) {
                f0.p(in, "in");
                return new SavedState(in, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @dl.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@dl.d Parcel in, @dl.d ClassLoader loader) {
                f0.p(in, "in");
                f0.p(loader, "loader");
                return new SavedState(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            @dl.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@dl.d Parcel in, @dl.e ClassLoader classLoader) {
            super(in, classLoader);
            f0.p(in, "in");
            this.expandState = in.readParcelable(classLoader == null ? ExpandableAdapter.class.getClassLoader() : classLoader);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@dl.d Parcelable superState) {
            super(superState);
            f0.p(superState, "superState");
        }

        @dl.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getExpandState() {
            return this.expandState;
        }

        public final void b(@dl.e Parcelable parcelable) {
            this.expandState = parcelable;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@dl.d Parcel dest, int i10) {
            f0.p(dest, "dest");
            super.writeToParcel(dest, i10);
            dest.writeParcelable(this.expandState, 0);
        }
    }

    /* JADX INFO: renamed from: pokercc.android.expandablerecyclerview.ExpandableRecyclerView$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ExpandableRecyclerView.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView$a;", "", "", "DEBUG", "Z", ak.av, "()Z", "getDEBUG$annotations", "()V", "", "LOG_TAG", "Ljava/lang/String;", "<init>", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        public final boolean a() {
            return ExpandableRecyclerView.f138415c;
        }
    }

    @i
    public ExpandableRecyclerView(@dl.d Context context) {
        this(context, null, 0, 6, null);
    }

    @i
    public ExpandableRecyclerView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public ExpandableRecyclerView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    public /* synthetic */ ExpandableRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final boolean f(RecyclerView.ViewHolder child, float x10, float y10) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        f0.o(layoutManager, "layoutManager ?: return false");
        int iF = k().F(child).f();
        RecyclerView.ViewHolder viewHolderJ = j(iF);
        View view = viewHolderJ != null ? viewHolderJ.itemView : null;
        float y11 = view != null ? view.getY() + view.getHeight() + layoutManager.getBottomDecorationHeight(view) : 0.0f;
        RecyclerView.ViewHolder viewHolderJ2 = j(iF + 1);
        View view2 = viewHolderJ2 != null ? viewHolderJ2.itemView : null;
        float y12 = view2 != null ? view2.getY() - layoutManager.getTopDecorationHeight(view2) : getHeight();
        View view3 = child.itemView;
        f0.o(view3, "child.itemView");
        return x10 >= ((float) view3.getLeft()) && x10 <= ((float) view3.getRight()) && y10 >= Math.max(view3.getY(), y11) && y10 <= Math.min(view3.getY() + ((float) view3.getHeight()), y12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(@dl.d Canvas c10) {
        f0.p(c10, "c");
        super.draw(c10);
        if (getItemDecorationCount() == 0 && isAnimating()) {
            postInvalidateOnAnimation();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(@dl.d Canvas canvas, @dl.d View child, long drawingTime) {
        float y10;
        float height;
        View it;
        View it2;
        f0.p(canvas, "canvas");
        f0.p(child, "child");
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(child);
        if (childViewHolder == null) {
            throw new NullPointerException("null cannot be cast to non-null type pokercc.android.expandablerecyclerview.ExpandableAdapter.ViewHolder");
        }
        ExpandableAdapter.c cVar = (ExpandableAdapter.c) childViewHolder;
        if (!isAnimating() || k().I(cVar.getItemViewType())) {
            cVar.getItemClipper().a();
            return super.drawChild(canvas, child, drawingTime);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int iA = k().F(cVar).getGroupPosition();
        RecyclerView.ViewHolder viewHolderJ = j(iA);
        if (viewHolderJ == null || (it2 = viewHolderJ.itemView) == null) {
            y10 = 0.0f;
        } else {
            f0.o(it2, "it");
            y10 = it2.getY() + it2.getHeight() + layoutManager.getBottomDecorationHeight(it2);
        }
        float topDecorationHeight = y10 + layoutManager.getTopDecorationHeight(child);
        RecyclerView.ViewHolder viewHolderJ2 = j(iA + 1);
        if (viewHolderJ2 == null || (it = viewHolderJ2.itemView) == null) {
            height = getHeight();
        } else {
            f0.o(it, "it");
            height = it.getY() - layoutManager.getTopDecorationHeight(it);
        }
        cVar.getItemClipper().c(0.0f, topDecorationHeight, getWidth(), height - layoutManager.getBottomDecorationHeight(child));
        if (f138415c) {
            Log.d(f138414b, "drawChild,holder:" + cVar);
        }
        if (cVar.getItemClipper().b()) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @k(message = "Deprecated", replaceWith = @s0(expression = "clipByChildBound", imports = {}))
    public final <T> T g(@dl.d Canvas canvas, @dl.d View child, @dl.d l<? super Canvas, ? extends T> drawAction) {
        float y10;
        float height;
        View it;
        View it2;
        f0.p(canvas, "canvas");
        f0.p(child, "child");
        f0.p(drawAction, "drawAction");
        RecyclerView.ViewHolder holder = getChildViewHolder(child);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (isAnimating()) {
            ExpandableAdapter<?> expandableAdapterK = k();
            f0.o(holder, "holder");
            if (!expandableAdapterK.I(holder.getItemViewType())) {
                int iA = k().F(holder).getGroupPosition();
                RecyclerView.ViewHolder viewHolderJ = j(iA);
                if (viewHolderJ == null || (it2 = viewHolderJ.itemView) == null) {
                    y10 = 0.0f;
                } else {
                    f0.o(it2, "it");
                    y10 = it2.getY() + it2.getHeight() + layoutManager.getBottomDecorationHeight(it2);
                }
                float topDecorationHeight = y10 + layoutManager.getTopDecorationHeight(child);
                RecyclerView.ViewHolder viewHolderJ2 = j(iA + 1);
                if (viewHolderJ2 == null || (it = viewHolderJ2.itemView) == null) {
                    height = getHeight();
                } else {
                    f0.o(it, "it");
                    height = it.getY() - layoutManager.getTopDecorationHeight(it);
                }
                float bottomDecorationHeight = height - layoutManager.getBottomDecorationHeight(child);
                if (f138415c) {
                    Log.d(f138414b, "clipAndDrawChild,holder:" + holder);
                }
                int iSave = canvas.save();
                try {
                    canvas.clipRect(0.0f, topDecorationHeight, getWidth(), bottomDecorationHeight);
                    return drawAction.invoke(canvas);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
        return drawAction.invoke(canvas);
    }

    @dl.e
    public final ExpandableAdapter<?> getExpandableAdapter() {
        RecyclerView.Adapter adapter = getAdapter();
        if (!(adapter instanceof ExpandableAdapter)) {
            adapter = null;
        }
        return (ExpandableAdapter) adapter;
    }

    public final void h(@dl.d Canvas canvas, @dl.d View child, @dl.d l<? super Canvas, b2> drawOperate) {
        float y10;
        float height;
        View it;
        View it2;
        f0.p(canvas, "canvas");
        f0.p(child, "child");
        f0.p(drawOperate, "drawOperate");
        RecyclerView.ViewHolder holder = getChildViewHolder(child);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (isAnimating()) {
            ExpandableAdapter<?> expandableAdapterK = k();
            f0.o(holder, "holder");
            if (!expandableAdapterK.I(holder.getItemViewType())) {
                int iA = k().F(holder).getGroupPosition();
                RecyclerView.ViewHolder viewHolderJ = j(iA);
                if (viewHolderJ == null || (it2 = viewHolderJ.itemView) == null) {
                    y10 = 0.0f;
                } else {
                    f0.o(it2, "it");
                    y10 = it2.getY() + it2.getHeight() + layoutManager.getBottomDecorationHeight(it2);
                }
                float topDecorationHeight = y10 + layoutManager.getTopDecorationHeight(child);
                RecyclerView.ViewHolder viewHolderJ2 = j(iA + 1);
                if (viewHolderJ2 == null || (it = viewHolderJ2.itemView) == null) {
                    height = getHeight();
                } else {
                    f0.o(it, "it");
                    height = it.getY() - layoutManager.getTopDecorationHeight(it);
                }
                float bottomDecorationHeight = height - layoutManager.getBottomDecorationHeight(child);
                if (f138415c) {
                    Log.d(f138414b, "clipByChildBound,holder:" + holder);
                }
                int iSave = canvas.save();
                try {
                    canvas.clipRect(0.0f, topDecorationHeight, getWidth(), bottomDecorationHeight);
                    drawOperate.invoke(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
        drawOperate.invoke(canvas);
    }

    @dl.e
    public final RecyclerView.ViewHolder i(int groupLayoutPosition, int childLayoutPosition) {
        Integer numE;
        Iterator<View> it = ViewGroupKt.e(this).iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder viewHolder = getChildViewHolder(it.next());
            ExpandableAdapter<?> expandableAdapterK = k();
            f0.o(viewHolder, "viewHolder");
            if (!expandableAdapterK.I(viewHolder.getItemViewType())) {
                ExpandableAdapter.ItemPosition bVarF = k().F(viewHolder);
                if (groupLayoutPosition == bVarF.f() && (numE = bVarF.e()) != null && childLayoutPosition == numE.intValue()) {
                    return viewHolder;
                }
            }
        }
        return null;
    }

    @Keep
    protected final boolean isTransformedTouchPointInView(float x10, float y10, @dl.d View child, @dl.e PointF outLocalPoint) {
        f0.p(child, "child");
        if (outLocalPoint != null) {
            outLocalPoint.set(x10, y10);
            outLocalPoint.x += getScrollX() + child.getLeft();
            outLocalPoint.y += getScrollY() + child.getTop();
        }
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(child);
        if (isAnimating()) {
            ExpandableAdapter<?> expandableAdapterK = k();
            f0.o(childViewHolder, "childViewHolder");
            if (!expandableAdapterK.I(childViewHolder.getItemViewType())) {
                return f(childViewHolder, x10, y10);
            }
        }
        return x10 >= child.getX() && x10 <= child.getX() + ((float) child.getWidth()) && y10 >= child.getY() && y10 <= child.getY() + ((float) child.getHeight());
    }

    @dl.e
    public final RecyclerView.ViewHolder j(int groupLayoutPosition) {
        Iterator<View> it = ViewGroupKt.e(this).iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder viewHolder = getChildViewHolder(it.next());
            ExpandableAdapter<?> expandableAdapterK = k();
            f0.o(viewHolder, "viewHolder");
            if (expandableAdapterK.I(viewHolder.getItemViewType()) && groupLayoutPosition == k().F(viewHolder).f()) {
                return viewHolder;
            }
        }
        return null;
    }

    @dl.d
    public final ExpandableAdapter<?> k() {
        ExpandableAdapter<?> expandableAdapter = getExpandableAdapter();
        if (expandableAdapter != null) {
            return expandableAdapter;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onRestoreInstanceState(@dl.e Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ExpandableAdapter<?> expandableAdapter = getExpandableAdapter();
        if (expandableAdapter != null) {
            expandableAdapter.h0(savedState.getExpandState());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @dl.d
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        f0.m(parcelableOnSaveInstanceState);
        f0.o(parcelableOnSaveInstanceState, "super.onSaveInstanceState()!!");
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        ExpandableAdapter<?> expandableAdapter = getExpandableAdapter();
        savedState.b(expandableAdapter != null ? expandableAdapter.i0() : null);
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@dl.e RecyclerView.Adapter<?> adapter) {
        if (adapter != null && !(adapter instanceof ExpandableAdapter)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        super.setAdapter(adapter);
        if (adapter == null || (getItemAnimator() instanceof b)) {
            return;
        }
        setItemAnimator(new b(this, 0L, false, 6, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(@dl.e RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            if (!(((LinearLayoutManager) layoutManager).getOrientation() != 0)) {
                throw new IllegalStateException("Unsupported horizontal orientation.".toString());
            }
        }
        super.setLayoutManager(layoutManager);
    }

    @Override // android.view.View
    public void setLayoutParams(@dl.d ViewGroup.LayoutParams params) {
        f0.p(params, "params");
        if (!(params.height >= -1)) {
            throw new IllegalArgumentException("ExpandableRecyclerView height must be static size or MATCH_PARENT".toString());
        }
        super.setLayoutParams(params);
    }
}
