package com.max.mediaselector.lib.loader;

import android.content.Context;
import android.text.TextUtils;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.config.h;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.max.mediaselector.lib.utils.l;
import com.max.mediaselector.lib.utils.o;
import com.max.mediaselector.lib.utils.r;
import com.max.mediaselector.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileFilter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SandboxFileLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: SandboxFileLoader.java */
    public class a implements FileFilter {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.m.f34714f1, new Class[]{File.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !file.isDirectory();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:0x014c  */
    public static ArrayList<LocalMedia> a(Context context, String str) {
        File[] fileArrListFiles;
        MessageDigest messageDigest;
        List<String> list;
        String absolutePath;
        long jLastModified;
        int iB;
        int i10;
        long j10;
        int iE;
        int iB2;
        long jA;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.f34691e1, new Class[]{Context.class, String.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<LocalMedia> arrayList = new ArrayList<>();
        File file = new File(str);
        if (!file.exists() || (fileArrListFiles = file.listFiles(new a())) == null) {
            return arrayList;
        }
        PictureSelectionConfig pictureSelectionConfigC = PictureSelectionConfig.c();
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            messageDigest = null;
        }
        int length = fileArrListFiles.length;
        while (i13 < length) {
            File file2 = fileArrListFiles[i13];
            String strM = l.m(file2.getAbsolutePath());
            if (pictureSelectionConfigC.f75029b == h.c()) {
                if (f.h(strM)) {
                    list = pictureSelectionConfigC.Q;
                    if ((list != null || list.size() <= 0 || pictureSelectionConfigC.Q.contains(strM)) && (pictureSelectionConfigC.E || !f.f(strM))) {
                        absolutePath = file2.getAbsolutePath();
                        long length2 = file2.length();
                        if (messageDigest != null) {
                            messageDigest.update(absolutePath.getBytes());
                            jLastModified = new BigInteger(i14, messageDigest.digest()).longValue();
                        } else {
                            jLastModified = file2.lastModified() / 1000;
                        }
                        long j11 = jLastModified;
                        long j12 = u.j(Integer.valueOf(file.getName().hashCode()));
                        long jLastModified2 = file2.lastModified() / 1000;
                        if (f.i(strM)) {
                            com.max.mediaselector.lib.entity.b bVarP = l.p(context, absolutePath);
                            iE = bVarP.e();
                            iB2 = bVarP.b();
                            jA = bVarP.a();
                        } else {
                            if (f.e(strM)) {
                                com.max.mediaselector.lib.entity.b bVarG = l.g(context, absolutePath);
                                iE = bVarG.e();
                                iB2 = bVarG.b();
                                jA = bVarG.a();
                            } else {
                                com.max.mediaselector.lib.entity.b bVarJ = l.j(context, absolutePath);
                                int iE2 = bVarJ.e();
                                iB = bVarJ.b();
                                i10 = iE2;
                                j10 = 0;
                            }
                            if ((f.i(strM) && !f.e(strM)) || (((i11 = pictureSelectionConfigC.f75051s) <= 0 || j10 >= i11) && (((i12 = pictureSelectionConfigC.f75050r) <= 0 || j10 <= i12) && j10 != 0 && length2 > 0))) {
                                LocalMedia localMediaA0 = LocalMedia.a0(j11, absolutePath, absolutePath, file2.getName(), file.getName(), j10, pictureSelectionConfigC.f75029b, strM, i10, iB, length2, j12, jLastModified2);
                                localMediaA0.P0(o.e() ? absolutePath : null);
                                arrayList.add(localMediaA0);
                            }
                        }
                        i10 = iE;
                        iB = iB2;
                        j10 = jA;
                        if (f.i(strM)) {
                        }
                    }
                }
            } else if (pictureSelectionConfigC.f75029b == h.d()) {
                if (f.i(strM)) {
                    list = pictureSelectionConfigC.Q;
                    if (list != null) {
                        absolutePath = file2.getAbsolutePath();
                        long length3 = file2.length();
                        if (messageDigest != null) {
                            messageDigest.update(absolutePath.getBytes());
                            jLastModified = new BigInteger(i14, messageDigest.digest()).longValue();
                        } else {
                            jLastModified = file2.lastModified() / 1000;
                        }
                        long j13 = jLastModified;
                        long j14 = u.j(Integer.valueOf(file.getName().hashCode()));
                        long jLastModified3 = file2.lastModified() / 1000;
                        if (f.i(strM)) {
                            com.max.mediaselector.lib.entity.b bVarP2 = l.p(context, absolutePath);
                            iE = bVarP2.e();
                            iB2 = bVarP2.b();
                            jA = bVarP2.a();
                        } else {
                            if (f.e(strM)) {
                                com.max.mediaselector.lib.entity.b bVarG2 = l.g(context, absolutePath);
                                iE = bVarG2.e();
                                iB2 = bVarG2.b();
                                jA = bVarG2.a();
                            } else {
                                com.max.mediaselector.lib.entity.b bVarJ2 = l.j(context, absolutePath);
                                int iE3 = bVarJ2.e();
                                iB = bVarJ2.b();
                                i10 = iE3;
                                j10 = 0;
                            }
                            if (f.i(strM)) {
                            }
                        }
                        i10 = iE;
                        iB = iB2;
                        j10 = jA;
                        if (f.i(strM)) {
                        }
                    } else {
                        absolutePath = file2.getAbsolutePath();
                        long length4 = file2.length();
                        if (messageDigest != null) {
                            messageDigest.update(absolutePath.getBytes());
                            jLastModified = new BigInteger(i14, messageDigest.digest()).longValue();
                        } else {
                            jLastModified = file2.lastModified() / 1000;
                        }
                        long j15 = jLastModified;
                        long j16 = u.j(Integer.valueOf(file.getName().hashCode()));
                        long jLastModified4 = file2.lastModified() / 1000;
                        if (f.i(strM)) {
                            com.max.mediaselector.lib.entity.b bVarP3 = l.p(context, absolutePath);
                            iE = bVarP3.e();
                            iB2 = bVarP3.b();
                            jA = bVarP3.a();
                        } else {
                            if (f.e(strM)) {
                                com.max.mediaselector.lib.entity.b bVarG3 = l.g(context, absolutePath);
                                iE = bVarG3.e();
                                iB2 = bVarG3.b();
                                jA = bVarG3.a();
                            } else {
                                com.max.mediaselector.lib.entity.b bVarJ3 = l.j(context, absolutePath);
                                int iE4 = bVarJ3.e();
                                iB = bVarJ3.b();
                                i10 = iE4;
                                j10 = 0;
                            }
                            if (f.i(strM)) {
                            }
                        }
                        i10 = iE;
                        iB = iB2;
                        j10 = jA;
                        if (f.i(strM)) {
                        }
                    }
                }
            } else if (pictureSelectionConfigC.f75029b != h.b() || f.e(strM)) {
                list = pictureSelectionConfigC.Q;
                if (list != null) {
                    absolutePath = file2.getAbsolutePath();
                    long length5 = file2.length();
                    if (messageDigest != null) {
                        messageDigest.update(absolutePath.getBytes());
                        jLastModified = new BigInteger(i14, messageDigest.digest()).longValue();
                    } else {
                        jLastModified = file2.lastModified() / 1000;
                    }
                    long j17 = jLastModified;
                    long j18 = u.j(Integer.valueOf(file.getName().hashCode()));
                    long jLastModified5 = file2.lastModified() / 1000;
                    if (f.i(strM)) {
                        com.max.mediaselector.lib.entity.b bVarP4 = l.p(context, absolutePath);
                        iE = bVarP4.e();
                        iB2 = bVarP4.b();
                        jA = bVarP4.a();
                    } else {
                        if (f.e(strM)) {
                            com.max.mediaselector.lib.entity.b bVarG4 = l.g(context, absolutePath);
                            iE = bVarG4.e();
                            iB2 = bVarG4.b();
                            jA = bVarG4.a();
                        } else {
                            com.max.mediaselector.lib.entity.b bVarJ4 = l.j(context, absolutePath);
                            int iE5 = bVarJ4.e();
                            iB = bVarJ4.b();
                            i10 = iE5;
                            j10 = 0;
                        }
                        if (f.i(strM)) {
                        }
                    }
                    i10 = iE;
                    iB = iB2;
                    j10 = jA;
                    if (f.i(strM)) {
                    }
                } else {
                    absolutePath = file2.getAbsolutePath();
                    long length6 = file2.length();
                    if (messageDigest != null) {
                        messageDigest.update(absolutePath.getBytes());
                        jLastModified = new BigInteger(i14, messageDigest.digest()).longValue();
                    } else {
                        jLastModified = file2.lastModified() / 1000;
                    }
                    long j19 = jLastModified;
                    long j110 = u.j(Integer.valueOf(file.getName().hashCode()));
                    long jLastModified6 = file2.lastModified() / 1000;
                    if (f.i(strM)) {
                        com.max.mediaselector.lib.entity.b bVarP5 = l.p(context, absolutePath);
                        iE = bVarP5.e();
                        iB2 = bVarP5.b();
                        jA = bVarP5.a();
                    } else {
                        if (f.e(strM)) {
                            com.max.mediaselector.lib.entity.b bVarG5 = l.g(context, absolutePath);
                            iE = bVarG5.e();
                            iB2 = bVarG5.b();
                            jA = bVarG5.a();
                        } else {
                            com.max.mediaselector.lib.entity.b bVarJ5 = l.j(context, absolutePath);
                            int iE6 = bVarJ5.e();
                            iB = bVarJ5.b();
                            i10 = iE6;
                            j10 = 0;
                        }
                        if (f.i(strM)) {
                        }
                    }
                    i10 = iE;
                    iB = iB2;
                    j10 = jA;
                    if (f.i(strM)) {
                    }
                }
            }
            i13++;
            i14 = 1;
        }
        return arrayList;
    }

    public static LocalMediaFolder b(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.f34668d1, new Class[]{Context.class, String.class}, LocalMediaFolder.class);
        if (patchProxyResultProxy.isSupported) {
            return (LocalMediaFolder) patchProxyResultProxy.result;
        }
        ArrayList<LocalMedia> arrayListA = a(context, str);
        if (arrayListA == null || arrayListA.size() <= 0) {
            return null;
        }
        r.f(arrayListA);
        LocalMedia localMedia = arrayListA.get(0);
        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
        localMediaFolder.w(localMedia.D());
        localMediaFolder.u(localMedia.E());
        localMediaFolder.v(localMedia.A());
        localMediaFolder.o(localMedia.c());
        localMediaFolder.y(arrayListA.size());
        localMediaFolder.r(arrayListA);
        return localMediaFolder;
    }
}
