package anetwork.channel.unified;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.bytes.ByteArray;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.http.NetworkSdkSetting;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends anetwork.channel.aidl.h.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f30288g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30289h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30290i = "anet.UnifiedNetworkDelegate";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30291f = 1;

    public b(Context context) {
        NetworkSdkSetting.c(context);
    }

    private anetwork.channel.aidl.e N(anetwork.channel.entity.k kVar, anetwork.channel.aidl.g gVar) throws RemoteException {
        return new anetwork.channel.aidl.adapter.c(new m(kVar, new anetwork.channel.entity.g(gVar, kVar)).a());
    }

    private NetworkResponse r0(ParcelableRequest parcelableRequest) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            anetwork.channel.aidl.adapter.a aVar = (anetwork.channel.aidl.adapter.a) u(parcelableRequest);
            anetwork.channel.aidl.f inputStream = aVar.getInputStream();
            if (inputStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.length() > 0 ? inputStream.length() : 1024);
                ByteArray byteArrayA = anet.channel.bytes.a.C0240a.f29622a.a(2048);
                while (true) {
                    int i10 = inputStream.read(byteArrayA.getBuffer());
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(byteArrayA.getBuffer(), 0, i10);
                }
                networkResponse.c(byteArrayOutputStream.toByteArray());
            }
            int statusCode = aVar.getStatusCode();
            if (statusCode < 0) {
                networkResponse.c(null);
            } else {
                networkResponse.d(aVar.C());
            }
            networkResponse.k(statusCode);
            networkResponse.j(aVar.z());
            return networkResponse;
        } catch (RemoteException e10) {
            networkResponse.k(-103);
            String message = e10.getMessage();
            if (!TextUtils.isEmpty(message)) {
                networkResponse.f(StringUtils.concatString(networkResponse.w(), "|", message));
            }
            return networkResponse;
        } catch (Exception unused) {
            networkResponse.k(-201);
            return networkResponse;
        }
    }

    @Override // anetwork.channel.aidl.h
    public NetworkResponse Z0(ParcelableRequest parcelableRequest) throws RemoteException {
        return r0(parcelableRequest);
    }

    @Override // anetwork.channel.aidl.h
    public anetwork.channel.aidl.e o(ParcelableRequest parcelableRequest, anetwork.channel.aidl.g gVar) throws RemoteException {
        try {
            return N(new anetwork.channel.entity.k(parcelableRequest, this.f30291f, false), gVar);
        } catch (Exception e10) {
            ALog.e(f30290i, "asyncSend failed", parcelableRequest.f30057n, e10, new Object[0]);
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // anetwork.channel.aidl.h
    public anetwork.channel.aidl.a u(ParcelableRequest parcelableRequest) throws RemoteException {
        try {
            anetwork.channel.entity.k kVar = new anetwork.channel.entity.k(parcelableRequest, this.f30291f, true);
            anetwork.channel.aidl.adapter.a aVar = new anetwork.channel.aidl.adapter.a(kVar);
            aVar.s1(N(kVar, new anetwork.channel.aidl.adapter.e(aVar, null, null)));
            return aVar;
        } catch (Exception e10) {
            ALog.e(f30290i, "asyncSend failed", parcelableRequest.f30057n, e10, new Object[0]);
            throw new RemoteException(e10.getMessage());
        }
    }
}
