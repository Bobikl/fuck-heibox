package com.max.hbutils;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: IInProcessObjHoldBinder.java */
/* JADX INFO: loaded from: classes13.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: IInProcessObjHoldBinder.java */
    public static class a implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.max.hbutils.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IInProcessObjHoldBinder.java */
    public static abstract class AbstractBinderC0589b extends Binder implements b {
        private static final String DESCRIPTOR = "com.max.hbutils.IInProcessObjHoldBinder";
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.hbutils.b$b$a */
        /* JADX INFO: compiled from: IInProcessObjHoldBinder.java */
        public static class a implements b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static b f73448c;
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f73449b;

            a(IBinder iBinder) {
                this.f73449b = iBinder;
            }

            public String N() {
                return AbstractBinderC0589b.DESCRIPTOR;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f73449b;
            }
        }

        public AbstractBinderC0589b() {
            attachInterface(this, DESCRIPTOR);
        }

        public static b asInterface(IBinder iBinder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iBinder}, null, changeQuickRedirect, true, c.k.zm, new Class[]{IBinder.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b getDefaultImpl() {
            return a.f73448c;
        }

        public static boolean setDefaultImpl(b bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, c.k.Bm, new Class[]{b.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (a.f73448c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (bVar == null) {
                return false;
            }
            a.f73448c = bVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            Object[] objArr = {new Integer(i10), parcel, parcel2, new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.Am, new Class[]{cls, Parcel.class, Parcel.class, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }
}
