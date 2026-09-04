package com.ss.android.ttvecamera.focusmanager;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.ss.android.ttvecamera.q;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Gyro.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f97405g = "Gyro";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f97406h = 1.0E-9f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f97407i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f97408j = 0.5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f97409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Sensor f97410b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f97412d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f97411c = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f97413e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SensorEventListener f97414f = new C0928a();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.focusmanager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Gyro.java */
    public class C0928a implements SensorEventListener {
        C0928a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (a.this.f97412d != 0.0f) {
                float f10 = (sensorEvent.timestamp - a.this.f97412d) * a.f97406h;
                float[] fArr = sensorEvent.values;
                float f11 = fArr[0];
                float f12 = fArr[1];
                float f13 = fArr[2];
                float fSqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13));
                float[] fArr2 = a.this.f97411c;
                fArr2[0] = fArr2[0] + (sensorEvent.values[0] * f10);
                float[] fArr3 = a.this.f97411c;
                fArr3[1] = fArr3[1] + (sensorEvent.values[1] * f10);
                float[] fArr4 = a.this.f97411c;
                fArr4[2] = fArr4[2] + (sensorEvent.values[2] * f10);
                float fSqrt2 = (float) Math.sqrt((a.this.f97411c[0] * a.this.f97411c[0]) + (a.this.f97411c[1] * a.this.f97411c[1]) + (a.this.f97411c[2] * a.this.f97411c[2]));
                if (fSqrt > 0.5f || fSqrt2 > 0.5f) {
                    q.b(a.f97405g, "onSensorChanged omegaMagnitude = " + fSqrt + " angle = " + fSqrt2);
                    Iterator it = a.this.f97413e.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).a();
                    }
                    a.this.f();
                }
            }
            a.this.f97412d = sensorEvent.timestamp;
        }
    }

    /* JADX INFO: compiled from: Gyro.java */
    public interface b {
        void a();
    }

    public a(Context context) {
        q.b(f97405g, f97405g);
        if (context != null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService(ak.f104420ac);
            this.f97409a = sensorManager;
            this.f97410b = sensorManager.getDefaultSensor(4);
        } else {
            this.f97409a = null;
            this.f97410b = null;
            q.e(f97405g, "Gyro init failed, no context");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        q.b(f97405g, "clearAngle");
        float[] fArr = this.f97411c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
    }

    public void g() {
        q.k(f97405g, "destroy");
        this.f97413e.clear();
        f();
        SensorManager sensorManager = this.f97409a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f97414f, this.f97410b);
        }
    }

    public void h(b bVar, Handler handler) {
        if (this.f97409a == null || this.f97413e.contains(bVar)) {
            return;
        }
        q.k(f97405g, "register");
        this.f97413e.add(bVar);
        if (this.f97413e.size() == 1) {
            try {
                this.f97409a.registerListener(this.f97414f, this.f97410b, 3, handler);
            } catch (RuntimeException e10) {
                q.v(f97405g, "sensorManager register listener exception occurred.", e10);
                this.f97413e.remove(bVar);
            }
            q.b(f97405g, "sensorManager register listener");
        }
        f();
    }

    public void i(b bVar) {
        if (this.f97409a == null) {
            return;
        }
        q.k(f97405g, MiPushClient.COMMAND_UNREGISTER);
        this.f97413e.remove(bVar);
        if (this.f97413e.isEmpty()) {
            this.f97409a.unregisterListener(this.f97414f, this.f97410b);
            q.b(f97405g, "sensorManager unregister listener");
        }
        f();
    }
}
