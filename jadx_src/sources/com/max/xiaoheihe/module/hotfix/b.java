package com.max.xiaoheihe.module.hotfix;

import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.RobustCallBack;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: RobustCallBackSample.java */
/* JADX INFO: loaded from: classes11.dex */
public class b implements RobustCallBack {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.robust.RobustCallBack
    public void exceptionNotify(Throwable th2, String str) {
        if (PatchProxy.proxy(new Object[]{th2, str}, this, changeQuickRedirect, false, 38553, new Class[]{Throwable.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        g.H("RobustCallBack  exceptionNotify where: " + str, th2);
    }

    @Override // com.meituan.robust.RobustCallBack
    public void logNotify(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38552, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        g.x("RobustCallBack  logNotify log: " + str);
        g.x("RobustCallBack  logNotify where: " + str2);
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchApplied(boolean z10, Patch patch) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), patch}, this, changeQuickRedirect, false, 38551, new Class[]{Boolean.TYPE, Patch.class}, Void.TYPE).isSupported) {
            return;
        }
        g.x("RobustCallBack  onPatchApplied result: " + z10);
        g.x("RobustCallBack  onPatchApplied patch: " + patch.getName());
        HotFixManager.j(HotFixManager.g().h());
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchFetched(boolean z10, boolean z11, Patch patch) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), patch};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38550, new Class[]{cls, cls, Patch.class}, Void.TYPE).isSupported) {
            return;
        }
        g.x("RobustCallBack  onPatchFetched result: " + z10);
        g.x("RobustCallBack  onPatchFetched isNet: " + z11);
        g.x("RobustCallBack  onPatchFetched patch: " + patch.getName());
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchListFetched(boolean z10, boolean z11, List<Patch> list) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38549, new Class[]{cls, cls, List.class}, Void.TYPE).isSupported) {
            return;
        }
        g.x("RobustCallBack  onPatchListFetched result: " + z10);
        g.x("RobustCallBack  onPatchListFetched isNet: " + z11);
        Iterator<Patch> it = list.iterator();
        while (it.hasNext()) {
            g.x("RobustCallBack  onPatchListFetched patch: " + it.next().getName());
        }
    }
}
