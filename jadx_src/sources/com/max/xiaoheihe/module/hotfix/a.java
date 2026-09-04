package com.max.xiaoheihe.module.hotfix;

import android.content.Context;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchManipulate;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.meituan.robust.RobustApkHashUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PatchManipulateImp.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends PatchManipulate {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f88646a = "RobustPatchManipulateImp";

    public void a(String str, String str2) throws IOException {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38548, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new RuntimeException("source patch does not exist ");
        }
        File file2 = new File(str2);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i10);
                    }
                }
                fileOutputStream.close();
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                g.G(this.f88646a + " copy error: " + th3.getMessage());
            } finally {
                fileInputStream.close();
            }
        }
    }

    @Override // com.meituan.robust.PatchManipulate
    public boolean ensurePatchExist(Patch patch) {
        return true;
    }

    @Override // com.meituan.robust.PatchManipulate
    public List<Patch> fetchPatchList(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 38546, new Class[]{Context.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        g.x(this.f88646a + " robust robustApkHash :" + RobustApkHashUtils.readRobustApkHash(context));
        Patch patch = new Patch();
        patch.setName("heybox_fix");
        patch.setLocalPath(HotFixManager.f() + "patch");
        patch.setPatchesInfoImplClassFullName("com.max.xiaoheihe.module.hotfix.PatchesInfoImpl");
        ArrayList arrayList = new ArrayList();
        arrayList.add(patch);
        return arrayList;
    }

    @Override // com.meituan.robust.PatchManipulate
    public boolean verifyPatch(Context context, Patch patch) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, patch}, this, changeQuickRedirect, false, 38547, new Class[]{Context.class, Patch.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getCacheDir());
        String str = File.separator;
        sb2.append(str);
        sb2.append("robust");
        sb2.append(str);
        sb2.append("patch");
        patch.setTempPath(sb2.toString());
        try {
            a(patch.getLocalPath(), patch.getTempPath());
        } catch (Exception e10) {
            g.G(this.f88646a + " copy source patch to local patch error, no patch execute in path " + patch.getTempPath());
            g.G(this.f88646a + " error: " + e10.getMessage());
        }
        return true;
    }
}
