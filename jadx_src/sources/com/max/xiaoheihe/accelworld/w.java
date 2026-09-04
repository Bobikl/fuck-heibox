package com.max.xiaoheihe.accelworld;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.max.basebbs.bean.BBSLinkRecObj;

/* JADX INFO: compiled from: BBSShareDialogManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface w {
    @dl.e
    io.reactivex.disposables.a a();

    @dl.e
    BBSLinkRecObj i();

    boolean isActive();

    void k(@dl.e String str);

    void l(@dl.e String str, boolean z10);

    void m();

    void n(@dl.e String str);

    @dl.e
    FragmentManager o();

    boolean p();

    void q(@dl.e String str);

    void r(@dl.e String str);

    void startActivityForResult(@dl.d Intent intent, int i10);
}
