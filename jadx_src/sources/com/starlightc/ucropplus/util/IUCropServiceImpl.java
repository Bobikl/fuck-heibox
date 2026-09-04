package com.starlightc.ucropplus.util;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.router.annotation.RouterService;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import ob.b;
import pb.n;

/* JADX INFO: loaded from: classes4.dex */
@RouterService(interfaces = {n.class}, key = {b.f132260l})
public class IUCropServiceImpl implements n {
    public static final String UCROP_OUTPUT_PATH = "ucropplus_output";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.n
    public void startCrop(@n0 Activity activity, @p0 Fragment fragment, @n0 ArrayList<Uri> arrayList, @p0 HashMap<String, Object> map) {
        if (PatchProxy.proxy(new Object[]{activity, fragment, arrayList, map}, this, changeQuickRedirect, false, 50929, new Class[]{Activity.class, Fragment.class, ArrayList.class, HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        File file = new File(activity.getCacheDir().getPath() + File.separator + UCROP_OUTPUT_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
        UCrop uCropOf = UCrop.of(arrayList, Uri.fromFile(file));
        uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_SHOW_FILTER, "0");
        uCropOf.getCropIntent().putExtra("type", "1");
        if (fragment != null) {
            uCropOf.startWithType(activity, fragment, 1);
        } else {
            uCropOf.startWithType(activity, 1);
        }
    }
}
