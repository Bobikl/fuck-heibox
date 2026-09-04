package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: VersionedParcelParcel.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class e extends VersionedParcel {
    private static final boolean B = false;
    private static final String C = "VersionedParcelParcel";
    private int A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SparseIntArray f28183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Parcel f28184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f28185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f28186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f28187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f28188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f28189z;

    e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    private e(Parcel parcel, int i10, int i11, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f28183t = new SparseIntArray();
        this.f28188y = -1;
        this.A = -1;
        this.f28184u = parcel;
        this.f28185v = i10;
        this.f28186w = i11;
        this.f28189z = i10;
        this.f28187x = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d10) {
        this.f28184u.writeDouble(d10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i10) {
        while (this.f28189z < this.f28186w) {
            int i11 = this.A;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f28184u.setDataPosition(this.f28189z);
            int i12 = this.f28184u.readInt();
            this.A = this.f28184u.readInt();
            this.f28189z += i12;
        }
        return this.A == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        return this.f28184u.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f10) {
        this.f28184u.writeFloat(f10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        return this.f28184u.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i10) {
        this.f28184u.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        return this.f28184u.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j10) {
        this.f28184u.writeLong(j10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return (T) this.f28184u.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        this.f28184u.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f28188y;
        if (i10 >= 0) {
            int i11 = this.f28183t.get(i10);
            int iDataPosition = this.f28184u.dataPosition();
            this.f28184u.setDataPosition(i11);
            this.f28184u.writeInt(iDataPosition - i11);
            this.f28184u.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        Parcel parcel = this.f28184u;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f28189z;
        if (i10 == this.f28185v) {
            i10 = this.f28186w;
        }
        return new e(parcel, iDataPosition, i10, this.f28187x + "  ", this.f28178a, this.f28179b, this.f28180c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        return this.f28184u.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return this.f28184u.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        this.f28184u.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        this.f28184u.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i10) {
        a();
        this.f28188y = i10;
        this.f28183t.put(i10, this.f28184u.dataPosition());
        L0(0);
        L0(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        this.f28184u.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        return this.f28184u.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z10) {
        this.f28184u.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        return this.f28184u.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        this.f28184u.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        int i10 = this.f28184u.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f28184u.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.f28184u.writeInt(-1);
        } else {
            this.f28184u.writeInt(bArr.length);
            this.f28184u.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f28184u);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            this.f28184u.writeInt(-1);
        } else {
            this.f28184u.writeInt(bArr.length);
            this.f28184u.writeByteArray(bArr, i10, i11);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        return this.f28184u.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f28184u, 0);
    }
}
