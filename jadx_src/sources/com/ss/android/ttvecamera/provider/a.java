package com.ss.android.ttvecamera.provider;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.q;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: compiled from: TECallbackWithBufferProvider.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f97763v = "a";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f97764w = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Camera.PreviewCallback f97765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f97766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SurfaceTexture f97767s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte[][] f97768t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f97769u;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.provider.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TECallbackWithBufferProvider.java */
    public class C0931a implements Camera.PreviewCallback {
        C0931a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (a.this.z(bArr)) {
                TEFrameSizei tEFrameSizei = a.this.f97779c;
                TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.f97206b, tEFrameSizei.f97207c, System.currentTimeMillis() * 1000);
                tECameraFrame.p(bArr, a.this.f97780d.E(), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21, a.this.f97780d.u().f97080d);
                a.this.p(tECameraFrame);
            }
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        }
    }

    public a(c.a aVar, j jVar) {
        super(aVar, jVar);
        this.f97766r = 0;
        this.f97768t = null;
        this.f97769u = 0;
        this.f97767s = aVar.f97794d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public boolean z(byte[] bArr) {
        TEFrameSizei tEFrameSizei;
        int i10;
        boolean z10;
        int length = bArr != null ? bArr.length : 0;
        if (length > 0 && (tEFrameSizei = this.f97779c) != null && (i10 = this.f97766r) < 3) {
            this.f97766r = i10 + 1;
            int i11 = tEFrameSizei.f97206b * tEFrameSizei.f97207c;
            if (i11 > length) {
                q.e(f97763v, "checkPreviewData failed: mSize: " + this.f97779c + ", length: " + length);
                return false;
            }
            int i12 = i11 / 300;
            int i13 = i12 / 2;
            byte b10 = bArr[0];
            byte b11 = bArr[i11];
            int i14 = 0;
            while (true) {
                if (i14 < 300) {
                    int i15 = i14 * i12;
                    int i16 = (i14 * i13) + i11;
                    if (i15 < length && i16 < length) {
                        if (b10 == bArr[i15] && b11 == bArr[i16]) {
                            i14++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        return false;
                    }
                }
                z10 = false;
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    public byte[][] A(int i10) {
        TEFrameSizei tEFrameSizei = this.f97779c;
        int i11 = ((tEFrameSizei.f97206b * tEFrameSizei.f97207c) * 3) / 2;
        String str = f97763v;
        q.b(str, "getBuffers current bufferSize: " + i11 + " mCallbackBytebufferSize:" + this.f97769u);
        int i12 = this.f97769u;
        if (i11 > i12 || i12 == 0) {
            this.f97768t = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i11);
            q.b(str, "new mCallbackBytebuffer size :" + i11);
            this.f97769u = i11;
        }
        return this.f97768t;
    }

    public Camera.PreviewCallback B() {
        return this.f97765q;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public Surface f() {
        return null;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public SurfaceTexture g() {
        return this.f97767s;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int j() {
        return 4;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int k(@n0 Camera.Parameters parameters, TEFrameSizei tEFrameSizei) {
        return m(b.a(parameters.getSupportedPreviewSizes()), tEFrameSizei);
    }

    @Override // com.ss.android.ttvecamera.provider.b
    @w0(api = 15)
    public int m(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f97779c = p.b(list, tEFrameSizei);
        }
        SurfaceTexture surfaceTexture = this.f97767s;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.f97779c;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c);
        }
        this.f97765q = new C0931a();
        return 0;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void q() {
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void w(SurfaceTexture surfaceTexture, boolean z10) {
    }
}
