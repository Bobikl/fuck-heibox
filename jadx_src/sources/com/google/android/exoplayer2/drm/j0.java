package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: FrameworkMediaDrm.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class j0 implements b0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44715j = "FrameworkMediaDrm";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b0.g f44716k = new b0.g() { // from class: com.google.android.exoplayer2.drm.g0
        @Override // com.google.android.exoplayer2.drm.b0.g
        public final b0 a(UUID uuid) {
            return j0.A(uuid);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44717l = "cenc";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f44718m = "https://x";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44719n = "<LA_URL>https://x</LA_URL>";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f44720o = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final UUID f44721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MediaDrm f44722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44723i;

    /* JADX INFO: compiled from: FrameworkMediaDrm.java */
    @w0(31)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    private j0(UUID uuid) throws UnsupportedSchemeException {
        com.google.android.exoplayer2.util.a.g(uuid);
        com.google.android.exoplayer2.util.a.b(!com.google.android.exoplayer2.j.V1.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f44721g = uuid;
        MediaDrm mediaDrm = new MediaDrm(s(uuid));
        this.f44722h = mediaDrm;
        this.f44723i = 1;
        if (com.google.android.exoplayer2.j.X1.equals(uuid) && B()) {
            u(mediaDrm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b0 A(UUID uuid) {
        try {
            return C(uuid);
        } catch (UnsupportedDrmException unused) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 53);
            sb2.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb2.append(strValueOf);
            sb2.append(".");
            com.google.android.exoplayer2.util.u.d(f44715j, sb2.toString());
            return new z();
        }
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(u0.f51539d);
    }

    public static j0 C(UUID uuid) throws UnsupportedDrmException {
        try {
            return new j0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    private static byte[] o(byte[] bArr) {
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(bArr);
        int iR = e0Var.r();
        short sU = e0Var.u();
        short sU2 = e0Var.u();
        if (sU != 1 || sU2 != 1) {
            com.google.android.exoplayer2.util.u.h(f44715j, "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sU3 = e0Var.u();
        Charset charset = com.google.common.base.c.f56723e;
        String strE = e0Var.E(sU3, charset);
        if (strE.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strE.indexOf("</DATA>");
        if (iIndexOf == -1) {
            com.google.android.exoplayer2.util.u.m(f44715j, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String strSubstring = strE.substring(0, iIndexOf);
        String strSubstring2 = strE.substring(iIndexOf);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + 26 + String.valueOf(strSubstring2).length());
        sb2.append(strSubstring);
        sb2.append(f44719n);
        sb2.append(strSubstring2);
        String string = sb2.toString();
        int i10 = iR + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sU);
        byteBufferAllocate.putShort(sU2);
        byteBufferAllocate.putShort((short) (string.length() * 2));
        byteBufferAllocate.put(string.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private static byte[] p(UUID uuid, byte[] bArr) {
        return com.google.android.exoplayer2.j.W1.equals(uuid) ? com.google.android.exoplayer2.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    private static byte[] q(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        UUID uuid2 = com.google.android.exoplayer2.j.Y1;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = com.google.android.exoplayer2.extractor.mp4.l.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = com.google.android.exoplayer2.extractor.mp4.l.a(uuid2, o(bArr));
        }
        if (u0.f51536a < 23 && com.google.android.exoplayer2.j.X1.equals(uuid)) {
            bArrE = com.google.android.exoplayer2.extractor.mp4.l.e(bArr, uuid);
            if (bArrE != null) {
                return bArrE;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(u0.f51538c)) {
            String str = u0.f51539d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrE = com.google.android.exoplayer2.extractor.mp4.l.e(bArr, uuid);
                if (bArrE != null) {
                    return bArrE;
                }
            }
        }
        return bArr;
    }

    private static String r(UUID uuid, String str) {
        return (u0.f51536a < 26 && com.google.android.exoplayer2.j.W1.equals(uuid) && ("video/mp4".equals(str) || com.google.android.exoplayer2.util.y.f51610z.equals(str))) ? "cenc" : str;
    }

    private static UUID s(UUID uuid) {
        return (u0.f51536a >= 27 || !com.google.android.exoplayer2.j.W1.equals(uuid)) ? uuid : com.google.android.exoplayer2.j.V1;
    }

    @SuppressLint({"WrongConstant"})
    private static void u(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData v(UUID uuid, List<DrmInitData.SchemeData> list) {
        boolean z10;
        if (!com.google.android.exoplayer2.j.X1.equals(uuid)) {
            return list.get(0);
        }
        if (u0.f51536a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i10 = 0;
            int length = 0;
            while (true) {
                if (i10 >= list.size()) {
                    z10 = true;
                    break;
                }
                DrmInitData.SchemeData schemeData2 = list.get(i10);
                byte[] bArr = (byte[]) com.google.android.exoplayer2.util.a.g(schemeData2.f44658f);
                if (!u0.c(schemeData2.f44657e, schemeData.f44657e) || !u0.c(schemeData2.f44656d, schemeData.f44656d) || !com.google.android.exoplayer2.extractor.mp4.l.c(bArr)) {
                    z10 = false;
                    break;
                }
                length += bArr.length;
                i10++;
            }
            if (z10) {
                byte[] bArr2 = new byte[length];
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    byte[] bArr3 = (byte[]) com.google.android.exoplayer2.util.a.g(list.get(i12).f44658f);
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i11, length2);
                    i11 += length2;
                }
                return schemeData.b(bArr2);
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            DrmInitData.SchemeData schemeData3 = list.get(i13);
            int iG = com.google.android.exoplayer2.extractor.mp4.l.g((byte[]) com.google.android.exoplayer2.util.a.g(schemeData3.f44658f));
            int i14 = u0.f51536a;
            if (i14 < 23 && iG == 0) {
                return schemeData3;
            }
            if (i14 >= 23 && iG == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    public static boolean w(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(s(uuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(b0.d dVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        dVar.a(this, bArr, i10, i11, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(b0.e eVar, MediaDrm mediaDrm, byte[] bArr, long j10) {
        eVar.a(this, bArr, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(b0.f fVar, MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new b0.c(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        fVar.a(this, bArr, arrayList, z10);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public synchronized void a() {
        com.google.android.exoplayer2.util.a.i(this.f44723i > 0);
        this.f44723i++;
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void b(@androidx.annotation.p0 final b0.d dVar) {
        this.f44722h.setOnEventListener(dVar == null ? null : new MediaDrm.OnEventListener() { // from class: com.google.android.exoplayer2.drm.f0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f44702a.x(dVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void c(String str, byte[] bArr) {
        this.f44722h.setPropertyByteArray(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void closeSession(byte[] bArr) {
        this.f44722h.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    @w0(23)
    public void d(@androidx.annotation.p0 final b0.f fVar) {
        if (u0.f51536a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f44722h.setOnKeyStatusChangeListener(fVar == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: com.google.android.exoplayer2.drm.h0
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
                this.f44707a.z(fVar, mediaDrm, bArr, list, z10);
            }
        }, (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    @w0(23)
    public void e(@androidx.annotation.p0 final b0.e eVar) {
        if (u0.f51536a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f44722h.setOnExpirationUpdateListener(eVar == null ? null : new MediaDrm.OnExpirationUpdateListener() { // from class: com.google.android.exoplayer2.drm.e0
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j10) {
                this.f44700a.y(eVar, mediaDrm, bArr, j10);
            }
        }, (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public int f() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.b0
    @androidx.annotation.p0
    public PersistableBundle getMetrics() {
        if (u0.f51536a < 28) {
            return null;
        }
        return this.f44722h.getMetrics();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public String getPropertyString(String str) {
        return this.f44722h.getPropertyString(str);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public b0.h getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f44722h.getProvisionRequest();
        return new b0.h(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public boolean h(byte[] bArr, String str) {
        if (u0.f51536a >= 31) {
            return a.a(this.f44722h, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f44721g, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public byte[] i(String str) {
        return this.f44722h.getPropertyByteArray(str);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    @SuppressLint({"WrongConstant"})
    public b0.b j(byte[] bArr, @androidx.annotation.p0 List<DrmInitData.SchemeData> list, int i10, @androidx.annotation.p0 HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArrQ;
        String strR;
        DrmInitData.SchemeData schemeDataV = null;
        if (list != null) {
            schemeDataV = v(this.f44721g, list);
            bArrQ = q(this.f44721g, (byte[]) com.google.android.exoplayer2.util.a.g(schemeDataV.f44658f));
            strR = r(this.f44721g, schemeDataV.f44657e);
        } else {
            bArrQ = null;
            strR = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f44722h.getKeyRequest(bArr, bArrQ, strR, i10, map);
        byte[] bArrP = p(this.f44721g, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if (f44718m.equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeDataV != null && !TextUtils.isEmpty(schemeDataV.f44656d)) {
            defaultUrl = schemeDataV.f44656d;
        }
        return new b0.b(bArrP, defaultUrl, u0.f51536a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public byte[] openSession() throws MediaDrmException {
        return this.f44722h.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    @androidx.annotation.p0
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (com.google.android.exoplayer2.j.W1.equals(this.f44721g)) {
            bArr2 = com.google.android.exoplayer2.drm.a.b(bArr2);
        }
        return this.f44722h.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f44722h.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.f44722h.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public synchronized void release() {
        int i10 = this.f44723i - 1;
        this.f44723i = i10;
        if (i10 == 0) {
            this.f44722h.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f44722h.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void setPropertyString(String str, String str2) {
        this.f44722h.setPropertyString(str, str2);
    }

    @Override // com.google.android.exoplayer2.drm.b0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public c0 g(byte[] bArr) throws MediaCryptoException {
        return new c0(s(this.f44721g), bArr, u0.f51536a < 21 && com.google.android.exoplayer2.j.X1.equals(this.f44721g) && "L3".equals(getPropertyString("securityLevel")));
    }
}
