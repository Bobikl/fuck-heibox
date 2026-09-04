package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ParcelableSnapshotMutableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0011B\u001d\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", Constants.KEY_FLAGS, "Lkotlin/b2;", "writeToParcel", "describeContents", "value", "Landroidx/compose/runtime/d2;", ak.bo, "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/d2;)V", "d", "b", "runtime_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"BanParcelableUsage"})
public final class ParcelableSnapshotMutableState<T> extends MutableState<T> implements Parcelable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f12406e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f12407f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f12408g = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    @xh.e
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    /* JADX INFO: compiled from: ParcelableSnapshotMutableState.kt */
    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J'\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableState$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "b", ak.av, "", UiKitSpanObj.TYPE_SIZE, "", ak.aF, "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(@dl.d Parcel parcel) {
            kotlin.jvm.internal.f0.p(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(@dl.d Parcel parcel, @dl.e ClassLoader loader) {
            d2 d2VarL;
            kotlin.jvm.internal.f0.p(parcel, "parcel");
            if (loader == null) {
                loader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(loader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                d2VarL = e2.l();
            } else if (i10 == 1) {
                d2VarL = e2.w();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
                }
                d2VarL = e2.s();
            }
            return new ParcelableSnapshotMutableState<>(value, d2VarL);
        }

        @Override // android.os.Parcelable.Creator
        @dl.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object>[] newArray(int size) {
            return new ParcelableSnapshotMutableState[size];
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ParcelableSnapshotMutableState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u0007R(\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$b;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "", "PolicyNeverEquals", "I", "PolicyReferentialEquality", "PolicyStructuralEquality", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ void a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t10, @dl.d d2<T> policy) {
        super(t10, policy);
        kotlin.jvm.internal.f0.p(policy, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@dl.d Parcel parcel, int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(parcel, "parcel");
        parcel.writeValue(getValue());
        d2<T> d2VarA = a();
        if (kotlin.jvm.internal.f0.g(d2VarA, e2.l())) {
            i11 = 0;
        } else if (kotlin.jvm.internal.f0.g(d2VarA, e2.w())) {
            i11 = 1;
        } else {
            if (!kotlin.jvm.internal.f0.g(d2VarA, e2.s())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
