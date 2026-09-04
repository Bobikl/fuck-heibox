package com.lzy.okgo.model;

import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.v;
import z5.g;

/* JADX INFO: loaded from: classes6.dex */
public class HttpParams implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f64761d = v.j("text/plain;charset=utf-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f64762e = v.j("application/json;charset=utf-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f64763f = v.j(COSRequestHeaderKey.APPLICATION_OCTET_STREAM);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f64764g = true;
    private static final long serialVersionUID = 7369819159227055048L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedHashMap<String, List<String>> f64765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap<String, List<FileWrapper>> f64766c;

    public static class FileWrapper implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -2356139899636767776L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f64767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f64768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient v f64769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f64770e;

        public FileWrapper(File file, String str, v vVar) {
            this.f64767b = file;
            this.f64768c = str;
            this.f64769d = vVar;
            this.f64770e = file.length();
        }

        private void a(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            if (PatchProxy.proxy(new Object[]{objectInputStream}, this, changeQuickRedirect, false, bb.c.b.f30514a9, new Class[]{ObjectInputStream.class}, Void.TYPE).isSupported) {
                return;
            }
            objectInputStream.defaultReadObject();
            this.f64769d = v.j((String) objectInputStream.readObject());
        }

        private void b(ObjectOutputStream objectOutputStream) throws IOException {
            if (PatchProxy.proxy(new Object[]{objectOutputStream}, this, changeQuickRedirect, false, bb.c.b.Z8, new Class[]{ObjectOutputStream.class}, Void.TYPE).isSupported) {
                return;
            }
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f64769d.getMediaType());
        }

        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30537b9, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "FileWrapper{file=" + this.f64767b + ", fileName=" + this.f64768c + ", contentType=" + this.f64769d + ", fileSize=" + this.f64770e + g.f141884d;
        }
    }

    public HttpParams() {
        a();
    }

    public HttpParams(String str, File file) {
        a();
        i(str, file);
    }

    public HttpParams(String str, String str2) {
        a();
        l(str, str2, true);
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 600, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64765b = new LinkedHashMap<>();
        this.f64766c = new LinkedHashMap<>();
    }

    private void l(String str, String str2, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 610, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        List<String> arrayList = this.f64765b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f64765b.put(str, arrayList);
        }
        if (z10) {
            arrayList.clear();
        }
        arrayList.add(str2);
    }

    public void b(HttpParams httpParams) {
        if (PatchProxy.proxy(new Object[]{httpParams}, this, changeQuickRedirect, false, 601, new Class[]{HttpParams.class}, Void.TYPE).isSupported || httpParams == null) {
            return;
        }
        LinkedHashMap<String, List<String>> linkedHashMap = httpParams.f64765b;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            this.f64765b.putAll(httpParams.f64765b);
        }
        LinkedHashMap<String, List<FileWrapper>> linkedHashMap2 = httpParams.f64766c;
        if (linkedHashMap2 == null || linkedHashMap2.isEmpty()) {
            return;
        }
        this.f64766c.putAll(httpParams.f64766c);
    }

    public void c(String str, char c10, boolean... zArr) {
        if (PatchProxy.proxy(new Object[]{str, new Character(c10), zArr}, this, changeQuickRedirect, false, 608, new Class[]{String.class, Character.TYPE, boolean[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (zArr == null || zArr.length <= 0) {
            l(str, String.valueOf(c10), true);
        } else {
            l(str, String.valueOf(c10), zArr[0]);
        }
    }

    public void clear() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.X8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64765b.clear();
        this.f64766c.clear();
    }

    public void d(String str, double d10, boolean... zArr) {
        if (PatchProxy.proxy(new Object[]{str, new Double(d10), zArr}, this, changeQuickRedirect, false, 607, new Class[]{String.class, Double.TYPE, boolean[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (zArr == null || zArr.length <= 0) {
            l(str, String.valueOf(d10), true);
        } else {
            l(str, String.valueOf(d10), zArr[0]);
        }
    }

    public void e(String str, float f10, boolean... zArr) {
        if (PatchProxy.proxy(new Object[]{str, new Float(f10), zArr}, this, changeQuickRedirect, false, 606, new Class[]{String.class, Float.TYPE, boolean[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (zArr == null || zArr.length <= 0) {
            l(str, String.valueOf(f10), true);
        } else {
            l(str, String.valueOf(f10), zArr[0]);
        }
    }

    public void f(String str, int i10, boolean... zArr) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10), zArr}, this, changeQuickRedirect, false, 604, new Class[]{String.class, Integer.TYPE, boolean[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (zArr == null || zArr.length <= 0) {
            l(str, String.valueOf(i10), true);
        } else {
            l(str, String.valueOf(i10), zArr[0]);
        }
    }

    public void g(String str, long j10, boolean... zArr) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j10), zArr}, this, changeQuickRedirect, false, 605, new Class[]{String.class, Long.TYPE, boolean[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (zArr == null || zArr.length <= 0) {
            l(str, String.valueOf(j10), true);
        } else {
            l(str, String.valueOf(j10), zArr[0]);
        }
    }

    public void h(String str, FileWrapper fileWrapper) {
        if (PatchProxy.proxy(new Object[]{str, fileWrapper}, this, changeQuickRedirect, false, bb.c.b.Q8, new Class[]{String.class, FileWrapper.class}, Void.TYPE).isSupported || str == null || fileWrapper == null) {
            return;
        }
        k(str, fileWrapper.f64767b, fileWrapper.f64768c, fileWrapper.f64769d);
    }

    public void i(String str, File file) {
        if (PatchProxy.proxy(new Object[]{str, file}, this, changeQuickRedirect, false, 612, new Class[]{String.class, File.class}, Void.TYPE).isSupported) {
            return;
        }
        j(str, file, file.getName());
    }

    public void j(String str, File file, String str2) {
        if (PatchProxy.proxy(new Object[]{str, file, str2}, this, changeQuickRedirect, false, bb.c.b.P8, new Class[]{String.class, File.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        k(str, file, str2, la.b.i(str2));
    }

    public void k(String str, File file, String str2, v vVar) {
        if (PatchProxy.proxy(new Object[]{str, file, str2, vVar}, this, changeQuickRedirect, false, bb.c.b.R8, new Class[]{String.class, File.class, String.class, v.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        List<FileWrapper> arrayList = this.f64766c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f64766c.put(str, arrayList);
        }
        arrayList.add(new FileWrapper(file, str2, vVar));
    }

    public void m(String str, String str2, boolean... zArr) {
        if (PatchProxy.proxy(new Object[]{str, str2, zArr}, this, changeQuickRedirect, false, 603, new Class[]{String.class, String.class, boolean[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (zArr == null || zArr.length <= 0) {
            l(str, str2, true);
        } else {
            l(str, str2, zArr[0]);
        }
    }

    public void n(String str, boolean z10, boolean... zArr) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), zArr}, this, changeQuickRedirect, false, 609, new Class[]{String.class, Boolean.TYPE, boolean[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (zArr == null || zArr.length <= 0) {
            l(str, String.valueOf(z10), true);
        } else {
            l(str, String.valueOf(z10), zArr[0]);
        }
    }

    public void o(Map<String, String> map, boolean... zArr) {
        if (PatchProxy.proxy(new Object[]{map, zArr}, this, changeQuickRedirect, false, 602, new Class[]{Map.class, boolean[].class}, Void.TYPE).isSupported || map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m(entry.getKey(), entry.getValue(), zArr);
        }
    }

    public void p(String str, List<File> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, bb.c.b.S8, new Class[]{String.class, List.class}, Void.TYPE).isSupported || str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            i(str, it.next());
        }
    }

    public void q(String str, List<FileWrapper> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, bb.c.b.T8, new Class[]{String.class, List.class}, Void.TYPE).isSupported || str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<FileWrapper> it = list.iterator();
        while (it.hasNext()) {
            h(str, it.next());
        }
    }

    public void r(String str, List<String> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 611, new Class[]{String.class, List.class}, Void.TYPE).isSupported || str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            l(str, it.next(), false);
        }
    }

    public void s(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.W8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        u(str);
        t(str);
    }

    public void t(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.V8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64766c.remove(str);
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Y8, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : this.f64765b.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(entry.getKey());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(entry.getValue());
        }
        for (Map.Entry<String, List<FileWrapper>> entry2 : this.f64766c.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(entry2.getKey());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(entry2.getValue());
        }
        return sb2.toString();
    }

    public void u(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.U8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64765b.remove(str);
    }
}
