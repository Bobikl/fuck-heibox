package com.max.mediaselector.lib.basic;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.max.mediaselector.lib.PictureSelectorPreviewFragment;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

/* JADX INFO: compiled from: PictureSelectionPreviewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PictureSelectionConfig f74961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f74962b;

    public n(q qVar) {
        this.f74962b = qVar;
        PictureSelectionConfig pictureSelectionConfigB = PictureSelectionConfig.b();
        this.f74961a = pictureSelectionConfigB;
        pictureSelectionConfigB.L = false;
    }

    public n a(boolean z10) {
        this.f74961a.O = z10;
        return this;
    }

    public n b(boolean z10) {
        this.f74961a.K = z10;
        return this;
    }

    public n c(oe.e eVar) {
        PictureSelectionConfig.f75021f4 = eVar;
        return this;
    }

    public n d(me.d dVar) {
        if (PictureSelectionConfig.W3 != dVar) {
            PictureSelectionConfig.W3 = dVar;
        }
        return this;
    }

    public n e(int i10) {
        this.f74961a.C = i10;
        return this;
    }

    public n f(com.max.mediaselector.lib.style.a aVar) {
        if (aVar != null) {
            PictureSelectionConfig.f75017b4 = aVar;
        }
        return this;
    }

    public void g(int i10, boolean z10, ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), arrayList}, this, changeQuickRedirect, false, bb.c.l.f34507vk, new Class[]{Integer.TYPE, Boolean.TYPE, ArrayList.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74962b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (PictureSelectionConfig.W3 == null) {
            throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        if (arrayList == null || arrayList.size() == 0) {
            throw new NullPointerException("preview data is null");
        }
        FragmentManager supportFragmentManager = null;
        if (activityE instanceof AppCompatActivity) {
            supportFragmentManager = ((AppCompatActivity) activityE).getSupportFragmentManager();
        } else if (activityE instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) activityE).getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        String str = PictureSelectorPreviewFragment.U;
        if (com.max.mediaselector.lib.utils.a.b((FragmentActivity) activityE, str)) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragmentM6 = PictureSelectorPreviewFragment.m6();
            ArrayList<LocalMedia> arrayList2 = new ArrayList<>(arrayList);
            pictureSelectorPreviewFragmentM6.t6(i10, arrayList2.size(), arrayList2, z10);
            a.b(supportFragmentManager, str, pictureSelectorPreviewFragmentM6);
        }
    }
}
