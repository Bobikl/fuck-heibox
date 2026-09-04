package com.previewlibrary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.n0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.previewlibrary.enitity.IThumbViewInfo;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.vivo.push.PushClientConstants;
import fg.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class GPreviewBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f96301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent f96302b = new Intent();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f96303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f96304d;

    public enum IndicatorType {
        Dot,
        Number
    }

    private GPreviewBuilder(@n0 Activity activity) {
        this.f96301a = activity;
    }

    public static GPreviewBuilder a(@n0 Activity activity) {
        return new GPreviewBuilder(activity);
    }

    public static GPreviewBuilder b(@n0 Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return new GPreviewBuilder(activity);
        }
        return null;
    }

    public GPreviewBuilder c(boolean z10) {
        this.f96302b.putExtra("isDrag", z10);
        return this;
    }

    public GPreviewBuilder d(boolean z10, float f10) {
        this.f96302b.putExtra("isDrag", z10);
        this.f96302b.putExtra("sensitivity", f10);
        return this;
    }

    public GPreviewBuilder e(int i10) {
        this.f96302b.putExtra(CommonNetImpl.POSITION, i10);
        return this;
    }

    public <T extends IThumbViewInfo> GPreviewBuilder f(@n0 List<T> list) {
        this.f96302b.putParcelableArrayListExtra("imagePaths", new ArrayList<>(list));
        return this;
    }

    public GPreviewBuilder g(boolean z10) {
        this.f96302b.putExtra("isDrag", z10);
        return this;
    }

    public GPreviewBuilder h(boolean z10, float f10) {
        this.f96302b.putExtra("isDrag", z10);
        this.f96302b.putExtra("sensitivity", f10);
        return this;
    }

    public GPreviewBuilder i(int i10) {
        this.f96302b.putExtra("duration", i10);
        return this;
    }

    public GPreviewBuilder j(boolean z10) {
        this.f96302b.putExtra("isFullscreen", z10);
        return this;
    }

    public GPreviewBuilder k(boolean z10) {
        this.f96302b.putExtra("isScale", z10);
        return this;
    }

    public GPreviewBuilder l(c cVar) {
        this.f96304d = cVar;
        return this;
    }

    public <E extends IThumbViewInfo> GPreviewBuilder m(@n0 E e10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(e10);
        this.f96302b.putParcelableArrayListExtra("imagePaths", arrayList);
        return this;
    }

    public GPreviewBuilder n(boolean z10) {
        this.f96302b.putExtra("isSingleFling", z10);
        return this;
    }

    public GPreviewBuilder o(boolean z10) {
        this.f96302b.putExtra("isShow", z10);
        return this;
    }

    public GPreviewBuilder p(@n0 IndicatorType indicatorType) {
        this.f96302b.putExtra("type", indicatorType);
        return this;
    }

    public GPreviewBuilder q(@n0 Class<? extends com.previewlibrary.view.a> cls) {
        this.f96302b.putExtra(PushClientConstants.TAG_CLASS_NAME, cls);
        return this;
    }

    public void r() {
        Class<?> cls = this.f96303c;
        if (cls == null) {
            this.f96302b.setClass(this.f96301a, GPreviewActivity.class);
        } else {
            this.f96302b.setClass(this.f96301a, cls);
        }
        com.previewlibrary.view.a.f96341n = this.f96304d;
        this.f96301a.startActivity(this.f96302b);
        this.f96301a.overridePendingTransition(0, 0);
        this.f96302b = null;
        this.f96301a = null;
    }

    public GPreviewBuilder s(@n0 Class cls) {
        this.f96303c = cls;
        this.f96302b.setClass(this.f96301a, cls);
        return this;
    }

    public GPreviewBuilder t(@n0 Class cls, @n0 Bundle bundle) {
        this.f96303c = cls;
        this.f96302b.setClass(this.f96301a, cls);
        this.f96302b.putExtras(bundle);
        return this;
    }
}
