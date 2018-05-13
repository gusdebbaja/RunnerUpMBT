package org.runnerup.workout;

import org.junit.Test;
import org.runnerup.util.Encryption;

import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;

public class SomeTests {

    public static Encryption encryption;
    public static Range mRange;

    @Test
    public void addingTwoPositiveIntegersAlwaysGivesAPositiveInteger(){
        qt()
                .forAll(doubles().positive()
                        , doubles().positive())
                .as( (minValue,maxValue) -> mRange = new Range(minValue, (minValue + maxValue)))
                .check(mRange -> (mRange.maxValue + mRange.minValue >= 0));
    }

    @Test
    public void testToHex(){

    }

}
