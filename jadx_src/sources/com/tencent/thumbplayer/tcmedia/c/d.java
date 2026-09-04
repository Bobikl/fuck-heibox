package com.tencent.thumbplayer.tcmedia.c;

import com.meituan.robust.Constants;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f102496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.tplayer.a f102497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ITPPlayListener f102498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f102499d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f102500e;

    public class a implements ITPPlayListener {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            return d.this.f102498c.getAdvRemainTime();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getContentType(int i10, String str) {
            return d.this.f102498c.getContentType(i10, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            return d.this.f102498c.getCurrentPlayClipNo();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long[] getCurrentPlayOffset() {
            return d.this.f102498c.getCurrentPlayOffset();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return d.this.f102498c.getCurrentPosition();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getDataFilePath(int i10, String str) {
            return d.this.f102498c.getDataFilePath(i10, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i10, String str) {
            return d.this.f102498c.getDataTotalSize(i10, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(long j10) {
            return d.this.f102498c.getPlayInfo(j10);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(String str) {
            return d.this.f102498c.getPlayInfo(str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            return d.this.f102498c.getPlayerBufferLength();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            d.this.f102498c.onDownloadCdnUrlExpired(map);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            com.tencent.thumbplayer.tcmedia.d.b.d dVar = new com.tencent.thumbplayer.tcmedia.d.b.d();
            dVar.a(str2);
            dVar.b(str3);
            d.this.f102497b.b().a(dVar);
            d.this.f102498c.onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(String str) {
            d.this.f102498c.onDownloadCdnUrlUpdate(str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i10, int i11, String str) {
            d.this.f102498c.onDownloadError(i10, i11, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            d.this.f102498c.onDownloadFinish();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) {
            com.tencent.thumbplayer.tcmedia.d.b.e eVar = new com.tencent.thumbplayer.tcmedia.d.b.e();
            eVar.b(i11 * 8);
            d.this.f102497b.b().a(eVar);
            d.this.f102498c.onDownloadProgressUpdate(i10, i11, j10, j11, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(String str, String str2) {
            com.tencent.thumbplayer.tcmedia.d.b.f fVar = new com.tencent.thumbplayer.tcmedia.d.b.f();
            fVar.b(str);
            fVar.a(str2);
            d.this.f102497b.b().a(fVar);
            d.this.f102498c.onDownloadProtocolUpdate(str, str2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i10) {
            d.this.f102498c.onDownloadStatusUpdate(i10);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object onPlayCallback(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
            return d.this.f102498c.onPlayCallback(i10, obj, obj2, obj3, obj4);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i10, String str, long j10, long j11) {
            return d.this.f102498c.onReadData(i10, str, j10, j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i10, String str, long j10, long j11) {
            return d.this.f102498c.onStartReadData(i10, str, j10, j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i10, String str, int i11) {
            return d.this.f102498c.onStopReadData(i10, str, i11);
        }
    }

    public d(e eVar, com.tencent.thumbplayer.tcmedia.tplayer.a aVar) {
        this.f102496a = eVar;
        this.f102497b = aVar;
    }

    private static Object a(Method method) {
        String name = method.getReturnType().getName();
        if (name.equals("boolean")) {
            return Boolean.FALSE;
        }
        if (name.equals(Constants.INT)) {
            return 0;
        }
        if (name.equals(Constants.LONG)) {
            return 0L;
        }
        if (name.equals("float")) {
            return Float.valueOf(0.0f);
        }
        return null;
    }

    private void a(Method method, Object[] objArr) {
        String name = method.getName();
        name.hashCode();
        if (name.equals("startDownloadPlayByAsset") || name.equals("startDownloadPlay")) {
            a(objArr);
        }
    }

    private void a(Object[] objArr) {
        this.f102497b.b().a(new com.tencent.thumbplayer.tcmedia.d.b.g());
    }

    private void b(Method method, Object[] objArr) {
        if (method.getName().equals("setPlayListener")) {
            this.f102498c = (ITPPlayListener) objArr[0];
            objArr[0] = this.f102499d;
        }
    }

    public synchronized Object a() {
        if (this.f102500e == null) {
            this.f102500e = Proxy.newProxyInstance(this.f102496a.getClass().getClassLoader(), this.f102496a.getClass().getInterfaces(), this);
        }
        return this.f102500e;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        StringBuilder sb2;
        String string;
        b(method, objArr);
        try {
            Object objInvoke = method.invoke(this.f102496a, objArr);
            a(method, objArr);
            return objInvoke;
        } catch (InvocationTargetException e10) {
            if (e10.getTargetException() != null) {
                throw e10.getTargetException();
            }
            sb2 = new StringBuilder("invokeMethod ");
            sb2.append(method.getName());
            sb2.append(" has excecption: ");
            string = e10.toString();
            sb2.append(string);
            TPLogUtil.e("TPDataTransportManagerProxy", sb2.toString());
            return a(method);
        } catch (Throwable th2) {
            sb2 = new StringBuilder("invokeMethod ");
            sb2.append(method.getName());
            sb2.append(" has excecption: ");
            string = th2.toString();
            sb2.append(string);
            TPLogUtil.e("TPDataTransportManagerProxy", sb2.toString());
            return a(method);
        }
    }
}
