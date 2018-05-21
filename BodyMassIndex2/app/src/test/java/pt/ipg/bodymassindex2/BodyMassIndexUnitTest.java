package pt.ipg.bodymassindex2;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jei on 19/03/2018.
 */

public class BodyMassIndexUnitTest {
    @Test
    public void computeBMIisCorrect(){
        BodyMassIndex bmiNormal = new BodyMassIndex(1.82, 78);

        double index = bmiNormal.getIndex();// should be approx 23.5

        assertEquals(23.55, index,0.009);

        assertEquals(13.5, new BodyMassIndex(2,54).getIndex(),0.009);

        assertEquals(63.25, new BodyMassIndex(1.54,150).getIndex(),0.009);
    }


}
