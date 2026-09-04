package com.tencent.thumbplayer.tcmedia.adapter;

import com.meituan.robust.Constants;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class f implements InvocationHandler {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, Class> f102376f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f102377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.tplayer.a f102378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f102379c = new g("TPPlayerAdapterProxy");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f102380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f102381e;

    public class a implements com.tencent.thumbplayer.tcmedia.adapter.a.c.f, com.tencent.thumbplayer.tcmedia.adapter.a.c.g, com.tencent.thumbplayer.tcmedia.adapter.a.c.h, com.tencent.thumbplayer.tcmedia.adapter.a.c.i, com.tencent.thumbplayer.tcmedia.adapter.a.c.j {
        private a() {
        }

        private void a(long j10, long j11, Object obj) {
            f.this.f102378b.b().a(new com.tencent.thumbplayer.tcmedia.d.b.c());
        }

        private void b(long j10, long j11, Object obj) {
            f.this.f102378b.b().a(new com.tencent.thumbplayer.tcmedia.d.b.C1018b());
        }

        private void c(long j10, long j11, Object obj) {
            com.tencent.thumbplayer.tcmedia.d.b.s sVar = new com.tencent.thumbplayer.tcmedia.d.b.s();
            sVar.a(((Long) obj).longValue());
            sVar.b((int) j11);
            f.this.f102378b.b().a(sVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.i
        public void a() {
            com.tencent.thumbplayer.tcmedia.d.b.o oVar = new com.tencent.thumbplayer.tcmedia.d.b.o();
            oVar.b(f.this.f102377a.d());
            oVar.a(f.this.f102377a.n());
            f.this.f102378b.b().a(oVar);
            f.this.f102379c.a();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.f
        public void a(@TPCommonEnum.TPErrorType int i10, int i11, long j10, long j11) {
            com.tencent.thumbplayer.tcmedia.d.b.i iVar = new com.tencent.thumbplayer.tcmedia.d.b.i();
            iVar.c(i11);
            iVar.b(i10);
            TPGeneralPlayFlowParams tPGeneralPlayFlowParamsV = f.this.f102377a.v();
            if (tPGeneralPlayFlowParamsV == null) {
                tPGeneralPlayFlowParamsV = new TPGeneralPlayFlowParams();
            }
            iVar.a(tPGeneralPlayFlowParamsV);
            TPDynamicStatisticParams tPDynamicStatisticParamsC = f.this.f102377a.c(false);
            if (tPDynamicStatisticParamsC == null) {
                tPDynamicStatisticParamsC = new TPDynamicStatisticParams();
            }
            iVar.a(tPDynamicStatisticParamsC);
            f.this.f102378b.b().a(iVar);
            f.this.f102379c.a(i10, i11, j10, j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.h
        public void a(int i10, long j10, long j11, Object obj) {
            if (i10 == 4) {
                c(j10, j11, obj);
            } else if (i10 == 200) {
                a(j10, j11, obj);
            } else if (i10 == 201) {
                b(j10, j11, obj);
            }
            f.this.f102379c.a(i10, j10, j11, obj);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.g
        public void a(TPDrmInfo tPDrmInfo) {
            com.tencent.thumbplayer.tcmedia.d.b.h hVar = new com.tencent.thumbplayer.tcmedia.d.b.h();
            hVar.a(tPDrmInfo);
            f.this.f102378b.b().a(hVar);
            f.this.f102379c.a(tPDrmInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.j
        public void c() {
            f.this.f102378b.b().a(new com.tencent.thumbplayer.tcmedia.d.b.q());
            f.this.f102379c.c();
        }
    }

    static {
        HashMap map = new HashMap();
        f102376f = map;
        map.put("setOnPreparedListener", com.tencent.thumbplayer.tcmedia.adapter.a.c.i.class);
        map.put("setOnInfoListener", com.tencent.thumbplayer.tcmedia.adapter.a.c.h.class);
        map.put("setOnErrorListener", com.tencent.thumbplayer.tcmedia.adapter.a.c.f.class);
        map.put("setOnSeekCompleteListener", com.tencent.thumbplayer.tcmedia.adapter.a.c.j.class);
    }

    public f(d dVar, com.tencent.thumbplayer.tcmedia.tplayer.a aVar) {
        a aVar2 = new a();
        this.f102380d = aVar2;
        this.f102377a = dVar;
        this.f102378b = aVar;
        dVar.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.g) aVar2);
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
        switch (name) {
            case "prepareAsync":
                a(objArr);
                break;
            case "seekTo":
                g(objArr);
                break;
            case "stop":
                d(objArr);
                break;
            case "pause":
                c(objArr);
                break;
            case "reset":
                e(objArr);
                break;
            case "start":
                b(objArr);
                break;
            case "selectTrack":
                i(objArr);
                break;
            case "setPlaySpeedRatio":
                h(objArr);
                break;
            case "release":
                f(objArr);
                break;
        }
    }

    private void a(Object[] objArr) {
    }

    private void b(Method method, Object[] objArr) {
        Map<String, Class> map = f102376f;
        if (map.containsKey(method.getName())) {
            try {
                this.f102379c.getClass().getMethod(method.getName(), map.get(method.getName())).invoke(this.f102379c, objArr[0]);
                objArr[0] = this.f102380d;
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
    }

    private void b(Object[] objArr) {
        this.f102378b.b().a(new com.tencent.thumbplayer.tcmedia.d.b.m());
    }

    private void c(Object[] objArr) {
        this.f102378b.b().a(new com.tencent.thumbplayer.tcmedia.d.b.j());
    }

    private void d(Object[] objArr) {
        com.tencent.thumbplayer.tcmedia.d.b.n nVar = new com.tencent.thumbplayer.tcmedia.d.b.n();
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsV = this.f102377a.v();
        if (tPGeneralPlayFlowParamsV == null) {
            tPGeneralPlayFlowParamsV = new TPGeneralPlayFlowParams();
        }
        nVar.a(tPGeneralPlayFlowParamsV);
        TPDynamicStatisticParams tPDynamicStatisticParamsC = this.f102377a.c(false);
        if (tPDynamicStatisticParamsC == null) {
            tPDynamicStatisticParamsC = new TPDynamicStatisticParams();
        }
        nVar.a(tPDynamicStatisticParamsC);
        this.f102378b.b().a(nVar);
    }

    private void e(Object[] objArr) {
        com.tencent.thumbplayer.tcmedia.d.b.l lVar = new com.tencent.thumbplayer.tcmedia.d.b.l();
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsV = this.f102377a.v();
        if (tPGeneralPlayFlowParamsV == null) {
            tPGeneralPlayFlowParamsV = new TPGeneralPlayFlowParams();
        }
        lVar.a(tPGeneralPlayFlowParamsV);
        TPDynamicStatisticParams tPDynamicStatisticParamsC = this.f102377a.c(false);
        if (tPDynamicStatisticParamsC == null) {
            tPDynamicStatisticParamsC = new TPDynamicStatisticParams();
        }
        lVar.a(tPDynamicStatisticParamsC);
        this.f102378b.b().a(lVar);
    }

    private void f(Object[] objArr) {
        this.f102378b.b().a(new com.tencent.thumbplayer.tcmedia.d.b.k());
    }

    private void g(Object[] objArr) {
        this.f102378b.b().a(new com.tencent.thumbplayer.tcmedia.d.b.r());
    }

    private void h(Object[] objArr) {
        com.tencent.thumbplayer.tcmedia.d.b.v vVar = new com.tencent.thumbplayer.tcmedia.d.b.v();
        vVar.a(((Float) objArr[0]).floatValue());
        this.f102378b.b().a(vVar);
    }

    private void i(Object[] objArr) {
        com.tencent.thumbplayer.tcmedia.d.b.t tVar = new com.tencent.thumbplayer.tcmedia.d.b.t();
        tVar.b(((Integer) objArr[0]).intValue());
        tVar.a(((Long) objArr[1]).longValue());
        tVar.a(this.f102377a.s()[((Integer) objArr[0]).intValue()]);
        this.f102378b.b().a(tVar);
    }

    public synchronized Object a() {
        if (this.f102381e == null) {
            this.f102381e = Proxy.newProxyInstance(this.f102377a.getClass().getClassLoader(), this.f102377a.getClass().getInterfaces(), this);
        }
        return this.f102381e;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        StringBuilder sb2;
        String string;
        try {
            a(method, objArr);
            b(method, objArr);
            return method.invoke(this.f102377a, objArr);
        } catch (InvocationTargetException e10) {
            if (e10.getTargetException() != null) {
                throw e10.getTargetException();
            }
            sb2 = new StringBuilder("invokeMethod ");
            sb2.append(method.getName());
            sb2.append(" has excecption: ");
            string = e10.toString();
            sb2.append(string);
            TPLogUtil.e("TPPlayerAdapterProxy", sb2.toString());
            return a(method);
        } catch (Throwable th2) {
            sb2 = new StringBuilder("invokeMethod ");
            sb2.append(method.getName());
            sb2.append(" has excecption: ");
            string = th2.toString();
            sb2.append(string);
            TPLogUtil.e("TPPlayerAdapterProxy", sb2.toString());
            return a(method);
        }
    }
}
