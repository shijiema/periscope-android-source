// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twitter.sdk.android.core.models;

import java.util.Collections;
import java.util.Map;
import o.jd;
import o.mp;
import o.mq;
import o.mt;

// Referenced classes of package com.twitter.sdk.android.core.models:
//            SafeMapAdapter

class val.tokenType extends jd
{

    final SafeMapAdapter this$0;
    final jd val$delegate;
    final mp val$tokenType;

    public Object read(mq mq)
    {
        mq = ((mq) (val$delegate.read(mq)));
        if (java/util/Map.isAssignableFrom(val$tokenType.Js))
        {
            if (mq == null)
            {
                return Collections.EMPTY_MAP;
            } else
            {
                return Collections.unmodifiableMap((Map)mq);
            }
        } else
        {
            return mq;
        }
    }

    public void write(mt mt, Object obj)
    {
        val$delegate.write(mt, obj);
    }

    ()
    {
        this$0 = final_safemapadapter;
        val$delegate = jd1;
        val$tokenType = mp.this;
        super();
    }
}
