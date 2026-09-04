package pokercc.android.expandablerecyclerview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ExpandableItemAnimator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u0000 J2\u00020\u0001:\u0003/\"\rB%\b\u0007\u0012\u0006\u0010S\u001a\u00020Q\u0012\b\b\u0002\u0010Z\u001a\u00020Y\u0012\b\b\u0002\u0010U\u001a\u00020\u000e¢\u0006\u0004\b[\u0010\\J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0016J0\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J0\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J:\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\u0006\u0010%\u001a\u00020\nJ\b\u0010&\u001a\u00020\nH\u0016J\u0016\u0010)\u001a\u00020\n2\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0'J\u001e\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'H\u0016R\u0014\u00101\u001a\u00020.8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000206028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R.\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b02028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00103\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R.\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020602028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00103\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R.\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000602028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00103\u001a\u0004\bC\u0010;\"\u0004\bD\u0010=R*\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00103\u001a\u0004\b?\u0010;\"\u0004\bG\u0010=R*\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00103\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010=R*\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00103\u001a\u0004\bL\u0010;\"\u0004\bM\u0010=R*\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00103\u001a\u0004\bF\u0010;\"\u0004\bO\u0010=R\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010RR\u0014\u0010U\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010TR\u0018\u0010X\u001a\u0006\u0012\u0002\b\u00030V8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010W¨\u0006]"}, d2 = {"Lpokercc/android/expandablerecyclerview/b;", "Landroidx/recyclerview/widget/SimpleItemAnimator;", "", "groupPosition", "f", "", "Lpokercc/android/expandablerecyclerview/b$a;", "infoList", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ChannelListActivity.q.f79586f, "Lkotlin/b2;", "endChangeAnimation", "changeInfo", ak.aF, "", "d", "holder", "resetAnimation", "runPendingAnimations", "animateRemove", "animateRemoveImpl", "animateAdd", "animateAddImpl", "fX", "fY", "toX", "toY", "animateMove", "fromX", "fromY", "animateMoveImpl", "oldHolder", "newHolder", "animateChange", "b", "endAnimation", "isRunning", "dispatchFinishedWhenDone", "endAnimations", "", "viewHolders", "cancelAll", "viewHolder", "", "payloads", "canReuseUpdatedViewHolder", "", ak.av, "F", "animValue", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "mPendingRemovals", "mPendingAdditions", "Lpokercc/android/expandablerecyclerview/b$c;", "mPendingMoves", "e", "mPendingChanges", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/util/ArrayList;", "o", "(Ljava/util/ArrayList;)V", "mAdditionsList", "g", "l", ak.aB, "mMovesList", "j", "q", "mChangesList", "i", "n", "mAddAnimations", "k", "r", "mMoveAnimations", "m", "t", "mRemoveAnimations", "p", "mChangeAnimations", "Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView;", "Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView;", "expandableRecyclerView", "Z", "animChildrenItem", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter;", "()Lpokercc/android/expandablerecyclerview/ExpandableAdapter;", "expandableAdapter", "", "animDuration", "<init>", "(Lpokercc/android/expandablerecyclerview/ExpandableRecyclerView;JZ)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
public class b extends SimpleItemAnimator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f138449o = "ExpandableItemAnimator";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f138450p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static TimeInterpolator f138451q;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float animValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<RecyclerView.ViewHolder> mPendingRemovals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<RecyclerView.ViewHolder> mPendingAdditions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<MoveInfo> mPendingMoves;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<ChangeInfo> mPendingChanges;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<ArrayList<RecyclerView.ViewHolder>> mAdditionsList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<ArrayList<MoveInfo>> mMovesList;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<ArrayList<ChangeInfo>> mChangesList;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<RecyclerView.ViewHolder> mAddAnimations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<RecyclerView.ViewHolder> mMoveAnimations;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<RecyclerView.ViewHolder> mRemoveAnimations;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<RecyclerView.ViewHolder> mChangeAnimations;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ExpandableRecyclerView expandableRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean animChildrenItem;

    /* JADX INFO: renamed from: pokercc.android.expandablerecyclerview.b$a, reason: from toString */
    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003JI\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"¨\u0006+"}, d2 = {"Lpokercc/android/expandablerecyclerview/b$a;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ak.av, "b", "", ak.aF, "d", "e", "f", "oldHolder", "newHolder", "fromX", "fromY", "toX", "toY", "g", "", "toString", "hashCode", "other", "", "equals", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "l", "()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "r", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "k", "q", "I", "i", "()I", "o", "(I)V", "j", "p", "m", ak.aB, "n", "t", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class ChangeInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.e
        private RecyclerView.ViewHolder oldHolder;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.e
        private RecyclerView.ViewHolder newHolder;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private int fromX;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private int fromY;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private int toX;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private int toY;

        public ChangeInfo(@dl.e RecyclerView.ViewHolder viewHolder, @dl.e RecyclerView.ViewHolder viewHolder2, int i10, int i11, int i12, int i13) {
            this.oldHolder = viewHolder;
            this.newHolder = viewHolder2;
            this.fromX = i10;
            this.fromY = i11;
            this.toX = i12;
            this.toY = i13;
        }

        public /* synthetic */ ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i10, int i11, int i12, int i13, int i14, u uVar) {
            this(viewHolder, viewHolder2, (i14 & 4) != 0 ? 0 : i10, (i14 & 8) != 0 ? 0 : i11, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? 0 : i13);
        }

        public static /* synthetic */ ChangeInfo h(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                viewHolder = changeInfo.oldHolder;
            }
            if ((i14 & 2) != 0) {
                viewHolder2 = changeInfo.newHolder;
            }
            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
            if ((i14 & 4) != 0) {
                i10 = changeInfo.fromX;
            }
            int i15 = i10;
            if ((i14 & 8) != 0) {
                i11 = changeInfo.fromY;
            }
            int i16 = i11;
            if ((i14 & 16) != 0) {
                i12 = changeInfo.toX;
            }
            int i17 = i12;
            if ((i14 & 32) != 0) {
                i13 = changeInfo.toY;
            }
            return changeInfo.g(viewHolder, viewHolder3, i15, i16, i17, i13);
        }

        @dl.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RecyclerView.ViewHolder getOldHolder() {
            return this.oldHolder;
        }

        @dl.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final RecyclerView.ViewHolder getNewHolder() {
            return this.newHolder;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getFromX() {
            return this.fromX;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getFromY() {
            return this.fromY;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getToX() {
            return this.toX;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeInfo)) {
                return false;
            }
            ChangeInfo changeInfo = (ChangeInfo) other;
            return f0.g(this.oldHolder, changeInfo.oldHolder) && f0.g(this.newHolder, changeInfo.newHolder) && this.fromX == changeInfo.fromX && this.fromY == changeInfo.fromY && this.toX == changeInfo.toX && this.toY == changeInfo.toY;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getToY() {
            return this.toY;
        }

        @dl.d
        public final ChangeInfo g(@dl.e RecyclerView.ViewHolder oldHolder, @dl.e RecyclerView.ViewHolder newHolder, int fromX, int fromY, int toX, int toY) {
            return new ChangeInfo(oldHolder, newHolder, fromX, fromY, toX, toY);
        }

        public int hashCode() {
            RecyclerView.ViewHolder viewHolder = this.oldHolder;
            int iHashCode = (viewHolder != null ? viewHolder.hashCode() : 0) * 31;
            RecyclerView.ViewHolder viewHolder2 = this.newHolder;
            return ((((((((iHashCode + (viewHolder2 != null ? viewHolder2.hashCode() : 0)) * 31) + this.fromX) * 31) + this.fromY) * 31) + this.toX) * 31) + this.toY;
        }

        public final int i() {
            return this.fromX;
        }

        public final int j() {
            return this.fromY;
        }

        @dl.e
        public final RecyclerView.ViewHolder k() {
            return this.newHolder;
        }

        @dl.e
        public final RecyclerView.ViewHolder l() {
            return this.oldHolder;
        }

        public final int m() {
            return this.toX;
        }

        public final int n() {
            return this.toY;
        }

        public final void o(int i10) {
            this.fromX = i10;
        }

        public final void p(int i10) {
            this.fromY = i10;
        }

        public final void q(@dl.e RecyclerView.ViewHolder viewHolder) {
            this.newHolder = viewHolder;
        }

        public final void r(@dl.e RecyclerView.ViewHolder viewHolder) {
            this.oldHolder = viewHolder;
        }

        public final void s(int i10) {
            this.toX = i10;
        }

        public final void t(int i10) {
            this.toY = i10;
        }

        @dl.d
        public String toString() {
            return "ChangeInfo(oldHolder=" + this.oldHolder + ", newHolder=" + this.newHolder + ", fromX=" + this.fromX + ", fromY=" + this.fromY + ", toX=" + this.toX + ", toY=" + this.toY + ")";
        }
    }

    /* JADX INFO: renamed from: pokercc.android.expandablerecyclerview.b$c, reason: from toString */
    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006'"}, d2 = {"Lpokercc/android/expandablerecyclerview/b$c;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ak.av, "", "b", ak.aF, "d", "e", "holder", "fromX", "fromY", "toX", "toY", "f", "", "toString", "hashCode", "other", "", "equals", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "j", "()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "o", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "m", "(I)V", "i", "n", "k", "p", "l", "q", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class MoveInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private RecyclerView.ViewHolder holder;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private int fromX;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private int fromY;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private int toX;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private int toY;

        public MoveInfo(@dl.d RecyclerView.ViewHolder holder, int i10, int i11, int i12, int i13) {
            f0.p(holder, "holder");
            this.holder = holder;
            this.fromX = i10;
            this.fromY = i11;
            this.toX = i12;
            this.toY = i13;
        }

        public static /* synthetic */ MoveInfo g(MoveInfo moveInfo, RecyclerView.ViewHolder viewHolder, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                viewHolder = moveInfo.holder;
            }
            if ((i14 & 2) != 0) {
                i10 = moveInfo.fromX;
            }
            int i15 = i10;
            if ((i14 & 4) != 0) {
                i11 = moveInfo.fromY;
            }
            int i16 = i11;
            if ((i14 & 8) != 0) {
                i12 = moveInfo.toX;
            }
            int i17 = i12;
            if ((i14 & 16) != 0) {
                i13 = moveInfo.toY;
            }
            return moveInfo.f(viewHolder, i15, i16, i17, i13);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RecyclerView.ViewHolder getHolder() {
            return this.holder;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFromX() {
            return this.fromX;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getFromY() {
            return this.fromY;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getToX() {
            return this.toX;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getToY() {
            return this.toY;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoveInfo)) {
                return false;
            }
            MoveInfo moveInfo = (MoveInfo) other;
            return f0.g(this.holder, moveInfo.holder) && this.fromX == moveInfo.fromX && this.fromY == moveInfo.fromY && this.toX == moveInfo.toX && this.toY == moveInfo.toY;
        }

        @dl.d
        public final MoveInfo f(@dl.d RecyclerView.ViewHolder holder, int fromX, int fromY, int toX, int toY) {
            f0.p(holder, "holder");
            return new MoveInfo(holder, fromX, fromY, toX, toY);
        }

        public final int h() {
            return this.fromX;
        }

        public int hashCode() {
            RecyclerView.ViewHolder viewHolder = this.holder;
            return ((((((((viewHolder != null ? viewHolder.hashCode() : 0) * 31) + this.fromX) * 31) + this.fromY) * 31) + this.toX) * 31) + this.toY;
        }

        public final int i() {
            return this.fromY;
        }

        @dl.d
        public final RecyclerView.ViewHolder j() {
            return this.holder;
        }

        public final int k() {
            return this.toX;
        }

        public final int l() {
            return this.toY;
        }

        public final void m(int i10) {
            this.fromX = i10;
        }

        public final void n(int i10) {
            this.fromY = i10;
        }

        public final void o(@dl.d RecyclerView.ViewHolder viewHolder) {
            f0.p(viewHolder, "<set-?>");
            this.holder = viewHolder;
        }

        public final void p(int i10) {
            this.toX = i10;
        }

        public final void q(int i10) {
            this.toY = i10;
        }

        @dl.d
        public String toString() {
            return "MoveInfo(holder=" + this.holder + ", fromX=" + this.fromX + ", fromY=" + this.fromY + ", toX=" + this.toX + ", toY=" + this.toY + ")";
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"pokercc/android/expandablerecyclerview/b$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "Lkotlin/b2;", "onAnimationStart", "onAnimationCancel", "onAnimationEnd", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f138479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f138480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f138481e;

        d(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f138479c = viewHolder;
            this.f138480d = view;
            this.f138481e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138480d.setTranslationY(0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138480d.setTranslationY(0.0f);
            this.f138481e.setListener(null);
            b.this.dispatchAddFinished(this.f138479c);
            b.this.g().remove(this.f138479c);
            b.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            b.this.dispatchAddStarting(this.f138479c);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"pokercc/android/expandablerecyclerview/b$e", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "Lkotlin/b2;", "onAnimationStart", "onAnimationCancel", "onAnimationEnd", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f138483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f138484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f138485e;

        e(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f138483c = viewHolder;
            this.f138484d = view;
            this.f138485e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138484d.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138485e.setListener(null);
            b.this.dispatchAddFinished(this.f138483c);
            b.this.g().remove(this.f138483c);
            b.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            b.this.dispatchAddStarting(this.f138483c);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"pokercc/android/expandablerecyclerview/b$f", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "Lkotlin/b2;", "onAnimationStart", "onAnimationEnd", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ChangeInfo f138487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f138488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f138489e;

        f(ChangeInfo changeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f138487c = changeInfo;
            this.f138488d = viewPropertyAnimator;
            this.f138489e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138488d.setListener(null);
            this.f138489e.setAlpha(1.0f);
            this.f138489e.setTranslationX(0.0f);
            this.f138489e.setTranslationY(0.0f);
            b.this.dispatchChangeFinished(this.f138487c.l(), true);
            b.this.i().remove(this.f138487c.l());
            b.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            b.this.dispatchChangeStarting(this.f138487c.l(), true);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"pokercc/android/expandablerecyclerview/b$g", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "Lkotlin/b2;", "onAnimationStart", "onAnimationEnd", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ChangeInfo f138491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f138492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f138493e;

        g(ChangeInfo changeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f138491c = changeInfo;
            this.f138492d = viewPropertyAnimator;
            this.f138493e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138492d.setListener(null);
            this.f138493e.setAlpha(1.0f);
            this.f138493e.setTranslationX(0.0f);
            this.f138493e.setTranslationY(0.0f);
            b.this.dispatchChangeFinished(this.f138491c.k(), false);
            b.this.i().remove(this.f138491c.k());
            b.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            b.this.dispatchChangeStarting(this.f138491c.k(), false);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"pokercc/android/expandablerecyclerview/b$h", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "Lkotlin/b2;", "onAnimationStart", "onAnimationCancel", "onAnimationEnd", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f138495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f138496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f138497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f138498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f138499g;

        h(RecyclerView.ViewHolder viewHolder, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f138495c = viewHolder;
            this.f138496d = i10;
            this.f138497e = view;
            this.f138498f = i11;
            this.f138499g = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
            if (this.f138496d != 0) {
                this.f138497e.setTranslationX(0.0f);
            }
            if (this.f138498f != 0) {
                this.f138497e.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138499g.setListener(null);
            b.this.dispatchMoveFinished(this.f138495c);
            b.this.k().remove(this.f138495c);
            b.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            b.this.dispatchMoveStarting(this.f138495c);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"pokercc/android/expandablerecyclerview/b$i", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "Lkotlin/b2;", "onAnimationStart", "onAnimationCancel", "onAnimationEnd", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f138501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f138502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f138503e;

        i(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f138501c = viewHolder;
            this.f138502d = view;
            this.f138503e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138502d.setTranslationY(0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138503e.setListener(null);
            this.f138502d.setTranslationY(0.0f);
            b.this.dispatchRemoveFinished(this.f138501c);
            b.this.m().remove(this.f138501c);
            b.this.dispatchFinishedWhenDone();
            b.this.resetAnimation(this.f138501c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            b.this.dispatchRemoveStarting(this.f138501c);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"pokercc/android/expandablerecyclerview/b$j", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "Lkotlin/b2;", "onAnimationStart", "onAnimationEnd", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f138505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f138506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f138507e;

        j(RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f138505c = viewHolder;
            this.f138506d = viewPropertyAnimator;
            this.f138507e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f138506d.setListener(null);
            this.f138507e.setAlpha(1.0f);
            b.this.dispatchRemoveFinished(this.f138505c);
            b.this.m().remove(this.f138505c);
            b.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            b.this.dispatchRemoveStarting(this.f138505c);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/b2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f138509c;

        k(ArrayList arrayList) {
            this.f138509c = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (RecyclerView.ViewHolder holder : this.f138509c) {
                b bVar = b.this;
                f0.o(holder, "holder");
                bVar.animateAddImpl(holder);
            }
            this.f138509c.clear();
            b.this.h().remove(this.f138509c);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/b2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f138511c;

        l(ArrayList arrayList) {
            this.f138511c = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (ChangeInfo change : this.f138511c) {
                b bVar = b.this;
                f0.o(change, "change");
                bVar.b(change);
            }
            this.f138511c.clear();
            b.this.j().remove(this.f138511c);
        }
    }

    /* JADX INFO: compiled from: ExpandableItemAnimator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/b2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class m implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f138513c;

        m(ArrayList arrayList) {
            this.f138513c = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (MoveInfo moveInfo : this.f138513c) {
                b.this.animateMoveImpl(moveInfo.j(), moveInfo.h(), moveInfo.i(), moveInfo.k(), moveInfo.l());
            }
            this.f138513c.clear();
            b.this.l().remove(this.f138513c);
        }
    }

    @xh.i
    public b(@dl.d ExpandableRecyclerView expandableRecyclerView) {
        this(expandableRecyclerView, 0L, false, 6, null);
    }

    @xh.i
    public b(@dl.d ExpandableRecyclerView expandableRecyclerView, long j10) {
        this(expandableRecyclerView, j10, false, 4, null);
    }

    @xh.i
    public b(@dl.d ExpandableRecyclerView expandableRecyclerView, long j10, boolean z10) {
        f0.p(expandableRecyclerView, "expandableRecyclerView");
        this.expandableRecyclerView = expandableRecyclerView;
        this.animChildrenItem = z10;
        this.animValue = 0.2f;
        this.mPendingRemovals = new ArrayList<>();
        this.mPendingAdditions = new ArrayList<>();
        this.mPendingMoves = new ArrayList<>();
        this.mPendingChanges = new ArrayList<>();
        this.mAdditionsList = new ArrayList<>();
        this.mMovesList = new ArrayList<>();
        this.mChangesList = new ArrayList<>();
        this.mAddAnimations = new ArrayList<>();
        this.mMoveAnimations = new ArrayList<>();
        this.mRemoveAnimations = new ArrayList<>();
        this.mChangeAnimations = new ArrayList<>();
        setAddDuration(j10);
        setRemoveDuration(j10);
        setMoveDuration(j10);
        setChangeDuration(j10);
    }

    public /* synthetic */ b(ExpandableRecyclerView expandableRecyclerView, long j10, boolean z10, int i10, u uVar) {
        this(expandableRecyclerView, (i10 & 2) != 0 ? 400L : j10, (i10 & 4) != 0 ? false : z10);
    }

    private final void c(ChangeInfo changeInfo) {
        if (changeInfo.l() != null) {
            d(changeInfo, changeInfo.l());
        }
        if (changeInfo.k() != null) {
            d(changeInfo, changeInfo.k());
        }
    }

    private final boolean d(ChangeInfo changeInfo, RecyclerView.ViewHolder item) {
        boolean z10 = false;
        if (changeInfo.k() == item) {
            changeInfo.q(null);
        } else {
            if (changeInfo.l() != item) {
                return false;
            }
            changeInfo.r(null);
            z10 = true;
        }
        f0.m(item);
        View view = item.itemView;
        f0.o(view, "item!!.itemView");
        view.setAlpha(1.0f);
        View view2 = item.itemView;
        f0.o(view2, "item.itemView");
        view2.setTranslationX(0.0f);
        View view3 = item.itemView;
        f0.o(view3, "item.itemView");
        view3.setTranslationY(0.0f);
        dispatchChangeFinished(item, z10);
        return true;
    }

    private final ExpandableAdapter<?> e() {
        return this.expandableRecyclerView.k();
    }

    private final void endChangeAnimation(List<ChangeInfo> list, RecyclerView.ViewHolder viewHolder) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ChangeInfo changeInfo = list.get(size);
            if (d(changeInfo, viewHolder) && changeInfo.l() == null && changeInfo.k() == null) {
                list.remove(changeInfo);
            }
        }
    }

    private final int f(int groupPosition) {
        int height;
        RecyclerView.ViewHolder viewHolderJ = this.expandableRecyclerView.j(groupPosition);
        int childCount = this.expandableRecyclerView.getChildCount();
        int iU = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View view = this.expandableRecyclerView.getChildAt(i10);
            RecyclerView.ViewHolder viewHolder = this.expandableRecyclerView.getChildViewHolder(view);
            ExpandableAdapter<?> expandableAdapterE = e();
            f0.o(viewHolder, "viewHolder");
            if (!expandableAdapterE.I(viewHolder.getItemViewType()) && e().F(viewHolder).f() == groupPosition) {
                if (viewHolderJ != null) {
                    RecyclerView.LayoutManager layoutManager = this.expandableRecyclerView.getLayoutManager();
                    int bottomDecorationHeight = layoutManager != null ? layoutManager.getBottomDecorationHeight(viewHolderJ.itemView) : 0;
                    View view2 = viewHolderJ.itemView;
                    f0.o(view2, "groupViewHolder.itemView");
                    float y10 = view2.getY() + bottomDecorationHeight;
                    View view3 = viewHolderJ.itemView;
                    f0.o(view3, "groupViewHolder.itemView");
                    float height2 = y10 + view3.getHeight();
                    f0.o(view, "view");
                    height = (int) (height2 - view.getHeight());
                } else {
                    f0.o(view, "view");
                    height = -view.getHeight();
                }
                iU = fi.u.u(iU, Math.abs(view.getTop() - height));
            }
        }
        return iU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetAnimation(RecyclerView.ViewHolder viewHolder) {
        if (f138451q == null) {
            f138451q = new ValueAnimator().getInterpolator();
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = viewHolder.itemView.animate();
        f0.o(viewPropertyAnimatorAnimate, "holder.itemView.animate()");
        viewPropertyAnimatorAnimate.setInterpolator(f138451q);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(@dl.d RecyclerView.ViewHolder holder) {
        f0.p(holder, "holder");
        Log.d(f138449o, "animateAdd(" + holder + ')');
        View view = holder.itemView;
        f0.o(view, "holder.itemView");
        resetAnimation(holder);
        this.mPendingAdditions.add(holder);
        int iF = e().F(holder).f();
        boolean z10 = iF == e().A() - 1;
        if ((z10 || this.animChildrenItem) && !e().I(holder.getItemViewType())) {
            view.setTranslationY(-(z10 ? f(iF) : f(iF) * this.animValue));
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(1.0f);
        }
        return true;
    }

    public void animateAddImpl(@dl.d RecyclerView.ViewHolder holder) {
        f0.p(holder, "holder");
        View view = holder.itemView;
        f0.o(view, "holder.itemView");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mAddAnimations.add(holder);
        view.setAlpha(1.0f);
        int iF = e().F(holder).f();
        boolean z10 = iF == e().A() - 1;
        if ((!z10 && !this.animChildrenItem) || e().I(holder.getItemViewType())) {
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(holder, view, viewPropertyAnimatorAnimate)).start();
            return;
        }
        float f10 = z10 ? f(iF) : f(iF) * this.animValue;
        if (f138450p) {
            Log.d(f138449o, "groupPosition:" + iF + ",maxTranslateY:" + f10);
        }
        view.setTranslationY(-f10);
        viewPropertyAnimatorAnimate.translationY(0.0f).setDuration(getAddDuration()).setListener(new d(holder, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(@dl.d RecyclerView.ViewHolder oldHolder, @dl.e RecyclerView.ViewHolder newHolder, int fromX, int fromY, int toX, int toY) {
        f0.p(oldHolder, "oldHolder");
        Log.d(f138449o, "animateChange(" + oldHolder + ',' + newHolder + ')');
        if (oldHolder == newHolder) {
            return animateMove(oldHolder, fromX, fromY, toX, toY);
        }
        View view = oldHolder.itemView;
        f0.o(view, "oldHolder.itemView");
        float translationX = view.getTranslationX();
        View view2 = oldHolder.itemView;
        f0.o(view2, "oldHolder.itemView");
        float translationY = view2.getTranslationY();
        View view3 = oldHolder.itemView;
        f0.o(view3, "oldHolder.itemView");
        float alpha = view3.getAlpha();
        resetAnimation(oldHolder);
        int i10 = (int) ((toX - fromX) - translationX);
        int i11 = (int) ((toY - fromY) - translationY);
        View view4 = oldHolder.itemView;
        f0.o(view4, "oldHolder.itemView");
        view4.setTranslationX(translationX);
        View view5 = oldHolder.itemView;
        f0.o(view5, "oldHolder.itemView");
        view5.setTranslationY(translationY);
        View view6 = oldHolder.itemView;
        f0.o(view6, "oldHolder.itemView");
        view6.setAlpha(alpha);
        if (newHolder != null) {
            resetAnimation(newHolder);
            View view7 = newHolder.itemView;
            f0.o(view7, "newHolder.itemView");
            view7.setTranslationX(-i10);
            View view8 = newHolder.itemView;
            f0.o(view8, "newHolder.itemView");
            view8.setTranslationY(-i11);
            View view9 = newHolder.itemView;
            f0.o(view9, "newHolder.itemView");
            view9.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new ChangeInfo(oldHolder, newHolder, fromX, fromY, toX, toY));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(@dl.d RecyclerView.ViewHolder holder, int fX, int fY, int toX, int toY) {
        f0.p(holder, "holder");
        Log.d(f138449o, "animateMove(" + holder + ')');
        View view = holder.itemView;
        f0.o(view, "holder.itemView");
        View view2 = holder.itemView;
        f0.o(view2, "holder.itemView");
        int translationX = fX + ((int) view2.getTranslationX());
        View view3 = holder.itemView;
        f0.o(view3, "holder.itemView");
        int translationY = fY + ((int) view3.getTranslationY());
        resetAnimation(holder);
        int i10 = toX - translationX;
        int i11 = toY - translationY;
        if (i10 == 0 && i11 == 0) {
            dispatchMoveFinished(holder);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        this.mPendingMoves.add(new MoveInfo(holder, translationX, translationY, toX, toY));
        return true;
    }

    public void animateMoveImpl(@dl.d RecyclerView.ViewHolder holder, int i10, int i11, int i12, int i13) {
        f0.p(holder, "holder");
        View view = holder.itemView;
        f0.o(view, "holder.itemView");
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mMoveAnimations.add(holder);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new h(holder, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(@dl.d RecyclerView.ViewHolder holder) {
        f0.p(holder, "holder");
        resetAnimation(holder);
        View view = holder.itemView;
        f0.o(view, "holder.itemView");
        view.setAlpha(1.0f);
        this.mPendingRemovals.add(holder);
        return true;
    }

    public void animateRemoveImpl(@dl.d RecyclerView.ViewHolder holder) {
        View view;
        View view2;
        f0.p(holder, "holder");
        int groupPosition = e().F(holder).getGroupPosition();
        View view3 = holder.itemView;
        f0.o(view3, "holder.itemView");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
        this.mRemoveAnimations.add(holder);
        boolean z10 = groupPosition == e().A() - 1;
        if ((!this.animChildrenItem && !z10) || e().I(holder.getItemViewType())) {
            viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(1.0f).setListener(new j(holder, viewPropertyAnimatorAnimate, view3)).start();
            return;
        }
        float top = 0.0f;
        view3.setTranslationY(0.0f);
        int iF = f(groupPosition);
        RecyclerView.ViewHolder viewHolderJ = this.expandableRecyclerView.j(groupPosition);
        float y10 = (viewHolderJ == null || (view2 = viewHolderJ.itemView) == null) ? 0.0f : view2.getY();
        if (viewHolderJ != null && (view = viewHolderJ.itemView) != null) {
            top = view.getTop();
        }
        float f10 = iF - (top - y10);
        if (this.animChildrenItem && !z10) {
            f10 *= this.animValue;
        }
        viewPropertyAnimatorAnimate.translationY(-f10).setDuration(getRemoveDuration()).setListener(new i(holder, view3, viewPropertyAnimatorAnimate)).start();
    }

    public void b(@dl.d ChangeInfo changeInfo) {
        f0.p(changeInfo, "changeInfo");
        RecyclerView.ViewHolder viewHolderL = changeInfo.l();
        View view = viewHolderL != null ? viewHolderL.itemView : null;
        RecyclerView.ViewHolder viewHolderK = changeInfo.k();
        View view2 = viewHolderK != null ? viewHolderK.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(changeInfo.l());
            duration.translationX(changeInfo.m() - changeInfo.i());
            duration.translationY(changeInfo.n() - changeInfo.j());
            duration.alpha(0.0f).setListener(new f(changeInfo, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.mChangeAnimations.add(changeInfo.k());
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new g(changeInfo, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d List<? extends Object> payloads) {
        f0.p(viewHolder, "viewHolder");
        f0.p(payloads, "payloads");
        return (payloads.isEmpty() ^ true) || super.canReuseUpdatedViewHolder(viewHolder, payloads);
    }

    public final void cancelAll(@dl.d List<? extends RecyclerView.ViewHolder> viewHolders) {
        f0.p(viewHolders, "viewHolders");
        int size = viewHolders.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            RecyclerView.ViewHolder viewHolder = viewHolders.get(size);
            f0.m(viewHolder);
            viewHolder.itemView.animate().cancel();
        }
    }

    public final void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(@dl.d RecyclerView.ViewHolder item) {
        f0.p(item, "item");
        View view = item.itemView;
        f0.o(view, "item.itemView");
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = this.mPendingMoves.get(size);
            f0.o(moveInfo, "mPendingMoves[i]");
            if (moveInfo.j() == item) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(item);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, item);
        if (this.mPendingRemovals.remove(item)) {
            view.setAlpha(1.0f);
            view.setTranslationY(0.0f);
            dispatchRemoveFinished(item);
        }
        if (this.mPendingAdditions.remove(item)) {
            view.setAlpha(1.0f);
            view.setTranslationY(0.0f);
            dispatchAddFinished(item);
        }
        int size2 = this.mChangesList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<ChangeInfo> arrayList = this.mChangesList.get(size2);
            f0.o(arrayList, "mChangesList[i]");
            ArrayList<ChangeInfo> arrayList2 = arrayList;
            endChangeAnimation(arrayList2, item);
            if (arrayList2.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        int size3 = this.mMovesList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<MoveInfo> arrayList3 = this.mMovesList.get(size3);
            f0.o(arrayList3, "mMovesList[i]");
            ArrayList<MoveInfo> arrayList4 = arrayList3;
            int size4 = arrayList4.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                MoveInfo moveInfo2 = arrayList4.get(size4);
                f0.o(moveInfo2, "moves[j]");
                if (moveInfo2.j() == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(item);
                    arrayList4.remove(size4);
                    if (!arrayList4.isEmpty()) {
                        break;
                    }
                    this.mMovesList.remove(size3);
                    break;
                }
            }
        }
        int size5 = this.mAdditionsList.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<RecyclerView.ViewHolder> arrayList5 = this.mAdditionsList.get(size5);
            f0.o(arrayList5, "mAdditionsList[i]");
            ArrayList<RecyclerView.ViewHolder> arrayList6 = arrayList5;
            if (arrayList6.remove(item)) {
                view.setAlpha(1.0f);
                view.setTranslationY(0.0f);
                dispatchAddFinished(item);
                if (arrayList6.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        if (!((this.mRemoveAnimations.remove(item) && f138450p) ? false : true)) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list".toString());
        }
        if (!((this.mAddAnimations.remove(item) && f138450p) ? false : true)) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list".toString());
        }
        if (!((this.mChangeAnimations.remove(item) && f138450p) ? false : true)) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list".toString());
        }
        if (!((this.mMoveAnimations.remove(item) && f138450p) ? false : true)) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list".toString());
        }
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = this.mPendingMoves.get(size);
            f0.o(moveInfo, "mPendingMoves[i]");
            MoveInfo moveInfo2 = moveInfo;
            View view = moveInfo2.j().itemView;
            f0.o(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(moveInfo2.j());
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            RecyclerView.ViewHolder viewHolder = this.mPendingRemovals.get(size2);
            f0.o(viewHolder, "mPendingRemovals[i]");
            dispatchRemoveFinished(viewHolder);
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder2 = this.mPendingAdditions.get(size3);
            f0.o(viewHolder2, "mPendingAdditions[i]");
            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
            View view2 = viewHolder3.itemView;
            f0.o(view2, "item.itemView");
            view2.setAlpha(1.0f);
            dispatchAddFinished(viewHolder3);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            ChangeInfo changeInfo = this.mPendingChanges.get(size4);
            f0.o(changeInfo, "mPendingChanges[i]");
            c(changeInfo);
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<MoveInfo> arrayList = this.mMovesList.get(size5);
                f0.o(arrayList, "mMovesList[i]");
                ArrayList<MoveInfo> arrayList2 = arrayList;
                for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                    MoveInfo moveInfo3 = arrayList2.get(size6);
                    f0.o(moveInfo3, "moves[j]");
                    MoveInfo moveInfo4 = moveInfo3;
                    View view3 = moveInfo4.j().itemView;
                    f0.o(view3, "item.itemView");
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    dispatchMoveFinished(moveInfo4.j());
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(arrayList2);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = this.mAdditionsList.get(size7);
                f0.o(arrayList3, "mAdditionsList[i]");
                ArrayList<RecyclerView.ViewHolder> arrayList4 = arrayList3;
                for (int size8 = arrayList4.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = arrayList4.get(size8);
                    f0.o(viewHolder4, "additions[j]");
                    RecyclerView.ViewHolder viewHolder5 = viewHolder4;
                    View view4 = viewHolder5.itemView;
                    f0.o(view4, "item.itemView");
                    view4.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder5);
                    arrayList4.remove(size8);
                    if (arrayList4.isEmpty()) {
                        this.mAdditionsList.remove(arrayList4);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<ChangeInfo> arrayList5 = this.mChangesList.get(size9);
                f0.o(arrayList5, "mChangesList[i]");
                ArrayList<ChangeInfo> arrayList6 = arrayList5;
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    ChangeInfo changeInfo2 = arrayList6.get(size10);
                    f0.o(changeInfo2, "changes[j]");
                    c(changeInfo2);
                    if (arrayList6.isEmpty()) {
                        this.mChangesList.remove(arrayList6);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @dl.d
    public final ArrayList<RecyclerView.ViewHolder> g() {
        return this.mAddAnimations;
    }

    @dl.d
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> h() {
        return this.mAdditionsList;
    }

    @dl.d
    public final ArrayList<RecyclerView.ViewHolder> i() {
        return this.mChangeAnimations;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() ^ true) || (this.mPendingChanges.isEmpty() ^ true) || (this.mPendingMoves.isEmpty() ^ true) || (this.mPendingRemovals.isEmpty() ^ true) || (this.mMoveAnimations.isEmpty() ^ true) || (this.mRemoveAnimations.isEmpty() ^ true) || (this.mAddAnimations.isEmpty() ^ true) || (this.mChangeAnimations.isEmpty() ^ true) || (this.mMovesList.isEmpty() ^ true) || (this.mAdditionsList.isEmpty() ^ true) || (this.mChangesList.isEmpty() ^ true);
    }

    @dl.d
    public final ArrayList<ArrayList<ChangeInfo>> j() {
        return this.mChangesList;
    }

    @dl.d
    public final ArrayList<RecyclerView.ViewHolder> k() {
        return this.mMoveAnimations;
    }

    @dl.d
    public final ArrayList<ArrayList<MoveInfo>> l() {
        return this.mMovesList;
    }

    @dl.d
    public final ArrayList<RecyclerView.ViewHolder> m() {
        return this.mRemoveAnimations;
    }

    public final void n(@dl.d ArrayList<RecyclerView.ViewHolder> arrayList) {
        f0.p(arrayList, "<set-?>");
        this.mAddAnimations = arrayList;
    }

    public final void o(@dl.d ArrayList<ArrayList<RecyclerView.ViewHolder>> arrayList) {
        f0.p(arrayList, "<set-?>");
        this.mAdditionsList = arrayList;
    }

    public final void p(@dl.d ArrayList<RecyclerView.ViewHolder> arrayList) {
        f0.p(arrayList, "<set-?>");
        this.mChangeAnimations = arrayList;
    }

    public final void q(@dl.d ArrayList<ArrayList<ChangeInfo>> arrayList) {
        f0.p(arrayList, "<set-?>");
        this.mChangesList = arrayList;
    }

    public final void r(@dl.d ArrayList<RecyclerView.ViewHolder> arrayList) {
        f0.p(arrayList, "<set-?>");
        this.mMoveAnimations = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        boolean z10 = !this.mPendingRemovals.isEmpty();
        boolean z11 = !this.mPendingMoves.isEmpty();
        boolean z12 = !this.mPendingChanges.isEmpty();
        boolean z13 = !this.mPendingAdditions.isEmpty();
        if (z10 || z11 || z13 || z12) {
            for (RecyclerView.ViewHolder holder : this.mPendingRemovals) {
                f0.o(holder, "holder");
                animateRemoveImpl(holder);
            }
            this.mPendingRemovals.clear();
            if (z11) {
                ArrayList<MoveInfo> arrayList = new ArrayList<>();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                new m(arrayList).run();
            }
            if (z12) {
                ArrayList<ChangeInfo> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                new l(arrayList2).run();
            }
            if (z13) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                new k(arrayList3).run();
            }
        }
    }

    public final void s(@dl.d ArrayList<ArrayList<MoveInfo>> arrayList) {
        f0.p(arrayList, "<set-?>");
        this.mMovesList = arrayList;
    }

    public final void t(@dl.d ArrayList<RecyclerView.ViewHolder> arrayList) {
        f0.p(arrayList, "<set-?>");
        this.mRemoveAnimations = arrayList;
    }
}
