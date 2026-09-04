package anetwork.channel.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anet.channel.request.BodyEntry;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class BodyHandlerEntry implements BodyEntry {
    public static final Parcelable.Creator<BodyHandlerEntry> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    anetwork.channel.aidl.d f30200b;

    private BodyHandlerEntry() {
        this.f30200b = null;
    }

    /* synthetic */ BodyHandlerEntry(b bVar) {
        this();
    }

    public BodyHandlerEntry(s3.b bVar) {
        this.f30200b = null;
        this.f30200b = new anetwork.channel.aidl.adapter.b(bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anet.channel.request.BodyEntry
    public String getContentType() {
        return null;
    }

    @Override // anet.channel.request.BodyEntry
    public int writeTo(OutputStream outputStream) throws IOException {
        try {
            ByteArray byteArrayA = anet.channel.bytes.a.C0240a.f29622a.a(2048);
            int i10 = 0;
            while (!this.f30200b.x()) {
                int i11 = this.f30200b.read(byteArrayA.getBuffer());
                outputStream.write(byteArrayA.getBuffer(), 0, i11);
                i10 += i11;
            }
            byteArrayA.recycle();
            return i10;
        } catch (RemoteException e10) {
            throw new IOException("RemoteException", e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStrongInterface(this.f30200b);
    }
}
