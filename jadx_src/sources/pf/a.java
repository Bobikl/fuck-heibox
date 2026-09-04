package pf;

import android.view.LayoutInflater;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GestureFragmentLifecycleCallbacks.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a extends FragmentManager.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f138296a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: pf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GestureFragmentLifecycleCallbacks.kt */
    public interface InterfaceC1254a {
        void D();

        void L();
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void f(@d FragmentManager fm, @d Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, 38464, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        super.f(fm, f10);
        LayoutInflater.Factory activity = f10.getActivity();
        InterfaceC1254a interfaceC1254a = activity instanceof InterfaceC1254a ? (InterfaceC1254a) activity : null;
        if (interfaceC1254a != null) {
            interfaceC1254a.D();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void i(@d FragmentManager fm, @d Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, 38463, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        super.i(fm, f10);
        LayoutInflater.Factory activity = f10.getActivity();
        InterfaceC1254a interfaceC1254a = activity instanceof InterfaceC1254a ? (InterfaceC1254a) activity : null;
        if (interfaceC1254a != null) {
            interfaceC1254a.L();
        }
    }
}
