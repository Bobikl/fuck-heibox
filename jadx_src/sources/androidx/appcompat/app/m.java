package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: NavItemSelectedListener.java */
/* JADX INFO: loaded from: classes.dex */
public class m implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ActionBar.d f1817b;

    public m(ActionBar.d dVar) {
        this.f1817b = dVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ActionBar.d dVar = this.f1817b;
        if (dVar != null) {
            dVar.onNavigationItemSelected(i10, j10);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
