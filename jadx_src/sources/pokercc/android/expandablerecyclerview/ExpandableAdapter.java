package pokercc.android.expandablerecyclerview;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.core.util.c0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.igexin.assist.sdk.AssistPushConsts;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import fi.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.s0;
import pokercc.android.expandablerecyclerview.ExpandableAdapter.c;

/* JADX INFO: compiled from: ExpandableAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u0000 s*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004tu^bB\u0007¢\u0006\u0004\bq\u0010rJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J-\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0015J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\bJ\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u001f\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u000e\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001d\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J+\u00100\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0/¢\u0006\u0004\b0\u00101J\u0006\u00103\u001a\u000202J\u0010\u00105\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000102J\u001a\u00107\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\fJ\"\u00108\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\fJ\u000e\u00109\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:J\u000e\u0010=\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010>\u001a\u00020\b2\u0006\u0010;\u001a\u00020:J\u0016\u0010?\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u0016\u0010@\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:J\u0016\u0010C\u001a\u00020\b2\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004J\u001e\u0010F\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0004J\u0016\u0010G\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u0016\u0010H\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:J\u0006\u0010I\u001a\u00020\bJ\u0006\u0010J\u001a\u00020\u0004J\u001f\u0010K\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H$¢\u0006\u0004\bK\u0010&J\u001f\u0010L\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H$¢\u0006\u0004\bL\u0010&J5\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH$¢\u0006\u0004\bM\u0010NJ5\u0010O\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH$¢\u0006\u0004\bO\u0010PJ/\u0010S\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020Q2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\bS\u0010TJ\b\u0010U\u001a\u00020\u0004H&J\u0010\u0010V\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010Y\u001a\u00020X2\u0006\u0010,\u001a\u00020WJ\u0010\u0010Z\u001a\u0004\u0018\u00010X2\u0006\u0010,\u001a\u00020WJ\u000e\u0010[\u001a\u00020X2\u0006\u0010\u0015\u001a\u00020\u0004J\u0010\u0010\\\u001a\u00020\u00042\u0006\u0010,\u001a\u00020WH\u0007J\u0010\u0010]\u001a\u00020\u00042\u0006\u0010,\u001a\u00020WH\u0007R\u0014\u0010`\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\"\u0010j\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010-\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010-\u001a\u0004\bl\u0010g\"\u0004\bm\u0010iR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006v"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableAdapter;", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "", "groupPosition", "", "expand", "Lkotlin/b2;", "l0", "holder", "", "", "payloads", "j0", "(ILpokercc/android/expandablerecyclerview/ExpandableAdapter$c;Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "H", "adapterPosition", "e0", "f0", "r", "p", "anim", ak.aB, "q", ak.aD, "childPosition", "t", ak.aG, "(II)Ljava/lang/Integer;", "Landroid/view/ViewGroup;", "viewGroup", "viewType", "d0", "(Landroid/view/ViewGroup;I)Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;", CommonNetImpl.POSITION, "getItemViewType", "B", RXScreenCaptureService.KEY_WIDTH, "I", "viewHolder", "Z", "(Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;I)V", "", "a0", "(Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;ILjava/util/List;)V", "Landroid/os/Parcelable;", "i0", "state", "h0", AssistPushConsts.MSG_TYPE_PAYLOAD, "Q", "J", androidx.exifinterface.media.a.R4, "Lfi/l;", k0.f48802q, "U", androidx.exifinterface.media.a.T4, androidx.exifinterface.media.a.X4, "L", "N", "fromGroupPosition", "toGroupPosition", androidx.exifinterface.media.a.f23244d5, "fromChildPosition", "toChildPosition", "M", "P", "O", "o", "getItemCount", "c0", "b0", "X", "(Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;IILjava/util/List;)V", "Y", "(Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;IZLjava/util/List;)V", "", "animDuration", "g0", "(Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;IJZ)V", androidx.exifinterface.media.a.W4, "v", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter$b;", "F", androidx.exifinterface.media.a.S4, "D", "x", "C", "b", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter$b;", "tempItemPosition", "Landroid/util/SparseBooleanArray;", ak.aF, "Landroid/util/SparseBooleanArray;", "expandState", "d", "G", "()Z", "m0", "(Z)V", "onlyOneGroupExpand", "e", "y", "k0", "enableAnimation", "f", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "()V", "j", ak.av, "ExpandableState", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
@i1
public abstract class ExpandableAdapter<VH extends c> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f138398g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f138399h = "ExpandableAdapter";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean onlyOneGroupExpand;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private RecyclerView recyclerView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f138400i = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ItemPosition tempItemPosition = new ItemPosition(0, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SparseBooleanArray expandState = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean enableAnimation = true;

    /* JADX INFO: compiled from: ExpandableAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0011\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\n\u0010\u000e¨\u0006\u0013"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableAdapter$ExpandableState;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", Constants.KEY_FLAGS, "Lkotlin/b2;", "writeToParcel", "describeContents", "Landroid/util/SparseBooleanArray;", "b", "Landroid/util/SparseBooleanArray;", ak.av, "()Landroid/util/SparseBooleanArray;", "(Landroid/util/SparseBooleanArray;)V", "expandState", "<init>", "(Landroid/os/Parcel;)V", "CREATOR", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class ExpandableState implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private SparseBooleanArray expandState;

        /* JADX INFO: renamed from: pokercc.android.expandablerecyclerview.ExpandableAdapter$ExpandableState$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: ExpandableAdapter.kt */
        @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableAdapter$ExpandableState$a;", "Landroid/os/Parcelable$Creator;", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter$ExpandableState;", "Landroid/os/Parcel;", "parcel", ak.av, "", UiKitSpanObj.TYPE_SIZE, "", "b", "(I)[Lpokercc/android/expandablerecyclerview/ExpandableAdapter$ExpandableState;", "<init>", "()V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
        public static final class Companion implements Parcelable.Creator<ExpandableState> {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ExpandableState createFromParcel(@dl.d Parcel parcel) {
                f0.p(parcel, "parcel");
                return new ExpandableState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @dl.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ExpandableState[] newArray(int size) {
                return new ExpandableState[size];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ExpandableState(@dl.d Parcel parcel) {
            this(parcel.readSparseBooleanArray());
            f0.p(parcel, "parcel");
        }

        public ExpandableState(@dl.e SparseBooleanArray sparseBooleanArray) {
            this.expandState = sparseBooleanArray;
        }

        @dl.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SparseBooleanArray getExpandState() {
            return this.expandState;
        }

        public final void b(@dl.e SparseBooleanArray sparseBooleanArray) {
            this.expandState = sparseBooleanArray;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@dl.d Parcel parcel, int i10) {
            f0.p(parcel, "parcel");
            parcel.writeSparseBooleanArray(this.expandState);
        }
    }

    /* JADX INFO: renamed from: pokercc.android.expandablerecyclerview.ExpandableAdapter$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ExpandableAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\nR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableAdapter$a;", "", "", "DEBUG", "Z", ak.av, "()Z", ak.aF, "(Z)V", "getDEBUG$annotations", "()V", "GROUP_EXPAND_CHANGE", "Ljava/lang/Object;", "", "LOG_TAG", "Ljava/lang/String;", "<init>", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        public final boolean a() {
            return ExpandableAdapter.f138398g;
        }

        public final void c(boolean z10) {
            ExpandableAdapter.f138398g = z10;
        }
    }

    /* JADX INFO: renamed from: pokercc.android.expandablerecyclerview.ExpandableAdapter$b, reason: from toString */
    /* JADX INFO: compiled from: ExpandableAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableAdapter$b;", "", "", ak.av, "b", "()Ljava/lang/Integer;", "groupPosition", "childPosition", ak.aF, "(ILjava/lang/Integer;)Lpokercc/android/expandablerecyclerview/ExpandableAdapter$b;", "", "toString", "hashCode", "other", "", "equals", "I", "f", "()I", RXScreenCaptureService.KEY_HEIGHT, "(I)V", "Ljava/lang/Integer;", "e", "g", "(Ljava/lang/Integer;)V", "<init>", "(ILjava/lang/Integer;)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class ItemPosition {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private int groupPosition;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.e
        private Integer childPosition;

        public ItemPosition(int i10, @dl.e Integer num) {
            this.groupPosition = i10;
            this.childPosition = num;
        }

        public static /* synthetic */ ItemPosition d(ItemPosition itemPosition, int i10, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = itemPosition.groupPosition;
            }
            if ((i11 & 2) != 0) {
                num = itemPosition.childPosition;
            }
            return itemPosition.c(i10, num);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getGroupPosition() {
            return this.groupPosition;
        }

        @dl.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getChildPosition() {
            return this.childPosition;
        }

        @dl.d
        public final ItemPosition c(int groupPosition, @dl.e Integer childPosition) {
            return new ItemPosition(groupPosition, childPosition);
        }

        @dl.e
        public final Integer e() {
            return this.childPosition;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemPosition)) {
                return false;
            }
            ItemPosition itemPosition = (ItemPosition) other;
            return this.groupPosition == itemPosition.groupPosition && f0.g(this.childPosition, itemPosition.childPosition);
        }

        public final int f() {
            return this.groupPosition;
        }

        public final void g(@dl.e Integer num) {
            this.childPosition = num;
        }

        public final void h(int i10) {
            this.groupPosition = i10;
        }

        public int hashCode() {
            int i10 = this.groupPosition * 31;
            Integer num = this.childPosition;
            return i10 + (num != null ? num.hashCode() : 0);
        }

        @dl.d
        public String toString() {
            return "ItemPosition(groupPosition=" + this.groupPosition + ", childPosition=" + this.childPosition + ")";
        }
    }

    /* JADX INFO: compiled from: ExpandableAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "toString", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter$b;", "b", "Lpokercc/android/expandablerecyclerview/ExpandableAdapter$b;", "()Lpokercc/android/expandablerecyclerview/ExpandableAdapter$b;", "d", "(Lpokercc/android/expandablerecyclerview/ExpandableAdapter$b;)V", "layoutItemPosition", "Lpokercc/android/expandablerecyclerview/c;", ak.aF, "Lpokercc/android/expandablerecyclerview/c;", ak.av, "()Lpokercc/android/expandablerecyclerview/c;", "itemClipper", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
    public static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public ItemPosition layoutItemPosition;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final ItemClipper itemClipper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d View itemView) {
            super(itemView);
            f0.p(itemView, "itemView");
            this.itemClipper = new ItemClipper(itemView);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ItemClipper getItemClipper() {
            return this.itemClipper;
        }

        @dl.d
        public final ItemPosition b() {
            ItemPosition itemPosition = this.layoutItemPosition;
            if (itemPosition == null) {
                f0.S("layoutItemPosition");
            }
            return itemPosition;
        }

        public final void d(@dl.d ItemPosition itemPosition) {
            f0.p(itemPosition, "<set-?>");
            this.layoutItemPosition = itemPosition;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
        @dl.d
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ViewHolder(layoutItemPosition=");
            ItemPosition itemPosition = this.layoutItemPosition;
            if (itemPosition == null) {
                f0.S("layoutItemPosition");
            }
            sb2.append(itemPosition);
            sb2.append(", ");
            sb2.append("itemClipper=");
            sb2.append(this.itemClipper);
            sb2.append(',');
            sb2.append(super.toString());
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: ExpandableAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpokercc/android/expandablerecyclerview/ExpandableAdapter$c;", "VH", "Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/b2;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f138413c;

        d(int i10) {
            this.f138413c = i10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ExpandableAdapter.this.H(this.f138413c)) {
                ExpandableAdapter expandableAdapter = ExpandableAdapter.this;
                expandableAdapter.q(this.f138413c, expandableAdapter.getEnableAnimation());
            } else {
                ExpandableAdapter expandableAdapter2 = ExpandableAdapter.this;
                expandableAdapter2.s(this.f138413c, expandableAdapter2.getEnableAnimation());
            }
        }
    }

    public static /* synthetic */ void K(ExpandableAdapter expandableAdapter, int i10, int i11, Object obj, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyChildChange");
        }
        if ((i12 & 4) != 0) {
            obj = null;
        }
        expandableAdapter.J(i10, i11, obj);
    }

    public static /* synthetic */ void R(ExpandableAdapter expandableAdapter, int i10, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyGroupChange");
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        expandableAdapter.Q(i10, obj);
    }

    private final void j0(int groupPosition, VH holder, List<? extends Object> payloads) {
        Long lValueOf;
        RecyclerView.ItemAnimator it;
        boolean zH = H(groupPosition);
        if (payloads.isEmpty()) {
            holder.itemView.setOnClickListener(new d(groupPosition));
        }
        Y(holder, groupPosition, zH, payloads);
        boolean z10 = false;
        if (!payloads.isEmpty()) {
            Iterator<T> it2 = payloads.iterator();
            while (it2.hasNext()) {
                if (f0.g(it2.next(), f138400i)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView == null || (it = recyclerView.getItemAnimator()) == null) {
                lValueOf = null;
            } else {
                f0.o(it, "it");
                lValueOf = Long.valueOf(zH ? it.getAddDuration() : it.getRemoveDuration());
            }
            g0(holder, groupPosition, lValueOf != null ? lValueOf.longValue() : 300L, zH);
        }
    }

    private final void l0(int i10, boolean z10) {
        this.expandState.put(i10, z10);
        f0(i10, z10);
        Q(i10, f138400i);
    }

    public abstract int A();

    public int B(int groupPosition) {
        return 1;
    }

    @k(message = "Mix adapterPosition and layoutPosition", replaceWith = @s0(expression = "getItemAdapterPosition() or getItemLayoutPosition()", imports = {}))
    public final int C(@dl.d RecyclerView.ViewHolder viewHolder) {
        f0.p(viewHolder, "viewHolder");
        return F(viewHolder).f();
    }

    @dl.d
    public final ItemPosition D(int adapterPosition) {
        if (!f0.g(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalArgumentException("Must run on ui thread".toString());
        }
        if (!(adapterPosition >= 0 && getItemCount() > adapterPosition)) {
            throw new IllegalArgumentException((adapterPosition + " must in 0 unit " + getItemCount()).toString());
        }
        int i10 = -1;
        this.tempItemPosition.h(-1);
        this.tempItemPosition.g(null);
        int iA = A();
        loop0: for (int i11 = 0; i11 < iA; i11++) {
            i10++;
            if (i10 == adapterPosition) {
                this.tempItemPosition.h(i11);
                this.tempItemPosition.g(null);
                break;
            }
            if (H(i11)) {
                int iV = v(i11);
                for (int i12 = 0; i12 < iV; i12++) {
                    i10++;
                    if (i10 == adapterPosition) {
                        this.tempItemPosition.h(i11);
                        this.tempItemPosition.g(Integer.valueOf(i12));
                        break loop0;
                    }
                }
            }
        }
        return this.tempItemPosition;
    }

    @dl.e
    public final ItemPosition E(@dl.d RecyclerView.ViewHolder viewHolder) {
        f0.p(viewHolder, "viewHolder");
        if (viewHolder.getAdapterPosition() == -1) {
            return null;
        }
        return D(viewHolder.getAdapterPosition());
    }

    @dl.d
    public final ItemPosition F(@dl.d RecyclerView.ViewHolder viewHolder) {
        f0.p(viewHolder, "viewHolder");
        return ((c) viewHolder).b();
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getOnlyOneGroupExpand() {
        return this.onlyOneGroupExpand;
    }

    public final boolean H(int groupPosition) {
        int iA = A();
        if (groupPosition >= 0 && iA > groupPosition) {
            return this.expandState.get(groupPosition);
        }
        throw new IllegalArgumentException((groupPosition + " must in 0 until " + iA).toString());
    }

    public boolean I(int viewType) {
        return viewType > 0;
    }

    public final void J(int i10, int i11, @dl.e Object obj) {
        Integer numU;
        if (!H(i10) || (numU = u(i10, i11)) == null) {
            return;
        }
        notifyItemChanged(numU.intValue(), obj);
    }

    public final void L(int i10, int i11) {
        Integer numU;
        if (!H(i10) || (numU = u(i10, i11)) == null) {
            return;
        }
        notifyItemInserted(numU.intValue());
    }

    public final void M(int i10, int i11, int i12) {
        Integer numU;
        if (!H(i10) || (numU = u(i10, i11)) == null) {
            return;
        }
        int iIntValue = numU.intValue();
        Integer numU2 = u(i10, i12);
        if (numU2 != null) {
            notifyItemMoved(iIntValue, numU2.intValue());
        }
    }

    public final void N(int i10, @dl.d l range) {
        Integer numU;
        f0.p(range, "range");
        if (!H(i10) || (numU = u(i10, range.h())) == null) {
            return;
        }
        notifyItemRangeInserted(numU.intValue(), range.i() - range.h());
    }

    public final void O(int i10, @dl.d l range) {
        Integer numU;
        f0.p(range, "range");
        if (!H(i10) || (numU = u(i10, range.h())) == null) {
            return;
        }
        notifyItemRangeRemoved(numU.intValue(), range.i() - range.h());
    }

    public final void P(int i10, int i11) {
        Integer numU;
        if (!H(i10) || (numU = u(i10, i11)) == null) {
            return;
        }
        notifyItemRemoved(numU.intValue());
    }

    public final void Q(int i10, @dl.e Object obj) {
        notifyItemChanged(z(i10), obj);
    }

    public final void S(int i10) {
        notifyItemInserted(z(i10));
    }

    public final void T(int i10, int i11) {
        notifyItemMoved(z(i10), z(i11));
    }

    public final void U(@dl.d l range) {
        f0.p(range, "range");
        notifyItemRangeInserted(z(range.h()), range.i() - range.h());
    }

    public final void V(@dl.d l range) {
        f0.p(range, "range");
        notifyItemRangeRemoved(z(range.h()), range.i() - range.h());
    }

    public final void W(int i10) {
        notifyItemRemoved(z(i10));
    }

    protected abstract void X(@dl.d VH holder, int groupPosition, int childPosition, @dl.d List<? extends Object> payloads);

    protected abstract void Y(@dl.d VH holder, int groupPosition, boolean expand, @dl.d List<? extends Object> payloads);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@dl.d VH viewHolder, int position) {
        f0.p(viewHolder, "viewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@dl.d VH holder, int position, @dl.d List<Object> payloads) {
        f0.p(holder, "holder");
        f0.p(payloads, "payloads");
        ItemPosition itemPositionD = D(position);
        holder.d(ItemPosition.d(itemPositionD, 0, null, 3, null));
        if (f138398g) {
            Log.d(f138399h, "onBindViewHolder " + this.tempItemPosition);
        }
        int groupPosition = itemPositionD.getGroupPosition();
        Integer childPosition = itemPositionD.getChildPosition();
        if (childPosition == null) {
            j0(groupPosition, holder, payloads);
        } else {
            X(holder, groupPosition, childPosition.intValue(), payloads);
        }
    }

    @dl.d
    protected abstract VH b0(@dl.d ViewGroup viewGroup, int viewType);

    @dl.d
    protected abstract VH c0(@dl.d ViewGroup viewGroup, int viewType);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final VH onCreateViewHolder(@dl.d ViewGroup viewGroup, int viewType) {
        f0.p(viewGroup, "viewGroup");
        return I(viewType) ? (VH) c0(viewGroup, viewType) : (VH) b0(viewGroup, viewType);
    }

    @k(message = org.apache.tools.ant.taskdefs.modules.d.a.f134532c, replaceWith = @s0(expression = "onGroupExpandChange(int, boolean)", imports = {}))
    protected void e0(int i10, int i11, boolean z10) {
    }

    protected void f0(int i10, boolean z10) {
        e0(i10, z(i10), z10);
    }

    protected abstract void g0(@dl.d VH holder, int groupPosition, long animDuration, boolean expand);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int iA = A();
        int iV = 0;
        for (int i10 = 0; i10 < iA; i10++) {
            iV++;
            if (H(i10)) {
                iV += v(i10);
            }
        }
        return iV;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int position) {
        if (position >= 0 && getItemCount() > position) {
            ItemPosition itemPositionD = D(position);
            int groupPosition = itemPositionD.getGroupPosition();
            Integer childPosition = itemPositionD.getChildPosition();
            return childPosition == null ? B(groupPosition) : w(groupPosition, childPosition.intValue());
        }
        throw new IllegalArgumentException((position + " must in 0 unit " + getItemCount()).toString());
    }

    public final void h0(@dl.e Parcelable parcelable) {
        SparseBooleanArray expandState;
        if (!(parcelable instanceof ExpandableState)) {
            parcelable = null;
        }
        ExpandableState expandableState = (ExpandableState) parcelable;
        if (expandableState == null || (expandState = expandableState.getExpandState()) == null) {
            return;
        }
        this.expandState.clear();
        c0.l(this.expandState, expandState);
    }

    @dl.d
    public final Parcelable i0() {
        return new ExpandableState(this.expandState);
    }

    public final void k0(boolean z10) {
        this.enableAnimation = z10;
    }

    public final void m0(boolean z10) {
        this.onlyOneGroupExpand = z10;
    }

    public final void o() {
        this.expandState.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @i
    public void onAttachedToRecyclerView(@dl.d RecyclerView recyclerView) {
        f0.p(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (!(recyclerView instanceof ExpandableRecyclerView)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @i
    public void onDetachedFromRecyclerView(@dl.d RecyclerView recyclerView) {
        f0.p(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
    }

    public final void p() {
        int iA = A();
        for (int i10 = 0; i10 < iA; i10++) {
            this.expandState.put(i10, false);
        }
        notifyDataSetChanged();
    }

    public final void q(int i10, boolean z10) {
        int iA = A();
        if (!(i10 >= 0 && iA > i10)) {
            throw new IllegalArgumentException((i10 + " must in 0 until " + iA).toString());
        }
        if (H(i10)) {
            Integer numU = u(i10, 0);
            l0(i10, false);
            if (!z10) {
                notifyDataSetChanged();
            } else if (numU != null) {
                notifyItemRangeRemoved(numU.intValue(), v(i10));
            }
        }
    }

    public final void r() {
        this.onlyOneGroupExpand = false;
        int iA = A();
        for (int i10 = 0; i10 < iA; i10++) {
            this.expandState.put(i10, true);
        }
        notifyDataSetChanged();
    }

    public final void s(int i10, boolean z10) {
        int iA = A();
        if (!(i10 >= 0 && iA > i10)) {
            throw new IllegalArgumentException((i10 + " must in 0 until " + iA).toString());
        }
        if (!this.onlyOneGroupExpand) {
            if (H(i10)) {
                return;
            }
            l0(i10, true);
            if (!z10) {
                notifyDataSetChanged();
                return;
            }
            Integer numU = u(i10, 0);
            if (numU != null) {
                notifyItemRangeInserted(numU.intValue(), v(i10));
                return;
            }
            return;
        }
        if (!z10) {
            int iA2 = A();
            for (int i11 = 0; i11 < iA2; i11++) {
                if (i11 == i10 && !H(i11)) {
                    l0(i11, true);
                } else if (H(i11)) {
                    l0(i11, false);
                }
            }
            notifyDataSetChanged();
            return;
        }
        int iA3 = A();
        for (int i12 = 0; i12 < iA3; i12++) {
            if (i12 == i10 && !H(i12)) {
                l0(i12, true);
                Integer numU2 = u(i12, 0);
                if (numU2 != null) {
                    notifyItemRangeInserted(numU2.intValue(), v(i12));
                }
            } else if (H(i12)) {
                Integer numU3 = u(i12, 0);
                l0(i12, false);
                if (numU3 != null) {
                    notifyItemRangeRemoved(numU3.intValue(), v(i12));
                }
            }
        }
    }

    @k(message = "Unclear return value", replaceWith = @s0(expression = "getChildAdapterPosition2", imports = {}))
    public final int t(int groupPosition, int childPosition) {
        Integer numU = u(groupPosition, childPosition);
        if (numU != null) {
            return numU.intValue();
        }
        return -1;
    }

    @dl.e
    public final Integer u(int groupPosition, int childPosition) {
        int iV = v(groupPosition);
        if (!H(groupPosition) || iV <= 0) {
            return null;
        }
        if (childPosition >= 0 && iV > childPosition) {
            return Integer.valueOf(z(groupPosition) + 1 + childPosition);
        }
        throw new IllegalArgumentException((childPosition + " must in 0 until " + iV).toString());
    }

    public abstract int v(int groupPosition);

    public int w(int groupPosition, int childPosition) {
        return -1;
    }

    @k(message = "Mix adapterPosition and layoutPosition", replaceWith = @s0(expression = "getItemAdapterPosition() or getItemLayoutPosition()", imports = {}))
    public final int x(@dl.d RecyclerView.ViewHolder viewHolder) {
        f0.p(viewHolder, "viewHolder");
        Integer numE = F(viewHolder).e();
        if (numE != null) {
            return numE.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getEnableAnimation() {
        return this.enableAnimation;
    }

    public final int z(int groupPosition) {
        int iA = A();
        if (!(groupPosition >= 0 && iA > groupPosition)) {
            throw new IllegalArgumentException((groupPosition + " must in 0 until " + iA).toString());
        }
        int iV = groupPosition;
        for (int i10 = 0; i10 < groupPosition; i10++) {
            if (H(i10)) {
                iV += v(i10);
            }
        }
        return iV;
    }
}
