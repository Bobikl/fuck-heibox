package com.tencent.thumbplayer.tcmedia.tplayer;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.n;
import com.tencent.thumbplayer.tcmedia.utils.q;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f103064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f103065b;

    public d(b bVar) {
        this.f103064a = bVar;
        this.f103065b = new q(bVar.b(), this.f103064a.a(), this.f103064a);
    }

    private int a(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    private boolean a(Method method, Object[] objArr) {
        return n.a(this.f103064a.getClass(), method.getName(), objArr) != null;
    }

    private Object b(Method method, Object[] objArr) {
        String name = method.getName();
        if (name.equals("setDataSource")) {
            objArr = b(objArr);
        }
        if (method.getReturnType().getName().equals("void")) {
            this.f103065b.b(name, objArr);
            return null;
        }
        Object objA = this.f103065b.a(name, objArr);
        TPLogUtil.i(this.f103064a.b(), "dealThreadSwitch: " + name + ", var count:" + a(objArr) + ", result:" + objA);
        return objA;
    }

    private Object[] b(Object[] objArr) {
        String strB;
        StringBuilder sb2;
        Object obj = objArr[0];
        if (obj != null && (obj instanceof ParcelFileDescriptor)) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                objArr[0] = ParcelFileDescriptor.fromFd(parcelFileDescriptor.detachFd());
                parcelFileDescriptor.close();
            } catch (Exception e10) {
                e = e10;
                strB = this.f103064a.b();
                sb2 = new StringBuilder("setDataSource, fromFd has exception:");
                sb2.append(e.toString());
                TPLogUtil.e(strB, sb2.toString());
            }
        } else if (obj != null && (obj instanceof AssetFileDescriptor)) {
            try {
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                objArr[0] = new AssetFileDescriptor(ParcelFileDescriptor.fromFd(assetFileDescriptor.getParcelFileDescriptor().detachFd()), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                assetFileDescriptor.close();
            } catch (Exception e11) {
                e = e11;
                strB = this.f103064a.b();
                sb2 = new StringBuilder("setDataSource, fromFd has exception:");
                sb2.append(e.toString());
                TPLogUtil.e(strB, sb2.toString());
            }
        }
        return objArr;
    }

    public Object a() {
        return Proxy.newProxyInstance(this.f103064a.getClass().getClassLoader(), this.f103064a.getClass().getInterfaces(), this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return !a(method, objArr) ? method.invoke(this.f103064a, objArr) : b(method, objArr);
    }
}
