// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.animation.ValueAnimator;
import android.widget.ImageView;

// Referenced classes of package o:
//            apx

final class aqb
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private apx bzF;

    aqb(apx apx1)
    {
        bzF = apx1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        apx._mth02CF(bzF).setColorFilter(((Integer)valueanimator.getAnimatedValue()).intValue());
    }
}
