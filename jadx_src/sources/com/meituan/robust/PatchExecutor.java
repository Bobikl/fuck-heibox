package com.meituan.robust;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PatchExecutor extends Thread {
    private static final String ROBUST_PATCH_CACHE_DIR = "patch_cache";
    protected Context context;
    protected PatchManipulate patchManipulate;
    protected RobustCallBack robustCallBack;

    public PatchExecutor(Context context, PatchManipulate patchManipulate, RobustCallBack robustCallBack) {
        this.context = context.getApplicationContext();
        this.patchManipulate = patchManipulate;
        this.robustCallBack = robustCallBack;
    }

    private static File getPatchCacheDirPath(Context context, String str) {
        File dir = context.getDir(ROBUST_PATCH_CACHE_DIR + str, 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        return dir;
    }

    protected void applyPatchList(List<Patch> list) {
        boolean zPatch;
        if (list == null || list.isEmpty()) {
            return;
        }
        Log.d("robust", " patchManipulate list size is " + list.size());
        for (Patch patch : list) {
            if (patch.isAppliedSuccess()) {
                Log.d("robust", "p.isAppliedSuccess() skip " + patch.getLocalPath());
            } else if (this.patchManipulate.ensurePatchExist(patch)) {
                try {
                    zPatch = patch(this.context, patch);
                } catch (Throwable th2) {
                    this.robustCallBack.exceptionNotify(th2, "class:PatchExecutor method:applyPatchList line:69");
                    zPatch = false;
                }
                if (zPatch) {
                    patch.setAppliedSuccess(true);
                    this.robustCallBack.onPatchApplied(true, patch);
                } else {
                    this.robustCallBack.onPatchApplied(false, patch);
                }
                Log.d("robust", "patch LocalPath:" + patch.getLocalPath() + ",apply result " + zPatch);
            }
        }
    }

    protected List<Patch> fetchPatchList() {
        return this.patchManipulate.fetchPatchList(this.context);
    }

    protected boolean patch(Context context, Patch patch) {
        DexClassLoader dexClassLoader;
        PatchesInfo patchesInfo;
        Object obj;
        Field field;
        if (!this.patchManipulate.verifyPatch(context, patch)) {
            this.robustCallBack.logNotify("verifyPatch failure, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:107");
            return false;
        }
        Object obj2 = null;
        try {
            dexClassLoader = new DexClassLoader(patch.getTempPath(), getPatchCacheDirPath(context, patch.getName() + patch.getMd5()).getAbsolutePath(), null, PatchExecutor.class.getClassLoader());
        } catch (Throwable th2) {
            th2.printStackTrace();
            dexClassLoader = null;
        }
        if (dexClassLoader == null) {
            return false;
        }
        try {
            Log.d("robust", "patch patch_info_name:" + patch.getPatchesInfoImplClassFullName());
            patchesInfo = (PatchesInfo) dexClassLoader.loadClass(patch.getPatchesInfoImplClassFullName()).newInstance();
        } catch (Throwable th3) {
            Log.e("robust", "patch failed 188 ", th3);
            patchesInfo = null;
        }
        if (patchesInfo == null) {
            this.robustCallBack.logNotify("patchesInfo is null, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:114");
            return false;
        }
        List<PatchedClassInfo> patchedClassesInfo = patchesInfo.getPatchedClassesInfo();
        if (patchedClassesInfo == null || patchedClassesInfo.isEmpty()) {
            return true;
        }
        boolean z10 = false;
        for (PatchedClassInfo patchedClassInfo : patchedClassesInfo) {
            String str = patchedClassInfo.patchedClassName;
            String str2 = patchedClassInfo.patchClassName;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                obj = obj2;
                this.robustCallBack.logNotify("patchedClasses or patchClassName is empty, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:131");
                obj2 = obj;
            } else {
                Log.d("robust", "current path:" + str);
                try {
                    try {
                        Class<?> clsLoadClass = dexClassLoader.loadClass(str.trim());
                        Field[] declaredFields = clsLoadClass.getDeclaredFields();
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            sb2.append("oldClass :");
                            sb2.append(clsLoadClass);
                            sb2.append("     fields ");
                            sb2.append(declaredFields.length);
                            Log.d("robust", sb2.toString());
                            int length = declaredFields.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    field = null;
                                    break;
                                }
                                Field field2 = declaredFields[i10];
                                int i11 = length;
                                if (TextUtils.equals(field2.getType().getCanonicalName(), ChangeQuickRedirect.class.getCanonicalName()) && TextUtils.equals(field2.getDeclaringClass().getCanonicalName(), clsLoadClass.getCanonicalName())) {
                                    field = field2;
                                    break;
                                }
                                i10++;
                                length = i11;
                            }
                            if (field == null) {
                                this.robustCallBack.logNotify("changeQuickRedirectField  is null, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:147");
                                Log.d("robust", "current path:" + str + " something wrong !! can  not find:ChangeQuickRedirect in" + str2);
                                obj = null;
                            } else {
                                Log.d("robust", "current path:" + str + " find:ChangeQuickRedirect " + str2);
                                try {
                                    Object objNewInstance = dexClassLoader.loadClass(str2).newInstance();
                                    field.setAccessible(true);
                                    obj = null;
                                    try {
                                        field.set(null, objNewInstance);
                                        Log.d("robust", "changeQuickRedirectField set success " + str2);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            Log.e("robust", "patch failed! ");
                                            this.robustCallBack.exceptionNotify(th, "class:PatchExecutor method:patch line:163");
                                        } catch (Throwable unused) {
                                            Log.e("robust", "patch failed! ");
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj = null;
                                }
                            }
                        } catch (Throwable unused2) {
                            obj = null;
                        }
                    } catch (Throwable unused3) {
                        obj = obj2;
                    }
                    obj2 = obj;
                } catch (ClassNotFoundException unused4) {
                    obj2 = obj2;
                    z10 = true;
                }
            }
        }
        Log.d("robust", "patch finished ");
        return !z10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            applyPatchList(fetchPatchList());
        } catch (Throwable th2) {
            Log.e("robust", "PatchExecutor run", th2);
            this.robustCallBack.exceptionNotify(th2, "class:PatchExecutor,method:run,line:36");
        }
    }
}
