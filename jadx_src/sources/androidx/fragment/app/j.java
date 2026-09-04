package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

/* JADX INFO: compiled from: DialogFragment.java */
/* JADX INFO: loaded from: classes6.dex */
public class j extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @androidx.annotation.p0
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private androidx.lifecycle.j0<androidx.lifecycle.y> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* JADX INFO: compiled from: DialogFragment.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            j.this.mOnDismissListener.onDismiss(j.this.mDialog);
        }
    }

    /* JADX INFO: compiled from: DialogFragment.java */
    public class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@androidx.annotation.p0 DialogInterface dialogInterface) {
            if (j.this.mDialog != null) {
                j jVar = j.this;
                jVar.onCancel(jVar.mDialog);
            }
        }
    }

    /* JADX INFO: compiled from: DialogFragment.java */
    public class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@androidx.annotation.p0 DialogInterface dialogInterface) {
            if (j.this.mDialog != null) {
                j jVar = j.this;
                jVar.onDismiss(jVar.mDialog);
            }
        }
    }

    /* JADX INFO: compiled from: DialogFragment.java */
    public class d implements androidx.lifecycle.j0<androidx.lifecycle.y> {
        d() {
        }

        @Override // androidx.lifecycle.j0
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.y yVar) {
            if (yVar == null || !j.this.mShowsDialog) {
                return;
            }
            View viewRequireView = j.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (j.this.mDialog != null) {
                if (FragmentManager.X0(3)) {
                    Log.d(FragmentManager.X, "DialogFragment " + this + " setting the content view on " + j.this.mDialog);
                }
                j.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: compiled from: DialogFragment.java */
    public class e extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f23728b;

        e(q qVar) {
            this.f23728b = qVar;
        }

        @Override // androidx.fragment.app.q
        @androidx.annotation.p0
        public View c(int i10) {
            return this.f23728b.d() ? this.f23728b.c(i10) : j.this.onFindViewById(i10);
        }

        @Override // androidx.fragment.app.q
        public boolean d() {
            return this.f23728b.d() || j.this.onHasView();
        }
    }

    public j() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    public j(@androidx.annotation.i0 int i10) {
        super(i10);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z10, boolean z11, boolean z12) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z12) {
                getParentFragmentManager().x1(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().u1(this.mBackStackId, 1, z10);
            }
            this.mBackStackId = -1;
            return;
        }
        p0 p0VarU = getParentFragmentManager().u();
        p0VarU.M(true);
        p0VarU.x(this);
        if (z12) {
            p0VarU.o();
        } else if (z10) {
            p0VarU.n();
        } else {
            p0VarU.m();
        }
    }

    private void prepareDialog(@androidx.annotation.p0 Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.n0
    q createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    @androidx.annotation.k0
    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    @androidx.annotation.p0
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @e1
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    @Deprecated
    public void onActivityCreated(@androidx.annotation.p0 Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    public void onAttach(@androidx.annotation.n0 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().l(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.n0 DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @androidx.annotation.n0
    @androidx.annotation.k0
    public Dialog onCreateDialog(@androidx.annotation.p0 Bundle bundle) {
        if (FragmentManager.X0(3)) {
            Log.d(FragmentManager.X, "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.k(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().p(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @androidx.annotation.i
    public void onDismiss(@androidx.annotation.n0 DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.X0(3)) {
            Log.d(FragmentManager.X, "onDismiss called for DialogFragment " + this);
        }
        dismissInternal(true, true, false);
    }

    @androidx.annotation.p0
    View onFindViewById(int i10) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.n0
    public LayoutInflater onGetLayoutInflater(@androidx.annotation.p0 Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (FragmentManager.X0(2)) {
                Log.d(FragmentManager.X, "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.X0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                Log.d(FragmentManager.X, "mCreatingDialog = true: " + str);
            } else {
                Log.d(FragmentManager.X, "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    public void onSaveInstanceState(@androidx.annotation.n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i10 = this.mStyle;
        if (i10 != 0) {
            bundle.putInt(SAVED_STYLE, i10);
        }
        int i11 = this.mTheme;
        if (i11 != 0) {
            bundle.putInt(SAVED_THEME, i11);
        }
        boolean z10 = this.mCancelable;
        if (!z10) {
            bundle.putBoolean(SAVED_CANCELABLE, z10);
        }
        boolean z11 = this.mShowsDialog;
        if (!z11) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z11);
        }
        int i12 = this.mBackStackId;
        if (i12 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            ViewTreeLifecycleOwner.b(decorView, this);
            ViewTreeViewModelStoreOwner.b(decorView, this);
            ViewTreeSavedStateRegistryOwner.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.k0
    public void onViewStateRestored(@androidx.annotation.p0 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @androidx.annotation.n0
    public final androidx.activity.k requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof androidx.activity.k) {
            return (androidx.activity.k) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    @androidx.annotation.n0
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z10) {
        this.mCancelable = z10;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void setShowsDialog(boolean z10) {
        this.mShowsDialog = z10;
    }

    public void setStyle(int i10, @e1 int i11) {
        if (FragmentManager.X0(2)) {
            Log.d(FragmentManager.X, "Setting style and theme for DialogFragment " + this + " to " + i10 + ", " + i11);
        }
        this.mStyle = i10;
        if (i10 == 2 || i10 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i11 != 0) {
            this.mTheme = i11;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@androidx.annotation.n0 Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(@androidx.annotation.n0 p0 p0Var, @androidx.annotation.p0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        p0Var.g(this, str);
        this.mViewDestroyed = false;
        int iM = p0Var.m();
        this.mBackStackId = iM;
        return iM;
    }

    public void show(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.p0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        p0 p0VarU = fragmentManager.u();
        p0VarU.M(true);
        p0VarU.g(this, str);
        p0VarU.m();
    }

    public void showNow(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.p0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        p0 p0VarU = fragmentManager.u();
        p0VarU.M(true);
        p0VarU.g(this, str);
        p0VarU.o();
    }
}
