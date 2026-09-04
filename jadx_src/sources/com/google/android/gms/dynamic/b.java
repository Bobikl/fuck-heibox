package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.gms.internal.common.j;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class a extends com.google.android.gms.internal.common.i implements b {
        public a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @n0
        public static b N(@n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new h(iBinder);
        }

        @Override // com.google.android.gms.internal.common.i
        protected final boolean g(int i10, @n0 Parcel parcel, @n0 Parcel parcel2, int i11) throws RemoteException {
            switch (i10) {
                case 2:
                    c cVarD = D();
                    parcel2.writeNoException();
                    j.f(parcel2, cVarD);
                    return true;
                case 3:
                    Bundle bundleE = E();
                    parcel2.writeNoException();
                    j.e(parcel2, bundleE);
                    return true;
                case 4:
                    int iA = A();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 5:
                    b bVarH1 = h1();
                    parcel2.writeNoException();
                    j.f(parcel2, bVarH1);
                    return true;
                case 6:
                    c cVarF = F();
                    parcel2.writeNoException();
                    j.f(parcel2, cVarF);
                    return true;
                case 7:
                    boolean zN0 = n0();
                    parcel2.writeNoException();
                    j.c(parcel2, zN0);
                    return true;
                case 8:
                    String strH = H();
                    parcel2.writeNoException();
                    parcel2.writeString(strH);
                    return true;
                case 9:
                    b bVarG = G();
                    parcel2.writeNoException();
                    j.f(parcel2, bVarG);
                    return true;
                case 10:
                    int iY = y();
                    parcel2.writeNoException();
                    parcel2.writeInt(iY);
                    return true;
                case 11:
                    boolean zQ0 = q0();
                    parcel2.writeNoException();
                    j.c(parcel2, zQ0);
                    return true;
                case 12:
                    c cVarB = B();
                    parcel2.writeNoException();
                    j.f(parcel2, cVarB);
                    return true;
                case 13:
                    boolean zJ0 = j0();
                    parcel2.writeNoException();
                    j.c(parcel2, zJ0);
                    return true;
                case 14:
                    boolean zK0 = k0();
                    parcel2.writeNoException();
                    j.c(parcel2, zK0);
                    return true;
                case 15:
                    boolean zZ0 = z0();
                    parcel2.writeNoException();
                    j.c(parcel2, zZ0);
                    return true;
                case 16:
                    boolean zB0 = B0();
                    parcel2.writeNoException();
                    j.c(parcel2, zB0);
                    return true;
                case 17:
                    boolean zT0 = t0();
                    parcel2.writeNoException();
                    j.c(parcel2, zT0);
                    return true;
                case 18:
                    boolean zV0 = v0();
                    parcel2.writeNoException();
                    j.c(parcel2, zV0);
                    return true;
                case 19:
                    boolean zP1 = p1();
                    parcel2.writeNoException();
                    j.c(parcel2, zP1);
                    return true;
                case 20:
                    c cVarN = c.a.N(parcel.readStrongBinder());
                    j.b(parcel);
                    e1(cVarN);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zG = j.g(parcel);
                    j.b(parcel);
                    M(zG);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zG2 = j.g(parcel);
                    j.b(parcel);
                    P(zG2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zG3 = j.g(parcel);
                    j.b(parcel);
                    T(zG3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zG4 = j.g(parcel);
                    j.b(parcel);
                    o0(zG4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) j.a(parcel, Intent.CREATOR);
                    j.b(parcel);
                    U(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) j.a(parcel, Intent.CREATOR);
                    int i12 = parcel.readInt();
                    j.b(parcel);
                    W(intent2, i12);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    c cVarN2 = c.a.N(parcel.readStrongBinder());
                    j.b(parcel);
                    N0(cVarN2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    int A() throws RemoteException;

    @n0
    c B() throws RemoteException;

    boolean B0() throws RemoteException;

    @n0
    c D() throws RemoteException;

    @p0
    Bundle E() throws RemoteException;

    @n0
    c F() throws RemoteException;

    @p0
    b G() throws RemoteException;

    @p0
    String H() throws RemoteException;

    void M(boolean z10) throws RemoteException;

    void N0(@n0 c cVar) throws RemoteException;

    void P(boolean z10) throws RemoteException;

    void T(boolean z10) throws RemoteException;

    void U(@n0 Intent intent) throws RemoteException;

    void W(@n0 Intent intent, int i10) throws RemoteException;

    void e1(@n0 c cVar) throws RemoteException;

    @p0
    b h1() throws RemoteException;

    boolean j0() throws RemoteException;

    boolean k0() throws RemoteException;

    boolean n0() throws RemoteException;

    void o0(boolean z10) throws RemoteException;

    boolean p1() throws RemoteException;

    boolean q0() throws RemoteException;

    boolean t0() throws RemoteException;

    boolean v0() throws RemoteException;

    int y() throws RemoteException;

    boolean z0() throws RemoteException;
}
