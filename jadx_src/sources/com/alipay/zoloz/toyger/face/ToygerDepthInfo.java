package com.alipay.zoloz.toyger.face;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerDepthInfo {
    public byte[] depthInfo = null;

    public void depthBlobInfo(byte[] bArr) throws Throwable {
        StringBuilder sb2;
        int length;
        StringBuilder sb3;
        int length2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                try {
                    gZIPOutputStream2.close();
                    this.depthInfo = byteArrayOutputStream.toByteArray();
                    sb3 = new StringBuilder();
                    sb3.append("depthInfo after gzip size ");
                    length2 = this.depthInfo.length;
                } catch (IOException unused) {
                    Log.e("ToygerDepthInfo", "使用GZIP压缩，关闭execption");
                    this.depthInfo = byteArrayOutputStream.toByteArray();
                    sb3 = new StringBuilder();
                    sb3.append("depthInfo after gzip size ");
                    length2 = this.depthInfo.length;
                } finally {
                    this.depthInfo = byteArrayOutputStream.toByteArray();
                    Log.i("TOYGER_FLOW_ANDROID", "depthInfo after gzip size " + this.depthInfo.length);
                }
            } catch (IOException unused2) {
                gZIPOutputStream = gZIPOutputStream2;
                Log.e("ToygerDepthInfo", "使用gzip 压缩 execption");
                try {
                    if (gZIPOutputStream == null) {
                        return;
                    }
                    try {
                        gZIPOutputStream.close();
                        this.depthInfo = byteArrayOutputStream.toByteArray();
                        sb3 = new StringBuilder();
                        sb3.append("depthInfo after gzip size ");
                        length2 = this.depthInfo.length;
                    } catch (IOException unused3) {
                        Log.e("ToygerDepthInfo", "使用GZIP压缩，关闭execption");
                        this.depthInfo = byteArrayOutputStream.toByteArray();
                        sb3 = new StringBuilder();
                        sb3.append("depthInfo after gzip size ");
                        length2 = this.depthInfo.length;
                    }
                } catch (Throwable th2) {
                    this.depthInfo = byteArrayOutputStream.toByteArray();
                    Log.i("TOYGER_FLOW_ANDROID", "depthInfo after gzip size " + this.depthInfo.length);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = gZIPOutputStream2;
                try {
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                        this.depthInfo = byteArrayOutputStream.toByteArray();
                        sb2 = new StringBuilder();
                        sb2.append("depthInfo after gzip size ");
                        length = this.depthInfo.length;
                        sb2.append(length);
                        String string = sb2.toString();
                    }
                } catch (IOException unused4) {
                    Log.e("ToygerDepthInfo", "使用GZIP压缩，关闭execption");
                    this.depthInfo = byteArrayOutputStream.toByteArray();
                    sb2 = new StringBuilder();
                    sb2.append("depthInfo after gzip size ");
                    length = this.depthInfo.length;
                } finally {
                    this.depthInfo = byteArrayOutputStream.toByteArray();
                    Log.i("TOYGER_FLOW_ANDROID", "depthInfo after gzip size " + this.depthInfo.length);
                }
                throw th;
            }
        } catch (IOException unused5) {
        }
        sb3.append(length2);
        String string2 = sb3.toString();
    }
}
