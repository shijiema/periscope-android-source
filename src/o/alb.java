// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.app.ActivityOptions;
import android.content.Intent;
import android.view.View;

// Referenced classes of package o:
//            xf, add, aky

final class alb
    implements android.view.View.OnClickListener
{

    private aky brD;

    alb(aky aky1)
    {
        brD = aky1;
        super();
    }

    public final void onClick(View view)
    {
        xf._mth02CA(xf.if.aRs);
        view = new Intent(brD, o/add);
        view.putExtra("e_title", brD.getString(0x7f06011d));
        view.putExtra("e_url", brD.getString(0x7f06011e));
        brD.startActivity(view, ActivityOptions.makeCustomAnimation(brD, 0x7f04000e, 0x7f04000c).toBundle());
    }
}
