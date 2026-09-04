package com.tencent.thumbplayer.tcmedia.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f103178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f103179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Looper f103180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f103181d = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f103182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Class<?> f103183f;

    public class a extends Handler {
        private a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            q.this.a(message);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f103185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f103186b;

        private b() {
        }
    }

    public q(String str, Looper looper, Object obj) {
        this.f103178a = str;
        this.f103180c = looper;
        this.f103179b = new a(this.f103180c);
        this.f103182e = obj;
        Class<?> cls = obj.getClass();
        this.f103183f = cls;
        if (n.a(cls, 0)) {
            return;
        }
        TPLogUtil.e(this.f103178a, "Register " + this.f103183f.getName() + " @ThreadSwitch method failed, version: 2.32.0.448");
        throw new RuntimeException("register @ThreadSwitch method failed, player can not work");
    }

    private Object a(int i10, int i11, int i12, Object obj, boolean z10, boolean z11, long j10) {
        e eVar = new e();
        b bVar = new b();
        bVar.f103185a = obj;
        bVar.f103186b = eVar;
        b(i10, i11, i12, bVar, z10, z11, j10);
        return eVar.a(500L);
    }

    private Object a(String str, Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        String name = n.a(this.f103183f, str, a(obj2)).getReturnType().getName();
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

    private String a(int i10) {
        String strB = n.b(this.f103183f, i10);
        if (!TextUtils.isEmpty(strB) && !strB.equals("unknown")) {
            return strB;
        }
        return i10 + " not find";
    }

    private void a(int i10, Object obj) {
        Object objInvoke;
        e eVar = obj instanceof b ? ((b) obj).f103186b : null;
        Method methodF = n.f(this.f103183f, i10);
        if (methodF == null) {
            TPLogUtil.e(this.f103178a, "invokeMethod, handle method name is empty, msg:".concat(String.valueOf(i10)));
            if (eVar != null) {
                eVar.a((Throwable) new RuntimeException("invokeMethod, handle method name is empty"));
                return;
            }
            return;
        }
        try {
            if (methodF.getParameterTypes().length == 0) {
                objInvoke = methodF.invoke(this.f103182e, new Object[0]);
            } else {
                objInvoke = methodF.invoke(this.f103182e, a(obj));
            }
            if (eVar != null) {
                eVar.a(objInvoke);
            }
        } catch (InvocationTargetException e10) {
            TPLogUtil.e(this.f103178a, "invokeMethod " + methodF.getName() + " has excecption: " + e10.getTargetException().toString());
            if (eVar == null) {
                return;
            }
            if (e10.getTargetException() instanceof IllegalArgumentException) {
                eVar.a((Throwable) new IllegalArgumentException("invokeMethod " + methodF.getName() + " failed, params invalid", e10.getCause()));
                return;
            }
            if (!(e10.getTargetException() instanceof IllegalStateException)) {
                eVar.a(e10.getTargetException());
                return;
            }
            eVar.a((Throwable) new IllegalStateException("invokeMethod " + methodF.getName() + " failed, state invalid", e10.getCause()));
        } catch (Exception e11) {
            TPLogUtil.e(this.f103178a, "invokeMethod " + methodF.getName() + " has excecption: " + e11.toString());
            if (eVar != null) {
                eVar.a((Throwable) e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (this.f103182e == null) {
            TPLogUtil.e(this.f103178a, "handle listener is null, return");
        } else {
            a(message.what, message.obj);
        }
    }

    private boolean a() {
        return Looper.myLooper() == this.f103180c;
    }

    private Object[] a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof b)) {
            return (Object[]) obj;
        }
        Object obj2 = ((b) obj).f103185a;
        if (obj2 == null) {
            return null;
        }
        return (Object[]) obj2;
    }

    private boolean b(int i10, int i11, int i12, Object obj, boolean z10, boolean z11, long j10) {
        String str;
        StringBuilder sb2;
        String str2;
        if (this.f103179b == null) {
            str = this.f103178a;
            sb2 = new StringBuilder();
            sb2.append(a(i10));
            str2 = " , send failed , handler null";
        } else if (z10 && obj == null) {
            str = this.f103178a;
            sb2 = new StringBuilder();
            sb2.append(a(i10));
            str2 = ", send failed , params null";
        } else {
            if (this.f103180c.getThread().isAlive()) {
                if (!a()) {
                    this.f103181d.readLock().lock();
                }
                if (z11) {
                    this.f103179b.removeMessages(i10);
                }
                Message messageObtainMessage = this.f103179b.obtainMessage();
                messageObtainMessage.what = i10;
                messageObtainMessage.arg1 = i11;
                messageObtainMessage.arg2 = i12;
                messageObtainMessage.obj = obj;
                if (a()) {
                    a(messageObtainMessage);
                    return true;
                }
                this.f103179b.sendMessageDelayed(messageObtainMessage, j10);
                this.f103181d.readLock().unlock();
                return true;
            }
            str = this.f103178a;
            sb2 = new StringBuilder();
            sb2.append(a(i10));
            str2 = ", send failed , thread had dead";
        }
        sb2.append(str2);
        TPLogUtil.e(str, sb2.toString());
        return false;
    }

    public Object a(String str, Object obj) {
        return a(str, b(str, obj), obj);
    }

    public Object b(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            TPLogUtil.e(this.f103178a, "dealThreadSwitch failed , methodName is null");
            throw new RuntimeException("dealThreadSwitch failed , methodName is null");
        }
        int iB = n.b(this.f103183f, str, a(obj));
        if (iB < 0) {
            TPLogUtil.e(this.f103178a, "dealThreadSwitch failed , not match method:".concat(String.valueOf(str)));
            throw new RuntimeException("dealThreadSwitch failed , not match method:".concat(String.valueOf(str)));
        }
        boolean zD = n.d(this.f103183f, iB);
        boolean zE = n.e(this.f103183f, iB);
        if (n.c(this.f103183f, iB)) {
            return a(iB, 0, 0, obj, zE, zD, 0L);
        }
        b(iB, 0, 0, obj, zE, zD, 0L);
        return null;
    }
}
