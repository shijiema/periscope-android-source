// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1OutputStream, ASN1Encodable, ASN1Primitive

public class DEROutputStream extends ASN1OutputStream
{

    public DEROutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    public final void _mth02CF(ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodable._mth0427()._mth0582()._mth02CA(this);
            return;
        } else
        {
            throw new IOException("null object detected");
        }
    }

    final DEROutputStream _mth05E6()
    {
        return this;
    }

    final ASN1OutputStream _mth0628()
    {
        return this;
    }
}
