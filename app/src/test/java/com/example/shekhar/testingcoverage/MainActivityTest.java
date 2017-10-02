package com.example.shekhar.testingcoverage;

/**
 * Created by Shekhar on 02-10-2017.
 */

import org.junit.Test;

import static org.junit.Assert.*;
import static com.example.shekhar.testingcoverage.MainActivity.*;

public class MainActivityTest {

    @Test
    public void calfareworks(){
        assertEquals(50,calfare(0, 0), 0.0001);
    }
}
