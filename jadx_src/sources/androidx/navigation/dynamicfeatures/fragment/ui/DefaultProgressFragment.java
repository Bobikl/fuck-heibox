package androidx.navigation.dynamicfeatures.fragment.ui;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.d1;
import androidx.navigation.dynamicfeatures.fragment.R;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DefaultProgressFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DefaultProgressFragment extends AbstractProgressFragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final a f25029m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f25030n = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final String f25031o = "DefaultProgressFragment";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private TextView f25032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private ProgressBar f25033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @e
    private Button f25034l;

    /* JADX INFO: compiled from: DefaultProgressFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public DefaultProgressFragment() {
        super(R.layout.dynamic_feature_install_fragment);
    }

    private final void X3(@d1 int i10, final yh.a<b2> aVar) {
        Button button = this.f25034l;
        if (button != null) {
            button.setText(i10);
            button.setOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DefaultProgressFragment.Y3(aVar, view);
                }
            });
            button.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(yh.a onClick, View view) {
        f0.p(onClick, "$onClick");
        onClick.invoke();
    }

    private final void Z3(@d1 int i10) {
        TextView textView = this.f25032j;
        if (textView != null) {
            textView.setText(i10);
        }
        ProgressBar progressBar = this.f25033k;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(4);
    }

    private final void a4(ImageView imageView) {
        Drawable defaultActivityIcon;
        PackageManager packageManager = requireContext().getPackageManager();
        try {
            defaultActivityIcon = packageManager.getActivityIcon(new ComponentName(requireContext(), requireActivity().getClass()));
        } catch (PackageManager.NameNotFoundException unused) {
            defaultActivityIcon = packageManager.getDefaultActivityIcon();
        }
        f0.o(defaultActivityIcon, "try {\n                  …ityIcon\n                }");
        imageView.setImageDrawable(defaultActivityIcon);
    }

    @Override // androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment
    protected void S3() {
        Z3(R.string.installation_cancelled);
        X3(R.string.retry, new yh.a<b2>() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.DefaultProgressFragment$onCancelled$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f25035b.R3();
            }
        });
    }

    @Override // androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment
    protected void T3(@l9.a int i10) {
        Log.w(f25031o, "Installation failed with error " + i10);
        Z3(R.string.installation_failed);
        X3(R.string.f25010ok, new yh.a<b2>() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.DefaultProgressFragment$onFailed$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.navigation.fragment.e.a(this.f25036b).L0();
            }
        });
    }

    @Override // androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment
    protected void V3(int i10, long j10, long j11) {
        ProgressBar progressBar = this.f25033k;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            if (j11 == 0) {
                progressBar.setIndeterminate(true);
            } else {
                progressBar.setProgress((int) ((((long) 100) * j10) / j11));
                progressBar.setIndeterminate(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25032j = null;
        this.f25033k = null;
        this.f25034l = null;
    }

    @Override // androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @e Bundle bundle) {
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        this.f25032j = (TextView) view.findViewById(R.id.progress_title);
        this.f25033k = (ProgressBar) view.findViewById(R.id.installation_progress);
        View viewFindViewById = view.findViewById(R.id.progress_icon);
        f0.o(viewFindViewById, "findViewById(R.id.progress_icon)");
        a4((ImageView) viewFindViewById);
        this.f25034l = (Button) view.findViewById(R.id.progress_action);
    }
}
