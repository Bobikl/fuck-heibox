package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Lazy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "", ak.av, "Landroid/os/Parcel;", "parcel", Constants.KEY_FLAGS, "Lkotlin/b2;", "writeToParcel", "describeContents", UCropPlusActivity.ARG_INDEX, "b", "", "toString", "hashCode", "", "other", "", "equals", "I", "<init>", "(I)V", ak.aF, "foundation_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"BanParcelableUsage"})
public final /* data */ class DefaultLazyKey implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    @xh.e
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new a();

    /* JADX INFO: compiled from: Lazy.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/lazy/layout/DefaultLazyKey$a", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcel;", "parcel", ak.av, "", UiKitSpanObj.TYPE_SIZE, "", "b", "(I)[Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements Parcelable.Creator<DefaultLazyKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey createFromParcel(@dl.d Parcel parcel) {
            f0.p(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey[] newArray(int size) {
            return new DefaultLazyKey[size];
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Lazy.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$b;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "<init>", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ void a() {
        }
    }

    public DefaultLazyKey(int i10) {
        this.index = i10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final int getIndex() {
        return this.index;
    }

    public static /* synthetic */ DefaultLazyKey c(DefaultLazyKey defaultLazyKey, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = defaultLazyKey.index;
        }
        return defaultLazyKey.b(i10);
    }

    @dl.d
    public final DefaultLazyKey b(int index) {
        return new DefaultLazyKey(index);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DefaultLazyKey) && this.index == ((DefaultLazyKey) other).index;
    }

    public int hashCode() {
        return this.index;
    }

    @dl.d
    public String toString() {
        return "DefaultLazyKey(index=" + this.index + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@dl.d Parcel parcel, int i10) {
        f0.p(parcel, "parcel");
        parcel.writeInt(this.index);
    }
}
