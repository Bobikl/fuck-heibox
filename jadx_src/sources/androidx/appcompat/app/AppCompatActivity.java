package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g1;
import androidx.core.app.c0;
import androidx.core.app.q3;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements d, q3.b, androidx.appcompat.app.a.c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private e mDelegate;
    private Resources mResources;

    public class a implements androidx.savedstate.b.c {
        a() {
        }

        @Override // androidx.savedstate.b.c
        @n0
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().D(bundle);
            return bundle;
        }
    }

    public class b implements androidx.activity.contextaware.c {
        b() {
        }

        @Override // androidx.activity.contextaware.c
        public void a(@n0 Context context) {
            e delegate = AppCompatActivity.this.getDelegate();
            delegate.u();
            delegate.z(AppCompatActivity.this.getSavedStateRegistry().b(AppCompatActivity.DELEGATE_TAG));
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    @androidx.annotation.o
    public AppCompatActivity(@i0 int i10) {
        super(i10);
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().j(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().h(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.K(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@d0 int i10) {
        return (T) getDelegate().n(i10);
    }

    @n0
    public e getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = e.i(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.a.c
    @p0
    public androidx.appcompat.app.a.b getDrawerToggleDelegate() {
        return getDelegate().p();
    }

    @Override // android.app.Activity
    @n0
    public MenuInflater getMenuInflater() {
        return getDelegate().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && g1.d()) {
            this.mResources = new g1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @p0
    public ActionBar getSupportActionBar() {
        return getDelegate().s();
    }

    @Override // androidx.core.app.q3.b
    @p0
    public Intent getSupportParentActivityIntent() {
        return c0.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().v();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().y(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@n0 q3 q3Var) {
        q3Var.e(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, @n0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.o() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    protected void onNightModeChanged(int i10) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @n0 Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(@p0 Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().B(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().C();
    }

    public void onPrepareSupportNavigateUpTaskStack(@n0 q3 q3Var) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().E();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().F();
    }

    @Override // androidx.appcompat.app.d
    @androidx.annotation.i
    public void onSupportActionModeFinished(@n0 androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    @androidx.annotation.i
    public void onSupportActionModeStarted(@n0 androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        q3 q3VarI = q3.i(this);
        onCreateSupportNavigateUpTaskStack(q3VarI);
        onPrepareSupportNavigateUpTaskStack(q3VarI);
        q3VarI.u();
        try {
            androidx.core.app.b.z(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().S(charSequence);
    }

    @Override // androidx.appcompat.app.d
    @p0
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(@n0 androidx.appcompat.view.b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.L()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@i0 int i10) {
        initViewTreeOwners();
        getDelegate().K(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().L(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().M(view, layoutParams);
    }

    public void setSupportActionBar(@p0 Toolbar toolbar) {
        getDelegate().Q(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@e1 int i10) {
        super.setTheme(i10);
        getDelegate().R(i10);
    }

    @p0
    public androidx.appcompat.view.b startSupportActionMode(@n0 androidx.appcompat.view.b.a aVar) {
        return getDelegate().T(aVar);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().v();
    }

    public void supportNavigateUpTo(@n0 Intent intent) {
        c0.g(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().I(i10);
    }

    public boolean supportShouldUpRecreateTask(@n0 Intent intent) {
        return c0.h(this, intent);
    }
}
