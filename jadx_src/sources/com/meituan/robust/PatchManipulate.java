package com.meituan.robust;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PatchManipulate {
    protected abstract boolean ensurePatchExist(Patch patch);

    protected abstract List<Patch> fetchPatchList(Context context);

    protected abstract boolean verifyPatch(Context context, Patch patch);
}
