package com.puppycrawl.tools.checkstyle;

import com.puppycrawl.tools.checkstyle.checks.RedundantModifierCheck;

public class RedundantModifierTest
    extends BaseCheckTestCase
{
    public void testIt()
            throws Exception
    {
        final CheckConfiguration checkConfig = new CheckConfiguration();
        checkConfig.setClassname(RedundantModifierCheck.class.getName());
        final Checker c = createChecker(checkConfig);
        final String fname = getPath("InputModifier.java");
        final String[] expected = {
            "32:9: Redundant 'public' modifier.",
            "38:9: Redundant 'abstract' modifier.",
        };
        verify(c, fname, expected);
    }
}
