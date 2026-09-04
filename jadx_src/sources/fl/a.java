package fl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: IOpenID.java */
/* JADX INFO: loaded from: classes5.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: fl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IOpenID.java */
    public static abstract class AbstractBinderC1074a extends Binder implements a {

        /* JADX INFO: renamed from: fl.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IOpenID.java */
        public static class C1075a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f118911b;

            public C1075a(IBinder iBinder) {
                this.f118911b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f118911b;
            }

            public String g(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f118911b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1075a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }
}
