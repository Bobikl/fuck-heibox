package com.max.hbcommon.base;

import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseViewModelFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
public class i extends d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: BaseViewModelFragment.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66916a;

        static {
            int[] iArr = new int[BaseViewModel.TYPE_STATE.valuesCustom().length];
            try {
                iArr[BaseViewModel.TYPE_STATE.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseViewModel.TYPE_STATE.UNLOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseViewModel.TYPE_STATE.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseViewModel.TYPE_STATE.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseViewModel.TYPE_STATE.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f66916a = iArr;
        }
    }

    private final void M3(BaseViewModel baseViewModel) {
        if (PatchProxy.proxy(new Object[]{baseViewModel}, this, changeQuickRedirect, false, bb.c.b.rw, new Class[]{BaseViewModel.class}, Void.TYPE).isSupported) {
            return;
        }
        baseViewModel.f().k(getViewLifecycleOwner(), new j0() { // from class: com.max.hbcommon.base.h
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                i.N3(this.f66876a, (BaseViewModel.TYPE_STATE) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(i this$0, BaseViewModel.TYPE_STATE type_state) {
        if (PatchProxy.proxy(new Object[]{this$0, type_state}, null, changeQuickRedirect, true, bb.c.b.sw, new Class[]{i.class, BaseViewModel.TYPE_STATE.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        int i10 = type_state == null ? -1 : a.f66916a[type_state.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this$0.showLoading();
            return;
        }
        if (i10 == 3) {
            this$0.showContentView();
        } else if (i10 == 4) {
            this$0.showEmpty();
        } else {
            if (i10 != 5) {
                return;
            }
            this$0.showError();
        }
    }

    @dl.d
    public final <T extends BaseViewModel> T O3(@dl.d Class<T> modelClass) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{modelClass}, this, changeQuickRedirect, false, bb.c.b.qw, new Class[]{Class.class}, BaseViewModel.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(modelClass, "modelClass");
        T t10 = (T) new y0(this).a(modelClass);
        M3(t10);
        return t10;
    }
}
